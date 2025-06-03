package com.facebook.referrals;

import android.app.Activity;
import android.content.Intent;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Validate;

class ReferralManager$FragmentStartActivityDelegate
  implements StartActivityDelegate
{
  private final FragmentWrapper fragment;
  
  public ReferralManager$FragmentStartActivityDelegate(FragmentWrapper paramFragmentWrapper)
  {
    Validate.notNull(paramFragmentWrapper, "fragment");
    fragment = paramFragmentWrapper;
  }
  
  public Activity getActivityContext()
  {
    return fragment.getActivity();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    fragment.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralManager.FragmentStartActivityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */