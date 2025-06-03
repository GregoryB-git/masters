package com.facebook;

public abstract interface LoginStatusCallback
{
  public abstract void onCompleted(AccessToken paramAccessToken);
  
  public abstract void onError(Exception paramException);
  
  public abstract void onFailure();
}

/* Location:
 * Qualified Name:     com.facebook.LoginStatusCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */