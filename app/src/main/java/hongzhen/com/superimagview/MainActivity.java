package hongzhen.com.superimagview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SuperImageView imageView;
    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        tvShow = findViewById(R.id.tv_show);
        imageView.setListener(new SuperImageView.onTypeListener() {
            @Override
            public void onTypeChangeListener(String type) {
                tvShow.setText(imageView.mType);
                Log.i("Main:",type);
            }
        });

    }
}
