// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcel;
import M2.c;
import android.accounts.Account;
import android.os.IBinder;
import M2.a;

public final class n0 extends a implements i
{
    public n0(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    @Override
    public final Account b() {
        final Parcel n = this.n(2, this.o());
        final Account account = (Account)M2.c.a(n, Account.CREATOR);
        n.recycle();
        return account;
    }
}
