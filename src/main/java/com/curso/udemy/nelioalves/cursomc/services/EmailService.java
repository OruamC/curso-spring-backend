package com.curso.udemy.nelioalves.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.curso.udemy.nelioalves.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
