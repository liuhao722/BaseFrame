package yunzhe.plugin.baseframe;

import yunzhe.plugin.baseframe.bean.UserInfo;
import yunzhe.plugin.baseframe.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        UserInfo info = new UserInfo();
        info.name = "刘浩";
        info.age = "22";
        binding.setInfo(info);
    }

}