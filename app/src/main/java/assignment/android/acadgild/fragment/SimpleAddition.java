package assignment.android.acadgild.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleAddition extends Fragment  implements View.OnClickListener{


    EditText editText;
    TextView textView;
    Button btnSubmit;


    public SimpleAddition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_show, container, false);
        btnSubmit = (Button) myView.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        return myView;
        //return inflater.inflate(R.layout.fragment_show, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText=(EditText)view.findViewById(R.id.editTextDisplay);
        textView=(TextView)view.findViewById(R.id.textViewDisplay);
        btnSubmit=(Button)view.findViewById(R.id.btnSubmit);
    }

    @Override
    public void onClick(View view) {

        textView.setText(editText.getText().toString());
    }
}
