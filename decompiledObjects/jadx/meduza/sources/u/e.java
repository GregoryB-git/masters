package u;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14793b;

    public e(Object obj, Object obj2) {
        this.f14792a = obj;
        this.f14793b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f14797d;
            if (method != null) {
                method.invoke(this.f14792a, this.f14793b, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f14798e.invoke(this.f14792a, this.f14793b, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
