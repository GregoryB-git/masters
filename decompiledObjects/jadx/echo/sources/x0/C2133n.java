package x0;

import F0.InterfaceC0378x;
import android.content.Context;
import c1.t;
import i0.g;
import i0.l;
import java.util.HashMap;
import java.util.Map;
import x0.InterfaceC2142x;

/* renamed from: x0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133n implements InterfaceC2142x.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f20793a;

    /* renamed from: b, reason: collision with root package name */
    public g.a f20794b;

    /* renamed from: c, reason: collision with root package name */
    public t.a f20795c;

    /* renamed from: d, reason: collision with root package name */
    public long f20796d;

    /* renamed from: e, reason: collision with root package name */
    public long f20797e;

    /* renamed from: f, reason: collision with root package name */
    public long f20798f;

    /* renamed from: g, reason: collision with root package name */
    public float f20799g;

    /* renamed from: h, reason: collision with root package name */
    public float f20800h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20801i;

    /* renamed from: x0.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0378x f20802a;

        /* renamed from: d, reason: collision with root package name */
        public g.a f20805d;

        /* renamed from: f, reason: collision with root package name */
        public t.a f20807f;

        /* renamed from: b, reason: collision with root package name */
        public final Map f20803b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map f20804c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public boolean f20806e = true;

        public a(InterfaceC0378x interfaceC0378x, t.a aVar) {
            this.f20802a = interfaceC0378x;
            this.f20807f = aVar;
        }

        public void a(g.a aVar) {
            if (aVar != this.f20805d) {
                this.f20805d = aVar;
                this.f20803b.clear();
                this.f20804c.clear();
            }
        }
    }

    public C2133n(Context context, InterfaceC0378x interfaceC0378x) {
        this(new l.a(context), interfaceC0378x);
    }

    public C2133n(g.a aVar, InterfaceC0378x interfaceC0378x) {
        this.f20794b = aVar;
        c1.h hVar = new c1.h();
        this.f20795c = hVar;
        a aVar2 = new a(interfaceC0378x, hVar);
        this.f20793a = aVar2;
        aVar2.a(aVar);
        this.f20796d = -9223372036854775807L;
        this.f20797e = -9223372036854775807L;
        this.f20798f = -9223372036854775807L;
        this.f20799g = -3.4028235E38f;
        this.f20800h = -3.4028235E38f;
        this.f20801i = true;
    }
}
