package cstjean.mobile.ecole;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import cstjean.mobile.ecole.travail.CoursSession;
import cstjean.mobile.ecole.travail.SingletonEcole;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AjoutCoursFragment} factory method to
 * create an instance of this fragment.
 */
public class AjoutCoursFragment extends Fragment {

    private TextInputEditText inputDepartement;
    private TextInputEditText inputNumero;
    private Button btnAjout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen
        View view = inflater.inflate(R.layout.fragment_ajout_cours, container, false);
        inputDepartement = view.findViewById(R.id.input_departement);
        inputNumero = view.findViewById(R.id.input_numero);
        btnAjout = view.findViewById(R.id.btn_ajouter);

        btnAjout.setOnClickListener(v -> {
            String departement = inputDepartement.getText().toString();
            String numero = inputNumero.getText().toString();
            CoursSession cours = new CoursSession(departement, numero);
            SingletonEcole.getInstance().ajouterCoursSession(cours);
            getActivity().finish();
        });
        return view;
    }
}