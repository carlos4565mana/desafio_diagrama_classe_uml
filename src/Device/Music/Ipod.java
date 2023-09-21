package Device.Music;

public class Ipod implements PlayMusic {
  @Override
	public void play() {
		System.out.println("Playing music");
	}

	@Override
	public void pause() {
		System.out.println("Pause");
	}

	@Override
	public void selectMusic() {
		System.out.println("Select music");
	}
}
