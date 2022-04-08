package com.naldana.activitysexample

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.naldana.activitysexample.databinding.FragmentHomeFragmentBinding

class fragment_home : Fragment() {
    private  lateinit var binding: FragmentHomeFragmentBinding
    private val viewModel: MainViewModel by activityViewModels()

    companion object {
        fun newInstance() = fragment_home()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home_fragment,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        val navController = findNavController()
        binding.actionMoveNext.setOnClickListener{
            val action = fragment_homeDirections.actionFragmentHomeToFragmentSecond()
            navController.navigate(action)

            binding.actionAddOneTeamA.setOnClickListener{
                viewModel.scoreA.value +=1
            }
        }
    }






}