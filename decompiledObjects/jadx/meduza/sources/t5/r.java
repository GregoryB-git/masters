package t5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t5.k;
import t5.s;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14580a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14581b;

    /* renamed from: c, reason: collision with root package name */
    public final k f14582c;

    /* renamed from: d, reason: collision with root package name */
    public v f14583d;

    /* renamed from: e, reason: collision with root package name */
    public c f14584e;
    public g f;

    /* renamed from: g, reason: collision with root package name */
    public k f14585g;

    /* renamed from: h, reason: collision with root package name */
    public m0 f14586h;

    /* renamed from: i, reason: collision with root package name */
    public i f14587i;

    /* renamed from: j, reason: collision with root package name */
    public h0 f14588j;

    /* renamed from: k, reason: collision with root package name */
    public k f14589k;

    public static final class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14590a;

        /* renamed from: b, reason: collision with root package name */
        public final k.a f14591b;

        /* renamed from: c, reason: collision with root package name */
        public l0 f14592c;

        public a(Context context) {
            this(context, new s.a());
        }

        public a(Context context, k.a aVar) {
            this.f14590a = context.getApplicationContext();
            this.f14591b = aVar;
        }

        @Override // t5.k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r a() {
            r rVar = new r(this.f14590a, this.f14591b.a());
            l0 l0Var = this.f14592c;
            if (l0Var != null) {
                rVar.f(l0Var);
            }
            return rVar;
        }
    }

    public r(Context context, k kVar) {
        this.f14580a = context.getApplicationContext();
        kVar.getClass();
        this.f14582c = kVar;
        this.f14581b = new ArrayList();
    }

    public static void q(k kVar, l0 l0Var) {
        if (kVar != null) {
            kVar.f(l0Var);
        }
    }

    @Override // t5.k
    public final long a(n nVar) {
        k kVar;
        boolean z10 = true;
        x6.b.H(this.f14589k == null);
        String scheme = nVar.f14547a.getScheme();
        Uri uri = nVar.f14547a;
        int i10 = v5.e0.f15881a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !Constants.FILE.equals(scheme2)) {
            z10 = false;
        }
        if (z10) {
            String path = nVar.f14547a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14583d == null) {
                    v vVar = new v();
                    this.f14583d = vVar;
                    o(vVar);
                }
                kVar = this.f14583d;
                this.f14589k = kVar;
                return kVar.a(nVar);
            }
            kVar = p();
            this.f14589k = kVar;
            return kVar.a(nVar);
        }
        if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.f == null) {
                    g gVar = new g(this.f14580a);
                    this.f = gVar;
                    o(gVar);
                }
                kVar = this.f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f14585g == null) {
                    try {
                        k kVar2 = (k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f14585g = kVar2;
                        o(kVar2);
                    } catch (ClassNotFoundException unused) {
                        v5.m.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f14585g == null) {
                        this.f14585g = this.f14582c;
                    }
                }
                kVar = this.f14585g;
            } else if ("udp".equals(scheme)) {
                if (this.f14586h == null) {
                    m0 m0Var = new m0();
                    this.f14586h = m0Var;
                    o(m0Var);
                }
                kVar = this.f14586h;
            } else if ("data".equals(scheme)) {
                if (this.f14587i == null) {
                    i iVar = new i();
                    this.f14587i = iVar;
                    o(iVar);
                }
                kVar = this.f14587i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f14588j == null) {
                    h0 h0Var = new h0(this.f14580a);
                    this.f14588j = h0Var;
                    o(h0Var);
                }
                kVar = this.f14588j;
            } else {
                kVar = this.f14582c;
            }
            this.f14589k = kVar;
            return kVar.a(nVar);
        }
        kVar = p();
        this.f14589k = kVar;
        return kVar.a(nVar);
    }

    @Override // t5.k
    public final void close() {
        k kVar = this.f14589k;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.f14589k = null;
            }
        }
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        this.f14582c.f(l0Var);
        this.f14581b.add(l0Var);
        q(this.f14583d, l0Var);
        q(this.f14584e, l0Var);
        q(this.f, l0Var);
        q(this.f14585g, l0Var);
        q(this.f14586h, l0Var);
        q(this.f14587i, l0Var);
        q(this.f14588j, l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        k kVar = this.f14589k;
        return kVar == null ? Collections.emptyMap() : kVar.h();
    }

    @Override // t5.k
    public final Uri l() {
        k kVar = this.f14589k;
        if (kVar == null) {
            return null;
        }
        return kVar.l();
    }

    public final void o(k kVar) {
        for (int i10 = 0; i10 < this.f14581b.size(); i10++) {
            kVar.f((l0) this.f14581b.get(i10));
        }
    }

    public final k p() {
        if (this.f14584e == null) {
            c cVar = new c(this.f14580a);
            this.f14584e = cVar;
            o(cVar);
        }
        return this.f14584e;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        k kVar = this.f14589k;
        kVar.getClass();
        return kVar.read(bArr, i10, i11);
    }
}
