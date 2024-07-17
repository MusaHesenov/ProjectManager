package com.example.projectmanager.Repository

import com.example.projectmanager.Domain.TeamDomain
import kotlinx.coroutines.sync.Mutex

class ProfileRepository {
    
    val myteamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application","Project in Progress"),
        TeamDomain("AI Python","Completed"),
        TeamDomain("Weather App ","Project in Progress"),
        TeamDomain("Kotlin developers","Completed"),
        )

    val archiveItems:MutableList<String> = mutableListOf(
        "UI/UX ScreenShot",
        "Kotlin Source Code",
        "Source Codes"
    )
    
}