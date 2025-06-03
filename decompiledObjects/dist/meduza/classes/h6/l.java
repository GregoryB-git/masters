package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.auth_api.zba;
import com.google.android.gms.internal.auth_api.zbc;
import k6.a.b;
import k6.e;

public final class l
  extends m
{
  public l(e parame)
  {
    super(parame);
  }
  
  public final void doExecute(a.b paramb)
  {
    Object localObject = (f)paramb;
    q localq = (q)((a)localObject).getService();
    paramb = new k(this);
    localObject = a;
    Parcel localParcel = localq.zba();
    zbc.zbd(localParcel, paramb);
    zbc.zbc(localParcel, (Parcelable)localObject);
    localq.zbb(103, localParcel);
  }
}

/* Location:
 * Qualified Name:     h6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */