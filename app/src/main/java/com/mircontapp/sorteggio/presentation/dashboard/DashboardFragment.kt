package com.mircontapp.sorteggio.presentation.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mircontapp.sorteggio.databinding.FragmentDashboardBinding
import com.mircontapp.sorteggio.presentation.home.HomeViewModel


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "Dashboard.")
            }
        }
    }
}