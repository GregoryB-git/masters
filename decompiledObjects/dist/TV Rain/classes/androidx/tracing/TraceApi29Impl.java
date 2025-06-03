package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
final class TraceApi29Impl
{
  public static void beginAsyncSection(@NonNull String paramString, int paramInt)
  {
    o3.z(paramString, paramInt);
  }
  
  public static void endAsyncSection(@NonNull String paramString, int paramInt)
  {
    o3.D(paramString, paramInt);
  }
  
  public static void setCounter(@NonNull String paramString, int paramInt)
  {
    o3.A(paramString, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.tracing.TraceApi29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */