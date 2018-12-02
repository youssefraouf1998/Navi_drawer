package com.wds.future.navi_drawer;

import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if (id == R.id.home) {


            BlankFragment blankFragment = new BlankFragment();
            fragmentTransaction.replace(R.id.frame_1,blankFragment);

            fragmentTransaction.commit();

        } else if (id == R.id.offers) {

            BlankFragment2 blankFragment2 = new BlankFragment2();
            fragmentTransaction.replace(R.id.frame_1,blankFragment2);

            fragmentTransaction.commit();

        } else if (id == R.id.food) {

            BlankFragment3 blankFragment3 = new BlankFragment3();
            fragmentTransaction.replace(R.id.frame_1,blankFragment3);

            fragmentTransaction.commit();

        } else if (id == R.id.restaurants) {

            BlankFragment4 blankFragment4 = new BlankFragment4();
            fragmentTransaction.replace(R.id.frame_1,blankFragment4);

            fragmentTransaction.commit();
//lihkjb
        } else if (id == R.id.account) {

            BlankFragment5 blankFragment5 = new BlankFragment5();
            fragmentTransaction.replace(R.id.frame_1,blankFragment5);

            fragmentTransaction.commit();

        } else if (id == R.id.Terms) {

            BlankFragment6 blankFragment6 = new BlankFragment6();
            fragmentTransaction.replace(R.id.frame_1,blankFragment6);

            fragmentTransaction.commit();

        }else if (id == R.id.about) {

            BlankFragment7 blankFragment7 = new BlankFragment7();
            fragmentTransaction.replace(R.id.frame_1,blankFragment7);

            fragmentTransaction.commit();

        }else if (id == R.id.contact) {

            BlankFragment8 blankFragment8 = new BlankFragment8();
            fragmentTransaction.replace(R.id.frame_1,blankFragment8);

            fragmentTransaction.commit();

        }else if (id == R.id.faq) {

            BlankFragment7 blankFragment7 = new BlankFragment7();
            fragmentTransaction.replace(R.id.frame_1,blankFragment7);

            fragmentTransaction.commit();

        }else if (id == R.id.region) {

            BlankFragment10 blankFragment10 = new BlankFragment10();
            fragmentTransaction.replace(R.id.frame_1,blankFragment10);

            fragmentTransaction.commit();

        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
