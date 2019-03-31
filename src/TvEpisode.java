/*
 * To Whom it may concern:
 * This beginnings of a personal project is made to show competence in Java.
 * I would have preferred to have shown something much more fleshed out and 
 * a better representative of my Java knowledge, but my laptop recently broke
 * and I didn't use gitHub to store any of my other projects (a lesson I surely
 * won't forget any time soon). I only saw your posting recently, and this is 
 * all I have been able to make in a roughly 24 hour period, while balancing 
 * my other work.
 */


/*
 * This class is used to store relevant information for 
 * WatchThis to use when choosing which episode you should
 * watch. 
 * 
 */



public class TvEpisode {
	String Title; //title of Episode
	int SeasonNum;//the number of the season which this episode occurs
	int EpNum; //Episode number within the season
	String URL; //stores the URL of the episode
	double EpLength;
	String Genre;
	//LastWatched; https://www.javatpoint.com/java-get-current-date
	
	public TvEpisode() {
		Title = "temp title";
		SeasonNum = 1;
		EpNum = 1;
		URL = "URL goes here";
		EpLength = 23;
		Genre = "Comedy";
	}
	public TvEpisode(String newTitle, int Season, int Episode, String newURL, double newLength, String newGenre) {
		this.Title = newTitle;
		this.SeasonNum = Season;
		this.EpNum = Episode;
		this.URL = newURL;
		this.EpLength = newLength;
		this.Genre = newGenre;
	}
	
	
	//For testing purposes.
	 public static void main(String[] args) {
		 TvEpisode example = new TvEpisode("Whack",4,6,"www.com", 23.3, "Drama");
		 
		 System.out.println(example.Title);
		 System.out.println(example.URL);
		 System.out.println(example.EpNum);
		 System.out.println(example.SeasonNum);
		 System.out.println(example.EpLength);
		 System.out.println(example.Genre);
		 System.out.println(example.toString()+"\n");
		 
		 example.setEpNum(2);
		 example.setSeasonNum(3);
		 example.setTitle("Yikes");
		 example.setURL("www.example.com");		 
		 example.setEpLength(22.22f);
		 example.setGenre("Sci-fi");
		 
		 
		 System.out.println(example.Title);
		 System.out.println(example.URL);
		 System.out.println(example.EpNum);
		 System.out.println(example.SeasonNum);
		 System.out.println(example.EpLength);
		 System.out.println(example.Genre);
		 System.out.println(example.toString());
		 
	 }
	
	
	
	
	 
	//toString
	 /*
	  * Title: Made primarily for visibility. Left 20 spaces for the title because I wanted enough to get the gist of the title,
	  * 	   I have it left-aligned for readability.
	  * Season: Given only 2 spaces because I don't know any series that was more than 99 seasons, barely any more than 10.
	  * Episode: Given 3 spaces because I don't know any series that has more than 999 episodes in a single season.
	  * Length: Choosen to replicate how it is seen in most video players.
	  * Genre: Given 15 spaces because the longest I could think of was High Fantasy, and thought I should give a little more room.
	  * URL: URLs are highly variable in length and I don't want to cut any of it off so the URL can be usable right then and there,
	  *      Put at the end to allow for it's variable length while minimizing it's effect on readability.
	  */
	 public String toString() {
		String str1 = String.format("Title: %-20s Season: %2s Episode: %3s Lenght: %3.2f Genre: %-15s URL: %s",
				Title, SeasonNum,EpNum, EpLength, Genre,URL);
		 
		 return str1;
				 //"Title: "+Title+" Season "+SeasonNum+" Episode:"+EpNum+ "Ep Length:"+EpLength+" URL:"+URL+"\n";
	 }
	
	 //------Set & Get functions for the variables-------// 
	//Title
	public void setTitle(String newTitle) {Title = newTitle;}
	public String getTitle() { return Title;}
	
	//Season Number
	public void setSeasonNum(int Num) {SeasonNum =Num;}
	public int getSeasonNum() {return SeasonNum;}
	
	//Episode Number
	public void setEpNum(int Num) {EpNum =Num;}
	public int getEpNum() {return EpNum;}
	
	//WebLink
	public void setURL(String newURL) {URL = newURL;}
	public String getURL() { return URL;}
	
	//Episode Length
	public void setEpLength(float tempLength) {EpLength = tempLength;}
	public double getEpLength() { return EpLength;}
	
	//Genre
	public void setGenre(String tempGenre) { Genre = tempGenre;}
	public String getGenre() {return Genre;}
}
