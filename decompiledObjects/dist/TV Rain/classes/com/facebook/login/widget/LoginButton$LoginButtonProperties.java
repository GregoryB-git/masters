package com.facebook.login.widget;

import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import java.util.Collections;
import java.util.List;

class LoginButton$LoginButtonProperties
{
  private String authType = "rerequest";
  private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
  private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
  private List<String> permissions = Collections.emptyList();
  
  public void clearPermissions()
  {
    permissions = null;
  }
  
  public String getAuthType()
  {
    return authType;
  }
  
  public DefaultAudience getDefaultAudience()
  {
    return defaultAudience;
  }
  
  public LoginBehavior getLoginBehavior()
  {
    return loginBehavior;
  }
  
  public List<String> getPermissions()
  {
    return permissions;
  }
  
  public void setAuthType(String paramString)
  {
    authType = paramString;
  }
  
  public void setDefaultAudience(DefaultAudience paramDefaultAudience)
  {
    defaultAudience = paramDefaultAudience;
  }
  
  public void setLoginBehavior(LoginBehavior paramLoginBehavior)
  {
    loginBehavior = paramLoginBehavior;
  }
  
  public void setPermissions(List<String> paramList)
  {
    permissions = paramList;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton.LoginButtonProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */