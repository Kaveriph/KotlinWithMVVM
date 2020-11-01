package com.anushka.viewmodeldemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.FragmentSenderBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SenderFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SenderFragment : Fragment() {
    private lateinit var binding: FragmentSenderBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sender, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.getBinding<FragmentSenderBinding>(view) as FragmentSenderBinding
        viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)
        binding.addButton.setOnClickListener {
            viewModel.getUpdatedCount(binding.etNumber.text.toString().toInt()).toString()
        }

    }
}