package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import tads.eaj.ufrn.navigationexample.databinding.FragmentTituloBinding

class TituloFragment : Fragment() {

    lateinit var binding: FragmentTituloBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_titulo,container, false)

        binding.button.setOnClickListener {
            //Navigation.findNavController(it).navigate(R.id.action_tituloFragment_to_perguntaFragment)
            Navigation.findNavController(it).navigate(TituloFragmentDirections.actionTituloFragmentToPerguntaFragment("Hello World", 1L))
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, this.findNavController()) || super.onOptionsItemSelected(item)
    }

}