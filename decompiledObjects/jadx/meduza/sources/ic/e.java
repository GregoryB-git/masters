package ic;

import java.util.NoSuchElementException;
import sb.w;

/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f7957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7958b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7959c;

    /* renamed from: d, reason: collision with root package name */
    public int f7960d;

    public e(int i10, int i11, int i12) {
        this.f7957a = i12;
        this.f7958b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f7959c = z10;
        this.f7960d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7959c;
    }

    @Override // sb.w
    public final int nextInt() {
        int i10 = this.f7960d;
        if (i10 != this.f7958b) {
            this.f7960d = this.f7957a + i10;
        } else {
            if (!this.f7959c) {
                throw new NoSuchElementException();
            }
            this.f7959c = false;
        }
        return i10;
    }
}
