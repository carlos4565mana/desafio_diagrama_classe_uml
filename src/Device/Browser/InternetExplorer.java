package Device.Browser;

public class InternetExplorer implements BrowserInternet {
  @Override
	public void page() {
		System.out.println("Open Page");
	}

	@Override
	public void addingNewPage() {
		System.out.println("Add new page");
	}

	@Override
	public void updatePage() {
		System.out.println("Updating page");
		
	}
}
