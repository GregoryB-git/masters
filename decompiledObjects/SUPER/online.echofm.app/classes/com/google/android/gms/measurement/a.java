package com.google.android.gms.measurement;

import A2.n;
import E2.e;
import R2.B;
import R2.C3;
import R2.N2;
import R2.S5;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

public final class a
  extends AppMeasurement.a
{
  public final N2 a;
  public final C3 b;
  
  public a(N2 paramN2)
  {
    super(null);
    n.i(paramN2);
    a = paramN2;
    b = paramN2.H();
  }
  
  public final long a()
  {
    return a.L().P0();
  }
  
  public final List c(String paramString1, String paramString2)
  {
    return b.C(paramString1, paramString2);
  }
  
  public final String g()
  {
    return b.i0();
  }
  
  public final String h()
  {
    return b.i0();
  }
  
  public final int i(String paramString)
  {
    n.e(paramString);
    return 25;
  }
  
  public final String k()
  {
    return b.k0();
  }
  
  public final void l(Bundle paramBundle)
  {
    b.w0(paramBundle);
  }
  
  public final String m()
  {
    return b.j0();
  }
  
  public final void q(String paramString)
  {
    a.y().D(paramString, a.b().b());
  }
  
  public final void r(String paramString1, String paramString2, Bundle paramBundle)
  {
    a.H().X(paramString1, paramString2, paramBundle);
  }
  
  public final void s(String paramString)
  {
    a.y().z(paramString, a.b().b());
  }
  
  public final Map t(String paramString1, String paramString2, boolean paramBoolean)
  {
    return b.D(paramString1, paramString2, paramBoolean);
  }
  
  public final void u(String paramString1, String paramString2, Bundle paramBundle)
  {
    b.y0(paramString1, paramString2, paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */