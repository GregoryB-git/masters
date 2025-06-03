package F;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

public abstract class g
{
  public static Typeface a(Context paramContext, e parame, int paramInt1, boolean paramBoolean, int paramInt2, Handler paramHandler, c paramc)
  {
    paramHandler = new a(paramc, paramHandler);
    if (paramBoolean) {
      return f.e(paramContext, parame, paramHandler, paramInt1, paramInt2);
    }
    return f.d(paramContext, parame, paramInt1, null, paramHandler);
  }
  
  public static class a
  {
    public final int a;
    public final g.b[] b;
    
    public a(int paramInt, g.b[] paramArrayOfb)
    {
      a = paramInt;
      b = paramArrayOfb;
    }
    
    public static a a(int paramInt, g.b[] paramArrayOfb)
    {
      return new a(paramInt, paramArrayOfb);
    }
    
    public g.b[] b()
    {
      return b;
    }
    
    public int c()
    {
      return a;
    }
  }
  
  public static class b
  {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    
    public b(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      a = ((Uri)H.e.b(paramUri));
      b = paramInt1;
      c = paramInt2;
      d = paramBoolean;
      e = paramInt3;
    }
    
    public static b a(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return new b(paramUri, paramInt1, paramInt2, paramBoolean, paramInt3);
    }
    
    public int b()
    {
      return e;
    }
    
    public int c()
    {
      return b;
    }
    
    public Uri d()
    {
      return a;
    }
    
    public int e()
    {
      return c;
    }
    
    public boolean f()
    {
      return d;
    }
  }
  
  public static abstract class c
  {
    public abstract void a(int paramInt);
    
    public abstract void b(Typeface paramTypeface);
  }
}

/* Location:
 * Qualified Name:     F.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */