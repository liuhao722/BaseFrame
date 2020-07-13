package yunzhe.plugin.baseframelib.managers;

import android.app.Activity;

import java.lang.ref.WeakReference;
import java.util.LinkedList;

/**
 * activity 管理器
 */
public class ActivityStore {
    private static LinkedList<WeakReference<Activity>> activityList;
    private static LinkedList<WeakReference<Activity>> registerLoginActivityList;

    static {
        activityList = new LinkedList<>();
        registerLoginActivityList = new LinkedList<>();
    }

    public static void finishAllList() {
        finishAll();
        finishAllRegisterLoginActivities();
    }

    /**
     * 添加Activity 到容器中
     */
    public static void addActivity(Activity activity) {
        activityList.add(new WeakReference<>(activity));
    }

    /**
     * 删除activity
     */
    public static void removeActivity(Activity activity) {
        activityList.remove(new WeakReference<>(activity));
    }

    /**
     * 添加注册登录的activity
     */
    public static void addRegisterLoginActivity(Activity activity) {
        registerLoginActivityList.add(new WeakReference<>(activity));
    }

    /**
     * 删除注册登录的activity
     */
    public static void removeRegisterLoginActivity(Activity activity) {
        registerLoginActivityList.remove(new WeakReference<>(activity));
    }

    public static boolean hasRunning() {
        return activityList.size() > 0;
    }

    // 遍历所有Activity 并finish
    public static void finishAll() {
        finishAll(activityList);
    }

    public static void finishAllRegisterLoginActivities() {
        finishAll(registerLoginActivityList);
    }

    /**
     * 遍历所有注册登录Activity 并finish
     */
    public static void finishAll(final LinkedList<WeakReference<Activity>> activityList) {
        for (WeakReference<Activity> weak : activityList) {
            if (weak.get() != null) {
                weak.get().finish();
            }
        }
        activityList.clear();
    }

    /**
     * 获取最顶部的Activity；
     */
    public static Activity getTopActivity() {
        return activityList.get(activityList.size() - 1).get();
    }

    /**
     * 只保留4个tab
     */
    public static void clearTop() {
//		for (WeakReference<Activity> weak : activityList) {
//			if (weak.get() != null) {
//				if (!weak.get().getClass().getSimpleName().equals(MainActivityGroup.class.getSimpleName())
//						&& !weak.get().getClass().getSimpleName().equals(MessageActivity.class.getSimpleName())){
//					weak.get().finish();
//				}
//			}
//
//		}
    }

}
