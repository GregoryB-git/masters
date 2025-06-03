/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.List
 */
package u6;

import V5.e;
import java.util.List;
import p6.B0;
import u6.t;
import u6.w;

public abstract class v {
    public static final w a(Throwable throwable, String string2) {
        if (throwable != null) {
            throw throwable;
        }
        v.d();
        throw new e();
    }

    public static /* synthetic */ w b(Throwable throwable, String string2, int n8, Object object) {
        if ((n8 & 1) != 0) {
            throwable = null;
        }
        if ((n8 & 2) != 0) {
            string2 = null;
        }
        return v.a(throwable, string2);
    }

    public static final boolean c(B0 b02) {
        return b02.H() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final B0 e(t t8, List object) {
        try {
            object = t8.b((List)object);
            return object;
        }
        catch (Throwable throwable) {
            return v.a(throwable, t8.a());
        }
    }
}

