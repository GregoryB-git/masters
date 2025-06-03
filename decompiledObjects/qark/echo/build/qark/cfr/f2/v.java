/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.Closeable
 *  java.lang.Object
 */
package f2;

import android.content.Context;
import f2.u;
import java.io.Closeable;
import n2.d;

public abstract class v
implements Closeable {
    public abstract d a();

    public abstract u b();

    public void close() {
        this.a().close();
    }

    public static interface a {
        public v a();

        public a b(Context var1);
    }

}

