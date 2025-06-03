package m;

import java.util.concurrent.Executor;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1631a extends d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1631a f17307c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f17308d = new ExecutorC0234a();

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f17309e = new b();

    /* renamed from: a, reason: collision with root package name */
    public d f17310a;

    /* renamed from: b, reason: collision with root package name */
    public d f17311b;

    /* renamed from: m.a$a, reason: collision with other inner class name */
    public static class ExecutorC0234a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1631a.d().c(runnable);
        }
    }

    /* renamed from: m.a$b */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1631a.d().a(runnable);
        }
    }

    public C1631a() {
        C1633c c1633c = new C1633c();
        this.f17311b = c1633c;
        this.f17310a = c1633c;
    }

    public static C1631a d() {
        if (f17307c != null) {
            return f17307c;
        }
        synchronized (C1631a.class) {
            try {
                if (f17307c == null) {
                    f17307c = new C1631a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17307c;
    }

    @Override // m.d
    public void a(Runnable runnable) {
        this.f17310a.a(runnable);
    }

    @Override // m.d
    public boolean b() {
        return this.f17310a.b();
    }

    @Override // m.d
    public void c(Runnable runnable) {
        this.f17310a.c(runnable);
    }
}
