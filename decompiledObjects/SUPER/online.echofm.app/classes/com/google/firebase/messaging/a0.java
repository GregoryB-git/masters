package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class a0
{
  public final SharedPreferences a;
  public final String b;
  public final String c;
  public final ArrayDeque d = new ArrayDeque();
  public final Executor e;
  public boolean f = false;
  
  public a0(SharedPreferences paramSharedPreferences, String paramString1, String paramString2, Executor paramExecutor)
  {
    a = paramSharedPreferences;
    b = paramString1;
    c = paramString2;
    e = paramExecutor;
  }
  
  public static a0 d(SharedPreferences paramSharedPreferences, String paramString1, String paramString2, Executor paramExecutor)
  {
    paramSharedPreferences = new a0(paramSharedPreferences, paramString1, paramString2, paramExecutor);
    paramSharedPreferences.e();
    return paramSharedPreferences;
  }
  
  public boolean b(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.contains(c))) {
      synchronized (d)
      {
        boolean bool = c(d.add(paramString));
        return bool;
      }
    }
    return false;
  }
  
  public final boolean c(boolean paramBoolean)
  {
    if ((paramBoolean) && (!f)) {
      j();
    }
    return paramBoolean;
  }
  
  public final void e()
  {
    synchronized (d)
    {
      d.clear();
      Object localObject1 = a.getString(b, "");
      if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!((String)localObject1).contains(c))) {
        break label126;
      }
      localObject1 = ((String)localObject1).split(c, -1);
      if (localObject1.length == 0) {
        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
      }
    }
    int i = localObject2.length;
    for (int j = 0; j < i; j++)
    {
      CharSequence localCharSequence = localObject2[j];
      if (!TextUtils.isEmpty(localCharSequence)) {
        d.add(localCharSequence);
      }
    }
    return;
    label126:
    return;
    throw ((Throwable)localObject2);
  }
  
  public String f()
  {
    synchronized (d)
    {
      String str = (String)d.peek();
      return str;
    }
  }
  
  public boolean g(Object paramObject)
  {
    synchronized (d)
    {
      boolean bool = c(d.remove(paramObject));
      return bool;
    }
  }
  
  public String h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      localStringBuilder.append(c);
    }
    return localStringBuilder.toString();
  }
  
  public final void i()
  {
    synchronized (d)
    {
      a.edit().putString(b, h()).commit();
      return;
    }
  }
  
  public final void j()
  {
    e.execute(new Z(this));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */