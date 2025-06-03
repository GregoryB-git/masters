package androidx.core.view;

import a3;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.DragShadowBuilder;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.SimpleArrayMap;
import androidx.core.R.id;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import g;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k5;
import l4;
import l5;
import m5;
import n5;
import o3;
import p3;
import z2;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat
{
  private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = { R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31 };
  public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
  public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
  public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
  public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
  @Deprecated
  public static final int LAYER_TYPE_HARDWARE = 2;
  @Deprecated
  public static final int LAYER_TYPE_NONE = 0;
  @Deprecated
  public static final int LAYER_TYPE_SOFTWARE = 1;
  public static final int LAYOUT_DIRECTION_INHERIT = 2;
  public static final int LAYOUT_DIRECTION_LOCALE = 3;
  public static final int LAYOUT_DIRECTION_LTR = 0;
  public static final int LAYOUT_DIRECTION_RTL = 1;
  @Deprecated
  public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
  @Deprecated
  public static final int MEASURED_SIZE_MASK = 16777215;
  @Deprecated
  public static final int MEASURED_STATE_MASK = -16777216;
  @Deprecated
  public static final int MEASURED_STATE_TOO_SMALL = 16777216;
  private static final OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new k5();
  @Deprecated
  public static final int OVER_SCROLL_ALWAYS = 0;
  @Deprecated
  public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
  @Deprecated
  public static final int OVER_SCROLL_NEVER = 2;
  public static final int SCROLL_AXIS_HORIZONTAL = 1;
  public static final int SCROLL_AXIS_NONE = 0;
  public static final int SCROLL_AXIS_VERTICAL = 2;
  public static final int SCROLL_INDICATOR_BOTTOM = 2;
  public static final int SCROLL_INDICATOR_END = 32;
  public static final int SCROLL_INDICATOR_LEFT = 4;
  public static final int SCROLL_INDICATOR_RIGHT = 8;
  public static final int SCROLL_INDICATOR_START = 16;
  public static final int SCROLL_INDICATOR_TOP = 1;
  private static final String TAG = "ViewCompat";
  public static final int TYPE_NON_TOUCH = 1;
  public static final int TYPE_TOUCH = 0;
  private static boolean sAccessibilityDelegateCheckFailed;
  private static Field sAccessibilityDelegateField;
  private static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();
  private static Method sChildrenDrawingOrderMethod;
  private static Method sDispatchFinishTemporaryDetach;
  private static Method sDispatchStartTemporaryDetach;
  private static Field sMinHeightField;
  private static boolean sMinHeightFieldFetched;
  private static Field sMinWidthField;
  private static boolean sMinWidthFieldFetched;
  private static final AtomicInteger sNextGeneratedId = new AtomicInteger(1);
  private static boolean sTempDetachBound;
  private static ThreadLocal<Rect> sThreadLocalRect;
  private static WeakHashMap<View, String> sTransitionNameMap;
  private static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap = null;
  
  static
  {
    sAccessibilityDelegateCheckFailed = false;
  }
  
  private static AccessibilityViewProperty<Boolean> accessibilityHeadingProperty()
  {
    new AccessibilityViewProperty(R.id.tag_accessibility_heading, Boolean.class, 28)
    {
      @RequiresApi(28)
      public Boolean frameworkGet(View paramAnonymousView)
      {
        return Boolean.valueOf(ViewCompat.Api28Impl.isAccessibilityHeading(paramAnonymousView));
      }
      
      @RequiresApi(28)
      public void frameworkSet(View paramAnonymousView, Boolean paramAnonymousBoolean)
      {
        ViewCompat.Api28Impl.setAccessibilityHeading(paramAnonymousView, paramAnonymousBoolean.booleanValue());
      }
      
      public boolean shouldUpdate(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
      {
        return booleanNullToFalseEquals(paramAnonymousBoolean1, paramAnonymousBoolean2) ^ true;
      }
    };
  }
  
  public static int addAccessibilityAction(@NonNull View paramView, @NonNull CharSequence paramCharSequence, @NonNull AccessibilityViewCommand paramAccessibilityViewCommand)
  {
    int i = getAvailableActionIdFromResources(paramView, paramCharSequence);
    if (i != -1) {
      addAccessibilityAction(paramView, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, paramCharSequence, paramAccessibilityViewCommand));
    }
    return i;
  }
  
  private static void addAccessibilityAction(@NonNull View paramView, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    ensureAccessibilityDelegateCompat(paramView);
    removeActionWithId(paramAccessibilityActionCompat.getId(), paramView);
    getActionList(paramView).add(paramAccessibilityActionCompat);
    notifyViewAccessibilityStateChangedIfNeeded(paramView, 0);
  }
  
  public static void addKeyboardNavigationClusters(@NonNull View paramView, @NonNull Collection<View> paramCollection, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.addKeyboardNavigationClusters(paramView, paramCollection, paramInt);
    }
  }
  
  public static void addOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      Api28Impl.addOnUnhandledKeyEventListener(paramView, paramOnUnhandledKeyEventListenerCompat);
      return;
    }
    int i = R.id.tag_unhandled_key_listeners;
    ArrayList localArrayList1 = (ArrayList)paramView.getTag(i);
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null)
    {
      localArrayList2 = new ArrayList();
      paramView.setTag(i, localArrayList2);
    }
    localArrayList2.add(paramOnUnhandledKeyEventListenerCompat);
    if (localArrayList2.size() == 1) {
      UnhandledKeyEventManager.registerListeningView(paramView);
    }
  }
  
  @NonNull
  public static ViewPropertyAnimatorCompat animate(@NonNull View paramView)
  {
    if (sViewPropertyAnimatorMap == null) {
      sViewPropertyAnimatorMap = new WeakHashMap();
    }
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1 = (ViewPropertyAnimatorCompat)sViewPropertyAnimatorMap.get(paramView);
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2 = localViewPropertyAnimatorCompat1;
    if (localViewPropertyAnimatorCompat1 == null)
    {
      localViewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(paramView);
      sViewPropertyAnimatorMap.put(paramView, localViewPropertyAnimatorCompat2);
    }
    return localViewPropertyAnimatorCompat2;
  }
  
  private static void bindTempDetach()
  {
    try
    {
      sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
      sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.e("ViewCompat", "Couldn't find method", localNoSuchMethodException);
    }
    sTempDetachBound = true;
  }
  
  @Deprecated
  public static boolean canScrollHorizontally(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  @Deprecated
  public static boolean canScrollVertically(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
  
  public static void cancelDragAndDrop(@NonNull View paramView)
  {
    Api24Impl.cancelDragAndDrop(paramView);
  }
  
  @Deprecated
  public static int combineMeasuredStates(int paramInt1, int paramInt2)
  {
    return View.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  private static void compatOffsetLeftAndRight(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0)
    {
      tickleInvalidationFlag(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        tickleInvalidationFlag((View)paramView);
      }
    }
  }
  
  private static void compatOffsetTopAndBottom(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0)
    {
      tickleInvalidationFlag(paramView);
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        tickleInvalidationFlag((View)paramView);
      }
    }
  }
  
  @NonNull
  public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Rect paramRect)
  {
    return Api21Impl.computeSystemWindowInsets(paramView, paramWindowInsetsCompat, paramRect);
  }
  
  @NonNull
  public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    WindowInsets localWindowInsets1 = paramWindowInsetsCompat.toWindowInsets();
    if (localWindowInsets1 != null)
    {
      WindowInsets localWindowInsets2 = Api20Impl.dispatchApplyWindowInsets(paramView, localWindowInsets1);
      if (!localWindowInsets2.equals(localWindowInsets1)) {
        return WindowInsetsCompat.toWindowInsetsCompat(localWindowInsets2, paramView);
      }
    }
    return paramWindowInsetsCompat;
  }
  
  public static void dispatchFinishTemporaryDetach(@NonNull View paramView)
  {
    Api24Impl.dispatchFinishTemporaryDetach(paramView);
  }
  
  public static boolean dispatchNestedFling(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return Api21Impl.dispatchNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean dispatchNestedPreFling(@NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    return Api21Impl.dispatchNestedPreFling(paramView, paramFloat1, paramFloat2);
  }
  
  public static boolean dispatchNestedPreScroll(@NonNull View paramView, int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt1, @Nullable int[] paramArrayOfInt2)
  {
    return Api21Impl.dispatchNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static boolean dispatchNestedPreScroll(@NonNull View paramView, int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt1, @Nullable int[] paramArrayOfInt2, int paramInt3)
  {
    if ((paramView instanceof NestedScrollingChild2)) {
      return ((NestedScrollingChild2)paramView).dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
    }
    if (paramInt3 == 0) {
      return dispatchNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
    }
    return false;
  }
  
  public static void dispatchNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt1, int paramInt5, @NonNull int[] paramArrayOfInt2)
  {
    if ((paramView instanceof NestedScrollingChild3)) {
      ((NestedScrollingChild3)paramView).dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
    } else {
      dispatchNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5);
    }
  }
  
  public static boolean dispatchNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt)
  {
    return Api21Impl.dispatchNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public static boolean dispatchNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt, int paramInt5)
  {
    if ((paramView instanceof NestedScrollingChild2)) {
      return ((NestedScrollingChild2)paramView).dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
    }
    if (paramInt5 == 0) {
      return dispatchNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
    }
    return false;
  }
  
  public static void dispatchStartTemporaryDetach(@NonNull View paramView)
  {
    Api24Impl.dispatchStartTemporaryDetach(paramView);
  }
  
  @UiThread
  public static boolean dispatchUnhandledKeyEventBeforeCallback(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return UnhandledKeyEventManager.at(paramView).dispatch(paramView, paramKeyEvent);
  }
  
  @UiThread
  public static boolean dispatchUnhandledKeyEventBeforeHierarchy(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return UnhandledKeyEventManager.at(paramView).preDispatch(paramKeyEvent);
  }
  
  public static void enableAccessibleClickableSpanSupport(@NonNull View paramView)
  {
    ensureAccessibilityDelegateCompat(paramView);
  }
  
  public static void ensureAccessibilityDelegateCompat(@NonNull View paramView)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat1 = getAccessibilityDelegate(paramView);
    AccessibilityDelegateCompat localAccessibilityDelegateCompat2 = localAccessibilityDelegateCompat1;
    if (localAccessibilityDelegateCompat1 == null) {
      localAccessibilityDelegateCompat2 = new AccessibilityDelegateCompat();
    }
    setAccessibilityDelegate(paramView, localAccessibilityDelegateCompat2);
  }
  
  public static int generateViewId()
  {
    return Api17Impl.generateViewId();
  }
  
  @Nullable
  public static AccessibilityDelegateCompat getAccessibilityDelegate(@NonNull View paramView)
  {
    paramView = getAccessibilityDelegateInternal(paramView);
    if (paramView == null) {
      return null;
    }
    if ((paramView instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
      return mCompat;
    }
    return new AccessibilityDelegateCompat(paramView);
  }
  
  @Nullable
  private static View.AccessibilityDelegate getAccessibilityDelegateInternal(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.getAccessibilityDelegate(paramView);
    }
    return getAccessibilityDelegateThroughReflection(paramView);
  }
  
  /* Error */
  @Nullable
  private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@NonNull View paramView)
  {
    // Byte code:
    //   0: getstatic 184	androidx/core/view/ViewCompat:sAccessibilityDelegateCheckFailed	Z
    //   3: ifeq +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: getstatic 585	androidx/core/view/ViewCompat:sAccessibilityDelegateField	Ljava/lang/reflect/Field;
    //   11: ifnonnull +32 -> 43
    //   14: ldc_w 374
    //   17: ldc_w 587
    //   20: invokevirtual 591	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: astore_1
    //   24: aload_1
    //   25: putstatic 585	androidx/core/view/ViewCompat:sAccessibilityDelegateField	Ljava/lang/reflect/Field;
    //   28: aload_1
    //   29: iconst_1
    //   30: invokevirtual 597	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   33: goto +10 -> 43
    //   36: astore_0
    //   37: iconst_1
    //   38: putstatic 184	androidx/core/view/ViewCompat:sAccessibilityDelegateCheckFailed	Z
    //   41: aconst_null
    //   42: areturn
    //   43: getstatic 585	androidx/core/view/ViewCompat:sAccessibilityDelegateField	Ljava/lang/reflect/Field;
    //   46: aload_0
    //   47: invokevirtual 600	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   50: astore_0
    //   51: aload_0
    //   52: instanceof 602
    //   55: ifeq +10 -> 65
    //   58: aload_0
    //   59: checkcast 602	android/view/View$AccessibilityDelegate
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: aconst_null
    //   66: areturn
    //   67: astore_0
    //   68: iconst_1
    //   69: putstatic 184	androidx/core/view/ViewCompat:sAccessibilityDelegateCheckFailed	Z
    //   72: aconst_null
    //   73: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramView	View
    //   23	6	1	localField	Field
    // Exception table:
    //   from	to	target	type
    //   14	33	36	finally
    //   43	63	67	finally
  }
  
  public static int getAccessibilityLiveRegion(@NonNull View paramView)
  {
    return Api19Impl.getAccessibilityLiveRegion(paramView);
  }
  
  @Nullable
  public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View paramView)
  {
    paramView = Api16Impl.getAccessibilityNodeProvider(paramView);
    if (paramView != null) {
      return new AccessibilityNodeProviderCompat(paramView);
    }
    return null;
  }
  
  @Nullable
  @UiThread
  public static CharSequence getAccessibilityPaneTitle(@NonNull View paramView)
  {
    return (CharSequence)paneTitleProperty().get(paramView);
  }
  
  private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View paramView)
  {
    int i = R.id.tag_accessibility_actions;
    ArrayList localArrayList1 = (ArrayList)paramView.getTag(i);
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null)
    {
      localArrayList2 = new ArrayList();
      paramView.setTag(i, localArrayList2);
    }
    return localArrayList2;
  }
  
  @Deprecated
  public static float getAlpha(View paramView)
  {
    return paramView.getAlpha();
  }
  
  private static int getAvailableActionIdFromResources(View paramView, @NonNull CharSequence paramCharSequence)
  {
    paramView = getActionList(paramView);
    for (int i = 0; i < paramView.size(); i++) {
      if (TextUtils.equals(paramCharSequence, ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i)).getLabel())) {
        return ((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i)).getId();
      }
    }
    int j = -1;
    for (i = 0;; i++)
    {
      paramCharSequence = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
      if ((i >= paramCharSequence.length) || (j != -1)) {
        break;
      }
      int k = paramCharSequence[i];
      int m = 0;
      int n = 1;
      while (m < paramView.size())
      {
        int i1;
        if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(m)).getId() != k) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        n &= i1;
        m++;
      }
      if (n != 0) {
        j = k;
      }
    }
    return j;
  }
  
  @Nullable
  public static ColorStateList getBackgroundTintList(@NonNull View paramView)
  {
    return Api21Impl.getBackgroundTintList(paramView);
  }
  
  @Nullable
  public static PorterDuff.Mode getBackgroundTintMode(@NonNull View paramView)
  {
    return Api21Impl.getBackgroundTintMode(paramView);
  }
  
  @Nullable
  public static Rect getClipBounds(@NonNull View paramView)
  {
    return Api18Impl.getClipBounds(paramView);
  }
  
  @Nullable
  public static Display getDisplay(@NonNull View paramView)
  {
    return Api17Impl.getDisplay(paramView);
  }
  
  public static float getElevation(@NonNull View paramView)
  {
    return Api21Impl.getElevation(paramView);
  }
  
  private static Rect getEmptyTempRect()
  {
    if (sThreadLocalRect == null) {
      sThreadLocalRect = new ThreadLocal();
    }
    Rect localRect1 = (Rect)sThreadLocalRect.get();
    Rect localRect2 = localRect1;
    if (localRect1 == null)
    {
      localRect2 = new Rect();
      sThreadLocalRect.set(localRect2);
    }
    localRect2.setEmpty();
    return localRect2;
  }
  
  private static OnReceiveContentViewBehavior getFallback(@NonNull View paramView)
  {
    if ((paramView instanceof OnReceiveContentViewBehavior)) {
      return (OnReceiveContentViewBehavior)paramView;
    }
    return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
  }
  
  public static boolean getFitsSystemWindows(@NonNull View paramView)
  {
    return Api16Impl.getFitsSystemWindows(paramView);
  }
  
  public static int getImportantForAccessibility(@NonNull View paramView)
  {
    return Api16Impl.getImportantForAccessibility(paramView);
  }
  
  @SuppressLint({"InlinedApi"})
  public static int getImportantForAutofill(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getImportantForAutofill(paramView);
    }
    return 0;
  }
  
  public static int getLabelFor(@NonNull View paramView)
  {
    return Api17Impl.getLabelFor(paramView);
  }
  
  @Deprecated
  public static int getLayerType(View paramView)
  {
    return paramView.getLayerType();
  }
  
  public static int getLayoutDirection(@NonNull View paramView)
  {
    return Api17Impl.getLayoutDirection(paramView);
  }
  
  @Deprecated
  @Nullable
  public static Matrix getMatrix(View paramView)
  {
    return paramView.getMatrix();
  }
  
  @Deprecated
  public static int getMeasuredHeightAndState(View paramView)
  {
    return paramView.getMeasuredHeightAndState();
  }
  
  @Deprecated
  public static int getMeasuredState(View paramView)
  {
    return paramView.getMeasuredState();
  }
  
  @Deprecated
  public static int getMeasuredWidthAndState(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }
  
  public static int getMinimumHeight(@NonNull View paramView)
  {
    return Api16Impl.getMinimumHeight(paramView);
  }
  
  public static int getMinimumWidth(@NonNull View paramView)
  {
    return Api16Impl.getMinimumWidth(paramView);
  }
  
  public static int getNextClusterForwardId(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getNextClusterForwardId(paramView);
    }
    return -1;
  }
  
  @Nullable
  public static String[] getOnReceiveContentMimeTypes(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.getReceiveContentMimeTypes(paramView);
    }
    return (String[])paramView.getTag(R.id.tag_on_receive_content_mime_types);
  }
  
  @Deprecated
  public static int getOverScrollMode(View paramView)
  {
    return paramView.getOverScrollMode();
  }
  
  @Px
  public static int getPaddingEnd(@NonNull View paramView)
  {
    return Api17Impl.getPaddingEnd(paramView);
  }
  
  @Px
  public static int getPaddingStart(@NonNull View paramView)
  {
    return Api17Impl.getPaddingStart(paramView);
  }
  
  @Nullable
  public static ViewParent getParentForAccessibility(@NonNull View paramView)
  {
    return Api16Impl.getParentForAccessibility(paramView);
  }
  
  @Deprecated
  public static float getPivotX(View paramView)
  {
    return paramView.getPivotX();
  }
  
  @Deprecated
  public static float getPivotY(View paramView)
  {
    return paramView.getPivotY();
  }
  
  @Nullable
  public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
  {
    return Api23Impl.getRootWindowInsets(paramView);
  }
  
  @Deprecated
  public static float getRotation(View paramView)
  {
    return paramView.getRotation();
  }
  
  @Deprecated
  public static float getRotationX(View paramView)
  {
    return paramView.getRotationX();
  }
  
  @Deprecated
  public static float getRotationY(View paramView)
  {
    return paramView.getRotationY();
  }
  
  @Deprecated
  public static float getScaleX(View paramView)
  {
    return paramView.getScaleX();
  }
  
  @Deprecated
  public static float getScaleY(View paramView)
  {
    return paramView.getScaleY();
  }
  
  public static int getScrollIndicators(@NonNull View paramView)
  {
    return Api23Impl.getScrollIndicators(paramView);
  }
  
  @Nullable
  @UiThread
  public static CharSequence getStateDescription(@NonNull View paramView)
  {
    return (CharSequence)stateDescriptionProperty().get(paramView);
  }
  
  @NonNull
  public static List<Rect> getSystemGestureExclusionRects(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.getSystemGestureExclusionRects(paramView);
    }
    return Collections.emptyList();
  }
  
  @Nullable
  public static String getTransitionName(@NonNull View paramView)
  {
    return Api21Impl.getTransitionName(paramView);
  }
  
  @Deprecated
  public static float getTranslationX(View paramView)
  {
    return paramView.getTranslationX();
  }
  
  @Deprecated
  public static float getTranslationY(View paramView)
  {
    return paramView.getTranslationY();
  }
  
  public static float getTranslationZ(@NonNull View paramView)
  {
    return Api21Impl.getTranslationZ(paramView);
  }
  
  @Deprecated
  @Nullable
  public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getWindowInsetsController(paramView);
    }
    for (Object localObject1 = paramView.getContext();; localObject1 = ((ContextWrapper)localObject1).getBaseContext())
    {
      boolean bool = localObject1 instanceof ContextWrapper;
      Object localObject2 = null;
      if (!bool) {
        break;
      }
      if ((localObject1 instanceof Activity))
      {
        Window localWindow = ((Activity)localObject1).getWindow();
        localObject1 = localObject2;
        if (localWindow != null) {
          localObject1 = WindowCompat.getInsetsController(localWindow, paramView);
        }
        return (WindowInsetsControllerCompat)localObject1;
      }
    }
    return null;
  }
  
  @Deprecated
  public static int getWindowSystemUiVisibility(@NonNull View paramView)
  {
    return Api16Impl.getWindowSystemUiVisibility(paramView);
  }
  
  @Deprecated
  public static float getX(View paramView)
  {
    return paramView.getX();
  }
  
  @Deprecated
  public static float getY(View paramView)
  {
    return paramView.getY();
  }
  
  public static float getZ(@NonNull View paramView)
  {
    return Api21Impl.getZ(paramView);
  }
  
  public static boolean hasAccessibilityDelegate(@NonNull View paramView)
  {
    boolean bool;
    if (getAccessibilityDelegateInternal(paramView) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean hasExplicitFocusable(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.hasExplicitFocusable(paramView);
    }
    return paramView.hasFocusable();
  }
  
  public static boolean hasNestedScrollingParent(@NonNull View paramView)
  {
    return Api21Impl.hasNestedScrollingParent(paramView);
  }
  
  public static boolean hasNestedScrollingParent(@NonNull View paramView, int paramInt)
  {
    if ((paramView instanceof NestedScrollingChild2)) {
      ((NestedScrollingChild2)paramView).hasNestedScrollingParent(paramInt);
    } else if (paramInt == 0) {
      return hasNestedScrollingParent(paramView);
    }
    return false;
  }
  
  public static boolean hasOnClickListeners(@NonNull View paramView)
  {
    return Api15Impl.hasOnClickListeners(paramView);
  }
  
  public static boolean hasOverlappingRendering(@NonNull View paramView)
  {
    return Api16Impl.hasOverlappingRendering(paramView);
  }
  
  public static boolean hasTransientState(@NonNull View paramView)
  {
    return Api16Impl.hasTransientState(paramView);
  }
  
  @UiThread
  public static boolean isAccessibilityHeading(@NonNull View paramView)
  {
    paramView = (Boolean)accessibilityHeadingProperty().get(paramView);
    boolean bool;
    if ((paramView != null) && (paramView.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isAttachedToWindow(@NonNull View paramView)
  {
    return Api19Impl.isAttachedToWindow(paramView);
  }
  
  public static boolean isFocusedByDefault(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.isFocusedByDefault(paramView);
    }
    return false;
  }
  
  public static boolean isImportantForAccessibility(@NonNull View paramView)
  {
    return Api21Impl.isImportantForAccessibility(paramView);
  }
  
  public static boolean isImportantForAutofill(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.isImportantForAutofill(paramView);
    }
    return true;
  }
  
  public static boolean isInLayout(@NonNull View paramView)
  {
    return Api18Impl.isInLayout(paramView);
  }
  
  public static boolean isKeyboardNavigationCluster(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.isKeyboardNavigationCluster(paramView);
    }
    return false;
  }
  
  public static boolean isLaidOut(@NonNull View paramView)
  {
    return Api19Impl.isLaidOut(paramView);
  }
  
  public static boolean isLayoutDirectionResolved(@NonNull View paramView)
  {
    return Api19Impl.isLayoutDirectionResolved(paramView);
  }
  
  public static boolean isNestedScrollingEnabled(@NonNull View paramView)
  {
    return Api21Impl.isNestedScrollingEnabled(paramView);
  }
  
  @Deprecated
  public static boolean isOpaque(View paramView)
  {
    return paramView.isOpaque();
  }
  
  public static boolean isPaddingRelative(@NonNull View paramView)
  {
    return Api17Impl.isPaddingRelative(paramView);
  }
  
  @UiThread
  public static boolean isScreenReaderFocusable(@NonNull View paramView)
  {
    paramView = (Boolean)screenReaderFocusableProperty().get(paramView);
    boolean bool;
    if ((paramView != null) && (paramView.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public static void jumpDrawablesToCurrentState(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }
  
  @Nullable
  public static View keyboardNavigationClusterSearch(@NonNull View paramView1, @Nullable View paramView2, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.keyboardNavigationClusterSearch(paramView1, paramView2, paramInt);
    }
    return null;
  }
  
  @RequiresApi(19)
  public static void notifyViewAccessibilityStateChangedIfNeeded(View paramView, int paramInt)
  {
    Object localObject = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (!((AccessibilityManager)localObject).isEnabled()) {
      return;
    }
    int i;
    if ((getAccessibilityPaneTitle(paramView) != null) && (paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getAccessibilityLiveRegion(paramView);
    int k = 32;
    if ((j == 0) && (i == 0))
    {
      if (paramInt == 32)
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent(localAccessibilityEvent);
        localAccessibilityEvent.setEventType(32);
        Api19Impl.setContentChangeTypes(localAccessibilityEvent, paramInt);
        localAccessibilityEvent.setSource(paramView);
        paramView.onPopulateAccessibilityEvent(localAccessibilityEvent);
        localAccessibilityEvent.getText().add(getAccessibilityPaneTitle(paramView));
        ((AccessibilityManager)localObject).sendAccessibilityEvent(localAccessibilityEvent);
      }
      else if (paramView.getParent() != null)
      {
        localObject = paramView.getParent();
        try
        {
          Api19Impl.notifySubtreeAccessibilityStateChanged((ViewParent)localObject, paramView, paramView, paramInt);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(paramView.getParent().getClass().getSimpleName());
          ((StringBuilder)localObject).append(" does not fully implement ViewParent");
          Log.e("ViewCompat", ((StringBuilder)localObject).toString(), localAbstractMethodError);
        }
      }
    }
    else
    {
      localObject = AccessibilityEvent.obtain();
      if (i == 0) {
        k = 2048;
      }
      ((AccessibilityEvent)localObject).setEventType(k);
      Api19Impl.setContentChangeTypes((AccessibilityEvent)localObject, paramInt);
      if (i != 0)
      {
        ((AccessibilityRecord)localObject).getText().add(getAccessibilityPaneTitle(paramView));
        setViewImportanceForAccessibilityIfNeeded(paramView);
      }
      paramView.sendAccessibilityEventUnchecked((AccessibilityEvent)localObject);
    }
  }
  
  public static void offsetLeftAndRight(@NonNull View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
  }
  
  public static void offsetTopAndBottom(@NonNull View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
  }
  
  @NonNull
  public static WindowInsetsCompat onApplyWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat)
  {
    WindowInsets localWindowInsets1 = paramWindowInsetsCompat.toWindowInsets();
    if (localWindowInsets1 != null)
    {
      WindowInsets localWindowInsets2 = Api20Impl.onApplyWindowInsets(paramView, localWindowInsets1);
      if (!localWindowInsets2.equals(localWindowInsets1)) {
        return WindowInsetsCompat.toWindowInsetsCompat(localWindowInsets2, paramView);
      }
    }
    return paramWindowInsetsCompat;
  }
  
  @Deprecated
  public static void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    paramView.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public static void onInitializeAccessibilityNodeInfo(@NonNull View paramView, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    paramView.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfoCompat.unwrap());
  }
  
  @Deprecated
  public static void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    paramView.onPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  private static AccessibilityViewProperty<CharSequence> paneTitleProperty()
  {
    new AccessibilityViewProperty(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28)
    {
      @RequiresApi(28)
      public CharSequence frameworkGet(View paramAnonymousView)
      {
        return ViewCompat.Api28Impl.getAccessibilityPaneTitle(paramAnonymousView);
      }
      
      @RequiresApi(28)
      public void frameworkSet(View paramAnonymousView, CharSequence paramAnonymousCharSequence)
      {
        ViewCompat.Api28Impl.setAccessibilityPaneTitle(paramAnonymousView, paramAnonymousCharSequence);
      }
      
      public boolean shouldUpdate(CharSequence paramAnonymousCharSequence1, CharSequence paramAnonymousCharSequence2)
      {
        return TextUtils.equals(paramAnonymousCharSequence1, paramAnonymousCharSequence2) ^ true;
      }
    };
  }
  
  public static boolean performAccessibilityAction(@NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
  {
    return Api16Impl.performAccessibilityAction(paramView, paramInt, paramBundle);
  }
  
  @Nullable
  public static ContentInfoCompat performReceiveContent(@NonNull View paramView, @NonNull ContentInfoCompat paramContentInfoCompat)
  {
    if (Log.isLoggable("ViewCompat", 3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("performReceiveContent: ");
      ((StringBuilder)localObject).append(paramContentInfoCompat);
      ((StringBuilder)localObject).append(", view=");
      ((StringBuilder)localObject).append(paramView.getClass().getSimpleName());
      ((StringBuilder)localObject).append("[");
      ((StringBuilder)localObject).append(paramView.getId());
      ((StringBuilder)localObject).append("]");
      Log.d("ViewCompat", ((StringBuilder)localObject).toString());
    }
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.performReceiveContent(paramView, paramContentInfoCompat);
    }
    Object localObject = (OnReceiveContentListener)paramView.getTag(R.id.tag_on_receive_content_listener);
    if (localObject != null)
    {
      paramContentInfoCompat = ((OnReceiveContentListener)localObject).onReceiveContent(paramView, paramContentInfoCompat);
      if (paramContentInfoCompat == null) {
        paramView = null;
      } else {
        paramView = getFallback(paramView).onReceiveContent(paramContentInfoCompat);
      }
      return paramView;
    }
    return getFallback(paramView).onReceiveContent(paramContentInfoCompat);
  }
  
  public static void postInvalidateOnAnimation(@NonNull View paramView)
  {
    Api16Impl.postInvalidateOnAnimation(paramView);
  }
  
  public static void postInvalidateOnAnimation(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Api16Impl.postInvalidateOnAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void postOnAnimation(@NonNull View paramView, @NonNull Runnable paramRunnable)
  {
    Api16Impl.postOnAnimation(paramView, paramRunnable);
  }
  
  @SuppressLint({"LambdaLast"})
  public static void postOnAnimationDelayed(@NonNull View paramView, @NonNull Runnable paramRunnable, long paramLong)
  {
    Api16Impl.postOnAnimationDelayed(paramView, paramRunnable, paramLong);
  }
  
  public static void removeAccessibilityAction(@NonNull View paramView, int paramInt)
  {
    removeActionWithId(paramInt, paramView);
    notifyViewAccessibilityStateChangedIfNeeded(paramView, 0);
  }
  
  private static void removeActionWithId(int paramInt, View paramView)
  {
    paramView = getActionList(paramView);
    for (int i = 0; i < paramView.size(); i++) {
      if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i)).getId() == paramInt)
      {
        paramView.remove(i);
        break;
      }
    }
  }
  
  public static void removeOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      Api28Impl.removeOnUnhandledKeyEventListener(paramView, paramOnUnhandledKeyEventListenerCompat);
      return;
    }
    ArrayList localArrayList = (ArrayList)paramView.getTag(R.id.tag_unhandled_key_listeners);
    if (localArrayList != null)
    {
      localArrayList.remove(paramOnUnhandledKeyEventListenerCompat);
      if (localArrayList.size() == 0) {
        UnhandledKeyEventManager.unregisterListeningView(paramView);
      }
    }
  }
  
  public static void replaceAccessibilityAction(@NonNull View paramView, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat paramAccessibilityActionCompat, @Nullable CharSequence paramCharSequence, @Nullable AccessibilityViewCommand paramAccessibilityViewCommand)
  {
    if ((paramAccessibilityViewCommand == null) && (paramCharSequence == null)) {
      removeAccessibilityAction(paramView, paramAccessibilityActionCompat.getId());
    } else {
      addAccessibilityAction(paramView, paramAccessibilityActionCompat.createReplacementAction(paramCharSequence, paramAccessibilityViewCommand));
    }
  }
  
  public static void requestApplyInsets(@NonNull View paramView)
  {
    Api20Impl.requestApplyInsets(paramView);
  }
  
  @NonNull
  public static <T extends View> T requireViewById(@NonNull View paramView, @IdRes int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return (View)Api28Impl.requireViewById(paramView, paramInt);
    }
    paramView = paramView.findViewById(paramInt);
    if (paramView != null) {
      return paramView;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this View");
  }
  
  @Deprecated
  public static int resolveSizeAndState(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  public static boolean restoreDefaultFocus(@NonNull View paramView)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.restoreDefaultFocus(paramView);
    }
    return paramView.requestFocus();
  }
  
  public static void saveAttributeDataForStyleable(@NonNull View paramView, @SuppressLint({"ContextFirst"}) @NonNull Context paramContext, @NonNull int[] paramArrayOfInt, @Nullable AttributeSet paramAttributeSet, @NonNull TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.saveAttributeDataForStyleable(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
  }
  
  private static AccessibilityViewProperty<Boolean> screenReaderFocusableProperty()
  {
    new AccessibilityViewProperty(R.id.tag_screen_reader_focusable, Boolean.class, 28)
    {
      @RequiresApi(28)
      public Boolean frameworkGet(@NonNull View paramAnonymousView)
      {
        return Boolean.valueOf(ViewCompat.Api28Impl.isScreenReaderFocusable(paramAnonymousView));
      }
      
      @RequiresApi(28)
      public void frameworkSet(@NonNull View paramAnonymousView, Boolean paramAnonymousBoolean)
      {
        ViewCompat.Api28Impl.setScreenReaderFocusable(paramAnonymousView, paramAnonymousBoolean.booleanValue());
      }
      
      public boolean shouldUpdate(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
      {
        return booleanNullToFalseEquals(paramAnonymousBoolean1, paramAnonymousBoolean2) ^ true;
      }
    };
  }
  
  public static void setAccessibilityDelegate(@NonNull View paramView, @Nullable AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = paramAccessibilityDelegateCompat;
    if (paramAccessibilityDelegateCompat == null)
    {
      localAccessibilityDelegateCompat = paramAccessibilityDelegateCompat;
      if ((getAccessibilityDelegateInternal(paramView) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
        localAccessibilityDelegateCompat = new AccessibilityDelegateCompat();
      }
    }
    if (localAccessibilityDelegateCompat == null) {
      paramAccessibilityDelegateCompat = null;
    } else {
      paramAccessibilityDelegateCompat = localAccessibilityDelegateCompat.getBridge();
    }
    paramView.setAccessibilityDelegate(paramAccessibilityDelegateCompat);
  }
  
  @UiThread
  public static void setAccessibilityHeading(@NonNull View paramView, boolean paramBoolean)
  {
    accessibilityHeadingProperty().set(paramView, Boolean.valueOf(paramBoolean));
  }
  
  public static void setAccessibilityLiveRegion(@NonNull View paramView, int paramInt)
  {
    Api19Impl.setAccessibilityLiveRegion(paramView, paramInt);
  }
  
  @UiThread
  public static void setAccessibilityPaneTitle(@NonNull View paramView, @Nullable CharSequence paramCharSequence)
  {
    paneTitleProperty().set(paramView, paramCharSequence);
    if (paramCharSequence != null) {
      sAccessibilityPaneVisibilityManager.addAccessibilityPane(paramView);
    } else {
      sAccessibilityPaneVisibilityManager.removeAccessibilityPane(paramView);
    }
  }
  
  @Deprecated
  public static void setActivated(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }
  
  @Deprecated
  public static void setAlpha(View paramView, @FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }
  
  public static void setAutofillHints(@NonNull View paramView, @Nullable String... paramVarArgs)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setAutofillHints(paramView, paramVarArgs);
    }
  }
  
  public static void setBackground(@NonNull View paramView, @Nullable Drawable paramDrawable)
  {
    Api16Impl.setBackground(paramView, paramDrawable);
  }
  
  public static void setBackgroundTintList(@NonNull View paramView, @Nullable ColorStateList paramColorStateList)
  {
    Api21Impl.setBackgroundTintList(paramView, paramColorStateList);
  }
  
  public static void setBackgroundTintMode(@NonNull View paramView, @Nullable PorterDuff.Mode paramMode)
  {
    Api21Impl.setBackgroundTintMode(paramView, paramMode);
  }
  
  @Deprecated
  @SuppressLint({"BanUncheckedReflection"})
  public static void setChildrenDrawingOrderEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (sChildrenDrawingOrderMethod == null)
    {
      try
      {
        sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", localNoSuchMethodException);
      }
      sChildrenDrawingOrderMethod.setAccessible(true);
    }
    try
    {
      sChildrenDrawingOrderMethod.invoke(paramViewGroup, new Object[] { Boolean.valueOf(paramBoolean) });
    }
    catch (InvocationTargetException paramViewGroup)
    {
      Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
    }
    catch (IllegalArgumentException paramViewGroup)
    {
      Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
    }
    catch (IllegalAccessException paramViewGroup)
    {
      Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
    }
  }
  
  public static void setClipBounds(@NonNull View paramView, @Nullable Rect paramRect)
  {
    Api18Impl.setClipBounds(paramView, paramRect);
  }
  
  public static void setElevation(@NonNull View paramView, float paramFloat)
  {
    Api21Impl.setElevation(paramView, paramFloat);
  }
  
  @Deprecated
  public static void setFitsSystemWindows(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  public static void setFocusedByDefault(@NonNull View paramView, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setFocusedByDefault(paramView, paramBoolean);
    }
  }
  
  public static void setHasTransientState(@NonNull View paramView, boolean paramBoolean)
  {
    Api16Impl.setHasTransientState(paramView, paramBoolean);
  }
  
  @UiThread
  public static void setImportantForAccessibility(@NonNull View paramView, int paramInt)
  {
    Api16Impl.setImportantForAccessibility(paramView, paramInt);
  }
  
  public static void setImportantForAutofill(@NonNull View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setImportantForAutofill(paramView, paramInt);
    }
  }
  
  public static void setKeyboardNavigationCluster(@NonNull View paramView, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setKeyboardNavigationCluster(paramView, paramBoolean);
    }
  }
  
  public static void setLabelFor(@NonNull View paramView, @IdRes int paramInt)
  {
    Api17Impl.setLabelFor(paramView, paramInt);
  }
  
  public static void setLayerPaint(@NonNull View paramView, @Nullable Paint paramPaint)
  {
    Api17Impl.setLayerPaint(paramView, paramPaint);
  }
  
  @Deprecated
  public static void setLayerType(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }
  
  public static void setLayoutDirection(@NonNull View paramView, int paramInt)
  {
    Api17Impl.setLayoutDirection(paramView, paramInt);
  }
  
  public static void setNestedScrollingEnabled(@NonNull View paramView, boolean paramBoolean)
  {
    Api21Impl.setNestedScrollingEnabled(paramView, paramBoolean);
  }
  
  public static void setNextClusterForwardId(@NonNull View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setNextClusterForwardId(paramView, paramInt);
    }
  }
  
  public static void setOnApplyWindowInsetsListener(@NonNull View paramView, @Nullable OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    Api21Impl.setOnApplyWindowInsetsListener(paramView, paramOnApplyWindowInsetsListener);
  }
  
  public static void setOnReceiveContentListener(@NonNull View paramView, @Nullable String[] paramArrayOfString, @Nullable OnReceiveContentListener paramOnReceiveContentListener)
  {
    if (Build.VERSION.SDK_INT >= 31)
    {
      Api31Impl.setOnReceiveContentListener(paramView, paramArrayOfString, paramOnReceiveContentListener);
      return;
    }
    String[] arrayOfString;
    if (paramArrayOfString != null)
    {
      arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length != 0) {}
    }
    else
    {
      arrayOfString = null;
    }
    int i = 0;
    if (paramOnReceiveContentListener != null)
    {
      boolean bool;
      if (arrayOfString != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "When the listener is set, MIME types must also be set");
    }
    if (arrayOfString != null)
    {
      int j = arrayOfString.length;
      int m;
      for (int k = 0;; k++)
      {
        m = i;
        if (k >= j) {
          break;
        }
        if (arrayOfString[k].startsWith("*"))
        {
          m = 1;
          break;
        }
      }
      paramArrayOfString = z2.t("A MIME type set here must not start with *: ");
      paramArrayOfString.append(Arrays.toString(arrayOfString));
      Preconditions.checkArgument(m ^ 0x1, paramArrayOfString.toString());
    }
    paramView.setTag(R.id.tag_on_receive_content_mime_types, arrayOfString);
    paramView.setTag(R.id.tag_on_receive_content_listener, paramOnReceiveContentListener);
  }
  
  @Deprecated
  public static void setOverScrollMode(View paramView, int paramInt)
  {
    paramView.setOverScrollMode(paramInt);
  }
  
  public static void setPaddingRelative(@NonNull View paramView, @Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    Api17Impl.setPaddingRelative(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public static void setPivotX(View paramView, float paramFloat)
  {
    paramView.setPivotX(paramFloat);
  }
  
  @Deprecated
  public static void setPivotY(View paramView, float paramFloat)
  {
    paramView.setPivotY(paramFloat);
  }
  
  public static void setPointerIcon(@NonNull View paramView, @Nullable PointerIconCompat paramPointerIconCompat)
  {
    if (paramPointerIconCompat != null) {
      paramPointerIconCompat = paramPointerIconCompat.getPointerIcon();
    } else {
      paramPointerIconCompat = null;
    }
    Api24Impl.setPointerIcon(paramView, (PointerIcon)paramPointerIconCompat);
  }
  
  @Deprecated
  public static void setRotation(View paramView, float paramFloat)
  {
    paramView.setRotation(paramFloat);
  }
  
  @Deprecated
  public static void setRotationX(View paramView, float paramFloat)
  {
    paramView.setRotationX(paramFloat);
  }
  
  @Deprecated
  public static void setRotationY(View paramView, float paramFloat)
  {
    paramView.setRotationY(paramFloat);
  }
  
  @Deprecated
  public static void setSaveFromParentEnabled(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
  
  @Deprecated
  public static void setScaleX(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }
  
  @Deprecated
  public static void setScaleY(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }
  
  @UiThread
  public static void setScreenReaderFocusable(@NonNull View paramView, boolean paramBoolean)
  {
    screenReaderFocusableProperty().set(paramView, Boolean.valueOf(paramBoolean));
  }
  
  public static void setScrollIndicators(@NonNull View paramView, int paramInt)
  {
    Api23Impl.setScrollIndicators(paramView, paramInt);
  }
  
  public static void setScrollIndicators(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    Api23Impl.setScrollIndicators(paramView, paramInt1, paramInt2);
  }
  
  @UiThread
  public static void setStateDescription(@NonNull View paramView, @Nullable CharSequence paramCharSequence)
  {
    stateDescriptionProperty().set(paramView, paramCharSequence);
  }
  
  public static void setSystemGestureExclusionRects(@NonNull View paramView, @NonNull List<Rect> paramList)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.setSystemGestureExclusionRects(paramView, paramList);
    }
  }
  
  public static void setTooltipText(@NonNull View paramView, @Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setTooltipText(paramView, paramCharSequence);
    }
  }
  
  public static void setTransitionName(@NonNull View paramView, @Nullable String paramString)
  {
    Api21Impl.setTransitionName(paramView, paramString);
  }
  
  @Deprecated
  public static void setTranslationX(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }
  
  @Deprecated
  public static void setTranslationY(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }
  
  public static void setTranslationZ(@NonNull View paramView, float paramFloat)
  {
    Api21Impl.setTranslationZ(paramView, paramFloat);
  }
  
  private static void setViewImportanceForAccessibilityIfNeeded(View paramView)
  {
    if (getImportantForAccessibility(paramView) == 0) {
      setImportantForAccessibility(paramView, 1);
    }
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent instanceof View); localViewParent = localViewParent.getParent()) {
      if (getImportantForAccessibility((View)localViewParent) == 4)
      {
        setImportantForAccessibility(paramView, 2);
        break;
      }
    }
  }
  
  public static void setWindowInsetsAnimationCallback(@NonNull View paramView, @Nullable WindowInsetsAnimationCompat.Callback paramCallback)
  {
    WindowInsetsAnimationCompat.setCallback(paramView, paramCallback);
  }
  
  @Deprecated
  public static void setX(View paramView, float paramFloat)
  {
    paramView.setX(paramFloat);
  }
  
  @Deprecated
  public static void setY(View paramView, float paramFloat)
  {
    paramView.setY(paramFloat);
  }
  
  public static void setZ(@NonNull View paramView, float paramFloat)
  {
    Api21Impl.setZ(paramView, paramFloat);
  }
  
  public static boolean startDragAndDrop(@NonNull View paramView, @Nullable ClipData paramClipData, @NonNull View.DragShadowBuilder paramDragShadowBuilder, @Nullable Object paramObject, int paramInt)
  {
    return Api24Impl.startDragAndDrop(paramView, paramClipData, paramDragShadowBuilder, paramObject, paramInt);
  }
  
  public static boolean startNestedScroll(@NonNull View paramView, int paramInt)
  {
    return Api21Impl.startNestedScroll(paramView, paramInt);
  }
  
  public static boolean startNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    if ((paramView instanceof NestedScrollingChild2)) {
      return ((NestedScrollingChild2)paramView).startNestedScroll(paramInt1, paramInt2);
    }
    if (paramInt2 == 0) {
      return startNestedScroll(paramView, paramInt1);
    }
    return false;
  }
  
  private static AccessibilityViewProperty<CharSequence> stateDescriptionProperty()
  {
    new AccessibilityViewProperty(R.id.tag_state_description, CharSequence.class, 64, 30)
    {
      @RequiresApi(30)
      public CharSequence frameworkGet(View paramAnonymousView)
      {
        return ViewCompat.Api30Impl.getStateDescription(paramAnonymousView);
      }
      
      @RequiresApi(30)
      public void frameworkSet(View paramAnonymousView, CharSequence paramAnonymousCharSequence)
      {
        ViewCompat.Api30Impl.setStateDescription(paramAnonymousView, paramAnonymousCharSequence);
      }
      
      public boolean shouldUpdate(CharSequence paramAnonymousCharSequence1, CharSequence paramAnonymousCharSequence2)
      {
        return TextUtils.equals(paramAnonymousCharSequence1, paramAnonymousCharSequence2) ^ true;
      }
    };
  }
  
  public static void stopNestedScroll(@NonNull View paramView)
  {
    Api21Impl.stopNestedScroll(paramView);
  }
  
  public static void stopNestedScroll(@NonNull View paramView, int paramInt)
  {
    if ((paramView instanceof NestedScrollingChild2)) {
      ((NestedScrollingChild2)paramView).stopNestedScroll(paramInt);
    } else if (paramInt == 0) {
      stopNestedScroll(paramView);
    }
  }
  
  private static void tickleInvalidationFlag(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  public static void updateDragShadow(@NonNull View paramView, @NonNull View.DragShadowBuilder paramDragShadowBuilder)
  {
    Api24Impl.updateDragShadow(paramView, paramDragShadowBuilder);
  }
  
  public static class AccessibilityPaneVisibilityManager
    implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
  {
    private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap();
    
    @RequiresApi(19)
    private void checkPaneVisibility(View paramView, boolean paramBoolean)
    {
      boolean bool;
      if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      if (paramBoolean != bool)
      {
        int i;
        if (bool) {
          i = 16;
        } else {
          i = 32;
        }
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(paramView, i);
        mPanesToVisible.put(paramView, Boolean.valueOf(bool));
      }
    }
    
    @RequiresApi(19)
    private void registerForLayoutCallback(View paramView)
    {
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    
    @RequiresApi(19)
    private void unregisterForLayoutCallback(View paramView)
    {
      ViewCompat.Api16Impl.removeOnGlobalLayoutListener(paramView.getViewTreeObserver(), this);
    }
    
    @RequiresApi(19)
    public void addAccessibilityPane(View paramView)
    {
      WeakHashMap localWeakHashMap = mPanesToVisible;
      boolean bool;
      if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      localWeakHashMap.put(paramView, Boolean.valueOf(bool));
      paramView.addOnAttachStateChangeListener(this);
      if (ViewCompat.Api19Impl.isAttachedToWindow(paramView)) {
        registerForLayoutCallback(paramView);
      }
    }
    
    @RequiresApi(19)
    public void onGlobalLayout()
    {
      if (Build.VERSION.SDK_INT < 28)
      {
        Iterator localIterator = mPanesToVisible.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          checkPaneVisibility((View)localEntry.getKey(), ((Boolean)localEntry.getValue()).booleanValue());
        }
      }
    }
    
    @RequiresApi(19)
    public void onViewAttachedToWindow(View paramView)
    {
      registerForLayoutCallback(paramView);
    }
    
    public void onViewDetachedFromWindow(View paramView) {}
    
    @RequiresApi(19)
    public void removeAccessibilityPane(View paramView)
    {
      mPanesToVisible.remove(paramView);
      paramView.removeOnAttachStateChangeListener(this);
      unregisterForLayoutCallback(paramView);
    }
  }
  
  public static abstract class AccessibilityViewProperty<T>
  {
    private final int mContentChangeType;
    private final int mFrameworkMinimumSdk;
    private final int mTagKey;
    private final Class<T> mType;
    
    public AccessibilityViewProperty(int paramInt1, Class<T> paramClass, int paramInt2)
    {
      this(paramInt1, paramClass, 0, paramInt2);
    }
    
    public AccessibilityViewProperty(int paramInt1, Class<T> paramClass, int paramInt2, int paramInt3)
    {
      mTagKey = paramInt1;
      mType = paramClass;
      mContentChangeType = paramInt2;
      mFrameworkMinimumSdk = paramInt3;
    }
    
    private boolean extrasAvailable()
    {
      return true;
    }
    
    private boolean frameworkAvailable()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= mFrameworkMinimumSdk) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean booleanNullToFalseEquals(Boolean paramBoolean1, Boolean paramBoolean2)
    {
      boolean bool = true;
      int i;
      if ((paramBoolean1 != null) && (paramBoolean1.booleanValue())) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if ((paramBoolean2 != null) && (paramBoolean2.booleanValue())) {
        j = 1;
      } else {
        j = 0;
      }
      if (i != j) {
        bool = false;
      }
      return bool;
    }
    
    public abstract T frameworkGet(View paramView);
    
    public abstract void frameworkSet(View paramView, T paramT);
    
    public T get(View paramView)
    {
      if (frameworkAvailable()) {
        return (T)frameworkGet(paramView);
      }
      if (extrasAvailable())
      {
        paramView = paramView.getTag(mTagKey);
        if (mType.isInstance(paramView)) {
          return paramView;
        }
      }
      return null;
    }
    
    public void set(View paramView, T paramT)
    {
      if (frameworkAvailable())
      {
        frameworkSet(paramView, paramT);
      }
      else if ((extrasAvailable()) && (shouldUpdate(get(paramView), paramT)))
      {
        ViewCompat.ensureAccessibilityDelegateCompat(paramView);
        paramView.setTag(mTagKey, paramT);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(paramView, mContentChangeType);
      }
    }
    
    public boolean shouldUpdate(T paramT1, T paramT2)
    {
      return paramT2.equals(paramT1) ^ true;
    }
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static boolean hasOnClickListeners(@NonNull View paramView)
    {
      return paramView.hasOnClickListeners();
    }
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
    {
      return paramView.getAccessibilityNodeProvider();
    }
    
    @DoNotInline
    public static boolean getFitsSystemWindows(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }
    
    @DoNotInline
    public static int getImportantForAccessibility(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }
    
    @DoNotInline
    public static int getMinimumHeight(View paramView)
    {
      return paramView.getMinimumHeight();
    }
    
    @DoNotInline
    public static int getMinimumWidth(View paramView)
    {
      return paramView.getMinimumWidth();
    }
    
    @DoNotInline
    public static ViewParent getParentForAccessibility(View paramView)
    {
      return paramView.getParentForAccessibility();
    }
    
    @DoNotInline
    public static int getWindowSystemUiVisibility(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }
    
    @DoNotInline
    public static boolean hasOverlappingRendering(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }
    
    @DoNotInline
    public static boolean hasTransientState(View paramView)
    {
      return paramView.hasTransientState();
    }
    
    @DoNotInline
    public static boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return paramView.performAccessibilityAction(paramInt, paramBundle);
    }
    
    @DoNotInline
    public static void postInvalidateOnAnimation(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }
    
    @DoNotInline
    public static void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static void postOnAnimation(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }
    
    @DoNotInline
    public static void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }
    
    @DoNotInline
    public static void removeOnGlobalLayoutListener(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
    
    @DoNotInline
    public static void requestFitSystemWindows(View paramView)
    {
      paramView.requestFitSystemWindows();
    }
    
    @DoNotInline
    public static void setBackground(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }
    
    @DoNotInline
    public static void setHasTransientState(View paramView, boolean paramBoolean)
    {
      paramView.setHasTransientState(paramBoolean);
    }
    
    @DoNotInline
    public static void setImportantForAccessibility(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static int generateViewId()
    {
      return View.generateViewId();
    }
    
    @DoNotInline
    public static Display getDisplay(@NonNull View paramView)
    {
      return paramView.getDisplay();
    }
    
    @DoNotInline
    public static int getLabelFor(View paramView)
    {
      return paramView.getLabelFor();
    }
    
    @DoNotInline
    public static int getLayoutDirection(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    @DoNotInline
    public static int getPaddingEnd(View paramView)
    {
      return paramView.getPaddingEnd();
    }
    
    @DoNotInline
    public static int getPaddingStart(View paramView)
    {
      return paramView.getPaddingStart();
    }
    
    @DoNotInline
    public static boolean isPaddingRelative(View paramView)
    {
      return paramView.isPaddingRelative();
    }
    
    @DoNotInline
    public static void setLabelFor(View paramView, int paramInt)
    {
      paramView.setLabelFor(paramInt);
    }
    
    @DoNotInline
    public static void setLayerPaint(View paramView, Paint paramPaint)
    {
      paramView.setLayerPaint(paramPaint);
    }
    
    @DoNotInline
    public static void setLayoutDirection(View paramView, int paramInt)
    {
      paramView.setLayoutDirection(paramInt);
    }
    
    @DoNotInline
    public static void setPaddingRelative(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static Rect getClipBounds(@NonNull View paramView)
    {
      return paramView.getClipBounds();
    }
    
    @DoNotInline
    public static boolean isInLayout(@NonNull View paramView)
    {
      return paramView.isInLayout();
    }
    
    @DoNotInline
    public static void setClipBounds(@NonNull View paramView, Rect paramRect)
    {
      paramView.setClipBounds(paramRect);
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static int getAccessibilityLiveRegion(View paramView)
    {
      return paramView.getAccessibilityLiveRegion();
    }
    
    @DoNotInline
    public static boolean isAttachedToWindow(@NonNull View paramView)
    {
      return paramView.isAttachedToWindow();
    }
    
    @DoNotInline
    public static boolean isLaidOut(@NonNull View paramView)
    {
      return paramView.isLaidOut();
    }
    
    @DoNotInline
    public static boolean isLayoutDirectionResolved(@NonNull View paramView)
    {
      return paramView.isLayoutDirectionResolved();
    }
    
    @DoNotInline
    public static void notifySubtreeAccessibilityStateChanged(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
    }
    
    @DoNotInline
    public static void setAccessibilityLiveRegion(View paramView, int paramInt)
    {
      paramView.setAccessibilityLiveRegion(paramInt);
    }
    
    @DoNotInline
    public static void setContentChangeTypes(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
  
  @RequiresApi(20)
  public static class Api20Impl
  {
    @DoNotInline
    public static WindowInsets dispatchApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      return paramView.dispatchApplyWindowInsets(paramWindowInsets);
    }
    
    @DoNotInline
    public static WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      return paramView.onApplyWindowInsets(paramWindowInsets);
    }
    
    @DoNotInline
    public static void requestApplyInsets(View paramView)
    {
      paramView.requestApplyInsets();
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void callCompatInsetAnimationCallback(@NonNull WindowInsets paramWindowInsets, @NonNull View paramView)
    {
      View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(R.id.tag_window_insets_animation_callback);
      if (localOnApplyWindowInsetsListener != null) {
        localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
      }
    }
    
    @DoNotInline
    public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Rect paramRect)
    {
      WindowInsets localWindowInsets = paramWindowInsetsCompat.toWindowInsets();
      if (localWindowInsets != null) {
        return WindowInsetsCompat.toWindowInsetsCompat(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
      }
      paramRect.setEmpty();
      return paramWindowInsetsCompat;
    }
    
    @DoNotInline
    public static boolean dispatchNestedFling(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
    }
    
    @DoNotInline
    public static boolean dispatchNestedPreFling(@NonNull View paramView, float paramFloat1, float paramFloat2)
    {
      return paramView.dispatchNestedPreFling(paramFloat1, paramFloat2);
    }
    
    @DoNotInline
    public static boolean dispatchNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    {
      return paramView.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
    }
    
    @DoNotInline
    public static boolean dispatchNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
    {
      return paramView.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
    }
    
    @DoNotInline
    public static ColorStateList getBackgroundTintList(View paramView)
    {
      return paramView.getBackgroundTintList();
    }
    
    @DoNotInline
    public static PorterDuff.Mode getBackgroundTintMode(View paramView)
    {
      return paramView.getBackgroundTintMode();
    }
    
    @DoNotInline
    public static float getElevation(View paramView)
    {
      return paramView.getElevation();
    }
    
    @DoNotInline
    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
    {
      return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(paramView);
    }
    
    @DoNotInline
    public static String getTransitionName(View paramView)
    {
      return paramView.getTransitionName();
    }
    
    @DoNotInline
    public static float getTranslationZ(View paramView)
    {
      return paramView.getTranslationZ();
    }
    
    @DoNotInline
    public static float getZ(@NonNull View paramView)
    {
      return paramView.getZ();
    }
    
    @DoNotInline
    public static boolean hasNestedScrollingParent(View paramView)
    {
      return paramView.hasNestedScrollingParent();
    }
    
    @DoNotInline
    public static boolean isImportantForAccessibility(View paramView)
    {
      return paramView.isImportantForAccessibility();
    }
    
    @DoNotInline
    public static boolean isNestedScrollingEnabled(View paramView)
    {
      return paramView.isNestedScrollingEnabled();
    }
    
    @DoNotInline
    public static void setBackgroundTintList(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
    }
    
    @DoNotInline
    public static void setBackgroundTintMode(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
    }
    
    @DoNotInline
    public static void setElevation(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }
    
    @DoNotInline
    public static void setNestedScrollingEnabled(View paramView, boolean paramBoolean)
    {
      paramView.setNestedScrollingEnabled(paramBoolean);
    }
    
    @DoNotInline
    public static void setOnApplyWindowInsetsListener(@NonNull View paramView, @Nullable final OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
    {
      if (Build.VERSION.SDK_INT < 30) {
        paramView.setTag(R.id.tag_on_apply_window_listener, paramOnApplyWindowInsetsListener);
      }
      if (paramOnApplyWindowInsetsListener == null)
      {
        paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(R.id.tag_window_insets_animation_callback));
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener()
      {
        public WindowInsetsCompat mLastInsets = null;
        
        public WindowInsets onApplyWindowInsets(View paramAnonymousView, WindowInsets paramAnonymousWindowInsets)
        {
          WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(paramAnonymousWindowInsets, paramAnonymousView);
          int i = Build.VERSION.SDK_INT;
          if (i < 30)
          {
            ViewCompat.Api21Impl.callCompatInsetAnimationCallback(paramAnonymousWindowInsets, ViewCompat.Api21Impl.this);
            if (localWindowInsetsCompat.equals(mLastInsets)) {
              return paramOnApplyWindowInsetsListener.onApplyWindowInsets(paramAnonymousView, localWindowInsetsCompat).toWindowInsets();
            }
          }
          mLastInsets = localWindowInsetsCompat;
          paramAnonymousWindowInsets = paramOnApplyWindowInsetsListener.onApplyWindowInsets(paramAnonymousView, localWindowInsetsCompat);
          if (i >= 30) {
            return paramAnonymousWindowInsets.toWindowInsets();
          }
          ViewCompat.requestApplyInsets(paramAnonymousView);
          return paramAnonymousWindowInsets.toWindowInsets();
        }
      });
    }
    
    @DoNotInline
    public static void setTransitionName(View paramView, String paramString)
    {
      paramView.setTransitionName(paramString);
    }
    
    @DoNotInline
    public static void setTranslationZ(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(paramFloat);
    }
    
    @DoNotInline
    public static void setZ(@NonNull View paramView, float paramFloat)
    {
      paramView.setZ(paramFloat);
    }
    
    @DoNotInline
    public static boolean startNestedScroll(View paramView, int paramInt)
    {
      return paramView.startNestedScroll(paramInt);
    }
    
    @DoNotInline
    public static void stopNestedScroll(View paramView)
    {
      paramView.stopNestedScroll();
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
    {
      Object localObject = paramView.getRootWindowInsets();
      if (localObject == null) {
        return null;
      }
      localObject = WindowInsetsCompat.toWindowInsetsCompat((WindowInsets)localObject);
      ((WindowInsetsCompat)localObject).setRootWindowInsets((WindowInsetsCompat)localObject);
      ((WindowInsetsCompat)localObject).copyRootViewBounds(paramView.getRootView());
      return (WindowInsetsCompat)localObject;
    }
    
    @DoNotInline
    public static int getScrollIndicators(@NonNull View paramView)
    {
      return paramView.getScrollIndicators();
    }
    
    @DoNotInline
    public static void setScrollIndicators(@NonNull View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt);
    }
    
    @DoNotInline
    public static void setScrollIndicators(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      paramView.setScrollIndicators(paramInt1, paramInt2);
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static void cancelDragAndDrop(@NonNull View paramView)
    {
      paramView.cancelDragAndDrop();
    }
    
    @DoNotInline
    public static void dispatchFinishTemporaryDetach(View paramView)
    {
      paramView.dispatchFinishTemporaryDetach();
    }
    
    @DoNotInline
    public static void dispatchStartTemporaryDetach(View paramView)
    {
      paramView.dispatchStartTemporaryDetach();
    }
    
    @DoNotInline
    public static void setPointerIcon(@NonNull View paramView, PointerIcon paramPointerIcon)
    {
      paramView.setPointerIcon(paramPointerIcon);
    }
    
    @DoNotInline
    public static boolean startDragAndDrop(@NonNull View paramView, @Nullable ClipData paramClipData, @NonNull View.DragShadowBuilder paramDragShadowBuilder, @Nullable Object paramObject, int paramInt)
    {
      return paramView.startDragAndDrop(paramClipData, paramDragShadowBuilder, paramObject, paramInt);
    }
    
    @DoNotInline
    public static void updateDragShadow(@NonNull View paramView, @NonNull View.DragShadowBuilder paramDragShadowBuilder)
    {
      paramView.updateDragShadow(paramDragShadowBuilder);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static void addKeyboardNavigationClusters(@NonNull View paramView, Collection<View> paramCollection, int paramInt)
    {
      l5.f(paramView, paramCollection, paramInt);
    }
    
    @DoNotInline
    public static int getImportantForAutofill(View paramView)
    {
      return p3.a(paramView);
    }
    
    @DoNotInline
    public static int getNextClusterForwardId(@NonNull View paramView)
    {
      return p3.y(paramView);
    }
    
    @DoNotInline
    public static boolean hasExplicitFocusable(@NonNull View paramView)
    {
      return l5.m(paramView);
    }
    
    @DoNotInline
    public static boolean isFocusedByDefault(@NonNull View paramView)
    {
      return l5.i(paramView);
    }
    
    @DoNotInline
    public static boolean isImportantForAutofill(View paramView)
    {
      return p3.C(paramView);
    }
    
    @DoNotInline
    public static boolean isKeyboardNavigationCluster(@NonNull View paramView)
    {
      return l5.o(paramView);
    }
    
    @DoNotInline
    public static View keyboardNavigationClusterSearch(@NonNull View paramView1, View paramView2, int paramInt)
    {
      return p3.f(paramView1, paramView2, paramInt);
    }
    
    @DoNotInline
    public static boolean restoreDefaultFocus(@NonNull View paramView)
    {
      return p3.v(paramView);
    }
    
    @DoNotInline
    public static void setAutofillHints(@NonNull View paramView, String... paramVarArgs)
    {
      l5.g(paramView, paramVarArgs);
    }
    
    @DoNotInline
    public static void setFocusedByDefault(@NonNull View paramView, boolean paramBoolean)
    {
      p3.B(paramView, paramBoolean);
    }
    
    @DoNotInline
    public static void setImportantForAutofill(View paramView, int paramInt)
    {
      l5.l(paramInt, paramView);
    }
    
    @DoNotInline
    public static void setKeyboardNavigationCluster(@NonNull View paramView, boolean paramBoolean)
    {
      p3.q(paramView, paramBoolean);
    }
    
    @DoNotInline
    public static void setNextClusterForwardId(View paramView, int paramInt)
    {
      l5.d(paramInt, paramView);
    }
    
    @DoNotInline
    public static void setTooltipText(@NonNull View paramView, CharSequence paramCharSequence)
    {
      p3.p(paramView, paramCharSequence);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static void addOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
    {
      int i = R.id.tag_unhandled_key_listeners;
      Object localObject1 = (SimpleArrayMap)paramView.getTag(i);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new SimpleArrayMap();
        paramView.setTag(i, localObject2);
      }
      Objects.requireNonNull(paramOnUnhandledKeyEventListenerCompat);
      localObject1 = new n5(paramOnUnhandledKeyEventListenerCompat);
      ((SimpleArrayMap)localObject2).put(paramOnUnhandledKeyEventListenerCompat, localObject1);
      a3.v(paramView, (n5)localObject1);
    }
    
    @DoNotInline
    public static CharSequence getAccessibilityPaneTitle(View paramView)
    {
      return m5.h(paramView);
    }
    
    @DoNotInline
    public static boolean isAccessibilityHeading(View paramView)
    {
      return m5.m(paramView);
    }
    
    @DoNotInline
    public static boolean isScreenReaderFocusable(View paramView)
    {
      return a3.B(paramView);
    }
    
    @DoNotInline
    public static void removeOnUnhandledKeyEventListener(@NonNull View paramView, @NonNull ViewCompat.OnUnhandledKeyEventListenerCompat paramOnUnhandledKeyEventListenerCompat)
    {
      SimpleArrayMap localSimpleArrayMap = (SimpleArrayMap)paramView.getTag(R.id.tag_unhandled_key_listeners);
      if (localSimpleArrayMap == null) {
        return;
      }
      paramOnUnhandledKeyEventListenerCompat = (View.OnUnhandledKeyEventListener)localSimpleArrayMap.get(paramOnUnhandledKeyEventListenerCompat);
      if (paramOnUnhandledKeyEventListenerCompat != null) {
        m5.i(paramView, paramOnUnhandledKeyEventListenerCompat);
      }
    }
    
    @DoNotInline
    public static <T> T requireViewById(View paramView, int paramInt)
    {
      return m5.e(paramInt, paramView);
    }
    
    @DoNotInline
    public static void setAccessibilityHeading(View paramView, boolean paramBoolean)
    {
      m5.k(paramView, paramBoolean);
    }
    
    @DoNotInline
    public static void setAccessibilityPaneTitle(View paramView, CharSequence paramCharSequence)
    {
      m5.j(paramView, paramCharSequence);
    }
    
    @DoNotInline
    public static void setScreenReaderFocusable(View paramView, boolean paramBoolean)
    {
      a3.w(paramView, paramBoolean);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static View.AccessibilityDelegate getAccessibilityDelegate(View paramView)
    {
      return o3.h(paramView);
    }
    
    @DoNotInline
    public static List<Rect> getSystemGestureExclusionRects(View paramView)
    {
      return o3.k(paramView);
    }
    
    @DoNotInline
    public static void saveAttributeDataForStyleable(@NonNull View paramView, @NonNull Context paramContext, @NonNull int[] paramArrayOfInt, @Nullable AttributeSet paramAttributeSet, @NonNull TypedArray paramTypedArray, int paramInt1, int paramInt2)
    {
      o3.w(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
    
    @DoNotInline
    public static void setSystemGestureExclusionRects(View paramView, List<Rect> paramList)
    {
      o3.x(paramView, paramList);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static CharSequence getStateDescription(View paramView)
    {
      return l4.f(paramView);
    }
    
    @Nullable
    public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View paramView)
    {
      paramView = l4.d(paramView);
      if (paramView != null) {
        paramView = WindowInsetsControllerCompat.toWindowInsetsControllerCompat(paramView);
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    @DoNotInline
    public static void setStateDescription(View paramView, CharSequence paramCharSequence)
    {
      l4.k(paramView, paramCharSequence);
    }
  }
  
  @RequiresApi(31)
  public static final class Api31Impl
  {
    @DoNotInline
    @Nullable
    public static String[] getReceiveContentMimeTypes(@NonNull View paramView)
    {
      return g.s(paramView);
    }
    
    @DoNotInline
    @Nullable
    public static ContentInfoCompat performReceiveContent(@NonNull View paramView, @NonNull ContentInfoCompat paramContentInfoCompat)
    {
      ContentInfo localContentInfo = paramContentInfoCompat.toContentInfo();
      paramView = g.e(paramView, localContentInfo);
      if (paramView == null) {
        return null;
      }
      if (paramView == localContentInfo) {
        return paramContentInfoCompat;
      }
      return ContentInfoCompat.toContentInfoCompat(paramView);
    }
    
    @DoNotInline
    public static void setOnReceiveContentListener(@NonNull View paramView, @Nullable String[] paramArrayOfString, @Nullable OnReceiveContentListener paramOnReceiveContentListener)
    {
      if (paramOnReceiveContentListener == null) {
        g.n(paramView, paramArrayOfString);
      } else {
        g.o(paramView, paramArrayOfString, new ViewCompat.OnReceiveContentListenerAdapter(paramOnReceiveContentListener));
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface FocusDirection {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface FocusRealDirection {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface FocusRelativeDirection {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface NestedScrollType {}
  
  @RequiresApi(31)
  public static final class OnReceiveContentListenerAdapter
    implements android.view.OnReceiveContentListener
  {
    @NonNull
    private final OnReceiveContentListener mJetpackListener;
    
    public OnReceiveContentListenerAdapter(@NonNull OnReceiveContentListener paramOnReceiveContentListener)
    {
      mJetpackListener = paramOnReceiveContentListener;
    }
    
    @Nullable
    public ContentInfo onReceiveContent(@NonNull View paramView, @NonNull ContentInfo paramContentInfo)
    {
      ContentInfoCompat localContentInfoCompat = ContentInfoCompat.toContentInfoCompat(paramContentInfo);
      paramView = mJetpackListener.onReceiveContent(paramView, localContentInfoCompat);
      if (paramView == null) {
        return null;
      }
      if (paramView == localContentInfoCompat) {
        return paramContentInfo;
      }
      return paramView.toContentInfo();
    }
  }
  
  public static abstract interface OnUnhandledKeyEventListenerCompat
  {
    public abstract boolean onUnhandledKeyEvent(@NonNull View paramView, @NonNull KeyEvent paramKeyEvent);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ScrollAxis {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ScrollIndicators {}
  
  public static class UnhandledKeyEventManager
  {
    private static final ArrayList<WeakReference<View>> sViewsWithListeners = new ArrayList();
    private SparseArray<WeakReference<View>> mCapturedKeys = null;
    private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent = null;
    @Nullable
    private WeakHashMap<View, Boolean> mViewsContainingListeners = null;
    
    public static UnhandledKeyEventManager at(View paramView)
    {
      int i = R.id.tag_unhandled_key_event_manager;
      UnhandledKeyEventManager localUnhandledKeyEventManager1 = (UnhandledKeyEventManager)paramView.getTag(i);
      UnhandledKeyEventManager localUnhandledKeyEventManager2 = localUnhandledKeyEventManager1;
      if (localUnhandledKeyEventManager1 == null)
      {
        localUnhandledKeyEventManager2 = new UnhandledKeyEventManager();
        paramView.setTag(i, localUnhandledKeyEventManager2);
      }
      return localUnhandledKeyEventManager2;
    }
    
    @Nullable
    private View dispatchInOrder(View paramView, KeyEvent paramKeyEvent)
    {
      Object localObject = mViewsContainingListeners;
      if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
      {
        if ((paramView instanceof ViewGroup))
        {
          ViewGroup localViewGroup = (ViewGroup)paramView;
          for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
          {
            localObject = dispatchInOrder(localViewGroup.getChildAt(i), paramKeyEvent);
            if (localObject != null) {
              return (View)localObject;
            }
          }
        }
        if (onUnhandledKeyEvent(paramView, paramKeyEvent)) {
          return paramView;
        }
      }
      return null;
    }
    
    private SparseArray<WeakReference<View>> getCapturedKeys()
    {
      if (mCapturedKeys == null) {
        mCapturedKeys = new SparseArray();
      }
      return mCapturedKeys;
    }
    
    private boolean onUnhandledKeyEvent(@NonNull View paramView, @NonNull KeyEvent paramKeyEvent)
    {
      ArrayList localArrayList = (ArrayList)paramView.getTag(R.id.tag_unhandled_key_listeners);
      if (localArrayList != null) {
        for (int i = localArrayList.size() - 1; i >= 0; i--) {
          if (((ViewCompat.OnUnhandledKeyEventListenerCompat)localArrayList.get(i)).onUnhandledKeyEvent(paramView, paramKeyEvent)) {
            return true;
          }
        }
      }
      return false;
    }
    
    private void recalcViewsWithUnhandled()
    {
      Object localObject1 = mViewsContainingListeners;
      if (localObject1 != null) {
        ((WeakHashMap)localObject1).clear();
      }
      ArrayList localArrayList = sViewsWithListeners;
      if (localArrayList.isEmpty()) {
        return;
      }
      try
      {
        if (mViewsContainingListeners == null)
        {
          localObject1 = new java/util/WeakHashMap;
          ((WeakHashMap)localObject1).<init>();
          mViewsContainingListeners = ((WeakHashMap)localObject1);
        }
        for (int i = localArrayList.size() - 1; i >= 0; i--)
        {
          localObject1 = sViewsWithListeners;
          View localView = (View)((WeakReference)((ArrayList)localObject1).get(i)).get();
          if (localView == null)
          {
            ((ArrayList)localObject1).remove(i);
          }
          else
          {
            mViewsContainingListeners.put(localView, Boolean.TRUE);
            for (localObject1 = localView.getParent(); (localObject1 instanceof View); localObject1 = ((ViewParent)localObject1).getParent()) {
              mViewsContainingListeners.put((View)localObject1, Boolean.TRUE);
            }
          }
        }
        return;
      }
      finally {}
    }
    
    public static void registerListeningView(View paramView)
    {
      synchronized (sViewsWithListeners)
      {
        Object localObject = ???.iterator();
        while (((Iterator)localObject).hasNext()) {
          if (((WeakReference)((Iterator)localObject).next()).get() == paramView) {
            return;
          }
        }
        localObject = sViewsWithListeners;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramView);
        ((ArrayList)localObject).add(localWeakReference);
        return;
      }
    }
    
    public static void unregisterListeningView(View paramView)
    {
      ArrayList localArrayList1 = sViewsWithListeners;
      int i = 0;
      try
      {
        for (;;)
        {
          ArrayList localArrayList2 = sViewsWithListeners;
          if (i >= localArrayList2.size()) {
            break;
          }
          if (((WeakReference)localArrayList2.get(i)).get() == paramView)
          {
            localArrayList2.remove(i);
            return;
          }
          i++;
        }
        return;
      }
      finally {}
    }
    
    public boolean dispatch(View paramView, KeyEvent paramKeyEvent)
    {
      if (paramKeyEvent.getAction() == 0) {
        recalcViewsWithUnhandled();
      }
      paramView = dispatchInOrder(paramView, paramKeyEvent);
      if (paramKeyEvent.getAction() == 0)
      {
        int i = paramKeyEvent.getKeyCode();
        if ((paramView != null) && (!KeyEvent.isModifierKey(i))) {
          getCapturedKeys().put(i, new WeakReference(paramView));
        }
      }
      boolean bool;
      if (paramView != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean preDispatch(KeyEvent paramKeyEvent)
    {
      Object localObject1 = mLastDispatchedPreViewKeyEvent;
      if ((localObject1 != null) && (((Reference)localObject1).get() == paramKeyEvent)) {
        return false;
      }
      mLastDispatchedPreViewKeyEvent = new WeakReference(paramKeyEvent);
      Object localObject2 = null;
      SparseArray localSparseArray = getCapturedKeys();
      localObject1 = localObject2;
      if (paramKeyEvent.getAction() == 1)
      {
        int i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
        localObject1 = localObject2;
        if (i >= 0)
        {
          localObject1 = (WeakReference)localSparseArray.valueAt(i);
          localSparseArray.removeAt(i);
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
      }
      if (localObject2 != null)
      {
        localObject1 = (View)((Reference)localObject2).get();
        if ((localObject1 != null) && (ViewCompat.isAttachedToWindow((View)localObject1))) {
          onUnhandledKeyEvent((View)localObject1, paramKeyEvent);
        }
        return true;
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */