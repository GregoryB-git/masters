package G4;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2090a;

        /* renamed from: b, reason: collision with root package name */
        public int f2091b;

        /* renamed from: c, reason: collision with root package name */
        public int f2092c;

        public a(int i7, int i8, int i9) {
            this.f2090a = i7;
            this.f2091b = i8;
            this.f2092c = i9;
        }

        public a a(a aVar) {
            return new a(this.f2090a - aVar.d(), this.f2091b - aVar.c(), this.f2092c - aVar.b());
        }

        public int b() {
            return this.f2092c;
        }

        public int c() {
            return this.f2091b;
        }

        public int d() {
            return this.f2090a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i7;
        int i8;
        SparseIntArray sparseIntArray;
        int i9 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i7 = 0;
            i8 = 0;
        } else {
            int i10 = 0;
            i7 = 0;
            i8 = 0;
            while (i9 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i9);
                int valueAt = sparseIntArray.valueAt(i9);
                i10 += valueAt;
                if (keyAt > 700) {
                    i8 += valueAt;
                }
                if (keyAt > 16) {
                    i7 += valueAt;
                }
                i9++;
            }
            i9 = i10;
        }
        return new a(i9, i7, i8);
    }
}
