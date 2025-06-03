package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a
  implements K
{
  protected int memoizedHashCode = 0;
  
  public static void e(Iterable paramIterable, List paramList)
  {
    a.s(paramIterable, paramList);
  }
  
  public abstract int h(Z paramZ);
  
  public final String i(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Serializing ");
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(" to a ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" threw an IOException (should never happen).");
    return localStringBuilder.toString();
  }
  
  public byte[] k()
  {
    try
    {
      byte[] arrayOfByte = new byte[a()];
      h localh = h.X(arrayOfByte);
      j(localh);
      localh.c();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(i("byte array"), localIOException);
    }
  }
  
  public static abstract class a
    implements K.a
  {
    public static void s(Iterable paramIterable, List paramList)
    {
      t.a(paramIterable);
      if ((paramIterable instanceof z))
      {
        Object localObject = ((z)paramIterable).o();
        paramIterable = (z)paramList;
        int i = paramList.size();
        paramList = ((List)localObject).iterator();
        while (paramList.hasNext())
        {
          localObject = paramList.next();
          if (localObject == null)
          {
            paramList = new StringBuilder();
            paramList.append("Element at index ");
            paramList.append(paramIterable.size() - i);
            paramList.append(" is null.");
            paramList = paramList.toString();
            for (int j = paramIterable.size() - 1; j >= i; j--) {
              paramIterable.remove(j);
            }
            throw new NullPointerException(paramList);
          }
          if ((localObject instanceof f)) {
            paramIterable.x((f)localObject);
          } else {
            paramIterable.add((String)localObject);
          }
        }
      }
      if ((paramIterable instanceof U)) {
        paramList.addAll((Collection)paramIterable);
      } else {
        t(paramIterable, paramList);
      }
    }
    
    public static void t(Iterable paramIterable, List paramList)
    {
      if (((paramList instanceof ArrayList)) && ((paramIterable instanceof Collection))) {
        ((ArrayList)paramList).ensureCapacity(paramList.size() + ((Collection)paramIterable).size());
      }
      int i = paramList.size();
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        Object localObject = paramIterable.next();
        if (localObject == null)
        {
          paramIterable = new StringBuilder();
          paramIterable.append("Element at index ");
          paramIterable.append(paramList.size() - i);
          paramIterable.append(" is null.");
          paramIterable = paramIterable.toString();
          for (int j = paramList.size() - 1; j >= i; j--) {
            paramList.remove(j);
          }
          throw new NullPointerException(paramIterable);
        }
        paramList.add(localObject);
      }
    }
    
    public static f0 u(K paramK)
    {
      return new f0(paramK);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */