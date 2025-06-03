package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import t.a;
import t.h;

public abstract class e
{
  public static final long a = TimeUnit.MINUTES.toMillis(3L);
  
  public static final abstract class a
  {
    public static a a(Bundle paramBundle)
    {
      a locala = new a();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramBundle.get(str);
        if ((localObject instanceof String))
        {
          localObject = (String)localObject;
          if ((!str.startsWith("google.")) && (!str.startsWith("gcm.")) && (!str.equals("from")) && (!str.equals("message_type")) && (!str.equals("collapse_key"))) {
            locala.put(str, localObject);
          }
        }
      }
      return locala;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */