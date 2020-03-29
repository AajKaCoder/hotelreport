package com.koderpacks.hotelreportdao.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.koderpacks.hotelreportdao.model.HotelInDTO;

@Component
public class GetHotelBookingDataImpl implements IGetHotelBookingData {

	@Override
	public List<HotelInDTO> getAllHotelBooking() {
		return LoadHotelCSVData.hotelBookings;
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingForMonth(String month, int year) {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter((s)->{ return s.getArrival_date_month().equals(month)&&s.getArrival_date_year()==year;})
				.collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingBetweenGivenTime(int fromDayOfMonth, String fromMonth,
			int toDayOfMonth, String toMonth, int year) {
		
		
				return null;
				
		
	}

	@Override
	public List<HotelInDTO> getAllHotelBokingByCountry(String country) {
		return LoadHotelCSVData.hotelBookings.stream()
		.filter(s->s.getCountry().equals(country)).collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllHotelBokingByMarketSegement(String market) {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getMarket_segement().equals(market)).collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingsWithoutChildren() {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getChildren()==0)
				.collect(Collectors.toList());
				
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingsWithBabies() {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getBabies()>0)
				.collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingsByRoomType(char roomType) {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getReserved_room_type()==roomType)
				.collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllHotelBookingByDistributigChannel(String channel) {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getDistribution_channel().equals(channel))
				.collect(Collectors.toList());
	}

	@Override
	public List<HotelInDTO> getAllCancelledBooking() {
		return LoadHotelCSVData.hotelBookings.stream()
				.filter(s->s.getIs_canceled()==1)
				.collect(Collectors.toList());
	}

}
