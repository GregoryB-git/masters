package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;
import z2;

class KeyTrigger$Loader
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTrigger.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */