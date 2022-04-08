package com.naldana.activitysexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var scoreA = MutableLiveData("")
    var result  = Transformations.map(scoreA){
        textScore ->"$textScore"
    }
    var scoreB = MutableLiveData("")
}