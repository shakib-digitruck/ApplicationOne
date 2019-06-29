package com.example.applicationone


import android.os.Environment
import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Photo(val url: String) : Parcelable {
    companion object {
        fun getSunsetPhotos(): Array<Photo> {
            return arrayOf(
                Photo("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic0.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic1.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic2.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic3.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic4.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic5.jpg"),
                Photo("file:///storage/emulated/0/Android/data/com.example.applicationone/files/Pictures/pic6.jpg"))
        }
    }
}