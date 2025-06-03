package io.flutter.plugin.editing;

import D5.w.b;
import D5.w.e;
import D5.w.f;
import android.os.Build.VERSION;
import android.os.Bundle;

public class C$a
  implements w.f
{
  public C$a(C paramC) {}
  
  public void a()
  {
    C localC = a;
    localC.D(C.b(localC));
  }
  
  public void b()
  {
    a.k();
  }
  
  public void c(String paramString, Bundle paramBundle)
  {
    a.z(paramString, paramBundle);
  }
  
  public void d(int paramInt, boolean paramBoolean)
  {
    C.h(a, paramInt, paramBoolean);
  }
  
  public void e(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
  {
    C.i(a, paramDouble1, paramDouble2, paramArrayOfDouble);
  }
  
  public void f()
  {
    C.f(a);
  }
  
  public void g(int paramInt, w.b paramb)
  {
    a.B(paramInt, paramb);
  }
  
  public void h(w.e parame)
  {
    C localC = a;
    localC.C(C.b(localC), parame);
  }
  
  public void i(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (C.g(a) != null)) {
      if (paramBoolean) {
        A.a(C.g(a));
      } else {
        B.a(C.g(a));
      }
    }
  }
  
  public void j()
  {
    if (ca).a == C.c.a.r)
    {
      C.d(a);
    }
    else
    {
      C localC = a;
      C.e(localC, C.b(localC));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.C.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */