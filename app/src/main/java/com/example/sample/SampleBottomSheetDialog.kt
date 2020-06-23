package com.example.sample

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.dialog_sample.*

class SampleBottomSheetDialog : DialogFragment() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.DialogSampleStyle)
    }
    
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), theme).apply {
            val rootView = inflate(context, R.layout.dialog_sample, null)
            setContentView(rootView)
            input.requestFocus()
            val bottomSheet = findViewById<FrameLayout>(R.id.design_bottom_sheet)
            bottomSheet?.let {
                val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            }
        }
    }
}
