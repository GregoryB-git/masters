package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945k implements InterfaceC1016s {

    /* renamed from: o, reason: collision with root package name */
    public final Double f11007o;

    public C0945k(Double d7) {
        if (d7 == null) {
            this.f11007o = Double.valueOf(Double.NaN);
        } else {
            this.f11007o = d7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return new C0945k(this.f11007o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Boolean d() {
        return Boolean.valueOf((Double.isNaN(this.f11007o.doubleValue()) || this.f11007o.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0945k) {
            return this.f11007o.equals(((C0945k) obj).f11007o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Double f() {
        return this.f11007o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final String g() {
        if (Double.isNaN(this.f11007o.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f11007o.doubleValue())) {
            return this.f11007o.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f11007o.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : AbstractC0936j.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.f11007o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        if ("toString".equals(str)) {
            return new C1034u(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
