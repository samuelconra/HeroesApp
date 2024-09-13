package com.samuelconra.heroesapp.models

data class Publisher(val id: Int, val name: String, val image: String, val background: String, val description: String){
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "Marvel", "https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png", "ironman_comic", "Home of Legendary Heroes"),
            Publisher(2, "DC", "https://static.wikia.nocookie.net/marvel_dc/images/f/fc/DC_Rebirth_Logo.png/revision/latest?cb=20160517164738", "batman_comic", "Universe of epic stories")
        )
    }
}
