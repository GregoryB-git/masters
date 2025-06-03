/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.Object
 *  java.lang.Throwable
 */
package e6;

import V5.a;
import java.io.Closeable;

public abstract class b {
    public static final void a(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
                return;
            }
            catch (Throwable throwable2) {
                a.a(throwable, throwable2);
            }
        }
    }
}

