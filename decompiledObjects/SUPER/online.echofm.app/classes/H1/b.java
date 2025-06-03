package H1;

import V5.m;
import V5.q;
import W5.C;
import W5.I;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class b
{
  public static final a m = new a(null);
  public static final Map n = C.e(new m[] { q.a("embedding.weight", "embed.weight"), q.a("dense1.weight", "fc1.weight"), q.a("dense2.weight", "fc2.weight"), q.a("dense3.weight", "fc3.weight"), q.a("dense1.bias", "fc1.bias"), q.a("dense2.bias", "fc2.bias"), q.a("dense3.bias", "fc3.bias") });
  public final a a;
  public final a b;
  public final a c;
  public final a d;
  public final a e;
  public final a f;
  public final a g;
  public final a h;
  public final a i;
  public final a j;
  public final a k;
  public final Map l;
  
  public b(Map paramMap)
  {
    Object localObject1 = paramMap.get("embed.weight");
    if (localObject1 != null)
    {
      a = ((a)localObject1);
      localObject1 = i.a;
      localObject1 = paramMap.get("convs.0.weight");
      if (localObject1 != null)
      {
        b = i.l((a)localObject1);
        localObject1 = paramMap.get("convs.1.weight");
        if (localObject1 != null)
        {
          c = i.l((a)localObject1);
          localObject1 = paramMap.get("convs.2.weight");
          if (localObject1 != null)
          {
            d = i.l((a)localObject1);
            localObject1 = paramMap.get("convs.0.bias");
            if (localObject1 != null)
            {
              e = ((a)localObject1);
              localObject1 = paramMap.get("convs.1.bias");
              if (localObject1 != null)
              {
                f = ((a)localObject1);
                localObject1 = paramMap.get("convs.2.bias");
                if (localObject1 != null)
                {
                  g = ((a)localObject1);
                  localObject1 = paramMap.get("fc1.weight");
                  if (localObject1 != null)
                  {
                    h = i.k((a)localObject1);
                    localObject1 = paramMap.get("fc2.weight");
                    if (localObject1 != null)
                    {
                      i = i.k((a)localObject1);
                      localObject1 = paramMap.get("fc1.bias");
                      if (localObject1 != null)
                      {
                        j = ((a)localObject1);
                        localObject1 = paramMap.get("fc2.bias");
                        if (localObject1 != null)
                        {
                          k = ((a)localObject1);
                          l = new HashMap();
                          Iterator localIterator = I.f(new String[] { f.a.o.e(), f.a.p.e() }).iterator();
                          while (localIterator.hasNext())
                          {
                            Object localObject2 = (String)localIterator.next();
                            localObject1 = Intrinsics.i((String)localObject2, ".weight");
                            String str = Intrinsics.i((String)localObject2, ".bias");
                            a locala = (a)paramMap.get(localObject1);
                            localObject2 = (a)paramMap.get(str);
                            if (locala != null)
                            {
                              locala = i.k(locala);
                              l.put(localObject1, locala);
                            }
                            if (localObject2 != null) {
                              l.put(str, localObject2);
                            }
                          }
                          return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                      }
                      throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                  }
                  throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
              }
              throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
          }
          throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final a b(a parama, String[] paramArrayOfString, String paramString)
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "dense");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "texts");
      Intrinsics.checkNotNullParameter(paramString, "task");
      Object localObject = i.a;
      localObject = i.c(i.e(paramArrayOfString, 128, a), b);
      i.a((a)localObject, e);
      i.i((a)localObject);
      paramArrayOfString = i.c((a)localObject, c);
      i.a(paramArrayOfString, f);
      i.i(paramArrayOfString);
      a locala = i.g(paramArrayOfString, 2);
      paramArrayOfString = i.c(locala, d);
      i.a(paramArrayOfString, g);
      i.i(paramArrayOfString);
      localObject = i.g((a)localObject, ((a)localObject).b(1));
      locala = i.g(locala, locala.b(1));
      paramArrayOfString = i.g(paramArrayOfString, paramArrayOfString.b(1));
      i.f((a)localObject, 1);
      i.f(locala, 1);
      i.f(paramArrayOfString, 1);
      parama = i.d(i.b(new a[] { localObject, locala, paramArrayOfString, parama }), h, j);
      i.i(parama);
      paramArrayOfString = i.d(parama, i, k);
      i.i(paramArrayOfString);
      parama = (a)l.get(Intrinsics.i(paramString, ".weight"));
      paramString = (a)l.get(Intrinsics.i(paramString, ".bias"));
      if ((parama != null) && (paramString != null))
      {
        parama = i.d(paramArrayOfString, parama, paramString);
        i.j(parama);
        return parama;
      }
    }
    finally
    {
      break label296;
      return null;
      label296:
      T1.a.b(parama, this);
    }
    return null;
  }
  
  public static final class a
  {
    public final b a(File paramFile)
    {
      Intrinsics.checkNotNullParameter(paramFile, "file");
      paramFile = b(paramFile);
      if (paramFile == null) {
        return null;
      }
      try
      {
        paramFile = new b(paramFile, null);
        return paramFile;
      }
      catch (Exception paramFile) {}
      return null;
    }
    
    public final Map b(File paramFile)
    {
      paramFile = j.c(paramFile);
      if (paramFile != null)
      {
        HashMap localHashMap = new HashMap();
        Map localMap = b.a();
        Iterator localIterator = paramFile.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          paramFile = (String)localEntry.getKey();
          if (localMap.containsKey(localEntry.getKey()))
          {
            String str = (String)localMap.get(localEntry.getKey());
            paramFile = str;
            if (str == null) {
              return null;
            }
          }
          localHashMap.put(paramFile, localEntry.getValue());
        }
        return localHashMap;
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     H1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */