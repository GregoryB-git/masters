package aa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f334a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f335b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static i7.a f336c;

    public static void a(Intent intent) {
        synchronized (f335b) {
            if (f336c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f336c.c();
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f335b) {
            if (f336c == null) {
                i7.a aVar = new i7.a(context);
                f336c = aVar;
                synchronized (aVar.f7629a) {
                    aVar.f7634g = true;
                }
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f336c.a(f334a);
            }
            return startService;
        }
    }
}
