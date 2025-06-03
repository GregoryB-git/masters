package I3;

import H3.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;

public class i$a
{
  public final AtomicMarkableReference a;
  public final AtomicReference b = new AtomicReference(null);
  public final boolean c;
  
  public i$a(i parami, boolean paramBoolean)
  {
    c = paramBoolean;
    int i;
    if (paramBoolean) {
      i = 8192;
    } else {
      i = 1024;
    }
    a = new AtomicMarkableReference(new b(64, i), false);
  }
  
  public Map b()
  {
    return ((b)a.getReference()).a();
  }
  
  public final void d()
  {
    h localh = new h(this);
    if (f.a(b, null, localh)) {
      i.b(d).h(localh);
    }
  }
  
  public final void e()
  {
    try
    {
      if (a.isMarked())
      {
        Map localMap1 = ((b)a.getReference()).a();
        AtomicMarkableReference localAtomicMarkableReference = a;
        localAtomicMarkableReference.set((b)localAtomicMarkableReference.getReference(), false);
      }
    }
    finally
    {
      break label81;
    }
    Map localMap2 = null;
    if (localMap2 != null) {
      i.d(d).m(i.c(d), localMap2, c);
    }
    return;
    label81:
    throw localMap2;
  }
  
  public boolean f(String paramString1, String paramString2)
  {
    label53:
    try
    {
      if (!((b)a.getReference()).d(paramString1, paramString2)) {
        return false;
      }
    }
    finally
    {
      break label53;
      paramString1 = a;
      paramString1.set((b)paramString1.getReference(), true);
      d();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     I3.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */