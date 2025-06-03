package A2;

import M2.a;
import M2.c;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

public final class n0
  extends a
  implements i
{
  public n0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IAccountAccessor");
  }
  
  public final Account b()
  {
    Parcel localParcel = n(2, o());
    Account localAccount = (Account)c.a(localParcel, Account.CREATOR);
    localParcel.recycle();
    return localAccount;
  }
}

/* Location:
 * Qualified Name:     A2.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */