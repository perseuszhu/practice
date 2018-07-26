package clock;

import display.led.Display;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public void Start()
	{
		while (true)
			{
				second.increase();
				if(second.getValue() == 0) 
				{
					minute.increase();
					if (minute.getValue() == 0)
						{
							hour.increase();
						}
				}
			System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		clock.Start();
	}

}
