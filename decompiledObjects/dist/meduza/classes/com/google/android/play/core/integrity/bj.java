package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

final class bj
  extends y
{
  public bj(bk parambk, String paramString, long paramLong)
  {
    super(paramString, paramLong);
  }
  
  public final Task b(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle.putLong("cloud.prj", bk.f(a));
    return a.c.c(paramActivity, paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */