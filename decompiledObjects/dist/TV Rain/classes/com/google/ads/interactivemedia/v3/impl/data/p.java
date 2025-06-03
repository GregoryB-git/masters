package com.google.ads.interactivemedia.v3.impl.data;

import a;

final class p
  extends ak
{
  private final boolean attached;
  private final y bounds;
  private final boolean hidden;
  private final String type;
  
  private p(boolean paramBoolean1, y paramy, boolean paramBoolean2, String paramString)
  {
    attached = paramBoolean1;
    bounds = paramy;
    hidden = paramBoolean2;
    type = paramString;
  }
  
  public final boolean attached()
  {
    return attached;
  }
  
  public final y bounds()
  {
    return bounds;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ak))
    {
      paramObject = (ak)paramObject;
      if ((attached == ((ak)paramObject).attached()) && (bounds.equals(((ak)paramObject).bounds())) && (hidden == ((ak)paramObject).hidden()) && (type.equals(((ak)paramObject).type()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    boolean bool = attached;
    int i = 1231;
    int j;
    if (bool) {
      j = 1231;
    } else {
      j = 1237;
    }
    int k = bounds.hashCode();
    if (!hidden) {
      i = 1237;
    }
    return (((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i) * 1000003 ^ type.hashCode();
  }
  
  public final boolean hidden()
  {
    return hidden;
  }
  
  public final String toString()
  {
    boolean bool1 = attached;
    String str1 = String.valueOf(bounds);
    boolean bool2 = hidden;
    String str2 = type;
    StringBuilder localStringBuilder = new StringBuilder(a.b(str2, str1.length() + 61));
    localStringBuilder.append("ObstructionData{attached=");
    localStringBuilder.append(bool1);
    localStringBuilder.append(", bounds=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hidden=");
    localStringBuilder.append(bool2);
    localStringBuilder.append(", type=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final String type()
  {
    return type;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */