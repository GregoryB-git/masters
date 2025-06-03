package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

public abstract interface RecaptchaTasksClient
{
  public abstract Task<String> executeTask(RecaptchaAction paramRecaptchaAction);
  
  public abstract Task<String> executeTask(RecaptchaAction paramRecaptchaAction, long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.RecaptchaTasksClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */