package androidx.appcompat.widget;

import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.view.menu.m;

public final class a$f
  implements j.a
{
  public a$f(a parama) {}
  
  public final void b(f paramf, boolean paramBoolean)
  {
    if ((paramf instanceof m)) {
      paramf.k().c(false);
    }
    j.a locala = a.e;
    if (locala != null) {
      locala.b(paramf, paramBoolean);
    }
  }
  
  public final boolean c(f paramf)
  {
    Object localObject = a;
    f localf = c;
    boolean bool = false;
    if (paramf == localf) {
      return false;
    }
    B.getClass();
    localObject.getClass();
    localObject = a.e;
    if (localObject != null) {
      bool = ((j.a)localObject).c(paramf);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */