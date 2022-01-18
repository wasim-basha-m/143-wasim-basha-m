package com.marticus.datastructure;

public class Patients {
	
		@Override
	public String toString() {
		return "Patients [patientName=" + patientName + ", patientId=" + patientId + ", patientAddress="
				+ patientAddress + "]";
	}
		String patientName;
		String patientId;
		String patientAddress;
		
		
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getPatientId() {
			return patientId;
		}
		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}
		public String getPatientAddress() {
			return patientAddress;
		}
		public void setPatientAddress(String patientAddress) {
			this.patientAddress = patientAddress;
		}
		
}
