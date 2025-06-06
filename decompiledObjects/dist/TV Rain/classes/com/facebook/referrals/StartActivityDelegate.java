package com.facebook.referrals;

import android.app.Activity;
import android.content.Intent;

abstract interface StartActivityDelegate
{
  public abstract Activity getActivityContext();
  
  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:
 * Qualified Name:     com.facebook.referrals.StartActivityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */