package com.application.chickpea

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import java.util.*
import kotlin.collections.HashSet

class SliderAdapter : PagerAdapter {
    var context : Context
    private lateinit var layoutInflater : LayoutInflater
    constructor(context: Context) {
        this.context = context
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
    override fun getCount(): Int {
        return 0 /*slide_headings.size*/
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view = layoutInflater.inflate(R.layout.activity_cal_k, container, false)
        val eventDays: HashSet<Date> = HashSet()
        eventDays.add(Date())
//        monthGap = pageCount - 1 - position
//        val calendar = Calendar.getInstance()
//        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - monthGap)
//        view.findViewById<CalendarView>(R.id.calendar_view).updateCalendar(eventDays,calendar)
        container.addView(view)
        return view
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}
