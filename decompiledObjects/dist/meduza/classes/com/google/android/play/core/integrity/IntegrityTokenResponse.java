package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

public abstract class IntegrityTokenResponse
{
  public abstract Task<Integer> showDialog(Activity paramActivity, int paramInt);
  
  public abstract String token();
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.IntegrityTokenResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */