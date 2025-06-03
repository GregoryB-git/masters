package X0;

import F0.InterfaceC0373s;
import d0.C1162A;
import g0.AbstractC1297a;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6897a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6898b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final g f6899c = new g();

    /* renamed from: d, reason: collision with root package name */
    public X0.b f6900d;

    /* renamed from: e, reason: collision with root package name */
    public int f6901e;

    /* renamed from: f, reason: collision with root package name */
    public int f6902f;

    /* renamed from: g, reason: collision with root package name */
    public long f6903g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6904a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6905b;

        public b(int i7, long j7) {
            this.f6904a = i7;
            this.f6905b = j7;
        }
    }

    public static String g(InterfaceC0373s interfaceC0373s, int i7) {
        if (i7 == 0) {
            return "";
        }
        byte[] bArr = new byte[i7];
        interfaceC0373s.readFully(bArr, 0, i7);
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        return new String(bArr, 0, i7);
    }

    public final long a(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.h();
        while (true) {
            interfaceC0373s.n(this.f6897a, 0, 4);
            int c7 = g.c(this.f6897a[0]);
            if (c7 != -1 && c7 <= 4) {
                int a7 = (int) g.a(this.f6897a, c7, false);
                if (this.f6900d.d(a7)) {
                    interfaceC0373s.i(c7);
                    return a7;
                }
            }
            interfaceC0373s.i(1);
        }
    }

    @Override // X0.c
    public void b() {
        this.f6901e = 0;
        this.f6898b.clear();
        this.f6899c.e();
    }

    @Override // X0.c
    public boolean c(InterfaceC0373s interfaceC0373s) {
        AbstractC1297a.h(this.f6900d);
        while (true) {
            b bVar = (b) this.f6898b.peek();
            if (bVar != null && interfaceC0373s.p() >= bVar.f6905b) {
                this.f6900d.a(((b) this.f6898b.pop()).f6904a);
                return true;
            }
            if (this.f6901e == 0) {
                long d7 = this.f6899c.d(interfaceC0373s, true, false, 4);
                if (d7 == -2) {
                    d7 = a(interfaceC0373s);
                }
                if (d7 == -1) {
                    return false;
                }
                this.f6902f = (int) d7;
                this.f6901e = 1;
            }
            if (this.f6901e == 1) {
                this.f6903g = this.f6899c.d(interfaceC0373s, false, true, 8);
                this.f6901e = 2;
            }
            int b7 = this.f6900d.b(this.f6902f);
            if (b7 != 0) {
                if (b7 == 1) {
                    long p7 = interfaceC0373s.p();
                    this.f6898b.push(new b(this.f6902f, this.f6903g + p7));
                    this.f6900d.g(this.f6902f, p7, this.f6903g);
                    this.f6901e = 0;
                    return true;
                }
                if (b7 == 2) {
                    long j7 = this.f6903g;
                    if (j7 <= 8) {
                        this.f6900d.h(this.f6902f, f(interfaceC0373s, (int) j7));
                        this.f6901e = 0;
                        return true;
                    }
                    throw C1162A.a("Invalid integer size: " + this.f6903g, null);
                }
                if (b7 == 3) {
                    long j8 = this.f6903g;
                    if (j8 <= 2147483647L) {
                        this.f6900d.f(this.f6902f, g(interfaceC0373s, (int) j8));
                        this.f6901e = 0;
                        return true;
                    }
                    throw C1162A.a("String element size: " + this.f6903g, null);
                }
                if (b7 == 4) {
                    this.f6900d.e(this.f6902f, (int) this.f6903g, interfaceC0373s);
                    this.f6901e = 0;
                    return true;
                }
                if (b7 != 5) {
                    throw C1162A.a("Invalid element type " + b7, null);
                }
                long j9 = this.f6903g;
                if (j9 == 4 || j9 == 8) {
                    this.f6900d.c(this.f6902f, e(interfaceC0373s, (int) j9));
                    this.f6901e = 0;
                    return true;
                }
                throw C1162A.a("Invalid float size: " + this.f6903g, null);
            }
            interfaceC0373s.i((int) this.f6903g);
            this.f6901e = 0;
        }
    }

    @Override // X0.c
    public void d(X0.b bVar) {
        this.f6900d = bVar;
    }

    public final double e(InterfaceC0373s interfaceC0373s, int i7) {
        return i7 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(f(interfaceC0373s, i7));
    }

    public final long f(InterfaceC0373s interfaceC0373s, int i7) {
        interfaceC0373s.readFully(this.f6897a, 0, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (this.f6897a[i8] & 255);
        }
        return j7;
    }
}
