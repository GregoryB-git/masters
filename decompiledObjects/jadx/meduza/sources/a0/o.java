package a0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public final class o {

    public static class a {
        public static boolean a(Context context) {
            boolean isUserUnlocked;
            isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
            return isUserUnlocked;
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
