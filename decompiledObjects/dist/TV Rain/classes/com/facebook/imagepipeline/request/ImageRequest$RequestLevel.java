package com.facebook.imagepipeline.request;

public enum ImageRequest$RequestLevel
{
  private int mValue;
  
  static
  {
    RequestLevel localRequestLevel1 = new RequestLevel("FULL_FETCH", 0, 1);
    FULL_FETCH = localRequestLevel1;
    RequestLevel localRequestLevel2 = new RequestLevel("DISK_CACHE", 1, 2);
    DISK_CACHE = localRequestLevel2;
    RequestLevel localRequestLevel3 = new RequestLevel("ENCODED_MEMORY_CACHE", 2, 3);
    ENCODED_MEMORY_CACHE = localRequestLevel3;
    RequestLevel localRequestLevel4 = new RequestLevel("BITMAP_MEMORY_CACHE", 3, 4);
    BITMAP_MEMORY_CACHE = localRequestLevel4;
    $VALUES = new RequestLevel[] { localRequestLevel1, localRequestLevel2, localRequestLevel3, localRequestLevel4 };
  }
  
  private ImageRequest$RequestLevel(int paramInt)
  {
    mValue = paramInt;
  }
  
  public static RequestLevel getMax(RequestLevel paramRequestLevel1, RequestLevel paramRequestLevel2)
  {
    if (paramRequestLevel1.getValue() <= paramRequestLevel2.getValue()) {
      paramRequestLevel1 = paramRequestLevel2;
    }
    return paramRequestLevel1;
  }
  
  public int getValue()
  {
    return mValue;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.ImageRequest.RequestLevel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */