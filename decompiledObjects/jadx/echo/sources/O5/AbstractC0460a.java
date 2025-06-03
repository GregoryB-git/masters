package O5;

import android.content.Context;
import android.util.Log;

/* renamed from: O5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0460a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4026a;

    public static Context a() {
        return f4026a;
    }

    public static void b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        f4026a = context;
    }
}
