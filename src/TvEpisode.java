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
	
	public TvEpisode() {
		Title = "temp title";
		SeasonNum = 1;
		EpNum = 1;
		URL = "URL goes here";
		
	}
	public TvEpisode(String newTitle, int Season, int Episode, String newURL) {
		Title = newTitle;
		SeasonNum = Season;
		EpNum = Episode;
		URL = newURL;
	}
	
	 public static void main(String[] args) {
		 TvEpisode example = new TvEpisode("Whack",4,6,"www.com");
		 
		 System.out.println(example.Title);
		 System.out.println(example.URL);
		 System.out.println(example.EpNum);
		 System.out.println(example.SeasonNum+"\n");
		 
		 example.setEpNum(2);
		 example.setSeasonNum(3);
		 example.setTitle("Yikes");
		 example.setURL("www.deeznutz.com");		 
		 
		 System.out.println(example.Title);
		 System.out.println(example.URL);
		 System.out.println(example.EpNum);
		 System.out.println(example.SeasonNum);
		 
		 
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
	
	
}