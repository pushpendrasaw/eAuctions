package com.abyeti;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.abyeti.constant.SellerBuyer;
import com.abyeti.model.Bid;
import com.abyeti.model.Buyer;
import com.abyeti.model.Login;
import com.abyeti.model.Product;
import com.abyeti.model.Seller;
import com.abyeti.repositories.BidRepository;
import com.abyeti.repositories.BuyerRepository;
import com.abyeti.repositories.LoginRepository;
import com.abyeti.repositories.ProductRepository;
import com.abyeti.repositories.SellerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EAuctionApplication.class)
@WebAppConfiguration
public class EAuctionApplicationTests {

	@Autowired
	BidRepository bidRepository;

	@Autowired
	BuyerRepository buyerRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	SellerRepository sellerRepository;

	@Autowired
	LoginRepository loginRepository;

	Product p = new Product();

	@Test
	public void ProductTest() {
		Product _product = new Product();
		_product.setName("ABC_Motor");
		_product.setIntialBid(12000L);
		p = productRepository.save(_product);
		System.out.print(productRepository.findAll());
		System.out.print(productRepository.count());
		System.out.println(productRepository.hashCode());
		// productRepository.delete(p.getId());
	}

	@Test
	public void LoginTest() {
		Login _login = new Login();
		_login.setUsername("Piyush");
		_login.setPassword("123");
		_login.setSb(SellerBuyer.BUYER);
		loginRepository.save(_login);
		System.out.print(productRepository.findAll());
		System.out.print(productRepository.count());
		System.out.println(productRepository.hashCode());
		// loginRepository.deleteAll();
	}

	/*@Test
	public void finByUsername() {
		Login logs = loginRepository.findByUsername("piyush");

		System.out.print(" Success : " + logs.toString());
	}*/

	@Test
	public void SellerTest() {
		Seller _seller = new Seller();
		_seller.setName("ABC");
		// Product p = new Product();
		List<Product> pp = new ArrayList<Product>();
		pp.add(p);
		_seller.setProduct(pp);
		sellerRepository.save(_seller);
		System.out.print(sellerRepository.findAll());
		System.out.print(sellerRepository.count());
		System.out.println(sellerRepository.hashCode());
		// sellerRepository.deleteAll();
	}

	Buyer b = new Buyer();

	@Test
	public void BuyerTest() {
		Buyer _buyer = new Buyer();
		_buyer.setName("xyz");
		// _seller.setProduct((List<Product>)p);
		b = buyerRepository.save(_buyer);
		System.out.print(buyerRepository.findAll());
		System.out.print(buyerRepository.count());
		System.out.println(buyerRepository.hashCode());
		// buyerRepository.delete(b.getId());
	}

	@Test
	public void BidTest() {
		Bid _bid = new Bid();
		_bid.setBuyer(b);
		_bid.setBidPrice(1200l);
		_bid.setProduct(p);
		bidRepository.save(_bid);
		System.out.print(bidRepository.findAll());
		System.out.print(bidRepository.count());
		System.out.println(bidRepository.hashCode());
		// productRepository.delete(p.getId());
	}

}
