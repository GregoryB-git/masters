package com.google.firebase.messaging;

import java.util.Locale;

public final class X
  extends Exception
{
  public final int o = a(paramString);
  
  public X(String paramString)
  {
    super(paramString);
  }
  
  public final int a(String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    paramString = paramString.toLowerCase(Locale.US);
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case -95047692: 
      if (paramString.equals("missing_to")) {
        j = 4;
      }
      break;
    case -617027085: 
      if (paramString.equals("messagetoobig")) {
        j = 3;
      }
      break;
    case -920906446: 
      if (paramString.equals("invalid_parameters")) {
        j = 2;
      }
      break;
    case -1290953729: 
      if (paramString.equals("toomanymessages")) {
        j = 1;
      }
      break;
    case -1743242157: 
      if (paramString.equals("service_not_available")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 3: 
      return 2;
    case 2: 
    case 4: 
      return 1;
    case 1: 
      return 4;
    }
    return 3;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */