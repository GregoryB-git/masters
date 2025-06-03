package E5;

import E5.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final E5.c f1657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1658b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1659c;

    /* renamed from: d, reason: collision with root package name */
    public final c.InterfaceC0023c f1660d;

    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public final class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0024d f1661a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f1662b = new AtomicReference(null);

        public final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final AtomicBoolean f1664a;

            public a() {
                this.f1664a = new AtomicBoolean(false);
            }

            @Override // E5.d.b
            public void a(Object obj) {
                if (this.f1664a.get() || c.this.f1662b.get() != this) {
                    return;
                }
                d.this.f1657a.d(d.this.f1658b, d.this.f1659c.a(obj));
            }

            @Override // E5.d.b
            public void b(String str, String str2, Object obj) {
                if (this.f1664a.get() || c.this.f1662b.get() != this) {
                    return;
                }
                d.this.f1657a.d(d.this.f1658b, d.this.f1659c.d(str, str2, obj));
            }

            @Override // E5.d.b
            public void c() {
                if (this.f1664a.getAndSet(true) || c.this.f1662b.get() != this) {
                    return;
                }
                d.this.f1657a.d(d.this.f1658b, null);
            }
        }

        public c(InterfaceC0024d interfaceC0024d) {
            this.f1661a = interfaceC0024d;
        }

        @Override // E5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e7 = d.this.f1659c.e(byteBuffer);
            if (e7.f1670a.equals("listen")) {
                d(e7.f1671b, bVar);
            } else if (e7.f1670a.equals("cancel")) {
                c(e7.f1671b, bVar);
            } else {
                bVar.a(null);
            }
        }

        public final void c(Object obj, c.b bVar) {
            ByteBuffer d7;
            if (((b) this.f1662b.getAndSet(null)) != null) {
                try {
                    this.f1661a.a(obj);
                    bVar.a(d.this.f1659c.a(null));
                    return;
                } catch (RuntimeException e7) {
                    AbstractC1995b.c("EventChannel#" + d.this.f1658b, "Failed to close event stream", e7);
                    d7 = d.this.f1659c.d("error", e7.getMessage(), null);
                }
            } else {
                d7 = d.this.f1659c.d("error", "No active stream to cancel", null);
            }
            bVar.a(d7);
        }

        public final void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (((b) this.f1662b.getAndSet(aVar)) != null) {
                try {
                    this.f1661a.a(null);
                } catch (RuntimeException e7) {
                    AbstractC1995b.c("EventChannel#" + d.this.f1658b, "Failed to close existing event stream", e7);
                }
            }
            try {
                this.f1661a.b(obj, aVar);
                bVar.a(d.this.f1659c.a(null));
            } catch (RuntimeException e8) {
                this.f1662b.set(null);
                AbstractC1995b.c("EventChannel#" + d.this.f1658b, "Failed to open event stream", e8);
                bVar.a(d.this.f1659c.d("error", e8.getMessage(), null));
            }
        }
    }

    /* renamed from: E5.d$d, reason: collision with other inner class name */
    public interface InterfaceC0024d {
        void a(Object obj);

        void b(Object obj, b bVar);
    }

    public d(E5.c cVar, String str) {
        this(cVar, str, q.f1685b);
    }

    public void d(InterfaceC0024d interfaceC0024d) {
        if (this.f1660d != null) {
            this.f1657a.h(this.f1658b, interfaceC0024d != null ? new c(interfaceC0024d) : null, this.f1660d);
        } else {
            this.f1657a.c(this.f1658b, interfaceC0024d != null ? new c(interfaceC0024d) : null);
        }
    }

    public d(E5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(E5.c cVar, String str, l lVar, c.InterfaceC0023c interfaceC0023c) {
        this.f1657a = cVar;
        this.f1658b = str;
        this.f1659c = lVar;
        this.f1660d = interfaceC0023c;
    }
}
