package A2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class n0 extends M2.a implements InterfaceC0323i {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // A2.InterfaceC0323i
    public final Account b() {
        Parcel n7 = n(2, o());
        Account account = (Account) M2.c.a(n7, Account.CREATOR);
        n7.recycle();
        return account;
    }
}
