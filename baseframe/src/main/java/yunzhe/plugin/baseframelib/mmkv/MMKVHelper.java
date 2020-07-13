package yunzhe.plugin.baseframelib.mmkv;

import android.content.Context;

import com.tencent.mmkv.MMKV;

/**
 * MMKV辅助类
 */
public class MMKVHelper {
    public static void initMMKV(Context context) {
        String rootDir = MMKV.initialize(context);
        System.out.println("mmkv root: " + rootDir);
    }

    /**
     * 使用方法：如下
     */
    private void methodOfUse() {

        MMKV kv = MMKV.defaultMMKV();

        kv.encode("name", "刘一刀");
        String str = kv.decodeString("name");

        kv.encode("isMale", true);
        boolean isMale = kv.decodeBool("isMale");

        kv.encode("age", 18);
        int age = kv.decodeInt("age");

        // ... 相关存储的方式、以此类推
    }
}
