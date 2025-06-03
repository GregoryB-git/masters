package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771s {

    /* renamed from: d, reason: collision with root package name */
    public static final C0771s f9109d = new C0771s(true);

    /* renamed from: a, reason: collision with root package name */
    public final h0 f9110a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9111b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9112c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9113a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9114b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f9114b = iArr;
            try {
                iArr[r0.b.f9086q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9114b[r0.b.f9087r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9114b[r0.b.f9088s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9114b[r0.b.f9089t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9114b[r0.b.f9090u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9114b[r0.b.f9091v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9114b[r0.b.f9092w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9114b[r0.b.f9093x.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9114b[r0.b.f9095z.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9114b[r0.b.f9077A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9114b[r0.b.f9094y.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9114b[r0.b.f9078B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9114b[r0.b.f9079C.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9114b[r0.b.f9081E.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9114b[r0.b.f9082F.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9114b[r0.b.f9083G.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9114b[r0.b.f9084H.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9114b[r0.b.f9080D.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f9113a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9113a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9113a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9113a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9113a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9113a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9113a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9113a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9113a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        int g();

        boolean i();

        r0.b k();

        boolean q();
    }

    public C0771s() {
        this.f9110a = h0.q(16);
    }

    public static int b(r0.b bVar, int i7, Object obj) {
        int P6 = AbstractC0763j.P(i7);
        if (bVar == r0.b.f9095z) {
            P6 *= 2;
        }
        return P6 + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.f9114b[bVar.ordinal()]) {
            case 1:
                return AbstractC0763j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC0763j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC0763j.x(((Long) obj).longValue());
            case 4:
                return AbstractC0763j.T(((Long) obj).longValue());
            case 5:
                return AbstractC0763j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC0763j.o(((Long) obj).longValue());
            case 7:
                return AbstractC0763j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC0763j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0763j.s((O) obj);
            case 10:
                return AbstractC0763j.A((O) obj);
            case 11:
                return obj instanceof AbstractC0760g ? AbstractC0763j.g((AbstractC0760g) obj) : AbstractC0763j.O((String) obj);
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC0760g ? AbstractC0763j.g((AbstractC0760g) obj) : AbstractC0763j.e((byte[]) obj);
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return AbstractC0763j.R(((Integer) obj).intValue());
            case 14:
                return AbstractC0763j.G(((Integer) obj).intValue());
            case 15:
                return AbstractC0763j.I(((Long) obj).longValue());
            case 16:
                return AbstractC0763j.K(((Integer) obj).intValue());
            case 17:
                return AbstractC0763j.M(((Long) obj).longValue());
            case 18:
                return AbstractC0763j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b k7 = bVar.k();
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
            return AbstractC0763j.P(g7) + i7 + AbstractC0763j.E(i7);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i7 += b(k7, g7, it2.next());
        }
        return i7;
    }

    public static int i(r0.b bVar, boolean z7) {
        if (z7) {
            return 2;
        }
        return bVar.e();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b bVar, Object obj) {
        AbstractC0777y.a(obj);
        switch (a.f9113a[bVar.c().ordinal()]) {
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
                return (obj instanceof AbstractC0760g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof O;
            default:
                return false;
        }
    }

    public static C0771s r() {
        return new C0771s();
    }

    public static void u(AbstractC0763j abstractC0763j, r0.b bVar, int i7, Object obj) {
        if (bVar == r0.b.f9095z) {
            abstractC0763j.r0(i7, (O) obj);
        } else {
            abstractC0763j.N0(i7, i(bVar, false));
            v(abstractC0763j, bVar, obj);
        }
    }

    public static void v(AbstractC0763j abstractC0763j, r0.b bVar, Object obj) {
        switch (a.f9114b[bVar.ordinal()]) {
            case 1:
                abstractC0763j.i0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC0763j.q0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC0763j.y0(((Long) obj).longValue());
                return;
            case 4:
                abstractC0763j.R0(((Long) obj).longValue());
                return;
            case 5:
                abstractC0763j.w0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC0763j.o0(((Long) obj).longValue());
                return;
            case 7:
                abstractC0763j.m0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC0763j.c0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC0763j.t0((O) obj);
                return;
            case 10:
                abstractC0763j.A0((O) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC0760g)) {
                    abstractC0763j.M0((String) obj);
                    return;
                }
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (!(obj instanceof AbstractC0760g)) {
                    abstractC0763j.d0((byte[]) obj);
                    return;
                }
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                abstractC0763j.P0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0763j.E0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0763j.G0(((Long) obj).longValue());
                return;
            case 16:
                abstractC0763j.I0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC0763j.K0(((Long) obj).longValue());
                return;
            case 18:
                abstractC0763j.k0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC0763j.g0((AbstractC0760g) obj);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0771s clone() {
        C0771s r7 = r();
        for (int i7 = 0; i7 < this.f9110a.k(); i7++) {
            Map.Entry j7 = this.f9110a.j(i7);
            android.support.v4.media.a.a(j7.getKey());
            r7.s(null, j7.getValue());
        }
        for (Map.Entry entry : this.f9110a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            r7.s(null, entry.getValue());
        }
        r7.f9112c = this.f9112c;
        return r7;
    }

    public Iterator e() {
        return this.f9112c ? new B(this.f9110a.h().iterator()) : this.f9110a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0771s) {
            return this.f9110a.equals(((C0771s) obj).f9110a);
        }
        return false;
    }

    public int f() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f9110a.k(); i8++) {
            i7 += g(this.f9110a.j(i8));
        }
        Iterator it = this.f9110a.m().iterator();
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
        for (int i8 = 0; i8 < this.f9110a.k(); i8++) {
            Map.Entry j7 = this.f9110a.j(i8);
            android.support.v4.media.a.a(j7.getKey());
            i7 += d(null, j7.getValue());
        }
        for (Map.Entry entry : this.f9110a.m()) {
            android.support.v4.media.a.a(entry.getKey());
            i7 += d(null, entry.getValue());
        }
        return i7;
    }

    public int hashCode() {
        return this.f9110a.hashCode();
    }

    public boolean j() {
        return this.f9110a.isEmpty();
    }

    public boolean k() {
        for (int i7 = 0; i7 < this.f9110a.k(); i7++) {
            if (!l(this.f9110a.j(i7))) {
                return false;
            }
        }
        Iterator it = this.f9110a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f9112c ? new B(this.f9110a.entrySet().iterator()) : this.f9110a.entrySet().iterator();
    }

    public void o() {
        if (this.f9111b) {
            return;
        }
        this.f9110a.p();
        this.f9111b = true;
    }

    public void p(C0771s c0771s) {
        for (int i7 = 0; i7 < c0771s.f9110a.k(); i7++) {
            q(c0771s.f9110a.j(i7));
        }
        Iterator it = c0771s.f9110a.m().iterator();
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
            t(bVar.k(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.k(), it.next());
            }
            obj = arrayList;
        }
        this.f9110a.r(bVar, obj);
    }

    public final void t(r0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public C0771s(h0 h0Var) {
        this.f9110a = h0Var;
        o();
    }

    public C0771s(boolean z7) {
        this(h0.q(0));
        o();
    }
}
