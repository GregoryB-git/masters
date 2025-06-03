package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class u
{
  public final ArrayList a = new ArrayList();
  public final HashMap b = new HashMap();
  public q c;
  
  public void a(Fragment paramFragment)
  {
    if (!a.contains(paramFragment)) {
      synchronized (a)
      {
        a.add(paramFragment);
        z = true;
        return;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Fragment already added: ");
    ((StringBuilder)???).append(paramFragment);
    throw new IllegalStateException(((StringBuilder)???).toString());
  }
  
  public void b()
  {
    b.values().removeAll(Collections.singleton(null));
  }
  
  public boolean c(String paramString)
  {
    boolean bool;
    if (b.get(paramString) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d(int paramInt)
  {
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      t localt = (t)localIterator.next();
      if (localt != null) {
        localt.t(paramInt);
      }
    }
  }
  
  public void e(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    String str = ((StringBuilder)localObject1).toString();
    if (!b.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Active Fragments:");
      localObject1 = b.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (t)((Iterator)localObject1).next();
        paramPrintWriter.print(paramString);
        if (localObject2 != null)
        {
          localObject2 = ((t)localObject2).k();
          paramPrintWriter.println(localObject2);
          ((Fragment)localObject2).h(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
        else
        {
          paramPrintWriter.println("null");
        }
      }
    }
    int i = a.size();
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (int j = 0; j < i; j++)
      {
        paramFileDescriptor = (Fragment)a.get(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(paramFileDescriptor.toString());
      }
    }
  }
  
  public Fragment f(String paramString)
  {
    paramString = (t)b.get(paramString);
    if (paramString != null) {
      return paramString.k();
    }
    return null;
  }
  
  public Fragment g(int paramInt)
  {
    for (int i = a.size() - 1; i >= 0; i--)
    {
      localObject1 = (Fragment)a.get(i);
      if ((localObject1 != null) && (K == paramInt)) {
        return (Fragment)localObject1;
      }
    }
    Object localObject1 = b.values().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (t)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        localObject2 = ((t)localObject2).k();
        if (K == paramInt) {
          return (Fragment)localObject2;
        }
      }
    }
    return null;
  }
  
  public Fragment h(String paramString)
  {
    Object localObject1;
    if (paramString != null) {
      for (int i = a.size() - 1; i >= 0; i--)
      {
        localObject1 = (Fragment)a.get(i);
        if ((localObject1 != null) && (paramString.equals(M))) {
          return (Fragment)localObject1;
        }
      }
    }
    if (paramString != null)
    {
      localObject1 = b.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (t)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((t)localObject2).k();
          if (paramString.equals(M)) {
            return (Fragment)localObject2;
          }
        }
      }
    }
    return null;
  }
  
  public Fragment i(String paramString)
  {
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (t)localIterator.next();
      if (localObject != null)
      {
        localObject = ((t)localObject).k().l(paramString);
        if (localObject != null) {
          return (Fragment)localObject;
        }
      }
    }
    return null;
  }
  
  public int j(Fragment paramFragment)
  {
    ViewGroup localViewGroup = U;
    if (localViewGroup == null) {
      return -1;
    }
    int i = a.indexOf(paramFragment);
    int k;
    for (int j = i - 1;; j--)
    {
      k = i;
      if (j < 0) {
        break;
      }
      paramFragment = (Fragment)a.get(j);
      if (U == localViewGroup)
      {
        paramFragment = V;
        if (paramFragment != null) {
          return localViewGroup.indexOfChild(paramFragment) + 1;
        }
      }
    }
    for (;;)
    {
      k++;
      if (k >= a.size()) {
        break;
      }
      paramFragment = (Fragment)a.get(k);
      if (U == localViewGroup)
      {
        paramFragment = V;
        if (paramFragment != null) {
          return localViewGroup.indexOfChild(paramFragment);
        }
      }
    }
    return -1;
  }
  
  public List k()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      t localt = (t)localIterator.next();
      if (localt != null) {
        localArrayList.add(localt);
      }
    }
    return localArrayList;
  }
  
  public List l()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.values().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (t)localIterator.next();
      if (localObject != null) {}
      for (localObject = ((t)localObject).k();; localObject = null)
      {
        localArrayList.add(localObject);
        break;
      }
    }
    return localArrayList;
  }
  
  public t m(String paramString)
  {
    return (t)b.get(paramString);
  }
  
  public List n()
  {
    if (a.isEmpty()) {
      return Collections.emptyList();
    }
    synchronized (a)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(a);
      return localArrayList2;
    }
  }
  
  public q o()
  {
    return c;
  }
  
  public void p(t paramt)
  {
    Fragment localFragment = paramt.k();
    if (c(t)) {
      return;
    }
    b.put(t, paramt);
    if (Q)
    {
      if (P) {
        c.e(localFragment);
      } else {
        c.m(localFragment);
      }
      Q = false;
    }
    if (n.D0(2))
    {
      paramt = new StringBuilder();
      paramt.append("Added fragment to active set ");
      paramt.append(localFragment);
      Log.v("FragmentManager", paramt.toString());
    }
  }
  
  public void q(t paramt)
  {
    paramt = paramt.k();
    if (P) {
      c.m(paramt);
    }
    if ((t)b.put(t, null) == null) {
      return;
    }
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Removed fragment from active set ");
      localStringBuilder.append(paramt);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public void r()
  {
    Object localObject1 = a.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Fragment)((Iterator)localObject1).next();
      localObject2 = (t)b.get(t);
      if (localObject2 != null) {
        ((t)localObject2).m();
      }
    }
    Object localObject2 = b.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      t localt = (t)((Iterator)localObject2).next();
      if (localt != null)
      {
        localt.m();
        localObject1 = localt.k();
        if ((A) && (!((Fragment)localObject1).Y())) {
          q(localt);
        }
      }
    }
  }
  
  public void s(Fragment paramFragment)
  {
    synchronized (a)
    {
      a.remove(paramFragment);
      z = false;
      return;
    }
  }
  
  public void t()
  {
    b.clear();
  }
  
  public void u(List paramList)
  {
    a.clear();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        Fragment localFragment = f(paramList);
        StringBuilder localStringBuilder;
        if (localFragment != null)
        {
          if (n.D0(2))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("restoreSaveState: added (");
            localStringBuilder.append(paramList);
            localStringBuilder.append("): ");
            localStringBuilder.append(localFragment);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          a(localFragment);
        }
        else
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("No instantiated fragment for (");
          localStringBuilder.append(paramList);
          localStringBuilder.append(")");
          throw new IllegalStateException(localStringBuilder.toString());
        }
      }
    }
  }
  
  public ArrayList v()
  {
    ArrayList localArrayList = new ArrayList(b.size());
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (t)localIterator.next();
      if (localObject != null)
      {
        Fragment localFragment = ((t)localObject).k();
        localObject = ((t)localObject).r();
        localArrayList.add(localObject);
        if (n.D0(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Saved state of ");
          localStringBuilder.append(localFragment);
          localStringBuilder.append(": ");
          localStringBuilder.append(A);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
      }
    }
    return localArrayList;
  }
  
  public ArrayList w()
  {
    ArrayList localArrayList2;
    Iterator localIterator;
    Fragment localFragment;
    StringBuilder localStringBuilder;
    synchronized (a)
    {
      if (a.isEmpty()) {
        return null;
      }
    }
  }
  
  public void x(q paramq)
  {
    c = paramq;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */