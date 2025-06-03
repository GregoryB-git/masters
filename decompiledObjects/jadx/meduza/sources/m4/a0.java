package m4;

import c4.a;

/* loaded from: classes.dex */
public final class a0 extends c4.a {

    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final v5.c0 f9881a;

        /* renamed from: b, reason: collision with root package name */
        public final v5.u f9882b = new v5.u();

        /* renamed from: c, reason: collision with root package name */
        public final int f9883c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9884d;

        public a(int i10, v5.c0 c0Var, int i11) {
            this.f9883c = i10;
            this.f9881a = c0Var;
            this.f9884d = i11;
        }

        @Override // c4.a.f
        public final void a() {
            v5.u uVar = this.f9882b;
            byte[] bArr = v5.e0.f;
            uVar.getClass();
            uVar.E(bArr, bArr.length);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        
            if (r13 == (-9223372036854775807L)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        
            return new c4.a.e(-2, r13, r5 + r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
        
            return c4.a.e.f2258d;
         */
        @Override // c4.a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c4.a.e b(c4.i r18, long r19) {
            /*
                r17 = this;
                r0 = r17
                long r5 = r18.getPosition()
                int r1 = r0.f9884d
                long r1 = (long) r1
                long r3 = r18.getLength()
                long r3 = r3 - r5
                long r1 = java.lang.Math.min(r1, r3)
                int r1 = (int) r1
                v5.u r2 = r0.f9882b
                r2.D(r1)
                v5.u r2 = r0.f9882b
                byte[] r2 = r2.f15974a
                r3 = 0
                r4 = r18
                r4.m(r2, r3, r1)
                v5.u r1 = r0.f9882b
                int r2 = r1.f15976c
                r3 = -1
                r9 = r3
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L2e:
                int r11 = r1.f15976c
                int r12 = r1.f15975b
                int r11 = r11 - r12
                r15 = 188(0xbc, float:2.63E-43)
                if (r11 < r15) goto L87
                byte[] r11 = r1.f15974a
            L39:
                if (r12 >= r2) goto L44
                r15 = r11[r12]
                r7 = 71
                if (r15 == r7) goto L44
                int r12 = r12 + 1
                goto L39
            L44:
                int r7 = r12 + 188
                if (r7 <= r2) goto L49
                goto L87
            L49:
                int r3 = r0.f9883c
                long r3 = b.a0.A(r12, r3, r1)
                r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
                if (r8 == 0) goto L82
                v5.c0 r8 = r0.f9881a
                long r3 = r8.b(r3)
                int r8 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
                if (r8 <= 0) goto L70
                int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r1 != 0) goto L6e
                c4.a$e r7 = new c4.a$e
                r2 = -1
                r1 = r7
                r1.<init>(r2, r3, r5)
                goto L9c
            L6e:
                long r5 = r5 + r9
                goto L7a
            L70:
                r8 = 100000(0x186a0, double:4.94066E-319)
                long r8 = r8 + r3
                int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r8 <= 0) goto L7f
                long r1 = (long) r12
                long r5 = r5 + r1
            L7a:
                c4.a$e r7 = c4.a.e.a(r5)
                goto L9c
            L7f:
                long r8 = (long) r12
                r13 = r3
                r9 = r8
            L82:
                r1.G(r7)
                long r3 = (long) r7
                goto L2e
            L87:
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r1 == 0) goto L9a
                long r15 = r5 + r3
                c4.a$e r7 = new c4.a$e
                r12 = -2
                r11 = r7
                r11.<init>(r12, r13, r15)
                goto L9c
            L9a:
                c4.a$e r7 = c4.a.e.f2258d
            L9c:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.a0.a.b(c4.i, long):c4.a$e");
        }
    }

    public a0(v5.c0 c0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, c0Var, i11), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}
