package b5;

import b5.f;
import c4.v;
import z4.b0;

/* loaded from: classes.dex */
public final class c implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1845a;

    /* renamed from: b, reason: collision with root package name */
    public final b0[] f1846b;

    public c(int[] iArr, b0[] b0VarArr) {
        this.f1845a = iArr;
        this.f1846b = b0VarArr;
    }

    public final v a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1845a;
            if (i11 >= iArr.length) {
                v5.m.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new c4.g();
            }
            if (i10 == iArr[i11]) {
                return this.f1846b[i11];
            }
            i11++;
        }
    }
}
