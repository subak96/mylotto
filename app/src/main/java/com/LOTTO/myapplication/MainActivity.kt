package com.LOTTO.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.LOTTO.myapplication.databinding.ActivityMainBinding
import com.LOTTO.myapplication.homeFragment
import com.LOTTO.myapplication.luckFragment
import com.LOTTO.myapplication.ramdomFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.bottom_layout, homeFragment()).commit()

        navigation()
    }

    private fun navigation() {
        val bottomNavigationView = binding.bottomNavigation

        //앱 실행시 네비게이션 바 현재 선택된 항목을 홈으로 설정
        bottomNavigationView.selectedItemId = R.id.meun_Home

        //네비게이션 바 아이템 선택
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.meun_Home -> {
                    replaceFragment(homeFragment())
                    true
                }
                R.id.menu_Lick -> {
                    replaceFragment(luckFragment())
                    true
                }
                R.id.menu_number -> {
                    replaceFragment(ramdomFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.bottom_layout, fragment)
            .commit()
    }
}
