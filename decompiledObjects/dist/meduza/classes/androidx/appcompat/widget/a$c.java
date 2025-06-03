package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.i;

public final class a$c
  implements Runnable
{
  public a.e a;
  
  public a$c(a parama, a.e parame)
  {
    a = parame;
  }
  
  public final void run()
  {
    Object localObject = b.c;
    if (localObject != null)
    {
      f.a locala = e;
      if (locala != null) {
        locala.b((f)localObject);
      }
    }
    localObject = (View)b.p;
    if ((localObject != null) && (((View)localObject).getWindowToken() != null))
    {
      localObject = a;
      boolean bool = ((i)localObject).b();
      int i = 1;
      if (!bool) {
        if (f == null) {
          i = 0;
        } else {
          ((i)localObject).d(0, 0, false, false);
        }
      }
      if (i != 0) {
        b.A = a;
      }
    }
    b.C = null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */