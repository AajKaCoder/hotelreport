package com.koderpacks.hotelreportdao.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.koderpacks.hotelreportdao.model.HotelInDTO;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

class LoadHotelCSVData {
	
	static ArrayList<HotelInDTO> hotelBookings=new ArrayList<>();
	static  {
		try {
			CSVReader csvReader=new CSVReader(new FileReader(new File("C:\\hotel_bookings_project\\hotel_bookings.csv")));
			ColumnPositionMappingStrategy<HotelInDTO> strategy=new ColumnPositionMappingStrategy<>();
			strategy.setType(HotelInDTO.class);
			CsvToBean<HotelInDTO> csvBeans=new CsvToBean<>();
			csvBeans.setCsvReader(csvReader);
			csvBeans.setMappingStrategy(strategy);
			hotelBookings = (ArrayList<HotelInDTO>) csvBeans.parse();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception...");
		}
	}
	
}
