package B1;

import C1.a;
import C1.b;
import C1.f;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class g$a
{
  public final g a()
  {
    try
    {
      if (g.b() == null)
      {
        g localg = new B1/g;
        localg.<init>(null);
        g.d(localg);
      }
    }
    finally
    {
      break label52;
    }
    Object localObject2 = g.b();
    if (localObject2 != null) {
      return (g)localObject2;
    }
    localObject2 = new java/lang/NullPointerException;
    ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
    throw ((Throwable)localObject2);
    label52:
    throw ((Throwable)localObject2);
  }
  
  public final Bundle b(a parama, View paramView1, View paramView2)
  {
    Intrinsics.checkNotNullParameter(paramView1, "rootView");
    Intrinsics.checkNotNullParameter(paramView2, "hostView");
    Bundle localBundle = new Bundle();
    if (parama == null) {
      return localBundle;
    }
    Object localObject1 = parama.c();
    if (localObject1 != null)
    {
      Iterator localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label293;
        }
        b localb = (b)localIterator.next();
        if ((localb.d() != null) && (localb.d().length() > 0))
        {
          localBundle.putString(localb.a(), localb.d());
        }
        else if (localb.b().size() > 0)
        {
          boolean bool = Intrinsics.a(localb.c(), "relative");
          Object localObject2 = g.c.t;
          List localList = localb.b();
          Object localObject3;
          if (bool)
          {
            localObject3 = paramView2.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(localObject3, "hostView.javaClass.simpleName");
          }
          for (localObject1 = paramView2;; localObject1 = paramView1)
          {
            localObject1 = ((g.c.a)localObject2).a(parama, (View)localObject1, localList, 0, -1, (String)localObject3);
            break;
            localObject3 = paramView1.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(localObject3, "rootView.javaClass.simpleName");
          }
          localObject1 = ((List)localObject1).iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject3 = (g.b)((Iterator)localObject1).next();
            if (((g.b)localObject3).a() == null) {
              break;
            }
            localObject2 = f.a;
            localObject3 = f.k(((g.b)localObject3).a());
            if (((CharSequence)localObject3).length() <= 0) {
              break;
            }
            localBundle.putString(localb.a(), (String)localObject3);
          }
        }
      }
    }
    label293:
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     B1.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */