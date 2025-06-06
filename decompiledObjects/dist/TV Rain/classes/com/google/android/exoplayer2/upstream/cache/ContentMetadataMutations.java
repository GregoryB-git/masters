package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ContentMetadataMutations
{
  private final Map<String, Object> editedValues = new HashMap();
  private final List<String> removedValues = new ArrayList();
  
  private ContentMetadataMutations checkAndSet(String paramString, Object paramObject)
  {
    editedValues.put(Assertions.checkNotNull(paramString), Assertions.checkNotNull(paramObject));
    removedValues.remove(paramString);
    return this;
  }
  
  public Map<String, Object> getEditedValues()
  {
    HashMap localHashMap = new HashMap(editedValues);
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = localEntry.getValue();
      if ((localObject instanceof byte[]))
      {
        localObject = (byte[])localObject;
        localEntry.setValue(Arrays.copyOf((byte[])localObject, localObject.length));
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public List<String> getRemovedValues()
  {
    return Collections.unmodifiableList(new ArrayList(removedValues));
  }
  
  public ContentMetadataMutations remove(String paramString)
  {
    removedValues.add(paramString);
    editedValues.remove(paramString);
    return this;
  }
  
  public ContentMetadataMutations set(String paramString, long paramLong)
  {
    return checkAndSet(paramString, Long.valueOf(paramLong));
  }
  
  public ContentMetadataMutations set(String paramString1, String paramString2)
  {
    return checkAndSet(paramString1, paramString2);
  }
  
  public ContentMetadataMutations set(String paramString, byte[] paramArrayOfByte)
  {
    return checkAndSet(paramString, Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */