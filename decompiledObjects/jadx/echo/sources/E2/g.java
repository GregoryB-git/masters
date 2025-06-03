package E2;

import A2.AbstractC0328n;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1599a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC0328n.i(context);
            AbstractC0328n.i(th);
            return false;
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            return false;
        }
    }
}
