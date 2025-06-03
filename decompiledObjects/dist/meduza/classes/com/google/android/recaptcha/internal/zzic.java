package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zzic
  implements zzih
{
  private static final boolean zzb(int paramInt)
  {
    boolean bool;
    try
    {
      Socket localSocket = new java/net/Socket;
      localSocket.<init>("localhost", paramInt);
      localSocket.close();
      bool = true;
    }
    catch (ConnectException localConnectException)
    {
      bool = false;
    }
    return bool;
  }
  
  public final Object zza(Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    ArrayList localArrayList = new ArrayList(i);
    int j = 0;
    while (j < i)
    {
      Object localObject1 = paramVarArgs[j];
      localObject2 = localObject1;
      if (true != localObject1 instanceof Integer) {
        localObject2 = null;
      }
      localObject2 = (Integer)localObject2;
      if (localObject2 != null)
      {
        localArrayList.add(Integer.valueOf(((Number)localObject2).intValue()));
        j++;
      }
      else
      {
        throw new zzce(4, 5, null);
      }
    }
    paramVarArgs = new ArrayList();
    Object localObject2 = localArrayList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      j = ((Number)((Iterator)localObject2).next()).intValue();
      if (zzb(j)) {
        paramVarArgs.add(Integer.valueOf(j));
      }
    }
    return paramVarArgs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */