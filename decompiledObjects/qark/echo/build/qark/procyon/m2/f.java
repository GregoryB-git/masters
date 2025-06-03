// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import java.util.HashMap;
import android.app.job.JobInfo$Builder;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import c2.d;
import java.util.Map;
import p2.a;

public abstract class f
{
    public static a b() {
        return new a();
    }
    
    public static f d(final p2.a a, final Map map) {
        return new m2.b(a, map);
    }
    
    public static f f(final p2.a a) {
        return b().a(d.o, b.a().b(30000L).d(86400000L).a()).a(d.q, b.a().b(1000L).d(86400000L).a()).a(d.p, b.a().b(86400000L).d(86400000L).c(i(c.p)).a()).c(a).b();
    }
    
    public static Set i(final Object... a) {
        return Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(a)));
    }
    
    public final long a(int n, final long n2) {
        --n;
        long n3;
        if (n2 > 1L) {
            n3 = n2;
        }
        else {
            n3 = 2L;
        }
        return (long)(Math.pow(3.0, n) * n2 * Math.max(1.0, Math.log(10000.0) / Math.log((double)(n3 * n))));
    }
    
    public JobInfo$Builder c(final JobInfo$Builder jobInfo$Builder, final d d, final long n, final int n2) {
        jobInfo$Builder.setMinimumLatency(this.g(d, n, n2));
        this.j(jobInfo$Builder, this.h().get(d).c());
        return jobInfo$Builder;
    }
    
    public abstract p2.a e();
    
    public long g(final d d, final long n, final int n2) {
        final long a = this.e().a();
        final b b = this.h().get(d);
        return Math.min(Math.max(this.a(n2, b.b()), n - a), b.d());
    }
    
    public abstract Map h();
    
    public final void j(final JobInfo$Builder jobInfo$Builder, final Set set) {
        if (set.contains(c.o)) {
            jobInfo$Builder.setRequiredNetworkType(2);
        }
        else {
            jobInfo$Builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.q)) {
            jobInfo$Builder.setRequiresCharging(true);
        }
        if (set.contains(c.p)) {
            jobInfo$Builder.setRequiresDeviceIdle(true);
        }
    }
    
    public static class a
    {
        public p2.a a;
        public Map b;
        
        public a() {
            this.b = new HashMap();
        }
        
        public a a(final d d, final b b) {
            this.b.put(d, b);
            return this;
        }
        
        public f b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() >= d.values().length) {
                final Map b = this.b;
                this.b = new HashMap();
                return f.d(this.a, b);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }
        
        public a c(final p2.a a) {
            this.a = a;
            return this;
        }
    }
    
    public abstract static class b
    {
        public static a a() {
            return new m2.c.b().c(Collections.emptySet());
        }
        
        public abstract long b();
        
        public abstract Set c();
        
        public abstract long d();
        
        public abstract static class a
        {
            public abstract b a();
            
            public abstract a b(final long p0);
            
            public abstract a c(final Set p0);
            
            public abstract a d(final long p0);
        }
    }
    
    public enum c
    {
        o("NETWORK_UNMETERED", 0), 
        p("DEVICE_IDLE", 1), 
        q("DEVICE_CHARGING", 2);
        
        public c(final String name, final int ordinal) {
        }
    }
}
