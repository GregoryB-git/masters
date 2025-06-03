/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package A2;

import A2.i;
import M2.a;
import M2.c;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class n0
extends a
implements i {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override
    public final Account b() {
        Parcel parcel = this.n(2, this.o());
        Account account = (Account)c.a(parcel, Account.CREATOR);
        parcel.recycle();
        return account;
    }
}

