package jukebox;

public class Songs {
	
	private String SongName;
	private String artist;
	private String rating;
	private String singer;
	public Songs(String SongName, String artist, String rating, String singer) {
		super();
		this.SongName = SongName;
		this.artist = artist;
		this.rating = rating;
		this.singer = singer;
	}
	public String getName() {
		return SongName;
	}
	public String getArtist() {
		return artist;
	}
	public String getRating() {
		return rating;
	}
	public String getSinger() {
		return singer;
	}
	@Override
	public String toString() {
		return "Songs [SongName= " + SongName + ", artist=" + artist + ", rating=" + rating + ", singer=" + singer + "]";
	}
	
	

}
