package com.mercury.daos;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 10:39
 **/

public class RoomDao {
    private int level;
    private String flag;

    public RoomDao() {
        System.out.println("Creating RoomDao");
    }

    public RoomDao(int level, String flag) {
        this.level = level;
        this.flag = flag;
        System.out.println("Creating RoomDao: " + level + ", " + flag);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RoomDao{" +
                "level=" + level +
                ", flag='" + flag + '\'' +
                '}';
    }
}
