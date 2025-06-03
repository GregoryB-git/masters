package d0;

import X2.AbstractC0703v;
import a3.AbstractC0744a;
import g0.AbstractC1297a;
import java.util.Arrays;
import java.util.List;

/* renamed from: d0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173L {

    /* renamed from: b, reason: collision with root package name */
    public static final C1173L f12542b = new C1173L(AbstractC0703v.Y());

    /* renamed from: c, reason: collision with root package name */
    public static final String f12543c = g0.M.w0(0);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0703v f12544a;

    /* renamed from: d0.L$a */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final String f12545f = g0.M.w0(0);

        /* renamed from: g, reason: collision with root package name */
        public static final String f12546g = g0.M.w0(1);

        /* renamed from: h, reason: collision with root package name */
        public static final String f12547h = g0.M.w0(3);

        /* renamed from: i, reason: collision with root package name */
        public static final String f12548i = g0.M.w0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f12549a;

        /* renamed from: b, reason: collision with root package name */
        public final C1171J f12550b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f12551c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f12552d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean[] f12553e;

        public a(C1171J c1171j, boolean z7, int[] iArr, boolean[] zArr) {
            int i7 = c1171j.f12438a;
            this.f12549a = i7;
            boolean z8 = false;
            AbstractC1297a.a(i7 == iArr.length && i7 == zArr.length);
            this.f12550b = c1171j;
            if (z7 && i7 > 1) {
                z8 = true;
            }
            this.f12551c = z8;
            this.f12552d = (int[]) iArr.clone();
            this.f12553e = (boolean[]) zArr.clone();
        }

        public C1171J a() {
            return this.f12550b;
        }

        public C1194q b(int i7) {
            return this.f12550b.a(i7);
        }

        public int c() {
            return this.f12550b.f12440c;
        }

        public boolean d() {
            return AbstractC0744a.b(this.f12553e, true);
        }

        public boolean e(int i7) {
            return this.f12553e[i7];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12551c == aVar.f12551c && this.f12550b.equals(aVar.f12550b) && Arrays.equals(this.f12552d, aVar.f12552d) && Arrays.equals(this.f12553e, aVar.f12553e);
        }

        public int hashCode() {
            return (((((this.f12550b.hashCode() * 31) + (this.f12551c ? 1 : 0)) * 31) + Arrays.hashCode(this.f12552d)) * 31) + Arrays.hashCode(this.f12553e);
        }
    }

    public C1173L(List list) {
        this.f12544a = AbstractC0703v.U(list);
    }

    public AbstractC0703v a() {
        return this.f12544a;
    }

    public boolean b(int i7) {
        for (int i8 = 0; i8 < this.f12544a.size(); i8++) {
            a aVar = (a) this.f12544a.get(i8);
            if (aVar.d() && aVar.c() == i7) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1173L.class != obj.getClass()) {
            return false;
        }
        return this.f12544a.equals(((C1173L) obj).f12544a);
    }

    public int hashCode() {
        return this.f12544a.hashCode();
    }
}
