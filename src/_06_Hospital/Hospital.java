package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Doctor> doctorList = new ArrayList<>();
	List<Patient> patientList = new ArrayList<>();

	public void addDoctor(Doctor d) {
		doctorList.add(d);

	}

	public void addPatient(Patient p) {
		patientList.add(p);

	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			doctorList.add(new Surgeon());
		}
		for (int i = 0; i < 8; i++) {
			int counter = 0;
			if () {
				
			}
		}
	}
}
