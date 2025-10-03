interface Playable{
	void play();
	void pause();
}
class AudioPlayer implements Playable{
	private String trackName;
	
	public AudioPlayer(String trackName) {
		this.trackName = trackName;
	}
	@Override 
	public void play() {
		System.out.println("Playing audio track: " + trackName);
	}
	@Override
	public void pause() {
		System.out.println("Audio Track Paused: " + trackName);
	}
}
class VideoPlayer implements Playable{
	private String videoTitle;
	
	public VideoPlayer(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	@Override 
	public void play() {
		System.out.println("Playing Video : " + videoTitle);
	}
	@Override
	public void pause() {
		System.out.println("Video Paused: " + videoTitle);
	}
	
}
public class MediaType {
	public static void main(String[] args) {
		Playable audio = new AudioPlayer("Permission to Dance - BTS");
		audio.play();
		audio.pause();
		System.out.println("_____________________________________");
		
		Playable video = new VideoPlayer("VJ Siddu vlogs ");
		video.play();
		video.pause();
		
	}

}
