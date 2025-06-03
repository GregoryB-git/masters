package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import z2;

public class MotionScene$Transition
{
  public static final int AUTO_ANIMATE_TO_END = 4;
  public static final int AUTO_ANIMATE_TO_START = 3;
  public static final int AUTO_JUMP_TO_END = 2;
  public static final int AUTO_JUMP_TO_START = 1;
  public static final int AUTO_NONE = 0;
  public static final int INTERPOLATE_ANTICIPATE = 6;
  public static final int INTERPOLATE_BOUNCE = 4;
  public static final int INTERPOLATE_EASE_IN = 1;
  public static final int INTERPOLATE_EASE_IN_OUT = 0;
  public static final int INTERPOLATE_EASE_OUT = 2;
  public static final int INTERPOLATE_LINEAR = 3;
  public static final int INTERPOLATE_OVERSHOOT = 5;
  public static final int INTERPOLATE_REFERENCE_ID = -2;
  public static final int INTERPOLATE_SPLINE_STRING = -1;
  public static final int TRANSITION_FLAG_FIRST_DRAW = 1;
  public static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
  public static final int TRANSITION_FLAG_INTRA_AUTO = 2;
  private int mAutoTransition = 0;
  private int mConstraintSetEnd = -1;
  private int mConstraintSetStart = -1;
  private int mDefaultInterpolator = 0;
  private int mDefaultInterpolatorID = -1;
  private String mDefaultInterpolatorString = null;
  private boolean mDisable = false;
  private int mDuration = 400;
  private int mId = -1;
  private boolean mIsAbstract = false;
  private ArrayList<KeyFrames> mKeyFramesList = new ArrayList();
  private int mLayoutDuringTransition = 0;
  private final MotionScene mMotionScene;
  private ArrayList<TransitionOnClick> mOnClicks = new ArrayList();
  private int mPathMotionArc = -1;
  private float mStagger = 0.0F;
  private TouchResponse mTouchResponse = null;
  private int mTransitionFlags = 0;
  
  public MotionScene$Transition(int paramInt1, MotionScene paramMotionScene, int paramInt2, int paramInt3)
  {
    mId = paramInt1;
    mMotionScene = paramMotionScene;
    mConstraintSetStart = paramInt2;
    mConstraintSetEnd = paramInt3;
    mDuration = MotionScene.access$900(paramMotionScene);
    mLayoutDuringTransition = MotionScene.access$1000(paramMotionScene);
  }
  
  public MotionScene$Transition(MotionScene paramMotionScene, Context paramContext, XmlPullParser paramXmlPullParser)
  {
    mDuration = MotionScene.access$900(paramMotionScene);
    mLayoutDuringTransition = MotionScene.access$1000(paramMotionScene);
    mMotionScene = paramMotionScene;
    fillFromAttributeList(paramMotionScene, paramContext, Xml.asAttributeSet(paramXmlPullParser));
  }
  
  public MotionScene$Transition(MotionScene paramMotionScene, Transition paramTransition)
  {
    mMotionScene = paramMotionScene;
    mDuration = MotionScene.access$900(paramMotionScene);
    if (paramTransition != null)
    {
      mPathMotionArc = mPathMotionArc;
      mDefaultInterpolator = mDefaultInterpolator;
      mDefaultInterpolatorString = mDefaultInterpolatorString;
      mDefaultInterpolatorID = mDefaultInterpolatorID;
      mDuration = mDuration;
      mKeyFramesList = mKeyFramesList;
      mStagger = mStagger;
      mLayoutDuringTransition = mLayoutDuringTransition;
    }
  }
  
  private void fill(MotionScene paramMotionScene, Context paramContext, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      Object localObject;
      if (k == R.styleable.Transition_constraintSetEnd)
      {
        mConstraintSetEnd = paramTypedArray.getResourceId(k, -1);
        localObject = paramContext.getResources().getResourceTypeName(mConstraintSetEnd);
        if ("layout".equals(localObject))
        {
          localObject = new ConstraintSet();
          ((ConstraintSet)localObject).load(paramContext, mConstraintSetEnd);
          MotionScene.access$1100(paramMotionScene).append(mConstraintSetEnd, localObject);
        }
        else if ("xml".equals(localObject))
        {
          mConstraintSetEnd = MotionScene.access$1200(paramMotionScene, paramContext, mConstraintSetEnd);
        }
      }
      else if (k == R.styleable.Transition_constraintSetStart)
      {
        mConstraintSetStart = paramTypedArray.getResourceId(k, mConstraintSetStart);
        localObject = paramContext.getResources().getResourceTypeName(mConstraintSetStart);
        if ("layout".equals(localObject))
        {
          localObject = new ConstraintSet();
          ((ConstraintSet)localObject).load(paramContext, mConstraintSetStart);
          MotionScene.access$1100(paramMotionScene).append(mConstraintSetStart, localObject);
        }
        else if ("xml".equals(localObject))
        {
          mConstraintSetStart = MotionScene.access$1200(paramMotionScene, paramContext, mConstraintSetStart);
        }
      }
      else if (k == R.styleable.Transition_motionInterpolator)
      {
        int m = peekValuetype;
        if (m == 1)
        {
          k = paramTypedArray.getResourceId(k, -1);
          mDefaultInterpolatorID = k;
          if (k != -1) {
            mDefaultInterpolator = -2;
          }
        }
        else if (m == 3)
        {
          localObject = paramTypedArray.getString(k);
          mDefaultInterpolatorString = ((String)localObject);
          if (localObject != null) {
            if (((String)localObject).indexOf("/") > 0)
            {
              mDefaultInterpolatorID = paramTypedArray.getResourceId(k, -1);
              mDefaultInterpolator = -2;
            }
            else
            {
              mDefaultInterpolator = -1;
            }
          }
        }
        else
        {
          mDefaultInterpolator = paramTypedArray.getInteger(k, mDefaultInterpolator);
        }
      }
      else if (k == R.styleable.Transition_duration)
      {
        k = paramTypedArray.getInt(k, mDuration);
        mDuration = k;
        if (k < 8) {
          mDuration = 8;
        }
      }
      else if (k == R.styleable.Transition_staggered)
      {
        mStagger = paramTypedArray.getFloat(k, mStagger);
      }
      else if (k == R.styleable.Transition_autoTransition)
      {
        mAutoTransition = paramTypedArray.getInteger(k, mAutoTransition);
      }
      else if (k == R.styleable.Transition_android_id)
      {
        mId = paramTypedArray.getResourceId(k, mId);
      }
      else if (k == R.styleable.Transition_transitionDisable)
      {
        mDisable = paramTypedArray.getBoolean(k, mDisable);
      }
      else if (k == R.styleable.Transition_pathMotionArc)
      {
        mPathMotionArc = paramTypedArray.getInteger(k, -1);
      }
      else if (k == R.styleable.Transition_layoutDuringTransition)
      {
        mLayoutDuringTransition = paramTypedArray.getInteger(k, 0);
      }
      else if (k == R.styleable.Transition_transitionFlags)
      {
        mTransitionFlags = paramTypedArray.getInteger(k, 0);
      }
    }
    if (mConstraintSetStart == -1) {
      mIsAbstract = true;
    }
  }
  
  private void fillFromAttributeList(MotionScene paramMotionScene, Context paramContext, AttributeSet paramAttributeSet)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Transition);
    fill(paramMotionScene, paramContext, paramAttributeSet);
    paramAttributeSet.recycle();
  }
  
  public void addKeyFrame(KeyFrames paramKeyFrames)
  {
    mKeyFramesList.add(paramKeyFrames);
  }
  
  public void addOnClick(int paramInt1, int paramInt2)
  {
    Object localObject = mOnClicks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      TransitionOnClick localTransitionOnClick = (TransitionOnClick)((Iterator)localObject).next();
      if (mTargetId == paramInt1)
      {
        mMode = paramInt2;
        return;
      }
    }
    localObject = new TransitionOnClick(this, paramInt1, paramInt2);
    mOnClicks.add(localObject);
  }
  
  public void addOnClick(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    mOnClicks.add(new TransitionOnClick(paramContext, this, paramXmlPullParser));
  }
  
  public String debugString(Context paramContext)
  {
    Object localObject;
    if (mConstraintSetStart == -1) {
      localObject = "null";
    } else {
      localObject = paramContext.getResources().getResourceEntryName(mConstraintSetStart);
    }
    if (mConstraintSetEnd == -1)
    {
      paramContext = z2.o((String)localObject, " -> null");
    }
    else
    {
      localObject = z2.u((String)localObject, " -> ");
      ((StringBuilder)localObject).append(paramContext.getResources().getResourceEntryName(mConstraintSetEnd));
      paramContext = ((StringBuilder)localObject).toString();
    }
    return paramContext;
  }
  
  public int getAutoTransition()
  {
    return mAutoTransition;
  }
  
  public int getDuration()
  {
    return mDuration;
  }
  
  public int getEndConstraintSetId()
  {
    return mConstraintSetEnd;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public List<KeyFrames> getKeyFrameList()
  {
    return mKeyFramesList;
  }
  
  public int getLayoutDuringTransition()
  {
    return mLayoutDuringTransition;
  }
  
  public List<TransitionOnClick> getOnClickList()
  {
    return mOnClicks;
  }
  
  public int getPathMotionArc()
  {
    return mPathMotionArc;
  }
  
  public float getStagger()
  {
    return mStagger;
  }
  
  public int getStartConstraintSetId()
  {
    return mConstraintSetStart;
  }
  
  public TouchResponse getTouchResponse()
  {
    return mTouchResponse;
  }
  
  public boolean isEnabled()
  {
    return mDisable ^ true;
  }
  
  public boolean isTransitionFlag(int paramInt)
  {
    boolean bool;
    if ((paramInt & mTransitionFlags) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void removeOnClick(int paramInt)
  {
    Iterator localIterator = mOnClicks.iterator();
    while (localIterator.hasNext())
    {
      localTransitionOnClick = (TransitionOnClick)localIterator.next();
      if (mTargetId == paramInt) {
        break label40;
      }
    }
    TransitionOnClick localTransitionOnClick = null;
    label40:
    if (localTransitionOnClick != null) {
      mOnClicks.remove(localTransitionOnClick);
    }
  }
  
  public void setAutoTransition(int paramInt)
  {
    mAutoTransition = paramInt;
  }
  
  public void setDuration(int paramInt)
  {
    mDuration = Math.max(paramInt, 8);
  }
  
  public void setEnable(boolean paramBoolean)
  {
    setEnabled(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mDisable = (paramBoolean ^ true);
  }
  
  public void setInterpolatorInfo(int paramInt1, String paramString, int paramInt2)
  {
    mDefaultInterpolator = paramInt1;
    mDefaultInterpolatorString = paramString;
    mDefaultInterpolatorID = paramInt2;
  }
  
  public void setLayoutDuringTransition(int paramInt)
  {
    mLayoutDuringTransition = paramInt;
  }
  
  public void setOnSwipe(OnSwipe paramOnSwipe)
  {
    if (paramOnSwipe == null) {
      paramOnSwipe = null;
    } else {
      paramOnSwipe = new TouchResponse(MotionScene.access$700(mMotionScene), paramOnSwipe);
    }
    mTouchResponse = paramOnSwipe;
  }
  
  public void setOnTouchUp(int paramInt)
  {
    TouchResponse localTouchResponse = getTouchResponse();
    if (localTouchResponse != null) {
      localTouchResponse.setTouchUpMode(paramInt);
    }
  }
  
  public void setPathMotionArc(int paramInt)
  {
    mPathMotionArc = paramInt;
  }
  
  public void setStagger(float paramFloat)
  {
    mStagger = paramFloat;
  }
  
  public void setTransitionFlag(int paramInt)
  {
    mTransitionFlags = paramInt;
  }
  
  public static class TransitionOnClick
    implements View.OnClickListener
  {
    public static final int ANIM_TOGGLE = 17;
    public static final int ANIM_TO_END = 1;
    public static final int ANIM_TO_START = 16;
    public static final int JUMP_TO_END = 256;
    public static final int JUMP_TO_START = 4096;
    public int mMode;
    public int mTargetId;
    private final MotionScene.Transition mTransition;
    
    public TransitionOnClick(Context paramContext, MotionScene.Transition paramTransition, XmlPullParser paramXmlPullParser)
    {
      mTargetId = -1;
      mMode = 17;
      mTransition = paramTransition;
      paramContext = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.OnClick);
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.OnClick_targetId) {
          mTargetId = paramContext.getResourceId(k, mTargetId);
        } else if (k == R.styleable.OnClick_clickAction) {
          mMode = paramContext.getInt(k, mMode);
        }
      }
      paramContext.recycle();
    }
    
    public TransitionOnClick(MotionScene.Transition paramTransition, int paramInt1, int paramInt2)
    {
      mTransition = paramTransition;
      mTargetId = paramInt1;
      mMode = paramInt2;
    }
    
    public void addOnClickListeners(MotionLayout paramMotionLayout, int paramInt, MotionScene.Transition paramTransition)
    {
      int i = mTargetId;
      if (i != -1) {
        paramMotionLayout = paramMotionLayout.findViewById(i);
      }
      if (paramMotionLayout == null)
      {
        paramMotionLayout = z2.t("OnClick could not find id ");
        paramMotionLayout.append(mTargetId);
        Log.e("MotionScene", paramMotionLayout.toString());
        return;
      }
      int j = MotionScene.Transition.access$100(paramTransition);
      int k = MotionScene.Transition.access$000(paramTransition);
      if (j == -1)
      {
        paramMotionLayout.setOnClickListener(this);
        return;
      }
      int m = mMode;
      int n = 0;
      if (((m & 0x1) != 0) && (paramInt == j)) {
        i = 1;
      } else {
        i = 0;
      }
      int i1;
      if (((m & 0x100) != 0) && (paramInt == j)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (((m & 0x1) != 0) && (paramInt == j)) {
        j = 1;
      } else {
        j = 0;
      }
      int i2;
      if (((m & 0x10) != 0) && (paramInt == k)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i3 = n;
      if ((m & 0x1000) != 0)
      {
        i3 = n;
        if (paramInt == k) {
          i3 = 1;
        }
      }
      if ((j | i | i1 | i2 | i3) != 0) {
        paramMotionLayout.setOnClickListener(this);
      }
    }
    
    public boolean isTransitionViable(MotionScene.Transition paramTransition, MotionLayout paramMotionLayout)
    {
      MotionScene.Transition localTransition = mTransition;
      boolean bool1 = true;
      boolean bool2 = true;
      if (localTransition == paramTransition) {
        return true;
      }
      int i = MotionScene.Transition.access$000(localTransition);
      int j = MotionScene.Transition.access$100(mTransition);
      if (j == -1)
      {
        if (mCurrentState == i) {
          bool2 = false;
        }
        return bool2;
      }
      int k = mCurrentState;
      bool2 = bool1;
      if (k != j) {
        if (k == i) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    
    public void onClick(View paramView)
    {
      paramView = MotionScene.access$700(MotionScene.Transition.access$800(mTransition));
      if (!paramView.isInteractionEnabled()) {
        return;
      }
      MotionScene.Transition localTransition1;
      if (MotionScene.Transition.access$100(mTransition) == -1)
      {
        i = paramView.getCurrentState();
        if (i == -1)
        {
          paramView.transitionToState(MotionScene.Transition.access$000(mTransition));
          return;
        }
        localTransition1 = new MotionScene.Transition(MotionScene.Transition.access$800(mTransition), mTransition);
        MotionScene.Transition.access$102(localTransition1, i);
        MotionScene.Transition.access$002(localTransition1, MotionScene.Transition.access$000(mTransition));
        paramView.setTransition(localTransition1);
        paramView.transitionToEnd();
        return;
      }
      MotionScene.Transition localTransition2 = access$800mTransition).mCurrentTransition;
      int i = mMode;
      int j = 0;
      int k;
      if (((i & 0x1) == 0) && ((i & 0x100) == 0)) {
        k = 0;
      } else {
        k = 1;
      }
      if (((i & 0x10) == 0) && ((i & 0x1000) == 0)) {
        i = 0;
      } else {
        i = 1;
      }
      int m;
      if ((k != 0) && (i != 0)) {
        m = 1;
      } else {
        m = 0;
      }
      int n = i;
      if (m != 0)
      {
        MotionScene.Transition localTransition3 = access$800mTransition).mCurrentTransition;
        localTransition1 = mTransition;
        if (localTransition3 != localTransition1) {
          paramView.setTransition(localTransition1);
        }
        n = i;
        m = j;
        if (paramView.getCurrentState() != paramView.getEndState()) {
          if (paramView.getProgress() > 0.5F)
          {
            n = i;
            m = j;
          }
          else
          {
            n = 0;
          }
        }
      }
      else
      {
        m = k;
      }
      if (isTransitionViable(localTransition2, paramView)) {
        if ((m != 0) && ((mMode & 0x1) != 0))
        {
          paramView.setTransition(mTransition);
          paramView.transitionToEnd();
        }
        else if ((n != 0) && ((mMode & 0x10) != 0))
        {
          paramView.setTransition(mTransition);
          paramView.transitionToStart();
        }
        else if ((m != 0) && ((mMode & 0x100) != 0))
        {
          paramView.setTransition(mTransition);
          paramView.setProgress(1.0F);
        }
        else if ((n != 0) && ((mMode & 0x1000) != 0))
        {
          paramView.setTransition(mTransition);
          paramView.setProgress(0.0F);
        }
      }
    }
    
    public void removeOnClickListeners(MotionLayout paramMotionLayout)
    {
      int i = mTargetId;
      if (i == -1) {
        return;
      }
      paramMotionLayout = paramMotionLayout.findViewById(i);
      if (paramMotionLayout == null)
      {
        paramMotionLayout = z2.t(" (*)  could not find id ");
        paramMotionLayout.append(mTargetId);
        Log.e("MotionScene", paramMotionLayout.toString());
        return;
      }
      paramMotionLayout.setOnClickListener(null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.Transition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */