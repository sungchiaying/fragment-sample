package factory;

import fragment.BaseFragment;
import fragment.OneFragment;
import fragment.ThreeFragment;
import fragment.TwoFragment;

/**
 * Created by Michael on 2014/12/31.
 */
public class BaseFragmentFactory implements IFragmentFactory {
    @Override
    public BaseFragment createBaseFragment(int section) {
        switch (section) {
            case 1:
                return new OneFragment().newInstance();
            case 2:
                return new TwoFragment().newInstance();
            case 3:
                return new ThreeFragment().newInstance();
            default:
                return null;
        }
    }
}
