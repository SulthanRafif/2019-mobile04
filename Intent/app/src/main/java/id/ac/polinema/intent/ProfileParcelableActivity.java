package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import id.ac.polinema.Model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);


        User user = getIntent().getParcelableExtra(USER_KEY);

        if (user != null) {

            // TODO: display value here
            String usernameValue = user.getUsername();
            String nameValue = user.getName();
            int ageValue = user.getAge();

            usernameText.setText(usernameValue);
            nameText.setText(nameValue);
            ageText.setText(""+ageValue);

        }
    }
}
