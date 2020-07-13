package yunzhe.plugin.baseframelib.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gyf.immersionbar.ImmersionBar;

import yunzhe.plugin.baseframelib.R;


public abstract class YZBaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        initTintBar(isDarkStatusBar());
        super.onCreate(savedInstanceState);

        initViewDataBinding();

        //  初始化一些自定义的数据loading界面 后期自行实现
        initBaseLoadingDialog();

        initExtraIntent(getIntent());

        initUrl();

        initView();

        initAdapter();

        initListener();

        requestData();
    }

    protected abstract void initViewDataBinding();

    public void requestData() {
    }

    public void initListener() {
    }

    public void initAdapter() {
    }

    protected abstract void initView();

    public void initUrl() {
    }

    public void initExtraIntent(Intent intent) {
    }


    public void initBaseLoadingDialog() {
    }

    /**
     * 动态的实现该方法进行修改顶部bar色值
     *
     * @return true为黑色bar false为白色的字体，默认黑色
     * @default 默认为true 黑色
     */
    protected boolean isDarkStatusBar() {
        return true;
    }

    /**
     * 初始化状态栏
     */
    public void initTintBar(boolean isDark) {
        ImmersionBar.with(this).keyboardEnable(true)
//                .fitsSystemWindows(true)                                                          //使用该属性必须指定状态栏的颜色，不然状态栏透明，很难看
                .statusBarColor(R.color.color_transparent_10)
                .statusBarDarkFont(isDark)                                                          //状态栏字体是深色，不写默认为亮色
                .init();                                                                            //状态栏和导航init();

    }

}
