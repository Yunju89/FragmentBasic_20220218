package org.techtown.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.fragmentbasic_20220218.R

class MyFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_first, container, false)   // xml 끌어오는 부분 외 뒷부분은 거의 변동없음.
    }

}