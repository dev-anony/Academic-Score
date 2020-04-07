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

        //setting up course spiner

        val courses = resources.getStringArray(R.array.courses)
        val spinner = t.findViewById<Spinner>(R.id.spinner)
        spinner?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, courses)
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //val type = parent?.getItemAtPosition(position).toString()
                //Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
                //println(type)
            }

        }

        //setting up semester spinner

        val semester = resources.getStringArray(R.array.semester)
        val spinner2 = t.findViewById<Spinner>(R.id.spinner2)
        spinner2?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, semester)
        spinner2?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //val type = parent?.getItemAtPosition(position).toString()
                //Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
                //println(type)
            }

        }

        //setting up test spinner

        val test = resources.getStringArray(R.array.test)
        val spinner3 = t.findViewById<Spinner>(R.id.spinner3)
        spinner3?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, test)
        spinner3?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("erreur")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //val type = parent?.getItemAtPosition(position).toString()
                //Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
                //println(type)
            }

        }
        return t
    }






}
