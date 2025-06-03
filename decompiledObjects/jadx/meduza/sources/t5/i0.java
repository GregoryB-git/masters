package t5;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final b0.d f14512h = new b0.d(7);

    /* renamed from: i, reason: collision with root package name */
    public static final r5.c f14513i = new r5.c(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f14514a;

    /* renamed from: e, reason: collision with root package name */
    public int f14518e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f14519g;

    /* renamed from: c, reason: collision with root package name */
    public final a[] f14516c = new a[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f14515b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f14517d = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14520a;

        /* renamed from: b, reason: collision with root package name */
        public int f14521b;

        /* renamed from: c, reason: collision with root package name */
        public float f14522c;
    }

    public i0(int i10) {
        this.f14514a = i10;
    }

    public final void a(float f, int i10) {
        a aVar;
        if (this.f14517d != 1) {
            Collections.sort(this.f14515b, f14512h);
            this.f14517d = 1;
        }
        int i11 = this.f14519g;
        if (i11 > 0) {
            a[] aVarArr = this.f14516c;
            int i12 = i11 - 1;
            this.f14519g = i12;
            aVar = aVarArr[i12];
        } else {
            aVar = new a();
        }
        int i13 = this.f14518e;
        this.f14518e = i13 + 1;
        aVar.f14520a = i13;
        aVar.f14521b = i10;
        aVar.f14522c = f;
        this.f14515b.add(aVar);
        this.f += i10;
        while (true) {
            int i14 = this.f;
            int i15 = this.f14514a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            a aVar2 = this.f14515b.get(0);
            int i17 = aVar2.f14521b;
            if (i17 <= i16) {
                this.f -= i17;
                this.f14515b.remove(0);
                int i18 = this.f14519g;
                if (i18 < 5) {
                    a[] aVarArr2 = this.f14516c;
                    this.f14519g = i18 + 1;
                    aVarArr2[i18] = aVar2;
                }
            } else {
                aVar2.f14521b = i17 - i16;
                this.f -= i16;
            }
        }
    }

    public final float b() {
        if (this.f14517d != 0) {
            Collections.sort(this.f14515b, f14513i);
            this.f14517d = 0;
        }
        float f = 0.5f * this.f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14515b.size(); i11++) {
            a aVar = this.f14515b.get(i11);
            i10 += aVar.f14521b;
            if (i10 >= f) {
                return aVar.f14522c;
            }
        }
        if (this.f14515b.isEmpty()) {
            return Float.NaN;
        }
        return this.f14515b.get(r0.size() - 1).f14522c;
    }
}
