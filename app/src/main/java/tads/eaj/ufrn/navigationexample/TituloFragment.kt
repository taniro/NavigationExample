package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.navigationexample.databinding.FragmentTituloBinding

class TituloFragment : Fragment() {

    lateinit var binding: FragmentTituloBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_titulo,container, false)

        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_tituloFragment_to_perguntaFragment)
        }


        return binding.root
    }

}