package E2;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class r {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
