package paquetePorDefecto;

public class MockDB implements DB {
	public boolean connect() {
		return false;
	}
	public String[][] query(String q){
		String[][] test = new String[1][1];
		return test;
	}
	public boolean close() {
		return false;
	}
	
}
