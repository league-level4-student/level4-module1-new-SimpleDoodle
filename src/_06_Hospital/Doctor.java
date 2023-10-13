package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	List<Patient> patientList = new ArrayList<>();

	public void doMedicine() {
		for (int i = 0; i < patientList.size(); i++) {
			patientList.get(i).checkPulse();
		}
	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if (getPatients().size() == 3) {
			throw new DoctorFullException();
		}
		patientList.add(p);
	}

	public List<Patient> getPatients() {
		return patientList;
	}
}
