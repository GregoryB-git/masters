/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.w;
import java.util.Collections;
import java.util.Map;

public class o {
    public static boolean b = true;
    public static final Class c = o.c();
    public static volatile o d;
    public static final o e;
    public final Map a = Collections.emptyMap();

    static {
        e = new o(true);
    }

    public o(boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o b() {
        o o8 = d;
        if (o8 != null) {
            return o8;
        }
        synchronized (o.class) {
            try {
                o o9;
                o8 = o9 = d;
                if (o9 == null) {
                    o8 = b ? n.a() : e;
                    d = o8;
                }
                return o8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class c() {
        try {
            return Class.forName((String)"androidx.datastore.preferences.protobuf.Extension");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public w.c a(O o8, int n8) {
        android.support.v4.media.a.a(this.a.get((Object)new a(o8, n8)));
        return null;
    }

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object object, int n8) {
            this.a = object;
            this.b = n8;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof a;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (a)object;
            bl = bl2;
            if (this.a == object.a) {
                bl = bl2;
                if (this.b == object.b) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return System.identityHashCode((Object)this.a) * 65535 + this.b;
        }
    }

}

