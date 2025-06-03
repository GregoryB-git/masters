package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import f0;

@RequiresApi(33)
class ContextCompat$Api33Impl
{
  @DoNotInline
  public static Intent registerReceiver(Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    return f0.j(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api33Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */