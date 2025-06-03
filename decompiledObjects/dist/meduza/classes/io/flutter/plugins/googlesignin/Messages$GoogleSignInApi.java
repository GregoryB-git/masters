package io.flutter.plugins.googlesignin;

import java.util.List;

public abstract interface Messages$GoogleSignInApi
{
  public abstract void clearAuthCache(String paramString, Messages.Result<Void> paramResult);
  
  public abstract void disconnect(Messages.Result<Void> paramResult);
  
  public abstract void getAccessToken(String paramString, Boolean paramBoolean, Messages.Result<String> paramResult);
  
  public abstract void init(Messages.InitParams paramInitParams);
  
  public abstract Boolean isSignedIn();
  
  public abstract void requestScopes(List<String> paramList, Messages.Result<Boolean> paramResult);
  
  public abstract void signIn(Messages.Result<Messages.UserData> paramResult);
  
  public abstract void signInSilently(Messages.Result<Messages.UserData> paramResult);
  
  public abstract void signOut(Messages.Result<Void> paramResult);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */