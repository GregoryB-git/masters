package io.flutter.view;

import D5.a.b;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Global;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan.Builder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import io.flutter.plugin.platform.o;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class i
  extends AccessibilityNodeProvider
{
  public static final int A = po | qo | ro | to | uo | vo | wo | xo | Fo | Go | Ko | Mo;
  public static int B = 267386881;
  public static int C = Eo & Fo & xo;
  public static final int z = so | ro | to | uo;
  public final View a;
  public final D5.a b;
  public final AccessibilityManager c;
  public final AccessibilityViewEmbedder d;
  public final o e;
  public final ContentResolver f;
  public final Map g = new HashMap();
  public final Map h = new HashMap();
  public l i;
  public Integer j;
  public Integer k;
  public int l = 0;
  public l m;
  public l n;
  public l o;
  public final List p = new ArrayList();
  public int q = 0;
  public Integer r = Integer.valueOf(0);
  public k s;
  public boolean t = false;
  public boolean u = false;
  public final a.b v = new a();
  public final AccessibilityManager.AccessibilityStateChangeListener w;
  public final AccessibilityManager.TouchExplorationStateChangeListener x;
  public final ContentObserver y;
  
  public i(View paramView, D5.a parama, AccessibilityManager paramAccessibilityManager, ContentResolver paramContentResolver, o paramo)
  {
    this(paramView, parama, paramAccessibilityManager, paramContentResolver, new AccessibilityViewEmbedder(paramView, 65536), paramo);
  }
  
  public i(View paramView, D5.a parama, final AccessibilityManager paramAccessibilityManager, ContentResolver paramContentResolver, AccessibilityViewEmbedder paramAccessibilityViewEmbedder, o paramo)
  {
    b localb = new b();
    w = localb;
    c localc = new c(new Handler());
    y = localc;
    a = paramView;
    b = parama;
    c = paramAccessibilityManager;
    f = paramContentResolver;
    d = paramAccessibilityViewEmbedder;
    e = paramo;
    localb.onAccessibilityStateChanged(paramAccessibilityManager.isEnabled());
    paramAccessibilityManager.addAccessibilityStateChangeListener(localb);
    paramView = new d(paramAccessibilityManager);
    x = paramView;
    paramView.onTouchExplorationStateChanged(paramAccessibilityManager.isTouchExplorationEnabled());
    paramAccessibilityManager.addTouchExplorationStateChangeListener(paramView);
    localc.onChange(false);
    paramContentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, localc);
    if (Build.VERSION.SDK_INT >= 31) {
      Y();
    }
    paramo.a(this);
  }
  
  public final void A(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (g.isEmpty()) {
      return;
    }
    l locall1 = l.L(z(), new float[] { paramFloat1, paramFloat2, 0.0F, 1.0F }, paramBoolean);
    if (locall1 != o)
    {
      if (locall1 != null) {
        S(l.a(locall1), 128);
      }
      l locall2 = o;
      if (locall2 != null) {
        S(l.a(locall2), 256);
      }
      o = locall1;
    }
  }
  
  public boolean B()
  {
    return c.isEnabled();
  }
  
  public final boolean C(l paraml)
  {
    boolean bool1 = l.i(paraml, i.A);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (l.B(paraml) != null) {
      return true;
    }
    if ((l.F(paraml) & C) != 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public boolean D()
  {
    return c.isTouchExplorationEnabled();
  }
  
  public AccessibilityEvent G(int paramInt)
  {
    return AccessibilityEvent.obtain(paramInt);
  }
  
  public final AccessibilityEvent H(int paramInt1, int paramInt2)
  {
    AccessibilityEvent localAccessibilityEvent = G(paramInt2);
    localAccessibilityEvent.setPackageName(a.getContext().getPackageName());
    localAccessibilityEvent.setSource(a, paramInt1);
    return localAccessibilityEvent;
  }
  
  public AccessibilityNodeInfo I(View paramView)
  {
    return AccessibilityNodeInfo.obtain(paramView);
  }
  
  public AccessibilityNodeInfo J(View paramView, int paramInt)
  {
    return AccessibilityNodeInfo.obtain(paramView, paramInt);
  }
  
  public boolean K(MotionEvent paramMotionEvent)
  {
    return L(paramMotionEvent, false);
  }
  
  public boolean L(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    if (!c.isTouchExplorationEnabled()) {
      return false;
    }
    if (g.isEmpty()) {
      return false;
    }
    Object localObject = l.L(z(), new float[] { paramMotionEvent.getX(), paramMotionEvent.getY(), 0.0F, 1.0F }, paramBoolean);
    if ((localObject != null) && (l.e((l)localObject) != -1))
    {
      if (paramBoolean) {
        return false;
      }
      return d.onAccessibilityHoverEvent(l.a((l)localObject), paramMotionEvent);
    }
    if ((paramMotionEvent.getAction() != 9) && (paramMotionEvent.getAction() != 7))
    {
      if (paramMotionEvent.getAction() == 10)
      {
        M();
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("unexpected accessibility hover event: ");
        ((StringBuilder)localObject).append(paramMotionEvent);
        t5.b.a("flutter", ((StringBuilder)localObject).toString());
        return false;
      }
    }
    else {
      A(paramMotionEvent.getX(), paramMotionEvent.getY(), paramBoolean);
    }
    return true;
  }
  
  public final void M()
  {
    l locall = o;
    if (locall != null)
    {
      S(l.a(locall), 256);
      o = null;
    }
  }
  
  public final void N(l paraml)
  {
    String str1 = l.f0(paraml);
    String str2 = str1;
    if (str1 == null) {
      str2 = " ";
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      W(str2);
    }
    else
    {
      paraml = H(l.a(paraml), 32);
      paraml.getText().add(str2);
      T(paraml);
    }
  }
  
  public final boolean O(l paraml, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    int i1 = paramBundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
    boolean bool = paramBundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
    int i2 = l.j(paraml);
    int i3 = l.l(paraml);
    Q(paraml, i1, paramBoolean, bool);
    if ((i2 != l.j(paraml)) || (i3 != l.l(paraml)))
    {
      if (l.r(paraml) != null) {
        paramBundle = l.r(paraml);
      } else {
        paramBundle = "";
      }
      AccessibilityEvent localAccessibilityEvent = H(l.a(paraml), 8192);
      localAccessibilityEvent.getText().add(paramBundle);
      localAccessibilityEvent.setFromIndex(l.j(paraml));
      localAccessibilityEvent.setToIndex(l.l(paraml));
      localAccessibilityEvent.setItemCount(paramBundle.length());
      T(localAccessibilityEvent);
    }
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if ((i1 == 4) || (i1 == 8) || (i1 == 16)) {
          return true;
        }
      }
      else
      {
        if (paramBoolean)
        {
          paramBundle = g.I;
          if (l.p(paraml, paramBundle))
          {
            b.c(paramInt, paramBundle, Boolean.valueOf(bool));
            return true;
          }
        }
        if (!paramBoolean)
        {
          paramBundle = g.J;
          if (l.p(paraml, paramBundle))
          {
            b.c(paramInt, paramBundle, Boolean.valueOf(bool));
            return true;
          }
        }
      }
    }
    else
    {
      if (paramBoolean)
      {
        paramBundle = g.y;
        if (l.p(paraml, paramBundle))
        {
          b.c(paramInt, paramBundle, Boolean.valueOf(bool));
          return true;
        }
      }
      if (!paramBoolean)
      {
        paramBundle = g.z;
        if (l.p(paraml, paramBundle))
        {
          b.c(paramInt, paramBundle, Boolean.valueOf(bool));
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean P(l paraml, int paramInt, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"))) {
      paramBundle = paramBundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
    } else {
      paramBundle = "";
    }
    b.c(paramInt, g.K, paramBundle);
    l.s(paraml, paramBundle);
    l.H(paraml, null);
    return true;
  }
  
  public final void Q(l paraml, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((l.l(paraml) >= 0) && (l.j(paraml) >= 0))
    {
      if (paramInt != 1)
      {
        label59:
        Matcher localMatcher;
        if (paramInt != 2)
        {
          if (paramInt != 4)
          {
            if ((paramInt != 8) && (paramInt != 16)) {
              break label337;
            }
            if (paramBoolean1)
            {
              paramInt = l.r(paraml).length();
              l.m(paraml, paramInt);
              break label337;
            }
          }
          label125:
          do
          {
            l.m(paraml, 0);
            break label337;
            if ((paramBoolean1) && (l.l(paraml) < l.r(paraml).length()))
            {
              localMatcher = Pattern.compile("(?!^)(\\n)").matcher(l.r(paraml).substring(l.l(paraml)));
              if (!localMatcher.find()) {
                break;
              }
              l.n(paraml, localMatcher.start(1));
              break label337;
            }
            if ((paramBoolean1) || (l.l(paraml) <= 0)) {
              break label337;
            }
            localMatcher = Pattern.compile("(?s:.*)(\\n)").matcher(l.r(paraml).substring(0, l.l(paraml)));
          } while (!localMatcher.find());
        }
        else
        {
          for (;;)
          {
            paramInt = localMatcher.start(1);
            break label59;
            if ((paramBoolean1) && (l.l(paraml) < l.r(paraml).length()))
            {
              localMatcher = Pattern.compile("\\p{L}(\\b)").matcher(l.r(paraml).substring(l.l(paraml)));
              localMatcher.find();
              if (!localMatcher.find()) {
                break;
              }
              break label125;
            }
            if ((paramBoolean1) || (l.l(paraml) <= 0)) {
              break label337;
            }
            localMatcher = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(l.r(paraml).substring(0, l.l(paraml)));
            if (!localMatcher.find()) {
              break label337;
            }
          }
        }
      }
      else if ((paramBoolean1) && (l.l(paraml) < l.r(paraml).length()))
      {
        l.n(paraml, 1);
      }
      else if ((!paramBoolean1) && (l.l(paraml) > 0))
      {
        l.o(paraml, 1);
      }
      label337:
      if (!paramBoolean2) {
        l.k(paraml, l.l(paraml));
      }
    }
  }
  
  public void R()
  {
    u = true;
    e.d();
    Z(null);
    c.removeAccessibilityStateChangeListener(w);
    c.removeTouchExplorationStateChangeListener(x);
    f.unregisterContentObserver(y);
    b.g(null);
  }
  
  public void S(int paramInt1, int paramInt2)
  {
    if (!c.isEnabled()) {
      return;
    }
    T(H(paramInt1, paramInt2));
  }
  
  public final void T(AccessibilityEvent paramAccessibilityEvent)
  {
    if (!c.isEnabled()) {
      return;
    }
    a.getParent().requestSendAccessibilityEvent(a, paramAccessibilityEvent);
  }
  
  public final void U()
  {
    b.f(l);
  }
  
  public final void V(int paramInt)
  {
    AccessibilityEvent localAccessibilityEvent = H(paramInt, 2048);
    localAccessibilityEvent.setContentChangeTypes(1);
    T(localAccessibilityEvent);
  }
  
  public final void W(String paramString)
  {
    f.a(a, paramString);
  }
  
  public final void X(boolean paramBoolean)
  {
    if (t == paramBoolean) {
      return;
    }
    t = paramBoolean;
    if (paramBoolean) {}
    for (int i1 = l | po;; i1 = l & po)
    {
      l = i1;
      break;
    }
    U();
  }
  
  public final void Y()
  {
    View localView = a;
    if ((localView != null) && (localView.getResources() != null))
    {
      int i1 = e.a(a.getResources().getConfiguration());
      if ((i1 != Integer.MAX_VALUE) && (i1 >= 300)) {}
      for (i1 = l | so;; i1 = l & so)
      {
        l = i1;
        break;
      }
      U();
    }
  }
  
  public void Z(k paramk)
  {
    s = paramk;
  }
  
  public final boolean a0(l paraml)
  {
    boolean bool;
    if ((l.c(paraml) > 0) && ((l.d(i, new g(paraml))) || (!l.d(i, new h())))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b0(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
  {
    while (paramByteBuffer.hasRemaining())
    {
      h localh = x(paramByteBuffer.getInt());
      h.j(localh, paramByteBuffer.getInt());
      int i1 = paramByteBuffer.getInt();
      Object localObject1 = null;
      Object localObject2;
      if (i1 == -1) {
        localObject2 = null;
      } else {
        localObject2 = paramArrayOfString[i1];
      }
      h.f(localh, (String)localObject2);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        localObject2 = localObject1;
      } else {
        localObject2 = paramArrayOfString[i1];
      }
      h.b(localh, (String)localObject2);
    }
  }
  
  public void c0(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    Object localObject1 = new ArrayList();
    while (paramByteBuffer.hasRemaining())
    {
      localObject2 = y(paramByteBuffer.getInt());
      l.M((l)localObject2, paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
      if (!l.i((l)localObject2, i.C))
      {
        if (l.i((l)localObject2, i.u)) {
          m = ((l)localObject2);
        }
        if (l.N((l)localObject2)) {
          ((ArrayList)localObject1).add(localObject2);
        }
        if ((l.e((l)localObject2) != -1) && (!e.b(l.e((l)localObject2))))
        {
          localObject2 = e.c(l.e((l)localObject2));
          if (localObject2 != null) {
            ((View)localObject2).setImportantForAccessibility(0);
          }
        }
      }
    }
    paramArrayOfByteBuffer = new HashSet();
    paramByteBuffer = z();
    Object localObject2 = new ArrayList();
    if (paramByteBuffer != null)
    {
      paramArrayOfString = new float[16];
      Matrix.setIdentityM(paramArrayOfString, 0);
      if ((Build.VERSION.SDK_INT < 28) || (v()))
      {
        localObject3 = a.getRootWindowInsets();
        if (localObject3 != null)
        {
          if (!r.equals(Integer.valueOf(((WindowInsets)localObject3).getSystemWindowInsetLeft())))
          {
            l.O(paramByteBuffer, true);
            l.P(paramByteBuffer, true);
          }
          localObject3 = Integer.valueOf(((WindowInsets)localObject3).getSystemWindowInsetLeft());
          r = ((Integer)localObject3);
          Matrix.translateM(paramArrayOfString, 0, ((Integer)localObject3).intValue(), 0.0F, 0.0F);
        }
      }
      l.Q(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer, false);
      l.R(paramByteBuffer, (List)localObject2);
    }
    Object localObject3 = ((List)localObject2).iterator();
    paramByteBuffer = null;
    while (((Iterator)localObject3).hasNext())
    {
      paramArrayOfString = (l)((Iterator)localObject3).next();
      if (!p.contains(Integer.valueOf(l.a(paramArrayOfString)))) {
        paramByteBuffer = paramArrayOfString;
      }
    }
    paramArrayOfString = paramByteBuffer;
    if (paramByteBuffer == null)
    {
      paramArrayOfString = paramByteBuffer;
      if (((List)localObject2).size() > 0) {
        paramArrayOfString = (l)((List)localObject2).get(((List)localObject2).size() - 1);
      }
    }
    if ((paramArrayOfString != null) && ((l.a(paramArrayOfString) != q) || (((List)localObject2).size() != p.size())))
    {
      q = l.a(paramArrayOfString);
      N(paramArrayOfString);
    }
    p.clear();
    paramByteBuffer = ((List)localObject2).iterator();
    while (paramByteBuffer.hasNext())
    {
      paramArrayOfString = (l)paramByteBuffer.next();
      p.add(Integer.valueOf(l.a(paramArrayOfString)));
    }
    paramByteBuffer = g.entrySet().iterator();
    while (paramByteBuffer.hasNext())
    {
      paramArrayOfString = (l)((Map.Entry)paramByteBuffer.next()).getValue();
      if (!paramArrayOfByteBuffer.contains(paramArrayOfString))
      {
        d0(paramArrayOfString);
        paramByteBuffer.remove();
      }
    }
    V(0);
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramArrayOfByteBuffer = (l)((Iterator)localObject1).next();
      if (l.S(paramArrayOfByteBuffer))
      {
        paramByteBuffer = H(l.a(paramArrayOfByteBuffer), 4096);
        float f1 = l.T(paramArrayOfByteBuffer);
        float f2 = l.U(paramArrayOfByteBuffer);
        float f3 = f1;
        if (Float.isInfinite(l.U(paramArrayOfByteBuffer)))
        {
          f3 = f1;
          if (f1 > 70000.0F) {
            f3 = 70000.0F;
          }
          f2 = 100000.0F;
        }
        if (Float.isInfinite(l.V(paramArrayOfByteBuffer)))
        {
          f2 += 100000.0F;
          f1 = f3;
          if (f3 < -70000.0F) {
            f1 = -70000.0F;
          }
          f1 += 100000.0F;
          f3 = f2;
        }
        else
        {
          f2 -= l.V(paramArrayOfByteBuffer);
          f1 = f3 - l.V(paramArrayOfByteBuffer);
          f3 = f2;
        }
        if ((!l.W(paramArrayOfByteBuffer, g.t)) && (!l.W(paramArrayOfByteBuffer, g.u)))
        {
          if ((l.W(paramArrayOfByteBuffer, g.r)) || (l.W(paramArrayOfByteBuffer, g.s)))
          {
            paramByteBuffer.setScrollX((int)f1);
            paramByteBuffer.setMaxScrollX((int)f3);
          }
        }
        else
        {
          paramByteBuffer.setScrollY((int)f1);
          paramByteBuffer.setMaxScrollY((int)f3);
        }
        if (l.c(paramArrayOfByteBuffer) > 0)
        {
          paramByteBuffer.setItemCount(l.c(paramArrayOfByteBuffer));
          paramByteBuffer.setFromIndex(l.X(paramArrayOfByteBuffer));
          paramArrayOfString = l.Y(paramArrayOfByteBuffer).iterator();
          int i1 = 0;
          while (paramArrayOfString.hasNext()) {
            if (!l.i((l)paramArrayOfString.next(), i.C)) {
              i1++;
            }
          }
          paramByteBuffer.setToIndex(l.X(paramArrayOfByteBuffer) + i1 - 1);
        }
        T(paramByteBuffer);
      }
      if ((l.i(paramArrayOfByteBuffer, i.E)) && (l.Z(paramArrayOfByteBuffer))) {
        V(l.a(paramArrayOfByteBuffer));
      }
      paramByteBuffer = i;
      if ((paramByteBuffer != null) && (l.a(paramByteBuffer) == l.a(paramArrayOfByteBuffer)))
      {
        paramByteBuffer = i.r;
        if ((!l.a0(paramArrayOfByteBuffer, paramByteBuffer)) && (l.i(paramArrayOfByteBuffer, paramByteBuffer)))
        {
          paramByteBuffer = H(l.a(paramArrayOfByteBuffer), 4);
          paramByteBuffer.getText().add(l.b0(paramArrayOfByteBuffer));
          T(paramByteBuffer);
        }
      }
      paramByteBuffer = m;
      if ((paramByteBuffer != null) && (l.a(paramByteBuffer) == l.a(paramArrayOfByteBuffer)))
      {
        paramByteBuffer = n;
        if ((paramByteBuffer == null) || (l.a(paramByteBuffer) != l.a(m)))
        {
          n = m;
          T(H(l.a(paramArrayOfByteBuffer), 8));
          break label1046;
        }
      }
      if (m == null) {
        n = null;
      }
      label1046:
      paramByteBuffer = m;
      if ((paramByteBuffer != null) && (l.a(paramByteBuffer) == l.a(paramArrayOfByteBuffer)))
      {
        paramByteBuffer = i.t;
        if ((l.a0(paramArrayOfByteBuffer, paramByteBuffer)) && (l.i(paramArrayOfByteBuffer, paramByteBuffer)))
        {
          paramByteBuffer = i;
          if ((paramByteBuffer == null) || (l.a(paramByteBuffer) == l.a(m)))
          {
            paramByteBuffer = l.c0(paramArrayOfByteBuffer);
            paramArrayOfString = "";
            if (paramByteBuffer != null) {
              paramByteBuffer = l.c0(paramArrayOfByteBuffer);
            } else {
              paramByteBuffer = "";
            }
            if (l.r(paramArrayOfByteBuffer) != null) {
              paramArrayOfString = l.r(paramArrayOfByteBuffer);
            }
            paramByteBuffer = u(l.a(paramArrayOfByteBuffer), paramByteBuffer, paramArrayOfString);
            if (paramByteBuffer != null) {
              T(paramByteBuffer);
            }
            if ((l.d0(paramArrayOfByteBuffer) != l.j(paramArrayOfByteBuffer)) || (l.e0(paramArrayOfByteBuffer) != l.l(paramArrayOfByteBuffer)))
            {
              paramByteBuffer = H(l.a(paramArrayOfByteBuffer), 8192);
              paramByteBuffer.getText().add(paramArrayOfString);
              paramByteBuffer.setFromIndex(l.j(paramArrayOfByteBuffer));
              paramByteBuffer.setToIndex(l.l(paramArrayOfByteBuffer));
              paramByteBuffer.setItemCount(paramArrayOfString.length());
              T(paramByteBuffer);
            }
          }
        }
      }
    }
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    boolean bool1 = true;
    X(true);
    if (paramInt >= 65536) {
      return d.createAccessibilityNodeInfo(paramInt);
    }
    if (paramInt == -1)
    {
      localObject1 = I(a);
      a.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)localObject1);
      if (g.containsKey(Integer.valueOf(0))) {
        ((AccessibilityNodeInfo)localObject1).addChild(a, 0);
      }
      if (Build.VERSION.SDK_INT >= 24) {
        a.a((AccessibilityNodeInfo)localObject1, false);
      }
      return (AccessibilityNodeInfo)localObject1;
    }
    l locall = (l)g.get(Integer.valueOf(paramInt));
    if (locall == null) {
      return null;
    }
    if ((l.e(locall) != -1) && (e.b(l.e(locall))))
    {
      localObject1 = e.c(l.e(locall));
      if (localObject1 == null) {
        return null;
      }
      localObject2 = l.f(locall);
      return d.getRootNode((View)localObject1, l.a(locall), (Rect)localObject2);
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = J(a, paramInt);
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 24) {
      a.a(localAccessibilityNodeInfo, C(locall));
    }
    Object localObject3 = "";
    localAccessibilityNodeInfo.setViewIdResourceName("");
    if (l.g(locall) != null) {
      localAccessibilityNodeInfo.setViewIdResourceName(l.g(locall));
    }
    localAccessibilityNodeInfo.setPackageName(a.getContext().getPackageName());
    localAccessibilityNodeInfo.setClassName("android.view.View");
    localAccessibilityNodeInfo.setSource(a, paramInt);
    localAccessibilityNodeInfo.setFocusable(l.h(locall));
    Object localObject1 = m;
    if (localObject1 != null)
    {
      if (l.a((l)localObject1) == paramInt) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localAccessibilityNodeInfo.setFocused(bool2);
    }
    localObject1 = i;
    if (localObject1 != null)
    {
      if (l.a((l)localObject1) == paramInt) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localAccessibilityNodeInfo.setAccessibilityFocused(bool2);
    }
    Object localObject2 = i.t;
    if (l.i(locall, (i)localObject2))
    {
      localAccessibilityNodeInfo.setPassword(l.i(locall, i.z));
      localObject1 = i.J;
      if (!l.i(locall, (i)localObject1)) {
        localAccessibilityNodeInfo.setClassName("android.widget.EditText");
      }
      localAccessibilityNodeInfo.setEditable(l.i(locall, (i)localObject1) ^ true);
      if ((l.j(locall) != -1) && (l.l(locall) != -1)) {
        localAccessibilityNodeInfo.setTextSelection(l.j(locall), l.l(locall));
      }
      localObject1 = i;
      if ((localObject1 != null) && (l.a((l)localObject1) == paramInt)) {
        localAccessibilityNodeInfo.setLiveRegion(1);
      }
      if (l.p(locall, g.y))
      {
        localAccessibilityNodeInfo.addAction(256);
        i2 = 1;
      }
      else
      {
        i2 = 0;
      }
      if (l.p(locall, g.z))
      {
        localAccessibilityNodeInfo.addAction(512);
        i2 = 1;
      }
      int i3 = i2;
      if (l.p(locall, g.I))
      {
        localAccessibilityNodeInfo.addAction(256);
        i3 = i2 | 0x2;
      }
      int i2 = i3;
      if (l.p(locall, g.J))
      {
        localAccessibilityNodeInfo.addAction(512);
        i2 = i3 | 0x2;
      }
      localAccessibilityNodeInfo.setMovementGranularities(i2);
      if (l.q(locall) >= 0)
      {
        if (l.r(locall) == null) {
          i3 = 0;
        } else {
          i3 = l.r(locall).length();
        }
        l.t(locall);
        l.q(locall);
        localAccessibilityNodeInfo.setMaxTextLength(i3 - l.t(locall) + l.q(locall));
      }
    }
    if (l.p(locall, g.A)) {
      localAccessibilityNodeInfo.addAction(131072);
    }
    if (l.p(locall, g.B)) {
      localAccessibilityNodeInfo.addAction(16384);
    }
    if (l.p(locall, g.C)) {
      localAccessibilityNodeInfo.addAction(65536);
    }
    if (l.p(locall, g.D)) {
      localAccessibilityNodeInfo.addAction(32768);
    }
    if (l.p(locall, g.K)) {
      localAccessibilityNodeInfo.addAction(2097152);
    }
    if ((l.i(locall, i.s)) || (l.i(locall, i.L))) {
      localAccessibilityNodeInfo.setClassName("android.widget.Button");
    }
    if (l.i(locall, i.D)) {
      localAccessibilityNodeInfo.setClassName("android.widget.ImageView");
    }
    if (l.p(locall, g.H))
    {
      localAccessibilityNodeInfo.setDismissable(true);
      localAccessibilityNodeInfo.addAction(1048576);
    }
    if (l.u(locall) != null) {
      localAccessibilityNodeInfo.setParent(a, l.a(l.u(locall)));
    } else {
      localAccessibilityNodeInfo.setParent(a);
    }
    if (l.w(locall) != -1) {
      localAccessibilityNodeInfo.setTraversalAfter(a, l.w(locall));
    }
    Rect localRect = l.f(locall);
    if (l.u(locall) != null)
    {
      localObject4 = l.f(l.u(locall));
      localObject1 = new Rect(localRect);
      ((Rect)localObject1).offset(-left, -top);
      localAccessibilityNodeInfo.setBoundsInParent((Rect)localObject1);
    }
    else
    {
      localAccessibilityNodeInfo.setBoundsInParent(localRect);
    }
    localAccessibilityNodeInfo.setBoundsInScreen(w(localRect));
    localAccessibilityNodeInfo.setVisibleToUser(true);
    if ((l.i(locall, i.v)) && (!l.i(locall, i.w))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    localAccessibilityNodeInfo.setEnabled(bool2);
    if (l.p(locall, g.p))
    {
      if (l.x(locall) != null) {
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, h.a(l.x(locall))));
      }
      for (;;)
      {
        localAccessibilityNodeInfo.setClickable(true);
        break;
        localAccessibilityNodeInfo.addAction(16);
      }
    }
    if (l.p(locall, g.q))
    {
      if (l.y(locall) != null) {
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, h.a(l.y(locall))));
      }
      for (;;)
      {
        localAccessibilityNodeInfo.setLongClickable(true);
        break;
        localAccessibilityNodeInfo.addAction(32);
      }
    }
    Object localObject4 = g.r;
    if ((l.p(locall, (g)localObject4)) || (l.p(locall, g.t)) || (l.p(locall, g.s)) || (l.p(locall, g.u)))
    {
      localAccessibilityNodeInfo.setScrollable(true);
      if (l.i(locall, i.H))
      {
        if ((!l.p(locall, (g)localObject4)) && (!l.p(locall, g.s))) {
          if (a0(locall))
          {
            localObject1 = AccessibilityNodeInfo.CollectionInfo.obtain(l.c(locall), 0, false);
            localAccessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)localObject1);
            break label1283;
          }
        }
        for (localObject1 = "android.widget.ScrollView";; localObject1 = "android.widget.HorizontalScrollView")
        {
          localAccessibilityNodeInfo.setClassName((CharSequence)localObject1);
          break label1283;
          if (a0(locall))
          {
            localObject1 = AccessibilityNodeInfo.CollectionInfo.obtain(0, l.c(locall), false);
            break;
          }
        }
      }
      label1283:
      if ((l.p(locall, (g)localObject4)) || (l.p(locall, g.t))) {
        localAccessibilityNodeInfo.addAction(4096);
      }
      if ((l.p(locall, g.s)) || (l.p(locall, g.u))) {
        localAccessibilityNodeInfo.addAction(8192);
      }
    }
    localObject1 = g.v;
    if ((l.p(locall, (g)localObject1)) || (l.p(locall, g.w)))
    {
      localAccessibilityNodeInfo.setClassName("android.widget.SeekBar");
      if (l.p(locall, (g)localObject1)) {
        localAccessibilityNodeInfo.addAction(4096);
      }
      if (l.p(locall, g.w)) {
        localAccessibilityNodeInfo.addAction(8192);
      }
    }
    if (l.i(locall, i.E)) {
      localAccessibilityNodeInfo.setLiveRegion(1);
    }
    if (l.i(locall, (i)localObject2))
    {
      localAccessibilityNodeInfo.setText(l.z(locall));
      if (i1 >= 28) {
        b.a(localAccessibilityNodeInfo, l.A(locall));
      }
    }
    else if (!l.i(locall, i.A))
    {
      localObject1 = l.B(locall);
      localObject2 = localObject1;
      if (i1 < 28)
      {
        localObject2 = localObject1;
        if (l.C(locall) != null)
        {
          localObject2 = localObject3;
          if (localObject1 != null) {
            localObject2 = localObject1;
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(localObject2);
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject1).append(l.C(locall));
          localObject2 = ((StringBuilder)localObject1).toString();
        }
      }
      if (localObject2 != null) {
        localAccessibilityNodeInfo.setContentDescription((CharSequence)localObject2);
      }
    }
    if ((i1 >= 28) && (l.C(locall) != null)) {
      c.a(localAccessibilityNodeInfo, l.C(locall));
    }
    boolean bool3 = l.i(locall, i.p);
    boolean bool4 = l.i(locall, i.F);
    boolean bool2 = bool1;
    if (!bool3) {
      if (bool4) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    localAccessibilityNodeInfo.setCheckable(bool2);
    if (bool3)
    {
      localAccessibilityNodeInfo.setChecked(l.i(locall, i.q));
      if (l.i(locall, i.x)) {
        localObject1 = "android.widget.RadioButton";
      }
    }
    for (;;)
    {
      localAccessibilityNodeInfo.setClassName((CharSequence)localObject1);
      break;
      localObject1 = "android.widget.CheckBox";
      continue;
      if (!bool4) {
        break;
      }
      localAccessibilityNodeInfo.setChecked(l.i(locall, i.G));
      localObject1 = "android.widget.Switch";
    }
    localAccessibilityNodeInfo.setSelected(l.i(locall, i.r));
    if (i1 >= 28) {
      J.d.a(localAccessibilityNodeInfo, l.i(locall, i.y));
    }
    localObject1 = i;
    if ((localObject1 != null) && (l.a((l)localObject1) == paramInt)) {}
    for (paramInt = 128;; paramInt = 64)
    {
      localAccessibilityNodeInfo.addAction(paramInt);
      break;
    }
    if (l.D(locall) != null)
    {
      localObject2 = l.D(locall).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (h)((Iterator)localObject2).next();
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(h.c((h)localObject1), h.e((h)localObject1)));
      }
    }
    localObject2 = l.E(locall).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (l)((Iterator)localObject2).next();
      if (!l.i((l)localObject3, i.C))
      {
        if (l.e((l)localObject3) != -1)
        {
          localObject1 = e.c(l.e((l)localObject3));
          if (!e.b(l.e((l)localObject3)))
          {
            localAccessibilityNodeInfo.addChild((View)localObject1);
            continue;
          }
        }
        localAccessibilityNodeInfo.addChild(a, l.a((l)localObject3));
      }
    }
    return localAccessibilityNodeInfo;
  }
  
  public final void d0(l paraml)
  {
    l.v(paraml, null);
    if (l.e(paraml) != -1)
    {
      localObject = j;
      if ((localObject != null) && (d.platformViewOfNode(((Integer)localObject).intValue()) == e.c(l.e(paraml))))
      {
        S(j.intValue(), 65536);
        j = null;
      }
    }
    if (l.e(paraml) != -1)
    {
      localObject = e.c(l.e(paraml));
      if (localObject != null) {
        ((View)localObject).setImportantForAccessibility(4);
      }
    }
    Object localObject = i;
    if (localObject == paraml)
    {
      S(l.a((l)localObject), 65536);
      i = null;
    }
    if (m == paraml) {
      m = null;
    }
    if (o == paraml) {
      o = null;
    }
  }
  
  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    Object localObject;
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        break label74;
      }
    }
    else
    {
      localObject = m;
      if (localObject != null)
      {
        paramInt = l.a((l)localObject);
        label27:
        return createAccessibilityNodeInfo(paramInt);
      }
      localObject = k;
      if (localObject == null) {}
    }
    do
    {
      paramInt = ((Integer)localObject).intValue();
      break label27;
      localObject = i;
      if (localObject != null) {
        break;
      }
      localObject = j;
    } while (localObject != null);
    label74:
    return null;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (paramInt1 >= 65536)
    {
      boolean bool = d.performAction(paramInt1, paramInt2, paramBundle);
      if ((bool) && (paramInt2 == 128)) {
        j = null;
      }
      return bool;
    }
    l locall = (l)g.get(Integer.valueOf(paramInt1));
    if (locall == null) {
      return false;
    }
    switch (paramInt2)
    {
    default: 
      int i1 = B;
      paramBundle = (h)h.get(Integer.valueOf(paramInt2 - i1));
      if (paramBundle != null)
      {
        b.c(paramInt1, g.G, Integer.valueOf(h.g(paramBundle)));
        return true;
      }
      return false;
    case 16908342: 
      b.b(paramInt1, g.x);
      return true;
    case 2097152: 
      return P(locall, paramInt1, paramBundle);
    case 1048576: 
      b.b(paramInt1, g.H);
      return true;
    case 131072: 
      HashMap localHashMap = new HashMap();
      if ((paramBundle != null) && (paramBundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT")) && (paramBundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT"))) {
        localHashMap.put("base", Integer.valueOf(paramBundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
      }
      for (paramInt2 = paramBundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");; paramInt2 = l.l(locall))
      {
        localHashMap.put("extent", Integer.valueOf(paramInt2));
        break;
        localHashMap.put("base", Integer.valueOf(l.l(locall)));
      }
      b.c(paramInt1, g.A, localHashMap);
      paramBundle = (l)g.get(Integer.valueOf(paramInt1));
      l.k(paramBundle, ((Integer)localHashMap.get("base")).intValue());
      l.m(paramBundle, ((Integer)localHashMap.get("extent")).intValue());
      return true;
    case 65536: 
      b.b(paramInt1, g.C);
      return true;
    case 32768: 
      b.b(paramInt1, g.D);
      return true;
    case 16384: 
      b.b(paramInt1, g.B);
      return true;
    case 8192: 
      paramBundle = g.u;
      if (l.p(locall, paramBundle)) {}
      for (;;)
      {
        b.b(paramInt1, paramBundle);
        break;
        paramBundle = g.s;
        if (!l.p(locall, paramBundle))
        {
          paramBundle = g.w;
          if (!l.p(locall, paramBundle)) {
            break label590;
          }
          l.s(locall, l.J(locall));
          l.H(locall, l.K(locall));
          S(paramInt1, 4);
        }
      }
      return true;
      return false;
    case 4096: 
      paramBundle = g.t;
      if (l.p(locall, paramBundle)) {}
      for (;;)
      {
        b.b(paramInt1, paramBundle);
        break;
        paramBundle = g.r;
        if (!l.p(locall, paramBundle))
        {
          paramBundle = g.v;
          if (!l.p(locall, paramBundle)) {
            break label679;
          }
          l.s(locall, l.G(locall));
          l.H(locall, l.I(locall));
          S(paramInt1, 4);
        }
      }
      return true;
      return false;
    case 512: 
      return O(locall, paramInt1, paramBundle, false);
    case 256: 
      return O(locall, paramInt1, paramBundle, true);
    case 128: 
      paramBundle = i;
      if ((paramBundle != null) && (l.a(paramBundle) == paramInt1)) {
        i = null;
      }
      paramBundle = j;
      if ((paramBundle != null) && (paramBundle.intValue() == paramInt1)) {
        j = null;
      }
      b.b(paramInt1, g.F);
      S(paramInt1, 65536);
      return true;
    case 64: 
      if (i == null) {
        a.invalidate();
      }
      i = locall;
      b.b(paramInt1, g.E);
      paramBundle = new HashMap();
      paramBundle.put("type", "didGainFocus");
      paramBundle.put("nodeId", Integer.valueOf(l.a(locall)));
      b.a.c(paramBundle);
      S(paramInt1, 32768);
      if ((l.p(locall, g.v)) || (l.p(locall, g.w))) {
        S(paramInt1, 4);
      }
      return true;
    case 32: 
      label590:
      label679:
      b.b(paramInt1, g.q);
      return true;
    }
    b.b(paramInt1, g.p);
    return true;
  }
  
  public final AccessibilityEvent u(int paramInt, String paramString1, String paramString2)
  {
    AccessibilityEvent localAccessibilityEvent = H(paramInt, 16);
    localAccessibilityEvent.setBeforeText(paramString1);
    localAccessibilityEvent.getText().add(paramString2);
    for (paramInt = 0; (paramInt < paramString1.length()) && (paramInt < paramString2.length()) && (paramString1.charAt(paramInt) == paramString2.charAt(paramInt)); paramInt++) {}
    if ((paramInt >= paramString1.length()) && (paramInt >= paramString2.length())) {
      return null;
    }
    localAccessibilityEvent.setFromIndex(paramInt);
    int i1 = paramString1.length() - 1;
    for (int i2 = paramString2.length() - 1; (i1 >= paramInt) && (i2 >= paramInt) && (paramString1.charAt(i1) == paramString2.charAt(i2)); i2--) {
      i1--;
    }
    localAccessibilityEvent.setRemovedCount(i1 - paramInt + 1);
    localAccessibilityEvent.setAddedCount(i2 - paramInt + 1);
    return localAccessibilityEvent;
  }
  
  public final boolean v()
  {
    Activity localActivity = T5.g.b(a.getContext());
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localActivity != null) {
      if (localActivity.getWindow() == null)
      {
        bool2 = bool1;
      }
      else
      {
        int i1 = d.a(localActivity.getWindow().getAttributes());
        if (i1 != 2)
        {
          bool2 = bool1;
          if (i1 != 0) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final Rect w(Rect paramRect)
  {
    paramRect = new Rect(paramRect);
    int[] arrayOfInt = new int[2];
    a.getLocationOnScreen(arrayOfInt);
    paramRect.offset(arrayOfInt[0], arrayOfInt[1]);
    return paramRect;
  }
  
  public final h x(int paramInt)
  {
    h localh1 = (h)h.get(Integer.valueOf(paramInt));
    h localh2 = localh1;
    if (localh1 == null)
    {
      localh2 = new h();
      h.h(localh2, paramInt);
      h.d(localh2, B + paramInt);
      h.put(Integer.valueOf(paramInt), localh2);
    }
    return localh2;
  }
  
  public final l y(int paramInt)
  {
    l locall1 = (l)g.get(Integer.valueOf(paramInt));
    l locall2 = locall1;
    if (locall1 == null)
    {
      locall2 = new l(this);
      l.b(locall2, paramInt);
      g.put(Integer.valueOf(paramInt), locall2);
    }
    return locall2;
  }
  
  public final l z()
  {
    return (l)g.get(Integer.valueOf(0));
  }
  
  public class a
    implements a.b
  {
    public a() {}
    
    public void a(String paramString)
    {
      i.c(i.this).announceForAccessibility(paramString);
    }
    
    public void b(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
    {
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      int i = paramArrayOfByteBuffer.length;
      for (int j = 0; j < i; j++) {
        paramArrayOfByteBuffer[j].order(ByteOrder.LITTLE_ENDIAN);
      }
      c0(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
    }
    
    public void c(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
    {
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      b0(paramByteBuffer, paramArrayOfString);
    }
    
    public void d(String paramString)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return;
      }
      AccessibilityEvent localAccessibilityEvent = i.i(i.this, 0, 32);
      localAccessibilityEvent.getText().add(paramString);
      i.j(i.this, localAccessibilityEvent);
    }
    
    public void e(int paramInt)
    {
      S(paramInt, 8);
    }
    
    public void f(int paramInt)
    {
      S(paramInt, 2);
    }
    
    public void g(int paramInt)
    {
      S(paramInt, 1);
    }
  }
  
  public class b
    implements AccessibilityManager.AccessibilityStateChangeListener
  {
    public b() {}
    
    public void onAccessibilityStateChanged(boolean paramBoolean)
    {
      if (i.k(i.this)) {
        return;
      }
      i locali = i.this;
      if (paramBoolean)
      {
        i.m(locali).g(i.l(i.this));
        i.m(i.this).e();
      }
      else
      {
        i.n(locali, false);
        i.m(i.this).g(null);
        i.m(i.this).d();
      }
      if (i.s(i.this) != null) {
        i.s(i.this).a(paramBoolean, i.t(i.this).isTouchExplorationEnabled());
      }
    }
  }
  
  public class c
    extends ContentObserver
  {
    public c(Handler paramHandler)
    {
      super();
    }
    
    public void onChange(boolean paramBoolean)
    {
      onChange(paramBoolean, null);
    }
    
    public void onChange(boolean paramBoolean, Uri paramUri)
    {
      if (i.k(i.this)) {
        return;
      }
      paramUri = Settings.Global.getString(i.d(i.this), "transition_animation_scale");
      if ((paramUri != null) && (paramUri.equals("0"))) {
        i.f(i.this, ro);
      } else {
        i.e(i.this, ro);
      }
      i.g(i.this);
    }
  }
  
  public class d
    implements AccessibilityManager.TouchExplorationStateChangeListener
  {
    public d(AccessibilityManager paramAccessibilityManager) {}
    
    public void onTouchExplorationStateChanged(boolean paramBoolean)
    {
      if (i.k(i.this)) {
        return;
      }
      if (!paramBoolean)
      {
        i.n(i.this, false);
        i.h(i.this);
      }
      if (i.s(i.this) != null) {
        i.s(i.this).a(paramAccessibilityManager.isEnabled(), paramBoolean);
      }
    }
  }
  
  public static enum f
  {
    public final int o;
    
    public f(int paramInt1)
    {
      o = paramInt1;
    }
  }
  
  public static enum g
  {
    public final int o;
    
    public g(int paramInt1)
    {
      o = paramInt1;
    }
  }
  
  public static class h
  {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public String d;
    public String e;
  }
  
  public static enum i
  {
    public final int o;
    
    public i(int paramInt1)
    {
      o = paramInt1;
    }
  }
  
  public static class j
    extends i.n
  {
    public String d;
    
    public j()
    {
      super();
    }
  }
  
  public static abstract interface k
  {
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2);
  }
  
  public static class l
  {
    public int A = -1;
    public i.p B;
    public boolean C = false;
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public float J;
    public String K;
    public String L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float[] Q;
    public l R;
    public List S = new ArrayList();
    public List T = new ArrayList();
    public List U;
    public i.h V;
    public i.h W;
    public boolean X = true;
    public float[] Y;
    public boolean Z = true;
    public final i a;
    public float[] a0;
    public int b = -1;
    public Rect b0;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public String o;
    public String p;
    public List q;
    public String r;
    public List s;
    public String t;
    public List u;
    public String v;
    public List w;
    public String x;
    public List y;
    public String z;
    
    public l(i parami)
    {
      a = parami;
    }
    
    public static boolean C0(l paraml, T5.e parame)
    {
      boolean bool;
      if ((paraml != null) && (paraml.l0(parame) != null)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final float A0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return Math.max(paramFloat1, Math.max(paramFloat2, Math.max(paramFloat3, paramFloat4)));
    }
    
    public final float B0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return Math.min(paramFloat1, Math.min(paramFloat2, Math.min(paramFloat3, paramFloat4)));
    }
    
    public final void D0(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
    {
      Matrix.multiplyMV(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfFloat3, 0);
      float f1 = paramArrayOfFloat1[3];
      paramArrayOfFloat1[0] /= f1;
      paramArrayOfFloat1[1] /= f1;
      paramArrayOfFloat1[2] /= f1;
      paramArrayOfFloat1[3] = 0.0F;
    }
    
    public final void E0(float[] paramArrayOfFloat, Set paramSet, boolean paramBoolean)
    {
      paramSet.add(this);
      if (Z) {
        paramBoolean = true;
      }
      Object localObject;
      if (paramBoolean)
      {
        if (a0 == null) {
          a0 = new float[16];
        }
        if (Q == null) {
          Q = new float[16];
        }
        Matrix.multiplyMM(a0, 0, paramArrayOfFloat, 0, Q, 0);
        float[] arrayOfFloat1 = new float[4];
        float[] arrayOfFloat2 = new float[4];
        float[] arrayOfFloat3 = new float[4];
        paramArrayOfFloat = new float[4];
        float f1 = M;
        float f2 = N;
        localObject = new float[4];
        localObject[0] = f1;
        localObject[1] = f2;
        localObject[2] = 0.0F;
        localObject[3] = 1.0F;
        D0(arrayOfFloat1, a0, (float[])localObject);
        localObject[0] = O;
        localObject[1] = N;
        D0(arrayOfFloat2, a0, (float[])localObject);
        localObject[0] = O;
        localObject[1] = P;
        D0(arrayOfFloat3, a0, (float[])localObject);
        localObject[0] = M;
        localObject[1] = P;
        D0(paramArrayOfFloat, a0, (float[])localObject);
        if (b0 == null) {
          b0 = new Rect();
        }
        b0.set(Math.round(B0(arrayOfFloat1[0], arrayOfFloat2[0], arrayOfFloat3[0], paramArrayOfFloat[0])), Math.round(B0(arrayOfFloat1[1], arrayOfFloat2[1], arrayOfFloat3[1], paramArrayOfFloat[1])), Math.round(A0(arrayOfFloat1[0], arrayOfFloat2[0], arrayOfFloat3[0], paramArrayOfFloat[0])), Math.round(A0(arrayOfFloat1[1], arrayOfFloat2[1], arrayOfFloat3[1], paramArrayOfFloat[1])));
        Z = false;
      }
      paramArrayOfFloat = S.iterator();
      int i1 = -1;
      while (paramArrayOfFloat.hasNext())
      {
        localObject = (l)paramArrayOfFloat.next();
        A = i1;
        i1 = b;
        ((l)localObject).E0(a0, paramSet, paramBoolean);
      }
    }
    
    public final void F0(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
    {
      C = true;
      K = r;
      L = p;
      D = c;
      E = d;
      F = g;
      G = h;
      H = l;
      I = m;
      J = n;
      c = paramByteBuffer.getInt();
      d = paramByteBuffer.getInt();
      e = paramByteBuffer.getInt();
      f = paramByteBuffer.getInt();
      g = paramByteBuffer.getInt();
      h = paramByteBuffer.getInt();
      i = paramByteBuffer.getInt();
      j = paramByteBuffer.getInt();
      k = paramByteBuffer.getInt();
      l = paramByteBuffer.getFloat();
      m = paramByteBuffer.getFloat();
      n = paramByteBuffer.getFloat();
      int i1 = paramByteBuffer.getInt();
      String str;
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      o = str;
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      p = str;
      q = q0(paramByteBuffer, paramArrayOfByteBuffer);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      r = str;
      s = q0(paramByteBuffer, paramArrayOfByteBuffer);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      t = str;
      u = q0(paramByteBuffer, paramArrayOfByteBuffer);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      v = str;
      w = q0(paramByteBuffer, paramArrayOfByteBuffer);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i1];
      }
      x = str;
      y = q0(paramByteBuffer, paramArrayOfByteBuffer);
      i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        paramArrayOfString = null;
      } else {
        paramArrayOfString = paramArrayOfString[i1];
      }
      z = paramArrayOfString;
      B = i.p.e(paramByteBuffer.getInt());
      M = paramByteBuffer.getFloat();
      N = paramByteBuffer.getFloat();
      O = paramByteBuffer.getFloat();
      P = paramByteBuffer.getFloat();
      if (Q == null) {
        Q = new float[16];
      }
      int i2 = 0;
      for (i1 = 0; i1 < 16; i1++) {
        Q[i1] = paramByteBuffer.getFloat();
      }
      X = true;
      Z = true;
      int i3 = paramByteBuffer.getInt();
      S.clear();
      T.clear();
      for (i1 = 0; i1 < i3; i1++)
      {
        paramArrayOfString = i.o(a, paramByteBuffer.getInt());
        R = this;
        S.add(paramArrayOfString);
      }
      for (i1 = 0; i1 < i3; i1++)
      {
        paramArrayOfString = i.o(a, paramByteBuffer.getInt());
        R = this;
        T.add(paramArrayOfString);
      }
      i3 = paramByteBuffer.getInt();
      if (i3 == 0)
      {
        U = null;
      }
      else
      {
        paramArrayOfString = U;
        if (paramArrayOfString == null)
        {
          U = new ArrayList(i3);
          i1 = i2;
        }
        else
        {
          paramArrayOfString.clear();
        }
        for (i1 = i2; i1 < i3; i1++)
        {
          paramArrayOfString = i.p(a, paramByteBuffer.getInt());
          if (i.h.i(paramArrayOfString) == po) {
            V = paramArrayOfString;
          } else if (i.h.i(paramArrayOfString) == qo) {
            W = paramArrayOfString;
          } else {
            U.add(paramArrayOfString);
          }
          U.add(paramArrayOfString);
        }
      }
    }
    
    public final void g0(List paramList)
    {
      if (x0(i.i.A)) {
        paramList.add(this);
      }
      Iterator localIterator = S.iterator();
      while (localIterator.hasNext()) {
        ((l)localIterator.next()).g0(paramList);
      }
    }
    
    public final SpannableString h0(String paramString, List paramList)
    {
      if (paramString == null) {
        return null;
      }
      paramString = new SpannableString(paramString);
      if (paramList != null)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          i.n localn = (i.n)paramList.next();
          int i1 = i.e.a[c.ordinal()];
          if (i1 != 1)
          {
            if (i1 == 2) {
              paramString.setSpan(new LocaleSpan(Locale.forLanguageTag(d)), a, b, 0);
            }
          }
          else {
            paramString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), a, b, 0);
          }
        }
      }
      return paramString;
    }
    
    public final boolean i0()
    {
      String str1 = p;
      boolean bool = false;
      if ((str1 == null) && (L == null)) {
        return false;
      }
      if (str1 != null)
      {
        String str2 = L;
        if ((str2 != null) && (str1.equals(str2))) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    
    public final boolean j0()
    {
      boolean bool;
      if ((!Float.isNaN(l)) && (!Float.isNaN(H)) && (H != l)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void k0()
    {
      if (!X) {
        return;
      }
      X = false;
      if (Y == null) {
        Y = new float[16];
      }
      if (!Matrix.invertM(Y, 0, Q, 0)) {
        Arrays.fill(Y, 0.0F);
      }
    }
    
    public final l l0(T5.e parame)
    {
      for (l locall = R; locall != null; locall = R) {
        if (parame.test(locall)) {
          return locall;
        }
      }
      return null;
    }
    
    public final Rect m0()
    {
      return b0;
    }
    
    public final CharSequence n0()
    {
      return h0(x, y);
    }
    
    public final CharSequence o0()
    {
      return h0(p, q);
    }
    
    public final String p0()
    {
      if (x0(i.i.B))
      {
        localObject = p;
        if ((localObject != null) && (!((String)localObject).isEmpty())) {
          return p;
        }
      }
      Object localObject = S.iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = ((l)((Iterator)localObject).next()).p0();
        if ((str != null) && (!str.isEmpty())) {
          return str;
        }
      }
      return null;
    }
    
    public final List q0(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer)
    {
      int i1 = paramByteBuffer.getInt();
      if (i1 == -1) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++)
      {
        int i3 = paramByteBuffer.getInt();
        int i4 = paramByteBuffer.getInt();
        i.o localo = i.o.values()[paramByteBuffer.getInt()];
        int i5 = i.e.a[localo.ordinal()];
        Object localObject;
        if (i5 != 1)
        {
          if (i5 == 2)
          {
            localObject = paramArrayOfByteBuffer[paramByteBuffer.getInt()];
            i.j localj = new i.j(null);
            a = i3;
            b = i4;
            c = localo;
            d = Charset.forName("UTF-8").decode((ByteBuffer)localObject).toString();
            localArrayList.add(localj);
          }
        }
        else
        {
          paramByteBuffer.getInt();
          localObject = new i.m(null);
          a = i3;
          b = i4;
          c = localo;
          localArrayList.add(localObject);
        }
      }
      return localArrayList;
    }
    
    public final CharSequence r0()
    {
      CharSequence localCharSequence1 = o0();
      CharSequence localCharSequence2 = n0();
      Object localObject1 = null;
      int i1 = 0;
      while (i1 < 2)
      {
        CharSequence localCharSequence3 = new CharSequence[] { localCharSequence1, localCharSequence2 }[i1];
        Object localObject2 = localObject1;
        if (localCharSequence3 != null)
        {
          localObject2 = localObject1;
          if (localCharSequence3.length() > 0) {
            if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
              localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence3 });
            } else {
              localObject2 = localCharSequence3;
            }
          }
        }
        i1++;
        localObject1 = localObject2;
      }
      return (CharSequence)localObject1;
    }
    
    public final CharSequence s0()
    {
      return h0(r, s);
    }
    
    public final CharSequence t0()
    {
      CharSequence localCharSequence1 = s0();
      CharSequence localCharSequence2 = o0();
      CharSequence localCharSequence3 = n0();
      Object localObject1 = null;
      int i1 = 0;
      while (i1 < 3)
      {
        CharSequence localCharSequence4 = new CharSequence[] { localCharSequence1, localCharSequence2, localCharSequence3 }[i1];
        Object localObject2 = localObject1;
        if (localCharSequence4 != null)
        {
          localObject2 = localObject1;
          if (localCharSequence4.length() > 0) {
            if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
              localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence4 });
            } else {
              localObject2 = localCharSequence4;
            }
          }
        }
        i1++;
        localObject1 = localObject2;
      }
      return (CharSequence)localObject1;
    }
    
    public final boolean u0(i.g paramg)
    {
      int i1 = E;
      boolean bool;
      if ((o & i1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean v0(i.i parami)
    {
      int i1 = D;
      boolean bool;
      if ((o & i1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean w0(i.g paramg)
    {
      int i1 = d;
      boolean bool;
      if ((o & i1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean x0(i.i parami)
    {
      int i1 = c;
      boolean bool;
      if ((o & i1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final l y0(float[] paramArrayOfFloat, boolean paramBoolean)
    {
      float f1 = paramArrayOfFloat[3];
      int i1 = 0;
      float f2 = paramArrayOfFloat[0] / f1;
      float f3 = paramArrayOfFloat[1] / f1;
      f1 = M;
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (f2 >= f1)
      {
        localObject2 = localObject1;
        if (f2 < O)
        {
          localObject2 = localObject1;
          if (f3 >= N) {
            if (f3 >= P)
            {
              localObject2 = localObject1;
            }
            else
            {
              float[] arrayOfFloat = new float[4];
              localObject2 = T.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                l locall = (l)((Iterator)localObject2).next();
                if (!locall.x0(i.i.C))
                {
                  locall.k0();
                  Matrix.multiplyMV(arrayOfFloat, 0, Y, 0, paramArrayOfFloat, 0);
                  locall = locall.y0(arrayOfFloat, paramBoolean);
                  if (locall != null) {
                    return locall;
                  }
                }
              }
              int i2 = i1;
              if (paramBoolean)
              {
                i2 = i1;
                if (i != -1) {
                  i2 = 1;
                }
              }
              if (!z0())
              {
                localObject2 = localObject1;
                if (i2 == 0) {}
              }
              else
              {
                localObject2 = this;
              }
            }
          }
        }
      }
      return (l)localObject2;
    }
    
    public final boolean z0()
    {
      boolean bool1 = x0(i.i.A);
      boolean bool2 = false;
      if (bool1) {
        return false;
      }
      if (x0(i.i.K)) {
        return true;
      }
      if (((d & i.q()) == 0) && ((c & i.r()) == 0))
      {
        String str = p;
        if ((str == null) || (str.isEmpty()))
        {
          str = r;
          if ((str == null) || (str.isEmpty()))
          {
            str = x;
            bool1 = bool2;
            if (str == null) {
              return bool1;
            }
            bool1 = bool2;
            if (str.isEmpty()) {
              return bool1;
            }
          }
        }
      }
      bool1 = true;
      return bool1;
    }
  }
  
  public static class m
    extends i.n
  {
    public m()
    {
      super();
    }
  }
  
  public static abstract class n
  {
    public int a;
    public int b;
    public i.o c;
  }
  
  public static enum o {}
  
  public static enum p
  {
    public static p e(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return o;
        }
        return p;
      }
      return q;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */