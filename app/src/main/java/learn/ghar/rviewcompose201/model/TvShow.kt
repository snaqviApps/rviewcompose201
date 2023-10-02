package learn.ghar.rviewcompose201.model

import java.io.Serializable

data class TvShow(
    val id : Int,
    val name : String,
    val overview : String,
    val rating : Double,
    val year : Int,
    val imageId : Int,

    ) : Serializable {}