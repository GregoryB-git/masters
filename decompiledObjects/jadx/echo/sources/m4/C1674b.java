package m4;

import java.io.OutputStream;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674b extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    public long f17749o = 0;

    public long a() {
        return this.f17749o;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.f17749o++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f17749o += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > bArr.length || i8 < 0 || (i9 = i7 + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f17749o += i8;
    }
}
