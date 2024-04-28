package com.uteev.mymafias21_fartlouv.presentation.registration

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.uteev.mymafias21_fartlouv.data.dbUsers.MainDb
import com.uteev.mymafias21_fartlouv.databinding.FragmentRegistrationBinding
import com.uteev.mymafias21_fartlouv.domain.PlayersListRepository
import com.uteev.mymafias21_fartlouv.domain.Users
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject

class RegistrationFragment : Fragment() {
    private val viewModel : RegistrationViewModel by inject()
    lateinit var binding : FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.saveButton.setOnClickListener {
            Log.d("TAG", "onViewCreated: ${binding.etLogin.text} ${binding.etName.text}")
            val login = binding.etLogin.text.toString()
            val name = binding.etName.text.toString()
            if (login.isNotEmpty() && name.isNotEmpty()) {
                Thread {
                    viewModel.addNewPlayer(login, name)
                }.start()
                Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()
            }
        }
    }
}