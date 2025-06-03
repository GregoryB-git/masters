package io.flutter.plugin.platform;

import D5.q.b;
import D5.q.d;
import D5.q.e;
import D5.q.f;
import D5.q.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.C;
import io.flutter.view.TextureRegistry;
import io.flutter.view.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u5.D;
import u5.N;
import u5.N.a;
import u5.c;

public class r
  implements o
{
  public static Class[] w = { SurfaceView.class };
  public static boolean x = true;
  public static boolean y = true;
  public final m a = new m();
  public c b;
  public Context c;
  public D d;
  public TextureRegistry e;
  public C f;
  public D5.q g;
  public final a h = new a();
  public final HashMap i = new HashMap();
  public final HashMap j = new HashMap();
  public final SparseArray k = new SparseArray();
  public final SparseArray l = new SparseArray();
  public final SparseArray m = new SparseArray();
  public final SparseArray n = new SparseArray();
  public int o = 0;
  public boolean p = false;
  public boolean q = true;
  public final HashSet r = new HashSet();
  public final HashSet s = new HashSet();
  public final N t = N.a();
  public boolean u = false;
  public final q.g v = new a();
  
  public static MotionEvent.PointerCoords a0(Object paramObject, float paramFloat)
  {
    List localList = (List)paramObject;
    paramObject = new MotionEvent.PointerCoords();
    orientation = ((float)((Double)localList.get(0)).doubleValue());
    pressure = ((float)((Double)localList.get(1)).doubleValue());
    size = ((float)((Double)localList.get(2)).doubleValue());
    double d1 = ((Double)localList.get(3)).doubleValue();
    double d2 = paramFloat;
    toolMajor = ((float)(d1 * d2));
    toolMinor = ((float)(((Double)localList.get(4)).doubleValue() * d2));
    touchMajor = ((float)(((Double)localList.get(5)).doubleValue() * d2));
    touchMinor = ((float)(((Double)localList.get(6)).doubleValue() * d2));
    x = ((float)(((Double)localList.get(7)).doubleValue() * d2));
    y = ((float)(((Double)localList.get(8)).doubleValue() * d2));
    return (MotionEvent.PointerCoords)paramObject;
  }
  
  public static List b0(Object paramObject, float paramFloat)
  {
    Object localObject = (List)paramObject;
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((List)paramObject).add(a0(((Iterator)localObject).next(), paramFloat));
    }
    return (List)paramObject;
  }
  
  public static MotionEvent.PointerProperties c0(Object paramObject)
  {
    paramObject = (List)paramObject;
    MotionEvent.PointerProperties localPointerProperties = new MotionEvent.PointerProperties();
    id = ((Integer)((List)paramObject).get(0)).intValue();
    toolType = ((Integer)((List)paramObject).get(1)).intValue();
    return localPointerProperties;
  }
  
  public static List d0(Object paramObject)
  {
    Object localObject = (List)paramObject;
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((List)paramObject).add(c0(((Iterator)localObject).next()));
    }
    return (List)paramObject;
  }
  
  public static void j0(MotionEvent paramMotionEvent, MotionEvent.PointerCoords[] paramArrayOfPointerCoords)
  {
    if (paramArrayOfPointerCoords.length < 1) {
      return;
    }
    paramMotionEvent.offsetLocation(0x - paramMotionEvent.getX(), 0y - paramMotionEvent.getY());
  }
  
  public static boolean l0(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 0) {
      if (paramInt == 1) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public FlutterOverlaySurface A()
  {
    return B(new b(d.getContext(), d.getWidth(), d.getHeight(), h));
  }
  
  public FlutterOverlaySurface B(b paramb)
  {
    int i1 = o;
    o = (i1 + 1);
    m.put(i1, paramb);
    return new FlutterOverlaySurface(i1, paramb.getSurface());
  }
  
  public j C(q.d paramd, boolean paramBoolean)
  {
    a.a(b);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Trying to create a platform view of unregistered type: ");
    localStringBuilder.append(b);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void D()
  {
    for (int i1 = 0; i1 < m.size(); i1++)
    {
      b localb = (b)m.valueAt(i1);
      localb.a();
      localb.f();
    }
  }
  
  public void E()
  {
    D5.q localq = g;
    if (localq != null) {
      localq.d(null);
    }
    D();
    g = null;
    c = null;
    e = null;
  }
  
  public void F()
  {
    Object localObject;
    for (int i1 = 0; i1 < n.size(); i1++)
    {
      localObject = (n)n.valueAt(i1);
      d.removeView((View)localObject);
    }
    for (i1 = 0; i1 < l.size(); i1++)
    {
      localObject = (z5.a)l.valueAt(i1);
      d.removeView((View)localObject);
    }
    D();
    e0();
    d = null;
    p = false;
    if (k.size() <= 0) {
      return;
    }
    android.support.v4.media.a.a(k.valueAt(0));
    throw null;
  }
  
  public void G()
  {
    f = null;
  }
  
  public final void H()
  {
    while (k.size() > 0)
    {
      int i1 = k.keyAt(0);
      v.g(i1);
    }
  }
  
  public final void I(int paramInt)
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= paramInt) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Trying to use platform views with API ");
    localStringBuilder.append(i1);
    localStringBuilder.append(", required API level is: ");
    localStringBuilder.append(paramInt);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final void J(q.d paramd)
  {
    if (l0(g)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Trying to create a view with unknown direction value: ");
    localStringBuilder.append(g);
    localStringBuilder.append("(view id: ");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final void K(boolean paramBoolean)
  {
    int i2;
    Object localObject;
    for (int i1 = 0; i1 < m.size(); i1++)
    {
      i2 = m.keyAt(i1);
      localObject = (b)m.valueAt(i1);
      if (r.contains(Integer.valueOf(i2)))
      {
        d.m((u5.r)localObject);
        paramBoolean &= ((u5.r)localObject).d();
      }
      else
      {
        if (!p) {
          ((u5.r)localObject).a();
        }
        ((View)localObject).setVisibility(8);
        d.removeView((View)localObject);
      }
    }
    for (i1 = 0; i1 < l.size(); i1++)
    {
      i2 = l.keyAt(i1);
      localObject = (View)l.get(i2);
      if ((s.contains(Integer.valueOf(i2))) && ((paramBoolean) || (!q))) {
        ((View)localObject).setVisibility(0);
      } else {
        ((View)localObject).setVisibility(8);
      }
    }
  }
  
  public final float L()
  {
    return c.getResources().getDisplayMetrics().density;
  }
  
  public l M()
  {
    return a;
  }
  
  public void N(int paramInt)
  {
    android.support.v4.media.a.a(k.get(paramInt));
    throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
  }
  
  public final void O()
  {
    if ((q) && (!p))
    {
      d.p();
      p = true;
    }
  }
  
  public final void Q(y paramy)
  {
    C localC = f;
    if (localC == null) {
      return;
    }
    localC.s();
    paramy.f();
  }
  
  public void R() {}
  
  public void S()
  {
    r.clear();
    s.clear();
  }
  
  public void T()
  {
    H();
  }
  
  public void U(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (m.get(paramInt1) != null)
    {
      O();
      localObject = (b)m.get(paramInt1);
      if (((View)localObject).getParent() == null) {
        d.addView((View)localObject);
      }
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt4, paramInt5);
      leftMargin = paramInt2;
      topMargin = paramInt3;
      ((View)localObject).setLayoutParams(localLayoutParams);
      ((View)localObject).setVisibility(0);
      ((View)localObject).bringToFront();
      r.add(Integer.valueOf(paramInt1));
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("The overlay surface (id:");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(") doesn't exist");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void V(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, FlutterMutatorsStack paramFlutterMutatorsStack)
  {
    O();
    N(paramInt1);
    z5.a locala = (z5.a)l.get(paramInt1);
    locala.a(paramFlutterMutatorsStack, paramInt2, paramInt3, paramInt4, paramInt5);
    locala.setVisibility(0);
    locala.bringToFront();
    new FrameLayout.LayoutParams(paramInt6, paramInt7);
    android.support.v4.media.a.a(k.get(paramInt1));
    throw null;
  }
  
  public void W()
  {
    boolean bool1 = p;
    boolean bool2 = false;
    if ((bool1) && (s.isEmpty()))
    {
      p = false;
      d.A(new p(this));
      return;
    }
    bool1 = bool2;
    if (p)
    {
      bool1 = bool2;
      if (d.k()) {
        bool1 = true;
      }
    }
    K(bool1);
  }
  
  public void X()
  {
    H();
  }
  
  public void Y()
  {
    Iterator localIterator = i.values().iterator();
    while (localIterator.hasNext()) {
      ((y)localIterator.next()).h();
    }
  }
  
  public void Z(int paramInt)
  {
    if (paramInt < 40) {
      return;
    }
    Iterator localIterator = i.values().iterator();
    while (localIterator.hasNext()) {
      ((y)localIterator.next()).a();
    }
  }
  
  public void a(i parami)
  {
    h.b(parami);
  }
  
  public boolean b(int paramInt)
  {
    return i.containsKey(Integer.valueOf(paramInt));
  }
  
  public View c(int paramInt)
  {
    if (b(paramInt)) {
      return ((y)i.get(Integer.valueOf(paramInt))).e();
    }
    android.support.v4.media.a.a(k.get(paramInt));
    return null;
  }
  
  public void d()
  {
    h.b(null);
  }
  
  public final void e0()
  {
    if (d == null)
    {
      t5.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
      return;
    }
    for (int i1 = 0; i1 < m.size(); i1++) {
      d.removeView((View)m.valueAt(i1));
    }
    m.clear();
  }
  
  public void f0(boolean paramBoolean)
  {
    u = paramBoolean;
  }
  
  public final int g0(double paramDouble, float paramFloat)
  {
    return (int)Math.round(paramDouble / paramFloat);
  }
  
  public MotionEvent h0(float paramFloat, q.f paramf, boolean paramBoolean)
  {
    Object localObject1 = N.a.c(p);
    Object localObject2 = t.b((N.a)localObject1);
    localObject1 = (MotionEvent.PointerCoords[])b0(g, paramFloat).toArray(new MotionEvent.PointerCoords[e]);
    if ((!paramBoolean) && (localObject2 != null))
    {
      j0((MotionEvent)localObject2, (MotionEvent.PointerCoords[])localObject1);
      return (MotionEvent)localObject2;
    }
    localObject2 = (MotionEvent.PointerProperties[])d0(f).toArray(new MotionEvent.PointerProperties[e]);
    return MotionEvent.obtain(b.longValue(), c.longValue(), d, e, (MotionEvent.PointerProperties[])localObject2, (MotionEvent.PointerCoords[])localObject1, h, i, j, k, l, m, n, o);
  }
  
  public final int i0(double paramDouble)
  {
    return (int)Math.round(paramDouble * L());
  }
  
  public final void k0(y paramy)
  {
    C localC = f;
    if (localC == null) {
      return;
    }
    localC.E();
    paramy.g();
  }
  
  public void u(Context paramContext, TextureRegistry paramTextureRegistry, w5.a parama)
  {
    if (c == null)
    {
      c = paramContext;
      e = paramTextureRegistry;
      paramContext = new D5.q(parama);
      g = paramContext;
      paramContext.d(v);
      return;
    }
    throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
  }
  
  public void v(C paramC)
  {
    f = paramC;
  }
  
  public void w(FlutterRenderer paramFlutterRenderer)
  {
    b = new c(paramFlutterRenderer, true);
  }
  
  public void x(D paramD)
  {
    d = paramD;
    for (int i1 = 0; i1 < n.size(); i1++)
    {
      paramD = (n)n.valueAt(i1);
      d.addView(paramD);
    }
    for (i1 = 0; i1 < l.size(); i1++)
    {
      paramD = (z5.a)l.valueAt(i1);
      d.addView(paramD);
    }
    if (k.size() <= 0) {
      return;
    }
    android.support.v4.media.a.a(k.valueAt(0));
    throw null;
  }
  
  public boolean y(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    if (!j.containsKey(paramView.getContext())) {
      return false;
    }
    View localView = (View)j.get(paramView.getContext());
    if (localView == paramView) {
      return true;
    }
    return localView.checkInputConnectionProxy(paramView);
  }
  
  public final void z(j paramj, q.d paramd)
  {
    I(19);
    paramj = new StringBuilder();
    paramj.append("Using hybrid composition for platform view: ");
    paramj.append(a);
    t5.b.e("PlatformViewsController", paramj.toString());
  }
  
  public class a
    implements q.g
  {
    public a() {}
    
    public void a(boolean paramBoolean)
    {
      r.m(r.this, paramBoolean);
    }
    
    public void b(int paramInt, double paramDouble1, double paramDouble2)
    {
      if (b(paramInt)) {
        return;
      }
      Object localObject = (n)r.q(r.this).get(paramInt);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Setting offset for unknown platform view with id: ");
      ((StringBuilder)localObject).append(paramInt);
      t5.b.b("PlatformViewsController", ((StringBuilder)localObject).toString());
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      if (r.l(paramInt2))
      {
        if (b(paramInt1))
        {
          localObject = ((y)i.get(Integer.valueOf(paramInt1))).e();
          if (localObject == null) {
            localObject = new StringBuilder();
          }
        }
        for (String str = "Setting direction to a null view with id: ";; str = "Setting direction to an unknown view with id: ")
        {
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(paramInt1);
          t5.b.b("PlatformViewsController", ((StringBuilder)localObject).toString());
          return;
          ((View)localObject).setLayoutDirection(paramInt2);
          return;
          android.support.v4.media.a.a(r.t(r.this).get(paramInt1));
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
      float f = kgetResourcesgetDisplayMetricsdensity;
      if (b(i))
      {
        ((y)r.this.i.get(Integer.valueOf(i))).b(h0(f, paramf, true));
        return;
      }
      android.support.v4.media.a.a(r.t(r.this).get(i));
      paramf = new StringBuilder();
      paramf.append("Sending touch to an unknown view with id: ");
      paramf.append(i);
      t5.b.b("PlatformViewsController", paramf.toString());
    }
    
    public long e(q.d paramd)
    {
      r.g(r.this, paramd);
      int i = a;
      if (r.q(r.this).get(i) == null)
      {
        if (r.r(r.this) != null)
        {
          if (r.s(r.this) == null)
          {
            paramd = new StringBuilder();
            paramd.append("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ");
            paramd.append(i);
            throw new IllegalStateException(paramd.toString());
          }
          C(paramd, true);
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
      if (b(paramInt))
      {
        localObject = ((y)i.get(Integer.valueOf(paramInt))).e();
        if (localObject == null) {
          localStringBuilder = new StringBuilder();
        }
      }
      for (Object localObject = "Clearing focus on a null view with id: ";; localObject = "Clearing focus on an unknown view with id: ")
      {
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(paramInt);
        t5.b.b("PlatformViewsController", localStringBuilder.toString());
        return;
        ((View)localObject).clearFocus();
        return;
        android.support.v4.media.a.a(r.t(r.this).get(paramInt));
        localStringBuilder = new StringBuilder();
      }
    }
    
    public void g(int paramInt)
    {
      android.support.v4.media.a.a(r.t(r.this).get(paramInt));
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Disposing unknown platform view with id: ");
      localStringBuilder.append(paramInt);
      t5.b.b("PlatformViewsController", localStringBuilder.toString());
    }
    
    public void h(q.d paramd)
    {
      r.f(r.this, 19);
      r.g(r.this, paramd);
      C(paramd, false);
      r.p(r.this, null, paramd);
    }
    
    public void i(q.e parame, q.b paramb)
    {
      int i = r.h(r.this, b);
      int j = r.h(r.this, c);
      int k = a;
      if (b(k))
      {
        float f = r.i(r.this);
        parame = (y)r.this.i.get(Integer.valueOf(k));
        r.j(r.this, parame);
        parame.i(i, j, new q(this, parame, f, paramb));
        return;
      }
      android.support.v4.media.a.a(r.t(r.this).get(k));
      parame = (n)r.q(r.this).get(k);
      parame = new StringBuilder();
      parame.append("Resizing unknown platform view with id: ");
      parame.append(k);
      t5.b.b("PlatformViewsController", parame.toString());
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */