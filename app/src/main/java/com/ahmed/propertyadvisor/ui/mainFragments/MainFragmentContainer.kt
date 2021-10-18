package com.ahmed.propertyadvisor.ui.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmed.propertyadvisor.R
import com.ahmed.propertyadvisor.databinding.FragmentMainContainerBinding
import com.ahmed.propertyadvisor.databinding.FragmentSplashBinding
import com.ahmed.propertyadvisor.ui.adapters.MainFragmentsAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragmentContainer.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragmentContainer : Fragment(R.layout.fragment_main_container) {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    // Fragment Binding
    private var _binding: FragmentMainContainerBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initBinding(view)

        setupViewPager()
    }

    private fun initBinding(view: View){
        _binding = FragmentMainContainerBinding.bind(view)
    }


    private fun setupViewPager(){
        //binding.adsViewPager.offscreenPageLimit = 1
        val viewPagerAdapter = MainFragmentsAdapter(requireActivity())
        binding.mainViewPager.adapter = viewPagerAdapter
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragmentContainer.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragmentContainer().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}