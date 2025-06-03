package F0;

import L0.c;
import X2.v;
import Y0.f;
import android.net.Uri;
import c1.t.a;
import c1.u;
import d0.o;
import g0.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C;
import l1.J;
import l1.j;

public final class m
  implements x
{
  public static final int[] r = { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21 };
  public static final a s = new a(new k());
  public static final a t = new a(new l());
  public boolean b;
  public boolean c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k = 1;
  public int l;
  public v m;
  public int n = 112800;
  public boolean o = true;
  public t.a p = new c1.h();
  public int q;
  
  public static Constructor f()
  {
    if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
      return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(new Class[] { Integer.TYPE });
    }
    return null;
  }
  
  public static Constructor g()
  {
    return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor(new Class[0]);
  }
  
  public r[] a()
  {
    try
    {
      Uri localUri = Uri.EMPTY;
      Object localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      localObject1 = b(localUri, (Map)localObject1);
      return (r[])localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public r[] b(Uri paramUri, Map paramMap)
  {
    ArrayList localArrayList;
    int i1;
    try
    {
      localArrayList = new java/util/ArrayList;
      localObject = r;
      localArrayList.<init>(localObject.length);
      i1 = o.b(paramMap);
      if (i1 != -1) {
        e(i1, localArrayList);
      }
    }
    finally
    {
      break label269;
    }
    int i2 = o.c(paramUri);
    if ((i2 != -1) && (i2 != i1)) {
      e(i2, localArrayList);
    }
    int i3 = localObject.length;
    int i4 = 0;
    for (int i5 = 0; i5 < i3; i5++)
    {
      int i6 = localObject[i5];
      if ((i6 != i1) && (i6 != i2)) {
        e(i6, localArrayList);
      }
    }
    Object localObject = new r[localArrayList.size()];
    for (i5 = i4; i5 < localArrayList.size(); i5++)
    {
      paramMap = (r)localArrayList.get(i5);
      paramUri = paramMap;
      if (o)
      {
        paramUri = paramMap;
        if (!(paramMap.d() instanceof Z0.h))
        {
          paramUri = paramMap;
          if (!(paramMap.d() instanceof Z0.m))
          {
            paramUri = paramMap;
            if (!(paramMap.d() instanceof J))
            {
              paramUri = paramMap;
              if (!(paramMap.d() instanceof H0.b))
              {
                paramUri = paramMap;
                if (!(paramMap.d() instanceof X0.e)) {
                  paramUri = new u(paramMap, p);
                }
              }
            }
          }
        }
      }
      localObject[i5] = paramUri;
    }
    return (r[])localObject;
    label269:
    throw paramUri;
  }
  
  public final void e(int paramInt, List paramList)
  {
    int i1 = 2;
    int i2 = 0;
    Object localObject;
    switch (paramInt)
    {
    case 13: 
    default: 
      break;
    case 21: 
      localObject = new I0.a();
    case 20: 
    case 19: 
    case 18: 
    case 17: 
    case 16: 
    case 15: 
    case 14: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
    case 1: 
    case 0: 
      for (;;)
      {
        paramList.add(localObject);
        break;
        paramInt = h;
        if (((paramInt & 0x2) != 0) || ((paramInt & 0x4) != 0)) {
          break;
        }
        localObject = new M0.a();
        continue;
        localObject = new J0.a();
        continue;
        localObject = new n1.a();
        continue;
        localObject = new b1.a();
        continue;
        localObject = new H0.b(true ^ o, p);
        continue;
        localObject = t.a(new Object[0]);
        if (localObject == null) {
          break;
        }
        do
        {
          break;
          localObject = new N0.a(q);
          break;
          localObject = new m1.b();
          break;
          if (m == null) {
            m = v.Y();
          }
          localObject = new J(k, o ^ true, p, new E(0L), new j(l, m), n);
          break;
          localObject = new C();
          break;
          localObject = new a1.d();
          break;
          localObject = p;
          i1 = i;
          if (o) {
            paramInt = 0;
          } else {
            paramInt = 32;
          }
          paramList.add(new Z0.h((t.a)localObject, i1 | paramInt));
          localObject = p;
          i1 = h;
          if (o) {
            paramInt = i2;
          } else {
            paramInt = 16;
          }
          localObject = new Z0.m((t.a)localObject, i1 | paramInt);
          break;
          paramInt = j;
          int i3 = b;
          if (!c) {
            i1 = 0;
          }
          localObject = new f(paramInt | i3 | i1);
          break;
          localObject = p;
          paramInt = g;
          if (o) {
            i1 = 0;
          }
          localObject = new X0.e((t.a)localObject, i1 | paramInt);
          break;
          localObject = new c();
          break;
          localObject = s.a(new Object[] { Integer.valueOf(f) });
        } while (localObject != null);
        localObject = new K0.d(f);
        continue;
        paramInt = e;
        int i4 = b;
        if (!c) {
          i1 = 0;
        }
        localObject = new G0.b(paramInt | i4 | i1);
        continue;
        paramInt = d;
        int i5 = b;
        if (!c) {
          i1 = 0;
        }
        localObject = new l1.h(paramInt | i5 | i1);
        continue;
        localObject = new l1.e();
        continue;
        localObject = new l1.b();
      }
    }
  }
  
  public m h(boolean paramBoolean)
  {
    try
    {
      c = paramBoolean;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public m i(boolean paramBoolean)
  {
    try
    {
      b = paramBoolean;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public m j(int paramInt)
  {
    try
    {
      j = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static final class a
  {
    public final a a;
    public final AtomicBoolean b;
    public Constructor c;
    
    public a(a parama)
    {
      a = parama;
      b = new AtomicBoolean(false);
    }
    
    public r a(Object... paramVarArgs)
    {
      Constructor localConstructor = b();
      if (localConstructor == null) {
        return null;
      }
      try
      {
        paramVarArgs = (r)localConstructor.newInstance(paramVarArgs);
        return paramVarArgs;
      }
      catch (Exception paramVarArgs)
      {
        throw new IllegalStateException("Unexpected error creating extractor", paramVarArgs);
      }
    }
    
    public final Constructor b()
    {
      Object localObject2;
      Constructor localConstructor2;
      synchronized (b)
      {
        if (b.get())
        {
          Constructor localConstructor1 = c;
          return localConstructor1;
        }
      }
    }
    
    public static abstract interface a
    {
      public abstract Constructor a();
    }
  }
}

/* Location:
 * Qualified Name:     F0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */