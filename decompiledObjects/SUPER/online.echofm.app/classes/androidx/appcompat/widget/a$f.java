package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g.a;
import androidx.appcompat.view.menu.j;

public class a$f
  implements g.a
{
  public a$f(a parama) {}
  
  public void b(d paramd, boolean paramBoolean)
  {
    if ((paramd instanceof j)) {
      paramd.z().d(false);
    }
    g.a locala = a.m();
    if (locala != null) {
      locala.b(paramd, paramBoolean);
    }
  }
  
  public boolean c(d paramd)
  {
    Object localObject = a.s(a);
    boolean bool = false;
    if (paramd == localObject) {
      return false;
    }
    a.Q = ((j)paramd).getItem().getItemId();
    localObject = a.m();
    if (localObject != null) {
      bool = ((g.a)localObject).c(paramd);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */