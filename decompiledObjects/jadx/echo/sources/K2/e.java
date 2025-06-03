package K2;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class e {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
