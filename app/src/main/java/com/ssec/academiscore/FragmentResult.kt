package com.ssec.academiscore

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.*

class FragmentResult : Fragment() {

    private lateinit var resetButton: Button
    private lateinit var showButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view=inflater.inflate(R.layout.fragment_result, container, false)

        //setting course spinner

        val courses = resources.getStringArray(R.array.courses)
        val spinner = view.findViewById<Spinner>(R.id.spinner)
        spinner?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, courses)
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        //setting semester spinner

        val semester = resources.getStringArray(R.array.semester)
        val spinner2 = view.findViewById<Spinner>(R.id.spinner2)
        spinner2?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, semester)
        spinner2?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        //setting test spinner

        val test = resources.getStringArray(R.array.test)
        val spinner3 = view.findViewById<Spinner>(R.id.spinner3)
        spinner3?.adapter = ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, test)
        spinner3?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }

        //adding show button

        showButton = view.findViewById(R.id.show_button)
        showButton.setOnClickListener {
            if(spinner.selectedItemPosition != 0 && spinner2.selectedItemPosition != 0 && spinner3.selectedItemPosition != 0 ) {
                val intent = Intent(requireContext(), ResultActivity::class.java)
                startActivity(intent)
            }
            // making toast onNothingSelected
            else
                Toast.makeText(requireContext(),"Please select the option", Toast.LENGTH_SHORT).show()
        }

        // adding reset button

        resetButton = view.findViewById(R.id.reset_button)
        resetButton.setOnClickListener {
            spinner.setSelection(0)
            spinner2.setSelection(0)
            spinner3.setSelection(0)
        }

        return view
    }






}
