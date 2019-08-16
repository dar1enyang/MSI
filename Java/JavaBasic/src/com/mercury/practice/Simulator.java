package com.mercury.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaBasic
 * @description: Mother Fucking Practice
 * @author: yangdar1en
 * @create: 2019-08-14 21:01
 **/


class InfoBoard {
    private static InfoBoard infoBoard = null;
    private List<Flight> flights;

    private InfoBoard() {
        flights = new ArrayList<>();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public static InfoBoard getInstance() {
        if (infoBoard == null) {
            synchronized (InfoBoard.class) {
                if (infoBoard == null) {
                    infoBoard = new InfoBoard();
                }
            }
        }
        return infoBoard;
    }
    public void insertFlight(Flight flight) {
        flights.add(flight);
    }
    public Flight getFlightById(int id) {

        for (Flight flight : flights) {
            if (id == flight.getId()) {
                return flight;
            }
        }
        return null;
    }
    public List<Flight> getFlightsByCompanyId(int companyId) {
        List<Flight> res = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getCompanyId() == f.getCompanyId()) {
                res.add(f);
            }
        }
        return res;
    }
}

final class Flight implements Runnable {
    private int id, companyId;
    private String from, to;
    private int duration;

    public Flight() {
    }

    public Flight(int id, int companyId, String from, String to, int duration) {
        this.id = id;
        this.companyId = companyId;
        this.from = from;
        this.to = to;
        this.duration = duration;

    }

    public int getId() {
        return id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void run() {

            try {
                System.out.println("Flight departure from " + from);
                Thread.sleep(duration);
                System.out.println("Flight arrival at" + to);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                companyId == flight.companyId &&
                duration == flight.duration &&
                Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyId, from, to, duration);
    }
}
public class Simulator {

    public static void testThreadPool(List<Flight> flightList) {
        // Creating a thread pool
        // util class
        ExecutorService es = Executors.newCachedThreadPool(); // unlimited thread

        for (int i = 0; i < flightList.size(); i++) {
            es.submit(flightList.get(i));
        }

        es.shutdown();
    }

    public static void main(String[] args) {

        InfoBoard infoBoard = InfoBoard.getInstance();
        if (infoBoard != null) {
            infoBoard.getFlights().add(new Flight(2, 2, "KEE", "LLL", 3000));
            infoBoard.getFlights().add(new Flight(1, 1, "KK", "YY", 3000));
        }
        testThreadPool(infoBoard.getFlights());

    }
}
