package io.flutter.plugin.platform;

import D5.q.b;
import D5.q.d;
import D5.q.e;
import D5.q.f;
import D5.q.g;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import java.util.HashMap;
import t5.b;

public class r$a
  implements q.g
{
  public r$a(r paramr) {}
  
  public void a(boolean paramBoolean)
  {
    r.m(a, paramBoolean);
  }
  
  public void b(int paramInt, double paramDouble1, double paramDouble2)
  {
    if (a.b(paramInt)) {
      return;
    }
    Object localObject = (n)r.q(a).get(paramInt);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Setting offset for unknown platform view with id: ");
    ((StringBuilder)localObject).append(paramInt);
    b.b("PlatformViewsController", ((StringBuilder)localObject).toString());
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    if (r.l(paramInt2))
    {
      if (a.b(paramInt1))
      {
        localObject = ((y)a.i.get(Integer.valueOf(paramInt1))).e();
        if (localObject == null) {
          localObject = new StringBuilder();
        }
      }
      for (String str = "Setting direction to a null view with id: ";; str = "Setting direction to an unknown view with id: ")
      {
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramInt1);
        b.b("PlatformViewsController", ((StringBuilder)localObject).toString());
        return;
        ((View)localObject).setLayoutDirection(paramInt2);
        return;
        a.a(r.t(a).get(paramInt1));
        localObject = new StringBuilder();
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Trying to set unknown direction value: ");
    ((StringBuilder)localObject).append(paramInt2);
    ((StringBuilder)localObject).append("(view id: ");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(")");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void d(q.f paramf)
  {
    int i = a;
    float f = ka).getResources().getDisplayMetrics().density;
    if (a.b(i))
    {
      ((y)a.i.get(Integer.valueOf(i))).b(a.h0(f, paramf, true));
      return;
    }
    a.a(r.t(a).get(i));
    paramf = new StringBuilder();
    paramf.append("Sending touch to an unknown view with id: ");
    paramf.append(i);
    b.b("PlatformViewsController", paramf.toString());
  }
  
  public long e(q.d paramd)
  {
    r.g(a, paramd);
    int i = a;
    if (r.q(a).get(i) == null)
    {
      if (r.r(a) != null)
      {
        if (r.s(a) == null)
        {
          paramd = new StringBuilder();
          paramd.append("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ");
          paramd.append(i);
          throw new IllegalStateException(paramd.toString());
        }
        a.C(paramd, true);
        throw null;
      }
      paramd = new StringBuilder();
      paramd.append("Texture registry is null. This means that platform views controller was detached, view id: ");
      paramd.append(i);
      throw new IllegalStateException(paramd.toString());
    }
    paramd = new StringBuilder();
    paramd.append("Trying to create an already created platform view, view id: ");
    paramd.append(i);
    throw new IllegalStateException(paramd.toString());
  }
  
  public void f(int paramInt)
  {
    StringBuilder localStringBuilder;
    if (a.b(paramInt))
    {
      localObject = ((y)a.i.get(Integer.valueOf(paramInt))).e();
      if (localObject == null) {
        localStringBuilder = new StringBuilder();
      }
    }
    for (Object localObject = "Clearing focus on a null view with id: ";; localObject = "Clearing focus on an unknown view with id: ")
    {
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(paramInt);
      b.b("PlatformViewsController", localStringBuilder.toString());
      return;
      ((View)localObject).clearFocus();
      return;
      a.a(r.t(a).get(paramInt));
      localStringBuilder = new StringBuilder();
    }
  }
  
  public void g(int paramInt)
  {
    a.a(r.t(a).get(paramInt));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Disposing unknown platform view with id: ");
    localStringBuilder.append(paramInt);
    b.b("PlatformViewsController", localStringBuilder.toString());
  }
  
  public void h(q.d paramd)
  {
    r.f(a, 19);
    r.g(a, paramd);
    a.C(paramd, false);
    r.p(a, null, paramd);
  }
  
  public void i(q.e parame, q.b paramb)
  {
    int i = r.h(a, b);
    int j = r.h(a, c);
    int k = a;
    if (a.b(k))
    {
      float f = r.i(a);
      parame = (y)a.i.get(Integer.valueOf(k));
      r.j(a, parame);
      parame.i(i, j, new q(this, parame, f, paramb));
      return;
    }
    a.a(r.t(a).get(k));
    parame = (n)r.q(a).get(k);
    parame = new StringBuilder();
    parame.append("Resizing unknown platform view with id: ");
    parame.append(k);
    b.b("PlatformViewsController", parame.toString());
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */