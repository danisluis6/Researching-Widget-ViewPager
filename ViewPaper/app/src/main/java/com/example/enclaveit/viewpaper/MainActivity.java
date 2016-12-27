package com.example.enclaveit.viewpaper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.enclaveit.viewpaper.fragment.Korea;
import com.example.enclaveit.viewpaper.fragment.Turky;
import com.example.enclaveit.viewpaper.fragment.Usa;
import com.example.enclaveit.viewpaper.fragment.Vietnam;

import java.util.List;
import java.util.Vector;

public class MainActivity extends FragmentActivity {

    private PaperAdapter mPaperAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * setModel or setAdapter()
         */
        initialisePagin();
    }

    private void initialisePagin(){
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this,Korea.class.getName()));
        fragments.add(Fragment.instantiate(this,Vietnam.class.getName()));
        fragments.add(Fragment.instantiate(this,Usa.class.getName()));
        fragments.add(Fragment.instantiate(this,Turky.class.getName()));

        viewPager = (ViewPager)this.findViewById(R.id.viewPaper);
        viewPager.setAdapter(new PaperAdapter(this.getSupportFragmentManager(),fragments));
    }
}
