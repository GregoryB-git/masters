package androidx.constraintlayout.motion.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q5;
import z2;

public class ViewTransition
{
  public static final int ANTICIPATE = 6;
  public static final int BOUNCE = 4;
  public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
  public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
  public static final String CUSTOM_METHOD = "CustomMethod";
  public static final int EASE_IN = 1;
  public static final int EASE_IN_OUT = 0;
  public static final int EASE_OUT = 2;
  private static final int INTERPOLATOR_REFERENCE_ID = -2;
  public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
  public static final int LINEAR = 3;
  public static final int ONSTATE_ACTION_DOWN = 1;
  public static final int ONSTATE_ACTION_DOWN_UP = 3;
  public static final int ONSTATE_ACTION_UP = 2;
  public static final int ONSTATE_SHARED_VALUE_SET = 4;
  public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
  public static final int OVERSHOOT = 5;
  private static final int SPLINE_STRING = -1;
  private static String TAG = "ViewTransition";
  private static final int UNSET = -1;
  public static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
  public static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
  public static final int VIEWTRANSITIONMODE_NOSTATE = 2;
  public static final String VIEW_TRANSITION_TAG = "ViewTransition";
  private int mClearsTag = -1;
  public ConstraintSet.Constraint mConstraintDelta;
  public Context mContext;
  private int mDefaultInterpolator = 0;
  private int mDefaultInterpolatorID = -1;
  private String mDefaultInterpolatorString = null;
  private boolean mDisabled = false;
  private int mDuration = -1;
  private int mId;
  private int mIfTagNotSet = -1;
  private int mIfTagSet = -1;
  public KeyFrames mKeyFrames;
  private int mOnStateTransition = -1;
  private int mPathMotionArc = 0;
  private int mSetsTag = -1;
  private int mSharedValueCurrent = -1;
  private int mSharedValueID = -1;
  private int mSharedValueTarget = -1;
  private int mTargetId;
  private String mTargetString;
  private int mUpDuration = -1;
  public int mViewTransitionMode;
  public ConstraintSet set;
  
  public ViewTransition(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    mContext = paramContext;
    try
    {
      for (int i = paramXmlPullParser.getEventType(); i != 1; i = paramXmlPullParser.next()) {
        if (i != 2)
        {
          if ((i != 3) || (!"ViewTransition".equals(paramXmlPullParser.getName()))) {}
        }
        else
        {
          Object localObject1 = paramXmlPullParser.getName();
          switch (((String)localObject1).hashCode())
          {
          default: 
            break;
          case 1791837707: 
            if (((String)localObject1).equals("CustomAttribute")) {
              i = 3;
            }
            break;
          case 366511058: 
            if (((String)localObject1).equals("CustomMethod")) {
              i = 4;
            }
            break;
          case 61998586: 
            if (((String)localObject1).equals("ViewTransition")) {
              i = 0;
            }
            break;
          case -1239391468: 
            if (((String)localObject1).equals("KeyFrameSet")) {
              i = 1;
            }
            break;
          case -1962203927: 
            if (((String)localObject1).equals("ConstraintOverride")) {
              i = 2;
            }
            break;
          }
          i = -1;
          if (i != 0)
          {
            if (i != 1)
            {
              if (i != 2)
              {
                if ((i != 3) && (i != 4))
                {
                  Object localObject2 = TAG;
                  StringBuilder localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  localStringBuilder.append(Debug.getLoc());
                  localStringBuilder.append(" unknown tag ");
                  localStringBuilder.append((String)localObject1);
                  Log.e((String)localObject2, localStringBuilder.toString());
                  localObject1 = TAG;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  ((StringBuilder)localObject2).append(".xml:");
                  ((StringBuilder)localObject2).append(paramXmlPullParser.getLineNumber());
                  Log.e((String)localObject1, ((StringBuilder)localObject2).toString());
                }
                else
                {
                  ConstraintAttribute.parse(paramContext, paramXmlPullParser, mConstraintDelta.mCustomConstraints);
                }
              }
              else {
                mConstraintDelta = ConstraintSet.buildDelta(paramContext, paramXmlPullParser);
              }
            }
            else
            {
              localObject1 = new androidx/constraintlayout/motion/widget/KeyFrames;
              ((KeyFrames)localObject1).<init>(paramContext, paramXmlPullParser);
              mKeyFrames = ((KeyFrames)localObject1);
            }
          }
          else {
            parseViewTransitionTags(paramContext, paramXmlPullParser);
          }
        }
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void parseViewTransitionTags(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.ViewTransition);
    int i = paramXmlPullParser.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramXmlPullParser.getIndex(j);
      if (k == R.styleable.ViewTransition_android_id)
      {
        mId = paramXmlPullParser.getResourceId(k, mId);
      }
      else
      {
        int m;
        if (k == R.styleable.ViewTransition_motionTarget)
        {
          if (MotionLayout.IS_IN_EDIT_MODE)
          {
            m = paramXmlPullParser.getResourceId(k, mTargetId);
            mTargetId = m;
            if (m == -1) {
              mTargetString = paramXmlPullParser.getString(k);
            }
          }
          else if (peekValuetype == 3)
          {
            mTargetString = paramXmlPullParser.getString(k);
          }
          else
          {
            mTargetId = paramXmlPullParser.getResourceId(k, mTargetId);
          }
        }
        else if (k == R.styleable.ViewTransition_onStateTransition)
        {
          mOnStateTransition = paramXmlPullParser.getInt(k, mOnStateTransition);
        }
        else if (k == R.styleable.ViewTransition_transitionDisable)
        {
          mDisabled = paramXmlPullParser.getBoolean(k, mDisabled);
        }
        else if (k == R.styleable.ViewTransition_pathMotionArc)
        {
          mPathMotionArc = paramXmlPullParser.getInt(k, mPathMotionArc);
        }
        else if (k == R.styleable.ViewTransition_duration)
        {
          mDuration = paramXmlPullParser.getInt(k, mDuration);
        }
        else if (k == R.styleable.ViewTransition_upDuration)
        {
          mUpDuration = paramXmlPullParser.getInt(k, mUpDuration);
        }
        else if (k == R.styleable.ViewTransition_viewTransitionMode)
        {
          mViewTransitionMode = paramXmlPullParser.getInt(k, mViewTransitionMode);
        }
        else if (k == R.styleable.ViewTransition_motionInterpolator)
        {
          m = peekValuetype;
          if (m == 1)
          {
            k = paramXmlPullParser.getResourceId(k, -1);
            mDefaultInterpolatorID = k;
            if (k != -1) {
              mDefaultInterpolator = -2;
            }
          }
          else if (m == 3)
          {
            paramContext = paramXmlPullParser.getString(k);
            mDefaultInterpolatorString = paramContext;
            if ((paramContext != null) && (paramContext.indexOf("/") > 0))
            {
              mDefaultInterpolatorID = paramXmlPullParser.getResourceId(k, -1);
              mDefaultInterpolator = -2;
            }
            else
            {
              mDefaultInterpolator = -1;
            }
          }
          else
          {
            mDefaultInterpolator = paramXmlPullParser.getInteger(k, mDefaultInterpolator);
          }
        }
        else if (k == R.styleable.ViewTransition_setsTag)
        {
          mSetsTag = paramXmlPullParser.getResourceId(k, mSetsTag);
        }
        else if (k == R.styleable.ViewTransition_clearsTag)
        {
          mClearsTag = paramXmlPullParser.getResourceId(k, mClearsTag);
        }
        else if (k == R.styleable.ViewTransition_ifTagSet)
        {
          mIfTagSet = paramXmlPullParser.getResourceId(k, mIfTagSet);
        }
        else if (k == R.styleable.ViewTransition_ifTagNotSet)
        {
          mIfTagNotSet = paramXmlPullParser.getResourceId(k, mIfTagNotSet);
        }
        else if (k == R.styleable.ViewTransition_SharedValueId)
        {
          mSharedValueID = paramXmlPullParser.getResourceId(k, mSharedValueID);
        }
        else if (k == R.styleable.ViewTransition_SharedValue)
        {
          mSharedValueTarget = paramXmlPullParser.getInteger(k, mSharedValueTarget);
        }
      }
    }
    paramXmlPullParser.recycle();
  }
  
  private void updateTransition(MotionScene.Transition paramTransition, View paramView)
  {
    int i = mDuration;
    if (i != -1) {
      paramTransition.setDuration(i);
    }
    paramTransition.setPathMotionArc(mPathMotionArc);
    paramTransition.setInterpolatorInfo(mDefaultInterpolator, mDefaultInterpolatorString, mDefaultInterpolatorID);
    i = paramView.getId();
    paramView = mKeyFrames;
    if (paramView != null)
    {
      Object localObject = paramView.getKeyFramesForView(-1);
      paramView = new KeyFrames();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramView.addKey(((Key)((Iterator)localObject).next()).clone().setViewId(i));
      }
      paramTransition.addKeyFrame(paramView);
    }
  }
  
  public void applyIndependentTransition(ViewTransitionController paramViewTransitionController, MotionLayout paramMotionLayout, View paramView)
  {
    MotionController localMotionController = new MotionController(paramView);
    localMotionController.setBothStates(paramView);
    mKeyFrames.addAllFrames(localMotionController);
    localMotionController.setup(paramMotionLayout.getWidth(), paramMotionLayout.getHeight(), mDuration, System.nanoTime());
    new Animate(paramViewTransitionController, localMotionController, mDuration, mUpDuration, mOnStateTransition, getInterpolator(paramMotionLayout.getContext()), mSetsTag, mClearsTag);
  }
  
  public void applyTransition(ViewTransitionController paramViewTransitionController, MotionLayout paramMotionLayout, int paramInt, ConstraintSet paramConstraintSet, View... paramVarArgs)
  {
    if (mDisabled) {
      return;
    }
    int i = mViewTransitionMode;
    if (i == 2)
    {
      applyIndependentTransition(paramViewTransitionController, paramMotionLayout, paramVarArgs[0]);
      return;
    }
    Object localObject2;
    if (i == 1)
    {
      localObject1 = paramMotionLayout.getConstraintSetIds();
      for (i = 0; i < localObject1.length; i++)
      {
        j = localObject1[i];
        if (j != paramInt)
        {
          localObject2 = paramMotionLayout.getConstraintSet(j);
          int k = paramVarArgs.length;
          for (j = 0; j < k; j++)
          {
            paramViewTransitionController = ((ConstraintSet)localObject2).getConstraint(paramVarArgs[j].getId());
            ConstraintSet.Constraint localConstraint = mConstraintDelta;
            if (localConstraint != null)
            {
              localConstraint.applyDelta(paramViewTransitionController);
              mCustomConstraints.putAll(mConstraintDelta.mCustomConstraints);
            }
          }
        }
      }
    }
    Object localObject1 = new ConstraintSet();
    ((ConstraintSet)localObject1).clone(paramConstraintSet);
    int j = paramVarArgs.length;
    for (i = 0; i < j; i++)
    {
      paramViewTransitionController = ((ConstraintSet)localObject1).getConstraint(paramVarArgs[i].getId());
      localObject2 = mConstraintDelta;
      if (localObject2 != null)
      {
        ((ConstraintSet.Constraint)localObject2).applyDelta(paramViewTransitionController);
        mCustomConstraints.putAll(mConstraintDelta.mCustomConstraints);
      }
    }
    paramMotionLayout.updateState(paramInt, (ConstraintSet)localObject1);
    i = R.id.view_transition;
    paramMotionLayout.updateState(i, paramConstraintSet);
    paramMotionLayout.setState(i, -1, -1);
    paramViewTransitionController = new MotionScene.Transition(-1, mScene, i, paramInt);
    i = paramVarArgs.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      updateTransition(paramViewTransitionController, paramVarArgs[paramInt]);
    }
    paramMotionLayout.setTransition(paramViewTransitionController);
    paramMotionLayout.transitionToEnd(new q5(this, paramVarArgs, 0));
  }
  
  public boolean checkTags(View paramView)
  {
    int i = mIfTagSet;
    boolean bool1 = false;
    if (i == -1) {}
    while (paramView.getTag(i) != null)
    {
      i = 1;
      break;
    }
    i = 0;
    int j = mIfTagNotSet;
    if (j == -1) {}
    while (paramView.getTag(j) == null)
    {
      j = 1;
      break;
    }
    j = 0;
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if (j != 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public Interpolator getInterpolator(Context paramContext)
  {
    int i = mDefaultInterpolator;
    if (i != -2)
    {
      if (i != -1)
      {
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 4)
              {
                if (i != 5)
                {
                  if (i != 6) {
                    return null;
                  }
                  return new AnticipateInterpolator();
                }
                return new OvershootInterpolator();
              }
              return new BounceInterpolator();
            }
            return new DecelerateInterpolator();
          }
          return new AccelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
      }
      new Interpolator()
      {
        public float getInterpolation(float paramAnonymousFloat)
        {
          return (float)val$easing.get(paramAnonymousFloat);
        }
      };
    }
    return AnimationUtils.loadInterpolator(paramContext, mDefaultInterpolatorID);
  }
  
  public int getSharedValue()
  {
    return mSharedValueTarget;
  }
  
  public int getSharedValueCurrent()
  {
    return mSharedValueCurrent;
  }
  
  public int getSharedValueID()
  {
    return mSharedValueID;
  }
  
  public int getStateTransition()
  {
    return mOnStateTransition;
  }
  
  public boolean isEnabled()
  {
    return mDisabled ^ true;
  }
  
  public boolean matchesView(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    if ((mTargetId == -1) && (mTargetString == null)) {
      return false;
    }
    if (!checkTags(paramView)) {
      return false;
    }
    if (paramView.getId() == mTargetId) {
      return true;
    }
    if (mTargetString == null) {
      return false;
    }
    if ((paramView.getLayoutParams() instanceof ConstraintLayout.LayoutParams))
    {
      paramView = getLayoutParamsconstraintTag;
      if ((paramView != null) && (paramView.matches(mTargetString))) {
        return true;
      }
    }
    return false;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mDisabled = (paramBoolean ^ true);
  }
  
  public void setId(int paramInt)
  {
    mId = paramInt;
  }
  
  public void setSharedValue(int paramInt)
  {
    mSharedValueTarget = paramInt;
  }
  
  public void setSharedValueCurrent(int paramInt)
  {
    mSharedValueCurrent = paramInt;
  }
  
  public void setSharedValueID(int paramInt)
  {
    mSharedValueID = paramInt;
  }
  
  public void setStateTransition(int paramInt)
  {
    mOnStateTransition = paramInt;
  }
  
  public boolean supports(int paramInt)
  {
    int i = mOnStateTransition;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (i == 1)
    {
      if (paramInt == 0) {
        bool3 = true;
      }
      return bool3;
    }
    if (i == 2)
    {
      bool3 = bool1;
      if (paramInt == 1) {
        bool3 = true;
      }
      return bool3;
    }
    bool3 = bool2;
    if (i == 3)
    {
      bool3 = bool2;
      if (paramInt == 0) {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ViewTransition(");
    localStringBuilder.append(Debug.getName(mContext, mId));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static class Animate
  {
    public boolean hold_at_100 = false;
    public KeyCache mCache = new KeyCache();
    private final int mClearsTag;
    public float mDpositionDt;
    public int mDuration;
    public Interpolator mInterpolator;
    public long mLastRender;
    public MotionController mMC;
    public float mPosition;
    private final int mSetsTag;
    public long mStart;
    public Rect mTempRec = new Rect();
    public int mUpDuration;
    public ViewTransitionController mVtController;
    public boolean reverse = false;
    
    public Animate(ViewTransitionController paramViewTransitionController, MotionController paramMotionController, int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator, int paramInt4, int paramInt5)
    {
      mVtController = paramViewTransitionController;
      mMC = paramMotionController;
      mDuration = paramInt1;
      mUpDuration = paramInt2;
      long l = System.nanoTime();
      mStart = l;
      mLastRender = l;
      mVtController.addAnimation(this);
      mInterpolator = paramInterpolator;
      mSetsTag = paramInt4;
      mClearsTag = paramInt5;
      if (paramInt3 == 3) {
        hold_at_100 = true;
      }
      float f;
      if (paramInt1 == 0) {
        f = Float.MAX_VALUE;
      } else {
        f = 1.0F / paramInt1;
      }
      mDpositionDt = f;
      mutate();
    }
    
    public void mutate()
    {
      if (reverse) {
        mutateReverse();
      } else {
        mutateForward();
      }
    }
    
    public void mutateForward()
    {
      long l1 = System.nanoTime();
      long l2 = mLastRender;
      mLastRender = l1;
      float f = mPosition;
      f = (float)((l1 - l2) * 1.0E-6D) * mDpositionDt + f;
      mPosition = f;
      if (f >= 1.0F) {
        mPosition = 1.0F;
      }
      Object localObject = mInterpolator;
      if (localObject == null) {
        f = mPosition;
      } else {
        f = ((TimeInterpolator)localObject).getInterpolation(mPosition);
      }
      localObject = mMC;
      boolean bool = ((MotionController)localObject).interpolate(mView, f, l1, mCache);
      if (mPosition >= 1.0F)
      {
        if (mSetsTag != -1) {
          mMC.getView().setTag(mSetsTag, Long.valueOf(System.nanoTime()));
        }
        if (mClearsTag != -1) {
          mMC.getView().setTag(mClearsTag, null);
        }
        if (!hold_at_100) {
          mVtController.removeAnimation(this);
        }
      }
      if ((mPosition < 1.0F) || (bool)) {
        mVtController.invalidate();
      }
    }
    
    public void mutateReverse()
    {
      long l1 = System.nanoTime();
      long l2 = mLastRender;
      mLastRender = l1;
      float f = mPosition - (float)((l1 - l2) * 1.0E-6D) * mDpositionDt;
      mPosition = f;
      if (f < 0.0F) {
        mPosition = 0.0F;
      }
      Object localObject = mInterpolator;
      if (localObject == null) {
        f = mPosition;
      } else {
        f = ((TimeInterpolator)localObject).getInterpolation(mPosition);
      }
      localObject = mMC;
      boolean bool = ((MotionController)localObject).interpolate(mView, f, l1, mCache);
      if (mPosition <= 0.0F)
      {
        if (mSetsTag != -1) {
          mMC.getView().setTag(mSetsTag, Long.valueOf(System.nanoTime()));
        }
        if (mClearsTag != -1) {
          mMC.getView().setTag(mClearsTag, null);
        }
        mVtController.removeAnimation(this);
      }
      if ((mPosition > 0.0F) || (bool)) {
        mVtController.invalidate();
      }
    }
    
    public void reactTo(int paramInt, float paramFloat1, float paramFloat2)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2)
        {
          mMC.getView().getHitRect(mTempRec);
          if ((!mTempRec.contains((int)paramFloat1, (int)paramFloat2)) && (!reverse)) {
            reverse(true);
          }
        }
        return;
      }
      if (!reverse) {
        reverse(true);
      }
    }
    
    public void reverse(boolean paramBoolean)
    {
      reverse = paramBoolean;
      if (paramBoolean)
      {
        int i = mUpDuration;
        if (i != -1)
        {
          float f;
          if (i == 0) {
            f = Float.MAX_VALUE;
          } else {
            f = 1.0F / i;
          }
          mDpositionDt = f;
        }
      }
      mVtController.invalidate();
      mLastRender = System.nanoTime();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */