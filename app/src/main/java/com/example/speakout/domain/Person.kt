package com.example.speakout.domain

import android.graphics.Bitmap
import java.util.Date

class Person (val id: Int,
              var photo: Bitmap,
              var name: String,
              var date: Date,
              var description: String,
              val user: User)