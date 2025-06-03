package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j.a;
import b.a0;
import b.k;
import b.v;
import e0.o;
import g.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.b1;
import l.f1;
import l.h0;
import l.n;
import l.p;
import l.s0;
import l.z0;

public class Toolbar
  extends ViewGroup
  implements e0.j
{
  public int A;
  public s0 B;
  public int C;
  public int D;
  public int E = 8388627;
  public CharSequence F;
  public CharSequence G;
  public ColorStateList H;
  public ColorStateList I;
  public boolean J;
  public boolean K;
  public final ArrayList<View> L = new ArrayList();
  public final ArrayList<View> M = new ArrayList();
  public final int[] N = new int[2];
  public final e0.m O = new e0.m(new k(this, 1));
  public ArrayList<MenuItem> P = new ArrayList();
  public h Q;
  public final a R = new a();
  public d S;
  public a T;
  public f U;
  public j.a V;
  public f.a W;
  public ActionMenuView a;
  public boolean a0;
  public l.d0 b;
  public OnBackInvokedCallback b0;
  public l.d0 c;
  public OnBackInvokedDispatcher c0;
  public n d;
  public boolean d0;
  public p e;
  public final b e0 = new b();
  public Drawable f;
  public CharSequence o;
  public n p;
  public View q;
  public Context r;
  public int s;
  public int t;
  public int u;
  public int v;
  public int w;
  public int x;
  public int y;
  public int z;
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968917);
    Object localObject = getContext();
    int[] arrayOfInt = a0.K;
    localObject = z0.m((Context)localObject, paramAttributeSet, arrayOfInt, 2130968917);
    e0.d0.g(this, paramContext, arrayOfInt, paramAttributeSet, b, 2130968917);
    t = ((z0)localObject).i(28, 0);
    u = ((z0)localObject).i(19, 0);
    int i = E;
    E = b.getInteger(0, i);
    v = b.getInteger(2, 48);
    int j = ((z0)localObject).c(22, 0);
    i = j;
    if (((z0)localObject).l(27)) {
      i = ((z0)localObject).c(27, j);
    }
    A = i;
    z = i;
    y = i;
    x = i;
    i = ((z0)localObject).c(25, -1);
    if (i >= 0) {
      x = i;
    }
    i = ((z0)localObject).c(24, -1);
    if (i >= 0) {
      y = i;
    }
    i = ((z0)localObject).c(26, -1);
    if (i >= 0) {
      z = i;
    }
    i = ((z0)localObject).c(23, -1);
    if (i >= 0) {
      A = i;
    }
    w = ((z0)localObject).d(13, -1);
    j = ((z0)localObject).c(9, Integer.MIN_VALUE);
    int k = ((z0)localObject).c(5, Integer.MIN_VALUE);
    i = ((z0)localObject).d(7, 0);
    int m = ((z0)localObject).d(8, 0);
    if (B == null) {
      B = new s0();
    }
    paramContext = B;
    h = false;
    if (i != Integer.MIN_VALUE)
    {
      e = i;
      a = i;
    }
    if (m != Integer.MIN_VALUE)
    {
      f = m;
      b = m;
    }
    if ((j != Integer.MIN_VALUE) || (k != Integer.MIN_VALUE)) {
      paramContext.a(j, k);
    }
    C = ((z0)localObject).c(10, Integer.MIN_VALUE);
    D = ((z0)localObject).c(6, Integer.MIN_VALUE);
    f = ((z0)localObject).e(4);
    o = ((z0)localObject).k(3);
    paramContext = ((z0)localObject).k(21);
    if (!TextUtils.isEmpty(paramContext)) {
      setTitle(paramContext);
    }
    paramContext = ((z0)localObject).k(18);
    if (!TextUtils.isEmpty(paramContext)) {
      setSubtitle(paramContext);
    }
    r = getContext();
    setPopupTheme(((z0)localObject).i(17, 0));
    paramContext = ((z0)localObject).e(16);
    if (paramContext != null) {
      setNavigationIcon(paramContext);
    }
    paramContext = ((z0)localObject).k(15);
    if (!TextUtils.isEmpty(paramContext)) {
      setNavigationContentDescription(paramContext);
    }
    paramContext = ((z0)localObject).e(11);
    if (paramContext != null) {
      setLogo(paramContext);
    }
    paramContext = ((z0)localObject).k(12);
    if (!TextUtils.isEmpty(paramContext)) {
      setLogoDescription(paramContext);
    }
    if (((z0)localObject).l(29)) {
      setTitleTextColor(((z0)localObject).b(29));
    }
    if (((z0)localObject).l(20)) {
      setSubtitleTextColor(((z0)localObject).b(20));
    }
    if (((z0)localObject).l(14))
    {
      i = ((z0)localObject).i(14, 0);
      getMenuInflater().inflate(i, getMenu());
    }
    ((z0)localObject).n();
  }
  
  public static g g(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof g)) {
      return new g((g)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof a.a)) {
      return new g((a.a)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new g((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new g(paramLayoutParams);
  }
  
  private ArrayList<MenuItem> getCurrentMenuItems()
  {
    ArrayList localArrayList = new ArrayList();
    Menu localMenu = getMenu();
    for (int i = 0; i < localMenu.size(); i++) {
      localArrayList.add(localMenu.getItem(i));
    }
    return localArrayList;
  }
  
  private MenuInflater getMenuInflater()
  {
    return new j.f(getContext());
  }
  
  public static int i(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.getMarginStart();
    return paramView.getMarginEnd() + i;
  }
  
  public static int j(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return topMargin + bottomMargin;
  }
  
  public final void a(int paramInt, ArrayList paramArrayList)
  {
    Object localObject1 = e0.d0.a;
    int i = getLayoutDirection();
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int k = getChildCount();
    int m = Gravity.getAbsoluteGravity(paramInt, getLayoutDirection());
    paramArrayList.clear();
    Object localObject2;
    if (i != 0) {
      for (j = k - 1; j >= 0; j--)
      {
        localObject1 = getChildAt(j);
        localObject2 = (g)((View)localObject1).getLayoutParams();
        if ((b == 0) && (q((View)localObject1)))
        {
          paramInt = a;
          localObject2 = e0.d0.a;
          k = getLayoutDirection();
          i = Gravity.getAbsoluteGravity(paramInt, k) & 0x7;
          paramInt = i;
          if (i != 1)
          {
            paramInt = i;
            if (i != 3)
            {
              paramInt = i;
              if (i != 5) {
                if (k == 1) {
                  paramInt = 5;
                } else {
                  paramInt = 3;
                }
              }
            }
          }
          if (paramInt == m) {
            paramArrayList.add(localObject1);
          }
        }
      }
    }
    while (j < k)
    {
      localObject1 = getChildAt(j);
      localObject2 = (g)((View)localObject1).getLayoutParams();
      if ((b == 0) && (q((View)localObject1)))
      {
        paramInt = a;
        localObject2 = e0.d0.a;
        int n = getLayoutDirection();
        i = Gravity.getAbsoluteGravity(paramInt, n) & 0x7;
        paramInt = i;
        if (i != 1)
        {
          paramInt = i;
          if (i != 3)
          {
            paramInt = i;
            if (i != 5) {
              if (n == 1) {
                paramInt = 5;
              } else {
                paramInt = 3;
              }
            }
          }
        }
        if (paramInt == m) {
          paramArrayList.add(localObject1);
        }
      }
      j++;
    }
  }
  
  public final void addMenuProvider(o paramo)
  {
    e0.m localm = O;
    b.add(paramo);
    a.run();
  }
  
  public final void b(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = new g();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
      localObject = g((ViewGroup.LayoutParams)localObject);
    } else {
      localObject = (g)localObject;
    }
    b = 1;
    if ((paramBoolean) && (q != null))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      M.add(paramView);
    }
    else
    {
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  public final void c()
  {
    if (p == null)
    {
      Object localObject = new n(getContext(), null, 2130968916);
      p = ((n)localObject);
      ((n)localObject).setImageDrawable(f);
      p.setContentDescription(o);
      localObject = new g();
      a = (0x800003 | v & 0x70);
      b = 2;
      p.setLayoutParams((ViewGroup.LayoutParams)localObject);
      p.setOnClickListener(new d());
    }
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof g))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void d()
  {
    e();
    Object localObject = a;
    if (x == null)
    {
      localObject = (androidx.appcompat.view.menu.f)((ActionMenuView)localObject).getMenu();
      if (U == null) {
        U = new f();
      }
      a.setExpandedActionViewsExclusive(true);
      ((androidx.appcompat.view.menu.f)localObject).b(U, r);
      r();
    }
  }
  
  public final void e()
  {
    if (a == null)
    {
      Object localObject = new ActionMenuView(getContext(), null);
      a = ((ActionMenuView)localObject);
      ((ActionMenuView)localObject).setPopupTheme(s);
      a.setOnMenuItemClickListener(R);
      ActionMenuView localActionMenuView = a;
      j.a locala = V;
      localObject = new c();
      C = locala;
      D = ((f.a)localObject);
      localObject = new g();
      a = (0x800005 | v & 0x70);
      a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      b(a, false);
    }
  }
  
  public final void f()
  {
    if (d == null)
    {
      d = new n(getContext(), null, 2130968916);
      g localg = new g();
      a = (0x800003 | v & 0x70);
      d.setLayoutParams(localg);
    }
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new g();
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new g(getContext(), paramAttributeSet);
  }
  
  public CharSequence getCollapseContentDescription()
  {
    Object localObject = p;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Drawable getCollapseIcon()
  {
    Object localObject = p;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public int getContentInsetEnd()
  {
    s0 locals0 = B;
    int i;
    if (locals0 != null)
    {
      if (g) {
        i = a;
      } else {
        i = b;
      }
    }
    else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = D;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getContentInsetLeft()
  {
    s0 locals0 = B;
    int i;
    if (locals0 != null) {
      i = a;
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetRight()
  {
    s0 locals0 = B;
    int i;
    if (locals0 != null) {
      i = b;
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStart()
  {
    s0 locals0 = B;
    int i;
    if (locals0 != null)
    {
      if (g) {
        i = b;
      } else {
        i = a;
      }
    }
    else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = C;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = x;
      if ((localObject != null) && (((androidx.appcompat.view.menu.f)localObject).hasVisibleItems()))
      {
        i = 1;
        break label32;
      }
    }
    int i = 0;
    label32:
    if (i != 0) {
      i = Math.max(getContentInsetEnd(), Math.max(D, 0));
    } else {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getCurrentContentInsetLeft()
  {
    WeakHashMap localWeakHashMap = e0.d0.a;
    int i;
    if (getLayoutDirection() == 1) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetRight()
  {
    WeakHashMap localWeakHashMap = e0.d0.a;
    int i;
    if (getLayoutDirection() == 1) {
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
      i = Math.max(getContentInsetStart(), Math.max(C, 0));
    } else {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public Drawable getLogo()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Menu getMenu()
  {
    d();
    return a.getMenu();
  }
  
  public View getNavButtonView()
  {
    return d;
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = d;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = d;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public a getOuterActionMenuPresenter()
  {
    return T;
  }
  
  public Drawable getOverflowIcon()
  {
    d();
    return a.getOverflowIcon();
  }
  
  public Context getPopupContext()
  {
    return r;
  }
  
  public int getPopupTheme()
  {
    return s;
  }
  
  public CharSequence getSubtitle()
  {
    return G;
  }
  
  public final TextView getSubtitleTextView()
  {
    return c;
  }
  
  public CharSequence getTitle()
  {
    return F;
  }
  
  public int getTitleMarginBottom()
  {
    return A;
  }
  
  public int getTitleMarginEnd()
  {
    return y;
  }
  
  public int getTitleMarginStart()
  {
    return x;
  }
  
  public int getTitleMarginTop()
  {
    return z;
  }
  
  public final TextView getTitleTextView()
  {
    return b;
  }
  
  public h0 getWrapper()
  {
    if (S == null) {
      S = new d(this, true);
    }
    return S;
  }
  
  public final int h(int paramInt, View paramView)
  {
    g localg = (g)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int j = a & 0x70;
    int k = j;
    if (j != 16)
    {
      k = j;
      if (j != 48)
      {
        k = j;
        if (j != 80) {
          k = E & 0x70;
        }
      }
    }
    if (k != 48)
    {
      if (k != 80)
      {
        j = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        k = (n - j - m - i) / 2;
        paramInt = topMargin;
        if (k >= paramInt)
        {
          n = n - m - i - k - j;
          i = bottomMargin;
          paramInt = k;
          if (n < i) {
            paramInt = Math.max(0, k - (i - n));
          }
        }
        return j + paramInt;
      }
      return getHeight() - getPaddingBottom() - i - bottomMargin - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  public final void k()
  {
    Object localObject1 = P.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (MenuItem)((Iterator)localObject1).next();
      getMenu().removeItem(((MenuItem)localObject2).getItemId());
    }
    Object localObject2 = getMenu();
    localObject1 = getCurrentMenuItems();
    Object localObject3 = O;
    MenuInflater localMenuInflater = getMenuInflater();
    localObject3 = b.iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((o)((Iterator)localObject3).next()).c((Menu)localObject2, localMenuInflater);
    }
    localObject2 = getCurrentMenuItems();
    ((ArrayList)localObject2).removeAll((Collection)localObject1);
    P = ((ArrayList)localObject2);
  }
  
  public final boolean l(View paramView)
  {
    boolean bool;
    if ((paramView.getParent() != this) && (!M.contains(paramView))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final int m(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    g localg = (g)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramInt2 = h(paramInt2, paramView);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return i + rightMargin + paramInt1;
  }
  
  public final int n(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    g localg = (g)paramView.getLayoutParams();
    int i = rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = h(paramInt2, paramView);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (i + leftMargin);
  }
  
  public final int o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    int j = rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i);
    k = Math.max(0, j) + k;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    j = getPaddingLeft();
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + j + k + paramInt2, width);
    paramInt2 = getPaddingTop();
    paramView.measure(paramInt1, ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt2 + topMargin + bottomMargin + paramInt4, height));
    return paramView.getMeasuredWidth() + k;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    r();
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(e0);
    r();
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      K = false;
    }
    if (!K)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        K = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      K = false;
    }
    return true;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = e0.d0.a;
    if (getLayoutDirection() == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getWidth();
    int k = getHeight();
    paramInt3 = getPaddingLeft();
    int m = getPaddingRight();
    int n = getPaddingTop();
    int i1 = getPaddingBottom();
    int i2 = j - m;
    int[] arrayOfInt = N;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = getMinimumHeight();
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    }
    if (q(d))
    {
      localObject1 = d;
      if (i != 0)
      {
        i3 = n((View)localObject1, i2, paramInt4, arrayOfInt);
        i4 = paramInt3;
        break label174;
      }
      i4 = m((View)localObject1, paramInt3, paramInt4, arrayOfInt);
    }
    else
    {
      i4 = paramInt3;
    }
    int i3 = i2;
    label174:
    paramInt1 = i4;
    paramInt2 = i3;
    if (q(p))
    {
      localObject1 = p;
      if (i != 0)
      {
        paramInt2 = n((View)localObject1, i3, paramInt4, arrayOfInt);
        paramInt1 = i4;
      }
      else
      {
        paramInt1 = m((View)localObject1, i4, paramInt4, arrayOfInt);
        paramInt2 = i3;
      }
    }
    i3 = paramInt1;
    int i4 = paramInt2;
    if (q(a))
    {
      localObject1 = a;
      if (i != 0)
      {
        i3 = m((View)localObject1, paramInt1, paramInt4, arrayOfInt);
        i4 = paramInt2;
      }
      else
      {
        i4 = n((View)localObject1, paramInt2, paramInt4, arrayOfInt);
        i3 = paramInt1;
      }
    }
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - i3);
    arrayOfInt[1] = Math.max(0, paramInt1 - (i2 - i4));
    i3 = Math.max(i3, paramInt2);
    i4 = Math.min(i4, i2 - paramInt1);
    paramInt2 = i3;
    paramInt1 = i4;
    if (q(q))
    {
      localObject1 = q;
      if (i != 0)
      {
        paramInt1 = n((View)localObject1, i4, paramInt4, arrayOfInt);
        paramInt2 = i3;
      }
      else
      {
        paramInt2 = m((View)localObject1, i3, paramInt4, arrayOfInt);
        paramInt1 = i4;
      }
    }
    i4 = paramInt2;
    i3 = paramInt1;
    if (q(e))
    {
      localObject1 = e;
      if (i != 0)
      {
        i3 = n((View)localObject1, paramInt1, paramInt4, arrayOfInt);
        i4 = paramInt2;
      }
      else
      {
        i4 = m((View)localObject1, paramInt2, paramInt4, arrayOfInt);
        i3 = paramInt1;
      }
    }
    boolean bool = q(b);
    paramBoolean = q(c);
    if (bool)
    {
      localObject1 = (g)b.getLayoutParams();
      paramInt1 = topMargin;
      paramInt1 = b.getMeasuredHeight() + paramInt1 + bottomMargin + 0;
    }
    else
    {
      paramInt1 = 0;
    }
    if (paramBoolean)
    {
      localObject1 = (g)c.getLayoutParams();
      paramInt2 = topMargin;
      paramInt1 += c.getMeasuredHeight() + paramInt2 + bottomMargin;
    }
    if ((!bool) && (!paramBoolean))
    {
      paramInt2 = i4;
      paramInt1 = i3;
    }
    else
    {
      if (bool) {
        localObject1 = b;
      } else {
        localObject1 = c;
      }
      if (paramBoolean) {
        localObject2 = c;
      } else {
        localObject2 = b;
      }
      localObject1 = (g)((View)localObject1).getLayoutParams();
      localObject2 = (g)((View)localObject2).getLayoutParams();
      if (((bool) && (b.getMeasuredWidth() > 0)) || ((paramBoolean) && (c.getMeasuredWidth() > 0))) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      paramInt2 = E & 0x70;
      if (paramInt2 != 48)
      {
        if (paramInt2 != 80)
        {
          paramInt2 = (k - n - i1 - paramInt1) / 2;
          i5 = topMargin + z;
          if (paramInt2 < i5)
          {
            paramInt1 = i5;
          }
          else
          {
            i5 = k - i1 - paramInt1 - paramInt2 - n;
            i1 = bottomMargin;
            k = A;
            paramInt1 = paramInt2;
            if (i5 < i1 + k) {
              paramInt1 = Math.max(0, paramInt2 - (bottomMargin + k - i5));
            }
          }
          paramInt1 = n + paramInt1;
        }
        else
        {
          paramInt1 = k - i1 - bottomMargin - A - paramInt1;
        }
      }
      else {
        paramInt1 = getPaddingTop() + topMargin + z;
      }
      if (i != 0)
      {
        if (i2 != 0) {
          paramInt2 = x;
        } else {
          paramInt2 = 0;
        }
        paramInt2 -= arrayOfInt[1];
        i3 -= Math.max(0, paramInt2);
        arrayOfInt[1] = Math.max(0, -paramInt2);
        if (bool)
        {
          localObject1 = (g)b.getLayoutParams();
          i = i3 - b.getMeasuredWidth();
          paramInt2 = b.getMeasuredHeight() + paramInt1;
          b.layout(i, paramInt1, i3, paramInt2);
          i -= y;
          paramInt1 = paramInt2 + bottomMargin;
        }
        else
        {
          i = i3;
        }
        if (paramBoolean)
        {
          paramInt1 += c.getLayoutParams()).topMargin;
          i5 = c.getMeasuredWidth();
          paramInt2 = c.getMeasuredHeight();
          c.layout(i3 - i5, paramInt1, i3, paramInt2 + paramInt1);
          i5 = i3 - y;
        }
        else
        {
          i5 = i3;
        }
        paramInt2 = i4;
        paramInt1 = i3;
        if (i2 != 0)
        {
          paramInt1 = Math.min(i, i5);
          paramInt2 = i4;
        }
      }
      else
      {
        if (i2 != 0) {
          paramInt2 = x;
        } else {
          paramInt2 = 0;
        }
        i = paramInt2 - arrayOfInt[0];
        paramInt2 = i4 + Math.max(0, i);
        arrayOfInt[0] = Math.max(0, -i);
        if (bool)
        {
          localObject1 = (g)b.getLayoutParams();
          i4 = b.getMeasuredWidth() + paramInt2;
          i = b.getMeasuredHeight() + paramInt1;
          b.layout(paramInt2, paramInt1, i4, i);
          i4 += y;
          paramInt1 = i + bottomMargin;
        }
        else
        {
          i4 = paramInt2;
        }
        if (paramBoolean)
        {
          i5 = paramInt1 + c.getLayoutParams()).topMargin;
          paramInt1 = c.getMeasuredWidth() + paramInt2;
          i = c.getMeasuredHeight();
          c.layout(paramInt2, i5, paramInt1, i + i5);
          i = paramInt1 + y;
        }
        else
        {
          i = paramInt2;
        }
        paramInt1 = i3;
        if (i2 != 0)
        {
          paramInt2 = Math.max(i4, i);
          paramInt1 = i3;
        }
      }
    }
    int i = paramInt4;
    i2 = paramInt3;
    a(3, L);
    paramInt4 = L.size();
    for (paramInt3 = 0; paramInt3 < paramInt4; paramInt3++) {
      paramInt2 = m((View)L.get(paramInt3), paramInt2, i, arrayOfInt);
    }
    a(5, L);
    paramInt4 = L.size();
    for (paramInt3 = 0; paramInt3 < paramInt4; paramInt3++) {
      paramInt1 = n((View)L.get(paramInt3), paramInt1, i, arrayOfInt);
    }
    a(1, L);
    Object localObject2 = L;
    i3 = arrayOfInt[0];
    i4 = arrayOfInt[1];
    int i5 = ((ArrayList)localObject2).size();
    paramInt4 = 0;
    paramInt3 = 0;
    while (paramInt4 < i5)
    {
      View localView = (View)((ArrayList)localObject2).get(paramInt4);
      localObject1 = (g)localView.getLayoutParams();
      i3 = leftMargin - i3;
      i4 = rightMargin - i4;
      i1 = Math.max(0, i3);
      n = Math.max(0, i4);
      i3 = Math.max(0, -i3);
      i4 = Math.max(0, -i4);
      paramInt3 += localView.getMeasuredWidth() + i1 + n;
      paramInt4++;
    }
    paramInt4 = (j - i2 - m) / 2 + i2 - paramInt3 / 2;
    paramInt3 += paramInt4;
    if (paramInt4 < paramInt2) {
      paramInt1 = paramInt2;
    } else if (paramInt3 > paramInt1) {
      paramInt1 = paramInt4 - (paramInt3 - paramInt1);
    } else {
      paramInt1 = paramInt4;
    }
    paramInt4 = L.size();
    paramInt3 = 0;
    paramInt2 = paramInt1;
    for (paramInt1 = paramInt3; paramInt1 < paramInt4; paramInt1++) {
      paramInt2 = m((View)L.get(paramInt1), paramInt2, i, arrayOfInt);
    }
    L.clear();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = N;
    boolean bool1 = f1.a(this);
    boolean bool2 = q(d);
    int j = 0;
    if (bool2)
    {
      p(d, paramInt1, 0, paramInt2, w);
      k = d.getMeasuredWidth();
      k = i(d) + k;
      m = d.getMeasuredHeight();
      n = Math.max(0, j(d) + m);
      i1 = View.combineMeasuredStates(0, d.getMeasuredState());
    }
    else
    {
      k = 0;
      n = k;
      i1 = n;
    }
    int i2 = k;
    int m = n;
    int k = i1;
    if (q(p))
    {
      p(p, paramInt1, 0, paramInt2, w);
      k = p.getMeasuredWidth();
      i2 = i(p) + k;
      k = p.getMeasuredHeight();
      m = Math.max(n, j(p) + k);
      k = View.combineMeasuredStates(i1, p.getMeasuredState());
    }
    int i1 = getCurrentContentInsetStart();
    int n = Math.max(i1, i2) + 0;
    arrayOfInt[bool1] = Math.max(0, i1 - i2);
    if (q(a))
    {
      p(a, paramInt1, n, paramInt2, w);
      i1 = a.getMeasuredWidth();
      i1 = i(a) + i1;
      i2 = a.getMeasuredHeight();
      m = Math.max(m, j(a) + i2);
      k = View.combineMeasuredStates(k, a.getMeasuredState());
    }
    else
    {
      i1 = 0;
    }
    i2 = getCurrentContentInsetEnd();
    int i3 = n + Math.max(i2, i1);
    arrayOfInt[(bool1 ^ true)] = Math.max(0, i2 - i1);
    n = m;
    i1 = k;
    i2 = i3;
    if (q(q))
    {
      i2 = i3 + o(q, paramInt1, i3, paramInt2, 0, arrayOfInt);
      i1 = q.getMeasuredHeight();
      n = Math.max(m, j(q) + i1);
      i1 = View.combineMeasuredStates(k, q.getMeasuredState());
    }
    i3 = n;
    k = i1;
    m = i2;
    if (q(e))
    {
      m = i2 + o(e, paramInt1, i2, paramInt2, 0, arrayOfInt);
      k = e.getMeasuredHeight();
      i3 = Math.max(n, j(e) + k);
      k = View.combineMeasuredStates(i1, e.getMeasuredState());
    }
    int i4 = getChildCount();
    i1 = 0;
    View localView;
    for (n = m; i1 < i4; n = m)
    {
      localView = getChildAt(i1);
      bool1 = i3;
      i2 = k;
      m = n;
      if (getLayoutParamsb == 0) {
        if (!q(localView))
        {
          bool1 = i3;
          i2 = k;
          m = n;
        }
        else
        {
          m = n + o(localView, paramInt1, n, paramInt2, 0, arrayOfInt);
          n = localView.getMeasuredHeight();
          i = Math.max(i3, j(localView) + n);
          i2 = View.combineMeasuredStates(k, localView.getMeasuredState());
        }
      }
      i1++;
      i3 = i;
      k = i2;
    }
    int i = z + A;
    i2 = x + y;
    if (q(b))
    {
      o(b, paramInt1, n + i2, paramInt2, i, arrayOfInt);
      i1 = b.getMeasuredWidth();
      i4 = i(b);
      m = b.getMeasuredHeight();
      int i5 = j(b);
      k = View.combineMeasuredStates(k, b.getMeasuredState());
      m = i5 + m;
      i1 = i4 + i1;
    }
    else
    {
      m = 0;
      i1 = m;
    }
    if (q(c))
    {
      i1 = Math.max(i1, o(c, paramInt1, n + i2, paramInt2, m + i, arrayOfInt));
      i2 = c.getMeasuredHeight();
      m += j(c) + i2;
      k = View.combineMeasuredStates(k, c.getMeasuredState());
    }
    i3 = Math.max(i3, m);
    m = getPaddingLeft();
    i4 = getPaddingRight();
    i = getPaddingTop();
    i2 = getPaddingBottom();
    m = View.resolveSizeAndState(Math.max(i4 + m + (n + i1), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & k);
    paramInt2 = View.resolveSizeAndState(Math.max(i2 + i + i3, getSuggestedMinimumHeight()), paramInt2, k << 16);
    if (a0) {
      k = getChildCount();
    }
    for (paramInt1 = 0; paramInt1 < k; paramInt1++)
    {
      localView = getChildAt(paramInt1);
      if ((q(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0))
      {
        paramInt1 = 0;
        break label1047;
      }
    }
    paramInt1 = 1;
    label1047:
    if (paramInt1 != 0) {
      paramInt1 = j;
    } else {
      paramInt1 = paramInt2;
    }
    setMeasuredDimension(m, paramInt1);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof i))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    i locali = (i)paramParcelable;
    super.onRestoreInstanceState(a);
    paramParcelable = a;
    if (paramParcelable != null) {
      paramParcelable = x;
    } else {
      paramParcelable = null;
    }
    int i = c;
    if ((i != 0) && (U != null) && (paramParcelable != null))
    {
      paramParcelable = paramParcelable.findItem(i);
      if (paramParcelable != null) {
        paramParcelable.expandActionView();
      }
    }
    if (d)
    {
      removeCallbacks(e0);
      post(e0);
    }
  }
  
  public final void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    if (B == null) {
      B = new s0();
    }
    s0 locals0 = B;
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    if (bool != g)
    {
      g = bool;
      if (h)
      {
        if (bool)
        {
          paramInt = d;
          if (paramInt == Integer.MIN_VALUE) {
            paramInt = e;
          }
          a = paramInt;
          paramInt = c;
          if (paramInt != Integer.MIN_VALUE) {
            break label156;
          }
        }
        else
        {
          paramInt = c;
          if (paramInt == Integer.MIN_VALUE) {
            paramInt = e;
          }
          a = paramInt;
          paramInt = d;
          if (paramInt != Integer.MIN_VALUE) {
            break label156;
          }
        }
      }
      else {
        a = e;
      }
      paramInt = f;
      label156:
      b = paramInt;
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    i locali = new i(super.onSaveInstanceState());
    Object localObject = U;
    if (localObject != null)
    {
      localObject = b;
      if (localObject != null) {
        c = a;
      }
    }
    localObject = a;
    boolean bool = true;
    if (localObject != null)
    {
      localObject = B;
      int i;
      if ((localObject != null) && (((a)localObject).k())) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {}
    }
    else
    {
      bool = false;
    }
    d = bool;
    return locali;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      J = false;
    }
    if (!J)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        J = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      J = false;
    }
    return true;
  }
  
  public final void p(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + leftMargin + rightMargin + paramInt2, width);
    paramInt1 = getPaddingTop();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + topMargin + bottomMargin + 0, height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }
  
  public final boolean q(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void r()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      OnBackInvokedDispatcher localOnBackInvokedDispatcher = e.a(this);
      Object localObject = U;
      int i = 0;
      int j;
      if ((localObject != null) && (b != null)) {
        j = 1;
      } else {
        j = 0;
      }
      int k = i;
      if (j != 0)
      {
        k = i;
        if (localOnBackInvokedDispatcher != null)
        {
          localObject = e0.d0.a;
          k = i;
          if (isAttachedToWindow())
          {
            k = i;
            if (d0) {
              k = 1;
            }
          }
        }
      }
      if ((k != 0) && (c0 == null))
      {
        if (b0 == null) {
          b0 = e.b(new b.m(this, 1));
        }
        e.c(localOnBackInvokedDispatcher, b0);
      }
      else
      {
        if (k != 0) {
          return;
        }
        localOnBackInvokedDispatcher = c0;
        if (localOnBackInvokedDispatcher == null) {
          return;
        }
        e.d(localOnBackInvokedDispatcher, b0);
        localOnBackInvokedDispatcher = null;
      }
      c0 = localOnBackInvokedDispatcher;
    }
  }
  
  public final void removeMenuProvider(o paramo)
  {
    O.a(paramo);
  }
  
  public void setBackInvokedCallbackEnabled(boolean paramBoolean)
  {
    if (d0 != paramBoolean)
    {
      d0 = paramBoolean;
      r();
    }
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
      c();
    }
    n localn = p;
    if (localn != null) {
      localn.setContentDescription(paramCharSequence);
    }
  }
  
  public void setCollapseIcon(int paramInt)
  {
    setCollapseIcon(x6.b.X(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      c();
      p.setImageDrawable(paramDrawable);
    }
    else
    {
      paramDrawable = p;
      if (paramDrawable != null) {
        paramDrawable.setImageDrawable(f);
      }
    }
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    a0 = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != D)
    {
      D = i;
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
    if (i != C)
    {
      C = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(x6.b.X(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      if (e == null) {
        e = new p(getContext());
      }
      if (!l(e)) {
        b(e, true);
      }
    }
    else
    {
      localp = e;
      if ((localp != null) && (l(localp)))
      {
        removeView(e);
        M.remove(e);
      }
    }
    p localp = e;
    if (localp != null) {
      localp.setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if ((!TextUtils.isEmpty(paramCharSequence)) && (e == null)) {
      e = new p(getContext());
    }
    p localp = e;
    if (localp != null) {
      localp.setContentDescription(paramCharSequence);
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
      f();
    }
    n localn = d;
    if (localn != null)
    {
      localn.setContentDescription(paramCharSequence);
      b1.a(d, paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(x6.b.X(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      f();
      if (!l(d)) {
        b(d, true);
      }
    }
    else
    {
      localn = d;
      if ((localn != null) && (l(localn)))
      {
        removeView(d);
        M.remove(d);
      }
    }
    n localn = d;
    if (localn != null) {
      localn.setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    f();
    d.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(h paramh)
  {
    Q = paramh;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    d();
    a.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (s != paramInt)
    {
      s = paramInt;
      if (paramInt == 0) {
        r = getContext();
      } else {
        r = new ContextThemeWrapper(getContext(), paramInt);
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
      if (c == null)
      {
        Context localContext = getContext();
        localObject = new l.d0(localContext, null);
        c = ((l.d0)localObject);
        ((TextView)localObject).setSingleLine();
        c.setEllipsize(TextUtils.TruncateAt.END);
        int i = u;
        if (i != 0) {
          c.setTextAppearance(localContext, i);
        }
        localObject = I;
        if (localObject != null) {
          c.setTextColor((ColorStateList)localObject);
        }
      }
      if (!l(c)) {
        b(c, true);
      }
    }
    else
    {
      localObject = c;
      if ((localObject != null) && (l((View)localObject)))
      {
        removeView(c);
        M.remove(c);
      }
    }
    Object localObject = c;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    G = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList)
  {
    I = paramColorStateList;
    l.d0 locald0 = c;
    if (locald0 != null) {
      locald0.setTextColor(paramColorStateList);
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
      if (b == null)
      {
        Context localContext = getContext();
        localObject = new l.d0(localContext, null);
        b = ((l.d0)localObject);
        ((TextView)localObject).setSingleLine();
        b.setEllipsize(TextUtils.TruncateAt.END);
        int i = t;
        if (i != 0) {
          b.setTextAppearance(localContext, i);
        }
        localObject = H;
        if (localObject != null) {
          b.setTextColor((ColorStateList)localObject);
        }
      }
      if (!l(b)) {
        b(b, true);
      }
    }
    else
    {
      localObject = b;
      if ((localObject != null) && (l((View)localObject)))
      {
        removeView(b);
        M.remove(b);
      }
    }
    Object localObject = b;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    F = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    A = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    y = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    x = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    z = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt)
  {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList)
  {
    H = paramColorStateList;
    l.d0 locald0 = b;
    if (locald0 != null) {
      locald0.setTextColor(paramColorStateList);
    }
  }
  
  public final class a
    implements ActionMenuView.e
  {
    public a() {}
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      Object localObject = a;
      if (localObject != null)
      {
        localObject = B;
        if (localObject != null) {
          ((a)localObject).l();
        }
      }
    }
  }
  
  public final class c
    implements f.a
  {
    public c() {}
    
    public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
    {
      f.a locala = W;
      boolean bool;
      if ((locala != null) && (locala.a(paramf, paramMenuItem))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void b(androidx.appcompat.view.menu.f paramf)
    {
      Object localObject = a.B;
      int i;
      if ((localObject != null) && (((a)localObject).k())) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        localObject = O.b.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((o)((Iterator)localObject).next()).d(paramf);
        }
      }
      localObject = W;
      if (localObject != null) {
        ((f.a)localObject).b(paramf);
      }
    }
  }
  
  public final class d
    implements View.OnClickListener
  {
    public d() {}
    
    public final void onClick(View paramView)
    {
      paramView = U;
      if (paramView == null) {
        paramView = null;
      } else {
        paramView = b;
      }
      if (paramView != null) {
        paramView.collapseActionView();
      }
    }
  }
  
  public static final class e
  {
    public static OnBackInvokedDispatcher a(View paramView)
    {
      return paramView.findOnBackInvokedDispatcher();
    }
    
    public static OnBackInvokedCallback b(Runnable paramRunnable)
    {
      Objects.requireNonNull(paramRunnable);
      return new v(paramRunnable, 1);
    }
    
    public static void c(Object paramObject1, Object paramObject2)
    {
      ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)paramObject2);
    }
    
    public static void d(Object paramObject1, Object paramObject2)
    {
      ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
    }
  }
  
  public final class f
    implements androidx.appcompat.view.menu.j
  {
    public androidx.appcompat.view.menu.f a;
    public h b;
    
    public f() {}
    
    public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean) {}
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean e(h paramh)
    {
      Object localObject = q;
      if ((localObject instanceof j.b)) {
        ((j.b)localObject).onActionViewCollapsed();
      }
      localObject = Toolbar.this;
      ((ViewGroup)localObject).removeView(q);
      localObject = Toolbar.this;
      ((ViewGroup)localObject).removeView(p);
      localObject = Toolbar.this;
      q = null;
      int i = M.size();
      for (;;)
      {
        i--;
        if (i < 0) {
          break;
        }
        ((ViewGroup)localObject).addView((View)M.get(i));
      }
      M.clear();
      b = null;
      requestLayout();
      C = false;
      n.p(false);
      r();
      return true;
    }
    
    public final void f(Context paramContext, androidx.appcompat.view.menu.f paramf)
    {
      paramContext = a;
      if (paramContext != null)
      {
        h localh = b;
        if (localh != null) {
          paramContext.d(localh);
        }
      }
      a = paramf;
    }
    
    public final void g()
    {
      if (b != null)
      {
        androidx.appcompat.view.menu.f localf = a;
        int i = 0;
        int j = i;
        if (localf != null)
        {
          int k = localf.size();
          for (int m = 0;; m++)
          {
            j = i;
            if (m >= k) {
              break;
            }
            if (a.getItem(m) == b)
            {
              j = 1;
              break;
            }
          }
        }
        if (j == 0) {
          e(b);
        }
      }
    }
    
    public final boolean i(androidx.appcompat.view.menu.m paramm)
    {
      return false;
    }
    
    public final boolean j(h paramh)
    {
      c();
      Object localObject1 = p.getParent();
      Object localObject2 = Toolbar.this;
      if (localObject1 != localObject2)
      {
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(p);
        }
        localObject2 = Toolbar.this;
        ((ViewGroup)localObject2).addView(p);
      }
      q = paramh.getActionView();
      b = paramh;
      localObject2 = q.getParent();
      localObject1 = Toolbar.this;
      if (localObject2 != localObject1)
      {
        if ((localObject2 instanceof ViewGroup)) {
          ((ViewGroup)localObject2).removeView(q);
        }
        getClass();
        localObject1 = new Toolbar.g();
        localObject2 = Toolbar.this;
        a = (0x800003 | v & 0x70);
        b = 2;
        q.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localObject2 = Toolbar.this;
        ((ViewGroup)localObject2).addView(q);
      }
      localObject2 = Toolbar.this;
      int i = ((ViewGroup)localObject2).getChildCount();
      for (;;)
      {
        int j = i - 1;
        if (j < 0) {
          break;
        }
        localObject1 = ((ViewGroup)localObject2).getChildAt(j);
        i = j;
        if (getLayoutParamsb != 2)
        {
          i = j;
          if (localObject1 != a)
          {
            ((ViewGroup)localObject2).removeViewAt(j);
            M.add(localObject1);
            i = j;
          }
        }
      }
      requestLayout();
      C = true;
      n.p(false);
      paramh = q;
      if ((paramh instanceof j.b)) {
        ((j.b)paramh).onActionViewExpanded();
      }
      r();
      return true;
    }
  }
  
  public static final class g
    extends a.a
  {
    public int b = 0;
    
    public g()
    {
      a = 8388627;
    }
    
    public g(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public g(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public g(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      leftMargin = leftMargin;
      topMargin = topMargin;
      rightMargin = rightMargin;
      bottomMargin = bottomMargin;
    }
    
    public g(g paramg)
    {
      super();
      b = b;
    }
    
    public g(a.a parama)
    {
      super();
    }
  }
  
  public static abstract interface h {}
  
  public static final class i
    extends n0.a
  {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public int c;
    public boolean d;
    
    public i(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      c = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      d = bool;
    }
    
    public i(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable(a, paramInt);
      paramParcel.writeInt(c);
      paramParcel.writeInt(d);
    }
    
    public final class a
      implements Parcelable.ClassLoaderCreator<Toolbar.i>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new Toolbar.i(paramParcel, null);
      }
      
      public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new Toolbar.i(paramParcel, paramClassLoader);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new Toolbar.i[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */