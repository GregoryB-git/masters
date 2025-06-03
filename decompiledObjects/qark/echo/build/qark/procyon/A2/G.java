// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import B2.a;

public final class G extends a
{
    public static final Parcelable$Creator<G> CREATOR;
    public final int o;
    public final Account p;
    public final int q;
    public final GoogleSignInAccount r;
    
    static {
        CREATOR = (Parcelable$Creator)new H();
    }
    
    public G(final int o, final Account p4, final int q, final GoogleSignInAccount r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public G(final Account account, final int n, final GoogleSignInAccount googleSignInAccount) {
        this(2, account, n, googleSignInAccount);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.m(parcel, 2, (Parcelable)this.p, n, false);
        c.i(parcel, 3, this.q);
        c.m(parcel, 4, (Parcelable)this.r, n, false);
        c.b(parcel, a);
    }
}
