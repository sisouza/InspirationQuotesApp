package com.example.inspirationquoteapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Resource annotations add additional info to classes, methods, or parameters
 *  and prevents the caller from accidentally pass  the arguments in the wrong order
 * **/
data class Affirmation(@StringRes val stringResourceId: Int,  @DrawableRes val imageResourceId: Int) {


}