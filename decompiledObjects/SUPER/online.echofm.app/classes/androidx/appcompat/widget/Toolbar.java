package androidx.appcompat.widget;

import I.h;
import I.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.g.a;
import androidx.appcompat.view.menu.j;
import e.i;
import j.b;
import j.c;
import java.util.ArrayList;
import java.util.List;
import l.A;
import l.O;
import l.X;
import l.d0;
import l.w;

public class Toolbar
  extends ViewGroup
{
  public int A;
  public int B;
  public int C;
  public int D;
  public int E;
  public int F;
  public int G;
  public O H;
  public int I;
  public int J;
  public int K = 8388627;
  public CharSequence L;
  public CharSequence M;
  public ColorStateList N;
  public ColorStateList O;
  public boolean P;
  public boolean Q;
  public final ArrayList R = new ArrayList();
  public final ArrayList S = new ArrayList();
  public final int[] T = new int[2];
  public final ActionMenuView.e U = new a();
  public d V;
  public a W;
  public d a0;
  public g.a b0;
  public d.a c0;
  public boolean d0;
  public final Runnable e0 = new b();
  public ActionMenuView o;
  public TextView p;
  public TextView q;
  public ImageButton r;
  public ImageView s;
  public Drawable t;
  public CharSequence u;
  public ImageButton v;
  public View w;
  public Context x;
  public int y;
  public int z;
  
  public Toolbar(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, e.a.s);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    X localX = X.s(getContext(), paramAttributeSet, i.j2, paramInt, 0);
    s.B(this, paramContext, i.j2, paramAttributeSet, localX.o(), paramInt, 0);
    z = localX.l(i.L2, 0);
    A = localX.l(i.C2, 0);
    K = localX.j(i.k2, K);
    B = localX.j(i.l2, 48);
    int i = localX.d(i.F2, 0);
    paramInt = i;
    if (localX.p(i.K2)) {
      paramInt = localX.d(i.K2, i);
    }
    G = paramInt;
    F = paramInt;
    E = paramInt;
    D = paramInt;
    paramInt = localX.d(i.I2, -1);
    if (paramInt >= 0) {
      D = paramInt;
    }
    paramInt = localX.d(i.H2, -1);
    if (paramInt >= 0) {
      E = paramInt;
    }
    paramInt = localX.d(i.J2, -1);
    if (paramInt >= 0) {
      F = paramInt;
    }
    paramInt = localX.d(i.G2, -1);
    if (paramInt >= 0) {
      G = paramInt;
    }
    C = localX.e(i.w2, -1);
    int j = localX.d(i.s2, Integer.MIN_VALUE);
    paramInt = localX.d(i.o2, Integer.MIN_VALUE);
    i = localX.e(i.q2, 0);
    int k = localX.e(i.r2, 0);
    f();
    H.e(i, k);
    if ((j != Integer.MIN_VALUE) || (paramInt != Integer.MIN_VALUE)) {
      H.g(j, paramInt);
    }
    I = localX.d(i.t2, Integer.MIN_VALUE);
    J = localX.d(i.p2, Integer.MIN_VALUE);
    t = localX.f(i.n2);
    u = localX.n(i.m2);
    paramContext = localX.n(i.E2);
    if (!TextUtils.isEmpty(paramContext)) {
      setTitle(paramContext);
    }
    paramContext = localX.n(i.B2);
    if (!TextUtils.isEmpty(paramContext)) {
      setSubtitle(paramContext);
    }
    x = getContext();
    setPopupTheme(localX.l(i.A2, 0));
    paramContext = localX.f(i.z2);
    if (paramContext != null) {
      setNavigationIcon(paramContext);
    }
    paramContext = localX.n(i.y2);
    if (!TextUtils.isEmpty(paramContext)) {
      setNavigationContentDescription(paramContext);
    }
    paramContext = localX.f(i.u2);
    if (paramContext != null) {
      setLogo(paramContext);
    }
    paramContext = localX.n(i.v2);
    if (!TextUtils.isEmpty(paramContext)) {
      setLogoDescription(paramContext);
    }
    if (localX.p(i.M2)) {
      setTitleTextColor(localX.c(i.M2));
    }
    if (localX.p(i.D2)) {
      setSubtitleTextColor(localX.c(i.D2));
    }
    if (localX.p(i.x2)) {
      t(localX.l(i.x2, 0));
    }
    localX.t();
  }
  
  private MenuInflater getMenuInflater()
  {
    return new c(getContext());
  }
  
  public final void A()
  {
    removeCallbacks(e0);
    post(e0);
  }
  
  public void B()
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
    {
      View localView = getChildAt(i);
      if ((getLayoutParamsb != 2) && (localView != o))
      {
        removeViewAt(i);
        S.add(localView);
      }
    }
  }
  
  public void C(int paramInt1, int paramInt2)
  {
    f();
    H.g(paramInt1, paramInt2);
  }
  
  public void D(Context paramContext, int paramInt)
  {
    A = paramInt;
    TextView localTextView = q;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void E(Context paramContext, int paramInt)
  {
    z = paramInt;
    TextView localTextView = p;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public final boolean F()
  {
    if (!d0) {
      return false;
    }
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((G(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean G(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean H()
  {
    ActionMenuView localActionMenuView = o;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.K())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    for (int i = S.size() - 1; i >= 0; i--) {
      addView((View)S.get(i));
    }
    S.clear();
  }
  
  public final void b(List paramList, int paramInt)
  {
    int i = s.m(this);
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int k = getChildCount();
    int m = I.e.a(paramInt, s.m(this));
    paramList.clear();
    paramInt = j;
    View localView;
    e locale;
    if (i != 0) {
      for (paramInt = k - 1; paramInt >= 0; paramInt--)
      {
        localView = getChildAt(paramInt);
        locale = (e)localView.getLayoutParams();
        if ((b == 0) && (G(localView)) && (n(a) == m)) {
          paramList.add(localView);
        }
      }
    }
    while (paramInt < k)
    {
      localView = getChildAt(paramInt);
      locale = (e)localView.getLayoutParams();
      if ((b == 0) && (G(localView)) && (n(a) == m)) {
        paramList.add(localView);
      }
      paramInt++;
    }
  }
  
  public final void c(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = k();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
      localObject = m((ViewGroup.LayoutParams)localObject);
    } else {
      localObject = (e)localObject;
    }
    b = 1;
    if ((paramBoolean) && (w != null))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      S.add(paramView);
    }
    else
    {
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof e))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d()
  {
    Object localObject = a0;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = p;
    }
    if (localObject != null) {
      ((androidx.appcompat.view.menu.e)localObject).collapseActionView();
    }
  }
  
  public void e()
  {
    if (v == null)
    {
      Object localObject = new l.g(getContext(), null, e.a.r);
      v = ((ImageButton)localObject);
      ((ImageView)localObject).setImageDrawable(t);
      v.setContentDescription(u);
      localObject = k();
      a = (B & 0x70 | 0x800003);
      b = 2;
      v.setLayoutParams((ViewGroup.LayoutParams)localObject);
      v.setOnClickListener(new c());
    }
  }
  
  public final void f()
  {
    if (H == null) {
      H = new O();
    }
  }
  
  public final void g()
  {
    if (s == null) {
      s = new AppCompatImageView(getContext());
    }
  }
  
  public CharSequence getCollapseContentDescription()
  {
    Object localObject = v;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Drawable getCollapseIcon()
  {
    Object localObject = v;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public int getContentInsetEnd()
  {
    O localO = H;
    int i;
    if (localO != null) {
      i = localO.a();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = J;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getContentInsetLeft()
  {
    O localO = H;
    int i;
    if (localO != null) {
      i = localO.b();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetRight()
  {
    O localO = H;
    int i;
    if (localO != null) {
      i = localO.c();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStart()
  {
    O localO = H;
    int i;
    if (localO != null) {
      i = localO.d();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = I;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = o;
    if (localObject != null)
    {
      localObject = ((ActionMenuView)localObject).I();
      if ((localObject != null) && (((androidx.appcompat.view.menu.d)localObject).hasVisibleItems())) {
        return Math.max(getContentInsetEnd(), Math.max(J, 0));
      }
    }
    int i = getContentInsetEnd();
    return i;
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i;
    if (s.m(this) == 1) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetRight()
  {
    int i;
    if (s.m(this) == 1) {
      i = getCurrentContentInsetStart();
    } else {
      i = getCurrentContentInsetEnd();
    }
    return i;
  }
  
  public int getCurrentContentInsetStart()
  {
    int i;
    if (getNavigationIcon() != null) {
      i = Math.max(getContentInsetStart(), Math.max(I, 0));
    } else {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public Drawable getLogo()
  {
    Object localObject = s;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = s;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Menu getMenu()
  {
    h();
    return o.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = r;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = r;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public a getOuterActionMenuPresenter()
  {
    return W;
  }
  
  public Drawable getOverflowIcon()
  {
    h();
    return o.getOverflowIcon();
  }
  
  public Context getPopupContext()
  {
    return x;
  }
  
  public int getPopupTheme()
  {
    return y;
  }
  
  public CharSequence getSubtitle()
  {
    return M;
  }
  
  public final TextView getSubtitleTextView()
  {
    return q;
  }
  
  public CharSequence getTitle()
  {
    return L;
  }
  
  public int getTitleMarginBottom()
  {
    return G;
  }
  
  public int getTitleMarginEnd()
  {
    return E;
  }
  
  public int getTitleMarginStart()
  {
    return D;
  }
  
  public int getTitleMarginTop()
  {
    return F;
  }
  
  public final TextView getTitleTextView()
  {
    return p;
  }
  
  public A getWrapper()
  {
    if (V == null) {
      V = new d(this, true);
    }
    return V;
  }
  
  public final void h()
  {
    i();
    if (o.I() == null)
    {
      androidx.appcompat.view.menu.d locald = (androidx.appcompat.view.menu.d)o.getMenu();
      if (a0 == null) {
        a0 = new d();
      }
      o.setExpandedActionViewsExclusive(true);
      locald.b(a0, x);
    }
  }
  
  public final void i()
  {
    if (o == null)
    {
      Object localObject = new ActionMenuView(getContext());
      o = ((ActionMenuView)localObject);
      ((ActionMenuView)localObject).setPopupTheme(y);
      o.setOnMenuItemClickListener(U);
      o.J(b0, c0);
      localObject = k();
      a = (B & 0x70 | 0x800005);
      o.setLayoutParams((ViewGroup.LayoutParams)localObject);
      c(o, false);
    }
  }
  
  public final void j()
  {
    if (r == null)
    {
      r = new l.g(getContext(), null, e.a.r);
      e locale = k();
      a = (B & 0x70 | 0x800003);
      r.setLayoutParams(locale);
    }
  }
  
  public e k()
  {
    return new e(-2, -2);
  }
  
  public e l(AttributeSet paramAttributeSet)
  {
    return new e(getContext(), paramAttributeSet);
  }
  
  public e m(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof e)) {
      return new e((e)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof f.a)) {
      return new e((f.a)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new e((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new e(paramLayoutParams);
  }
  
  public final int n(int paramInt)
  {
    int i = s.m(this);
    int j = I.e.a(paramInt, i) & 0x7;
    if (j != 1)
    {
      paramInt = 3;
      if ((j != 3) && (j != 5))
      {
        if (i == 1) {
          paramInt = 5;
        }
        return paramInt;
      }
    }
    return j;
  }
  
  public final int o(View paramView, int paramInt)
  {
    e locale = (e)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int j = p(a);
    if (j != 48)
    {
      if (j != 80)
      {
        int k = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        j = (n - k - m - i) / 2;
        paramInt = topMargin;
        if (j >= paramInt)
        {
          i = n - m - i - j - k;
          m = bottomMargin;
          paramInt = j;
          if (i < m) {
            paramInt = Math.max(0, j - (m - i));
          }
        }
        return k + paramInt;
      }
      return getHeight() - getPaddingBottom() - i - bottomMargin - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(e0);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      Q = false;
    }
    if (!Q)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        Q = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      Q = false;
    }
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (s.m(this) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getWidth();
    int k = getHeight();
    int m = getPaddingLeft();
    int n = getPaddingRight();
    int i1 = getPaddingTop();
    int i2 = getPaddingBottom();
    int i3 = j - n;
    int[] arrayOfInt = T;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = s.n(this);
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    }
    Object localObject1;
    if (G(r))
    {
      localObject1 = r;
      if (i != 0)
      {
        i4 = x((View)localObject1, i3, arrayOfInt, paramInt4);
        paramInt3 = m;
        break label172;
      }
    }
    for (paramInt3 = w((View)localObject1, m, arrayOfInt, paramInt4);; paramInt3 = m)
    {
      i4 = i3;
      break;
    }
    label172:
    paramInt1 = paramInt3;
    paramInt2 = i4;
    if (G(v))
    {
      localObject1 = v;
      if (i != 0)
      {
        paramInt2 = x((View)localObject1, i4, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      }
      else
      {
        paramInt1 = w((View)localObject1, paramInt3, arrayOfInt, paramInt4);
        paramInt2 = i4;
      }
    }
    int i4 = paramInt1;
    paramInt3 = paramInt2;
    if (G(o))
    {
      localObject1 = o;
      if (i != 0)
      {
        i4 = w((View)localObject1, paramInt1, arrayOfInt, paramInt4);
        paramInt3 = paramInt2;
      }
      else
      {
        paramInt3 = x((View)localObject1, paramInt2, arrayOfInt, paramInt4);
        i4 = paramInt1;
      }
    }
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - i4);
    arrayOfInt[1] = Math.max(0, paramInt1 - (i3 - paramInt3));
    paramInt2 = Math.max(i4, paramInt2);
    paramInt3 = Math.min(paramInt3, i3 - paramInt1);
    paramInt1 = paramInt2;
    i4 = paramInt3;
    if (G(w))
    {
      localObject1 = w;
      if (i != 0)
      {
        i4 = x((View)localObject1, paramInt3, arrayOfInt, paramInt4);
        paramInt1 = paramInt2;
      }
      else
      {
        paramInt1 = w((View)localObject1, paramInt2, arrayOfInt, paramInt4);
        i4 = paramInt3;
      }
    }
    paramInt3 = paramInt1;
    paramInt2 = i4;
    if (G(s))
    {
      localObject1 = s;
      if (i != 0)
      {
        paramInt2 = x((View)localObject1, i4, arrayOfInt, paramInt4);
        paramInt3 = paramInt1;
      }
      else
      {
        paramInt3 = w((View)localObject1, paramInt1, arrayOfInt, paramInt4);
        paramInt2 = i4;
      }
    }
    paramBoolean = G(p);
    boolean bool = G(q);
    if (paramBoolean)
    {
      localObject1 = (e)p.getLayoutParams();
      paramInt1 = topMargin + p.getMeasuredHeight() + bottomMargin;
    }
    else
    {
      paramInt1 = 0;
    }
    if (bool)
    {
      localObject1 = (e)q.getLayoutParams();
      paramInt1 += topMargin + q.getMeasuredHeight() + bottomMargin;
    }
    if ((!paramBoolean) && (!bool)) {}
    for (paramInt1 = paramInt3;; paramInt1 = paramInt3)
    {
      paramInt3 = paramInt2;
      break label1326;
      if (paramBoolean) {
        localObject1 = p;
      } else {
        localObject1 = q;
      }
      if (bool) {
        localObject2 = q;
      } else {
        localObject2 = p;
      }
      localObject1 = (e)((View)localObject1).getLayoutParams();
      Object localObject2 = (e)((View)localObject2).getLayoutParams();
      if (((paramBoolean) && (p.getMeasuredWidth() > 0)) || ((bool) && (q.getMeasuredWidth() > 0))) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      i3 = K & 0x70;
      if (i3 != 48)
      {
        if (i3 != 80)
        {
          i3 = (k - i1 - i2 - paramInt1) / 2;
          int i5 = topMargin;
          int i6 = F;
          if (i3 < i5 + i6)
          {
            paramInt1 = i5 + i6;
          }
          else
          {
            i2 = k - i2 - paramInt1 - i3 - i1;
            i5 = bottomMargin;
            k = G;
            paramInt1 = i3;
            if (i2 < i5 + k) {
              paramInt1 = Math.max(0, i3 - (bottomMargin + k - i2));
            }
          }
          paramInt1 = i1 + paramInt1;
        }
        else
        {
          paramInt1 = k - i2 - bottomMargin - G - paramInt1;
        }
      }
      else {
        paramInt1 = getPaddingTop() + topMargin + F;
      }
      if (i == 0) {
        break;
      }
      if (i4 != 0) {}
      for (i = D;; i = 0) {
        break;
      }
      i -= arrayOfInt[1];
      paramInt2 -= Math.max(0, i);
      arrayOfInt[1] = Math.max(0, -i);
      if (paramBoolean)
      {
        localObject1 = (e)p.getLayoutParams();
        i3 = paramInt2 - p.getMeasuredWidth();
        i = p.getMeasuredHeight() + paramInt1;
        p.layout(i3, paramInt1, paramInt2, i);
        paramInt1 = i3 - E;
        i3 = i + bottomMargin;
      }
      else
      {
        i = paramInt2;
        i3 = paramInt1;
        paramInt1 = i;
      }
      if (bool)
      {
        i3 += q.getLayoutParams()).topMargin;
        i = q.getMeasuredWidth();
        i1 = q.getMeasuredHeight();
        q.layout(paramInt2 - i, i3, paramInt2, i1 + i3);
        i = paramInt2 - E;
      }
      else
      {
        i = paramInt2;
      }
      if (i4 != 0) {
        paramInt2 = Math.min(paramInt1, i);
      }
    }
    if (i4 != 0) {}
    for (int i = D;; i = 0) {
      break;
    }
    i -= arrayOfInt[0];
    paramInt3 += Math.max(0, i);
    arrayOfInt[0] = Math.max(0, -i);
    if (paramBoolean)
    {
      localObject1 = (e)p.getLayoutParams();
      i = p.getMeasuredWidth() + paramInt3;
      i3 = p.getMeasuredHeight() + paramInt1;
      p.layout(paramInt3, paramInt1, i, i3);
      i += E;
      paramInt1 = i3 + bottomMargin;
    }
    else
    {
      i = paramInt3;
    }
    if (bool)
    {
      i3 = paramInt1 + q.getLayoutParams()).topMargin;
      paramInt1 = q.getMeasuredWidth() + paramInt3;
      i1 = q.getMeasuredHeight();
      q.layout(paramInt3, i3, paramInt1, i1 + i3);
      i3 = paramInt1 + E;
    }
    else
    {
      i3 = paramInt3;
    }
    paramInt1 = paramInt3;
    paramInt3 = paramInt2;
    if (i4 != 0)
    {
      paramInt1 = Math.max(i, i3);
      paramInt3 = paramInt2;
    }
    label1326:
    i4 = m;
    m = 0;
    b(R, 3);
    i = R.size();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      paramInt1 = w((View)R.get(paramInt2), paramInt1, arrayOfInt, paramInt4);
    }
    b(R, 5);
    i = R.size();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      paramInt3 = x((View)R.get(paramInt2), paramInt3, arrayOfInt, paramInt4);
    }
    b(R, 1);
    i = s(R, arrayOfInt);
    paramInt2 = i4 + (j - i4 - n) / 2 - i / 2;
    i4 = i + paramInt2;
    if (paramInt2 >= paramInt1) {
      if (i4 > paramInt3) {
        paramInt1 = paramInt2 - (i4 - paramInt3);
      } else {
        paramInt1 = paramInt2;
      }
    }
    paramInt3 = R.size();
    paramInt2 = paramInt1;
    for (paramInt1 = m; paramInt1 < paramInt3; paramInt1++) {
      paramInt2 = w((View)R.get(paramInt1), paramInt2, arrayOfInt, paramInt4);
    }
    R.clear();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = T;
    boolean bool = d0.a(this);
    int j = 0;
    if (G(r))
    {
      z(r, paramInt1, 0, paramInt2, 0, C);
      k = r.getMeasuredWidth() + q(r);
      m = Math.max(0, r.getMeasuredHeight() + r(r));
      n = View.combineMeasuredStates(0, r.getMeasuredState());
    }
    else
    {
      k = 0;
      m = k;
      n = m;
    }
    int i1 = k;
    int i2 = m;
    int k = n;
    if (G(v))
    {
      z(v, paramInt1, 0, paramInt2, 0, C);
      i1 = v.getMeasuredWidth() + q(v);
      i2 = Math.max(m, v.getMeasuredHeight() + r(v));
      k = View.combineMeasuredStates(n, v.getMeasuredState());
    }
    int n = getCurrentContentInsetStart();
    int m = Math.max(n, i1);
    arrayOfInt[bool] = Math.max(0, n - i1);
    if (G(o))
    {
      z(o, paramInt1, m, paramInt2, 0, C);
      n = o.getMeasuredWidth() + q(o);
      i2 = Math.max(i2, o.getMeasuredHeight() + r(o));
      k = View.combineMeasuredStates(k, o.getMeasuredState());
    }
    else
    {
      n = 0;
    }
    int i3 = getCurrentContentInsetEnd();
    i1 = m + Math.max(i3, n);
    arrayOfInt[(bool ^ true)] = Math.max(0, i3 - n);
    bool = i1;
    m = i2;
    n = k;
    if (G(w))
    {
      i = i1 + y(w, paramInt1, i1, paramInt2, 0, arrayOfInt);
      m = Math.max(i2, w.getMeasuredHeight() + r(w));
      n = View.combineMeasuredStates(k, w.getMeasuredState());
    }
    i2 = i;
    i1 = m;
    k = n;
    if (G(s))
    {
      i2 = i + y(s, paramInt1, i, paramInt2, 0, arrayOfInt);
      i1 = Math.max(m, s.getMeasuredHeight() + r(s));
      k = View.combineMeasuredStates(n, s.getMeasuredState());
    }
    int i4 = getChildCount();
    n = 0;
    m = i2;
    i2 = n;
    while (i2 < i4)
    {
      View localView = getChildAt(i2);
      i3 = m;
      i = i1;
      n = k;
      if (getLayoutParamsb == 0) {
        if (!G(localView))
        {
          i3 = m;
          i = i1;
          n = k;
        }
        else
        {
          i3 = m + y(localView, paramInt1, m, paramInt2, 0, arrayOfInt);
          i = Math.max(i1, localView.getMeasuredHeight() + r(localView));
          n = View.combineMeasuredStates(k, localView.getMeasuredState());
        }
      }
      i2++;
      m = i3;
      i1 = i;
      k = n;
    }
    int i = F + G;
    i3 = D + E;
    if (G(p))
    {
      y(p, paramInt1, m + i3, paramInt2, i, arrayOfInt);
      i2 = p.getMeasuredWidth();
      i4 = q(p);
      int i5 = p.getMeasuredHeight();
      n = r(p);
      k = View.combineMeasuredStates(k, p.getMeasuredState());
      n = i5 + n;
      i2 += i4;
    }
    else
    {
      n = 0;
      i2 = n;
    }
    if (G(q))
    {
      i2 = Math.max(i2, y(q, paramInt1, m + i3, paramInt2, n + i, arrayOfInt));
      n += q.getMeasuredHeight() + r(q);
      k = View.combineMeasuredStates(k, q.getMeasuredState());
    }
    i1 = Math.max(i1, n);
    i4 = getPaddingLeft();
    i3 = getPaddingRight();
    i = getPaddingTop();
    n = getPaddingBottom();
    i2 = View.resolveSizeAndState(Math.max(m + i2 + (i4 + i3), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & k);
    paramInt1 = View.resolveSizeAndState(Math.max(i1 + (i + n), getSuggestedMinimumHeight()), paramInt2, k << 16);
    if (F()) {
      paramInt1 = j;
    }
    setMeasuredDimension(i2, paramInt1);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof g))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    g localg = (g)paramParcelable;
    super.onRestoreInstanceState(localg.a());
    paramParcelable = o;
    if (paramParcelable != null) {
      paramParcelable = paramParcelable.I();
    } else {
      paramParcelable = null;
    }
    int i = q;
    if ((i != 0) && (a0 != null) && (paramParcelable != null))
    {
      paramParcelable = paramParcelable.findItem(i);
      if (paramParcelable != null) {
        paramParcelable.expandActionView();
      }
    }
    if (r) {
      A();
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    f();
    O localO = H;
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    localO.f(bool);
  }
  
  public Parcelable onSaveInstanceState()
  {
    g localg = new g(super.onSaveInstanceState());
    Object localObject = a0;
    if (localObject != null)
    {
      localObject = p;
      if (localObject != null) {
        q = ((androidx.appcompat.view.menu.e)localObject).getItemId();
      }
    }
    r = v();
    return localg;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      P = false;
    }
    if (!P)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        P = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      P = false;
    }
    return true;
  }
  
  public final int p(int paramInt)
  {
    int i = paramInt & 0x70;
    paramInt = i;
    if (i != 16)
    {
      paramInt = i;
      if (i != 48)
      {
        paramInt = i;
        if (i != 80) {
          paramInt = K & 0x70;
        }
      }
    }
    return paramInt;
  }
  
  public final int q(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return h.b(paramView) + h.a(paramView);
  }
  
  public final int r(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return topMargin + bottomMargin;
  }
  
  public final int s(List paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramList.size();
    int m = 0;
    int n = m;
    while (m < k)
    {
      paramArrayOfInt = (View)paramList.get(m);
      e locale = (e)paramArrayOfInt.getLayoutParams();
      i = leftMargin - i;
      j = rightMargin - j;
      int i1 = Math.max(0, i);
      int i2 = Math.max(0, j);
      i = Math.max(0, -i);
      j = Math.max(0, -j);
      n += i1 + paramArrayOfInt.getMeasuredWidth() + i2;
      m++;
    }
    return n;
  }
  
  public void setCollapseContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setCollapseContentDescription(localCharSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      e();
    }
    ImageButton localImageButton = v;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setCollapseIcon(int paramInt)
  {
    setCollapseIcon(g.a.b(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      e();
      v.setImageDrawable(paramDrawable);
    }
    else
    {
      paramDrawable = v;
      if (paramDrawable != null) {
        paramDrawable.setImageDrawable(t);
      }
    }
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    d0 = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != J)
    {
      J = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != I)
    {
      I = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(g.a.b(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      g();
      if (!u(s)) {
        c(s, true);
      }
    }
    else
    {
      localImageView = s;
      if ((localImageView != null) && (u(localImageView)))
      {
        removeView(s);
        S.remove(s);
      }
    }
    ImageView localImageView = s;
    if (localImageView != null) {
      localImageView.setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      g();
    }
    ImageView localImageView = s;
    if (localImageView != null) {
      localImageView.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setNavigationContentDescription(localCharSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      j();
    }
    ImageButton localImageButton = r;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(g.a.b(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      j();
      if (!u(r)) {
        c(r, true);
      }
    }
    else
    {
      localImageButton = r;
      if ((localImageButton != null) && (u(localImageButton)))
      {
        removeView(r);
        S.remove(r);
      }
    }
    ImageButton localImageButton = r;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    j();
    r.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(f paramf) {}
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    h();
    o.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (y != paramInt)
    {
      y = paramInt;
      if (paramInt == 0) {
        x = getContext();
      } else {
        x = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (q == null)
      {
        Context localContext = getContext();
        localObject = new w(localContext);
        q = ((TextView)localObject);
        ((TextView)localObject).setSingleLine();
        q.setEllipsize(TextUtils.TruncateAt.END);
        int i = A;
        if (i != 0) {
          q.setTextAppearance(localContext, i);
        }
        localObject = O;
        if (localObject != null) {
          q.setTextColor((ColorStateList)localObject);
        }
      }
      if (!u(q)) {
        c(q, true);
      }
    }
    else
    {
      localObject = q;
      if ((localObject != null) && (u((View)localObject)))
      {
        removeView(q);
        S.remove(q);
      }
    }
    Object localObject = q;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    M = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(@NonNull ColorStateList paramColorStateList)
  {
    O = paramColorStateList;
    TextView localTextView = q;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (p == null)
      {
        Context localContext = getContext();
        localObject = new w(localContext);
        p = ((TextView)localObject);
        ((TextView)localObject).setSingleLine();
        p.setEllipsize(TextUtils.TruncateAt.END);
        int i = z;
        if (i != 0) {
          p.setTextAppearance(localContext, i);
        }
        localObject = N;
        if (localObject != null) {
          p.setTextColor((ColorStateList)localObject);
        }
      }
      if (!u(p)) {
        c(p, true);
      }
    }
    else
    {
      localObject = p;
      if ((localObject != null) && (u((View)localObject)))
      {
        removeView(p);
        S.remove(p);
      }
    }
    Object localObject = p;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    L = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    G = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    E = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    D = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    F = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt)
  {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(@NonNull ColorStateList paramColorStateList)
  {
    N = paramColorStateList;
    TextView localTextView = p;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void t(int paramInt)
  {
    getMenuInflater().inflate(paramInt, getMenu());
  }
  
  public final boolean u(View paramView)
  {
    boolean bool;
    if ((paramView.getParent() != this) && (!S.contains(paramView))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean v()
  {
    ActionMenuView localActionMenuView = o;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.F())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int w(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    e locale = (e)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    paramInt1 += Math.max(0, i);
    paramArrayOfInt[0] = Math.max(0, -i);
    i = o(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, i, paramInt1 + paramInt2, paramView.getMeasuredHeight() + i);
    return paramInt1 + (paramInt2 + rightMargin);
  }
  
  public final int x(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    e locale = (e)paramView.getLayoutParams();
    int i = rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = o(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (i + leftMargin);
  }
  
  public final int y(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    int j = rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, width), ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin + paramInt4, height));
    return paramView.getMeasuredWidth() + k;
  }
  
  public final void z(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + leftMargin + rightMargin + paramInt2, width);
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin + paramInt4, height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0)
      {
        paramInt1 = paramInt5;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }
  
  public class a
    implements ActionMenuView.e
  {
    public a() {}
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      getClass();
      return false;
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      H();
    }
  }
  
  public class c
    implements View.OnClickListener
  {
    public c() {}
    
    public void onClick(View paramView)
    {
      d();
    }
  }
  
  public class d
    implements androidx.appcompat.view.menu.g
  {
    public androidx.appcompat.view.menu.d o;
    public androidx.appcompat.view.menu.e p;
    
    public d() {}
    
    public void b(androidx.appcompat.view.menu.d paramd, boolean paramBoolean) {}
    
    public void c(Context paramContext, androidx.appcompat.view.menu.d paramd)
    {
      paramContext = o;
      if (paramContext != null)
      {
        androidx.appcompat.view.menu.e locale = p;
        if (locale != null) {
          paramContext.e(locale);
        }
      }
      o = paramd;
    }
    
    public boolean e(j paramj)
    {
      return false;
    }
    
    public void f(boolean paramBoolean)
    {
      if (p != null)
      {
        androidx.appcompat.view.menu.d locald = o;
        if (locald != null)
        {
          int i = locald.size();
          for (int j = 0; j < i; j++) {
            if (o.getItem(j) == p) {
              return;
            }
          }
        }
        h(o, p);
      }
    }
    
    public boolean g()
    {
      return false;
    }
    
    public boolean h(androidx.appcompat.view.menu.d paramd, androidx.appcompat.view.menu.e parame)
    {
      paramd = w;
      if ((paramd instanceof b)) {
        ((b)paramd).c();
      }
      paramd = Toolbar.this;
      paramd.removeView(w);
      paramd = Toolbar.this;
      paramd.removeView(v);
      paramd = Toolbar.this;
      w = null;
      paramd.a();
      p = null;
      requestLayout();
      parame.q(false);
      return true;
    }
    
    public boolean j(androidx.appcompat.view.menu.d paramd, androidx.appcompat.view.menu.e parame)
    {
      e();
      paramd = v.getParent();
      Object localObject = Toolbar.this;
      if (paramd != localObject)
      {
        if ((paramd instanceof ViewGroup)) {
          ((ViewGroup)paramd).removeView(v);
        }
        paramd = Toolbar.this;
        paramd.addView(v);
      }
      w = parame.getActionView();
      p = parame;
      localObject = w.getParent();
      paramd = Toolbar.this;
      if (localObject != paramd)
      {
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(w);
        }
        paramd = k();
        localObject = Toolbar.this;
        a = (B & 0x70 | 0x800003);
        b = 2;
        w.setLayoutParams(paramd);
        paramd = Toolbar.this;
        paramd.addView(w);
      }
      B();
      requestLayout();
      parame.q(true);
      paramd = w;
      if ((paramd instanceof b)) {
        ((b)paramd).b();
      }
      return true;
    }
  }
  
  public static class e
    extends f.a
  {
    public int b = 0;
    
    public e(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      a = 8388627;
    }
    
    public e(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public e(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public e(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      a(paramMarginLayoutParams);
    }
    
    public e(e parame)
    {
      super();
      b = b;
    }
    
    public e(f.a parama)
    {
      super();
    }
    
    public void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      leftMargin = leftMargin;
      topMargin = topMargin;
      rightMargin = rightMargin;
      bottomMargin = bottomMargin;
    }
  }
  
  public static abstract interface f {}
  
  public static class g
    extends N.a
  {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public int q;
    public boolean r;
    
    public g(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      q = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      r = bool;
    }
    
    public g(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(q);
      paramParcel.writeInt(r);
    }
    
    public class a
      implements Parcelable.ClassLoaderCreator
    {
      public Toolbar.g a(Parcel paramParcel)
      {
        return new Toolbar.g(paramParcel, null);
      }
      
      public Toolbar.g b(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new Toolbar.g(paramParcel, paramClassLoader);
      }
      
      public Toolbar.g[] c(int paramInt)
      {
        return new Toolbar.g[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */