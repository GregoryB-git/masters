package v3;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o7.t;

/* loaded from: classes.dex */
public final class o0 implements v3.g {

    /* renamed from: o, reason: collision with root package name */
    public static final o0 f15528o = new a().a();

    /* renamed from: p, reason: collision with root package name */
    public static final String f15529p = v5.e0.E(0);

    /* renamed from: q, reason: collision with root package name */
    public static final String f15530q = v5.e0.E(1);

    /* renamed from: r, reason: collision with root package name */
    public static final String f15531r = v5.e0.E(2);

    /* renamed from: s, reason: collision with root package name */
    public static final String f15532s = v5.e0.E(3);
    public static final String t = v5.e0.E(4);

    /* renamed from: u, reason: collision with root package name */
    public static final e0.e f15533u = new e0.e(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f15534a;

    /* renamed from: b, reason: collision with root package name */
    public final g f15535b;

    /* renamed from: c, reason: collision with root package name */
    public final e f15536c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f15537d;

    /* renamed from: e, reason: collision with root package name */
    public final c f15538e;
    public final h f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f15539a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f15540b;

        /* renamed from: c, reason: collision with root package name */
        public String f15541c;

        /* renamed from: g, reason: collision with root package name */
        public String f15544g;

        /* renamed from: i, reason: collision with root package name */
        public Object f15546i;

        /* renamed from: j, reason: collision with root package name */
        public p0 f15547j;

        /* renamed from: d, reason: collision with root package name */
        public b.a f15542d = new b.a();

        /* renamed from: e, reason: collision with root package name */
        public d.a f15543e = new d.a();
        public List<y4.c> f = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        public o7.t<j> f15545h = o7.l0.f12009e;

        /* renamed from: k, reason: collision with root package name */
        public e.a f15548k = new e.a();

        /* renamed from: l, reason: collision with root package name */
        public h f15549l = h.f15601c;

        public final o0 a() {
            g gVar;
            d.a aVar = this.f15543e;
            x6.b.H(aVar.f15574b == null || aVar.f15573a != null);
            Uri uri = this.f15540b;
            if (uri != null) {
                String str = this.f15541c;
                d.a aVar2 = this.f15543e;
                gVar = new g(uri, str, aVar2.f15573a != null ? new d(aVar2) : null, this.f, this.f15544g, this.f15545h, this.f15546i);
            } else {
                gVar = null;
            }
            String str2 = this.f15539a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar3 = this.f15542d;
            aVar3.getClass();
            c cVar = new c(aVar3);
            e.a aVar4 = this.f15548k;
            aVar4.getClass();
            e eVar = new e(aVar4.f15590a, aVar4.f15591b, aVar4.f15592c, aVar4.f15593d, aVar4.f15594e);
            p0 p0Var = this.f15547j;
            if (p0Var == null) {
                p0Var = p0.Q;
            }
            return new o0(str3, cVar, gVar, eVar, p0Var, this.f15549l);
        }
    }

    public static class b implements v3.g {
        public static final c f = new c(new a());

        /* renamed from: o, reason: collision with root package name */
        public static final String f15550o = v5.e0.E(0);

        /* renamed from: p, reason: collision with root package name */
        public static final String f15551p = v5.e0.E(1);

        /* renamed from: q, reason: collision with root package name */
        public static final String f15552q = v5.e0.E(2);

        /* renamed from: r, reason: collision with root package name */
        public static final String f15553r = v5.e0.E(3);

        /* renamed from: s, reason: collision with root package name */
        public static final String f15554s = v5.e0.E(4);
        public static final w3.v t = new w3.v(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f15555a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15556b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15557c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15558d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f15559e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f15560a;

            /* renamed from: b, reason: collision with root package name */
            public long f15561b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f15562c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f15563d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f15564e;

            public a() {
                this.f15561b = Long.MIN_VALUE;
            }

            public a(c cVar) {
                this.f15560a = cVar.f15555a;
                this.f15561b = cVar.f15556b;
                this.f15562c = cVar.f15557c;
                this.f15563d = cVar.f15558d;
                this.f15564e = cVar.f15559e;
            }
        }

        public b(a aVar) {
            this.f15555a = aVar.f15560a;
            this.f15556b = aVar.f15561b;
            this.f15557c = aVar.f15562c;
            this.f15558d = aVar.f15563d;
            this.f15559e = aVar.f15564e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15555a == bVar.f15555a && this.f15556b == bVar.f15556b && this.f15557c == bVar.f15557c && this.f15558d == bVar.f15558d && this.f15559e == bVar.f15559e;
        }

        public final int hashCode() {
            long j10 = this.f15555a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f15556b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f15557c ? 1 : 0)) * 31) + (this.f15558d ? 1 : 0)) * 31) + (this.f15559e ? 1 : 0);
        }
    }

    @Deprecated
    public static final class c extends b {

        /* renamed from: u, reason: collision with root package name */
        public static final c f15565u = new c(new b.a());

        public c(b.a aVar) {
            super(aVar);
        }
    }

    public static final class e implements v3.g {
        public static final e f = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: o, reason: collision with root package name */
        public static final String f15580o = v5.e0.E(0);

        /* renamed from: p, reason: collision with root package name */
        public static final String f15581p = v5.e0.E(1);

        /* renamed from: q, reason: collision with root package name */
        public static final String f15582q = v5.e0.E(2);

        /* renamed from: r, reason: collision with root package name */
        public static final String f15583r = v5.e0.E(3);

        /* renamed from: s, reason: collision with root package name */
        public static final String f15584s = v5.e0.E(4);
        public static final r3.j t = new r3.j(8);

        /* renamed from: a, reason: collision with root package name */
        public final long f15585a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15586b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15587c;

        /* renamed from: d, reason: collision with root package name */
        public final float f15588d;

        /* renamed from: e, reason: collision with root package name */
        public final float f15589e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f15590a;

            /* renamed from: b, reason: collision with root package name */
            public long f15591b;

            /* renamed from: c, reason: collision with root package name */
            public long f15592c;

            /* renamed from: d, reason: collision with root package name */
            public float f15593d;

            /* renamed from: e, reason: collision with root package name */
            public float f15594e;

            public a() {
                this.f15590a = -9223372036854775807L;
                this.f15591b = -9223372036854775807L;
                this.f15592c = -9223372036854775807L;
                this.f15593d = -3.4028235E38f;
                this.f15594e = -3.4028235E38f;
            }

            public a(e eVar) {
                this.f15590a = eVar.f15585a;
                this.f15591b = eVar.f15586b;
                this.f15592c = eVar.f15587c;
                this.f15593d = eVar.f15588d;
                this.f15594e = eVar.f15589e;
            }
        }

        @Deprecated
        public e(long j10, long j11, long j12, float f10, float f11) {
            this.f15585a = j10;
            this.f15586b = j11;
            this.f15587c = j12;
            this.f15588d = f10;
            this.f15589e = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f15585a == eVar.f15585a && this.f15586b == eVar.f15586b && this.f15587c == eVar.f15587c && this.f15588d == eVar.f15588d && this.f15589e == eVar.f15589e;
        }

        public final int hashCode() {
            long j10 = this.f15585a;
            long j11 = this.f15586b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f15587c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f15588d;
            int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f15589e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f15595a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15596b;

        /* renamed from: c, reason: collision with root package name */
        public final d f15597c;

        /* renamed from: d, reason: collision with root package name */
        public final List<y4.c> f15598d;

        /* renamed from: e, reason: collision with root package name */
        public final String f15599e;
        public final o7.t<j> f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f15600g;

        public f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, String str2, o7.t tVar, Object obj) {
            this.f15595a = uri;
            this.f15596b = str;
            this.f15597c = dVar;
            this.f15598d = list;
            this.f15599e = str2;
            this.f = tVar;
            t.b bVar = o7.t.f12050b;
            t.a aVar = new t.a();
            for (int i10 = 0; i10 < tVar.size(); i10++) {
                j jVar = (j) tVar.get(i10);
                jVar.getClass();
                aVar.c(new i(new j.a(jVar)));
            }
            aVar.e();
            this.f15600g = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f15595a.equals(fVar.f15595a) && v5.e0.a(this.f15596b, fVar.f15596b) && v5.e0.a(this.f15597c, fVar.f15597c) && v5.e0.a(null, null) && this.f15598d.equals(fVar.f15598d) && v5.e0.a(this.f15599e, fVar.f15599e) && this.f.equals(fVar.f) && v5.e0.a(this.f15600g, fVar.f15600g);
        }

        public final int hashCode() {
            int hashCode = this.f15595a.hashCode() * 31;
            String str = this.f15596b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f15597c;
            int hashCode3 = (this.f15598d.hashCode() + ((((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + 0) * 31)) * 31;
            String str2 = this.f15599e;
            int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f15600g;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class g extends f {
        public g(Uri uri, String str, d dVar, List list, String str2, o7.t tVar, Object obj) {
            super(uri, str, dVar, list, str2, tVar, obj);
        }
    }

    public static final class h implements v3.g {

        /* renamed from: c, reason: collision with root package name */
        public static final h f15601c = new h(new a());

        /* renamed from: d, reason: collision with root package name */
        public static final String f15602d = v5.e0.E(0);

        /* renamed from: e, reason: collision with root package name */
        public static final String f15603e = v5.e0.E(1);
        public static final String f = v5.e0.E(2);

        /* renamed from: o, reason: collision with root package name */
        public static final e0.d f15604o = new e0.d(6);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f15605a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15606b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f15607a;

            /* renamed from: b, reason: collision with root package name */
            public String f15608b;
        }

        public h(a aVar) {
            this.f15605a = aVar.f15607a;
            this.f15606b = aVar.f15608b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return v5.e0.a(this.f15605a, hVar.f15605a) && v5.e0.a(this.f15606b, hVar.f15606b);
        }

        public final int hashCode() {
            Uri uri = this.f15605a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f15606b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends j {
        public i(j.a aVar) {
            super(aVar);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f15609a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15610b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15611c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15612d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15613e;
        public final String f;

        /* renamed from: g, reason: collision with root package name */
        public final String f15614g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public Uri f15615a;

            /* renamed from: b, reason: collision with root package name */
            public String f15616b;

            /* renamed from: c, reason: collision with root package name */
            public String f15617c;

            /* renamed from: d, reason: collision with root package name */
            public int f15618d;

            /* renamed from: e, reason: collision with root package name */
            public int f15619e;
            public String f;

            /* renamed from: g, reason: collision with root package name */
            public String f15620g;

            public a(j jVar) {
                this.f15615a = jVar.f15609a;
                this.f15616b = jVar.f15610b;
                this.f15617c = jVar.f15611c;
                this.f15618d = jVar.f15612d;
                this.f15619e = jVar.f15613e;
                this.f = jVar.f;
                this.f15620g = jVar.f15614g;
            }
        }

        public j(a aVar) {
            this.f15609a = aVar.f15615a;
            this.f15610b = aVar.f15616b;
            this.f15611c = aVar.f15617c;
            this.f15612d = aVar.f15618d;
            this.f15613e = aVar.f15619e;
            this.f = aVar.f;
            this.f15614g = aVar.f15620g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f15609a.equals(jVar.f15609a) && v5.e0.a(this.f15610b, jVar.f15610b) && v5.e0.a(this.f15611c, jVar.f15611c) && this.f15612d == jVar.f15612d && this.f15613e == jVar.f15613e && v5.e0.a(this.f, jVar.f) && v5.e0.a(this.f15614g, jVar.f15614g);
        }

        public final int hashCode() {
            int hashCode = this.f15609a.hashCode() * 31;
            String str = this.f15610b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15611c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f15612d) * 31) + this.f15613e) * 31;
            String str3 = this.f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f15614g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public o0(String str, c cVar, g gVar, e eVar, p0 p0Var, h hVar) {
        this.f15534a = str;
        this.f15535b = gVar;
        this.f15536c = eVar;
        this.f15537d = p0Var;
        this.f15538e = cVar;
        this.f = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return v5.e0.a(this.f15534a, o0Var.f15534a) && this.f15538e.equals(o0Var.f15538e) && v5.e0.a(this.f15535b, o0Var.f15535b) && v5.e0.a(this.f15536c, o0Var.f15536c) && v5.e0.a(this.f15537d, o0Var.f15537d) && v5.e0.a(this.f, o0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.f15534a.hashCode() * 31;
        g gVar = this.f15535b;
        return this.f.hashCode() + ((this.f15537d.hashCode() + ((this.f15538e.hashCode() + ((this.f15536c.hashCode() + ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f15566a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f15567b;

        /* renamed from: c, reason: collision with root package name */
        public final o7.u<String, String> f15568c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15569d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f15570e;
        public final boolean f;

        /* renamed from: g, reason: collision with root package name */
        public final o7.t<Integer> f15571g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f15572h;

        public d(a aVar) {
            x6.b.H((aVar.f && aVar.f15574b == null) ? false : true);
            UUID uuid = aVar.f15573a;
            uuid.getClass();
            this.f15566a = uuid;
            this.f15567b = aVar.f15574b;
            this.f15568c = aVar.f15575c;
            this.f15569d = aVar.f15576d;
            this.f = aVar.f;
            this.f15570e = aVar.f15577e;
            this.f15571g = aVar.f15578g;
            byte[] bArr = aVar.f15579h;
            this.f15572h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15566a.equals(dVar.f15566a) && v5.e0.a(this.f15567b, dVar.f15567b) && v5.e0.a(this.f15568c, dVar.f15568c) && this.f15569d == dVar.f15569d && this.f == dVar.f && this.f15570e == dVar.f15570e && this.f15571g.equals(dVar.f15571g) && Arrays.equals(this.f15572h, dVar.f15572h);
        }

        public final int hashCode() {
            int hashCode = this.f15566a.hashCode() * 31;
            Uri uri = this.f15567b;
            return Arrays.hashCode(this.f15572h) + ((this.f15571g.hashCode() + ((((((((this.f15568c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f15569d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f15570e ? 1 : 0)) * 31)) * 31);
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public UUID f15573a;

            /* renamed from: b, reason: collision with root package name */
            public Uri f15574b;

            /* renamed from: c, reason: collision with root package name */
            public o7.u<String, String> f15575c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f15576d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f15577e;
            public boolean f;

            /* renamed from: g, reason: collision with root package name */
            public o7.t<Integer> f15578g;

            /* renamed from: h, reason: collision with root package name */
            public byte[] f15579h;

            public a() {
                this.f15575c = o7.m0.f12013o;
                t.b bVar = o7.t.f12050b;
                this.f15578g = o7.l0.f12009e;
            }

            public a(d dVar) {
                this.f15573a = dVar.f15566a;
                this.f15574b = dVar.f15567b;
                this.f15575c = dVar.f15568c;
                this.f15576d = dVar.f15569d;
                this.f15577e = dVar.f15570e;
                this.f = dVar.f;
                this.f15578g = dVar.f15571g;
                this.f15579h = dVar.f15572h;
            }
        }
    }
}
