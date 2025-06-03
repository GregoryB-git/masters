package lb;

import eb.j0;
import eb.t;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import ma.b1;
import ma.k;
import ma.o;
import ma.s0;

/* loaded from: classes.dex */
public final class a extends InputStream implements t, j0 {

    /* renamed from: a, reason: collision with root package name */
    public s0 f9821a;

    /* renamed from: b, reason: collision with root package name */
    public final b1<?> f9822b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f9823c;

    public a(s0 s0Var, b1<?> b1Var) {
        this.f9821a = s0Var;
        this.f9822b = b1Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        s0 s0Var = this.f9821a;
        if (s0Var != null) {
            return s0Var.d();
        }
        ByteArrayInputStream byteArrayInputStream = this.f9823c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // eb.t
    public final int f(OutputStream outputStream) {
        s0 s0Var = this.f9821a;
        if (s0Var != null) {
            int d10 = s0Var.d();
            this.f9821a.g(outputStream);
            this.f9821a = null;
            return d10;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9823c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        o oVar = b.f9824a;
        x6.b.y(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i10 = (int) j10;
                this.f9823c = null;
                return i10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9821a != null) {
            this.f9823c = new ByteArrayInputStream(this.f9821a.j());
            this.f9821a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9823c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        s0 s0Var = this.f9821a;
        if (s0Var != null) {
            int d10 = s0Var.d();
            if (d10 == 0) {
                this.f9821a = null;
                this.f9823c = null;
                return -1;
            }
            if (i11 >= d10) {
                Logger logger = k.f11018c;
                k.b bVar = new k.b(bArr, i10, d10);
                this.f9821a.i(bVar);
                if (bVar.p0() != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                this.f9821a = null;
                this.f9823c = null;
                return d10;
            }
            this.f9823c = new ByteArrayInputStream(this.f9821a.j());
            this.f9821a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9823c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
