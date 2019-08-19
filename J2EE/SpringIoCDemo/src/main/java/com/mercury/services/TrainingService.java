package com.mercury.services;

import com.mercury.daos.FacilityDao;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 14:50
 **/

public class TrainingService {
    private FacilityDao fd;

    public TrainingService() {
        System.out.println("Creating TrainingService");
    }

    public TrainingService(FacilityDao fd) {
        this.fd = fd;
    }

    public FacilityDao getFd() {
        return fd;
    }

    public void setFd(FacilityDao fd) {
        this.fd = fd;
    }

    @Override
    public String toString() {
        return "TrainingService{" +
                "fd=" + fd +
                '}';
    }
}
