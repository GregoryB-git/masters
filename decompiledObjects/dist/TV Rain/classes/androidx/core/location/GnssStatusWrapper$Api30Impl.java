package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(30)
class GnssStatusWrapper$Api30Impl
{
  @DoNotInline
  public static float getBasebandCn0DbHz(GnssStatus paramGnssStatus, int paramInt)
  {
    return d.a(paramGnssStatus, paramInt);
  }
  
  @DoNotInline
  public static boolean hasBasebandCn0DbHz(GnssStatus paramGnssStatus, int paramInt)
  {
    return d.z(paramGnssStatus, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.GnssStatusWrapper.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */