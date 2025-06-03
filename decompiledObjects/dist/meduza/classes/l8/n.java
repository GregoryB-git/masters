package l8;

import b.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k8.b;
import k8.i;

public final class n
{
  public final h a;
  public final i b;
  public String c;
  public final a d = new a(false);
  public final a e = new a(true);
  public final l f = new l();
  public final AtomicMarkableReference<String> g = new AtomicMarkableReference(null, false);
  
  public n(String paramString, p8.e parame, i parami)
  {
    c = paramString;
    a = new h(parame);
    b = parami;
  }
  
  public final class a
  {
    public final AtomicMarkableReference<e> a;
    public final AtomicReference<Runnable> b = new AtomicReference(null);
    public final boolean c;
    
    public a(boolean paramBoolean)
    {
      c = paramBoolean;
      int i;
      if (paramBoolean) {
        i = 8192;
      } else {
        i = 1024;
      }
      a = new AtomicMarkableReference(new e(i), false);
    }
    
    public final Map<String, String> a()
    {
      synchronized ((e)a.getReference())
      {
        Object localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(a);
        localObject1 = Collections.unmodifiableMap((Map)localObject1);
        return (Map<String, String>)localObject1;
      }
    }
    
    public final boolean b(String paramString1, String paramString2)
    {
      try
      {
        boolean bool = ((e)a.getReference()).b(paramString1, paramString2);
        int i = 0;
        if (!bool) {
          return false;
        }
        paramString1 = a;
        paramString1.set((e)paramString1.getReference(), true);
        paramString1 = new d(this, 13);
        paramString2 = b;
        do
        {
          if (paramString2.compareAndSet(null, paramString1))
          {
            i = 1;
            break;
          }
        } while (paramString2.get() == null);
        if (i != 0) {
          b.b.a(paramString1);
        }
        return true;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     l8.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */