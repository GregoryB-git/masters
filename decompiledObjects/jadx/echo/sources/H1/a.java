package H1;

import W5.C0681k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0035a f2163d = new C0035a(null);

    /* renamed from: a, reason: collision with root package name */
    public int[] f2164a;

    /* renamed from: b, reason: collision with root package name */
    public int f2165b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2166c;

    /* renamed from: H1.a$a, reason: collision with other inner class name */
    public static final class C0035a {
        public C0035a() {
        }

        public /* synthetic */ C0035a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int b(int[] iArr) {
            int j7;
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i7 = iArr[0];
            j7 = C0681k.j(iArr);
            int i8 = 1;
            if (1 <= j7) {
                while (true) {
                    i7 *= iArr[i8];
                    if (i8 == j7) {
                        break;
                    }
                    i8++;
                }
            }
            return i7;
        }
    }

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f2164a = shape;
        int b7 = f2163d.b(shape);
        this.f2165b = b7;
        this.f2166c = new float[b7];
    }

    public final float[] a() {
        return this.f2166c;
    }

    public final int b(int i7) {
        return this.f2164a[i7];
    }

    public final int c() {
        return this.f2164a.length;
    }

    public final void d(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f2164a = shape;
        int b7 = f2163d.b(shape);
        float[] fArr = new float[b7];
        System.arraycopy(this.f2166c, 0, fArr, 0, Math.min(this.f2165b, b7));
        this.f2166c = fArr;
        this.f2165b = b7;
    }
}
