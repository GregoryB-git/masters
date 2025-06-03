// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

public final class e0
{
    public static WeakReference d;
    public final SharedPreferences a;
    public a0 b;
    public final Executor c;
    
    public e0(final SharedPreferences a, final Executor c) {
        this.c = c;
        this.a = a;
    }
    
    public static e0 b(final Context context, final Executor executor) {
        while (true) {
            // monitorenter(e0.class)
            while (true) {
                Label_0073: {
                    while (true) {
                        try {
                            final WeakReference d = e0.d;
                            if (d != null) {
                                final e0 e0 = d.get();
                                e0 referent = e0;
                                if (e0 == null) {
                                    referent = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                                    referent.d();
                                    com.google.firebase.messaging.e0.d = new WeakReference(referent);
                                }
                                // monitorexit(e0.class)
                                return referent;
                            }
                            break Label_0073;
                            // monitorexit(e0.class)
                            throw context;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final e0 e0 = null;
                continue;
            }
        }
    }
    
    public boolean a(final d0 d0) {
        synchronized (this) {
            return this.b.b(d0.e());
        }
    }
    
    public d0 c() {
        synchronized (this) {
            return d0.a(this.b.f());
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.b = a0.d(this.a, "topic_operation_queue", ",", this.c);
        }
    }
    
    public boolean e(final d0 d0) {
        synchronized (this) {
            return this.b.g(d0.e());
        }
    }
}
