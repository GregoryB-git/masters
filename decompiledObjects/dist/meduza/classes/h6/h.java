package h6;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.auth_api.zba;
import com.google.android.gms.internal.auth_api.zbc;
import k6.a.b;
import k6.e;

public final class h
  extends m
{
  public h(e parame, Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(parame);
  }
  
  public final void doExecute(a.b paramb)
  {
    q localq = (q)((f)paramb).getService();
    paramb = new g(this);
    GoogleSignInOptions localGoogleSignInOptions = b;
    Parcel localParcel = localq.zba();
    zbc.zbd(localParcel, paramb);
    zbc.zbc(localParcel, localGoogleSignInOptions);
    localq.zbb(101, localParcel);
  }
}

/* Location:
 * Qualified Name:     h6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */