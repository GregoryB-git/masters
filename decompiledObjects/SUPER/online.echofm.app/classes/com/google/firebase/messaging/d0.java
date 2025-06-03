package com.google.firebase.messaging;

import A2.m;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d0
{
  public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
  public final String a;
  public final String b;
  public final String c;
  
  public d0(String paramString1, String paramString2)
  {
    a = d(paramString2, paramString1);
    b = paramString1;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("!");
    localStringBuilder.append(paramString2);
    c = localStringBuilder.toString();
  }
  
  public static d0 a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = paramString.split("!", -1);
    if (paramString.length != 2) {
      return null;
    }
    return new d0(paramString[0], paramString[1]);
  }
  
  public static String d(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramString1 != null)
    {
      str = paramString1;
      if (paramString1.startsWith("/topics/"))
      {
        Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[] { paramString2 }));
        str = paramString1.substring(8);
      }
    }
    if ((str != null) && (d.matcher(str).matches())) {
      return str;
    }
    throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[] { str, "[a-zA-Z0-9-_.~%]{1,900}" }));
  }
  
  public static d0 f(String paramString)
  {
    return new d0("S", paramString);
  }
  
  public static d0 g(String paramString)
  {
    return new d0("U", paramString);
  }
  
  public String b()
  {
    return b;
  }
  
  public String c()
  {
    return a;
  }
  
  public String e()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d0;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (d0)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return m.b(new Object[] { b, a });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */