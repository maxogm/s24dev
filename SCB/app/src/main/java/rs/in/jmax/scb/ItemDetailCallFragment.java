package rs.in.jmax.scb;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import rs.in.jmax.scb.data.SCBContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link rs.in.jmax.scb.ItemListActivity}
 * in two-pane mode (on tablets) or a {@link rs.in.jmax.scb.ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailCallFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private SCBContent.Apartman mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailCallFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = SCBContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_call_btn, container, false);
        if (mItem != null && !mItem.ownerPhone.equalsIgnoreCase("N/A")) {
            if (!mItem.ownerPhone.equalsIgnoreCase("N/A")) {
                Button callBtn = ((Button)rootView.findViewById(R.id.callBtn));
                if (callBtn != null) {
                    callBtn.setEnabled(true);
                    callBtn.setOnClickListener( new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent myIntent = new Intent(Intent.ACTION_CALL);
                            String phNum = "tel:" + mItem.ownerPhone;
                            myIntent.setData(Uri.parse(phNum));
                            startActivity( myIntent ) ;
                        }
                    });
                }
            }
        }
        return rootView;
    }
}
