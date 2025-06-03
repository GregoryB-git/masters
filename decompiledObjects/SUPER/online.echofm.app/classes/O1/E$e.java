package O1;

import java.util.Collection;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

public abstract class E$e
{
  public TreeSet a;
  
  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      try
      {
        Object localObject1 = a;
        if (localObject1 != null)
        {
          if (localObject1 == null) {
            localObject1 = null;
          } else {
            localObject1 = Boolean.valueOf(((TreeSet)localObject1).isEmpty());
          }
          if (Intrinsics.a(localObject1, Boolean.FALSE)) {
            break label60;
          }
        }
      }
      finally
      {
        break label85;
      }
    }
    a = E.b(E.a, this);
    label60:
    TreeSet localTreeSet = a;
    if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
      f();
    }
    return;
    label85:
    throw localTreeSet;
  }
  
  public final TreeSet b()
  {
    Object localObject = a;
    if (localObject != null)
    {
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Boolean.valueOf(((TreeSet)localObject).isEmpty());
      }
      if (Intrinsics.a(localObject, Boolean.FALSE)) {}
    }
    else
    {
      a(false);
    }
    return a;
  }
  
  public abstract String c();
  
  public abstract String d();
  
  public String e()
  {
    return "id_token,token,signed_request,graph_domain";
  }
  
  public void f() {}
}

/* Location:
 * Qualified Name:     O1.E.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */