package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.impl.data.ag;
import com.google.ads.interactivemedia.v3.impl.data.al;
import java.net.MalformedURLException;

public final class aeq
{
  private static final xu a = new xz().a(UiElement.class, al.GSON_TYPE_ADAPTER).a(CompanionAdSlot.class, new aep()).a(new agy()).a();
  private final aes b;
  private final Object c;
  private final String d;
  private final aer e;
  
  public aeq(aes paramaes, aer paramaer, String paramString)
  {
    this(paramaes, paramaer, paramString, null);
  }
  
  public aeq(aes paramaes, aer paramaer, String paramString, Object paramObject)
  {
    b = paramaes;
    e = paramaer;
    d = paramString;
    c = paramObject;
  }
  
  public static aeq a(String paramString)
    throws MalformedURLException, yl
  {
    paramString = Uri.parse(paramString);
    String str = paramString.getPath().substring(1);
    if (paramString.getQueryParameter("sid") != null) {
      return new aeq(aes.valueOf(str), aer.valueOf(paramString.getQueryParameter("type")), paramString.getQueryParameter("sid"), a.a(paramString.getQueryParameter("data"), ag.class));
    }
    throw new MalformedURLException("Session id must be provided in message.");
  }
  
  public final aes a()
  {
    return b;
  }
  
  public final aer b()
  {
    return e;
  }
  
  public final Object c()
  {
    return c;
  }
  
  public final String d()
  {
    return d;
  }
  
  public final String e()
  {
    aim localaim = new aim().b("type", e).b("sid", d);
    Object localObject = c;
    if (localObject != null) {
      localaim.b("data", localObject);
    }
    localObject = localaim.a();
    return String.format("%s('%s', %s);", new Object[] { "javascript:adsense.mobileads.afmanotify.receiveMessage", b, a.a(localObject) });
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof aeq)) {
      return false;
    }
    paramObject = (aeq)paramObject;
    if (b != b) {
      return false;
    }
    if (!ahf.a(c, c)) {
      return false;
    }
    if (!ahf.a(d, d)) {
      return false;
    }
    return e == e;
  }
  
  public final int hashCode()
  {
    return ahf.a(new Object[] { b, c, d, e });
  }
  
  public final String toString()
  {
    return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", new Object[] { b, e, d, c });
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aeq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */