package Hotel.Reservation.System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	private static List<Hotel> hotelList = new ArrayList<>();

    public static boolean addHote(Hotel hotel) {
        if (hotel == null)
            return false;
        if (hotelList.contains(hotel))
            return false;
        hotelList.add(hotel);
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation program");
    }

	public static boolean addHotel(Hotel lakewood) {
		// TODO Auto-generated method stub
		return false;
	}
}
