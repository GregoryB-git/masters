package r0;

import android.net.Uri;
import d0.q;
import d0.q.b;

public final class g$b
{
  public final Uri a;
  public final q b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  
  public g$b(Uri paramUri, q paramq, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a = paramUri;
    b = paramq;
    c = paramString1;
    d = paramString2;
    e = paramString3;
    f = paramString4;
  }
  
  public static b b(Uri paramUri)
  {
    return new b(paramUri, new q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
  }
  
  public b a(q paramq)
  {
    return new b(a, paramq, c, d, e, f);
  }
}

/* Location:
 * Qualified Name:     r0.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */