package I;

import A.f;
import android.os.Build.VERSION;

public final class x$b
{
  public final x.f a;
  
  public x$b()
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 30) {
      localObject = new x.e();
    }
    for (;;)
    {
      a = ((x.f)localObject);
      break;
      if (i >= 29) {
        localObject = new x.d();
      } else {
        localObject = new x.c();
      }
    }
  }
  
  public x$b(x paramx)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      paramx = new x.e(paramx);
    }
    for (;;)
    {
      a = paramx;
      break;
      if (i >= 29) {
        paramx = new x.d(paramx);
      } else {
        paramx = new x.c(paramx);
      }
    }
  }
  
  public x a()
  {
    return a.b();
  }
  
  public b b(f paramf)
  {
    a.d(paramf);
    return this;
  }
  
  public b c(f paramf)
  {
    a.f(paramf);
    return this;
  }
}

/* Location:
 * Qualified Name:     I.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */