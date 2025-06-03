package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import f0;

@RequiresApi(26)
class GnssStatusWrapper$Api26Impl
{
  @DoNotInline
  public static float getCarrierFrequencyHz(GnssStatus paramGnssStatus, int paramInt)
  {
    return f0.c(paramGnssStatus, paramInt);
  }
  
  @DoNotInline
  public static boolean hasCarrierFrequencyHz(GnssStatus paramGnssStatus, int paramInt)
  {
    return f0.x(paramGnssStatus, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.GnssStatusWrapper.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */