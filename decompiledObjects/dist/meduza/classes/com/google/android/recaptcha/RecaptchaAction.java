package com.google.android.recaptcha;

import ec.i;
import f;
import g;

public final class RecaptchaAction
{
  public static final Companion Companion = new Companion(null);
  public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
  public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
  private final String action;
  
  private RecaptchaAction(String paramString)
  {
    action = paramString;
  }
  
  public static final RecaptchaAction custom(String paramString)
  {
    return Companion.custom(paramString);
  }
  
  public final String component1()
  {
    return action;
  }
  
  public final RecaptchaAction copy(String paramString)
  {
    return new RecaptchaAction(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof RecaptchaAction)) {
      return false;
    }
    paramObject = (RecaptchaAction)paramObject;
    return i.a(action, action);
  }
  
  public final String getAction()
  {
    return action;
  }
  
  public int hashCode()
  {
    return action.hashCode();
  }
  
  public String toString()
  {
    return g.f(f.l("RecaptchaAction(action="), action, ")");
  }
  
  public static final class Companion
  {
    public final RecaptchaAction custom(String paramString)
    {
      return new RecaptchaAction(paramString, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.RecaptchaAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */