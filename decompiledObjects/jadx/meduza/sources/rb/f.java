package rb;

import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import rb.e;

/* loaded from: classes.dex */
public final class f {
    public static final e.a a(Throwable th) {
        i.e(th, Constants.EXCEPTION);
        return new e.a(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof e.a) {
            throw ((e.a) obj).f13847a;
        }
    }
}
