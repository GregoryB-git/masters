package q0;

import F0.InterfaceC0373s;
import X2.AbstractC0703v;
import android.net.Uri;
import android.text.TextUtils;
import c1.t;
import d0.AbstractC1192o;
import d0.AbstractC1203z;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.E;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l0.y1;
import l1.C1586b;
import l1.C1589e;
import l1.C1592h;
import l1.C1594j;
import l1.J;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f18614f = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    public final int f18615b;

    /* renamed from: c, reason: collision with root package name */
    public t.a f18616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18617d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18618e;

    public d() {
        this(0, true);
    }

    public static void d(int i7, List list) {
        if (a3.f.j(f18614f, i7) == -1 || list.contains(Integer.valueOf(i7))) {
            return;
        }
        list.add(Integer.valueOf(i7));
    }

    public static Z0.h g(t.a aVar, boolean z7, E e7, C1194q c1194q, List list) {
        int i7 = j(c1194q) ? 4 : 0;
        if (!z7) {
            aVar = t.a.f10046a;
            i7 |= 32;
        }
        t.a aVar2 = aVar;
        int i8 = i7;
        if (list == null) {
            list = AbstractC0703v.Y();
        }
        return new Z0.h(aVar2, i8, e7, null, list, null);
    }

    public static J h(int i7, boolean z7, C1194q c1194q, List list, E e7, t.a aVar, boolean z8) {
        int i8;
        int i9 = i7 | 16;
        if (list != null) {
            i9 = i7 | 48;
        } else {
            list = z7 ? Collections.singletonList(new C1194q.b().o0("application/cea-608").K()) : Collections.emptyList();
        }
        String str = c1194q.f12722j;
        if (!TextUtils.isEmpty(str)) {
            if (!AbstractC1203z.b(str, "audio/mp4a-latm")) {
                i9 |= 2;
            }
            if (!AbstractC1203z.b(str, "video/avc")) {
                i9 |= 4;
            }
        }
        if (z8) {
            i8 = 0;
        } else {
            aVar = t.a.f10046a;
            i8 = 1;
        }
        return new J(2, i8, aVar, e7, new C1594j(i9, list), 112800);
    }

    public static boolean j(C1194q c1194q) {
        C1201x c1201x = c1194q.f12723k;
        if (c1201x == null) {
            return false;
        }
        for (int i7 = 0; i7 < c1201x.e(); i7++) {
            if (c1201x.d(i7) instanceof t) {
                return !((t) r2).f18786q.isEmpty();
            }
        }
        return false;
    }

    public static boolean k(F0.r rVar, InterfaceC0373s interfaceC0373s) {
        try {
            boolean e7 = rVar.e(interfaceC0373s);
            interfaceC0373s.h();
            return e7;
        } catch (EOFException unused) {
            interfaceC0373s.h();
            return false;
        } catch (Throwable th) {
            interfaceC0373s.h();
            throw th;
        }
    }

    @Override // q0.h
    public C1194q b(C1194q c1194q) {
        String str;
        if (!this.f18617d || !this.f18616c.a(c1194q)) {
            return c1194q;
        }
        C1194q.b S6 = c1194q.a().o0("application/x-media3-cues").S(this.f18616c.c(c1194q));
        StringBuilder sb = new StringBuilder();
        sb.append(c1194q.f12726n);
        if (c1194q.f12722j != null) {
            str = " " + c1194q.f12722j;
        } else {
            str = "";
        }
        sb.append(str);
        return S6.O(sb.toString()).s0(Long.MAX_VALUE).K();
    }

    @Override // q0.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1881b c(Uri uri, C1194q c1194q, List list, E e7, Map map, InterfaceC0373s interfaceC0373s, y1 y1Var) {
        int a7 = AbstractC1192o.a(c1194q.f12726n);
        int b7 = AbstractC1192o.b(map);
        int c7 = AbstractC1192o.c(uri);
        int[] iArr = f18614f;
        ArrayList arrayList = new ArrayList(iArr.length);
        d(a7, arrayList);
        d(b7, arrayList);
        d(c7, arrayList);
        for (int i7 : iArr) {
            d(i7, arrayList);
        }
        interfaceC0373s.h();
        F0.r rVar = null;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int intValue = ((Integer) arrayList.get(i8)).intValue();
            F0.r rVar2 = (F0.r) AbstractC1297a.e(f(intValue, c1194q, list, e7));
            if (k(rVar2, interfaceC0373s)) {
                return new C1881b(rVar2, c1194q, e7, this.f18616c, this.f18617d);
            }
            if (rVar == null && (intValue == a7 || intValue == b7 || intValue == c7 || intValue == 11)) {
                rVar = rVar2;
            }
        }
        return new C1881b((F0.r) AbstractC1297a.e(rVar), c1194q, e7, this.f18616c, this.f18617d);
    }

    public final F0.r f(int i7, C1194q c1194q, List list, E e7) {
        if (i7 == 0) {
            return new C1586b();
        }
        if (i7 == 1) {
            return new C1589e();
        }
        if (i7 == 2) {
            return new C1592h();
        }
        if (i7 == 7) {
            return new Y0.f(0, 0L);
        }
        if (i7 == 8) {
            return g(this.f18616c, this.f18617d, e7, c1194q, list);
        }
        if (i7 == 11) {
            return h(this.f18615b, this.f18618e, c1194q, list, e7, this.f18616c, this.f18617d);
        }
        if (i7 != 13) {
            return null;
        }
        return new w(c1194q.f12716d, e7, this.f18616c, this.f18617d);
    }

    @Override // q0.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public d a(boolean z7) {
        this.f18617d = z7;
        return this;
    }

    public d(int i7, boolean z7) {
        this.f18615b = i7;
        this.f18618e = z7;
        this.f18616c = new c1.h();
    }
}
