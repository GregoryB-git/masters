package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R.attr;
import androidx.coordinatorlayout.R.style;
import androidx.coordinatorlayout.R.styleable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z2;

public class CoordinatorLayout
  extends ViewGroup
  implements NestedScrollingParent2, NestedScrollingParent3
{
  public static final Class<?>[] CONSTRUCTOR_PARAMS = { Context.class, AttributeSet.class };
  public static final int EVENT_NESTED_SCROLL = 1;
  public static final int EVENT_PRE_DRAW = 0;
  public static final int EVENT_VIEW_REMOVED = 2;
  public static final String TAG = "CoordinatorLayout";
  public static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
  private static final int TYPE_ON_INTERCEPT = 0;
  private static final int TYPE_ON_TOUCH = 1;
  public static final String WIDGET_PACKAGE_NAME;
  public static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors = new ThreadLocal();
  private static final Pools.Pool<Rect> sRectPool = new Pools.SynchronizedPool(12);
  private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
  private final int[] mBehaviorConsumed = new int[2];
  private View mBehaviorTouchView;
  private final DirectedAcyclicGraph<View> mChildDag = new DirectedAcyclicGraph();
  private final List<View> mDependencySortedChildren = new ArrayList();
  private boolean mDisallowInterceptReset;
  private boolean mDrawStatusBarBackground;
  private boolean mIsAttachedToWindow;
  private int[] mKeylines;
  private WindowInsetsCompat mLastInsets;
  private boolean mNeedsPreDrawListener;
  private final NestedScrollingParentHelper mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
  private View mNestedScrollingTarget;
  private final int[] mNestedScrollingV2ConsumedCompat = new int[2];
  public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
  private OnPreDrawListener mOnPreDrawListener;
  private Paint mScrimPaint;
  private Drawable mStatusBarBackground;
  private final List<View> mTempDependenciesList = new ArrayList();
  private final List<View> mTempList1 = new ArrayList();
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null) {
      localObject = ((Package)localObject).getName();
    } else {
      localObject = null;
    }
    WIDGET_PACKAGE_NAME = (String)localObject;
    TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
  }
  
  public CoordinatorLayout(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.coordinatorLayoutStyle);
  }
  
  public CoordinatorLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, @AttrRes int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = 0;
    TypedArray localTypedArray;
    if (paramInt == 0) {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
    } else {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout, paramInt, 0);
    }
    if (Build.VERSION.SDK_INT >= 29) {
      if (paramInt == 0) {
        saveAttributeDataForStyleable(paramContext, R.styleable.CoordinatorLayout, paramAttributeSet, localTypedArray, 0, R.style.Widget_Support_CoordinatorLayout);
      } else {
        saveAttributeDataForStyleable(paramContext, R.styleable.CoordinatorLayout, paramAttributeSet, localTypedArray, paramInt, 0);
      }
    }
    paramInt = localTypedArray.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getResources();
      mKeylines = paramContext.getIntArray(paramInt);
      float f = getDisplayMetricsdensity;
      int j = mKeylines.length;
      for (paramInt = i; paramInt < j; paramInt++)
      {
        paramContext = mKeylines;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f));
      }
    }
    mStatusBarBackground = localTypedArray.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
    localTypedArray.recycle();
    setupForInsets();
    super.setOnHierarchyChangeListener(new HierarchyChangeListener());
    if (ViewCompat.getImportantForAccessibility(this) == 0) {
      ViewCompat.setImportantForAccessibility(this, 1);
    }
  }
  
  @NonNull
  private static Rect acquireTempRect()
  {
    Rect localRect1 = (Rect)sRectPool.acquire();
    Rect localRect2 = localRect1;
    if (localRect1 == null) {
      localRect2 = new Rect();
    }
    return localRect2;
  }
  
  private static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    return paramInt1;
  }
  
  private void constrainChildRect(LayoutParams paramLayoutParams, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getWidth();
    int j = getHeight();
    i = Math.max(getPaddingLeft() + leftMargin, Math.min(left, i - getPaddingRight() - paramInt1 - rightMargin));
    j = Math.max(getPaddingTop() + topMargin, Math.min(top, j - getPaddingBottom() - paramInt2 - bottomMargin));
    paramRect.set(i, j, paramInt1 + i, paramInt2 + j);
  }
  
  private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat paramWindowInsetsCompat)
  {
    if (paramWindowInsetsCompat.isConsumed()) {
      return paramWindowInsetsCompat;
    }
    int i = 0;
    int j = getChildCount();
    WindowInsetsCompat localWindowInsetsCompat;
    for (;;)
    {
      localWindowInsetsCompat = paramWindowInsetsCompat;
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      localWindowInsetsCompat = paramWindowInsetsCompat;
      if (ViewCompat.getFitsSystemWindows(localView))
      {
        Behavior localBehavior = ((LayoutParams)localView.getLayoutParams()).getBehavior();
        localWindowInsetsCompat = paramWindowInsetsCompat;
        if (localBehavior != null)
        {
          paramWindowInsetsCompat = localBehavior.onApplyWindowInsets(this, localView, paramWindowInsetsCompat);
          localWindowInsetsCompat = paramWindowInsetsCompat;
          if (paramWindowInsetsCompat.isConsumed())
          {
            localWindowInsetsCompat = paramWindowInsetsCompat;
            break;
          }
        }
      }
      i++;
      paramWindowInsetsCompat = localWindowInsetsCompat;
    }
    return localWindowInsetsCompat;
  }
  
  private void getDesiredAnchoredChildRectWithoutConstraints(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, LayoutParams paramLayoutParams, int paramInt2, int paramInt3)
  {
    int i = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(gravity), paramInt1);
    paramInt1 = GravityCompat.getAbsoluteGravity(resolveGravity(anchorGravity), paramInt1);
    int j = i & 0x7;
    int k = i & 0x70;
    int m = paramInt1 & 0x7;
    i = paramInt1 & 0x70;
    if (m != 1)
    {
      if (m != 5) {
        paramInt1 = left;
      } else {
        paramInt1 = right;
      }
    }
    else {
      paramInt1 = left + paramRect1.width() / 2;
    }
    if (i != 16)
    {
      if (i != 80) {
        i = top;
      } else {
        i = bottom;
      }
    }
    else {
      i = top + paramRect1.height() / 2;
    }
    if (j != 1)
    {
      m = paramInt1;
      if (j != 5) {
        m = paramInt1 - paramInt2;
      }
    }
    else
    {
      m = paramInt1 - paramInt2 / 2;
    }
    if (k != 16)
    {
      paramInt1 = i;
      if (k != 80) {
        paramInt1 = i - paramInt3;
      }
    }
    else
    {
      paramInt1 = i - paramInt3 / 2;
    }
    paramRect2.set(m, paramInt1, paramInt2 + m, paramInt3 + paramInt1);
  }
  
  private int getKeyline(int paramInt)
  {
    Object localObject = mKeylines;
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No keylines defined for ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" - attempted index lookup ");
      ((StringBuilder)localObject).append(paramInt);
      Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString());
      return 0;
    }
    if ((paramInt >= 0) && (paramInt < localObject.length)) {
      return localObject[paramInt];
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Keyline index ");
    ((StringBuilder)localObject).append(paramInt);
    ((StringBuilder)localObject).append(" out of range for ");
    ((StringBuilder)localObject).append(this);
    Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString());
    return 0;
  }
  
  private void getTopSortedChildren(List<View> paramList)
  {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i = getChildCount();
    for (int j = i - 1; j >= 0; j--)
    {
      int k;
      if (bool) {
        k = getChildDrawingOrder(i, j);
      } else {
        k = j;
      }
      paramList.add(getChildAt(k));
    }
    Comparator localComparator = TOP_SORTED_CHILDREN_COMPARATOR;
    if (localComparator != null) {
      Collections.sort(paramList, localComparator);
    }
  }
  
  private boolean hasDependencies(View paramView)
  {
    return mChildDag.hasOutgoingEdges(paramView);
  }
  
  private void layoutChild(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect localRect1 = acquireTempRect();
    localRect1.set(getPaddingLeft() + leftMargin, getPaddingTop() + topMargin, getWidth() - getPaddingRight() - rightMargin, getHeight() - getPaddingBottom() - bottomMargin);
    if ((mLastInsets != null) && (ViewCompat.getFitsSystemWindows(this)) && (!ViewCompat.getFitsSystemWindows(paramView)))
    {
      int i = left;
      left = (mLastInsets.getSystemWindowInsetLeft() + i);
      i = top;
      top = (mLastInsets.getSystemWindowInsetTop() + i);
      right -= mLastInsets.getSystemWindowInsetRight();
      bottom -= mLastInsets.getSystemWindowInsetBottom();
    }
    Rect localRect2 = acquireTempRect();
    GravityCompat.apply(resolveGravity(gravity), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect1, localRect2, paramInt);
    paramView.layout(left, top, right, bottom);
    releaseTempRect(localRect1);
    releaseTempRect(localRect2);
  }
  
  private void layoutChildWithAnchor(View paramView1, View paramView2, int paramInt)
  {
    Rect localRect1 = acquireTempRect();
    Rect localRect2 = acquireTempRect();
    try
    {
      getDescendantRect(paramView2, localRect1);
      getDesiredAnchoredChildRect(paramView1, paramInt, localRect1, localRect2);
      paramView1.layout(left, top, right, bottom);
      return;
    }
    finally
    {
      releaseTempRect(localRect1);
      releaseTempRect(localRect2);
    }
  }
  
  private void layoutChildWithKeyline(View paramView, int paramInt1, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(gravity), paramInt2);
    int j = i & 0x7;
    int k = i & 0x70;
    int m = getWidth();
    int n = getHeight();
    int i1 = paramView.getMeasuredWidth();
    int i2 = paramView.getMeasuredHeight();
    i = paramInt1;
    if (paramInt2 == 1) {
      i = m - paramInt1;
    }
    paramInt1 = getKeyline(i) - i1;
    paramInt2 = 0;
    if (j != 1)
    {
      if (j == 5) {
        paramInt1 += i1;
      }
    }
    else {
      paramInt1 += i1 / 2;
    }
    if (k != 16)
    {
      if (k == 80) {
        paramInt2 = i2 + 0;
      }
    }
    else {
      paramInt2 = 0 + i2 / 2;
    }
    paramInt1 = Math.max(getPaddingLeft() + leftMargin, Math.min(paramInt1, m - getPaddingRight() - i1 - rightMargin));
    paramInt2 = Math.max(getPaddingTop() + topMargin, Math.min(paramInt2, n - getPaddingBottom() - i2 - bottomMargin));
    paramView.layout(paramInt1, paramInt2, i1 + paramInt1, i2 + paramInt2);
  }
  
  private void offsetChildByInset(View paramView, Rect paramRect, int paramInt)
  {
    if (!ViewCompat.isLaidOut(paramView)) {
      return;
    }
    if ((paramView.getWidth() > 0) && (paramView.getHeight() > 0))
    {
      LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
      Behavior localBehavior = localLayoutParams.getBehavior();
      Rect localRect1 = acquireTempRect();
      Rect localRect2 = acquireTempRect();
      localRect2.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      if ((localBehavior != null) && (localBehavior.getInsetDodgeRect(this, paramView, localRect1)))
      {
        if (!localRect2.contains(localRect1))
        {
          paramView = z2.t("Rect should be within the child's bounds. Rect:");
          paramView.append(localRect1.toShortString());
          paramView.append(" | Bounds:");
          paramView.append(localRect2.toShortString());
          throw new IllegalArgumentException(paramView.toString());
        }
      }
      else {
        localRect1.set(localRect2);
      }
      releaseTempRect(localRect2);
      if (localRect1.isEmpty())
      {
        releaseTempRect(localRect1);
        return;
      }
      int i = GravityCompat.getAbsoluteGravity(dodgeInsetEdges, paramInt);
      int j = 1;
      if ((i & 0x30) == 48)
      {
        paramInt = top - topMargin - mInsetOffsetY;
        k = top;
        if (paramInt < k)
        {
          setInsetOffsetY(paramView, k - paramInt);
          paramInt = 1;
          break label245;
        }
      }
      paramInt = 0;
      label245:
      int k = paramInt;
      if ((i & 0x50) == 80)
      {
        int m = getHeight() - bottom - bottomMargin + mInsetOffsetY;
        int n = bottom;
        k = paramInt;
        if (m < n)
        {
          setInsetOffsetY(paramView, m - n);
          k = 1;
        }
      }
      if (k == 0) {
        setInsetOffsetY(paramView, 0);
      }
      if ((i & 0x3) == 3)
      {
        k = left - leftMargin - mInsetOffsetX;
        paramInt = left;
        if (k < paramInt)
        {
          setInsetOffsetX(paramView, paramInt - k);
          paramInt = 1;
          break label376;
        }
      }
      paramInt = 0;
      label376:
      if ((i & 0x5) == 5)
      {
        k = getWidth() - right - rightMargin + mInsetOffsetX;
        i = right;
        if (k < i)
        {
          setInsetOffsetX(paramView, k - i);
          paramInt = j;
        }
      }
      if (paramInt == 0) {
        setInsetOffsetX(paramView, 0);
      }
      releaseTempRect(localRect1);
    }
  }
  
  public static Behavior parseBehavior(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    Object localObject1;
    Object localObject2;
    if (paramString.startsWith("."))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramContext.getPackageName());
      ((StringBuilder)localObject1).append(paramString);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else if (paramString.indexOf('.') >= 0)
    {
      localObject1 = paramString;
    }
    else
    {
      localObject2 = WIDGET_PACKAGE_NAME;
      localObject1 = paramString;
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append('.');
        ((StringBuilder)localObject1).append(paramString);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    try
    {
      Object localObject3 = sConstructors;
      localObject2 = (Map)((ThreadLocal)localObject3).get();
      paramString = (String)localObject2;
      if (localObject2 == null)
      {
        paramString = new java/util/HashMap;
        paramString.<init>();
        ((ThreadLocal)localObject3).set(paramString);
      }
      localObject3 = (Constructor)paramString.get(localObject1);
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject2 = Class.forName((String)localObject1, false, paramContext.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
        ((AccessibleObject)localObject2).setAccessible(true);
        paramString.put(localObject1, localObject2);
      }
      paramContext = (Behavior)((Constructor)localObject2).newInstance(new Object[] { paramContext, paramAttributeSet });
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new RuntimeException(z2.o("Could not inflate Behavior subclass ", (String)localObject1), paramContext);
    }
  }
  
  private boolean performIntercept(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getActionMasked();
    List localList = mTempList1;
    getTopSortedChildren(localList);
    int j = localList.size();
    Object localObject1 = null;
    int k = 0;
    int m = k;
    int i2;
    int i3;
    for (int i1 = m;; i1 = i3)
    {
      i2 = m;
      if (k >= j) {
        break;
      }
      View localView = (View)localList.get(k);
      Object localObject2 = (LayoutParams)localView.getLayoutParams();
      Behavior localBehavior = ((LayoutParams)localObject2).getBehavior();
      if (((m != 0) || (i1 != 0)) && (i != 0))
      {
        localObject2 = localObject1;
        i2 = m;
        i3 = i1;
        if (localBehavior != null)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            long l = SystemClock.uptimeMillis();
            localObject2 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          }
          if (paramInt != 0)
          {
            if (paramInt != 1)
            {
              i2 = m;
              i3 = i1;
            }
            else
            {
              localBehavior.onTouchEvent(this, localView, (MotionEvent)localObject2);
              i2 = m;
              i3 = i1;
            }
          }
          else
          {
            localBehavior.onInterceptTouchEvent(this, localView, (MotionEvent)localObject2);
            i2 = m;
            i3 = i1;
          }
        }
      }
      else
      {
        i1 = m;
        if (m == 0)
        {
          i1 = m;
          if (localBehavior != null)
          {
            if (paramInt != 0)
            {
              if (paramInt == 1) {
                n = localBehavior.onTouchEvent(this, localView, paramMotionEvent);
              }
            }
            else {
              n = localBehavior.onInterceptTouchEvent(this, localView, paramMotionEvent);
            }
            i1 = n;
            if (n != 0)
            {
              mBehaviorTouchView = localView;
              i1 = n;
            }
          }
        }
        boolean bool1 = ((LayoutParams)localObject2).didBlockInteraction();
        boolean bool2 = ((LayoutParams)localObject2).isBlockingInteractionBelow(this, localView);
        if ((bool2) && (!bool1)) {
          n = 1;
        } else {
          n = 0;
        }
        localObject2 = localObject1;
        i2 = i1;
        i3 = n;
        if (bool2)
        {
          localObject2 = localObject1;
          i2 = i1;
          i3 = n;
          if (n == 0)
          {
            i2 = i1;
            break;
          }
        }
      }
      k++;
      localObject1 = localObject2;
      int n = i2;
    }
    localList.clear();
    return i2;
  }
  
  private void prepareChildren()
  {
    mDependencySortedChildren.clear();
    mChildDag.clear();
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView1 = getChildAt(j);
      LayoutParams localLayoutParams = getResolvedLayoutParams(localView1);
      localLayoutParams.findAnchorView(this, localView1);
      mChildDag.addNode(localView1);
      for (int k = 0; k < i; k++) {
        if (k != j)
        {
          View localView2 = getChildAt(k);
          if (localLayoutParams.dependsOn(this, localView1, localView2))
          {
            if (!mChildDag.contains(localView2)) {
              mChildDag.addNode(localView2);
            }
            mChildDag.addEdge(localView2, localView1);
          }
        }
      }
    }
    mDependencySortedChildren.addAll(mChildDag.getSortedList());
    Collections.reverse(mDependencySortedChildren);
  }
  
  private static void releaseTempRect(@NonNull Rect paramRect)
  {
    paramRect.setEmpty();
    sRectPool.release(paramRect);
  }
  
  private void resetTouchBehaviors(boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      Behavior localBehavior = ((LayoutParams)localView.getLayoutParams()).getBehavior();
      if (localBehavior != null)
      {
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        if (paramBoolean) {
          localBehavior.onInterceptTouchEvent(this, localView, localMotionEvent);
        } else {
          localBehavior.onTouchEvent(this, localView, localMotionEvent);
        }
        localMotionEvent.recycle();
      }
    }
    for (j = 0; j < i; j++) {
      ((LayoutParams)getChildAt(j).getLayoutParams()).resetTouchBehaviorTracking();
    }
    mBehaviorTouchView = null;
    mDisallowInterceptReset = false;
  }
  
  private static int resolveAnchoredChildGravity(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 17;
    }
    return i;
  }
  
  private static int resolveGravity(int paramInt)
  {
    int i = paramInt;
    if ((paramInt & 0x7) == 0) {
      i = paramInt | 0x800003;
    }
    paramInt = i;
    if ((i & 0x70) == 0) {
      paramInt = i | 0x30;
    }
    return paramInt;
  }
  
  private static int resolveKeylineGravity(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0) {
      i = 8388661;
    }
    return i;
  }
  
  private void setInsetOffsetX(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = mInsetOffsetX;
    if (i != paramInt)
    {
      ViewCompat.offsetLeftAndRight(paramView, paramInt - i);
      mInsetOffsetX = paramInt;
    }
  }
  
  private void setInsetOffsetY(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = mInsetOffsetY;
    if (i != paramInt)
    {
      ViewCompat.offsetTopAndBottom(paramView, paramInt - i);
      mInsetOffsetY = paramInt;
    }
  }
  
  private void setupForInsets()
  {
    if (ViewCompat.getFitsSystemWindows(this))
    {
      if (mApplyWindowInsetsListener == null) {
        mApplyWindowInsetsListener = new OnApplyWindowInsetsListener()
        {
          public WindowInsetsCompat onApplyWindowInsets(View paramAnonymousView, WindowInsetsCompat paramAnonymousWindowInsetsCompat)
          {
            return setWindowInsets(paramAnonymousWindowInsetsCompat);
          }
        };
      }
      ViewCompat.setOnApplyWindowInsetsListener(this, mApplyWindowInsetsListener);
      setSystemUiVisibility(1280);
    }
    else
    {
      ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }
  }
  
  public void addPreDrawListener()
  {
    if (mIsAttachedToWindow)
    {
      if (mOnPreDrawListener == null) {
        mOnPreDrawListener = new OnPreDrawListener();
      }
      getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
    }
    mNeedsPreDrawListener = true;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void dispatchDependentViewsChanged(@NonNull View paramView)
  {
    List localList = mChildDag.getIncomingEdges(paramView);
    if ((localList != null) && (!localList.isEmpty())) {
      for (int i = 0; i < localList.size(); i++)
      {
        View localView = (View)localList.get(i);
        Behavior localBehavior = ((LayoutParams)localView.getLayoutParams()).getBehavior();
        if (localBehavior != null) {
          localBehavior.onDependentViewChanged(this, localView, paramView);
        }
      }
    }
  }
  
  public boolean doViewsOverlap(@NonNull View paramView1, @NonNull View paramView2)
  {
    int i = paramView1.getVisibility();
    boolean bool1 = false;
    if ((i == 0) && (paramView2.getVisibility() == 0))
    {
      Rect localRect = acquireTempRect();
      if (paramView1.getParent() != this) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      getChildRect(paramView1, bool2, localRect);
      paramView1 = acquireTempRect();
      if (paramView2.getParent() != this) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      getChildRect(paramView2, bool2, paramView1);
      boolean bool2 = bool1;
      try
      {
        if (left <= right)
        {
          bool2 = bool1;
          if (top <= bottom)
          {
            bool2 = bool1;
            if (right >= left)
            {
              i = bottom;
              int j = top;
              bool2 = bool1;
              if (i >= j) {
                bool2 = true;
              }
            }
          }
        }
        return bool2;
      }
      finally
      {
        releaseTempRect(localRect);
        releaseTempRect(paramView1);
      }
    }
    return false;
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    Behavior localBehavior = mBehavior;
    if (localBehavior != null)
    {
      float f = localBehavior.getScrimOpacity(this, paramView);
      if (f > 0.0F)
      {
        if (mScrimPaint == null) {
          mScrimPaint = new Paint();
        }
        mScrimPaint.setColor(mBehavior.getScrimColor(this, paramView));
        mScrimPaint.setAlpha(clamp(Math.round(f * 255.0F), 0, 255));
        int i = paramCanvas.save();
        if (paramView.isOpaque()) {
          paramCanvas.clipRect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom(), Region.Op.DIFFERENCE);
        }
        paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), mScrimPaint);
        paramCanvas.restoreToCount(i);
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable localDrawable = mStatusBarBackground;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localDrawable != null)
    {
      bool2 = bool1;
      if (localDrawable.isStateful()) {
        bool2 = false | localDrawable.setState(arrayOfInt);
      }
    }
    if (bool2) {
      invalidate();
    }
  }
  
  public void ensurePreDrawListener()
  {
    int i = getChildCount();
    int j = 0;
    int m;
    for (int k = 0;; k++)
    {
      m = j;
      if (k >= i) {
        break;
      }
      if (hasDependencies(getChildAt(k)))
      {
        m = 1;
        break;
      }
    }
    if (m != mNeedsPreDrawListener) {
      if (m != 0) {
        addPreDrawListener();
      } else {
        removePreDrawListener();
      }
    }
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-2, -2);
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public void getChildRect(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((!paramView.isLayoutRequested()) && (paramView.getVisibility() != 8))
    {
      if (paramBoolean) {
        getDescendantRect(paramView, paramRect);
      } else {
        paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
      }
      return;
    }
    paramRect.setEmpty();
  }
  
  @NonNull
  public List<View> getDependencies(@NonNull View paramView)
  {
    paramView = mChildDag.getOutgoingEdges(paramView);
    mTempDependenciesList.clear();
    if (paramView != null) {
      mTempDependenciesList.addAll(paramView);
    }
    return mTempDependenciesList;
  }
  
  @VisibleForTesting
  public final List<View> getDependencySortedChildren()
  {
    prepareChildren();
    return Collections.unmodifiableList(mDependencySortedChildren);
  }
  
  @NonNull
  public List<View> getDependents(@NonNull View paramView)
  {
    paramView = mChildDag.getIncomingEdges(paramView);
    mTempDependenciesList.clear();
    if (paramView != null) {
      mTempDependenciesList.addAll(paramView);
    }
    return mTempDependenciesList;
  }
  
  public void getDescendantRect(View paramView, Rect paramRect)
  {
    ViewGroupUtils.getDescendantRect(this, paramView, paramRect);
  }
  
  public void getDesiredAnchoredChildRect(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    getDesiredAnchoredChildRectWithoutConstraints(paramView, paramInt, paramRect1, paramRect2, localLayoutParams, i, j);
    constrainChildRect(localLayoutParams, paramRect2, i, j);
  }
  
  public void getLastChildRect(View paramView, Rect paramRect)
  {
    paramRect.set(((LayoutParams)paramView.getLayoutParams()).getLastChildRect());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public final WindowInsetsCompat getLastWindowInsets()
  {
    return mLastInsets;
  }
  
  public int getNestedScrollAxes()
  {
    return mNestedScrollingParentHelper.getNestedScrollAxes();
  }
  
  public LayoutParams getResolvedLayoutParams(View paramView)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (!mBehaviorResolved) {
      if ((paramView instanceof AttachedBehavior))
      {
        paramView = ((AttachedBehavior)paramView).getBehavior();
        if (paramView == null) {
          Log.e("CoordinatorLayout", "Attached behavior class is null");
        }
        localLayoutParams.setBehavior(paramView);
        mBehaviorResolved = true;
      }
      else
      {
        Object localObject = paramView.getClass();
        DefaultBehavior localDefaultBehavior;
        for (paramView = null; localObject != null; paramView = localDefaultBehavior)
        {
          localDefaultBehavior = (DefaultBehavior)((Class)localObject).getAnnotation(DefaultBehavior.class);
          paramView = localDefaultBehavior;
          if (localDefaultBehavior != null) {
            break;
          }
          localObject = ((Class)localObject).getSuperclass();
        }
        if (paramView != null) {
          try
          {
            localLayoutParams.setBehavior((Behavior)paramView.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
          }
          catch (Exception localException)
          {
            localObject = z2.t("Default behavior class ");
            ((StringBuilder)localObject).append(paramView.value().getName());
            ((StringBuilder)localObject).append(" could not be instantiated. Did you forget a default constructor?");
            Log.e("CoordinatorLayout", ((StringBuilder)localObject).toString(), localException);
          }
        }
        mBehaviorResolved = true;
      }
    }
    return localLayoutParams;
  }
  
  @Nullable
  public Drawable getStatusBarBackground()
  {
    return mStatusBarBackground;
  }
  
  public int getSuggestedMinimumHeight()
  {
    int i = super.getSuggestedMinimumHeight();
    int j = getPaddingTop();
    return Math.max(i, getPaddingBottom() + j);
  }
  
  public int getSuggestedMinimumWidth()
  {
    int i = super.getSuggestedMinimumWidth();
    int j = getPaddingLeft();
    return Math.max(i, getPaddingRight() + j);
  }
  
  public boolean isPointInChildBounds(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = acquireTempRect();
    getDescendantRect(paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      releaseTempRect(localRect);
    }
  }
  
  public void offsetChildToAnchor(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (mAnchorView != null)
    {
      Rect localRect1 = acquireTempRect();
      Rect localRect2 = acquireTempRect();
      Rect localRect3 = acquireTempRect();
      getDescendantRect(mAnchorView, localRect1);
      int i = 0;
      getChildRect(paramView, false, localRect2);
      int j = paramView.getMeasuredWidth();
      int k = paramView.getMeasuredHeight();
      getDesiredAnchoredChildRectWithoutConstraints(paramView, paramInt, localRect1, localRect3, localLayoutParams, j, k);
      if (left == left)
      {
        paramInt = i;
        if (top == top) {}
      }
      else
      {
        paramInt = 1;
      }
      constrainChildRect(localLayoutParams, localRect3, j, k);
      j = left - left;
      i = top - top;
      if (j != 0) {
        ViewCompat.offsetLeftAndRight(paramView, j);
      }
      if (i != 0) {
        ViewCompat.offsetTopAndBottom(paramView, i);
      }
      if (paramInt != 0)
      {
        Behavior localBehavior = localLayoutParams.getBehavior();
        if (localBehavior != null) {
          localBehavior.onDependentViewChanged(this, paramView, mAnchorView);
        }
      }
      releaseTempRect(localRect1);
      releaseTempRect(localRect2);
      releaseTempRect(localRect3);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    resetTouchBehaviors(false);
    if (mNeedsPreDrawListener)
    {
      if (mOnPreDrawListener == null) {
        mOnPreDrawListener = new OnPreDrawListener();
      }
      getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
    }
    if ((mLastInsets == null) && (ViewCompat.getFitsSystemWindows(this))) {
      ViewCompat.requestApplyInsets(this);
    }
    mIsAttachedToWindow = true;
  }
  
  public final void onChildViewsChanged(int paramInt)
  {
    int i = ViewCompat.getLayoutDirection(this);
    int j = mDependencySortedChildren.size();
    Rect localRect1 = acquireTempRect();
    Rect localRect2 = acquireTempRect();
    Rect localRect3 = acquireTempRect();
    for (int k = 0; k < j; k++)
    {
      View localView = (View)mDependencySortedChildren.get(k);
      Object localObject1 = (LayoutParams)localView.getLayoutParams();
      if ((paramInt != 0) || (localView.getVisibility() != 8))
      {
        Object localObject2;
        for (int m = 0; m < k; m++)
        {
          localObject2 = (View)mDependencySortedChildren.get(m);
          if (mAnchorDirectChild == localObject2) {
            offsetChildToAnchor(localView, i);
          }
        }
        getChildRect(localView, true, localRect2);
        if ((insetEdge != 0) && (!localRect2.isEmpty()))
        {
          m = GravityCompat.getAbsoluteGravity(insetEdge, i);
          int n = m & 0x70;
          if (n != 48)
          {
            if (n == 80) {
              bottom = Math.max(bottom, getHeight() - top);
            }
          }
          else {
            top = Math.max(top, bottom);
          }
          m &= 0x7;
          if (m != 3)
          {
            if (m == 5) {
              right = Math.max(right, getWidth() - left);
            }
          }
          else {
            left = Math.max(left, right);
          }
        }
        if ((dodgeInsetEdges != 0) && (localView.getVisibility() == 0)) {
          offsetChildByInset(localView, localRect1, i);
        }
        if (paramInt != 2)
        {
          getLastChildRect(localView, localRect3);
          if (!localRect3.equals(localRect2)) {
            recordLastChildRect(localView, localRect2);
          }
        }
        else
        {
          for (m = k + 1; m < j; m++)
          {
            localObject1 = (View)mDependencySortedChildren.get(m);
            localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
            Behavior localBehavior = ((LayoutParams)localObject2).getBehavior();
            if ((localBehavior != null) && (localBehavior.layoutDependsOn(this, (View)localObject1, localView))) {
              if ((paramInt == 0) && (((LayoutParams)localObject2).getChangedAfterNestedScroll()))
              {
                ((LayoutParams)localObject2).resetChangedAfterNestedScroll();
              }
              else
              {
                boolean bool;
                if (paramInt != 2)
                {
                  bool = localBehavior.onDependentViewChanged(this, (View)localObject1, localView);
                }
                else
                {
                  localBehavior.onDependentViewRemoved(this, (View)localObject1, localView);
                  bool = true;
                }
                if (paramInt == 1) {
                  ((LayoutParams)localObject2).setChangedAfterNestedScroll(bool);
                }
              }
            }
          }
        }
      }
    }
    releaseTempRect(localRect1);
    releaseTempRect(localRect2);
    releaseTempRect(localRect3);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    resetTouchBehaviors(false);
    if ((mNeedsPreDrawListener) && (mOnPreDrawListener != null)) {
      getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
    }
    View localView = mNestedScrollingTarget;
    if (localView != null) {
      onStopNestedScroll(localView);
    }
    mIsAttachedToWindow = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((mDrawStatusBarBackground) && (mStatusBarBackground != null))
    {
      WindowInsetsCompat localWindowInsetsCompat = mLastInsets;
      int i;
      if (localWindowInsetsCompat != null) {
        i = localWindowInsetsCompat.getSystemWindowInsetTop();
      } else {
        i = 0;
      }
      if (i > 0)
      {
        mStatusBarBackground.setBounds(0, 0, getWidth(), i);
        mStatusBarBackground.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      resetTouchBehaviors(true);
    }
    boolean bool = performIntercept(paramMotionEvent, 0);
    if ((i == 1) || (i == 3)) {
      resetTouchBehaviors(true);
    }
    return bool;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = ViewCompat.getLayoutDirection(this);
    paramInt2 = mDependencySortedChildren.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = (View)mDependencySortedChildren.get(paramInt1);
      if (localView.getVisibility() != 8)
      {
        Behavior localBehavior = ((LayoutParams)localView.getLayoutParams()).getBehavior();
        if ((localBehavior == null) || (!localBehavior.onLayoutChild(this, localView, paramInt3))) {
          onLayoutChild(localView, paramInt3);
        }
      }
    }
  }
  
  public void onLayoutChild(@NonNull View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.checkAnchorChanged())
    {
      View localView = mAnchorView;
      if (localView != null)
      {
        layoutChildWithAnchor(paramView, localView, paramInt);
      }
      else
      {
        int i = keyline;
        if (i >= 0) {
          layoutChildWithKeyline(paramView, i, paramInt);
        } else {
          layoutChild(paramView, paramInt);
        }
      }
      return;
    }
    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    prepareChildren();
    ensurePreDrawListener();
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getPaddingRight();
    int m = getPaddingBottom();
    int n = ViewCompat.getLayoutDirection(this);
    int i1;
    if (n == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    int i6 = getSuggestedMinimumWidth();
    int i7 = getSuggestedMinimumHeight();
    int i8;
    if ((mLastInsets != null) && (ViewCompat.getFitsSystemWindows(this))) {
      i8 = 1;
    } else {
      i8 = 0;
    }
    int i9 = mDependencySortedChildren.size();
    int i10 = 0;
    int i11 = 0;
    int i13;
    for (int i12 = i;; i12 = i13)
    {
      i13 = i12;
      if (i11 >= i9) {
        break;
      }
      View localView = (View)mDependencySortedChildren.get(i11);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i12 = keyline;
        int i14;
        if ((i12 >= 0) && (i2 != 0))
        {
          i12 = getKeyline(i12);
          i14 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(gravity), n) & 0x7;
          if (((i14 == 3) && (i1 == 0)) || ((i14 == 5) && (i1 != 0)))
          {
            i12 = Math.max(0, i3 - k - i12);
            break label302;
          }
          if (((i14 == 5) && (i1 == 0)) || ((i14 == 3) && (i1 != 0)))
          {
            i12 = Math.max(0, i12 - i13);
            break label302;
          }
        }
        i12 = 0;
        label302:
        int i15 = i10;
        int i17;
        if ((i8 != 0) && (!ViewCompat.getFitsSystemWindows(localView)))
        {
          i14 = mLastInsets.getSystemWindowInsetLeft();
          int i16 = mLastInsets.getSystemWindowInsetRight();
          i10 = mLastInsets.getSystemWindowInsetTop();
          i17 = mLastInsets.getSystemWindowInsetBottom();
          i14 = View.MeasureSpec.makeMeasureSpec(i3 - (i16 + i14), i2);
          i10 = View.MeasureSpec.makeMeasureSpec(i5 - (i17 + i10), i4);
          i17 = i14;
          i14 = i10;
        }
        else
        {
          i10 = paramInt1;
          i14 = paramInt2;
          i17 = i10;
        }
        Behavior localBehavior = localLayoutParams.getBehavior();
        if (localBehavior != null) {
          if (localBehavior.onMeasureChild(this, localView, i17, i12, i14, 0)) {
            break label452;
          }
        }
        onMeasureChild(localView, i17, i12, i14, 0);
        label452:
        i6 = Math.max(i6, localView.getMeasuredWidth() + (i + k) + leftMargin + rightMargin);
        i7 = Math.max(i7, localView.getMeasuredHeight() + (j + m) + topMargin + bottomMargin);
        i10 = View.combineMeasuredStates(i15, localView.getMeasuredState());
      }
      i11++;
    }
    setMeasuredDimension(View.resolveSizeAndState(i6, paramInt1, 0xFF000000 & i10), View.resolveSizeAndState(i7, paramInt2, i10 << 16));
  }
  
  public void onMeasureChild(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    int n;
    for (int k = j; j < i; k = n)
    {
      View localView = getChildAt(j);
      int m;
      if (localView.getVisibility() == 8)
      {
        m = k;
      }
      else
      {
        Object localObject = (LayoutParams)localView.getLayoutParams();
        if (!((LayoutParams)localObject).isNestedScrollAccepted(0))
        {
          m = k;
        }
        else
        {
          localObject = ((LayoutParams)localObject).getBehavior();
          m = k;
          if (localObject != null) {
            n = k | ((Behavior)localObject).onNestedFling(this, localView, paramView, paramFloat1, paramFloat2, paramBoolean);
          }
        }
      }
      j++;
    }
    if (k != 0) {
      onChildViewsChanged(1);
    }
    return k;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i = getChildCount();
    int j = 0;
    int n;
    for (int k = j; j < i; k = n)
    {
      View localView = getChildAt(j);
      int m;
      if (localView.getVisibility() == 8)
      {
        m = k;
      }
      else
      {
        Object localObject = (LayoutParams)localView.getLayoutParams();
        if (!((LayoutParams)localObject).isNestedScrollAccepted(0))
        {
          m = k;
        }
        else
        {
          localObject = ((LayoutParams)localObject).getBehavior();
          m = k;
          if (localObject != null) {
            n = k | ((Behavior)localObject).onNestedPreFling(this, localView, paramView, paramFloat1, paramFloat2);
          }
        }
      }
      j++;
    }
    return k;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i = getChildCount();
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = m;
    m = k;
    int i2 = j;
    while (m < i)
    {
      Object localObject1 = getChildAt(m);
      if (((View)localObject1).getVisibility() == 8)
      {
        j = i1;
        k = n;
      }
      else
      {
        Object localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if (!((LayoutParams)localObject2).isNestedScrollAccepted(paramInt3))
        {
          j = i1;
          k = n;
        }
        else
        {
          localObject2 = ((LayoutParams)localObject2).getBehavior();
          j = i1;
          k = n;
          if (localObject2 != null)
          {
            int[] arrayOfInt = mBehaviorConsumed;
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            ((Behavior)localObject2).onNestedPreScroll(this, (View)localObject1, paramView, paramInt1, paramInt2, arrayOfInt, paramInt3);
            localObject1 = mBehaviorConsumed;
            if (paramInt1 > 0) {
              k = Math.max(i1, localObject1[0]);
            } else {
              k = Math.min(i1, localObject1[0]);
            }
            j = k;
            localObject1 = mBehaviorConsumed;
            if (paramInt2 > 0) {
              k = Math.max(n, localObject1[1]);
            } else {
              k = Math.min(n, localObject1[1]);
            }
            i2 = 1;
          }
        }
      }
      m++;
      i1 = j;
      n = k;
    }
    paramArrayOfInt[0] = i1;
    paramArrayOfInt[1] = n;
    if (i2 != 0) {
      onChildViewsChanged(1);
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, mNestedScrollingV2ConsumedCompat);
  }
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @NonNull int[] paramArrayOfInt)
  {
    int i = getChildCount();
    int j = 0;
    int k = j;
    int m = k;
    int n = m;
    int i1 = m;
    m = k;
    int i2 = j;
    while (m < i)
    {
      Object localObject1 = getChildAt(m);
      if (((View)localObject1).getVisibility() == 8)
      {
        j = i1;
        k = n;
      }
      else
      {
        Object localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if (!((LayoutParams)localObject2).isNestedScrollAccepted(paramInt5))
        {
          j = i1;
          k = n;
        }
        else
        {
          localObject2 = ((LayoutParams)localObject2).getBehavior();
          j = i1;
          k = n;
          if (localObject2 != null)
          {
            int[] arrayOfInt = mBehaviorConsumed;
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            ((Behavior)localObject2).onNestedScroll(this, (View)localObject1, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, arrayOfInt);
            localObject1 = mBehaviorConsumed;
            if (paramInt3 > 0) {
              k = Math.max(i1, localObject1[0]);
            } else {
              k = Math.min(i1, localObject1[0]);
            }
            j = k;
            if (paramInt4 > 0) {
              k = Math.max(n, mBehaviorConsumed[1]);
            } else {
              k = Math.min(n, mBehaviorConsumed[1]);
            }
            i2 = 1;
          }
        }
      }
      m++;
      i1 = j;
      n = k;
    }
    paramArrayOfInt[0] += i1;
    paramArrayOfInt[1] += n;
    if (i2 != 0) {
      onChildViewsChanged(1);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramView1, paramView2, paramInt, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    mNestedScrollingParentHelper.onNestedScrollAccepted(paramView1, paramView2, paramInt1, paramInt2);
    mNestedScrollingTarget = paramView2;
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      Object localObject = (LayoutParams)localView.getLayoutParams();
      if (((LayoutParams)localObject).isNestedScrollAccepted(paramInt2))
      {
        localObject = ((LayoutParams)localObject).getBehavior();
        if (localObject != null) {
          ((Behavior)localObject).onNestedScrollAccepted(this, localView, paramView1, paramView2, paramInt1, paramInt2);
        }
      }
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    SparseArray localSparseArray = behaviorStates;
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      View localView = getChildAt(i);
      int k = localView.getId();
      Behavior localBehavior = getResolvedLayoutParams(localView).getBehavior();
      if ((k != -1) && (localBehavior != null))
      {
        paramParcelable = (Parcelable)localSparseArray.get(k);
        if (paramParcelable != null) {
          localBehavior.onRestoreInstanceState(this, localView, paramParcelable);
        }
      }
      i++;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      int k = localView.getId();
      Object localObject = ((LayoutParams)localView.getLayoutParams()).getBehavior();
      if ((k != -1) && (localObject != null))
      {
        localObject = ((Behavior)localObject).onSaveInstanceState(this, localView);
        if (localObject != null) {
          localSparseArray.append(k, localObject);
        }
      }
    }
    behaviorStates = localSparseArray;
    return localSavedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramView1, paramView2, paramInt, 0);
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    int k = j;
    while (j < i)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        Behavior localBehavior = localLayoutParams.getBehavior();
        if (localBehavior != null)
        {
          int m = localBehavior.onStartNestedScroll(this, localView, paramView1, paramView2, paramInt1, paramInt2);
          k |= m;
          localLayoutParams.setNestedScrollAccepted(paramInt2, m);
        }
        else
        {
          localLayoutParams.setNestedScrollAccepted(paramInt2, false);
        }
      }
      j++;
    }
    return k;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public void onStopNestedScroll(View paramView, int paramInt)
  {
    mNestedScrollingParentHelper.onStopNestedScroll(paramView, paramInt);
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localLayoutParams.isNestedScrollAccepted(paramInt))
      {
        Behavior localBehavior = localLayoutParams.getBehavior();
        if (localBehavior != null) {
          localBehavior.onStopNestedScroll(this, localView, paramView, paramInt);
        }
        localLayoutParams.resetNestedScroll(paramInt);
        localLayoutParams.resetChangedAfterNestedScroll();
      }
    }
    mNestedScrollingTarget = null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    boolean bool1;
    if (mBehaviorTouchView == null)
    {
      bool1 = performIntercept(paramMotionEvent, 1);
      bool2 = bool1;
      if (!bool1) {
        break label76;
      }
    }
    else
    {
      bool1 = false;
    }
    Behavior localBehavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
    boolean bool2 = bool1;
    boolean bool3;
    if (localBehavior != null)
    {
      bool3 = localBehavior.onTouchEvent(this, mBehaviorTouchView, paramMotionEvent);
      bool2 = bool1;
      bool1 = bool3;
    }
    else
    {
      label76:
      bool1 = false;
    }
    View localView = mBehaviorTouchView;
    localBehavior = null;
    if (localView == null)
    {
      bool3 = bool1 | super.onTouchEvent(paramMotionEvent);
      paramMotionEvent = localBehavior;
    }
    else
    {
      bool3 = bool1;
      paramMotionEvent = localBehavior;
      if (bool2)
      {
        long l = SystemClock.uptimeMillis();
        paramMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        super.onTouchEvent(paramMotionEvent);
        bool3 = bool1;
      }
    }
    if (paramMotionEvent != null) {
      paramMotionEvent.recycle();
    }
    if ((i == 1) || (i == 3)) {
      resetTouchBehaviors(false);
    }
    return bool3;
  }
  
  public void recordLastChildRect(View paramView, Rect paramRect)
  {
    ((LayoutParams)paramView.getLayoutParams()).setLastChildRect(paramRect);
  }
  
  public void removePreDrawListener()
  {
    if ((mIsAttachedToWindow) && (mOnPreDrawListener != null)) {
      getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
    }
    mNeedsPreDrawListener = false;
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    Behavior localBehavior = ((LayoutParams)paramView.getLayoutParams()).getBehavior();
    if ((localBehavior != null) && (localBehavior.onRequestChildRectangleOnScreen(this, paramView, paramRect, paramBoolean))) {
      return true;
    }
    return super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!mDisallowInterceptReset))
    {
      resetTouchBehaviors(false);
      mDisallowInterceptReset = true;
    }
  }
  
  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    setupForInsets();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    mOnHierarchyChangeListener = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(@Nullable Drawable paramDrawable)
  {
    Drawable localDrawable1 = mStatusBarBackground;
    if (localDrawable1 != paramDrawable)
    {
      Drawable localDrawable2 = null;
      if (localDrawable1 != null) {
        localDrawable1.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable2 = paramDrawable.mutate();
      }
      mStatusBarBackground = localDrawable2;
      if (localDrawable2 != null)
      {
        if (localDrawable2.isStateful()) {
          mStatusBarBackground.setState(getDrawableState());
        }
        DrawableCompat.setLayoutDirection(mStatusBarBackground, ViewCompat.getLayoutDirection(this));
        paramDrawable = mStatusBarBackground;
        boolean bool;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        }
        paramDrawable.setVisible(bool, false);
        mStatusBarBackground.setCallback(this);
      }
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public void setStatusBarBackgroundColor(@ColorInt int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(@DrawableRes int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = ContextCompat.getDrawable(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setStatusBarBackground(localDrawable);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Drawable localDrawable = mStatusBarBackground;
    if ((localDrawable != null) && (localDrawable.isVisible() != bool)) {
      mStatusBarBackground.setVisible(bool, false);
    }
  }
  
  public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat paramWindowInsetsCompat)
  {
    WindowInsetsCompat localWindowInsetsCompat = paramWindowInsetsCompat;
    if (!ObjectsCompat.equals(mLastInsets, paramWindowInsetsCompat))
    {
      mLastInsets = paramWindowInsetsCompat;
      boolean bool1 = true;
      boolean bool2;
      if ((paramWindowInsetsCompat != null) && (paramWindowInsetsCompat.getSystemWindowInsetTop() > 0)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mDrawStatusBarBackground = bool2;
      if ((!bool2) && (getBackground() == null)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      setWillNotDraw(bool2);
      localWindowInsetsCompat = dispatchApplyWindowInsetsToBehaviors(paramWindowInsetsCompat);
      requestLayout();
    }
    return localWindowInsetsCompat;
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != mStatusBarBackground)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static abstract interface AttachedBehavior
  {
    @NonNull
    public abstract CoordinatorLayout.Behavior getBehavior();
  }
  
  public static abstract class Behavior<V extends View>
  {
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet) {}
    
    @Nullable
    public static Object getTag(@NonNull View paramView)
    {
      return getLayoutParamsmBehaviorTag;
    }
    
    public static void setTag(@NonNull View paramView, @Nullable Object paramObject)
    {
      getLayoutParamsmBehaviorTag = paramObject;
    }
    
    public boolean blocksInteractionBelow(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV)
    {
      boolean bool;
      if (getScrimOpacity(paramCoordinatorLayout, paramV) > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean getInsetDodgeRect(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull Rect paramRect)
    {
      return false;
    }
    
    @ColorInt
    public int getScrimColor(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV)
    {
      return -16777216;
    }
    
    @FloatRange(from=0.0D, to=1.0D)
    public float getScrimOpacity(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV)
    {
      return 0.0F;
    }
    
    public boolean layoutDependsOn(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView)
    {
      return false;
    }
    
    @NonNull
    public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      return paramWindowInsetsCompat;
    }
    
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams paramLayoutParams) {}
    
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView)
    {
      return false;
    }
    
    public void onDependentViewRemoved(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView) {}
    
    public void onDetachedFromLayoutParams() {}
    
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean onLayoutChild(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, int paramInt)
    {
      return false;
    }
    
    public boolean onMeasureChild(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return false;
    }
    
    public boolean onNestedFling(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean onNestedPreFling(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    @Deprecated
    public void onNestedPreScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt) {}
    
    public void onNestedPreScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt, int paramInt3)
    {
      if (paramInt3 == 0) {
        onNestedPreScroll(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
    
    @Deprecated
    public void onNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    @Deprecated
    public void onNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      if (paramInt5 == 0) {
        onNestedScroll(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public void onNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @NonNull int[] paramArrayOfInt)
    {
      paramArrayOfInt[0] += paramInt3;
      paramArrayOfInt[1] += paramInt4;
      onNestedScroll(paramCoordinatorLayout, paramV, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    
    @Deprecated
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView1, @NonNull View paramView2, int paramInt) {}
    
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        onNestedScrollAccepted(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
    }
    
    public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull Rect paramRect, boolean paramBoolean)
    {
      return false;
    }
    
    public void onRestoreInstanceState(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull Parcelable paramParcelable) {}
    
    @Nullable
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV)
    {
      return View.BaseSavedState.EMPTY_STATE;
    }
    
    @Deprecated
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView1, @NonNull View paramView2, int paramInt)
    {
      return false;
    }
    
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
    {
      if (paramInt2 == 0) {
        return onStartNestedScroll(paramCoordinatorLayout, paramV, paramView1, paramView2, paramInt1);
      }
      return false;
    }
    
    @Deprecated
    public void onStopNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView) {}
    
    public void onStopNestedScroll(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull View paramView, int paramInt)
    {
      if (paramInt == 0) {
        onStopNestedScroll(paramCoordinatorLayout, paramV, paramView);
      }
    }
    
    public boolean onTouchEvent(@NonNull CoordinatorLayout paramCoordinatorLayout, @NonNull V paramV, @NonNull MotionEvent paramMotionEvent)
    {
      return false;
    }
  }
  
  @Deprecated
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface DefaultBehavior
  {
    Class<? extends CoordinatorLayout.Behavior> value();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface DispatchChangeEvent {}
  
  public class HierarchyChangeListener
    implements ViewGroup.OnHierarchyChangeListener
  {
    public HierarchyChangeListener() {}
    
    public void onChildViewAdded(View paramView1, View paramView2)
    {
      ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = mOnHierarchyChangeListener;
      if (localOnHierarchyChangeListener != null) {
        localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
      }
    }
    
    public void onChildViewRemoved(View paramView1, View paramView2)
    {
      onChildViewsChanged(2);
      ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = mOnHierarchyChangeListener;
      if (localOnHierarchyChangeListener != null) {
        localOnHierarchyChangeListener.onChildViewRemoved(paramView1, paramView2);
      }
    }
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int anchorGravity = 0;
    public int dodgeInsetEdges = 0;
    public int gravity = 0;
    public int insetEdge = 0;
    public int keyline = -1;
    public View mAnchorDirectChild;
    public int mAnchorId = -1;
    public View mAnchorView;
    public CoordinatorLayout.Behavior mBehavior;
    public boolean mBehaviorResolved = false;
    public Object mBehaviorTag;
    private boolean mDidAcceptNestedScrollNonTouch;
    private boolean mDidAcceptNestedScrollTouch;
    private boolean mDidBlockInteraction;
    private boolean mDidChangeAfterNestedScroll;
    public int mInsetOffsetX;
    public int mInsetOffsetY;
    public final Rect mLastChildRect = new Rect();
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout_Layout);
      gravity = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
      mAnchorId = localTypedArray.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
      anchorGravity = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      keyline = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
      insetEdge = localTypedArray.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
      dodgeInsetEdges = localTypedArray.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      int i = R.styleable.CoordinatorLayout_Layout_layout_behavior;
      boolean bool = localTypedArray.hasValue(i);
      mBehaviorResolved = bool;
      if (bool) {
        mBehavior = CoordinatorLayout.parseBehavior(paramContext, paramAttributeSet, localTypedArray.getString(i));
      }
      localTypedArray.recycle();
      paramContext = mBehavior;
      if (paramContext != null) {
        paramContext.onAttachedToLayoutParams(this);
      }
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
    }
    
    private void resolveAnchorView(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      View localView = paramCoordinatorLayout.findViewById(mAnchorId);
      mAnchorView = localView;
      if (localView != null)
      {
        if (localView == paramCoordinatorLayout)
        {
          if (paramCoordinatorLayout.isInEditMode())
          {
            mAnchorDirectChild = null;
            mAnchorView = null;
            return;
          }
          throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
        }
        for (localObject = localView.getParent(); (localObject != paramCoordinatorLayout) && (localObject != null); localObject = ((ViewParent)localObject).getParent())
        {
          if (localObject == paramView)
          {
            if (paramCoordinatorLayout.isInEditMode())
            {
              mAnchorDirectChild = null;
              mAnchorView = null;
              return;
            }
            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
          }
          if ((localObject instanceof View)) {
            localView = (View)localObject;
          }
        }
        mAnchorDirectChild = localView;
        return;
      }
      if (paramCoordinatorLayout.isInEditMode())
      {
        mAnchorDirectChild = null;
        mAnchorView = null;
        return;
      }
      Object localObject = z2.t("Could not find CoordinatorLayout descendant view with id ");
      ((StringBuilder)localObject).append(paramCoordinatorLayout.getResources().getResourceName(mAnchorId));
      ((StringBuilder)localObject).append(" to anchor view ");
      ((StringBuilder)localObject).append(paramView);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    private boolean shouldDodge(View paramView, int paramInt)
    {
      int i = GravityCompat.getAbsoluteGravity(getLayoutParamsinsetEdge, paramInt);
      boolean bool;
      if ((i != 0) && ((GravityCompat.getAbsoluteGravity(dodgeInsetEdges, paramInt) & i) == i)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean verifyAnchorView(View paramView, CoordinatorLayout paramCoordinatorLayout)
    {
      if (mAnchorView.getId() != mAnchorId) {
        return false;
      }
      View localView = mAnchorView;
      ViewParent localViewParent = localView.getParent();
      while (localViewParent != paramCoordinatorLayout) {
        if ((localViewParent != null) && (localViewParent != paramView))
        {
          if ((localViewParent instanceof View)) {
            localView = (View)localViewParent;
          }
          localViewParent = localViewParent.getParent();
        }
        else
        {
          mAnchorDirectChild = null;
          mAnchorView = null;
          return false;
        }
      }
      mAnchorDirectChild = localView;
      return true;
    }
    
    public boolean checkAnchorChanged()
    {
      boolean bool;
      if ((mAnchorView == null) && (mAnchorId != -1)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean dependsOn(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      if ((paramView2 != mAnchorDirectChild) && (!shouldDodge(paramView2, ViewCompat.getLayoutDirection(paramCoordinatorLayout))))
      {
        CoordinatorLayout.Behavior localBehavior = mBehavior;
        if ((localBehavior == null) || (!localBehavior.layoutDependsOn(paramCoordinatorLayout, paramView1, paramView2)))
        {
          bool = false;
          break label54;
        }
      }
      boolean bool = true;
      label54:
      return bool;
    }
    
    public boolean didBlockInteraction()
    {
      if (mBehavior == null) {
        mDidBlockInteraction = false;
      }
      return mDidBlockInteraction;
    }
    
    public View findAnchorView(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      if (mAnchorId == -1)
      {
        mAnchorDirectChild = null;
        mAnchorView = null;
        return null;
      }
      if ((mAnchorView == null) || (!verifyAnchorView(paramView, paramCoordinatorLayout))) {
        resolveAnchorView(paramView, paramCoordinatorLayout);
      }
      return mAnchorView;
    }
    
    @IdRes
    public int getAnchorId()
    {
      return mAnchorId;
    }
    
    @Nullable
    public CoordinatorLayout.Behavior getBehavior()
    {
      return mBehavior;
    }
    
    public boolean getChangedAfterNestedScroll()
    {
      return mDidChangeAfterNestedScroll;
    }
    
    public Rect getLastChildRect()
    {
      return mLastChildRect;
    }
    
    public void invalidateAnchor()
    {
      mAnchorDirectChild = null;
      mAnchorView = null;
    }
    
    public boolean isBlockingInteractionBelow(CoordinatorLayout paramCoordinatorLayout, View paramView)
    {
      boolean bool1 = mDidBlockInteraction;
      if (bool1) {
        return true;
      }
      CoordinatorLayout.Behavior localBehavior = mBehavior;
      boolean bool2;
      if (localBehavior != null) {
        bool2 = localBehavior.blocksInteractionBelow(paramCoordinatorLayout, paramView);
      } else {
        bool2 = false;
      }
      bool2 |= bool1;
      mDidBlockInteraction = bool2;
      return bool2;
    }
    
    public boolean isNestedScrollAccepted(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1) {
          return false;
        }
        return mDidAcceptNestedScrollNonTouch;
      }
      return mDidAcceptNestedScrollTouch;
    }
    
    public void resetChangedAfterNestedScroll()
    {
      mDidChangeAfterNestedScroll = false;
    }
    
    public void resetNestedScroll(int paramInt)
    {
      setNestedScrollAccepted(paramInt, false);
    }
    
    public void resetTouchBehaviorTracking()
    {
      mDidBlockInteraction = false;
    }
    
    public void setAnchorId(@IdRes int paramInt)
    {
      invalidateAnchor();
      mAnchorId = paramInt;
    }
    
    public void setBehavior(@Nullable CoordinatorLayout.Behavior paramBehavior)
    {
      CoordinatorLayout.Behavior localBehavior = mBehavior;
      if (localBehavior != paramBehavior)
      {
        if (localBehavior != null) {
          localBehavior.onDetachedFromLayoutParams();
        }
        mBehavior = paramBehavior;
        mBehaviorTag = null;
        mBehaviorResolved = true;
        if (paramBehavior != null) {
          paramBehavior.onAttachedToLayoutParams(this);
        }
      }
    }
    
    public void setChangedAfterNestedScroll(boolean paramBoolean)
    {
      mDidChangeAfterNestedScroll = paramBoolean;
    }
    
    public void setLastChildRect(Rect paramRect)
    {
      mLastChildRect.set(paramRect);
    }
    
    public void setNestedScrollAccepted(int paramInt, boolean paramBoolean)
    {
      if (paramInt != 0)
      {
        if (paramInt == 1) {
          mDidAcceptNestedScrollNonTouch = paramBoolean;
        }
      }
      else {
        mDidAcceptNestedScrollTouch = paramBoolean;
      }
    }
  }
  
  public class OnPreDrawListener
    implements ViewTreeObserver.OnPreDrawListener
  {
    public OnPreDrawListener() {}
    
    public boolean onPreDraw()
    {
      onChildViewsChanged(0);
      return true;
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public CoordinatorLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new CoordinatorLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public CoordinatorLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new CoordinatorLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public CoordinatorLayout.SavedState[] newArray(int paramAnonymousInt)
      {
        return new CoordinatorLayout.SavedState[paramAnonymousInt];
      }
    };
    public SparseArray<Parcelable> behaviorStates;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      int i = paramParcel.readInt();
      int[] arrayOfInt = new int[i];
      paramParcel.readIntArray(arrayOfInt);
      paramParcel = paramParcel.readParcelableArray(paramClassLoader);
      behaviorStates = new SparseArray(i);
      for (int j = 0; j < i; j++) {
        behaviorStates.append(arrayOfInt[j], paramParcel[j]);
      }
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      Object localObject = behaviorStates;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((SparseArray)localObject).size();
      } else {
        j = 0;
      }
      paramParcel.writeInt(j);
      localObject = new int[j];
      Parcelable[] arrayOfParcelable = new Parcelable[j];
      while (i < j)
      {
        localObject[i] = behaviorStates.keyAt(i);
        arrayOfParcelable[i] = ((Parcelable)behaviorStates.valueAt(i));
        i++;
      }
      paramParcel.writeIntArray((int[])localObject);
      paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
    }
  }
  
  public static class ViewElevationComparator
    implements Comparator<View>
  {
    public int compare(View paramView1, View paramView2)
    {
      float f1 = ViewCompat.getZ(paramView1);
      float f2 = ViewCompat.getZ(paramView2);
      if (f1 > f2) {
        return -1;
      }
      if (f1 < f2) {
        return 1;
      }
      return 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */