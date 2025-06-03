package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import z2;

public class KeyTrigger
  extends Key
{
  public static final String CROSS = "CROSS";
  public static final int KEY_TYPE = 5;
  public static final String NAME = "KeyTrigger";
  public static final String NEGATIVE_CROSS = "negativeCross";
  public static final String POSITIVE_CROSS = "positiveCross";
  public static final String POST_LAYOUT = "postLayout";
  private static final String TAG = "KeyTrigger";
  public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
  public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
  public static final String TRIGGER_ID = "triggerID";
  public static final String TRIGGER_RECEIVER = "triggerReceiver";
  public static final String TRIGGER_SLACK = "triggerSlack";
  public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
  public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
  public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
  public RectF mCollisionRect;
  private String mCross = null;
  private int mCurveFit = -1;
  private boolean mFireCrossReset;
  private float mFireLastPos;
  private boolean mFireNegativeReset;
  private boolean mFirePositiveReset;
  private float mFireThreshold;
  public HashMap<String, Method> mMethodHashMap;
  private String mNegativeCross;
  private String mPositiveCross;
  private boolean mPostLayout;
  public RectF mTargetRect;
  private int mTriggerCollisionId;
  private View mTriggerCollisionView;
  private int mTriggerID;
  private int mTriggerReceiver;
  public float mTriggerSlack;
  public int mViewTransitionOnCross;
  public int mViewTransitionOnNegativeCross;
  public int mViewTransitionOnPositiveCross;
  
  public KeyTrigger()
  {
    int i = Key.UNSET;
    mTriggerReceiver = i;
    mNegativeCross = null;
    mPositiveCross = null;
    mTriggerID = i;
    mTriggerCollisionId = i;
    mTriggerCollisionView = null;
    mTriggerSlack = 0.1F;
    mFireCrossReset = true;
    mFireNegativeReset = true;
    mFirePositiveReset = true;
    mFireThreshold = NaN.0F;
    mPostLayout = false;
    mViewTransitionOnNegativeCross = i;
    mViewTransitionOnPositiveCross = i;
    mViewTransitionOnCross = i;
    mCollisionRect = new RectF();
    mTargetRect = new RectF();
    mMethodHashMap = new HashMap();
    mType = 5;
    mCustomConstraints = new HashMap();
  }
  
  private void fire(String paramString, View paramView)
  {
    if (paramString == null) {
      return;
    }
    if (paramString.startsWith("."))
    {
      fireCustom(paramString, paramView);
      return;
    }
    Object localObject2;
    if (mMethodHashMap.containsKey(paramString))
    {
      localObject1 = (Method)mMethodHashMap.get(paramString);
      localObject2 = localObject1;
      if (localObject1 != null) {}
    }
    else
    {
      localObject2 = null;
    }
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      try
      {
        localObject1 = paramView.getClass().getMethod(paramString, new Class[0]);
        mMethodHashMap.put(paramString, localObject1);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        mMethodHashMap.put(paramString, null);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Could not find method \"");
        localStringBuilder.append(paramString);
        localStringBuilder.append("\"on class ");
        localStringBuilder.append(paramView.getClass().getSimpleName());
        localStringBuilder.append(" ");
        localStringBuilder.append(Debug.getName(paramView));
        Log.e("KeyTrigger", localStringBuilder.toString());
        return;
      }
    }
    try
    {
      ((Method)localObject1).invoke(paramView, new Object[0]);
    }
    catch (Exception paramString)
    {
      paramString = z2.t("Exception in call \"");
      paramString.append(mCross);
      paramString.append("\"on class ");
      paramString.append(paramView.getClass().getSimpleName());
      paramString.append(" ");
      paramString.append(Debug.getName(paramView));
      Log.e("KeyTrigger", paramString.toString());
    }
  }
  
  private void fireCustom(String paramString, View paramView)
  {
    int i;
    if (paramString.length() == 1) {
      i = 1;
    } else {
      i = 0;
    }
    String str1 = paramString;
    if (i == 0) {
      str1 = paramString.substring(1).toLowerCase(Locale.ROOT);
    }
    paramString = mCustomConstraints.keySet().iterator();
    while (paramString.hasNext())
    {
      Object localObject = (String)paramString.next();
      String str2 = ((String)localObject).toLowerCase(Locale.ROOT);
      if ((i != 0) || (str2.matches(str1)))
      {
        localObject = (ConstraintAttribute)mCustomConstraints.get(localObject);
        if (localObject != null) {
          ((ConstraintAttribute)localObject).applyCustom(paramView);
        }
      }
    }
  }
  
  private void setUpRect(RectF paramRectF, View paramView, boolean paramBoolean)
  {
    top = paramView.getTop();
    bottom = paramView.getBottom();
    left = paramView.getLeft();
    right = paramView.getRight();
    if (paramBoolean) {
      paramView.getMatrix().mapRect(paramRectF);
    }
  }
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap) {}
  
  public Key clone()
  {
    return new KeyTrigger().copy(this);
  }
  
  public void conditionallyFire(float paramFloat, View paramView)
  {
    int i;
    int j;
    if (mTriggerCollisionId != Key.UNSET)
    {
      if (mTriggerCollisionView == null) {
        mTriggerCollisionView = ((ViewGroup)paramView.getParent()).findViewById(mTriggerCollisionId);
      }
      setUpRect(mCollisionRect, mTriggerCollisionView, mPostLayout);
      setUpRect(mTargetRect, paramView, mPostLayout);
      if (mCollisionRect.intersect(mTargetRect))
      {
        if (mFireCrossReset)
        {
          mFireCrossReset = false;
          i = 1;
        }
        else
        {
          i = 0;
        }
        if (mFirePositiveReset)
        {
          mFirePositiveReset = false;
          bool = true;
        }
        else
        {
          bool = false;
        }
        mFireNegativeReset = true;
        j = 0;
        break label401;
      }
      if (!mFireCrossReset)
      {
        mFireCrossReset = true;
        i = 1;
      }
      else
      {
        i = 0;
      }
      if (mFireNegativeReset)
      {
        mFireNegativeReset = false;
        j = 1;
      }
      else
      {
        j = 0;
      }
      mFirePositiveReset = true;
    }
    else
    {
      float f1;
      if (mFireCrossReset)
      {
        f1 = mFireThreshold;
        if ((mFireLastPos - f1) * (paramFloat - f1) < 0.0F)
        {
          mFireCrossReset = false;
          i = 1;
          break label241;
        }
      }
      else if (Math.abs(paramFloat - mFireThreshold) > mTriggerSlack)
      {
        mFireCrossReset = true;
      }
      i = 0;
      label241:
      float f2;
      if (mFireNegativeReset)
      {
        f1 = mFireThreshold;
        f2 = paramFloat - f1;
        if (((mFireLastPos - f1) * f2 < 0.0F) && (f2 < 0.0F))
        {
          mFireNegativeReset = false;
          j = 1;
          break label318;
        }
      }
      else if (Math.abs(paramFloat - mFireThreshold) > mTriggerSlack)
      {
        mFireNegativeReset = true;
      }
      j = 0;
      label318:
      if (mFirePositiveReset)
      {
        f1 = mFireThreshold;
        f2 = paramFloat - f1;
        if (((mFireLastPos - f1) * f2 < 0.0F) && (f2 > 0.0F))
        {
          mFirePositiveReset = false;
          bool = true;
        }
        else
        {
          bool = false;
        }
        break label401;
      }
      if (Math.abs(paramFloat - mFireThreshold) > mTriggerSlack) {
        mFirePositiveReset = true;
      }
    }
    boolean bool = false;
    label401:
    mFireLastPos = paramFloat;
    if ((j != 0) || (i != 0) || (bool)) {
      ((MotionLayout)paramView.getParent()).fireTrigger(mTriggerID, bool, paramFloat);
    }
    View localView;
    if (mTriggerReceiver == Key.UNSET) {
      localView = paramView;
    } else {
      localView = ((MotionLayout)paramView.getParent()).findViewById(mTriggerReceiver);
    }
    String str;
    if (j != 0)
    {
      str = mNegativeCross;
      if (str != null) {
        fire(str, localView);
      }
      if (mViewTransitionOnNegativeCross != Key.UNSET) {
        ((MotionLayout)paramView.getParent()).viewTransition(mViewTransitionOnNegativeCross, new View[] { localView });
      }
    }
    if (bool)
    {
      str = mPositiveCross;
      if (str != null) {
        fire(str, localView);
      }
      if (mViewTransitionOnPositiveCross != Key.UNSET) {
        ((MotionLayout)paramView.getParent()).viewTransition(mViewTransitionOnPositiveCross, new View[] { localView });
      }
    }
    if (i != 0)
    {
      str = mCross;
      if (str != null) {
        fire(str, localView);
      }
      if (mViewTransitionOnCross != Key.UNSET) {
        ((MotionLayout)paramView.getParent()).viewTransition(mViewTransitionOnCross, new View[] { localView });
      }
    }
  }
  
  public Key copy(Key paramKey)
  {
    super.copy(paramKey);
    paramKey = (KeyTrigger)paramKey;
    mCurveFit = mCurveFit;
    mCross = mCross;
    mTriggerReceiver = mTriggerReceiver;
    mNegativeCross = mNegativeCross;
    mPositiveCross = mPositiveCross;
    mTriggerID = mTriggerID;
    mTriggerCollisionId = mTriggerCollisionId;
    mTriggerCollisionView = mTriggerCollisionView;
    mTriggerSlack = mTriggerSlack;
    mFireCrossReset = mFireCrossReset;
    mFireNegativeReset = mFireNegativeReset;
    mFirePositiveReset = mFirePositiveReset;
    mFireThreshold = mFireThreshold;
    mFireLastPos = mFireLastPos;
    mPostLayout = mPostLayout;
    mCollisionRect = mCollisionRect;
    mTargetRect = mTargetRect;
    mMethodHashMap = mMethodHashMap;
    return this;
  }
  
  public void getAttributeNames(HashSet<String> paramHashSet) {}
  
  public int getCurveFit()
  {
    return mCurveFit;
  }
  
  public void load(Context paramContext, AttributeSet paramAttributeSet)
  {
    Loader.read(this, paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.KeyTrigger), paramContext);
  }
  
  public void setValue(String paramString, Object paramObject)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1535404999: 
      if (paramString.equals("triggerReceiver")) {
        j = 11;
      }
      break;
    case 1401391082: 
      if (paramString.equals("postLayout")) {
        j = 10;
      }
      break;
    case 1301930599: 
      if (paramString.equals("viewTransitionOnCross")) {
        j = 9;
      }
      break;
    case 364489912: 
      if (paramString.equals("triggerSlack")) {
        j = 8;
      }
      break;
    case 64397344: 
      if (paramString.equals("CROSS")) {
        j = 7;
      }
      break;
    case -9754574: 
      if (paramString.equals("viewTransitionOnNegativeCross")) {
        j = 6;
      }
      break;
    case -76025313: 
      if (paramString.equals("triggerCollisionView")) {
        j = 5;
      }
      break;
    case -638126837: 
      if (paramString.equals("negativeCross")) {
        j = 4;
      }
      break;
    case -648752941: 
      if (paramString.equals("triggerID")) {
        j = 3;
      }
      break;
    case -786670827: 
      if (paramString.equals("triggerCollisionId")) {
        j = 2;
      }
      break;
    case -966421266: 
      if (paramString.equals("viewTransitionOnPositiveCross")) {
        j = 1;
      }
      break;
    case -1594793529: 
      if (paramString.equals("positiveCross")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 11: 
      mTriggerReceiver = toInt(paramObject);
      break;
    case 10: 
      mPostLayout = toBoolean(paramObject);
      break;
    case 9: 
      mViewTransitionOnCross = toInt(paramObject);
      break;
    case 8: 
      mTriggerSlack = toFloat(paramObject);
      break;
    case 7: 
      mCross = paramObject.toString();
      break;
    case 6: 
      mViewTransitionOnNegativeCross = toInt(paramObject);
      break;
    case 5: 
      mTriggerCollisionView = ((View)paramObject);
      break;
    case 4: 
      mNegativeCross = paramObject.toString();
      break;
    case 3: 
      mTriggerID = toInt(paramObject);
      break;
    case 2: 
      mTriggerCollisionId = toInt(paramObject);
      break;
    case 1: 
      mViewTransitionOnPositiveCross = toInt(paramObject);
      break;
    case 0: 
      mPositiveCross = paramObject.toString();
    }
  }
  
  public static class Loader
  {
    private static final int COLLISION = 9;
    private static final int CROSS = 4;
    private static final int FRAME_POS = 8;
    private static final int NEGATIVE_CROSS = 1;
    private static final int POSITIVE_CROSS = 2;
    private static final int POST_LAYOUT = 10;
    private static final int TARGET_ID = 7;
    private static final int TRIGGER_ID = 6;
    private static final int TRIGGER_RECEIVER = 11;
    private static final int TRIGGER_SLACK = 5;
    private static final int VT_CROSS = 12;
    private static final int VT_NEGATIVE_CROSS = 13;
    private static final int VT_POSITIVE_CROSS = 14;
    private static SparseIntArray mAttrMap;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mAttrMap = localSparseIntArray;
      localSparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
      mAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
      mAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
      mAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
      mAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
      mAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
      mAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
      mAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
      mAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
      mAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
      mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
      mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
      mAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
    }
    
    public static void read(KeyTrigger paramKeyTrigger, TypedArray paramTypedArray, Context paramContext)
    {
      int i = paramTypedArray.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramTypedArray.getIndex(j);
        switch (mAttrMap.get(k))
        {
        case 3: 
        default: 
          paramContext = z2.t("unused attribute 0x");
          paramContext.append(Integer.toHexString(k));
          paramContext.append("   ");
          paramContext.append(mAttrMap.get(k));
          Log.e("KeyTrigger", paramContext.toString());
          break;
        case 14: 
          mViewTransitionOnPositiveCross = paramTypedArray.getResourceId(k, mViewTransitionOnPositiveCross);
          break;
        case 13: 
          mViewTransitionOnNegativeCross = paramTypedArray.getResourceId(k, mViewTransitionOnNegativeCross);
          break;
        case 12: 
          mViewTransitionOnCross = paramTypedArray.getResourceId(k, mViewTransitionOnCross);
          break;
        case 11: 
          KeyTrigger.access$702(paramKeyTrigger, paramTypedArray.getResourceId(k, KeyTrigger.access$700(paramKeyTrigger)));
          break;
        case 10: 
          KeyTrigger.access$602(paramKeyTrigger, paramTypedArray.getBoolean(k, KeyTrigger.access$600(paramKeyTrigger)));
          break;
        case 9: 
          KeyTrigger.access$502(paramKeyTrigger, paramTypedArray.getResourceId(k, KeyTrigger.access$500(paramKeyTrigger)));
          break;
        case 8: 
          k = paramTypedArray.getInteger(k, mFramePosition);
          mFramePosition = k;
          KeyTrigger.access$002(paramKeyTrigger, (k + 0.5F) / 100.0F);
          break;
        case 7: 
          if (MotionLayout.IS_IN_EDIT_MODE)
          {
            int m = paramTypedArray.getResourceId(k, mTargetId);
            mTargetId = m;
            if (m == -1) {
              mTargetString = paramTypedArray.getString(k);
            }
          }
          else if (peekValuetype == 3)
          {
            mTargetString = paramTypedArray.getString(k);
          }
          else
          {
            mTargetId = paramTypedArray.getResourceId(k, mTargetId);
          }
          break;
        case 6: 
          KeyTrigger.access$402(paramKeyTrigger, paramTypedArray.getResourceId(k, KeyTrigger.access$400(paramKeyTrigger)));
          break;
        case 5: 
          mTriggerSlack = paramTypedArray.getFloat(k, mTriggerSlack);
          break;
        case 4: 
          KeyTrigger.access$302(paramKeyTrigger, paramTypedArray.getString(k));
          break;
        case 2: 
          KeyTrigger.access$202(paramKeyTrigger, paramTypedArray.getString(k));
          break;
        case 1: 
          KeyTrigger.access$102(paramKeyTrigger, paramTypedArray.getString(k));
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTrigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */