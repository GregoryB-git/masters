package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f11748d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11749a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f11750b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11751c;

    public e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11751c = executor;
        this.f11749a = sharedPreferences;
    }

    public static synchronized e0 b(Context context, Executor executor) {
        e0 e0Var;
        synchronized (e0.class) {
            try {
                WeakReference weakReference = f11748d;
                e0Var = weakReference != null ? (e0) weakReference.get() : null;
                if (e0Var == null) {
                    e0Var = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    e0Var.d();
                    f11748d = new WeakReference(e0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    public synchronized boolean a(d0 d0Var) {
        return this.f11750b.b(d0Var.e());
    }

    public synchronized d0 c() {
        return d0.a(this.f11750b.f());
    }

    public final synchronized void d() {
        this.f11750b = a0.d(this.f11749a, "topic_operation_queue", ",", this.f11751c);
    }

    public synchronized boolean e(d0 d0Var) {
        return this.f11750b.g(d0Var.e());
    }
}
