package y0;

import F0.C0369n;
import F0.T;
import x0.P;
import y0.InterfaceC2227f;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2224c implements InterfaceC2227f.b {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21230a;

    /* renamed from: b, reason: collision with root package name */
    public final P[] f21231b;

    public C2224c(int[] iArr, P[] pArr) {
        this.f21230a = iArr;
        this.f21231b = pArr;
    }

    @Override // y0.InterfaceC2227f.b
    public T a(int i7, int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = this.f21230a;
            if (i9 >= iArr.length) {
                g0.o.c("BaseMediaChunkOutput", "Unmatched track of type: " + i8);
                return new C0369n();
            }
            if (i8 == iArr[i9]) {
                return this.f21231b[i9];
            }
            i9++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f21231b.length];
        int i7 = 0;
        while (true) {
            P[] pArr = this.f21231b;
            if (i7 >= pArr.length) {
                return iArr;
            }
            iArr[i7] = pArr[i7].H();
            i7++;
        }
    }

    public void c(long j7) {
        for (P p7 : this.f21231b) {
            p7.b0(j7);
        }
    }
}
