package r1;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import o1.a;

public final class n$b
{
  public final n a(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdServicesInfo.version=");
    a locala = a.a;
    localStringBuilder.append(locala.a());
    Log.d("MeasurementManager", localStringBuilder.toString());
    if (locala.a() >= 5) {
      paramContext = new n.a(paramContext);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     r1.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */