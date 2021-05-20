package com.lisijietech.learn;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 邮件demo测试
 * @author lisijie
 * @date 2020-8-30
 */
public class MailTest {
	public static void main(String[] args) throws MessagingException {
		String from = "test@113.87.15.20";
		String auth = "false";
		String password = "";
		String to = "414024639@qq.com";
		String title = "测试";
		String content = "邮件测试";
		String host = "smtp.qq.com";
//		String port = "465";
		
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.host", host);
//		props.setProperty("mail.smtp.host", host);
//		props.setProperty("mail.smtp.port", port);
		props.setProperty("mail.smtp.auth", auth);
		props.setProperty("mail.smtp.ssl.enable", "true");
		
		//发送简单内容邮件
		Session session = Session.getInstance(props);
		session.setDebug(true);
		Message message = createSimpleMail(session, from, to, title, content);
		Transport ts = session.getTransport();
		ts.connect();
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}
	
	public static MimeMessage createSimpleMail(Session session,String from,String to,String title,String content) 
			throws AddressException, MessagingException {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSentDate(new Date());
		message.setSubject(title);
		message.setText(content);
		return message;
	}
}
