/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  java.util.concurrent.ScheduledExecutorService
 */
package Q4;

import Q4.e;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import s4.i;

public class m {
    public final Set a;
    public final com.google.firebase.remoteconfig.internal.e b;
    public final c c;
    public final s3.e d;
    public final i e;
    public final e f;
    public final Context g;
    public final String h;
    public final d i;
    public final ScheduledExecutorService j;

    public m(s3.e e8, i i8, c c8, e e9, Context context, String string2, d d8, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new com.google.firebase.remoteconfig.internal.e(e8, i8, c8, e9, context, string2, (Set)linkedHashSet, d8, scheduledExecutorService);
        this.d = e8;
        this.c = c8;
        this.e = i8;
        this.f = e9;
        this.g = context;
        this.h = string2;
        this.i = d8;
        this.j = scheduledExecutorService;
    }

    public P4.d b(P4.c object) {
        synchronized (this) {
            this.a.add(object);
            this.c();
            object = new a((P4.c)object);
            return object;
        }
    }

    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (this.a.isEmpty()) break block3;
                        this.b.C();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void d(P4.c c8) {
        synchronized (this) {
            this.a.remove((Object)c8);
            return;
        }
    }

    public void e(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        this.b.z(bl);
                        if (bl) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.c();
                }
                return;
            }
            throw throwable2;
        }
    }

    public class a
    implements P4.d {
        public final P4.c a;

        public a(P4.c c8) {
            this.a = c8;
        }

        @Override
        public void remove() {
            m.this.d(this.a);
        }
    }

}

