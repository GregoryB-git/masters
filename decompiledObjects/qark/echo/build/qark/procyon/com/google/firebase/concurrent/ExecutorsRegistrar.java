// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.concurrent;

import java.util.Arrays;
import C3.y;
import y3.d;
import C3.w;
import B3.h;
import C3.v;
import B3.F;
import y3.a;
import B3.c;
import java.util.List;
import C3.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import C3.B;
import java.util.concurrent.ThreadFactory;
import C3.q;
import android.os.Build$VERSION;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import B3.e;
import C3.u;
import C3.t;
import C3.s;
import r4.b;
import C3.r;
import B3.x;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;

@SuppressLint({ "ThreadPoolCreation" })
public class ExecutorsRegistrar implements ComponentRegistrar
{
    public static final x a;
    public static final x b;
    public static final x c;
    public static final x d;
    
    static {
        a = new x(new r());
        b = new x(new s());
        c = new x(new t());
        d = new x(new u());
    }
    
    public static StrictMode$ThreadPolicy i() {
        final StrictMode$ThreadPolicy$Builder detectNetwork = new StrictMode$ThreadPolicy$Builder().detectNetwork();
        final int sdk_INT = Build$VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (sdk_INT >= 26) {
            q.a(detectNetwork);
        }
        return detectNetwork.penaltyLog().build();
    }
    
    public static ThreadFactory j(final String s, final int n) {
        return new C3.b(s, n, null);
    }
    
    public static ThreadFactory k(final String s, final int n, final StrictMode$ThreadPolicy strictMode$ThreadPolicy) {
        return new C3.b(s, n, strictMode$ThreadPolicy);
    }
    
    public static StrictMode$ThreadPolicy t() {
        return new StrictMode$ThreadPolicy$Builder().detectAll().penaltyLog().build();
    }
    
    public static ScheduledExecutorService u(final ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService)ExecutorsRegistrar.d.get());
    }
    
    @Override
    public List getComponents() {
        return Arrays.asList(B3.c.d(F.a(a.class, ScheduledExecutorService.class), F.a(a.class, ExecutorService.class), F.a(a.class, Executor.class)).f(new v()).d(), B3.c.d(F.a(y3.b.class, ScheduledExecutorService.class), F.a(y3.b.class, ExecutorService.class), F.a(y3.b.class, Executor.class)).f(new w()).d(), B3.c.d(F.a(y3.c.class, ScheduledExecutorService.class), F.a(y3.c.class, ExecutorService.class), F.a(y3.c.class, Executor.class)).f(new C3.x()).d(), B3.c.c(F.a(d.class, Executor.class)).f(new y()).d());
    }
}
