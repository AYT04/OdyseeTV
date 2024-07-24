package com.example.odyseetv

object MovieList {
    val MOVIE_CATEGORY = arrayOf(
            "Technology",
            "Comedy",
            "Nature",
            "Reacion videos",
            "Operating Systems",
            "Audio Commentary")

    val list: List<Movie> by lazy {
        setupMovies()
    }
    private var count: Long = 0

    private fun setupMovies(): List<Movie> {
        val title = arrayOf(
                "Daz Watches The Most Offensive Videos Ever",
                "2,000,000 Subs - (Pirate Software)",
                "Ava Kris Tyson Situation is Crazy",
                "He Sent Me Minecraft Malware (Java Deobfuscation)",
                "What The F*** Is Happening to Canada?")

        val description = "Fusce id nisi turpis. Praesent viverra bibendum semper."
        val studio = arrayOf(
                "Daz Games",
                "Pirate Software",
                "Penguinz0",
                "John Hammond",
                "Elvis Jesse")
        val videoUrl = arrayOf(
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4")
        val bgImageUrl = arrayOf(
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg")
        val cardImageUrl = arrayOf(
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/card.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/card.jpg")

        val list = title.indices.map {
            buildMovieInfo(
                    title[it],
                    description,
                    studio[it],
                    videoUrl[it],
                    cardImageUrl[it],
                    bgImageUrl[it])
        }

        return list
    }

    private fun buildMovieInfo(
            title: String,
            description: String,
            studio: String,
            videoUrl: String,
            cardImageUrl: String,
            backgroundImageUrl: String): Movie {
        val movie = Movie()
        movie.id = count++
        movie.title = title
        movie.description = description
        movie.studio = studio
        movie.cardImageUrl = cardImageUrl
        movie.backgroundImageUrl = backgroundImageUrl
        movie.videoUrl = videoUrl
        return movie
    }
}
