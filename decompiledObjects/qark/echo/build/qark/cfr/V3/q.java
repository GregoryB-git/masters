/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package V3;

import Q3.h;
import V3.f;
import V3.m;
import V3.p;
import java.util.HashMap;
import java.util.Map;

public class q {
    public static final q b = new q();
    public final Map a = new HashMap();

    public static m b(f f8, p p8, h h8) {
        return b.a(f8, p8, h8);
    }

    public static void c(m m8) {
        m8.i0(new Runnable(){

            public void run() {
                m.this.P();
            }
        });
    }

    public static void d(m m8) {
        m8.i0(new Runnable(){

            public void run() {
                m.this.f0();
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m a(f object, p p8, h h8) {
        object.k();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://");
        stringBuilder.append(p8.a);
        stringBuilder.append("/");
        stringBuilder.append(p8.c);
        String string2 = stringBuilder.toString();
        stringBuilder = this.a;
        synchronized (stringBuilder) {
            try {
                HashMap hashMap;
                if (!this.a.containsKey(object)) {
                    hashMap = new HashMap();
                    this.a.put(object, (Object)hashMap);
                }
                if (!(hashMap = (Map)this.a.get(object)).containsKey((Object)string2)) {
                    object = new m(p8, (f)object, h8);
                    hashMap.put((Object)string2, object);
                    return object;
                }
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

}

