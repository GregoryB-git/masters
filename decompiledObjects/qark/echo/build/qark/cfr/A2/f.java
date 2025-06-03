/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.a;
import A2.d0;
import A2.i;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import x2.d;

public class f
extends B2.a {
    public static final Scope[] C;
    @NonNull
    public static final Parcelable.Creator<f> CREATOR;
    public static final d[] D;
    public boolean A;
    public String B;
    public final int o;
    public final int p;
    public int q;
    public String r;
    public IBinder s;
    public Scope[] t;
    public Bundle u;
    public Account v;
    public d[] w;
    public d[] x;
    public boolean y;
    public int z;

    static {
        CREATOR = new d0();
        C = new Scope[0];
        D = new d[0];
    }

    public f(int n8, int n9, int n10, String string2, IBinder iBinder, Scope[] arrd, Bundle arrd2, Account account, d[] arrd3, d[] arrd4, boolean bl, int n11, boolean bl2, String string3) {
        d[] arrd5 = arrd;
        if (arrd == null) {
            arrd5 = C;
        }
        arrd = arrd2;
        if (arrd2 == null) {
            arrd = new d[]();
        }
        arrd2 = arrd3;
        if (arrd3 == null) {
            arrd2 = D;
        }
        arrd3 = arrd4;
        if (arrd4 == null) {
            arrd3 = D;
        }
        this.o = n8;
        this.p = n9;
        this.q = n10;
        this.r = "com.google.android.gms".equals((Object)string2) ? "com.google.android.gms" : string2;
        if (n8 < 2) {
            string2 = iBinder != null ? a.v(i.a.o(iBinder)) : null;
            this.v = string2;
        } else {
            this.s = iBinder;
            this.v = account;
        }
        this.t = arrd5;
        this.u = arrd;
        this.w = arrd2;
        this.x = arrd3;
        this.y = bl;
        this.z = n11;
        this.A = bl2;
        this.B = string3;
    }

    public final String a() {
        return this.B;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        d0.a(this, parcel, n8);
    }
}

