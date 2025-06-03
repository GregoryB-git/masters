package com.google.ads.interactivemedia.v3.impl.data;

final class i
  extends y
{
  private final int height;
  private final int left;
  private final int top;
  private final int width;
  
  private i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    left = paramInt1;
    top = paramInt2;
    height = paramInt3;
    width = paramInt4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof y))
    {
      paramObject = (y)paramObject;
      if ((left == ((y)paramObject).left()) && (top == ((y)paramObject).top()) && (height == ((y)paramObject).height()) && (width == ((y)paramObject).width())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((left ^ 0xF4243) * 1000003 ^ top) * 1000003 ^ height) * 1000003 ^ width;
  }
  
  public final int height()
  {
    return height;
  }
  
  public final int left()
  {
    return left;
  }
  
  public final String toString()
  {
    int i = left;
    int j = top;
    int k = height;
    int m = width;
    StringBuilder localStringBuilder = new StringBuilder(90);
    localStringBuilder.append("BoundingRectData{left=");
    localStringBuilder.append(i);
    localStringBuilder.append(", top=");
    localStringBuilder.append(j);
    localStringBuilder.append(", height=");
    localStringBuilder.append(k);
    localStringBuilder.append(", width=");
    localStringBuilder.append(m);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final int top()
  {
    return top;
  }
  
  public final int width()
  {
    return width;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */