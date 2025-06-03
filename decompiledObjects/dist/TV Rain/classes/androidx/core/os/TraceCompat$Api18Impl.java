package androidx.core.os;

import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class TraceCompat$Api18Impl
{
  @DoNotInline
  public static void beginSection(String paramString)
  {
    Trace.beginSection(paramString);
  }
  
  @DoNotInline
  public static void endSection() {}
}

/* Location:
 * Qualified Name:     androidx.core.os.TraceCompat.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */