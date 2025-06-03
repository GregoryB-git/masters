package Z0;

import F0.InterfaceC0373s;
import F0.L;
import U0.b;
import d0.C1162A;
import g0.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final W2.q f7776d = W2.q.d(':');

    /* renamed from: e, reason: collision with root package name */
    public static final W2.q f7777e = W2.q.d('*');

    /* renamed from: a, reason: collision with root package name */
    public final List f7778a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f7779b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7780c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7781a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7782b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7783c;

        public a(int i7, long j7, int i8) {
            this.f7781a = i7;
            this.f7782b = j7;
            this.f7783c = i8;
        }
    }

    public static int b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C1162A.a("Invalid SEF name", null);
        }
    }

    public static U0.b f(z zVar, int i7) {
        ArrayList arrayList = new ArrayList();
        List f7 = f7777e.f(zVar.D(i7));
        for (int i8 = 0; i8 < f7.size(); i8++) {
            List f8 = f7776d.f((CharSequence) f7.get(i8));
            if (f8.size() != 3) {
                throw C1162A.a(null, null);
            }
            try {
                arrayList.add(new b.C0105b(Long.parseLong((String) f8.get(0)), Long.parseLong((String) f8.get(1)), 1 << (Integer.parseInt((String) f8.get(2)) - 1)));
            } catch (NumberFormatException e7) {
                throw C1162A.a(null, e7);
            }
        }
        return new U0.b(arrayList);
    }

    public final void a(InterfaceC0373s interfaceC0373s, L l7) {
        z zVar = new z(8);
        interfaceC0373s.readFully(zVar.e(), 0, 8);
        this.f7780c = zVar.t() + 8;
        if (zVar.p() != 1397048916) {
            l7.f1788a = 0L;
        } else {
            l7.f1788a = interfaceC0373s.p() - (this.f7780c - 12);
            this.f7779b = 2;
        }
    }

    public int c(InterfaceC0373s interfaceC0373s, L l7, List list) {
        int i7 = this.f7779b;
        long j7 = 0;
        if (i7 == 0) {
            long a7 = interfaceC0373s.a();
            if (a7 != -1 && a7 >= 8) {
                j7 = a7 - 8;
            }
            l7.f1788a = j7;
            this.f7779b = 1;
        } else if (i7 == 1) {
            a(interfaceC0373s, l7);
        } else if (i7 == 2) {
            d(interfaceC0373s, l7);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC0373s, list);
            l7.f1788a = 0L;
        }
        return 1;
    }

    public final void d(InterfaceC0373s interfaceC0373s, L l7) {
        long j7;
        long a7 = interfaceC0373s.a();
        int i7 = this.f7780c - 20;
        z zVar = new z(i7);
        interfaceC0373s.readFully(zVar.e(), 0, i7);
        for (int i8 = 0; i8 < i7 / 12; i8++) {
            zVar.U(2);
            short v7 = zVar.v();
            if (v7 == 2192 || v7 == 2816 || v7 == 2817 || v7 == 2819 || v7 == 2820) {
                this.f7778a.add(new a(v7, (a7 - this.f7780c) - zVar.t(), zVar.t()));
            } else {
                zVar.U(8);
            }
        }
        if (this.f7778a.isEmpty()) {
            j7 = 0;
        } else {
            this.f7779b = 3;
            j7 = ((a) this.f7778a.get(0)).f7782b;
        }
        l7.f1788a = j7;
    }

    public final void e(InterfaceC0373s interfaceC0373s, List list) {
        long p7 = interfaceC0373s.p();
        int a7 = (int) ((interfaceC0373s.a() - interfaceC0373s.p()) - this.f7780c);
        z zVar = new z(a7);
        interfaceC0373s.readFully(zVar.e(), 0, a7);
        for (int i7 = 0; i7 < this.f7778a.size(); i7++) {
            a aVar = (a) this.f7778a.get(i7);
            zVar.T((int) (aVar.f7782b - p7));
            zVar.U(4);
            int t7 = zVar.t();
            int b7 = b(zVar.D(t7));
            int i8 = aVar.f7783c - (t7 + 8);
            if (b7 == 2192) {
                list.add(f(zVar, i8));
            } else if (b7 != 2816 && b7 != 2817 && b7 != 2819 && b7 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f7778a.clear();
        this.f7779b = 0;
    }
}
