package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;
import z2;

class KeyCycle$Loader
{
  private static final int ANDROID_ALPHA = 9;
  private static final int ANDROID_ELEVATION = 10;
  private static final int ANDROID_ROTATION = 11;
  private static final int ANDROID_ROTATION_X = 12;
  private static final int ANDROID_ROTATION_Y = 13;
  private static final int ANDROID_SCALE_X = 15;
  private static final int ANDROID_SCALE_Y = 16;
  private static final int ANDROID_TRANSLATION_X = 17;
  private static final int ANDROID_TRANSLATION_Y = 18;
  private static final int ANDROID_TRANSLATION_Z = 19;
  private static final int CURVE_FIT = 4;
  private static final int FRAME_POSITION = 2;
  private static final int PROGRESS = 20;
  private static final int TARGET_ID = 1;
  private static final int TRANSITION_EASING = 3;
  private static final int TRANSITION_PATH_ROTATE = 14;
  private static final int WAVE_OFFSET = 7;
  private static final int WAVE_PERIOD = 6;
  private static final int WAVE_PHASE = 21;
  private static final int WAVE_SHAPE = 5;
  private static final int WAVE_VARIES_BY = 8;
  private static SparseIntArray mAttrMap;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mAttrMap = localSparseIntArray;
    localSparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
    mAttrMap.append(R.styleable.KeyCycle_framePosition, 2);
    mAttrMap.append(R.styleable.KeyCycle_transitionEasing, 3);
    mAttrMap.append(R.styleable.KeyCycle_curveFit, 4);
    mAttrMap.append(R.styleable.KeyCycle_waveShape, 5);
    mAttrMap.append(R.styleable.KeyCycle_wavePeriod, 6);
    mAttrMap.append(R.styleable.KeyCycle_waveOffset, 7);
    mAttrMap.append(R.styleable.KeyCycle_waveVariesBy, 8);
    mAttrMap.append(R.styleable.KeyCycle_android_alpha, 9);
    mAttrMap.append(R.styleable.KeyCycle_android_elevation, 10);
    mAttrMap.append(R.styleable.KeyCycle_android_rotation, 11);
    mAttrMap.append(R.styleable.KeyCycle_android_rotationX, 12);
    mAttrMap.append(R.styleable.KeyCycle_android_rotationY, 13);
    mAttrMap.append(R.styleable.KeyCycle_transitionPathRotate, 14);
    mAttrMap.append(R.styleable.KeyCycle_android_scaleX, 15);
    mAttrMap.append(R.styleable.KeyCycle_android_scaleY, 16);
    mAttrMap.append(R.styleable.KeyCycle_android_translationX, 17);
    mAttrMap.append(R.styleable.KeyCycle_android_translationY, 18);
    mAttrMap.append(R.styleable.KeyCycle_android_translationZ, 19);
    mAttrMap.append(R.styleable.KeyCycle_motionProgress, 20);
    mAttrMap.append(R.styleable.KeyCycle_wavePhase, 21);
  }
  
  private static void read(KeyCycle paramKeyCycle, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      switch (mAttrMap.get(k))
      {
      default: 
        StringBuilder localStringBuilder = z2.t("unused attribute 0x");
        localStringBuilder.append(Integer.toHexString(k));
        localStringBuilder.append("   ");
        localStringBuilder.append(mAttrMap.get(k));
        Log.e("KeyCycle", localStringBuilder.toString());
        break;
      case 21: 
        KeyCycle.access$2002(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$2000(paramKeyCycle)) / 360.0F);
        break;
      case 20: 
        KeyCycle.access$1902(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1900(paramKeyCycle)));
        break;
      case 19: 
        KeyCycle.access$1802(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1800(paramKeyCycle)));
        break;
      case 18: 
        KeyCycle.access$1702(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1700(paramKeyCycle)));
        break;
      case 17: 
        KeyCycle.access$1602(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$1600(paramKeyCycle)));
        break;
      case 16: 
        KeyCycle.access$1502(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1500(paramKeyCycle)));
        break;
      case 15: 
        KeyCycle.access$1402(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1400(paramKeyCycle)));
        break;
      case 14: 
        KeyCycle.access$1302(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1300(paramKeyCycle)));
        break;
      case 13: 
        KeyCycle.access$1202(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1200(paramKeyCycle)));
        break;
      case 12: 
        KeyCycle.access$1102(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1100(paramKeyCycle)));
        break;
      case 11: 
        KeyCycle.access$1002(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$1000(paramKeyCycle)));
        break;
      case 10: 
        KeyCycle.access$902(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$900(paramKeyCycle)));
        break;
      case 9: 
        KeyCycle.access$802(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$800(paramKeyCycle)));
        break;
      case 8: 
        KeyCycle.access$702(paramKeyCycle, paramTypedArray.getInt(k, KeyCycle.access$700(paramKeyCycle)));
        break;
      case 7: 
        if (peekValuetype == 5) {
          KeyCycle.access$602(paramKeyCycle, paramTypedArray.getDimension(k, KeyCycle.access$600(paramKeyCycle)));
        } else {
          KeyCycle.access$602(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$600(paramKeyCycle)));
        }
        break;
      case 6: 
        KeyCycle.access$502(paramKeyCycle, paramTypedArray.getFloat(k, KeyCycle.access$500(paramKeyCycle)));
        break;
      case 5: 
        if (peekValuetype == 3)
        {
          KeyCycle.access$302(paramKeyCycle, paramTypedArray.getString(k));
          KeyCycle.access$402(paramKeyCycle, 7);
        }
        else
        {
          KeyCycle.access$402(paramKeyCycle, paramTypedArray.getInt(k, KeyCycle.access$400(paramKeyCycle)));
        }
        break;
      case 4: 
        KeyCycle.access$202(paramKeyCycle, paramTypedArray.getInteger(k, KeyCycle.access$200(paramKeyCycle)));
        break;
      case 3: 
        KeyCycle.access$102(paramKeyCycle, paramTypedArray.getString(k));
        break;
      case 2: 
        mFramePosition = paramTypedArray.getInt(k, mFramePosition);
        break;
      case 1: 
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
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyCycle.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */