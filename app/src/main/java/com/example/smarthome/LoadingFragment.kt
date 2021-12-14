package com.example.smarthome

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.airbnb.lottie.LottieAnimationView


class LoadingFragment: DialogFragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var myView= inflater!!.inflate(R.layout.fragment_loading,container,false)
        var lott = myView.findViewById<LottieAnimationView>(R.id.lottie_1)

        lott.setAnimation("success-loading.json")
        lott.speed = 2F
        lott.playAnimation()

        val timer = object: CountDownTimer(2700, 2700) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                dismissIt()
            }
        }
        timer.start()


        return myView
    }

    fun dismissIt(){
        this.dismiss()
    }


}