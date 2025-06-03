// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcel;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import x2.d;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Scope;
import B2.a;

public class f extends a
{
    public static final Scope[] C;
    @NonNull
    public static final Parcelable$Creator<f> CREATOR;
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
        CREATOR = (Parcelable$Creator)new d0();
        C = new Scope[0];
        D = new d[0];
    }
    
    public f(final int o, final int p14, final int q, final String s, final IBinder s2, final Scope[] array, final Bundle bundle, final Account v, d[] d, final d[] array2, final boolean y, final int z, final boolean a, final String b) {
        Scope[] c = array;
        if (array == null) {
            c = f.C;
        }
        Bundle u;
        if ((u = bundle) == null) {
            u = new Bundle();
        }
        d[] d2;
        if ((d2 = d) == null) {
            d2 = f.D;
        }
        if ((d = array2) == null) {
            d = f.D;
        }
        this.o = o;
        this.p = p14;
        this.q = q;
        if ("com.google.android.gms".equals(s)) {
            this.r = "com.google.android.gms";
        }
        else {
            this.r = s;
        }
        if (o < 2) {
            Account v2;
            if (s2 != null) {
                v2 = A2.a.v(i.a.o(s2));
            }
            else {
                v2 = null;
            }
            this.v = v2;
        }
        else {
            this.s = s2;
            this.v = v;
        }
        this.t = c;
        this.u = u;
        this.w = d2;
        this.x = d;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
    }
    
    public final String a() {
        return this.B;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        d0.a(this, parcel, n);
    }
}
