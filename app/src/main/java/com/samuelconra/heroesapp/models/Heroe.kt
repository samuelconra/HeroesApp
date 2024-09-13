package com.samuelconra.heroesapp.models

data class Heroe(val id: Int, val name: String, val image: String, val year: String, val publisherId: Int){
    companion object {
        val heroes = mutableListOf<Heroe>(
            // MARVEL HEROES
            Heroe(1, "Spider Man", "https://i.redd.it/0t3bd8ffm6ub1.jpg", "1998",1),
            Heroe(2, "Thor", "https://static1.srcdn.com/wordpress/wp-content/uploads/2023/12/immortal-thor-4-cropped.jpg", "1874",1),
            Heroe(3, "Magneto", "https://media.vandalsports.com/master/4-2024/2024424124947_1.jpg", "2004",1),
            Heroe(4, "Hulk", "https://i.pinimg.com/564x/60/39/27/603927d1d1a7d6cf07575e3d9602a048.jpg", "1934",1),
            Heroe(5, "Deadpool", "https://static.wikia.nocookie.net/marveldatabase/images/a/a1/Deadpool_Vol_10_1_Textless.jpg/revision/latest?cb=20231219070549", "1973",1),

            // DC HEROES
            Heroe(6, "Superman", "https://static.wikia.nocookie.net/marvel_dc/images/a/a5/Superman_Vol_5_1_Textless.jpg/revision/latest/scale-to-width-down/1200?cb=20180711061148", "1973",2),
            Heroe(7, "Flash", "https://www.watchmojo.com/uploads/share-image/VIDEO-SHARE-16343.jpg?2022-04-21.v2", "1973",2),
        )
    }
}