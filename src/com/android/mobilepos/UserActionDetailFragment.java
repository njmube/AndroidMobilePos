package com.android.mobilepos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.mobilepos.util.UserActionItems;

/**
 * A fragment representing a single UserAction detail screen. This fragment is
 * either contained in a {@link MainActivity} in two-pane mode (on
 * tablets) or a {@link UserActionDetailActivity} on handsets.
 */
public class UserActionDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public UserActionDetailFragment() {
	}
	private String mUserAction ;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mUserAction = getArguments().getString(ARG_ITEM_ID);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_useraction_detail,
				container, false);
		if( mUserAction.equals(UserActionItems.MENU.getDisplayName())){
			MenuTabFragment menuFragment = MenuTabFragment.getInstance();
			FragmentManager manager = getFragmentManager();
			FragmentTransaction transaction = manager.beginTransaction();
			transaction.replace(R.id.useraction_detail, menuFragment).commit();
			
			
		}else if( mUserAction.equals(UserActionItems.ADMIN.getDisplayName())){
			
		}else if( mUserAction.equals(UserActionItems.CHEF_VIEW.getDisplayName())){
			
		}
		else{
			
		}
		return rootView;
	}
}
