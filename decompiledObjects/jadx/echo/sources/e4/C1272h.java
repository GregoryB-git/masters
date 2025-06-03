package e4;

import e4.AbstractC1265a;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: e4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1272h {

    /* renamed from: b, reason: collision with root package name */
    public C1267c f13988b;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1265a.b f13991e;

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f13987a = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1268d f13989c = null;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13990d = new byte[112];

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f13992f = false;

    public C1272h(C1267c c1267c) {
        this.f13988b = null;
        this.f13988b = c1267c;
    }

    public final void a(boolean z7, byte b7, byte[] bArr) {
        if (b7 == 9) {
            if (!z7) {
                throw new C1269e("PING must not fragment across frames");
            }
            c(bArr);
            return;
        }
        AbstractC1265a.b bVar = this.f13991e;
        if (bVar != null && b7 != 0) {
            throw new C1269e("Failed to continue outstanding frame");
        }
        if (bVar == null && b7 == 0) {
            throw new C1269e("Received continuing frame, but there's nothing to continue");
        }
        if (bVar == null) {
            this.f13991e = AbstractC1265a.a(b7);
        }
        if (!this.f13991e.a(bArr)) {
            throw new C1269e("Failed to decode frame");
        }
        if (z7) {
            C1271g b8 = this.f13991e.b();
            this.f13991e = null;
            if (b8 == null) {
                throw new C1269e("Failed to decode whole message");
            }
            this.f13989c.f(b8);
        }
    }

    public final void b(C1269e c1269e) {
        h();
        this.f13988b.k(c1269e);
    }

    public final void c(byte[] bArr) {
        if (bArr.length > 125) {
            throw new C1269e("PING frame too long");
        }
        this.f13988b.m(bArr);
    }

    public final long d(byte[] bArr, int i7) {
        return (bArr[i7] << 56) + ((bArr[i7 + 1] & 255) << 48) + ((bArr[i7 + 2] & 255) << 40) + ((bArr[i7 + 3] & 255) << 32) + ((bArr[i7 + 4] & 255) << 24) + ((bArr[i7 + 5] & 255) << 16) + ((bArr[i7 + 6] & 255) << 8) + (bArr[i7 + 7] & 255);
    }

    public final int e(byte[] bArr, int i7, int i8) {
        this.f13987a.readFully(bArr, i7, i8);
        return i8;
    }

    public void f() {
        int e7;
        byte[] bArr;
        byte b7;
        boolean z7;
        long d7;
        this.f13989c = this.f13988b.g();
        while (!this.f13992f) {
            try {
                e7 = e(this.f13990d, 0, 1);
                bArr = this.f13990d;
                b7 = bArr[0];
                z7 = (b7 & 128) != 0;
            } catch (C1269e e8) {
                b(e8);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e9) {
                b(new C1269e("IO Error", e9));
            }
            if ((b7 & 112) != 0) {
                throw new C1269e("Invalid frame received");
            }
            byte b8 = (byte) (b7 & 15);
            int e10 = e7 + e(bArr, e7, 1);
            byte[] bArr2 = this.f13990d;
            byte b9 = bArr2[1];
            if (b9 < 126) {
                d7 = b9;
            } else if (b9 == 126) {
                e(bArr2, e10, 2);
                byte[] bArr3 = this.f13990d;
                d7 = ((bArr3[2] & 255) << 8) | (bArr3[3] & 255);
            } else {
                d7 = b9 == Byte.MAX_VALUE ? d(this.f13990d, (e10 + e(bArr2, e10, 8)) - 8) : 0L;
            }
            int i7 = (int) d7;
            byte[] bArr4 = new byte[i7];
            e(bArr4, 0, i7);
            if (b8 == 8) {
                this.f13988b.l();
            } else if (b8 != 10) {
                if (b8 != 1 && b8 != 2 && b8 != 9 && b8 != 0) {
                    throw new C1269e("Unsupported opcode: " + ((int) b8));
                }
                a(z7, b8, bArr4);
            }
        }
    }

    public void g(DataInputStream dataInputStream) {
        this.f13987a = dataInputStream;
    }

    public void h() {
        this.f13992f = true;
    }
}
