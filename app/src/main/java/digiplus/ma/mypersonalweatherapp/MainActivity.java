package digiplus.ma.mypersonalweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateWeatherMessage(26, "Rabat");
    }

    private String CreateWeatherMessage(int Temperature, String CityName){

        return "Bienvenue à " + CityName + "Ou la température est : " + Temperature + "°C"
    }

}
