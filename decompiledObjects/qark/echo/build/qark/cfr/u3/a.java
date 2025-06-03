/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package u3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import r4.b;
import t3.c;

public class a {
    public final Map a = new HashMap();
    public final Context b;
    public final b c;

    public a(Context context, b b8) {
        this.b = context;
        this.c = b8;
    }

    public c a(String string2) {
        return new c(this.b, this.c, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c b(String object) {
        synchronized (this) {
            try {
                if (this.a.containsKey(object)) return (c)this.a.get(object);
                this.a.put(object, (Object)this.a((String)object));
                return (c)this.a.get(object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

