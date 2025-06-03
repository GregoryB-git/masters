package R2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC0856a0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class T1 extends com.google.android.gms.internal.measurement.Y implements R1 {
    public T1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // R2.R1
    public final void D0(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        v(18, n7);
    }

    @Override // R2.R1
    public final List F(W5 w52, Bundle bundle) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        AbstractC0856a0.d(n7, bundle);
        Parcel o7 = o(24, n7);
        ArrayList createTypedArrayList = o7.createTypedArrayList(C0621v5.CREATOR);
        o7.recycle();
        return createTypedArrayList;
    }

    @Override // R2.R1
    public final String G(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        Parcel o7 = o(11, n7);
        String readString = o7.readString();
        o7.recycle();
        return readString;
    }

    @Override // R2.R1
    public final void I0(long j7, String str, String str2, String str3) {
        Parcel n7 = n();
        n7.writeLong(j7);
        n7.writeString(str);
        n7.writeString(str2);
        n7.writeString(str3);
        v(10, n7);
    }

    @Override // R2.R1
    public final List K0(String str, String str2, String str3) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        n7.writeString(str3);
        Parcel o7 = o(17, n7);
        ArrayList createTypedArrayList = o7.createTypedArrayList(C0497e.CREATOR);
        o7.recycle();
        return createTypedArrayList;
    }

    @Override // R2.R1
    public final byte[] M0(I i7, String str) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, i7);
        n7.writeString(str);
        Parcel o7 = o(9, n7);
        byte[] createByteArray = o7.createByteArray();
        o7.recycle();
        return createByteArray;
    }

    @Override // R2.R1
    public final void N(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        v(6, n7);
    }

    @Override // R2.R1
    public final void O0(Bundle bundle, W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        AbstractC0856a0.d(n7, w52);
        v(19, n7);
    }

    @Override // R2.R1
    public final C0560n P0(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        Parcel o7 = o(21, n7);
        C0560n c0560n = (C0560n) AbstractC0856a0.a(o7, C0560n.CREATOR);
        o7.recycle();
        return c0560n;
    }

    @Override // R2.R1
    public final void R0(I i7, W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, i7);
        AbstractC0856a0.d(n7, w52);
        v(1, n7);
    }

    @Override // R2.R1
    public final void S0(I i7, String str, String str2) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, i7);
        n7.writeString(str);
        n7.writeString(str2);
        v(5, n7);
    }

    @Override // R2.R1
    public final void U0(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        v(20, n7);
    }

    @Override // R2.R1
    public final List V0(String str, String str2, W5 w52) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.d(n7, w52);
        Parcel o7 = o(16, n7);
        ArrayList createTypedArrayList = o7.createTypedArrayList(C0497e.CREATOR);
        o7.recycle();
        return createTypedArrayList;
    }

    @Override // R2.R1
    public final List W(String str, String str2, String str3, boolean z7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        n7.writeString(str3);
        AbstractC0856a0.e(n7, z7);
        Parcel o7 = o(15, n7);
        ArrayList createTypedArrayList = o7.createTypedArrayList(R5.CREATOR);
        o7.recycle();
        return createTypedArrayList;
    }

    @Override // R2.R1
    public final void Z(R5 r52, W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, r52);
        AbstractC0856a0.d(n7, w52);
        v(2, n7);
    }

    @Override // R2.R1
    public final void c0(W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, w52);
        v(4, n7);
    }

    @Override // R2.R1
    public final void m0(C0497e c0497e, W5 w52) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, c0497e);
        AbstractC0856a0.d(n7, w52);
        v(12, n7);
    }

    @Override // R2.R1
    public final void n0(C0497e c0497e) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, c0497e);
        v(13, n7);
    }

    @Override // R2.R1
    public final List x0(String str, String str2, boolean z7, W5 w52) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.e(n7, z7);
        AbstractC0856a0.d(n7, w52);
        Parcel o7 = o(14, n7);
        ArrayList createTypedArrayList = o7.createTypedArrayList(R5.CREATOR);
        o7.recycle();
        return createTypedArrayList;
    }
}
