package l2;

import androidx.window.sidecar.SidecarDisplayFeature;
import dc.l;
import ec.i;
import ec.j;

public final class b
  extends j
  implements l<SidecarDisplayFeature, Boolean>
{
  public static final b a = new b();
  
  public b()
  {
    super(1);
  }
  
  public final Boolean b(SidecarDisplayFeature paramSidecarDisplayFeature)
  {
    i.e(paramSidecarDisplayFeature, "$this$require");
    int i = paramSidecarDisplayFeature.getType();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 1) {
      if (paramSidecarDisplayFeature.getType() == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return Boolean.valueOf(bool2);
  }
}

/* Location:
 * Qualified Name:     l2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */