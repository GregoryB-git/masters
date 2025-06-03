package T2;

import K2.c;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class e
  extends K2.b
  implements f
{
  public e()
  {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public final boolean Z0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    switch (paramInt1)
    {
    case 5: 
    default: 
      return false;
    case 9: 
      localObject = (h)c.a(paramParcel1, h.CREATOR);
    }
    for (;;)
    {
      c.b(paramParcel1);
      break;
      localObject = (l)c.a(paramParcel1, l.CREATOR);
      c.b(paramParcel1);
      K((l)localObject);
      break;
      localObject = (Status)c.a(paramParcel1, Status.CREATOR);
      localObject = (GoogleSignInAccount)c.a(paramParcel1, GoogleSignInAccount.CREATOR);
      continue;
      localObject = (Status)c.a(paramParcel1, Status.CREATOR);
      continue;
      localObject = (x2.b)c.a(paramParcel1, x2.b.CREATOR);
      localObject = (b)c.a(paramParcel1, b.CREATOR);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     T2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */