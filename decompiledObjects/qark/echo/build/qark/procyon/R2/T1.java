// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.ArrayList;
import android.os.Parcelable$Creator;
import java.util.List;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.a0;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.Y;

public final class T1 extends Y implements R1
{
    public T1(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    public final void D0(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        this.v(18, n);
    }
    
    @Override
    public final List F(final W5 w5, final Bundle bundle) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        a0.d(n, (Parcelable)bundle);
        final Parcel o = this.o(24, n);
        final ArrayList typedArrayList = o.createTypedArrayList((Parcelable$Creator)v5.CREATOR);
        o.recycle();
        return typedArrayList;
    }
    
    @Override
    public final String G(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        final Parcel o = this.o(11, n);
        final String string = o.readString();
        o.recycle();
        return string;
    }
    
    @Override
    public final void I0(final long n, final String s, final String s2, final String s3) {
        final Parcel n2 = this.n();
        n2.writeLong(n);
        n2.writeString(s);
        n2.writeString(s2);
        n2.writeString(s3);
        this.v(10, n2);
    }
    
    @Override
    public final List K0(final String s, final String s2, final String s3) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        n.writeString(s3);
        final Parcel o = this.o(17, n);
        final ArrayList typedArrayList = o.createTypedArrayList((Parcelable$Creator)e.CREATOR);
        o.recycle();
        return typedArrayList;
    }
    
    @Override
    public final byte[] M0(final I i, final String s) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)i);
        n.writeString(s);
        final Parcel o = this.o(9, n);
        final byte[] byteArray = o.createByteArray();
        o.recycle();
        return byteArray;
    }
    
    @Override
    public final void N(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        this.v(6, n);
    }
    
    @Override
    public final void O0(final Bundle bundle, final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)bundle);
        a0.d(n, (Parcelable)w5);
        this.v(19, n);
    }
    
    @Override
    public final n P0(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        final Parcel o = this.o(21, n);
        final n n2 = (n)a0.a(o, R2.n.CREATOR);
        o.recycle();
        return n2;
    }
    
    @Override
    public final void R0(final I i, final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)i);
        a0.d(n, (Parcelable)w5);
        this.v(1, n);
    }
    
    @Override
    public final void S0(final I i, final String s, final String s2) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)i);
        n.writeString(s);
        n.writeString(s2);
        this.v(5, n);
    }
    
    @Override
    public final void U0(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        this.v(20, n);
    }
    
    @Override
    public final List V0(final String s, final String s2, final W5 w5) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        a0.d(n, (Parcelable)w5);
        final Parcel o = this.o(16, n);
        final ArrayList typedArrayList = o.createTypedArrayList((Parcelable$Creator)e.CREATOR);
        o.recycle();
        return typedArrayList;
    }
    
    @Override
    public final List W(final String s, final String s2, final String s3, final boolean b) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        n.writeString(s3);
        a0.e(n, b);
        final Parcel o = this.o(15, n);
        final ArrayList typedArrayList = o.createTypedArrayList((Parcelable$Creator)R5.CREATOR);
        o.recycle();
        return typedArrayList;
    }
    
    @Override
    public final void Z(final R5 r5, final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)r5);
        a0.d(n, (Parcelable)w5);
        this.v(2, n);
    }
    
    @Override
    public final void c0(final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)w5);
        this.v(4, n);
    }
    
    @Override
    public final void m0(final e e, final W5 w5) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)e);
        a0.d(n, (Parcelable)w5);
        this.v(12, n);
    }
    
    @Override
    public final void n0(final e e) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)e);
        this.v(13, n);
    }
    
    @Override
    public final List x0(final String s, final String s2, final boolean b, final W5 w5) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        a0.e(n, b);
        a0.d(n, (Parcelable)w5);
        final Parcel o = this.o(14, n);
        final ArrayList typedArrayList = o.createTypedArrayList((Parcelable$Creator)R5.CREATOR);
        o.recycle();
        return typedArrayList;
    }
}
