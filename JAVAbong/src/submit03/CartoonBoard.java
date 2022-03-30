package submit03;

public class CartoonBoard extends Board {
	
	private String image;
	
	public CartoonBoard(String title, String contents, String image) {
		super(title, contents);
		this.image = image;
	}

	@Override
	public String toString() {
		return "CartoonBoard [image=" + image + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
