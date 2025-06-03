package com.google.android.gms.internal.measurement;

import R2.u3;
import android.os.Bundle;

public final class J0$b
  extends C0
{
  public final u3 b;
  
  public J0$b(u3 paramu3)
  {
    b = paramu3;
  }
  
  public final void L(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    b.a(paramString1, paramString2, paramBundle, paramLong);
  }
  
  public final int a()
  {
    return System.identityHashCode(b);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */