package com.orca.coleherrmann.samplematerial;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by coleherrmann on 3/3/15.
 */
public class SignUpFragment extends Fragment {

    private ImageView profileImageView;
    private ListView signUpCredentialsListView;

    private String[] values = new String[] {"Full Name", "Email", "Password", "Confirm"};

    private ArrayList<String> credentialTitles = new ArrayList<>(Arrays.asList(values));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_signup, container, false);
        profileImageView = (ImageView) rootView.findViewById(R.id.signUpProfileImage);
        signUpCredentialsListView = (ListView) rootView.findViewById(R.id.createAccountList);

        signUpCredentialsListView.setAdapter(new CredentialsAdapter(getActivity(), credentialTitles));

        return rootView;
    }

    public class CredentialsAdapter extends ArrayAdapter<String> {

        public CredentialsAdapter(Context context, ArrayList<String> credentials) {
            super(context, 0, credentials);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            // Check if an existing view is being reused, otherwise inflate the view
            if(convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.credentials_view, null);
            }

            TextView textView = (TextView) convertView.findViewById(R.id.credentialTextView);
            textView.setText(values[position]);

            return convertView;
        }
    }
}
