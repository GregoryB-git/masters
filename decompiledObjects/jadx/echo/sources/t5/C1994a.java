package t5;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import x5.InterfaceC2220a;
import y5.f;

/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1994a {

    /* renamed from: d, reason: collision with root package name */
    public static C1994a f19589d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19590e;

    /* renamed from: a, reason: collision with root package name */
    public f f19591a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterJNI.c f19592b;

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f19593c;

    /* renamed from: t5.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public f f19594a;

        /* renamed from: b, reason: collision with root package name */
        public FlutterJNI.c f19595b;

        /* renamed from: c, reason: collision with root package name */
        public ExecutorService f19596c;

        /* renamed from: t5.a$b$a, reason: collision with other inner class name */
        public class ThreadFactoryC0272a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            public int f19597a;

            public ThreadFactoryC0272a() {
                this.f19597a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i7 = this.f19597a;
                this.f19597a = i7 + 1;
                sb.append(i7);
                thread.setName(sb.toString());
                return thread;
            }
        }

        public C1994a a() {
            b();
            return new C1994a(this.f19594a, null, this.f19595b, this.f19596c);
        }

        public final void b() {
            if (this.f19595b == null) {
                this.f19595b = new FlutterJNI.c();
            }
            if (this.f19596c == null) {
                this.f19596c = Executors.newCachedThreadPool(new ThreadFactoryC0272a());
            }
            if (this.f19594a == null) {
                this.f19594a = new f(this.f19595b.a(), this.f19596c);
            }
        }
    }

    public C1994a(f fVar, InterfaceC2220a interfaceC2220a, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f19591a = fVar;
        this.f19592b = cVar;
        this.f19593c = executorService;
    }

    public static C1994a e() {
        f19590e = true;
        if (f19589d == null) {
            f19589d = new b().a();
        }
        return f19589d;
    }

    public InterfaceC2220a a() {
        return null;
    }

    public ExecutorService b() {
        return this.f19593c;
    }

    public f c() {
        return this.f19591a;
    }

    public FlutterJNI.c d() {
        return this.f19592b;
    }
}
