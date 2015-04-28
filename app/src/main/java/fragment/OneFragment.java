package fragment;

import michael.fragmentsample.R;

public class OneFragment extends BaseFragment {

    @Override
    public BaseFragment getInstance() {
        return new OneFragment();
    }

    @Override
    public int getViewResource() {
        return R.layout.fragment_one;
    }

    @Override
    public CharSequence getTitle() {
        return getString(R.string.title_section1);
    }
}
