package com.mercury.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * @program: JavaBasic
 * @description: practice
 * @author: yangdar1en
 * @create: 2019-08-13 13:08
 **/

class Tree {}
public class QuestionSet2 implements Serializable {

    public Tree tree = new Tree();
    public static void main(String[] args) {
        QuestionSet2 questionSet2 = new QuestionSet2();
        try {
            FileOutputStream file = new FileOutputStream("forstest.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(questionSet2);
            out.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
