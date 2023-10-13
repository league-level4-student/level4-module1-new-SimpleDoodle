package _06_Hospital;

public class Patient {
	public boolean care = false;

	public void checkPulse() {
		care = true;
	}

	public boolean feelsCaredFor() {
		return care;
	}

}
