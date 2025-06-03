package com.google.ads.interactivemedia.v3.impl.data;

final class h
  extends x
{
  private Integer height;
  private Integer left;
  private Integer top;
  private Integer width;
  
  public final y build()
  {
    Object localObject1 = left;
    Object localObject2 = "";
    if (localObject1 == null) {
      localObject2 = "".concat(" left");
    }
    localObject1 = localObject2;
    if (top == null) {
      localObject1 = String.valueOf(localObject2).concat(" top");
    }
    localObject2 = localObject1;
    if (height == null) {
      localObject2 = String.valueOf(localObject1).concat(" height");
    }
    localObject1 = localObject2;
    if (width == null) {
      localObject1 = String.valueOf(localObject2).concat(" width");
    }
    if (!((String)localObject1).isEmpty())
    {
      if (((String)localObject1).length() != 0) {
        localObject2 = "Missing required properties:".concat((String)localObject1);
      } else {
        localObject2 = new String("Missing required properties:");
      }
      throw new IllegalStateException((String)localObject2);
    }
    return new i(left.intValue(), top.intValue(), height.intValue(), width.intValue(), null);
  }
  
  public final x height(int paramInt)
  {
    height = Integer.valueOf(paramInt);
    return this;
  }
  
  public final x left(int paramInt)
  {
    left = Integer.valueOf(paramInt);
    return this;
  }
  
  public final x top(int paramInt)
  {
    top = Integer.valueOf(paramInt);
    return this;
  }
  
  public final x width(int paramInt)
  {
    width = Integer.valueOf(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */