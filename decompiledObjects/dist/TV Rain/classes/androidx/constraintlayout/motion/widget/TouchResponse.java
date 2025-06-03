package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R.styleable;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import org.xmlpull.v1.XmlPullParser;
import z2;

class TouchResponse
{
  public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
  public static final int COMPLETE_MODE_SPRING = 1;
  private static final boolean DEBUG = false;
  private static final float EPSILON = 1.0E-7F;
  public static final int FLAG_DISABLE_POST_SCROLL = 1;
  public static final int FLAG_DISABLE_SCROLL = 2;
  public static final int FLAG_SUPPORT_SCROLL_UP = 4;
  private static final int SEC_TO_MILLISECONDS = 1000;
  private static final int SIDE_BOTTOM = 3;
  private static final int SIDE_END = 6;
  private static final int SIDE_LEFT = 1;
  private static final int SIDE_MIDDLE = 4;
  private static final int SIDE_RIGHT = 2;
  private static final int SIDE_START = 5;
  private static final int SIDE_TOP = 0;
  private static final String TAG = "TouchResponse";
  private static final float[][] TOUCH_DIRECTION = { { 0.0F, -1.0F }, { 0.0F, 1.0F }, { -1.0F, 0.0F }, { 1.0F, 0.0F }, { -1.0F, 0.0F }, { 1.0F, 0.0F } };
  private static final int TOUCH_DOWN = 1;
  private static final int TOUCH_END = 5;
  private static final int TOUCH_LEFT = 2;
  private static final int TOUCH_RIGHT = 3;
  private static final float[][] TOUCH_SIDES;
  private static final int TOUCH_START = 4;
  private static final int TOUCH_UP = 0;
  private float[] mAnchorDpDt = new float[2];
  private int mAutoCompleteMode = 0;
  private float mDragScale = 1.0F;
  private boolean mDragStarted = false;
  private float mDragThreshold = 10.0F;
  private int mFlags = 0;
  public boolean mIsRotateMode = false;
  private float mLastTouchX;
  private float mLastTouchY;
  private int mLimitBoundsTo = -1;
  private float mMaxAcceleration = 1.2F;
  private float mMaxVelocity = 4.0F;
  private final MotionLayout mMotionLayout;
  private boolean mMoveWhenScrollAtTop = true;
  private int mOnTouchUp = 0;
  public float mRotateCenterX = 0.5F;
  public float mRotateCenterY = 0.5F;
  private int mRotationCenterId = -1;
  private int mSpringBoundary = 0;
  private float mSpringDamping = 10.0F;
  private float mSpringMass = 1.0F;
  private float mSpringStiffness = NaN.0F;
  private float mSpringStopThreshold = NaN.0F;
  private int[] mTempLoc = new int[2];
  private int mTouchAnchorId = -1;
  private int mTouchAnchorSide = 0;
  private float mTouchAnchorX = 0.5F;
  private float mTouchAnchorY = 0.5F;
  private float mTouchDirectionX = 0.0F;
  private float mTouchDirectionY = 1.0F;
  private int mTouchRegionId = -1;
  private int mTouchSide = 0;
  
  static
  {
    float[] arrayOfFloat1 = { 0.0F, 0.5F };
    float[] arrayOfFloat2 = { 1.0F, 0.5F };
    TOUCH_SIDES = new float[][] { { 0.5F, 0.0F }, arrayOfFloat1, { 1.0F, 0.5F }, { 0.5F, 1.0F }, { 0.5F, 0.5F }, { 0.0F, 0.5F }, arrayOfFloat2 };
  }
  
  public TouchResponse(Context paramContext, MotionLayout paramMotionLayout, XmlPullParser paramXmlPullParser)
  {
    mMotionLayout = paramMotionLayout;
    fillFromAttributeList(paramContext, Xml.asAttributeSet(paramXmlPullParser));
  }
  
  public TouchResponse(MotionLayout paramMotionLayout, OnSwipe paramOnSwipe)
  {
    mMotionLayout = paramMotionLayout;
    mTouchAnchorId = paramOnSwipe.getTouchAnchorId();
    int i = paramOnSwipe.getTouchAnchorSide();
    mTouchAnchorSide = i;
    if (i != -1)
    {
      paramMotionLayout = TOUCH_SIDES[i];
      mTouchAnchorX = paramMotionLayout[0];
      mTouchAnchorY = paramMotionLayout[1];
    }
    i = paramOnSwipe.getDragDirection();
    mTouchSide = i;
    paramMotionLayout = TOUCH_DIRECTION;
    if (i < paramMotionLayout.length)
    {
      paramMotionLayout = paramMotionLayout[i];
      mTouchDirectionX = paramMotionLayout[0];
      mTouchDirectionY = paramMotionLayout[1];
    }
    else
    {
      mTouchDirectionY = NaN.0F;
      mTouchDirectionX = NaN.0F;
      mIsRotateMode = true;
    }
    mMaxVelocity = paramOnSwipe.getMaxVelocity();
    mMaxAcceleration = paramOnSwipe.getMaxAcceleration();
    mMoveWhenScrollAtTop = paramOnSwipe.getMoveWhenScrollAtTop();
    mDragScale = paramOnSwipe.getDragScale();
    mDragThreshold = paramOnSwipe.getDragThreshold();
    mTouchRegionId = paramOnSwipe.getTouchRegionId();
    mOnTouchUp = paramOnSwipe.getOnTouchUp();
    mFlags = paramOnSwipe.getNestedScrollFlags();
    mLimitBoundsTo = paramOnSwipe.getLimitBoundsTo();
    mRotationCenterId = paramOnSwipe.getRotationCenterId();
    mSpringBoundary = paramOnSwipe.getSpringBoundary();
    mSpringDamping = paramOnSwipe.getSpringDamping();
    mSpringMass = paramOnSwipe.getSpringMass();
    mSpringStiffness = paramOnSwipe.getSpringStiffness();
    mSpringStopThreshold = paramOnSwipe.getSpringStopThreshold();
    mAutoCompleteMode = paramOnSwipe.getAutoCompleteMode();
  }
  
  private void fill(TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      if (k == R.styleable.OnSwipe_touchAnchorId)
      {
        mTouchAnchorId = paramTypedArray.getResourceId(k, mTouchAnchorId);
      }
      else
      {
        Object localObject;
        if (k == R.styleable.OnSwipe_touchAnchorSide)
        {
          k = paramTypedArray.getInt(k, mTouchAnchorSide);
          mTouchAnchorSide = k;
          localObject = TOUCH_SIDES[k];
          mTouchAnchorX = localObject[0];
          mTouchAnchorY = localObject[1];
        }
        else if (k == R.styleable.OnSwipe_dragDirection)
        {
          k = paramTypedArray.getInt(k, mTouchSide);
          mTouchSide = k;
          localObject = TOUCH_DIRECTION;
          if (k < localObject.length)
          {
            localObject = localObject[k];
            mTouchDirectionX = localObject[0];
            mTouchDirectionY = localObject[1];
          }
          else
          {
            mTouchDirectionY = NaN.0F;
            mTouchDirectionX = NaN.0F;
            mIsRotateMode = true;
          }
        }
        else if (k == R.styleable.OnSwipe_maxVelocity)
        {
          mMaxVelocity = paramTypedArray.getFloat(k, mMaxVelocity);
        }
        else if (k == R.styleable.OnSwipe_maxAcceleration)
        {
          mMaxAcceleration = paramTypedArray.getFloat(k, mMaxAcceleration);
        }
        else if (k == R.styleable.OnSwipe_moveWhenScrollAtTop)
        {
          mMoveWhenScrollAtTop = paramTypedArray.getBoolean(k, mMoveWhenScrollAtTop);
        }
        else if (k == R.styleable.OnSwipe_dragScale)
        {
          mDragScale = paramTypedArray.getFloat(k, mDragScale);
        }
        else if (k == R.styleable.OnSwipe_dragThreshold)
        {
          mDragThreshold = paramTypedArray.getFloat(k, mDragThreshold);
        }
        else if (k == R.styleable.OnSwipe_touchRegionId)
        {
          mTouchRegionId = paramTypedArray.getResourceId(k, mTouchRegionId);
        }
        else if (k == R.styleable.OnSwipe_onTouchUp)
        {
          mOnTouchUp = paramTypedArray.getInt(k, mOnTouchUp);
        }
        else if (k == R.styleable.OnSwipe_nestedScrollFlags)
        {
          mFlags = paramTypedArray.getInteger(k, 0);
        }
        else if (k == R.styleable.OnSwipe_limitBoundsTo)
        {
          mLimitBoundsTo = paramTypedArray.getResourceId(k, 0);
        }
        else if (k == R.styleable.OnSwipe_rotationCenterId)
        {
          mRotationCenterId = paramTypedArray.getResourceId(k, mRotationCenterId);
        }
        else if (k == R.styleable.OnSwipe_springDamping)
        {
          mSpringDamping = paramTypedArray.getFloat(k, mSpringDamping);
        }
        else if (k == R.styleable.OnSwipe_springMass)
        {
          mSpringMass = paramTypedArray.getFloat(k, mSpringMass);
        }
        else if (k == R.styleable.OnSwipe_springStiffness)
        {
          mSpringStiffness = paramTypedArray.getFloat(k, mSpringStiffness);
        }
        else if (k == R.styleable.OnSwipe_springStopThreshold)
        {
          mSpringStopThreshold = paramTypedArray.getFloat(k, mSpringStopThreshold);
        }
        else if (k == R.styleable.OnSwipe_springBoundary)
        {
          mSpringBoundary = paramTypedArray.getInt(k, mSpringBoundary);
        }
        else if (k == R.styleable.OnSwipe_autoCompleteMode)
        {
          mAutoCompleteMode = paramTypedArray.getInt(k, mAutoCompleteMode);
        }
      }
    }
  }
  
  private void fillFromAttributeList(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.OnSwipe);
    fill(paramContext);
    paramContext.recycle();
  }
  
  public float dot(float paramFloat1, float paramFloat2)
  {
    float f = mTouchDirectionX;
    return paramFloat2 * mTouchDirectionY + paramFloat1 * f;
  }
  
  public int getAnchorId()
  {
    return mTouchAnchorId;
  }
  
  public int getAutoCompleteMode()
  {
    return mAutoCompleteMode;
  }
  
  public int getFlags()
  {
    return mFlags;
  }
  
  public RectF getLimitBoundsTo(ViewGroup paramViewGroup, RectF paramRectF)
  {
    int i = mLimitBoundsTo;
    if (i == -1) {
      return null;
    }
    paramViewGroup = paramViewGroup.findViewById(i);
    if (paramViewGroup == null) {
      return null;
    }
    paramRectF.set(paramViewGroup.getLeft(), paramViewGroup.getTop(), paramViewGroup.getRight(), paramViewGroup.getBottom());
    return paramRectF;
  }
  
  public int getLimitBoundsToId()
  {
    return mLimitBoundsTo;
  }
  
  public float getMaxAcceleration()
  {
    return mMaxAcceleration;
  }
  
  public float getMaxVelocity()
  {
    return mMaxVelocity;
  }
  
  public boolean getMoveWhenScrollAtTop()
  {
    return mMoveWhenScrollAtTop;
  }
  
  public float getProgressDirection(float paramFloat1, float paramFloat2)
  {
    float f = mMotionLayout.getProgress();
    mMotionLayout.getAnchorDpDt(mTouchAnchorId, f, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
    f = mTouchDirectionX;
    float[] arrayOfFloat;
    if (f != 0.0F)
    {
      arrayOfFloat = mAnchorDpDt;
      if (arrayOfFloat[0] == 0.0F) {
        arrayOfFloat[0] = 1.0E-7F;
      }
      paramFloat1 = paramFloat1 * f / arrayOfFloat[0];
    }
    else
    {
      arrayOfFloat = mAnchorDpDt;
      if (arrayOfFloat[1] == 0.0F) {
        arrayOfFloat[1] = 1.0E-7F;
      }
      paramFloat1 = paramFloat2 * mTouchDirectionY / arrayOfFloat[1];
    }
    return paramFloat1;
  }
  
  public int getSpringBoundary()
  {
    return mSpringBoundary;
  }
  
  public float getSpringDamping()
  {
    return mSpringDamping;
  }
  
  public float getSpringMass()
  {
    return mSpringMass;
  }
  
  public float getSpringStiffness()
  {
    return mSpringStiffness;
  }
  
  public float getSpringStopThreshold()
  {
    return mSpringStopThreshold;
  }
  
  public RectF getTouchRegion(ViewGroup paramViewGroup, RectF paramRectF)
  {
    int i = mTouchRegionId;
    if (i == -1) {
      return null;
    }
    paramViewGroup = paramViewGroup.findViewById(i);
    if (paramViewGroup == null) {
      return null;
    }
    paramRectF.set(paramViewGroup.getLeft(), paramViewGroup.getTop(), paramViewGroup.getRight(), paramViewGroup.getBottom());
    return paramRectF;
  }
  
  public int getTouchRegionId()
  {
    return mTouchRegionId;
  }
  
  public boolean isDragStarted()
  {
    return mDragStarted;
  }
  
  public void processTouchEvent(MotionEvent paramMotionEvent, MotionLayout.MotionTracker paramMotionTracker, int paramInt, MotionScene paramMotionScene)
  {
    if (mIsRotateMode)
    {
      processTouchRotateEvent(paramMotionEvent, paramMotionTracker, paramInt, paramMotionScene);
      return;
    }
    paramMotionTracker.addMovement(paramMotionEvent);
    paramInt = paramMotionEvent.getAction();
    if (paramInt != 0)
    {
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      if (paramInt != 1)
      {
        if (paramInt == 2)
        {
          f1 = paramMotionEvent.getRawY() - mLastTouchY;
          f2 = paramMotionEvent.getRawX() - mLastTouchX;
          f3 = mTouchDirectionX;
          if ((Math.abs(mTouchDirectionY * f1 + f3 * f2) > mDragThreshold) || (mDragStarted))
          {
            f3 = mMotionLayout.getProgress();
            if (!mDragStarted)
            {
              mDragStarted = true;
              mMotionLayout.setProgress(f3);
            }
            paramInt = mTouchAnchorId;
            if (paramInt != -1)
            {
              mMotionLayout.getAnchorDpDt(paramInt, f3, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
            }
            else
            {
              f4 = Math.min(mMotionLayout.getWidth(), mMotionLayout.getHeight());
              paramMotionScene = mAnchorDpDt;
              paramMotionScene[1] = (mTouchDirectionY * f4);
              paramMotionScene[0] = (f4 * mTouchDirectionX);
            }
            f5 = mTouchDirectionX;
            paramMotionScene = mAnchorDpDt;
            f4 = paramMotionScene[0];
            if (Math.abs((mTouchDirectionY * paramMotionScene[1] + f5 * f4) * mDragScale) < 0.01D)
            {
              paramMotionScene = mAnchorDpDt;
              paramMotionScene[0] = 0.01F;
              paramMotionScene[1] = 0.01F;
            }
            if (mTouchDirectionX != 0.0F) {
              f1 = f2 / mAnchorDpDt[0];
            } else {
              f1 /= mAnchorDpDt[1];
            }
            f3 = Math.max(Math.min(f3 + f1, 1.0F), 0.0F);
            f1 = f3;
            if (mOnTouchUp == 6) {
              f1 = Math.max(f3, 0.01F);
            }
            f3 = f1;
            if (mOnTouchUp == 7) {
              f3 = Math.min(f1, 0.99F);
            }
            f1 = mMotionLayout.getProgress();
            if (f3 != f1)
            {
              paramInt = f1 < 0.0F;
              if ((paramInt == 0) || (f1 == 1.0F))
              {
                paramMotionScene = mMotionLayout;
                boolean bool;
                if (paramInt == 0) {
                  bool = true;
                } else {
                  bool = false;
                }
                paramMotionScene.endTrigger(bool);
              }
              mMotionLayout.setProgress(f3);
              paramMotionTracker.computeCurrentVelocity(1000);
              f1 = paramMotionTracker.getXVelocity();
              f3 = paramMotionTracker.getYVelocity();
              if (mTouchDirectionX != 0.0F) {
                f1 /= mAnchorDpDt[0];
              } else {
                f1 = f3 / mAnchorDpDt[1];
              }
              mMotionLayout.mLastVelocity = f1;
            }
            else
            {
              mMotionLayout.mLastVelocity = 0.0F;
            }
            mLastTouchX = paramMotionEvent.getRawX();
            mLastTouchY = paramMotionEvent.getRawY();
          }
        }
      }
      else
      {
        mDragStarted = false;
        paramMotionTracker.computeCurrentVelocity(1000);
        f1 = paramMotionTracker.getXVelocity();
        f3 = paramMotionTracker.getYVelocity();
        f4 = mMotionLayout.getProgress();
        paramInt = mTouchAnchorId;
        if (paramInt != -1)
        {
          mMotionLayout.getAnchorDpDt(paramInt, f4, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
        }
        else
        {
          f2 = Math.min(mMotionLayout.getWidth(), mMotionLayout.getHeight());
          paramMotionEvent = mAnchorDpDt;
          paramMotionEvent[1] = (mTouchDirectionY * f2);
          paramMotionEvent[0] = (f2 * mTouchDirectionX);
        }
        f2 = mTouchDirectionX;
        paramMotionEvent = mAnchorDpDt;
        float f6 = paramMotionEvent[0];
        f5 = paramMotionEvent[1];
        if (f2 != 0.0F) {
          f1 /= f6;
        } else {
          f1 = f3 / f5;
        }
        if (!Float.isNaN(f1)) {
          f3 = f1 / 3.0F + f4;
        } else {
          f3 = f4;
        }
        if ((f3 != 0.0F) && (f3 != 1.0F))
        {
          paramInt = mOnTouchUp;
          if (paramInt != 3)
          {
            if (f3 < 0.5D) {
              f2 = 0.0F;
            } else {
              f2 = 1.0F;
            }
            f3 = f1;
            if (paramInt == 6)
            {
              f3 = f1;
              if (f4 + f1 < 0.0F) {
                f3 = Math.abs(f1);
              }
              f2 = 1.0F;
            }
            f1 = f3;
            if (mOnTouchUp == 7)
            {
              f1 = f3;
              if (f4 + f3 > 1.0F) {
                f1 = -Math.abs(f3);
              }
              f2 = 0.0F;
            }
            mMotionLayout.touchAnimateTo(mOnTouchUp, f2, f1);
            if ((0.0F < f4) && (1.0F > f4)) {
              return;
            }
            mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
            return;
          }
        }
        if ((0.0F >= f3) || (1.0F <= f3)) {
          mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
        }
      }
    }
    else
    {
      mLastTouchX = paramMotionEvent.getRawX();
      mLastTouchY = paramMotionEvent.getRawY();
      mDragStarted = false;
    }
  }
  
  public void processTouchRotateEvent(MotionEvent paramMotionEvent, MotionLayout.MotionTracker paramMotionTracker, int paramInt, MotionScene paramMotionScene)
  {
    paramMotionTracker.addMovement(paramMotionEvent);
    paramInt = paramMotionEvent.getAction();
    boolean bool = false;
    if (paramInt != 0)
    {
      float f1;
      float f2;
      float f3;
      float f4;
      float f5;
      double d3;
      if (paramInt != 1)
      {
        if (paramInt == 2)
        {
          paramMotionEvent.getRawY();
          paramMotionEvent.getRawX();
          f1 = mMotionLayout.getWidth() / 2.0F;
          f2 = mMotionLayout.getHeight() / 2.0F;
          paramInt = mRotationCenterId;
          if (paramInt != -1)
          {
            paramMotionScene = mMotionLayout.findViewById(paramInt);
            mMotionLayout.getLocationOnScreen(mTempLoc);
            f2 = mTempLoc[0];
            paramInt = paramMotionScene.getLeft();
            f3 = (paramMotionScene.getRight() + paramInt) / 2.0F;
            f4 = mTempLoc[1];
            paramInt = paramMotionScene.getTop();
            f4 = (paramMotionScene.getBottom() + paramInt) / 2.0F + f4;
            f3 = f2 + f3;
          }
          else
          {
            paramInt = mTouchAnchorId;
            f3 = f1;
            f4 = f2;
            if (paramInt != -1)
            {
              paramMotionScene = mMotionLayout.getMotionController(paramInt);
              paramMotionScene = mMotionLayout.findViewById(paramMotionScene.getAnimateRelativeTo());
              if (paramMotionScene == null)
              {
                Log.e("TouchResponse", "could not find view to animate to");
                f3 = f1;
                f4 = f2;
              }
              else
              {
                mMotionLayout.getLocationOnScreen(mTempLoc);
                f4 = mTempLoc[0];
                paramInt = paramMotionScene.getLeft();
                f3 = f4 + (paramMotionScene.getRight() + paramInt) / 2.0F;
                f4 = mTempLoc[1];
                paramInt = paramMotionScene.getTop();
                f4 += (paramMotionScene.getBottom() + paramInt) / 2.0F;
              }
            }
          }
          f5 = paramMotionEvent.getRawX();
          float f6 = paramMotionEvent.getRawY();
          double d1 = Math.atan2(paramMotionEvent.getRawY() - f4, paramMotionEvent.getRawX() - f3);
          f1 = (float)((d1 - Math.atan2(mLastTouchY - f4, mLastTouchX - f3)) * 180.0D / 3.141592653589793D);
          if (f1 > 330.0F)
          {
            f2 = f1 - 360.0F;
          }
          else
          {
            f2 = f1;
            if (f1 < -330.0F) {
              f2 = f1 + 360.0F;
            }
          }
          if ((Math.abs(f2) > 0.01D) || (mDragStarted))
          {
            f1 = mMotionLayout.getProgress();
            if (!mDragStarted)
            {
              mDragStarted = true;
              mMotionLayout.setProgress(f1);
            }
            paramInt = mTouchAnchorId;
            if (paramInt != -1)
            {
              mMotionLayout.getAnchorDpDt(paramInt, f1, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
              paramMotionScene = mAnchorDpDt;
              paramMotionScene[1] = ((float)Math.toDegrees(paramMotionScene[1]));
            }
            else
            {
              mAnchorDpDt[1] = 360.0F;
            }
            f1 = Math.max(Math.min(f2 * mDragScale / mAnchorDpDt[1] + f1, 1.0F), 0.0F);
            f2 = mMotionLayout.getProgress();
            if (f1 != f2)
            {
              paramInt = f2 < 0.0F;
              if ((paramInt == 0) || (f2 == 1.0F))
              {
                paramMotionScene = mMotionLayout;
                if (paramInt == 0) {
                  bool = true;
                }
                paramMotionScene.endTrigger(bool);
              }
              mMotionLayout.setProgress(f1);
              paramMotionTracker.computeCurrentVelocity(1000);
              f2 = paramMotionTracker.getXVelocity();
              double d2 = paramMotionTracker.getYVelocity();
              d3 = f2;
              double d4 = Math.hypot(d2, d3);
              f4 = (float)(Math.sin(Math.atan2(d2, d3) - d1) * d4 / Math.hypot(f5 - f3, f6 - f4));
              mMotionLayout.mLastVelocity = ((float)Math.toDegrees(f4));
            }
            else
            {
              mMotionLayout.mLastVelocity = 0.0F;
            }
            mLastTouchX = paramMotionEvent.getRawX();
            mLastTouchY = paramMotionEvent.getRawY();
          }
        }
      }
      else
      {
        mDragStarted = false;
        paramMotionTracker.computeCurrentVelocity(16);
        f1 = paramMotionTracker.getXVelocity();
        f2 = paramMotionTracker.getYVelocity();
        f5 = mMotionLayout.getProgress();
        f4 = mMotionLayout.getWidth() / 2.0F;
        f3 = mMotionLayout.getHeight() / 2.0F;
        paramInt = mRotationCenterId;
        int i;
        if (paramInt != -1)
        {
          paramMotionTracker = mMotionLayout.findViewById(paramInt);
          mMotionLayout.getLocationOnScreen(mTempLoc);
          f4 = mTempLoc[0];
          paramInt = paramMotionTracker.getLeft();
          f4 += (paramMotionTracker.getRight() + paramInt) / 2.0F;
          f3 = mTempLoc[1];
          i = paramMotionTracker.getTop();
        }
        for (paramInt = paramMotionTracker.getBottom();; paramInt = paramMotionTracker.getBottom())
        {
          f3 += (paramInt + i) / 2.0F;
          break;
          paramInt = mTouchAnchorId;
          if (paramInt == -1) {
            break;
          }
          paramMotionTracker = mMotionLayout.getMotionController(paramInt);
          paramMotionTracker = mMotionLayout.findViewById(paramMotionTracker.getAnimateRelativeTo());
          mMotionLayout.getLocationOnScreen(mTempLoc);
          f4 = mTempLoc[0];
          paramInt = paramMotionTracker.getLeft();
          f4 += (paramMotionTracker.getRight() + paramInt) / 2.0F;
          f3 = mTempLoc[1];
          i = paramMotionTracker.getTop();
        }
        f4 = paramMotionEvent.getRawX() - f4;
        f3 = paramMotionEvent.getRawY() - f3;
        d3 = Math.toDegrees(Math.atan2(f3, f4));
        paramInt = mTouchAnchorId;
        if (paramInt != -1)
        {
          mMotionLayout.getAnchorDpDt(paramInt, f5, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
          paramMotionEvent = mAnchorDpDt;
          paramMotionEvent[1] = ((float)Math.toDegrees(paramMotionEvent[1]));
        }
        else
        {
          mAnchorDpDt[1] = 360.0F;
        }
        f3 = (float)(Math.toDegrees(Math.atan2(f2 + f3, f1 + f4)) - d3) * 62.5F;
        if (!Float.isNaN(f3)) {
          f4 = f3 * 3.0F * mDragScale / mAnchorDpDt[1] + f5;
        } else {
          f4 = f5;
        }
        if ((f4 != 0.0F) && (f4 != 1.0F))
        {
          paramInt = mOnTouchUp;
          if (paramInt != 3)
          {
            f2 = f3 * mDragScale / mAnchorDpDt[1];
            if (f4 < 0.5D) {
              f3 = 0.0F;
            } else {
              f3 = 1.0F;
            }
            f4 = f2;
            if (paramInt == 6)
            {
              f4 = f2;
              if (f5 + f2 < 0.0F) {
                f4 = Math.abs(f2);
              }
              f3 = 1.0F;
            }
            f1 = f4;
            f2 = f3;
            if (mOnTouchUp == 7)
            {
              f3 = f4;
              if (f5 + f4 > 1.0F) {
                f3 = -Math.abs(f4);
              }
              f2 = 0.0F;
              f1 = f3;
            }
            mMotionLayout.touchAnimateTo(mOnTouchUp, f2, f1 * 3.0F);
            if ((0.0F < f5) && (1.0F > f5)) {
              return;
            }
            mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
            return;
          }
        }
        if ((0.0F >= f4) || (1.0F <= f4)) {
          mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
        }
      }
    }
    else
    {
      mLastTouchX = paramMotionEvent.getRawX();
      mLastTouchY = paramMotionEvent.getRawY();
      mDragStarted = false;
    }
  }
  
  public void scrollMove(float paramFloat1, float paramFloat2)
  {
    float f1 = mMotionLayout.getProgress();
    if (!mDragStarted)
    {
      mDragStarted = true;
      mMotionLayout.setProgress(f1);
    }
    mMotionLayout.getAnchorDpDt(mTouchAnchorId, f1, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
    float f2 = mTouchDirectionX;
    float[] arrayOfFloat = mAnchorDpDt;
    float f3 = arrayOfFloat[0];
    if (Math.abs(mTouchDirectionY * arrayOfFloat[1] + f2 * f3) < 0.01D)
    {
      arrayOfFloat = mAnchorDpDt;
      arrayOfFloat[0] = 0.01F;
      arrayOfFloat[1] = 0.01F;
    }
    f3 = mTouchDirectionX;
    if (f3 != 0.0F) {
      paramFloat1 = paramFloat1 * f3 / mAnchorDpDt[0];
    } else {
      paramFloat1 = paramFloat2 * mTouchDirectionY / mAnchorDpDt[1];
    }
    paramFloat1 = Math.max(Math.min(f1 + paramFloat1, 1.0F), 0.0F);
    if (paramFloat1 != mMotionLayout.getProgress()) {
      mMotionLayout.setProgress(paramFloat1);
    }
  }
  
  public void scrollUp(float paramFloat1, float paramFloat2)
  {
    int i = 0;
    mDragStarted = false;
    float f1 = mMotionLayout.getProgress();
    mMotionLayout.getAnchorDpDt(mTouchAnchorId, f1, mTouchAnchorX, mTouchAnchorY, mAnchorDpDt);
    float f2 = mTouchDirectionX;
    Object localObject = mAnchorDpDt;
    float f3 = localObject[0];
    float f4 = mTouchDirectionY;
    float f5 = localObject[1];
    float f6 = 0.0F;
    if (f2 != 0.0F) {
      paramFloat1 = paramFloat1 * f2 / f3;
    } else {
      paramFloat1 = paramFloat2 * f4 / f5;
    }
    paramFloat2 = f1;
    if (!Float.isNaN(paramFloat1)) {
      paramFloat2 = f1 + paramFloat1 / 3.0F;
    }
    if (paramFloat2 != 0.0F)
    {
      int j;
      if (paramFloat2 != 1.0F) {
        j = 1;
      } else {
        j = 0;
      }
      int k = mOnTouchUp;
      if (k != 3) {
        i = 1;
      }
      if ((i & j) != 0)
      {
        localObject = mMotionLayout;
        if (paramFloat2 < 0.5D) {
          paramFloat2 = f6;
        } else {
          paramFloat2 = 1.0F;
        }
        ((MotionLayout)localObject).touchAnimateTo(k, paramFloat2, paramFloat1);
      }
    }
  }
  
  public void setAnchorId(int paramInt)
  {
    mTouchAnchorId = paramInt;
  }
  
  public void setAutoCompleteMode(int paramInt)
  {
    mAutoCompleteMode = paramInt;
  }
  
  public void setDown(float paramFloat1, float paramFloat2)
  {
    mLastTouchX = paramFloat1;
    mLastTouchY = paramFloat2;
  }
  
  public void setMaxAcceleration(float paramFloat)
  {
    mMaxAcceleration = paramFloat;
  }
  
  public void setMaxVelocity(float paramFloat)
  {
    mMaxVelocity = paramFloat;
  }
  
  public void setRTL(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject = TOUCH_DIRECTION;
      localObject[4] = localObject[3];
      localObject[5] = localObject[2];
      localObject = TOUCH_SIDES;
      localObject[5] = localObject[2];
      localObject[6] = localObject[1];
    }
    else
    {
      localObject = TOUCH_DIRECTION;
      localObject[4] = localObject[2];
      localObject[5] = localObject[3];
      localObject = TOUCH_SIDES;
      localObject[5] = localObject[1];
      localObject[6] = localObject[2];
    }
    Object localObject = TOUCH_SIDES[mTouchAnchorSide];
    mTouchAnchorX = localObject[0];
    mTouchAnchorY = localObject[1];
    int i = mTouchSide;
    localObject = TOUCH_DIRECTION;
    if (i >= localObject.length) {
      return;
    }
    localObject = localObject[i];
    mTouchDirectionX = localObject[0];
    mTouchDirectionY = localObject[1];
  }
  
  public void setTouchAnchorLocation(float paramFloat1, float paramFloat2)
  {
    mTouchAnchorX = paramFloat1;
    mTouchAnchorY = paramFloat2;
  }
  
  public void setTouchUpMode(int paramInt)
  {
    mOnTouchUp = paramInt;
  }
  
  public void setUpTouchEvent(float paramFloat1, float paramFloat2)
  {
    mLastTouchX = paramFloat1;
    mLastTouchY = paramFloat2;
    mDragStarted = false;
  }
  
  public void setupTouch()
  {
    int i = mTouchAnchorId;
    Object localObject;
    if (i != -1)
    {
      View localView = mMotionLayout.findViewById(i);
      localObject = localView;
      if (localView == null)
      {
        localObject = z2.t("cannot find TouchAnchorId @id/");
        ((StringBuilder)localObject).append(Debug.getName(mMotionLayout.getContext(), mTouchAnchorId));
        Log.e("TouchResponse", ((StringBuilder)localObject).toString());
        localObject = localView;
      }
    }
    else
    {
      localObject = null;
    }
    if ((localObject instanceof NestedScrollView))
    {
      localObject = (NestedScrollView)localObject;
      ((View)localObject).setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          return false;
        }
      });
      ((NestedScrollView)localObject).setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener()
      {
        public void onScrollChange(NestedScrollView paramAnonymousNestedScrollView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4) {}
      });
    }
  }
  
  public String toString()
  {
    Object localObject;
    if (Float.isNaN(mTouchDirectionX))
    {
      localObject = "rotation";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(mTouchDirectionX);
      ((StringBuilder)localObject).append(" , ");
      ((StringBuilder)localObject).append(mTouchDirectionY);
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.TouchResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */