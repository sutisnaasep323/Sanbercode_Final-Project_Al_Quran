package com.asep.ruhkehidupan.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.databinding.ActivityNavigationBinding

class NavigationActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarNavigation.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_navigation)

        // Menentukan fragment tujuan yang memiliki tampilan AppBar dan navigasi drawer
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_quran, R.id.nav_dzikir, R.id.nav_doa
            ), drawerLayout
        )

        // Mengatur warna teks pada toolbar
        binding.appBarNavigation.toolbar.setTitleTextColor(ResourcesCompat.getColor(resources, R.color.text_primary, null))

        // Menghubungkan ActionBar dengan NavController
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Menghubungkan NavigationView dengan NavController
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.setting_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this@NavigationActivity, SettingActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> return false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_navigation)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
