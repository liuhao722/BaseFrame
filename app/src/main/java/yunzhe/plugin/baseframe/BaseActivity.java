package yunzhe.plugin.baseframe;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import yunzhe.plugin.baseframelib.base.YZBaseActivity;

public abstract class BaseActivity<X extends ViewDataBinding> extends YZBaseActivity {
    protected X binding;

    @Override
    protected void initViewDataBinding() {
        binding = DataBindingUtil.setContentView(this, setLayoutId());
    }

    protected abstract int setLayoutId();
}
