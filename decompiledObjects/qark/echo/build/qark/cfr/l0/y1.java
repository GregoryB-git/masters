/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package l0;

import android.media.metrics.LogSessionId;
import g0.M;
import java.util.Objects;
import k0.g0;

public final class y1 {
    public static final y1 d;
    public final String a;
    public final a b;
    public final Object c;

    static {
        y1 y12 = M.a < 31 ? new y1("") : new y1(a.b, "");
        d = y12;
    }

    public y1(LogSessionId logSessionId, String string2) {
        this(new a(logSessionId), string2);
    }

    public y1(String string2) {
        boolean bl = M.a < 31;
        g0.a.f(bl);
        this.a = string2;
        this.b = null;
        this.c = new Object();
    }

    public y1(a a8, String string2) {
        this.b = a8;
        this.a = string2;
        this.c = new Object();
    }

    public LogSessionId a() {
        return ((a)g0.a.e((Object)this.b)).a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y1)) {
            return false;
        }
        object = (y1)object;
        if (Objects.equals((Object)this.a, (Object)object.a) && Objects.equals((Object)this.b, (Object)object.b) && Objects.equals((Object)this.c, (Object)object.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b, this.c});
    }

    public static final class a {
        public static final a b = new a(g0.a());
        public final LogSessionId a;

        public a(LogSessionId logSessionId) {
            this.a = logSessionId;
        }
    }

}

