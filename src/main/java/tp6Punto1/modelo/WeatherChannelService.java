package tp6Punto1.modelo;

import java.util.Random;

public class WeatherChannelService implements ClimaOnline {
    @Override
    public String temperatura() {
        int temp = new Random().nextInt(100);
        return temp + " c";
    }
    /*@Override
    public String temperatura() {
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=-40.81&lon=-62.99&appid=e09ce1236c02728eeba4130a184c563c&units=metric");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }*/
}
