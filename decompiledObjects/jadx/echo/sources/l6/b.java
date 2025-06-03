package l6;

import W5.B;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends B {

    /* renamed from: o, reason: collision with root package name */
    public final int f17301o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17302p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17303q;

    /* renamed from: r, reason: collision with root package name */
    public int f17304r;

    public b(int i7, int i8, int i9) {
        this.f17301o = i9;
        this.f17302p = i8;
        boolean z7 = true;
        if (i9 <= 0 ? i7 < i8 : i7 > i8) {
            z7 = false;
        }
        this.f17303q = z7;
        this.f17304r = z7 ? i7 : i8;
    }

    @Override // W5.B
    public int b() {
        int i7 = this.f17304r;
        if (i7 != this.f17302p) {
            this.f17304r = this.f17301o + i7;
        } else {
            if (!this.f17303q) {
                throw new NoSuchElementException();
            }
            this.f17303q = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17303q;
    }
}
