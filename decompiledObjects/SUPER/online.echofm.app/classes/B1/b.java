package B1;

import C1.f;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.p;
import y1.p.a;

public final class b
{
  public static final b a = new b();
  
  public static final a b(C1.a parama, View paramView1, View paramView2)
  {
    if (T1.a.d(b.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "mapping");
      Intrinsics.checkNotNullParameter(paramView1, "rootView");
      Intrinsics.checkNotNullParameter(paramView2, "hostView");
      parama = new a(parama, paramView1, paramView2);
      return parama;
    }
    finally
    {
      T1.a.b(parama, b.class);
    }
    return null;
  }
  
  public static final b c(C1.a parama, View paramView, AdapterView paramAdapterView)
  {
    if (T1.a.d(b.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "mapping");
      Intrinsics.checkNotNullParameter(paramView, "rootView");
      Intrinsics.checkNotNullParameter(paramAdapterView, "hostView");
      parama = new b(parama, paramView, paramAdapterView);
      return parama;
    }
    finally
    {
      T1.a.b(parama, b.class);
    }
    return null;
  }
  
  public static final void d(C1.a parama, View paramView1, View paramView2)
  {
    if (T1.a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "mapping");
      Intrinsics.checkNotNullParameter(paramView1, "rootView");
      Intrinsics.checkNotNullParameter(paramView2, "hostView");
      String str = parama.b();
      paramView2 = g.f.b(parama, paramView1, paramView2);
      a.f(paramView2);
      paramView1 = B.t();
      parama = new B1/a;
      parama.<init>(str, paramView2);
      paramView1.execute(parama);
      return;
    }
    finally
    {
      T1.a.b(parama, b.class);
    }
  }
  
  public static final void e(String paramString, Bundle paramBundle)
  {
    if (T1.a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "$eventName");
      Intrinsics.checkNotNullParameter(paramBundle, "$parameters");
      Context localContext = B.l();
      p.b.h(localContext).f(paramString, paramBundle);
      return;
    }
    finally
    {
      T1.a.b(paramString, b.class);
    }
  }
  
  public final void f(Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramBundle, "parameters");
      String str = paramBundle.getString("_valueToSum");
      if (str != null) {
        paramBundle.putDouble("_valueToSum", G1.g.g(str));
      }
    }
    finally
    {
      break label51;
    }
    paramBundle.putString("_is_fb_codeless", "1");
    return;
    label51:
    T1.a.b(paramBundle, this);
  }
  
  public static final class a
    implements View.OnClickListener
  {
    public C1.a o;
    public WeakReference p;
    public WeakReference q;
    public View.OnClickListener r;
    public boolean s;
    
    public a(C1.a parama, View paramView1, View paramView2)
    {
      o = parama;
      p = new WeakReference(paramView2);
      q = new WeakReference(paramView1);
      r = f.g(paramView2);
      s = true;
    }
    
    public final boolean a()
    {
      return s;
    }
    
    public void onClick(View paramView)
    {
      if (T1.a.d(this)) {
        return;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramView, "view");
        Object localObject = r;
        if (localObject != null) {
          ((View.OnClickListener)localObject).onClick(paramView);
        }
        View localView = (View)q.get();
        paramView = (View)p.get();
        if ((localView != null) && (paramView != null))
        {
          localObject = b.a;
          b.d(o, localView, paramView);
        }
      }
      finally
      {
        break label84;
      }
      return;
      label84:
      T1.a.b(paramView, this);
    }
  }
  
  public static final class b
    implements AdapterView.OnItemClickListener
  {
    public C1.a o;
    public WeakReference p;
    public WeakReference q;
    public AdapterView.OnItemClickListener r;
    public boolean s;
    
    public b(C1.a parama, View paramView, AdapterView paramAdapterView)
    {
      o = parama;
      p = new WeakReference(paramAdapterView);
      q = new WeakReference(paramView);
      r = paramAdapterView.getOnItemClickListener();
      s = true;
    }
    
    public final boolean a()
    {
      return s;
    }
    
    public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      Object localObject = r;
      if (localObject != null) {
        ((AdapterView.OnItemClickListener)localObject).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
      }
      paramView = (View)q.get();
      paramAdapterView = (AdapterView)p.get();
      if ((paramView != null) && (paramAdapterView != null))
      {
        localObject = b.a;
        b.d(o, paramView, paramAdapterView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     B1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */