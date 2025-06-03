package com.facebook.drawee.controller;

import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;

class AbstractDraweeControllerBuilder$2
  implements Supplier<DataSource<IMAGE>>
{
  public AbstractDraweeControllerBuilder$2(AbstractDraweeControllerBuilder paramAbstractDraweeControllerBuilder, Object paramObject1, Object paramObject2, AbstractDraweeControllerBuilder.CacheLevel paramCacheLevel) {}
  
  public DataSource<IMAGE> get()
  {
    return this$0.getDataSourceForRequest(val$imageRequest, val$callerContext, val$cacheLevel);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("request", val$imageRequest.toString()).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeControllerBuilder.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */