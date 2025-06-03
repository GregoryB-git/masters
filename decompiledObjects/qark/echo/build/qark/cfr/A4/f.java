/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package A4;

import A4.e;
import B4.a;
import F4.a;

public final class f
implements a.a {
    public static final a a = a.e();

    @Override
    public void a() {
        try {
            e.c();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", new Object[]{illegalStateException});
            return;
        }
    }
}

