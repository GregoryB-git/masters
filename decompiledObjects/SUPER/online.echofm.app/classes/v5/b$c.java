package v5;

import B5.c;
import E5.m;
import E5.n;
import E5.o;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.lifecycle.d;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class b$c
  implements c
{
  public final Activity a;
  public final HiddenLifecycleReference b;
  public final Set c = new HashSet();
  public final Set d = new HashSet();
  public final Set e = new HashSet();
  public final Set f = new HashSet();
  public final Set g = new HashSet();
  public final Set h = new HashSet();
  
  public b$c(Activity paramActivity, d paramd)
  {
    a = paramActivity;
    b = new HiddenLifecycleReference(paramd);
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Iterator localIterator = new HashSet(d).iterator();
    for (boolean bool = false;; bool = true)
    {
      if (!localIterator.hasNext()) {
        break label61;
      }
      if ((!((m)localIterator.next()).a(paramInt1, paramInt2, paramIntent)) && (!bool)) {
        break;
      }
    }
    label61:
    return bool;
  }
  
  public void b(Intent paramIntent)
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext()) {
      ((n)localIterator.next()).onNewIntent(paramIntent);
    }
  }
  
  public Activity c()
  {
    return a;
  }
  
  public void d(m paramm)
  {
    d.remove(paramm);
  }
  
  public void e(o paramo)
  {
    c.add(paramo);
  }
  
  public void f(o paramo)
  {
    c.remove(paramo);
  }
  
  public void g(n paramn)
  {
    e.add(paramn);
  }
  
  public void h(m paramm)
  {
    d.add(paramm);
  }
  
  public void i(n paramn)
  {
    e.remove(paramn);
  }
  
  public boolean j(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Iterator localIterator = c.iterator();
    for (boolean bool = false;; bool = true)
    {
      if (!localIterator.hasNext()) {
        break label56;
      }
      if ((!((o)localIterator.next()).b(paramInt, paramArrayOfString, paramArrayOfInt)) && (!bool)) {
        break;
      }
    }
    label56:
    return bool;
  }
  
  public void k(Bundle paramBundle)
  {
    paramBundle = h.iterator();
    if (!paramBundle.hasNext()) {
      return;
    }
    a.a(paramBundle.next());
    throw null;
  }
  
  public void l(Bundle paramBundle)
  {
    paramBundle = h.iterator();
    if (!paramBundle.hasNext()) {
      return;
    }
    a.a(paramBundle.next());
    throw null;
  }
  
  public void m()
  {
    Iterator localIterator = f.iterator();
    if (!localIterator.hasNext()) {
      return;
    }
    a.a(localIterator.next());
    throw null;
  }
}

/* Location:
 * Qualified Name:     v5.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */