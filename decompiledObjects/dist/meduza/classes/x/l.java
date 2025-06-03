package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import b0.n;
import java.util.concurrent.ConcurrentHashMap;
import w.d.c;

public class l
{
  public l()
  {
    new ConcurrentHashMap();
  }
  
  public static <T> T e(T[] paramArrayOfT, int paramInt, a<T> parama)
  {
    int i;
    if ((paramInt & 0x1) == 0) {
      i = 400;
    } else {
      i = 700;
    }
    int j;
    if ((paramInt & 0x2) != 0) {
      j = 1;
    } else {
      j = 0;
    }
    int k = paramArrayOfT.length;
    Object localObject = null;
    int m = Integer.MAX_VALUE;
    paramInt = 0;
    while (paramInt < k)
    {
      T ? = paramArrayOfT[paramInt];
      int n = Math.abs(parama.a(?) - i);
      int i1;
      if (parama.b(?) == j) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      n = n * 2 + i1;
      if (localObject != null)
      {
        i1 = m;
        if (m <= n) {}
      }
      else
      {
        localObject = ?;
        i1 = n;
      }
      paramInt++;
      m = i1;
    }
    return (T)localObject;
  }
  
  public Typeface a(Context paramContext, d.c paramc, Resources paramResources, int paramInt)
  {
    throw null;
  }
  
  public Typeface b(Context paramContext, n[] paramArrayOfn, int paramInt)
  {
    throw null;
  }
  
  /* Error */
  public Typeface c(Context paramContext, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 45	x/m:d	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: invokestatic 48	x/m:c	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +10 -> 28
    //   21: aload_1
    //   22: invokevirtual 54	java/io/File:delete	()Z
    //   25: pop
    //   26: aconst_null
    //   27: areturn
    //   28: aload_1
    //   29: invokevirtual 58	java/io/File:getPath	()Ljava/lang/String;
    //   32: invokestatic 64	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   35: astore_2
    //   36: aload_1
    //   37: invokevirtual 54	java/io/File:delete	()Z
    //   40: pop
    //   41: aload_2
    //   42: areturn
    //   43: astore_2
    //   44: aload_1
    //   45: invokevirtual 54	java/io/File:delete	()Z
    //   48: pop
    //   49: aload_2
    //   50: athrow
    //   51: astore_2
    //   52: aload_1
    //   53: invokevirtual 54	java/io/File:delete	()Z
    //   56: pop
    //   57: aconst_null
    //   58: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	l
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
    //   1: invokestatic 45	x/m:d	(Landroid/content/Context;)Ljava/io/File;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: aload_2
    //   13: iload_3
    //   14: invokestatic 68	x/m:b	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   17: istore 6
    //   19: iload 6
    //   21: ifne +10 -> 31
    //   24: aload_1
    //   25: invokevirtual 54	java/io/File:delete	()Z
    //   28: pop
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 58	java/io/File:getPath	()Ljava/lang/String;
    //   35: invokestatic 64	android/graphics/Typeface:createFromFile	(Ljava/lang/String;)Landroid/graphics/Typeface;
    //   38: astore_2
    //   39: aload_1
    //   40: invokevirtual 54	java/io/File:delete	()Z
    //   43: pop
    //   44: aload_2
    //   45: areturn
    //   46: astore_2
    //   47: aload_1
    //   48: invokevirtual 54	java/io/File:delete	()Z
    //   51: pop
    //   52: aload_2
    //   53: athrow
    //   54: astore_2
    //   55: aload_1
    //   56: invokevirtual 54	java/io/File:delete	()Z
    //   59: pop
    //   60: aconst_null
    //   61: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	l
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
  
  public n f(int paramInt, n[] paramArrayOfn)
  {
    return (n)e(paramArrayOfn, paramInt, new k());
  }
  
  public static abstract interface a<T>
  {
    public abstract int a(T paramT);
    
    public abstract boolean b(T paramT);
  }
}

/* Location:
 * Qualified Name:     x.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */