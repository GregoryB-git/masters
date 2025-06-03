/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Throwable
 */
package G2;

import G2.c;
import android.content.Context;

public class d {
    public static d b = new d();
    public c a = null;

    public static c a(Context context) {
        return b.b(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c b(Context object) {
        synchronized (this) {
            try {
                if (this.a != null) return this.a;
                Object object2 = object;
                if (object.getApplicationContext() != null) {
                    object2 = object.getApplicationContext();
                }
                this.a = new c((Context)object2);
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

