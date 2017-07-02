package com.grupo3.spotify;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

public class HttpApi {
	
	public HttpApi(){
			
		}
		
		public String obtenerJSONSpotify(String url, String parametros){
			
			String contentType = "application/json";
			
			//String url = "https://api.spotify.com/v1/artists/7jy3rLJdDQY21OgRLCZ9sD";
			HttpURLConnection con = null;
			InputStreamReader r = null;
			OutputStreamWriter w = null;
		
			StringBuilder sb = new StringBuilder();
		
			try {
				
				String autorizacion = "Bearer BQC1ZAZv4dqx_YoRefxpUNWiwSpAg8Z9pL_YBUZ1jFaHTbe8-2xhNyoSQTJqC33kR2UIjKOhJC-itcMJGVDYXVS7qtOQl1A7deo9KpengBtZbklmPQDKWC_wlV-D38lObNVM1DQ1HmTb90tBSkF3mUz0WrGHhcEXZBpTZFVPshhvVGKfuCoa9Zq8VwEM";
		
				con = (HttpURLConnection) new URL(url).openConnection();
				
				//método para pasar la solicitud (palabra clave) y el token de acceso que provee Spotify
				con.setRequestProperty ("Authorization", autorizacion);
		
				con.setConnectTimeout(30000);
				con.setReadTimeout(120000);
		
				
				con.setRequestProperty("Content-Type", contentType);
				con.setRequestProperty("Accept", contentType);
				
				if(parametros!=null){
		
					con.setDoOutput(true);
					w = new OutputStreamWriter(new BufferedOutputStream(con.getOutputStream()), "UTF-8");
					w.write(parametros);
					w.flush();
					w.close();
					
				}
		
				r = new InputStreamReader(con.getInputStream());
		
				int c;
				
				while ((c = r.read()) != -1) sb.append((char) c);
		
			} catch (SocketTimeoutException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(con!=null) con.disconnect();
			}
			
			return sb.toString();
			
		}
	
	}

