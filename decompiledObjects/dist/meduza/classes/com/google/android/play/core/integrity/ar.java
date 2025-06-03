package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

final class ar
  extends ResultReceiver
{
  public ar(as paramas, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    Integer localInteger;
    if (paramInt != 1) {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return;
        }
        paramBundle = a.a;
        localInteger = Integer.valueOf(1);
      }
    }
    for (;;)
    {
      paramBundle.trySetResult(localInteger);
      return;
      paramBundle = a.a;
      localInteger = Integer.valueOf(2);
      continue;
      paramBundle = a.a;
      localInteger = Integer.valueOf(3);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */