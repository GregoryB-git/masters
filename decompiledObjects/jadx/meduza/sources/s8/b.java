package s8;

import tc.h;

/* loaded from: classes.dex */
public final class b implements c, h {

    /* renamed from: a, reason: collision with root package name */
    public final int f14273a;

    @Override // tc.h
    public void a() {
    }

    @Override // s8.c
    public StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f14273a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }

    @Override // tc.h
    public int c() {
        return this.f14273a;
    }
}
