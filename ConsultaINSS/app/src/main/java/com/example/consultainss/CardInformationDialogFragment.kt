package com.example.consultainss

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class CardInformationDialogFragment: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            // Get the layout inflater
            val inflater = requireActivity().layoutInflater

            builder.setView(inflater.inflate(R.layout.info_dialog, null))
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}