package com.application.chickpea

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class CalendarAdapter(context: Context, days: ArrayList<Date>, eventDays: HashSet<Date>, inputMonth: Int) : ArrayAdapter<Date>(context, R.layout.calendar_day_layout, days) {
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private val inputMonth = inputMonth - 1

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val calendar = Calendar.getInstance()
        val date = getItem(position)
        calendar.time = date
        val day = calendar.get(Calendar.DATE)
        val month = calendar.get(Calendar.MONTH)
        val year = calendar.get(Calendar.YEAR)
        val today = Date()
        val calendarToday = Calendar.getInstance()
        calendarToday.time = today
        val eventDays: HashSet<Date> = HashSet()
        eventDays.add(Date())


        if (view == null) {
            view = inflater.inflate(R.layout.calendar_day_layout, parent, false)
        }

        (view as TextView).setTypeface(null, Typeface.NORMAL)
        view.setTextColor(Color.parseColor("#56a6a9"))
        if (month != inputMonth || year != calendarToday.get(Calendar.YEAR)) {
            view.visibility = View.INVISIBLE
        }
        if (month == calendarToday.get(Calendar.MONTH) && year == calendarToday.get(Calendar.YEAR) && day == calendarToday.get(Calendar.DATE)) {

        }
        view.text = calendar.get(Calendar.DATE).toString()
        return view
    }
}
