/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package T2;

import K2.c;
import T2.b;
import T2.f;
import T2.h;
import T2.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class e
extends K2.b
implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final boolean Z0(int var1_1, Parcel var2_2, Parcel var3_3, int var4_4) {
        switch (var1_1) {
            default: {
                return false;
            }
            case 9: {
                var5_5 = (h)c.a(var2_2, h.CREATOR);
                break;
            }
            case 8: {
                var5_6 = (l)c.a(var2_2, l.CREATOR);
                c.b(var2_2);
                this.K(var5_6);
                ** break;
            }
            case 7: {
                var5_7 = (Status)c.a(var2_2, Status.CREATOR);
                var5_8 = (GoogleSignInAccount)c.a(var2_2, GoogleSignInAccount.CREATOR);
                break;
            }
            case 4: 
            case 6: {
                var5_9 = (Status)c.a(var2_2, Status.CREATOR);
                break;
            }
            case 3: {
                var5_10 = (x2.b)c.a(var2_2, x2.b.CREATOR);
                var5_11 = (b)c.a(var2_2, b.CREATOR);
            }
        }
        c.b(var2_2);
        ** break;
lbl24: // 2 sources:
        var3_3.writeNoException();
        return true;
    }
}

