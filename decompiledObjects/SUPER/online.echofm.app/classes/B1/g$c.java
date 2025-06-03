package B1;

import C1.a.b;
import C1.c;
import C1.c.b;
import C1.f;
import O1.P;
import O1.r;
import O1.v;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;
import x1.B;

public final class g$c
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable
{
  public static final a t = new a(null);
  public final WeakReference o;
  public List p;
  public final Handler q;
  public final HashSet r;
  public final String s;
  
  public g$c(View paramView, Handler paramHandler, HashSet paramHashSet, String paramString)
  {
    o = new WeakReference(paramView);
    q = paramHandler;
    r = paramHashSet;
    s = paramString;
    paramHandler.postDelayed(this, 200L);
  }
  
  public final void a(g.b paramb, View paramView, C1.a parama)
  {
    if (parama == null) {
      return;
    }
    try
    {
      localView = paramb.a();
      if (localView == null) {
        return;
      }
      localObject = f.a(localView);
      if ((localObject != null) && (f.a.p(localView, (View)localObject)))
      {
        d(paramb, paramView, parama);
        return;
      }
    }
    catch (Exception paramView)
    {
      View localView;
      break label121;
      Object localObject = localView.getClass().getName();
      Intrinsics.checkNotNullExpressionValue(localObject, "view.javaClass.name");
      if (i.s((String)localObject, "com.facebook.react", false, 2, null)) {
        return;
      }
      if (!(localView instanceof AdapterView))
      {
        b(paramb, paramView, parama);
      }
      else if ((localView instanceof ListView))
      {
        c(paramb, paramView, parama);
        return;
        label121:
        paramb = P.a;
        P.i0(g.c(), paramView);
      }
    }
  }
  
  public final void b(g.b paramb, View paramView, C1.a parama)
  {
    View localView = paramb.a();
    if (localView == null) {
      return;
    }
    String str = paramb.b();
    paramb = f.g(localView);
    if ((paramb instanceof b.a)) {
      if (paramb != null)
      {
        if (((b.a)paramb).a())
        {
          i = 1;
          break label64;
        }
      }
      else {
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
      }
    }
    int i = 0;
    label64:
    if ((!r.contains(str)) && (i == 0))
    {
      localView.setOnClickListener(b.b(parama, paramView, localView));
      r.add(str);
    }
  }
  
  public final void c(g.b paramb, View paramView, C1.a parama)
  {
    AdapterView localAdapterView = (AdapterView)paramb.a();
    if (localAdapterView == null) {
      return;
    }
    paramb = paramb.b();
    AdapterView.OnItemClickListener localOnItemClickListener = localAdapterView.getOnItemClickListener();
    if ((localOnItemClickListener instanceof b.b)) {
      if (localOnItemClickListener != null)
      {
        if (((b.b)localOnItemClickListener).a())
        {
          i = 1;
          break label70;
        }
      }
      else {
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
      }
    }
    int i = 0;
    label70:
    if ((!r.contains(paramb)) && (i == 0))
    {
      localAdapterView.setOnItemClickListener(b.c(parama, paramView, localAdapterView));
      r.add(paramb);
    }
  }
  
  public final void d(g.b paramb, View paramView, C1.a parama)
  {
    View localView = paramb.a();
    if (localView == null) {
      return;
    }
    String str = paramb.b();
    paramb = f.h(localView);
    if ((paramb instanceof h.a)) {
      if (paramb != null)
      {
        if (((h.a)paramb).a())
        {
          i = 1;
          break label64;
        }
      }
      else {
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
      }
    }
    int i = 0;
    label64:
    if ((!r.contains(str)) && (i == 0))
    {
      localView.setOnTouchListener(h.a(parama, paramView, localView));
      r.add(str);
    }
  }
  
  public final void e(C1.a parama, View paramView)
  {
    if ((parama != null) && (paramView != null))
    {
      Object localObject = parama.a();
      if ((localObject != null) && (((CharSequence)localObject).length() != 0) && (!Intrinsics.a(parama.a(), s))) {
        return;
      }
      localObject = parama.d();
      if (((List)localObject).size() > 25) {
        return;
      }
      localObject = t.a(parama, paramView, (List)localObject, 0, -1, s).iterator();
      while (((Iterator)localObject).hasNext()) {
        a((g.b)((Iterator)localObject).next(), paramView, parama);
      }
    }
  }
  
  public final void f()
  {
    List localList = p;
    if ((localList != null) && (o.get() != null))
    {
      int i = localList.size() - 1;
      if (i >= 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          e((C1.a)localList.get(j), (View)o.get());
          if (k > i) {
            break;
          }
        }
      }
    }
  }
  
  public void onGlobalLayout()
  {
    f();
  }
  
  public void onScrollChanged()
  {
    f();
  }
  
  public void run()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Object localObject = v.f(B.m());
      if ((localObject == null) || (!((r)localObject).b())) {
        break label98;
      }
      localObject = C1.a.j.b(((r)localObject).d());
      p = ((List)localObject);
      if (localObject == null) {
        break label98;
      }
      localObject = (View)o.get();
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (((ViewTreeObserver)localObject).isAlive())
      {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
        ((ViewTreeObserver)localObject).addOnScrollChangedListener(this);
      }
    }
    finally
    {
      break label99;
    }
    f();
    label98:
    return;
    label99:
    T1.a.b(localThrowable, this);
  }
  
  public static final class a
  {
    public final List a(C1.a parama, View paramView, List paramList, int paramInt1, int paramInt2, String paramString)
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
}

/* Location:
 * Qualified Name:     B1.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */