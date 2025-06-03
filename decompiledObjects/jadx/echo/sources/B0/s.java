package B0;

import B0.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class s {

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f657h = new Comparator() { // from class: B0.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g7;
            g7 = s.g((s.b) obj, (s.b) obj2);
            return g7;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator f658i = new Comparator() { // from class: B0.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h7;
            h7 = s.h((s.b) obj, (s.b) obj2);
            return h7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f659a;

    /* renamed from: e, reason: collision with root package name */
    public int f663e;

    /* renamed from: f, reason: collision with root package name */
    public int f664f;

    /* renamed from: g, reason: collision with root package name */
    public int f665g;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f661c = new b[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f660b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f662d = -1;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f666a;

        /* renamed from: b, reason: collision with root package name */
        public int f667b;

        /* renamed from: c, reason: collision with root package name */
        public float f668c;

        public b() {
        }
    }

    public s(int i7) {
        this.f659a = i7;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f666a - bVar2.f666a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f668c, bVar2.f668c);
    }

    public void c(int i7, float f7) {
        b bVar;
        int i8;
        b bVar2;
        int i9;
        d();
        int i10 = this.f665g;
        if (i10 > 0) {
            b[] bVarArr = this.f661c;
            int i11 = i10 - 1;
            this.f665g = i11;
            bVar = bVarArr[i11];
        } else {
            bVar = new b();
        }
        int i12 = this.f663e;
        this.f663e = i12 + 1;
        bVar.f666a = i12;
        bVar.f667b = i7;
        bVar.f668c = f7;
        this.f660b.add(bVar);
        int i13 = this.f664f + i7;
        while (true) {
            this.f664f = i13;
            while (true) {
                int i14 = this.f664f;
                int i15 = this.f659a;
                if (i14 <= i15) {
                    return;
                }
                i8 = i14 - i15;
                bVar2 = (b) this.f660b.get(0);
                i9 = bVar2.f667b;
                if (i9 <= i8) {
                    this.f664f -= i9;
                    this.f660b.remove(0);
                    int i16 = this.f665g;
                    if (i16 < 5) {
                        b[] bVarArr2 = this.f661c;
                        this.f665g = i16 + 1;
                        bVarArr2[i16] = bVar2;
                    }
                }
            }
            bVar2.f667b = i9 - i8;
            i13 = this.f664f - i8;
        }
    }

    public final void d() {
        if (this.f662d != 1) {
            Collections.sort(this.f660b, f657h);
            this.f662d = 1;
        }
    }

    public final void e() {
        if (this.f662d != 0) {
            Collections.sort(this.f660b, f658i);
            this.f662d = 0;
        }
    }

    public float f(float f7) {
        e();
        float f8 = f7 * this.f664f;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f660b.size(); i8++) {
            b bVar = (b) this.f660b.get(i8);
            i7 += bVar.f667b;
            if (i7 >= f8) {
                return bVar.f668c;
            }
        }
        if (this.f660b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f660b.get(r5.size() - 1)).f668c;
    }

    public void i() {
        this.f660b.clear();
        this.f662d = -1;
        this.f663e = 0;
        this.f664f = 0;
    }
}
