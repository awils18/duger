package back9.com.duger;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String HOMEPAGE_FRAGMENT_KEY = "homepage_fragment_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment savedHomepageFragment = getSupportFragmentManager().findFragmentByTag(HOMEPAGE_FRAGMENT_KEY);
        if (savedHomepageFragment == null)
        {
            savedHomepageFragment = new HomepageFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeholder, savedHomepageFragment, HOMEPAGE_FRAGMENT_KEY);
            fragmentTransaction.commit();
        }
    }
}
