package androidx.recyclerview.widget;

import a;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R.attr;
import androidx.recyclerview.R.dimen;
import androidx.recyclerview.R.styleable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z2;

public class RecyclerView
  extends ViewGroup
  implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3
{
  public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
  public static final boolean ALLOW_THREAD_GAP_WORK;
  public static final boolean DEBUG = false;
  public static final int DEFAULT_ORIENTATION = 1;
  public static final boolean DISPATCH_TEMP_DETACH = false;
  private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
  public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
  public static final long FOREVER_NS = Long.MAX_VALUE;
  public static final int HORIZONTAL = 0;
  private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
  private static final int INVALID_POINTER = -1;
  public static final int INVALID_TYPE = -1;
  private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
  public static final int MAX_SCROLL_DURATION = 2000;
  private static final int[] NESTED_SCROLLING_ATTRS = { 16843830 };
  public static final long NO_ID = -1L;
  public static final int NO_POSITION = -1;
  public static final boolean POST_UPDATES_ON_ANIMATION;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  public static final String TAG = "RecyclerView";
  public static final int TOUCH_SLOP_DEFAULT = 0;
  public static final int TOUCH_SLOP_PAGING = 1;
  public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
  public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
  private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
  public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
  private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
  private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
  public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
  public static final String TRACE_SCROLL_TAG = "RV Scroll";
  public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
  public static final boolean VERBOSE_TRACING = false;
  public static final int VERTICAL = 1;
  public static final Interpolator sQuinticInterpolator = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
    }
  };
  public RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
  private final AccessibilityManager mAccessibilityManager;
  public Adapter mAdapter;
  public AdapterHelper mAdapterHelper;
  public boolean mAdapterUpdateDuringMeasure;
  private EdgeEffect mBottomGlow;
  private ChildDrawingOrderCallback mChildDrawingOrderCallback;
  public ChildHelper mChildHelper;
  public boolean mClipToPadding;
  public boolean mDataSetHasChangedAfterLayout = false;
  public boolean mDispatchItemsChangedEvent = false;
  private int mDispatchScrollCounter = 0;
  private int mEatenAccessibilityChangeFlags;
  @NonNull
  private EdgeEffectFactory mEdgeEffectFactory = new EdgeEffectFactory();
  public boolean mEnableFastScroller;
  @VisibleForTesting
  public boolean mFirstLayoutComplete;
  public GapWorker mGapWorker;
  public boolean mHasFixedSize;
  private boolean mIgnoreMotionEventTillDown;
  private int mInitialTouchX;
  private int mInitialTouchY;
  private int mInterceptRequestLayoutDepth = 0;
  private OnItemTouchListener mInterceptingOnItemTouchListener;
  public boolean mIsAttached;
  public ItemAnimator mItemAnimator = new DefaultItemAnimator();
  private RecyclerView.ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
  private Runnable mItemAnimatorRunner;
  public final ArrayList<ItemDecoration> mItemDecorations = new ArrayList();
  public boolean mItemsAddedOrRemoved;
  public boolean mItemsChanged;
  private int mLastAutoMeasureNonExactMeasuredHeight;
  private int mLastAutoMeasureNonExactMeasuredWidth;
  private boolean mLastAutoMeasureSkippedDueToExact;
  private int mLastTouchX;
  private int mLastTouchY;
  @VisibleForTesting
  public LayoutManager mLayout;
  private int mLayoutOrScrollCounter = 0;
  public boolean mLayoutSuppressed;
  public boolean mLayoutWasDefered;
  private EdgeEffect mLeftGlow;
  private final int mMaxFlingVelocity;
  private final int mMinFlingVelocity;
  private final int[] mMinMaxLayoutPositions;
  private final int[] mNestedOffsets;
  private final RecyclerViewDataObserver mObserver = new RecyclerViewDataObserver();
  private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
  private OnFlingListener mOnFlingListener;
  private final ArrayList<OnItemTouchListener> mOnItemTouchListeners = new ArrayList();
  @VisibleForTesting
  public final List<ViewHolder> mPendingAccessibilityImportanceChange;
  public SavedState mPendingSavedState;
  public boolean mPostedAnimatorRunner;
  public GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
  private boolean mPreserveFocusAfterLayout = true;
  public final Recycler mRecycler = new Recycler();
  public RecyclerListener mRecyclerListener;
  public final List<RecyclerListener> mRecyclerListeners = new ArrayList();
  public final int[] mReusableIntPair;
  private EdgeEffect mRightGlow;
  private float mScaledHorizontalScrollFactor = Float.MIN_VALUE;
  private float mScaledVerticalScrollFactor = Float.MIN_VALUE;
  private OnScrollListener mScrollListener;
  private List<OnScrollListener> mScrollListeners;
  private final int[] mScrollOffset;
  private int mScrollPointerId = -1;
  private int mScrollState = 0;
  private NestedScrollingChildHelper mScrollingChildHelper;
  public final State mState;
  public final Rect mTempRect = new Rect();
  private final Rect mTempRect2 = new Rect();
  public final RectF mTempRectF = new RectF();
  private EdgeEffect mTopGlow;
  private int mTouchSlop;
  public final Runnable mUpdateChildViewsRunnable = new Runnable()
  {
    public void run()
    {
      RecyclerView localRecyclerView = RecyclerView.this;
      if ((mFirstLayoutComplete) && (!localRecyclerView.isLayoutRequested()))
      {
        localRecyclerView = RecyclerView.this;
        if (!mIsAttached)
        {
          localRecyclerView.requestLayout();
          return;
        }
        if (mLayoutSuppressed)
        {
          mLayoutWasDefered = true;
          return;
        }
        localRecyclerView.consumePendingUpdateOperations();
      }
    }
  };
  private VelocityTracker mVelocityTracker;
  public final ViewFlinger mViewFlinger = new ViewFlinger();
  private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
  public final ViewInfoStore mViewInfoStore = new ViewInfoStore();
  
  static
  {
    FORCE_INVALIDATE_DISPLAY_LIST = false;
    ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    POST_UPDATES_ON_ANIMATION = true;
    ALLOW_THREAD_GAP_WORK = true;
    FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    IGNORE_DETACHED_FOCUSED_CHILD = false;
    Class localClass = Integer.TYPE;
    LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[] { Context.class, AttributeSet.class, localClass, localClass };
  }
  
  public RecyclerView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.recyclerViewStyle);
  }
  
  public RecyclerView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (ALLOW_THREAD_GAP_WORK) {
      localObject1 = new GapWorker.LayoutPrefetchRegistryImpl();
    } else {
      localObject1 = null;
    }
    mPrefetchRegistry = ((GapWorker.LayoutPrefetchRegistryImpl)localObject1);
    mState = new State();
    mItemsAddedOrRemoved = false;
    mItemsChanged = false;
    mItemAnimatorListener = new ItemAnimatorRestoreListener();
    mPostedAnimatorRunner = false;
    mMinMaxLayoutPositions = new int[2];
    mScrollOffset = new int[2];
    mNestedOffsets = new int[2];
    mReusableIntPair = new int[2];
    mPendingAccessibilityImportanceChange = new ArrayList();
    mItemAnimatorRunner = new Runnable()
    {
      public void run()
      {
        RecyclerView.ItemAnimator localItemAnimator = mItemAnimator;
        if (localItemAnimator != null) {
          localItemAnimator.runPendingAnimations();
        }
        mPostedAnimatorRunner = false;
      }
    };
    mLastAutoMeasureNonExactMeasuredWidth = 0;
    mLastAutoMeasureNonExactMeasuredHeight = 0;
    mViewInfoProcessCallback = new ViewInfoStore.ProcessCallback()
    {
      public void processAppeared(RecyclerView.ViewHolder paramAnonymousViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo2)
      {
        animateAppearance(paramAnonymousViewHolder, paramAnonymousItemHolderInfo1, paramAnonymousItemHolderInfo2);
      }
      
      public void processDisappeared(RecyclerView.ViewHolder paramAnonymousViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo1, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo2)
      {
        mRecycler.unscrapView(paramAnonymousViewHolder);
        animateDisappearance(paramAnonymousViewHolder, paramAnonymousItemHolderInfo1, paramAnonymousItemHolderInfo2);
      }
      
      public void processPersistent(RecyclerView.ViewHolder paramAnonymousViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramAnonymousItemHolderInfo2)
      {
        paramAnonymousViewHolder.setIsRecyclable(false);
        RecyclerView localRecyclerView = RecyclerView.this;
        if (mDataSetHasChangedAfterLayout)
        {
          if (mItemAnimator.animateChange(paramAnonymousViewHolder, paramAnonymousViewHolder, paramAnonymousItemHolderInfo1, paramAnonymousItemHolderInfo2)) {
            postAnimationRunner();
          }
        }
        else if (mItemAnimator.animatePersistence(paramAnonymousViewHolder, paramAnonymousItemHolderInfo1, paramAnonymousItemHolderInfo2)) {
          postAnimationRunner();
        }
      }
      
      public void unused(RecyclerView.ViewHolder paramAnonymousViewHolder)
      {
        RecyclerView localRecyclerView = RecyclerView.this;
        mLayout.removeAndRecycleView(itemView, mRecycler);
      }
    };
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject1 = ViewConfiguration.get(paramContext);
    mTouchSlop = ((ViewConfiguration)localObject1).getScaledTouchSlop();
    mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor((ViewConfiguration)localObject1, paramContext);
    mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor((ViewConfiguration)localObject1, paramContext);
    mMinFlingVelocity = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
    mMaxFlingVelocity = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
    if (getOverScrollMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    mItemAnimator.setListener(mItemAnimatorListener);
    initAdapterManager();
    initChildrenHelper();
    initAutofill();
    if (ViewCompat.getImportantForAccessibility(this) == 0) {
      ViewCompat.setImportantForAccessibility(this, 1);
    }
    mAccessibilityManager = ((AccessibilityManager)getContext().getSystemService("accessibility"));
    setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
    Object localObject2 = R.styleable.RecyclerView;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, (int[])localObject2, paramAttributeSet, (TypedArray)localObject1, paramInt, 0);
    localObject2 = ((TypedArray)localObject1).getString(R.styleable.RecyclerView_layoutManager);
    if (((TypedArray)localObject1).getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
      setDescendantFocusability(262144);
    }
    mClipToPadding = ((TypedArray)localObject1).getBoolean(R.styleable.RecyclerView_android_clipToPadding, true);
    boolean bool = ((TypedArray)localObject1).getBoolean(R.styleable.RecyclerView_fastScrollEnabled, false);
    mEnableFastScroller = bool;
    if (bool) {
      initFastScroller((StateListDrawable)((TypedArray)localObject1).getDrawable(R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), ((TypedArray)localObject1).getDrawable(R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable)((TypedArray)localObject1).getDrawable(R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), ((TypedArray)localObject1).getDrawable(R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
    }
    ((TypedArray)localObject1).recycle();
    createLayoutManager(paramContext, (String)localObject2, paramAttributeSet, paramInt, 0);
    localObject2 = NESTED_SCROLLING_ATTRS;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, (int[])localObject2, paramAttributeSet, (TypedArray)localObject1, paramInt, 0);
    bool = ((TypedArray)localObject1).getBoolean(0, true);
    ((TypedArray)localObject1).recycle();
    setNestedScrollingEnabled(bool);
  }
  
  private void addAnimatingView(ViewHolder paramViewHolder)
  {
    View localView = itemView;
    int i;
    if (localView.getParent() == this) {
      i = 1;
    } else {
      i = 0;
    }
    mRecycler.unscrapView(getChildViewHolder(localView));
    if (paramViewHolder.isTmpDetached()) {
      mChildHelper.attachViewToParent(localView, -1, localView.getLayoutParams(), true);
    } else if (i == 0) {
      mChildHelper.addView(localView, true);
    } else {
      mChildHelper.hide(localView);
    }
  }
  
  private void animateChange(@NonNull ViewHolder paramViewHolder1, @NonNull ViewHolder paramViewHolder2, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramViewHolder1.setIsRecyclable(false);
    if (paramBoolean1) {
      addAnimatingView(paramViewHolder1);
    }
    if (paramViewHolder1 != paramViewHolder2)
    {
      if (paramBoolean2) {
        addAnimatingView(paramViewHolder2);
      }
      mShadowedHolder = paramViewHolder2;
      addAnimatingView(paramViewHolder1);
      mRecycler.unscrapView(paramViewHolder1);
      paramViewHolder2.setIsRecyclable(false);
      mShadowingHolder = paramViewHolder1;
    }
    if (mItemAnimator.animateChange(paramViewHolder1, paramViewHolder2, paramItemHolderInfo1, paramItemHolderInfo2)) {
      postAnimationRunner();
    }
  }
  
  private void cancelScroll()
  {
    resetScroll();
    setScrollState(0);
  }
  
  public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder paramViewHolder)
  {
    Object localObject = mNestedRecyclerView;
    if (localObject != null)
    {
      localObject = (View)((Reference)localObject).get();
      while (localObject != null)
      {
        if (localObject == itemView) {
          return;
        }
        localObject = ((View)localObject).getParent();
        if ((localObject instanceof View)) {
          localObject = (View)localObject;
        } else {
          localObject = null;
        }
      }
      mNestedRecyclerView = null;
    }
  }
  
  private void createLayoutManager(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (!paramString.isEmpty())
      {
        String str = getFullClassName(paramContext, paramString);
        try
        {
          if (isInEditMode()) {
            paramString = getClass().getClassLoader();
          } else {
            paramString = paramContext.getClassLoader();
          }
          Class localClass = Class.forName(str, false, paramString).asSubclass(LayoutManager.class);
          paramString = null;
          try
          {
            Constructor localConstructor = localClass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
            paramString = new Object[] { paramContext, paramAttributeSet, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) };
            paramContext = localConstructor;
          }
          catch (NoSuchMethodException localNoSuchMethodException) {}
          try
          {
            paramContext = localClass.getConstructor(new Class[0]);
            paramContext.setAccessible(true);
            setLayoutManager((LayoutManager)paramContext.newInstance(paramString));
          }
          catch (NoSuchMethodException paramContext)
          {
            paramContext.initCause(localNoSuchMethodException);
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            paramString = new java/lang/StringBuilder;
            paramString.<init>();
            paramString.append(paramAttributeSet.getPositionDescription());
            paramString.append(": Error creating LayoutManager ");
            paramString.append(str);
            localIllegalStateException.<init>(paramString.toString(), paramContext);
            throw localIllegalStateException;
          }
          return;
        }
        catch (ClassCastException paramContext)
        {
          paramString = new StringBuilder();
          paramString.append(paramAttributeSet.getPositionDescription());
          paramString.append(": Class is not a LayoutManager ");
          paramString.append(str);
          throw new IllegalStateException(paramString.toString(), paramContext);
        }
        catch (IllegalAccessException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Cannot access non-public constructor ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (InstantiationException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Could not instantiate the LayoutManager: ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (InvocationTargetException paramString)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Could not instantiate the LayoutManager: ");
          paramContext.append(str);
          throw new IllegalStateException(paramContext.toString(), paramString);
        }
        catch (ClassNotFoundException paramContext)
        {
          paramString = new StringBuilder();
          paramString.append(paramAttributeSet.getPositionDescription());
          paramString.append(": Unable to find LayoutManager ");
          paramString.append(str);
          throw new IllegalStateException(paramString.toString(), paramContext);
        }
      }
    }
  }
  
  private boolean didChildRangeChange(int paramInt1, int paramInt2)
  {
    findMinMaxChildLayoutPositions(mMinMaxLayoutPositions);
    int[] arrayOfInt = mMinMaxLayoutPositions;
    boolean bool = false;
    if ((arrayOfInt[0] != paramInt1) || (arrayOfInt[1] != paramInt2)) {
      bool = true;
    }
    return bool;
  }
  
  private void dispatchContentChangedIfNecessary()
  {
    int i = mEatenAccessibilityChangeFlags;
    mEatenAccessibilityChangeFlags = 0;
    if ((i != 0) && (isAccessibilityEnabled()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      AccessibilityEventCompat.setContentChangeTypes(localAccessibilityEvent, i);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }
  
  private void dispatchLayoutStep1()
  {
    Object localObject1 = mState;
    boolean bool = true;
    ((State)localObject1).assertLayoutStep(1);
    fillRemainingScrollValues(mState);
    mState.mIsMeasuring = false;
    startInterceptRequestLayout();
    mViewInfoStore.clear();
    onEnterLayoutOrScroll();
    processAdapterUpdatesAndSetAnimationFlags();
    saveFocusInfo();
    localObject1 = mState;
    if ((!mRunSimpleAnimations) || (!mItemsChanged)) {
      bool = false;
    }
    mTrackOldChangeHolders = bool;
    mItemsChanged = false;
    mItemsAddedOrRemoved = false;
    mInPreLayout = mRunPredictiveAnimations;
    mItemCount = mAdapter.getItemCount();
    findMinMaxChildLayoutPositions(mMinMaxLayoutPositions);
    int i;
    int j;
    Object localObject2;
    if (mState.mRunSimpleAnimations)
    {
      i = mChildHelper.getChildCount();
      for (j = 0; j < i; j++)
      {
        localObject1 = getChildViewHolderInt(mChildHelper.getChildAt(j));
        if ((!((ViewHolder)localObject1).shouldIgnore()) && ((!((ViewHolder)localObject1).isInvalid()) || (mAdapter.hasStableIds())))
        {
          localObject2 = mItemAnimator.recordPreLayoutInformation(mState, (ViewHolder)localObject1, ItemAnimator.buildAdapterChangeFlagsForAnimations((ViewHolder)localObject1), ((ViewHolder)localObject1).getUnmodifiedPayloads());
          mViewInfoStore.addToPreLayout((ViewHolder)localObject1, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject2);
          if ((mState.mTrackOldChangeHolders) && (((ViewHolder)localObject1).isUpdated()) && (!((ViewHolder)localObject1).isRemoved()) && (!((ViewHolder)localObject1).shouldIgnore()) && (!((ViewHolder)localObject1).isInvalid()))
          {
            long l = getChangedHolderKey((ViewHolder)localObject1);
            mViewInfoStore.addToOldChangeHolders(l, (ViewHolder)localObject1);
          }
        }
      }
    }
    if (mState.mRunPredictiveAnimations)
    {
      saveOldPositions();
      localObject1 = mState;
      bool = mStructureChanged;
      mStructureChanged = false;
      mLayout.onLayoutChildren(mRecycler, (State)localObject1);
      mState.mStructureChanged = bool;
      for (j = 0; j < mChildHelper.getChildCount(); j++)
      {
        localObject2 = getChildViewHolderInt(mChildHelper.getChildAt(j));
        if ((!((ViewHolder)localObject2).shouldIgnore()) && (!mViewInfoStore.isInPreLayout((ViewHolder)localObject2)))
        {
          int k = ItemAnimator.buildAdapterChangeFlagsForAnimations((ViewHolder)localObject2);
          bool = ((ViewHolder)localObject2).hasAnyOfTheFlags(8192);
          i = k;
          if (!bool) {
            i = k | 0x1000;
          }
          localObject1 = mItemAnimator.recordPreLayoutInformation(mState, (ViewHolder)localObject2, i, ((ViewHolder)localObject2).getUnmodifiedPayloads());
          if (bool) {
            recordAnimationInfoIfBouncedHiddenView((ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
          } else {
            mViewInfoStore.addToAppearedInPreLayoutHolders((ViewHolder)localObject2, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject1);
          }
        }
      }
      clearOldPositions();
    }
    else
    {
      clearOldPositions();
    }
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    mState.mLayoutStep = 2;
  }
  
  private void dispatchLayoutStep2()
  {
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    mState.assertLayoutStep(6);
    mAdapterHelper.consumeUpdatesInOnePass();
    mState.mItemCount = mAdapter.getItemCount();
    mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
    if ((mPendingSavedState != null) && (mAdapter.canRestoreState()))
    {
      localObject = mPendingSavedState.mLayoutState;
      if (localObject != null) {
        mLayout.onRestoreInstanceState((Parcelable)localObject);
      }
      mPendingSavedState = null;
    }
    Object localObject = mState;
    mInPreLayout = false;
    mLayout.onLayoutChildren(mRecycler, (State)localObject);
    localObject = mState;
    mStructureChanged = false;
    boolean bool;
    if ((mRunSimpleAnimations) && (mItemAnimator != null)) {
      bool = true;
    } else {
      bool = false;
    }
    mRunSimpleAnimations = bool;
    mLayoutStep = 4;
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
  }
  
  private void dispatchLayoutStep3()
  {
    mState.assertLayoutStep(4);
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    Object localObject = mState;
    mLayoutStep = 1;
    if (mRunSimpleAnimations)
    {
      for (int i = mChildHelper.getChildCount() - 1; i >= 0; i--)
      {
        ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getChildAt(i));
        if (!localViewHolder.shouldIgnore())
        {
          long l = getChangedHolderKey(localViewHolder);
          RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo1 = mItemAnimator.recordPostLayoutInformation(mState, localViewHolder);
          localObject = mViewInfoStore.getFromOldChangeHolders(l);
          if ((localObject != null) && (!((ViewHolder)localObject).shouldIgnore()))
          {
            boolean bool1 = mViewInfoStore.isDisappearing((ViewHolder)localObject);
            boolean bool2 = mViewInfoStore.isDisappearing(localViewHolder);
            if ((bool1) && (localObject == localViewHolder))
            {
              mViewInfoStore.addToPostLayout(localViewHolder, localItemHolderInfo1);
            }
            else
            {
              RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo2 = mViewInfoStore.popFromPreLayout((ViewHolder)localObject);
              mViewInfoStore.addToPostLayout(localViewHolder, localItemHolderInfo1);
              localItemHolderInfo1 = mViewInfoStore.popFromPostLayout(localViewHolder);
              if (localItemHolderInfo2 == null) {
                handleMissingPreInfoForChangeError(l, localViewHolder, (ViewHolder)localObject);
              } else {
                animateChange((ViewHolder)localObject, localViewHolder, localItemHolderInfo2, localItemHolderInfo1, bool1, bool2);
              }
            }
          }
          else
          {
            mViewInfoStore.addToPostLayout(localViewHolder, localItemHolderInfo1);
          }
        }
      }
      mViewInfoStore.process(mViewInfoProcessCallback);
    }
    mLayout.removeAndRecycleScrapInt(mRecycler);
    localObject = mState;
    mPreviousLayoutItemCount = mItemCount;
    mDataSetHasChangedAfterLayout = false;
    mDispatchItemsChangedEvent = false;
    mRunSimpleAnimations = false;
    mRunPredictiveAnimations = false;
    mLayout.mRequestedSimpleAnimations = false;
    localObject = mRecycler.mChangedScrap;
    if (localObject != null) {
      ((ArrayList)localObject).clear();
    }
    localObject = mLayout;
    if (mPrefetchMaxObservedInInitialPrefetch)
    {
      mPrefetchMaxCountObserved = 0;
      mPrefetchMaxObservedInInitialPrefetch = false;
      mRecycler.updateViewCacheSize();
    }
    mLayout.onLayoutCompleted(mState);
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    mViewInfoStore.clear();
    localObject = mMinMaxLayoutPositions;
    if (didChildRangeChange(localObject[0], localObject[1])) {
      dispatchOnScrolled(0, 0);
    }
    recoverFocusFromState();
    resetFocusInfo();
  }
  
  private boolean dispatchToOnItemTouchListeners(MotionEvent paramMotionEvent)
  {
    OnItemTouchListener localOnItemTouchListener = mInterceptingOnItemTouchListener;
    if (localOnItemTouchListener == null)
    {
      if (paramMotionEvent.getAction() == 0) {
        return false;
      }
      return findInterceptingOnItemTouchListener(paramMotionEvent);
    }
    localOnItemTouchListener.onTouchEvent(this, paramMotionEvent);
    int i = paramMotionEvent.getAction();
    if ((i == 3) || (i == 1)) {
      mInterceptingOnItemTouchListener = null;
    }
    return true;
  }
  
  private boolean findInterceptingOnItemTouchListener(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = mOnItemTouchListeners.size();
    for (int k = 0; k < j; k++)
    {
      OnItemTouchListener localOnItemTouchListener = (OnItemTouchListener)mOnItemTouchListeners.get(k);
      if ((localOnItemTouchListener.onInterceptTouchEvent(this, paramMotionEvent)) && (i != 3))
      {
        mInterceptingOnItemTouchListener = localOnItemTouchListener;
        return true;
      }
    }
    return false;
  }
  
  private void findMinMaxChildLayoutPositions(int[] paramArrayOfInt)
  {
    int i = mChildHelper.getChildCount();
    if (i == 0)
    {
      paramArrayOfInt[0] = -1;
      paramArrayOfInt[1] = -1;
      return;
    }
    int j = Integer.MAX_VALUE;
    int k = Integer.MIN_VALUE;
    int m = 0;
    while (m < i)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getChildAt(m));
      int n;
      if (localViewHolder.shouldIgnore())
      {
        n = k;
      }
      else
      {
        int i1 = localViewHolder.getLayoutPosition();
        int i2 = j;
        if (i1 < j) {
          i2 = i1;
        }
        j = i2;
        n = k;
        if (i1 > k)
        {
          n = i1;
          j = i2;
        }
      }
      m++;
      k = n;
    }
    paramArrayOfInt[0] = j;
    paramArrayOfInt[1] = k;
  }
  
  @Nullable
  public static RecyclerView findNestedRecyclerView(@NonNull View paramView)
  {
    if (!(paramView instanceof ViewGroup)) {
      return null;
    }
    if ((paramView instanceof RecyclerView)) {
      return (RecyclerView)paramView;
    }
    paramView = (ViewGroup)paramView;
    int i = paramView.getChildCount();
    for (int j = 0; j < i; j++)
    {
      RecyclerView localRecyclerView = findNestedRecyclerView(paramView.getChildAt(j));
      if (localRecyclerView != null) {
        return localRecyclerView;
      }
    }
    return null;
  }
  
  @Nullable
  private View findNextViewToFocus()
  {
    Object localObject = mState;
    int i = mFocusedItemPosition;
    if (i == -1) {
      i = 0;
    }
    int j = ((State)localObject).getItemCount();
    for (int k = i; k < j; k++)
    {
      localObject = findViewHolderForAdapterPosition(k);
      if (localObject == null) {
        break;
      }
      if (itemView.hasFocusable()) {
        return itemView;
      }
    }
    for (i = Math.min(j, i) - 1; i >= 0; i--)
    {
      localObject = findViewHolderForAdapterPosition(i);
      if (localObject == null) {
        return null;
      }
      if (itemView.hasFocusable()) {
        return itemView;
      }
    }
    return null;
  }
  
  public static ViewHolder getChildViewHolderInt(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return getLayoutParamsmViewHolder;
  }
  
  public static void getDecoratedBoundsWithMarginsInt(View paramView, Rect paramRect)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect localRect = mDecorInsets;
    paramRect.set(paramView.getLeft() - left - leftMargin, paramView.getTop() - top - topMargin, paramView.getRight() + right + rightMargin, paramView.getBottom() + bottom + bottomMargin);
  }
  
  private int getDeepestFocusedViewWithId(View paramView)
  {
    int i = paramView.getId();
    while ((!paramView.isFocused()) && ((paramView instanceof ViewGroup)) && (paramView.hasFocus()))
    {
      View localView = ((ViewGroup)paramView).getFocusedChild();
      paramView = localView;
      if (localView.getId() != -1)
      {
        i = localView.getId();
        paramView = localView;
      }
    }
    return i;
  }
  
  private String getFullClassName(Context paramContext, String paramString)
  {
    if (paramString.charAt(0) == '.')
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramContext.getPackageName());
      localStringBuilder.append(paramString);
      return localStringBuilder.toString();
    }
    if (paramString.contains(".")) {
      return paramString;
    }
    paramContext = new StringBuilder();
    paramContext.append(RecyclerView.class.getPackage().getName());
    paramContext.append('.');
    paramContext.append(paramString);
    return paramContext.toString();
  }
  
  private NestedScrollingChildHelper getScrollingChildHelper()
  {
    if (mScrollingChildHelper == null) {
      mScrollingChildHelper = new NestedScrollingChildHelper(this);
    }
    return mScrollingChildHelper;
  }
  
  private void handleMissingPreInfoForChangeError(long paramLong, ViewHolder paramViewHolder1, ViewHolder paramViewHolder2)
  {
    int i = mChildHelper.getChildCount();
    for (int j = 0; j < i; j++)
    {
      localObject = getChildViewHolderInt(mChildHelper.getChildAt(j));
      if ((localObject != paramViewHolder1) && (getChangedHolderKey((ViewHolder)localObject) == paramLong))
      {
        paramViewHolder2 = mAdapter;
        if ((paramViewHolder2 != null) && (paramViewHolder2.hasStableIds()))
        {
          paramViewHolder2 = new StringBuilder();
          paramViewHolder2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
          paramViewHolder2.append(localObject);
          paramViewHolder2.append(" \n View Holder 2:");
          paramViewHolder2.append(paramViewHolder1);
          throw new IllegalStateException(z2.m(this, paramViewHolder2));
        }
        paramViewHolder2 = new StringBuilder();
        paramViewHolder2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
        paramViewHolder2.append(localObject);
        paramViewHolder2.append(" \n View Holder 2:");
        paramViewHolder2.append(paramViewHolder1);
        throw new IllegalStateException(z2.m(this, paramViewHolder2));
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
    ((StringBuilder)localObject).append(paramViewHolder2);
    ((StringBuilder)localObject).append(" cannot be found but it is necessary for ");
    ((StringBuilder)localObject).append(paramViewHolder1);
    ((StringBuilder)localObject).append(exceptionLabel());
    Log.e("RecyclerView", ((StringBuilder)localObject).toString());
  }
  
  private boolean hasUpdatedView()
  {
    int i = mChildHelper.getChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getChildAt(j));
      if ((localViewHolder != null) && (!localViewHolder.shouldIgnore()) && (localViewHolder.isUpdated())) {
        return true;
      }
    }
    return false;
  }
  
  @SuppressLint({"InlinedApi"})
  private void initAutofill()
  {
    if (ViewCompat.getImportantForAutofill(this) == 0) {
      ViewCompat.setImportantForAutofill(this, 8);
    }
  }
  
  private void initChildrenHelper()
  {
    mChildHelper = new ChildHelper(new ChildHelper.Callback()
    {
      public void addView(View paramAnonymousView, int paramAnonymousInt)
      {
        RecyclerView.this.addView(paramAnonymousView, paramAnonymousInt);
        dispatchChildAttached(paramAnonymousView);
      }
      
      public void attachViewToParent(View paramAnonymousView, int paramAnonymousInt, ViewGroup.LayoutParams paramAnonymousLayoutParams)
      {
        RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramAnonymousView);
        if (localViewHolder != null)
        {
          if ((!localViewHolder.isTmpDetached()) && (!localViewHolder.shouldIgnore()))
          {
            paramAnonymousView = new StringBuilder();
            paramAnonymousView.append("Called attach on a child which is not detached: ");
            paramAnonymousView.append(localViewHolder);
            throw new IllegalArgumentException(z2.m(RecyclerView.this, paramAnonymousView));
          }
          localViewHolder.clearTmpDetachFlag();
        }
        RecyclerView.access$000(RecyclerView.this, paramAnonymousView, paramAnonymousInt, paramAnonymousLayoutParams);
      }
      
      public void detachViewFromParent(int paramAnonymousInt)
      {
        Object localObject = getChildAt(paramAnonymousInt);
        if (localObject != null)
        {
          RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt((View)localObject);
          if (localViewHolder != null)
          {
            if ((localViewHolder.isTmpDetached()) && (!localViewHolder.shouldIgnore()))
            {
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("called detach on an already detached child ");
              ((StringBuilder)localObject).append(localViewHolder);
              throw new IllegalArgumentException(z2.m(RecyclerView.this, (StringBuilder)localObject));
            }
            localViewHolder.addFlags(256);
          }
        }
        RecyclerView.access$100(RecyclerView.this, paramAnonymousInt);
      }
      
      public View getChildAt(int paramAnonymousInt)
      {
        return RecyclerView.this.getChildAt(paramAnonymousInt);
      }
      
      public int getChildCount()
      {
        return RecyclerView.this.getChildCount();
      }
      
      public RecyclerView.ViewHolder getChildViewHolder(View paramAnonymousView)
      {
        return RecyclerView.getChildViewHolderInt(paramAnonymousView);
      }
      
      public int indexOfChild(View paramAnonymousView)
      {
        return RecyclerView.this.indexOfChild(paramAnonymousView);
      }
      
      public void onEnteredHiddenState(View paramAnonymousView)
      {
        paramAnonymousView = RecyclerView.getChildViewHolderInt(paramAnonymousView);
        if (paramAnonymousView != null) {
          paramAnonymousView.onEnteredHiddenState(RecyclerView.this);
        }
      }
      
      public void onLeftHiddenState(View paramAnonymousView)
      {
        paramAnonymousView = RecyclerView.getChildViewHolderInt(paramAnonymousView);
        if (paramAnonymousView != null) {
          paramAnonymousView.onLeftHiddenState(RecyclerView.this);
        }
      }
      
      public void removeAllViews()
      {
        int i = getChildCount();
        for (int j = 0; j < i; j++)
        {
          View localView = getChildAt(j);
          dispatchChildDetached(localView);
          localView.clearAnimation();
        }
        RecyclerView.this.removeAllViews();
      }
      
      public void removeViewAt(int paramAnonymousInt)
      {
        View localView = RecyclerView.this.getChildAt(paramAnonymousInt);
        if (localView != null)
        {
          dispatchChildDetached(localView);
          localView.clearAnimation();
        }
        RecyclerView.this.removeViewAt(paramAnonymousInt);
      }
    });
  }
  
  private boolean isPreferredNextFocus(View paramView1, View paramView2, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = bool5;
    if (paramView2 != null)
    {
      bool7 = bool5;
      if (paramView2 != this) {
        if (paramView2 == paramView1)
        {
          bool7 = bool5;
        }
        else
        {
          if (findContainingItemView(paramView2) == null) {
            return false;
          }
          if (paramView1 == null) {
            return true;
          }
          if (findContainingItemView(paramView1) == null) {
            return true;
          }
          mTempRect.set(0, 0, paramView1.getWidth(), paramView1.getHeight());
          mTempRect2.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
          offsetDescendantRectToMyCoords(paramView1, mTempRect);
          offsetDescendantRectToMyCoords(paramView2, mTempRect2);
          int i = mLayout.getLayoutDirection();
          int j = -1;
          int k;
          if (i == 1) {
            k = -1;
          } else {
            k = 1;
          }
          paramView2 = mTempRect;
          i = left;
          paramView1 = mTempRect2;
          int m = left;
          int n;
          if (((i < m) || (right <= m)) && (right < right))
          {
            i = 1;
          }
          else
          {
            n = right;
            i1 = right;
            if (((n > i1) || (i >= i1)) && (i > m)) {
              i = -1;
            } else {
              i = 0;
            }
          }
          int i1 = top;
          m = top;
          if (((i1 < m) || (bottom <= m)) && (bottom < bottom))
          {
            j = 1;
          }
          else
          {
            n = bottom;
            int i2 = bottom;
            if (((n <= i2) && (i1 < i2)) || (i1 <= m)) {
              j = 0;
            }
          }
          if (paramInt != 1)
          {
            if (paramInt != 2)
            {
              if (paramInt != 17)
              {
                if (paramInt != 33)
                {
                  if (paramInt != 66)
                  {
                    if (paramInt == 130)
                    {
                      bool7 = bool6;
                      if (j > 0) {
                        bool7 = true;
                      }
                      return bool7;
                    }
                    paramView1 = new StringBuilder();
                    paramView1.append("Invalid direction: ");
                    paramView1.append(paramInt);
                    throw new IllegalArgumentException(z2.m(this, paramView1));
                  }
                  bool7 = bool1;
                  if (i > 0) {
                    bool7 = true;
                  }
                  return bool7;
                }
                bool7 = bool2;
                if (j < 0) {
                  bool7 = true;
                }
                return bool7;
              }
              bool7 = bool3;
              if (i < 0) {
                bool7 = true;
              }
              return bool7;
            }
            if (j <= 0)
            {
              bool7 = bool4;
              if (j == 0)
              {
                bool7 = bool4;
                if (i * k <= 0) {}
              }
            }
            else
            {
              bool7 = true;
            }
            return bool7;
          }
          if (j >= 0)
          {
            bool7 = bool5;
            if (j == 0)
            {
              bool7 = bool5;
              if (i * k >= 0) {}
            }
          }
          else
          {
            bool7 = true;
          }
        }
      }
    }
    return bool7;
  }
  
  private void nestedScrollByInternal(int paramInt1, int paramInt2, @Nullable MotionEvent paramMotionEvent, int paramInt3)
  {
    Object localObject = mLayout;
    if (localObject == null)
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (mLayoutSuppressed) {
      return;
    }
    int[] arrayOfInt = mReusableIntPair;
    int i = 0;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    int j = ((LayoutManager)localObject).canScrollHorizontally();
    boolean bool = mLayout.canScrollVertically();
    if (bool) {
      k = j | 0x2;
    } else {
      k = j;
    }
    startNestedScroll(k, paramInt3);
    int m;
    if (j != 0) {
      m = paramInt1;
    } else {
      m = 0;
    }
    int n;
    if (bool) {
      n = paramInt2;
    } else {
      n = 0;
    }
    int i1 = paramInt1;
    int k = paramInt2;
    if (dispatchNestedPreScroll(m, n, mReusableIntPair, mScrollOffset, paramInt3))
    {
      localObject = mReusableIntPair;
      i1 = paramInt1 - localObject[0];
      k = paramInt2 - localObject[1];
    }
    if (j != 0) {
      paramInt1 = i1;
    } else {
      paramInt1 = 0;
    }
    paramInt2 = i;
    if (bool) {
      paramInt2 = k;
    }
    scrollByInternal(paramInt1, paramInt2, paramMotionEvent, paramInt3);
    paramMotionEvent = mGapWorker;
    if ((paramMotionEvent != null) && ((i1 != 0) || (k != 0))) {
      paramMotionEvent.postFromTraversal(this, i1, k);
    }
    stopNestedScroll(paramInt3);
  }
  
  private void onPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == mScrollPointerId)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      mScrollPointerId = paramMotionEvent.getPointerId(i);
      int j = (int)(paramMotionEvent.getX(i) + 0.5F);
      mLastTouchX = j;
      mInitialTouchX = j;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      mLastTouchY = i;
      mInitialTouchY = i;
    }
  }
  
  private boolean predictiveItemAnimationsEnabled()
  {
    boolean bool;
    if ((mItemAnimator != null) && (mLayout.supportsPredictiveItemAnimations())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void processAdapterUpdatesAndSetAnimationFlags()
  {
    if (mDataSetHasChangedAfterLayout)
    {
      mAdapterHelper.reset();
      if (mDispatchItemsChangedEvent) {
        mLayout.onItemsChanged(this);
      }
    }
    if (predictiveItemAnimationsEnabled()) {
      mAdapterHelper.preProcess();
    } else {
      mAdapterHelper.consumeUpdatesInOnePass();
    }
    boolean bool1 = mItemsAddedOrRemoved;
    boolean bool2 = false;
    int i;
    if ((!bool1) && (!mItemsChanged)) {
      i = 0;
    } else {
      i = 1;
    }
    State localState = mState;
    if ((mFirstLayoutComplete) && (mItemAnimator != null))
    {
      bool1 = mDataSetHasChangedAfterLayout;
      if (((bool1) || (i != 0) || (mLayout.mRequestedSimpleAnimations)) && ((!bool1) || (mAdapter.hasStableIds())))
      {
        bool1 = true;
        break label145;
      }
    }
    bool1 = false;
    label145:
    mRunSimpleAnimations = bool1;
    localState = mState;
    bool1 = bool2;
    if (mRunSimpleAnimations)
    {
      bool1 = bool2;
      if (i != 0)
      {
        bool1 = bool2;
        if (!mDataSetHasChangedAfterLayout)
        {
          bool1 = bool2;
          if (predictiveItemAnimationsEnabled()) {
            bool1 = true;
          }
        }
      }
    }
    mRunPredictiveAnimations = bool1;
  }
  
  private void pullGlows(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = 1;
    if (paramFloat2 < 0.0F)
    {
      ensureLeftGlow();
      EdgeEffectCompat.onPull(mLeftGlow, -paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight());
    }
    for (;;)
    {
      j = 1;
      break label80;
      if (paramFloat2 <= 0.0F) {
        break;
      }
      ensureRightGlow();
      EdgeEffectCompat.onPull(mRightGlow, paramFloat2 / getWidth(), paramFloat3 / getHeight());
    }
    int j = 0;
    label80:
    if (paramFloat4 < 0.0F)
    {
      ensureTopGlow();
      EdgeEffectCompat.onPull(mTopGlow, -paramFloat4 / getHeight(), paramFloat1 / getWidth());
      j = i;
    }
    else if (paramFloat4 > 0.0F)
    {
      ensureBottomGlow();
      EdgeEffectCompat.onPull(mBottomGlow, paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth());
      j = i;
    }
    if ((j != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F)) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  private void recoverFocusFromState()
  {
    if ((mPreserveFocusAfterLayout) && (mAdapter != null) && (hasFocus()) && (getDescendantFocusability() != 393216) && ((getDescendantFocusability() != 131072) || (!isFocused())))
    {
      Object localObject1;
      if (!isFocused())
      {
        localObject1 = getFocusedChild();
        if ((IGNORE_DETACHED_FOCUSED_CHILD) && ((((View)localObject1).getParent() == null) || (!((View)localObject1).hasFocus())))
        {
          if (mChildHelper.getChildCount() == 0) {
            requestFocus();
          }
        }
        else if (!mChildHelper.isHidden((View)localObject1)) {
          return;
        }
      }
      long l = mState.mFocusedItemId;
      Object localObject2 = null;
      if ((l != -1L) && (mAdapter.hasStableIds())) {
        localObject1 = findViewHolderForItemId(mState.mFocusedItemId);
      } else {
        localObject1 = null;
      }
      if ((localObject1 != null) && (!mChildHelper.isHidden(itemView)) && (itemView.hasFocusable()))
      {
        localObject1 = itemView;
      }
      else
      {
        localObject1 = localObject2;
        if (mChildHelper.getChildCount() > 0) {
          localObject1 = findNextViewToFocus();
        }
      }
      if (localObject1 != null)
      {
        int i = mState.mFocusedSubChildId;
        localObject2 = localObject1;
        if (i != -1L)
        {
          View localView = ((View)localObject1).findViewById(i);
          localObject2 = localObject1;
          if (localView != null)
          {
            localObject2 = localObject1;
            if (localView.isFocusable()) {
              localObject2 = localView;
            }
          }
        }
        ((View)localObject2).requestFocus();
      }
    }
  }
  
  private void releaseGlows()
  {
    EdgeEffect localEdgeEffect = mLeftGlow;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool1 = mLeftGlow.isFinished();
    }
    else
    {
      bool1 = false;
    }
    localEdgeEffect = mTopGlow;
    boolean bool2 = bool1;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool2 = bool1 | mTopGlow.isFinished();
    }
    localEdgeEffect = mRightGlow;
    boolean bool1 = bool2;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool1 = bool2 | mRightGlow.isFinished();
    }
    localEdgeEffect = mBottomGlow;
    bool2 = bool1;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      bool2 = bool1 | mBottomGlow.isFinished();
    }
    if (bool2) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  private void requestChildOnScreen(@NonNull View paramView1, @Nullable View paramView2)
  {
    if (paramView2 != null) {
      localObject1 = paramView2;
    } else {
      localObject1 = paramView1;
    }
    mTempRect.set(0, 0, ((View)localObject1).getWidth(), ((View)localObject1).getHeight());
    Object localObject1 = ((View)localObject1).getLayoutParams();
    if ((localObject1 instanceof LayoutParams))
    {
      localObject1 = (LayoutParams)localObject1;
      if (!mInsetsDirty)
      {
        localObject2 = mDecorInsets;
        localObject1 = mTempRect;
        left -= left;
        right += right;
        top -= top;
        bottom += bottom;
      }
    }
    if (paramView2 != null)
    {
      offsetDescendantRectToMyCoords(paramView2, mTempRect);
      offsetRectIntoDescendantCoords(paramView1, mTempRect);
    }
    Object localObject2 = mLayout;
    localObject1 = mTempRect;
    boolean bool1 = mFirstLayoutComplete;
    boolean bool2;
    if (paramView2 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ((LayoutManager)localObject2).requestChildRectangleOnScreen(this, paramView1, (Rect)localObject1, bool1 ^ true, bool2);
  }
  
  private void resetFocusInfo()
  {
    State localState = mState;
    mFocusedItemId = -1L;
    mFocusedItemPosition = -1;
    mFocusedSubChildId = -1;
  }
  
  private void resetScroll()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null) {
      localVelocityTracker.clear();
    }
    stopNestedScroll(0);
    releaseGlows();
  }
  
  private void saveFocusInfo()
  {
    boolean bool = mPreserveFocusAfterLayout;
    State localState = null;
    Object localObject;
    if ((bool) && (hasFocus()) && (mAdapter != null)) {
      localObject = getFocusedChild();
    } else {
      localObject = null;
    }
    if (localObject == null) {
      localObject = localState;
    } else {
      localObject = findContainingViewHolder((View)localObject);
    }
    if (localObject == null)
    {
      resetFocusInfo();
    }
    else
    {
      localState = mState;
      long l;
      if (mAdapter.hasStableIds()) {
        l = ((ViewHolder)localObject).getItemId();
      } else {
        l = -1L;
      }
      mFocusedItemId = l;
      localState = mState;
      int i;
      if (mDataSetHasChangedAfterLayout) {
        i = -1;
      } else if (((ViewHolder)localObject).isRemoved()) {
        i = mOldPosition;
      } else {
        i = ((ViewHolder)localObject).getAbsoluteAdapterPosition();
      }
      mFocusedItemPosition = i;
      mState.mFocusedSubChildId = getDeepestFocusedViewWithId(itemView);
    }
  }
  
  private void setAdapterInternal(@Nullable Adapter paramAdapter, boolean paramBoolean1, boolean paramBoolean2)
  {
    Adapter localAdapter = mAdapter;
    if (localAdapter != null)
    {
      localAdapter.unregisterAdapterDataObserver(mObserver);
      mAdapter.onDetachedFromRecyclerView(this);
    }
    if ((!paramBoolean1) || (paramBoolean2)) {
      removeAndRecycleViews();
    }
    mAdapterHelper.reset();
    localAdapter = mAdapter;
    mAdapter = paramAdapter;
    if (paramAdapter != null)
    {
      paramAdapter.registerAdapterDataObserver(mObserver);
      paramAdapter.onAttachedToRecyclerView(this);
    }
    paramAdapter = mLayout;
    if (paramAdapter != null) {
      paramAdapter.onAdapterChanged(localAdapter, mAdapter);
    }
    mRecycler.onAdapterChanged(localAdapter, mAdapter, paramBoolean1);
    mState.mStructureChanged = true;
  }
  
  private void stopScrollersInternal()
  {
    mViewFlinger.stop();
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      localLayoutManager.stopSmoothScroller();
    }
  }
  
  public void absorbGlows(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      ensureLeftGlow();
      if (mLeftGlow.isFinished()) {
        mLeftGlow.onAbsorb(-paramInt1);
      }
    }
    else if (paramInt1 > 0)
    {
      ensureRightGlow();
      if (mRightGlow.isFinished()) {
        mRightGlow.onAbsorb(paramInt1);
      }
    }
    if (paramInt2 < 0)
    {
      ensureTopGlow();
      if (mTopGlow.isFinished()) {
        mTopGlow.onAbsorb(-paramInt2);
      }
    }
    else if (paramInt2 > 0)
    {
      ensureBottomGlow();
      if (mBottomGlow.isFinished()) {
        mBottomGlow.onAbsorb(paramInt2);
      }
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    LayoutManager localLayoutManager = mLayout;
    if ((localLayoutManager == null) || (!localLayoutManager.onAddFocusables(this, paramArrayList, paramInt1, paramInt2))) {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  public void addItemDecoration(@NonNull ItemDecoration paramItemDecoration)
  {
    addItemDecoration(paramItemDecoration, -1);
  }
  
  public void addItemDecoration(@NonNull ItemDecoration paramItemDecoration, int paramInt)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      localLayoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
    }
    if (mItemDecorations.isEmpty()) {
      setWillNotDraw(false);
    }
    if (paramInt < 0) {
      mItemDecorations.add(paramItemDecoration);
    } else {
      mItemDecorations.add(paramInt, paramItemDecoration);
    }
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener paramOnChildAttachStateChangeListener)
  {
    if (mOnChildAttachStateListeners == null) {
      mOnChildAttachStateListeners = new ArrayList();
    }
    mOnChildAttachStateListeners.add(paramOnChildAttachStateChangeListener);
  }
  
  public void addOnItemTouchListener(@NonNull OnItemTouchListener paramOnItemTouchListener)
  {
    mOnItemTouchListeners.add(paramOnItemTouchListener);
  }
  
  public void addOnScrollListener(@NonNull OnScrollListener paramOnScrollListener)
  {
    if (mScrollListeners == null) {
      mScrollListeners = new ArrayList();
    }
    mScrollListeners.add(paramOnScrollListener);
  }
  
  public void addRecyclerListener(@NonNull RecyclerListener paramRecyclerListener)
  {
    boolean bool;
    if (paramRecyclerListener != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "'listener' arg cannot be null.");
    mRecyclerListeners.add(paramRecyclerListener);
  }
  
  public void animateAppearance(@NonNull ViewHolder paramViewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    paramViewHolder.setIsRecyclable(false);
    if (mItemAnimator.animateAppearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2)) {
      postAnimationRunner();
    }
  }
  
  public void animateDisappearance(@NonNull ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    addAnimatingView(paramViewHolder);
    paramViewHolder.setIsRecyclable(false);
    if (mItemAnimator.animateDisappearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2)) {
      postAnimationRunner();
    }
  }
  
  public void assertInLayoutOrScroll(String paramString)
  {
    if (!isComputingLayout())
    {
      if (paramString == null) {
        throw new IllegalStateException(z2.m(this, z2.t("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
      }
      throw new IllegalStateException(z2.m(this, z2.t(paramString)));
    }
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    if (isComputingLayout())
    {
      if (paramString == null) {
        throw new IllegalStateException(z2.m(this, z2.t("Cannot call this method while RecyclerView is computing a layout or scrolling")));
      }
      throw new IllegalStateException(paramString);
    }
    if (mDispatchScrollCounter > 0) {
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(z2.m(this, z2.t(""))));
    }
  }
  
  public boolean canReuseUpdatedViewHolder(ViewHolder paramViewHolder)
  {
    ItemAnimator localItemAnimator = mItemAnimator;
    boolean bool;
    if ((localItemAnimator != null) && (!localItemAnimator.canReuseUpdatedViewHolder(paramViewHolder, paramViewHolder.getUnmodifiedPayloads()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof LayoutParams)) && (mLayout.checkLayoutParams((LayoutParams)paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clearOldPositions()
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if (!localViewHolder.shouldIgnore()) {
        localViewHolder.clearOldPosition();
      }
    }
    mRecycler.clearOldPositions();
  }
  
  public void clearOnChildAttachStateChangeListeners()
  {
    List localList = mOnChildAttachStateListeners;
    if (localList != null) {
      localList.clear();
    }
  }
  
  public void clearOnScrollListeners()
  {
    List localList = mScrollListeners;
    if (localList != null) {
      localList.clear();
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollHorizontally()) {
      i = mLayout.computeHorizontalScrollExtent(mState);
    }
    return i;
  }
  
  public int computeHorizontalScrollOffset()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollHorizontally()) {
      i = mLayout.computeHorizontalScrollOffset(mState);
    }
    return i;
  }
  
  public int computeHorizontalScrollRange()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollHorizontally()) {
      i = mLayout.computeHorizontalScrollRange(mState);
    }
    return i;
  }
  
  public int computeVerticalScrollExtent()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollVertically()) {
      i = mLayout.computeVerticalScrollExtent(mState);
    }
    return i;
  }
  
  public int computeVerticalScrollOffset()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollVertically()) {
      i = mLayout.computeVerticalScrollOffset(mState);
    }
    return i;
  }
  
  public int computeVerticalScrollRange()
  {
    LayoutManager localLayoutManager = mLayout;
    int i = 0;
    if (localLayoutManager == null) {
      return 0;
    }
    if (localLayoutManager.canScrollVertically()) {
      i = mLayout.computeVerticalScrollRange(mState);
    }
    return i;
  }
  
  public void considerReleasingGlowsOnScroll(int paramInt1, int paramInt2)
  {
    EdgeEffect localEdgeEffect = mLeftGlow;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()) && (paramInt1 > 0))
    {
      mLeftGlow.onRelease();
      bool1 = mLeftGlow.isFinished();
    }
    else
    {
      bool1 = false;
    }
    localEdgeEffect = mRightGlow;
    boolean bool2 = bool1;
    if (localEdgeEffect != null)
    {
      bool2 = bool1;
      if (!localEdgeEffect.isFinished())
      {
        bool2 = bool1;
        if (paramInt1 < 0)
        {
          mRightGlow.onRelease();
          bool2 = bool1 | mRightGlow.isFinished();
        }
      }
    }
    localEdgeEffect = mTopGlow;
    boolean bool1 = bool2;
    if (localEdgeEffect != null)
    {
      bool1 = bool2;
      if (!localEdgeEffect.isFinished())
      {
        bool1 = bool2;
        if (paramInt2 > 0)
        {
          mTopGlow.onRelease();
          bool1 = bool2 | mTopGlow.isFinished();
        }
      }
    }
    localEdgeEffect = mBottomGlow;
    bool2 = bool1;
    if (localEdgeEffect != null)
    {
      bool2 = bool1;
      if (!localEdgeEffect.isFinished())
      {
        bool2 = bool1;
        if (paramInt2 < 0)
        {
          mBottomGlow.onRelease();
          bool2 = bool1 | mBottomGlow.isFinished();
        }
      }
    }
    if (bool2) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public void consumePendingUpdateOperations()
  {
    if ((mFirstLayoutComplete) && (!mDataSetHasChangedAfterLayout))
    {
      if (!mAdapterHelper.hasPendingUpdates()) {
        return;
      }
      if ((mAdapterHelper.hasAnyUpdateTypes(4)) && (!mAdapterHelper.hasAnyUpdateTypes(11)))
      {
        TraceCompat.beginSection("RV PartialInvalidate");
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        mAdapterHelper.preProcess();
        if (!mLayoutWasDefered) {
          if (hasUpdatedView()) {
            dispatchLayout();
          } else {
            mAdapterHelper.consumePostponedUpdates();
          }
        }
        stopInterceptRequestLayout(true);
        onExitLayoutOrScroll();
        TraceCompat.endSection();
      }
      else if (mAdapterHelper.hasPendingUpdates())
      {
        TraceCompat.beginSection("RV FullInvalidate");
        dispatchLayout();
        TraceCompat.endSection();
      }
      return;
    }
    TraceCompat.beginSection("RV FullInvalidate");
    dispatchLayout();
    TraceCompat.endSection();
  }
  
  public void defaultOnMeasure(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    paramInt1 = LayoutManager.chooseSize(paramInt1, getPaddingRight() + i, ViewCompat.getMinimumWidth(this));
    i = getPaddingTop();
    setMeasuredDimension(paramInt1, LayoutManager.chooseSize(paramInt2, getPaddingBottom() + i, ViewCompat.getMinimumHeight(this)));
  }
  
  public void dispatchChildAttached(View paramView)
  {
    ViewHolder localViewHolder = getChildViewHolderInt(paramView);
    onChildAttachedToWindow(paramView);
    Object localObject = mAdapter;
    if ((localObject != null) && (localViewHolder != null)) {
      ((Adapter)localObject).onViewAttachedToWindow(localViewHolder);
    }
    localObject = mOnChildAttachStateListeners;
    if (localObject != null) {
      for (int i = ((List)localObject).size() - 1; i >= 0; i--) {
        ((OnChildAttachStateChangeListener)mOnChildAttachStateListeners.get(i)).onChildViewAttachedToWindow(paramView);
      }
    }
  }
  
  public void dispatchChildDetached(View paramView)
  {
    ViewHolder localViewHolder = getChildViewHolderInt(paramView);
    onChildDetachedFromWindow(paramView);
    Object localObject = mAdapter;
    if ((localObject != null) && (localViewHolder != null)) {
      ((Adapter)localObject).onViewDetachedFromWindow(localViewHolder);
    }
    localObject = mOnChildAttachStateListeners;
    if (localObject != null) {
      for (int i = ((List)localObject).size() - 1; i >= 0; i--) {
        ((OnChildAttachStateChangeListener)mOnChildAttachStateListeners.get(i)).onChildViewDetachedFromWindow(paramView);
      }
    }
  }
  
  public void dispatchLayout()
  {
    if (mAdapter == null)
    {
      Log.w("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (mLayout == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    mState.mIsMeasuring = false;
    int i;
    if ((mLastAutoMeasureSkippedDueToExact) && ((mLastAutoMeasureNonExactMeasuredWidth != getWidth()) || (mLastAutoMeasureNonExactMeasuredHeight != getHeight()))) {
      i = 1;
    } else {
      i = 0;
    }
    mLastAutoMeasureNonExactMeasuredWidth = 0;
    mLastAutoMeasureNonExactMeasuredHeight = 0;
    mLastAutoMeasureSkippedDueToExact = false;
    if (mState.mLayoutStep == 1)
    {
      dispatchLayoutStep1();
      mLayout.setExactMeasureSpecsFrom(this);
      dispatchLayoutStep2();
    }
    else if ((!mAdapterHelper.hasUpdates()) && (i == 0) && (mLayout.getWidth() == getWidth()) && (mLayout.getHeight() == getHeight()))
    {
      mLayout.setExactMeasureSpecsFrom(this);
    }
    else
    {
      mLayout.setExactMeasureSpecsFrom(this);
      dispatchLayoutStep2();
    }
    dispatchLayoutStep3();
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return getScrollingChildHelper().dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public final void dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, @NonNull int[] paramArrayOfInt2)
  {
    getScrollingChildHelper().dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return getScrollingChildHelper().dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  public void dispatchOnScrollStateChanged(int paramInt)
  {
    Object localObject = mLayout;
    if (localObject != null) {
      ((LayoutManager)localObject).onScrollStateChanged(paramInt);
    }
    onScrollStateChanged(paramInt);
    localObject = mScrollListener;
    if (localObject != null) {
      ((OnScrollListener)localObject).onScrollStateChanged(this, paramInt);
    }
    localObject = mScrollListeners;
    if (localObject != null) {
      for (int i = ((List)localObject).size() - 1; i >= 0; i--) {
        ((OnScrollListener)mScrollListeners.get(i)).onScrollStateChanged(this, paramInt);
      }
    }
  }
  
  public void dispatchOnScrolled(int paramInt1, int paramInt2)
  {
    mDispatchScrollCounter += 1;
    int i = getScrollX();
    int j = getScrollY();
    onScrollChanged(i, j, i - paramInt1, j - paramInt2);
    onScrolled(paramInt1, paramInt2);
    Object localObject = mScrollListener;
    if (localObject != null) {
      ((OnScrollListener)localObject).onScrolled(this, paramInt1, paramInt2);
    }
    localObject = mScrollListeners;
    if (localObject != null) {
      for (j = ((List)localObject).size() - 1; j >= 0; j--) {
        ((OnScrollListener)mScrollListeners.get(j)).onScrolled(this, paramInt1, paramInt2);
      }
    }
    mDispatchScrollCounter -= 1;
  }
  
  public void dispatchPendingImportantForAccessibilityChanges()
  {
    for (int i = mPendingAccessibilityImportanceChange.size() - 1; i >= 0; i--)
    {
      ViewHolder localViewHolder = (ViewHolder)mPendingAccessibilityImportanceChange.get(i);
      if ((itemView.getParent() == this) && (!localViewHolder.shouldIgnore()))
      {
        int j = mPendingAccessibilityState;
        if (j != -1)
        {
          ViewCompat.setImportantForAccessibility(itemView, j);
          mPendingAccessibilityState = -1;
        }
      }
    }
    mPendingAccessibilityImportanceChange.clear();
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
  
  public void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  public void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = mItemDecorations.size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((ItemDecoration)mItemDecorations.get(k)).onDrawOver(paramCanvas, this, mState);
    }
    EdgeEffect localEdgeEffect = mLeftGlow;
    int m = 1;
    int n;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()))
    {
      n = paramCanvas.save();
      if (mClipToPadding) {
        k = getPaddingBottom();
      } else {
        k = 0;
      }
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-getHeight() + k, 0.0F);
      localEdgeEffect = mLeftGlow;
      if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
        i = 1;
      } else {
        i = 0;
      }
      paramCanvas.restoreToCount(n);
    }
    else
    {
      i = 0;
    }
    localEdgeEffect = mTopGlow;
    k = i;
    if (localEdgeEffect != null)
    {
      k = i;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        if (mClipToPadding) {
          paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        }
        localEdgeEffect = mTopGlow;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          k = 1;
        } else {
          k = 0;
        }
        k = i | k;
        paramCanvas.restoreToCount(n);
      }
    }
    localEdgeEffect = mRightGlow;
    i = k;
    if (localEdgeEffect != null)
    {
      i = k;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        int i1 = getWidth();
        if (mClipToPadding) {
          i = getPaddingTop();
        } else {
          i = 0;
        }
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(i, -i1);
        localEdgeEffect = mRightGlow;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          i = 1;
        } else {
          i = 0;
        }
        i = k | i;
        paramCanvas.restoreToCount(n);
      }
    }
    localEdgeEffect = mBottomGlow;
    k = i;
    if (localEdgeEffect != null)
    {
      k = i;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        paramCanvas.rotate(180.0F);
        if (mClipToPadding)
        {
          k = -getWidth();
          float f = getPaddingRight() + k;
          k = -getHeight();
          paramCanvas.translate(f, getPaddingBottom() + k);
        }
        else
        {
          paramCanvas.translate(-getWidth(), -getHeight());
        }
        localEdgeEffect = mBottomGlow;
        k = j;
        if (localEdgeEffect != null)
        {
          k = j;
          if (localEdgeEffect.draw(paramCanvas)) {
            k = 1;
          }
        }
        k = i | k;
        paramCanvas.restoreToCount(n);
      }
    }
    if ((k == 0) && (mItemAnimator != null) && (mItemDecorations.size() > 0) && (mItemAnimator.isRunning())) {
      k = m;
    }
    if (k != 0) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void ensureBottomGlow()
  {
    if (mBottomGlow != null) {
      return;
    }
    EdgeEffect localEdgeEffect = mEdgeEffectFactory.createEdgeEffect(this, 3);
    mBottomGlow = localEdgeEffect;
    if (mClipToPadding) {
      localEdgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      localEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }
  
  public void ensureLeftGlow()
  {
    if (mLeftGlow != null) {
      return;
    }
    EdgeEffect localEdgeEffect = mEdgeEffectFactory.createEdgeEffect(this, 0);
    mLeftGlow = localEdgeEffect;
    if (mClipToPadding) {
      localEdgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      localEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }
  
  public void ensureRightGlow()
  {
    if (mRightGlow != null) {
      return;
    }
    EdgeEffect localEdgeEffect = mEdgeEffectFactory.createEdgeEffect(this, 2);
    mRightGlow = localEdgeEffect;
    if (mClipToPadding) {
      localEdgeEffect.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
    } else {
      localEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
    }
  }
  
  public void ensureTopGlow()
  {
    if (mTopGlow != null) {
      return;
    }
    EdgeEffect localEdgeEffect = mEdgeEffectFactory.createEdgeEffect(this, 1);
    mTopGlow = localEdgeEffect;
    if (mClipToPadding) {
      localEdgeEffect.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
    } else {
      localEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
    }
  }
  
  public String exceptionLabel()
  {
    StringBuilder localStringBuilder = z2.t(" ");
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", adapter:");
    localStringBuilder.append(mAdapter);
    localStringBuilder.append(", layout:");
    localStringBuilder.append(mLayout);
    localStringBuilder.append(", context:");
    localStringBuilder.append(getContext());
    return localStringBuilder.toString();
  }
  
  public final void fillRemainingScrollValues(State paramState)
  {
    if (getScrollState() == 2)
    {
      OverScroller localOverScroller = mViewFlinger.mOverScroller;
      mRemainingScrollHorizontal = (localOverScroller.getFinalX() - localOverScroller.getCurrX());
      mRemainingScrollVertical = (localOverScroller.getFinalY() - localOverScroller.getCurrY());
    }
    else
    {
      mRemainingScrollHorizontal = 0;
      mRemainingScrollVertical = 0;
    }
  }
  
  @Nullable
  public View findChildViewUnder(float paramFloat1, float paramFloat2)
  {
    for (int i = mChildHelper.getChildCount() - 1; i >= 0; i--)
    {
      View localView = mChildHelper.getChildAt(i);
      float f1 = localView.getTranslationX();
      float f2 = localView.getTranslationY();
      if ((paramFloat1 >= localView.getLeft() + f1) && (paramFloat1 <= localView.getRight() + f1) && (paramFloat2 >= localView.getTop() + f2) && (paramFloat2 <= localView.getBottom() + f2)) {
        return localView;
      }
    }
    return null;
  }
  
  @Nullable
  public View findContainingItemView(@NonNull View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent()) {
      paramView = (View)localViewParent;
    }
    if (localViewParent != this) {
      paramView = null;
    }
    return paramView;
  }
  
  @Nullable
  public ViewHolder findContainingViewHolder(@NonNull View paramView)
  {
    paramView = findContainingItemView(paramView);
    if (paramView == null) {
      paramView = null;
    } else {
      paramView = getChildViewHolder(paramView);
    }
    return paramView;
  }
  
  @Nullable
  public ViewHolder findViewHolderForAdapterPosition(int paramInt)
  {
    boolean bool = mDataSetHasChangedAfterLayout;
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    int i = mChildHelper.getUnfilteredChildCount();
    int j = 0;
    while (j < i)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      Object localObject2 = localObject1;
      if (localViewHolder != null)
      {
        localObject2 = localObject1;
        if (!localViewHolder.isRemoved())
        {
          localObject2 = localObject1;
          if (getAdapterPositionInRecyclerView(localViewHolder) == paramInt) {
            if (mChildHelper.isHidden(itemView)) {
              localObject2 = localViewHolder;
            } else {
              return localViewHolder;
            }
          }
        }
      }
      j++;
      localObject1 = localObject2;
    }
    return (ViewHolder)localObject1;
  }
  
  public ViewHolder findViewHolderForItemId(long paramLong)
  {
    Adapter localAdapter = mAdapter;
    ViewHolder localViewHolder = null;
    Object localObject1 = null;
    Object localObject2 = localViewHolder;
    if (localAdapter != null) {
      if (!localAdapter.hasStableIds())
      {
        localObject2 = localViewHolder;
      }
      else
      {
        int i = mChildHelper.getUnfilteredChildCount();
        int j = 0;
        for (;;)
        {
          localObject2 = localObject1;
          if (j >= i) {
            break;
          }
          localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
          localObject2 = localObject1;
          if (localViewHolder != null)
          {
            localObject2 = localObject1;
            if (!localViewHolder.isRemoved())
            {
              localObject2 = localObject1;
              if (localViewHolder.getItemId() == paramLong) {
                if (mChildHelper.isHidden(itemView)) {
                  localObject2 = localViewHolder;
                } else {
                  return localViewHolder;
                }
              }
            }
          }
          j++;
          localObject1 = localObject2;
        }
      }
    }
    return (ViewHolder)localObject2;
  }
  
  @Nullable
  public ViewHolder findViewHolderForLayoutPosition(int paramInt)
  {
    return findViewHolderForPosition(paramInt, false);
  }
  
  @Deprecated
  @Nullable
  public ViewHolder findViewHolderForPosition(int paramInt)
  {
    return findViewHolderForPosition(paramInt, false);
  }
  
  @Nullable
  public ViewHolder findViewHolderForPosition(int paramInt, boolean paramBoolean)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    Object localObject1 = null;
    int j = 0;
    while (j < i)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      Object localObject2 = localObject1;
      if (localViewHolder != null)
      {
        localObject2 = localObject1;
        if (!localViewHolder.isRemoved())
        {
          if (paramBoolean)
          {
            if (mPosition != paramInt)
            {
              localObject2 = localObject1;
              break label116;
            }
          }
          else if (localViewHolder.getLayoutPosition() != paramInt)
          {
            localObject2 = localObject1;
            break label116;
          }
          if (mChildHelper.isHidden(itemView)) {
            localObject2 = localViewHolder;
          } else {
            return localViewHolder;
          }
        }
      }
      label116:
      j++;
      localObject1 = localObject2;
    }
    return (ViewHolder)localObject1;
  }
  
  public boolean fling(int paramInt1, int paramInt2)
  {
    Object localObject = mLayout;
    if (localObject == null)
    {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return false;
    }
    if (mLayoutSuppressed) {
      return false;
    }
    int i = ((LayoutManager)localObject).canScrollHorizontally();
    boolean bool1 = mLayout.canScrollVertically();
    int j;
    if (i != 0)
    {
      j = paramInt1;
      if (Math.abs(paramInt1) >= mMinFlingVelocity) {}
    }
    else
    {
      j = 0;
    }
    if (bool1)
    {
      paramInt1 = paramInt2;
      if (Math.abs(paramInt2) >= mMinFlingVelocity) {}
    }
    else
    {
      paramInt1 = 0;
    }
    if ((j == 0) && (paramInt1 == 0)) {
      return false;
    }
    float f1 = j;
    float f2 = paramInt1;
    if (!dispatchNestedPreFling(f1, f2))
    {
      boolean bool2;
      if ((i == 0) && (!bool1)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      dispatchNestedFling(f1, f2, bool2);
      localObject = mOnFlingListener;
      if ((localObject != null) && (((OnFlingListener)localObject).onFling(j, paramInt1))) {
        return true;
      }
      if (bool2)
      {
        paramInt2 = i;
        if (bool1) {
          paramInt2 = i | 0x2;
        }
        startNestedScroll(paramInt2, 1);
        paramInt2 = mMaxFlingVelocity;
        paramInt2 = Math.max(-paramInt2, Math.min(j, paramInt2));
        j = mMaxFlingVelocity;
        paramInt1 = Math.max(-j, Math.min(paramInt1, j));
        mViewFlinger.fling(paramInt2, paramInt1);
        return true;
      }
    }
    return false;
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject = mLayout.onInterceptFocusSearch(paramView, paramInt);
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = mAdapter;
    int i = 1;
    int j;
    if ((localObject != null) && (mLayout != null) && (!isComputingLayout()) && (!mLayoutSuppressed)) {
      j = 1;
    } else {
      j = 0;
    }
    localObject = FocusFinder.getInstance();
    if ((j != 0) && ((paramInt == 2) || (paramInt == 1)))
    {
      if (mLayout.canScrollVertically())
      {
        if (paramInt == 2) {
          k = 130;
        } else {
          k = 33;
        }
        if (((FocusFinder)localObject).findNextFocus(this, paramView, k) == null) {
          m = 1;
        } else {
          m = 0;
        }
        j = m;
        if (FORCE_ABS_FOCUS_SEARCH_DIRECTION)
        {
          paramInt = k;
          j = m;
        }
      }
      else
      {
        j = 0;
      }
      int m = j;
      int k = paramInt;
      if (j == 0)
      {
        m = j;
        k = paramInt;
        if (mLayout.canScrollHorizontally())
        {
          if (mLayout.getLayoutDirection() == 1) {
            j = 1;
          } else {
            j = 0;
          }
          if (paramInt == 2) {
            k = 1;
          } else {
            k = 0;
          }
          if ((j ^ k) != 0) {
            j = 66;
          } else {
            j = 17;
          }
          if (((FocusFinder)localObject).findNextFocus(this, paramView, j) == null) {
            k = i;
          } else {
            k = 0;
          }
          if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
            paramInt = j;
          }
          m = k;
          k = paramInt;
        }
      }
      if (m != 0)
      {
        consumePendingUpdateOperations();
        if (findContainingItemView(paramView) == null) {
          return null;
        }
        startInterceptRequestLayout();
        mLayout.onFocusSearchFailed(paramView, k, mRecycler, mState);
        stopInterceptRequestLayout(false);
      }
      localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, k);
      paramInt = k;
    }
    else
    {
      localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, paramInt);
      if ((localObject == null) && (j != 0))
      {
        consumePendingUpdateOperations();
        if (findContainingItemView(paramView) == null) {
          return null;
        }
        startInterceptRequestLayout();
        localObject = mLayout.onFocusSearchFailed(paramView, paramInt, mRecycler, mState);
        stopInterceptRequestLayout(false);
      }
    }
    if ((localObject != null) && (!((View)localObject).hasFocusable()))
    {
      if (getFocusedChild() == null) {
        return super.focusSearch(paramView, paramInt);
      }
      requestChildOnScreen((View)localObject, null);
      return paramView;
    }
    if (!isPreferredNextFocus(paramView, (View)localObject, paramInt)) {
      localObject = super.focusSearch(paramView, paramInt);
    }
    return (View)localObject;
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      return localLayoutManager.generateDefaultLayoutParams();
    }
    throw new IllegalStateException(z2.m(this, z2.t("RecyclerView has no LayoutManager")));
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      return localLayoutManager.generateLayoutParams(getContext(), paramAttributeSet);
    }
    throw new IllegalStateException(z2.m(this, z2.t("RecyclerView has no LayoutManager")));
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      return localLayoutManager.generateLayoutParams(paramLayoutParams);
    }
    throw new IllegalStateException(z2.m(this, z2.t("RecyclerView has no LayoutManager")));
  }
  
  public CharSequence getAccessibilityClassName()
  {
    return "androidx.recyclerview.widget.RecyclerView";
  }
  
  @Nullable
  public Adapter getAdapter()
  {
    return mAdapter;
  }
  
  public int getAdapterPositionInRecyclerView(ViewHolder paramViewHolder)
  {
    if ((!paramViewHolder.hasAnyOfTheFlags(524)) && (paramViewHolder.isBound())) {
      return mAdapterHelper.applyPendingUpdatesToPosition(mPosition);
    }
    return -1;
  }
  
  public int getBaseline()
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      return localLayoutManager.getBaseline();
    }
    return super.getBaseline();
  }
  
  public long getChangedHolderKey(ViewHolder paramViewHolder)
  {
    long l;
    if (mAdapter.hasStableIds()) {
      l = paramViewHolder.getItemId();
    } else {
      l = mPosition;
    }
    return l;
  }
  
  public int getChildAdapterPosition(@NonNull View paramView)
  {
    paramView = getChildViewHolderInt(paramView);
    int i;
    if (paramView != null) {
      i = paramView.getAbsoluteAdapterPosition();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    ChildDrawingOrderCallback localChildDrawingOrderCallback = mChildDrawingOrderCallback;
    if (localChildDrawingOrderCallback == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return localChildDrawingOrderCallback.onGetChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public long getChildItemId(@NonNull View paramView)
  {
    Adapter localAdapter = mAdapter;
    long l1 = -1L;
    long l2 = l1;
    if (localAdapter != null) {
      if (!localAdapter.hasStableIds())
      {
        l2 = l1;
      }
      else
      {
        paramView = getChildViewHolderInt(paramView);
        l2 = l1;
        if (paramView != null) {
          l2 = paramView.getItemId();
        }
      }
    }
    return l2;
  }
  
  public int getChildLayoutPosition(@NonNull View paramView)
  {
    paramView = getChildViewHolderInt(paramView);
    int i;
    if (paramView != null) {
      i = paramView.getLayoutPosition();
    } else {
      i = -1;
    }
    return i;
  }
  
  @Deprecated
  public int getChildPosition(@NonNull View paramView)
  {
    return getChildAdapterPosition(paramView);
  }
  
  public ViewHolder getChildViewHolder(@NonNull View paramView)
  {
    Object localObject = paramView.getParent();
    if ((localObject != null) && (localObject != this))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("View ");
      ((StringBuilder)localObject).append(paramView);
      ((StringBuilder)localObject).append(" is not a direct child of ");
      ((StringBuilder)localObject).append(this);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return getChildViewHolderInt(paramView);
  }
  
  public boolean getClipToPadding()
  {
    return mClipToPadding;
  }
  
  @Nullable
  public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate()
  {
    return mAccessibilityDelegate;
  }
  
  public void getDecoratedBoundsWithMargins(@NonNull View paramView, @NonNull Rect paramRect)
  {
    getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  @NonNull
  public EdgeEffectFactory getEdgeEffectFactory()
  {
    return mEdgeEffectFactory;
  }
  
  @Nullable
  public ItemAnimator getItemAnimator()
  {
    return mItemAnimator;
  }
  
  public Rect getItemDecorInsetsForChild(View paramView)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (!mInsetsDirty) {
      return mDecorInsets;
    }
    if ((mState.isPreLayout()) && ((localLayoutParams.isItemChanged()) || (localLayoutParams.isViewInvalid()))) {
      return mDecorInsets;
    }
    Rect localRect1 = mDecorInsets;
    localRect1.set(0, 0, 0, 0);
    int i = mItemDecorations.size();
    for (int j = 0; j < i; j++)
    {
      mTempRect.set(0, 0, 0, 0);
      ((ItemDecoration)mItemDecorations.get(j)).getItemOffsets(mTempRect, paramView, this, mState);
      int k = left;
      Rect localRect2 = mTempRect;
      left = (k + left);
      top += top;
      right += right;
      bottom += bottom;
    }
    mInsetsDirty = false;
    return localRect1;
  }
  
  @NonNull
  public ItemDecoration getItemDecorationAt(int paramInt)
  {
    int i = getItemDecorationCount();
    if ((paramInt >= 0) && (paramInt < i)) {
      return (ItemDecoration)mItemDecorations.get(paramInt);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is an invalid index for size ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public int getItemDecorationCount()
  {
    return mItemDecorations.size();
  }
  
  @Nullable
  public LayoutManager getLayoutManager()
  {
    return mLayout;
  }
  
  public int getMaxFlingVelocity()
  {
    return mMaxFlingVelocity;
  }
  
  public int getMinFlingVelocity()
  {
    return mMinFlingVelocity;
  }
  
  long getNanoTime()
  {
    if (ALLOW_THREAD_GAP_WORK) {
      return System.nanoTime();
    }
    return 0L;
  }
  
  @Nullable
  public OnFlingListener getOnFlingListener()
  {
    return mOnFlingListener;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return mPreserveFocusAfterLayout;
  }
  
  @NonNull
  public RecycledViewPool getRecycledViewPool()
  {
    return mRecycler.getRecycledViewPool();
  }
  
  public int getScrollState()
  {
    return mScrollState;
  }
  
  public boolean hasFixedSize()
  {
    return mHasFixedSize;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().hasNestedScrollingParent();
  }
  
  public boolean hasNestedScrollingParent(int paramInt)
  {
    return getScrollingChildHelper().hasNestedScrollingParent(paramInt);
  }
  
  public boolean hasPendingAdapterUpdates()
  {
    boolean bool;
    if ((mFirstLayoutComplete) && (!mDataSetHasChangedAfterLayout) && (!mAdapterHelper.hasPendingUpdates())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void initAdapterManager()
  {
    mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback()
    {
      public void dispatchUpdate(AdapterHelper.UpdateOp paramAnonymousUpdateOp)
      {
        int i = cmd;
        RecyclerView localRecyclerView;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 4)
            {
              if (i == 8)
              {
                localRecyclerView = RecyclerView.this;
                mLayout.onItemsMoved(localRecyclerView, positionStart, itemCount, 1);
              }
            }
            else
            {
              localRecyclerView = RecyclerView.this;
              mLayout.onItemsUpdated(localRecyclerView, positionStart, itemCount, payload);
            }
          }
          else
          {
            localRecyclerView = RecyclerView.this;
            mLayout.onItemsRemoved(localRecyclerView, positionStart, itemCount);
          }
        }
        else
        {
          localRecyclerView = RecyclerView.this;
          mLayout.onItemsAdded(localRecyclerView, positionStart, itemCount);
        }
      }
      
      public RecyclerView.ViewHolder findViewHolder(int paramAnonymousInt)
      {
        RecyclerView.ViewHolder localViewHolder = findViewHolderForPosition(paramAnonymousInt, true);
        if (localViewHolder == null) {
          return null;
        }
        if (mChildHelper.isHidden(itemView)) {
          return null;
        }
        return localViewHolder;
      }
      
      public void markViewHoldersUpdated(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
      {
        viewRangeUpdate(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousObject);
        mItemsChanged = true;
      }
      
      public void offsetPositionsForAdd(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        offsetPositionRecordsForInsert(paramAnonymousInt1, paramAnonymousInt2);
        mItemsAddedOrRemoved = true;
      }
      
      public void offsetPositionsForMove(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        offsetPositionRecordsForMove(paramAnonymousInt1, paramAnonymousInt2);
        mItemsAddedOrRemoved = true;
      }
      
      public void offsetPositionsForRemovingInvisible(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        offsetPositionRecordsForRemove(paramAnonymousInt1, paramAnonymousInt2, true);
        Object localObject = RecyclerView.this;
        mItemsAddedOrRemoved = true;
        localObject = mState;
        mDeletedInvisibleItemCountSincePreviousLayout += paramAnonymousInt2;
      }
      
      public void offsetPositionsForRemovingLaidOutOrNewView(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        offsetPositionRecordsForRemove(paramAnonymousInt1, paramAnonymousInt2, false);
        mItemsAddedOrRemoved = true;
      }
      
      public void onDispatchFirstPass(AdapterHelper.UpdateOp paramAnonymousUpdateOp)
      {
        dispatchUpdate(paramAnonymousUpdateOp);
      }
      
      public void onDispatchSecondPass(AdapterHelper.UpdateOp paramAnonymousUpdateOp)
      {
        dispatchUpdate(paramAnonymousUpdateOp);
      }
    });
  }
  
  @VisibleForTesting
  public void initFastScroller(StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2)
  {
    if ((paramStateListDrawable1 != null) && (paramDrawable1 != null) && (paramStateListDrawable2 != null) && (paramDrawable2 != null))
    {
      Resources localResources = getContext().getResources();
      new FastScroller(this, paramStateListDrawable1, paramDrawable1, paramStateListDrawable2, paramDrawable2, localResources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), localResources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), localResources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
      return;
    }
    throw new IllegalArgumentException(z2.m(this, z2.t("Trying to set fast scroller without both required drawables.")));
  }
  
  public void invalidateGlows()
  {
    mBottomGlow = null;
    mTopGlow = null;
    mRightGlow = null;
    mLeftGlow = null;
  }
  
  public void invalidateItemDecorations()
  {
    if (mItemDecorations.size() == 0) {
      return;
    }
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      localLayoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
    }
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  public boolean isAccessibilityEnabled()
  {
    AccessibilityManager localAccessibilityManager = mAccessibilityManager;
    boolean bool;
    if ((localAccessibilityManager != null) && (localAccessibilityManager.isEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAnimating()
  {
    ItemAnimator localItemAnimator = mItemAnimator;
    boolean bool;
    if ((localItemAnimator != null) && (localItemAnimator.isRunning())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAttachedToWindow()
  {
    return mIsAttached;
  }
  
  public boolean isComputingLayout()
  {
    boolean bool;
    if (mLayoutOrScrollCounter > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public boolean isLayoutFrozen()
  {
    return isLayoutSuppressed();
  }
  
  public final boolean isLayoutSuppressed()
  {
    return mLayoutSuppressed;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelper().isNestedScrollingEnabled();
  }
  
  public void jumpToPositionForSmoothScroller(int paramInt)
  {
    if (mLayout == null) {
      return;
    }
    setScrollState(2);
    mLayout.scrollToPosition(paramInt);
    awakenScrollBars();
  }
  
  public void markItemDecorInsetsDirty()
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++) {
      mChildHelper.getUnfilteredChildAt(j).getLayoutParams()).mInsetsDirty = true;
    }
    mRecycler.markItemDecorInsetsDirty();
  }
  
  public void markKnownViewsInvalid()
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if ((localViewHolder != null) && (!localViewHolder.shouldIgnore())) {
        localViewHolder.addFlags(6);
      }
    }
    markItemDecorInsetsDirty();
    mRecycler.markKnownViewsInvalid();
  }
  
  public void nestedScrollBy(int paramInt1, int paramInt2)
  {
    nestedScrollByInternal(paramInt1, paramInt2, null, 1);
  }
  
  public void offsetChildrenHorizontal(@Px int paramInt)
  {
    int i = mChildHelper.getChildCount();
    for (int j = 0; j < i; j++) {
      mChildHelper.getChildAt(j).offsetLeftAndRight(paramInt);
    }
  }
  
  public void offsetChildrenVertical(@Px int paramInt)
  {
    int i = mChildHelper.getChildCount();
    for (int j = 0; j < i; j++) {
      mChildHelper.getChildAt(j).offsetTopAndBottom(paramInt);
    }
  }
  
  public void offsetPositionRecordsForInsert(int paramInt1, int paramInt2)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if ((localViewHolder != null) && (!localViewHolder.shouldIgnore()) && (mPosition >= paramInt1))
      {
        localViewHolder.offsetPosition(paramInt2, false);
        mState.mStructureChanged = true;
      }
    }
    mRecycler.offsetPositionRecordsForInsert(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void offsetPositionRecordsForMove(int paramInt1, int paramInt2)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    int j;
    int k;
    int m;
    if (paramInt1 < paramInt2)
    {
      j = -1;
      k = paramInt1;
      m = paramInt2;
    }
    else
    {
      m = paramInt1;
      k = paramInt2;
      j = 1;
    }
    for (int n = 0; n < i; n++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(n));
      if (localViewHolder != null)
      {
        int i1 = mPosition;
        if ((i1 >= k) && (i1 <= m))
        {
          if (i1 == paramInt1) {
            localViewHolder.offsetPosition(paramInt2 - paramInt1, false);
          } else {
            localViewHolder.offsetPosition(j, false);
          }
          mState.mStructureChanged = true;
        }
      }
    }
    mRecycler.offsetPositionRecordsForMove(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if ((localViewHolder != null) && (!localViewHolder.shouldIgnore()))
      {
        int k = mPosition;
        if (k >= paramInt1 + paramInt2)
        {
          localViewHolder.offsetPosition(-paramInt2, paramBoolean);
          mState.mStructureChanged = true;
        }
        else if (k >= paramInt1)
        {
          localViewHolder.flagRemovedAndOffsetPosition(paramInt1 - 1, -paramInt2, paramBoolean);
          mState.mStructureChanged = true;
        }
      }
    }
    mRecycler.offsetPositionRecordsForRemove(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mLayoutOrScrollCounter = 0;
    boolean bool = true;
    mIsAttached = true;
    if ((!mFirstLayoutComplete) || (isLayoutRequested())) {
      bool = false;
    }
    mFirstLayoutComplete = bool;
    Object localObject1 = mLayout;
    if (localObject1 != null) {
      ((LayoutManager)localObject1).dispatchAttachedToWindow(this);
    }
    mPostedAnimatorRunner = false;
    if (ALLOW_THREAD_GAP_WORK)
    {
      localObject1 = GapWorker.sGapWorker;
      Object localObject2 = (GapWorker)((ThreadLocal)localObject1).get();
      mGapWorker = ((GapWorker)localObject2);
      if (localObject2 == null)
      {
        mGapWorker = new GapWorker();
        localObject2 = ViewCompat.getDisplay(this);
        float f1 = 60.0F;
        float f2 = f1;
        if (!isInEditMode())
        {
          f2 = f1;
          if (localObject2 != null)
          {
            float f3 = ((Display)localObject2).getRefreshRate();
            f2 = f1;
            if (f3 >= 30.0F) {
              f2 = f3;
            }
          }
        }
        localObject2 = mGapWorker;
        mFrameIntervalNs = ((1.0E9F / f2));
        ((ThreadLocal)localObject1).set(localObject2);
      }
      mGapWorker.add(this);
    }
  }
  
  public void onChildAttachedToWindow(@NonNull View paramView) {}
  
  public void onChildDetachedFromWindow(@NonNull View paramView) {}
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = mItemAnimator;
    if (localObject != null) {
      ((ItemAnimator)localObject).endAnimations();
    }
    stopScroll();
    mIsAttached = false;
    localObject = mLayout;
    if (localObject != null) {
      ((LayoutManager)localObject).dispatchDetachedFromWindow(this, mRecycler);
    }
    mPendingAccessibilityImportanceChange.clear();
    removeCallbacks(mItemAnimatorRunner);
    mViewInfoStore.onDetach();
    if (ALLOW_THREAD_GAP_WORK)
    {
      localObject = mGapWorker;
      if (localObject != null)
      {
        ((GapWorker)localObject).remove(this);
        mGapWorker = null;
      }
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = mItemDecorations.size();
    for (int j = 0; j < i; j++) {
      ((ItemDecoration)mItemDecorations.get(j)).onDraw(paramCanvas, this, mState);
    }
  }
  
  public void onEnterLayoutOrScroll()
  {
    mLayoutOrScrollCounter += 1;
  }
  
  public void onExitLayoutOrScroll()
  {
    onExitLayoutOrScroll(true);
  }
  
  public void onExitLayoutOrScroll(boolean paramBoolean)
  {
    int i = mLayoutOrScrollCounter - 1;
    mLayoutOrScrollCounter = i;
    if (i < 1)
    {
      mLayoutOrScrollCounter = 0;
      if (paramBoolean)
      {
        dispatchContentChangedIfNecessary();
        dispatchPendingImportantForAccessibilityChanges();
      }
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (mLayout == null) {
      return false;
    }
    if (mLayoutSuppressed) {
      return false;
    }
    if (paramMotionEvent.getAction() == 8)
    {
      float f1;
      float f2;
      if ((paramMotionEvent.getSource() & 0x2) != 0)
      {
        if (mLayout.canScrollVertically()) {
          f1 = -paramMotionEvent.getAxisValue(9);
        } else {
          f1 = 0.0F;
        }
        f2 = f1;
        if (mLayout.canScrollHorizontally())
        {
          f2 = paramMotionEvent.getAxisValue(10);
          break label145;
        }
      }
      for (;;)
      {
        float f3 = 0.0F;
        f1 = f2;
        f2 = f3;
        break label145;
        if ((paramMotionEvent.getSource() & 0x400000) == 0) {
          break label141;
        }
        f2 = paramMotionEvent.getAxisValue(26);
        if (!mLayout.canScrollVertically()) {
          break;
        }
        f2 = -f2;
      }
      if (mLayout.canScrollHorizontally())
      {
        f1 = 0.0F;
      }
      else
      {
        label141:
        f1 = 0.0F;
        f2 = f1;
      }
      label145:
      if ((f1 != 0.0F) || (f2 != 0.0F)) {
        nestedScrollByInternal((int)(f2 * mScaledHorizontalScrollFactor), (int)(f1 * mScaledVerticalScrollFactor), paramMotionEvent, 1);
      }
    }
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = mLayoutSuppressed;
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    mInterceptingOnItemTouchListener = null;
    if (findInterceptingOnItemTouchListener(paramMotionEvent))
    {
      cancelScroll();
      return true;
    }
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager == null) {
      return false;
    }
    boolean bool3 = localLayoutManager.canScrollHorizontally();
    bool1 = mLayout.canScrollVertically();
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
    mVelocityTracker.addMovement(paramMotionEvent);
    int j = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getActionIndex();
    int i;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 5)
            {
              if (j == 6) {
                onPointerUp(paramMotionEvent);
              }
            }
            else
            {
              mScrollPointerId = paramMotionEvent.getPointerId(k);
              i = (int)(paramMotionEvent.getX(k) + 0.5F);
              mLastTouchX = i;
              mInitialTouchX = i;
              k = (int)(paramMotionEvent.getY(k) + 0.5F);
              mLastTouchY = k;
              mInitialTouchY = k;
            }
          }
          else {
            cancelScroll();
          }
        }
        else
        {
          j = paramMotionEvent.findPointerIndex(mScrollPointerId);
          if (j < 0)
          {
            paramMotionEvent = z2.t("Error processing scroll; pointer index for id ");
            paramMotionEvent.append(mScrollPointerId);
            paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
            Log.e("RecyclerView", paramMotionEvent.toString());
            return false;
          }
          k = (int)(paramMotionEvent.getX(j) + 0.5F);
          j = (int)(paramMotionEvent.getY(j) + 0.5F);
          if (mScrollState != 1)
          {
            int m = mInitialTouchX;
            int n = mInitialTouchY;
            if ((i != 0) && (Math.abs(k - m) > mTouchSlop))
            {
              mLastTouchX = k;
              k = 1;
            }
            else
            {
              k = 0;
            }
            i = k;
            if (bool1)
            {
              i = k;
              if (Math.abs(j - n) > mTouchSlop)
              {
                mLastTouchY = j;
                i = 1;
              }
            }
            if (i != 0) {
              setScrollState(1);
            }
          }
        }
      }
      else
      {
        mVelocityTracker.clear();
        stopNestedScroll(0);
      }
    }
    else
    {
      if (mIgnoreMotionEventTillDown) {
        mIgnoreMotionEventTillDown = false;
      }
      mScrollPointerId = paramMotionEvent.getPointerId(0);
      k = (int)(paramMotionEvent.getX() + 0.5F);
      mLastTouchX = k;
      mInitialTouchX = k;
      k = (int)(paramMotionEvent.getY() + 0.5F);
      mLastTouchY = k;
      mInitialTouchY = k;
      if (mScrollState == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        stopNestedScroll(1);
      }
      paramMotionEvent = mNestedOffsets;
      paramMotionEvent[1] = 0;
      paramMotionEvent[0] = 0;
      k = i;
      if (bool1) {
        k = i | 0x2;
      }
      startNestedScroll(k, 0);
    }
    if (mScrollState == 1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    TraceCompat.beginSection("RV OnLayout");
    dispatchLayout();
    TraceCompat.endSection();
    mFirstLayoutComplete = true;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = mLayout;
    if (localObject == null)
    {
      defaultOnMeasure(paramInt1, paramInt2);
      return;
    }
    boolean bool1 = ((LayoutManager)localObject).isAutoMeasureEnabled();
    boolean bool2 = false;
    if (bool1)
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = View.MeasureSpec.getMode(paramInt2);
      mLayout.onMeasure(mRecycler, mState, paramInt1, paramInt2);
      bool1 = bool2;
      if (i == 1073741824)
      {
        bool1 = bool2;
        if (j == 1073741824) {
          bool1 = true;
        }
      }
      mLastAutoMeasureSkippedDueToExact = bool1;
      if ((!bool1) && (mAdapter != null))
      {
        if (mState.mLayoutStep == 1) {
          dispatchLayoutStep1();
        }
        mLayout.setMeasureSpecs(paramInt1, paramInt2);
        mState.mIsMeasuring = true;
        dispatchLayoutStep2();
        mLayout.setMeasuredDimensionFromChildren(paramInt1, paramInt2);
        if (mLayout.shouldMeasureTwice())
        {
          mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
          mState.mIsMeasuring = true;
          dispatchLayoutStep2();
          mLayout.setMeasuredDimensionFromChildren(paramInt1, paramInt2);
        }
        mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
        mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
      }
    }
    else
    {
      if (mHasFixedSize)
      {
        mLayout.onMeasure(mRecycler, mState, paramInt1, paramInt2);
        return;
      }
      if (mAdapterUpdateDuringMeasure)
      {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        onExitLayoutOrScroll();
        localObject = mState;
        if (mRunPredictiveAnimations)
        {
          mInPreLayout = true;
        }
        else
        {
          mAdapterHelper.consumeUpdatesInOnePass();
          mState.mInPreLayout = false;
        }
        mAdapterUpdateDuringMeasure = false;
        stopInterceptRequestLayout(false);
      }
      else if (mState.mRunPredictiveAnimations)
      {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
      }
      localObject = mAdapter;
      if (localObject != null) {
        mState.mItemCount = ((Adapter)localObject).getItemCount();
      } else {
        mState.mItemCount = 0;
      }
      startInterceptRequestLayout();
      mLayout.onMeasure(mRecycler, mState, paramInt1, paramInt2);
      stopInterceptRequestLayout(false);
      mState.mInPreLayout = false;
    }
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    if (isComputingLayout()) {
      return false;
    }
    return super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    mPendingSavedState = paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    Object localObject = mPendingSavedState;
    if (localObject != null)
    {
      localSavedState.copyFrom((SavedState)localObject);
    }
    else
    {
      localObject = mLayout;
      if (localObject != null) {
        mLayoutState = ((LayoutManager)localObject).onSaveInstanceState();
      } else {
        mLayoutState = null;
      }
    }
    return localSavedState;
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  public void onScrolled(@Px int paramInt1, @Px int paramInt2) {}
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      invalidateGlows();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = mLayoutSuppressed;
    int i = 0;
    if ((!bool) && (!mIgnoreMotionEventTillDown))
    {
      if (dispatchToOnItemTouchListeners(paramMotionEvent))
      {
        cancelScroll();
        return true;
      }
      Object localObject = mLayout;
      if (localObject == null) {
        return false;
      }
      int j = ((LayoutManager)localObject).canScrollHorizontally();
      bool = mLayout.canScrollVertically();
      if (mVelocityTracker == null) {
        mVelocityTracker = VelocityTracker.obtain();
      }
      int k = paramMotionEvent.getActionMasked();
      int m = paramMotionEvent.getActionIndex();
      if (k == 0)
      {
        localObject = mNestedOffsets;
        localObject[1] = 0;
        localObject[0] = 0;
      }
      localObject = MotionEvent.obtain(paramMotionEvent);
      int[] arrayOfInt1 = mNestedOffsets;
      ((MotionEvent)localObject).offsetLocation(arrayOfInt1[0], arrayOfInt1[1]);
      int n;
      if (k != 0)
      {
        if (k != 1)
        {
          if (k != 2)
          {
            if (k != 3)
            {
              if (k != 5)
              {
                if (k != 6)
                {
                  n = i;
                }
                else
                {
                  onPointerUp(paramMotionEvent);
                  n = i;
                }
              }
              else
              {
                mScrollPointerId = paramMotionEvent.getPointerId(m);
                k = (int)(paramMotionEvent.getX(m) + 0.5F);
                mLastTouchX = k;
                mInitialTouchX = k;
                m = (int)(paramMotionEvent.getY(m) + 0.5F);
                mLastTouchY = m;
                mInitialTouchY = m;
                n = i;
              }
            }
            else
            {
              cancelScroll();
              n = i;
            }
          }
          else
          {
            m = paramMotionEvent.findPointerIndex(mScrollPointerId);
            if (m < 0)
            {
              paramMotionEvent = z2.t("Error processing scroll; pointer index for id ");
              paramMotionEvent.append(mScrollPointerId);
              paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
              Log.e("RecyclerView", paramMotionEvent.toString());
              return false;
            }
            int i1 = (int)(paramMotionEvent.getX(m) + 0.5F);
            int i2 = (int)(paramMotionEvent.getY(m) + 0.5F);
            m = mLastTouchX - i1;
            n = mLastTouchY - i2;
            k = m;
            int i3 = n;
            label442:
            int i5;
            if (mScrollState != 1)
            {
              i4 = m;
              if (j != 0)
              {
                if (m > 0) {
                  m = Math.max(0, m - mTouchSlop);
                } else {
                  m = Math.min(0, m + mTouchSlop);
                }
                i4 = m;
                if (m != 0)
                {
                  k = 1;
                  break label442;
                }
              }
              k = 0;
              m = i4;
              i4 = n;
              i5 = k;
              if (bool)
              {
                if (n > 0) {
                  i3 = Math.max(0, n - mTouchSlop);
                } else {
                  i3 = Math.min(0, n + mTouchSlop);
                }
                i4 = i3;
                i5 = k;
                if (i3 != 0)
                {
                  i5 = 1;
                  i4 = i3;
                }
              }
              k = m;
              i3 = i4;
              if (i5 != 0)
              {
                setScrollState(1);
                i3 = i4;
                k = m;
              }
            }
            int i4 = k;
            n = i;
            if (mScrollState == 1)
            {
              arrayOfInt1 = mReusableIntPair;
              arrayOfInt1[0] = 0;
              arrayOfInt1[1] = 0;
              if (j != 0) {
                n = i4;
              } else {
                n = 0;
              }
              if (bool) {
                i5 = i3;
              } else {
                i5 = 0;
              }
              k = i4;
              m = i3;
              if (dispatchNestedPreScroll(n, i5, arrayOfInt1, mScrollOffset, 0))
              {
                arrayOfInt1 = mReusableIntPair;
                k = i4 - arrayOfInt1[0];
                m = i3 - arrayOfInt1[1];
                int[] arrayOfInt2 = mNestedOffsets;
                i4 = arrayOfInt2[0];
                arrayOfInt1 = mScrollOffset;
                arrayOfInt2[0] = (i4 + arrayOfInt1[0]);
                arrayOfInt2[1] += arrayOfInt1[1];
                getParent().requestDisallowInterceptTouchEvent(true);
              }
              arrayOfInt1 = mScrollOffset;
              mLastTouchX = (i1 - arrayOfInt1[0]);
              mLastTouchY = (i2 - arrayOfInt1[1]);
              if (j != 0) {
                i4 = k;
              } else {
                i4 = 0;
              }
              if (bool) {
                i3 = m;
              } else {
                i3 = 0;
              }
              if (scrollByInternal(i4, i3, paramMotionEvent, 0)) {
                getParent().requestDisallowInterceptTouchEvent(true);
              }
              paramMotionEvent = mGapWorker;
              n = i;
              if (paramMotionEvent != null) {
                if (k == 0)
                {
                  n = i;
                  if (m == 0) {}
                }
                else
                {
                  paramMotionEvent.postFromTraversal(this, k, m);
                  n = i;
                }
              }
            }
          }
        }
        else
        {
          mVelocityTracker.addMovement((MotionEvent)localObject);
          mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocity);
          float f1;
          if (j != 0) {
            f1 = -mVelocityTracker.getXVelocity(mScrollPointerId);
          } else {
            f1 = 0.0F;
          }
          float f2;
          if (bool) {
            f2 = -mVelocityTracker.getYVelocity(mScrollPointerId);
          } else {
            f2 = 0.0F;
          }
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!fling((int)f1, (int)f2))) {
            setScrollState(0);
          }
          resetScroll();
          n = 1;
        }
      }
      else
      {
        mScrollPointerId = paramMotionEvent.getPointerId(0);
        m = (int)(paramMotionEvent.getX() + 0.5F);
        mLastTouchX = m;
        mInitialTouchX = m;
        m = (int)(paramMotionEvent.getY() + 0.5F);
        mLastTouchY = m;
        mInitialTouchY = m;
        m = j;
        if (bool) {
          m = j | 0x2;
        }
        startNestedScroll(m, 0);
        n = i;
      }
      if (n == 0) {
        mVelocityTracker.addMovement((MotionEvent)localObject);
      }
      ((MotionEvent)localObject).recycle();
      return true;
    }
    return false;
  }
  
  public void postAnimationRunner()
  {
    if ((!mPostedAnimatorRunner) && (mIsAttached))
    {
      ViewCompat.postOnAnimation(this, mItemAnimatorRunner);
      mPostedAnimatorRunner = true;
    }
  }
  
  public void processDataSetCompletelyChanged(boolean paramBoolean)
  {
    mDispatchItemsChangedEvent = (paramBoolean | mDispatchItemsChangedEvent);
    mDataSetHasChangedAfterLayout = true;
    markKnownViewsInvalid();
  }
  
  public void recordAnimationInfoIfBouncedHiddenView(ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    paramViewHolder.setFlags(0, 8192);
    if ((mState.mTrackOldChangeHolders) && (paramViewHolder.isUpdated()) && (!paramViewHolder.isRemoved()) && (!paramViewHolder.shouldIgnore()))
    {
      long l = getChangedHolderKey(paramViewHolder);
      mViewInfoStore.addToOldChangeHolders(l, paramViewHolder);
    }
    mViewInfoStore.addToPreLayout(paramViewHolder, paramItemHolderInfo);
  }
  
  public void removeAndRecycleViews()
  {
    Object localObject = mItemAnimator;
    if (localObject != null) {
      ((ItemAnimator)localObject).endAnimations();
    }
    localObject = mLayout;
    if (localObject != null)
    {
      ((LayoutManager)localObject).removeAndRecycleAllViews(mRecycler);
      mLayout.removeAndRecycleScrapInt(mRecycler);
    }
    mRecycler.clear();
  }
  
  public boolean removeAnimatingView(View paramView)
  {
    startInterceptRequestLayout();
    boolean bool = mChildHelper.removeViewIfHidden(paramView);
    if (bool)
    {
      paramView = getChildViewHolderInt(paramView);
      mRecycler.unscrapView(paramView);
      mRecycler.recycleViewHolderInternal(paramView);
    }
    stopInterceptRequestLayout(bool ^ true);
    return bool;
  }
  
  public void removeDetachedView(View paramView, boolean paramBoolean)
  {
    ViewHolder localViewHolder = getChildViewHolderInt(paramView);
    if (localViewHolder != null) {
      if (localViewHolder.isTmpDetached())
      {
        localViewHolder.clearTmpDetachFlag();
      }
      else if (!localViewHolder.shouldIgnore())
      {
        paramView = new StringBuilder();
        paramView.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
        paramView.append(localViewHolder);
        throw new IllegalArgumentException(z2.m(this, paramView));
      }
    }
    paramView.clearAnimation();
    dispatchChildDetached(paramView);
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void removeItemDecoration(@NonNull ItemDecoration paramItemDecoration)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager != null) {
      localLayoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
    }
    mItemDecorations.remove(paramItemDecoration);
    if (mItemDecorations.isEmpty())
    {
      boolean bool;
      if (getOverScrollMode() == 2) {
        bool = true;
      } else {
        bool = false;
      }
      setWillNotDraw(bool);
    }
    markItemDecorInsetsDirty();
    requestLayout();
  }
  
  public void removeItemDecorationAt(int paramInt)
  {
    int i = getItemDecorationCount();
    if ((paramInt >= 0) && (paramInt < i))
    {
      removeItemDecoration(getItemDecorationAt(paramInt));
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is an invalid index for size ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener paramOnChildAttachStateChangeListener)
  {
    List localList = mOnChildAttachStateListeners;
    if (localList == null) {
      return;
    }
    localList.remove(paramOnChildAttachStateChangeListener);
  }
  
  public void removeOnItemTouchListener(@NonNull OnItemTouchListener paramOnItemTouchListener)
  {
    mOnItemTouchListeners.remove(paramOnItemTouchListener);
    if (mInterceptingOnItemTouchListener == paramOnItemTouchListener) {
      mInterceptingOnItemTouchListener = null;
    }
  }
  
  public void removeOnScrollListener(@NonNull OnScrollListener paramOnScrollListener)
  {
    List localList = mScrollListeners;
    if (localList != null) {
      localList.remove(paramOnScrollListener);
    }
  }
  
  public void removeRecyclerListener(@NonNull RecyclerListener paramRecyclerListener)
  {
    mRecyclerListeners.remove(paramRecyclerListener);
  }
  
  public void repositionShadowingViews()
  {
    int i = mChildHelper.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = mChildHelper.getChildAt(j);
      Object localObject = getChildViewHolder(localView);
      if (localObject != null)
      {
        localObject = mShadowingHolder;
        if (localObject != null)
        {
          localObject = itemView;
          int k = localView.getLeft();
          int m = localView.getTop();
          if ((k != ((View)localObject).getLeft()) || (m != ((View)localObject).getTop())) {
            ((View)localObject).layout(k, m, ((View)localObject).getWidth() + k, ((View)localObject).getHeight() + m);
          }
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if ((!mLayout.onRequestChildFocus(this, mState, paramView1, paramView2)) && (paramView2 != null)) {
      requestChildOnScreen(paramView1, paramView2);
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return mLayout.requestChildRectangleOnScreen(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i = mOnItemTouchListeners.size();
    for (int j = 0; j < i; j++) {
      ((OnItemTouchListener)mOnItemTouchListeners.get(j)).onRequestDisallowInterceptTouchEvent(paramBoolean);
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((mInterceptRequestLayoutDepth == 0) && (!mLayoutSuppressed)) {
      super.requestLayout();
    } else {
      mLayoutWasDefered = true;
    }
  }
  
  public void saveOldPositions()
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewHolder localViewHolder = getChildViewHolderInt(mChildHelper.getUnfilteredChildAt(j));
      if (!localViewHolder.shouldIgnore()) {
        localViewHolder.saveOldPosition();
      }
    }
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager == null)
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (mLayoutSuppressed) {
      return;
    }
    boolean bool1 = localLayoutManager.canScrollHorizontally();
    boolean bool2 = mLayout.canScrollVertically();
    if ((bool1) || (bool2))
    {
      if (!bool1) {
        paramInt1 = 0;
      }
      if (!bool2) {
        paramInt2 = 0;
      }
      scrollByInternal(paramInt1, paramInt2, null, 0);
    }
  }
  
  public boolean scrollByInternal(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3)
  {
    consumePendingUpdateOperations();
    Object localObject = mAdapter;
    boolean bool1 = true;
    int i;
    int j;
    int k;
    int m;
    if (localObject != null)
    {
      localObject = mReusableIntPair;
      localObject[0] = 0;
      localObject[1] = 0;
      scrollStep(paramInt1, paramInt2, (int[])localObject);
      localObject = mReusableIntPair;
      i = localObject[0];
      j = localObject[1];
      k = j;
      m = i;
      i = paramInt1 - i;
      j = paramInt2 - j;
    }
    else
    {
      n = 0;
      k = n;
      m = k;
      j = m;
      i = m;
      m = k;
      k = n;
    }
    if (!mItemDecorations.isEmpty()) {
      invalidate();
    }
    localObject = mReusableIntPair;
    localObject[0] = 0;
    localObject[1] = 0;
    dispatchNestedScroll(m, k, i, j, mScrollOffset, paramInt3, (int[])localObject);
    localObject = mReusableIntPair;
    int n = localObject[0];
    int i1 = localObject[1];
    if ((n == 0) && (i1 == 0)) {
      paramInt3 = 0;
    } else {
      paramInt3 = 1;
    }
    int i2 = mLastTouchX;
    localObject = mScrollOffset;
    int i3 = localObject[0];
    mLastTouchX = (i2 - i3);
    int i4 = mLastTouchY;
    i2 = localObject[1];
    mLastTouchY = (i4 - i2);
    localObject = mNestedOffsets;
    localObject[0] += i3;
    localObject[1] += i2;
    if (getOverScrollMode() != 2)
    {
      if ((paramMotionEvent != null) && (!MotionEventCompat.isFromSource(paramMotionEvent, 8194))) {
        pullGlows(paramMotionEvent.getX(), i - n, paramMotionEvent.getY(), j - i1);
      }
      considerReleasingGlowsOnScroll(paramInt1, paramInt2);
    }
    if ((m != 0) || (k != 0)) {
      dispatchOnScrolled(m, k);
    }
    if (!awakenScrollBars()) {
      invalidate();
    }
    boolean bool2 = bool1;
    if (paramInt3 == 0)
    {
      bool2 = bool1;
      if (m == 0) {
        if (k != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
    }
    return bool2;
  }
  
  public void scrollStep(int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt)
  {
    startInterceptRequestLayout();
    onEnterLayoutOrScroll();
    TraceCompat.beginSection("RV Scroll");
    fillRemainingScrollValues(mState);
    if (paramInt1 != 0) {
      paramInt1 = mLayout.scrollHorizontallyBy(paramInt1, mRecycler, mState);
    } else {
      paramInt1 = 0;
    }
    if (paramInt2 != 0) {
      paramInt2 = mLayout.scrollVerticallyBy(paramInt2, mRecycler, mState);
    } else {
      paramInt2 = 0;
    }
    TraceCompat.endSection();
    repositionShadowingViews();
    onExitLayoutOrScroll();
    stopInterceptRequestLayout(false);
    if (paramArrayOfInt != null)
    {
      paramArrayOfInt[0] = paramInt1;
      paramArrayOfInt[1] = paramInt2;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void scrollToPosition(int paramInt)
  {
    if (mLayoutSuppressed) {
      return;
    }
    stopScroll();
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager == null)
    {
      Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    localLayoutManager.scrollToPosition(paramInt);
    awakenScrollBars();
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (shouldDeferAccessibilityEvent(paramAccessibilityEvent)) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate paramRecyclerViewAccessibilityDelegate)
  {
    mAccessibilityDelegate = paramRecyclerViewAccessibilityDelegate;
    ViewCompat.setAccessibilityDelegate(this, paramRecyclerViewAccessibilityDelegate);
  }
  
  public void setAdapter(@Nullable Adapter paramAdapter)
  {
    setLayoutFrozen(false);
    setAdapterInternal(paramAdapter, false, true);
    processDataSetCompletelyChanged(false);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback paramChildDrawingOrderCallback)
  {
    if (paramChildDrawingOrderCallback == mChildDrawingOrderCallback) {
      return;
    }
    mChildDrawingOrderCallback = paramChildDrawingOrderCallback;
    boolean bool;
    if (paramChildDrawingOrderCallback != null) {
      bool = true;
    } else {
      bool = false;
    }
    setChildrenDrawingOrderEnabled(bool);
  }
  
  @VisibleForTesting
  public boolean setChildImportantForAccessibilityInternal(ViewHolder paramViewHolder, int paramInt)
  {
    if (isComputingLayout())
    {
      mPendingAccessibilityState = paramInt;
      mPendingAccessibilityImportanceChange.add(paramViewHolder);
      return false;
    }
    ViewCompat.setImportantForAccessibility(itemView, paramInt);
    return true;
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != mClipToPadding) {
      invalidateGlows();
    }
    mClipToPadding = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (mFirstLayoutComplete) {
      requestLayout();
    }
  }
  
  public void setEdgeEffectFactory(@NonNull EdgeEffectFactory paramEdgeEffectFactory)
  {
    Preconditions.checkNotNull(paramEdgeEffectFactory);
    mEdgeEffectFactory = paramEdgeEffectFactory;
    invalidateGlows();
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    mHasFixedSize = paramBoolean;
  }
  
  public void setItemAnimator(@Nullable ItemAnimator paramItemAnimator)
  {
    ItemAnimator localItemAnimator = mItemAnimator;
    if (localItemAnimator != null)
    {
      localItemAnimator.endAnimations();
      mItemAnimator.setListener(null);
    }
    mItemAnimator = paramItemAnimator;
    if (paramItemAnimator != null) {
      paramItemAnimator.setListener(mItemAnimatorListener);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    mRecycler.setViewCacheSize(paramInt);
  }
  
  @Deprecated
  public void setLayoutFrozen(boolean paramBoolean)
  {
    suppressLayout(paramBoolean);
  }
  
  public void setLayoutManager(@Nullable LayoutManager paramLayoutManager)
  {
    if (paramLayoutManager == mLayout) {
      return;
    }
    stopScroll();
    Object localObject;
    if (mLayout != null)
    {
      localObject = mItemAnimator;
      if (localObject != null) {
        ((ItemAnimator)localObject).endAnimations();
      }
      mLayout.removeAndRecycleAllViews(mRecycler);
      mLayout.removeAndRecycleScrapInt(mRecycler);
      mRecycler.clear();
      if (mIsAttached) {
        mLayout.dispatchDetachedFromWindow(this, mRecycler);
      }
      mLayout.setRecyclerView(null);
      mLayout = null;
    }
    else
    {
      mRecycler.clear();
    }
    mChildHelper.removeAllViewsUnfiltered();
    mLayout = paramLayoutManager;
    if (paramLayoutManager != null) {
      if (mRecyclerView == null)
      {
        paramLayoutManager.setRecyclerView(this);
        if (mIsAttached) {
          mLayout.dispatchAttachedToWindow(this);
        }
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("LayoutManager ");
        ((StringBuilder)localObject).append(paramLayoutManager);
        ((StringBuilder)localObject).append(" is already attached to a RecyclerView:");
        throw new IllegalArgumentException(z2.m(mRecyclerView, (StringBuilder)localObject));
      }
    }
    mRecycler.updateViewCacheSize();
    requestLayout();
  }
  
  @Deprecated
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    if (paramLayoutTransition == null)
    {
      super.setLayoutTransition(null);
      return;
    }
    throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().setNestedScrollingEnabled(paramBoolean);
  }
  
  public void setOnFlingListener(@Nullable OnFlingListener paramOnFlingListener)
  {
    mOnFlingListener = paramOnFlingListener;
  }
  
  @Deprecated
  public void setOnScrollListener(@Nullable OnScrollListener paramOnScrollListener)
  {
    mScrollListener = paramOnScrollListener;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    mPreserveFocusAfterLayout = paramBoolean;
  }
  
  public void setRecycledViewPool(@Nullable RecycledViewPool paramRecycledViewPool)
  {
    mRecycler.setRecycledViewPool(paramRecycledViewPool);
  }
  
  @Deprecated
  public void setRecyclerListener(@Nullable RecyclerListener paramRecyclerListener)
  {
    mRecyclerListener = paramRecyclerListener;
  }
  
  void setScrollState(int paramInt)
  {
    if (paramInt == mScrollState) {
      return;
    }
    mScrollState = paramInt;
    if (paramInt != 2) {
      stopScrollersInternal();
    }
    dispatchOnScrollStateChanged(paramInt);
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0) {
      if (paramInt != 1)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append("; using default value");
        Log.w("RecyclerView", localStringBuilder.toString());
      }
      else
      {
        mTouchSlop = localViewConfiguration.getScaledPagingTouchSlop();
        return;
      }
    }
    mTouchSlop = localViewConfiguration.getScaledTouchSlop();
  }
  
  public void setViewCacheExtension(@Nullable ViewCacheExtension paramViewCacheExtension)
  {
    mRecycler.setViewCacheExtension(paramViewCacheExtension);
  }
  
  public boolean shouldDeferAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = isComputingLayout();
    int i = 0;
    if (bool)
    {
      int j;
      if (paramAccessibilityEvent != null) {
        j = AccessibilityEventCompat.getContentChangeTypes(paramAccessibilityEvent);
      } else {
        j = 0;
      }
      if (j == 0) {
        j = i;
      }
      mEatenAccessibilityChangeFlags |= j;
      return true;
    }
    return false;
  }
  
  public void smoothScrollBy(@Px int paramInt1, @Px int paramInt2)
  {
    smoothScrollBy(paramInt1, paramInt2, null);
  }
  
  public void smoothScrollBy(@Px int paramInt1, @Px int paramInt2, @Nullable Interpolator paramInterpolator)
  {
    smoothScrollBy(paramInt1, paramInt2, paramInterpolator, Integer.MIN_VALUE);
  }
  
  public void smoothScrollBy(@Px int paramInt1, @Px int paramInt2, @Nullable Interpolator paramInterpolator, int paramInt3)
  {
    smoothScrollBy(paramInt1, paramInt2, paramInterpolator, paramInt3, false);
  }
  
  public void smoothScrollBy(@Px int paramInt1, @Px int paramInt2, @Nullable Interpolator paramInterpolator, int paramInt3, boolean paramBoolean)
  {
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (mLayoutSuppressed) {
      return;
    }
    boolean bool = localLayoutManager.canScrollHorizontally();
    int i = 0;
    int j = paramInt1;
    if (!bool) {
      j = 0;
    }
    if (!mLayout.canScrollVertically()) {
      paramInt2 = 0;
    }
    if ((j != 0) || (paramInt2 != 0))
    {
      if ((paramInt3 != Integer.MIN_VALUE) && (paramInt3 <= 0)) {
        paramInt1 = 0;
      } else {
        paramInt1 = 1;
      }
      if (paramInt1 != 0)
      {
        if (paramBoolean)
        {
          paramInt1 = i;
          if (j != 0) {
            paramInt1 = 1;
          }
          i = paramInt1;
          if (paramInt2 != 0) {
            i = paramInt1 | 0x2;
          }
          startNestedScroll(i, 1);
        }
        mViewFlinger.smoothScrollBy(j, paramInt2, paramInt3, paramInterpolator);
      }
      else
      {
        scrollBy(j, paramInt2);
      }
    }
  }
  
  public void smoothScrollToPosition(int paramInt)
  {
    if (mLayoutSuppressed) {
      return;
    }
    LayoutManager localLayoutManager = mLayout;
    if (localLayoutManager == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    localLayoutManager.smoothScrollToPosition(this, mState, paramInt);
  }
  
  public void startInterceptRequestLayout()
  {
    int i = mInterceptRequestLayoutDepth + 1;
    mInterceptRequestLayoutDepth = i;
    if ((i == 1) && (!mLayoutSuppressed)) {
      mLayoutWasDefered = false;
    }
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().startNestedScroll(paramInt);
  }
  
  public boolean startNestedScroll(int paramInt1, int paramInt2)
  {
    return getScrollingChildHelper().startNestedScroll(paramInt1, paramInt2);
  }
  
  public void stopInterceptRequestLayout(boolean paramBoolean)
  {
    if (mInterceptRequestLayoutDepth < 1) {
      mInterceptRequestLayoutDepth = 1;
    }
    if ((!paramBoolean) && (!mLayoutSuppressed)) {
      mLayoutWasDefered = false;
    }
    if (mInterceptRequestLayoutDepth == 1)
    {
      if ((paramBoolean) && (mLayoutWasDefered) && (!mLayoutSuppressed) && (mLayout != null) && (mAdapter != null)) {
        dispatchLayout();
      }
      if (!mLayoutSuppressed) {
        mLayoutWasDefered = false;
      }
    }
    mInterceptRequestLayoutDepth -= 1;
  }
  
  public void stopNestedScroll()
  {
    getScrollingChildHelper().stopNestedScroll();
  }
  
  public void stopNestedScroll(int paramInt)
  {
    getScrollingChildHelper().stopNestedScroll(paramInt);
  }
  
  public void stopScroll()
  {
    setScrollState(0);
    stopScrollersInternal();
  }
  
  public final void suppressLayout(boolean paramBoolean)
  {
    if (paramBoolean != mLayoutSuppressed)
    {
      assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
      if (!paramBoolean)
      {
        mLayoutSuppressed = false;
        if ((mLayoutWasDefered) && (mLayout != null) && (mAdapter != null)) {
          requestLayout();
        }
        mLayoutWasDefered = false;
      }
      else
      {
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        mLayoutSuppressed = true;
        mIgnoreMotionEventTillDown = true;
        stopScroll();
      }
    }
  }
  
  public void swapAdapter(@Nullable Adapter paramAdapter, boolean paramBoolean)
  {
    setLayoutFrozen(false);
    setAdapterInternal(paramAdapter, true, paramBoolean);
    processDataSetCompletelyChanged(true);
    requestLayout();
  }
  
  public void viewRangeUpdate(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = mChildHelper.getUnfilteredChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = mChildHelper.getUnfilteredChildAt(j);
      ViewHolder localViewHolder = getChildViewHolderInt(localView);
      if ((localViewHolder != null) && (!localViewHolder.shouldIgnore()))
      {
        int k = mPosition;
        if ((k >= paramInt1) && (k < paramInt1 + paramInt2))
        {
          localViewHolder.addFlags(2);
          localViewHolder.addChangePayload(paramObject);
          getLayoutParamsmInsetsDirty = true;
        }
      }
    }
    mRecycler.viewRangeUpdate(paramInt1, paramInt2);
  }
  
  public static abstract class Adapter<VH extends RecyclerView.ViewHolder>
  {
    private boolean mHasStableIds = false;
    private final RecyclerView.AdapterDataObservable mObservable = new RecyclerView.AdapterDataObservable();
    private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;
    
    public final void bindViewHolder(@NonNull VH paramVH, int paramInt)
    {
      int i;
      if (mBindingAdapter == null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        mPosition = paramInt;
        if (hasStableIds()) {
          mItemId = getItemId(paramInt);
        }
        paramVH.setFlags(1, 519);
        TraceCompat.beginSection("RV OnBindView");
      }
      mBindingAdapter = this;
      onBindViewHolder(paramVH, paramInt, paramVH.getUnmodifiedPayloads());
      if (i != 0)
      {
        paramVH.clearPayload();
        paramVH = itemView.getLayoutParams();
        if ((paramVH instanceof RecyclerView.LayoutParams)) {
          mInsetsDirty = true;
        }
        TraceCompat.endSection();
      }
    }
    
    public boolean canRestoreState()
    {
      int i = RecyclerView.7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[mStateRestorationPolicy.ordinal()];
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (i != 1)
      {
        if (i != 2) {
          return true;
        }
        bool2 = bool1;
        if (getItemCount() > 0) {
          bool2 = true;
        }
      }
      return bool2;
    }
    
    @NonNull
    public final VH createViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt)
    {
      try
      {
        TraceCompat.beginSection("RV CreateView");
        paramViewGroup = onCreateViewHolder(paramViewGroup, paramInt);
        if (itemView.getParent() == null)
        {
          mItemViewType = paramInt;
          return paramViewGroup;
        }
        paramViewGroup = new java/lang/IllegalStateException;
        paramViewGroup.<init>("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        throw paramViewGroup;
      }
      finally
      {
        TraceCompat.endSection();
      }
    }
    
    public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends RecyclerView.ViewHolder> paramAdapter, @NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
    {
      if (paramAdapter == this) {
        return paramInt;
      }
      return -1;
    }
    
    public abstract int getItemCount();
    
    public long getItemId(int paramInt)
    {
      return -1L;
    }
    
    public int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    @NonNull
    public final StateRestorationPolicy getStateRestorationPolicy()
    {
      return mStateRestorationPolicy;
    }
    
    public final boolean hasObservers()
    {
      return mObservable.hasObservers();
    }
    
    public final boolean hasStableIds()
    {
      return mHasStableIds;
    }
    
    public final void notifyDataSetChanged()
    {
      mObservable.notifyChanged();
    }
    
    public final void notifyItemChanged(int paramInt)
    {
      mObservable.notifyItemRangeChanged(paramInt, 1);
    }
    
    public final void notifyItemChanged(int paramInt, @Nullable Object paramObject)
    {
      mObservable.notifyItemRangeChanged(paramInt, 1, paramObject);
    }
    
    public final void notifyItemInserted(int paramInt)
    {
      mObservable.notifyItemRangeInserted(paramInt, 1);
    }
    
    public final void notifyItemMoved(int paramInt1, int paramInt2)
    {
      mObservable.notifyItemMoved(paramInt1, paramInt2);
    }
    
    public final void notifyItemRangeChanged(int paramInt1, int paramInt2)
    {
      mObservable.notifyItemRangeChanged(paramInt1, paramInt2);
    }
    
    public final void notifyItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
    {
      mObservable.notifyItemRangeChanged(paramInt1, paramInt2, paramObject);
    }
    
    public final void notifyItemRangeInserted(int paramInt1, int paramInt2)
    {
      mObservable.notifyItemRangeInserted(paramInt1, paramInt2);
    }
    
    public final void notifyItemRangeRemoved(int paramInt1, int paramInt2)
    {
      mObservable.notifyItemRangeRemoved(paramInt1, paramInt2);
    }
    
    public final void notifyItemRemoved(int paramInt)
    {
      mObservable.notifyItemRangeRemoved(paramInt, 1);
    }
    
    public void onAttachedToRecyclerView(@NonNull RecyclerView paramRecyclerView) {}
    
    public abstract void onBindViewHolder(@NonNull VH paramVH, int paramInt);
    
    public void onBindViewHolder(@NonNull VH paramVH, int paramInt, @NonNull List<Object> paramList)
    {
      onBindViewHolder(paramVH, paramInt);
    }
    
    @NonNull
    public abstract VH onCreateViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt);
    
    public void onDetachedFromRecyclerView(@NonNull RecyclerView paramRecyclerView) {}
    
    public boolean onFailedToRecycleView(@NonNull VH paramVH)
    {
      return false;
    }
    
    public void onViewAttachedToWindow(@NonNull VH paramVH) {}
    
    public void onViewDetachedFromWindow(@NonNull VH paramVH) {}
    
    public void onViewRecycled(@NonNull VH paramVH) {}
    
    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver paramAdapterDataObserver)
    {
      mObservable.registerObserver(paramAdapterDataObserver);
    }
    
    public void setHasStableIds(boolean paramBoolean)
    {
      if (!hasObservers())
      {
        mHasStableIds = paramBoolean;
        return;
      }
      throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }
    
    public void setStateRestorationPolicy(@NonNull StateRestorationPolicy paramStateRestorationPolicy)
    {
      mStateRestorationPolicy = paramStateRestorationPolicy;
      mObservable.notifyStateRestorationPolicyChanged();
    }
    
    public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver paramAdapterDataObserver)
    {
      mObservable.unregisterObserver(paramAdapterDataObserver);
    }
    
    public static enum StateRestorationPolicy
    {
      static
      {
        StateRestorationPolicy localStateRestorationPolicy1 = new StateRestorationPolicy("ALLOW", 0);
        ALLOW = localStateRestorationPolicy1;
        StateRestorationPolicy localStateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
        PREVENT_WHEN_EMPTY = localStateRestorationPolicy2;
        StateRestorationPolicy localStateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
        PREVENT = localStateRestorationPolicy3;
        $VALUES = new StateRestorationPolicy[] { localStateRestorationPolicy1, localStateRestorationPolicy2, localStateRestorationPolicy3 };
      }
      
      private StateRestorationPolicy() {}
    }
  }
  
  public static class AdapterDataObservable
    extends Observable<RecyclerView.AdapterDataObserver>
  {
    public boolean hasObservers()
    {
      return mObservers.isEmpty() ^ true;
    }
    
    public void notifyChanged()
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onChanged();
      }
    }
    
    public void notifyItemMoved(int paramInt1, int paramInt2)
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeMoved(paramInt1, paramInt2, 1);
      }
    }
    
    public void notifyItemRangeChanged(int paramInt1, int paramInt2)
    {
      notifyItemRangeChanged(paramInt1, paramInt2, null);
    }
    
    public void notifyItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeChanged(paramInt1, paramInt2, paramObject);
      }
    }
    
    public void notifyItemRangeInserted(int paramInt1, int paramInt2)
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeInserted(paramInt1, paramInt2);
      }
    }
    
    public void notifyItemRangeRemoved(int paramInt1, int paramInt2)
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onItemRangeRemoved(paramInt1, paramInt2);
      }
    }
    
    public void notifyStateRestorationPolicyChanged()
    {
      for (int i = mObservers.size() - 1; i >= 0; i--) {
        ((RecyclerView.AdapterDataObserver)mObservers.get(i)).onStateRestorationPolicyChanged();
      }
    }
  }
  
  public static abstract class AdapterDataObserver
  {
    public void onChanged() {}
    
    public void onItemRangeChanged(int paramInt1, int paramInt2) {}
    
    public void onItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
    {
      onItemRangeChanged(paramInt1, paramInt2);
    }
    
    public void onItemRangeInserted(int paramInt1, int paramInt2) {}
    
    public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onItemRangeRemoved(int paramInt1, int paramInt2) {}
    
    public void onStateRestorationPolicyChanged() {}
  }
  
  public static abstract interface ChildDrawingOrderCallback
  {
    public abstract int onGetChildDrawingOrder(int paramInt1, int paramInt2);
  }
  
  public static class EdgeEffectFactory
  {
    public static final int DIRECTION_BOTTOM = 3;
    public static final int DIRECTION_LEFT = 0;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_TOP = 1;
    
    @NonNull
    public EdgeEffect createEdgeEffect(@NonNull RecyclerView paramRecyclerView, int paramInt)
    {
      return new EdgeEffect(paramRecyclerView.getContext());
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface EdgeDirection {}
  }
  
  public static abstract class ItemAnimator
  {
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_CHANGED = 2;
    public static final int FLAG_INVALIDATED = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_REMOVED = 8;
    private long mAddDuration = 120L;
    private long mChangeDuration = 250L;
    private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList();
    private ItemAnimatorListener mListener = null;
    private long mMoveDuration = 250L;
    private long mRemoveDuration = 120L;
    
    public static int buildAdapterChangeFlagsForAnimations(RecyclerView.ViewHolder paramViewHolder)
    {
      int i = mFlags & 0xE;
      if (paramViewHolder.isInvalid()) {
        return 4;
      }
      int j = i;
      if ((i & 0x4) == 0)
      {
        int k = paramViewHolder.getOldPosition();
        int m = paramViewHolder.getAbsoluteAdapterPosition();
        j = i;
        if (k != -1)
        {
          j = i;
          if (m != -1)
          {
            j = i;
            if (k != m) {
              j = i | 0x800;
            }
          }
        }
      }
      return j;
    }
    
    public abstract boolean animateAppearance(@NonNull RecyclerView.ViewHolder paramViewHolder, @Nullable ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
    
    public abstract boolean animateChange(@NonNull RecyclerView.ViewHolder paramViewHolder1, @NonNull RecyclerView.ViewHolder paramViewHolder2, @NonNull ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
    
    public abstract boolean animateDisappearance(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull ItemHolderInfo paramItemHolderInfo1, @Nullable ItemHolderInfo paramItemHolderInfo2);
    
    public abstract boolean animatePersistence(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull ItemHolderInfo paramItemHolderInfo1, @NonNull ItemHolderInfo paramItemHolderInfo2);
    
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return true;
    }
    
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder, @NonNull List<Object> paramList)
    {
      return canReuseUpdatedViewHolder(paramViewHolder);
    }
    
    public final void dispatchAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      onAnimationFinished(paramViewHolder);
      ItemAnimatorListener localItemAnimatorListener = mListener;
      if (localItemAnimatorListener != null) {
        localItemAnimatorListener.onAnimationFinished(paramViewHolder);
      }
    }
    
    public final void dispatchAnimationStarted(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      onAnimationStarted(paramViewHolder);
    }
    
    public final void dispatchAnimationsFinished()
    {
      int i = mFinishedListeners.size();
      for (int j = 0; j < i; j++) {
        ((ItemAnimatorFinishedListener)mFinishedListeners.get(j)).onAnimationsFinished();
      }
      mFinishedListeners.clear();
    }
    
    public abstract void endAnimation(@NonNull RecyclerView.ViewHolder paramViewHolder);
    
    public abstract void endAnimations();
    
    public long getAddDuration()
    {
      return mAddDuration;
    }
    
    public long getChangeDuration()
    {
      return mChangeDuration;
    }
    
    public long getMoveDuration()
    {
      return mMoveDuration;
    }
    
    public long getRemoveDuration()
    {
      return mRemoveDuration;
    }
    
    public abstract boolean isRunning();
    
    public final boolean isRunning(@Nullable ItemAnimatorFinishedListener paramItemAnimatorFinishedListener)
    {
      boolean bool = isRunning();
      if (paramItemAnimatorFinishedListener != null) {
        if (!bool) {
          paramItemAnimatorFinishedListener.onAnimationsFinished();
        } else {
          mFinishedListeners.add(paramItemAnimatorFinishedListener);
        }
      }
      return bool;
    }
    
    @NonNull
    public ItemHolderInfo obtainHolderInfo()
    {
      return new ItemHolderInfo();
    }
    
    public void onAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder) {}
    
    public void onAnimationStarted(@NonNull RecyclerView.ViewHolder paramViewHolder) {}
    
    @NonNull
    public ItemHolderInfo recordPostLayoutInformation(@NonNull RecyclerView.State paramState, @NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      return obtainHolderInfo().setFrom(paramViewHolder);
    }
    
    @NonNull
    public ItemHolderInfo recordPreLayoutInformation(@NonNull RecyclerView.State paramState, @NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt, @NonNull List<Object> paramList)
    {
      return obtainHolderInfo().setFrom(paramViewHolder);
    }
    
    public abstract void runPendingAnimations();
    
    public void setAddDuration(long paramLong)
    {
      mAddDuration = paramLong;
    }
    
    public void setChangeDuration(long paramLong)
    {
      mChangeDuration = paramLong;
    }
    
    public void setListener(ItemAnimatorListener paramItemAnimatorListener)
    {
      mListener = paramItemAnimatorListener;
    }
    
    public void setMoveDuration(long paramLong)
    {
      mMoveDuration = paramLong;
    }
    
    public void setRemoveDuration(long paramLong)
    {
      mRemoveDuration = paramLong;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface AdapterChanges {}
    
    public static abstract interface ItemAnimatorFinishedListener
    {
      public abstract void onAnimationsFinished();
    }
    
    public static abstract interface ItemAnimatorListener
    {
      public abstract void onAnimationFinished(@NonNull RecyclerView.ViewHolder paramViewHolder);
    }
    
    public static class ItemHolderInfo
    {
      public int bottom;
      public int changeFlags;
      public int left;
      public int right;
      public int top;
      
      @NonNull
      public ItemHolderInfo setFrom(@NonNull RecyclerView.ViewHolder paramViewHolder)
      {
        return setFrom(paramViewHolder, 0);
      }
      
      @NonNull
      public ItemHolderInfo setFrom(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
      {
        paramViewHolder = itemView;
        left = paramViewHolder.getLeft();
        top = paramViewHolder.getTop();
        right = paramViewHolder.getRight();
        bottom = paramViewHolder.getBottom();
        return this;
      }
    }
  }
  
  public class ItemAnimatorRestoreListener
    implements RecyclerView.ItemAnimator.ItemAnimatorListener
  {
    public ItemAnimatorRestoreListener() {}
    
    public void onAnimationFinished(RecyclerView.ViewHolder paramViewHolder)
    {
      paramViewHolder.setIsRecyclable(true);
      if ((mShadowedHolder != null) && (mShadowingHolder == null)) {
        mShadowedHolder = null;
      }
      mShadowingHolder = null;
      if ((!paramViewHolder.shouldBeKeptAsChild()) && (!removeAnimatingView(itemView)) && (paramViewHolder.isTmpDetached())) {
        removeDetachedView(itemView, false);
      }
    }
  }
  
  public static abstract class ItemDecoration
  {
    @Deprecated
    public void getItemOffsets(@NonNull Rect paramRect, int paramInt, @NonNull RecyclerView paramRecyclerView)
    {
      paramRect.set(0, 0, 0, 0);
    }
    
    public void getItemOffsets(@NonNull Rect paramRect, @NonNull View paramView, @NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.State paramState)
    {
      getItemOffsets(paramRect, ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition(), paramRecyclerView);
    }
    
    @Deprecated
    public void onDraw(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView) {}
    
    public void onDraw(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.State paramState)
    {
      onDraw(paramCanvas, paramRecyclerView);
    }
    
    @Deprecated
    public void onDrawOver(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView) {}
    
    public void onDrawOver(@NonNull Canvas paramCanvas, @NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.State paramState)
    {
      onDrawOver(paramCanvas, paramRecyclerView);
    }
  }
  
  public static abstract class LayoutManager
  {
    public boolean mAutoMeasure;
    public ChildHelper mChildHelper;
    private int mHeight;
    private int mHeightMode;
    public ViewBoundsCheck mHorizontalBoundCheck;
    private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public RecyclerView mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    @Nullable
    public RecyclerView.SmoothScroller mSmoothScroller;
    public ViewBoundsCheck mVerticalBoundCheck;
    private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;
    
    public LayoutManager()
    {
      ViewBoundsCheck.Callback local1 = new ViewBoundsCheck.Callback()
      {
        public View getChildAt(int paramAnonymousInt)
        {
          return RecyclerView.LayoutManager.this.getChildAt(paramAnonymousInt);
        }
        
        public int getChildEnd(View paramAnonymousView)
        {
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
          return getDecoratedRight(paramAnonymousView) + rightMargin;
        }
        
        public int getChildStart(View paramAnonymousView)
        {
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
          return getDecoratedLeft(paramAnonymousView) - leftMargin;
        }
        
        public int getParentEnd()
        {
          return getWidth() - getPaddingRight();
        }
        
        public int getParentStart()
        {
          return getPaddingLeft();
        }
      };
      mHorizontalBoundCheckCallback = local1;
      ViewBoundsCheck.Callback local2 = new ViewBoundsCheck.Callback()
      {
        public View getChildAt(int paramAnonymousInt)
        {
          return RecyclerView.LayoutManager.this.getChildAt(paramAnonymousInt);
        }
        
        public int getChildEnd(View paramAnonymousView)
        {
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
          return getDecoratedBottom(paramAnonymousView) + bottomMargin;
        }
        
        public int getChildStart(View paramAnonymousView)
        {
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
          return getDecoratedTop(paramAnonymousView) - topMargin;
        }
        
        public int getParentEnd()
        {
          return getHeight() - getPaddingBottom();
        }
        
        public int getParentStart()
        {
          return getPaddingTop();
        }
      };
      mVerticalBoundCheckCallback = local2;
      mHorizontalBoundCheck = new ViewBoundsCheck(local1);
      mVerticalBoundCheck = new ViewBoundsCheck(local2);
      mRequestedSimpleAnimations = false;
      mIsAttachedToWindow = false;
      mAutoMeasure = false;
      mMeasurementCacheEnabled = true;
      mItemPrefetchEnabled = true;
    }
    
    private void addViewInt(View paramView, int paramInt, boolean paramBoolean)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      if ((!paramBoolean) && (!localViewHolder.isRemoved())) {
        mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(localViewHolder);
      } else {
        mRecyclerView.mViewInfoStore.addToDisappearedInLayout(localViewHolder);
      }
      Object localObject = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      if ((!localViewHolder.wasReturnedFromScrap()) && (!localViewHolder.isScrap()))
      {
        if (paramView.getParent() == mRecyclerView)
        {
          int i = mChildHelper.indexOfChild(paramView);
          int j = paramInt;
          if (paramInt == -1) {
            j = mChildHelper.getChildCount();
          }
          if (i != -1)
          {
            if (i != j) {
              mRecyclerView.mLayout.moveView(i, j);
            }
          }
          else
          {
            localObject = z2.t("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
            ((StringBuilder)localObject).append(mRecyclerView.indexOfChild(paramView));
            throw new IllegalStateException(z2.m(mRecyclerView, (StringBuilder)localObject));
          }
        }
        else
        {
          mChildHelper.addView(paramView, paramInt, false);
          mInsetsDirty = true;
          RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
          if ((localSmoothScroller != null) && (localSmoothScroller.isRunning())) {
            mSmoothScroller.onChildAttachedToWindow(paramView);
          }
        }
      }
      else
      {
        if (localViewHolder.isScrap()) {
          localViewHolder.unScrap();
        } else {
          localViewHolder.clearReturnedFromScrapFlag();
        }
        mChildHelper.attachViewToParent(paramView, paramInt, paramView.getLayoutParams(), false);
      }
      if (mPendingInvalidate)
      {
        itemView.invalidate();
        mPendingInvalidate = false;
      }
    }
    
    public static int chooseSize(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      if (i != Integer.MIN_VALUE)
      {
        if (i != 1073741824) {
          paramInt1 = Math.max(paramInt2, paramInt3);
        }
        return paramInt1;
      }
      return Math.min(paramInt1, Math.max(paramInt2, paramInt3));
    }
    
    private void detachViewInternal(int paramInt, @NonNull View paramView)
    {
      mChildHelper.detachViewFromParent(paramInt);
    }
    
    public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      paramInt1 = Math.max(0, paramInt1 - paramInt3);
      if (paramBoolean)
      {
        if (paramInt4 < 0)
        {
          if (paramInt4 != -1) {
            break label100;
          }
          if (paramInt2 == Integer.MIN_VALUE) {
            break label59;
          }
          if (paramInt2 == 0) {
            break label100;
          }
          if (paramInt2 == 1073741824) {
            break label59;
          }
          break label100;
        }
      }
      else {
        if (paramInt4 < 0) {
          break label54;
        }
      }
      paramInt2 = 1073741824;
      break label104;
      label54:
      if (paramInt4 == -1)
      {
        label59:
        paramInt4 = paramInt1;
      }
      else if (paramInt4 == -2)
      {
        if ((paramInt2 != Integer.MIN_VALUE) && (paramInt2 != 1073741824))
        {
          paramInt2 = 0;
          paramInt4 = paramInt1;
        }
        else
        {
          paramInt2 = Integer.MIN_VALUE;
          paramInt4 = paramInt1;
        }
      }
      else
      {
        label100:
        paramInt2 = 0;
        paramInt4 = paramInt2;
      }
      label104:
      return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
    }
    
    @Deprecated
    public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      int i = 0;
      paramInt1 = Math.max(0, paramInt1 - paramInt2);
      if (paramBoolean) {
        if (paramInt3 >= 0)
        {
          paramInt2 = paramInt3;
          break label38;
        }
      }
      label38:
      do
      {
        paramInt2 = 0;
        paramInt1 = i;
        break;
        if (paramInt3 >= 0) {}
        for (paramInt2 = paramInt3;; paramInt2 = paramInt1)
        {
          paramInt1 = 1073741824;
          break label67;
          if (paramInt3 != -1) {
            break;
          }
        }
      } while (paramInt3 != -2);
      paramInt3 = Integer.MIN_VALUE;
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      label67:
      return View.MeasureSpec.makeMeasureSpec(paramInt2, paramInt1);
    }
    
    private int[] getChildRectangleOnScreenScrollAmount(View paramView, Rect paramRect)
    {
      int i = getPaddingLeft();
      int j = getPaddingTop();
      int k = getWidth();
      int m = getPaddingRight();
      int n = getHeight();
      int i1 = getPaddingBottom();
      int i2 = paramView.getLeft() + left - paramView.getScrollX();
      int i3 = paramView.getTop() + top - paramView.getScrollY();
      int i4 = paramRect.width();
      int i5 = paramRect.height();
      int i6 = i2 - i;
      i = Math.min(0, i6);
      int i7 = i3 - j;
      j = Math.min(0, i7);
      i4 = i4 + i2 - (k - m);
      m = Math.max(0, i4);
      n = Math.max(0, i5 + i3 - (n - i1));
      if (getLayoutDirection() == 1)
      {
        if (m != 0) {
          i = m;
        } else {
          i = Math.max(i, i4);
        }
      }
      else if (i == 0) {
        i = Math.min(i6, m);
      }
      if (j == 0) {
        j = Math.min(i7, n);
      }
      return new int[] { i, j };
    }
    
    public static Properties getProperties(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
      Properties localProperties = new Properties();
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, paramInt1, paramInt2);
      orientation = paramContext.getInt(R.styleable.RecyclerView_android_orientation, 1);
      spanCount = paramContext.getInt(R.styleable.RecyclerView_spanCount, 1);
      reverseLayout = paramContext.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
      stackFromEnd = paramContext.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
      paramContext.recycle();
      return localProperties;
    }
    
    private boolean isFocusedChildVisibleAfterScrolling(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
    {
      paramRecyclerView = paramRecyclerView.getFocusedChild();
      if (paramRecyclerView == null) {
        return false;
      }
      int i = getPaddingLeft();
      int j = getPaddingTop();
      int k = getWidth();
      int m = getPaddingRight();
      int n = getHeight();
      int i1 = getPaddingBottom();
      Rect localRect = mRecyclerView.mTempRect;
      getDecoratedBoundsWithMargins(paramRecyclerView, localRect);
      return (left - paramInt1 < k - m) && (right - paramInt1 > i) && (top - paramInt2 < n - i1) && (bottom - paramInt2 > j);
    }
    
    private static boolean isMeasurementUpToDate(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      boolean bool1 = false;
      boolean bool2 = false;
      if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
        return false;
      }
      if (i != Integer.MIN_VALUE)
      {
        if (i != 0)
        {
          if (i != 1073741824) {
            return false;
          }
          if (paramInt2 == paramInt1) {
            bool2 = true;
          }
          return bool2;
        }
        return true;
      }
      bool2 = bool1;
      if (paramInt2 >= paramInt1) {
        bool2 = true;
      }
      return bool2;
    }
    
    private void scrapOrRecycleView(RecyclerView.Recycler paramRecycler, int paramInt, View paramView)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      if (localViewHolder.shouldIgnore()) {
        return;
      }
      if ((localViewHolder.isInvalid()) && (!localViewHolder.isRemoved()) && (!mRecyclerView.mAdapter.hasStableIds()))
      {
        removeViewAt(paramInt);
        paramRecycler.recycleViewHolderInternal(localViewHolder);
      }
      else
      {
        detachViewAt(paramInt);
        paramRecycler.scrapView(paramView);
        mRecyclerView.mViewInfoStore.onViewDetached(localViewHolder);
      }
    }
    
    public void addDisappearingView(View paramView)
    {
      addDisappearingView(paramView, -1);
    }
    
    public void addDisappearingView(View paramView, int paramInt)
    {
      addViewInt(paramView, paramInt, true);
    }
    
    public void addView(View paramView)
    {
      addView(paramView, -1);
    }
    
    public void addView(View paramView, int paramInt)
    {
      addViewInt(paramView, paramInt, false);
    }
    
    public void assertInLayoutOrScroll(String paramString)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        localRecyclerView.assertInLayoutOrScroll(paramString);
      }
    }
    
    public void assertNotInLayoutOrScroll(String paramString)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        localRecyclerView.assertNotInLayoutOrScroll(paramString);
      }
    }
    
    public void attachView(@NonNull View paramView)
    {
      attachView(paramView, -1);
    }
    
    public void attachView(@NonNull View paramView, int paramInt)
    {
      attachView(paramView, paramInt, (RecyclerView.LayoutParams)paramView.getLayoutParams());
    }
    
    public void attachView(@NonNull View paramView, int paramInt, RecyclerView.LayoutParams paramLayoutParams)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      if (localViewHolder.isRemoved()) {
        mRecyclerView.mViewInfoStore.addToDisappearedInLayout(localViewHolder);
      } else {
        mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(localViewHolder);
      }
      mChildHelper.attachViewToParent(paramView, paramInt, paramLayoutParams, localViewHolder.isRemoved());
    }
    
    public void calculateItemDecorationsForChild(@NonNull View paramView, @NonNull Rect paramRect)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView == null)
      {
        paramRect.set(0, 0, 0, 0);
        return;
      }
      paramRect.set(localRecyclerView.getItemDecorInsetsForChild(paramView));
    }
    
    public boolean canScrollHorizontally()
    {
      return false;
    }
    
    public boolean canScrollVertically()
    {
      return false;
    }
    
    public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
    {
      boolean bool;
      if (paramLayoutParams != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
    
    public void collectInitialPrefetchPositions(int paramInt, LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
    
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int computeVerticalScrollRange(@NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public void detachAndScrapAttachedViews(@NonNull RecyclerView.Recycler paramRecycler)
    {
      for (int i = getChildCount() - 1; i >= 0; i--) {
        scrapOrRecycleView(paramRecycler, i, getChildAt(i));
      }
    }
    
    public void detachAndScrapView(@NonNull View paramView, @NonNull RecyclerView.Recycler paramRecycler)
    {
      scrapOrRecycleView(paramRecycler, mChildHelper.indexOfChild(paramView), paramView);
    }
    
    public void detachAndScrapViewAt(int paramInt, @NonNull RecyclerView.Recycler paramRecycler)
    {
      scrapOrRecycleView(paramRecycler, paramInt, getChildAt(paramInt));
    }
    
    public void detachView(@NonNull View paramView)
    {
      int i = mChildHelper.indexOfChild(paramView);
      if (i >= 0) {
        detachViewInternal(i, paramView);
      }
    }
    
    public void detachViewAt(int paramInt)
    {
      detachViewInternal(paramInt, getChildAt(paramInt));
    }
    
    public void dispatchAttachedToWindow(RecyclerView paramRecyclerView)
    {
      mIsAttachedToWindow = true;
      onAttachedToWindow(paramRecyclerView);
    }
    
    public void dispatchDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
    {
      mIsAttachedToWindow = false;
      onDetachedFromWindow(paramRecyclerView, paramRecycler);
    }
    
    public void endAnimation(View paramView)
    {
      RecyclerView.ItemAnimator localItemAnimator = mRecyclerView.mItemAnimator;
      if (localItemAnimator != null) {
        localItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(paramView));
      }
    }
    
    @Nullable
    public View findContainingItemView(@NonNull View paramView)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView == null) {
        return null;
      }
      paramView = localRecyclerView.findContainingItemView(paramView);
      if (paramView == null) {
        return null;
      }
      if (mChildHelper.isHidden(paramView)) {
        return null;
      }
      return paramView;
    }
    
    @Nullable
    public View findViewByPosition(int paramInt)
    {
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = getChildAt(j);
        RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
        if ((localViewHolder != null) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.shouldIgnore()) && ((mRecyclerView.mState.isPreLayout()) || (!localViewHolder.isRemoved()))) {
          return localView;
        }
      }
      return null;
    }
    
    public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();
    
    public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
    }
    
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      if ((paramLayoutParams instanceof RecyclerView.LayoutParams)) {
        return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
      }
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      }
      return new RecyclerView.LayoutParams(paramLayoutParams);
    }
    
    public int getBaseline()
    {
      return -1;
    }
    
    public int getBottomDecorationHeight(@NonNull View paramView)
    {
      return getLayoutParamsmDecorInsets.bottom;
    }
    
    @Nullable
    public View getChildAt(int paramInt)
    {
      Object localObject = mChildHelper;
      if (localObject != null) {
        localObject = ((ChildHelper)localObject).getChildAt(paramInt);
      } else {
        localObject = null;
      }
      return (View)localObject;
    }
    
    public int getChildCount()
    {
      ChildHelper localChildHelper = mChildHelper;
      int i;
      if (localChildHelper != null) {
        i = localChildHelper.getChildCount();
      } else {
        i = 0;
      }
      return i;
    }
    
    public boolean getClipToPadding()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      boolean bool;
      if ((localRecyclerView != null) && (mClipToPadding)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int getColumnCountForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
    {
      return -1;
    }
    
    public int getDecoratedBottom(@NonNull View paramView)
    {
      int i = paramView.getBottom();
      return getBottomDecorationHeight(paramView) + i;
    }
    
    public void getDecoratedBoundsWithMargins(@NonNull View paramView, @NonNull Rect paramRect)
    {
      RecyclerView.getDecoratedBoundsWithMarginsInt(paramView, paramRect);
    }
    
    public int getDecoratedLeft(@NonNull View paramView)
    {
      return paramView.getLeft() - getLeftDecorationWidth(paramView);
    }
    
    public int getDecoratedMeasuredHeight(@NonNull View paramView)
    {
      Rect localRect = getLayoutParamsmDecorInsets;
      return paramView.getMeasuredHeight() + top + bottom;
    }
    
    public int getDecoratedMeasuredWidth(@NonNull View paramView)
    {
      Rect localRect = getLayoutParamsmDecorInsets;
      return paramView.getMeasuredWidth() + left + right;
    }
    
    public int getDecoratedRight(@NonNull View paramView)
    {
      int i = paramView.getRight();
      return getRightDecorationWidth(paramView) + i;
    }
    
    public int getDecoratedTop(@NonNull View paramView)
    {
      return paramView.getTop() - getTopDecorationHeight(paramView);
    }
    
    @Nullable
    public View getFocusedChild()
    {
      Object localObject = mRecyclerView;
      if (localObject == null) {
        return null;
      }
      localObject = ((ViewGroup)localObject).getFocusedChild();
      if ((localObject != null) && (!mChildHelper.isHidden((View)localObject))) {
        return (View)localObject;
      }
      return null;
    }
    
    @Px
    public int getHeight()
    {
      return mHeight;
    }
    
    public int getHeightMode()
    {
      return mHeightMode;
    }
    
    public int getItemCount()
    {
      Object localObject = mRecyclerView;
      if (localObject != null) {
        localObject = ((RecyclerView)localObject).getAdapter();
      } else {
        localObject = null;
      }
      int i;
      if (localObject != null) {
        i = ((RecyclerView.Adapter)localObject).getItemCount();
      } else {
        i = 0;
      }
      return i;
    }
    
    public int getItemViewType(@NonNull View paramView)
    {
      return RecyclerView.getChildViewHolderInt(paramView).getItemViewType();
    }
    
    public int getLayoutDirection()
    {
      return ViewCompat.getLayoutDirection(mRecyclerView);
    }
    
    public int getLeftDecorationWidth(@NonNull View paramView)
    {
      return getLayoutParamsmDecorInsets.left;
    }
    
    @Px
    public int getMinimumHeight()
    {
      return ViewCompat.getMinimumHeight(mRecyclerView);
    }
    
    @Px
    public int getMinimumWidth()
    {
      return ViewCompat.getMinimumWidth(mRecyclerView);
    }
    
    @Px
    public int getPaddingBottom()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = localRecyclerView.getPaddingBottom();
      } else {
        i = 0;
      }
      return i;
    }
    
    @Px
    public int getPaddingEnd()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = ViewCompat.getPaddingEnd(localRecyclerView);
      } else {
        i = 0;
      }
      return i;
    }
    
    @Px
    public int getPaddingLeft()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = localRecyclerView.getPaddingLeft();
      } else {
        i = 0;
      }
      return i;
    }
    
    @Px
    public int getPaddingRight()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = localRecyclerView.getPaddingRight();
      } else {
        i = 0;
      }
      return i;
    }
    
    @Px
    public int getPaddingStart()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = ViewCompat.getPaddingStart(localRecyclerView);
      } else {
        i = 0;
      }
      return i;
    }
    
    @Px
    public int getPaddingTop()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      int i;
      if (localRecyclerView != null) {
        i = localRecyclerView.getPaddingTop();
      } else {
        i = 0;
      }
      return i;
    }
    
    public int getPosition(@NonNull View paramView)
    {
      return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
    }
    
    public int getRightDecorationWidth(@NonNull View paramView)
    {
      return getLayoutParamsmDecorInsets.right;
    }
    
    public int getRowCountForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
    {
      return -1;
    }
    
    public int getSelectionModeForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
    {
      return 0;
    }
    
    public int getTopDecorationHeight(@NonNull View paramView)
    {
      return getLayoutParamsmDecorInsets.top;
    }
    
    public void getTransformedBoundingBox(@NonNull View paramView, boolean paramBoolean, @NonNull Rect paramRect)
    {
      Object localObject;
      if (paramBoolean)
      {
        localObject = getLayoutParamsmDecorInsets;
        paramRect.set(-left, -top, paramView.getWidth() + right, paramView.getHeight() + bottom);
      }
      else
      {
        paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
      }
      if (mRecyclerView != null)
      {
        localObject = paramView.getMatrix();
        if ((localObject != null) && (!((Matrix)localObject).isIdentity()))
        {
          RectF localRectF = mRecyclerView.mTempRectF;
          localRectF.set(paramRect);
          ((Matrix)localObject).mapRect(localRectF);
          paramRect.set((int)Math.floor(left), (int)Math.floor(top), (int)Math.ceil(right), (int)Math.ceil(bottom));
        }
      }
      paramRect.offset(paramView.getLeft(), paramView.getTop());
    }
    
    @Px
    public int getWidth()
    {
      return mWidth;
    }
    
    public int getWidthMode()
    {
      return mWidthMode;
    }
    
    public boolean hasFlexibleChildInBothOrientations()
    {
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        ViewGroup.LayoutParams localLayoutParams = getChildAt(j).getLayoutParams();
        if ((width < 0) && (height < 0)) {
          return true;
        }
      }
      return false;
    }
    
    public boolean hasFocus()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      boolean bool;
      if ((localRecyclerView != null) && (localRecyclerView.hasFocus())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void ignoreView(@NonNull View paramView)
    {
      ViewParent localViewParent = paramView.getParent();
      RecyclerView localRecyclerView = mRecyclerView;
      if ((localViewParent == localRecyclerView) && (localRecyclerView.indexOfChild(paramView) != -1))
      {
        paramView = RecyclerView.getChildViewHolderInt(paramView);
        paramView.addFlags(128);
        mRecyclerView.mViewInfoStore.removeViewHolder(paramView);
        return;
      }
      paramView = z2.t("View should be fully attached to be ignored");
      throw new IllegalArgumentException(z2.m(mRecyclerView, paramView));
    }
    
    public boolean isAttachedToWindow()
    {
      return mIsAttachedToWindow;
    }
    
    public boolean isAutoMeasureEnabled()
    {
      return mAutoMeasure;
    }
    
    public boolean isFocused()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      boolean bool;
      if ((localRecyclerView != null) && (localRecyclerView.isFocused())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean isItemPrefetchEnabled()
    {
      return mItemPrefetchEnabled;
    }
    
    public boolean isLayoutHierarchical(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
    {
      return false;
    }
    
    public boolean isMeasurementCacheEnabled()
    {
      return mMeasurementCacheEnabled;
    }
    
    public boolean isSmoothScrolling()
    {
      RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
      boolean bool;
      if ((localSmoothScroller != null) && (localSmoothScroller.isRunning())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isViewPartiallyVisible(@NonNull View paramView, boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((mHorizontalBoundCheck.isViewWithinBoundFlags(paramView, 24579)) && (mVerticalBoundCheck.isViewWithinBoundFlags(paramView, 24579))) {
        paramBoolean2 = true;
      } else {
        paramBoolean2 = false;
      }
      if (paramBoolean1) {
        return paramBoolean2;
      }
      return paramBoolean2 ^ true;
    }
    
    public void layoutDecorated(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      Rect localRect = getLayoutParamsmDecorInsets;
      paramView.layout(paramInt1 + left, paramInt2 + top, paramInt3 - right, paramInt4 - bottom);
    }
    
    public void layoutDecoratedWithMargins(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      Rect localRect = mDecorInsets;
      paramView.layout(paramInt1 + left + leftMargin, paramInt2 + top + topMargin, paramInt3 - right - rightMargin, paramInt4 - bottom - bottomMargin);
    }
    
    public void measureChild(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      Rect localRect = mRecyclerView.getItemDecorInsetsForChild(paramView);
      int i = left;
      int j = right;
      int k = top;
      int m = bottom;
      int n = getWidth();
      int i1 = getWidthMode();
      int i2 = getPaddingLeft();
      paramInt1 = getChildMeasureSpec(n, i1, getPaddingRight() + i2 + (i + j + paramInt1), width, canScrollHorizontally());
      n = getHeight();
      i1 = getHeightMode();
      i = getPaddingTop();
      paramInt2 = getChildMeasureSpec(n, i1, getPaddingBottom() + i + (k + m + paramInt2), height, canScrollVertically());
      if (shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams)) {
        paramView.measure(paramInt1, paramInt2);
      }
    }
    
    public void measureChildWithMargins(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      Rect localRect = mRecyclerView.getItemDecorInsetsForChild(paramView);
      int i = left;
      int j = right;
      int k = top;
      int m = bottom;
      int n = getWidth();
      int i1 = getWidthMode();
      int i2 = getPaddingLeft();
      paramInt1 = getChildMeasureSpec(n, i1, getPaddingRight() + i2 + leftMargin + rightMargin + (i + j + paramInt1), width, canScrollHorizontally());
      i2 = getHeight();
      j = getHeightMode();
      n = getPaddingTop();
      paramInt2 = getChildMeasureSpec(i2, j, getPaddingBottom() + n + topMargin + bottomMargin + (k + m + paramInt2), height, canScrollVertically());
      if (shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams)) {
        paramView.measure(paramInt1, paramInt2);
      }
    }
    
    public void moveView(int paramInt1, int paramInt2)
    {
      Object localObject = getChildAt(paramInt1);
      if (localObject != null)
      {
        detachViewAt(paramInt1);
        attachView((View)localObject, paramInt2);
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cannot move a child from non-existing index:");
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append(mRecyclerView.toString());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public void offsetChildrenHorizontal(@Px int paramInt)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        localRecyclerView.offsetChildrenHorizontal(paramInt);
      }
    }
    
    public void offsetChildrenVertical(@Px int paramInt)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        localRecyclerView.offsetChildrenVertical(paramInt);
      }
    }
    
    public void onAdapterChanged(@Nullable RecyclerView.Adapter paramAdapter1, @Nullable RecyclerView.Adapter paramAdapter2) {}
    
    public boolean onAddFocusables(@NonNull RecyclerView paramRecyclerView, @NonNull ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
    {
      return false;
    }
    
    @CallSuper
    public void onAttachedToWindow(RecyclerView paramRecyclerView) {}
    
    @Deprecated
    public void onDetachedFromWindow(RecyclerView paramRecyclerView) {}
    
    @CallSuper
    public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
    {
      onDetachedFromWindow(paramRecyclerView);
    }
    
    @Nullable
    public View onFocusSearchFailed(@NonNull View paramView, int paramInt, @NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
    {
      return null;
    }
    
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      onInitializeAccessibilityEvent(mRecycler, mState, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityEvent(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull AccessibilityEvent paramAccessibilityEvent)
    {
      paramRecycler = mRecyclerView;
      if ((paramRecycler != null) && (paramAccessibilityEvent != null))
      {
        boolean bool1 = true;
        boolean bool2 = bool1;
        if (!paramRecycler.canScrollVertically(1))
        {
          bool2 = bool1;
          if (!mRecyclerView.canScrollVertically(-1))
          {
            bool2 = bool1;
            if (!mRecyclerView.canScrollHorizontally(-1)) {
              if (mRecyclerView.canScrollHorizontally(1)) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }
            }
          }
        }
        paramAccessibilityEvent.setScrollable(bool2);
        paramRecycler = mRecyclerView.mAdapter;
        if (paramRecycler != null) {
          paramAccessibilityEvent.setItemCount(paramRecycler.getItemCount());
        }
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      onInitializeAccessibilityNodeInfo(mRecycler, mState, paramAccessibilityNodeInfoCompat);
    }
    
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      if ((mRecyclerView.canScrollVertically(-1)) || (mRecyclerView.canScrollHorizontally(-1)))
      {
        paramAccessibilityNodeInfoCompat.addAction(8192);
        paramAccessibilityNodeInfoCompat.setScrollable(true);
      }
      if ((mRecyclerView.canScrollVertically(1)) || (mRecyclerView.canScrollHorizontally(1)))
      {
        paramAccessibilityNodeInfoCompat.addAction(4096);
        paramAccessibilityNodeInfoCompat.setScrollable(true);
      }
      paramAccessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(paramRecycler, paramState), getColumnCountForAccessibility(paramRecycler, paramState), isLayoutHierarchical(paramRecycler, paramState), getSelectionModeForAccessibility(paramRecycler, paramState)));
    }
    
    public void onInitializeAccessibilityNodeInfoForItem(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      Object localObject = RecyclerView.getChildViewHolderInt(paramView);
      if ((localObject != null) && (!((RecyclerView.ViewHolder)localObject).isRemoved()) && (!mChildHelper.isHidden(itemView)))
      {
        localObject = mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(mRecycler, mState, paramView, paramAccessibilityNodeInfoCompat);
      }
    }
    
    public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull View paramView, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
    
    @Nullable
    public View onInterceptFocusSearch(@NonNull View paramView, int paramInt)
    {
      return null;
    }
    
    public void onItemsAdded(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void onItemsChanged(@NonNull RecyclerView paramRecyclerView) {}
    
    public void onItemsMoved(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onItemsRemoved(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void onItemsUpdated(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void onItemsUpdated(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2, @Nullable Object paramObject)
    {
      onItemsUpdated(paramRecyclerView, paramInt1, paramInt2);
    }
    
    public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
    {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }
    
    public void onLayoutCompleted(RecyclerView.State paramState) {}
    
    public void onMeasure(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, int paramInt1, int paramInt2)
    {
      mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
    }
    
    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView1, @Nullable View paramView2)
    {
      boolean bool;
      if ((!isSmoothScrolling()) && (!paramRecyclerView.isComputingLayout())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean onRequestChildFocus(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.State paramState, @NonNull View paramView1, @Nullable View paramView2)
    {
      return onRequestChildFocus(paramRecyclerView, paramView1, paramView2);
    }
    
    public void onRestoreInstanceState(Parcelable paramParcelable) {}
    
    @Nullable
    public Parcelable onSaveInstanceState()
    {
      return null;
    }
    
    public void onScrollStateChanged(int paramInt) {}
    
    public void onSmoothScrollerStopped(RecyclerView.SmoothScroller paramSmoothScroller)
    {
      if (mSmoothScroller == paramSmoothScroller) {
        mSmoothScroller = null;
      }
    }
    
    public boolean performAccessibilityAction(int paramInt, @Nullable Bundle paramBundle)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      return performAccessibilityAction(mRecycler, mState, paramInt, paramBundle);
    }
    
    public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, int paramInt, @Nullable Bundle paramBundle)
    {
      paramRecycler = mRecyclerView;
      if (paramRecycler == null) {
        return false;
      }
      if (paramInt != 4096)
      {
        if (paramInt != 8192)
        {
          paramInt = 0;
          i = paramInt;
          break label169;
        }
        if (paramRecycler.canScrollVertically(-1)) {
          paramInt = -(getHeight() - getPaddingTop() - getPaddingBottom());
        } else {
          paramInt = 0;
        }
        i = paramInt;
        if (!mRecyclerView.canScrollHorizontally(-1)) {
          break label167;
        }
        i = -(getWidth() - getPaddingLeft() - getPaddingRight());
      }
      else
      {
        if (paramRecycler.canScrollVertically(1)) {
          paramInt = getHeight() - getPaddingTop() - getPaddingBottom();
        } else {
          paramInt = 0;
        }
        i = paramInt;
        if (!mRecyclerView.canScrollHorizontally(1)) {
          break label167;
        }
        i = getWidth() - getPaddingLeft() - getPaddingRight();
      }
      int j = paramInt;
      paramInt = i;
      int i = j;
      break label169;
      label167:
      paramInt = 0;
      label169:
      if ((i == 0) && (paramInt == 0)) {
        return false;
      }
      mRecyclerView.smoothScrollBy(paramInt, i, null, Integer.MIN_VALUE, true);
      return true;
    }
    
    public boolean performAccessibilityActionForItem(@NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      return performAccessibilityActionForItem(mRecycler, mState, paramView, paramInt, paramBundle);
    }
    
    public boolean performAccessibilityActionForItem(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
    {
      return false;
    }
    
    public void postOnAnimation(Runnable paramRunnable)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        ViewCompat.postOnAnimation(localRecyclerView, paramRunnable);
      }
    }
    
    public void removeAllViews()
    {
      for (int i = getChildCount() - 1; i >= 0; i--) {
        mChildHelper.removeViewAt(i);
      }
    }
    
    public void removeAndRecycleAllViews(@NonNull RecyclerView.Recycler paramRecycler)
    {
      for (int i = getChildCount() - 1; i >= 0; i--) {
        if (!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore()) {
          removeAndRecycleViewAt(i, paramRecycler);
        }
      }
    }
    
    public void removeAndRecycleScrapInt(RecyclerView.Recycler paramRecycler)
    {
      int i = paramRecycler.getScrapCount();
      for (int j = i - 1; j >= 0; j--)
      {
        View localView = paramRecycler.getScrapViewAt(j);
        RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
        if (!localViewHolder.shouldIgnore())
        {
          localViewHolder.setIsRecyclable(false);
          if (localViewHolder.isTmpDetached()) {
            mRecyclerView.removeDetachedView(localView, false);
          }
          RecyclerView.ItemAnimator localItemAnimator = mRecyclerView.mItemAnimator;
          if (localItemAnimator != null) {
            localItemAnimator.endAnimation(localViewHolder);
          }
          localViewHolder.setIsRecyclable(true);
          paramRecycler.quickRecycleScrapView(localView);
        }
      }
      paramRecycler.clearScrap();
      if (i > 0) {
        mRecyclerView.invalidate();
      }
    }
    
    public void removeAndRecycleView(@NonNull View paramView, @NonNull RecyclerView.Recycler paramRecycler)
    {
      removeView(paramView);
      paramRecycler.recycleView(paramView);
    }
    
    public void removeAndRecycleViewAt(int paramInt, @NonNull RecyclerView.Recycler paramRecycler)
    {
      View localView = getChildAt(paramInt);
      removeViewAt(paramInt);
      paramRecycler.recycleView(localView);
    }
    
    public boolean removeCallbacks(Runnable paramRunnable)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        return localRecyclerView.removeCallbacks(paramRunnable);
      }
      return false;
    }
    
    public void removeDetachedView(@NonNull View paramView)
    {
      mRecyclerView.removeDetachedView(paramView, false);
    }
    
    public void removeView(View paramView)
    {
      mChildHelper.removeView(paramView);
    }
    
    public void removeViewAt(int paramInt)
    {
      if (getChildAt(paramInt) != null) {
        mChildHelper.removeViewAt(paramInt);
      }
    }
    
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean)
    {
      return requestChildRectangleOnScreen(paramRecyclerView, paramView, paramRect, paramBoolean, false);
    }
    
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
    {
      paramView = getChildRectangleOnScreenScrollAmount(paramView, paramRect);
      int i = paramView[0];
      int j = paramView[1];
      if (((paramBoolean2) && (!isFocusedChildVisibleAfterScrolling(paramRecyclerView, i, j))) || ((i == 0) && (j == 0))) {
        return false;
      }
      if (paramBoolean1) {
        paramRecyclerView.scrollBy(i, j);
      } else {
        paramRecyclerView.smoothScrollBy(i, j);
      }
      return true;
    }
    
    public void requestLayout()
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        localRecyclerView.requestLayout();
      }
    }
    
    public void requestSimpleAnimationsInNextLayout()
    {
      mRequestedSimpleAnimations = true;
    }
    
    public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
    {
      return 0;
    }
    
    public void scrollToPosition(int paramInt) {}
    
    public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
    {
      return 0;
    }
    
    @Deprecated
    public void setAutoMeasureEnabled(boolean paramBoolean)
    {
      mAutoMeasure = paramBoolean;
    }
    
    public void setExactMeasureSpecsFrom(RecyclerView paramRecyclerView)
    {
      setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
    }
    
    public final void setItemPrefetchEnabled(boolean paramBoolean)
    {
      if (paramBoolean != mItemPrefetchEnabled)
      {
        mItemPrefetchEnabled = paramBoolean;
        mPrefetchMaxCountObserved = 0;
        RecyclerView localRecyclerView = mRecyclerView;
        if (localRecyclerView != null) {
          mRecycler.updateViewCacheSize();
        }
      }
    }
    
    public void setMeasureSpecs(int paramInt1, int paramInt2)
    {
      mWidth = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = View.MeasureSpec.getMode(paramInt1);
      mWidthMode = paramInt1;
      if ((paramInt1 == 0) && (!RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)) {
        mWidth = 0;
      }
      mHeight = View.MeasureSpec.getSize(paramInt2);
      paramInt1 = View.MeasureSpec.getMode(paramInt2);
      mHeightMode = paramInt1;
      if ((paramInt1 == 0) && (!RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)) {
        mHeight = 0;
      }
    }
    
    public void setMeasuredDimension(int paramInt1, int paramInt2)
    {
      RecyclerView.access$300(mRecyclerView, paramInt1, paramInt2);
    }
    
    public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
    {
      int i = paramRect.width();
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = paramRect.height();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      setMeasuredDimension(chooseSize(paramInt1, k + (j + i), getMinimumWidth()), chooseSize(paramInt2, i1 + (n + m), getMinimumHeight()));
    }
    
    public void setMeasuredDimensionFromChildren(int paramInt1, int paramInt2)
    {
      int i = getChildCount();
      if (i == 0)
      {
        mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
        return;
      }
      int j = 0;
      int k = Integer.MIN_VALUE;
      int m = Integer.MAX_VALUE;
      int n = m;
      int i1 = Integer.MIN_VALUE;
      while (j < i)
      {
        View localView = getChildAt(j);
        Rect localRect = mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(localView, localRect);
        int i2 = left;
        int i3 = m;
        if (i2 < m) {
          i3 = i2;
        }
        i2 = right;
        m = k;
        if (i2 > k) {
          m = i2;
        }
        k = top;
        i2 = n;
        if (k < n) {
          i2 = k;
        }
        k = bottom;
        n = i1;
        if (k > i1) {
          n = k;
        }
        j++;
        k = m;
        i1 = n;
        m = i3;
        n = i2;
      }
      mRecyclerView.mTempRect.set(m, n, k, i1);
      setMeasuredDimension(mRecyclerView.mTempRect, paramInt1, paramInt2);
    }
    
    public void setMeasurementCacheEnabled(boolean paramBoolean)
    {
      mMeasurementCacheEnabled = paramBoolean;
    }
    
    public void setRecyclerView(RecyclerView paramRecyclerView)
    {
      if (paramRecyclerView == null)
      {
        mRecyclerView = null;
        mChildHelper = null;
        mWidth = 0;
        mHeight = 0;
      }
      else
      {
        mRecyclerView = paramRecyclerView;
        mChildHelper = mChildHelper;
        mWidth = paramRecyclerView.getWidth();
        mHeight = paramRecyclerView.getHeight();
      }
      mWidthMode = 1073741824;
      mHeightMode = 1073741824;
    }
    
    public boolean shouldMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
    {
      boolean bool;
      if ((!paramView.isLayoutRequested()) && (mMeasurementCacheEnabled) && (isMeasurementUpToDate(paramView.getWidth(), paramInt1, width)) && (isMeasurementUpToDate(paramView.getHeight(), paramInt2, height))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean shouldMeasureTwice()
    {
      return false;
    }
    
    public boolean shouldReMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
    {
      boolean bool;
      if ((mMeasurementCacheEnabled) && (isMeasurementUpToDate(paramView.getMeasuredWidth(), paramInt1, width)) && (isMeasurementUpToDate(paramView.getMeasuredHeight(), paramInt2, height))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
    {
      Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    
    public void startSmoothScroll(RecyclerView.SmoothScroller paramSmoothScroller)
    {
      RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
      if ((localSmoothScroller != null) && (paramSmoothScroller != localSmoothScroller) && (localSmoothScroller.isRunning())) {
        mSmoothScroller.stop();
      }
      mSmoothScroller = paramSmoothScroller;
      paramSmoothScroller.start(mRecyclerView, this);
    }
    
    public void stopIgnoringView(@NonNull View paramView)
    {
      paramView = RecyclerView.getChildViewHolderInt(paramView);
      paramView.stopIgnoring();
      paramView.resetInternal();
      paramView.addFlags(4);
    }
    
    public void stopSmoothScroller()
    {
      RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
      if (localSmoothScroller != null) {
        localSmoothScroller.stop();
      }
    }
    
    public boolean supportsPredictiveItemAnimations()
    {
      return false;
    }
    
    public static abstract interface LayoutPrefetchRegistry
    {
      public abstract void addPosition(int paramInt1, int paramInt2);
    }
    
    public static class Properties
    {
      public int orientation;
      public boolean reverseLayout;
      public int spanCount;
      public boolean stackFromEnd;
    }
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public final Rect mDecorInsets = new Rect();
    public boolean mInsetsDirty = true;
    public boolean mPendingInvalidate = false;
    public RecyclerView.ViewHolder mViewHolder;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
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
    
    public int getAbsoluteAdapterPosition()
    {
      return mViewHolder.getAbsoluteAdapterPosition();
    }
    
    public int getBindingAdapterPosition()
    {
      return mViewHolder.getBindingAdapterPosition();
    }
    
    @Deprecated
    public int getViewAdapterPosition()
    {
      return mViewHolder.getBindingAdapterPosition();
    }
    
    public int getViewLayoutPosition()
    {
      return mViewHolder.getLayoutPosition();
    }
    
    @Deprecated
    public int getViewPosition()
    {
      return mViewHolder.getPosition();
    }
    
    public boolean isItemChanged()
    {
      return mViewHolder.isUpdated();
    }
    
    public boolean isItemRemoved()
    {
      return mViewHolder.isRemoved();
    }
    
    public boolean isViewInvalid()
    {
      return mViewHolder.isInvalid();
    }
    
    public boolean viewNeedsUpdate()
    {
      return mViewHolder.needsUpdate();
    }
  }
  
  public static abstract interface OnChildAttachStateChangeListener
  {
    public abstract void onChildViewAttachedToWindow(@NonNull View paramView);
    
    public abstract void onChildViewDetachedFromWindow(@NonNull View paramView);
  }
  
  public static abstract class OnFlingListener
  {
    public abstract boolean onFling(int paramInt1, int paramInt2);
  }
  
  public static abstract interface OnItemTouchListener
  {
    public abstract boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent);
    
    public abstract void onRequestDisallowInterceptTouchEvent(boolean paramBoolean);
    
    public abstract void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent);
  }
  
  public static abstract class OnScrollListener
  {
    public void onScrollStateChanged(@NonNull RecyclerView paramRecyclerView, int paramInt) {}
    
    public void onScrolled(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Orientation {}
  
  public static class RecycledViewPool
  {
    private static final int DEFAULT_MAX_SCRAP = 5;
    private int mAttachCount = 0;
    public SparseArray<ScrapData> mScrap = new SparseArray();
    
    private ScrapData getScrapDataForType(int paramInt)
    {
      ScrapData localScrapData1 = (ScrapData)mScrap.get(paramInt);
      ScrapData localScrapData2 = localScrapData1;
      if (localScrapData1 == null)
      {
        localScrapData2 = new ScrapData();
        mScrap.put(paramInt, localScrapData2);
      }
      return localScrapData2;
    }
    
    public void attach()
    {
      mAttachCount += 1;
    }
    
    public void clear()
    {
      for (int i = 0; i < mScrap.size(); i++) {
        mScrap.valueAt(i)).mScrapHeap.clear();
      }
    }
    
    public void detach()
    {
      mAttachCount -= 1;
    }
    
    public void factorInBindTime(int paramInt, long paramLong)
    {
      ScrapData localScrapData = getScrapDataForType(paramInt);
      mBindRunningAverageNs = runningAverage(mBindRunningAverageNs, paramLong);
    }
    
    public void factorInCreateTime(int paramInt, long paramLong)
    {
      ScrapData localScrapData = getScrapDataForType(paramInt);
      mCreateRunningAverageNs = runningAverage(mCreateRunningAverageNs, paramLong);
    }
    
    @Nullable
    public RecyclerView.ViewHolder getRecycledView(int paramInt)
    {
      Object localObject = (ScrapData)mScrap.get(paramInt);
      if ((localObject != null) && (!mScrapHeap.isEmpty()))
      {
        localObject = mScrapHeap;
        for (paramInt = ((ArrayList)localObject).size() - 1; paramInt >= 0; paramInt--) {
          if (!((RecyclerView.ViewHolder)((ArrayList)localObject).get(paramInt)).isAttachedToTransitionOverlay()) {
            return (RecyclerView.ViewHolder)((ArrayList)localObject).remove(paramInt);
          }
        }
      }
      return null;
    }
    
    public int getRecycledViewCount(int paramInt)
    {
      return getScrapDataForTypemScrapHeap.size();
    }
    
    public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
    {
      if (paramAdapter1 != null) {
        detach();
      }
      if ((!paramBoolean) && (mAttachCount == 0)) {
        clear();
      }
      if (paramAdapter2 != null) {
        attach();
      }
    }
    
    public void putRecycledView(RecyclerView.ViewHolder paramViewHolder)
    {
      int i = paramViewHolder.getItemViewType();
      ArrayList localArrayList = getScrapDataForTypemScrapHeap;
      if (mScrap.get(i)).mMaxScrap <= localArrayList.size()) {
        return;
      }
      paramViewHolder.resetInternal();
      localArrayList.add(paramViewHolder);
    }
    
    public long runningAverage(long paramLong1, long paramLong2)
    {
      if (paramLong1 == 0L) {
        return paramLong2;
      }
      paramLong1 /= 4L;
      return paramLong2 / 4L + paramLong1 * 3L;
    }
    
    public void setMaxRecycledViews(int paramInt1, int paramInt2)
    {
      Object localObject = getScrapDataForType(paramInt1);
      mMaxScrap = paramInt2;
      localObject = mScrapHeap;
      while (((ArrayList)localObject).size() > paramInt2) {
        ((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
      }
    }
    
    public int size()
    {
      int i = 0;
      int k;
      for (int j = 0; i < mScrap.size(); j = k)
      {
        ArrayList localArrayList = mScrap.valueAt(i)).mScrapHeap;
        k = j;
        if (localArrayList != null) {
          k = localArrayList.size() + j;
        }
        i++;
      }
      return j;
    }
    
    public boolean willBindInTime(int paramInt, long paramLong1, long paramLong2)
    {
      long l = getScrapDataForTypemBindRunningAverageNs;
      boolean bool;
      if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean willCreateInTime(int paramInt, long paramLong1, long paramLong2)
    {
      long l = getScrapDataForTypemCreateRunningAverageNs;
      boolean bool;
      if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public static class ScrapData
    {
      public long mBindRunningAverageNs = 0L;
      public long mCreateRunningAverageNs = 0L;
      public int mMaxScrap = 5;
      public final ArrayList<RecyclerView.ViewHolder> mScrapHeap = new ArrayList();
    }
  }
  
  public final class Recycler
  {
    public static final int DEFAULT_CACHE_SIZE = 2;
    public final ArrayList<RecyclerView.ViewHolder> mAttachedScrap;
    public final ArrayList<RecyclerView.ViewHolder> mCachedViews;
    public ArrayList<RecyclerView.ViewHolder> mChangedScrap;
    public RecyclerView.RecycledViewPool mRecyclerPool;
    private int mRequestedCacheMax;
    private final List<RecyclerView.ViewHolder> mUnmodifiableAttachedScrap;
    private RecyclerView.ViewCacheExtension mViewCacheExtension;
    public int mViewCacheMax;
    
    public Recycler()
    {
      this$1 = new ArrayList();
      mAttachedScrap = RecyclerView.this;
      mChangedScrap = null;
      mCachedViews = new ArrayList();
      mUnmodifiableAttachedScrap = Collections.unmodifiableList(RecyclerView.this);
      mRequestedCacheMax = 2;
      mViewCacheMax = 2;
    }
    
    private void attachAccessibilityDelegateOnBind(RecyclerView.ViewHolder paramViewHolder)
    {
      if (isAccessibilityEnabled())
      {
        paramViewHolder = itemView;
        if (ViewCompat.getImportantForAccessibility(paramViewHolder) == 0) {
          ViewCompat.setImportantForAccessibility(paramViewHolder, 1);
        }
        Object localObject = mAccessibilityDelegate;
        if (localObject == null) {
          return;
        }
        localObject = ((RecyclerViewAccessibilityDelegate)localObject).getItemDelegate();
        if ((localObject instanceof RecyclerViewAccessibilityDelegate.ItemDelegate)) {
          ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject).saveOriginalDelegate(paramViewHolder);
        }
        ViewCompat.setAccessibilityDelegate(paramViewHolder, (AccessibilityDelegateCompat)localObject);
      }
    }
    
    private void invalidateDisplayListInt(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      for (int i = paramViewGroup.getChildCount() - 1; i >= 0; i--)
      {
        View localView = paramViewGroup.getChildAt(i);
        if ((localView instanceof ViewGroup)) {
          invalidateDisplayListInt((ViewGroup)localView, true);
        }
      }
      if (!paramBoolean) {
        return;
      }
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
      }
      else
      {
        i = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(4);
        paramViewGroup.setVisibility(i);
      }
    }
    
    private void invalidateDisplayListInt(RecyclerView.ViewHolder paramViewHolder)
    {
      paramViewHolder = itemView;
      if ((paramViewHolder instanceof ViewGroup)) {
        invalidateDisplayListInt((ViewGroup)paramViewHolder, false);
      }
    }
    
    private boolean tryBindViewHolderByDeadline(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, long paramLong)
    {
      mBindingAdapter = null;
      mOwnerRecyclerView = RecyclerView.this;
      int i = paramViewHolder.getItemViewType();
      long l = getNanoTime();
      if ((paramLong != Long.MAX_VALUE) && (!mRecyclerPool.willBindInTime(i, l, paramLong))) {
        return false;
      }
      mAdapter.bindViewHolder(paramViewHolder, paramInt1);
      paramLong = getNanoTime();
      mRecyclerPool.factorInBindTime(paramViewHolder.getItemViewType(), paramLong - l);
      attachAccessibilityDelegateOnBind(paramViewHolder);
      if (mState.isPreLayout()) {
        mPreLayoutPosition = paramInt2;
      }
      return true;
    }
    
    public void addViewHolderToRecycledViewPool(@NonNull RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
    {
      RecyclerView.clearNestedRecyclerViewIfNotNested(paramViewHolder);
      View localView = itemView;
      Object localObject = mAccessibilityDelegate;
      if (localObject != null)
      {
        localObject = ((RecyclerViewAccessibilityDelegate)localObject).getItemDelegate();
        if ((localObject instanceof RecyclerViewAccessibilityDelegate.ItemDelegate)) {
          localObject = ((RecyclerViewAccessibilityDelegate.ItemDelegate)localObject).getAndRemoveOriginalDelegateForItem(localView);
        } else {
          localObject = null;
        }
        ViewCompat.setAccessibilityDelegate(localView, (AccessibilityDelegateCompat)localObject);
      }
      if (paramBoolean) {
        dispatchViewRecycled(paramViewHolder);
      }
      mBindingAdapter = null;
      mOwnerRecyclerView = null;
      getRecycledViewPool().putRecycledView(paramViewHolder);
    }
    
    public void bindViewToPosition(@NonNull View paramView, int paramInt)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      if (localViewHolder != null)
      {
        int i = mAdapterHelper.findPositionOffset(paramInt);
        if ((i >= 0) && (i < mAdapter.getItemCount()))
        {
          tryBindViewHolderByDeadline(localViewHolder, i, paramInt, Long.MAX_VALUE);
          paramView = itemView.getLayoutParams();
          if (paramView == null)
          {
            paramView = (RecyclerView.LayoutParams)generateDefaultLayoutParams();
            itemView.setLayoutParams(paramView);
          }
          else if (!checkLayoutParams(paramView))
          {
            paramView = (RecyclerView.LayoutParams)generateLayoutParams(paramView);
            itemView.setLayoutParams(paramView);
          }
          else
          {
            paramView = (RecyclerView.LayoutParams)paramView;
          }
          boolean bool = true;
          mInsetsDirty = true;
          mViewHolder = localViewHolder;
          if (itemView.getParent() != null) {
            bool = false;
          }
          mPendingInvalidate = bool;
          return;
        }
        paramView = new StringBuilder();
        paramView.append("Inconsistency detected. Invalid item position ");
        paramView.append(paramInt);
        paramView.append("(offset:");
        paramView.append(i);
        paramView.append(").state:");
        paramView.append(mState.getItemCount());
        throw new IndexOutOfBoundsException(z2.m(RecyclerView.this, paramView));
      }
      paramView = z2.t("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
      throw new IllegalArgumentException(z2.m(RecyclerView.this, paramView));
    }
    
    public void clear()
    {
      mAttachedScrap.clear();
      recycleAndClearCachedViews();
    }
    
    public void clearOldPositions()
    {
      int i = mCachedViews.size();
      int j = 0;
      for (int k = 0; k < i; k++) {
        ((RecyclerView.ViewHolder)mCachedViews.get(k)).clearOldPosition();
      }
      i = mAttachedScrap.size();
      for (k = 0; k < i; k++) {
        ((RecyclerView.ViewHolder)mAttachedScrap.get(k)).clearOldPosition();
      }
      ArrayList localArrayList = mChangedScrap;
      if (localArrayList != null)
      {
        i = localArrayList.size();
        for (k = j; k < i; k++) {
          ((RecyclerView.ViewHolder)mChangedScrap.get(k)).clearOldPosition();
        }
      }
    }
    
    public void clearScrap()
    {
      mAttachedScrap.clear();
      ArrayList localArrayList = mChangedScrap;
      if (localArrayList != null) {
        localArrayList.clear();
      }
    }
    
    public int convertPreLayoutPositionToPostLayout(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt < mState.getItemCount()))
      {
        if (!mState.isPreLayout()) {
          return paramInt;
        }
        return mAdapterHelper.findPositionOffset(paramInt);
      }
      StringBuilder localStringBuilder = a.r("invalid position ", paramInt, ". State item count is ");
      localStringBuilder.append(mState.getItemCount());
      throw new IndexOutOfBoundsException(z2.m(RecyclerView.this, localStringBuilder));
    }
    
    public void dispatchViewRecycled(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      Object localObject = mRecyclerListener;
      if (localObject != null) {
        ((RecyclerView.RecyclerListener)localObject).onViewRecycled(paramViewHolder);
      }
      int i = mRecyclerListeners.size();
      for (int j = 0; j < i; j++) {
        ((RecyclerView.RecyclerListener)mRecyclerListeners.get(j)).onViewRecycled(paramViewHolder);
      }
      localObject = mAdapter;
      if (localObject != null) {
        ((RecyclerView.Adapter)localObject).onViewRecycled(paramViewHolder);
      }
      localObject = RecyclerView.this;
      if (mState != null) {
        mViewInfoStore.removeViewHolder(paramViewHolder);
      }
    }
    
    public RecyclerView.ViewHolder getChangedScrapViewForPosition(int paramInt)
    {
      Object localObject = mChangedScrap;
      if (localObject != null)
      {
        int i = ((ArrayList)localObject).size();
        if (i != 0)
        {
          int j = 0;
          for (int k = 0; k < i; k++)
          {
            localObject = (RecyclerView.ViewHolder)mChangedScrap.get(k);
            if ((!((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap()) && (((RecyclerView.ViewHolder)localObject).getLayoutPosition() == paramInt))
            {
              ((RecyclerView.ViewHolder)localObject).addFlags(32);
              return (RecyclerView.ViewHolder)localObject;
            }
          }
          if (mAdapter.hasStableIds())
          {
            paramInt = mAdapterHelper.findPositionOffset(paramInt);
            if ((paramInt > 0) && (paramInt < mAdapter.getItemCount()))
            {
              long l = mAdapter.getItemId(paramInt);
              for (paramInt = j; paramInt < i; paramInt++)
              {
                localObject = (RecyclerView.ViewHolder)mChangedScrap.get(paramInt);
                if ((!((RecyclerView.ViewHolder)localObject).wasReturnedFromScrap()) && (((RecyclerView.ViewHolder)localObject).getItemId() == l))
                {
                  ((RecyclerView.ViewHolder)localObject).addFlags(32);
                  return (RecyclerView.ViewHolder)localObject;
                }
              }
            }
          }
        }
      }
      return null;
    }
    
    public RecyclerView.RecycledViewPool getRecycledViewPool()
    {
      if (mRecyclerPool == null) {
        mRecyclerPool = new RecyclerView.RecycledViewPool();
      }
      return mRecyclerPool;
    }
    
    public int getScrapCount()
    {
      return mAttachedScrap.size();
    }
    
    @NonNull
    public List<RecyclerView.ViewHolder> getScrapList()
    {
      return mUnmodifiableAttachedScrap;
    }
    
    public RecyclerView.ViewHolder getScrapOrCachedViewForId(long paramLong, int paramInt, boolean paramBoolean)
    {
      RecyclerView.ViewHolder localViewHolder;
      for (int i = mAttachedScrap.size() - 1; i >= 0; i--)
      {
        localViewHolder = (RecyclerView.ViewHolder)mAttachedScrap.get(i);
        if ((localViewHolder.getItemId() == paramLong) && (!localViewHolder.wasReturnedFromScrap()))
        {
          if (paramInt == localViewHolder.getItemViewType())
          {
            localViewHolder.addFlags(32);
            if ((localViewHolder.isRemoved()) && (!mState.isPreLayout())) {
              localViewHolder.setFlags(2, 14);
            }
            return localViewHolder;
          }
          if (!paramBoolean)
          {
            mAttachedScrap.remove(i);
            removeDetachedView(itemView, false);
            quickRecycleScrapView(itemView);
          }
        }
      }
      for (i = mCachedViews.size() - 1; i >= 0; i--)
      {
        localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
        if ((localViewHolder.getItemId() == paramLong) && (!localViewHolder.isAttachedToTransitionOverlay()))
        {
          if (paramInt == localViewHolder.getItemViewType())
          {
            if (!paramBoolean) {
              mCachedViews.remove(i);
            }
            return localViewHolder;
          }
          if (!paramBoolean)
          {
            recycleCachedViewAt(i);
            return null;
          }
        }
      }
      return null;
    }
    
    public RecyclerView.ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int paramInt, boolean paramBoolean)
    {
      int i = mAttachedScrap.size();
      int j = 0;
      RecyclerView.ViewHolder localViewHolder;
      for (int k = 0; k < i; k++)
      {
        localViewHolder = (RecyclerView.ViewHolder)mAttachedScrap.get(k);
        if ((!localViewHolder.wasReturnedFromScrap()) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isInvalid()) && ((mState.mInPreLayout) || (!localViewHolder.isRemoved())))
        {
          localViewHolder.addFlags(32);
          return localViewHolder;
        }
      }
      if (!paramBoolean)
      {
        Object localObject = mChildHelper.findHiddenNonRemovedView(paramInt);
        if (localObject != null)
        {
          localViewHolder = RecyclerView.getChildViewHolderInt((View)localObject);
          mChildHelper.unhide((View)localObject);
          paramInt = mChildHelper.indexOfChild((View)localObject);
          if (paramInt != -1)
          {
            mChildHelper.detachViewFromParent(paramInt);
            scrapView((View)localObject);
            localViewHolder.addFlags(8224);
            return localViewHolder;
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("layout index should not be -1 after unhiding a view:");
          ((StringBuilder)localObject).append(localViewHolder);
          throw new IllegalStateException(z2.m(RecyclerView.this, (StringBuilder)localObject));
        }
      }
      i = mCachedViews.size();
      for (k = j; k < i; k++)
      {
        localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(k);
        if ((!localViewHolder.isInvalid()) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isAttachedToTransitionOverlay()))
        {
          if (!paramBoolean) {
            mCachedViews.remove(k);
          }
          return localViewHolder;
        }
      }
      return null;
    }
    
    public View getScrapViewAt(int paramInt)
    {
      return mAttachedScrap.get(paramInt)).itemView;
    }
    
    @NonNull
    public View getViewForPosition(int paramInt)
    {
      return getViewForPosition(paramInt, false);
    }
    
    public View getViewForPosition(int paramInt, boolean paramBoolean)
    {
      return tryGetViewHolderForPositionByDeadlineMAX_VALUEitemView;
    }
    
    public void markItemDecorInsetsDirty()
    {
      int i = mCachedViews.size();
      for (int j = 0; j < i; j++)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)mCachedViews.get(j)).itemView.getLayoutParams();
        if (localLayoutParams != null) {
          mInsetsDirty = true;
        }
      }
    }
    
    public void markKnownViewsInvalid()
    {
      int i = mCachedViews.size();
      for (int j = 0; j < i; j++)
      {
        localObject = (RecyclerView.ViewHolder)mCachedViews.get(j);
        if (localObject != null)
        {
          ((RecyclerView.ViewHolder)localObject).addFlags(6);
          ((RecyclerView.ViewHolder)localObject).addChangePayload(null);
        }
      }
      Object localObject = mAdapter;
      if ((localObject == null) || (!((RecyclerView.Adapter)localObject).hasStableIds())) {
        recycleAndClearCachedViews();
      }
    }
    
    public void offsetPositionRecordsForInsert(int paramInt1, int paramInt2)
    {
      int i = mCachedViews.size();
      for (int j = 0; j < i; j++)
      {
        RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(j);
        if ((localViewHolder != null) && (mPosition >= paramInt1)) {
          localViewHolder.offsetPosition(paramInt2, false);
        }
      }
    }
    
    public void offsetPositionRecordsForMove(int paramInt1, int paramInt2)
    {
      int i;
      int j;
      int k;
      if (paramInt1 < paramInt2)
      {
        i = -1;
        j = paramInt1;
        k = paramInt2;
      }
      else
      {
        i = 1;
        k = paramInt1;
        j = paramInt2;
      }
      int m = mCachedViews.size();
      for (int n = 0; n < m; n++)
      {
        RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(n);
        if (localViewHolder != null)
        {
          int i1 = mPosition;
          if ((i1 >= j) && (i1 <= k)) {
            if (i1 == paramInt1) {
              localViewHolder.offsetPosition(paramInt2 - paramInt1, false);
            } else {
              localViewHolder.offsetPosition(i, false);
            }
          }
        }
      }
    }
    
    public void offsetPositionRecordsForRemove(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      for (int i = mCachedViews.size() - 1; i >= 0; i--)
      {
        RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
        if (localViewHolder != null)
        {
          int j = mPosition;
          if (j >= paramInt1 + paramInt2)
          {
            localViewHolder.offsetPosition(-paramInt2, paramBoolean);
          }
          else if (j >= paramInt1)
          {
            localViewHolder.addFlags(8);
            recycleCachedViewAt(i);
          }
        }
      }
    }
    
    public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
    {
      clear();
      getRecycledViewPool().onAdapterChanged(paramAdapter1, paramAdapter2, paramBoolean);
    }
    
    public void quickRecycleScrapView(View paramView)
    {
      paramView = RecyclerView.getChildViewHolderInt(paramView);
      mScrapContainer = null;
      mInChangeScrap = false;
      paramView.clearReturnedFromScrapFlag();
      recycleViewHolderInternal(paramView);
    }
    
    public void recycleAndClearCachedViews()
    {
      for (int i = mCachedViews.size() - 1; i >= 0; i--) {
        recycleCachedViewAt(i);
      }
      mCachedViews.clear();
      if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
        mPrefetchRegistry.clearPrefetchPositions();
      }
    }
    
    public void recycleCachedViewAt(int paramInt)
    {
      addViewHolderToRecycledViewPool((RecyclerView.ViewHolder)mCachedViews.get(paramInt), true);
      mCachedViews.remove(paramInt);
    }
    
    public void recycleView(@NonNull View paramView)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
      if (localViewHolder.isTmpDetached()) {
        removeDetachedView(paramView, false);
      }
      if (localViewHolder.isScrap()) {
        localViewHolder.unScrap();
      } else if (localViewHolder.wasReturnedFromScrap()) {
        localViewHolder.clearReturnedFromScrapFlag();
      }
      recycleViewHolderInternal(localViewHolder);
      if ((mItemAnimator != null) && (!localViewHolder.isRecyclable())) {
        mItemAnimator.endAnimation(localViewHolder);
      }
    }
    
    public void recycleViewHolderInternal(RecyclerView.ViewHolder paramViewHolder)
    {
      boolean bool1 = paramViewHolder.isScrap();
      int i = 0;
      boolean bool2 = false;
      int j = 0;
      if ((!bool1) && (itemView.getParent() == null))
      {
        if (!paramViewHolder.isTmpDetached())
        {
          if (!paramViewHolder.shouldIgnore())
          {
            bool2 = paramViewHolder.doesTransientStatePreventRecycling();
            localObject = mAdapter;
            int k;
            if ((localObject != null) && (bool2) && (((RecyclerView.Adapter)localObject).onFailedToRecycleView(paramViewHolder))) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k == 0) && (!paramViewHolder.isRecyclable()))
            {
              k = 0;
            }
            else
            {
              if ((mViewCacheMax > 0) && (!paramViewHolder.hasAnyOfTheFlags(526)))
              {
                i = mCachedViews.size();
                k = i;
                if (i >= mViewCacheMax)
                {
                  k = i;
                  if (i > 0)
                  {
                    recycleCachedViewAt(0);
                    k = i - 1;
                  }
                }
                i = k;
                if (RecyclerView.ALLOW_THREAD_GAP_WORK)
                {
                  i = k;
                  if (k > 0)
                  {
                    i = k;
                    if (!mPrefetchRegistry.lastPrefetchIncludedPosition(mPosition))
                    {
                      int m;
                      do
                      {
                        i = k - 1;
                        if (i < 0) {
                          break;
                        }
                        m = mCachedViews.get(i)).mPosition;
                        k = i;
                      } while (mPrefetchRegistry.lastPrefetchIncludedPosition(m));
                      i++;
                    }
                  }
                }
                mCachedViews.add(i, paramViewHolder);
                k = 1;
              }
              else
              {
                k = 0;
              }
              i = j;
              if (k == 0)
              {
                addViewHolderToRecycledViewPool(paramViewHolder, true);
                i = 1;
              }
              j = i;
              i = k;
              k = j;
            }
            mViewInfoStore.removeViewHolder(paramViewHolder);
            if ((i == 0) && (k == 0) && (bool2))
            {
              mBindingAdapter = null;
              mOwnerRecyclerView = null;
            }
            return;
          }
          paramViewHolder = z2.t("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
          throw new IllegalArgumentException(z2.m(RecyclerView.this, paramViewHolder));
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        ((StringBuilder)localObject).append(paramViewHolder);
        throw new IllegalArgumentException(z2.m(RecyclerView.this, (StringBuilder)localObject));
      }
      Object localObject = z2.t("Scrapped or attached views may not be recycled. isScrap:");
      ((StringBuilder)localObject).append(paramViewHolder.isScrap());
      ((StringBuilder)localObject).append(" isAttached:");
      if (itemView.getParent() != null) {
        bool2 = true;
      }
      ((StringBuilder)localObject).append(bool2);
      throw new IllegalArgumentException(z2.m(RecyclerView.this, (StringBuilder)localObject));
    }
    
    public void scrapView(View paramView)
    {
      paramView = RecyclerView.getChildViewHolderInt(paramView);
      if ((!paramView.hasAnyOfTheFlags(12)) && (paramView.isUpdated()) && (!canReuseUpdatedViewHolder(paramView)))
      {
        if (mChangedScrap == null) {
          mChangedScrap = new ArrayList();
        }
        paramView.setScrapContainer(this, true);
        mChangedScrap.add(paramView);
      }
      else
      {
        if ((paramView.isInvalid()) && (!paramView.isRemoved()) && (!mAdapter.hasStableIds()))
        {
          paramView = z2.t("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          throw new IllegalArgumentException(z2.m(RecyclerView.this, paramView));
        }
        paramView.setScrapContainer(this, false);
        mAttachedScrap.add(paramView);
      }
    }
    
    public void setRecycledViewPool(RecyclerView.RecycledViewPool paramRecycledViewPool)
    {
      RecyclerView.RecycledViewPool localRecycledViewPool = mRecyclerPool;
      if (localRecycledViewPool != null) {
        localRecycledViewPool.detach();
      }
      mRecyclerPool = paramRecycledViewPool;
      if ((paramRecycledViewPool != null) && (getAdapter() != null)) {
        mRecyclerPool.attach();
      }
    }
    
    public void setViewCacheExtension(RecyclerView.ViewCacheExtension paramViewCacheExtension)
    {
      mViewCacheExtension = paramViewCacheExtension;
    }
    
    public void setViewCacheSize(int paramInt)
    {
      mRequestedCacheMax = paramInt;
      updateViewCacheSize();
    }
    
    @Nullable
    public RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline(int paramInt, boolean paramBoolean, long paramLong)
    {
      if ((paramInt >= 0) && (paramInt < mState.getItemCount()))
      {
        boolean bool1 = mState.isPreLayout();
        boolean bool2 = true;
        if (bool1)
        {
          localObject1 = getChangedScrapViewForPosition(paramInt);
          localObject2 = localObject1;
          if (localObject1 != null)
          {
            i = 1;
            break label70;
          }
        }
        else
        {
          localObject2 = null;
        }
        int i = 0;
        Object localObject1 = localObject2;
        label70:
        localObject2 = localObject1;
        int j = i;
        if (localObject1 == null)
        {
          localObject1 = getScrapOrHiddenOrCachedHolderForPosition(paramInt, paramBoolean);
          localObject2 = localObject1;
          j = i;
          if (localObject1 != null) {
            if (!validateViewHolderForOffsetPosition((RecyclerView.ViewHolder)localObject1))
            {
              if (!paramBoolean)
              {
                ((RecyclerView.ViewHolder)localObject1).addFlags(4);
                if (((RecyclerView.ViewHolder)localObject1).isScrap())
                {
                  removeDetachedView(itemView, false);
                  ((RecyclerView.ViewHolder)localObject1).unScrap();
                }
                else if (((RecyclerView.ViewHolder)localObject1).wasReturnedFromScrap())
                {
                  ((RecyclerView.ViewHolder)localObject1).clearReturnedFromScrapFlag();
                }
                recycleViewHolderInternal((RecyclerView.ViewHolder)localObject1);
              }
              localObject2 = null;
              j = i;
            }
            else
            {
              j = 1;
              localObject2 = localObject1;
            }
          }
        }
        localObject1 = localObject2;
        int k = j;
        if (localObject2 == null)
        {
          k = mAdapterHelper.findPositionOffset(paramInt);
          if ((k >= 0) && (k < mAdapter.getItemCount()))
          {
            int m = mAdapter.getItemViewType(k);
            i = j;
            if (mAdapter.hasStableIds())
            {
              localObject1 = getScrapOrCachedViewForId(mAdapter.getItemId(k), m, paramBoolean);
              localObject2 = localObject1;
              i = j;
              if (localObject1 != null)
              {
                mPosition = k;
                i = 1;
                localObject2 = localObject1;
              }
            }
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              Object localObject3 = mViewCacheExtension;
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject3 = ((RecyclerView.ViewCacheExtension)localObject3).getViewForPositionAndType(this, paramInt, m);
                localObject1 = localObject2;
                if (localObject3 != null)
                {
                  localObject1 = getChildViewHolder((View)localObject3);
                  if (localObject1 != null)
                  {
                    if (((RecyclerView.ViewHolder)localObject1).shouldIgnore())
                    {
                      localObject2 = z2.t("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                      throw new IllegalArgumentException(z2.m(RecyclerView.this, (StringBuilder)localObject2));
                    }
                  }
                  else
                  {
                    localObject2 = z2.t("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    throw new IllegalArgumentException(z2.m(RecyclerView.this, (StringBuilder)localObject2));
                  }
                }
              }
            }
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              localObject2 = getRecycledViewPool().getRecycledView(m);
              if (localObject2 != null)
              {
                ((RecyclerView.ViewHolder)localObject2).resetInternal();
                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                  invalidateDisplayListInt((RecyclerView.ViewHolder)localObject2);
                }
              }
            }
            localObject1 = localObject2;
            k = i;
            if (localObject2 == null)
            {
              long l1 = getNanoTime();
              if ((paramLong != Long.MAX_VALUE) && (!mRecyclerPool.willCreateInTime(m, l1, paramLong))) {
                return null;
              }
              localObject2 = RecyclerView.this;
              localObject1 = mAdapter.createViewHolder((ViewGroup)localObject2, m);
              if (RecyclerView.ALLOW_THREAD_GAP_WORK)
              {
                localObject2 = RecyclerView.findNestedRecyclerView(itemView);
                if (localObject2 != null) {
                  mNestedRecyclerView = new WeakReference(localObject2);
                }
              }
              long l2 = getNanoTime();
              mRecyclerPool.factorInCreateTime(m, l2 - l1);
              break label691;
            }
          }
          else
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Inconsistency detected. Invalid item position ");
            ((StringBuilder)localObject2).append(paramInt);
            ((StringBuilder)localObject2).append("(offset:");
            ((StringBuilder)localObject2).append(k);
            ((StringBuilder)localObject2).append(").state:");
            ((StringBuilder)localObject2).append(mState.getItemCount());
            throw new IndexOutOfBoundsException(z2.m(RecyclerView.this, (StringBuilder)localObject2));
          }
        }
        i = k;
        label691:
        if ((i != 0) && (!mState.isPreLayout()) && (((RecyclerView.ViewHolder)localObject1).hasAnyOfTheFlags(8192)))
        {
          ((RecyclerView.ViewHolder)localObject1).setFlags(0, 8192);
          if (mState.mRunSimpleAnimations)
          {
            j = RecyclerView.ItemAnimator.buildAdapterChangeFlagsForAnimations((RecyclerView.ViewHolder)localObject1);
            localObject2 = RecyclerView.this;
            localObject2 = mItemAnimator.recordPreLayoutInformation(mState, (RecyclerView.ViewHolder)localObject1, j | 0x1000, ((RecyclerView.ViewHolder)localObject1).getUnmodifiedPayloads());
            recordAnimationInfoIfBouncedHiddenView((RecyclerView.ViewHolder)localObject1, (RecyclerView.ItemAnimator.ItemHolderInfo)localObject2);
          }
        }
        if ((mState.isPreLayout()) && (((RecyclerView.ViewHolder)localObject1).isBound())) {
          mPreLayoutPosition = paramInt;
        } else {
          if ((!((RecyclerView.ViewHolder)localObject1).isBound()) || (((RecyclerView.ViewHolder)localObject1).needsUpdate()) || (((RecyclerView.ViewHolder)localObject1).isInvalid())) {
            break label856;
          }
        }
        paramBoolean = false;
        break label876;
        label856:
        paramBoolean = tryBindViewHolderByDeadline((RecyclerView.ViewHolder)localObject1, mAdapterHelper.findPositionOffset(paramInt), paramInt, paramLong);
        label876:
        localObject2 = itemView.getLayoutParams();
        if (localObject2 == null)
        {
          localObject2 = (RecyclerView.LayoutParams)generateDefaultLayoutParams();
          itemView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject2))
        {
          localObject2 = (RecyclerView.LayoutParams)generateLayoutParams((ViewGroup.LayoutParams)localObject2);
          itemView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        else
        {
          localObject2 = (RecyclerView.LayoutParams)localObject2;
        }
        mViewHolder = ((RecyclerView.ViewHolder)localObject1);
        if ((i != 0) && (paramBoolean)) {
          paramBoolean = bool2;
        } else {
          paramBoolean = false;
        }
        mPendingInvalidate = paramBoolean;
        return (RecyclerView.ViewHolder)localObject1;
      }
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Invalid item position ");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append("(");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append("). Item count:");
      ((StringBuilder)localObject2).append(mState.getItemCount());
      throw new IndexOutOfBoundsException(z2.m(RecyclerView.this, (StringBuilder)localObject2));
    }
    
    public void unscrapView(RecyclerView.ViewHolder paramViewHolder)
    {
      if (mInChangeScrap) {
        mChangedScrap.remove(paramViewHolder);
      } else {
        mAttachedScrap.remove(paramViewHolder);
      }
      mScrapContainer = null;
      mInChangeScrap = false;
      paramViewHolder.clearReturnedFromScrapFlag();
    }
    
    public void updateViewCacheSize()
    {
      RecyclerView.LayoutManager localLayoutManager = mLayout;
      if (localLayoutManager != null) {
        i = mPrefetchMaxCountObserved;
      } else {
        i = 0;
      }
      mViewCacheMax = (mRequestedCacheMax + i);
      for (int i = mCachedViews.size() - 1; (i >= 0) && (mCachedViews.size() > mViewCacheMax); i--) {
        recycleCachedViewAt(i);
      }
    }
    
    public boolean validateViewHolderForOffsetPosition(RecyclerView.ViewHolder paramViewHolder)
    {
      if (paramViewHolder.isRemoved()) {
        return mState.isPreLayout();
      }
      int i = mPosition;
      if ((i >= 0) && (i < mAdapter.getItemCount()))
      {
        boolean bool1 = mState.isPreLayout();
        boolean bool2 = false;
        if ((!bool1) && (mAdapter.getItemViewType(mPosition) != paramViewHolder.getItemViewType())) {
          return false;
        }
        if (mAdapter.hasStableIds())
        {
          if (paramViewHolder.getItemId() == mAdapter.getItemId(mPosition)) {
            bool2 = true;
          }
          return bool2;
        }
        return true;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Inconsistency detected. Invalid view holder adapter position");
      localStringBuilder.append(paramViewHolder);
      throw new IndexOutOfBoundsException(z2.m(RecyclerView.this, localStringBuilder));
    }
    
    public void viewRangeUpdate(int paramInt1, int paramInt2)
    {
      for (int i = mCachedViews.size() - 1; i >= 0; i--)
      {
        RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mCachedViews.get(i);
        if (localViewHolder != null)
        {
          int j = mPosition;
          if ((j >= paramInt1) && (j < paramInt2 + paramInt1))
          {
            localViewHolder.addFlags(2);
            recycleCachedViewAt(i);
          }
        }
      }
    }
  }
  
  public static abstract interface RecyclerListener
  {
    public abstract void onViewRecycled(@NonNull RecyclerView.ViewHolder paramViewHolder);
  }
  
  public class RecyclerViewDataObserver
    extends RecyclerView.AdapterDataObserver
  {
    public RecyclerViewDataObserver() {}
    
    public void onChanged()
    {
      assertNotInLayoutOrScroll(null);
      RecyclerView localRecyclerView = RecyclerView.this;
      mState.mStructureChanged = true;
      localRecyclerView.processDataSetCompletelyChanged(true);
      if (!mAdapterHelper.hasPendingUpdates()) {
        requestLayout();
      }
    }
    
    public void onItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
    {
      assertNotInLayoutOrScroll(null);
      if (mAdapterHelper.onItemRangeChanged(paramInt1, paramInt2, paramObject)) {
        triggerUpdateProcessor();
      }
    }
    
    public void onItemRangeInserted(int paramInt1, int paramInt2)
    {
      assertNotInLayoutOrScroll(null);
      if (mAdapterHelper.onItemRangeInserted(paramInt1, paramInt2)) {
        triggerUpdateProcessor();
      }
    }
    
    public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
    {
      assertNotInLayoutOrScroll(null);
      if (mAdapterHelper.onItemRangeMoved(paramInt1, paramInt2, paramInt3)) {
        triggerUpdateProcessor();
      }
    }
    
    public void onItemRangeRemoved(int paramInt1, int paramInt2)
    {
      assertNotInLayoutOrScroll(null);
      if (mAdapterHelper.onItemRangeRemoved(paramInt1, paramInt2)) {
        triggerUpdateProcessor();
      }
    }
    
    public void onStateRestorationPolicyChanged()
    {
      Object localObject = RecyclerView.this;
      if (mPendingSavedState == null) {
        return;
      }
      localObject = mAdapter;
      if ((localObject != null) && (((RecyclerView.Adapter)localObject).canRestoreState())) {
        requestLayout();
      }
    }
    
    public void triggerUpdateProcessor()
    {
      if (RecyclerView.POST_UPDATES_ON_ANIMATION)
      {
        localRecyclerView = RecyclerView.this;
        if ((mHasFixedSize) && (mIsAttached))
        {
          ViewCompat.postOnAnimation(localRecyclerView, mUpdateChildViewsRunnable);
          return;
        }
      }
      RecyclerView localRecyclerView = RecyclerView.this;
      mAdapterUpdateDuringMeasure = true;
      localRecyclerView.requestLayout();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public RecyclerView.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new RecyclerView.SavedState(paramAnonymousParcel, null);
      }
      
      public RecyclerView.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new RecyclerView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public RecyclerView.SavedState[] newArray(int paramAnonymousInt)
      {
        return new RecyclerView.SavedState[paramAnonymousInt];
      }
    };
    public Parcelable mLayoutState;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramClassLoader == null) {
        paramClassLoader = RecyclerView.LayoutManager.class.getClassLoader();
      }
      mLayoutState = paramParcel.readParcelable(paramClassLoader);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void copyFrom(SavedState paramSavedState)
    {
      mLayoutState = mLayoutState;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeParcelable(mLayoutState, 0);
    }
  }
  
  public static class SimpleOnItemTouchListener
    implements RecyclerView.OnItemTouchListener
  {
    public boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean) {}
    
    public void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent) {}
  }
  
  public static abstract class SmoothScroller
  {
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final Action mRecyclingAction = new Action(0, 0);
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;
    
    @Nullable
    public PointF computeScrollVectorForPosition(int paramInt)
    {
      Object localObject = getLayoutManager();
      if ((localObject instanceof ScrollVectorProvider)) {
        return ((ScrollVectorProvider)localObject).computeScrollVectorForPosition(paramInt);
      }
      localObject = z2.t("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
      ((StringBuilder)localObject).append(ScrollVectorProvider.class.getCanonicalName());
      Log.w("RecyclerView", ((StringBuilder)localObject).toString());
      return null;
    }
    
    public View findViewByPosition(int paramInt)
    {
      return mRecyclerView.mLayout.findViewByPosition(paramInt);
    }
    
    public int getChildCount()
    {
      return mRecyclerView.mLayout.getChildCount();
    }
    
    public int getChildPosition(View paramView)
    {
      return mRecyclerView.getChildLayoutPosition(paramView);
    }
    
    @Nullable
    public RecyclerView.LayoutManager getLayoutManager()
    {
      return mLayoutManager;
    }
    
    public int getTargetPosition()
    {
      return mTargetPosition;
    }
    
    @Deprecated
    public void instantScrollToPosition(int paramInt)
    {
      mRecyclerView.scrollToPosition(paramInt);
    }
    
    public boolean isPendingInitialRun()
    {
      return mPendingInitialRun;
    }
    
    public boolean isRunning()
    {
      return mRunning;
    }
    
    public void normalize(@NonNull PointF paramPointF)
    {
      float f1 = x;
      float f2 = y;
      f1 = (float)Math.sqrt(f2 * f2 + f1 * f1);
      x /= f1;
      y /= f1;
    }
    
    public void onAnimation(int paramInt1, int paramInt2)
    {
      RecyclerView localRecyclerView = mRecyclerView;
      if ((mTargetPosition == -1) || (localRecyclerView == null)) {
        stop();
      }
      if ((mPendingInitialRun) && (mTargetView == null) && (mLayoutManager != null))
      {
        localObject = computeScrollVectorForPosition(mTargetPosition);
        if (localObject != null)
        {
          float f = x;
          if ((f != 0.0F) || (y != 0.0F)) {
            localRecyclerView.scrollStep((int)Math.signum(f), (int)Math.signum(y), null);
          }
        }
      }
      mPendingInitialRun = false;
      Object localObject = mTargetView;
      if (localObject != null) {
        if (getChildPosition((View)localObject) == mTargetPosition)
        {
          onTargetFound(mTargetView, mState, mRecyclingAction);
          mRecyclingAction.runIfNecessary(localRecyclerView);
          stop();
        }
        else
        {
          Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
          mTargetView = null;
        }
      }
      if (mRunning)
      {
        onSeekTargetStep(paramInt1, paramInt2, mState, mRecyclingAction);
        boolean bool = mRecyclingAction.hasJumpTarget();
        mRecyclingAction.runIfNecessary(localRecyclerView);
        if ((bool) && (mRunning))
        {
          mPendingInitialRun = true;
          mViewFlinger.postOnAnimation();
        }
      }
    }
    
    public void onChildAttachedToWindow(View paramView)
    {
      if (getChildPosition(paramView) == getTargetPosition()) {
        mTargetView = paramView;
      }
    }
    
    public abstract void onSeekTargetStep(@Px int paramInt1, @Px int paramInt2, @NonNull RecyclerView.State paramState, @NonNull Action paramAction);
    
    public abstract void onStart();
    
    public abstract void onStop();
    
    public abstract void onTargetFound(@NonNull View paramView, @NonNull RecyclerView.State paramState, @NonNull Action paramAction);
    
    public void setTargetPosition(int paramInt)
    {
      mTargetPosition = paramInt;
    }
    
    public void start(RecyclerView paramRecyclerView, RecyclerView.LayoutManager paramLayoutManager)
    {
      mViewFlinger.stop();
      if (mStarted)
      {
        StringBuilder localStringBuilder = z2.t("An instance of ");
        localStringBuilder.append(getClass().getSimpleName());
        localStringBuilder.append(" was started more than once. Each instance of");
        localStringBuilder.append(getClass().getSimpleName());
        localStringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
        Log.w("RecyclerView", localStringBuilder.toString());
      }
      mRecyclerView = paramRecyclerView;
      mLayoutManager = paramLayoutManager;
      int i = mTargetPosition;
      if (i != -1)
      {
        mState.mTargetPosition = i;
        mRunning = true;
        mPendingInitialRun = true;
        mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        mRecyclerView.mViewFlinger.postOnAnimation();
        mStarted = true;
        return;
      }
      throw new IllegalArgumentException("Invalid target position");
    }
    
    public final void stop()
    {
      if (!mRunning) {
        return;
      }
      mRunning = false;
      onStop();
      mRecyclerView.mState.mTargetPosition = -1;
      mTargetView = null;
      mTargetPosition = -1;
      mPendingInitialRun = false;
      mLayoutManager.onSmoothScrollerStopped(this);
      mLayoutManager = null;
      mRecyclerView = null;
    }
    
    public static class Action
    {
      public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
      private boolean mChanged = false;
      private int mConsecutiveUpdates = 0;
      private int mDuration;
      private int mDx;
      private int mDy;
      private Interpolator mInterpolator;
      private int mJumpToPosition = -1;
      
      public Action(@Px int paramInt1, @Px int paramInt2)
      {
        this(paramInt1, paramInt2, Integer.MIN_VALUE, null);
      }
      
      public Action(@Px int paramInt1, @Px int paramInt2, int paramInt3)
      {
        this(paramInt1, paramInt2, paramInt3, null);
      }
      
      public Action(@Px int paramInt1, @Px int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
      {
        mDx = paramInt1;
        mDy = paramInt2;
        mDuration = paramInt3;
        mInterpolator = paramInterpolator;
      }
      
      private void validate()
      {
        if ((mInterpolator != null) && (mDuration < 1)) {
          throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (mDuration >= 1) {
          return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
      }
      
      public int getDuration()
      {
        return mDuration;
      }
      
      @Px
      public int getDx()
      {
        return mDx;
      }
      
      @Px
      public int getDy()
      {
        return mDy;
      }
      
      @Nullable
      public Interpolator getInterpolator()
      {
        return mInterpolator;
      }
      
      public boolean hasJumpTarget()
      {
        boolean bool;
        if (mJumpToPosition >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public void jumpTo(int paramInt)
      {
        mJumpToPosition = paramInt;
      }
      
      public void runIfNecessary(RecyclerView paramRecyclerView)
      {
        int i = mJumpToPosition;
        if (i >= 0)
        {
          mJumpToPosition = -1;
          paramRecyclerView.jumpToPositionForSmoothScroller(i);
          mChanged = false;
          return;
        }
        if (mChanged)
        {
          validate();
          mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
          i = mConsecutiveUpdates + 1;
          mConsecutiveUpdates = i;
          if (i > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
          }
          mChanged = false;
        }
        else
        {
          mConsecutiveUpdates = 0;
        }
      }
      
      public void setDuration(int paramInt)
      {
        mChanged = true;
        mDuration = paramInt;
      }
      
      public void setDx(@Px int paramInt)
      {
        mChanged = true;
        mDx = paramInt;
      }
      
      public void setDy(@Px int paramInt)
      {
        mChanged = true;
        mDy = paramInt;
      }
      
      public void setInterpolator(@Nullable Interpolator paramInterpolator)
      {
        mChanged = true;
        mInterpolator = paramInterpolator;
      }
      
      public void update(@Px int paramInt1, @Px int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
      {
        mDx = paramInt1;
        mDy = paramInt2;
        mDuration = paramInt3;
        mInterpolator = paramInterpolator;
        mChanged = true;
      }
    }
    
    public static abstract interface ScrollVectorProvider
    {
      @Nullable
      public abstract PointF computeScrollVectorForPosition(int paramInt);
    }
  }
  
  public static class State
  {
    public static final int STEP_ANIMATIONS = 4;
    public static final int STEP_LAYOUT = 2;
    public static final int STEP_START = 1;
    private SparseArray<Object> mData;
    public int mDeletedInvisibleItemCountSincePreviousLayout = 0;
    public long mFocusedItemId;
    public int mFocusedItemPosition;
    public int mFocusedSubChildId;
    public boolean mInPreLayout = false;
    public boolean mIsMeasuring = false;
    public int mItemCount = 0;
    public int mLayoutStep = 1;
    public int mPreviousLayoutItemCount = 0;
    public int mRemainingScrollHorizontal;
    public int mRemainingScrollVertical;
    public boolean mRunPredictiveAnimations = false;
    public boolean mRunSimpleAnimations = false;
    public boolean mStructureChanged = false;
    public int mTargetPosition = -1;
    public boolean mTrackOldChangeHolders = false;
    
    public void assertLayoutStep(int paramInt)
    {
      if ((mLayoutStep & paramInt) != 0) {
        return;
      }
      StringBuilder localStringBuilder = z2.t("Layout state should be one of ");
      localStringBuilder.append(Integer.toBinaryString(paramInt));
      localStringBuilder.append(" but it is ");
      localStringBuilder.append(Integer.toBinaryString(mLayoutStep));
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public boolean didStructureChange()
    {
      return mStructureChanged;
    }
    
    public <T> T get(int paramInt)
    {
      SparseArray localSparseArray = mData;
      if (localSparseArray == null) {
        return null;
      }
      return (T)localSparseArray.get(paramInt);
    }
    
    public int getItemCount()
    {
      int i;
      if (mInPreLayout) {
        i = mPreviousLayoutItemCount - mDeletedInvisibleItemCountSincePreviousLayout;
      } else {
        i = mItemCount;
      }
      return i;
    }
    
    public int getRemainingScrollHorizontal()
    {
      return mRemainingScrollHorizontal;
    }
    
    public int getRemainingScrollVertical()
    {
      return mRemainingScrollVertical;
    }
    
    public int getTargetScrollPosition()
    {
      return mTargetPosition;
    }
    
    public boolean hasTargetScrollPosition()
    {
      boolean bool;
      if (mTargetPosition != -1) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isMeasuring()
    {
      return mIsMeasuring;
    }
    
    public boolean isPreLayout()
    {
      return mInPreLayout;
    }
    
    public void prepareForNestedPrefetch(RecyclerView.Adapter paramAdapter)
    {
      mLayoutStep = 1;
      mItemCount = paramAdapter.getItemCount();
      mInPreLayout = false;
      mTrackOldChangeHolders = false;
      mIsMeasuring = false;
    }
    
    public void put(int paramInt, Object paramObject)
    {
      if (mData == null) {
        mData = new SparseArray();
      }
      mData.put(paramInt, paramObject);
    }
    
    public void remove(int paramInt)
    {
      SparseArray localSparseArray = mData;
      if (localSparseArray == null) {
        return;
      }
      localSparseArray.remove(paramInt);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("State{mTargetPosition=");
      localStringBuilder.append(mTargetPosition);
      localStringBuilder.append(", mData=");
      localStringBuilder.append(mData);
      localStringBuilder.append(", mItemCount=");
      localStringBuilder.append(mItemCount);
      localStringBuilder.append(", mIsMeasuring=");
      localStringBuilder.append(mIsMeasuring);
      localStringBuilder.append(", mPreviousLayoutItemCount=");
      localStringBuilder.append(mPreviousLayoutItemCount);
      localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
      localStringBuilder.append(mDeletedInvisibleItemCountSincePreviousLayout);
      localStringBuilder.append(", mStructureChanged=");
      localStringBuilder.append(mStructureChanged);
      localStringBuilder.append(", mInPreLayout=");
      localStringBuilder.append(mInPreLayout);
      localStringBuilder.append(", mRunSimpleAnimations=");
      localStringBuilder.append(mRunSimpleAnimations);
      localStringBuilder.append(", mRunPredictiveAnimations=");
      localStringBuilder.append(mRunPredictiveAnimations);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public boolean willRunPredictiveAnimations()
    {
      return mRunPredictiveAnimations;
    }
    
    public boolean willRunSimpleAnimations()
    {
      return mRunSimpleAnimations;
    }
  }
  
  public static abstract class ViewCacheExtension
  {
    @Nullable
    public abstract View getViewForPositionAndType(@NonNull RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2);
  }
  
  public class ViewFlinger
    implements Runnable
  {
    private boolean mEatRunOnAnimationRequest;
    public Interpolator mInterpolator;
    private int mLastFlingX;
    private int mLastFlingY;
    public OverScroller mOverScroller;
    private boolean mReSchedulePostAnimationCallback;
    
    public ViewFlinger()
    {
      Interpolator localInterpolator = RecyclerView.sQuinticInterpolator;
      mInterpolator = localInterpolator;
      mEatRunOnAnimationRequest = false;
      mReSchedulePostAnimationCallback = false;
      mOverScroller = new OverScroller(getContext(), localInterpolator);
    }
    
    private int computeScrollDuration(int paramInt1, int paramInt2)
    {
      int i = Math.abs(paramInt1);
      int j = Math.abs(paramInt2);
      if (i > j) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      RecyclerView localRecyclerView = RecyclerView.this;
      if (paramInt1 != 0) {
        paramInt2 = localRecyclerView.getWidth();
      } else {
        paramInt2 = localRecyclerView.getHeight();
      }
      if (paramInt1 != 0) {
        paramInt1 = i;
      } else {
        paramInt1 = j;
      }
      return Math.min((int)((paramInt1 / paramInt2 + 1.0F) * 300.0F), 2000);
    }
    
    private void internalPostOnAnimation()
    {
      removeCallbacks(this);
      ViewCompat.postOnAnimation(RecyclerView.this, this);
    }
    
    public void fling(int paramInt1, int paramInt2)
    {
      setScrollState(2);
      mLastFlingY = 0;
      mLastFlingX = 0;
      Interpolator localInterpolator1 = mInterpolator;
      Interpolator localInterpolator2 = RecyclerView.sQuinticInterpolator;
      if (localInterpolator1 != localInterpolator2)
      {
        mInterpolator = localInterpolator2;
        mOverScroller = new OverScroller(getContext(), localInterpolator2);
      }
      mOverScroller.fling(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
      postOnAnimation();
    }
    
    public void postOnAnimation()
    {
      if (mEatRunOnAnimationRequest) {
        mReSchedulePostAnimationCallback = true;
      } else {
        internalPostOnAnimation();
      }
    }
    
    public void run()
    {
      Object localObject1 = RecyclerView.this;
      if (mLayout == null)
      {
        stop();
        return;
      }
      mReSchedulePostAnimationCallback = false;
      mEatRunOnAnimationRequest = true;
      ((RecyclerView)localObject1).consumePendingUpdateOperations();
      localObject1 = mOverScroller;
      if (((OverScroller)localObject1).computeScrollOffset())
      {
        int i = ((OverScroller)localObject1).getCurrX();
        int j = ((OverScroller)localObject1).getCurrY();
        int k = i - mLastFlingX;
        int m = j - mLastFlingY;
        mLastFlingX = i;
        mLastFlingY = j;
        Object localObject2 = RecyclerView.this;
        Object localObject3 = mReusableIntPair;
        localObject3[0] = 0;
        localObject3[1] = 0;
        j = k;
        i = m;
        if (((RecyclerView)localObject2).dispatchNestedPreScroll(k, m, (int[])localObject3, null, 1))
        {
          localObject2 = mReusableIntPair;
          j = k - localObject2[0];
          i = m - localObject2[1];
        }
        if (getOverScrollMode() != 2) {
          considerReleasingGlowsOnScroll(j, i);
        }
        localObject2 = RecyclerView.this;
        if (mAdapter != null)
        {
          localObject3 = mReusableIntPair;
          localObject3[0] = 0;
          localObject3[1] = 0;
          ((RecyclerView)localObject2).scrollStep(j, i, (int[])localObject3);
          localObject2 = RecyclerView.this;
          localObject3 = mReusableIntPair;
          n = localObject3[0];
          i1 = localObject3[1];
          int i2 = j - n;
          int i3 = i - i1;
          localObject2 = mLayout.mSmoothScroller;
          j = i2;
          m = i1;
          i = n;
          k = i3;
          if (localObject2 != null)
          {
            j = i2;
            m = i1;
            i = n;
            k = i3;
            if (!((RecyclerView.SmoothScroller)localObject2).isPendingInitialRun())
            {
              j = i2;
              m = i1;
              i = n;
              k = i3;
              if (((RecyclerView.SmoothScroller)localObject2).isRunning())
              {
                j = mState.getItemCount();
                if (j == 0)
                {
                  ((RecyclerView.SmoothScroller)localObject2).stop();
                  j = i2;
                  m = i1;
                  i = n;
                  k = i3;
                }
                else if (((RecyclerView.SmoothScroller)localObject2).getTargetPosition() >= j)
                {
                  ((RecyclerView.SmoothScroller)localObject2).setTargetPosition(j - 1);
                  ((RecyclerView.SmoothScroller)localObject2).onAnimation(n, i1);
                  j = i2;
                  m = i1;
                  i = n;
                  k = i3;
                }
                else
                {
                  ((RecyclerView.SmoothScroller)localObject2).onAnimation(n, i1);
                  j = i2;
                  m = i1;
                  i = n;
                  k = i3;
                }
              }
            }
          }
        }
        else
        {
          m = 0;
          i1 = m;
          k = i;
          i = i1;
        }
        if (!mItemDecorations.isEmpty()) {
          invalidate();
        }
        localObject3 = RecyclerView.this;
        localObject2 = mReusableIntPair;
        localObject2[0] = 0;
        localObject2[1] = 0;
        ((RecyclerView)localObject3).dispatchNestedScroll(i, m, j, k, null, 1, (int[])localObject2);
        localObject3 = RecyclerView.this;
        localObject2 = mReusableIntPair;
        int n = j - localObject2[0];
        int i1 = k - localObject2[1];
        if ((i != 0) || (m != 0)) {
          ((RecyclerView)localObject3).dispatchOnScrolled(i, m);
        }
        if (!RecyclerView.access$200(RecyclerView.this)) {
          invalidate();
        }
        if (((OverScroller)localObject1).getCurrX() == ((OverScroller)localObject1).getFinalX()) {
          j = 1;
        } else {
          j = 0;
        }
        if (((OverScroller)localObject1).getCurrY() == ((OverScroller)localObject1).getFinalY()) {
          k = 1;
        } else {
          k = 0;
        }
        if ((!((OverScroller)localObject1).isFinished()) && (((j == 0) && (n == 0)) || ((k == 0) && (i1 == 0)))) {
          j = 0;
        } else {
          j = 1;
        }
        localObject2 = mLayout.mSmoothScroller;
        if ((localObject2 != null) && (((RecyclerView.SmoothScroller)localObject2).isPendingInitialRun())) {
          k = 1;
        } else {
          k = 0;
        }
        if ((k == 0) && (j != 0))
        {
          if (getOverScrollMode() != 2)
          {
            i = (int)((OverScroller)localObject1).getCurrVelocity();
            if (n < 0) {
              j = -i;
            } else if (n > 0) {
              j = i;
            } else {
              j = 0;
            }
            if (i1 < 0) {
              i = -i;
            } else if (i1 <= 0) {
              i = 0;
            }
            absorbGlows(j, i);
          }
          if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            mPrefetchRegistry.clearPrefetchPositions();
          }
        }
        else
        {
          postOnAnimation();
          localObject1 = RecyclerView.this;
          localObject2 = mGapWorker;
          if (localObject2 != null) {
            ((GapWorker)localObject2).postFromTraversal((RecyclerView)localObject1, i, m);
          }
        }
      }
      localObject1 = mLayout.mSmoothScroller;
      if ((localObject1 != null) && (((RecyclerView.SmoothScroller)localObject1).isPendingInitialRun())) {
        ((RecyclerView.SmoothScroller)localObject1).onAnimation(0, 0);
      }
      mEatRunOnAnimationRequest = false;
      if (mReSchedulePostAnimationCallback)
      {
        internalPostOnAnimation();
      }
      else
      {
        setScrollState(0);
        stopNestedScroll(1);
      }
    }
    
    public void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
    {
      int i = paramInt3;
      if (paramInt3 == Integer.MIN_VALUE) {
        i = computeScrollDuration(paramInt1, paramInt2);
      }
      Interpolator localInterpolator = paramInterpolator;
      if (paramInterpolator == null) {
        localInterpolator = RecyclerView.sQuinticInterpolator;
      }
      if (mInterpolator != localInterpolator)
      {
        mInterpolator = localInterpolator;
        mOverScroller = new OverScroller(getContext(), localInterpolator);
      }
      mLastFlingY = 0;
      mLastFlingX = 0;
      setScrollState(2);
      mOverScroller.startScroll(0, 0, paramInt1, paramInt2, i);
      postOnAnimation();
    }
    
    public void stop()
    {
      removeCallbacks(this);
      mOverScroller.abortAnimation();
    }
  }
  
  public static abstract class ViewHolder
  {
    public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    public static final int FLAG_BOUND = 1;
    public static final int FLAG_IGNORE = 128;
    public static final int FLAG_INVALID = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_NOT_RECYCLABLE = 16;
    public static final int FLAG_REMOVED = 8;
    public static final int FLAG_RETURNED_FROM_SCRAP = 32;
    public static final int FLAG_TMP_DETACHED = 256;
    public static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = ;
    public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    @NonNull
    public final View itemView;
    public RecyclerView.Adapter<? extends ViewHolder> mBindingAdapter;
    public int mFlags;
    public boolean mInChangeScrap = false;
    private int mIsRecyclableCount = 0;
    public long mItemId = -1L;
    public int mItemViewType = -1;
    public WeakReference<RecyclerView> mNestedRecyclerView;
    public int mOldPosition = -1;
    public RecyclerView mOwnerRecyclerView;
    public List<Object> mPayloads = null;
    @VisibleForTesting
    public int mPendingAccessibilityState = -1;
    public int mPosition = -1;
    public int mPreLayoutPosition = -1;
    public RecyclerView.Recycler mScrapContainer = null;
    public ViewHolder mShadowedHolder = null;
    public ViewHolder mShadowingHolder = null;
    public List<Object> mUnmodifiedPayloads = null;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    
    public ViewHolder(@NonNull View paramView)
    {
      if (paramView != null)
      {
        itemView = paramView;
        return;
      }
      throw new IllegalArgumentException("itemView may not be null");
    }
    
    private void createPayloadsIfNeeded()
    {
      if (mPayloads == null)
      {
        ArrayList localArrayList = new ArrayList();
        mPayloads = localArrayList;
        mUnmodifiedPayloads = Collections.unmodifiableList(localArrayList);
      }
    }
    
    public void addChangePayload(Object paramObject)
    {
      if (paramObject == null)
      {
        addFlags(1024);
      }
      else if ((0x400 & mFlags) == 0)
      {
        createPayloadsIfNeeded();
        mPayloads.add(paramObject);
      }
    }
    
    public void addFlags(int paramInt)
    {
      mFlags = (paramInt | mFlags);
    }
    
    public void clearOldPosition()
    {
      mOldPosition = -1;
      mPreLayoutPosition = -1;
    }
    
    public void clearPayload()
    {
      List localList = mPayloads;
      if (localList != null) {
        localList.clear();
      }
      mFlags &= 0xFBFF;
    }
    
    public void clearReturnedFromScrapFlag()
    {
      mFlags &= 0xFFFFFFDF;
    }
    
    public void clearTmpDetachFlag()
    {
      mFlags &= 0xFEFF;
    }
    
    public boolean doesTransientStatePreventRecycling()
    {
      boolean bool;
      if (((mFlags & 0x10) == 0) && (ViewCompat.hasTransientState(itemView))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void flagRemovedAndOffsetPosition(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      addFlags(8);
      offsetPosition(paramInt2, paramBoolean);
      mPosition = paramInt1;
    }
    
    public final int getAbsoluteAdapterPosition()
    {
      RecyclerView localRecyclerView = mOwnerRecyclerView;
      if (localRecyclerView == null) {
        return -1;
      }
      return localRecyclerView.getAdapterPositionInRecyclerView(this);
    }
    
    @Deprecated
    public final int getAdapterPosition()
    {
      return getBindingAdapterPosition();
    }
    
    @Nullable
    public final RecyclerView.Adapter<? extends ViewHolder> getBindingAdapter()
    {
      return mBindingAdapter;
    }
    
    public final int getBindingAdapterPosition()
    {
      if (mBindingAdapter == null) {
        return -1;
      }
      Object localObject = mOwnerRecyclerView;
      if (localObject == null) {
        return -1;
      }
      localObject = ((RecyclerView)localObject).getAdapter();
      if (localObject == null) {
        return -1;
      }
      int i = mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
      if (i == -1) {
        return -1;
      }
      return ((RecyclerView.Adapter)localObject).findRelativeAdapterPositionIn(mBindingAdapter, this, i);
    }
    
    public final long getItemId()
    {
      return mItemId;
    }
    
    public final int getItemViewType()
    {
      return mItemViewType;
    }
    
    public final int getLayoutPosition()
    {
      int i = mPreLayoutPosition;
      int j = i;
      if (i == -1) {
        j = mPosition;
      }
      return j;
    }
    
    public final int getOldPosition()
    {
      return mOldPosition;
    }
    
    @Deprecated
    public final int getPosition()
    {
      int i = mPreLayoutPosition;
      int j = i;
      if (i == -1) {
        j = mPosition;
      }
      return j;
    }
    
    public List<Object> getUnmodifiedPayloads()
    {
      if ((mFlags & 0x400) == 0)
      {
        List localList = mPayloads;
        if ((localList != null) && (localList.size() != 0)) {
          return mUnmodifiedPayloads;
        }
        return FULLUPDATE_PAYLOADS;
      }
      return FULLUPDATE_PAYLOADS;
    }
    
    public boolean hasAnyOfTheFlags(int paramInt)
    {
      boolean bool;
      if ((paramInt & mFlags) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isAdapterPositionUnknown()
    {
      boolean bool;
      if (((mFlags & 0x200) == 0) && (!isInvalid())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isAttachedToTransitionOverlay()
    {
      boolean bool;
      if ((itemView.getParent() != null) && (itemView.getParent() != mOwnerRecyclerView)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean isBound()
    {
      int i = mFlags;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    public boolean isInvalid()
    {
      boolean bool;
      if ((mFlags & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean isRecyclable()
    {
      boolean bool;
      if (((mFlags & 0x10) == 0) && (!ViewCompat.hasTransientState(itemView))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isRemoved()
    {
      boolean bool;
      if ((mFlags & 0x8) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isScrap()
    {
      boolean bool;
      if (mScrapContainer != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isTmpDetached()
    {
      boolean bool;
      if ((mFlags & 0x100) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isUpdated()
    {
      boolean bool;
      if ((mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean needsUpdate()
    {
      boolean bool;
      if ((mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void offsetPosition(int paramInt, boolean paramBoolean)
    {
      if (mOldPosition == -1) {
        mOldPosition = mPosition;
      }
      if (mPreLayoutPosition == -1) {
        mPreLayoutPosition = mPosition;
      }
      if (paramBoolean) {
        mPreLayoutPosition += paramInt;
      }
      mPosition += paramInt;
      if (itemView.getLayoutParams() != null) {
        itemView.getLayoutParams()).mInsetsDirty = true;
      }
    }
    
    public void onEnteredHiddenState(RecyclerView paramRecyclerView)
    {
      int i = mPendingAccessibilityState;
      if (i != -1) {
        mWasImportantForAccessibilityBeforeHidden = i;
      } else {
        mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(itemView);
      }
      paramRecyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }
    
    public void onLeftHiddenState(RecyclerView paramRecyclerView)
    {
      paramRecyclerView.setChildImportantForAccessibilityInternal(this, mWasImportantForAccessibilityBeforeHidden);
      mWasImportantForAccessibilityBeforeHidden = 0;
    }
    
    public void resetInternal()
    {
      mFlags = 0;
      mPosition = -1;
      mOldPosition = -1;
      mItemId = -1L;
      mPreLayoutPosition = -1;
      mIsRecyclableCount = 0;
      mShadowedHolder = null;
      mShadowingHolder = null;
      clearPayload();
      mWasImportantForAccessibilityBeforeHidden = 0;
      mPendingAccessibilityState = -1;
      RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }
    
    public void saveOldPosition()
    {
      if (mOldPosition == -1) {
        mOldPosition = mPosition;
      }
    }
    
    public void setFlags(int paramInt1, int paramInt2)
    {
      mFlags = (paramInt1 & paramInt2 | mFlags & paramInt2);
    }
    
    public final void setIsRecyclable(boolean paramBoolean)
    {
      int i = mIsRecyclableCount;
      if (paramBoolean) {
        i--;
      } else {
        i++;
      }
      mIsRecyclableCount = i;
      if (i < 0)
      {
        mIsRecyclableCount = 0;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        localStringBuilder.append(this);
        Log.e("View", localStringBuilder.toString());
      }
      else if ((!paramBoolean) && (i == 1))
      {
        mFlags |= 0x10;
      }
      else if ((paramBoolean) && (i == 0))
      {
        mFlags &= 0xFFFFFFEF;
      }
    }
    
    public void setScrapContainer(RecyclerView.Recycler paramRecycler, boolean paramBoolean)
    {
      mScrapContainer = paramRecycler;
      mInChangeScrap = paramBoolean;
    }
    
    public boolean shouldBeKeptAsChild()
    {
      boolean bool;
      if ((mFlags & 0x10) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean shouldIgnore()
    {
      boolean bool;
      if ((mFlags & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void stopIgnoring()
    {
      mFlags &= 0xFF7F;
    }
    
    public String toString()
    {
      if (getClass().isAnonymousClass()) {
        localObject = "ViewHolder";
      } else {
        localObject = getClass().getSimpleName();
      }
      Object localObject = z2.u((String)localObject, "{");
      ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
      ((StringBuilder)localObject).append(" position=");
      ((StringBuilder)localObject).append(mPosition);
      ((StringBuilder)localObject).append(" id=");
      ((StringBuilder)localObject).append(mItemId);
      ((StringBuilder)localObject).append(", oldPos=");
      ((StringBuilder)localObject).append(mOldPosition);
      ((StringBuilder)localObject).append(", pLpos:");
      ((StringBuilder)localObject).append(mPreLayoutPosition);
      StringBuilder localStringBuilder = new StringBuilder(((StringBuilder)localObject).toString());
      if (isScrap())
      {
        localStringBuilder.append(" scrap ");
        if (mInChangeScrap) {
          localObject = "[changeScrap]";
        } else {
          localObject = "[attachedScrap]";
        }
        localStringBuilder.append((String)localObject);
      }
      if (isInvalid()) {
        localStringBuilder.append(" invalid");
      }
      if (!isBound()) {
        localStringBuilder.append(" unbound");
      }
      if (needsUpdate()) {
        localStringBuilder.append(" update");
      }
      if (isRemoved()) {
        localStringBuilder.append(" removed");
      }
      if (shouldIgnore()) {
        localStringBuilder.append(" ignored");
      }
      if (isTmpDetached()) {
        localStringBuilder.append(" tmpDetached");
      }
      if (!isRecyclable())
      {
        localObject = z2.t(" not recyclable(");
        ((StringBuilder)localObject).append(mIsRecyclableCount);
        ((StringBuilder)localObject).append(")");
        localStringBuilder.append(((StringBuilder)localObject).toString());
      }
      if (isAdapterPositionUnknown()) {
        localStringBuilder.append(" undefined adapter position");
      }
      if (itemView.getParent() == null) {
        localStringBuilder.append(" no parent");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void unScrap()
    {
      mScrapContainer.unscrapView(this);
    }
    
    public boolean wasReturnedFromScrap()
    {
      boolean bool;
      if ((mFlags & 0x20) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */