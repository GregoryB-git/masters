package m9;

import g9.d0;
import n9.a;
import n9.a.a;

public final class b0
{
  public d0 a;
  public int b;
  public a.a c;
  public boolean d;
  public final a e;
  public final a f;
  
  public b0(a parama, aa.m0 paramm0)
  {
    e = parama;
    f = paramm0;
    a = d0.a;
    d = true;
  }
  
  public final void a(String paramString)
  {
    String str = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", new Object[] { paramString });
    boolean bool = d;
    paramString = new Object[1];
    if (bool)
    {
      paramString[0] = str;
      p2.m0.h0("OnlineStateTracker", "%s", paramString);
      d = false;
    }
    else
    {
      paramString[0] = str;
      p2.m0.w("OnlineStateTracker", "%s", paramString);
    }
  }
  
  public final void b(d0 paramd0)
  {
    if (paramd0 != a)
    {
      a = paramd0;
      ((h0.a)f).b).b(paramd0);
    }
  }
  
  public final void c(d0 paramd0)
  {
    a.a locala = c;
    if (locala != null)
    {
      locala.a();
      c = null;
    }
    b = 0;
    if (paramd0 == d0.b) {
      d = false;
    }
    b(paramd0);
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     m9.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */