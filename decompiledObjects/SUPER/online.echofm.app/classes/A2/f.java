package A2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import x2.d;

public class f
  extends B2.a
{
  public static final Scope[] C = new Scope[0];
  @NonNull
  public static final Parcelable.Creator<f> CREATOR = new d0();
  public static final d[] D = new d[0];
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
  
  public f(int paramInt1, int paramInt2, int paramInt3, String paramString1, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, d[] paramArrayOfd1, d[] paramArrayOfd2, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, String paramString2)
  {
    Scope[] arrayOfScope = paramArrayOfScope;
    if (paramArrayOfScope == null) {
      arrayOfScope = C;
    }
    paramArrayOfScope = paramBundle;
    if (paramBundle == null) {
      paramArrayOfScope = new Bundle();
    }
    paramBundle = paramArrayOfd1;
    if (paramArrayOfd1 == null) {
      paramBundle = D;
    }
    paramArrayOfd1 = paramArrayOfd2;
    if (paramArrayOfd2 == null) {
      paramArrayOfd1 = D;
    }
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
    if ("com.google.android.gms".equals(paramString1)) {
      r = "com.google.android.gms";
    } else {
      r = paramString1;
    }
    if (paramInt1 < 2)
    {
      if (paramIBinder != null) {
        paramString1 = a.v(i.a.o(paramIBinder));
      } else {
        paramString1 = null;
      }
      v = paramString1;
    }
    else
    {
      s = paramIBinder;
      v = paramAccount;
    }
    t = arrayOfScope;
    u = paramArrayOfScope;
    w = paramBundle;
    x = paramArrayOfd1;
    y = paramBoolean1;
    z = paramInt4;
    A = paramBoolean2;
    B = paramString2;
  }
  
  public final String a()
  {
    return B;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d0.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     A2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */