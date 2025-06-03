package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

final class aq
  extends IntegrityTokenResponse
{
  private final String a;
  private final y b;
  
  public aq(String paramString, y paramy)
  {
    a = paramString;
    b = paramy;
  }
  
  public final Task<Integer> showDialog(Activity paramActivity, int paramInt)
  {
    return b.a(paramActivity, paramInt);
  }
  
  public final String token()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.aq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */