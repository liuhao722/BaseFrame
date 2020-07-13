package yunzhe.plugin.baseframe;

import android.app.Application;

import yunzhe.plugin.baseframelib.mmkv.MMKVHelper;


public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MMKVHelper.initMMKV(this);

    }
}
