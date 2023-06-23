package com.asep.ruhkehidupan.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatDelegate
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModelProvider
import com.asep.ruhkehidupan.R
import com.asep.ruhkehidupan.preferences.SettingPreferences
import com.asep.ruhkehidupan.viewmodel.SettingViewModel
import com.asep.ruhkehidupan.viewmodel.ViewModelFactory

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class SplashScreenActivity : AppCompatActivity() {
    private val splashTime: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Menjalankan penundaan untuk memunculkan SplashScreen selama splashTime
        Handler(mainLooper).postDelayed({
            val intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTime)

        // Mendapatkan instance SettingPreferences dengan menggunakan dataStore
        val pref = SettingPreferences.getInstance(dataStore)
        val settingViewModel = ViewModelProvider(this, ViewModelFactory(pref)).get(
            SettingViewModel::class.java
        )

        // Mengamati pengaturan tema dan mengubah tema aplikasi sesuai
        settingViewModel.getThemeSettings().observe(
            this
        ) { isDarkModeActive: Boolean ->
            if (isDarkModeActive) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}
