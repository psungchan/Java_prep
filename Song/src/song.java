// Sungchan Park
// 11/20/2018
// N/A
// TA: N/A
// Assignment #1
//
// This program will print out a song with several repeating lines through the use of several static
// 	method calls.

public class song {
	public static void main(String[] args) {
		firstStanza();
		secondStanza();
		thirdStanza();
		fourthStanza();
		fifthStanza();
		myStanza();
		finalStanza();
		
	}
	
	public void dogCat(){
		System.out.println("She swallowed the dog to catch the cat,")
	}
	
	public void catBird(){
		System.out.println("She swallowed the cat to catch the bird,")
	}
	
	public void birdSpider(){
		System.out.println("She swallowed the bird to catch the spider,")
	}
	
	public void spiderFly(){
		System.out.println("She swallowed the spider to catch the fly,")
	}
	
	public void sharedVerse() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
		System.out.println();
	}
	
	public void firstStanza() {
		System.out.println("There was an old woman who swallowed a fly.");
		sharedVerse();
	}
	
	public void secondStanza() {
		System.out.println("There was an old woman who swallowed a spider.");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		System.out.println("");
		sharedVerse();
	}
	
	public void thirdStanza() {
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		System.out.println("");
		sharedVerse();
	}
	
	public void fourthStanza() {
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		System.out.println("");
		sharedVerse();
	}
	
	public void fifthStanza() {
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
	}
	
	public void finalStanza() {
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
	public void firstLine() {
		System.out.println ("There was and old woman who swallowed a fly.");
	}
	
}
