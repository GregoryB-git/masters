package gb;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6853a = new b(new byte[0], 0, 0);

    public static final class a extends InputStream implements eb.j0 {

        /* renamed from: a, reason: collision with root package name */
        public u2 f6854a;

        public a(u2 u2Var) {
            x6.b.y(u2Var, "buffer");
            this.f6854a = u2Var;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f6854a.b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f6854a.close();
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            this.f6854a.Z();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.f6854a.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f6854a.b() == 0) {
                return -1;
            }
            return this.f6854a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            if (this.f6854a.b() == 0) {
                return -1;
            }
            int min = Math.min(this.f6854a.b(), i11);
            this.f6854a.U(bArr, i10, min);
            return min;
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.f6854a.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            int min = (int) Math.min(this.f6854a.b(), j10);
            this.f6854a.skipBytes(min);
            return min;
        }
    }

    public static class b extends gb.b {

        /* renamed from: a, reason: collision with root package name */
        public int f6855a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6856b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f6857c;

        /* renamed from: d, reason: collision with root package name */
        public int f6858d = -1;

        public b(byte[] bArr, int i10, int i11) {
            x6.b.s("offset must be >= 0", i10 >= 0);
            x6.b.s("length must be >= 0", i11 >= 0);
            int i12 = i11 + i10;
            x6.b.s("offset + length exceeds array boundary", i12 <= bArr.length);
            this.f6857c = bArr;
            this.f6855a = i10;
            this.f6856b = i12;
        }

        @Override // gb.u2
        public final void U(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f6857c, this.f6855a, bArr, i10, i11);
            this.f6855a += i11;
        }

        @Override // gb.b, gb.u2
        public final void Z() {
            this.f6858d = this.f6855a;
        }

        @Override // gb.u2
        public final int b() {
            return this.f6856b - this.f6855a;
        }

        @Override // gb.u2
        public final void m0(OutputStream outputStream, int i10) {
            f(i10);
            outputStream.write(this.f6857c, this.f6855a, i10);
            this.f6855a += i10;
        }

        @Override // gb.u2
        public final u2 r(int i10) {
            f(i10);
            int i11 = this.f6855a;
            this.f6855a = i11 + i10;
            return new b(this.f6857c, i11, i10);
        }

        @Override // gb.u2
        public final int readUnsignedByte() {
            f(1);
            byte[] bArr = this.f6857c;
            int i10 = this.f6855a;
            this.f6855a = i10 + 1;
            return bArr[i10] & 255;
        }

        @Override // gb.b, gb.u2
        public final void reset() {
            int i10 = this.f6858d;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f6855a = i10;
        }

        @Override // gb.u2
        public final void skipBytes(int i10) {
            f(i10);
            this.f6855a += i10;
        }

        @Override // gb.u2
        public final void v0(ByteBuffer byteBuffer) {
            x6.b.y(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            f(remaining);
            byteBuffer.put(this.f6857c, this.f6855a, remaining);
            this.f6855a += remaining;
        }
    }
}
