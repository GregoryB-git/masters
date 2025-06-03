package m0;

import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f17520d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f17521e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f17522a = InterfaceC1240b.f13675a;

    /* renamed from: c, reason: collision with root package name */
    public int f17524c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f17523b = 2;

    public void a(j0.i iVar, List list) {
        AbstractC1297a.e(iVar.f15400r);
        if (iVar.f15400r.limit() - iVar.f15400r.position() == 0) {
            return;
        }
        this.f17522a = b(iVar.f15400r, (this.f17523b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        iVar.m();
        iVar.z(this.f17522a.remaining());
        iVar.f15400r.put(this.f17522a);
        iVar.C();
    }

    public final ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i7;
        int x7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = (i8 + 255) / 255;
        int i10 = i9 + 27 + i8;
        if (this.f17523b == 2) {
            int length = bArr != null ? bArr.length + 28 : f17520d.length;
            i10 += f17521e.length + length;
            i7 = length;
        } else {
            i7 = 0;
        }
        ByteBuffer c7 = c(i10);
        if (this.f17523b == 2) {
            if (bArr != null) {
                e(c7, bArr);
            } else {
                c7.put(f17520d);
            }
            c7.put(f17521e);
        }
        int j7 = this.f17524c + F0.K.j(byteBuffer);
        this.f17524c = j7;
        f(c7, j7, this.f17523b, i9, false);
        for (int i11 = 0; i11 < i9; i11++) {
            if (i8 >= 255) {
                c7.put((byte) -1);
                i8 -= 255;
            } else {
                c7.put((byte) i8);
                i8 = 0;
            }
        }
        while (position < limit) {
            c7.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        c7.flip();
        int i12 = 22;
        if (this.f17523b == 2) {
            byte[] array = c7.array();
            int arrayOffset = c7.arrayOffset() + i7;
            byte[] bArr2 = f17521e;
            x7 = g0.M.x(array, arrayOffset + bArr2.length, c7.limit() - c7.position(), 0);
            i12 = i7 + bArr2.length + 22;
        } else {
            x7 = g0.M.x(c7.array(), c7.arrayOffset(), c7.limit() - c7.position(), 0);
        }
        c7.putInt(i12, x7);
        this.f17523b++;
        return c7;
    }

    public final ByteBuffer c(int i7) {
        if (this.f17522a.capacity() < i7) {
            this.f17522a = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f17522a.clear();
        }
        return this.f17522a;
    }

    public void d() {
        this.f17522a = InterfaceC1240b.f13675a;
        this.f17524c = 0;
        this.f17523b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(a3.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, g0.M.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long j7, int i7, int i8, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z7 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        byteBuffer.put(a3.i.a(i8));
    }
}
