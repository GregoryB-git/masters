package d0;

import X2.AbstractC0703v;
import X2.AbstractC0704w;
import android.net.Uri;
import android.os.Bundle;
import g0.AbstractC1297a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: d0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198u {

    /* renamed from: i, reason: collision with root package name */
    public static final C1198u f12792i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f12793j = g0.M.w0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12794k = g0.M.w0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12795l = g0.M.w0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12796m = g0.M.w0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12797n = g0.M.w0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f12798o = g0.M.w0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f12799a;

    /* renamed from: b, reason: collision with root package name */
    public final h f12800b;

    /* renamed from: c, reason: collision with root package name */
    public final h f12801c;

    /* renamed from: d, reason: collision with root package name */
    public final g f12802d;

    /* renamed from: e, reason: collision with root package name */
    public final C1200w f12803e;

    /* renamed from: f, reason: collision with root package name */
    public final d f12804f;

    /* renamed from: g, reason: collision with root package name */
    public final e f12805g;

    /* renamed from: h, reason: collision with root package name */
    public final i f12806h;

    /* renamed from: d0.u$b */
    public static final class b {
    }

    /* renamed from: d0.u$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f12807a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f12808b;

        /* renamed from: c, reason: collision with root package name */
        public String f12809c;

        /* renamed from: d, reason: collision with root package name */
        public d.a f12810d;

        /* renamed from: e, reason: collision with root package name */
        public f.a f12811e;

        /* renamed from: f, reason: collision with root package name */
        public List f12812f;

        /* renamed from: g, reason: collision with root package name */
        public String f12813g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC0703v f12814h;

        /* renamed from: i, reason: collision with root package name */
        public Object f12815i;

        /* renamed from: j, reason: collision with root package name */
        public long f12816j;

        /* renamed from: k, reason: collision with root package name */
        public C1200w f12817k;

        /* renamed from: l, reason: collision with root package name */
        public g.a f12818l;

        /* renamed from: m, reason: collision with root package name */
        public i f12819m;

        public c() {
            this.f12810d = new d.a();
            this.f12811e = new f.a();
            this.f12812f = Collections.emptyList();
            this.f12814h = AbstractC0703v.Y();
            this.f12818l = new g.a();
            this.f12819m = i.f12901d;
            this.f12816j = -9223372036854775807L;
        }

        public C1198u a() {
            h hVar;
            AbstractC1297a.f(this.f12811e.f12861b == null || this.f12811e.f12860a != null);
            Uri uri = this.f12808b;
            if (uri != null) {
                hVar = new h(uri, this.f12809c, this.f12811e.f12860a != null ? this.f12811e.i() : null, null, this.f12812f, this.f12813g, this.f12814h, this.f12815i, this.f12816j);
            } else {
                hVar = null;
            }
            String str = this.f12807a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g7 = this.f12810d.g();
            g f7 = this.f12818l.f();
            C1200w c1200w = this.f12817k;
            if (c1200w == null) {
                c1200w = C1200w.f12913H;
            }
            return new C1198u(str2, g7, hVar, f7, c1200w, this.f12819m);
        }

        public c b(String str) {
            this.f12807a = (String) AbstractC1297a.e(str);
            return this;
        }

        public c c(String str) {
            this.f12809c = str;
            return this;
        }

        public c d(Object obj) {
            this.f12815i = obj;
            return this;
        }

        public c e(Uri uri) {
            this.f12808b = uri;
            return this;
        }

        public c(C1198u c1198u) {
            this();
            this.f12810d = c1198u.f12804f.a();
            this.f12807a = c1198u.f12799a;
            this.f12817k = c1198u.f12803e;
            this.f12818l = c1198u.f12802d.a();
            this.f12819m = c1198u.f12806h;
            h hVar = c1198u.f12800b;
            if (hVar != null) {
                this.f12813g = hVar.f12896e;
                this.f12809c = hVar.f12893b;
                this.f12808b = hVar.f12892a;
                this.f12812f = hVar.f12895d;
                this.f12814h = hVar.f12897f;
                this.f12815i = hVar.f12899h;
                f fVar = hVar.f12894c;
                this.f12811e = fVar != null ? fVar.b() : new f.a();
                this.f12816j = hVar.f12900i;
            }
        }
    }

    /* renamed from: d0.u$d */
    public static class d {

        /* renamed from: h, reason: collision with root package name */
        public static final d f12820h = new a().f();

        /* renamed from: i, reason: collision with root package name */
        public static final String f12821i = g0.M.w0(0);

        /* renamed from: j, reason: collision with root package name */
        public static final String f12822j = g0.M.w0(1);

        /* renamed from: k, reason: collision with root package name */
        public static final String f12823k = g0.M.w0(2);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12824l = g0.M.w0(3);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12825m = g0.M.w0(4);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12826n = g0.M.w0(5);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12827o = g0.M.w0(6);

        /* renamed from: a, reason: collision with root package name */
        public final long f12828a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12829b;

        /* renamed from: c, reason: collision with root package name */
        public final long f12830c;

        /* renamed from: d, reason: collision with root package name */
        public final long f12831d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f12832e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12833f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f12834g;

        /* renamed from: d0.u$d$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f12835a;

            /* renamed from: b, reason: collision with root package name */
            public long f12836b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f12837c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f12838d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f12839e;

            public a() {
                this.f12836b = Long.MIN_VALUE;
            }

            public d f() {
                return new d(this);
            }

            public e g() {
                return new e(this);
            }

            public a(d dVar) {
                this.f12835a = dVar.f12829b;
                this.f12836b = dVar.f12831d;
                this.f12837c = dVar.f12832e;
                this.f12838d = dVar.f12833f;
                this.f12839e = dVar.f12834g;
            }
        }

        public d(a aVar) {
            this.f12828a = g0.M.i1(aVar.f12835a);
            this.f12830c = g0.M.i1(aVar.f12836b);
            this.f12829b = aVar.f12835a;
            this.f12831d = aVar.f12836b;
            this.f12832e = aVar.f12837c;
            this.f12833f = aVar.f12838d;
            this.f12834g = aVar.f12839e;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f12829b == dVar.f12829b && this.f12831d == dVar.f12831d && this.f12832e == dVar.f12832e && this.f12833f == dVar.f12833f && this.f12834g == dVar.f12834g;
        }

        public int hashCode() {
            long j7 = this.f12829b;
            int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
            long j8 = this.f12831d;
            return ((((((i7 + ((int) ((j8 >>> 32) ^ j8))) * 31) + (this.f12832e ? 1 : 0)) * 31) + (this.f12833f ? 1 : 0)) * 31) + (this.f12834g ? 1 : 0);
        }
    }

    /* renamed from: d0.u$e */
    public static final class e extends d {

        /* renamed from: p, reason: collision with root package name */
        public static final e f12840p = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: d0.u$f */
    public static final class f {

        /* renamed from: l, reason: collision with root package name */
        public static final String f12841l = g0.M.w0(0);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12842m = g0.M.w0(1);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12843n = g0.M.w0(2);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12844o = g0.M.w0(3);

        /* renamed from: p, reason: collision with root package name */
        public static final String f12845p = g0.M.w0(4);

        /* renamed from: q, reason: collision with root package name */
        public static final String f12846q = g0.M.w0(5);

        /* renamed from: r, reason: collision with root package name */
        public static final String f12847r = g0.M.w0(6);

        /* renamed from: s, reason: collision with root package name */
        public static final String f12848s = g0.M.w0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f12849a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f12850b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f12851c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC0704w f12852d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC0704w f12853e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12854f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f12855g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f12856h;

        /* renamed from: i, reason: collision with root package name */
        public final AbstractC0703v f12857i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC0703v f12858j;

        /* renamed from: k, reason: collision with root package name */
        public final byte[] f12859k;

        public f(a aVar) {
            AbstractC1297a.f((aVar.f12865f && aVar.f12861b == null) ? false : true);
            UUID uuid = (UUID) AbstractC1297a.e(aVar.f12860a);
            this.f12849a = uuid;
            this.f12850b = uuid;
            this.f12851c = aVar.f12861b;
            this.f12852d = aVar.f12862c;
            this.f12853e = aVar.f12862c;
            this.f12854f = aVar.f12863d;
            this.f12856h = aVar.f12865f;
            this.f12855g = aVar.f12864e;
            this.f12857i = aVar.f12866g;
            this.f12858j = aVar.f12866g;
            this.f12859k = aVar.f12867h != null ? Arrays.copyOf(aVar.f12867h, aVar.f12867h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f12859k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f12849a.equals(fVar.f12849a) && g0.M.c(this.f12851c, fVar.f12851c) && g0.M.c(this.f12853e, fVar.f12853e) && this.f12854f == fVar.f12854f && this.f12856h == fVar.f12856h && this.f12855g == fVar.f12855g && this.f12858j.equals(fVar.f12858j) && Arrays.equals(this.f12859k, fVar.f12859k);
        }

        public int hashCode() {
            int hashCode = this.f12849a.hashCode() * 31;
            Uri uri = this.f12851c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f12853e.hashCode()) * 31) + (this.f12854f ? 1 : 0)) * 31) + (this.f12856h ? 1 : 0)) * 31) + (this.f12855g ? 1 : 0)) * 31) + this.f12858j.hashCode()) * 31) + Arrays.hashCode(this.f12859k);
        }

        /* renamed from: d0.u$f$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public UUID f12860a;

            /* renamed from: b, reason: collision with root package name */
            public Uri f12861b;

            /* renamed from: c, reason: collision with root package name */
            public AbstractC0704w f12862c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f12863d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f12864e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f12865f;

            /* renamed from: g, reason: collision with root package name */
            public AbstractC0703v f12866g;

            /* renamed from: h, reason: collision with root package name */
            public byte[] f12867h;

            public a() {
                this.f12862c = AbstractC0704w.j();
                this.f12864e = true;
                this.f12866g = AbstractC0703v.Y();
            }

            public f i() {
                return new f(this);
            }

            public a(f fVar) {
                this.f12860a = fVar.f12849a;
                this.f12861b = fVar.f12851c;
                this.f12862c = fVar.f12853e;
                this.f12863d = fVar.f12854f;
                this.f12864e = fVar.f12855g;
                this.f12865f = fVar.f12856h;
                this.f12866g = fVar.f12858j;
                this.f12867h = fVar.f12859k;
            }
        }
    }

    /* renamed from: d0.u$g */
    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f12868f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        public static final String f12869g = g0.M.w0(0);

        /* renamed from: h, reason: collision with root package name */
        public static final String f12870h = g0.M.w0(1);

        /* renamed from: i, reason: collision with root package name */
        public static final String f12871i = g0.M.w0(2);

        /* renamed from: j, reason: collision with root package name */
        public static final String f12872j = g0.M.w0(3);

        /* renamed from: k, reason: collision with root package name */
        public static final String f12873k = g0.M.w0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f12874a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12875b;

        /* renamed from: c, reason: collision with root package name */
        public final long f12876c;

        /* renamed from: d, reason: collision with root package name */
        public final float f12877d;

        /* renamed from: e, reason: collision with root package name */
        public final float f12878e;

        /* renamed from: d0.u$g$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f12879a;

            /* renamed from: b, reason: collision with root package name */
            public long f12880b;

            /* renamed from: c, reason: collision with root package name */
            public long f12881c;

            /* renamed from: d, reason: collision with root package name */
            public float f12882d;

            /* renamed from: e, reason: collision with root package name */
            public float f12883e;

            public a() {
                this.f12879a = -9223372036854775807L;
                this.f12880b = -9223372036854775807L;
                this.f12881c = -9223372036854775807L;
                this.f12882d = -3.4028235E38f;
                this.f12883e = -3.4028235E38f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j7) {
                this.f12881c = j7;
                return this;
            }

            public a h(float f7) {
                this.f12883e = f7;
                return this;
            }

            public a i(long j7) {
                this.f12880b = j7;
                return this;
            }

            public a j(float f7) {
                this.f12882d = f7;
                return this;
            }

            public a k(long j7) {
                this.f12879a = j7;
                return this;
            }

            public a(g gVar) {
                this.f12879a = gVar.f12874a;
                this.f12880b = gVar.f12875b;
                this.f12881c = gVar.f12876c;
                this.f12882d = gVar.f12877d;
                this.f12883e = gVar.f12878e;
            }
        }

        public g(long j7, long j8, long j9, float f7, float f8) {
            this.f12874a = j7;
            this.f12875b = j8;
            this.f12876c = j9;
            this.f12877d = f7;
            this.f12878e = f8;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f12874a == gVar.f12874a && this.f12875b == gVar.f12875b && this.f12876c == gVar.f12876c && this.f12877d == gVar.f12877d && this.f12878e == gVar.f12878e;
        }

        public int hashCode() {
            long j7 = this.f12874a;
            long j8 = this.f12875b;
            int i7 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f12876c;
            int i8 = (i7 + ((int) ((j9 >>> 32) ^ j9))) * 31;
            float f7 = this.f12877d;
            int floatToIntBits = (i8 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f12878e;
            return floatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }

        public g(a aVar) {
            this(aVar.f12879a, aVar.f12880b, aVar.f12881c, aVar.f12882d, aVar.f12883e);
        }
    }

    /* renamed from: d0.u$h */
    public static final class h {

        /* renamed from: j, reason: collision with root package name */
        public static final String f12884j = g0.M.w0(0);

        /* renamed from: k, reason: collision with root package name */
        public static final String f12885k = g0.M.w0(1);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12886l = g0.M.w0(2);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12887m = g0.M.w0(3);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12888n = g0.M.w0(4);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12889o = g0.M.w0(5);

        /* renamed from: p, reason: collision with root package name */
        public static final String f12890p = g0.M.w0(6);

        /* renamed from: q, reason: collision with root package name */
        public static final String f12891q = g0.M.w0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f12892a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12893b;

        /* renamed from: c, reason: collision with root package name */
        public final f f12894c;

        /* renamed from: d, reason: collision with root package name */
        public final List f12895d;

        /* renamed from: e, reason: collision with root package name */
        public final String f12896e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC0703v f12897f;

        /* renamed from: g, reason: collision with root package name */
        public final List f12898g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f12899h;

        /* renamed from: i, reason: collision with root package name */
        public final long f12900i;

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC0703v abstractC0703v, Object obj, long j7) {
            this.f12892a = uri;
            this.f12893b = AbstractC1203z.t(str);
            this.f12894c = fVar;
            this.f12895d = list;
            this.f12896e = str2;
            this.f12897f = abstractC0703v;
            AbstractC0703v.a M6 = AbstractC0703v.M();
            for (int i7 = 0; i7 < abstractC0703v.size(); i7++) {
                M6.a(((k) abstractC0703v.get(i7)).a().b());
            }
            this.f12898g = M6.k();
            this.f12899h = obj;
            this.f12900i = j7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f12892a.equals(hVar.f12892a) && g0.M.c(this.f12893b, hVar.f12893b) && g0.M.c(this.f12894c, hVar.f12894c) && g0.M.c(null, null) && this.f12895d.equals(hVar.f12895d) && g0.M.c(this.f12896e, hVar.f12896e) && this.f12897f.equals(hVar.f12897f) && g0.M.c(this.f12899h, hVar.f12899h) && g0.M.c(Long.valueOf(this.f12900i), Long.valueOf(hVar.f12900i));
        }

        public int hashCode() {
            int hashCode = this.f12892a.hashCode() * 31;
            String str = this.f12893b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f12894c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f12895d.hashCode()) * 31;
            String str2 = this.f12896e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f12897f.hashCode()) * 31;
            return (int) (((hashCode4 + (this.f12899h != null ? r1.hashCode() : 0)) * 31) + this.f12900i);
        }
    }

    /* renamed from: d0.u$i */
    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f12901d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        public static final String f12902e = g0.M.w0(0);

        /* renamed from: f, reason: collision with root package name */
        public static final String f12903f = g0.M.w0(1);

        /* renamed from: g, reason: collision with root package name */
        public static final String f12904g = g0.M.w0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f12905a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12906b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f12907c;

        /* renamed from: d0.u$i$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f12908a;

            /* renamed from: b, reason: collision with root package name */
            public String f12909b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f12910c;

            public i d() {
                return new i(this);
            }
        }

        public i(a aVar) {
            this.f12905a = aVar.f12908a;
            this.f12906b = aVar.f12909b;
            this.f12907c = aVar.f12910c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (g0.M.c(this.f12905a, iVar.f12905a) && g0.M.c(this.f12906b, iVar.f12906b)) {
                if ((this.f12907c == null) == (iVar.f12907c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f12905a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f12906b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f12907c != null ? 1 : 0);
        }
    }

    /* renamed from: d0.u$j */
    public static final class j extends k {
    }

    /* renamed from: d0.u$k */
    public static class k {

        /* renamed from: d0.u$k$a */
        public static final class a {
            public abstract j b();
        }

        public abstract a a();
    }

    public C1198u(String str, e eVar, h hVar, g gVar, C1200w c1200w, i iVar) {
        this.f12799a = str;
        this.f12800b = hVar;
        this.f12801c = hVar;
        this.f12802d = gVar;
        this.f12803e = c1200w;
        this.f12804f = eVar;
        this.f12805g = eVar;
        this.f12806h = iVar;
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198u)) {
            return false;
        }
        C1198u c1198u = (C1198u) obj;
        return g0.M.c(this.f12799a, c1198u.f12799a) && this.f12804f.equals(c1198u.f12804f) && g0.M.c(this.f12800b, c1198u.f12800b) && g0.M.c(this.f12802d, c1198u.f12802d) && g0.M.c(this.f12803e, c1198u.f12803e) && g0.M.c(this.f12806h, c1198u.f12806h);
    }

    public int hashCode() {
        int hashCode = this.f12799a.hashCode() * 31;
        h hVar = this.f12800b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f12802d.hashCode()) * 31) + this.f12804f.hashCode()) * 31) + this.f12803e.hashCode()) * 31) + this.f12806h.hashCode();
    }
}
