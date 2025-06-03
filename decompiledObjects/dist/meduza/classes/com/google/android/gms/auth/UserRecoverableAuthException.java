package com.google.android.gms.auth;

import android.content.Intent;
import g;
import z3.f;

public class UserRecoverableAuthException
  extends f
{
  public final Intent a;
  public final int b;
  
  public UserRecoverableAuthException(String paramString, Intent paramIntent, int paramInt)
  {
    super(paramString);
    a = paramIntent;
    g.j(paramInt);
    b = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.UserRecoverableAuthException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */