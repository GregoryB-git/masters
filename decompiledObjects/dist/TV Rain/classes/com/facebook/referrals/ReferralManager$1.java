package com.facebook.referrals;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.internal.CallbackManagerImpl.Callback;

class ReferralManager$1
  implements CallbackManagerImpl.Callback
{
  public ReferralManager$1(ReferralManager paramReferralManager, FacebookCallback paramFacebookCallback) {}
  
  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    return this$0.onActivityResult(paramInt, paramIntent, val$callback);
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */