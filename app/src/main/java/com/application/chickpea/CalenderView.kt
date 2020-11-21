package com.application.chickpea

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.applikeysolutions.cosmocalendar.selection.MultipleSelectionManager
import com.applikeysolutions.cosmocalendar.selection.OnDaySelectedListener
import com.applikeysolutions.cosmocalendar.selection.RangeSelectionManager
import com.applikeysolutions.cosmocalendar.selection.SingleSelectionManager
import kotlinx.android.synthetic.main.calendar_layout.*

class CalenderView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar_layout)

        calendar_view.isShowDaysOfWeekTitle = false
        calendar_view.selectionManager = RangeSelectionManager(OnDaySelectedListener {
            Log.e(" CALENDAR ", "========== setSelectionManager ==========")
            Log.e(" CALENDAR ", "Selected Dates : " + calendar_view.selectedDates.size)
            if (calendar_view.selectedDates.size <= 0) return@OnDaySelectedListener
            Log.e(" CALENDAR ", "Selected Days : " + calendar_view.selectedDays)
        })

    }
}