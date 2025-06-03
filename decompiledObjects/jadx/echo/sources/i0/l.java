package i0;

import android.content.Context;
import android.net.Uri;
import g0.AbstractC1297a;
import g0.M;
import i0.g;
import i0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14673a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14674b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final g f14675c;

    /* renamed from: d, reason: collision with root package name */
    public g f14676d;

    /* renamed from: e, reason: collision with root package name */
    public g f14677e;

    /* renamed from: f, reason: collision with root package name */
    public g f14678f;

    /* renamed from: g, reason: collision with root package name */
    public g f14679g;

    /* renamed from: h, reason: collision with root package name */
    public g f14680h;

    /* renamed from: i, reason: collision with root package name */
    public g f14681i;

    /* renamed from: j, reason: collision with root package name */
    public g f14682j;

    /* renamed from: k, reason: collision with root package name */
    public g f14683k;

    public static final class a implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14684a;

        /* renamed from: b, reason: collision with root package name */
        public final g.a f14685b;

        /* renamed from: c, reason: collision with root package name */
        public y f14686c;

        public a(Context context) {
            this(context, new m.b());
        }

        @Override // i0.g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVar = new l(this.f14684a, this.f14685b.a());
            y yVar = this.f14686c;
            if (yVar != null) {
                lVar.c(yVar);
            }
            return lVar;
        }

        public a(Context context, g.a aVar) {
            this.f14684a = context.getApplicationContext();
            this.f14685b = aVar;
        }
    }

    public l(Context context, g gVar) {
        this.f14673a = context.getApplicationContext();
        this.f14675c = (g) AbstractC1297a.e(gVar);
    }

    @Override // i0.g
    public void c(y yVar) {
        AbstractC1297a.e(yVar);
        this.f14675c.c(yVar);
        this.f14674b.add(yVar);
        y(this.f14676d, yVar);
        y(this.f14677e, yVar);
        y(this.f14678f, yVar);
        y(this.f14679g, yVar);
        y(this.f14680h, yVar);
        y(this.f14681i, yVar);
        y(this.f14682j, yVar);
    }

    @Override // i0.g
    public void close() {
        g gVar = this.f14683k;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f14683k = null;
            }
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        g s7;
        AbstractC1297a.f(this.f14683k == null);
        String scheme = kVar.f14652a.getScheme();
        if (M.D0(kVar.f14652a)) {
            String path = kVar.f14652a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                s7 = u();
            }
            s7 = r();
        } else {
            if (!"asset".equals(scheme)) {
                s7 = "content".equals(scheme) ? s() : "rtmp".equals(scheme) ? w() : "udp".equals(scheme) ? x() : "data".equals(scheme) ? t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? v() : this.f14675c;
            }
            s7 = r();
        }
        this.f14683k = s7;
        return this.f14683k.e(kVar);
    }

    @Override // i0.g
    public Map g() {
        g gVar = this.f14683k;
        return gVar == null ? Collections.emptyMap() : gVar.g();
    }

    @Override // i0.g
    public Uri k() {
        g gVar = this.f14683k;
        if (gVar == null) {
            return null;
        }
        return gVar.k();
    }

    public final void q(g gVar) {
        for (int i7 = 0; i7 < this.f14674b.size(); i7++) {
            gVar.c((y) this.f14674b.get(i7));
        }
    }

    public final g r() {
        if (this.f14677e == null) {
            C1341a c1341a = new C1341a(this.f14673a);
            this.f14677e = c1341a;
            q(c1341a);
        }
        return this.f14677e;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        return ((g) AbstractC1297a.e(this.f14683k)).read(bArr, i7, i8);
    }

    public final g s() {
        if (this.f14678f == null) {
            d dVar = new d(this.f14673a);
            this.f14678f = dVar;
            q(dVar);
        }
        return this.f14678f;
    }

    public final g t() {
        if (this.f14681i == null) {
            e eVar = new e();
            this.f14681i = eVar;
            q(eVar);
        }
        return this.f14681i;
    }

    public final g u() {
        if (this.f14676d == null) {
            p pVar = new p();
            this.f14676d = pVar;
            q(pVar);
        }
        return this.f14676d;
    }

    public final g v() {
        if (this.f14682j == null) {
            w wVar = new w(this.f14673a);
            this.f14682j = wVar;
            q(wVar);
        }
        return this.f14682j;
    }

    public final g w() {
        if (this.f14679g == null) {
            try {
                g gVar = (g) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f14679g = gVar;
                q(gVar);
            } catch (ClassNotFoundException unused) {
                g0.o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating RTMP extension", e7);
            }
            if (this.f14679g == null) {
                this.f14679g = this.f14675c;
            }
        }
        return this.f14679g;
    }

    public final g x() {
        if (this.f14680h == null) {
            z zVar = new z();
            this.f14680h = zVar;
            q(zVar);
        }
        return this.f14680h;
    }

    public final void y(g gVar, y yVar) {
        if (gVar != null) {
            gVar.c(yVar);
        }
    }
}
