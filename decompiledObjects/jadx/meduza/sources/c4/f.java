package c4;

import android.net.Uri;
import b.z;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.c0;
import o7.l0;
import o7.t;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2279e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final a f = new a(new r3.j(11));

    /* renamed from: g, reason: collision with root package name */
    public static final a f2280g = new a(new e0.d(13));

    /* renamed from: a, reason: collision with root package name */
    public boolean f2281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2282b;

    /* renamed from: c, reason: collision with root package name */
    public int f2283c;

    /* renamed from: d, reason: collision with root package name */
    public l0 f2284d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0035a f2285a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f2286b = new AtomicBoolean(false);

        /* renamed from: c4.f$a$a, reason: collision with other inner class name */
        public interface InterfaceC0035a {
            Constructor<? extends h> b();
        }

        public a(InterfaceC0035a interfaceC0035a) {
            this.f2285a = interfaceC0035a;
        }

        public final h a(Object... objArr) {
            Constructor<? extends h> b10;
            synchronized (this.f2286b) {
                if (!this.f2286b.get()) {
                    try {
                        b10 = this.f2285a.b();
                    } catch (ClassNotFoundException unused) {
                        this.f2286b.set(true);
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                b10 = null;
            }
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    public f() {
        t.b bVar = o7.t.f12050b;
        this.f2284d = l0.f12009e;
    }

    @Override // c4.k
    public final synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f2279e;
        arrayList = new ArrayList(16);
        int l10 = z.l(map);
        if (l10 != -1) {
            b(l10, arrayList);
        }
        int m10 = z.m(uri);
        if (m10 != -1 && m10 != l10) {
            b(m10, arrayList);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = iArr[i10];
            if (i11 != l10 && i11 != m10) {
                b(i11, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public final void b(int i10, ArrayList arrayList) {
        h aVar;
        switch (i10) {
            case 0:
                aVar = new m4.a();
                break;
            case 1:
                aVar = new m4.c();
                break;
            case 2:
                aVar = new m4.e((this.f2282b ? 2 : 0) | (this.f2281a ? 1 : 0) | 0);
                break;
            case 3:
                aVar = new d4.a((this.f2282b ? 2 : 0) | (this.f2281a ? 1 : 0) | 0);
                break;
            case 4:
                aVar = f.a(0);
                if (aVar == null) {
                    aVar = new f4.b();
                    break;
                }
                break;
            case 5:
                aVar = new g4.b();
                break;
            case 6:
                aVar = new i4.d(0);
                break;
            case 7:
                aVar = new j4.d((this.f2282b ? 2 : 0) | this.f2283c | (this.f2281a ? 1 : 0));
                break;
            case 8:
                arrayList.add(new k4.e());
                aVar = new k4.g(0);
                break;
            case 9:
                aVar = new l4.c();
                break;
            case 10:
                aVar = new m4.w();
                break;
            case 11:
                aVar = new c0(1, new v5.c0(0L), new m4.g(0, this.f2284d));
                break;
            case 12:
                aVar = new n4.a();
                break;
            case 13:
            default:
                return;
            case 14:
                aVar = new h4.a();
                break;
            case 15:
                aVar = f2280g.a(new Object[0]);
                if (aVar == null) {
                    return;
                }
                break;
            case 16:
                aVar = new e4.b();
                break;
        }
        arrayList.add(aVar);
    }
}
