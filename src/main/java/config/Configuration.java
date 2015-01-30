package config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	//private static String _bundle = "configuration";
	private static Configuration _singleton = null;
	//private Locale _lc;
	//private ResourceBundle _rb;
	

	private Configuration() {
		//this._lc = new Locale("en");
		//this._rb = ResourceBundle.getBundle(_bundle, _lc);

	}

	public static Configuration singleton() {
		if (Configuration._singleton == null) {
			Configuration._singleton = new Configuration();
		}
		return Configuration._singleton;
	}
	
	private static Properties prop = loadProperties();
	
	private static Properties loadProperties(){
		String userDir = System.getenv("MW_CONFIG");
		//String rootPath = Configuration.class.getResource("/").getPath();
		//String tt = rootPath.replace("/", "\\");
		InputStream in = Configuration.class.getResourceAsStream("/"+userDir+"/configuration.properties");
		try {
			prop = new Properties();
			prop.load(in);
			//prop.load(new FileInputStream(tt+userDir+"\\configuration.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return prop;
	}


	public String get(String key){
//		if (_rb.containsKey(key))
//			return _rb.getString(key);
//		else
//			return "";
		
		if(prop.getProperty(key) != null){
			return prop.getProperty(key).trim();
		}else{
			return "";
		}
		
	}	
	
}
