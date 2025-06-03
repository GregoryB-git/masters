package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z2;

public class KeyAttributes
  extends Key
{
  private static final boolean DEBUG = false;
  public static final int KEY_TYPE = 1;
  public static final String NAME = "KeyAttribute";
  private static final String TAG = "KeyAttributes";
  private float mAlpha = NaN.0F;
  private int mCurveFit = -1;
  private float mElevation = NaN.0F;
  private float mPivotX = NaN.0F;
  private float mPivotY = NaN.0F;
  private float mProgress = NaN.0F;
  private float mRotation = NaN.0F;
  private float mRotationX = NaN.0F;
  private float mRotationY = NaN.0F;
  private float mScaleX = NaN.0F;
  private float mScaleY = NaN.0F;
  private String mTransitionEasing;
  private float mTransitionPathRotate = NaN.0F;
  private float mTranslationX = NaN.0F;
  private float mTranslationY = NaN.0F;
  private float mTranslationZ = NaN.0F;
  private boolean mVisibility = false;
  
  public KeyAttributes()
  {
    mType = 1;
    mCustomConstraints = new HashMap();
  }
  
  public void addValues(HashMap<String, ViewSpline> paramHashMap)
  {
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      SplineSet localSplineSet = (SplineSet)paramHashMap.get(localObject);
      if (localSplineSet != null)
      {
        boolean bool = ((String)localObject).startsWith("CUSTOM");
        int i = 7;
        if (bool)
        {
          localObject = ((String)localObject).substring(7);
          localObject = (ConstraintAttribute)mCustomConstraints.get(localObject);
          if (localObject != null) {
            ((ViewSpline.CustomSet)localSplineSet).setPoint(mFramePosition, (ConstraintAttribute)localObject);
          }
        }
        else
        {
          switch (((String)localObject).hashCode())
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
                                do
                                {
                                  do
                                  {
                                    i = -1;
                                    break;
                                  } while (!((String)localObject).equals("alpha"));
                                  i = 13;
                                  break;
                                } while (!((String)localObject).equals("transitionPathRotate"));
                                i = 12;
                                break;
                              } while (!((String)localObject).equals("elevation"));
                              i = 11;
                              break;
                            } while (!((String)localObject).equals("rotation"));
                            i = 10;
                            break;
                          } while (!((String)localObject).equals("transformPivotY"));
                          i = 9;
                          break;
                        } while (!((String)localObject).equals("transformPivotX"));
                        i = 8;
                        break;
                        if (((String)localObject).equals("scaleY")) {
                          break;
                        }
                      } while ((goto 228) || (!((String)localObject).equals("scaleX")));
                      i = 6;
                      break;
                    } while (!((String)localObject).equals("progress"));
                    i = 5;
                    break;
                  } while (!((String)localObject).equals("translationZ"));
                  i = 4;
                  break;
                } while (!((String)localObject).equals("translationY"));
                i = 3;
                break;
              } while (!((String)localObject).equals("translationX"));
              i = 2;
              break;
            } while (!((String)localObject).equals("rotationY"));
            i = 1;
            break;
          } while (!((String)localObject).equals("rotationX"));
          i = 0;
          switch (i)
          {
          default: 
            break;
          case 13: 
            if (!Float.isNaN(mAlpha)) {
              localSplineSet.setPoint(mFramePosition, mAlpha);
            }
            break;
          case 12: 
            if (!Float.isNaN(mTransitionPathRotate)) {
              localSplineSet.setPoint(mFramePosition, mTransitionPathRotate);
            }
            break;
          case 11: 
            if (!Float.isNaN(mElevation)) {
              localSplineSet.setPoint(mFramePosition, mElevation);
            }
            break;
          case 10: 
            if (!Float.isNaN(mRotation)) {
              localSplineSet.setPoint(mFramePosition, mRotation);
            }
            break;
          case 9: 
            if (!Float.isNaN(mRotationY)) {
              localSplineSet.setPoint(mFramePosition, mPivotY);
            }
            break;
          case 8: 
            if (!Float.isNaN(mRotationX)) {
              localSplineSet.setPoint(mFramePosition, mPivotX);
            }
            break;
          case 7: 
            if (!Float.isNaN(mScaleY)) {
              localSplineSet.setPoint(mFramePosition, mScaleY);
            }
            break;
          case 6: 
            if (!Float.isNaN(mScaleX)) {
              localSplineSet.setPoint(mFramePosition, mScaleX);
            }
            break;
          case 5: 
            if (!Float.isNaN(mProgress)) {
              localSplineSet.setPoint(mFramePosition, mProgress);
            }
            break;
          case 4: 
            if (!Float.isNaN(mTranslationZ)) {
              localSplineSet.setPoint(mFramePosition, mTranslationZ);
            }
            break;
          case 3: 
            if (!Float.isNaN(mTranslationY)) {
              localSplineSet.setPoint(mFramePosition, mTranslationY);
            }
            break;
          case 2: 
            if (!Float.isNaN(mTranslationX)) {
              localSplineSet.setPoint(mFramePosition, mTranslationX);
            }
            break;
          case 1: 
            if (!Float.isNaN(mRotationY)) {
              localSplineSet.setPoint(mFramePosition, mRotationY);
            }
            break;
          case 0: 
            if (!Float.isNaN(mRotationX)) {
              localSplineSet.setPoint(mFramePosition, mRotationX);
            }
            break;
          }
        }
      }
    }
  }
  
  public Key clone()
  {
    return new KeyAttributes().copy(this);
  }
  
  public Key copy(Key paramKey)
  {
    super.copy(paramKey);
    paramKey = (KeyAttributes)paramKey;
    mCurveFit = mCurveFit;
    mVisibility = mVisibility;
    mAlpha = mAlpha;
    mElevation = mElevation;
    mRotation = mRotation;
    mRotationX = mRotationX;
    mRotationY = mRotationY;
    mPivotX = mPivotX;
    mPivotY = mPivotY;
    mTransitionPathRotate = mTransitionPathRotate;
    mScaleX = mScaleX;
    mScaleY = mScaleY;
    mTranslationX = mTranslationX;
    mTranslationY = mTranslationY;
    mTranslationZ = mTranslationZ;
    mProgress = mProgress;
    return this;
  }
  
  public void getAttributeNames(HashSet<String> paramHashSet)
  {
    if (!Float.isNaN(mAlpha)) {
      paramHashSet.add("alpha");
    }
    if (!Float.isNaN(mElevation)) {
      paramHashSet.add("elevation");
    }
    if (!Float.isNaN(mRotation)) {
      paramHashSet.add("rotation");
    }
    if (!Float.isNaN(mRotationX)) {
      paramHashSet.add("rotationX");
    }
    if (!Float.isNaN(mRotationY)) {
      paramHashSet.add("rotationY");
    }
    if (!Float.isNaN(mPivotX)) {
      paramHashSet.add("transformPivotX");
    }
    if (!Float.isNaN(mPivotY)) {
      paramHashSet.add("transformPivotY");
    }
    if (!Float.isNaN(mTranslationX)) {
      paramHashSet.add("translationX");
    }
    if (!Float.isNaN(mTranslationY)) {
      paramHashSet.add("translationY");
    }
    if (!Float.isNaN(mTranslationZ)) {
      paramHashSet.add("translationZ");
    }
    if (!Float.isNaN(mTransitionPathRotate)) {
      paramHashSet.add("transitionPathRotate");
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashSet.add("scaleX");
    }
    if (!Float.isNaN(mScaleY)) {
      paramHashSet.add("scaleY");
    }
    if (!Float.isNaN(mProgress)) {
      paramHashSet.add("progress");
    }
    if (mCustomConstraints.size() > 0)
    {
      Iterator localIterator = mCustomConstraints.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("CUSTOM,");
        localStringBuilder.append(str);
        paramHashSet.add(localStringBuilder.toString());
      }
    }
  }
  
  public int getCurveFit()
  {
    return mCurveFit;
  }
  
  public void load(Context paramContext, AttributeSet paramAttributeSet)
  {
    Loader.read(this, paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.KeyAttribute));
  }
  
  public void setInterpolation(HashMap<String, Integer> paramHashMap)
  {
    if (mCurveFit == -1) {
      return;
    }
    if (!Float.isNaN(mAlpha)) {
      paramHashMap.put("alpha", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mElevation)) {
      paramHashMap.put("elevation", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotation)) {
      paramHashMap.put("rotation", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationX)) {
      paramHashMap.put("rotationX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mRotationY)) {
      paramHashMap.put("rotationY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mPivotX)) {
      paramHashMap.put("transformPivotX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mPivotY)) {
      paramHashMap.put("transformPivotY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationX)) {
      paramHashMap.put("translationX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationY)) {
      paramHashMap.put("translationY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTranslationZ)) {
      paramHashMap.put("translationZ", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mTransitionPathRotate)) {
      paramHashMap.put("transitionPathRotate", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleX)) {
      paramHashMap.put("scaleX", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mScaleY)) {
      paramHashMap.put("scaleY", Integer.valueOf(mCurveFit));
    }
    if (!Float.isNaN(mProgress)) {
      paramHashMap.put("progress", Integer.valueOf(mCurveFit));
    }
    if (mCustomConstraints.size() > 0)
    {
      Iterator localIterator = mCustomConstraints.keySet().iterator();
      while (localIterator.hasNext()) {
        paramHashMap.put(z2.o("CUSTOM,", (String)localIterator.next()), Integer.valueOf(mCurveFit));
      }
    }
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
    case 1941332754: 
      if (paramString.equals("visibility")) {
        j = 16;
      }
      break;
    case 579057826: 
      if (paramString.equals("curveFit")) {
        j = 15;
      }
      break;
    case 92909918: 
      if (paramString.equals("alpha")) {
        j = 14;
      }
      break;
    case 37232917: 
      if (paramString.equals("transitionPathRotate")) {
        j = 13;
      }
      break;
    case -4379043: 
      if (paramString.equals("elevation")) {
        j = 12;
      }
      break;
    case -40300674: 
      if (paramString.equals("rotation")) {
        j = 11;
      }
      break;
    case -760884509: 
      if (paramString.equals("transformPivotY")) {
        j = 10;
      }
      break;
    case -760884510: 
      if (paramString.equals("transformPivotX")) {
        j = 9;
      }
      break;
    case -908189617: 
      if (paramString.equals("scaleY")) {
        j = 8;
      }
      break;
    case -908189618: 
      if (paramString.equals("scaleX")) {
        j = 7;
      }
      break;
    case -1225497655: 
      if (paramString.equals("translationZ")) {
        j = 6;
      }
      break;
    case -1225497656: 
      if (paramString.equals("translationY")) {
        j = 5;
      }
      break;
    case -1225497657: 
      if (paramString.equals("translationX")) {
        j = 4;
      }
      break;
    case -1249320805: 
      if (paramString.equals("rotationY")) {
        j = 3;
      }
      break;
    case -1249320806: 
      if (paramString.equals("rotationX")) {
        j = 2;
      }
      break;
    case -1812823328: 
      if (paramString.equals("transitionEasing")) {
        j = 1;
      }
      break;
    case -1913008125: 
      if (paramString.equals("motionProgress")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 16: 
      mVisibility = toBoolean(paramObject);
      break;
    case 15: 
      mCurveFit = toInt(paramObject);
      break;
    case 14: 
      mAlpha = toFloat(paramObject);
      break;
    case 13: 
      mTransitionPathRotate = toFloat(paramObject);
      break;
    case 12: 
      mElevation = toFloat(paramObject);
      break;
    case 11: 
      mRotation = toFloat(paramObject);
      break;
    case 10: 
      mPivotY = toFloat(paramObject);
      break;
    case 9: 
      mPivotX = toFloat(paramObject);
      break;
    case 8: 
      mScaleY = toFloat(paramObject);
      break;
    case 7: 
      mScaleX = toFloat(paramObject);
      break;
    case 6: 
      mTranslationZ = toFloat(paramObject);
      break;
    case 5: 
      mTranslationY = toFloat(paramObject);
      break;
    case 4: 
      mTranslationX = toFloat(paramObject);
      break;
    case 3: 
      mRotationY = toFloat(paramObject);
      break;
    case 2: 
      mRotationX = toFloat(paramObject);
      break;
    case 1: 
      mTransitionEasing = paramObject.toString();
      break;
    case 0: 
      mProgress = toFloat(paramObject);
    }
  }
  
  public static class Loader
  {
    private static final int ANDROID_ALPHA = 1;
    private static final int ANDROID_ELEVATION = 2;
    private static final int ANDROID_PIVOT_X = 19;
    private static final int ANDROID_PIVOT_Y = 20;
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
    private static SparseIntArray mAttrMap;
    
    static
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      mAttrMap = localSparseIntArray;
      localSparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
      mAttrMap.append(R.styleable.KeyAttribute_android_elevation, 2);
      mAttrMap.append(R.styleable.KeyAttribute_android_rotation, 4);
      mAttrMap.append(R.styleable.KeyAttribute_android_rotationX, 5);
      mAttrMap.append(R.styleable.KeyAttribute_android_rotationY, 6);
      mAttrMap.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
      mAttrMap.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
      mAttrMap.append(R.styleable.KeyAttribute_android_scaleX, 7);
      mAttrMap.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
      mAttrMap.append(R.styleable.KeyAttribute_transitionEasing, 9);
      mAttrMap.append(R.styleable.KeyAttribute_motionTarget, 10);
      mAttrMap.append(R.styleable.KeyAttribute_framePosition, 12);
      mAttrMap.append(R.styleable.KeyAttribute_curveFit, 13);
      mAttrMap.append(R.styleable.KeyAttribute_android_scaleY, 14);
      mAttrMap.append(R.styleable.KeyAttribute_android_translationX, 15);
      mAttrMap.append(R.styleable.KeyAttribute_android_translationY, 16);
      mAttrMap.append(R.styleable.KeyAttribute_android_translationZ, 17);
      mAttrMap.append(R.styleable.KeyAttribute_motionProgress, 18);
    }
    
    public static void read(KeyAttributes paramKeyAttributes, TypedArray paramTypedArray)
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
          Log.e("KeyAttribute", localStringBuilder.toString());
          break;
        case 20: 
          KeyAttributes.access$802(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$800(paramKeyAttributes)));
          break;
        case 19: 
          KeyAttributes.access$702(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$700(paramKeyAttributes)));
          break;
        case 18: 
          KeyAttributes.access$1502(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$1500(paramKeyAttributes)));
          break;
        case 17: 
          KeyAttributes.access$1402(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$1400(paramKeyAttributes)));
          break;
        case 16: 
          KeyAttributes.access$1302(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$1300(paramKeyAttributes)));
          break;
        case 15: 
          KeyAttributes.access$1202(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$1200(paramKeyAttributes)));
          break;
        case 14: 
          KeyAttributes.access$1002(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$1000(paramKeyAttributes)));
          break;
        case 13: 
          KeyAttributes.access$302(paramKeyAttributes, paramTypedArray.getInteger(k, KeyAttributes.access$300(paramKeyAttributes)));
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
          KeyAttributes.access$902(paramKeyAttributes, paramTypedArray.getString(k));
          break;
        case 8: 
          KeyAttributes.access$1102(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$1100(paramKeyAttributes)));
          break;
        case 7: 
          KeyAttributes.access$402(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$400(paramKeyAttributes)));
          break;
        case 6: 
          KeyAttributes.access$602(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$600(paramKeyAttributes)));
          break;
        case 5: 
          KeyAttributes.access$502(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$500(paramKeyAttributes)));
          break;
        case 4: 
          KeyAttributes.access$202(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$200(paramKeyAttributes)));
          break;
        case 2: 
          KeyAttributes.access$102(paramKeyAttributes, paramTypedArray.getDimension(k, KeyAttributes.access$100(paramKeyAttributes)));
          break;
        case 1: 
          KeyAttributes.access$002(paramKeyAttributes, paramTypedArray.getFloat(k, KeyAttributes.access$000(paramKeyAttributes)));
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyAttributes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */