package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class ActivityCompat$Api16Impl
{
  @DoNotInline
  public static void finishAffinity(Activity paramActivity)
  {
    paramActivity.finishAffinity();
  }
  
  @DoNotInline
  public static void startActivityForResult(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @DoNotInline
  public static void startIntentSenderForResult(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */