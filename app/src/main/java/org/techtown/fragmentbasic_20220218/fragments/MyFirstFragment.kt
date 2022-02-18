package org.techtown.fragmentbasic_20220218.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_first.*
import org.techtown.fragmentbasic_20220218.R

class MyFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_first, container, false)   // xml 끌어오는 부분 외 뒷부분은 거의 변동없음.
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        이 프래그먼트가 들고 있는 액티비티가 완전히 만들어진 시점
//        이벤트 처리 / 데이터 보여주기 등등 동작

        btnLog.setOnClickListener {

            Log.d("첫프래그먼트", "프래그먼트의 버튼으로 로그찍기")
        }
    }

}