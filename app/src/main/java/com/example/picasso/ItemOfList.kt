package com.example.picass

import java.io.Serializable

class ItemOfList(val imageURL : String) : Serializable {
    companion object{
        fun getAndroidVersionList(): List<ItemOfList>{
            val versionList = ArrayList<ItemOfList>()
            versionList.clear()
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/honeycomb.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/donut.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/oreo.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/nougat.png"))
            versionList.add(ItemOfList("https://raw.githubusercontent.com/AndroidCodility/Picasso-RecyclerView/master/images/marshmallow.png"))

            return versionList
        }
    }
}
