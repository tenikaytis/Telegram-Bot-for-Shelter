package com.skypro.shelter_telegrambot.service;

import com.skypro.shelter_telegrambot.model.Volunteer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VolunteerDAO {
    void addVolunteer(Volunteer volunteer);

    void removeVolunteer(Volunteer volunteer);

    List<Volunteer> getAllVolunteers();
}
