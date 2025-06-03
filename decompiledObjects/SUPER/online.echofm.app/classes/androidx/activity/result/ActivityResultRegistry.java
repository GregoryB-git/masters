package androidx.activity.result;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry
{
  public Random a = new Random();
  public final Map b = new HashMap();
  public final Map c = new HashMap();
  public final Map d = new HashMap();
  public final transient Map e = new HashMap();
  public final Map f = new HashMap();
  public final Bundle g = new Bundle();
  
  public final void a(int paramInt, String paramString)
  {
    b.put(Integer.valueOf(paramInt), paramString);
    c.put(paramString, Integer.valueOf(paramInt));
  }
  
  public final boolean b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = (String)b.get(Integer.valueOf(paramInt1));
    if (str == null) {
      return false;
    }
    d(str, paramInt2, paramIntent, (c)e.get(str));
    return true;
  }
  
  public final boolean c(int paramInt, Object paramObject)
  {
    String str = (String)b.get(Integer.valueOf(paramInt));
    if (str == null) {
      return false;
    }
    Object localObject = (c)e.get(str);
    if (localObject != null)
    {
      localObject = a;
      if (localObject != null)
      {
        ((b)localObject).a(paramObject);
        break label89;
      }
    }
    g.remove(str);
    f.put(str, paramObject);
    label89:
    return true;
  }
  
  public final void d(String paramString, int paramInt, Intent paramIntent, c paramc)
  {
    if (paramc != null)
    {
      b localb = a;
      if (localb != null)
      {
        localb.a(b.c(paramInt, paramIntent));
        return;
      }
    }
    f.remove(paramString);
    g.putParcelable(paramString, new a(paramInt, paramIntent));
  }
  
  public final int e()
  {
    for (int i = a.nextInt(2147418112);; i = a.nextInt(2147418112))
    {
      i += 65536;
      if (!b.containsKey(Integer.valueOf(i))) {
        break;
      }
    }
    return i;
  }
  
  public abstract void f(int paramInt, d.a parama, Object paramObject, w.b paramb);
  
  public final void g(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList localArrayList2 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if ((localArrayList2 != null) && (localArrayList1 != null))
    {
      int i = localArrayList2.size();
      for (int j = 0; j < i; j++) {
        a(((Integer)localArrayList1.get(j)).intValue(), (String)localArrayList2.get(j));
      }
      a = ((Random)paramBundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"));
      g.putAll(paramBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }
  }
  
  public final void h(Bundle paramBundle)
  {
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(b.keySet()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(b.values()));
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)g.clone());
    paramBundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", a);
  }
  
  public final c i(final String paramString, h paramh, final d.a parama, final b paramb)
  {
    d locald = paramh.g();
    if (!locald.b().c(d.c.r))
    {
      final int i = k(paramString);
      d locald1 = (d)d.get(paramString);
      paramh = locald1;
      if (locald1 == null) {
        paramh = new d(locald);
      }
      paramh.a(new f()
      {
        public void a(h paramAnonymoush, d.b paramAnonymousb)
        {
          if (d.b.ON_START.equals(paramAnonymousb))
          {
            e.put(paramString, new ActivityResultRegistry.c(paramb, parama));
            if (f.containsKey(paramString))
            {
              paramAnonymoush = f.get(paramString);
              f.remove(paramString);
              paramb.a(paramAnonymoush);
            }
            paramAnonymoush = (a)g.getParcelable(paramString);
            if (paramAnonymoush != null)
            {
              g.remove(paramString);
              paramb.a(parama.c(paramAnonymoush.b(), paramAnonymoush.a()));
            }
          }
          else if (d.b.ON_STOP.equals(paramAnonymousb))
          {
            e.remove(paramString);
          }
          else if (d.b.ON_DESTROY.equals(paramAnonymousb))
          {
            l(paramString);
          }
        }
      });
      d.put(paramString, paramh);
      return new a(i, parama, paramString);
    }
    paramString = new StringBuilder();
    paramString.append("LifecycleOwner ");
    paramString.append(paramh);
    paramString.append(" is attempting to register while current state is ");
    paramString.append(locald.b());
    paramString.append(". LifecycleOwners must call register before they are STARTED.");
    throw new IllegalStateException(paramString.toString());
  }
  
  public final c j(final String paramString, final d.a parama, b paramb)
  {
    final int i = k(paramString);
    e.put(paramString, new c(paramb, parama));
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
      paramb.a(parama.c(((a)localObject).b(), ((a)localObject).a()));
    }
    return new b(i, parama, paramString);
  }
  
  public final int k(String paramString)
  {
    Integer localInteger = (Integer)c.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    int i = e();
    a(i, paramString);
    return i;
  }
  
  public final void l(String paramString)
  {
    Object localObject = (Integer)c.remove(paramString);
    if (localObject != null) {
      b.remove(localObject);
    }
    e.remove(paramString);
    if (f.containsKey(paramString))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Dropping pending result for request ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(": ");
      ((StringBuilder)localObject).append(f.get(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      f.remove(paramString);
    }
    if (g.containsKey(paramString))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Dropping pending result for request ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(": ");
      ((StringBuilder)localObject).append(g.getParcelable(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      g.remove(paramString);
    }
    localObject = (d)d.get(paramString);
    if (localObject != null)
    {
      ((d)localObject).b();
      d.remove(paramString);
    }
  }
  
  public class a
    extends c
  {
    public a(int paramInt, d.a parama, String paramString) {}
    
    public void b(Object paramObject, w.b paramb)
    {
      f(i, parama, paramObject, paramb);
    }
    
    public void c()
    {
      l(paramString);
    }
  }
  
  public class b
    extends c
  {
    public b(int paramInt, d.a parama, String paramString) {}
    
    public void b(Object paramObject, w.b paramb)
    {
      f(i, parama, paramObject, paramb);
    }
    
    public void c()
    {
      l(paramString);
    }
  }
  
  public static class c
  {
    public final b a;
    public final d.a b;
    
    public c(b paramb, d.a parama)
    {
      a = paramb;
      b = parama;
    }
  }
  
  public static class d
  {
    public final d a;
    public final ArrayList b;
    
    public d(d paramd)
    {
      a = paramd;
      b = new ArrayList();
    }
    
    public void a(f paramf)
    {
      a.a(paramf);
      b.add(paramf);
    }
    
    public void b()
    {
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        a.c(localf);
      }
      b.clear();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */