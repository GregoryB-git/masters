package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.internal.CollectionMapper.Collection;
import com.facebook.internal.CollectionMapper.OnErrorListener;
import com.facebook.internal.Mutable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

class ShareApi$5
  implements CollectionMapper.Collection<Integer>
{
  public ShareApi$5(ShareApi paramShareApi, ArrayList paramArrayList, JSONArray paramJSONArray) {}
  
  public Object get(Integer paramInteger)
  {
    return val$arrayList.get(paramInteger.intValue());
  }
  
  public Iterator<Integer> keyIterator()
  {
    final int i = val$arrayList.size();
    new Iterator()
    {
      public boolean hasNext()
      {
        boolean bool;
        if (((Integer)val$current.value).intValue() < i) {
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
    };
  }
  
  public void set(Integer paramInteger, Object paramObject, CollectionMapper.OnErrorListener paramOnErrorListener)
  {
    try
    {
      val$stagedObject.put(paramInteger.intValue(), paramObject);
    }
    catch (JSONException paramInteger)
    {
      paramObject = paramInteger.getLocalizedMessage();
      paramInteger = (Integer)paramObject;
      if (paramObject == null) {
        paramInteger = "Error staging object.";
      }
      paramOnErrorListener.onError(new FacebookException(paramInteger));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */