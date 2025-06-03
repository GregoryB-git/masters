package com.google.ads.interactivemedia.v3.impl.data;

final class r
  extends ResizeAndPositionVideoMsgData
{
  private final Integer height;
  private final Integer width;
  private final Integer x;
  private final Integer y;
  
  public r(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    if (paramInteger1 != null)
    {
      x = paramInteger1;
      if (paramInteger2 != null)
      {
        y = paramInteger2;
        if (paramInteger3 != null)
        {
          width = paramInteger3;
          if (paramInteger4 != null)
          {
            height = paramInteger4;
            return;
          }
          throw new NullPointerException("Null height");
        }
        throw new NullPointerException("Null width");
      }
      throw new NullPointerException("Null y");
    }
    throw new NullPointerException("Null x");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof ResizeAndPositionVideoMsgData))
    {
      paramObject = (ResizeAndPositionVideoMsgData)paramObject;
      if ((x.equals(((ResizeAndPositionVideoMsgData)paramObject).x())) && (y.equals(((ResizeAndPositionVideoMsgData)paramObject).y())) && (width.equals(((ResizeAndPositionVideoMsgData)paramObject).width())) && (height.equals(((ResizeAndPositionVideoMsgData)paramObject).height()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((x.hashCode() ^ 0xF4243) * 1000003 ^ y.hashCode()) * 1000003 ^ width.hashCode()) * 1000003 ^ height.hashCode();
  }
  
  public final Integer height()
  {
    return height;
  }
  
  public final Integer width()
  {
    return width;
  }
  
  public final Integer x()
  {
    return x;
  }
  
  public final Integer y()
  {
    return y;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */