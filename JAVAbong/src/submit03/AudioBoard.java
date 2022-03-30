package submit03;

public class AudioBoard extends Board {
	
	private String audio;
	
	public AudioBoard(String title, String contents, String audio) {
		super(title, contents);
		this.audio = audio;
	}

	@Override
	public String toString() {
		return "AudioBoard [audio=" + audio + "]";
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	
	
	
	
	
}
