package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import tads.eaj.ufrn.navigationexample.databinding.FragmentTituloBinding

class TituloFragment : Fragment() {

    lateinit var binding: FragmentTituloBinding
    lateinit var viewModel: TituloFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_titulo,container, false)

        val viewModelFactory = TituloFragmentViewModelFactory("nova mensagem")
        viewModel = ViewModelProvider(this, viewModelFactory).get(TituloFragmentViewModel::class.java)
        //val viewModelFactory = TituloFragmentViewModelFactory("parametro")
        //viewModel = ViewModelProvider(this, viewModelFactory).get(TituloFragmentViewModel::class.java)



        Toast.makeText(context, viewModel.texto.value, Toast.LENGTH_SHORT).show()

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