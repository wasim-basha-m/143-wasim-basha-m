package com.marticus.datastructure;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Hospital hp=new Hospital();
			ArrayList<Doctors> docs=new ArrayList<Doctors>();
			ArrayList<Patients> pts=new ArrayList<Patients>();
			
			Doctors d1=new Doctors();
			d1.setDoctorld("121");
			d1.setDoctorName("wasim");
			Doctors d2=new Doctors();
			d2.setDoctorld("122");
			d2.setDoctorName("wahid");
			Doctors d3=new Doctors();
			d3.setDoctorld("123");
			d3.setDoctorName("thufail");
			Patients p1=new Patients();
			p1.setPatientId("001");
			p1.setPatientName("abc");
			p1.setPatientAddress("chennai");
			Patients p2=new Patients();
			p2.setPatientId("002");
			p2.setPatientName("xyz");
			p2.setPatientAddress("Banglore");
			Patients p3=new Patients();
			p3.setPatientId("003");
			p3.setPatientName("pqr");
			p3.setPatientAddress("Mumbai");
			docs.add(d1);
			docs.add(d2);
			docs.add(d3);
			pts.add(p1);
			pts.add(p2);
			pts.add(p3);
			hp.setDocs(docs);
			hp.setPts(pts);
			System.out.println("Id="+d1.getDoctorld());
			System.out.println("Name="+d1.getDoctorName());
			System.out.println("Id="+d2.getDoctorld());
			System.out.println("Name="+d2.getDoctorName());
			System.out.println("Id="+d3.getDoctorld());
			System.out.println("Name="+d3.getDoctorName());
			System.out.println("Id="+p1.getPatientId());
			System.out.println("Name="+p1.getPatientName());
			System.out.println("Address="+p1.getPatientAddress());
			System.out.println("Id="+p2.getPatientId());
			System.out.println("Name="+p2.getPatientName());
			System.out.println("Address="+p2.getPatientAddress());
			System.out.println("Id="+p3.getPatientId());
			System.out.println("Name="+p3.getPatientName());
			System.out.println("Address="+p3.getPatientAddress());
			
			
	}
	

}
