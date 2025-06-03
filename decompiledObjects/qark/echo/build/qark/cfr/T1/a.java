/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package T1;

import Q1.b;
import Q1.c;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a {
    public static final a a = new a();
    public static final Set b = Collections.newSetFromMap((Map)new WeakHashMap());
    public static boolean c;

    public static final void a() {
        c = true;
    }

    public static final void b(Throwable throwable, Object object) {
        Intrinsics.checkNotNullParameter(object, "o");
        if (!c) {
            return;
        }
        b.add(object);
        if (B.p()) {
            b.c(throwable);
            object = c.a.a;
            c.a.b(throwable, c.c.s).g();
        }
        a.e(throwable);
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object object) {
        Intrinsics.checkNotNullParameter(object, "o");
        return b.contains(object);
    }

    public static final void e(final Throwable throwable) {
        if (a.c()) {
            new Handler(Looper.getMainLooper()).post(new Runnable(){

                public void run() {
                    throw new RuntimeException(throwable);
                }
            });
        }
    }

}

