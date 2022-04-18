package edu.javacourse.contact.business;

import edu.javacourse.contact.dao.ContactDAO;
import edu.javacourse.contact.dao.ContactDAOFactory;
import edu.javacourse.contact.entity.Contact;
import java.util.List;

/**
 * Класс для реализации функций над списком контактов
 */
public class ContactManager {
	private ContactDAO dao;
	
	public ContactManager() {
		dao = ContactDAOFactory.getContactDAO();
	}
	
	// Добавление контакта - возвращает ID добавленного контакта
	public Long addContact(Contact contact) {
		return dao.addContact(contact);
	}
	
	// Редактирование контакта
	public void updateContact(Contact contact) {
		dao.updateContact(contact);
	}
	
	// Удаление контакта по его ID
	public void deleteContact(Long contactId) {
		dao.deleteContact(contactId);
	}
	
	// Получение одного контакта по его ID
	public Contact getContact(Long contactId) {
		return dao.getContact(contactId);
	}
	
	// Получение списка контактов
	public List<Contact> findContacts() {
		return dao.findContacts();
	}
}