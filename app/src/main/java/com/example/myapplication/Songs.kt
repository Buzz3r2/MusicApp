package com.example.myapplication

import android.util.Log

class Songs {
    // properties
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

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
}