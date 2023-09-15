package com.mircontapp.sorteggio.presentation.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mircontapp.sorteggio.databinding.FragmentNotificationsBinding
import com.mircontapp.sorteggio.presentation.dashboard.DashboardViewModel
import com.mircontapp.sorteggio.presentation.home.HomeViewModel

class NotificationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "Dashboard.")
            }
        }
    }
}