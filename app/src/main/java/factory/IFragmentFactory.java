package factory;

import fragment.BaseFragment;

/**
 * Created by Michael on 2015/1/5.
 */
public interface IFragmentFactory {
    BaseFragment createBaseFragment(int section);
}
