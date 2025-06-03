package x0;

import android.util.Log;
import b1.o0;
import b1.q0.b;
import b1.s0;
import c1.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class b0
  extends o0
{
  public static final a j = new a();
  public final HashMap<String, i> d = new HashMap();
  public final HashMap<String, b0> e = new HashMap();
  public final HashMap<String, s0> f = new HashMap();
  public final boolean g;
  public boolean h = false;
  public boolean i = false;
  
  public b0(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public final void b()
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onCleared called for ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    h = true;
  }
  
  public final void c(i parami)
  {
    if (i)
    {
      if (y.L(2)) {
        Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
      }
      return;
    }
    if (d.containsKey(mWho)) {
      return;
    }
    d.put(mWho, parami);
    if (y.L(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Added ");
      localStringBuilder.append(parami);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public final void d(String paramString, boolean paramBoolean)
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Clearing non-config state for saved state of Fragment ");
      localStringBuilder.append(paramString);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    f(paramString, paramBoolean);
  }
  
  public final void e(i parami, boolean paramBoolean)
  {
    if (y.L(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Clearing non-config state for ");
      localStringBuilder.append(parami);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    f(mWho, paramBoolean);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b0.class == paramObject.getClass()))
    {
      paramObject = (b0)paramObject;
      if ((!d.equals(d)) || (!e.equals(e)) || (!f.equals(f))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final void f(String paramString, boolean paramBoolean)
  {
    Object localObject1 = (b0)e.get(paramString);
    if (localObject1 != null)
    {
      if (paramBoolean)
      {
        Object localObject2 = new ArrayList();
        ((ArrayList)localObject2).addAll(e.keySet());
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((b0)localObject1).d((String)((Iterator)localObject2).next(), true);
        }
      }
      ((b0)localObject1).b();
      e.remove(paramString);
    }
    localObject1 = (s0)f.get(paramString);
    if (localObject1 != null)
    {
      ((s0)localObject1).a();
      f.remove(paramString);
    }
  }
  
  public final void g(i parami)
  {
    if (i)
    {
      if (y.L(2)) {
        Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
      }
      return;
    }
    int k;
    if (d.remove(mWho) != null) {
      k = 1;
    } else {
      k = 0;
    }
    if ((k != 0) && (y.L(2)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Updating retained Fragments: Removed ");
      localStringBuilder.append(parami);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public final int hashCode()
  {
    int k = d.hashCode();
    int m = e.hashCode();
    return f.hashCode() + (m + k * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("FragmentManagerViewModel{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("} Fragments (");
    Iterator localIterator = d.values().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") Child Non Config (");
    localIterator = e.keySet().iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append(") ViewModelStores (");
    localIterator = f.keySet().iterator();
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
  
  public final class a
    implements q0.b
  {
    public final <T extends o0> T a(Class<T> paramClass)
    {
      return new b0(true);
    }
    
    public final o0 b(Class paramClass, b paramb)
    {
      return a(paramClass);
    }
  }
}

/* Location:
 * Qualified Name:     x0.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */