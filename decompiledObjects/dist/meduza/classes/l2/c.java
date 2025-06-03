package l2;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

public final class c
  extends j
  implements l<SidecarDisplayFeature, Boolean>
{
  public static final c a = new c();
  
  public c()
  {
    super(1);
  }
  
  public final Boolean b(SidecarDisplayFeature paramSidecarDisplayFeature)
  {
    i.e(paramSidecarDisplayFeature, "$this$require");
    boolean bool;
    if ((paramSidecarDisplayFeature.getRect().width() == 0) && (paramSidecarDisplayFeature.getRect().height() == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
}

/* Location:
 * Qualified Name:     l2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */