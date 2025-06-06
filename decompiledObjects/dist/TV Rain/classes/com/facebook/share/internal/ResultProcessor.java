package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

public abstract class ResultProcessor
{
  private FacebookCallback appCallback;
  
  public ResultProcessor(FacebookCallback paramFacebookCallback)
  {
    appCallback = paramFacebookCallback;
  }
  
  public void onCancel(AppCall paramAppCall)
  {
    paramAppCall = appCallback;
    if (paramAppCall != null) {
      paramAppCall.onCancel();
    }
  }
  
  public void onError(AppCall paramAppCall, FacebookException paramFacebookException)
  {
    paramAppCall = appCallback;
    if (paramAppCall != null) {
      paramAppCall.onError(paramFacebookException);
    }
  }
  
  public abstract void onSuccess(AppCall paramAppCall, Bundle paramBundle);
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ResultProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */