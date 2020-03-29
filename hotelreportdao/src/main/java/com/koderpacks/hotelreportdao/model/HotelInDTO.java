package com.koderpacks.hotelreportdao.model;

public class HotelInDTO {

	private String hotel;
	private int is_canceled;
	private int arrival_date_year;
	private String arrival_date_month;
	private int arrival_date_week_number;
	private int arrival_date_of_month;
	private int stays_in_weekend;
	private int stays_in_week_nights;
	private int adults;
	private int children;
	private int babies;
	private String meal;
	private String country;
	private String market_segement;
	private String distribution_channel;
	private int is_repeated_guest;
	private int previous_cancellations;
	private int previous_bookings_not_canceled;
	private char reserved_room_type;
	private char assigned_room_type;
	private int booking_changes;
	private String deposit_type;
	private String agent;
	private String company;
	private int days_in_waiting_list;
	private String customer_type;
	private double adr;
	private int required_car_parking_spaces;
	private int total_of_special_requests;
	private String reservation_status;
	private String reservation_status_date;
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getIs_canceled() {
		return is_canceled;
	}
	public void setIs_canceled(int is_canceled) {
		this.is_canceled = is_canceled;
	}
	public int getArrival_date_year() {
		return arrival_date_year;
	}
	public void setArrival_date_year(int arrival_date_year) {
		this.arrival_date_year = arrival_date_year;
	}
	public String getArrival_date_month() {
		return arrival_date_month;
	}
	public void setArrival_date_month(String arrival_date_month) {
		this.arrival_date_month = arrival_date_month;
	}
	public int getArrival_date_week_number() {
		return arrival_date_week_number;
	}
	public void setArrival_date_week_number(int arrival_date_week_number) {
		this.arrival_date_week_number = arrival_date_week_number;
	}
	public int getArrival_date_of_month() {
		return arrival_date_of_month;
	}
	public void setArrival_date_of_month(int arrival_date_of_month) {
		this.arrival_date_of_month = arrival_date_of_month;
	}
	public int getStays_in_weekend() {
		return stays_in_weekend;
	}
	public void setStays_in_weekend(int stays_in_weekend) {
		this.stays_in_weekend = stays_in_weekend;
	}
	public int getStays_in_week_nights() {
		return stays_in_week_nights;
	}
	public void setStays_in_week_nights(int stays_in_week_nights) {
		this.stays_in_week_nights = stays_in_week_nights;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getBabies() {
		return babies;
	}
	public void setBabies(int babies) {
		this.babies = babies;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMarket_segement() {
		return market_segement;
	}
	public void setMarket_segement(String market_segement) {
		this.market_segement = market_segement;
	}
	public String getDistribution_channel() {
		return distribution_channel;
	}
	public void setDistribution_channel(String distribution_channel) {
		this.distribution_channel = distribution_channel;
	}
	public int getIs_repeated_guest() {
		return is_repeated_guest;
	}
	public void setIs_repeated_guest(int is_repeated_guest) {
		this.is_repeated_guest = is_repeated_guest;
	}
	public int getPrevious_cancellations() {
		return previous_cancellations;
	}
	public void setPrevious_cancellations(int previous_cancellations) {
		this.previous_cancellations = previous_cancellations;
	}
	public int getPrevious_bookings_not_canceled() {
		return previous_bookings_not_canceled;
	}
	public void setPrevious_bookings_not_canceled(int previous_bookings_not_canceled) {
		this.previous_bookings_not_canceled = previous_bookings_not_canceled;
	}
	public char getReserved_room_type() {
		return reserved_room_type;
	}
	public void setReserved_room_type(char reserved_room_type) {
		this.reserved_room_type = reserved_room_type;
	}
	public char getAssigned_room_type() {
		return assigned_room_type;
	}
	public void setAssigned_room_type(char assigned_room_type) {
		this.assigned_room_type = assigned_room_type;
	}
	public int getBooking_changes() {
		return booking_changes;
	}
	public void setBooking_changes(int booking_changes) {
		this.booking_changes = booking_changes;
	}
	public String getDeposit_type() {
		return deposit_type;
	}
	public void setDeposit_type(String deposit_type) {
		this.deposit_type = deposit_type;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDays_in_waiting_list() {
		return days_in_waiting_list;
	}
	public void setDays_in_waiting_list(int days_in_waiting_list) {
		this.days_in_waiting_list = days_in_waiting_list;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public double getAdr() {
		return adr;
	}
	public void setAdr(double adr) {
		this.adr = adr;
	}
	public int getRequired_car_parking_spaces() {
		return required_car_parking_spaces;
	}
	public void setRequired_car_parking_spaces(int required_car_parking_spaces) {
		this.required_car_parking_spaces = required_car_parking_spaces;
	}
	public int getTotal_of_special_requests() {
		return total_of_special_requests;
	}
	public void setTotal_of_special_requests(int total_of_special_requests) {
		this.total_of_special_requests = total_of_special_requests;
	}
	public String getReservation_status() {
		return reservation_status;
	}
	public void setReservation_status(String reservation_status) {
		this.reservation_status = reservation_status;
	}
	public String getReservation_status_date() {
		return reservation_status_date;
	}
	public void setReservation_status_date(String reservation_status_date) {
		this.reservation_status_date = reservation_status_date;
	}
	
	
	
}
