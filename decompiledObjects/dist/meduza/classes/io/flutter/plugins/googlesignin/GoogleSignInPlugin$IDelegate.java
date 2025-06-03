package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;
import java.util.List;

public abstract interface GoogleSignInPlugin$IDelegate
{
  public abstract void clearAuthCache(MethodChannel.Result paramResult, String paramString);
  
  public abstract void disconnect(MethodChannel.Result paramResult);
  
  public abstract void getTokens(MethodChannel.Result paramResult, String paramString, boolean paramBoolean);
  
  public abstract void init(MethodChannel.Result paramResult, String paramString1, List<String> paramList, String paramString2, String paramString3, String paramString4, boolean paramBoolean);
  
  public abstract void isSignedIn(MethodChannel.Result paramResult);
  
  public abstract void requestScopes(MethodChannel.Result paramResult, List<String> paramList);
  
  public abstract void signIn(MethodChannel.Result paramResult);
  
  public abstract void signInSilently(MethodChannel.Result paramResult);
  
  public abstract void signOut(MethodChannel.Result paramResult);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */