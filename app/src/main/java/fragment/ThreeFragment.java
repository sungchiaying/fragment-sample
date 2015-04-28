package fragment;


import michael.fragmentsample.R;

public class ThreeFragment extends BaseFragment {

    @Override
    public BaseFragment getInstance() {
        return new ThreeFragment();
    }

    @Override
    public int getViewResource() {
        return R.layout.fragment_three;
    }

    @Override
    public CharSequence getTitle() {
        return getString(R.string.title_section3);
    }
}
