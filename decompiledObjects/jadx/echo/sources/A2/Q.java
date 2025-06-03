package A2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f389a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f390b;

    /* renamed from: c, reason: collision with root package name */
    public static String f391c;

    /* renamed from: d, reason: collision with root package name */
    public static int f392d;

    public static int a(Context context) {
        b(context);
        return f392d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (f389a) {
            try {
                if (f390b) {
                    return;
                }
                f390b = true;
                try {
                    bundle = G2.d.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e7);
                }
                if (bundle == null) {
                    return;
                }
                f391c = bundle.getString("com.google.app.id");
                f392d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
