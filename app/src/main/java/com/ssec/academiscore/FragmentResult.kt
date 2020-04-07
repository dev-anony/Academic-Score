package com.ssec.academiscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class FragmentResult : Fragment() {
    //private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val t=inflater.inflate(R.layout.fragment_result, container, false)
        val languages = resources.getStringArray(R.array.Languages)
        val spinner = t.findViewById<Spinner>(R.id.spinner)
        spinner?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, languages)
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val type = parent?.getItemAtPosition(position).toString()
                Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
                println(type)
            }

        }
        return t
    }






}
