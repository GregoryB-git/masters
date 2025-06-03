package e0;

import e0.InterfaceC1240b;

/* loaded from: classes.dex */
public final class g extends d {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e4->B:43:0x00e6, LOOP_START, PHI: r0
      0x00e4: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e0.InterfaceC1240b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.f(java.nio.ByteBuffer):void");
    }

    @Override // e0.d
    public InterfaceC1240b.a i(InterfaceC1240b.a aVar) {
        int i7 = aVar.f13679c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4) {
            return i7 != 2 ? new InterfaceC1240b.a(aVar.f13677a, aVar.f13678b, 2) : InterfaceC1240b.a.f13676e;
        }
        throw new InterfaceC1240b.C0195b(aVar);
    }
}
