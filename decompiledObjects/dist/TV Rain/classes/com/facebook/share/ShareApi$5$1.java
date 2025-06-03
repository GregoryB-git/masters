package com.facebook.share;

import com.facebook.internal.Mutable;
import java.util.Iterator;

class ShareApi$5$1
  implements Iterator<Integer>
{
  public ShareApi$5$1(ShareApi.5 param5, Mutable paramMutable, int paramInt) {}
  
  public boolean hasNext()
  {
    boolean bool;
    if (((Integer)val$current.value).intValue() < val$size) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Integer next()
  {
    Mutable localMutable = val$current;
    Object localObject = value;
    Integer localInteger = (Integer)localObject;
    value = Integer.valueOf(((Integer)localObject).intValue() + 1);
    return localInteger;
  }
  
  public void remove() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi.5.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */