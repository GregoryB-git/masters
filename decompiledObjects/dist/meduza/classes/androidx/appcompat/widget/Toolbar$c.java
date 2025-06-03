package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f.a;
import e0.m;
import e0.o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Toolbar$c
  implements f.a
{
  public Toolbar$c(Toolbar paramToolbar) {}
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    f.a locala = a.W;
    boolean bool;
    if ((locala != null) && (locala.a(paramf, paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b(f paramf)
  {
    Object localObject = a.a.B;
    int i;
    if ((localObject != null) && (((a)localObject).k())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      localObject = a.O.b.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((o)((Iterator)localObject).next()).d(paramf);
      }
    }
    localObject = a.W;
    if (localObject != null) {
      ((f.a)localObject).b(paramf);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */