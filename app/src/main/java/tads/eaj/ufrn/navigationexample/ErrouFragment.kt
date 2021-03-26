package tads.eaj.ufrn.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import tads.eaj.ufrn.navigationexample.databinding.FragmentErrouBinding


class ErrouFragment : Fragment() {

    lateinit var binding: FragmentErrouBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_errou, container, false)

        binding.bTentarE.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_errouFragment_to_perguntaFragment)
        }

        return binding.root
    }
}