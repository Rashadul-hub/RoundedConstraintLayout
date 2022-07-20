package com.example.roundedconstraintlayout

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

class RoundedConstraintLayout : ConstraintLayout {

    private lateinit var canvasRounder: CanvasRounder

    constructor(context: Context) : super(context){

        init(context,null,0)
    }

    constructor(context: Context,attr:AttributeSet) : super(context,attr){

        init(context, attr,0)
    }
    constructor(context: Context,attr:AttributeSet,defStyle:Int) : super(context,attr,defStyle){

        init(context, attr, defStyle)
    }
    private fun init(context: Context, attr: AttributeSet?, defStyle: Int) {

    }



}