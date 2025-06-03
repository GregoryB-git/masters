package e7;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

public final class z0
  extends a<n0>
{
  public z0(Context paramContext, Looper paramLooper, i5 parami51, i5 parami52)
  {
    super(paramContext, paramLooper, 93, parami51, parami52, null);
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final String getServiceDescriptor()
  {
    return "com.google.android.gms.measurement.internal.IMeasurementService";
  }
  
  public final String getStartServiceAction()
  {
    return "com.google.android.gms.measurement.START";
  }
}

/* Location:
 * Qualified Name:     e7.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */