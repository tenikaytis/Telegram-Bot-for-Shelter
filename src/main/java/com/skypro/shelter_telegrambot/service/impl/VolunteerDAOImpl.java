package com.skypro.shelter_telegrambot.service.impl;

import com.skypro.shelter_telegrambot.configuration.HibernateSessionFactoryUtil;
import com.skypro.shelter_telegrambot.model.Volunteer;
import com.skypro.shelter_telegrambot.service.VolunteerDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VolunteerDAOImpl implements VolunteerDAO {
    @Override
    public void addVolunteer(Volunteer volunteer) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(volunteer);
            transaction.commit();
        }
    }

    @Override
    public void removeVolunteer(Volunteer volunteer) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(volunteer);
            transaction.commit();
        }
    }

    @Override
    public List<Volunteer> getAllVolunteers() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();) {
            List<Volunteer> volunteers = (List<Volunteer>) session.createQuery("From Volunteer").list();
            return volunteers;
        }
    }
}
