public class TestTV {
	public static void main(String [] args){
		TV tv1=new TV();
		tv1.TurnOn();
		tv1.setChannel(30);
		tv1.setVolume(5);
		tv1.channelUp();
		tv1.VolumelDown();
		tv1.TurnOff();
		tv1.channelUp();
		tv1.channelDown();
		System.out.println("Channel is :"+ tv1.channel+"   Volume is :  " +tv1.volumeLevel);
	}

}
