package com.google.ads.interactivemedia.v3.internal;

public final class jq
  extends Exception
{
  private final String a;
  private final boolean b;
  private final jp c;
  private final String d;
  
  public jq(bw parambw, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    this((String)localObject, paramThrowable, str, paramBoolean, null, localStringBuilder.toString(), null);
  }
  
  public jq(bw parambw, Throwable paramThrowable, boolean paramBoolean, jp paramjp)
  {
    this(str1, paramThrowable, str2, paramBoolean, paramjp, parambw, null);
  }
  
  private jq(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, jp paramjp, String paramString3, jq paramjq)
  {
    super(paramString1, paramThrowable);
    a = paramString2;
    b = paramBoolean;
    c = paramjp;
    d = paramString3;
  }
  
  private final jq a(jq paramjq)
  {
    return new jq(getMessage(), getCause(), a, b, c, d, paramjq);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */