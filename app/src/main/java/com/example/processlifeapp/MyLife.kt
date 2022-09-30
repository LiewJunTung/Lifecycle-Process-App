package com.example.processlifeapp

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner

class MyLife: DefaultLifecycleObserver {
    private val name = MyLife::class.java.simpleName


    var lifecycle: Lifecycle = ProcessLifecycleOwner.get().lifecycle.also {
        it.addObserver(this)
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(name, "START")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(name, "RESUME")
    }
    override fun onCreate(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(name, "CREATE")

    }
    override fun onPause(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(name, "PAUSE")

    }
    override fun onDestroy(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(name, "DESTROY")

    }
    override fun onStop(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(name, "STOP")

    }

}