package g;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j.a;

public final class g$q
  implements j.a
{
  public g$q(g paramg) {}
  
  public final void b(f paramf, boolean paramBoolean)
  {
    f localf = paramf.k();
    int i = 0;
    int j;
    if (localf != paramf) {
      j = 1;
    } else {
      j = 0;
    }
    g localg = a;
    if (j != 0) {
      paramf = localf;
    }
    g.p[] arrayOfp = U;
    int k;
    if (arrayOfp != null) {
      k = arrayOfp.length;
    } else {
      k = 0;
    }
    while (i < k)
    {
      localg = arrayOfp[i];
      if ((localg != null) && (h == paramf))
      {
        paramf = localg;
        break label100;
      }
      i++;
    }
    paramf = null;
    label100:
    if (paramf != null)
    {
      localg = a;
      if (j != 0)
      {
        localg.H(a, paramf, localf);
        a.J(paramf, true);
      }
      else
      {
        localg.J(paramf, paramBoolean);
      }
    }
  }
  
  public final boolean c(f paramf)
  {
    if (paramf == paramf.k())
    {
      Object localObject = a;
      if (O)
      {
        localObject = ((g)localObject).S();
        if ((localObject != null) && (!a.Z)) {
          ((Window.Callback)localObject).onMenuOpened(108, paramf);
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     g.g.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */