package tads.eaj.ufrn.navigationexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
class TituloFragmentViewModel():ViewModel() {
    private var _texto = MutableLiveData<String>()
    val texto:LiveData<String>
        get() = _texto

    init {
        _texto.value = "mensagem"
    }
}*/

class TituloFragmentViewModel(mensagem:String):ViewModel() {
    private var _texto = MutableLiveData<String>()
    val texto:LiveData<String>
        get() = _texto

    init {
        _texto.value = mensagem
    }

}


