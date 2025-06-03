package H4;

import F4.a;
import M4.m;
import N4.h;
import N4.h.d;
import android.content.Context;
import java.net.URI;

public final class c
  extends e
{
  public static final a c = ;
  public final h a;
  public final Context b;
  
  public c(h paramh, Context paramContext)
  {
    b = paramContext;
    a = paramh;
  }
  
  public boolean c()
  {
    if (j(a.x0()))
    {
      localObject1 = c;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("URL is missing:");
      ((StringBuilder)localObject2).append(a.x0());
      ((a)localObject1).j(((StringBuilder)localObject2).toString());
      return false;
    }
    URI localURI = g(a.x0());
    if (localURI == null)
    {
      c.j("URL cannot be parsed");
      return false;
    }
    if (!h(localURI, b))
    {
      localObject2 = c;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("URL fails allowlist rule: ");
      ((StringBuilder)localObject1).append(localURI);
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    if (!k(localURI.getHost()))
    {
      c.j("URL host is null or invalid");
      return false;
    }
    if (!p(localURI.getScheme()))
    {
      c.j("URL scheme is null or invalid");
      return false;
    }
    if (!r(localURI.getUserInfo()))
    {
      c.j("URL user info is null");
      return false;
    }
    if (!o(localURI.getPort()))
    {
      c.j("URL port is less than or equal to 0");
      return false;
    }
    if (a.z0()) {
      localObject1 = a.n0();
    } else {
      localObject1 = null;
    }
    if (!l((h.d)localObject1))
    {
      localObject2 = c;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("HTTP Method is null or invalid: ");
      ((StringBuilder)localObject1).append(a.n0());
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    if ((a.A0()) && (!m(a.o0())))
    {
      localObject2 = c;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("HTTP ResponseCode is a negative value:");
      ((StringBuilder)localObject1).append(a.o0());
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    if ((a.B0()) && (!n(a.r0())))
    {
      localObject2 = c;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Request Payload is a negative value:");
      ((StringBuilder)localObject1).append(a.r0());
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    if ((a.C0()) && (!n(a.t0())))
    {
      localObject1 = c;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Response Payload is a negative value:");
      ((StringBuilder)localObject2).append(a.t0());
      ((a)localObject1).j(((StringBuilder)localObject2).toString());
      return false;
    }
    if ((a.y0()) && (a.l0() > 0L))
    {
      if ((a.D0()) && (!q(a.u0())))
      {
        localObject1 = c;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Time to complete the request is a negative value:");
        ((StringBuilder)localObject2).append(a.u0());
        ((a)localObject1).j(((StringBuilder)localObject2).toString());
        return false;
      }
      if ((a.F0()) && (!q(a.w0())))
      {
        localObject1 = c;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Time from the start of the request to the start of the response is null or a negative value:");
        ((StringBuilder)localObject2).append(a.w0());
        ((a)localObject1).j(((StringBuilder)localObject2).toString());
        return false;
      }
      if ((a.E0()) && (a.v0() > 0L))
      {
        if (!a.A0())
        {
          c.j("Did not receive a HTTP Response Code");
          return false;
        }
        return true;
      }
      localObject2 = c;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Time from the start of the request to the end of the response is null, negative or zero:");
      ((StringBuilder)localObject1).append(a.v0());
      ((a)localObject2).j(((StringBuilder)localObject1).toString());
      return false;
    }
    Object localObject2 = c;
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Start time of the request is null, or zero, or a negative value:");
    ((StringBuilder)localObject1).append(a.l0());
    ((a)localObject2).j(((StringBuilder)localObject1).toString());
    return false;
  }
  
  public final URI g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = URI.create(paramString);
      return paramString;
    }
    catch (IllegalStateException paramString) {}catch (IllegalArgumentException paramString) {}
    c.k("getResultUrl throws exception %s", new Object[] { paramString.getMessage() });
    return null;
  }
  
  public final boolean h(URI paramURI, Context paramContext)
  {
    if (paramURI == null) {
      return false;
    }
    return m.a(paramURI, paramContext);
  }
  
  public final boolean i(String paramString)
  {
    if (paramString == null) {
      return true;
    }
    return paramString.trim().isEmpty();
  }
  
  public final boolean j(String paramString)
  {
    return i(paramString);
  }
  
  public final boolean k(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (!i(paramString)) && (paramString.length() <= 255)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean l(h.d paramd)
  {
    boolean bool;
    if ((paramd != null) && (paramd != h.d.p)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean m(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean n(long paramLong)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean o(int paramInt)
  {
    boolean bool;
    if ((paramInt != -1) && (paramInt <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean p(String paramString)
  {
    boolean bool = false;
    if (paramString == null) {
      return false;
    }
    if (("http".equalsIgnoreCase(paramString)) || ("https".equalsIgnoreCase(paramString))) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean q(long paramLong)
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean r(String paramString)
  {
    boolean bool;
    if (paramString == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     H4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */