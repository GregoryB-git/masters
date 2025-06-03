package u5;

import A.d;
import D5.t.b;
import D5.t.c;
import G5.b.c;
import I.G;
import I.M;
import I.O;
import I.P;
import I.S;
import I.T;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.FoldingFeature.OcclusionType;
import androidx.window.layout.FoldingFeature.State;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTracker.Companion;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.f;
import androidx.window.layout.h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterRenderer.b;
import io.flutter.embedding.engine.renderer.FlutterRenderer.c;
import io.flutter.embedding.engine.renderer.FlutterRenderer.d;
import io.flutter.embedding.engine.renderer.FlutterRenderer.f;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.editing.n;
import io.flutter.view.i;
import io.flutter.view.i.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class D
  extends FrameLayout
  implements b.c, L.e
{
  public F5.e A;
  public L B;
  public c C;
  public i D;
  public TextServicesManager E;
  public Q F;
  public final FlutterRenderer.f G = new FlutterRenderer.f();
  public final i.k H = new a();
  public final ContentObserver I = new b(new Handler(Looper.getMainLooper()));
  public final j J = new c();
  public final H.a K = new d();
  public s o;
  public t p;
  public r q;
  public k r;
  public k s;
  public final Set t = new HashSet();
  public boolean u;
  public io.flutter.embedding.engine.a v;
  public final Set w = new HashSet();
  public G5.b x;
  public io.flutter.plugin.editing.C y;
  public n z;
  
  public D(Context paramContext, AttributeSet paramAttributeSet, s params)
  {
    super(paramContext, paramAttributeSet);
    o = params;
    r = params;
    u();
  }
  
  public D(Context paramContext, AttributeSet paramAttributeSet, t paramt)
  {
    super(paramContext, paramAttributeSet);
    p = paramt;
    r = paramt;
    u();
  }
  
  public D(Context paramContext, s params)
  {
    this(paramContext, null, params);
  }
  
  public D(Context paramContext, t paramt)
  {
    this(paramContext, null, paramt);
  }
  
  public void A(final Runnable paramRunnable)
  {
    if (q == null)
    {
      t5.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
      return;
    }
    final Object localObject = s;
    if (localObject == null)
    {
      t5.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
      return;
    }
    r = ((k)localObject);
    s = null;
    localObject = v.t();
    if ((v != null) && (localObject != null))
    {
      r.b();
      ((FlutterRenderer)localObject).f(new e((FlutterRenderer)localObject, paramRunnable));
      return;
    }
    q.a();
    x();
    paramRunnable.run();
  }
  
  public void B()
  {
    t.c localc;
    if ((getResourcesgetConfigurationuiMode & 0x30) == 32) {
      localc = t.c.q;
    } else {
      localc = t.c.p;
    }
    Object localObject = E;
    boolean bool1 = false;
    if (localObject != null) {
      if (Build.VERSION.SDK_INT >= 31)
      {
        bool2 = x.a(w.a(v.a((TextServicesManager)localObject)), new C());
        if ((!y.a(E)) || (!bool2)) {}
      }
      else
      {
        bool2 = true;
        break label91;
      }
    }
    boolean bool2 = false;
    label91:
    localObject = v.v().d().f(getResourcesgetConfigurationfontScale).c(getResources().getDisplayMetrics()).d(bool2);
    bool2 = bool1;
    if (Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1) {
      bool2 = true;
    }
    ((t.b)localObject).b(bool2).g(DateFormat.is24HourFormat(getContext())).e(localc).a();
  }
  
  public final void C()
  {
    if (!v())
    {
      t5.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
      return;
    }
    G.a = getResourcesgetDisplayMetricsdensity;
    G.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    v.t().n(G);
  }
  
  public void a(KeyEvent paramKeyEvent)
  {
    getRootView().dispatchKeyEvent(paramKeyEvent);
  }
  
  public void autofill(SparseArray paramSparseArray)
  {
    y.j(paramSparseArray);
  }
  
  public PointerIcon b(int paramInt)
  {
    return B.a(getContext(), paramInt);
  }
  
  public boolean c(KeyEvent paramKeyEvent)
  {
    return y.p(paramKeyEvent);
  }
  
  public boolean checkInputConnectionProxy(View paramView)
  {
    io.flutter.embedding.engine.a locala = v;
    boolean bool;
    if (locala != null) {
      bool = locala.q().y(paramView);
    } else {
      bool = super.checkInputConnectionProxy(paramView);
    }
    return bool;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    boolean bool1 = true;
    if ((i == 0) && (paramKeyEvent.getRepeatCount() == 0)) {
      getKeyDispatcherState().startTracking(paramKeyEvent, this);
    } else if (paramKeyEvent.getAction() == 1) {
      getKeyDispatcherState().handleUpEvent(paramKeyEvent);
    }
    boolean bool2;
    if (v())
    {
      bool2 = bool1;
      if (B.b(paramKeyEvent)) {}
    }
    else if (super.dispatchKeyEvent(paramKeyEvent))
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public AccessibilityNodeProvider getAccessibilityNodeProvider()
  {
    i locali = D;
    if ((locali != null) && (locali.B())) {
      return D;
    }
    return null;
  }
  
  public io.flutter.embedding.engine.a getAttachedFlutterEngine()
  {
    return v;
  }
  
  public E5.c getBinaryMessenger()
  {
    return v.k();
  }
  
  public r getCurrentImageSurface()
  {
    return q;
  }
  
  public boolean k()
  {
    r localr = q;
    if (localr != null) {
      return localr.d();
    }
    return false;
  }
  
  public void l(j paramj)
  {
    t.add(paramj);
  }
  
  public void m(r paramr)
  {
    io.flutter.embedding.engine.a locala = v;
    if (locala != null) {
      paramr.c(locala.t());
    }
  }
  
  public void n(io.flutter.embedding.engine.a parama)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Attaching to a FlutterEngine: ");
    ((StringBuilder)localObject).append(parama);
    t5.b.f("FlutterView", ((StringBuilder)localObject).toString());
    if (v())
    {
      if (parama == v)
      {
        t5.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
        return;
      }
      t5.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
      s();
    }
    v = parama;
    localObject = parama.t();
    u = ((FlutterRenderer)localObject).h();
    r.c((FlutterRenderer)localObject);
    ((FlutterRenderer)localObject).f(J);
    if (Build.VERSION.SDK_INT >= 24) {
      x = new G5.b(this, v.n());
    }
    y = new io.flutter.plugin.editing.C(this, v.y(), v.q());
    try
    {
      localObject = (TextServicesManager)getContext().getSystemService("textservices");
      E = ((TextServicesManager)localObject);
      n localn = new io/flutter/plugin/editing/n;
      localn.<init>((TextServicesManager)localObject, v.w());
      z = localn;
    }
    catch (Exception localException)
    {
      t5.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
    }
    A = v.m();
    B = new L(this);
    C = new c(v.t(), false);
    i locali = new i(this, parama.h(), (AccessibilityManager)getContext().getSystemService("accessibility"), getContext().getContentResolver(), v.q());
    D = locali;
    locali.Z(H);
    z(D.B(), D.D());
    v.q().a(D);
    v.q().w(v.t());
    y.o().restartInput(this);
    B();
    getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, I);
    C();
    parama.q().x(this);
    parama = w.iterator();
    if (!parama.hasNext())
    {
      if (u) {
        J.e();
      }
      return;
    }
    android.support.v4.media.a.a(parama.next());
    throw null;
  }
  
  public final f o()
  {
    Context localContext = getContext();
    int i = getResourcesgetConfigurationorientation;
    int j = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getRotation();
    if (i == 2)
    {
      if (j == 1) {
        return f.q;
      }
      if (j == 3) {
        return f.p;
      }
      if ((j == 0) || (j == 2)) {
        return f.r;
      }
    }
    return f.o;
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    WindowInsets localWindowInsets = super.onApplyWindowInsets(paramWindowInsets);
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i == 29)
    {
      localObject = I.L.a(paramWindowInsets);
      G.l = A.c.a((Insets)localObject);
      G.m = d.a((Insets)localObject);
      G.n = A.e.a((Insets)localObject);
      G.o = A.b.a((Insets)localObject);
    }
    int j = getWindowSystemUiVisibility();
    int k = 1;
    int m = 0;
    if ((j & 0x4) == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((getWindowSystemUiVisibility() & 0x2) != 0) {
      k = 0;
    }
    FlutterRenderer.f localf;
    if (i >= 30)
    {
      if (k != 0) {
        m = P.a();
      }
      k = m;
      if (j != 0) {
        k = m | O.a();
      }
      localObject = M.a(paramWindowInsets, k);
      G.d = A.c.a((Insets)localObject);
      G.e = d.a((Insets)localObject);
      G.f = A.e.a((Insets)localObject);
      G.g = A.b.a((Insets)localObject);
      localObject = M.a(paramWindowInsets, S.a());
      G.h = A.c.a((Insets)localObject);
      G.i = d.a((Insets)localObject);
      G.j = A.e.a((Insets)localObject);
      G.k = A.b.a((Insets)localObject);
      localObject = M.a(paramWindowInsets, T.a());
      G.l = A.c.a((Insets)localObject);
      G.m = d.a((Insets)localObject);
      G.n = A.e.a((Insets)localObject);
      G.o = A.b.a((Insets)localObject);
      paramWindowInsets = G.a(paramWindowInsets);
      if (paramWindowInsets != null)
      {
        localObject = u.a(paramWindowInsets);
        localf = G;
        d = Math.max(Math.max(d, A.c.a((Insets)localObject)), h.a(paramWindowInsets));
        localf = G;
        e = Math.max(Math.max(e, d.a((Insets)localObject)), androidx.window.layout.e.a(paramWindowInsets));
        localf = G;
        f = Math.max(Math.max(f, A.e.a((Insets)localObject)), f.a(paramWindowInsets));
        localf = G;
        g = Math.max(Math.max(g, A.b.a((Insets)localObject)), androidx.window.layout.g.a(paramWindowInsets));
      }
    }
    else
    {
      localObject = f.o;
      if (k == 0) {
        localObject = o();
      }
      localf = G;
      if (j != 0) {
        m = paramWindowInsets.getSystemWindowInsetTop();
      } else {
        m = 0;
      }
      d = m;
      localf = G;
      if ((localObject != f.q) && (localObject != f.r)) {
        m = paramWindowInsets.getSystemWindowInsetRight();
      } else {
        m = 0;
      }
      e = m;
      localf = G;
      if ((k != 0) && (t(paramWindowInsets) == 0)) {
        m = paramWindowInsets.getSystemWindowInsetBottom();
      } else {
        m = 0;
      }
      f = m;
      localf = G;
      if ((localObject != f.p) && (localObject != f.r)) {
        m = paramWindowInsets.getSystemWindowInsetLeft();
      } else {
        m = 0;
      }
      g = m;
      localObject = G;
      h = 0;
      i = 0;
      j = t(paramWindowInsets);
      G.k = 0;
    }
    paramWindowInsets = new StringBuilder();
    paramWindowInsets.append("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
    paramWindowInsets.append(G.d);
    paramWindowInsets.append(", Left: ");
    paramWindowInsets.append(G.g);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(G.e);
    paramWindowInsets.append("\nKeyboard insets: Bottom: ");
    paramWindowInsets.append(G.j);
    paramWindowInsets.append(", Left: ");
    paramWindowInsets.append(G.k);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(G.i);
    paramWindowInsets.append("System Gesture Insets - Left: ");
    paramWindowInsets.append(G.o);
    paramWindowInsets.append(", Top: ");
    paramWindowInsets.append(G.l);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(G.m);
    paramWindowInsets.append(", Bottom: ");
    paramWindowInsets.append(G.j);
    t5.b.f("FlutterView", paramWindowInsets.toString());
    C();
    return localWindowInsets;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    F = r();
    Activity localActivity = T5.g.b(getContext());
    Q localQ = F;
    if ((localQ != null) && (localActivity != null)) {
      localQ.a(localActivity, x.a.e(getContext()), K);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (v != null)
    {
      t5.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
      A.d(paramConfiguration);
      B();
      T5.g.a(getContext(), v);
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    if (!v()) {
      return super.onCreateInputConnection(paramEditorInfo);
    }
    return y.m(this, B, paramEditorInfo);
  }
  
  public void onDetachedFromWindow()
  {
    Q localQ = F;
    if (localQ != null) {
      localQ.b(K);
    }
    F = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((v()) && (C.j(paramMotionEvent, getContext()))) {
      bool = true;
    } else {
      bool = super.onGenericMotionEvent(paramMotionEvent);
    }
    return bool;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (!v()) {
      return super.onHoverEvent(paramMotionEvent);
    }
    return D.K(paramMotionEvent);
  }
  
  public void onProvideAutofillVirtualStructure(ViewStructure paramViewStructure, int paramInt)
  {
    super.onProvideAutofillVirtualStructure(paramViewStructure, paramInt);
    y.x(paramViewStructure, paramInt);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
    ((StringBuilder)localObject).append(paramInt3);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(paramInt4);
    ((StringBuilder)localObject).append(", it is now ");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(paramInt2);
    t5.b.f("FlutterView", ((StringBuilder)localObject).toString());
    localObject = G;
    b = paramInt1;
    c = paramInt2;
    C();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!v()) {
      return super.onTouchEvent(paramMotionEvent);
    }
    requestUnbufferedDispatch(paramMotionEvent);
    return C.k(paramMotionEvent);
  }
  
  public void p()
  {
    r.j();
    Object localObject = q;
    if (localObject == null)
    {
      localObject = q();
      q = ((r)localObject);
      addView((View)localObject);
    }
    else
    {
      ((r)localObject).k(getWidth(), getHeight());
    }
    s = r;
    r localr = q;
    r = localr;
    localObject = v;
    if (localObject != null) {
      localr.c(((io.flutter.embedding.engine.a)localObject).t());
    }
  }
  
  public r q()
  {
    return new r(getContext(), getWidth(), getHeight(), r.b.o);
  }
  
  public Q r()
  {
    try
    {
      Object localObject = new androidx/window/java/layout/WindowInfoTrackerCallbackAdapter;
      ((WindowInfoTrackerCallbackAdapter)localObject).<init>(WindowInfoTracker.Companion.getOrCreate(getContext()));
      localObject = new Q((WindowInfoTrackerCallbackAdapter)localObject);
      return (Q)localObject;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError) {}
    return null;
  }
  
  public void s()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Detaching from a FlutterEngine: ");
    ((StringBuilder)localObject).append(v);
    t5.b.f("FlutterView", ((StringBuilder)localObject).toString());
    if (!v())
    {
      t5.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
      return;
    }
    localObject = w.iterator();
    if (!((Iterator)localObject).hasNext())
    {
      getContext().getContentResolver().unregisterContentObserver(I);
      v.q().F();
      v.q().d();
      D.R();
      D = null;
      y.o().restartInput(this);
      y.n();
      B.d();
      localObject = z;
      if (localObject != null) {
        ((n)localObject).b();
      }
      localObject = x;
      if (localObject != null) {
        ((G5.b)localObject).c();
      }
      localObject = v.t();
      u = false;
      ((FlutterRenderer)localObject).k(J);
      ((FlutterRenderer)localObject).p();
      ((FlutterRenderer)localObject).m(false);
      localObject = s;
      if ((localObject != null) && (r == q)) {
        r = ((k)localObject);
      }
      r.a();
      x();
      s = null;
      v = null;
      return;
    }
    android.support.v4.media.a.a(((Iterator)localObject).next());
    throw null;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    k localk = r;
    if ((localk instanceof s)) {
      ((s)localk).setVisibility(paramInt);
    }
  }
  
  @TargetApi(28)
  public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo paramWindowLayoutInfo)
  {
    paramWindowLayoutInfo = paramWindowLayoutInfo.getDisplayFeatures();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramWindowLayoutInfo.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      DisplayFeature localDisplayFeature = (DisplayFeature)((Iterator)localObject1).next();
      paramWindowLayoutInfo = new StringBuilder();
      paramWindowLayoutInfo.append("WindowInfoTracker Display Feature reported with bounds = ");
      paramWindowLayoutInfo.append(localDisplayFeature.getBounds().toString());
      paramWindowLayoutInfo.append(" and type = ");
      paramWindowLayoutInfo.append(localDisplayFeature.getClass().getSimpleName());
      t5.b.f("FlutterView", paramWindowLayoutInfo.toString());
      if ((localDisplayFeature instanceof FoldingFeature))
      {
        paramWindowLayoutInfo = (FoldingFeature)localDisplayFeature;
        if (paramWindowLayoutInfo.getOcclusionType() == FoldingFeature.OcclusionType.FULL) {
          localObject2 = FlutterRenderer.d.r;
        } else {
          localObject2 = FlutterRenderer.d.q;
        }
        if (paramWindowLayoutInfo.getState() == FoldingFeature.State.FLAT) {
          paramWindowLayoutInfo = FlutterRenderer.c.q;
        } else if (paramWindowLayoutInfo.getState() == FoldingFeature.State.HALF_OPENED) {
          paramWindowLayoutInfo = FlutterRenderer.c.r;
        } else {
          paramWindowLayoutInfo = FlutterRenderer.c.p;
        }
        localArrayList.add(new FlutterRenderer.b(localDisplayFeature.getBounds(), (FlutterRenderer.d)localObject2, paramWindowLayoutInfo));
      }
      else
      {
        localArrayList.add(new FlutterRenderer.b(localDisplayFeature.getBounds(), FlutterRenderer.d.p, FlutterRenderer.c.p));
      }
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramWindowLayoutInfo = getRootWindowInsets();
      if (paramWindowLayoutInfo != null)
      {
        paramWindowLayoutInfo = G.a(paramWindowLayoutInfo);
        if (paramWindowLayoutInfo != null)
        {
          localObject2 = A.a(paramWindowLayoutInfo).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (Rect)((Iterator)localObject2).next();
            paramWindowLayoutInfo = new StringBuilder();
            paramWindowLayoutInfo.append("DisplayCutout area reported with bounds = ");
            paramWindowLayoutInfo.append(((Rect)localObject1).toString());
            t5.b.f("FlutterView", paramWindowLayoutInfo.toString());
            localArrayList.add(new FlutterRenderer.b((Rect)localObject1, FlutterRenderer.d.s));
          }
        }
      }
    }
    G.q = localArrayList;
    C();
  }
  
  public final int t(WindowInsets paramWindowInsets)
  {
    int i = getRootView().getHeight();
    if (paramWindowInsets.getSystemWindowInsetBottom() < i * 0.18D) {
      return 0;
    }
    return paramWindowInsets.getSystemWindowInsetBottom();
  }
  
  public final void u()
  {
    t5.b.f("FlutterView", "Initializing FlutterView");
    Object localObject;
    if (o != null)
    {
      t5.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
      localObject = o;
    }
    for (;;)
    {
      addView((View)localObject);
      break;
      if (p != null)
      {
        t5.b.f("FlutterView", "Internally using a FlutterTextureView.");
        localObject = p;
      }
      else
      {
        t5.b.f("FlutterView", "Internally using a FlutterImageView.");
        localObject = q;
      }
    }
    setFocusable(true);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 26) {
      z.a(this, 1);
    }
  }
  
  public boolean v()
  {
    io.flutter.embedding.engine.a locala = v;
    boolean bool;
    if ((locala != null) && (locala.t() == r.getAttachedRenderer())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void x()
  {
    r localr = q;
    if (localr != null)
    {
      localr.f();
      removeView(q);
      q = null;
    }
  }
  
  public void y(j paramj)
  {
    t.remove(paramj);
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = v.t().i();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool3 = bool2;
      if (!paramBoolean1)
      {
        bool3 = bool2;
        if (!paramBoolean2) {
          bool3 = true;
        }
      }
    }
    setWillNotDraw(bool3);
  }
  
  public class a
    implements i.k
  {
    public a() {}
    
    public void a(boolean paramBoolean1, boolean paramBoolean2)
    {
      D.e(D.this, paramBoolean1, paramBoolean2);
    }
  }
  
  public class b
    extends ContentObserver
  {
    public b(Handler paramHandler)
    {
      super();
    }
    
    public boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public void onChange(boolean paramBoolean)
    {
      super.onChange(paramBoolean);
      if (D.f(D.this) == null) {
        return;
      }
      t5.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
      B();
    }
  }
  
  public class c
    implements j
  {
    public c() {}
    
    public void b()
    {
      D.g(D.this, false);
      Iterator localIterator = D.h(D.this).iterator();
      while (localIterator.hasNext()) {
        ((j)localIterator.next()).b();
      }
    }
    
    public void e()
    {
      D.g(D.this, true);
      Iterator localIterator = D.h(D.this).iterator();
      while (localIterator.hasNext()) {
        ((j)localIterator.next()).e();
      }
    }
  }
  
  public class d
    implements H.a
  {
    public d() {}
    
    public void a(WindowLayoutInfo paramWindowLayoutInfo)
    {
      setWindowInfoListenerDisplayFeatures(paramWindowLayoutInfo);
    }
  }
  
  public class e
    implements j
  {
    public e(FlutterRenderer paramFlutterRenderer, Runnable paramRunnable) {}
    
    public void b() {}
    
    public void e()
    {
      localObject.k(this);
      paramRunnable.run();
      D localD = D.this;
      if ((!(r instanceof r)) && (D.i(localD) != null))
      {
        D.i(D.this).a();
        D.j(D.this);
      }
    }
  }
  
  public static enum f {}
}

/* Location:
 * Qualified Name:     u5.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */