package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.s.a;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class q
  extends r
{
  public static final s.a j = new a();
  public final HashMap c = new HashMap();
  public final HashMap d = new HashMap();
  public final HashMap e = new HashMap();
  public final boolean f;
  public boolean g = false;
  public boolean h = false;
  public boolean i = false;
  
  public q(boolean paramBoolean)
  {
    f = paramBoolean;
  }
  
  public static q i(t paramt)
  {
    return (q)new s(paramt, j).a(q.class);
  }
  
  public void d()
  {
    if (n.D0(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onCleared called for ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    g = true;
  }
  
  public void e(Fragment paramFragment)
  {
    if (i)
    {
      if (n.D0(2)) {
        Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
      }
      return;
    }
    if (c.containsKey(t)) {
      return;
    }
    c.put(t, paramFragment);
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Added ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (q.class == paramObject.getClass()))
    {
      paramObject = (q)paramObject;
      if ((!c.equals(c)) || (!d.equals(d)) || (!e.equals(e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public void f(Fragment paramFragment)
  {
    if (n.D0(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Clearing non-config state for ");
      ((StringBuilder)localObject).append(paramFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = (q)d.get(t);
    if (localObject != null)
    {
      ((q)localObject).d();
      d.remove(t);
    }
    localObject = (t)e.get(t);
    if (localObject != null)
    {
      ((t)localObject).a();
      e.remove(t);
    }
  }
  
  public Fragment g(String paramString)
  {
    return (Fragment)c.get(paramString);
  }
  
  public q h(Fragment paramFragment)
  {
    q localq1 = (q)d.get(t);
    q localq2 = localq1;
    if (localq1 == null)
    {
      localq2 = new q(f);
      d.put(t, localq2);
    }
    return localq2;
  }
  
  public int hashCode()
  {
    return (c.hashCode() * 31 + d.hashCode()) * 31 + e.hashCode();
  }
  
  public Collection j()
  {
    return new ArrayList(c.values());
  }
  
  public t k(Fragment paramFragment)
  {
    t localt1 = (t)e.get(t);
    t localt2 = localt1;
    if (localt1 == null)
    {
      localt2 = new t();
      e.put(t, localt2);
    }
    return localt2;
  }
  
  public boolean l()
  {
    return g;
  }
  
  public void m(Fragment paramFragment)
  {
    if (i)
    {
      if (n.D0(2)) {
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
      }
      return;
    }
    if ((c.remove(t) != null) && (n.D0(2)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Removed ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public void n(boolean paramBoolean)
  {
    i = paramBoolean;
  }
  
  public boolean o(Fragment paramFragment)
  {
    if (!c.containsKey(t)) {
      return true;
    }
    if (f) {
      return g;
    }
    return h ^ true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("FragmentManagerViewModel{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("} Fragments (");
    Iterator localIterator = c.values().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") Child Non Config (");
    localIterator = d.keySet().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") ViewModelStores (");
    localIterator = e.keySet().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public class a
    implements s.a
  {
    public r a(Class paramClass)
    {
      return new q(true);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */