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

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			doctorList.add(new Surgeon());
		}
		int counter = 0;
		for (int i = 0; i < 8; i++) {
			patientList.add(new Patient());
			if (doctorList.get(counter).getPatients().size() == 3) {
				counter+=1;
				doctorList.get(counter).assignPatient(patientList.get(i));
			}
			else {
				doctorList.get(counter).assignPatient(patientList.get(i));
			}
		}
	}
}
