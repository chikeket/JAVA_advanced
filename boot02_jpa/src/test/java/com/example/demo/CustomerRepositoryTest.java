package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.Customer;
import com.example.demo.repository.CustomerNative;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Disabled
	@Test
	public void 고객_조회() {
		// given
		String name = "홍길동";
		String phone = "011";
		Customer customer = Customer.builder().name(name).phone(phone).build();
		customerRepository.save(customer);
		// when
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();
		// then
		assertEquals(customerList.get(0).getName(), name);
		log.info("조회된	고객	이름:	{}", customerList.get(0).getName());
	}

	@Disabled
	@Test
	public void 고객_수정() {
		// given - 초기 데이터 저장
		String name = "홍길동";
		String phone = "011";
		Customer saved = customerRepository.save(Customer.builder().name(name).phone(phone).build());

		// when - 고객 정보 수정
		Customer customer = customerRepository.findById(saved.getId()).orElse(new Customer());

		customer.updateNameAndEmail("둘리", "a@a.a");
		Customer updated = customerRepository.save(customer);

		// then
		assertEquals(updated.getName(), customer.getName());
		log.info("수정된	고객	이름:	{}", updated.getName());
	}

	@Disabled
	@Test
	public void 이름_조회() {
		// given
		String name = "둘리";

		// when
		List<Customer> list = customerRepository.findByName(name);
//		List<Customer> list2 = customerRepository.findByNameLike("%동%");
//		list2.stream().forEach(cust -> System.out.println(cust.getName()));

//이메일검색
		List<Customer> list3 = customerRepository.findByNameOrEmailContaining("동", "a");
		list3.stream().forEach(cust -> System.out.println(cust.getName() + cust.getEmail()));

		// then
		assertEquals(list.get(0).getName(), name);
	}

	@Disabled
	@Test
	public void 네이티브_쿼리() {
		List<Object[]> list = customerRepository.findAllNative("011", "둘");
		// 이름 폰번호 출력
		list.stream().forEach(cust -> System.out.println(cust[0] + ":" + cust[1]));
//		for(Object[] a : list) {
//			System.out.println(a);
//			System.out.println(a[0]+":"+a[1]);
//		}

		List<CustomerNative> list2 = customerRepository.findAllNativeVO("011", "둘");

		list2.stream().forEach(cust -> System.out.println(cust.getId() + ":" + cust.getEmail()));
//		for(CustomerNative a : list2) {			
//			System.out.println(a.getId()+":"+a.getEmail());
//		}
	}

	@Disabled
	@Test
	public void jpql_test() {
		List<Customer> list = customerRepository.findAllQuery();
		list.stream().forEach(cust -> System.out.println(cust.getId() + ":" + cust.getEmail()));
	}
	@Disabled
	@Test
	public void 일대일() {
		// given(준비)
		Address addressEntity = Address.builder()
				.zipcode("04411").address("대구").build();
		addressRepository.save(addressEntity);
		
		Customer customerentity = Customer.builder()
				.name("길동").address(addressEntity).build();
		Customer saved = customerRepository.save(customerentity);
		
		// when(실행)
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(addr -> System.out.println(
				                              addr.getZipcode()+":"+addr.getAddress()
				                                               )
				                    );
		
		// then(검증)
//		assertEquals("04411", customer.getAddress());
	}
	@Test
	public void 일대다() {
		// given(준비)		
		
		Customer customerentity = Customer.builder()
				                          .name("길동")
				                          .phone("019")
				                          .email("c@c.c")
				                          .build();
		Customer saved = customerRepository.save(customerentity);			
		
		addressRepository.save(Address.builder()
									  .zipcode("01000")
									  .address("서울")
									  .customer(customerentity)
									  .build()
							 );
		
		addressRepository.save(Address.builder()
									  .zipcode("04411")
									  .address("대구")
									  .customer(customerentity)
									  .build()
							 );
		
		// when(실행)
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(addr -> System.out.println(
				                              addr.getZipcode()+":"+addr.getAddress()
				                                               )
				                    );
		
		// then(검증)
//		assertEquals("04411", customer.getAddress());
	}
}
