package d2;

import android.net.Uri;
import c2.p;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import x6.b;

public final class i0$b
  extends a.d
{
  public i0$b()
  {
    super("MULTI_PROFILE", "MULTI_PROFILE");
  }
  
  public final boolean d()
  {
    if (!super.d()) {
      return false;
    }
    if (b.c0("MULTI_PROCESS"))
    {
      Uri localUri = p.a;
      if (i0.F.d()) {
        return j0.b.a.getStatics().isMultiProcessEnabled();
      }
      throw i0.a();
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     d2.i0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */