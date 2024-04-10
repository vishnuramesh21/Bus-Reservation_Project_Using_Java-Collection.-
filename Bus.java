package busResv;

public class Bus {
	private int BusNo;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac,int cap){
		this.BusNo=no;
		this.ac=ac;
		this.capacity=cap;

}
	public int getBusNo(){
		return BusNo;
	}
	public boolean getAc() {
		return ac;
		
	}
	public int getCapacity() {
		return capacity;
	}
	public void setAc(boolean val){
		ac=val;
		
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus No : "+BusNo +"  Ac :  "+ac  +"   total capacity   "  +capacity);
	}
	
	
}