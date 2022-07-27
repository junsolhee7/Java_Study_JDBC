package com.iu.regions;

import java.util.ArrayList;

public class RegionsView {

	//view
	
	public void view(RegionsDTO regionsDTO) {
		System.out.println("Region_ID\t Region_name");
		System.out.println("==========================");
		System.out.print(regionsDTO.getRegion_id()+"\t");
		System.out.println(regionsDTO.getRegion_name()+"\t");
		System.out.println("==========================");
	}
	public void view(ArrayList<RegionsDTO> ar) {
		for(RegionsDTO regionsDTO : ar) {
			System.out.println("Region_ID\t Region_name");
			System.out.println("==========================");
			System.out.print(regionsDTO.getRegion_id()+"\t");
			System.out.println(regionsDTO.getRegion_name()+"\t");
			System.out.println("==========================");
		}
	}
}
