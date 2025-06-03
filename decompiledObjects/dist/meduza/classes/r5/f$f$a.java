package r5;

import android.media.Spatializer;
import android.media.Spatializer.OnSpatializerStateChangedListener;
import o7.k0;

public final class f$f$a
  implements Spatializer.OnSpatializerStateChangedListener
{
  public f$f$a(f paramf) {}
  
  public final void onSpatializerAvailableChanged(Spatializer paramSpatializer, boolean paramBoolean)
  {
    f localf = a;
    paramSpatializer = f.j;
    localf.j();
  }
  
  public final void onSpatializerEnabledChanged(Spatializer paramSpatializer, boolean paramBoolean)
  {
    paramSpatializer = a;
    k0 localk0 = f.j;
    paramSpatializer.j();
  }
}

/* Location:
 * Qualified Name:     r5.f.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */