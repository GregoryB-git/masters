package com.google.ads.interactivemedia.v3.impl.data;

import a;
import com.google.ads.interactivemedia.v3.internal.agz;

@agz(a=r.class)
public abstract class ResizeAndPositionVideoMsgData
{
  public static ResizeAndPositionVideoMsgData create(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    return new r(paramInteger1, paramInteger2, paramInteger3, paramInteger4);
  }
  
  public abstract Integer height();
  
  public final String toString()
  {
    String str1 = String.valueOf(x());
    Object localObject = String.valueOf(y());
    String str2 = String.valueOf(width());
    String str3 = String.valueOf(height());
    int i = str1.length();
    int j = ((String)localObject).length();
    int k = str2.length();
    localObject = a.q(str3.length() + (k + (j + (i + 55))), "ResizeAndPositionVideoMsgData [x=", str1, ", y=", (String)localObject);
    a.C((StringBuilder)localObject, ", width=", str2, ", height=", str3);
    ((StringBuilder)localObject).append("]");
    return ((StringBuilder)localObject).toString();
  }
  
  public abstract Integer width();
  
  public abstract Integer x();
  
  public abstract Integer y();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */