package androidx.core.os;

import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class CancellationSignal$Api16Impl
{
  @DoNotInline
  public static void cancel(Object paramObject)
  {
    ((CancellationSignal)paramObject).cancel();
  }
  
  @DoNotInline
  public static CancellationSignal createCancellationSignal()
  {
    return new CancellationSignal();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.CancellationSignal.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */