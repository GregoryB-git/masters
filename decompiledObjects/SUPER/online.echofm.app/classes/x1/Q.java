package x1;

import Z.a;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class Q
{
  public static final a d = new a(null);
  public static volatile Q e;
  public final a a;
  public final P b;
  public O c;
  
  public Q(a parama, P paramP)
  {
    a = parama;
    b = paramP;
  }
  
  public final O c()
  {
    return c;
  }
  
  public final boolean d()
  {
    O localO = b.b();
    if (localO != null)
    {
      g(localO, false);
      return true;
    }
    return false;
  }
  
  public final void e(O paramO1, O paramO2)
  {
    Intent localIntent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", paramO1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", paramO2);
    a.d(localIntent);
  }
  
  public final void f(O paramO)
  {
    g(paramO, true);
  }
  
  public final void g(O paramO, boolean paramBoolean)
  {
    O localO = c;
    c = paramO;
    if (paramBoolean)
    {
      P localP = b;
      if (paramO != null) {
        localP.c(paramO);
      } else {
        localP.a();
      }
    }
    if (!O1.P.e(localO, paramO)) {
      e(localO, paramO);
    }
  }
  
  public static final class a
  {
    public final Q a()
    {
      try
      {
        if (Q.a() == null)
        {
          a locala = a.b(B.l());
          Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
          Q localQ1 = new x1/Q;
          P localP = new x1/P;
          localP.<init>();
          localQ1.<init>(locala, localP);
          Q.b(localQ1);
        }
      }
      finally
      {
        break label69;
      }
      Q localQ2 = Q.a();
      if (localQ2 != null) {
        return localQ2;
      }
      Intrinsics.n("instance");
      throw null;
      label69:
      throw localQ2;
    }
  }
}

/* Location:
 * Qualified Name:     x1.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */