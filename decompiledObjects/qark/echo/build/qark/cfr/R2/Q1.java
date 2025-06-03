/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 *  java.util.List
 */
package R2;

import R2.I;
import R2.R1;
import R2.R5;
import R2.W5;
import R2.e;
import R2.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import java.util.List;

public abstract class Q1
extends b0
implements R1 {
    public Q1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean n(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        block22 : {
            switch (var1_1) {
                default: {
                    return false;
                }
                case 24: {
                    var8_5 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    var9_25 = (Bundle)a0.a((Parcel)var2_2, Bundle.CREATOR);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.F(var8_5, var9_25);
                    ** GOTO lbl102
                }
                case 21: {
                    var8_6 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.P0(var8_6);
                    var3_3.writeNoException();
                    a0.g(var3_3, (Parcelable)var2_2);
                    return true;
                }
                case 20: {
                    var8_7 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.U0(var8_7);
                    break block22;
                }
                case 19: {
                    var8_8 = (Bundle)a0.a((Parcel)var2_2, Bundle.CREATOR);
                    var9_26 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.O0(var8_8, var9_26);
                    break block22;
                }
                case 18: {
                    var8_9 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.D0(var8_9);
                    break block22;
                }
                case 17: {
                    var8_10 = var2_2.readString();
                    var9_27 = var2_2.readString();
                    var10_37 = var2_2.readString();
                    a0.f((Parcel)var2_2);
                    var2_2 = this.K0(var8_10, var9_27, var10_37);
                    ** GOTO lbl102
                }
                case 16: {
                    var8_11 = var2_2.readString();
                    var9_28 = var2_2.readString();
                    var10_38 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.V0(var8_11, var9_28, var10_38);
                    ** GOTO lbl102
                }
                case 15: {
                    var8_12 = var2_2.readString();
                    var9_29 = var2_2.readString();
                    var10_39 = var2_2.readString();
                    var5_43 = a0.h((Parcel)var2_2);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.W(var8_12, var9_29, var10_39, var5_43);
                    ** GOTO lbl102
                }
                case 14: {
                    var8_13 = var2_2.readString();
                    var9_30 = var2_2.readString();
                    var5_44 = a0.h((Parcel)var2_2);
                    var10_40 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.x0(var8_13, var9_30, var5_44, var10_40);
                    ** GOTO lbl102
                }
                case 13: {
                    var8_14 = (e)a0.a((Parcel)var2_2, e.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.n0(var8_14);
                    break block22;
                }
                case 12: {
                    var8_15 = (e)a0.a((Parcel)var2_2, e.CREATOR);
                    var9_31 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.m0(var8_15, var9_31);
                    break block22;
                }
                case 11: {
                    var8_16 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.G(var8_16);
                    var3_3.writeNoException();
                    var3_3.writeString((String)var2_2);
                    return true;
                }
                case 10: {
                    var6_46 = var2_2.readLong();
                    var8_17 = var2_2.readString();
                    var9_32 = var2_2.readString();
                    var10_41 = var2_2.readString();
                    a0.f((Parcel)var2_2);
                    this.I0(var6_46, var8_17, var9_32, var10_41);
                    break block22;
                }
                case 9: {
                    var8_18 = (I)a0.a((Parcel)var2_2, I.CREATOR);
                    var9_33 = var2_2.readString();
                    a0.f((Parcel)var2_2);
                    var2_2 = this.M0(var8_18, var9_33);
                    var3_3.writeNoException();
                    var3_3.writeByteArray((byte[])var2_2);
                    return true;
                }
                case 7: {
                    var8_19 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    var5_45 = a0.h((Parcel)var2_2);
                    a0.f((Parcel)var2_2);
                    var2_2 = this.L0(var8_19, var5_45);
lbl102: // 6 sources:
                    var3_3.writeNoException();
                    var3_3.writeTypedList(var2_2);
                    return true;
                }
                case 6: {
                    var8_20 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.N(var8_20);
                    break block22;
                }
                case 5: {
                    var8_21 = (I)a0.a((Parcel)var2_2, I.CREATOR);
                    var9_34 = var2_2.readString();
                    var10_42 = var2_2.readString();
                    a0.f((Parcel)var2_2);
                    this.S0(var8_21, var9_34, var10_42);
                    break block22;
                }
                case 4: {
                    var8_22 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.c0(var8_22);
                    break block22;
                }
                case 2: {
                    var8_23 = (R5)a0.a((Parcel)var2_2, R5.CREATOR);
                    var9_35 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
                    a0.f((Parcel)var2_2);
                    this.Z(var8_23, var9_35);
                    break block22;
                }
                case 1: 
            }
            var8_24 = (I)a0.a((Parcel)var2_2, I.CREATOR);
            var9_36 = (W5)a0.a((Parcel)var2_2, W5.CREATOR);
            a0.f((Parcel)var2_2);
            this.R0(var8_24, var9_36);
        }
        var3_3.writeNoException();
        return true;
    }
}

