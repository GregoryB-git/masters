package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class MotionKeyTrigger
  extends MotionKey
{
  public static final String CROSS = "CROSS";
  public static final int KEY_TYPE = 5;
  public static final String NEGATIVE_CROSS = "negativeCross";
  public static final String POSITIVE_CROSS = "positiveCross";
  public static final String POST_LAYOUT = "postLayout";
  private static final String TAG = "KeyTrigger";
  public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
  public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
  public static final String TRIGGER_ID = "triggerID";
  public static final String TRIGGER_RECEIVER = "triggerReceiver";
  public static final String TRIGGER_SLACK = "triggerSlack";
  public static final int TYPE_CROSS = 312;
  public static final int TYPE_NEGATIVE_CROSS = 310;
  public static final int TYPE_POSITIVE_CROSS = 309;
  public static final int TYPE_POST_LAYOUT = 304;
  public static final int TYPE_TRIGGER_COLLISION_ID = 307;
  public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
  public static final int TYPE_TRIGGER_ID = 308;
  public static final int TYPE_TRIGGER_RECEIVER = 311;
  public static final int TYPE_TRIGGER_SLACK = 305;
  public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
  public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
  public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
  public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
  public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
  public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
  public FloatRect mCollisionRect;
  private String mCross = null;
  private int mCurveFit = -1;
  private boolean mFireCrossReset;
  private float mFireLastPos;
  private boolean mFireNegativeReset;
  private boolean mFirePositiveReset;
  private float mFireThreshold;
  private String mNegativeCross;
  private String mPositiveCross;
  private boolean mPostLayout;
  public FloatRect mTargetRect;
  private int mTriggerCollisionId;
  private int mTriggerID;
  private int mTriggerReceiver;
  public float mTriggerSlack;
  public int mViewTransitionOnCross;
  public int mViewTransitionOnNegativeCross;
  public int mViewTransitionOnPositiveCross;
  
  public MotionKeyTrigger()
  {
    int i = MotionKey.UNSET;
    mTriggerReceiver = i;
    mNegativeCross = null;
    mPositiveCross = null;
    mTriggerID = i;
    mTriggerCollisionId = i;
    mTriggerSlack = 0.1F;
    mFireCrossReset = true;
    mFireNegativeReset = true;
    mFirePositiveReset = true;
    mFireThreshold = NaN.0F;
    mPostLayout = false;
    mViewTransitionOnNegativeCross = i;
    mViewTransitionOnPositiveCross = i;
    mViewTransitionOnCross = i;
    mCollisionRect = new FloatRect();
    mTargetRect = new FloatRect();
    mType = 5;
    mCustom = new HashMap();
  }
  
  private void fireCustom(String paramString, MotionWidget paramMotionWidget)
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
    paramString = mCustom.keySet().iterator();
    while (paramString.hasNext())
    {
      String str2 = (String)paramString.next();
      Object localObject = str2.toLowerCase(Locale.ROOT);
      if ((i != 0) || (((String)localObject).matches(str1)))
      {
        localObject = (CustomVariable)mCustom.get(str2);
        if (localObject != null) {
          ((CustomVariable)localObject).applyToWidget(paramMotionWidget);
        }
      }
    }
  }
  
  public void addValues(HashMap<String, SplineSet> paramHashMap) {}
  
  public MotionKey clone()
  {
    return new MotionKeyTrigger().copy(this);
  }
  
  public void conditionallyFire(float paramFloat, MotionWidget paramMotionWidget) {}
  
  public MotionKeyTrigger copy(MotionKey paramMotionKey)
  {
    super.copy(paramMotionKey);
    paramMotionKey = (MotionKeyTrigger)paramMotionKey;
    mCurveFit = mCurveFit;
    mCross = mCross;
    mTriggerReceiver = mTriggerReceiver;
    mNegativeCross = mNegativeCross;
    mPositiveCross = mPositiveCross;
    mTriggerID = mTriggerID;
    mTriggerCollisionId = mTriggerCollisionId;
    mTriggerSlack = mTriggerSlack;
    mFireCrossReset = mFireCrossReset;
    mFireNegativeReset = mFireNegativeReset;
    mFirePositiveReset = mFirePositiveReset;
    mFireThreshold = mFireThreshold;
    mFireLastPos = mFireLastPos;
    mPostLayout = mPostLayout;
    mCollisionRect = mCollisionRect;
    mTargetRect = mTargetRect;
    return this;
  }
  
  public void getAttributeNames(HashSet<String> paramHashSet) {}
  
  public int getId(String paramString)
  {
    paramString.getClass();
    switch (paramString.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          i = -1;
                          break;
                        } while (!paramString.equals("triggerReceiver"));
                        i = 10;
                        break;
                      } while (!paramString.equals("postLayout"));
                      i = 9;
                      break;
                    } while (!paramString.equals("viewTransitionOnCross"));
                    i = 8;
                    break;
                  } while (!paramString.equals("triggerSlack"));
                  i = 7;
                  break;
                } while (!paramString.equals("viewTransitionOnNegativeCross"));
                i = 6;
                break;
              } while (!paramString.equals("triggerCollisionView"));
              i = 5;
              break;
            } while (!paramString.equals("negativeCross"));
            i = 4;
            break;
          } while (!paramString.equals("triggerID"));
          i = 3;
          break;
        } while (!paramString.equals("triggerCollisionId"));
        i = 2;
        break;
      } while (!paramString.equals("viewTransitionOnPositiveCross"));
      i = 1;
      break;
    } while (!paramString.equals("positiveCross"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 10: 
      return 311;
    case 9: 
      return 304;
    case 8: 
      return 301;
    case 7: 
      return 305;
    case 6: 
      return 303;
    case 5: 
      return 306;
    case 4: 
      return 310;
    case 3: 
      return 308;
    case 2: 
      return 307;
    case 1: 
      return 302;
    }
    return 309;
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (paramInt != 305) {
      return super.setValue(paramInt, paramFloat);
    }
    mTriggerSlack = paramFloat;
    return true;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 307)
    {
      if (paramInt1 != 308)
      {
        if (paramInt1 != 311) {
          switch (paramInt1)
          {
          default: 
            return super.setValue(paramInt1, paramInt2);
          case 303: 
            mViewTransitionOnNegativeCross = paramInt2;
            break;
          case 302: 
            mViewTransitionOnPositiveCross = paramInt2;
            break;
          case 301: 
            mViewTransitionOnCross = paramInt2;
            break;
          }
        } else {
          mTriggerReceiver = paramInt2;
        }
      }
      else {
        mTriggerID = toInt(Integer.valueOf(paramInt2));
      }
    }
    else {
      mTriggerCollisionId = paramInt2;
    }
    return true;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt != 309)
    {
      if (paramInt != 310)
      {
        if (paramInt != 312) {
          return super.setValue(paramInt, paramString);
        }
        mCross = paramString;
      }
      else
      {
        mNegativeCross = paramString;
      }
    }
    else {
      mPositiveCross = paramString;
    }
    return true;
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 304) {
      return super.setValue(paramInt, paramBoolean);
    }
    mPostLayout = paramBoolean;
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKeyTrigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */