package com.example.projectmanager.Repository

import com.example.projectmanager.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Fooad App", "August 11, 2024", 50, "ongoing1"),
        OngoingDomain("AI Recording", "September 11, 2024", 60, "ongoing2"),
        OngoingDomain("Weather App", "August 17, 2024", 25, "ongoing3"),
        OngoingDomain("E-Book App", "August 22, 2024", 80, "ongoing4"),
    )  
}