/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.n0;
import M2.b;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

public interface i
extends IInterface {
    public Account b();

    public static abstract class a
    extends b
    implements i {
        public static i o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterface instanceof i) {
                return (i)iInterface;
            }
            return new n0(iBinder);
        }
    }

}

