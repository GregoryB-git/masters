package z1;

import G1.g;
import T1.a;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;
import y1.F;
import y1.F.a;

public final class f
  implements ViewTreeObserver.OnGlobalFocusChangeListener
{
  public static final a s = new a(null);
  public static final Map t = new HashMap();
  public final Set o = new LinkedHashSet();
  public final Handler p = new Handler(Looper.getMainLooper());
  public final WeakReference q;
  public final AtomicBoolean r;
  
  public f(Activity paramActivity)
  {
    q = new WeakReference(paramActivity);
    r = new AtomicBoolean(false);
  }
  
  public static final void e(View paramView, f paramf)
  {
    if (a.d(f.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "$view");
      Intrinsics.checkNotNullParameter(paramf, "this$0");
      if (!(paramView instanceof EditText)) {
        return;
      }
      paramf.f(paramView);
      return;
    }
    finally
    {
      a.b(paramView, f.class);
    }
  }
  
  public final void d(View paramView)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      e locale = new z1/e;
      locale.<init>(paramView, this);
      g(locale);
      return;
    }
    finally
    {
      a.b(paramView, this);
    }
  }
  
  public final void f(View paramView)
  {
    if (a.d(this)) {
      return;
    }
    do
    {
      try
      {
        localObject1 = ((EditText)paramView).getText().toString();
        if (localObject1 == null) {
          break label309;
        }
        localObject1 = i.f0((CharSequence)localObject1).toString();
        if (localObject1 == null) {
          break label297;
        }
        str1 = ((String)localObject1).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(str1, "(this as java.lang.String).toLowerCase()");
        if ((str1.length() == 0) || (o.contains(str1)) || (str1.length() > 100)) {
          break label296;
        }
        o.add(str1);
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        localList = c.b(paramView);
        localIterator = d.d.c().iterator();
        localObject1 = null;
      }
      finally
      {
        Object localObject1;
        String str1;
        HashMap localHashMap;
        List localList;
        Iterator localIterator;
        Object localObject2;
        a locala;
        String str2;
        break label321;
        Object localObject3 = c.a;
        if (!c.e(localList, ((d)localObject2).b())) {
          break label242;
        }
        for (localObject3 = ((d)localObject2).c();; localObject3 = localObject2)
        {
          a.b(locala, localHashMap, (String)localObject3, str2);
          break;
          localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = c.a(paramView);
          }
          localObject1 = localObject3;
          if (!c.e((List)localObject3, ((d)localObject2).b())) {
            break;
          }
          localObject2 = ((d)localObject2).c();
          localObject1 = localObject3;
        }
        F.b.e(localHashMap);
        return;
        paramView = new java/lang/NullPointerException;
        paramView.<init>("null cannot be cast to non-null type java.lang.String");
        throw paramView;
        paramView = new java/lang/NullPointerException;
        paramView.<init>("null cannot be cast to non-null type kotlin.CharSequence");
        throw paramView;
        a.b(paramView, this);
      }
      if (!localIterator.hasNext()) {
        break label288;
      }
      localObject2 = (d)localIterator.next();
      locala = s;
      str2 = a.a(locala, ((d)localObject2).c(), str1);
      if (((d)localObject2).d().length() <= 0) {
        break;
      }
      localObject3 = c.a;
    } while (!c.f(str2, ((d)localObject2).d()));
    label242:
    label288:
    label296:
    label297:
    label309:
    label321:
    return;
  }
  
  public final void g(Runnable paramRunnable)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        paramRunnable.run();
      }
    }
    finally
    {
      break label43;
    }
    p.post(paramRunnable);
    return;
    label43:
    a.b(paramRunnable, this);
  }
  
  public final void h()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      if (r.getAndSet(true)) {
        return;
      }
      Object localObject = g.a;
      localObject = g.e((Activity)q.get());
      if (localObject == null) {
        return;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      if (((ViewTreeObserver)localObject).isAlive()) {
        ((ViewTreeObserver)localObject).addOnGlobalFocusChangeListener(this);
      }
    }
    finally
    {
      break label68;
    }
    return;
    label68:
    a.b(localThrowable, this);
  }
  
  public void onGlobalFocusChanged(View paramView1, View paramView2)
  {
    if (a.d(this)) {
      return;
    }
    if (paramView1 != null) {
      try
      {
        d(paramView1);
      }
      finally
      {
        break label36;
      }
    }
    if (paramView2 != null)
    {
      d(paramView2);
      return;
      label36:
      a.b(paramView1, this);
    }
  }
  
  public static final class a
  {
    public final String c(String paramString1, String paramString2)
    {
      String str = paramString2;
      if (Intrinsics.a("r2", paramString1)) {
        str = new Regex("[^\\d.]").replace(paramString2, "");
      }
      return str;
    }
    
    public final void d(Map paramMap, String paramString1, String paramString2)
    {
      String str;
      switch (paramString1.hashCode())
      {
      default: 
        str = paramString2;
        break;
      case 3588: 
        if (!paramString1.equals("r6"))
        {
          str = paramString2;
          break label239;
        }
        str = paramString2;
        if (!i.v(paramString2, "-", false, 2, null)) {
          break label239;
        }
        paramString2 = ((Collection)new Regex("-").c(paramString2, 0)).toArray(new String[0]);
        if (paramString2 != null)
        {
          str = ((String[])paramString2)[0];
          break label239;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
      case 3587: 
        if (!paramString1.equals("r5")) {
          str = paramString2;
        }
        break;
      case 3586: 
        if (!paramString1.equals("r4")) {
          str = paramString2;
        } else {
          str = new Regex("[^a-z]+").replace(paramString2, "");
        }
        break;
      }
      if (!paramString1.equals("r3")) {
        str = paramString2;
      } else if ((!i.s(paramString2, "m", false, 2, null)) && (!i.s(paramString2, "b", false, 2, null)) && (!i.s(paramString2, "ge", false, 2, null))) {
        str = "f";
      } else {
        str = "m";
      }
      label239:
      paramMap.put(paramString1, str);
    }
    
    public final void e(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      int i = paramActivity.hashCode();
      Map localMap = f.b();
      Integer localInteger = Integer.valueOf(i);
      Object localObject1 = localMap.get(localInteger);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new f(paramActivity, null);
        localMap.put(localInteger, localObject2);
      }
      f.c((f)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     z1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */