package com.example.myapplication

import android.util.Log

class Songs (songName: String, songArtist: String, songYear: Int, songDuration: String) {
    // created variables to hold song object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    // secondary constructor
    constructor(songName: String, songArtist: String) :
            this(songName, songArtist, 0, ""){
    }

    // initializing variables
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }

    // function to play song
    fun play(){
        Log.v("Song", "$name is playing.")
    }

    // function to pause song
    fun pause(){
        Log.v("Song", "$name is paused.")
    }

    // function to stop song
    fun stop(){
        Log.v("Song", "$name is stopped.")
    }

    // function to favourite song
    fun favourite() : Boolean{
        Log.v("Song", "$name is favourited.")
        return true
    }

    // function to display the songs
    fun GetDisplayString() : String {
        return "$name - $artist ($duration)"
    }
}