package z4;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface e0 {

    public static class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final Random f17620a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f17621b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f17622c;

        public a() {
            this(new Random());
        }

        public a(Random random) {
            this(new int[0], random);
        }

        public a(int[] iArr, Random random) {
            this.f17621b = iArr;
            this.f17620a = random;
            this.f17622c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f17622c[iArr[i10]] = i10;
            }
        }

        @Override // z4.e0
        public final a a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f17621b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f17621b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f17620a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // z4.e0
        public final int b() {
            int[] iArr = this.f17621b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // z4.e0
        public final int c(int i10) {
            int i11 = this.f17622c[i10] - 1;
            if (i11 >= 0) {
                return this.f17621b[i11];
            }
            return -1;
        }

        @Override // z4.e0
        public final int d(int i10) {
            int i11 = this.f17622c[i10] + 1;
            int[] iArr = this.f17621b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // z4.e0
        public final a e(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f17620a.nextInt(this.f17621b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f17620a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f17621b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f17621b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f17620a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // z4.e0
        public final int f() {
            int[] iArr = this.f17621b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // z4.e0
        public final a g() {
            return new a(new Random(this.f17620a.nextLong()));
        }

        @Override // z4.e0
        public final int getLength() {
            return this.f17621b.length;
        }
    }

    a a(int i10, int i11);

    int b();

    int c(int i10);

    int d(int i10);

    a e(int i10, int i11);

    int f();

    a g();

    int getLength();
}
