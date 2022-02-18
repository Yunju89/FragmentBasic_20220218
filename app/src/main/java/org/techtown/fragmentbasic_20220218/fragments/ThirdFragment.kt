package org.techtown.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmetn_second.*
import org.techtown.fragmentbasic_20220218.R

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {
// 프래그먼트는 화면이 아님 (부품) , this 안됨
            Toast.makeText(requireContext(), "프래그먼트에서 띄우는 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}