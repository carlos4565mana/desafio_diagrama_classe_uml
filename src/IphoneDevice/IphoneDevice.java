package IphoneDevice;

import Device.Browser.BrowserInternet;
import Device.Music.PlayMusic;
import Device.Telephone.Telephone;

public class IphoneDevice implements PlayMusic, BrowserInternet, Telephone {

  @Override
  public void play() {
    System.out.println("Playing music by iPhone device.");
  }
  @Override
  public void pause() {
    System.out.println("Stopped in music  by  iPhone device");
  }

  @Override
  public void selectMusic() {
    System.out.println("Choosing music by iPhone equipment.");
  }
  @Override
  public void page() {
    System.out.println("Opening the page by iPhone device...");
  }

  @Override
  public void addingNewPage() {
    System.out.println("Adding new page by iPhone device...");
  }

  @Override
  public void updatePage() {
   System.out.println("Updating the page by iPhone device...");
  }
  @Override
  public void Connect() {
    System.out.println("Connect by iPhone device");
  }

  @Override
  public void attend() {
    System.out.println("Attend by IPhone equipment");
  }

  @Override
  public void startVoiceMail() {
    System.out.println("Start voicemail by iPhone device");
  }
}
