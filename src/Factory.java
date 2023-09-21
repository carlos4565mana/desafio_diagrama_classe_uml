import Device.Browser.BrowserInternet;
import Device.Music.PlayMusic;
import Device.Telephone.Telephone;
import IphoneDevice.IphoneDevice;

public class Factory {
    public static void main(String[] args) throws Exception {
        IphoneDevice iphone = new IphoneDevice();
        PlayMusic music = (PlayMusic) iphone;
        Telephone telephone = (Telephone) iphone;
        BrowserInternet internet = (BrowserInternet) iphone;

        System.out.println("Music:");
        music.selectMusic();
        music.play();
        music.pause();
        System.out.println(" ‴(⁰O⁰)‴ ");
        System.out.println(" ");

        System.out.println("Telephone:");
        telephone.Connect();
        telephone.attend();
        telephone.startVoiceMail();
        System.out.println(" (✿◠‿◠) ");
        System.out.println(" ");

        System.out.println("Internet");
        internet.page();
        internet.addingNewPage();
        internet.updatePage();
        System.out.println(" (. ❛ ᴗ ❛.)  ");


    }
}
