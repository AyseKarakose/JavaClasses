package com.class13;

public class RegularExpressions2 {

	public static void main(String[] args) {
		
		String str="Today is our java class";
		
		System.out.println(str.replace(" ",""));
		System.out.println(str.replaceAll("\\s",""));// \\s ==>means except space
		
		
		
		String doc="Video provides a powerful way to help you "
				+ "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		
		System.out.println(doc.toLowerCase().replace("video", "Audio"));// after lower case we need write video with lower case not Video
		System.out.println(doc.replaceAll("way(.*)", ""));//(word.*)==> means after don't write after word
		

	}

}
