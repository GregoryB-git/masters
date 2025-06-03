package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034u implements InterfaceC1016s, Iterable {

    /* renamed from: o, reason: collision with root package name */
    public final String f11174o;

    public C1034u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f11174o = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return new C1034u(this.f11174o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.valueOf(!this.f11174o.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1034u) {
            return this.f11174o.equals(((C1034u) obj).f11174o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        double d7;
        if (this.f11174o.isEmpty()) {
            d7 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f11174o);
            } catch (NumberFormatException unused) {
                d7 = Double.NaN;
            }
        }
        return Double.valueOf(d7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        return this.f11174o;
    }

    public final int hashCode() {
        return this.f11174o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1052w(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return new C1061x(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1016s s(java.lang.String r20, com.google.android.gms.internal.measurement.C0904f3 r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1034u.s(java.lang.String, com.google.android.gms.internal.measurement.f3, java.util.List):com.google.android.gms.internal.measurement.s");
    }

    public final String toString() {
        return "\"" + this.f11174o + "\"";
    }
}
