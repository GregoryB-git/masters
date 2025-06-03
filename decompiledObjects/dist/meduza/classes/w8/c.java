package w8;

import android.content.Context;
import android.os.Looper;
import k6.a.a;
import k6.a.d;
import k6.a.d.c;
import k6.a.f;
import k6.a.g;
import k6.d;
import k6.d.a;
import k6.e.a;
import k6.e.b;

public final class c
  extends d<a.d.c>
{
  public static final k6.a<a.d.c> a;
  
  static
  {
    a.g localg = new a.g();
    a = new k6.a("DynamicLinks.API", new a(), localg);
  }
  
  public c(Context paramContext)
  {
    super(paramContext, a, a.d.j, d.a.c);
  }
  
  public final class a
    extends a.a<com.google.firebase.dynamiclinks.internal.a, a.d.c>
  {
    public final a.f buildClient(Context paramContext, Looper paramLooper, m6.a parama, Object paramObject, e.a parama1, e.b paramb)
    {
      paramObject = (a.d.c)paramObject;
      return new com.google.firebase.dynamiclinks.internal.a(paramContext, paramLooper, parama, parama1, paramb);
    }
  }
}

/* Location:
 * Qualified Name:     w8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */