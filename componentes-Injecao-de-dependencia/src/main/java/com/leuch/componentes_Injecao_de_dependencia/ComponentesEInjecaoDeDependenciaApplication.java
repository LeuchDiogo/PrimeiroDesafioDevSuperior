package com.leuch.componentes_Injecao_de_dependencia;

import com.leuch.componentes_Injecao_de_dependencia.Service.OrderService;
import com.leuch.componentes_Injecao_de_dependencia.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.leuch.componentes_injecao_de_dependencia"})
public class ComponentesEInjecaoDeDependenciaApplication implements CommandLineRunner {
	Scanner scanner;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(ComponentesEInjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		scanner = new Scanner(System.in);

		System.out.println("Digite o código do pedido:");
		int codigo = scanner.nextInt();

		System.out.println("Digite o preço do produto: ");
		double price = scanner.nextDouble();

		System.out.println("Digite o desconto: ");
		double discount = scanner.nextDouble();

		Order order = new Order(codigo, price, discount);

		System.out.println("Pedido código: " + codigo);
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}

