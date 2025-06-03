package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;

/* renamed from: R2.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0495d4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f5252o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C3 f5253p;

    public RunnableC0495d4(C3 c32, InterfaceC1071y0 interfaceC1071y0) {
        this.f5253p = c32;
        this.f5252o = interfaceC1071y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            R2.C3 r0 = r7.f5253p
            R2.l5 r0 = r0.u()
            boolean r1 = com.google.android.gms.internal.measurement.C1015r7.a()
            r2 = 0
            if (r1 == 0) goto L68
            R2.g r1 = r0.f()
            R2.P1 r3 = R2.K.f4773D0
            boolean r1 = r1.s(r3)
            if (r1 == 0) goto L68
            R2.l2 r1 = r0.i()
            R2.q3 r1 = r1.J()
            boolean r1 = r1.y()
            if (r1 != 0) goto L36
            R2.Y1 r0 = r0.j()
            R2.a2 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
        L31:
            r0.a(r1)
        L34:
            r0 = r2
            goto L73
        L36:
            R2.l2 r1 = r0.i()
            E2.e r3 = r0.b()
            long r3 = r3.a()
            boolean r1 = r1.y(r3)
            if (r1 != 0) goto L34
            R2.l2 r1 = r0.i()
            R2.q2 r1 = r1.f5400q
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            goto L34
        L59:
            R2.l2 r0 = r0.i()
            R2.q2 r0 = r0.f5400q
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L73
        L68:
            R2.Y1 r0 = r0.j()
            R2.a2 r0 = r0.M()
            java.lang.String r1 = "getSessionId has been disabled."
            goto L31
        L73:
            if (r0 == 0) goto L87
            R2.C3 r1 = r7.f5253p
            R2.N2 r1 = r1.f5424a
            R2.S5 r1 = r1.L()
            com.google.android.gms.internal.measurement.y0 r2 = r7.f5252o
            long r3 = r0.longValue()
            r1.T(r2, r3)
            return
        L87:
            com.google.android.gms.internal.measurement.y0 r0 = r7.f5252o     // Catch: android.os.RemoteException -> L8d
            r0.l(r2)     // Catch: android.os.RemoteException -> L8d
            return
        L8d:
            r0 = move-exception
            R2.C3 r1 = r7.f5253p
            R2.N2 r1 = r1.f5424a
            R2.Y1 r1 = r1.j()
            R2.a2 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.RunnableC0495d4.run():void");
    }
}
