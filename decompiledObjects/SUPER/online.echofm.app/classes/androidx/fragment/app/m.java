package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class m
{
  public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
  public final n b;
  
  public m(n paramn)
  {
    b = paramn;
  }
  
  public void a(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().a(paramFragment, paramBundle, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.a(b, paramFragment, paramBundle);
      }
    }
  }
  
  public void b(Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = b.s0().i();
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().b(paramFragment, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.b(b, paramFragment, localContext);
      }
    }
  }
  
  public void c(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().c(paramFragment, paramBundle, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.c(b, paramFragment, paramBundle);
      }
    }
  }
  
  public void d(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().d(paramFragment, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.d(b, paramFragment);
      }
    }
  }
  
  public void e(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().e(paramFragment, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.e(b, paramFragment);
      }
    }
  }
  
  public void f(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().f(paramFragment, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.f(b, paramFragment);
      }
    }
  }
  
  public void g(Fragment paramFragment, boolean paramBoolean)
  {
    Context localContext = b.s0().i();
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().g(paramFragment, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.g(b, paramFragment, localContext);
      }
    }
  }
  
  public void h(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().h(paramFragment, paramBundle, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.h(b, paramFragment, paramBundle);
      }
    }
  }
  
  public void i(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().i(paramFragment, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.i(b, paramFragment);
      }
    }
  }
  
  public void j(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().j(paramFragment, paramBundle, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.j(b, paramFragment, paramBundle);
      }
    }
  }
  
  public void k(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().k(paramFragment, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.k(b, paramFragment);
      }
    }
  }
  
  public void l(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().l(paramFragment, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.l(b, paramFragment);
      }
    }
  }
  
  public void m(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().m(paramFragment, paramView, paramBundle, true);
    }
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if ((!paramBoolean) || (b)) {
        a.m(b, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  public void n(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = b.v0();
    if (localObject != null) {
      ((Fragment)localObject).F().u0().n(paramFragment, true);
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      if ((!paramBoolean) || (b)) {
        a.n(b, paramFragment);
      }
    }
  }
  
  public void o(n.l paraml, boolean paramBoolean)
  {
    a.add(new a(paraml, paramBoolean));
  }
  
  public void p(n.l paraml)
  {
    for (;;)
    {
      int j;
      synchronized (a)
      {
        int i = a.size();
        j = 0;
        if (j >= i) {
          break;
        }
        if (a.get(j)).a == paraml) {
          a.remove(j);
        }
      }
      j++;
    }
  }
  
  public static final class a
  {
    public final n.l a;
    public final boolean b;
    
    public a(n.l paraml, boolean paramBoolean)
    {
      a = paraml;
      b = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */