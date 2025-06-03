package h6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.auth_api.zba;
import com.google.android.gms.internal.auth_api.zbc;
import k6.a.b;
import k6.e;

public final class j
  extends m
{
  public j(e parame)
  {
    super(parame);
  }
  
  public final void doExecute(a.b paramb)
  {
    Object localObject = (f)paramb;
    q localq = (q)((a)localObject).getService();
    paramb = new i(this);
    GoogleSignInOptions localGoogleSignInOptions = a;
    localObject = localq.zba();
    zbc.zbd((Parcel)localObject, paramb);
    zbc.zbc((Parcel)localObject, localGoogleSignInOptions);
    localq.zbb(102, (Parcel)localObject);
  }
}

/* Location:
 * Qualified Name:     h6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */