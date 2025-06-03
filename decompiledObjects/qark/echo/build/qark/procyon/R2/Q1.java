// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.List;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import com.google.android.gms.internal.measurement.a0;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.b0;

public abstract class Q1 extends b0 implements R1
{
    public Q1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    public final boolean n(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        Label_0226: {
            List list = null;
            switch (n) {
                default: {
                    return false;
                }
                case 24: {
                    final W5 w5 = (W5)a0.a(parcel, W5.CREATOR);
                    final Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
                    a0.f(parcel);
                    list = this.F(w5, bundle);
                    break;
                }
                case 21: {
                    final W5 w6 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    final n p4 = this.P0(w6);
                    parcel2.writeNoException();
                    a0.g(parcel2, (Parcelable)p4);
                    return true;
                }
                case 20: {
                    final W5 w7 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.U0(w7);
                    break Label_0226;
                }
                case 19: {
                    final Bundle bundle2 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                    final W5 w8 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.O0(bundle2, w8);
                    break Label_0226;
                }
                case 18: {
                    final W5 w9 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.D0(w9);
                    break Label_0226;
                }
                case 17: {
                    final String string = parcel.readString();
                    final String string2 = parcel.readString();
                    final String string3 = parcel.readString();
                    a0.f(parcel);
                    list = this.K0(string, string2, string3);
                    break;
                }
                case 16: {
                    final String string4 = parcel.readString();
                    final String string5 = parcel.readString();
                    final W5 w10 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    list = this.V0(string4, string5, w10);
                    break;
                }
                case 15: {
                    final String string6 = parcel.readString();
                    final String string7 = parcel.readString();
                    final String string8 = parcel.readString();
                    final boolean h = a0.h(parcel);
                    a0.f(parcel);
                    list = this.W(string6, string7, string8, h);
                    break;
                }
                case 14: {
                    final String string9 = parcel.readString();
                    final String string10 = parcel.readString();
                    final boolean h2 = a0.h(parcel);
                    final W5 w11 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    list = this.x0(string9, string10, h2, w11);
                    break;
                }
                case 13: {
                    final e e = (e)a0.a(parcel, R2.e.CREATOR);
                    a0.f(parcel);
                    this.n0(e);
                    break Label_0226;
                }
                case 12: {
                    final e e2 = (e)a0.a(parcel, e.CREATOR);
                    final W5 w12 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.m0(e2, w12);
                    break Label_0226;
                }
                case 11: {
                    final W5 w13 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    final String g = this.G(w13);
                    parcel2.writeNoException();
                    parcel2.writeString(g);
                    return true;
                }
                case 10: {
                    final long long1 = parcel.readLong();
                    final String string11 = parcel.readString();
                    final String string12 = parcel.readString();
                    final String string13 = parcel.readString();
                    a0.f(parcel);
                    this.I0(long1, string11, string12, string13);
                    break Label_0226;
                }
                case 9: {
                    final I i = (I)a0.a(parcel, I.CREATOR);
                    final String string14 = parcel.readString();
                    a0.f(parcel);
                    final byte[] m0 = this.M0(i, string14);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(m0);
                    return true;
                }
                case 7: {
                    final W5 w14 = (W5)a0.a(parcel, W5.CREATOR);
                    final boolean h3 = a0.h(parcel);
                    a0.f(parcel);
                    list = this.L0(w14, h3);
                    break;
                }
                case 6: {
                    final W5 w15 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.N(w15);
                    break Label_0226;
                }
                case 5: {
                    final I j = (I)a0.a(parcel, I.CREATOR);
                    final String string15 = parcel.readString();
                    final String string16 = parcel.readString();
                    a0.f(parcel);
                    this.S0(j, string15, string16);
                    break Label_0226;
                }
                case 4: {
                    final W5 w16 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.c0(w16);
                    break Label_0226;
                }
                case 2: {
                    final R5 r5 = (R5)a0.a(parcel, R5.CREATOR);
                    final W5 w17 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.Z(r5, w17);
                    break Label_0226;
                }
                case 1: {
                    final I k = (I)a0.a(parcel, I.CREATOR);
                    final W5 w18 = (W5)a0.a(parcel, W5.CREATOR);
                    a0.f(parcel);
                    this.R0(k, w18);
                    break Label_0226;
                }
            }
            parcel2.writeNoException();
            parcel2.writeTypedList(list);
            return true;
        }
        parcel2.writeNoException();
        return true;
    }
}
