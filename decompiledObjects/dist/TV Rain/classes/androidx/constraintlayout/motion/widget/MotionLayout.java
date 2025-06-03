package androidx.constraintlayout.motion.widget;

import a;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z2;

public class MotionLayout
  extends ConstraintLayout
  implements NestedScrollingParent3
{
  private static final boolean DEBUG = false;
  public static final int DEBUG_SHOW_NONE = 0;
  public static final int DEBUG_SHOW_PATH = 2;
  public static final int DEBUG_SHOW_PROGRESS = 1;
  private static final float EPSILON = 1.0E-5F;
  public static boolean IS_IN_EDIT_MODE = false;
  public static final int MAX_KEY_FRAMES = 50;
  public static final String TAG = "MotionLayout";
  public static final int TOUCH_UP_COMPLETE = 0;
  public static final int TOUCH_UP_COMPLETE_TO_END = 2;
  public static final int TOUCH_UP_COMPLETE_TO_START = 1;
  public static final int TOUCH_UP_DECELERATE = 4;
  public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
  public static final int TOUCH_UP_NEVER_TO_END = 7;
  public static final int TOUCH_UP_NEVER_TO_START = 6;
  public static final int TOUCH_UP_STOP = 3;
  public static final int VELOCITY_LAYOUT = 1;
  public static final int VELOCITY_POST_LAYOUT = 0;
  public static final int VELOCITY_STATIC_LAYOUT = 3;
  public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
  public boolean firstDown = true;
  private float lastPos;
  private float lastY;
  private long mAnimationStartTime = 0L;
  private int mBeginState = -1;
  private RectF mBoundsCheck = new RectF();
  public int mCurrentState = -1;
  public int mDebugPath = 0;
  private DecelerateInterpolator mDecelerateLogic = new DecelerateInterpolator();
  private ArrayList<MotionHelper> mDecoratorsHelpers = null;
  private boolean mDelayedApply = false;
  private DesignTool mDesignTool;
  public DevModeDraw mDevModeDraw;
  private int mEndState = -1;
  public int mEndWrapHeight;
  public int mEndWrapWidth;
  public HashMap<View, MotionController> mFrameArrayList = new HashMap();
  private int mFrames = 0;
  public int mHeightMeasureMode;
  private boolean mInLayout = false;
  private boolean mInRotation = false;
  public boolean mInTransition = false;
  public boolean mIndirectTransition = false;
  private boolean mInteractionEnabled = true;
  public Interpolator mInterpolator;
  private Matrix mInverseMatrix = null;
  public boolean mIsAnimating = false;
  private boolean mKeepAnimating = false;
  private KeyCache mKeyCache = new KeyCache();
  private long mLastDrawTime = -1L;
  private float mLastFps = 0.0F;
  private int mLastHeightMeasureSpec = 0;
  public int mLastLayoutHeight;
  public int mLastLayoutWidth;
  public float mLastVelocity = 0.0F;
  private int mLastWidthMeasureSpec = 0;
  private float mListenerPosition = 0.0F;
  private int mListenerState = 0;
  public boolean mMeasureDuringTransition = false;
  public Model mModel = new Model();
  private boolean mNeedsFireTransitionCompleted = false;
  public int mOldHeight;
  public int mOldWidth;
  private Runnable mOnComplete = null;
  private ArrayList<MotionHelper> mOnHideHelpers = null;
  private ArrayList<MotionHelper> mOnShowHelpers = null;
  public float mPostInterpolationPosition;
  public HashMap<View, ViewState> mPreRotate = new HashMap();
  private int mPreRotateHeight;
  private int mPreRotateWidth;
  private int mPreviouseRotation;
  public Interpolator mProgressInterpolator = null;
  private View mRegionView = null;
  public int mRotatMode = 0;
  public MotionScene mScene;
  private int[] mScheduledTransitionTo = null;
  public int mScheduledTransitions = 0;
  public float mScrollTargetDT;
  public float mScrollTargetDX;
  public float mScrollTargetDY;
  public long mScrollTargetTime;
  public int mStartWrapHeight;
  public int mStartWrapWidth;
  private StateCache mStateCache;
  private StopLogic mStopLogic = new StopLogic();
  public Rect mTempRect = new Rect();
  private boolean mTemporalInterpolator = false;
  public ArrayList<Integer> mTransitionCompleted = new ArrayList();
  private float mTransitionDuration = 1.0F;
  public float mTransitionGoalPosition = 0.0F;
  private boolean mTransitionInstantly;
  public float mTransitionLastPosition = 0.0F;
  private long mTransitionLastTime;
  private TransitionListener mTransitionListener;
  private CopyOnWriteArrayList<TransitionListener> mTransitionListeners = null;
  public float mTransitionPosition = 0.0F;
  public TransitionState mTransitionState = TransitionState.UNDEFINED;
  public boolean mUndergoingMotion = false;
  public int mWidthMeasureMode;
  
  public MotionLayout(@NonNull Context paramContext)
  {
    super(paramContext);
    init(null);
  }
  
  public MotionLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet);
  }
  
  public MotionLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet);
  }
  
  private boolean callTransformedTouchEvent(View paramView, MotionEvent paramMotionEvent, float paramFloat1, float paramFloat2)
  {
    Matrix localMatrix = paramView.getMatrix();
    if (localMatrix.isIdentity())
    {
      paramMotionEvent.offsetLocation(paramFloat1, paramFloat2);
      bool = paramView.onTouchEvent(paramMotionEvent);
      paramMotionEvent.offsetLocation(-paramFloat1, -paramFloat2);
      return bool;
    }
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(paramFloat1, paramFloat2);
    if (mInverseMatrix == null) {
      mInverseMatrix = new Matrix();
    }
    localMatrix.invert(mInverseMatrix);
    paramMotionEvent.transform(mInverseMatrix);
    boolean bool = paramView.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
    return bool;
  }
  
  private void checkStructure()
  {
    Object localObject1 = mScene;
    if (localObject1 == null)
    {
      Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
      return;
    }
    int i = ((MotionScene)localObject1).getStartId();
    localObject1 = mScene;
    checkStructure(i, ((MotionScene)localObject1).getConstraintSet(((MotionScene)localObject1).getStartId()));
    localObject1 = new SparseIntArray();
    SparseIntArray localSparseIntArray = new SparseIntArray();
    Iterator localIterator = mScene.getDefinedTransitions().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (MotionScene.Transition)localIterator.next();
      if (localObject2 == mScene.mCurrentTransition) {
        Log.v("MotionLayout", "CHECK: CURRENT");
      }
      checkStructure((MotionScene.Transition)localObject2);
      int j = ((MotionScene.Transition)localObject2).getStartConstraintSetId();
      i = ((MotionScene.Transition)localObject2).getEndConstraintSetId();
      localObject2 = Debug.getName(getContext(), j);
      Object localObject3 = Debug.getName(getContext(), i);
      StringBuilder localStringBuilder;
      if (((SparseIntArray)localObject1).get(j) == i)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("CHECK: two transitions with the same start and end ");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append("->");
        localStringBuilder.append((String)localObject3);
        Log.e("MotionLayout", localStringBuilder.toString());
      }
      if (localSparseIntArray.get(i) == j)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("CHECK: you can't have reverse transitions");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append("->");
        localStringBuilder.append((String)localObject3);
        Log.e("MotionLayout", localStringBuilder.toString());
      }
      ((SparseIntArray)localObject1).put(j, i);
      localSparseIntArray.put(i, j);
      if (mScene.getConstraintSet(j) == null)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append(" no such constraintSetStart ");
        ((StringBuilder)localObject3).append((String)localObject2);
        Log.e("MotionLayout", ((StringBuilder)localObject3).toString());
      }
      if (mScene.getConstraintSet(i) == null)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append(" no such constraintSetEnd ");
        ((StringBuilder)localObject3).append((String)localObject2);
        Log.e("MotionLayout", ((StringBuilder)localObject3).toString());
      }
    }
  }
  
  private void checkStructure(int paramInt, ConstraintSet paramConstraintSet)
  {
    String str = Debug.getName(getContext(), paramInt);
    int i = getChildCount();
    int j = 0;
    Object localObject2;
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      localObject1 = getChildAt(paramInt);
      int k = ((View)localObject1).getId();
      if (k == -1)
      {
        localObject2 = a.s("CHECK: ", str, " ALL VIEWS SHOULD HAVE ID's ");
        ((StringBuilder)localObject2).append(localObject1.getClass().getName());
        ((StringBuilder)localObject2).append(" does not!");
        Log.w("MotionLayout", ((StringBuilder)localObject2).toString());
      }
      if (paramConstraintSet.getConstraint(k) == null)
      {
        localObject2 = a.s("CHECK: ", str, " NO CONSTRAINTS for ");
        ((StringBuilder)localObject2).append(Debug.getName((View)localObject1));
        Log.w("MotionLayout", ((StringBuilder)localObject2).toString());
      }
    }
    Object localObject1 = paramConstraintSet.getKnownIds();
    for (paramInt = j; paramInt < localObject1.length; paramInt++)
    {
      j = localObject1[paramInt];
      localObject2 = Debug.getName(getContext(), j);
      StringBuilder localStringBuilder;
      if (findViewById(localObject1[paramInt]) == null)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("CHECK: ");
        localStringBuilder.append(str);
        localStringBuilder.append(" NO View matches id ");
        localStringBuilder.append((String)localObject2);
        Log.w("MotionLayout", localStringBuilder.toString());
      }
      if (paramConstraintSet.getHeight(j) == -1)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("CHECK: ");
        localStringBuilder.append(str);
        localStringBuilder.append("(");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(") no LAYOUT_HEIGHT");
        Log.w("MotionLayout", localStringBuilder.toString());
      }
      if (paramConstraintSet.getWidth(j) == -1)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("CHECK: ");
        localStringBuilder.append(str);
        localStringBuilder.append("(");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append(") no LAYOUT_HEIGHT");
        Log.w("MotionLayout", localStringBuilder.toString());
      }
    }
  }
  
  private void checkStructure(MotionScene.Transition paramTransition)
  {
    if (paramTransition.getStartConstraintSetId() == paramTransition.getEndConstraintSetId()) {
      Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
    }
  }
  
  private void computeCurrentPositions()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      MotionController localMotionController = (MotionController)mFrameArrayList.get(localView);
      if (localMotionController != null) {
        localMotionController.setStartCurrentState(localView);
      }
    }
  }
  
  @SuppressLint({"LogConditional"})
  private void debugPos()
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      StringBuilder localStringBuilder = z2.t(" ");
      localStringBuilder.append(Debug.getLocation());
      localStringBuilder.append(" ");
      localStringBuilder.append(Debug.getName(this));
      localStringBuilder.append(" ");
      localStringBuilder.append(Debug.getName(getContext(), mCurrentState));
      localStringBuilder.append(" ");
      localStringBuilder.append(Debug.getName(localView));
      localStringBuilder.append(localView.getLeft());
      localStringBuilder.append(" ");
      localStringBuilder.append(localView.getTop());
      Log.v("MotionLayout", localStringBuilder.toString());
    }
  }
  
  private void evaluateLayout()
  {
    float f1 = Math.signum(mTransitionGoalPosition - mTransitionLastPosition);
    long l = getNanoTime();
    Object localObject = mInterpolator;
    if (!(localObject instanceof StopLogic)) {
      f2 = (float)(l - mTransitionLastTime) * f1 * 1.0E-9F / mTransitionDuration;
    } else {
      f2 = 0.0F;
    }
    float f3 = mTransitionLastPosition + f2;
    if (mTransitionInstantly) {
      f3 = mTransitionGoalPosition;
    }
    boolean bool = f1 < 0.0F;
    int j = 0;
    if (((bool) && (f3 >= mTransitionGoalPosition)) || ((f1 <= 0.0F) && (f3 <= mTransitionGoalPosition)))
    {
      f3 = mTransitionGoalPosition;
      k = 1;
    }
    else
    {
      k = 0;
    }
    float f2 = f3;
    if (localObject != null)
    {
      f2 = f3;
      if (k == 0) {
        if (mTemporalInterpolator) {
          f2 = ((TimeInterpolator)localObject).getInterpolation((float)(l - mAnimationStartTime) * 1.0E-9F);
        } else {
          f2 = ((TimeInterpolator)localObject).getInterpolation(f3);
        }
      }
    }
    if ((!bool) || (f2 < mTransitionGoalPosition))
    {
      f3 = f2;
      if (f1 <= 0.0F)
      {
        f3 = f2;
        if (f2 > mTransitionGoalPosition) {}
      }
    }
    else
    {
      f3 = mTransitionGoalPosition;
    }
    mPostInterpolationPosition = f3;
    int i = getChildCount();
    l = getNanoTime();
    localObject = mProgressInterpolator;
    if (localObject == null) {
      k = j;
    } else {
      f3 = ((TimeInterpolator)localObject).getInterpolation(f3);
    }
    for (int k = j; k < i; k++)
    {
      localObject = getChildAt(k);
      MotionController localMotionController = (MotionController)mFrameArrayList.get(localObject);
      if (localMotionController != null) {
        localMotionController.interpolate((View)localObject, f3, l, mKeyCache);
      }
    }
    if (mMeasureDuringTransition) {
      requestLayout();
    }
  }
  
  private void fireTransitionChange()
  {
    Object localObject;
    if (mTransitionListener == null)
    {
      localObject = mTransitionListeners;
      if ((localObject == null) || (((CopyOnWriteArrayList)localObject).isEmpty())) {}
    }
    else if (mListenerPosition != mTransitionPosition)
    {
      if (mListenerState != -1)
      {
        localObject = mTransitionListener;
        if (localObject != null) {
          ((TransitionListener)localObject).onTransitionStarted(this, mBeginState, mEndState);
        }
        localObject = mTransitionListeners;
        if (localObject != null)
        {
          localObject = ((CopyOnWriteArrayList)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            ((TransitionListener)((Iterator)localObject).next()).onTransitionStarted(this, mBeginState, mEndState);
          }
        }
        mIsAnimating = true;
      }
      mListenerState = -1;
      float f = mTransitionPosition;
      mListenerPosition = f;
      localObject = mTransitionListener;
      if (localObject != null) {
        ((TransitionListener)localObject).onTransitionChange(this, mBeginState, mEndState, f);
      }
      localObject = mTransitionListeners;
      if (localObject != null)
      {
        localObject = ((CopyOnWriteArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((TransitionListener)((Iterator)localObject).next()).onTransitionChange(this, mBeginState, mEndState, mTransitionPosition);
        }
      }
      mIsAnimating = true;
    }
  }
  
  private void fireTransitionStarted(MotionLayout paramMotionLayout, int paramInt1, int paramInt2)
  {
    Object localObject = mTransitionListener;
    if (localObject != null) {
      ((TransitionListener)localObject).onTransitionStarted(this, paramInt1, paramInt2);
    }
    localObject = mTransitionListeners;
    if (localObject != null)
    {
      localObject = ((CopyOnWriteArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((TransitionListener)((Iterator)localObject).next()).onTransitionStarted(paramMotionLayout, paramInt1, paramInt2);
      }
    }
  }
  
  private boolean handlesTouchEvent(float paramFloat1, float paramFloat2, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    boolean bool2 = true;
    if (bool1)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
      {
        View localView = localViewGroup.getChildAt(i);
        if (handlesTouchEvent(localView.getLeft() + paramFloat1 - paramView.getScrollX(), localView.getTop() + paramFloat2 - paramView.getScrollY(), localView, paramMotionEvent))
        {
          bool1 = true;
          break label97;
        }
      }
    }
    bool1 = false;
    label97:
    if (!bool1)
    {
      mBoundsCheck.set(paramFloat1, paramFloat2, paramView.getRight() + paramFloat1 - paramView.getLeft(), paramView.getBottom() + paramFloat2 - paramView.getTop());
      if (((paramMotionEvent.getAction() != 0) || (mBoundsCheck.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))) && (callTransformedTouchEvent(paramView, paramMotionEvent, -paramFloat1, -paramFloat2))) {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  private void init(AttributeSet paramAttributeSet)
  {
    IS_IN_EDIT_MODE = isInEditMode();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.MotionLayout);
      int i = paramAttributeSet.getIndexCount();
      boolean bool1 = true;
      int j = 0;
      while (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        boolean bool2;
        if (k == R.styleable.MotionLayout_layoutDescription)
        {
          k = paramAttributeSet.getResourceId(k, -1);
          mScene = new MotionScene(getContext(), this, k);
          bool2 = bool1;
        }
        else if (k == R.styleable.MotionLayout_currentState)
        {
          mCurrentState = paramAttributeSet.getResourceId(k, -1);
          bool2 = bool1;
        }
        else if (k == R.styleable.MotionLayout_motionProgress)
        {
          mTransitionGoalPosition = paramAttributeSet.getFloat(k, 0.0F);
          mInTransition = true;
          bool2 = bool1;
        }
        else if (k == R.styleable.MotionLayout_applyMotionScene)
        {
          bool2 = paramAttributeSet.getBoolean(k, bool1);
        }
        else if (k == R.styleable.MotionLayout_showPaths)
        {
          bool2 = bool1;
          if (mDebugPath == 0)
          {
            if (paramAttributeSet.getBoolean(k, false)) {
              k = 2;
            } else {
              k = 0;
            }
            mDebugPath = k;
            bool2 = bool1;
          }
        }
        else
        {
          bool2 = bool1;
          if (k == R.styleable.MotionLayout_motionDebug)
          {
            mDebugPath = paramAttributeSet.getInt(k, 0);
            bool2 = bool1;
          }
        }
        j++;
        bool1 = bool2;
      }
      paramAttributeSet.recycle();
      if (mScene == null) {
        Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
      }
      if (!bool1) {
        mScene = null;
      }
    }
    if (mDebugPath != 0) {
      checkStructure();
    }
    if (mCurrentState == -1)
    {
      paramAttributeSet = mScene;
      if (paramAttributeSet != null)
      {
        mCurrentState = paramAttributeSet.getStartId();
        mBeginState = mScene.getStartId();
        mEndState = mScene.getEndId();
      }
    }
  }
  
  private void processTransitionCompleted()
  {
    Object localObject1;
    if (mTransitionListener == null)
    {
      localObject1 = mTransitionListeners;
      if ((localObject1 == null) || (((CopyOnWriteArrayList)localObject1).isEmpty())) {
        return;
      }
    }
    mIsAnimating = false;
    Iterator localIterator = mTransitionCompleted.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (Integer)localIterator.next();
      Object localObject2 = mTransitionListener;
      if (localObject2 != null) {
        ((TransitionListener)localObject2).onTransitionCompleted(this, ((Integer)localObject1).intValue());
      }
      localObject2 = mTransitionListeners;
      if (localObject2 != null)
      {
        localObject2 = ((CopyOnWriteArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((TransitionListener)((Iterator)localObject2).next()).onTransitionCompleted(this, ((Integer)localObject1).intValue());
        }
      }
    }
    mTransitionCompleted.clear();
  }
  
  private void setupMotionViews()
  {
    int i = getChildCount();
    mModel.build();
    int j = 1;
    mInTransition = true;
    Object localObject1 = new SparseArray();
    int k = 0;
    int m = 0;
    for (int n = 0; n < i; n++)
    {
      localObject2 = getChildAt(n);
      ((SparseArray)localObject1).put(((View)localObject2).getId(), (MotionController)mFrameArrayList.get(localObject2));
    }
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = mScene.gatPathMotionArc();
    if (i3 != -1) {
      for (n = 0; n < i; n++)
      {
        localObject1 = (MotionController)mFrameArrayList.get(getChildAt(n));
        if (localObject1 != null) {
          ((MotionController)localObject1).setPathMotionArc(i3);
        }
      }
    }
    localObject1 = new SparseBooleanArray();
    Object localObject2 = new int[mFrameArrayList.size()];
    int i4 = 0;
    Object localObject3;
    for (n = i4; i4 < i; n = i3)
    {
      localObject3 = getChildAt(i4);
      localObject3 = (MotionController)mFrameArrayList.get(localObject3);
      i3 = n;
      if (((MotionController)localObject3).getAnimateRelativeTo() != -1)
      {
        ((SparseBooleanArray)localObject1).put(((MotionController)localObject3).getAnimateRelativeTo(), true);
        localObject2[n] = ((MotionController)localObject3).getAnimateRelativeTo();
        i3 = n + 1;
      }
      i4++;
    }
    if (mDecoratorsHelpers != null)
    {
      for (i3 = 0; i3 < n; i3++)
      {
        localObject3 = (MotionController)mFrameArrayList.get(findViewById(localObject2[i3]));
        if (localObject3 != null) {
          mScene.getKeyFrames((MotionController)localObject3);
        }
      }
      localObject3 = mDecoratorsHelpers.iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((MotionHelper)((Iterator)localObject3).next()).onPreSetup(this, mFrameArrayList);
      }
      for (i3 = 0; i3 < n; i3++)
      {
        localObject3 = (MotionController)mFrameArrayList.get(findViewById(localObject2[i3]));
        if (localObject3 != null) {
          ((MotionController)localObject3).setup(i1, i2, mTransitionDuration, getNanoTime());
        }
      }
    }
    for (i3 = 0; i3 < n; i3++)
    {
      localObject3 = (MotionController)mFrameArrayList.get(findViewById(localObject2[i3]));
      if (localObject3 != null)
      {
        mScene.getKeyFrames((MotionController)localObject3);
        ((MotionController)localObject3).setup(i1, i2, mTransitionDuration, getNanoTime());
      }
    }
    for (n = 0; n < i; n++)
    {
      localObject3 = getChildAt(n);
      localObject2 = (MotionController)mFrameArrayList.get(localObject3);
      if ((!((SparseBooleanArray)localObject1).get(((View)localObject3).getId())) && (localObject2 != null))
      {
        mScene.getKeyFrames((MotionController)localObject2);
        ((MotionController)localObject2).setup(i1, i2, mTransitionDuration, getNanoTime());
      }
    }
    float f1 = mScene.getStaggered();
    if (f1 != 0.0F)
    {
      if (f1 < 0.0D) {
        n = 1;
      } else {
        n = 0;
      }
      float f2 = Math.abs(f1);
      float f3 = -3.4028235E38F;
      float f4 = Float.MAX_VALUE;
      i3 = 0;
      f1 = -3.4028235E38F;
      float f5 = Float.MAX_VALUE;
      float f7;
      while (i3 < i)
      {
        localObject1 = (MotionController)mFrameArrayList.get(getChildAt(i3));
        if (!Float.isNaN(mMotionStagger))
        {
          i3 = j;
          break label729;
        }
        float f6 = ((MotionController)localObject1).getFinalX();
        f7 = ((MotionController)localObject1).getFinalY();
        if (n != 0) {
          f7 -= f6;
        } else {
          f7 += f6;
        }
        f5 = Math.min(f5, f7);
        f1 = Math.max(f1, f7);
        i3++;
      }
      i3 = 0;
      label729:
      i4 = k;
      if (i3 != 0)
      {
        i3 = 0;
        f1 = f4;
        f7 = f3;
        for (;;)
        {
          i4 = m;
          if (i3 >= i) {
            break;
          }
          localObject1 = (MotionController)mFrameArrayList.get(getChildAt(i3));
          f3 = f7;
          f5 = f1;
          if (!Float.isNaN(mMotionStagger))
          {
            f5 = Math.min(f1, mMotionStagger);
            f3 = Math.max(f7, mMotionStagger);
          }
          i3++;
          f7 = f3;
          f1 = f5;
        }
        while (i4 < i)
        {
          localObject1 = (MotionController)mFrameArrayList.get(getChildAt(i4));
          if (!Float.isNaN(mMotionStagger))
          {
            mStaggerScale = (1.0F / (1.0F - f2));
            if (n != 0) {
              mStaggerOffset = (f2 - (f7 - mMotionStagger) / (f7 - f1) * f2);
            } else {
              mStaggerOffset = (f2 - (mMotionStagger - f1) * f2 / (f7 - f1));
            }
          }
          i4++;
        }
      }
      while (i4 < i)
      {
        localObject1 = (MotionController)mFrameArrayList.get(getChildAt(i4));
        f7 = ((MotionController)localObject1).getFinalX();
        f3 = ((MotionController)localObject1).getFinalY();
        if (n != 0) {
          f7 = f3 - f7;
        } else {
          f7 = f3 + f7;
        }
        mStaggerScale = (1.0F / (1.0F - f2));
        mStaggerOffset = (f2 - (f7 - f5) * f2 / (f1 - f5));
        i4++;
      }
    }
  }
  
  private Rect toRect(ConstraintWidget paramConstraintWidget)
  {
    mTempRect.top = paramConstraintWidget.getY();
    mTempRect.left = paramConstraintWidget.getX();
    Rect localRect1 = mTempRect;
    int i = paramConstraintWidget.getWidth();
    Rect localRect2 = mTempRect;
    right = (i + left);
    i = paramConstraintWidget.getHeight();
    paramConstraintWidget = mTempRect;
    bottom = (i + top);
    return paramConstraintWidget;
  }
  
  private static boolean willJump(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramFloat1 > 0.0F)
    {
      f = paramFloat1 / paramFloat3;
      if (paramFloat1 * f - paramFloat3 * f * f / 2.0F + paramFloat2 <= 1.0F) {
        bool2 = false;
      }
      return bool2;
    }
    float f = -paramFloat1 / paramFloat3;
    if (paramFloat3 * f * f / 2.0F + paramFloat1 * f + paramFloat2 < 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public void addTransitionListener(TransitionListener paramTransitionListener)
  {
    if (mTransitionListeners == null) {
      mTransitionListeners = new CopyOnWriteArrayList();
    }
    mTransitionListeners.add(paramTransitionListener);
  }
  
  public void animateTo(float paramFloat)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return;
    }
    float f1 = mTransitionLastPosition;
    float f2 = mTransitionPosition;
    if ((f1 != f2) && (mTransitionInstantly)) {
      mTransitionLastPosition = f2;
    }
    f1 = mTransitionLastPosition;
    if (f1 == paramFloat) {
      return;
    }
    mTemporalInterpolator = false;
    mTransitionGoalPosition = paramFloat;
    mTransitionDuration = (localMotionScene.getDuration() / 1000.0F);
    setProgress(mTransitionGoalPosition);
    mInterpolator = null;
    mProgressInterpolator = mScene.getInterpolator();
    mTransitionInstantly = false;
    mAnimationStartTime = getNanoTime();
    mInTransition = true;
    mTransitionPosition = f1;
    mTransitionLastPosition = f1;
    invalidate();
  }
  
  public boolean applyViewTransition(int paramInt, MotionController paramMotionController)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      return localMotionScene.applyViewTransition(paramInt, paramMotionController);
    }
    return false;
  }
  
  public ConstraintSet cloneConstraintSet(int paramInt)
  {
    Object localObject = mScene;
    if (localObject == null) {
      return null;
    }
    ConstraintSet localConstraintSet = ((MotionScene)localObject).getConstraintSet(paramInt);
    localObject = new ConstraintSet();
    ((ConstraintSet)localObject).clone(localConstraintSet);
    return (ConstraintSet)localObject;
  }
  
  public void disableAutoTransition(boolean paramBoolean)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return;
    }
    localMotionScene.disableAutoTransition(paramBoolean);
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject = mDecoratorsHelpers;
    if (localObject != null)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((MotionHelper)((Iterator)localObject).next()).onPreDraw(paramCanvas);
      }
    }
    evaluate(false);
    localObject = mScene;
    if (localObject != null)
    {
      localObject = mViewTransitionController;
      if (localObject != null) {
        ((ViewTransitionController)localObject).animate();
      }
    }
    super.dispatchDraw(paramCanvas);
    if (mScene == null) {
      return;
    }
    if (((mDebugPath & 0x1) == 1) && (!isInEditMode()))
    {
      mFrames += 1;
      long l1 = getNanoTime();
      long l2 = mLastDrawTime;
      if (l2 != -1L)
      {
        l2 = l1 - l2;
        if (l2 > 200000000L)
        {
          mLastFps = ((int)(mFrames / ((float)l2 * 1.0E-9F) * 100.0F) / 100.0F);
          mFrames = 0;
          mLastDrawTime = l1;
        }
      }
      else
      {
        mLastDrawTime = l1;
      }
      Paint localPaint = new Paint();
      localPaint.setTextSize(42.0F);
      float f = (int)(getProgress() * 1000.0F) / 10.0F;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(mLastFps);
      ((StringBuilder)localObject).append(" fps ");
      ((StringBuilder)localObject).append(Debug.getState(this, mBeginState));
      ((StringBuilder)localObject).append(" -> ");
      StringBuilder localStringBuilder = z2.t(((StringBuilder)localObject).toString());
      localStringBuilder.append(Debug.getState(this, mEndState));
      localStringBuilder.append(" (progress: ");
      localStringBuilder.append(f);
      localStringBuilder.append(" ) state=");
      int i = mCurrentState;
      if (i == -1) {
        localObject = "undefined";
      } else {
        localObject = Debug.getState(this, i);
      }
      localStringBuilder.append((String)localObject);
      localObject = localStringBuilder.toString();
      localPaint.setColor(-16777216);
      paramCanvas.drawText((String)localObject, 11.0F, getHeight() - 29, localPaint);
      localPaint.setColor(-7864184);
      paramCanvas.drawText((String)localObject, 10.0F, getHeight() - 30, localPaint);
    }
    if (mDebugPath > 1)
    {
      if (mDevModeDraw == null) {
        mDevModeDraw = new DevModeDraw();
      }
      mDevModeDraw.draw(paramCanvas, mFrameArrayList, mScene.getDuration(), mDebugPath);
    }
    localObject = mDecoratorsHelpers;
    if (localObject != null)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((MotionHelper)((Iterator)localObject).next()).onPostDraw(paramCanvas);
      }
    }
  }
  
  public void enableTransition(int paramInt, boolean paramBoolean)
  {
    MotionScene.Transition localTransition1 = getTransition(paramInt);
    if (paramBoolean)
    {
      localTransition1.setEnabled(true);
      return;
    }
    Object localObject = mScene;
    if (localTransition1 == mCurrentTransition)
    {
      localObject = ((MotionScene)localObject).getTransitionsWithState(mCurrentState).iterator();
      while (((Iterator)localObject).hasNext())
      {
        MotionScene.Transition localTransition2 = (MotionScene.Transition)((Iterator)localObject).next();
        if (localTransition2.isEnabled()) {
          mScene.mCurrentTransition = localTransition2;
        }
      }
    }
    localTransition1.setEnabled(false);
  }
  
  public void enableViewTransition(int paramInt, boolean paramBoolean)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      localMotionScene.enableViewTransition(paramInt, paramBoolean);
    }
  }
  
  public void endTrigger(boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      Object localObject = getChildAt(j);
      localObject = (MotionController)mFrameArrayList.get(localObject);
      if (localObject != null) {
        ((MotionController)localObject).endTrigger(paramBoolean);
      }
    }
  }
  
  public void evaluate(boolean paramBoolean)
  {
    if (mTransitionLastTime == -1L) {
      mTransitionLastTime = getNanoTime();
    }
    float f1 = mTransitionLastPosition;
    if ((f1 > 0.0F) && (f1 < 1.0F)) {
      mCurrentState = -1;
    }
    boolean bool1 = mKeepAnimating;
    int i = 1;
    int j = 1;
    boolean bool2 = false;
    int k = 0;
    boolean bool3;
    if (!bool1)
    {
      bool3 = bool2;
      if (!mInTransition) {
        break label1170;
      }
      if (!paramBoolean)
      {
        bool3 = bool2;
        if (mTransitionGoalPosition == f1) {
          break label1170;
        }
      }
    }
    float f2 = Math.signum(mTransitionGoalPosition - f1);
    long l = getNanoTime();
    Object localObject1 = mInterpolator;
    if (!(localObject1 instanceof MotionInterpolator)) {
      f3 = (float)(l - mTransitionLastTime) * f2 * 1.0E-9F / mTransitionDuration;
    } else {
      f3 = 0.0F;
    }
    f1 = mTransitionLastPosition + f3;
    if (mTransitionInstantly) {
      f1 = mTransitionGoalPosition;
    }
    bool2 = f2 < 0.0F;
    if (((bool2) && (f1 >= mTransitionGoalPosition)) || ((f2 <= 0.0F) && (f1 <= mTransitionGoalPosition)))
    {
      f1 = mTransitionGoalPosition;
      mInTransition = false;
      bool3 = true;
    }
    else
    {
      bool3 = false;
    }
    mTransitionLastPosition = f1;
    mTransitionPosition = f1;
    mTransitionLastTime = l;
    float f4;
    Object localObject2;
    if ((localObject1 != null) && (!bool3))
    {
      if (mTemporalInterpolator)
      {
        f4 = ((TimeInterpolator)localObject1).getInterpolation((float)(l - mAnimationStartTime) * 1.0E-9F);
        localObject1 = mInterpolator;
        localObject2 = mStopLogic;
        if (localObject1 == localObject2)
        {
          if (((StopLogic)localObject2).isStopped()) {
            m = 2;
          } else {
            m = 1;
          }
        }
        else {
          m = 0;
        }
        mTransitionLastPosition = f4;
        mTransitionLastTime = l;
        localObject1 = mInterpolator;
        f1 = f4;
        if ((localObject1 instanceof MotionInterpolator))
        {
          float f5 = ((MotionInterpolator)localObject1).getVelocity();
          mLastVelocity = f5;
          if ((Math.abs(f5) * mTransitionDuration <= 1.0E-5F) && (m == 2)) {
            mInTransition = false;
          }
          f3 = f4;
          if (f5 > 0.0F)
          {
            f3 = f4;
            if (f4 >= 1.0F)
            {
              mTransitionLastPosition = 1.0F;
              mInTransition = false;
              f3 = 1.0F;
            }
          }
          f1 = f3;
          if (f5 < 0.0F)
          {
            f1 = f3;
            if (f3 <= 0.0F)
            {
              mTransitionLastPosition = 0.0F;
              mInTransition = false;
              f1 = 0.0F;
              break label543;
            }
          }
        }
        break label543;
      }
      f4 = ((TimeInterpolator)localObject1).getInterpolation(f1);
      localObject1 = mInterpolator;
      if ((localObject1 instanceof MotionInterpolator)) {
        mLastVelocity = ((MotionInterpolator)localObject1).getVelocity();
      } else {
        mLastVelocity = ((((TimeInterpolator)localObject1).getInterpolation(f1 + f3) - f4) * f2 / f3);
      }
      f1 = f4;
    }
    else
    {
      mLastVelocity = f3;
    }
    int m = 0;
    label543:
    if (Math.abs(mLastVelocity) > 1.0E-5F) {
      setState(TransitionState.MOVING);
    }
    float f3 = f1;
    if (m != 1)
    {
      if ((!bool2) || (f1 < mTransitionGoalPosition))
      {
        f4 = f1;
        if (f2 <= 0.0F)
        {
          f4 = f1;
          if (f1 > mTransitionGoalPosition) {}
        }
      }
      else
      {
        f4 = mTransitionGoalPosition;
        mInTransition = false;
      }
      if (f4 < 1.0F)
      {
        f3 = f4;
        if (f4 > 0.0F) {}
      }
      else
      {
        mInTransition = false;
        setState(TransitionState.FINISHED);
        f3 = f4;
      }
    }
    int n = getChildCount();
    mKeepAnimating = false;
    l = getNanoTime();
    mPostInterpolationPosition = f3;
    localObject1 = mProgressInterpolator;
    if (localObject1 == null) {
      f1 = f3;
    } else {
      f1 = ((TimeInterpolator)localObject1).getInterpolation(f3);
    }
    localObject1 = mProgressInterpolator;
    if (localObject1 != null)
    {
      f4 = ((TimeInterpolator)localObject1).getInterpolation(f2 / mTransitionDuration + f3);
      mLastVelocity = f4;
      mLastVelocity = (f4 - mProgressInterpolator.getInterpolation(f3));
    }
    for (m = 0; m < n; m++)
    {
      localObject1 = getChildAt(m);
      localObject2 = (MotionController)mFrameArrayList.get(localObject1);
      if (localObject2 != null)
      {
        paramBoolean = mKeepAnimating;
        mKeepAnimating = (((MotionController)localObject2).interpolate((View)localObject1, f1, l, mKeyCache) | paramBoolean);
      }
    }
    if (((bool2) && (f3 >= mTransitionGoalPosition)) || ((f2 <= 0.0F) && (f3 <= mTransitionGoalPosition))) {
      m = 1;
    } else {
      m = 0;
    }
    if ((!mKeepAnimating) && (!mInTransition) && (m != 0)) {
      setState(TransitionState.FINISHED);
    }
    if (mMeasureDuringTransition) {
      requestLayout();
    }
    mKeepAnimating = (m ^ 0x1 | mKeepAnimating);
    m = k;
    if (f3 <= 0.0F)
    {
      n = mBeginState;
      m = k;
      if (n != -1)
      {
        m = k;
        if (mCurrentState != n)
        {
          mCurrentState = n;
          mScene.getConstraintSet(n).applyCustomAttributes(this);
          setState(TransitionState.FINISHED);
          m = 1;
        }
      }
    }
    k = m;
    if (f3 >= 1.0D)
    {
      n = mCurrentState;
      int i1 = mEndState;
      k = m;
      if (n != i1)
      {
        mCurrentState = i1;
        mScene.getConstraintSet(i1).applyCustomAttributes(this);
        setState(TransitionState.FINISHED);
        k = 1;
      }
    }
    if ((!mKeepAnimating) && (!mInTransition))
    {
      if (((bool2) && (f3 == 1.0F)) || ((f2 < 0.0F) && (f3 == 0.0F))) {
        setState(TransitionState.FINISHED);
      }
    }
    else {
      invalidate();
    }
    m = k;
    if (!mKeepAnimating)
    {
      m = k;
      if (!mInTransition) {
        if ((!bool2) || (f3 != 1.0F))
        {
          m = k;
          if (f2 < 0.0F)
          {
            m = k;
            if (f3 != 0.0F) {}
          }
        }
        else
        {
          onNewStateAttachHandlers();
          m = k;
        }
      }
    }
    label1170:
    f1 = mTransitionLastPosition;
    if (f1 >= 1.0F)
    {
      i = mCurrentState;
      k = mEndState;
      if (i != k) {
        m = j;
      }
    }
    for (mCurrentState = k;; mCurrentState = k)
    {
      k = m;
      break;
      k = m;
      if (f1 > 0.0F) {
        break;
      }
      j = mCurrentState;
      k = mBeginState;
      if (j != k) {
        m = i;
      }
    }
    mNeedsFireTransitionCompleted |= k;
    if ((k != 0) && (!mInLayout)) {
      requestLayout();
    }
    mTransitionPosition = mTransitionLastPosition;
  }
  
  public void fireTransitionCompleted()
  {
    if (mTransitionListener == null)
    {
      localObject = mTransitionListeners;
      if ((localObject == null) || (((CopyOnWriteArrayList)localObject).isEmpty())) {}
    }
    else if (mListenerState == -1)
    {
      mListenerState = mCurrentState;
      int i;
      if (!mTransitionCompleted.isEmpty())
      {
        localObject = mTransitionCompleted;
        i = ((Integer)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1)).intValue();
      }
      else
      {
        i = -1;
      }
      int j = mCurrentState;
      if ((i != j) && (j != -1)) {
        mTransitionCompleted.add(Integer.valueOf(j));
      }
    }
    processTransitionCompleted();
    Object localObject = mOnComplete;
    if (localObject != null) {
      ((Runnable)localObject).run();
    }
    localObject = mScheduledTransitionTo;
    if ((localObject != null) && (mScheduledTransitions > 0))
    {
      transitionToState(localObject[0]);
      localObject = mScheduledTransitionTo;
      System.arraycopy(localObject, 1, localObject, 0, localObject.length - 1);
      mScheduledTransitions -= 1;
    }
  }
  
  public void fireTrigger(int paramInt, boolean paramBoolean, float paramFloat)
  {
    Object localObject = mTransitionListener;
    if (localObject != null) {
      ((TransitionListener)localObject).onTransitionTrigger(this, paramInt, paramBoolean, paramFloat);
    }
    localObject = mTransitionListeners;
    if (localObject != null)
    {
      localObject = ((CopyOnWriteArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((TransitionListener)((Iterator)localObject).next()).onTransitionTrigger(this, paramInt, paramBoolean, paramFloat);
      }
    }
  }
  
  public void getAnchorDpDt(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat)
  {
    Object localObject = mFrameArrayList;
    View localView = getViewById(paramInt);
    localObject = (MotionController)((HashMap)localObject).get(localView);
    if (localObject != null)
    {
      ((MotionController)localObject).getDpDt(paramFloat1, paramFloat2, paramFloat3, paramArrayOfFloat);
      paramFloat2 = localView.getY();
      lastPos = paramFloat1;
      lastY = paramFloat2;
    }
    else
    {
      if (localView == null) {
        paramArrayOfFloat = a.f("", paramInt);
      } else {
        paramArrayOfFloat = localView.getContext().getResources().getResourceName(paramInt);
      }
      z2.A("WARNING could not find view id ", paramArrayOfFloat, "MotionLayout");
    }
  }
  
  public ConstraintSet getConstraintSet(int paramInt)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return null;
    }
    return localMotionScene.getConstraintSet(paramInt);
  }
  
  public int[] getConstraintSetIds()
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return null;
    }
    return localMotionScene.getConstraintSetIds();
  }
  
  public String getConstraintSetNames(int paramInt)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return null;
    }
    return localMotionScene.lookUpConstraintName(paramInt);
  }
  
  public int getCurrentState()
  {
    return mCurrentState;
  }
  
  public void getDebugMode(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 2;
    } else {
      i = 1;
    }
    mDebugPath = i;
    invalidate();
  }
  
  public ArrayList<MotionScene.Transition> getDefinedTransitions()
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return null;
    }
    return localMotionScene.getDefinedTransitions();
  }
  
  public DesignTool getDesignTool()
  {
    if (mDesignTool == null) {
      mDesignTool = new DesignTool(this);
    }
    return mDesignTool;
  }
  
  public int getEndState()
  {
    return mEndState;
  }
  
  public MotionController getMotionController(int paramInt)
  {
    return (MotionController)mFrameArrayList.get(findViewById(paramInt));
  }
  
  public long getNanoTime()
  {
    return System.nanoTime();
  }
  
  public float getProgress()
  {
    return mTransitionLastPosition;
  }
  
  public MotionScene getScene()
  {
    return mScene;
  }
  
  public int getStartState()
  {
    return mBeginState;
  }
  
  public float getTargetPosition()
  {
    return mTransitionGoalPosition;
  }
  
  public MotionScene.Transition getTransition(int paramInt)
  {
    return mScene.getTransitionById(paramInt);
  }
  
  public Bundle getTransitionState()
  {
    if (mStateCache == null) {
      mStateCache = new StateCache();
    }
    mStateCache.recordState();
    return mStateCache.getTransitionState();
  }
  
  public long getTransitionTimeMs()
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      mTransitionDuration = (localMotionScene.getDuration() / 1000.0F);
    }
    return (mTransitionDuration * 1000.0F);
  }
  
  public float getVelocity()
  {
    return mLastVelocity;
  }
  
  public void getViewVelocity(View paramView, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat, int paramInt)
  {
    float f1 = mLastVelocity;
    float f2 = mTransitionLastPosition;
    if (mInterpolator != null)
    {
      f1 = Math.signum(mTransitionGoalPosition - f2);
      float f3 = mInterpolator.getInterpolation(mTransitionLastPosition + 1.0E-5F);
      f2 = mInterpolator.getInterpolation(mTransitionLastPosition);
      f1 = (f3 - f2) / 1.0E-5F * f1 / mTransitionDuration;
    }
    Object localObject = mInterpolator;
    if ((localObject instanceof MotionInterpolator)) {
      f1 = ((MotionInterpolator)localObject).getVelocity();
    }
    localObject = (MotionController)mFrameArrayList.get(paramView);
    if ((paramInt & 0x1) == 0) {
      ((MotionController)localObject).getPostLayoutDvDp(f2, paramView.getWidth(), paramView.getHeight(), paramFloat1, paramFloat2, paramArrayOfFloat);
    } else {
      ((MotionController)localObject).getDpDt(f2, paramFloat1, paramFloat2, paramArrayOfFloat);
    }
    if (paramInt < 2)
    {
      paramArrayOfFloat[0] *= f1;
      paramArrayOfFloat[1] *= f1;
    }
  }
  
  public boolean isAttachedToWindow()
  {
    return super.isAttachedToWindow();
  }
  
  public boolean isDelayedApplicationOfInitialState()
  {
    return mDelayedApply;
  }
  
  public boolean isInRotation()
  {
    return mInRotation;
  }
  
  public boolean isInteractionEnabled()
  {
    return mInteractionEnabled;
  }
  
  public boolean isViewTransitionEnabled(int paramInt)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      return localMotionScene.isViewTransitionEnabled(paramInt);
    }
    return false;
  }
  
  public void jumpToState(int paramInt)
  {
    if (!isAttachedToWindow()) {
      mCurrentState = paramInt;
    }
    if (mBeginState == paramInt) {
      setProgress(0.0F);
    } else if (mEndState == paramInt) {
      setProgress(1.0F);
    } else {
      setTransition(paramInt, paramInt);
    }
  }
  
  public void loadLayoutDescription(int paramInt)
  {
    if (paramInt != 0) {
      try
      {
        Object localObject1 = new androidx/constraintlayout/motion/widget/MotionScene;
        ((MotionScene)localObject1).<init>(getContext(), this, paramInt);
        mScene = ((MotionScene)localObject1);
        if (mCurrentState == -1)
        {
          mCurrentState = ((MotionScene)localObject1).getStartId();
          mBeginState = mScene.getStartId();
          mEndState = mScene.getEndId();
        }
        boolean bool = isAttachedToWindow();
        if (bool) {
          try
          {
            localObject1 = getDisplay();
            if (localObject1 == null) {
              paramInt = 0;
            } else {
              paramInt = ((Display)localObject1).getRotation();
            }
            mPreviouseRotation = paramInt;
            localObject1 = mScene;
            if (localObject1 != null)
            {
              localObject1 = ((MotionScene)localObject1).getConstraintSet(mCurrentState);
              mScene.readFallback(this);
              localObject2 = mDecoratorsHelpers;
              if (localObject2 != null)
              {
                localObject2 = ((ArrayList)localObject2).iterator();
                while (((Iterator)localObject2).hasNext()) {
                  ((MotionHelper)((Iterator)localObject2).next()).onFinishedMotionScene(this);
                }
              }
              if (localObject1 != null) {
                ((ConstraintSet)localObject1).applyTo(this);
              }
              mBeginState = mCurrentState;
            }
            onNewStateAttachHandlers();
            localObject1 = mStateCache;
            if (localObject1 != null)
            {
              if (mDelayedApply)
              {
                localObject1 = new androidx/constraintlayout/motion/widget/MotionLayout$1;
                ((1)localObject1).<init>(this);
                post((Runnable)localObject1);
              }
              else
              {
                ((StateCache)localObject1).apply();
              }
            }
            else
            {
              localObject1 = mScene;
              if (localObject1 != null)
              {
                localObject1 = mCurrentTransition;
                if ((localObject1 != null) && (((MotionScene.Transition)localObject1).getAutoTransition() == 4))
                {
                  transitionToEnd();
                  setState(TransitionState.SETUP);
                  setState(TransitionState.MOVING);
                }
              }
            }
          }
          catch (Exception localException1)
          {
            Object localObject2 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject2).<init>("unable to parse MotionScene file", localException1);
            throw ((Throwable)localObject2);
          }
        }
        mScene = null;
      }
      catch (Exception localException2)
      {
        throw new IllegalArgumentException("unable to parse MotionScene file", localException2);
      }
    }
    mScene = null;
  }
  
  public int lookUpConstraintId(String paramString)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return 0;
    }
    return localMotionScene.lookUpConstraintId(paramString);
  }
  
  public MotionTracker obtainVelocityTracker()
  {
    return MyTracker.obtain();
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject1 = getDisplay();
    if (localObject1 != null) {
      mPreviouseRotation = ((Display)localObject1).getRotation();
    }
    localObject1 = mScene;
    if (localObject1 != null)
    {
      int i = mCurrentState;
      if (i != -1)
      {
        localObject1 = ((MotionScene)localObject1).getConstraintSet(i);
        mScene.readFallback(this);
        Object localObject2 = mDecoratorsHelpers;
        if (localObject2 != null)
        {
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((MotionHelper)((Iterator)localObject2).next()).onFinishedMotionScene(this);
          }
        }
        if (localObject1 != null) {
          ((ConstraintSet)localObject1).applyTo(this);
        }
        mBeginState = mCurrentState;
      }
    }
    onNewStateAttachHandlers();
    localObject1 = mStateCache;
    if (localObject1 != null)
    {
      if (mDelayedApply) {
        post(new Runnable()
        {
          public void run()
          {
            MotionLayout.access$000(MotionLayout.this).apply();
          }
        });
      } else {
        ((StateCache)localObject1).apply();
      }
    }
    else
    {
      localObject1 = mScene;
      if (localObject1 != null)
      {
        localObject1 = mCurrentTransition;
        if ((localObject1 != null) && (((MotionScene.Transition)localObject1).getAutoTransition() == 4))
        {
          transitionToEnd();
          setState(TransitionState.SETUP);
          setState(TransitionState.MOVING);
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = mScene;
    if ((localObject != null) && (mInteractionEnabled))
    {
      localObject = mViewTransitionController;
      if (localObject != null) {
        ((ViewTransitionController)localObject).touchEvent(paramMotionEvent);
      }
      localObject = mScene.mCurrentTransition;
      if ((localObject != null) && (((MotionScene.Transition)localObject).isEnabled()))
      {
        localObject = ((MotionScene.Transition)localObject).getTouchResponse();
        if (localObject != null)
        {
          if (paramMotionEvent.getAction() == 0)
          {
            RectF localRectF = ((TouchResponse)localObject).getTouchRegion(this, new RectF());
            if ((localRectF != null) && (!localRectF.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))) {
              return false;
            }
          }
          int i = ((TouchResponse)localObject).getTouchRegionId();
          if (i != -1)
          {
            localObject = mRegionView;
            if ((localObject == null) || (((View)localObject).getId() != i)) {
              mRegionView = findViewById(i);
            }
            localObject = mRegionView;
            if (localObject != null)
            {
              mBoundsCheck.set(((View)localObject).getLeft(), mRegionView.getTop(), mRegionView.getRight(), mRegionView.getBottom());
              if ((mBoundsCheck.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) && (!handlesTouchEvent(mRegionView.getLeft(), mRegionView.getTop(), mRegionView, paramMotionEvent))) {
                return onTouchEvent(paramMotionEvent);
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mInLayout = true;
    try
    {
      if (mScene == null)
      {
        super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      }
      paramInt1 = paramInt3 - paramInt1;
      paramInt2 = paramInt4 - paramInt2;
      if ((mLastLayoutWidth != paramInt1) || (mLastLayoutHeight != paramInt2))
      {
        rebuildScene();
        evaluate(true);
      }
      mLastLayoutWidth = paramInt1;
      mLastLayoutHeight = paramInt2;
      mOldWidth = paramInt1;
      mOldHeight = paramInt2;
      return;
    }
    finally
    {
      mInLayout = false;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (mScene == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = mLastWidthMeasureSpec;
    int j = 0;
    if ((i == paramInt1) && (mLastHeightMeasureSpec == paramInt2)) {
      i = 0;
    } else {
      i = 1;
    }
    if (mNeedsFireTransitionCompleted)
    {
      mNeedsFireTransitionCompleted = false;
      onNewStateAttachHandlers();
      processTransitionCompleted();
      i = 1;
    }
    if (mDirtyHierarchy) {
      i = 1;
    }
    mLastWidthMeasureSpec = paramInt1;
    mLastHeightMeasureSpec = paramInt2;
    int k = mScene.getStartId();
    int m = mScene.getEndId();
    if (((i != 0) || (mModel.isNotConfiguredWith(k, m))) && (mBeginState != -1))
    {
      super.onMeasure(paramInt1, paramInt2);
      mModel.initFrom(mLayoutWidget, mScene.getConstraintSet(k), mScene.getConstraintSet(m));
      mModel.reEvaluateState();
      mModel.setMeasuredId(k, m);
      paramInt1 = j;
    }
    else
    {
      if (i != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      paramInt1 = 1;
    }
    if ((mMeasureDuringTransition) || (paramInt1 != 0))
    {
      i = getPaddingTop();
      paramInt2 = getPaddingBottom();
      j = getPaddingLeft();
      paramInt1 = getPaddingRight();
      paramInt1 = mLayoutWidget.getWidth() + (paramInt1 + j);
      paramInt2 = mLayoutWidget.getHeight() + (paramInt2 + i);
      i = mWidthMeasureMode;
      float f;
      if ((i == Integer.MIN_VALUE) || (i == 0))
      {
        paramInt1 = mStartWrapWidth;
        f = paramInt1;
        paramInt1 = (int)(mPostInterpolationPosition * (mEndWrapWidth - paramInt1) + f);
        requestLayout();
      }
      i = mHeightMeasureMode;
      if ((i == Integer.MIN_VALUE) || (i == 0))
      {
        paramInt2 = mStartWrapHeight;
        f = paramInt2;
        paramInt2 = (int)(mPostInterpolationPosition * (mEndWrapHeight - paramInt2) + f);
        requestLayout();
      }
      setMeasuredDimension(paramInt1, paramInt2);
    }
    evaluateLayout();
  }
  
  public boolean onNestedFling(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean onNestedPreFling(@NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(@NonNull final View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt, int paramInt3)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return;
    }
    MotionScene.Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (localTransition.isEnabled()))
    {
      boolean bool = localTransition.isEnabled();
      int i = -1;
      TouchResponse localTouchResponse;
      if (bool)
      {
        localTouchResponse = localTransition.getTouchResponse();
        if (localTouchResponse != null)
        {
          paramInt3 = localTouchResponse.getTouchRegionId();
          if ((paramInt3 != -1) && (paramView.getId() != paramInt3)) {
            return;
          }
        }
      }
      if (localMotionScene.getMoveWhenScrollAtTop())
      {
        localTouchResponse = localTransition.getTouchResponse();
        paramInt3 = i;
        if (localTouchResponse != null)
        {
          paramInt3 = i;
          if ((localTouchResponse.getFlags() & 0x4) != 0) {
            paramInt3 = paramInt2;
          }
        }
        f1 = mTransitionPosition;
        if (((f1 == 1.0F) || (f1 == 0.0F)) && (paramView.canScrollVertically(paramInt3))) {
          return;
        }
      }
      if ((localTransition.getTouchResponse() != null) && ((localTransition.getTouchResponse().getFlags() & 0x1) != 0))
      {
        f1 = localMotionScene.getProgressDirection(paramInt1, paramInt2);
        f2 = mTransitionLastPosition;
        if (((f2 <= 0.0F) && (f1 < 0.0F)) || ((f2 >= 1.0F) && (f1 > 0.0F)))
        {
          paramView.setNestedScrollingEnabled(false);
          paramView.post(new Runnable()
          {
            public void run()
            {
              paramView.setNestedScrollingEnabled(true);
            }
          });
          return;
        }
      }
      float f3 = mTransitionPosition;
      long l = getNanoTime();
      float f1 = paramInt1;
      mScrollTargetDX = f1;
      float f2 = paramInt2;
      mScrollTargetDY = f2;
      mScrollTargetDT = ((float)((l - mScrollTargetTime) * 1.0E-9D));
      mScrollTargetTime = l;
      localMotionScene.processScrollMove(f1, f2);
      if (f3 != mTransitionPosition)
      {
        paramArrayOfInt[0] = paramInt1;
        paramArrayOfInt[1] = paramInt2;
      }
      evaluate(false);
      if ((paramArrayOfInt[0] != 0) || (paramArrayOfInt[1] != 0)) {
        mUndergoingMotion = true;
      }
    }
  }
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    if ((mUndergoingMotion) || (paramInt1 != 0) || (paramInt2 != 0))
    {
      paramArrayOfInt[0] += paramInt3;
      paramArrayOfInt[1] += paramInt4;
    }
    mUndergoingMotion = false;
  }
  
  public void onNestedScrollAccepted(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    mScrollTargetTime = getNanoTime();
    mScrollTargetDT = 0.0F;
    mScrollTargetDX = 0.0F;
    mScrollTargetDY = 0.0F;
  }
  
  public void onNewStateAttachHandlers()
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return;
    }
    if (localMotionScene.autoTransition(this, mCurrentState))
    {
      requestLayout();
      return;
    }
    int i = mCurrentState;
    if (i != -1) {
      mScene.addOnClickListeners(this, i);
    }
    if (mScene.supportTouch()) {
      mScene.setupTouch();
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      localMotionScene.setRtl(isRtl());
    }
  }
  
  public boolean onStartNestedScroll(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    paramView1 = mScene;
    if (paramView1 != null)
    {
      paramView1 = mCurrentTransition;
      if ((paramView1 != null) && (paramView1.getTouchResponse() != null) && ((mScene.mCurrentTransition.getTouchResponse().getFlags() & 0x2) == 0)) {
        return true;
      }
    }
    return false;
  }
  
  public void onStopNestedScroll(@NonNull View paramView, int paramInt)
  {
    paramView = mScene;
    if (paramView != null)
    {
      float f = mScrollTargetDT;
      if (f != 0.0F) {
        paramView.processScrollUp(mScrollTargetDX / f, mScrollTargetDY / f);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = mScene;
    if ((localObject != null) && (mInteractionEnabled) && (((MotionScene)localObject).supportTouch()))
    {
      localObject = mScene.mCurrentTransition;
      if ((localObject != null) && (!((MotionScene.Transition)localObject).isEnabled())) {
        return super.onTouchEvent(paramMotionEvent);
      }
      mScene.processTouchEvent(paramMotionEvent, getCurrentState(), this);
      if (mScene.mCurrentTransition.isTransitionFlag(4)) {
        return mScene.mCurrentTransition.getTouchResponse().isDragStarted();
      }
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void onViewAdded(View paramView)
  {
    super.onViewAdded(paramView);
    if ((paramView instanceof MotionHelper))
    {
      paramView = (MotionHelper)paramView;
      if (mTransitionListeners == null) {
        mTransitionListeners = new CopyOnWriteArrayList();
      }
      mTransitionListeners.add(paramView);
      if (paramView.isUsedOnShow())
      {
        if (mOnShowHelpers == null) {
          mOnShowHelpers = new ArrayList();
        }
        mOnShowHelpers.add(paramView);
      }
      if (paramView.isUseOnHide())
      {
        if (mOnHideHelpers == null) {
          mOnHideHelpers = new ArrayList();
        }
        mOnHideHelpers.add(paramView);
      }
      if (paramView.isDecorator())
      {
        if (mDecoratorsHelpers == null) {
          mDecoratorsHelpers = new ArrayList();
        }
        mDecoratorsHelpers.add(paramView);
      }
    }
  }
  
  public void onViewRemoved(View paramView)
  {
    super.onViewRemoved(paramView);
    ArrayList localArrayList = mOnShowHelpers;
    if (localArrayList != null) {
      localArrayList.remove(paramView);
    }
    localArrayList = mOnHideHelpers;
    if (localArrayList != null) {
      localArrayList.remove(paramView);
    }
  }
  
  public void parseLayoutDescription(int paramInt)
  {
    mConstraintLayoutSpec = null;
  }
  
  @Deprecated
  public void rebuildMotion()
  {
    Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
    rebuildScene();
  }
  
  public void rebuildScene()
  {
    mModel.reEvaluateState();
    invalidate();
  }
  
  public boolean removeTransitionListener(TransitionListener paramTransitionListener)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = mTransitionListeners;
    if (localCopyOnWriteArrayList == null) {
      return false;
    }
    return localCopyOnWriteArrayList.remove(paramTransitionListener);
  }
  
  public void requestLayout()
  {
    if ((!mMeasureDuringTransition) && (mCurrentState == -1))
    {
      Object localObject = mScene;
      if (localObject != null)
      {
        localObject = mCurrentTransition;
        if (localObject != null)
        {
          int i = ((MotionScene.Transition)localObject).getLayoutDuringTransition();
          if (i == 0) {
            return;
          }
          if (i == 2)
          {
            int j = getChildCount();
            for (i = 0; i < j; i++)
            {
              localObject = getChildAt(i);
              ((MotionController)mFrameArrayList.get(localObject)).remeasure();
            }
            return;
          }
        }
      }
    }
    super.requestLayout();
  }
  
  @RequiresApi(api=17)
  public void rotateTo(int paramInt1, int paramInt2)
  {
    int i = 1;
    mInRotation = true;
    mPreRotateWidth = getWidth();
    mPreRotateHeight = getHeight();
    int j = getDisplay().getRotation();
    if ((j + 1) % 4 <= (mPreviouseRotation + 1) % 4) {
      i = 2;
    }
    mRotatMode = i;
    mPreviouseRotation = j;
    j = getChildCount();
    for (i = 0; i < j; i++)
    {
      View localView = getChildAt(i);
      ViewState localViewState1 = (ViewState)mPreRotate.get(localView);
      ViewState localViewState2 = localViewState1;
      if (localViewState1 == null)
      {
        localViewState2 = new ViewState();
        mPreRotate.put(localView, localViewState2);
      }
      localViewState2.getState(localView);
    }
    mBeginState = -1;
    mEndState = paramInt1;
    mScene.setTransition(-1, paramInt1);
    mModel.initFrom(mLayoutWidget, null, mScene.getConstraintSet(mEndState));
    mTransitionPosition = 0.0F;
    mTransitionLastPosition = 0.0F;
    invalidate();
    transitionToEnd(new Runnable()
    {
      public void run()
      {
        MotionLayout.access$302(MotionLayout.this, false);
      }
    });
    if (paramInt2 > 0) {
      mTransitionDuration = (paramInt2 / 1000.0F);
    }
  }
  
  public void scheduleTransitionTo(int paramInt)
  {
    if (getCurrentState() == -1)
    {
      transitionToState(paramInt);
    }
    else
    {
      int[] arrayOfInt = mScheduledTransitionTo;
      if (arrayOfInt == null) {
        mScheduledTransitionTo = new int[4];
      } else if (arrayOfInt.length <= mScheduledTransitions) {
        mScheduledTransitionTo = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      }
      arrayOfInt = mScheduledTransitionTo;
      int i = mScheduledTransitions;
      mScheduledTransitions = (i + 1);
      arrayOfInt[i] = paramInt;
    }
  }
  
  public void setDebugMode(int paramInt)
  {
    mDebugPath = paramInt;
    invalidate();
  }
  
  public void setDelayedApplicationOfInitialState(boolean paramBoolean)
  {
    mDelayedApply = paramBoolean;
  }
  
  public void setInteractionEnabled(boolean paramBoolean)
  {
    mInteractionEnabled = paramBoolean;
  }
  
  public void setInterpolatedProgress(float paramFloat)
  {
    if (mScene != null)
    {
      setState(TransitionState.MOVING);
      Interpolator localInterpolator = mScene.getInterpolator();
      if (localInterpolator != null)
      {
        setProgress(localInterpolator.getInterpolation(paramFloat));
        return;
      }
    }
    setProgress(paramFloat);
  }
  
  public void setOnHide(float paramFloat)
  {
    ArrayList localArrayList = mOnHideHelpers;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        ((MotionHelper)mOnHideHelpers.get(j)).setProgress(paramFloat);
      }
    }
  }
  
  public void setOnShow(float paramFloat)
  {
    ArrayList localArrayList = mOnShowHelpers;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        ((MotionHelper)mOnShowHelpers.get(j)).setProgress(paramFloat);
      }
    }
  }
  
  public void setProgress(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if ((bool) || (paramFloat > 1.0F)) {
      Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
    }
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setProgress(paramFloat);
      return;
    }
    if (!bool)
    {
      if ((mTransitionLastPosition == 1.0F) && (mCurrentState == mEndState)) {
        setState(TransitionState.MOVING);
      }
      mCurrentState = mBeginState;
      if (mTransitionLastPosition == 0.0F) {
        setState(TransitionState.FINISHED);
      }
    }
    else if (paramFloat >= 1.0F)
    {
      if ((mTransitionLastPosition == 0.0F) && (mCurrentState == mBeginState)) {
        setState(TransitionState.MOVING);
      }
      mCurrentState = mEndState;
      if (mTransitionLastPosition == 1.0F) {
        setState(TransitionState.FINISHED);
      }
    }
    else
    {
      mCurrentState = -1;
      setState(TransitionState.MOVING);
    }
    if (mScene == null) {
      return;
    }
    mTransitionInstantly = true;
    mTransitionGoalPosition = paramFloat;
    mTransitionPosition = paramFloat;
    mTransitionLastTime = -1L;
    mAnimationStartTime = -1L;
    mInterpolator = null;
    mInTransition = true;
    invalidate();
  }
  
  public void setProgress(float paramFloat1, float paramFloat2)
  {
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setProgress(paramFloat1);
      mStateCache.setVelocity(paramFloat2);
      return;
    }
    setProgress(paramFloat1);
    setState(TransitionState.MOVING);
    mLastVelocity = paramFloat2;
    float f1 = 0.0F;
    float f2 = 0.0F;
    boolean bool = paramFloat2 < 0.0F;
    if (bool)
    {
      paramFloat1 = f2;
      if (bool) {
        paramFloat1 = 1.0F;
      }
      animateTo(paramFloat1);
    }
    else if ((paramFloat1 != 0.0F) && (paramFloat1 != 1.0F))
    {
      paramFloat2 = f1;
      if (paramFloat1 > 0.5F) {
        paramFloat2 = 1.0F;
      }
      animateTo(paramFloat2);
    }
  }
  
  public void setScene(MotionScene paramMotionScene)
  {
    mScene = paramMotionScene;
    paramMotionScene.setRtl(isRtl());
    rebuildScene();
  }
  
  public void setStartState(int paramInt)
  {
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setStartState(paramInt);
      mStateCache.setEndState(paramInt);
      return;
    }
    mCurrentState = paramInt;
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3)
  {
    setState(TransitionState.SETUP);
    mCurrentState = paramInt1;
    mBeginState = -1;
    mEndState = -1;
    Object localObject = mConstraintLayoutSpec;
    if (localObject != null)
    {
      ((ConstraintLayoutStates)localObject).updateConstraints(paramInt1, paramInt2, paramInt3);
    }
    else
    {
      localObject = mScene;
      if (localObject != null) {
        ((MotionScene)localObject).getConstraintSet(paramInt1).applyTo(this);
      }
    }
  }
  
  public void setState(TransitionState paramTransitionState)
  {
    TransitionState localTransitionState1 = TransitionState.FINISHED;
    if ((paramTransitionState == localTransitionState1) && (mCurrentState == -1)) {
      return;
    }
    TransitionState localTransitionState2 = mTransitionState;
    mTransitionState = paramTransitionState;
    TransitionState localTransitionState3 = TransitionState.MOVING;
    if ((localTransitionState2 == localTransitionState3) && (paramTransitionState == localTransitionState3)) {
      fireTransitionChange();
    }
    int i = 5.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[localTransitionState2.ordinal()];
    if ((i != 1) && (i != 2))
    {
      if ((i == 3) && (paramTransitionState == localTransitionState1)) {
        fireTransitionCompleted();
      }
    }
    else
    {
      if (paramTransitionState == localTransitionState3) {
        fireTransitionChange();
      }
      if (paramTransitionState == localTransitionState1) {
        fireTransitionCompleted();
      }
    }
  }
  
  public void setTransition(int paramInt)
  {
    if (mScene != null)
    {
      Object localObject = getTransition(paramInt);
      mBeginState = ((MotionScene.Transition)localObject).getStartConstraintSetId();
      mEndState = ((MotionScene.Transition)localObject).getEndConstraintSetId();
      if (!isAttachedToWindow())
      {
        if (mStateCache == null) {
          mStateCache = new StateCache();
        }
        mStateCache.setStartState(mBeginState);
        mStateCache.setEndState(mEndState);
        return;
      }
      float f1 = NaN.0F;
      paramInt = mCurrentState;
      int i = mBeginState;
      float f2 = 0.0F;
      if (paramInt == i) {
        f1 = 0.0F;
      } else if (paramInt == mEndState) {
        f1 = 1.0F;
      }
      mScene.setTransition((MotionScene.Transition)localObject);
      mModel.initFrom(mLayoutWidget, mScene.getConstraintSet(mBeginState), mScene.getConstraintSet(mEndState));
      rebuildScene();
      if (mTransitionLastPosition != f1) {
        if (f1 == 0.0F)
        {
          endTrigger(true);
          mScene.getConstraintSet(mBeginState).applyTo(this);
        }
        else if (f1 == 1.0F)
        {
          endTrigger(false);
          mScene.getConstraintSet(mEndState).applyTo(this);
        }
      }
      if (!Float.isNaN(f1)) {
        f2 = f1;
      }
      mTransitionLastPosition = f2;
      if (Float.isNaN(f1))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(Debug.getLocation());
        ((StringBuilder)localObject).append(" transitionToStart ");
        Log.v("MotionLayout", ((StringBuilder)localObject).toString());
        transitionToStart();
      }
      else
      {
        setProgress(f1);
      }
    }
  }
  
  public void setTransition(int paramInt1, int paramInt2)
  {
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setStartState(paramInt1);
      mStateCache.setEndState(paramInt2);
      return;
    }
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null)
    {
      mBeginState = paramInt1;
      mEndState = paramInt2;
      localMotionScene.setTransition(paramInt1, paramInt2);
      mModel.initFrom(mLayoutWidget, mScene.getConstraintSet(paramInt1), mScene.getConstraintSet(paramInt2));
      rebuildScene();
      mTransitionLastPosition = 0.0F;
      transitionToStart();
    }
  }
  
  public void setTransition(MotionScene.Transition paramTransition)
  {
    mScene.setTransition(paramTransition);
    setState(TransitionState.SETUP);
    if (mCurrentState == mScene.getEndId())
    {
      mTransitionLastPosition = 1.0F;
      mTransitionPosition = 1.0F;
      mTransitionGoalPosition = 1.0F;
    }
    else
    {
      mTransitionLastPosition = 0.0F;
      mTransitionPosition = 0.0F;
      mTransitionGoalPosition = 0.0F;
    }
    long l;
    if (paramTransition.isTransitionFlag(1)) {
      l = -1L;
    } else {
      l = getNanoTime();
    }
    mTransitionLastTime = l;
    int i = mScene.getStartId();
    int j = mScene.getEndId();
    if ((i == mBeginState) && (j == mEndState)) {
      return;
    }
    mBeginState = i;
    mEndState = j;
    mScene.setTransition(i, j);
    mModel.initFrom(mLayoutWidget, mScene.getConstraintSet(mBeginState), mScene.getConstraintSet(mEndState));
    mModel.setMeasuredId(mBeginState, mEndState);
    mModel.reEvaluateState();
    rebuildScene();
  }
  
  public void setTransitionDuration(int paramInt)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null)
    {
      Log.e("MotionLayout", "MotionScene not defined");
      return;
    }
    localMotionScene.setDuration(paramInt);
  }
  
  public void setTransitionListener(TransitionListener paramTransitionListener)
  {
    mTransitionListener = paramTransitionListener;
  }
  
  public void setTransitionState(Bundle paramBundle)
  {
    if (mStateCache == null) {
      mStateCache = new StateCache();
    }
    mStateCache.setTransitionState(paramBundle);
    if (isAttachedToWindow()) {
      mStateCache.apply();
    }
  }
  
  public String toString()
  {
    Context localContext = getContext();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Debug.getName(localContext, mBeginState));
    localStringBuilder.append("->");
    localStringBuilder.append(Debug.getName(localContext, mEndState));
    localStringBuilder.append(" (pos:");
    localStringBuilder.append(mTransitionLastPosition);
    localStringBuilder.append(" Dpos/Dt:");
    localStringBuilder.append(mLastVelocity);
    return localStringBuilder.toString();
  }
  
  public void touchAnimateTo(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (mScene == null) {
      return;
    }
    if (mTransitionLastPosition == paramFloat1) {
      return;
    }
    mTemporalInterpolator = true;
    mAnimationStartTime = getNanoTime();
    mTransitionDuration = (mScene.getDuration() / 1000.0F);
    mTransitionGoalPosition = paramFloat1;
    mInTransition = true;
    if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2)) {
      if (paramInt != 4)
      {
        if (paramInt != 5)
        {
          if ((paramInt != 6) && (paramInt != 7)) {
            break label383;
          }
        }
        else
        {
          if (willJump(paramFloat2, mTransitionLastPosition, mScene.getMaxAcceleration()))
          {
            mDecelerateLogic.config(paramFloat2, mTransitionLastPosition, mScene.getMaxAcceleration());
            mInterpolator = mDecelerateLogic;
            break label383;
          }
          mStopLogic.config(mTransitionLastPosition, paramFloat1, paramFloat2, mTransitionDuration, mScene.getMaxAcceleration(), mScene.getMaxVelocity());
          mLastVelocity = 0.0F;
          paramInt = mCurrentState;
          mTransitionGoalPosition = paramFloat1;
          mCurrentState = paramInt;
          mInterpolator = mStopLogic;
          break label383;
        }
      }
      else
      {
        mDecelerateLogic.config(paramFloat2, mTransitionLastPosition, mScene.getMaxAcceleration());
        mInterpolator = mDecelerateLogic;
        break label383;
      }
    }
    if ((paramInt != 1) && (paramInt != 7))
    {
      if ((paramInt == 2) || (paramInt == 6)) {
        paramFloat1 = 1.0F;
      }
    }
    else {
      paramFloat1 = 0.0F;
    }
    if (mScene.getAutoCompleteMode() == 0) {
      mStopLogic.config(mTransitionLastPosition, paramFloat1, paramFloat2, mTransitionDuration, mScene.getMaxAcceleration(), mScene.getMaxVelocity());
    } else {
      mStopLogic.springConfig(mTransitionLastPosition, paramFloat1, paramFloat2, mScene.getSpringMass(), mScene.getSpringStiffiness(), mScene.getSpringDamping(), mScene.getSpringStopThreshold(), mScene.getSpringBoundary());
    }
    paramInt = mCurrentState;
    mTransitionGoalPosition = paramFloat1;
    mCurrentState = paramInt;
    mInterpolator = mStopLogic;
    label383:
    mTransitionInstantly = false;
    mAnimationStartTime = getNanoTime();
    invalidate();
  }
  
  public void touchSpringTo(float paramFloat1, float paramFloat2)
  {
    if (mScene == null) {
      return;
    }
    if (mTransitionLastPosition == paramFloat1) {
      return;
    }
    mTemporalInterpolator = true;
    mAnimationStartTime = getNanoTime();
    mTransitionDuration = (mScene.getDuration() / 1000.0F);
    mTransitionGoalPosition = paramFloat1;
    mInTransition = true;
    mStopLogic.springConfig(mTransitionLastPosition, paramFloat1, paramFloat2, mScene.getSpringMass(), mScene.getSpringStiffiness(), mScene.getSpringDamping(), mScene.getSpringStopThreshold(), mScene.getSpringBoundary());
    int i = mCurrentState;
    mTransitionGoalPosition = paramFloat1;
    mCurrentState = i;
    mInterpolator = mStopLogic;
    mTransitionInstantly = false;
    mAnimationStartTime = getNanoTime();
    invalidate();
  }
  
  public void transitionToEnd()
  {
    animateTo(1.0F);
    mOnComplete = null;
  }
  
  public void transitionToEnd(Runnable paramRunnable)
  {
    animateTo(1.0F);
    mOnComplete = paramRunnable;
  }
  
  public void transitionToStart()
  {
    animateTo(0.0F);
  }
  
  public void transitionToState(int paramInt)
  {
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setEndState(paramInt);
      return;
    }
    transitionToState(paramInt, -1, -1);
  }
  
  public void transitionToState(int paramInt1, int paramInt2)
  {
    if (!isAttachedToWindow())
    {
      if (mStateCache == null) {
        mStateCache = new StateCache();
      }
      mStateCache.setEndState(paramInt1);
      return;
    }
    transitionToState(paramInt1, -1, -1, paramInt2);
  }
  
  public void transitionToState(int paramInt1, int paramInt2, int paramInt3)
  {
    transitionToState(paramInt1, paramInt2, paramInt3, -1);
  }
  
  public void transitionToState(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = mScene;
    int i = paramInt1;
    if (localObject != null)
    {
      localObject = mStateSet;
      i = paramInt1;
      if (localObject != null)
      {
        paramInt2 = ((StateSet)localObject).convertToConstraintSet(mCurrentState, paramInt1, paramInt2, paramInt3);
        i = paramInt1;
        if (paramInt2 != -1) {
          i = paramInt2;
        }
      }
    }
    paramInt1 = mCurrentState;
    if (paramInt1 == i) {
      return;
    }
    if (mBeginState == i)
    {
      animateTo(0.0F);
      if (paramInt4 > 0) {
        mTransitionDuration = (paramInt4 / 1000.0F);
      }
      return;
    }
    if (mEndState == i)
    {
      animateTo(1.0F);
      if (paramInt4 > 0) {
        mTransitionDuration = (paramInt4 / 1000.0F);
      }
      return;
    }
    mEndState = i;
    if (paramInt1 != -1)
    {
      setTransition(paramInt1, i);
      animateTo(1.0F);
      mTransitionLastPosition = 0.0F;
      transitionToEnd();
      if (paramInt4 > 0) {
        mTransitionDuration = (paramInt4 / 1000.0F);
      }
      return;
    }
    paramInt3 = 0;
    mTemporalInterpolator = false;
    mTransitionGoalPosition = 1.0F;
    mTransitionPosition = 0.0F;
    mTransitionLastPosition = 0.0F;
    mTransitionLastTime = getNanoTime();
    mAnimationStartTime = getNanoTime();
    mTransitionInstantly = false;
    mInterpolator = null;
    if (paramInt4 == -1) {
      mTransitionDuration = (mScene.getDuration() / 1000.0F);
    }
    mBeginState = -1;
    mScene.setTransition(-1, mEndState);
    localObject = new SparseArray();
    if (paramInt4 == 0) {
      mTransitionDuration = (mScene.getDuration() / 1000.0F);
    } else if (paramInt4 > 0) {
      mTransitionDuration = (paramInt4 / 1000.0F);
    }
    paramInt4 = getChildCount();
    mFrameArrayList.clear();
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      MotionController localMotionController = new MotionController(localView);
      mFrameArrayList.put(localView, localMotionController);
      ((SparseArray)localObject).put(localView.getId(), (MotionController)mFrameArrayList.get(localView));
    }
    mInTransition = true;
    mModel.initFrom(mLayoutWidget, null, mScene.getConstraintSet(i));
    rebuildScene();
    mModel.build();
    computeCurrentPositions();
    i = getWidth();
    paramInt2 = getHeight();
    if (mDecoratorsHelpers != null)
    {
      for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++)
      {
        localObject = (MotionController)mFrameArrayList.get(getChildAt(paramInt1));
        if (localObject != null) {
          mScene.getKeyFrames((MotionController)localObject);
        }
      }
      localObject = mDecoratorsHelpers.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((MotionHelper)((Iterator)localObject).next()).onPreSetup(this, mFrameArrayList);
      }
      for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++)
      {
        localObject = (MotionController)mFrameArrayList.get(getChildAt(paramInt1));
        if (localObject != null) {
          ((MotionController)localObject).setup(i, paramInt2, mTransitionDuration, getNanoTime());
        }
      }
    }
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++)
    {
      localObject = (MotionController)mFrameArrayList.get(getChildAt(paramInt1));
      if (localObject != null)
      {
        mScene.getKeyFrames((MotionController)localObject);
        ((MotionController)localObject).setup(i, paramInt2, mTransitionDuration, getNanoTime());
      }
    }
    float f1 = mScene.getStaggered();
    if (f1 != 0.0F)
    {
      float f2 = Float.MAX_VALUE;
      float f3 = -3.4028235E38F;
      float f4;
      for (paramInt2 = 0;; paramInt2++)
      {
        paramInt1 = paramInt3;
        if (paramInt2 >= paramInt4) {
          break;
        }
        localObject = (MotionController)mFrameArrayList.get(getChildAt(paramInt2));
        f4 = ((MotionController)localObject).getFinalX();
        f4 = ((MotionController)localObject).getFinalY() + f4;
        f2 = Math.min(f2, f4);
        f3 = Math.max(f3, f4);
      }
      while (paramInt1 < paramInt4)
      {
        localObject = (MotionController)mFrameArrayList.get(getChildAt(paramInt1));
        f4 = ((MotionController)localObject).getFinalX();
        float f5 = ((MotionController)localObject).getFinalY();
        mStaggerScale = (1.0F / (1.0F - f1));
        mStaggerOffset = (f1 - (f4 + f5 - f2) * f1 / (f3 - f2));
        paramInt1++;
      }
    }
    mTransitionPosition = 0.0F;
    mTransitionLastPosition = 0.0F;
    mInTransition = true;
    invalidate();
  }
  
  public void updateState()
  {
    mModel.initFrom(mLayoutWidget, mScene.getConstraintSet(mBeginState), mScene.getConstraintSet(mEndState));
    rebuildScene();
  }
  
  public void updateState(int paramInt, ConstraintSet paramConstraintSet)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      localMotionScene.setConstraintSet(paramInt, paramConstraintSet);
    }
    updateState();
    if (mCurrentState == paramInt) {
      paramConstraintSet.applyTo(this);
    }
  }
  
  public void updateStateAnimate(int paramInt1, ConstraintSet paramConstraintSet, int paramInt2)
  {
    if (mScene == null) {
      return;
    }
    if (mCurrentState == paramInt1)
    {
      int i = R.id.view_transition;
      updateState(i, getConstraintSet(paramInt1));
      setState(i, -1, -1);
      updateState(paramInt1, paramConstraintSet);
      paramConstraintSet = new MotionScene.Transition(-1, mScene, i, paramInt1);
      paramConstraintSet.setDuration(paramInt2);
      setTransition(paramConstraintSet);
      transitionToEnd();
    }
  }
  
  public void viewTransition(int paramInt, View... paramVarArgs)
  {
    MotionScene localMotionScene = mScene;
    if (localMotionScene != null) {
      localMotionScene.viewTransition(paramInt, paramVarArgs);
    } else {
      Log.e("MotionLayout", " no motionScene");
    }
  }
  
  public class DecelerateInterpolator
    extends MotionInterpolator
  {
    public float currentP = 0.0F;
    public float initalV = 0.0F;
    public float maxA;
    
    public DecelerateInterpolator() {}
    
    public void config(float paramFloat1, float paramFloat2, float paramFloat3)
    {
      initalV = paramFloat1;
      currentP = paramFloat2;
      maxA = paramFloat3;
    }
    
    public float getInterpolation(float paramFloat)
    {
      float f1 = initalV;
      if (f1 > 0.0F)
      {
        f2 = maxA;
        f3 = paramFloat;
        if (f1 / f2 < paramFloat) {
          f3 = f1 / f2;
        }
        mLastVelocity = (f1 - f2 * f3);
        return f1 * f3 - f2 * f3 * f3 / 2.0F + currentP;
      }
      float f4 = -f1;
      float f2 = maxA;
      float f3 = paramFloat;
      if (f4 / f2 < paramFloat) {
        f3 = -f1 / f2;
      }
      mLastVelocity = (f2 * f3 + f1);
      return f2 * f3 * f3 / 2.0F + f1 * f3 + currentP;
    }
    
    public float getVelocity()
    {
      return mLastVelocity;
    }
  }
  
  public class DevModeDraw
  {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public final int DIAMOND_SIZE = 10;
    public final int GRAPH_COLOR = -13391360;
    public final int KEYFRAME_COLOR = -2067046;
    public final int RED_COLOR = 43571;
    public final int SHADOW_COLOR = 1996488704;
    public Rect mBounds = new Rect();
    public DashPathEffect mDashPathEffect;
    public Paint mFillPaint;
    public int mKeyFrameCount;
    public float[] mKeyFramePoints;
    public Paint mPaint;
    public Paint mPaintGraph;
    public Paint mPaintKeyframes;
    public Path mPath;
    public int[] mPathMode;
    public float[] mPoints;
    public boolean mPresentationMode = false;
    private float[] mRectangle;
    public int mShadowTranslate = 1;
    public Paint mTextPaint;
    
    public DevModeDraw()
    {
      Paint localPaint = new Paint();
      mPaint = localPaint;
      localPaint.setAntiAlias(true);
      mPaint.setColor(43571);
      mPaint.setStrokeWidth(2.0F);
      mPaint.setStyle(Paint.Style.STROKE);
      localPaint = new Paint();
      mPaintKeyframes = localPaint;
      localPaint.setAntiAlias(true);
      mPaintKeyframes.setColor(-2067046);
      mPaintKeyframes.setStrokeWidth(2.0F);
      mPaintKeyframes.setStyle(Paint.Style.STROKE);
      localPaint = new Paint();
      mPaintGraph = localPaint;
      localPaint.setAntiAlias(true);
      mPaintGraph.setColor(-13391360);
      mPaintGraph.setStrokeWidth(2.0F);
      mPaintGraph.setStyle(Paint.Style.STROKE);
      localPaint = new Paint();
      mTextPaint = localPaint;
      localPaint.setAntiAlias(true);
      mTextPaint.setColor(-13391360);
      mTextPaint.setTextSize(getContext().getResources().getDisplayMetrics().density * 12.0F);
      mRectangle = new float[8];
      this$1 = new Paint();
      mFillPaint = MotionLayout.this;
      setAntiAlias(true);
      this$1 = new DashPathEffect(new float[] { 4.0F, 8.0F }, 0.0F);
      mDashPathEffect = MotionLayout.this;
      mPaintGraph.setPathEffect(MotionLayout.this);
      mKeyFramePoints = new float[100];
      mPathMode = new int[50];
      if (mPresentationMode)
      {
        mPaint.setStrokeWidth(8.0F);
        mFillPaint.setStrokeWidth(8.0F);
        mPaintKeyframes.setStrokeWidth(8.0F);
        mShadowTranslate = 4;
      }
    }
    
    private void drawBasicPath(Canvas paramCanvas)
    {
      paramCanvas.drawLines(mPoints, mPaint);
    }
    
    private void drawPathAsConfigured(Canvas paramCanvas)
    {
      int i = 0;
      int j = 0;
      int k = j;
      while (i < mKeyFrameCount)
      {
        int m = mPathMode[i];
        if (m == 1) {
          j = 1;
        }
        if (m == 0) {
          k = 1;
        }
        i++;
      }
      if (j != 0) {
        drawPathRelative(paramCanvas);
      }
      if (k != 0) {
        drawPathCartesian(paramCanvas);
      }
    }
    
    private void drawPathCartesian(Canvas paramCanvas)
    {
      float[] arrayOfFloat = mPoints;
      float f1 = arrayOfFloat[0];
      float f2 = arrayOfFloat[1];
      float f3 = arrayOfFloat[(arrayOfFloat.length - 2)];
      float f4 = arrayOfFloat[(arrayOfFloat.length - 1)];
      paramCanvas.drawLine(Math.min(f1, f3), Math.max(f2, f4), Math.max(f1, f3), Math.max(f2, f4), mPaintGraph);
      paramCanvas.drawLine(Math.min(f1, f3), Math.min(f2, f4), Math.min(f1, f3), Math.max(f2, f4), mPaintGraph);
    }
    
    private void drawPathCartesianTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2)
    {
      Object localObject = mPoints;
      float f1 = localObject[0];
      float f2 = localObject[1];
      float f3 = localObject[(localObject.length - 2)];
      float f4 = localObject[(localObject.length - 1)];
      float f5 = Math.min(f1, f3);
      float f6 = Math.max(f2, f4);
      float f7 = paramFloat1 - Math.min(f1, f3);
      float f8 = Math.max(f2, f4) - paramFloat2;
      localObject = z2.t("");
      ((StringBuilder)localObject).append((int)(f7 * 100.0F / Math.abs(f3 - f1) + 0.5D) / 100.0F);
      localObject = ((StringBuilder)localObject).toString();
      getTextBounds((String)localObject, mTextPaint);
      paramCanvas.drawText((String)localObject, f7 / 2.0F - mBounds.width() / 2 + f5, paramFloat2 - 20.0F, mTextPaint);
      paramCanvas.drawLine(paramFloat1, paramFloat2, Math.min(f1, f3), paramFloat2, mPaintGraph);
      localObject = z2.t("");
      ((StringBuilder)localObject).append((int)(f8 * 100.0F / Math.abs(f4 - f2) + 0.5D) / 100.0F);
      localObject = ((StringBuilder)localObject).toString();
      getTextBounds((String)localObject, mTextPaint);
      paramCanvas.drawText((String)localObject, paramFloat1 + 5.0F, f6 - (f8 / 2.0F - mBounds.height() / 2), mTextPaint);
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, Math.max(f2, f4), mPaintGraph);
    }
    
    private void drawPathRelative(Canvas paramCanvas)
    {
      float[] arrayOfFloat = mPoints;
      paramCanvas.drawLine(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[(arrayOfFloat.length - 2)], arrayOfFloat[(arrayOfFloat.length - 1)], mPaintGraph);
    }
    
    private void drawPathRelativeTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2)
    {
      Object localObject1 = mPoints;
      float f1 = localObject1[0];
      float f2 = localObject1[1];
      float f3 = localObject1[(localObject1.length - 2)];
      float f4 = localObject1[(localObject1.length - 1)];
      float f5 = (float)Math.hypot(f1 - f3, f2 - f4);
      float f6 = f3 - f1;
      f4 -= f2;
      f3 = ((paramFloat2 - f2) * f4 + (paramFloat1 - f1) * f6) / (f5 * f5);
      f1 += f6 * f3;
      f4 = f2 + f3 * f4;
      localObject1 = new Path();
      ((Path)localObject1).moveTo(paramFloat1, paramFloat2);
      ((Path)localObject1).lineTo(f1, f4);
      f2 = (float)Math.hypot(f1 - paramFloat1, f4 - paramFloat2);
      Object localObject2 = z2.t("");
      ((StringBuilder)localObject2).append((int)(f2 * 100.0F / f5) / 100.0F);
      localObject2 = ((StringBuilder)localObject2).toString();
      getTextBounds((String)localObject2, mTextPaint);
      paramCanvas.drawTextOnPath((String)localObject2, (Path)localObject1, f2 / 2.0F - mBounds.width() / 2, -20.0F, mTextPaint);
      paramCanvas.drawLine(paramFloat1, paramFloat2, f1, f4, mPaintGraph);
    }
    
    private void drawPathScreenTicks(Canvas paramCanvas, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
    {
      Object localObject = z2.t("");
      ((StringBuilder)localObject).append((int)((paramFloat1 - paramInt1 / 2) * 100.0F / (getWidth() - paramInt1) + 0.5D) / 100.0F);
      localObject = ((StringBuilder)localObject).toString();
      getTextBounds((String)localObject, mTextPaint);
      paramCanvas.drawText((String)localObject, paramFloat1 / 2.0F - mBounds.width() / 2 + 0.0F, paramFloat2 - 20.0F, mTextPaint);
      paramCanvas.drawLine(paramFloat1, paramFloat2, Math.min(0.0F, 1.0F), paramFloat2, mPaintGraph);
      localObject = z2.t("");
      ((StringBuilder)localObject).append((int)((paramFloat2 - paramInt2 / 2) * 100.0F / (getHeight() - paramInt2) + 0.5D) / 100.0F);
      localObject = ((StringBuilder)localObject).toString();
      getTextBounds((String)localObject, mTextPaint);
      paramCanvas.drawText((String)localObject, paramFloat1 + 5.0F, 0.0F - (paramFloat2 / 2.0F - mBounds.height() / 2), mTextPaint);
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, Math.max(0.0F, 1.0F), mPaintGraph);
    }
    
    private void drawRectangle(Canvas paramCanvas, MotionController paramMotionController)
    {
      mPath.reset();
      for (int i = 0; i <= 50; i++)
      {
        paramMotionController.buildRect(i / 50, mRectangle, 0);
        Path localPath = mPath;
        float[] arrayOfFloat = mRectangle;
        localPath.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
        localPath = mPath;
        arrayOfFloat = mRectangle;
        localPath.lineTo(arrayOfFloat[2], arrayOfFloat[3]);
        localPath = mPath;
        arrayOfFloat = mRectangle;
        localPath.lineTo(arrayOfFloat[4], arrayOfFloat[5]);
        localPath = mPath;
        arrayOfFloat = mRectangle;
        localPath.lineTo(arrayOfFloat[6], arrayOfFloat[7]);
        mPath.close();
      }
      mPaint.setColor(1140850688);
      paramCanvas.translate(2.0F, 2.0F);
      paramCanvas.drawPath(mPath, mPaint);
      paramCanvas.translate(-2.0F, -2.0F);
      mPaint.setColor(-65536);
      paramCanvas.drawPath(mPath, mPaint);
    }
    
    private void drawTicks(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
    {
      Object localObject = mView;
      int i;
      int j;
      if (localObject != null)
      {
        i = ((View)localObject).getWidth();
        j = mView.getHeight();
      }
      else
      {
        i = 0;
        j = i;
      }
      for (int k = 1; k < paramInt2 - 1; k++) {
        if ((paramInt1 != 4) || (mPathMode[(k - 1)] != 0))
        {
          localObject = mKeyFramePoints;
          int m = k * 2;
          float f1 = localObject[m];
          float f2 = localObject[(m + 1)];
          mPath.reset();
          mPath.moveTo(f1, f2 + 10.0F);
          mPath.lineTo(f1 + 10.0F, f2);
          mPath.lineTo(f1, f2 - 10.0F);
          mPath.lineTo(f1 - 10.0F, f2);
          mPath.close();
          m = k - 1;
          paramMotionController.getKeyFrame(m);
          if (paramInt1 == 4)
          {
            m = mPathMode[m];
            if (m == 1) {
              drawPathRelativeTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
            }
            for (;;)
            {
              break;
              if (m == 0) {
                drawPathCartesianTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
              } else if (m == 2) {
                drawPathScreenTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F, i, j);
              }
            }
            paramCanvas.drawPath(mPath, mFillPaint);
          }
          if (paramInt1 == 2) {
            drawPathRelativeTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
          }
          if (paramInt1 == 3) {
            drawPathCartesianTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F);
          }
          if (paramInt1 == 6) {
            drawPathScreenTicks(paramCanvas, f1 - 0.0F, f2 - 0.0F, i, j);
          }
          paramCanvas.drawPath(mPath, mFillPaint);
        }
      }
      paramMotionController = mPoints;
      if (paramMotionController.length > 1)
      {
        paramCanvas.drawCircle(paramMotionController[0], paramMotionController[1], 8.0F, mPaintKeyframes);
        paramMotionController = mPoints;
        paramCanvas.drawCircle(paramMotionController[(paramMotionController.length - 2)], paramMotionController[(paramMotionController.length - 1)], 8.0F, mPaintKeyframes);
      }
    }
    
    private void drawTranslation(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      paramCanvas.drawRect(paramFloat1, paramFloat2, paramFloat3, paramFloat4, mPaintGraph);
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4, mPaintGraph);
    }
    
    public void draw(Canvas paramCanvas, HashMap<View, MotionController> paramHashMap, int paramInt1, int paramInt2)
    {
      if ((paramHashMap != null) && (paramHashMap.size() != 0))
      {
        paramCanvas.save();
        Object localObject;
        if ((!isInEditMode()) && ((paramInt2 & 0x1) == 2))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(getContext().getResources().getResourceName(MotionLayout.access$100(MotionLayout.this)));
          ((StringBuilder)localObject).append(":");
          ((StringBuilder)localObject).append(getProgress());
          localObject = ((StringBuilder)localObject).toString();
          paramCanvas.drawText((String)localObject, 10.0F, getHeight() - 30, mTextPaint);
          paramCanvas.drawText((String)localObject, 11.0F, getHeight() - 29, mPaint);
        }
        paramHashMap = paramHashMap.values().iterator();
        while (paramHashMap.hasNext())
        {
          MotionController localMotionController = (MotionController)paramHashMap.next();
          int i = localMotionController.getDrawPath();
          int j = i;
          if (paramInt2 > 0)
          {
            j = i;
            if (i == 0) {
              j = 1;
            }
          }
          if (j != 0)
          {
            mKeyFrameCount = localMotionController.buildKeyFrames(mKeyFramePoints, mPathMode);
            if (j >= 1)
            {
              int k = paramInt1 / 16;
              localObject = mPoints;
              if ((localObject == null) || (localObject.length != k * 2))
              {
                mPoints = new float[k * 2];
                mPath = new Path();
              }
              i = mShadowTranslate;
              paramCanvas.translate(i, i);
              mPaint.setColor(1996488704);
              mFillPaint.setColor(1996488704);
              mPaintKeyframes.setColor(1996488704);
              mPaintGraph.setColor(1996488704);
              localMotionController.buildPath(mPoints, k);
              drawAll(paramCanvas, j, mKeyFrameCount, localMotionController);
              mPaint.setColor(43571);
              mPaintKeyframes.setColor(-2067046);
              mFillPaint.setColor(-2067046);
              mPaintGraph.setColor(-13391360);
              i = mShadowTranslate;
              paramCanvas.translate(-i, -i);
              drawAll(paramCanvas, j, mKeyFrameCount, localMotionController);
              if (j == 5) {
                drawRectangle(paramCanvas, localMotionController);
              }
            }
          }
        }
        paramCanvas.restore();
      }
    }
    
    public void drawAll(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
    {
      if (paramInt1 == 4) {
        drawPathAsConfigured(paramCanvas);
      }
      if (paramInt1 == 2) {
        drawPathRelative(paramCanvas);
      }
      if (paramInt1 == 3) {
        drawPathCartesian(paramCanvas);
      }
      drawBasicPath(paramCanvas);
      drawTicks(paramCanvas, paramInt1, paramInt2, paramMotionController);
    }
    
    public void getTextBounds(String paramString, Paint paramPaint)
    {
      paramPaint.getTextBounds(paramString, 0, paramString.length(), mBounds);
    }
  }
  
  public class Model
  {
    public ConstraintSet mEnd = null;
    public int mEndId;
    public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
    public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
    public ConstraintSet mStart = null;
    public int mStartId;
    
    public Model() {}
    
    private void computeStartEndSize(int paramInt1, int paramInt2)
    {
      int i = getOptimizationLevel();
      Object localObject1 = MotionLayout.this;
      Object localObject2;
      Object localObject3;
      int j;
      int k;
      if (mCurrentState == ((MotionLayout)localObject1).getStartState())
      {
        localObject2 = MotionLayout.this;
        localObject1 = mLayoutEnd;
        localObject3 = mEnd;
        if ((localObject3 != null) && (mRotate != 0)) {
          j = paramInt2;
        } else {
          j = paramInt1;
        }
        if ((localObject3 != null) && (mRotate != 0)) {
          k = paramInt1;
        } else {
          k = paramInt2;
        }
        MotionLayout.access$1600((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject1, i, j, k);
        localObject2 = mStart;
        if (localObject2 != null)
        {
          localObject3 = MotionLayout.this;
          localObject1 = mLayoutStart;
          k = mRotate;
          if (k == 0) {
            j = paramInt1;
          } else {
            j = paramInt2;
          }
          if (k == 0) {
            paramInt1 = paramInt2;
          }
          MotionLayout.access$1700((MotionLayout)localObject3, (ConstraintWidgetContainer)localObject1, i, j, paramInt1);
        }
      }
      else
      {
        localObject1 = mStart;
        if (localObject1 != null)
        {
          localObject2 = MotionLayout.this;
          localObject3 = mLayoutStart;
          k = mRotate;
          if (k == 0) {
            j = paramInt1;
          } else {
            j = paramInt2;
          }
          if (k == 0) {
            k = paramInt2;
          } else {
            k = paramInt1;
          }
          MotionLayout.access$1800((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject3, i, j, k);
        }
        localObject3 = MotionLayout.this;
        localObject1 = mLayoutEnd;
        localObject2 = mEnd;
        if ((localObject2 != null) && (mRotate != 0)) {
          j = paramInt2;
        } else {
          j = paramInt1;
        }
        if ((localObject2 == null) || (mRotate == 0)) {
          paramInt1 = paramInt2;
        }
        MotionLayout.access$1900((MotionLayout)localObject3, (ConstraintWidgetContainer)localObject1, i, j, paramInt1);
      }
    }
    
    @SuppressLint({"LogConditional"})
    private void debugLayout(String paramString, ConstraintWidgetContainer paramConstraintWidgetContainer)
    {
      Object localObject1 = (View)paramConstraintWidgetContainer.getCompanionWidget();
      paramString = z2.u(paramString, " ");
      paramString.append(Debug.getName((View)localObject1));
      String str1 = paramString.toString();
      paramString = new StringBuilder();
      paramString.append(str1);
      paramString.append("  ========= ");
      paramString.append(paramConstraintWidgetContainer);
      Log.v("MotionLayout", paramString.toString());
      int i = paramConstraintWidgetContainer.getChildren().size();
      for (int j = 0; j < i; j++)
      {
        paramString = new StringBuilder();
        paramString.append(str1);
        paramString.append("[");
        paramString.append(j);
        paramString.append("] ");
        String str2 = paramString.toString();
        ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.getChildren().get(j);
        Object localObject2 = z2.t("");
        paramString = mTop.mTarget;
        localObject1 = "_";
        if (paramString != null) {
          paramString = "T";
        } else {
          paramString = "_";
        }
        ((StringBuilder)localObject2).append(paramString);
        localObject2 = z2.t(((StringBuilder)localObject2).toString());
        if (mBottom.mTarget != null) {
          paramString = "B";
        } else {
          paramString = "_";
        }
        ((StringBuilder)localObject2).append(paramString);
        localObject2 = z2.t(((StringBuilder)localObject2).toString());
        if (mLeft.mTarget != null) {
          paramString = "L";
        } else {
          paramString = "_";
        }
        ((StringBuilder)localObject2).append(paramString);
        localObject2 = z2.t(((StringBuilder)localObject2).toString());
        paramString = (String)localObject1;
        if (mRight.mTarget != null) {
          paramString = "R";
        }
        ((StringBuilder)localObject2).append(paramString);
        localObject2 = ((StringBuilder)localObject2).toString();
        View localView = (View)localConstraintWidget.getCompanionWidget();
        localObject1 = Debug.getName(localView);
        paramString = (String)localObject1;
        if ((localView instanceof TextView))
        {
          paramString = z2.u((String)localObject1, "(");
          paramString.append(((TextView)localView).getText());
          paramString.append(")");
          paramString = paramString.toString();
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(str2);
        ((StringBuilder)localObject1).append("  ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append(localConstraintWidget);
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append((String)localObject2);
        Log.v("MotionLayout", ((StringBuilder)localObject1).toString());
      }
      paramString = new StringBuilder();
      paramString.append(str1);
      paramString.append(" done. ");
      Log.v("MotionLayout", paramString.toString());
    }
    
    @SuppressLint({"LogConditional"})
    private void debugLayoutParam(String paramString, ConstraintLayout.LayoutParams paramLayoutParams)
    {
      Object localObject1 = z2.t(" ");
      if (startToStart != -1) {
        localObject2 = "SS";
      } else {
        localObject2 = "__";
      }
      ((StringBuilder)localObject1).append((String)localObject2);
      StringBuilder localStringBuilder = z2.t(((StringBuilder)localObject1).toString());
      int i = startToEnd;
      localObject1 = "|__";
      if (i != -1) {
        localObject2 = "|SE";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (endToStart != -1) {
        localObject2 = "|ES";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (endToEnd != -1) {
        localObject2 = "|EE";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (leftToLeft != -1) {
        localObject2 = "|LL";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (leftToRight != -1) {
        localObject2 = "|LR";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (rightToLeft != -1) {
        localObject2 = "|RL";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (rightToRight != -1) {
        localObject2 = "|RR";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (topToTop != -1) {
        localObject2 = "|TT";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (topToBottom != -1) {
        localObject2 = "|TB";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      if (bottomToTop != -1) {
        localObject2 = "|BT";
      } else {
        localObject2 = "|__";
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder = z2.t(localStringBuilder.toString());
      Object localObject2 = localObject1;
      if (bottomToBottom != -1) {
        localObject2 = "|BB";
      }
      localStringBuilder.append((String)localObject2);
      localObject2 = localStringBuilder.toString();
      paramLayoutParams = new StringBuilder();
      paramLayoutParams.append(paramString);
      paramLayoutParams.append((String)localObject2);
      Log.v("MotionLayout", paramLayoutParams.toString());
    }
    
    @SuppressLint({"LogConditional"})
    private void debugWidget(String paramString, ConstraintWidget paramConstraintWidget)
    {
      StringBuilder localStringBuilder1 = z2.t(" ");
      Object localObject1 = mTop.mTarget;
      String str = "B";
      Object localObject2 = "__";
      StringBuilder localStringBuilder2;
      if (localObject1 != null)
      {
        localStringBuilder2 = z2.t("T");
        if (mTop.mTarget.mType == ConstraintAnchor.Type.TOP) {
          localObject1 = "T";
        } else {
          localObject1 = "B";
        }
        localStringBuilder2.append((String)localObject1);
        localObject1 = localStringBuilder2.toString();
      }
      else
      {
        localObject1 = "__";
      }
      localStringBuilder1.append((String)localObject1);
      localStringBuilder1 = z2.t(localStringBuilder1.toString());
      if (mBottom.mTarget != null)
      {
        localStringBuilder2 = z2.t("B");
        localObject1 = str;
        if (mBottom.mTarget.mType == ConstraintAnchor.Type.TOP) {
          localObject1 = "T";
        }
        localStringBuilder2.append((String)localObject1);
        localObject1 = localStringBuilder2.toString();
      }
      else
      {
        localObject1 = "__";
      }
      localStringBuilder1.append((String)localObject1);
      localStringBuilder1 = z2.t(localStringBuilder1.toString());
      localObject1 = mLeft.mTarget;
      str = "R";
      if (localObject1 != null)
      {
        localStringBuilder2 = z2.t("L");
        if (mLeft.mTarget.mType == ConstraintAnchor.Type.LEFT) {
          localObject1 = "L";
        } else {
          localObject1 = "R";
        }
        localStringBuilder2.append((String)localObject1);
        localObject1 = localStringBuilder2.toString();
      }
      else
      {
        localObject1 = "__";
      }
      localStringBuilder1.append((String)localObject1);
      localStringBuilder1 = z2.t(localStringBuilder1.toString());
      localObject1 = localObject2;
      if (mRight.mTarget != null)
      {
        localObject2 = z2.t("R");
        localObject1 = str;
        if (mRight.mTarget.mType == ConstraintAnchor.Type.LEFT) {
          localObject1 = "L";
        }
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject1 = ((StringBuilder)localObject2).toString();
      }
      localStringBuilder1.append((String)localObject1);
      localObject2 = localStringBuilder1.toString();
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" ---  ");
      ((StringBuilder)localObject1).append(paramConstraintWidget);
      Log.v("MotionLayout", ((StringBuilder)localObject1).toString());
    }
    
    private void setupConstraintWidget(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet)
    {
      SparseArray localSparseArray = new SparseArray();
      Object localObject1 = new Constraints.LayoutParams(-2, -2);
      localSparseArray.clear();
      localSparseArray.put(0, paramConstraintWidgetContainer);
      localSparseArray.put(getId(), paramConstraintWidgetContainer);
      if ((paramConstraintSet != null) && (mRotate != 0))
      {
        localObject2 = MotionLayout.this;
        MotionLayout.access$1000((MotionLayout)localObject2, mLayoutEnd, ((ConstraintLayout)localObject2).getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824));
      }
      Object localObject2 = paramConstraintWidgetContainer.getChildren().iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (ConstraintWidget)((Iterator)localObject2).next();
        ((ConstraintWidget)localObject3).setAnimated(true);
        localSparseArray.put(((View)((ConstraintWidget)localObject3).getCompanionWidget()).getId(), localObject3);
      }
      Iterator localIterator = paramConstraintWidgetContainer.getChildren().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (ConstraintWidget)localIterator.next();
        localObject3 = (View)((ConstraintWidget)localObject2).getCompanionWidget();
        paramConstraintSet.applyToLayoutParams(((View)localObject3).getId(), (ConstraintLayout.LayoutParams)localObject1);
        ((ConstraintWidget)localObject2).setWidth(paramConstraintSet.getWidth(((View)localObject3).getId()));
        ((ConstraintWidget)localObject2).setHeight(paramConstraintSet.getHeight(((View)localObject3).getId()));
        if ((localObject3 instanceof ConstraintHelper))
        {
          paramConstraintSet.applyToHelper((ConstraintHelper)localObject3, (ConstraintWidget)localObject2, (ConstraintLayout.LayoutParams)localObject1, localSparseArray);
          if ((localObject3 instanceof androidx.constraintlayout.widget.Barrier)) {
            ((androidx.constraintlayout.widget.Barrier)localObject3).validateParams();
          }
        }
        ((ConstraintLayout.LayoutParams)localObject1).resolveLayoutDirection(getLayoutDirection());
        MotionLayout.access$1100(MotionLayout.this, false, (View)localObject3, (ConstraintWidget)localObject2, (ConstraintLayout.LayoutParams)localObject1, localSparseArray);
        if (paramConstraintSet.getVisibilityMode(((View)localObject3).getId()) == 1) {
          ((ConstraintWidget)localObject2).setVisibility(((View)localObject3).getVisibility());
        } else {
          ((ConstraintWidget)localObject2).setVisibility(paramConstraintSet.getVisibility(((View)localObject3).getId()));
        }
      }
      paramConstraintSet = paramConstraintWidgetContainer.getChildren().iterator();
      while (paramConstraintSet.hasNext())
      {
        localObject2 = (ConstraintWidget)paramConstraintSet.next();
        if ((localObject2 instanceof VirtualLayout))
        {
          localObject1 = (ConstraintHelper)((ConstraintWidget)localObject2).getCompanionWidget();
          localObject2 = (Helper)localObject2;
          ((ConstraintHelper)localObject1).updatePreLayout(paramConstraintWidgetContainer, (Helper)localObject2, localSparseArray);
          ((VirtualLayout)localObject2).captureWidgets();
        }
      }
    }
    
    public void build()
    {
      int i = getChildCount();
      mFrameArrayList.clear();
      SparseArray localSparseArray = new SparseArray();
      int[] arrayOfInt = new int[i];
      Object localObject1;
      Object localObject2;
      int k;
      for (int j = 0; j < i; j++)
      {
        localObject1 = getChildAt(j);
        localObject2 = new MotionController((View)localObject1);
        k = ((View)localObject1).getId();
        arrayOfInt[j] = k;
        localSparseArray.put(k, localObject2);
        mFrameArrayList.put(localObject1, localObject2);
      }
      for (j = 0; j < i; j++)
      {
        localObject1 = getChildAt(j);
        localObject2 = (MotionController)mFrameArrayList.get(localObject1);
        if (localObject2 != null)
        {
          Object localObject3;
          if (mStart != null)
          {
            localObject3 = getWidget(mLayoutStart, (View)localObject1);
            if (localObject3 != null)
            {
              ((MotionController)localObject2).setStartState(MotionLayout.access$2000(MotionLayout.this, (ConstraintWidget)localObject3), mStart, getWidth(), getHeight());
            }
            else if (mDebugPath != 0)
            {
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append(Debug.getLocation());
              ((StringBuilder)localObject3).append("no widget for  ");
              ((StringBuilder)localObject3).append(Debug.getName((View)localObject1));
              ((StringBuilder)localObject3).append(" (");
              ((StringBuilder)localObject3).append(localObject1.getClass().getName());
              ((StringBuilder)localObject3).append(")");
              Log.e("MotionLayout", ((StringBuilder)localObject3).toString());
            }
          }
          else if (MotionLayout.access$300(MotionLayout.this))
          {
            localObject3 = (ViewState)mPreRotate.get(localObject1);
            MotionLayout localMotionLayout = MotionLayout.this;
            ((MotionController)localObject2).setStartState((ViewState)localObject3, (View)localObject1, mRotatMode, MotionLayout.access$2100(localMotionLayout), MotionLayout.access$2200(MotionLayout.this));
          }
          if (mEnd != null)
          {
            localObject3 = getWidget(mLayoutEnd, (View)localObject1);
            if (localObject3 != null)
            {
              ((MotionController)localObject2).setEndState(MotionLayout.access$2000(MotionLayout.this, (ConstraintWidget)localObject3), mEnd, getWidth(), getHeight());
            }
            else if (mDebugPath != 0)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append(Debug.getLocation());
              ((StringBuilder)localObject2).append("no widget for  ");
              ((StringBuilder)localObject2).append(Debug.getName((View)localObject1));
              ((StringBuilder)localObject2).append(" (");
              ((StringBuilder)localObject2).append(localObject1.getClass().getName());
              ((StringBuilder)localObject2).append(")");
              Log.e("MotionLayout", ((StringBuilder)localObject2).toString());
            }
          }
        }
      }
      for (j = 0; j < i; j++)
      {
        localObject1 = (MotionController)localSparseArray.get(arrayOfInt[j]);
        k = ((MotionController)localObject1).getAnimateRelativeTo();
        if (k != -1) {
          ((MotionController)localObject1).setupRelative((MotionController)localSparseArray.get(k));
        }
      }
    }
    
    public void copy(ConstraintWidgetContainer paramConstraintWidgetContainer1, ConstraintWidgetContainer paramConstraintWidgetContainer2)
    {
      ArrayList localArrayList = paramConstraintWidgetContainer1.getChildren();
      HashMap localHashMap = new HashMap();
      localHashMap.put(paramConstraintWidgetContainer1, paramConstraintWidgetContainer2);
      paramConstraintWidgetContainer2.getChildren().clear();
      paramConstraintWidgetContainer2.copy(paramConstraintWidgetContainer1, localHashMap);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
        if ((localConstraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
          paramConstraintWidgetContainer1 = new androidx.constraintlayout.core.widgets.Barrier();
        } else if ((localConstraintWidget instanceof Guideline)) {
          paramConstraintWidgetContainer1 = new Guideline();
        } else if ((localConstraintWidget instanceof Flow)) {
          paramConstraintWidgetContainer1 = new Flow();
        } else if ((localConstraintWidget instanceof Placeholder)) {
          paramConstraintWidgetContainer1 = new Placeholder();
        } else if ((localConstraintWidget instanceof Helper)) {
          paramConstraintWidgetContainer1 = new HelperWidget();
        } else {
          paramConstraintWidgetContainer1 = new ConstraintWidget();
        }
        paramConstraintWidgetContainer2.add(paramConstraintWidgetContainer1);
        localHashMap.put(localConstraintWidget, paramConstraintWidgetContainer1);
      }
      paramConstraintWidgetContainer2 = localArrayList.iterator();
      while (paramConstraintWidgetContainer2.hasNext())
      {
        paramConstraintWidgetContainer1 = (ConstraintWidget)paramConstraintWidgetContainer2.next();
        ((ConstraintWidget)localHashMap.get(paramConstraintWidgetContainer1)).copy(paramConstraintWidgetContainer1, localHashMap);
      }
    }
    
    public ConstraintWidget getWidget(ConstraintWidgetContainer paramConstraintWidgetContainer, View paramView)
    {
      if (paramConstraintWidgetContainer.getCompanionWidget() == paramView) {
        return paramConstraintWidgetContainer;
      }
      paramConstraintWidgetContainer = paramConstraintWidgetContainer.getChildren();
      int i = paramConstraintWidgetContainer.size();
      for (int j = 0; j < i; j++)
      {
        ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.get(j);
        if (localConstraintWidget.getCompanionWidget() == paramView) {
          return localConstraintWidget;
        }
      }
      return null;
    }
    
    public void initFrom(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet1, ConstraintSet paramConstraintSet2)
    {
      mStart = paramConstraintSet1;
      mEnd = paramConstraintSet2;
      mLayoutStart = new ConstraintWidgetContainer();
      mLayoutEnd = new ConstraintWidgetContainer();
      mLayoutStart.setMeasurer(MotionLayout.access$400(MotionLayout.this).getMeasurer());
      mLayoutEnd.setMeasurer(MotionLayout.access$500(MotionLayout.this).getMeasurer());
      mLayoutStart.removeAllChildren();
      mLayoutEnd.removeAllChildren();
      copy(MotionLayout.access$600(MotionLayout.this), mLayoutStart);
      copy(MotionLayout.access$700(MotionLayout.this), mLayoutEnd);
      if (mTransitionLastPosition > 0.5D)
      {
        if (paramConstraintSet1 != null) {
          setupConstraintWidget(mLayoutStart, paramConstraintSet1);
        }
        setupConstraintWidget(mLayoutEnd, paramConstraintSet2);
      }
      else
      {
        setupConstraintWidget(mLayoutEnd, paramConstraintSet2);
        if (paramConstraintSet1 != null) {
          setupConstraintWidget(mLayoutStart, paramConstraintSet1);
        }
      }
      mLayoutStart.setRtl(MotionLayout.access$800(MotionLayout.this));
      mLayoutStart.updateHierarchy();
      mLayoutEnd.setRtl(MotionLayout.access$900(MotionLayout.this));
      mLayoutEnd.updateHierarchy();
      paramConstraintSet1 = getLayoutParams();
      if (paramConstraintSet1 != null)
      {
        if (width == -2)
        {
          paramConstraintWidgetContainer = mLayoutStart;
          paramConstraintSet2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
          paramConstraintWidgetContainer.setHorizontalDimensionBehaviour(paramConstraintSet2);
          mLayoutEnd.setHorizontalDimensionBehaviour(paramConstraintSet2);
        }
        if (height == -2)
        {
          paramConstraintWidgetContainer = mLayoutStart;
          paramConstraintSet1 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
          paramConstraintWidgetContainer.setVerticalDimensionBehaviour(paramConstraintSet1);
          mLayoutEnd.setVerticalDimensionBehaviour(paramConstraintSet1);
        }
      }
    }
    
    public boolean isNotConfiguredWith(int paramInt1, int paramInt2)
    {
      boolean bool;
      if ((paramInt1 == mStartId) && (paramInt2 == mEndId)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void measure(int paramInt1, int paramInt2)
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = View.MeasureSpec.getMode(paramInt2);
      MotionLayout localMotionLayout = MotionLayout.this;
      mWidthMeasureMode = i;
      mHeightMeasureMode = j;
      localMotionLayout.getOptimizationLevel();
      computeStartEndSize(paramInt1, paramInt2);
      if (((getParent() instanceof MotionLayout)) && (i == 1073741824) && (j == 1073741824)) {
        i = 0;
      } else {
        i = 1;
      }
      boolean bool1;
      if (i != 0)
      {
        computeStartEndSize(paramInt1, paramInt2);
        mStartWrapWidth = mLayoutStart.getWidth();
        mStartWrapHeight = mLayoutStart.getHeight();
        mEndWrapWidth = mLayoutEnd.getWidth();
        mEndWrapHeight = mLayoutEnd.getHeight();
        localMotionLayout = MotionLayout.this;
        if ((mStartWrapWidth == mEndWrapWidth) && (mStartWrapHeight == mEndWrapHeight)) {
          bool1 = false;
        } else {
          bool1 = true;
        }
        mMeasureDuringTransition = bool1;
      }
      localMotionLayout = MotionLayout.this;
      j = mStartWrapWidth;
      int k = mStartWrapHeight;
      int m = mWidthMeasureMode;
      float f;
      if (m != Integer.MIN_VALUE)
      {
        i = j;
        if (m != 0) {}
      }
      else
      {
        f = j;
        i = (int)(mPostInterpolationPosition * (mEndWrapWidth - j) + f);
      }
      m = mHeightMeasureMode;
      if (m != Integer.MIN_VALUE)
      {
        j = k;
        if (m != 0) {}
      }
      else
      {
        f = k;
        j = (int)(mPostInterpolationPosition * (mEndWrapHeight - k) + f);
      }
      if ((!mLayoutStart.isWidthMeasuredTooSmall()) && (!mLayoutEnd.isWidthMeasuredTooSmall())) {
        bool1 = false;
      } else {
        bool1 = true;
      }
      boolean bool2;
      if ((!mLayoutStart.isHeightMeasuredTooSmall()) && (!mLayoutEnd.isHeightMeasuredTooSmall())) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      MotionLayout.access$1500(MotionLayout.this, paramInt1, paramInt2, i, j, bool1, bool2);
    }
    
    public void reEvaluateState()
    {
      measure(MotionLayout.access$1200(MotionLayout.this), MotionLayout.access$1300(MotionLayout.this));
      MotionLayout.access$1400(MotionLayout.this);
    }
    
    public void setMeasuredId(int paramInt1, int paramInt2)
    {
      mStartId = paramInt1;
      mEndId = paramInt2;
    }
  }
  
  public static abstract interface MotionTracker
  {
    public abstract void addMovement(MotionEvent paramMotionEvent);
    
    public abstract void clear();
    
    public abstract void computeCurrentVelocity(int paramInt);
    
    public abstract void computeCurrentVelocity(int paramInt, float paramFloat);
    
    public abstract float getXVelocity();
    
    public abstract float getXVelocity(int paramInt);
    
    public abstract float getYVelocity();
    
    public abstract float getYVelocity(int paramInt);
    
    public abstract void recycle();
  }
  
  public static class MyTracker
    implements MotionLayout.MotionTracker
  {
    private static MyTracker me = new MyTracker();
    public VelocityTracker tracker;
    
    public static MyTracker obtain()
    {
      metracker = VelocityTracker.obtain();
      return me;
    }
    
    public void addMovement(MotionEvent paramMotionEvent)
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        localVelocityTracker.addMovement(paramMotionEvent);
      }
    }
    
    public void clear()
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        localVelocityTracker.clear();
      }
    }
    
    public void computeCurrentVelocity(int paramInt)
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        localVelocityTracker.computeCurrentVelocity(paramInt);
      }
    }
    
    public void computeCurrentVelocity(int paramInt, float paramFloat)
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        localVelocityTracker.computeCurrentVelocity(paramInt, paramFloat);
      }
    }
    
    public float getXVelocity()
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        return localVelocityTracker.getXVelocity();
      }
      return 0.0F;
    }
    
    public float getXVelocity(int paramInt)
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        return localVelocityTracker.getXVelocity(paramInt);
      }
      return 0.0F;
    }
    
    public float getYVelocity()
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null) {
        return localVelocityTracker.getYVelocity();
      }
      return 0.0F;
    }
    
    public float getYVelocity(int paramInt)
    {
      if (tracker != null) {
        return getYVelocity(paramInt);
      }
      return 0.0F;
    }
    
    public void recycle()
    {
      VelocityTracker localVelocityTracker = tracker;
      if (localVelocityTracker != null)
      {
        localVelocityTracker.recycle();
        tracker = null;
      }
    }
  }
  
  public class StateCache
  {
    public final String KeyEndState = "motion.EndState";
    public final String KeyProgress = "motion.progress";
    public final String KeyStartState = "motion.StartState";
    public final String KeyVelocity = "motion.velocity";
    public int endState = -1;
    public float mProgress = NaN.0F;
    public float mVelocity = NaN.0F;
    public int startState = -1;
    
    public StateCache() {}
    
    public void apply()
    {
      int i = startState;
      if ((i != -1) || (endState != -1))
      {
        if (i == -1)
        {
          transitionToState(endState);
        }
        else
        {
          int j = endState;
          if (j == -1) {
            setState(i, -1, -1);
          } else {
            setTransition(i, j);
          }
        }
        setState(MotionLayout.TransitionState.SETUP);
      }
      if (Float.isNaN(mVelocity))
      {
        if (Float.isNaN(mProgress)) {
          return;
        }
        MotionLayout.this.setProgress(mProgress);
        return;
      }
      setProgress(mProgress, mVelocity);
      mProgress = NaN.0F;
      mVelocity = NaN.0F;
      startState = -1;
      endState = -1;
    }
    
    public Bundle getTransitionState()
    {
      Bundle localBundle = new Bundle();
      localBundle.putFloat("motion.progress", mProgress);
      localBundle.putFloat("motion.velocity", mVelocity);
      localBundle.putInt("motion.StartState", startState);
      localBundle.putInt("motion.EndState", endState);
      return localBundle;
    }
    
    public void recordState()
    {
      endState = MotionLayout.access$100(MotionLayout.this);
      startState = MotionLayout.access$200(MotionLayout.this);
      mVelocity = getVelocity();
      mProgress = getProgress();
    }
    
    public void setEndState(int paramInt)
    {
      endState = paramInt;
    }
    
    public void setProgress(float paramFloat)
    {
      mProgress = paramFloat;
    }
    
    public void setStartState(int paramInt)
    {
      startState = paramInt;
    }
    
    public void setTransitionState(Bundle paramBundle)
    {
      mProgress = paramBundle.getFloat("motion.progress");
      mVelocity = paramBundle.getFloat("motion.velocity");
      startState = paramBundle.getInt("motion.StartState");
      endState = paramBundle.getInt("motion.EndState");
    }
    
    public void setVelocity(float paramFloat)
    {
      mVelocity = paramFloat;
    }
  }
  
  public static abstract interface TransitionListener
  {
    public abstract void onTransitionChange(MotionLayout paramMotionLayout, int paramInt1, int paramInt2, float paramFloat);
    
    public abstract void onTransitionCompleted(MotionLayout paramMotionLayout, int paramInt);
    
    public abstract void onTransitionStarted(MotionLayout paramMotionLayout, int paramInt1, int paramInt2);
    
    public abstract void onTransitionTrigger(MotionLayout paramMotionLayout, int paramInt, boolean paramBoolean, float paramFloat);
  }
  
  public static enum TransitionState
  {
    static
    {
      SETUP = new TransitionState("SETUP", 1);
      MOVING = new TransitionState("MOVING", 2);
      FINISHED = new TransitionState("FINISHED", 3);
    }
    
    private TransitionState() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */