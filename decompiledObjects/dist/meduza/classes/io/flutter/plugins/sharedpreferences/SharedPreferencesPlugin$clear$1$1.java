package io.flutter.plugins.sharedpreferences;

import dc.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rb.f;
import rb.h;
import wb.i;
import x6.b;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f="SharedPreferencesPlugin.kt", l={}, m="invokeSuspend")
final class SharedPreferencesPlugin$clear$1$1
  extends i
  implements p<r0.a, ub.e<? super h>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$clear$1$1(List<String> paramList, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new 1($allowList, parame);
    L$0 = paramObject;
    return parame;
  }
  
  public final Object invoke(r0.a parama, ub.e<? super h> parame)
  {
    return ((1)create(parama, parame)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = vb.a.a;
    if (label == 0)
    {
      f.b(paramObject);
      paramObject = (r0.a)L$0;
      localObject = $allowList;
      if (localObject != null)
      {
        Iterator localIterator = ((Iterable)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = b.j((String)localIterator.next());
          paramObject.getClass();
          ((r0.a)paramObject).c();
          a.remove(localObject);
        }
      }
      ((r0.a)paramObject).c();
      a.clear();
      return h.a;
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.clear.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */