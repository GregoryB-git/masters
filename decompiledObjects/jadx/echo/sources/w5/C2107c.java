package w5;

import E5.c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import t5.AbstractC1995b;
import t5.C1994a;
import w5.C2107c;

/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2107c implements E5.c, InterfaceC2110f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f20422a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f20423b;

    /* renamed from: c, reason: collision with root package name */
    public Map f20424c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20425d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20426e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f20427f;

    /* renamed from: g, reason: collision with root package name */
    public int f20428g;

    /* renamed from: h, reason: collision with root package name */
    public final d f20429h;

    /* renamed from: i, reason: collision with root package name */
    public WeakHashMap f20430i;

    /* renamed from: j, reason: collision with root package name */
    public i f20431j;

    /* renamed from: w5.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f20432a;

        /* renamed from: b, reason: collision with root package name */
        public int f20433b;

        /* renamed from: c, reason: collision with root package name */
        public long f20434c;

        public b(ByteBuffer byteBuffer, int i7, long j7) {
            this.f20432a = byteBuffer;
            this.f20433b = i7;
            this.f20434c = j7;
        }
    }

    /* renamed from: w5.c$c, reason: collision with other inner class name */
    public static class C0290c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f20435a;

        public C0290c(ExecutorService executorService) {
            this.f20435a = executorService;
        }

        @Override // w5.C2107c.d
        public void a(Runnable runnable) {
            this.f20435a.execute(runnable);
        }
    }

    /* renamed from: w5.c$d */
    public interface d {
        void a(Runnable runnable);
    }

    /* renamed from: w5.c$e */
    public static class e implements i {

        /* renamed from: a, reason: collision with root package name */
        public ExecutorService f20436a = C1994a.e().b();

        @Override // w5.C2107c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f20436a) : new C0290c(this.f20436a);
        }
    }

    /* renamed from: w5.c$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f20437a;

        /* renamed from: b, reason: collision with root package name */
        public final d f20438b;

        public f(c.a aVar, d dVar) {
            this.f20437a = aVar;
            this.f20438b = dVar;
        }
    }

    /* renamed from: w5.c$g */
    public static class g implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final FlutterJNI f20439a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20440b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f20441c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i7) {
            this.f20439a = flutterJNI;
            this.f20440b = i7;
        }

        @Override // E5.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f20441c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f20439a.invokePlatformMessageEmptyResponseCallback(this.f20440b);
            } else {
                this.f20439a.invokePlatformMessageResponseCallback(this.f20440b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: w5.c$h */
    public static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f20442a;

        /* renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue f20443b = new ConcurrentLinkedQueue();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f20444c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.f20442a = executorService;
        }

        @Override // w5.C2107c.d
        public void a(Runnable runnable) {
            this.f20443b.add(runnable);
            this.f20442a.execute(new Runnable() { // from class: w5.d
                @Override // java.lang.Runnable
                public final void run() {
                    C2107c.h.this.e();
                }
            });
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final void f() {
            if (this.f20444c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f20443b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f20444c.set(false);
                    if (!this.f20443b.isEmpty()) {
                        this.f20442a.execute(new Runnable() { // from class: w5.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2107c.h.this.f();
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: w5.c$i */
    public interface i {
        d a(c.d dVar);
    }

    /* renamed from: w5.c$j */
    public static class j implements c.InterfaceC0023c {
        public j() {
        }
    }

    public C2107c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    public static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // E5.c
    public c.InterfaceC0023c a(c.d dVar) {
        d a7 = this.f20431j.a(dVar);
        j jVar = new j();
        this.f20430i.put(jVar, a7);
        return jVar;
    }

    @Override // E5.c
    public /* synthetic */ c.InterfaceC0023c b() {
        return E5.b.a(this);
    }

    @Override // E5.c
    public void c(String str, c.a aVar) {
        h(str, aVar, null);
    }

    @Override // E5.c
    public void d(String str, ByteBuffer byteBuffer) {
        AbstractC1995b.f("DartMessenger", "Sending message over channel '" + str + "'");
        f(str, byteBuffer, null);
    }

    @Override // w5.InterfaceC2110f
    public void e(int i7, ByteBuffer byteBuffer) {
        AbstractC1995b.f("DartMessenger", "Received message reply from Dart.");
        c.b bVar = (c.b) this.f20427f.remove(Integer.valueOf(i7));
        if (bVar != null) {
            try {
                AbstractC1995b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e7) {
                k(e7);
            } catch (Exception e8) {
                AbstractC1995b.c("DartMessenger", "Uncaught exception in binary message reply handler", e8);
            }
        }
    }

    @Override // E5.c
    public void f(String str, ByteBuffer byteBuffer, c.b bVar) {
        T5.f i7 = T5.f.i("DartMessenger#send on " + str);
        try {
            AbstractC1995b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i8 = this.f20428g;
            this.f20428g = i8 + 1;
            if (bVar != null) {
                this.f20427f.put(Integer.valueOf(i8), bVar);
            }
            if (byteBuffer == null) {
                this.f20422a.dispatchEmptyPlatformMessage(str, i8);
            } else {
                this.f20422a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i8);
            }
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // w5.InterfaceC2110f
    public void g(String str, ByteBuffer byteBuffer, int i7, long j7) {
        f fVar;
        boolean z7;
        AbstractC1995b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f20425d) {
            try {
                fVar = (f) this.f20423b.get(str);
                z7 = this.f20426e.get() && fVar == null;
                if (z7) {
                    if (!this.f20424c.containsKey(str)) {
                        this.f20424c.put(str, new LinkedList());
                    }
                    ((List) this.f20424c.get(str)).add(new b(byteBuffer, i7, j7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            return;
        }
        j(str, fVar, byteBuffer, i7, j7);
    }

    @Override // E5.c
    public void h(String str, c.a aVar, c.InterfaceC0023c interfaceC0023c) {
        d dVar;
        if (aVar == null) {
            AbstractC1995b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f20425d) {
                this.f20423b.remove(str);
            }
            return;
        }
        if (interfaceC0023c != null) {
            dVar = (d) this.f20430i.get(interfaceC0023c);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        AbstractC1995b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f20425d) {
            try {
                this.f20423b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.f20424c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    j(str, (f) this.f20423b.get(str), bVar.f20432a, bVar.f20433b, bVar.f20434c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i7, final long j7) {
        d dVar = fVar != null ? fVar.f20438b : null;
        T5.f.b("PlatformChannel ScheduleHandler on " + str, i7);
        Runnable runnable = new Runnable() { // from class: w5.b
            @Override // java.lang.Runnable
            public final void run() {
                C2107c.this.m(str, i7, fVar, byteBuffer, j7);
            }
        };
        if (dVar == null) {
            dVar = this.f20429h;
        }
        dVar.a(runnable);
    }

    public final void l(f fVar, ByteBuffer byteBuffer, int i7) {
        if (fVar != null) {
            try {
                AbstractC1995b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f20437a.a(byteBuffer, new g(this.f20422a, i7));
                return;
            } catch (Error e7) {
                k(e7);
                return;
            } catch (Exception e8) {
                AbstractC1995b.c("DartMessenger", "Uncaught exception in binary message listener", e8);
            }
        } else {
            AbstractC1995b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f20422a.invokePlatformMessageEmptyResponseCallback(i7);
    }

    public final /* synthetic */ void m(String str, int i7, f fVar, ByteBuffer byteBuffer, long j7) {
        T5.f.h("PlatformChannel ScheduleHandler on " + str, i7);
        try {
            T5.f i8 = T5.f.i("DartMessenger#handleMessageFromDart on " + str);
            try {
                l(fVar, byteBuffer, i7);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (i8 != null) {
                    i8.close();
                }
            } finally {
            }
        } finally {
            this.f20422a.cleanupMessageData(j7);
        }
    }

    public C2107c(FlutterJNI flutterJNI, i iVar) {
        this.f20423b = new HashMap();
        this.f20424c = new HashMap();
        this.f20425d = new Object();
        this.f20426e = new AtomicBoolean(false);
        this.f20427f = new HashMap();
        this.f20428g = 1;
        this.f20429h = new C2111g();
        this.f20430i = new WeakHashMap();
        this.f20422a = flutterJNI;
        this.f20431j = iVar;
    }
}
