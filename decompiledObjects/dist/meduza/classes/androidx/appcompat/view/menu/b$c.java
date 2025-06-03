package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;
import l.o0;

public final class b$c
  implements o0
{
  public b$c(b paramb) {}
  
  public final void c(f paramf, h paramh)
  {
    Handler localHandler = a.o;
    b.d locald = null;
    localHandler.removeCallbacksAndMessages(null);
    int i = a.q.size();
    for (int j = 0; j < i; j++) {
      if (paramf == a.q.get(j)).b) {
        break label72;
      }
    }
    j = -1;
    label72:
    if (j == -1) {
      return;
    }
    j++;
    if (j < a.q.size()) {
      locald = (b.d)a.q.get(j);
    }
    paramh = new c(this, locald, paramh, paramf);
    long l = SystemClock.uptimeMillis();
    a.o.postAtTime(paramh, paramf, l + 200L);
  }
  
  public final void f(f paramf, MenuItem paramMenuItem)
  {
    a.o.removeCallbacksAndMessages(paramf);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */