package androidx.core.location;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000\016\n\000\n\002\020\006\n\002\030\002\n\002\b\002\032\r\020\000\032\0020\001*\0020\002H\n\032\r\020\003\032\0020\001*\0020\002H\n¨\006\004"}, d2={"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class LocationKt
{
  public static final double component1(@NotNull Location paramLocation)
  {
    Intrinsics.checkNotNullParameter(paramLocation, "<this>");
    return paramLocation.getLatitude();
  }
  
  public static final double component2(@NotNull Location paramLocation)
  {
    Intrinsics.checkNotNullParameter(paramLocation, "<this>");
    return paramLocation.getLongitude();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */