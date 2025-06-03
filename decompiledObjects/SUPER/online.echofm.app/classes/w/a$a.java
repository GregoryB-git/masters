package w;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

public abstract class a$a
{
  public static void a(Activity paramActivity)
  {
    paramActivity.finishAffinity();
  }
  
  public static void b(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public static void c(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}

/* Location:
 * Qualified Name:     w.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */