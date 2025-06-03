package com.google.protobuf;

import com.google.protobuf.AbstractC1154t;
import com.google.protobuf.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150o {

    /* renamed from: d, reason: collision with root package name */
    public static final C1150o f12162d = new C1150o(true);

    /* renamed from: a, reason: collision with root package name */
    public final c0 f12163a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12165c;

    /* renamed from: com.google.protobuf.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12166a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12167b;

        static {
            int[] iArr = new int[m0.b.values().length];
            f12167b = iArr;
            try {
                iArr[m0.b.f12134q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12167b[m0.b.f12135r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12167b[m0.b.f12136s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12167b[m0.b.f12137t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12167b[m0.b.f12138u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12167b[m0.b.f12139v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12167b[m0.b.f12140w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12167b[m0.b.f12141x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12167b[m0.b.f12143z.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12167b[m0.b.f12125A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12167b[m0.b.f12142y.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12167b[m0.b.f12126B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12167b[m0.b.f12127C.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12167b[m0.b.f12129E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12167b[m0.b.f12130F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12167b[m0.b.f12131G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12167b[m0.b.f12132H.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12167b[m0.b.f12128D.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[m0.c.values().length];
            f12166a = iArr2;
            try {
                iArr2[m0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12166a[m0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12166a[m0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12166a[m0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12166a[m0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12166a[m0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12166a[m0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12166a[m0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12166a[m0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.o$b */
    public interface b extends Comparable {
        int g();

        boolean i();

        m0.b k();

        boolean q();
    }

    public C1150o() {
        this.f12163a = c0.q(16);
    }

    public static int b(m0.b bVar, int i7, Object obj) {
        int O6 = AbstractC1143h.O(i7);
        if (bVar == m0.b.f12143z) {
            O6 *= 2;
        }
        return O6 + c(bVar, obj);
    }

    public static int c(m0.b bVar, Object obj) {
        switch (a.f12167b[bVar.ordinal()]) {
            case 1:
                return AbstractC1143h.j(((Double) obj).doubleValue());
            case 2:
                return AbstractC1143h.r(((Float) obj).floatValue());
            case 3:
                return AbstractC1143h.y(((Long) obj).longValue());
            case 4:
                return AbstractC1143h.S(((Long) obj).longValue());
            case 5:
                return AbstractC1143h.w(((Integer) obj).intValue());
            case 6:
                return AbstractC1143h.p(((Long) obj).longValue());
            case 7:
                return AbstractC1143h.n(((Integer) obj).intValue());
            case 8:
                return AbstractC1143h.e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1143h.t((K) obj);
            case 10:
                return AbstractC1143h.B((K) obj);
            case 11:
                return obj instanceof AbstractC1141f ? AbstractC1143h.h((AbstractC1141f) obj) : AbstractC1143h.N((String) obj);
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC1141f ? AbstractC1143h.h((AbstractC1141f) obj) : AbstractC1143h.f((byte[]) obj);
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return AbstractC1143h.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC1143h.F(((Integer) obj).intValue());
            case 15:
                return AbstractC1143h.H(((Long) obj).longValue());
            case 16:
                return AbstractC1143h.J(((Integer) obj).intValue());
            case 17:
                return AbstractC1143h.L(((Long) obj).longValue());
            case 18:
                return obj instanceof AbstractC1154t.a ? AbstractC1143h.l(((AbstractC1154t.a) obj).g()) : AbstractC1143h.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        m0.b k7 = bVar.k();
        int g7 = bVar.g();
        if (!bVar.i()) {
            return b(k7, g7, obj);
        }
        int i7 = 0;
        List list = (List) obj;
        if (bVar.q()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i7 += c(k7, it.next());
            }
            return AbstractC1143h.O(g7) + i7 + AbstractC1143h.Q(i7);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i7 += b(k7, g7, it2.next());
        }
        return i7;
    }

    public static int i(m0.b bVar, boolean z7) {
        if (z7) {
            return 2;
        }
        return bVar.h();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        throw null;
    }

    public static boolean m(m0.b bVar, Object obj) {
        AbstractC1154t.a(obj);
        switch (a.f12166a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1141f) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof AbstractC1154t.a);
            case 9:
                return obj instanceof K;
            default:
                return false;
        }
    }

    public static C1150o r() {
        return new C1150o();
    }

    public static void u(AbstractC1143h abstractC1143h, m0.b bVar, int i7, Object obj) {
        if (bVar == m0.b.f12143z) {
            abstractC1143h.r0(i7, (K) obj);
        } else {
            abstractC1143h.N0(i7, i(bVar, false));
            v(abstractC1143h, bVar, obj);
        }
    }

    public static void v(AbstractC1143h abstractC1143h, m0.b bVar, Object obj) {
        switch (a.f12167b[bVar.ordinal()]) {
            case 1:
                abstractC1143h.i0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1143h.q0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1143h.y0(((Long) obj).longValue());
                return;
            case 4:
                abstractC1143h.R0(((Long) obj).longValue());
                return;
            case 5:
                abstractC1143h.w0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1143h.o0(((Long) obj).longValue());
                return;
            case 7:
                abstractC1143h.m0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1143h.c0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC1143h.t0((K) obj);
                return;
            case 10:
                abstractC1143h.A0((K) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC1141f)) {
                    abstractC1143h.M0((String) obj);
                    return;
                }
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC1141f)) {
                    abstractC1143h.d0((byte[]) obj);
                    return;
                }
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                abstractC1143h.P0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC1143h.E0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1143h.G0(((Long) obj).longValue());
                return;
            case 16:
                abstractC1143h.I0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC1143h.K0(((Long) obj).longValue());
                return;
            case 18:
                abstractC1143h.k0(obj instanceof AbstractC1154t.a ? ((AbstractC1154t.a) obj).g() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC1143h.g0((AbstractC1141f) obj);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1150o clone() {
        C1150o r7 = r();
        for (int i7 = 0; i7 < this.f12163a.k(); i7++) {
            Map.Entry j7 = this.f12163a.j(i7);
            android.support.v4.media.a.a(j7.getKey());
            r7.s(null, j7.getValue());
        }
        for (Map.Entry entry : this.f12163a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            r7.s(null, entry.getValue());
        }
        r7.f12165c = this.f12165c;
        return r7;
    }

    public Iterator e() {
        return this.f12165c ? new C1158x(this.f12163a.h().iterator()) : this.f12163a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1150o) {
            return this.f12163a.equals(((C1150o) obj).f12163a);
        }
        return false;
    }

    public int f() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f12163a.k(); i8++) {
            i7 += g(this.f12163a.j(i8));
        }
        Iterator it = this.f12163a.m().iterator();
        while (it.hasNext()) {
            i7 += g((Map.Entry) it.next());
        }
        return i7;
    }

    public final int g(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f12163a.k(); i8++) {
            Map.Entry j7 = this.f12163a.j(i8);
            android.support.v4.media.a.a(j7.getKey());
            i7 += d(null, j7.getValue());
        }
        for (Map.Entry entry : this.f12163a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            i7 += d(null, entry.getValue());
        }
        return i7;
    }

    public int hashCode() {
        return this.f12163a.hashCode();
    }

    public boolean j() {
        return this.f12163a.isEmpty();
    }

    public boolean k() {
        for (int i7 = 0; i7 < this.f12163a.k(); i7++) {
            if (!l(this.f12163a.j(i7))) {
                return false;
            }
        }
        Iterator it = this.f12163a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f12165c ? new C1158x(this.f12163a.entrySet().iterator()) : this.f12163a.entrySet().iterator();
    }

    public void o() {
        if (this.f12164b) {
            return;
        }
        for (int i7 = 0; i7 < this.f12163a.k(); i7++) {
            Map.Entry j7 = this.f12163a.j(i7);
            if (j7.getValue() instanceof r) {
                ((r) j7.getValue()).J();
            }
        }
        this.f12163a.p();
        this.f12164b = true;
    }

    public void p(C1150o c1150o) {
        for (int i7 = 0; i7 < c1150o.f12163a.k(); i7++) {
            q(c1150o.f12163a.j(i7));
        }
        Iterator it = c1150o.f12163a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.i()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f12163a.r(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.k(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.g()), bVar.k().e(), obj.getClass().getName()));
        }
    }

    public C1150o(c0 c0Var) {
        this.f12163a = c0Var;
        o();
    }

    public C1150o(boolean z7) {
        this(c0.q(0));
        o();
    }
}
