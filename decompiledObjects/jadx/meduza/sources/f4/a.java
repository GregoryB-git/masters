package f4;

import c4.a;
import c4.i;
import c4.l;
import c4.o;
import v5.u;

/* loaded from: classes.dex */
public final class a extends c4.a {

    /* renamed from: f4.a$a, reason: collision with other inner class name */
    public static final class C0080a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final o f5331a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5332b;

        /* renamed from: c, reason: collision with root package name */
        public final l.a f5333c = new l.a();

        public C0080a(o oVar, int i10) {
            this.f5331a = oVar;
            this.f5332b = i10;
        }

        @Override // c4.a.f
        public final /* synthetic */ void a() {
        }

        @Override // c4.a.f
        public final a.e b(i iVar, long j10) {
            long position = iVar.getPosition();
            long c10 = c(iVar);
            long d10 = iVar.d();
            iVar.e(Math.max(6, this.f5331a.f2294c));
            long c11 = c(iVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? new a.e(-2, c11, iVar.d()) : new a.e(-1, c10, position) : a.e.a(d10);
        }

        public final long c(i iVar) {
            while (iVar.d() < iVar.getLength() - 6) {
                o oVar = this.f5331a;
                int i10 = this.f5332b;
                l.a aVar = this.f5333c;
                long d10 = iVar.d();
                int i11 = 2;
                byte[] bArr = new byte[2];
                int i12 = 0;
                boolean a10 = false;
                iVar.m(bArr, 0, 2);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                    iVar.i();
                    iVar.e((int) (d10 - iVar.getPosition()));
                } else {
                    u uVar = new u(16);
                    System.arraycopy(bArr, 0, uVar.f15974a, 0, 2);
                    byte[] bArr2 = uVar.f15974a;
                    while (i12 < 14) {
                        int g10 = iVar.g(bArr2, i11 + i12, 14 - i12);
                        if (g10 == -1) {
                            break;
                        }
                        i12 += g10;
                        i11 = 2;
                    }
                    uVar.F(i12);
                    iVar.i();
                    iVar.e((int) (d10 - iVar.getPosition()));
                    a10 = l.a(uVar, oVar, i10, aVar);
                }
                if (a10) {
                    break;
                }
                iVar.e(1);
            }
            if (iVar.d() < iVar.getLength() - 6) {
                return this.f5333c.f2289a;
            }
            iVar.e((int) (iVar.getLength() - iVar.d()));
            return this.f5331a.f2300j;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(c4.o r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            aa.m0 r1 = new aa.m0
            r2 = 5
            r1.<init>(r15, r2)
            f4.a$a r2 = new f4.a$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.f2300j
            int r7 = r0.f2295d
            if (r7 <= 0) goto L26
            long r7 = (long) r7
            int r9 = r0.f2294c
            long r9 = (long) r9
            long r7 = r7 + r9
            r9 = 2
            long r7 = r7 / r9
            r9 = 1
            goto L3f
        L26:
            int r7 = r0.f2292a
            int r8 = r0.f2293b
            if (r7 != r8) goto L30
            if (r7 <= 0) goto L30
            long r7 = (long) r7
            goto L32
        L30:
            r7 = 4096(0x1000, double:2.0237E-320)
        L32:
            int r9 = r0.f2297g
            long r9 = (long) r9
            long r7 = r7 * r9
            int r9 = r0.f2298h
            long r9 = (long) r9
            long r7 = r7 * r9
            r9 = 8
            long r7 = r7 / r9
            r9 = 64
        L3f:
            long r11 = r7 + r9
            r7 = 6
            int r0 = r0.f2294c
            int r13 = java.lang.Math.max(r7, r0)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.<init>(c4.o, int, long, long):void");
    }
}
