package com.facebook.internal;

import com.facebook.FacebookException;

final class CollectionMapper$1
  implements CollectionMapper.OnMapperCompleteListener
{
  public CollectionMapper$1(Mutable paramMutable1, Mutable paramMutable2, CollectionMapper.OnMapperCompleteListener paramOnMapperCompleteListener) {}
  
  public void onComplete()
  {
    if (((Boolean)val$didReturnError.value).booleanValue()) {
      return;
    }
    Mutable localMutable = val$pendingJobCount;
    Integer localInteger = Integer.valueOf(((Integer)value).intValue() - 1);
    value = localInteger;
    if (localInteger.intValue() == 0) {
      val$onMapperCompleteListener.onComplete();
    }
  }
  
  public void onError(FacebookException paramFacebookException)
  {
    if (((Boolean)val$didReturnError.value).booleanValue()) {
      return;
    }
    val$didReturnError.value = Boolean.TRUE;
    val$onMapperCompleteListener.onError(paramFacebookException);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.CollectionMapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */