package u6;

import java.util.List;
import p6.B0;

/* loaded from: classes.dex */
public abstract class v {
    public static final w a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new V5.e();
    }

    public static /* synthetic */ w b(Throwable th, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            th = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(B0 b02) {
        return b02.H() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final B0 e(t tVar, List list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
