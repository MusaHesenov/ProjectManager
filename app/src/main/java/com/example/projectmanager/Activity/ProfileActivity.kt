package com.example.projectmanager.Activity

import android.content.Intent
import android.net.LinkAddress
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectmanager.Adapter.ArchiveAdapter
import com.example.projectmanager.Adapter.MyTeamAdapter
import com.example.projectmanager.R
import com.example.projectmanager.ViewModel.ProfileViewModel
import com.example.projectmanager.databinding.ActivityMainBinding
import com.example.projectmanager.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val profileViewModel:ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getBack()

        binding.apply {
            val myteamAdapter by lazy { MyTeamAdapter(profileViewModel.loadDataMyteam()) }
            viewTeam.apply {
                adapter=myteamAdapter
                layoutManager=LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }

            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive()) }
            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager=LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }

        }

    }

    private fun getBack() {
        binding.backBtn.setOnClickListener{
            startActivity(Intent(this,DashboardActivity::class.java))
        }
    }


}