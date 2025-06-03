package E5;

import E5.c;
import java.nio.ByteBuffer;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final E5.c f1646a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1647b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1648c;

    /* renamed from: d, reason: collision with root package name */
    public final c.InterfaceC0023c f1649d;

    public final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final d f1650a;

        /* renamed from: E5.a$b$a, reason: collision with other inner class name */
        public class C0022a implements e {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.b f1652a;

            public C0022a(c.b bVar) {
                this.f1652a = bVar;
            }

            @Override // E5.a.e
            public void a(Object obj) {
                this.f1652a.a(a.this.f1648c.a(obj));
            }
        }

        public b(d dVar) {
            this.f1650a = dVar;
        }

        @Override // E5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f1650a.a(a.this.f1648c.b(byteBuffer), new C0022a(bVar));
            } catch (RuntimeException e7) {
                AbstractC1995b.c("BasicMessageChannel#" + a.this.f1647b, "Failed to handle message", e7);
                bVar.a(null);
            }
        }
    }

    public final class c implements c.b {

        /* renamed from: a, reason: collision with root package name */
        public final e f1654a;

        public c(e eVar) {
            this.f1654a = eVar;
        }

        @Override // E5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f1654a.a(a.this.f1648c.b(byteBuffer));
            } catch (RuntimeException e7) {
                AbstractC1995b.c("BasicMessageChannel#" + a.this.f1647b, "Failed to handle message reply", e7);
            }
        }
    }

    public interface d {
        void a(Object obj, e eVar);
    }

    public interface e {
        void a(Object obj);
    }

    public a(E5.c cVar, String str, i iVar) {
        this(cVar, str, iVar, null);
    }

    public void c(Object obj) {
        d(obj, null);
    }

    public void d(Object obj, e eVar) {
        this.f1646a.f(this.f1647b, this.f1648c.a(obj), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [E5.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [E5.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [E5.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void e(d dVar) {
        if (this.f1649d != null) {
            this.f1646a.h(this.f1647b, dVar != null ? new b(dVar) : null, this.f1649d);
        } else {
            this.f1646a.c(this.f1647b, dVar != null ? new b(dVar) : 0);
        }
    }

    public a(E5.c cVar, String str, i iVar, c.InterfaceC0023c interfaceC0023c) {
        this.f1646a = cVar;
        this.f1647b = str;
        this.f1648c = iVar;
        this.f1649d = interfaceC0023c;
    }
}
