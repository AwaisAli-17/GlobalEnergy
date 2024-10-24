package com.example.globalenergy

import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView.OnItemSelectedListener
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.globalenergy.Fragments.ContactFragment
import com.example.globalenergy.Fragments.HomeFragment
import com.example.globalenergy.Fragments.ProductsFragment
import com.example.globalenergy.Fragments.QuoteFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
 //       val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = navHostFragment.navController
//        navigationView.setupWithNavController(navController)
//        bottomNav.setupWithNavController(navController)
        navigationView.setNavigationItemSelectedListener(this)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, HomeFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, HomeFragment()).commit()
            R.id.nav_contact -> supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ContactFragment()).commit()
            R.id.nav_products -> supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ProductsFragment()).commit()
            R.id.nav_quote -> supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, QuoteFragment()).commit()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}


