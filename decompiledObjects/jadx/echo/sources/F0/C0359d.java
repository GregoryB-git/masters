package F0;

import d0.C1162A;
import g0.AbstractC1300d;
import h0.AbstractC1329d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: F0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359d {

    /* renamed from: a, reason: collision with root package name */
    public final List f1861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1863c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1864d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1867g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1868h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1869i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1870j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1871k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1872l;

    public C0359d(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f7, String str) {
        this.f1861a = list;
        this.f1862b = i7;
        this.f1863c = i8;
        this.f1864d = i9;
        this.f1865e = i10;
        this.f1866f = i11;
        this.f1867g = i12;
        this.f1868h = i13;
        this.f1869i = i14;
        this.f1870j = i15;
        this.f1871k = f7;
        this.f1872l = str;
    }

    public static byte[] a(g0.z zVar) {
        int M6 = zVar.M();
        int f7 = zVar.f();
        zVar.U(M6);
        return AbstractC1300d.d(zVar.e(), f7, M6);
    }

    public static C0359d b(g0.z zVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        String str;
        int i14;
        try {
            zVar.U(4);
            int G6 = (zVar.G() & 3) + 1;
            if (G6 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int G7 = zVar.G() & 31;
            for (int i15 = 0; i15 < G7; i15++) {
                arrayList.add(a(zVar));
            }
            int G8 = zVar.G();
            for (int i16 = 0; i16 < G8; i16++) {
                arrayList.add(a(zVar));
            }
            if (G7 > 0) {
                AbstractC1329d.c l7 = AbstractC1329d.l((byte[]) arrayList.get(0), G6, ((byte[]) arrayList.get(0)).length);
                int i17 = l7.f14553f;
                int i18 = l7.f14554g;
                int i19 = l7.f14556i + 8;
                int i20 = l7.f14557j + 8;
                int i21 = l7.f14564q;
                int i22 = l7.f14565r;
                int i23 = l7.f14566s;
                int i24 = l7.f14567t;
                float f8 = l7.f14555h;
                str = AbstractC1300d.a(l7.f14548a, l7.f14549b, l7.f14550c);
                i13 = i23;
                i14 = i24;
                f7 = f8;
                i10 = i20;
                i11 = i21;
                i12 = i22;
                i7 = i17;
                i8 = i18;
                i9 = i19;
            } else {
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f7 = 1.0f;
                str = null;
                i14 = 16;
            }
            return new C0359d(arrayList, G6, i7, i8, i9, i10, i11, i12, i13, i14, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C1162A.a("Error parsing AVC config", e7);
        }
    }
}
