/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.System
 */
package R4;

import R4.x;
import android.os.SystemClock;
import kotlin.jvm.internal.g;
import o6.a;
import o6.c;
import o6.d;

public final class w
implements x {
    public static final a a = new a(null);

    @Override
    public long a() {
        return System.currentTimeMillis() * 1000L;
    }

    @Override
    public long b() {
        a.a a8 = o6.a.p;
        return c.p(SystemClock.elapsedRealtime(), d.r);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

