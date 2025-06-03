package d;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import b1.k;
import b1.k.b;
import b1.m;
import b1.n;
import b1.o;
import gc.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public abstract class g
{
  public final HashMap a = new HashMap();
  public final HashMap b = new HashMap();
  public final HashMap c = new HashMap();
  public ArrayList<String> d = new ArrayList();
  public final transient HashMap e = new HashMap();
  public final HashMap f = new HashMap();
  public final Bundle g = new Bundle();
  
  public final boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = (String)a.get(Integer.valueOf(paramInt1));
    if (str == null) {
      return false;
    }
    a locala = (a)e.get(str);
    if ((locala != null) && (a != null) && (d.contains(str)))
    {
      a.a(b.c(paramInt2, paramIntent));
      d.remove(str);
    }
    else
    {
      f.remove(str);
      g.putParcelable(str, new a(paramInt2, paramIntent));
    }
    return true;
  }
  
  public abstract void b(int paramInt, e.a parama, Object paramObject);
  
  public final e c(String paramString, o paramo, e.a parama, b paramb)
  {
    k localk = paramo.getLifecycle();
    int i;
    if (localk.b().compareTo(k.b.d) >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      e(paramString);
      b localb = (b)c.get(paramString);
      paramo = localb;
      if (localb == null) {
        paramo = new b(localk);
      }
      paramb = new d(this, paramString, paramb, parama);
      a.a(paramb);
      b.add(paramb);
      c.put(paramString, paramo);
      return new e(this, paramString, parama);
    }
    paramString = new StringBuilder();
    paramString.append("LifecycleOwner ");
    paramString.append(paramo);
    paramString.append(" is attempting to register while current state is ");
    paramString.append(localk.b());
    paramString.append(". LifecycleOwners must call register before they are STARTED.");
    throw new IllegalStateException(paramString.toString());
  }
  
  public final f d(String paramString, e.a parama, b paramb)
  {
    e(paramString);
    e.put(paramString, new a(parama, paramb));
    if (f.containsKey(paramString))
    {
      localObject = f.get(paramString);
      f.remove(paramString);
      paramb.a(localObject);
    }
    Object localObject = (a)g.getParcelable(paramString);
    if (localObject != null)
    {
      g.remove(paramString);
      paramb.a(parama.c(a, b));
    }
    return new f(this, paramString, parama);
  }
  
  public final void e(String paramString)
  {
    if ((Integer)b.get(paramString) != null) {
      return;
    }
    c.a.getClass();
    for (int i = c.b.a().nextInt(2147418112);; i = c.b.a().nextInt(2147418112))
    {
      i += 65536;
      if (!a.containsKey(Integer.valueOf(i))) {
        break;
      }
      c.a.getClass();
    }
    a.put(Integer.valueOf(i), paramString);
    b.put(paramString, Integer.valueOf(i));
  }
  
  public final void f(String paramString)
  {
    Object localObject;
    if (!d.contains(paramString))
    {
      localObject = (Integer)b.remove(paramString);
      if (localObject != null) {
        a.remove(localObject);
      }
    }
    e.remove(paramString);
    if (f.containsKey(paramString))
    {
      localObject = f.m("Dropping pending result for request ", paramString, ": ");
      ((StringBuilder)localObject).append(f.get(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      f.remove(paramString);
    }
    if (g.containsKey(paramString))
    {
      localObject = f.m("Dropping pending result for request ", paramString, ": ");
      ((StringBuilder)localObject).append(g.getParcelable(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      g.remove(paramString);
    }
    b localb = (b)c.get(paramString);
    if (localb != null)
    {
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        localObject = (m)localIterator.next();
        a.c((n)localObject);
      }
      b.clear();
      c.remove(paramString);
    }
  }
  
  public static final class a<O>
  {
    public final b<O> a;
    public final e.a<?, O> b;
    
    public a(e.a parama, b paramb)
    {
      a = paramb;
      b = parama;
    }
  }
  
  public static final class b
  {
    public final k a;
    public final ArrayList<m> b;
    
    public b(k paramk)
    {
      a = paramk;
      b = new ArrayList();
    }
  }
}

/* Location:
 * Qualified Name:     d.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */