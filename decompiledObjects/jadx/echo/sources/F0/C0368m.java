package F0;

import X2.AbstractC0703v;
import a1.C0736d;
import android.net.Uri;
import b1.C0788a;
import c1.t;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1192o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C1586b;
import l1.C1589e;
import l1.C1592h;
import l1.C1594j;
import m1.C1661b;
import n1.C1694a;

/* renamed from: F0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368m implements InterfaceC0378x {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1916r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s, reason: collision with root package name */
    public static final a f1917s = new a(new a.InterfaceC0031a() { // from class: F0.k
        @Override // F0.C0368m.a.InterfaceC0031a
        public final Constructor a() {
            Constructor f7;
            f7 = C0368m.f();
            return f7;
        }
    });

    /* renamed from: t, reason: collision with root package name */
    public static final a f1918t = new a(new a.InterfaceC0031a() { // from class: F0.l
        @Override // F0.C0368m.a.InterfaceC0031a
        public final Constructor a() {
            Constructor g7;
            g7 = C0368m.g();
            return g7;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public boolean f1919b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1920c;

    /* renamed from: d, reason: collision with root package name */
    public int f1921d;

    /* renamed from: e, reason: collision with root package name */
    public int f1922e;

    /* renamed from: f, reason: collision with root package name */
    public int f1923f;

    /* renamed from: g, reason: collision with root package name */
    public int f1924g;

    /* renamed from: h, reason: collision with root package name */
    public int f1925h;

    /* renamed from: i, reason: collision with root package name */
    public int f1926i;

    /* renamed from: j, reason: collision with root package name */
    public int f1927j;

    /* renamed from: l, reason: collision with root package name */
    public int f1929l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0703v f1930m;

    /* renamed from: q, reason: collision with root package name */
    public int f1934q;

    /* renamed from: k, reason: collision with root package name */
    public int f1928k = 1;

    /* renamed from: n, reason: collision with root package name */
    public int f1931n = 112800;

    /* renamed from: p, reason: collision with root package name */
    public t.a f1933p = new c1.h();

    /* renamed from: o, reason: collision with root package name */
    public boolean f1932o = true;

    /* renamed from: F0.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0031a f1935a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f1936b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public Constructor f1937c;

        /* renamed from: F0.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC0031a {
            Constructor a();
        }

        public a(InterfaceC0031a interfaceC0031a) {
            this.f1935a = interfaceC0031a;
        }

        public r a(Object... objArr) {
            Constructor b7 = b();
            if (b7 == null) {
                return null;
            }
            try {
                return (r) b7.newInstance(objArr);
            } catch (Exception e7) {
                throw new IllegalStateException("Unexpected error creating extractor", e7);
            }
        }

        public final Constructor b() {
            synchronized (this.f1936b) {
                if (this.f1936b.get()) {
                    return this.f1937c;
                }
                try {
                    return this.f1935a.a();
                } catch (ClassNotFoundException unused) {
                    this.f1936b.set(true);
                    return this.f1937c;
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
        }
    }

    public static Constructor f() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor g() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor(new Class[0]);
    }

    @Override // F0.InterfaceC0378x
    public synchronized r[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // F0.InterfaceC0378x
    public synchronized r[] b(Uri uri, Map map) {
        r[] rVarArr;
        try {
            int[] iArr = f1916r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int b7 = AbstractC1192o.b(map);
            if (b7 != -1) {
                e(b7, arrayList);
            }
            int c7 = AbstractC1192o.c(uri);
            if (c7 != -1 && c7 != b7) {
                e(c7, arrayList);
            }
            for (int i7 : iArr) {
                if (i7 != b7 && i7 != c7) {
                    e(i7, arrayList);
                }
            }
            rVarArr = new r[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                r rVar = (r) arrayList.get(i8);
                if (this.f1932o && !(rVar.d() instanceof Z0.h) && !(rVar.d() instanceof Z0.m) && !(rVar.d() instanceof l1.J) && !(rVar.d() instanceof H0.b) && !(rVar.d() instanceof X0.e)) {
                    rVar = new c1.u(rVar, this.f1933p);
                }
                rVarArr[i8] = rVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return rVarArr;
    }

    public final void e(int i7, List list) {
        r c1586b;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c1586b = new C1586b();
                break;
            case 1:
                c1586b = new C1589e();
                break;
            case 2:
                c1586b = new C1592h(this.f1921d | (this.f1919b ? 1 : 0) | (this.f1920c ? 2 : 0));
                break;
            case 3:
                c1586b = new G0.b(this.f1922e | (this.f1919b ? 1 : 0) | (this.f1920c ? 2 : 0));
                break;
            case 4:
                c1586b = f1917s.a(Integer.valueOf(this.f1923f));
                if (c1586b == null) {
                    c1586b = new K0.d(this.f1923f);
                    break;
                }
                break;
            case 5:
                c1586b = new L0.c();
                break;
            case 6:
                c1586b = new X0.e(this.f1933p, (this.f1932o ? 0 : 2) | this.f1924g);
                break;
            case 7:
                c1586b = new Y0.f(this.f1927j | (this.f1919b ? 1 : 0) | (this.f1920c ? 2 : 0));
                break;
            case 8:
                list.add(new Z0.h(this.f1933p, this.f1926i | (this.f1932o ? 0 : 32)));
                c1586b = new Z0.m(this.f1933p, this.f1925h | (this.f1932o ? 0 : 16));
                break;
            case 9:
                c1586b = new C0736d();
                break;
            case 10:
                c1586b = new l1.C();
                break;
            case 11:
                if (this.f1930m == null) {
                    this.f1930m = AbstractC0703v.Y();
                }
                c1586b = new l1.J(this.f1928k, !this.f1932o ? 1 : 0, this.f1933p, new g0.E(0L), new C1594j(this.f1929l, this.f1930m), this.f1931n);
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                c1586b = new C1661b();
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            default:
                return;
            case 14:
                c1586b = new N0.a(this.f1934q);
                break;
            case 15:
                c1586b = f1918t.a(new Object[0]);
                if (c1586b == null) {
                    return;
                }
                break;
            case 16:
                c1586b = new H0.b(1 ^ (this.f1932o ? 1 : 0), this.f1933p);
                break;
            case 17:
                c1586b = new C0788a();
                break;
            case 18:
                c1586b = new C1694a();
                break;
            case 19:
                c1586b = new J0.a();
                break;
            case 20:
                int i8 = this.f1925h;
                if ((i8 & 2) == 0 && (i8 & 4) == 0) {
                    c1586b = new M0.a();
                    break;
                } else {
                    return;
                }
                break;
            case 21:
                c1586b = new I0.a();
                break;
        }
        list.add(c1586b);
    }

    public synchronized C0368m h(boolean z7) {
        this.f1920c = z7;
        return this;
    }

    public synchronized C0368m i(boolean z7) {
        this.f1919b = z7;
        return this;
    }

    public synchronized C0368m j(int i7) {
        this.f1927j = i7;
        return this;
    }
}
