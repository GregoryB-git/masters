package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.widget.R.styleable;
import z2;

class KeyTimeCycle$Loader
{
  private static final int ANDROID_ALPHA = 1;
  private static final int ANDROID_ELEVATION = 2;
  private static final int ANDROID_ROTATION = 4;
  private static final int ANDROID_ROTATION_X = 5;
  private static final int ANDROID_ROTATION_Y = 6;
  private static final int ANDROID_SCALE_X = 7;
  private static final int ANDROID_SCALE_Y = 14;
  private static final int ANDROID_TRANSLATION_X = 15;
  private static final int ANDROID_TRANSLATION_Y = 16;
  private static final int ANDROID_TRANSLATION_Z = 17;
  private static final int CURVE_FIT = 13;
  private static final int FRAME_POSITION = 12;
  private static final int PROGRESS = 18;
  private static final int TARGET_ID = 10;
  private static final int TRANSITION_EASING = 9;
  private static final int TRANSITION_PATH_ROTATE = 8;
  private static final int WAVE_OFFSET = 21;
  private static final int WAVE_PERIOD = 20;
  private static final int WAVE_SHAPE = 19;
  private static SparseIntArray mAttrMap;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    mAttrMap = localSparseIntArray;
    localSparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_elevation, 2);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_rotation, 4);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
    mAttrMap.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
    mAttrMap.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
    mAttrMap.append(R.styleable.KeyTimeCycle_motionTarget, 10);
    mAttrMap.append(R.styleable.KeyTimeCycle_framePosition, 12);
    mAttrMap.append(R.styleable.KeyTimeCycle_curveFit, 13);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_translationX, 15);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_translationY, 16);
    mAttrMap.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
    mAttrMap.append(R.styleable.KeyTimeCycle_motionProgress, 18);
    mAttrMap.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
    mAttrMap.append(R.styleable.KeyTimeCycle_waveOffset, 21);
    mAttrMap.append(R.styleable.KeyTimeCycle_waveShape, 19);
  }
  
  public static void read(KeyTimeCycle paramKeyTimeCycle, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      switch (mAttrMap.get(k))
      {
      case 3: 
      case 11: 
      default: 
        StringBuilder localStringBuilder = z2.t("unused attribute 0x");
        localStringBuilder.append(Integer.toHexString(k));
        localStringBuilder.append("   ");
        localStringBuilder.append(mAttrMap.get(k));
        Log.e("KeyTimeCycle", localStringBuilder.toString());
        break;
      case 21: 
        if (peekValuetype == 5) {
          KeyTimeCycle.access$702(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$700(paramKeyTimeCycle)));
        } else {
          KeyTimeCycle.access$702(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$700(paramKeyTimeCycle)));
        }
        break;
      case 20: 
        KeyTimeCycle.access$602(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$600(paramKeyTimeCycle)));
        break;
      case 19: 
        if (peekValuetype == 3)
        {
          KeyTimeCycle.access$402(paramKeyTimeCycle, paramTypedArray.getString(k));
          KeyTimeCycle.access$502(paramKeyTimeCycle, 7);
        }
        else
        {
          KeyTimeCycle.access$502(paramKeyTimeCycle, paramTypedArray.getInt(k, KeyTimeCycle.access$500(paramKeyTimeCycle)));
        }
        break;
      case 18: 
        KeyTimeCycle.access$1702(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1700(paramKeyTimeCycle)));
        break;
      case 17: 
        KeyTimeCycle.access$1602(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1600(paramKeyTimeCycle)));
        break;
      case 16: 
        KeyTimeCycle.access$1502(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1500(paramKeyTimeCycle)));
        break;
      case 15: 
        KeyTimeCycle.access$1402(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$1400(paramKeyTimeCycle)));
        break;
      case 14: 
        KeyTimeCycle.access$1202(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1200(paramKeyTimeCycle)));
        break;
      case 13: 
        KeyTimeCycle.access$302(paramKeyTimeCycle, paramTypedArray.getInteger(k, KeyTimeCycle.access$300(paramKeyTimeCycle)));
        break;
      case 12: 
        mFramePosition = paramTypedArray.getInt(k, mFramePosition);
        break;
      case 10: 
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
      case 9: 
        KeyTimeCycle.access$1102(paramKeyTimeCycle, paramTypedArray.getString(k));
        break;
      case 8: 
        KeyTimeCycle.access$1302(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1300(paramKeyTimeCycle)));
        break;
      case 7: 
        KeyTimeCycle.access$802(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$800(paramKeyTimeCycle)));
        break;
      case 6: 
        KeyTimeCycle.access$1002(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$1000(paramKeyTimeCycle)));
        break;
      case 5: 
        KeyTimeCycle.access$902(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$900(paramKeyTimeCycle)));
        break;
      case 4: 
        KeyTimeCycle.access$202(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$200(paramKeyTimeCycle)));
        break;
      case 2: 
        KeyTimeCycle.access$102(paramKeyTimeCycle, paramTypedArray.getDimension(k, KeyTimeCycle.access$100(paramKeyTimeCycle)));
        break;
      case 1: 
        KeyTimeCycle.access$002(paramKeyTimeCycle, paramTypedArray.getFloat(k, KeyTimeCycle.access$000(paramKeyTimeCycle)));
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */