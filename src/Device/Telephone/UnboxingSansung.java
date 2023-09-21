package Device.Telephone;

public class UnboxingSansung implements Telephone {
  @Override
	public void Connect() {
		System.out.println("Turn on the phone");
	}

	@Override
	public void attend() {
		System.out.println("Answer the phone");
	}

	@Override
	public void startVoiceMail() {
		System.out.println("Starting voicemail");
	}
}
