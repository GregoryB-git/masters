package androidx.tracing;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
final class TraceApi18Impl
{
  public static void beginSection(@NonNull String paramString)
  {
    Trace.beginSection(paramString);
  }
  
  public static void endSection() {}
}

/* Location:
 * Qualified Name:     androidx.tracing.TraceApi18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */