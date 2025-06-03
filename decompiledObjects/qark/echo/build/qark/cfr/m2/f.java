/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Set
 */
package m2;

import android.app.job.JobInfo;
import c2.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m2.c;

public abstract class f {
    public static a b() {
        return new a();
    }

    public static f d(p2.a a8, Map map) {
        return new m2.b(a8, map);
    }

    public static f f(p2.a a8) {
        return f.b().a(d.o, b.a().b(30000L).d(86400000L).a()).a(d.q, b.a().b(1000L).d(86400000L).a()).a(d.p, b.a().b(86400000L).d(86400000L).c(f.i((Object[])new c[]{c.p})).a()).c(a8).b();
    }

    public static /* varargs */ Set i(Object ... arrobject) {
        return Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])arrobject)));
    }

    public final long a(int n8, long l8) {
        long l9 = l8 > 1L ? l8 : 2L;
        double d8 = Math.max((double)1.0, (double)(Math.log((double)10000.0) / Math.log((double)(l9 * (long)(--n8)))));
        return (long)(Math.pow((double)3.0, (double)n8) * (double)l8 * d8);
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d d8, long l8, int n8) {
        builder.setMinimumLatency(this.g(d8, l8, n8));
        this.j(builder, ((b)this.h().get((Object)d8)).c());
        return builder;
    }

    public abstract p2.a e();

    public long g(d object, long l8, int n8) {
        long l9 = this.e().a();
        object = (b)this.h().get(object);
        return Math.min((long)Math.max((long)this.a(n8, object.b()), (long)(l8 - l9)), (long)object.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains((Object)((Object)c.o))) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains((Object)((Object)c.q))) {
            builder.setRequiresCharging(true);
        }
        if (set.contains((Object)((Object)c.p))) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static class a {
        public p2.a a;
        public Map b = new HashMap();

        public a a(d d8, b b8) {
            this.b.put((Object)d8, (Object)b8);
            return this;
        }

        public f b() {
            if (this.a != null) {
                if (this.b.keySet().size() >= d.values().length) {
                    Map map = this.b;
                    this.b = new HashMap();
                    return f.d(this.a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(p2.a a8) {
            this.a = a8;
            return this;
        }
    }

    public static abstract class b {
        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();

        public static abstract class a {
            public abstract b a();

            public abstract a b(long var1);

            public abstract a c(Set var1);

            public abstract a d(long var1);
        }

    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o;
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* synthetic */ c[] r;

        static {
            c c8;
            c c9;
            c c10;
            o = c8 = new c();
            p = c9 = new c();
            q = c10 = new c();
            r = new c[]{c8, c9, c10};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])r.clone();
        }
    }

}

