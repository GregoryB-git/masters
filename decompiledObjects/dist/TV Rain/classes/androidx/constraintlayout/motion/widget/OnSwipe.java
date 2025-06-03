package androidx.constraintlayout.motion.widget;

public class OnSwipe
{
  public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
  public static final int COMPLETE_MODE_SPRING = 1;
  public static final int DRAG_ANTICLOCKWISE = 7;
  public static final int DRAG_CLOCKWISE = 6;
  public static final int DRAG_DOWN = 1;
  public static final int DRAG_END = 5;
  public static final int DRAG_LEFT = 2;
  public static final int DRAG_RIGHT = 3;
  public static final int DRAG_START = 4;
  public static final int DRAG_UP = 0;
  public static final int FLAG_DISABLE_POST_SCROLL = 1;
  public static final int FLAG_DISABLE_SCROLL = 2;
  public static final int ON_UP_AUTOCOMPLETE = 0;
  public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
  public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
  public static final int ON_UP_DECELERATE = 4;
  public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
  public static final int ON_UP_NEVER_TO_END = 7;
  public static final int ON_UP_NEVER_TO_START = 6;
  public static final int ON_UP_STOP = 3;
  public static final int SIDE_BOTTOM = 3;
  public static final int SIDE_END = 6;
  public static final int SIDE_LEFT = 1;
  public static final int SIDE_MIDDLE = 4;
  public static final int SIDE_RIGHT = 2;
  public static final int SIDE_START = 5;
  public static final int SIDE_TOP = 0;
  public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
  public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
  public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
  public static final int SPRING_BOUNDARY_OVERSHOOT = 0;
  private int mAutoCompleteMode = 0;
  private int mDragDirection = 0;
  private float mDragScale = 1.0F;
  private float mDragThreshold = 10.0F;
  private int mFlags = 0;
  private int mLimitBoundsTo = -1;
  private float mMaxAcceleration = 1.2F;
  private float mMaxVelocity = 4.0F;
  private boolean mMoveWhenScrollAtTop = true;
  private int mOnTouchUp = 0;
  private int mRotationCenterId = -1;
  private int mSpringBoundary = 0;
  private float mSpringDamping = NaN.0F;
  private float mSpringMass = 1.0F;
  private float mSpringStiffness = NaN.0F;
  private float mSpringStopThreshold = NaN.0F;
  private int mTouchAnchorId = -1;
  private int mTouchAnchorSide = 0;
  private int mTouchRegionId = -1;
  
  public int getAutoCompleteMode()
  {
    return mAutoCompleteMode;
  }
  
  public int getDragDirection()
  {
    return mDragDirection;
  }
  
  public float getDragScale()
  {
    return mDragScale;
  }
  
  public float getDragThreshold()
  {
    return mDragThreshold;
  }
  
  public int getLimitBoundsTo()
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
  
  public int getNestedScrollFlags()
  {
    return mFlags;
  }
  
  public int getOnTouchUp()
  {
    return mOnTouchUp;
  }
  
  public int getRotationCenterId()
  {
    return mRotationCenterId;
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
  
  public int getTouchAnchorId()
  {
    return mTouchAnchorId;
  }
  
  public int getTouchAnchorSide()
  {
    return mTouchAnchorSide;
  }
  
  public int getTouchRegionId()
  {
    return mTouchRegionId;
  }
  
  public void setAutoCompleteMode(int paramInt)
  {
    mAutoCompleteMode = paramInt;
  }
  
  public OnSwipe setDragDirection(int paramInt)
  {
    mDragDirection = paramInt;
    return this;
  }
  
  public OnSwipe setDragScale(int paramInt)
  {
    mDragScale = paramInt;
    return this;
  }
  
  public OnSwipe setDragThreshold(int paramInt)
  {
    mDragThreshold = paramInt;
    return this;
  }
  
  public OnSwipe setLimitBoundsTo(int paramInt)
  {
    mLimitBoundsTo = paramInt;
    return this;
  }
  
  public OnSwipe setMaxAcceleration(int paramInt)
  {
    mMaxAcceleration = paramInt;
    return this;
  }
  
  public OnSwipe setMaxVelocity(int paramInt)
  {
    mMaxVelocity = paramInt;
    return this;
  }
  
  public OnSwipe setMoveWhenScrollAtTop(boolean paramBoolean)
  {
    mMoveWhenScrollAtTop = paramBoolean;
    return this;
  }
  
  public OnSwipe setNestedScrollFlags(int paramInt)
  {
    mFlags = paramInt;
    return this;
  }
  
  public OnSwipe setOnTouchUp(int paramInt)
  {
    mOnTouchUp = paramInt;
    return this;
  }
  
  public OnSwipe setRotateCenter(int paramInt)
  {
    mRotationCenterId = paramInt;
    return this;
  }
  
  public OnSwipe setSpringBoundary(int paramInt)
  {
    mSpringBoundary = paramInt;
    return this;
  }
  
  public OnSwipe setSpringDamping(float paramFloat)
  {
    mSpringDamping = paramFloat;
    return this;
  }
  
  public OnSwipe setSpringMass(float paramFloat)
  {
    mSpringMass = paramFloat;
    return this;
  }
  
  public OnSwipe setSpringStiffness(float paramFloat)
  {
    mSpringStiffness = paramFloat;
    return this;
  }
  
  public OnSwipe setSpringStopThreshold(float paramFloat)
  {
    mSpringStopThreshold = paramFloat;
    return this;
  }
  
  public OnSwipe setTouchAnchorId(int paramInt)
  {
    mTouchAnchorId = paramInt;
    return this;
  }
  
  public OnSwipe setTouchAnchorSide(int paramInt)
  {
    mTouchAnchorSide = paramInt;
    return this;
  }
  
  public OnSwipe setTouchRegionId(int paramInt)
  {
    mTouchRegionId = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.OnSwipe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */