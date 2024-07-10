package com.surendramaran.yolov8tflite

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PairDataAdapter(context: Context, pairList: List<ModelList>) :
    ArrayAdapter<ModelList>(context, 0, pairList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(convertView, position, parent, android.R.layout.simple_list_item_1)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(convertView, position, parent, android.R.layout.simple_spinner_dropdown_item)
    }

    private fun createViewFromResource(convertView: View?, position: Int, parent: ViewGroup, resource: Int): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(resource, parent, false)
        val pairData = getItem(position)
        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = "${pairData?.name}"
        return view
    }
}