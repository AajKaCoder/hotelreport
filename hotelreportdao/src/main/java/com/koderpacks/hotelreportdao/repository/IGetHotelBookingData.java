package com.koderpacks.hotelreportdao.repository;

import java.util.List;

import com.koderpacks.hotelreportdao.model.HotelInDTO;

public interface IGetHotelBookingData {

	List<HotelInDTO> getAllHotelBooking();
	List<HotelInDTO> getAllHotelBookingForMonth(String month,int year);
	List<HotelInDTO> getAllHotelBookingBetweenGivenTime(int arrivalDayOfMonth,String arrivalMonth,int departureDayOfMonth,String departureMonth,int arrivalYear);
	List<HotelInDTO> getAllHotelBokingByCountry(String country);
	List<HotelInDTO> getAllHotelBokingByMarketSegement(String market);
	List<HotelInDTO> getAllHotelBookingsWithoutChildren();
	List<HotelInDTO> getAllHotelBookingsWithBabies();
	List<HotelInDTO> getAllHotelBookingsByRoomType(char roomType);
	List<HotelInDTO> getAllHotelBookingByDistributigChannel(String channel);
	List<HotelInDTO> getAllCancelledBooking();
	
	
}
