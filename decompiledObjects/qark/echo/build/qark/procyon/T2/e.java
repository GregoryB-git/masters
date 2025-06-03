// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import K2.c;
import android.os.Parcel;
import K2.b;

public abstract class e extends b implements f
{
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    @Override
    public final boolean Z0(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        Label_0161: {
            switch (n) {
                default: {
                    return false;
                }
                case 9: {
                    final h h = (h)c.a(parcel, T2.h.CREATOR);
                    break;
                }
                case 8: {
                    final l l = (l)c.a(parcel, T2.l.CREATOR);
                    c.b(parcel);
                    this.K(l);
                    break Label_0161;
                }
                case 7: {
                    final Status status = (Status)c.a(parcel, Status.CREATOR);
                    final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)c.a(parcel, GoogleSignInAccount.CREATOR);
                    break;
                }
                case 4:
                case 6: {
                    final Status status2 = (Status)c.a(parcel, Status.CREATOR);
                    break;
                }
                case 3: {
                    final x2.b b = (x2.b)c.a(parcel, x2.b.CREATOR);
                    final T2.b b2 = (T2.b)c.a(parcel, T2.b.CREATOR);
                    break;
                }
            }
            c.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
