package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class D extends A {
    public D() {
        this.f10287a.add(Z.EQUALS);
        this.f10287a.add(Z.GREATER_THAN);
        this.f10287a.add(Z.GREATER_THAN_EQUALS);
        this.f10287a.add(Z.IDENTITY_EQUALS);
        this.f10287a.add(Z.IDENTITY_NOT_EQUALS);
        this.f10287a.add(Z.LESS_THAN);
        this.f10287a.add(Z.LESS_THAN_EQUALS);
        this.f10287a.add(Z.NOT_EQUALS);
    }

    public static boolean c(InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        InterfaceC1016s c0945k;
        InterfaceC1016s c0945k2;
        while (!interfaceC1016s.getClass().equals(interfaceC1016s2.getClass())) {
            if (((interfaceC1016s instanceof C1078z) || (interfaceC1016s instanceof C0999q)) && ((interfaceC1016s2 instanceof C1078z) || (interfaceC1016s2 instanceof C0999q))) {
                return true;
            }
            boolean z7 = interfaceC1016s instanceof C0945k;
            if (z7 && (interfaceC1016s2 instanceof C1034u)) {
                c0945k2 = new C0945k(interfaceC1016s2.f());
            } else {
                boolean z8 = interfaceC1016s instanceof C1034u;
                if (z8 && (interfaceC1016s2 instanceof C0945k)) {
                    c0945k = new C0945k(interfaceC1016s.f());
                } else if (interfaceC1016s instanceof C0918h) {
                    c0945k = new C0945k(interfaceC1016s.f());
                } else if (interfaceC1016s2 instanceof C0918h) {
                    c0945k2 = new C0945k(interfaceC1016s2.f());
                } else if ((z8 || z7) && (interfaceC1016s2 instanceof InterfaceC0963m)) {
                    c0945k2 = new C1034u(interfaceC1016s2.g());
                } else {
                    if (!(interfaceC1016s instanceof InterfaceC0963m) || (!(interfaceC1016s2 instanceof C1034u) && !(interfaceC1016s2 instanceof C0945k))) {
                        return false;
                    }
                    c0945k = new C1034u(interfaceC1016s.g());
                }
                interfaceC1016s = c0945k;
            }
            interfaceC1016s2 = c0945k2;
        }
        if ((interfaceC1016s instanceof C1078z) || (interfaceC1016s instanceof C0999q)) {
            return true;
        }
        return interfaceC1016s instanceof C0945k ? (Double.isNaN(interfaceC1016s.f().doubleValue()) || Double.isNaN(interfaceC1016s2.f().doubleValue()) || interfaceC1016s.f().doubleValue() != interfaceC1016s2.f().doubleValue()) ? false : true : interfaceC1016s instanceof C1034u ? interfaceC1016s.g().equals(interfaceC1016s2.g()) : interfaceC1016s instanceof C0918h ? interfaceC1016s.d().equals(interfaceC1016s2.d()) : interfaceC1016s == interfaceC1016s2;
    }

    public static boolean d(InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        if (interfaceC1016s instanceof InterfaceC0963m) {
            interfaceC1016s = new C1034u(interfaceC1016s.g());
        }
        if (interfaceC1016s2 instanceof InterfaceC0963m) {
            interfaceC1016s2 = new C1034u(interfaceC1016s2.g());
        }
        if ((interfaceC1016s instanceof C1034u) && (interfaceC1016s2 instanceof C1034u)) {
            return interfaceC1016s.g().compareTo(interfaceC1016s2.g()) < 0;
        }
        double doubleValue = interfaceC1016s.f().doubleValue();
        double doubleValue2 = interfaceC1016s2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == -0.0d) || ((doubleValue == -0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        if (interfaceC1016s instanceof InterfaceC0963m) {
            interfaceC1016s = new C1034u(interfaceC1016s.g());
        }
        if (interfaceC1016s2 instanceof InterfaceC0963m) {
            interfaceC1016s2 = new C1034u(interfaceC1016s2.g());
        }
        return (((interfaceC1016s instanceof C1034u) && (interfaceC1016s2 instanceof C1034u)) || !(Double.isNaN(interfaceC1016s.f().doubleValue()) || Double.isNaN(interfaceC1016s2.f().doubleValue()))) && !d(interfaceC1016s2, interfaceC1016s);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1016s b(java.lang.String r4, com.google.android.gms.internal.measurement.C0904f3 r5, java.util.List r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.C2.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.C2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC1016s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC1016s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f10381a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.C2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.C2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.C2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC1016s.f11138i
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC1016s.f11139j
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.f3, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
