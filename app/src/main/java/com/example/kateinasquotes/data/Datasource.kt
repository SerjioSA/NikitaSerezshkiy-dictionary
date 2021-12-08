package com.example.kateinasquotes.data

import com.example.kateinasquotes.R
import com.example.kateinasquotes.model.Quote

class Datasource {
    fun loadQuotes():List<Quote>{
        return listOf<Quote>(
            Quote(R.string.quote1,R.drawable.image1),
            Quote(R.string.quote2,R.drawable.image2),
            Quote(R.string.quote3,R.drawable.image3),
            Quote(R.string.quote4,R.drawable.image4),
            Quote(R.string.quote5,R.drawable.image5),
            Quote(R.string.quote6,R.drawable.image6),
            Quote(R.string.quote7,R.drawable.image7),
            Quote(R.string.quote8,R.drawable.image8),
            Quote(R.string.quote9,R.drawable.image9),
            Quote(R.string.quote10,R.drawable.image10),
            Quote(R.string.quote11,R.drawable.image_dict),
            Quote(R.string.quote12,R.drawable.image_cnc),
            Quote(R.string.quote13,R.drawable.image_hodila),
            Quote(R.string.quote14,R.drawable.image_road)



        )
    }
}