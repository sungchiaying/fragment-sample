package fragment;

import michael.fragmentsample.R;

public class TwoFragment extends BaseFragment {

    @Override
    public BaseFragment getInstance() {
        return new TwoFragment();
    }

    @Override
    public int getViewResource() {
        return R.layout.fragment_two;
    }

    @Override
    public CharSequence getTitle() {
        return getString(R.string.title_section2);
    }
}
