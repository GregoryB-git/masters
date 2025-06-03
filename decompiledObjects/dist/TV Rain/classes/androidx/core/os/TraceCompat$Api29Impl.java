package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
class TraceCompat$Api29Impl
{
  @DoNotInline
  public static void beginAsyncSection(String paramString, int paramInt)
  {
    o3.z(paramString, paramInt);
  }
  
  @DoNotInline
  public static void endAsyncSection(String paramString, int paramInt)
  {
    o3.D(paramString, paramInt);
  }
  
  @DoNotInline
  public static boolean isEnabled()
  {
    return o3.B();
  }
  
  @DoNotInline
  public static void setCounter(String paramString, long paramLong)
  {
    o3.A(paramString, paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.TraceCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */