package y2;

import A2.AbstractC0317c;
import A2.AbstractC0328n;
import A2.C0318d;
import A2.InterfaceC0323i;
import android.content.Context;
import android.os.Looper;
import java.util.Set;
import x2.C2190d;
import y2.e;
import z2.InterfaceC2301d;
import z2.InterfaceC2307j;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0301a f21411a;

    /* renamed from: b, reason: collision with root package name */
    public final g f21412b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21413c;

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0301a extends e {
        public f a(Context context, Looper looper, C0318d c0318d, Object obj, e.a aVar, e.b bVar) {
            return b(context, looper, c0318d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C0318d c0318d, Object obj, InterfaceC2301d interfaceC2301d, InterfaceC2307j interfaceC2307j) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: y2.a$b */
    public interface b {
    }

    /* renamed from: y2.a$c */
    public static class c {
    }

    /* renamed from: y2.a$d */
    public interface d {
    }

    /* renamed from: y2.a$e */
    public static abstract class e {
    }

    /* renamed from: y2.a$f */
    public interface f extends b {
        boolean a();

        void b(AbstractC0317c.e eVar);

        void c();

        Set e();

        void f(String str);

        boolean g();

        int h();

        boolean i();

        C2190d[] j();

        String k();

        String l();

        boolean m();

        void o(InterfaceC0323i interfaceC0323i, Set set);

        void p(AbstractC0317c.InterfaceC0004c interfaceC0004c);
    }

    /* renamed from: y2.a$g */
    public static final class g extends c {
    }

    public C2270a(String str, AbstractC0301a abstractC0301a, g gVar) {
        AbstractC0328n.j(abstractC0301a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC0328n.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f21413c = str;
        this.f21411a = abstractC0301a;
        this.f21412b = gVar;
    }

    public final AbstractC0301a a() {
        return this.f21411a;
    }

    public final String b() {
        return this.f21413c;
    }
}
