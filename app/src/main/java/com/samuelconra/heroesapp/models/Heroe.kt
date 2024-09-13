package com.samuelconra.heroesapp.models

data class Heroe(val name: String, val image: String, val year: String, val publisherId: Int){
    companion object {
        val heroes = mutableListOf<Heroe>(
            // MARVEL HEROES
            Heroe("SpiderMan", "https://i.redd.it/0t3bd8ffm6ub1.jpg", "1998",1),
            Heroe("Thor", "https://static1.srcdn.com/wordpress/wp-content/uploads/2023/12/immortal-thor-4-cropped.jpg", "1874",1),
            Heroe("Magneto", "https://media.vandalsports.com/master/4-2024/2024424124947_1.jpg", "2001",1),
            Heroe("Hulk", "https://i.pinimg.com/564x/60/39/27/603927d1d1a7d6cf07575e3d9602a048.jpg", "1934",1),
            Heroe("Deadpool", "https://static.wikia.nocookie.net/marveldatabase/images/a/a1/Deadpool_Vol_10_1_Textless.jpg/revision/latest?cb=20231219070549", "1973",1),
            Heroe("Wolverine", "https://static.wikia.nocookie.net/marveldatabase/images/3/3e/Return_of_Wolverine_Vol_1_1_Current_Costume_Virgin_Variant.jpg/revision/latest/scale-to-width-down/340?cb=20180626163904", "2009",1),
            Heroe("IronFist", "https://static.wikia.nocookie.net/marveldatabase/images/1/14/Iron_Fist_Heart_of_the_Dragon_Vol_1_1_Textless.jpg/revision/latest?cb=20210522072841", "1999",1),

            // DC HEROES
            Heroe("Superman", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/cb01232e-ee66-4d54-aa6d-fb893d26e469/dg94cx6-d21f7536-3df0-42a3-83bd-d3b6c193fabf.jpg/v1/fill/w_894,h_894,q_70,strp/superman_comic_book_style_by_kajiroart_dg94cx6-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2NiMDEyMzJlLWVlNjYtNGQ1NC1hYTZkLWZiODkzZDI2ZTQ2OVwvZGc5NGN4Ni1kMjFmNzUzNi0zZGYwLTQyYTMtODNiZC1kM2I2YzE5M2ZhYmYuanBnIiwiaGVpZ2h0IjoiPD0xMjgwIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvY2IwMTIzMmUtZWU2Ni00ZDU0LWFhNmQtZmI4OTNkMjZlNDY5XC9rYWppcm9hcnQtNC5wbmciLCJvcGFjaXR5Ijo5NSwicHJvcG9ydGlvbnMiOjAuNDUsImdyYXZpdHkiOiJjZW50ZXIifX0.M0wHr2ydz5_YHpZtY4SIPNGSj1EUSxiRTcYKNpHDWHI", "1981",2),
            Heroe("Flash", "https://www.watchmojo.com/uploads/share-image/VIDEO-SHARE-16343.jpg?2022-04-21.v2", "1919",2),
            Heroe("Aquaman", "https://cdn.mos.cms.futurecdn.net/izHTcbrF2b8kxrF9CYQJia-1200-80.jpg", "1992",2),
            Heroe("Catwoman", "https://static.wikia.nocookie.net/comicdc/images/e/e6/Selina_Kyle_%28Nueva_Tierra%29_001.jpg/revision/latest?cb=20130910020451&path-prefix=es", "2001",2),
            Heroe("Shazam", "https://static.wikia.nocookie.net/marvel_dc/images/6/61/Shazam%21_Vol_3_1_Textless_Variant.jpg/revision/latest?cb=20181205234924", "1956",2),
        )
    }
}