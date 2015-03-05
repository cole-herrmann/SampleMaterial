package com.orca.coleherrmann.samplematerial;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by coleherrmann on 3/3/15.
 */
public class PlaceholderFragment extends android.support.v4.app.Fragment{

    private Button signUp;
    private Button signIn;
    private EditText emailEditText;
    private EditText passwordEditText;

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        signIn = (Button) rootView.findViewById(R.id.submitButton);
        signUp = (Button) rootView.findViewById(R.id.createAccountButton);
        emailEditText = (EditText) rootView.findViewById(R.id.emailEditText);
        passwordEditText = (EditText) rootView.findViewById(R.id.passwordEditText);

        setUpListeners();

        return rootView;
    }

    private void setUpListeners() {

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SignUpActivity.class);
                startActivity(i);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), TabsActivity.class);
                startActivity(i);
            }
        });
    }
}
