package lc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f9839a;

    /* renamed from: b, reason: collision with root package name */
    public int f9840b;

    /* renamed from: c, reason: collision with root package name */
    public int f9841c;

    /* renamed from: d, reason: collision with root package name */
    public int f9842d;

    /* renamed from: e, reason: collision with root package name */
    public int f9843e;

    public c(CharSequence charSequence) {
        ec.i.e(charSequence, "string");
        this.f9839a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11 = this.f9840b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f9843e < 0) {
            this.f9840b = 2;
            return false;
        }
        int i12 = -1;
        int length = this.f9839a.length();
        int length2 = this.f9839a.length();
        for (int i13 = this.f9841c; i13 < length2; i13++) {
            char charAt = this.f9839a.charAt(i13);
            if (charAt == '\n' || charAt == '\r') {
                i12 = (charAt == '\r' && (i10 = i13 + 1) < this.f9839a.length() && this.f9839a.charAt(i10) == '\n') ? 2 : 1;
                length = i13;
                this.f9840b = 1;
                this.f9843e = i12;
                this.f9842d = length;
                return true;
            }
        }
        this.f9840b = 1;
        this.f9843e = i12;
        this.f9842d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9840b = 0;
        int i10 = this.f9842d;
        int i11 = this.f9841c;
        this.f9841c = this.f9843e + i10;
        return this.f9839a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
