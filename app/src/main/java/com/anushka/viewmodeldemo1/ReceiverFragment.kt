package com.anushka.viewmodeldemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.FragmentReceiverBinding
import com.anushka.viewmodeldemo1.databinding.FragmentSenderBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ReceiverFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ReceiverFragment : Fragment() {

    private lateinit var binding: FragmentReceiverBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_receiver, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)
        binding = DataBindingUtil.getBinding<FragmentReceiverBinding>(view) as FragmentReceiverBinding
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.nextScreen.setOnClickListener {
           binding.countText.text = viewModel.getCurrentCount().toString()
        }
    }

}