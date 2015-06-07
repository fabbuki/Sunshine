package app.com.nickaustinlee.nicklee.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    private final String LOG_TAG = DetailActivityFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_detail, container, false);

//        Intent intent = getActivity().getIntent();
//        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
//            String forecastStr = intent.getStringExtra(Intent.EXTRA_TEXT);
//            ((TextView)rootView.findViewById(R.id.detail_text))
//                    .setText(forecastStr);
//            Log.i(LOG_TAG, "This is the extra intent text: " + forecastStr);
//        }

        return rootView;
    }
}
