package z1;

import C1.f;
import T1.a;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;

public final class c
{
  public static final c a = new c();
  
  public static final List a(View paramView)
  {
    if (a.d(c.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = f.j(paramView);
      if (localObject != null)
      {
        localObject = f.b((View)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          View localView = (View)((Iterator)localObject).next();
          if (paramView != localView) {
            localArrayList.addAll((Collection)a.c(localView));
          }
        }
      }
      label93:
      return null;
    }
    finally
    {
      break label93;
      return localArrayList;
      a.b(paramView, c.class);
    }
  }
  
  public static final List b(View paramView)
  {
    if (a.d(c.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((List)localObject1).add(f.i(paramView));
      localObject2 = paramView.getTag();
      if (localObject2 != null) {
        ((List)localObject1).add(localObject2.toString());
      }
    }
    finally
    {
      break label253;
    }
    Object localObject2 = paramView.getContentDescription();
    if (localObject2 != null) {
      ((List)localObject1).add(localObject2.toString());
    }
    try
    {
      if (paramView.getId() != -1)
      {
        localObject2 = paramView.getResources().getResourceName(paramView.getId());
        Intrinsics.checkNotNullExpressionValue(localObject2, "resourceName");
        paramView = new kotlin/text/Regex;
        paramView.<init>("/");
        paramView = ((Collection)paramView.c((CharSequence)localObject2, 0)).toArray(new String[0]);
        if (paramView != null)
        {
          paramView = (String[])paramView;
          if (paramView.length == 2) {
            ((List)localObject1).add(paramView[1]);
          }
        }
        else
        {
          paramView = new java/lang/NullPointerException;
          paramView.<init>("null cannot be cast to non-null type kotlin.Array<T>");
          throw paramView;
        }
      }
    }
    catch (Resources.NotFoundException paramView)
    {
      for (;;) {}
    }
    paramView = new java/util/ArrayList;
    paramView.<init>();
    Object localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if ((((CharSequence)localObject2).length() > 0) && (((String)localObject2).length() <= 100))
      {
        localObject2 = ((String)localObject2).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(localObject2, "(this as java.lang.String).toLowerCase()");
        paramView.add(localObject2);
      }
    }
    return paramView;
    label253:
    a.b(paramView, c.class);
    return null;
  }
  
  public static final boolean e(List paramList1, List paramList2)
  {
    if (a.d(c.class)) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramList1, "indicators");
      Intrinsics.checkNotNullParameter(paramList2, "keys");
      Iterator localIterator = paramList1.iterator();
      while (localIterator.hasNext())
      {
        paramList1 = (String)localIterator.next();
        boolean bool = a.d(paramList1, paramList2);
        if (bool) {
          return true;
        }
      }
    }
    finally
    {
      break label69;
      return false;
      label69:
      a.b(paramList1, c.class);
    }
    return false;
  }
  
  public static final boolean f(String paramString1, String paramString2)
  {
    if (a.d(c.class)) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "text");
      Intrinsics.checkNotNullParameter(paramString2, "rule");
      Regex localRegex = new kotlin/text/Regex;
      localRegex.<init>(paramString2);
      boolean bool = localRegex.b(paramString1);
      return bool;
    }
    finally
    {
      a.b(paramString1, c.class);
    }
    return false;
  }
  
  public final List c(View paramView)
  {
    if (a.d(this)) {
      return null;
    }
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if ((paramView instanceof EditText)) {
        return localArrayList;
      }
      if (!(paramView instanceof TextView)) {
        break label90;
      }
      paramView = ((TextView)paramView).getText().toString();
      if ((paramView.length() > 0) && (paramView.length() < 100))
      {
        paramView = paramView.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(paramView, "(this as java.lang.String).toLowerCase()");
        localArrayList.add(paramView);
      }
    }
    finally
    {
      break label137;
    }
    return localArrayList;
    label90:
    paramView = f.b(paramView).iterator();
    while (paramView.hasNext()) {
      localArrayList.addAll((Collection)c((View)paramView.next()));
    }
    return localArrayList;
    label137:
    a.b(paramView, this);
    return null;
  }
  
  public final boolean d(String paramString, List paramList)
  {
    if (a.d(this)) {
      return false;
    }
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        boolean bool = i.v(paramString, (String)paramList.next(), false, 2, null);
        if (bool) {
          return true;
        }
      }
    }
    finally
    {
      break label54;
      return false;
      label54:
      a.b(paramString, this);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     z1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */