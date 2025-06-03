package A;

import F.g.b;
import F.g.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import z.e.b;
import z.e.c;
import z.e.e;
import z.h.b;

public abstract class h
{
  public static final n a;
  public static final t.g b = new t.g(16);
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 29) {
      localObject = new m();
    }
    for (;;)
    {
      a = (n)localObject;
      break;
      if (i >= 28) {
        localObject = new l();
      } else if (i >= 26) {
        localObject = new k();
      } else if ((i >= 24) && (j.j())) {
        localObject = new j();
      } else {
        localObject = new i();
      }
    }
  }
  
  public static Typeface a(Context paramContext, Typeface paramTypeface, int paramInt)
  {
    if (paramContext != null) {
      return Typeface.create(paramTypeface, paramInt);
    }
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  public static Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, g.b[] paramArrayOfb, int paramInt)
  {
    return a.b(paramContext, paramCancellationSignal, paramArrayOfb, paramInt);
  }
  
  public static Typeface c(Context paramContext, e.b paramb, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3, h.b paramb1, Handler paramHandler, boolean paramBoolean)
  {
    if ((paramb instanceof e.e))
    {
      paramb = (e.e)paramb;
      Typeface localTypeface = g(paramb.c());
      if (localTypeface != null)
      {
        if (paramb1 != null) {
          paramb1.d(localTypeface, paramHandler);
        }
        return localTypeface;
      }
      if (paramBoolean) {
        if (paramb.a() != 0) {}
      }
      boolean bool;
      for (;;)
      {
        bool = true;
        break;
        do
        {
          bool = false;
          break;
        } while (paramb1 != null);
      }
      if (paramBoolean) {}
      for (int i = paramb.d();; i = -1) {
        break;
      }
      paramHandler = h.b.e(paramHandler);
      paramb1 = new a(paramb1);
      paramContext = F.g.a(paramContext, paramb.b(), paramInt3, bool, i, paramHandler, paramb1);
    }
    else
    {
      paramb = a.a(paramContext, (e.c)paramb, paramResources, paramInt3);
      paramContext = paramb;
      if (paramb1 != null) {
        if (paramb != null)
        {
          paramb1.d(paramb, paramHandler);
          paramContext = paramb;
        }
        else
        {
          paramb1.c(-3, paramHandler);
          paramContext = paramb;
        }
      }
    }
    if (paramContext != null) {
      b.d(e(paramResources, paramInt1, paramString, paramInt2, paramInt3), paramContext);
    }
    return paramContext;
  }
  
  public static Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    paramContext = a.d(paramContext, paramResources, paramInt1, paramString, paramInt3);
    if (paramContext != null)
    {
      paramResources = e(paramResources, paramInt1, paramString, paramInt2, paramInt3);
      b.d(paramResources, paramContext);
    }
    return paramContext;
  }
  
  public static String e(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    paramResources = new StringBuilder(paramResources.getResourcePackageName(paramInt1));
    paramResources.append('-');
    paramResources.append(paramString);
    paramResources.append('-');
    paramResources.append(paramInt2);
    paramResources.append('-');
    paramResources.append(paramInt1);
    paramResources.append('-');
    paramResources.append(paramInt3);
    return paramResources.toString();
  }
  
  public static Typeface f(Resources paramResources, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    return (Typeface)b.c(e(paramResources, paramInt1, paramString, paramInt2, paramInt3));
  }
  
  public static Typeface g(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString != null) {
      if (paramString.isEmpty())
      {
        localObject2 = localObject1;
      }
      else
      {
        paramString = Typeface.create(paramString, 0);
        Typeface localTypeface = Typeface.create(Typeface.DEFAULT, 0);
        localObject2 = localObject1;
        if (paramString != null)
        {
          localObject2 = localObject1;
          if (!paramString.equals(localTypeface)) {
            localObject2 = paramString;
          }
        }
      }
    }
    return (Typeface)localObject2;
  }
  
  public static class a
    extends g.c
  {
    public h.b a;
    
    public a(h.b paramb)
    {
      a = paramb;
    }
    
    public void a(int paramInt)
    {
      h.b localb = a;
      if (localb != null) {
        localb.h(paramInt);
      }
    }
    
    public void b(Typeface paramTypeface)
    {
      h.b localb = a;
      if (localb != null) {
        localb.i(paramTypeface);
      }
    }
  }
}

/* Location:
 * Qualified Name:     A.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */