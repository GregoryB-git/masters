package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.drawerlayout.R.attr;
import androidx.drawerlayout.R.dimen;
import androidx.drawerlayout.R.styleable;
import java.util.ArrayList;
import java.util.List;
import z2;

public class DrawerLayout
  extends ViewGroup
  implements Openable
{
  private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
  private static final boolean ALLOW_EDGE_LOCK = false;
  public static final boolean CAN_HIDE_DESCENDANTS;
  private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
  private static final int DEFAULT_SCRIM_COLOR = -1728053248;
  public static final int[] LAYOUT_ATTRS;
  public static final int LOCK_MODE_LOCKED_CLOSED = 1;
  public static final int LOCK_MODE_LOCKED_OPEN = 2;
  public static final int LOCK_MODE_UNDEFINED = 3;
  public static final int LOCK_MODE_UNLOCKED = 0;
  private static final int MIN_DRAWER_MARGIN = 64;
  private static final int MIN_FLING_VELOCITY = 400;
  private static final int PEEK_DELAY = 160;
  private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
  public static final int STATE_DRAGGING = 1;
  public static final int STATE_IDLE = 0;
  public static final int STATE_SETTLING = 2;
  private static final String TAG = "DrawerLayout";
  private static final int[] THEME_ATTRS;
  private static final float TOUCH_SLOP_SENSITIVITY = 1.0F;
  private static boolean sEdgeSizeUsingSystemGestureInsets;
  private final AccessibilityViewCommand mActionDismiss = new AccessibilityViewCommand()
  {
    public boolean perform(@NonNull View paramAnonymousView, @Nullable AccessibilityViewCommand.CommandArguments paramAnonymousCommandArguments)
    {
      if ((isDrawerOpen(paramAnonymousView)) && (getDrawerLockMode(paramAnonymousView) != 2))
      {
        closeDrawer(paramAnonymousView);
        return true;
      }
      return false;
    }
  };
  private final ChildAccessibilityDelegate mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
  private Rect mChildHitRect;
  private Matrix mChildInvertedMatrix;
  private boolean mChildrenCanceledTouch;
  private boolean mDrawStatusBarBackground;
  private float mDrawerElevation;
  private int mDrawerState;
  private boolean mFirstLayout = true;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private Object mLastInsets;
  private final ViewDragCallback mLeftCallback;
  private final ViewDragHelper mLeftDragger;
  @Nullable
  private DrawerListener mListener;
  private List<DrawerListener> mListeners;
  private int mLockModeEnd = 3;
  private int mLockModeLeft = 3;
  private int mLockModeRight = 3;
  private int mLockModeStart = 3;
  private int mMinDrawerMargin;
  private final ArrayList<View> mNonDrawerViews;
  private final ViewDragCallback mRightCallback;
  private final ViewDragHelper mRightDragger;
  private int mScrimColor = -1728053248;
  private float mScrimOpacity;
  private Paint mScrimPaint = new Paint();
  private Drawable mShadowEnd = null;
  private Drawable mShadowLeft = null;
  private Drawable mShadowLeftResolved;
  private Drawable mShadowRight = null;
  private Drawable mShadowRightResolved;
  private Drawable mShadowStart = null;
  private Drawable mStatusBarBackground;
  private CharSequence mTitleLeft;
  private CharSequence mTitleRight;
  
  static
  {
    boolean bool = true;
    THEME_ATTRS = new int[] { 16843828 };
    LAYOUT_ATTRS = new int[] { 16842931 };
    int i = Build.VERSION.SDK_INT;
    CAN_HIDE_DESCENDANTS = true;
    SET_DRAWER_SHADOW_FROM_ELEVATION = true;
    if (i < 29) {
      bool = false;
    }
    sEdgeSizeUsingSystemGestureInsets = bool;
  }
  
  public DrawerLayout(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.drawerLayoutStyle);
  }
  
  public DrawerLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f = getResourcesgetDisplayMetricsdensity;
    mMinDrawerMargin = ((int)(64.0F * f + 0.5F));
    f *= 400.0F;
    ViewDragCallback localViewDragCallback = new ViewDragCallback(3);
    mLeftCallback = localViewDragCallback;
    Object localObject = new ViewDragCallback(5);
    mRightCallback = ((ViewDragCallback)localObject);
    ViewDragHelper localViewDragHelper = ViewDragHelper.create(this, 1.0F, localViewDragCallback);
    mLeftDragger = localViewDragHelper;
    localViewDragHelper.setEdgeTrackingEnabled(1);
    localViewDragHelper.setMinVelocity(f);
    localViewDragCallback.setDragger(localViewDragHelper);
    localViewDragHelper = ViewDragHelper.create(this, 1.0F, (ViewDragHelper.Callback)localObject);
    mRightDragger = localViewDragHelper;
    localViewDragHelper.setEdgeTrackingEnabled(2);
    localViewDragHelper.setMinVelocity(f);
    ((ViewDragCallback)localObject).setDragger(localViewDragHelper);
    setFocusableInTouchMode(true);
    ViewCompat.setImportantForAccessibility(this, 1);
    ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
    setMotionEventSplittingEnabled(false);
    if (ViewCompat.getFitsSystemWindows(this))
    {
      setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        public WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          paramAnonymousView = (DrawerLayout)paramAnonymousView;
          boolean bool;
          if (paramAnonymousWindowInsets.getSystemWindowInsetTop() > 0) {
            bool = true;
          } else {
            bool = false;
          }
          paramAnonymousView.setChildInsets(paramAnonymousWindowInsets, bool);
          return paramAnonymousWindowInsets.consumeSystemWindowInsets();
        }
      });
      setSystemUiVisibility(1280);
      localObject = paramContext.obtainStyledAttributes(THEME_ATTRS);
    }
    try
    {
      mStatusBarBackground = ((TypedArray)localObject).getDrawable(0);
      ((TypedArray)localObject).recycle();
    }
    finally
    {
      ((TypedArray)localObject).recycle();
    }
    try
    {
      paramInt = R.styleable.DrawerLayout_elevation;
      if (paramAttributeSet.hasValue(paramInt)) {
        mDrawerElevation = paramAttributeSet.getDimension(paramInt, 0.0F);
      } else {
        mDrawerElevation = getResources().getDimension(R.dimen.def_drawer_elevation);
      }
      paramAttributeSet.recycle();
      mNonDrawerViews = new ArrayList();
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  private boolean dispatchTransformedGenericPointerEvent(MotionEvent paramMotionEvent, View paramView)
  {
    boolean bool;
    if (!paramView.getMatrix().isIdentity())
    {
      paramMotionEvent = getTransformedMotionEvent(paramMotionEvent, paramView);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.recycle();
    }
    else
    {
      float f1 = getScrollX() - paramView.getLeft();
      float f2 = getScrollY() - paramView.getTop();
      paramMotionEvent.offsetLocation(f1, f2);
      bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.offsetLocation(-f1, -f2);
    }
    return bool;
  }
  
  private MotionEvent getTransformedMotionEvent(MotionEvent paramMotionEvent, View paramView)
  {
    float f1 = getScrollX() - paramView.getLeft();
    float f2 = getScrollY() - paramView.getTop();
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(f1, f2);
    paramView = paramView.getMatrix();
    if (!paramView.isIdentity())
    {
      if (mChildInvertedMatrix == null) {
        mChildInvertedMatrix = new Matrix();
      }
      paramView.invert(mChildInvertedMatrix);
      paramMotionEvent.transform(mChildInvertedMatrix);
    }
    return paramMotionEvent;
  }
  
  public static String gravityToString(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private static boolean hasOpaqueBackground(View paramView)
  {
    paramView = paramView.getBackground();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramView != null)
    {
      bool2 = bool1;
      if (paramView.getOpacity() == -1) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private boolean hasPeekingDrawer()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++) {
      if (getChildAtgetLayoutParamsisPeeking) {
        return true;
      }
    }
    return false;
  }
  
  private boolean hasVisibleDrawer()
  {
    boolean bool;
    if (findVisibleDrawer() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean includeChildForAccessibility(View paramView)
  {
    boolean bool;
    if ((ViewCompat.getImportantForAccessibility(paramView) != 4) && (ViewCompat.getImportantForAccessibility(paramView) != 2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isInBoundsOfChild(float paramFloat1, float paramFloat2, View paramView)
  {
    if (mChildHitRect == null) {
      mChildHitRect = new Rect();
    }
    paramView.getHitRect(mChildHitRect);
    return mChildHitRect.contains((int)paramFloat1, (int)paramFloat2);
  }
  
  private void mirror(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable != null) && (DrawableCompat.isAutoMirrored(paramDrawable))) {
      DrawableCompat.setLayoutDirection(paramDrawable, paramInt);
    }
  }
  
  private Drawable resolveLeftShadow()
  {
    int i = ViewCompat.getLayoutDirection(this);
    Drawable localDrawable;
    if (i == 0)
    {
      localDrawable = mShadowStart;
      if (localDrawable != null)
      {
        mirror(localDrawable, i);
        return mShadowStart;
      }
    }
    else
    {
      localDrawable = mShadowEnd;
      if (localDrawable != null)
      {
        mirror(localDrawable, i);
        return mShadowEnd;
      }
    }
    return mShadowLeft;
  }
  
  private Drawable resolveRightShadow()
  {
    int i = ViewCompat.getLayoutDirection(this);
    Drawable localDrawable;
    if (i == 0)
    {
      localDrawable = mShadowEnd;
      if (localDrawable != null)
      {
        mirror(localDrawable, i);
        return mShadowEnd;
      }
    }
    else
    {
      localDrawable = mShadowStart;
      if (localDrawable != null)
      {
        mirror(localDrawable, i);
        return mShadowStart;
      }
    }
    return mShadowRight;
  }
  
  private void resolveShadowDrawables()
  {
    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
      return;
    }
    mShadowLeftResolved = resolveLeftShadow();
    mShadowRightResolved = resolveRightShadow();
  }
  
  private void updateChildAccessibilityAction(View paramView)
  {
    AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS;
    ViewCompat.removeAccessibilityAction(paramView, localAccessibilityActionCompat.getId());
    if ((isDrawerOpen(paramView)) && (getDrawerLockMode(paramView) != 2)) {
      ViewCompat.replaceAccessibilityAction(paramView, localAccessibilityActionCompat, null, mActionDismiss);
    }
  }
  
  private void updateChildrenImportantForAccessibility(View paramView, boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (((!paramBoolean) && (!isDrawerView(localView))) || ((paramBoolean) && (localView == paramView))) {
        ViewCompat.setImportantForAccessibility(localView, 1);
      } else {
        ViewCompat.setImportantForAccessibility(localView, 4);
      }
    }
  }
  
  public void addDrawerListener(@NonNull DrawerListener paramDrawerListener)
  {
    if (paramDrawerListener == null) {
      return;
    }
    if (mListeners == null) {
      mListeners = new ArrayList();
    }
    mListeners.add(paramDrawerListener);
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i = getChildCount();
    int j = 0;
    int k = 0;
    int m = k;
    View localView;
    while (k < i)
    {
      localView = getChildAt(k);
      if (isDrawerView(localView))
      {
        if (isDrawerOpen(localView))
        {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          m = 1;
        }
      }
      else {
        mNonDrawerViews.add(localView);
      }
      k++;
    }
    if (m == 0)
    {
      m = mNonDrawerViews.size();
      for (k = j; k < m; k++)
      {
        localView = (View)mNonDrawerViews.get(k);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    }
    mNonDrawerViews.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((findOpenDrawer() == null) && (!isDrawerView(paramView))) {
      ViewCompat.setImportantForAccessibility(paramView, 1);
    } else {
      ViewCompat.setImportantForAccessibility(paramView, 4);
    }
    if (!CAN_HIDE_DESCENDANTS) {
      ViewCompat.setAccessibilityDelegate(paramView, mChildAccessibilityDelegate);
    }
  }
  
  public void cancelChildViewTouch()
  {
    if (!mChildrenCanceledTouch)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      int i = getChildCount();
      for (int j = 0; j < i; j++) {
        getChildAt(j).dispatchTouchEvent(localMotionEvent);
      }
      localMotionEvent.recycle();
      mChildrenCanceledTouch = true;
    }
  }
  
  public boolean checkDrawerViewAbsoluteGravity(View paramView, int paramInt)
  {
    boolean bool;
    if ((getDrawerViewAbsoluteGravity(paramView) & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
  
  public void close()
  {
    closeDrawer(8388611);
  }
  
  public void closeDrawer(int paramInt)
  {
    closeDrawer(paramInt, true);
  }
  
  public void closeDrawer(int paramInt, boolean paramBoolean)
  {
    Object localObject = findDrawerWithGravity(paramInt);
    if (localObject != null)
    {
      closeDrawer((View)localObject, paramBoolean);
      return;
    }
    localObject = z2.t("No drawer view found with gravity ");
    ((StringBuilder)localObject).append(gravityToString(paramInt));
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void closeDrawer(@NonNull View paramView)
  {
    closeDrawer(paramView, true);
  }
  
  public void closeDrawer(@NonNull View paramView, boolean paramBoolean)
  {
    if (isDrawerView(paramView))
    {
      localObject = (LayoutParams)paramView.getLayoutParams();
      if (mFirstLayout)
      {
        onScreen = 0.0F;
        openState = 0;
      }
      else if (paramBoolean)
      {
        openState |= 0x4;
        if (checkDrawerViewAbsoluteGravity(paramView, 3)) {
          mLeftDragger.smoothSlideViewTo(paramView, -paramView.getWidth(), paramView.getTop());
        } else {
          mRightDragger.smoothSlideViewTo(paramView, getWidth(), paramView.getTop());
        }
      }
      else
      {
        moveDrawerToOffset(paramView, 0.0F);
        updateDrawerState(0, paramView);
        paramView.setVisibility(4);
      }
      invalidate();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" is not a sliding drawer");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void closeDrawers()
  {
    closeDrawers(false);
  }
  
  public void closeDrawers(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      View localView = getChildAt(j);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      m = k;
      if (isDrawerView(localView)) {
        if ((paramBoolean) && (!isPeeking))
        {
          m = k;
        }
        else
        {
          m = localView.getWidth();
          int n;
          if (checkDrawerViewAbsoluteGravity(localView, 3)) {
            n = mLeftDragger.smoothSlideViewTo(localView, -m, localView.getTop());
          } else {
            n = mRightDragger.smoothSlideViewTo(localView, getWidth(), localView.getTop());
          }
          m = k | n;
          isPeeking = false;
        }
      }
      j++;
    }
    mLeftCallback.removeCallbacks();
    mRightCallback.removeCallbacks();
    if (k != 0) {
      invalidate();
    }
  }
  
  public void computeScroll()
  {
    int i = getChildCount();
    float f = 0.0F;
    for (int j = 0; j < i; j++) {
      f = Math.max(f, getChildAtgetLayoutParamsonScreen);
    }
    mScrimOpacity = f;
    boolean bool1 = mLeftDragger.continueSettling(true);
    boolean bool2 = mRightDragger.continueSettling(true);
    if ((bool1) || (bool2)) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (((paramMotionEvent.getSource() & 0x2) != 0) && (paramMotionEvent.getAction() != 10) && (mScrimOpacity > 0.0F))
    {
      int i = getChildCount();
      if (i != 0)
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        i--;
        while (i >= 0)
        {
          View localView = getChildAt(i);
          if ((isInBoundsOfChild(f1, f2, localView)) && (!isContentView(localView)) && (dispatchTransformedGenericPointerEvent(paramMotionEvent, localView))) {
            return true;
          }
          i--;
        }
      }
      return false;
    }
    return super.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public void dispatchOnDrawerClosed(View paramView)
  {
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    if ((openState & 0x1) == 1)
    {
      openState = 0;
      localObject = mListeners;
      if (localObject != null) {
        for (int i = ((List)localObject).size() - 1; i >= 0; i--) {
          ((DrawerListener)mListeners.get(i)).onDrawerClosed(paramView);
        }
      }
      updateChildrenImportantForAccessibility(paramView, false);
      updateChildAccessibilityAction(paramView);
      if (hasWindowFocus())
      {
        paramView = getRootView();
        if (paramView != null) {
          paramView.sendAccessibilityEvent(32);
        }
      }
    }
  }
  
  public void dispatchOnDrawerOpened(View paramView)
  {
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    if ((openState & 0x1) == 0)
    {
      openState = 1;
      localObject = mListeners;
      if (localObject != null) {
        for (int i = ((List)localObject).size() - 1; i >= 0; i--) {
          ((DrawerListener)mListeners.get(i)).onDrawerOpened(paramView);
        }
      }
      updateChildrenImportantForAccessibility(paramView, true);
      updateChildAccessibilityAction(paramView);
      if (hasWindowFocus()) {
        sendAccessibilityEvent(32);
      }
    }
  }
  
  public void dispatchOnDrawerSlide(View paramView, float paramFloat)
  {
    List localList = mListeners;
    if (localList != null) {
      for (int i = localList.size() - 1; i >= 0; i--) {
        ((DrawerListener)mListeners.get(i)).onDrawerSlide(paramView, paramFloat);
      }
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i = getHeight();
    boolean bool1 = isContentView(paramView);
    int j = getWidth();
    int k = paramCanvas.save();
    int m = 0;
    int n = j;
    int i2;
    if (bool1)
    {
      int i1 = getChildCount();
      n = 0;
      int i3;
      for (m = n; n < i1; m = i3)
      {
        View localView = getChildAt(n);
        i2 = j;
        i3 = m;
        if (localView != paramView)
        {
          i2 = j;
          i3 = m;
          if (localView.getVisibility() == 0)
          {
            i2 = j;
            i3 = m;
            if (hasOpaqueBackground(localView))
            {
              i2 = j;
              i3 = m;
              if (isDrawerView(localView)) {
                if (localView.getHeight() < i)
                {
                  i2 = j;
                  i3 = m;
                }
                else
                {
                  int i4;
                  if (checkDrawerViewAbsoluteGravity(localView, 3))
                  {
                    i4 = localView.getRight();
                    i2 = j;
                    i3 = m;
                    if (i4 > m)
                    {
                      i3 = i4;
                      i2 = j;
                    }
                  }
                  else
                  {
                    i4 = localView.getLeft();
                    i2 = j;
                    i3 = m;
                    if (i4 < j)
                    {
                      i2 = i4;
                      i3 = m;
                    }
                  }
                }
              }
            }
          }
        }
        n++;
        j = i2;
      }
      paramCanvas.clipRect(m, 0, j, getHeight());
      n = j;
    }
    boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(k);
    float f = mScrimOpacity;
    if ((f > 0.0F) && (bool1))
    {
      j = mScrimColor;
      i2 = (int)(((0xFF000000 & j) >>> 24) * f);
      mScrimPaint.setColor(j & 0xFFFFFF | i2 << 24);
      paramCanvas.drawRect(m, 0.0F, n, getHeight(), mScrimPaint);
    }
    else if ((mShadowLeftResolved != null) && (checkDrawerViewAbsoluteGravity(paramView, 3)))
    {
      m = mShadowLeftResolved.getIntrinsicWidth();
      j = paramView.getRight();
      n = mLeftDragger.getEdgeSize();
      f = Math.max(0.0F, Math.min(j / n, 1.0F));
      mShadowLeftResolved.setBounds(j, paramView.getTop(), m + j, paramView.getBottom());
      mShadowLeftResolved.setAlpha((int)(f * 255.0F));
      mShadowLeftResolved.draw(paramCanvas);
    }
    else if ((mShadowRightResolved != null) && (checkDrawerViewAbsoluteGravity(paramView, 5)))
    {
      i2 = mShadowRightResolved.getIntrinsicWidth();
      m = paramView.getLeft();
      n = getWidth();
      j = mRightDragger.getEdgeSize();
      f = Math.max(0.0F, Math.min((n - m) / j, 1.0F));
      mShadowRightResolved.setBounds(m - i2, paramView.getTop(), m, paramView.getBottom());
      mShadowRightResolved.setAlpha((int)(f * 255.0F));
      mShadowRightResolved.draw(paramCanvas);
    }
    return bool2;
  }
  
  public View findDrawerWithGravity(int paramInt)
  {
    int i = GravityCompat.getAbsoluteGravity(paramInt, ViewCompat.getLayoutDirection(this));
    int j = getChildCount();
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      View localView = getChildAt(paramInt);
      if ((getDrawerViewAbsoluteGravity(localView) & 0x7) == (i & 0x7)) {
        return localView;
      }
    }
    return null;
  }
  
  public View findOpenDrawer()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((getLayoutParamsopenState & 0x1) == 1) {
        return localView;
      }
    }
    return null;
  }
  
  public View findVisibleDrawer()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((isDrawerView(localView)) && (isDrawerVisible(localView))) {
        return localView;
      }
    }
    return null;
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
    } else if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    } else {
      paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
    return paramLayoutParams;
  }
  
  public float getDrawerElevation()
  {
    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
      return mDrawerElevation;
    }
    return 0.0F;
  }
  
  public int getDrawerLockMode(int paramInt)
  {
    int i = ViewCompat.getLayoutDirection(this);
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 8388611)
        {
          if (paramInt == 8388613)
          {
            paramInt = mLockModeEnd;
            if (paramInt != 3) {
              return paramInt;
            }
            if (i == 0) {
              paramInt = mLockModeRight;
            } else {
              paramInt = mLockModeLeft;
            }
            if (paramInt != 3) {
              return paramInt;
            }
          }
        }
        else
        {
          paramInt = mLockModeStart;
          if (paramInt != 3) {
            return paramInt;
          }
          if (i == 0) {
            paramInt = mLockModeLeft;
          } else {
            paramInt = mLockModeRight;
          }
          if (paramInt != 3) {
            return paramInt;
          }
        }
      }
      else
      {
        paramInt = mLockModeRight;
        if (paramInt != 3) {
          return paramInt;
        }
        if (i == 0) {
          paramInt = mLockModeEnd;
        } else {
          paramInt = mLockModeStart;
        }
        if (paramInt != 3) {
          return paramInt;
        }
      }
    }
    else
    {
      paramInt = mLockModeLeft;
      if (paramInt != 3) {
        return paramInt;
      }
      if (i == 0) {
        paramInt = mLockModeStart;
      } else {
        paramInt = mLockModeEnd;
      }
      if (paramInt != 3) {
        return paramInt;
      }
    }
    return 0;
  }
  
  public int getDrawerLockMode(@NonNull View paramView)
  {
    if (isDrawerView(paramView)) {
      return getDrawerLockMode(getLayoutParamsgravity);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @Nullable
  public CharSequence getDrawerTitle(int paramInt)
  {
    paramInt = GravityCompat.getAbsoluteGravity(paramInt, ViewCompat.getLayoutDirection(this));
    if (paramInt == 3) {
      return mTitleLeft;
    }
    if (paramInt == 5) {
      return mTitleRight;
    }
    return null;
  }
  
  public int getDrawerViewAbsoluteGravity(View paramView)
  {
    return GravityCompat.getAbsoluteGravity(getLayoutParamsgravity, ViewCompat.getLayoutDirection(this));
  }
  
  public float getDrawerViewOffset(View paramView)
  {
    return getLayoutParamsonScreen;
  }
  
  @Nullable
  public Drawable getStatusBarBackgroundDrawable()
  {
    return mStatusBarBackground;
  }
  
  public boolean isContentView(View paramView)
  {
    boolean bool;
    if (getLayoutParamsgravity == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isDrawerOpen(int paramInt)
  {
    View localView = findDrawerWithGravity(paramInt);
    if (localView != null) {
      return isDrawerOpen(localView);
    }
    return false;
  }
  
  public boolean isDrawerOpen(@NonNull View paramView)
  {
    if (isDrawerView(paramView))
    {
      int i = getLayoutParamsopenState;
      boolean bool = true;
      if ((i & 0x1) != 1) {
        bool = false;
      }
      return bool;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public boolean isDrawerView(View paramView)
  {
    int i = GravityCompat.getAbsoluteGravity(getLayoutParamsgravity, ViewCompat.getLayoutDirection(paramView));
    if ((i & 0x3) != 0) {
      return true;
    }
    return (i & 0x5) != 0;
  }
  
  public boolean isDrawerVisible(int paramInt)
  {
    View localView = findDrawerWithGravity(paramInt);
    if (localView != null) {
      return isDrawerVisible(localView);
    }
    return false;
  }
  
  public boolean isDrawerVisible(@NonNull View paramView)
  {
    if (isDrawerView(paramView))
    {
      boolean bool;
      if (getLayoutParamsonScreen > 0.0F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public boolean isOpen()
  {
    return isDrawerOpen(8388611);
  }
  
  public void moveDrawerToOffset(View paramView, float paramFloat)
  {
    float f1 = getDrawerViewOffset(paramView);
    float f2 = paramView.getWidth();
    int i = (int)(f1 * f2);
    i = (int)(f2 * paramFloat) - i;
    if (!checkDrawerViewAbsoluteGravity(paramView, 3)) {
      i = -i;
    }
    paramView.offsetLeftAndRight(i);
    setDrawerViewOffset(paramView, paramFloat);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mFirstLayout = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mFirstLayout = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((mDrawStatusBarBackground) && (mStatusBarBackground != null))
    {
      Object localObject = mLastInsets;
      int i;
      if (localObject != null) {
        i = ((WindowInsets)localObject).getSystemWindowInsetTop();
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
    boolean bool1 = mLeftDragger.shouldInterceptTouchEvent(paramMotionEvent);
    boolean bool2 = mRightDragger.shouldInterceptTouchEvent(paramMotionEvent);
    boolean bool3 = true;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3) {
            break label87;
          }
        }
        else
        {
          if (!mLeftDragger.checkTouchSlop(3)) {
            break label87;
          }
          mLeftCallback.removeCallbacks();
          mRightCallback.removeCallbacks();
          break label87;
        }
      }
      closeDrawers(true);
      mChildrenCanceledTouch = false;
      label87:
      i = 0;
    }
    else
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      mInitialMotionX = f1;
      mInitialMotionY = f2;
      if (mScrimOpacity > 0.0F)
      {
        paramMotionEvent = mLeftDragger.findTopChildUnder((int)f1, (int)f2);
        if ((paramMotionEvent != null) && (isContentView(paramMotionEvent)))
        {
          i = 1;
          break label158;
        }
      }
      i = 0;
      label158:
      mChildrenCanceledTouch = false;
    }
    boolean bool4 = bool3;
    if (!(bool1 | bool2))
    {
      bool4 = bool3;
      if (i == 0)
      {
        bool4 = bool3;
        if (!hasPeekingDrawer()) {
          if (mChildrenCanceledTouch) {
            bool4 = bool3;
          } else {
            bool4 = false;
          }
        }
      }
    }
    return bool4;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (hasVisibleDrawer()))
    {
      paramKeyEvent.startTracking();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = findVisibleDrawer();
      if ((paramKeyEvent != null) && (getDrawerLockMode(paramKeyEvent) == 0)) {
        closeDrawers();
      }
      boolean bool;
      if (paramKeyEvent != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mInLayout = true;
    int i = paramInt3 - paramInt1;
    int j = getChildCount();
    Object localObject1;
    Object localObject2;
    for (paramInt3 = 0; paramInt3 < j; paramInt3++)
    {
      localObject1 = getChildAt(paramInt3);
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        int k;
        int m;
        int n;
        if (isContentView((View)localObject1))
        {
          k = leftMargin;
          paramInt1 = topMargin;
          m = ((View)localObject1).getMeasuredWidth();
          n = topMargin;
          ((View)localObject1).layout(k, paramInt1, m + k, ((View)localObject1).getMeasuredHeight() + n);
        }
        else
        {
          int i1 = ((View)localObject1).getMeasuredWidth();
          int i2 = ((View)localObject1).getMeasuredHeight();
          float f;
          if (checkDrawerViewAbsoluteGravity((View)localObject1, 3))
          {
            paramInt1 = -i1;
            f = i1;
            k = paramInt1 + (int)(onScreen * f);
            f = (i1 + k) / f;
          }
          else
          {
            f = i1;
            k = i - (int)(onScreen * f);
            f = (i - k) / f;
          }
          if (f != onScreen) {
            n = 1;
          } else {
            n = 0;
          }
          paramInt1 = gravity & 0x70;
          if (paramInt1 != 16)
          {
            if (paramInt1 != 80)
            {
              paramInt1 = topMargin;
              ((View)localObject1).layout(k, paramInt1, i1 + k, i2 + paramInt1);
            }
            else
            {
              paramInt1 = paramInt4 - paramInt2;
              ((View)localObject1).layout(k, paramInt1 - bottomMargin - ((View)localObject1).getMeasuredHeight(), i1 + k, paramInt1 - bottomMargin);
            }
          }
          else
          {
            int i3 = paramInt4 - paramInt2;
            m = (i3 - i2) / 2;
            paramInt1 = topMargin;
            if (m >= paramInt1)
            {
              int i4 = bottomMargin;
              paramInt1 = m;
              if (m + i2 > i3 - i4) {
                paramInt1 = i3 - i4 - i2;
              }
            }
            ((View)localObject1).layout(k, paramInt1, i1 + k, i2 + paramInt1);
          }
          if (n != 0) {
            setDrawerViewOffset((View)localObject1, f);
          }
          if (onScreen > 0.0F) {
            paramInt1 = 0;
          } else {
            paramInt1 = 4;
          }
          if (((View)localObject1).getVisibility() != paramInt1) {
            ((View)localObject1).setVisibility(paramInt1);
          }
        }
      }
    }
    if (sEdgeSizeUsingSystemGestureInsets)
    {
      localObject1 = getRootWindowInsets();
      if (localObject1 != null)
      {
        localObject1 = WindowInsetsCompat.toWindowInsetsCompat((WindowInsets)localObject1).getSystemGestureInsets();
        localObject2 = mLeftDragger;
        ((ViewDragHelper)localObject2).setEdgeSize(Math.max(((ViewDragHelper)localObject2).getDefaultEdgeSize(), left));
        localObject2 = mRightDragger;
        ((ViewDragHelper)localObject2).setEdgeSize(Math.max(((ViewDragHelper)localObject2).getDefaultEdgeSize(), right));
      }
    }
    mInLayout = false;
    mFirstLayout = false;
  }
  
  @SuppressLint({"WrongConstant"})
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    int i1;
    if (i == 1073741824)
    {
      n = k;
      i1 = m;
      if (j == 1073741824) {}
    }
    else
    {
      if (!isInEditMode()) {
        break label739;
      }
      if (i == 0) {
        k = 300;
      }
      n = k;
      i1 = m;
      if (j == 0)
      {
        i1 = 300;
        n = k;
      }
    }
    setMeasuredDimension(n, i1);
    Object localObject = mLastInsets;
    i = 0;
    if ((localObject != null) && (ViewCompat.getFitsSystemWindows(this))) {
      j = 1;
    } else {
      j = 0;
    }
    int i2 = ViewCompat.getLayoutDirection(this);
    int i3 = getChildCount();
    m = 0;
    k = m;
    View localView;
    for (;;)
    {
      int i4 = 0;
      if (i >= i3) {
        break label738;
      }
      localView = getChildAt(i);
      LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (j != 0)
        {
          i5 = GravityCompat.getAbsoluteGravity(gravity, i2);
          WindowInsets localWindowInsets;
          if (ViewCompat.getFitsSystemWindows(localView))
          {
            localWindowInsets = (WindowInsets)mLastInsets;
            if (i5 == 3)
            {
              localObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
            }
            else
            {
              localObject = localWindowInsets;
              if (i5 == 5) {
                localObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
              }
            }
            localView.dispatchApplyWindowInsets((WindowInsets)localObject);
          }
          else
          {
            localWindowInsets = (WindowInsets)mLastInsets;
            if (i5 == 3)
            {
              localObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
            }
            else
            {
              localObject = localWindowInsets;
              if (i5 == 5) {
                localObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
              }
            }
            leftMargin = ((WindowInsets)localObject).getSystemWindowInsetLeft();
            topMargin = ((WindowInsets)localObject).getSystemWindowInsetTop();
            rightMargin = ((WindowInsets)localObject).getSystemWindowInsetRight();
            bottomMargin = ((WindowInsets)localObject).getSystemWindowInsetBottom();
          }
        }
        if (isContentView(localView)) {
          localView.measure(View.MeasureSpec.makeMeasureSpec(n - leftMargin - rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - topMargin - bottomMargin, 1073741824));
        }
      }
      else
      {
        break label668;
      }
      if (!isDrawerView(localView)) {
        break;
      }
      if (SET_DRAWER_SHADOW_FROM_ELEVATION)
      {
        float f1 = ViewCompat.getElevation(localView);
        float f2 = mDrawerElevation;
        if (f1 != f2) {
          ViewCompat.setElevation(localView, f2);
        }
      }
      int i5 = getDrawerViewAbsoluteGravity(localView) & 0x7;
      if (i5 == 3) {
        i4 = 1;
      }
      if (((i4 != 0) && (m != 0)) || ((i4 == 0) && (k != 0)))
      {
        localObject = z2.t("Child drawer has absolute gravity ");
        ((StringBuilder)localObject).append(gravityToString(i5));
        ((StringBuilder)localObject).append(" but this ");
        ((StringBuilder)localObject).append("DrawerLayout");
        ((StringBuilder)localObject).append(" already has a drawer view along that edge");
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      if (i4 != 0) {
        m = 1;
      } else {
        k = 1;
      }
      localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, mMinDrawerMargin + leftMargin + rightMargin, width), ViewGroup.getChildMeasureSpec(paramInt2, topMargin + bottomMargin, height));
      label668:
      i++;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Child ");
    ((StringBuilder)localObject).append(localView);
    ((StringBuilder)localObject).append(" at index ");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
    label738:
    return;
    label739:
    throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
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
    int i = openDrawerGravity;
    if (i != 0)
    {
      View localView = findDrawerWithGravity(i);
      if (localView != null) {
        openDrawer(localView);
      }
    }
    i = lockModeLeft;
    if (i != 3) {
      setDrawerLockMode(i, 3);
    }
    i = lockModeRight;
    if (i != 3) {
      setDrawerLockMode(i, 5);
    }
    i = lockModeStart;
    if (i != 3) {
      setDrawerLockMode(i, 8388611);
    }
    i = lockModeEnd;
    if (i != 3) {
      setDrawerLockMode(i, 8388613);
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    resolveShadowDrawables();
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      LayoutParams localLayoutParams = (LayoutParams)getChildAt(j).getLayoutParams();
      int k = openState;
      int m = 1;
      int n;
      if (k == 1) {
        n = 1;
      } else {
        n = 0;
      }
      if (k != 2) {
        m = 0;
      }
      if ((n == 0) && (m == 0)) {
        j++;
      } else {
        openDrawerGravity = gravity;
      }
    }
    lockModeLeft = mLockModeLeft;
    lockModeRight = mLockModeRight;
    lockModeStart = mLockModeStart;
    lockModeEnd = mLockModeEnd;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    mLeftDragger.processTouchEvent(paramMotionEvent);
    mRightDragger.processTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getAction() & 0xFF;
    boolean bool = false;
    float f1;
    float f2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 3)
        {
          closeDrawers(true);
          mChildrenCanceledTouch = false;
        }
      }
      else
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        paramMotionEvent = mLeftDragger.findTopChildUnder((int)f1, (int)f2);
        if ((paramMotionEvent != null) && (isContentView(paramMotionEvent)))
        {
          f1 -= mInitialMotionX;
          f2 -= mInitialMotionY;
          i = mLeftDragger.getTouchSlop();
          if (f2 * f2 + f1 * f1 < i * i)
          {
            paramMotionEvent = findOpenDrawer();
            if ((paramMotionEvent != null) && (getDrawerLockMode(paramMotionEvent) != 2)) {
              break label160;
            }
          }
        }
        bool = true;
        label160:
        closeDrawers(bool);
      }
    }
    else
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      mInitialMotionX = f1;
      mInitialMotionY = f2;
      mChildrenCanceledTouch = false;
    }
    return true;
  }
  
  public void open()
  {
    openDrawer(8388611);
  }
  
  public void openDrawer(int paramInt)
  {
    openDrawer(paramInt, true);
  }
  
  public void openDrawer(int paramInt, boolean paramBoolean)
  {
    Object localObject = findDrawerWithGravity(paramInt);
    if (localObject != null)
    {
      openDrawer((View)localObject, paramBoolean);
      return;
    }
    localObject = z2.t("No drawer view found with gravity ");
    ((StringBuilder)localObject).append(gravityToString(paramInt));
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void openDrawer(@NonNull View paramView)
  {
    openDrawer(paramView, true);
  }
  
  public void openDrawer(@NonNull View paramView, boolean paramBoolean)
  {
    if (isDrawerView(paramView))
    {
      localObject = (LayoutParams)paramView.getLayoutParams();
      if (mFirstLayout)
      {
        onScreen = 1.0F;
        openState = 1;
        updateChildrenImportantForAccessibility(paramView, true);
        updateChildAccessibilityAction(paramView);
      }
      else if (paramBoolean)
      {
        openState |= 0x2;
        if (checkDrawerViewAbsoluteGravity(paramView, 3)) {
          mLeftDragger.smoothSlideViewTo(paramView, 0, paramView.getTop());
        } else {
          mRightDragger.smoothSlideViewTo(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
        }
      }
      else
      {
        moveDrawerToOffset(paramView, 1.0F);
        updateDrawerState(0, paramView);
        paramView.setVisibility(0);
      }
      invalidate();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" is not a sliding drawer");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void removeDrawerListener(@NonNull DrawerListener paramDrawerListener)
  {
    if (paramDrawerListener == null) {
      return;
    }
    List localList = mListeners;
    if (localList == null) {
      return;
    }
    localList.remove(paramDrawerListener);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean) {
      closeDrawers(true);
    }
  }
  
  public void requestLayout()
  {
    if (!mInLayout) {
      super.requestLayout();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setChildInsets(Object paramObject, boolean paramBoolean)
  {
    mLastInsets = paramObject;
    mDrawStatusBarBackground = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    setWillNotDraw(paramBoolean);
    requestLayout();
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    mDrawerElevation = paramFloat;
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (isDrawerView(localView)) {
        ViewCompat.setElevation(localView, mDrawerElevation);
      }
    }
  }
  
  @Deprecated
  public void setDrawerListener(DrawerListener paramDrawerListener)
  {
    DrawerListener localDrawerListener = mListener;
    if (localDrawerListener != null) {
      removeDrawerListener(localDrawerListener);
    }
    if (paramDrawerListener != null) {
      addDrawerListener(paramDrawerListener);
    }
    mListener = paramDrawerListener;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    setDrawerLockMode(paramInt, 3);
    setDrawerLockMode(paramInt, 5);
  }
  
  public void setDrawerLockMode(int paramInt1, int paramInt2)
  {
    int i = GravityCompat.getAbsoluteGravity(paramInt2, ViewCompat.getLayoutDirection(this));
    if (paramInt2 != 3)
    {
      if (paramInt2 != 5)
      {
        if (paramInt2 != 8388611)
        {
          if (paramInt2 == 8388613) {
            mLockModeEnd = paramInt1;
          }
        }
        else {
          mLockModeStart = paramInt1;
        }
      }
      else {
        mLockModeRight = paramInt1;
      }
    }
    else {
      mLockModeLeft = paramInt1;
    }
    Object localObject;
    if (paramInt1 != 0)
    {
      if (i == 3) {
        localObject = mLeftDragger;
      } else {
        localObject = mRightDragger;
      }
      ((ViewDragHelper)localObject).cancel();
    }
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        localObject = findDrawerWithGravity(i);
        if (localObject != null) {
          openDrawer((View)localObject);
        }
      }
    }
    else
    {
      localObject = findDrawerWithGravity(i);
      if (localObject != null) {
        closeDrawer((View)localObject);
      }
    }
  }
  
  public void setDrawerLockMode(int paramInt, @NonNull View paramView)
  {
    if (isDrawerView(paramView))
    {
      setDrawerLockMode(paramInt, getLayoutParamsgravity);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("View ");
    localStringBuilder.append(paramView);
    localStringBuilder.append(" is not a drawer with appropriate layout_gravity");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDrawerShadow(@DrawableRes int paramInt1, int paramInt2)
  {
    setDrawerShadow(ContextCompat.getDrawable(getContext(), paramInt1), paramInt2);
  }
  
  public void setDrawerShadow(Drawable paramDrawable, int paramInt)
  {
    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
      return;
    }
    if ((paramInt & 0x800003) == 8388611)
    {
      mShadowStart = paramDrawable;
    }
    else if ((paramInt & 0x800005) == 8388613)
    {
      mShadowEnd = paramDrawable;
    }
    else if ((paramInt & 0x3) == 3)
    {
      mShadowLeft = paramDrawable;
    }
    else
    {
      if ((paramInt & 0x5) != 5) {
        return;
      }
      mShadowRight = paramDrawable;
    }
    resolveShadowDrawables();
    invalidate();
  }
  
  public void setDrawerTitle(int paramInt, @Nullable CharSequence paramCharSequence)
  {
    paramInt = GravityCompat.getAbsoluteGravity(paramInt, ViewCompat.getLayoutDirection(this));
    if (paramInt == 3) {
      mTitleLeft = paramCharSequence;
    } else if (paramInt == 5) {
      mTitleRight = paramCharSequence;
    }
  }
  
  public void setDrawerViewOffset(View paramView, float paramFloat)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat == onScreen) {
      return;
    }
    onScreen = paramFloat;
    dispatchOnDrawerSlide(paramView, paramFloat);
  }
  
  public void setScrimColor(@ColorInt int paramInt)
  {
    mScrimColor = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = ContextCompat.getDrawable(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    mStatusBarBackground = localDrawable;
    invalidate();
  }
  
  public void setStatusBarBackground(@Nullable Drawable paramDrawable)
  {
    mStatusBarBackground = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(@ColorInt int paramInt)
  {
    mStatusBarBackground = new ColorDrawable(paramInt);
    invalidate();
  }
  
  public void updateDrawerState(int paramInt, View paramView)
  {
    int i = mLeftDragger.getViewDragState();
    int j = mRightDragger.getViewDragState();
    int k = 2;
    int m;
    if ((i != 1) && (j != 1))
    {
      m = k;
      if (i != 2) {
        if (j == 2) {
          m = k;
        } else {
          m = 0;
        }
      }
    }
    else
    {
      m = 1;
    }
    if ((paramView != null) && (paramInt == 0))
    {
      float f = getLayoutParamsonScreen;
      if (f == 0.0F) {
        dispatchOnDrawerClosed(paramView);
      } else if (f == 1.0F) {
        dispatchOnDrawerOpened(paramView);
      }
    }
    if (m != mDrawerState)
    {
      mDrawerState = m;
      paramView = mListeners;
      if (paramView != null) {
        for (paramInt = paramView.size() - 1; paramInt >= 0; paramInt--) {
          ((DrawerListener)mListeners.get(paramInt)).onDrawerStateChanged(m);
        }
      }
    }
  }
  
  public class AccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    private final Rect mTmpRect = new Rect();
    
    public AccessibilityDelegate() {}
    
    private void addChildrenForAccessibility(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, ViewGroup paramViewGroup)
    {
      int i = paramViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramViewGroup.getChildAt(j);
        if (DrawerLayout.includeChildForAccessibility(localView)) {
          paramAccessibilityNodeInfoCompat.addChild(localView);
        }
      }
    }
    
    private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat2)
    {
      Rect localRect = mTmpRect;
      paramAccessibilityNodeInfoCompat2.getBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setVisibleToUser(paramAccessibilityNodeInfoCompat2.isVisibleToUser());
      paramAccessibilityNodeInfoCompat1.setPackageName(paramAccessibilityNodeInfoCompat2.getPackageName());
      paramAccessibilityNodeInfoCompat1.setClassName(paramAccessibilityNodeInfoCompat2.getClassName());
      paramAccessibilityNodeInfoCompat1.setContentDescription(paramAccessibilityNodeInfoCompat2.getContentDescription());
      paramAccessibilityNodeInfoCompat1.setEnabled(paramAccessibilityNodeInfoCompat2.isEnabled());
      paramAccessibilityNodeInfoCompat1.setFocused(paramAccessibilityNodeInfoCompat2.isFocused());
      paramAccessibilityNodeInfoCompat1.setAccessibilityFocused(paramAccessibilityNodeInfoCompat2.isAccessibilityFocused());
      paramAccessibilityNodeInfoCompat1.setSelected(paramAccessibilityNodeInfoCompat2.isSelected());
      paramAccessibilityNodeInfoCompat1.addAction(paramAccessibilityNodeInfoCompat2.getActions());
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramView = paramAccessibilityEvent.getText();
        paramAccessibilityEvent = findVisibleDrawer();
        if (paramAccessibilityEvent != null)
        {
          int i = getDrawerViewAbsoluteGravity(paramAccessibilityEvent);
          paramAccessibilityEvent = getDrawerTitle(i);
          if (paramAccessibilityEvent != null) {
            paramView.add(paramAccessibilityEvent);
          }
        }
        return true;
      }
      return super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      if (DrawerLayout.CAN_HIDE_DESCENDANTS)
      {
        super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      }
      else
      {
        AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain(paramAccessibilityNodeInfoCompat);
        super.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
        paramAccessibilityNodeInfoCompat.setSource(paramView);
        ViewParent localViewParent = ViewCompat.getParentForAccessibility(paramView);
        if ((localViewParent instanceof View)) {
          paramAccessibilityNodeInfoCompat.setParent((View)localViewParent);
        }
        copyNodeInfoNoChildren(paramAccessibilityNodeInfoCompat, localAccessibilityNodeInfoCompat);
        localAccessibilityNodeInfoCompat.recycle();
        addChildrenForAccessibility(paramAccessibilityNodeInfoCompat, (ViewGroup)paramView);
      }
      paramAccessibilityNodeInfoCompat.setClassName("androidx.drawerlayout.widget.DrawerLayout");
      paramAccessibilityNodeInfoCompat.setFocusable(false);
      paramAccessibilityNodeInfoCompat.setFocused(false);
      paramAccessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
      paramAccessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((!DrawerLayout.CAN_HIDE_DESCENDANTS) && (!DrawerLayout.includeChildForAccessibility(paramView))) {
        return false;
      }
      return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
  }
  
  public static final class ChildAccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      if (!DrawerLayout.includeChildForAccessibility(paramView)) {
        paramAccessibilityNodeInfoCompat.setParent(null);
      }
    }
  }
  
  public static abstract interface DrawerListener
  {
    public abstract void onDrawerClosed(@NonNull View paramView);
    
    public abstract void onDrawerOpened(@NonNull View paramView);
    
    public abstract void onDrawerSlide(@NonNull View paramView, float paramFloat);
    
    public abstract void onDrawerStateChanged(int paramInt);
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int FLAG_IS_CLOSING = 4;
    private static final int FLAG_IS_OPENED = 1;
    private static final int FLAG_IS_OPENING = 2;
    public int gravity = 0;
    public boolean isPeeking;
    public float onScreen;
    public int openState;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(int paramInt1, int paramInt2, int paramInt3)
    {
      this(paramInt1, paramInt2);
    }
    
    public LayoutParams(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.LAYOUT_ATTRS);
      gravity = paramContext.getInt(0, 0);
      paramContext.recycle();
    }
    
    public LayoutParams(@NonNull ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(@NonNull LayoutParams paramLayoutParams)
    {
      super();
      gravity = gravity;
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public DrawerLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new DrawerLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public DrawerLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new DrawerLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public DrawerLayout.SavedState[] newArray(int paramAnonymousInt)
      {
        return new DrawerLayout.SavedState[paramAnonymousInt];
      }
    };
    public int lockModeEnd;
    public int lockModeLeft;
    public int lockModeRight;
    public int lockModeStart;
    public int openDrawerGravity = 0;
    
    public SavedState(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      openDrawerGravity = paramParcel.readInt();
      lockModeLeft = paramParcel.readInt();
      lockModeRight = paramParcel.readInt();
      lockModeStart = paramParcel.readInt();
      lockModeEnd = paramParcel.readInt();
    }
    
    public SavedState(@NonNull Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(openDrawerGravity);
      paramParcel.writeInt(lockModeLeft);
      paramParcel.writeInt(lockModeRight);
      paramParcel.writeInt(lockModeStart);
      paramParcel.writeInt(lockModeEnd);
    }
  }
  
  public static abstract class SimpleDrawerListener
    implements DrawerLayout.DrawerListener
  {
    public void onDrawerClosed(View paramView) {}
    
    public void onDrawerOpened(View paramView) {}
    
    public void onDrawerSlide(View paramView, float paramFloat) {}
    
    public void onDrawerStateChanged(int paramInt) {}
  }
  
  public class ViewDragCallback
    extends ViewDragHelper.Callback
  {
    private final int mAbsGravity;
    private ViewDragHelper mDragger;
    private final Runnable mPeekRunnable = new Runnable()
    {
      public void run()
      {
        peekDrawer();
      }
    };
    
    public ViewDragCallback(int paramInt)
    {
      mAbsGravity = paramInt;
    }
    
    private void closeOtherDrawer()
    {
      int i = mAbsGravity;
      int j = 3;
      if (i == 3) {
        j = 5;
      }
      View localView = findDrawerWithGravity(j);
      if (localView != null) {
        closeDrawer(localView);
      }
    }
    
    public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
    {
      if (checkDrawerViewAbsoluteGravity(paramView, 3)) {
        return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
      }
      paramInt2 = getWidth();
      return Math.max(paramInt2 - paramView.getWidth(), Math.min(paramInt1, paramInt2));
    }
    
    public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public int getViewHorizontalDragRange(View paramView)
    {
      int i;
      if (isDrawerView(paramView)) {
        i = paramView.getWidth();
      } else {
        i = 0;
      }
      return i;
    }
    
    public void onEdgeDragStarted(int paramInt1, int paramInt2)
    {
      View localView;
      if ((paramInt1 & 0x1) == 1) {
        localView = findDrawerWithGravity(3);
      } else {
        localView = findDrawerWithGravity(5);
      }
      if ((localView != null) && (getDrawerLockMode(localView) == 0)) {
        mDragger.captureChildView(localView, paramInt2);
      }
    }
    
    public boolean onEdgeLock(int paramInt)
    {
      return false;
    }
    
    public void onEdgeTouched(int paramInt1, int paramInt2)
    {
      postDelayed(mPeekRunnable, 160L);
    }
    
    public void onViewCaptured(View paramView, int paramInt)
    {
      getLayoutParamsisPeeking = false;
      closeOtherDrawer();
    }
    
    public void onViewDragStateChanged(int paramInt)
    {
      updateDrawerState(paramInt, mDragger.getCapturedView());
    }
    
    public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramInt2 = paramView.getWidth();
      float f;
      if (checkDrawerViewAbsoluteGravity(paramView, 3)) {
        f = paramInt1 + paramInt2;
      } else {
        f = getWidth() - paramInt1;
      }
      f /= paramInt2;
      setDrawerViewOffset(paramView, f);
      if (f == 0.0F) {
        paramInt1 = 4;
      } else {
        paramInt1 = 0;
      }
      paramView.setVisibility(paramInt1);
      invalidate();
    }
    
    public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
    {
      paramFloat2 = getDrawerViewOffset(paramView);
      int i = paramView.getWidth();
      int j;
      if (checkDrawerViewAbsoluteGravity(paramView, 3))
      {
        boolean bool = paramFloat1 < 0.0F;
        if ((!bool) && ((bool) || (paramFloat2 <= 0.5F))) {
          j = -i;
        } else {
          j = 0;
        }
      }
      else
      {
        int k = getWidth();
        if (paramFloat1 >= 0.0F)
        {
          j = k;
          if (paramFloat1 == 0.0F)
          {
            j = k;
            if (paramFloat2 <= 0.5F) {}
          }
        }
        else
        {
          j = k - i;
        }
      }
      mDragger.settleCapturedViewAt(j, paramView.getTop());
      invalidate();
    }
    
    public void peekDrawer()
    {
      int i = mDragger.getEdgeSize();
      int j = mAbsGravity;
      int k = 0;
      if (j == 3) {
        j = 1;
      } else {
        j = 0;
      }
      View localView;
      if (j != 0)
      {
        localView = findDrawerWithGravity(3);
        if (localView != null) {
          k = -localView.getWidth();
        }
        k += i;
      }
      else
      {
        localView = findDrawerWithGravity(5);
        k = getWidth() - i;
      }
      if ((localView != null) && (((j != 0) && (localView.getLeft() < k)) || ((j == 0) && (localView.getLeft() > k) && (getDrawerLockMode(localView) == 0))))
      {
        DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        mDragger.smoothSlideViewTo(localView, k, localView.getTop());
        isPeeking = true;
        invalidate();
        closeOtherDrawer();
        cancelChildViewTouch();
      }
    }
    
    public void removeCallbacks()
    {
      removeCallbacks(mPeekRunnable);
    }
    
    public void setDragger(ViewDragHelper paramViewDragHelper)
    {
      mDragger = paramViewDragHelper;
    }
    
    public boolean tryCaptureView(View paramView, int paramInt)
    {
      boolean bool;
      if ((isDrawerView(paramView)) && (checkDrawerViewAbsoluteGravity(paramView, mAbsGravity)) && (getDrawerLockMode(paramView) == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */