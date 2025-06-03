package x0;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public interface T {

    public static class a implements T {

        /* renamed from: a, reason: collision with root package name */
        public final Random f20665a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f20666b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f20667c;

        public a(int i7) {
            this(i7, new Random());
        }

        public static int[] i(int i7, Random random) {
            int[] iArr = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                int nextInt = random.nextInt(i9);
                iArr[i8] = iArr[nextInt];
                iArr[nextInt] = i8;
                i8 = i9;
            }
            return iArr;
        }

        @Override // x0.T
        public int a() {
            return this.f20666b.length;
        }

        @Override // x0.T
        public T b(int i7, int i8) {
            int i9 = i8 - i7;
            int[] iArr = new int[this.f20666b.length - i9];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.f20666b;
                if (i10 >= iArr2.length) {
                    return new a(iArr, new Random(this.f20665a.nextLong()));
                }
                int i12 = iArr2[i10];
                if (i12 < i7 || i12 >= i8) {
                    int i13 = i10 - i11;
                    if (i12 >= i7) {
                        i12 -= i9;
                    }
                    iArr[i13] = i12;
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // x0.T
        public int c(int i7) {
            int i8 = this.f20667c[i7] + 1;
            int[] iArr = this.f20666b;
            if (i8 < iArr.length) {
                return iArr[i8];
            }
            return -1;
        }

        @Override // x0.T
        public T d(int i7, int i8) {
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int i9 = 0;
            int i10 = 0;
            while (i10 < i8) {
                iArr[i10] = this.f20665a.nextInt(this.f20666b.length + 1);
                int i11 = i10 + 1;
                int nextInt = this.f20665a.nextInt(i11);
                iArr2[i10] = iArr2[nextInt];
                iArr2[nextInt] = i10 + i7;
                i10 = i11;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f20666b.length + i8];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f20666b;
                if (i9 >= iArr4.length + i8) {
                    return new a(iArr3, new Random(this.f20665a.nextLong()));
                }
                if (i12 >= i8 || i13 != iArr[i12]) {
                    int i14 = i13 + 1;
                    int i15 = iArr4[i13];
                    iArr3[i9] = i15;
                    if (i15 >= i7) {
                        iArr3[i9] = i15 + i8;
                    }
                    i13 = i14;
                } else {
                    iArr3[i9] = iArr2[i12];
                    i12++;
                }
                i9++;
            }
        }

        @Override // x0.T
        public int e() {
            int[] iArr = this.f20666b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // x0.T
        public int f(int i7) {
            int i8 = this.f20667c[i7] - 1;
            if (i8 >= 0) {
                return this.f20666b[i8];
            }
            return -1;
        }

        @Override // x0.T
        public int g() {
            int[] iArr = this.f20666b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // x0.T
        public T h() {
            return new a(0, new Random(this.f20665a.nextLong()));
        }

        public a(int i7, Random random) {
            this(i(i7, random), random);
        }

        public a(int[] iArr, long j7) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j7));
        }

        public a(int[] iArr, Random random) {
            this.f20666b = iArr;
            this.f20665a = random;
            this.f20667c = new int[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                this.f20667c[iArr[i7]] = i7;
            }
        }
    }

    int a();

    T b(int i7, int i8);

    int c(int i7);

    T d(int i7, int i8);

    int e();

    int f(int i7);

    int g();

    T h();
}
