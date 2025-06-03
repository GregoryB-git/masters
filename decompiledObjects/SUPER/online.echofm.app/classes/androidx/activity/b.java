package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b
{
  public boolean a;
  public CopyOnWriteArrayList b = new CopyOnWriteArrayList();
  
  public b(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public void a(a parama)
  {
    b.add(parama);
  }
  
  public abstract void b();
  
  public final boolean c()
  {
    return a;
  }
  
  public final void d()
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).cancel();
    }
  }
  
  public void e(a parama)
  {
    b.remove(parama);
  }
  
  public final void f(boolean paramBoolean)
  {
    a = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */