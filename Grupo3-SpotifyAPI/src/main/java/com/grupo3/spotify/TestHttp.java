package com.grupo3.spotify;

public class TestHttp {
private HttpApi api;

	public TestHttp(){
		api = new HttpApi();
	}
	
	public String obtenerArtista(){
		String s = api.obtenerJSONSpotify("https://api.spotify.com/v1/artists/7jy3rLJdDQY21OgRLCZ9sD", null);
		
		return s;
		
	}
	
	public String obtenerAlbum(){

    	String resultado = api.obtenerJSONSpotify("https://api.spotify.com/v1/albums/41bTjcSaiEe4G40RVVHbux",null);
    	return resultado;
	}
	
    public String obtenerCancion(){
    	
    	String resultado = api.obtenerJSONSpotify("https://api.spotify.com/v1/tracks/3ZFwuJwUpIl0GeXsvF1ELf",null);
    	return resultado;
    	
    }
	public static void main(String[] args) {
		
       TestHttp test = new TestHttp();
		System.out.println(test.obtenerAlbum());
		System.out.print("\n\n\n");
		System.out.println(test.obtenerArtista());
		System.out.print("\n\n\n");
		System.out.println(test.obtenerCancion());

	}

}
