package com.example.poledigitalacademypda.Repository.Implementation;

import com.example.poledigitalacademypda.Dao.Implementations.ActivityDAOimpl;
import com.example.poledigitalacademypda.Dao.Specs.ActivityDao;
import com.example.poledigitalacademypda.Entities.Activity;
import com.example.poledigitalacademypda.Repository.Specs.ActivityRepository;

import java.util.List;

public class ActivityRepositoryImpl implements ActivityRepository {
    ActivityDao activityDao;

    public ActivityRepositoryImpl() {
        this.activityDao = new ActivityDAOimpl();
    }

    @Override
    public Activity find(int id) {
        return this.activityDao.find(id);
    }

    @Override
    public List<Activity> findAll() {
        return this.activityDao.findAll();
    }

    @Override
    public void delete(int id) {
        this.activityDao.delete(id);
    }

    @Override
    public Activity save(Activity activity) {
        return this.activityDao.save(activity);
    }

    @Override
    public Activity update(Activity activity) {
        return this.activityDao.update(activity);
    }
}
