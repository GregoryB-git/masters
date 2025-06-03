package c4;

import android.net.Uri;
import b.z;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.w;
import o7.l0;
import o7.t;
import o7.t.b;
import r3.j;

public final class f
  implements k
{
  public static final int[] e = { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14 };
  public static final a f = new a(new j(11));
  public static final a g = new a(new e0.d(13));
  public boolean a;
  public boolean b;
  public int c;
  public l0 d;
  
  public f()
  {
    t.b localb = t.b;
    d = l0.e;
  }
  
  public final h[] a(Uri paramUri, Map<String, List<String>> paramMap)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      int[] arrayOfInt = e;
      localArrayList.<init>(16);
      int i = z.l(paramMap);
      if (i != -1) {
        b(i, localArrayList);
      }
      int j = z.m(paramUri);
      if ((j != -1) && (j != i)) {
        b(j, localArrayList);
      }
      for (int k = 0; k < 16; k++)
      {
        int m = arrayOfInt[k];
        if ((m != i) && (m != j)) {
          b(m, localArrayList);
        }
      }
      paramUri = (h[])localArrayList.toArray(new h[localArrayList.size()]);
      return paramUri;
    }
    finally {}
  }
  
  public final void b(int paramInt, ArrayList paramArrayList)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    Object localObject;
    boolean bool;
    switch (paramInt)
    {
    case 13: 
    default: 
      break;
    case 16: 
      localObject = new e4.b();
      break;
    case 15: 
      localObject = g.a(new Object[0]);
      if (localObject == null) {
        return;
      }
      break;
    case 14: 
      localObject = new h4.a();
      break;
    case 12: 
      localObject = new n4.a();
      break;
    case 11: 
      localObject = new m4.c0(1, new v5.c0(0L), new m4.g(0, d));
      break;
    case 10: 
      localObject = new w();
      break;
    case 9: 
      localObject = new l4.c();
      break;
    case 8: 
      paramArrayList.add(new k4.e());
      localObject = new k4.g(0);
      break;
    case 7: 
      i = c;
      int m = a;
      paramInt = k;
      if (b) {
        paramInt = 2;
      }
      localObject = new j4.d(paramInt | i | m);
      break;
    case 6: 
      localObject = new i4.d(0);
      break;
    case 5: 
      localObject = new g4.b();
      break;
    case 4: 
      localObject = f.a(new Object[] { Integer.valueOf(0) });
      if (localObject == null) {
        localObject = new f4.b();
      }
      break;
    case 3: 
      bool = a;
      paramInt = i;
      if (b) {
        paramInt = 2;
      }
      localObject = new d4.a(paramInt | bool | false);
      break;
    case 2: 
      bool = a;
      paramInt = j;
      if (b) {
        paramInt = 2;
      }
      localObject = new m4.e(paramInt | bool | false);
      break;
    case 1: 
      localObject = new m4.c();
      break;
    case 0: 
      localObject = new m4.a();
    }
    paramArrayList.add(localObject);
  }
  
  public static final class a
  {
    public final a a;
    public final AtomicBoolean b;
    
    public a(a parama)
    {
      a = parama;
      b = new AtomicBoolean(false);
    }
    
    public final h a(Object... paramVarArgs)
    {
      synchronized (b)
      {
        boolean bool = b.get();
        Object localObject2;
        if (!bool) {
          try
          {
            localObject1 = a.b();
          }
          catch (Exception paramVarArgs)
          {
            Object localObject1 = new java/lang/RuntimeException;
            ((RuntimeException)localObject1).<init>("Error instantiating extension", paramVarArgs);
            throw ((Throwable)localObject1);
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            b.set(true);
          }
        } else {
          localObject2 = null;
        }
        if (localObject2 == null) {
          return null;
        }
        try
        {
          paramVarArgs = (h)((Constructor)localObject2).newInstance(paramVarArgs);
          return paramVarArgs;
        }
        catch (Exception paramVarArgs)
        {
          throw new IllegalStateException("Unexpected error creating extractor", paramVarArgs);
        }
      }
    }
    
    public static abstract interface a
    {
      public abstract Constructor<? extends h> b();
    }
  }
}

/* Location:
 * Qualified Name:     c4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */