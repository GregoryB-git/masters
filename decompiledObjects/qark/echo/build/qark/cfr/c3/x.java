/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 *  java.util.concurrent.atomic.AtomicReference
 *  java.util.logging.Logger
 */
package c3;

import c3.g;
import c3.h;
import c3.j;
import c3.l;
import c3.v;
import c3.w;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k3.d;
import p3.A;
import p3.y;

public abstract class x {
    public static final Logger a = Logger.getLogger((String)x.class.getName());
    public static final AtomicReference b = new AtomicReference((Object)new j());
    public static final ConcurrentMap c = new ConcurrentHashMap();
    public static final ConcurrentMap d = new ConcurrentHashMap();
    public static final ConcurrentMap e = new ConcurrentHashMap();
    public static final ConcurrentMap f = new ConcurrentHashMap();

    public static b a(d d8) {
        return new b(){};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void b(String var0, Map var1_2, boolean var2_3) {
        // MONITORENTER : c3.x.class
        if (!var2_3) ** GOTO lbl10
        var3_4 = x.d;
        if (var3_4.containsKey((Object)var0) && !((Boolean)var3_4.get((Object)var0)).booleanValue()) {
            var1_2 = new StringBuilder();
            var1_2.append("New keys are already disallowed for key type ");
            var1_2.append(var0);
            throw new GeneralSecurityException(var1_2.toString());
        }
lbl10: // 3 sources:
        if (var2_3 == false) return;
        if (((j)x.b.get()).j(var0)) {
            var3_4 = var1_2.entrySet().iterator();
            do {
                if (var3_4.hasNext() == false) return;
            } while (x.f.containsKey((var1_2 = (Map.Entry)var3_4.next()).getKey()));
            var3_4 = new StringBuilder();
            var3_4.append("Attempted to register a new key template ");
            var3_4.append((String)var1_2.getKey());
            var3_4.append(" from an existing key manager of type ");
            var3_4.append(var0);
            throw new GeneralSecurityException(var3_4.toString());
        }
        var1_2 = var1_2.entrySet().iterator();
        do {
            if (var1_2.hasNext() == false) return;
        } while (!x.f.containsKey((var0 = (Map.Entry)var1_2.next()).getKey()));
        var1_2 = new StringBuilder();
        var1_2.append("Attempted overwrite of a registered key template ");
        var1_2.append((String)var0.getKey());
        throw new GeneralSecurityException(var1_2.toString());
    }

    public static Object c(g g8, Class class_) {
        return k3.h.c().b(g8, class_);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class d(Class class_) {
        try {
            return k3.h.c().a(class_);
        }
        catch (GeneralSecurityException generalSecurityException) {
            return null;
        }
    }

    public static Object e(String string2, com.google.crypto.tink.shaded.protobuf.h h8, Class class_) {
        return ((j)b.get()).c(string2, class_).a(h8);
    }

    public static Object f(String string2, byte[] arrby, Class class_) {
        return x.e(string2, com.google.crypto.tink.shaded.protobuf.h.i(arrby), class_);
    }

    public static Object g(y y8, Class class_) {
        return x.e(y8.a0(), y8.b0(), class_);
    }

    public static h h(String string2) {
        return ((j)b.get()).f(string2);
    }

    public static Map i() {
        synchronized (x.class) {
            Map map = Collections.unmodifiableMap((Map)f);
            return map;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static O j(A a8) {
        synchronized (x.class) {
            h h8;
            Throwable throwable2;
            block4 : {
                try {
                    h8 = x.h(a8.a0());
                    if (!((Boolean)d.get((Object)a8.a0())).booleanValue()) break block4;
                    return h8.b(a8.b0());
                }
                catch (Throwable throwable2) {}
            }
            h8 = new StringBuilder();
            h8.append("newKey-operation not permitted for key type ");
            h8.append(a8.a0());
            throw new GeneralSecurityException(h8.toString());
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static y k(A a8) {
        synchronized (x.class) {
            h h8;
            Throwable throwable2;
            block4 : {
                try {
                    h8 = x.h(a8.a0());
                    if (!((Boolean)d.get((Object)a8.a0())).booleanValue()) break block4;
                    return h8.c(a8.b0());
                }
                catch (Throwable throwable2) {}
            }
            h8 = new StringBuilder();
            h8.append("newKey-operation not permitted for key type ");
            h8.append(a8.a0());
            throw new GeneralSecurityException(h8.toString());
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l(d d8, boolean bl) {
        synchronized (x.class) {
            if (d8 != null) {
                AtomicReference atomicReference = b;
                j j8 = new j((j)atomicReference.get());
                j8.g(d8);
                String string2 = d8.d();
                Map map = bl ? d8.f().c() : Collections.emptyMap();
                x.b(string2, map, bl);
                if (!((j)atomicReference.get()).j(string2)) {
                    c.put((Object)string2, (Object)x.a(d8));
                    if (bl) {
                        x.m(string2, d8.f().c());
                    }
                }
                d.put((Object)string2, (Object)bl);
                atomicReference.set((Object)j8);
                return;
            }
            try {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void m(String string2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f.put((Object)((String)entry.getKey()), (Object)l.a(string2, ((O)((d.a.a)entry.getValue()).a).f(), ((d.a.a)entry.getValue()).b));
        }
    }

    public static void n(w w8) {
        synchronized (x.class) {
            k3.h.c().e(w8);
            return;
        }
    }

    public static Object o(v v8, Class class_) {
        return k3.h.c().f(v8, class_);
    }

    public static interface b {
    }

}

