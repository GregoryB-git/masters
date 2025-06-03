package z5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new g();
  public final int a;
  public int b;
  @Deprecated
  public String c;
  public Account d;
  
  public b(int paramInt1, int paramInt2, String paramString, Account paramAccount)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString;
    if ((paramAccount == null) && (!TextUtils.isEmpty(paramString)))
    {
      d = new Account(paramString, "com.google");
      return;
    }
    d = paramAccount;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.z(paramParcel, 2, b);
    z.F(paramParcel, 3, c, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     z5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */