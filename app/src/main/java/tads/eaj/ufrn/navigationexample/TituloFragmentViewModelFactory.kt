package tads.eaj.ufrn.navigationexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TituloFragmentViewModelFactory(val mensagem:String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TituloFragmentViewModel::class.java)) {
            return TituloFragmentViewModel(mensagem) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}