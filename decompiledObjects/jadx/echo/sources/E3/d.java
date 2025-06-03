package E3;

import J3.B;
import J3.D;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class d implements E3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final g f1624c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1921a f1625a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1626b = new AtomicReference(null);

    public static final class b implements g {
        public b() {
        }

        @Override // E3.g
        public File a() {
            return null;
        }

        @Override // E3.g
        public File b() {
            return null;
        }

        @Override // E3.g
        public File c() {
            return null;
        }

        @Override // E3.g
        public B.a d() {
            return null;
        }

        @Override // E3.g
        public File e() {
            return null;
        }

        @Override // E3.g
        public File f() {
            return null;
        }

        @Override // E3.g
        public File g() {
            return null;
        }
    }

    public d(InterfaceC1921a interfaceC1921a) {
        this.f1625a = interfaceC1921a;
        interfaceC1921a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: E3.b
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                d.this.g(interfaceC1922b);
            }
        });
    }

    public static /* synthetic */ void h(String str, String str2, long j7, D d7, InterfaceC1922b interfaceC1922b) {
        ((E3.a) interfaceC1922b.get()).c(str, str2, j7, d7);
    }

    @Override // E3.a
    public g a(String str) {
        E3.a aVar = (E3.a) this.f1626b.get();
        return aVar == null ? f1624c : aVar.a(str);
    }

    @Override // E3.a
    public boolean b() {
        E3.a aVar = (E3.a) this.f1626b.get();
        return aVar != null && aVar.b();
    }

    @Override // E3.a
    public void c(final String str, final String str2, final long j7, final D d7) {
        f.f().i("Deferring native open session: " + str);
        this.f1625a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: E3.c
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                d.h(str, str2, j7, d7, interfaceC1922b);
            }
        });
    }

    @Override // E3.a
    public boolean d(String str) {
        E3.a aVar = (E3.a) this.f1626b.get();
        return aVar != null && aVar.d(str);
    }

    public final /* synthetic */ void g(InterfaceC1922b interfaceC1922b) {
        f.f().b("Crashlytics native component now available.");
        this.f1626b.set((E3.a) interfaceC1922b.get());
    }
}
