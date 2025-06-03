/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package D3;

import D3.g;
import E3.f;
import H3.s;

public abstract class h {
    public static void a(Throwable throwable) {
        if (throwable == null) {
            f.f().k("A null value was passed to recordFatalException. Ignoring.");
            return;
        }
        g.d().a.p(throwable);
    }

    public static void b(String string2) {
        g.d().a.w("com.crashlytics.flutter.build-id.0", string2);
    }
}

