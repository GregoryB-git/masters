package l2;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

public final class e
  extends j
  implements l<SidecarDisplayFeature, Boolean>
{
  public static final e a = new e();
  
  public e()
  {
    super(1);
  }
  
  public final Boolean b(SidecarDisplayFeature paramSidecarDisplayFeature)
  {
    i.e(paramSidecarDisplayFeature, "$this$require");
    boolean bool;
    if ((getRectleft != 0) && (getRecttop != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
}

/* Location:
 * Qualified Name:     l2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */