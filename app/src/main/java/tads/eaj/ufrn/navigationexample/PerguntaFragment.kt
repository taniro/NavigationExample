package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.navigationexample.databinding.FragmentPerguntaBinding


class PerguntaFragment : Fragment() {

    lateinit var binding:FragmentPerguntaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pergunta, container, false)

        binding.bResponder.setOnClickListener {

            if (binding.radioGroupQuestao.checkedRadioButtonId == R.id.rbKotlin) {
                Navigation.findNavController(it).navigate(R.id.action_perguntaFragment_to_acertouFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_perguntaFragment_to_errouFragment)
            }

        }

        return binding.root
    }
}