package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import t.a;

public class T$b
{
  public final Bundle a;
  public final Map b;
  
  public T$b(String paramString)
  {
    Object localObject = new Bundle();
    a = ((Bundle)localObject);
    b = new a();
    if (!TextUtils.isEmpty(paramString))
    {
      ((BaseBundle)localObject).putString("google.to", paramString);
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid to: ");
    ((StringBuilder)localObject).append(paramString);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public T a()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = b.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBundle.putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    localBundle.putAll(a);
    a.remove("from");
    return new T(localBundle);
  }
  
  public b b(String paramString)
  {
    a.putString("collapse_key", paramString);
    return this;
  }
  
  public b c(Map paramMap)
  {
    b.clear();
    b.putAll(paramMap);
    return this;
  }
  
  public b d(String paramString)
  {
    a.putString("google.message_id", paramString);
    return this;
  }
  
  public b e(String paramString)
  {
    a.putString("message_type", paramString);
    return this;
  }
  
  public b f(int paramInt)
  {
    a.putString("google.ttl", String.valueOf(paramInt));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.T.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */