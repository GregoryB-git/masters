package B1;

import C1.a;
import C1.c;
import C1.c.b;
import C1.f;
import O1.P;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;

public final class g$c$a
{
  public final List a(a parama, View paramView, List paramList, int paramInt1, int paramInt2, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramList, "path");
    Intrinsics.checkNotNullParameter(paramString, "mapKey");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append('.');
    ((StringBuilder)localObject).append(paramInt2);
    localObject = ((StringBuilder)localObject).toString();
    ArrayList localArrayList = new ArrayList();
    if (paramView == null) {
      return localArrayList;
    }
    if (paramInt1 >= paramList.size()) {}
    int i;
    int j;
    for (paramString = new g.b(paramView, (String)localObject);; paramString = new g.b(paramView, (String)localObject))
    {
      localArrayList.add(paramString);
      break;
      paramString = (c)paramList.get(paramInt1);
      if (Intrinsics.a(paramString.a(), ".."))
      {
        paramView = paramView.getParent();
        if ((paramView instanceof ViewGroup))
        {
          paramView = b((ViewGroup)paramView);
          i = paramView.size();
          if (i > 0) {
            for (paramInt2 = 0;; paramInt2 = j)
            {
              j = paramInt2 + 1;
              localArrayList.addAll((Collection)a(parama, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, (String)localObject));
              if (j >= i) {
                break;
              }
            }
          }
        }
        return localArrayList;
      }
      if (Intrinsics.a(paramString.a(), "."))
      {
        localArrayList.add(new g.b(paramView, (String)localObject));
        return localArrayList;
      }
      if (!c(paramView, paramString, paramInt2)) {
        return localArrayList;
      }
      if (paramInt1 != paramList.size() - 1) {
        break;
      }
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = b((ViewGroup)paramView);
      i = paramView.size();
      if (i > 0) {
        for (paramInt2 = 0;; paramInt2 = j)
        {
          j = paramInt2 + 1;
          localArrayList.addAll((Collection)a(parama, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, (String)localObject));
          if (j >= i) {
            break;
          }
        }
      }
    }
    return localArrayList;
  }
  
  public final List b(ViewGroup paramViewGroup)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramViewGroup.getChildCount();
    if (i > 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        View localView = paramViewGroup.getChildAt(j);
        if (localView.getVisibility() == 0)
        {
          Intrinsics.checkNotNullExpressionValue(localView, "child");
          localArrayList.add(localView);
        }
        if (k >= i) {
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public final boolean c(View paramView, c paramc, int paramInt)
  {
    if ((paramc.e() != -1) && (paramInt != paramc.e())) {
      return false;
    }
    Object localObject;
    if (!Intrinsics.a(paramView.getClass().getCanonicalName(), paramc.a()))
    {
      localObject = paramc.a();
      if (new Regex(".*android\\..*").b((CharSequence)localObject))
      {
        localObject = i.V(paramc.a(), new String[] { "." }, false, 0, 6, null);
        if ((((Collection)localObject).isEmpty() ^ true))
        {
          localObject = (String)((List)localObject).get(((List)localObject).size() - 1);
          if (Intrinsics.a(paramView.getClass().getSimpleName(), localObject)) {
            break label134;
          }
        }
      }
      return false;
    }
    label134:
    if (((paramc.f() & c.b.p.e()) > 0) && (paramc.d() != paramView.getId())) {
      return false;
    }
    String str1;
    String str2;
    if ((paramc.f() & c.b.q.e()) > 0)
    {
      localObject = paramc.h();
      str1 = f.k(paramView);
      str2 = P.k(P.F0(str1), "");
      if ((!Intrinsics.a(localObject, str1)) && (!Intrinsics.a(localObject, str2))) {
        return false;
      }
    }
    if ((paramc.f() & c.b.s.e()) > 0)
    {
      str1 = paramc.b();
      if (paramView.getContentDescription() == null) {
        localObject = "";
      } else {
        localObject = paramView.getContentDescription().toString();
      }
      str2 = P.k(P.F0((String)localObject), "");
      if ((!Intrinsics.a(str1, localObject)) && (!Intrinsics.a(str1, str2))) {
        return false;
      }
    }
    if ((paramc.f() & c.b.t.e()) > 0)
    {
      localObject = paramc.c();
      str2 = f.i(paramView);
      str1 = P.k(P.F0(str2), "");
      if ((!Intrinsics.a(localObject, str2)) && (!Intrinsics.a(localObject, str1))) {
        return false;
      }
    }
    if ((paramc.f() & c.b.r.e()) > 0)
    {
      paramc = paramc.g();
      if (paramView.getTag() == null) {
        paramView = "";
      } else {
        paramView = paramView.getTag().toString();
      }
      localObject = P.k(P.F0(paramView), "");
      if ((!Intrinsics.a(paramc, paramView)) && (!Intrinsics.a(paramc, localObject))) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     B1.g.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */