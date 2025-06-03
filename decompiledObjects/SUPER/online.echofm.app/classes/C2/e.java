package C2;

import A2.g;
import A2.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import z2.j;

public final class e
  extends g
{
  public final u I;
  
  public e(Context paramContext, Looper paramLooper, A2.d paramd, u paramu, z2.d paramd1, j paramj)
  {
    super(paramContext, paramLooper, 270, paramd, paramd1, paramj);
    I = paramu;
  }
  
  public final Bundle A()
  {
    return I.b();
  }
  
  public final String E()
  {
    return "com.google.android.gms.common.internal.service.IClientTelemetryService";
  }
  
  public final String F()
  {
    return "com.google.android.gms.common.telemetry.service.START";
  }
  
  public final boolean I()
  {
    return true;
  }
  
  public final int h()
  {
    return 203400000;
  }
  
  public final x2.d[] v()
  {
    return K2.d.b;
  }
}

/* Location:
 * Qualified Name:     C2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */