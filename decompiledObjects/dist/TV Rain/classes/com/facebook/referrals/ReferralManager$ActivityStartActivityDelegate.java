package com.facebook.referrals;

import android.app.Activity;
import android.content.Intent;
import com.facebook.internal.Validate;

class ReferralManager$ActivityStartActivityDelegate
  implements StartActivityDelegate
{
  private final Activity activity;
  
  public ReferralManager$ActivityStartActivityDelegate(Activity paramActivity)
  {
    Validate.notNull(paramActivity, "activity");
    activity = paramActivity;
  }
  
  public Activity getActivityContext()
  {
    return activity;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    activity.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralManager.ActivityStartActivityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */