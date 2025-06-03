package T4;

import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import android.util.Log;
import g6.p;

public final class c$d
  extends k
  implements p
{
  public int o;
  
  public c$d(d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(String paramString, d paramd)
  {
    return ((d)create(paramString, paramd)).invokeSuspend(t.a);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    paramd = new d(paramd);
    p = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    b.c();
    if (o == 0)
    {
      o.b(paramObject);
      String str = (String)p;
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Error failing to fetch the remote configs: ");
      ((StringBuilder)paramObject).append(str);
      Log.e("SessionConfigFetcher", ((StringBuilder)paramObject).toString());
      return t.a;
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     T4.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */