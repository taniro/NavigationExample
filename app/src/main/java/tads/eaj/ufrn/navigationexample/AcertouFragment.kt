package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.navigationexample.databinding.FragmentAcertouBinding


class AcertouFragment : Fragment() {

    lateinit var binding : FragmentAcertouBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_acertou, container, false)


        binding.bTentarA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_acertouFragment_to_perguntaFragment)
        }

        return binding.root
    }
}