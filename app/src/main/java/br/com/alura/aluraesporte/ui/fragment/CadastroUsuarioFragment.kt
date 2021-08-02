package br.com.alura.aluraesporte.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.alura.aluraesporte.R
import br.com.alura.aluraesporte.ui.viewmodel.ComponentesVisuais
import br.com.alura.aluraesporte.ui.viewmodel.EstadoAparenciaAppViewModel
import kotlinx.android.synthetic.main.fragment_cadastro_usuario.*
import kotlinx.android.synthetic.main.fragment_login.*
import org.koin.android.viewmodel.ext.android.sharedViewModel


class CadastroUsuarioFragment : Fragment() {

    private val controlador by lazy {
        findNavController()
    }

    private val estadoAppViewModel: EstadoAparenciaAppViewModel by sharedViewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cadastro_usuario, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        botao_cadastrar.setOnClickListener {
            controlador.popBackStack()
        }

        estadoAppViewModel.temComponentes = ComponentesVisuais()
    }

}