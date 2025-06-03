package androidx.activity.result;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import java.util.ArrayList;
import java.util.Iterator;

public class ActivityResultRegistry$d
{
  public final d a;
  public final ArrayList b;
  
  public ActivityResultRegistry$d(d paramd)
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

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultRegistry.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */