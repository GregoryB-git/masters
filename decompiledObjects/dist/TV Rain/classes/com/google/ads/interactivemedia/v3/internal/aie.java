package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class aie
{
  public static int a(ObjectInputStream paramObjectInputStream)
    throws IOException
  {
    return paramObjectInputStream.readInt();
  }
  
  public static <K, V> void a(Map<K, V> paramMap, ObjectInputStream paramObjectInputStream, int paramInt)
    throws IOException, ClassNotFoundException
  {
    for (int i = 0; i < paramInt; i++) {
      paramMap.put(paramObjectInputStream.readObject(), paramObjectInputStream.readObject());
    }
  }
  
  public static <K, V> void a(Map<K, V> paramMap, ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.writeInt(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      paramObjectOutputStream.writeObject(paramMap.getKey());
      paramObjectOutputStream.writeObject(paramMap.getValue());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aie
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */