package A;

import F.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.ConcurrentHashMap;
import z.e.c;

public abstract class n
{
  public ConcurrentHashMap a = new ConcurrentHashMap();
  
  public static Object e(Object[] paramArrayOfObject, int paramInt, b paramb)
  {
    int i;
    if ((paramInt & 0x1) == 0) {
      i = 400;
    } else {
      i = 700;
    }
    boolean bool;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return f(paramArrayOfObject, i, bool, paramb);
  }
  
  public static Object f(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean, b paramb)
  {
    int i = paramArrayOfObject.length;
    Object localObject1 = null;
    int j = Integer.MAX_VALUE;
    int k = 0;
    while (k < i)
    {
      Object localObject2 = paramArrayOfObject[k];
      int m = Math.abs(paramb.a(localObject2) - paramInt);
      int n;
      if (paramb.b(localObject2) == paramBoolean) {
        n = 0;
      } else {
        n = 1;
      }
      m = m * 2 + n;
      if (localObject1 != null)
      {
        n = j;
        if (j <= m) {}
      }
      else
      {
        localObject1 = localObject2;
        n = m;
      }
      k++;
      j = n;
    }
    return localObject1;
  }
  
  public abstract Typeface a(Context paramContext, e.c paramc, Resources paramResources, int paramInt);
  
  public abstract Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, g.b[] paramArrayOfb, int paramInt);
  
  /* Error */
  public Typeface c(Context paramContext, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 51	A/o:e	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: invokestatic 55	A/o:d	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 61	java/io/File:delete	()Z
    //   25: pop
    //   26: aconst_null
    //   27: areturn
    //   28: aload_1
    //   29: invokevirtual 65	java/io/File:getPath	()Ljava/lang/String;
    //   32: invokestatic 71	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   35: astore_2
    //   36: aload_1
    //   37: invokevirtual 61	java/io/File:delete	()Z
    //   40: pop
    //   41: aload_2
    //   42: areturn
    //   43: astore_2
    //   44: aload_1
    //   45: invokevirtual 61	java/io/File:delete	()Z
    //   48: pop
    //   49: aload_2
    //   50: athrow
    //   51: astore_2
    //   52: aload_1
    //   53: invokevirtual 61	java/io/File:delete	()Z
    //   56: pop
    //   57: aconst_null
    //   58: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	n
    //   0	59	1	paramContext	Context
    //   0	59	2	paramInputStream	java.io.InputStream
    //   16	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	17	43	finally
    //   28	36	43	finally
    //   11	17	51	java/lang/RuntimeException
    //   28	36	51	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 51	A/o:e	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: iload_3
    //   14: invokestatic 75	A/o:c	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   17: istore 6
    //   19: iload 6
    //   21: ifne +10 -> 31
    //   24: aload_1
    //   25: invokevirtual 61	java/io/File:delete	()Z
    //   28: pop
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 65	java/io/File:getPath	()Ljava/lang/String;
    //   35: invokestatic 71	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   38: astore_2
    //   39: aload_1
    //   40: invokevirtual 61	java/io/File:delete	()Z
    //   43: pop
    //   44: aload_2
    //   45: areturn
    //   46: astore_2
    //   47: aload_1
    //   48: invokevirtual 61	java/io/File:delete	()Z
    //   51: pop
    //   52: aload_2
    //   53: athrow
    //   54: astore_2
    //   55: aload_1
    //   56: invokevirtual 61	java/io/File:delete	()Z
    //   59: pop
    //   60: aconst_null
    //   61: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	n
    //   0	62	1	paramContext	Context
    //   0	62	2	paramResources	Resources
    //   0	62	3	paramInt1	int
    //   0	62	4	paramString	String
    //   0	62	5	paramInt2	int
    //   17	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	19	46	finally
    //   31	39	46	finally
    //   11	19	54	java/lang/RuntimeException
    //   31	39	54	java/lang/RuntimeException
  }
  
  public g.b g(g.b[] paramArrayOfb, int paramInt)
  {
    return (g.b)e(paramArrayOfb, paramInt, new a());
  }
  
  public class a
    implements n.b
  {
    public a() {}
    
    public int c(g.b paramb)
    {
      return paramb.e();
    }
    
    public boolean d(g.b paramb)
    {
      return paramb.f();
    }
  }
  
  public static abstract interface b
  {
    public abstract int a(Object paramObject);
    
    public abstract boolean b(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     A.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */