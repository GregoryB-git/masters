package m4;

import c4.a;

/* loaded from: classes.dex */
public final class u extends c4.a {

    public static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final v5.c0 f10172a;

        /* renamed from: b, reason: collision with root package name */
        public final v5.u f10173b = new v5.u();

        public a(v5.c0 c0Var) {
            this.f10172a = c0Var;
        }

        @Override // c4.a.f
        public final void a() {
            v5.u uVar = this.f10173b;
            byte[] bArr = v5.e0.f;
            uVar.getClass();
            uVar.E(bArr, bArr.length);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return c4.a.e.a(r5 + r1);
         */
        @Override // c4.a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c4.a.e b(c4.i r17, long r18) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.u.a.b(c4.i, long):c4.a$e");
        }
    }

    public u(v5.c0 c0Var, long j10, long j11) {
        super(new a.b(), new a(c0Var), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
