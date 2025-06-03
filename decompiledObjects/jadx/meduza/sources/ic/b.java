package ic;

import ec.i;
import java.util.NoSuchElementException;
import sb.l;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final int f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7951b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7952c;

    /* renamed from: d, reason: collision with root package name */
    public int f7953d;

    public b(char c10, char c11, int i10) {
        this.f7950a = i10;
        this.f7951b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? i.f(c10, c11) < 0 : i.f(c10, c11) > 0) {
            z10 = false;
        }
        this.f7952c = z10;
        this.f7953d = z10 ? c10 : c11;
    }

    @Override // sb.l
    public final char a() {
        int i10 = this.f7953d;
        if (i10 != this.f7951b) {
            this.f7953d = this.f7950a + i10;
        } else {
            if (!this.f7952c) {
                throw new NoSuchElementException();
            }
            this.f7952c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7952c;
    }
}
