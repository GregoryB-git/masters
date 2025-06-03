package androidx.core.os;

import android.os.Process;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class ProcessCompat$Api24Impl
{
  public static boolean isApplicationUid(int paramInt)
  {
    return Process.isApplicationUid(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.ProcessCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */