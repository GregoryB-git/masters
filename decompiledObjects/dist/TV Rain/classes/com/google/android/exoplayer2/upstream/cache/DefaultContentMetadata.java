package com.google.android.exoplayer2.upstream.cache;

import a;
import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class DefaultContentMetadata
  implements ContentMetadata
{
  public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
  private static final int MAX_VALUE_LENGTH = 10485760;
  private int hashCode;
  private final Map<String, byte[]> metadata;
  
  private DefaultContentMetadata(Map<String, byte[]> paramMap)
  {
    metadata = Collections.unmodifiableMap(paramMap);
  }
  
  private static void addValues(HashMap<String, byte[]> paramHashMap, Map<String, Object> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      byte[] arrayOfByte = getBytes(paramMap.get(str));
      if (arrayOfByte.length <= 10485760)
      {
        paramHashMap.put(str, arrayOfByte);
      }
      else
      {
        paramHashMap = a.s("The size of ", str, " (");
        paramHashMap.append(arrayOfByte.length);
        paramHashMap.append(") is greater than maximum allowed: ");
        paramHashMap.append(10485760);
        throw new IllegalArgumentException(paramHashMap.toString());
      }
    }
  }
  
  private static Map<String, byte[]> applyMutations(Map<String, byte[]> paramMap, ContentMetadataMutations paramContentMetadataMutations)
  {
    paramMap = new HashMap(paramMap);
    removeValues(paramMap, paramContentMetadataMutations.getRemovedValues());
    addValues(paramMap, paramContentMetadataMutations.getEditedValues());
    return paramMap;
  }
  
  private static byte[] getBytes(Object paramObject)
  {
    if ((paramObject instanceof Long)) {
      return ByteBuffer.allocate(8).putLong(((Long)paramObject).longValue()).array();
    }
    if ((paramObject instanceof String)) {
      return ((String)paramObject).getBytes(Charset.forName("UTF-8"));
    }
    if ((paramObject instanceof byte[])) {
      return (byte[])paramObject;
    }
    throw new IllegalArgumentException();
  }
  
  private boolean isMetadataEqual(Map<String, byte[]> paramMap)
  {
    if (metadata.size() != paramMap.size()) {
      return false;
    }
    Iterator localIterator = metadata.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!Arrays.equals((byte[])localEntry.getValue(), (byte[])paramMap.get(localEntry.getKey()))) {
        return false;
      }
    }
    return true;
  }
  
  public static DefaultContentMetadata readFromStream(DataInputStream paramDataInputStream)
    throws IOException
  {
    int i = paramDataInputStream.readInt();
    HashMap localHashMap = new HashMap();
    int j = 0;
    while (j < i)
    {
      String str = paramDataInputStream.readUTF();
      int k = paramDataInputStream.readInt();
      if ((k >= 0) && (k <= 10485760))
      {
        byte[] arrayOfByte = new byte[k];
        paramDataInputStream.readFully(arrayOfByte);
        localHashMap.put(str, arrayOfByte);
        j++;
      }
      else
      {
        throw new IOException(a.f("Invalid value size: ", k));
      }
    }
    return new DefaultContentMetadata(localHashMap);
  }
  
  private static void removeValues(HashMap<String, byte[]> paramHashMap, List<String> paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      paramHashMap.remove(paramList.get(i));
    }
  }
  
  public final boolean contains(String paramString)
  {
    return metadata.containsKey(paramString);
  }
  
  public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations paramContentMetadataMutations)
  {
    paramContentMetadataMutations = applyMutations(metadata, paramContentMetadataMutations);
    if (isMetadataEqual(paramContentMetadataMutations)) {
      return this;
    }
    return new DefaultContentMetadata(paramContentMetadataMutations);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (DefaultContentMetadata.class == paramObject.getClass())) {
      return isMetadataEqual(metadata);
    }
    return false;
  }
  
  public final long get(String paramString, long paramLong)
  {
    if (metadata.containsKey(paramString)) {
      return ByteBuffer.wrap((byte[])metadata.get(paramString)).getLong();
    }
    return paramLong;
  }
  
  public final String get(String paramString1, String paramString2)
  {
    if (metadata.containsKey(paramString1)) {
      paramString2 = new String((byte[])metadata.get(paramString1), Charset.forName("UTF-8"));
    }
    return paramString2;
  }
  
  public final byte[] get(String paramString, byte[] paramArrayOfByte)
  {
    if (metadata.containsKey(paramString))
    {
      paramString = (byte[])metadata.get(paramString);
      return Arrays.copyOf(paramString, paramString.length);
    }
    return paramArrayOfByte;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = 0;
      Iterator localIterator = metadata.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        int j = ((String)localEntry.getKey()).hashCode();
        i += (Arrays.hashCode((byte[])localEntry.getValue()) ^ j);
      }
      hashCode = i;
    }
    return hashCode;
  }
  
  public void writeToStream(DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeInt(metadata.size());
    Iterator localIterator = metadata.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramDataOutputStream.writeUTF((String)((Map.Entry)localObject).getKey());
      localObject = (byte[])((Map.Entry)localObject).getValue();
      paramDataOutputStream.writeInt(localObject.length);
      paramDataOutputStream.write((byte[])localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */