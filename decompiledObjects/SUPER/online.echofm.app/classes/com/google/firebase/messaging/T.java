package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class T
  extends B2.a
{
  public static final Parcelable.Creator<T> CREATOR = new U();
  public Bundle o;
  public Map p;
  public c q;
  
  public T(Bundle paramBundle)
  {
    o = paramBundle;
  }
  
  public int S()
  {
    String str1 = o.getString("google.original_priority");
    String str2 = str1;
    if (str1 == null) {
      str2 = o.getString("google.priority");
    }
    return i(str2);
  }
  
  public long T()
  {
    Object localObject = o.get("google.sent_time");
    if ((localObject instanceof Long)) {
      return ((Long)localObject).longValue();
    }
    if ((localObject instanceof String)) {
      try
      {
        long l = Long.parseLong((String)localObject);
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid sent time: ");
        localStringBuilder.append(localObject);
        Log.w("FirebaseMessaging", localStringBuilder.toString());
      }
    }
    return 0L;
  }
  
  public String U()
  {
    return o.getString("google.to");
  }
  
  public int V()
  {
    Object localObject = o.get("google.ttl");
    if ((localObject instanceof Integer)) {
      return ((Integer)localObject).intValue();
    }
    if ((localObject instanceof String)) {
      try
      {
        int i = Integer.parseInt((String)localObject);
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid TTL: ");
        localStringBuilder.append(localObject);
        Log.w("FirebaseMessaging", localStringBuilder.toString());
      }
    }
    return 0;
  }
  
  public void W(Intent paramIntent)
  {
    paramIntent.putExtras(o);
  }
  
  public String a()
  {
    return o.getString("collapse_key");
  }
  
  public Map d()
  {
    if (p == null) {
      p = e.a.a(o);
    }
    return p;
  }
  
  public String f()
  {
    return o.getString("from");
  }
  
  public String g()
  {
    String str1 = o.getString("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = o.getString("message_id");
    }
    return str2;
  }
  
  public final int i(String paramString)
  {
    if ("high".equals(paramString)) {
      return 1;
    }
    if ("normal".equals(paramString)) {
      return 2;
    }
    return 0;
  }
  
  public String k()
  {
    return o.getString("message_type");
  }
  
  public c q()
  {
    if ((q == null) && (L.t(o))) {
      q = new c(new L(o), null);
    }
    return q;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    U.c(this, paramParcel, paramInt);
  }
  
  public static class b
  {
    public final Bundle a;
    public final Map b;
    
    public b(String paramString)
    {
      Object localObject = new Bundle();
      a = ((Bundle)localObject);
      b = new t.a();
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
  
  public static class c
  {
    public final String a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String[] f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Uri n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final int[] s;
    public final Long t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final long[] z;
    
    public c(L paramL)
    {
      a = paramL.p("gcm.n.title");
      b = paramL.h("gcm.n.title");
      c = j(paramL, "gcm.n.title");
      d = paramL.p("gcm.n.body");
      e = paramL.h("gcm.n.body");
      f = j(paramL, "gcm.n.body");
      g = paramL.p("gcm.n.icon");
      i = paramL.o();
      j = paramL.p("gcm.n.tag");
      k = paramL.p("gcm.n.color");
      l = paramL.p("gcm.n.click_action");
      m = paramL.p("gcm.n.android_channel_id");
      n = paramL.f();
      h = paramL.p("gcm.n.image");
      o = paramL.p("gcm.n.ticker");
      p = paramL.b("gcm.n.notification_priority");
      q = paramL.b("gcm.n.visibility");
      r = paramL.b("gcm.n.notification_count");
      u = paramL.a("gcm.n.sticky");
      v = paramL.a("gcm.n.local_only");
      w = paramL.a("gcm.n.default_sound");
      x = paramL.a("gcm.n.default_vibrate_timings");
      y = paramL.a("gcm.n.default_light_settings");
      t = paramL.j("gcm.n.event_time");
      s = paramL.e();
      z = paramL.q();
    }
    
    public static String[] j(L paramL, String paramString)
    {
      paramString = paramL.g(paramString);
      if (paramString == null) {
        return null;
      }
      paramL = new String[paramString.length];
      for (int i1 = 0; i1 < paramString.length; i1++) {
        paramL[i1] = String.valueOf(paramString[i1]);
      }
      return paramL;
    }
    
    public String a()
    {
      return d;
    }
    
    public String[] b()
    {
      return f;
    }
    
    public String c()
    {
      return e;
    }
    
    public String d()
    {
      return m;
    }
    
    public String e()
    {
      return l;
    }
    
    public String f()
    {
      return k;
    }
    
    public String g()
    {
      return g;
    }
    
    public Uri h()
    {
      Object localObject = h;
      if (localObject != null) {
        localObject = Uri.parse((String)localObject);
      } else {
        localObject = null;
      }
      return (Uri)localObject;
    }
    
    public Uri i()
    {
      return n;
    }
    
    public Integer k()
    {
      return r;
    }
    
    public Integer l()
    {
      return p;
    }
    
    public String m()
    {
      return i;
    }
    
    public String n()
    {
      return j;
    }
    
    public String o()
    {
      return o;
    }
    
    public String p()
    {
      return a;
    }
    
    public String[] q()
    {
      return c;
    }
    
    public String r()
    {
      return b;
    }
    
    public Integer s()
    {
      return q;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */