package task5_11_dz;

public class Cuckoo {
	int flyTime;
	int volumeSing;
	
	Cuckoo(int flyTime,int volumeSing){
		this.flyTime=flyTime;
		this.volumeSing=volumeSing;
	}
	void setVolumeSing(int vol) {volumeSing=vol;}
	void setFlyTime(int time) {flyTime=time;}
	
	void fly() {
		System.out.println("Fly "+flyTime+" minuts!");
	}
	void sing() {
		System.out.println("Sing with volume "+volumeSing+" !");
	}
	@Override
	public String toString() {
		return "flyTime: "+flyTime+" singing volume: "+volumeSing;
	}

}
