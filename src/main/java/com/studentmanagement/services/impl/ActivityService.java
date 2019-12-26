package com.studentmanagement.services.impl;

import com.studentmanagement.models.Activity;
import com.studentmanagement.repositories.ActivityRepository;
import com.studentmanagement.services.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService implements IActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public Iterable<Activity> findAll() {
        return activityRepository.findAll();
    }

    @Override
    public Activity findById(Long id) {
        return activityRepository.findById(id).get();
    }

    @Override
    public void save(Activity activity) {
        activityRepository.save(activity);
    }

    @Override
    public void delete(Long id) {
        activityRepository.deleteById(id);
    }
}
