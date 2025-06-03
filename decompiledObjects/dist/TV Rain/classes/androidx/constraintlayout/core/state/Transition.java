package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import s4;
import z3;

public class Transition
  implements TypedValues
{
  public static final int ANTICIPATE = 6;
  public static final int BOUNCE = 4;
  public static final int EASE_IN = 1;
  public static final int EASE_IN_OUT = 0;
  public static final int EASE_OUT = 2;
  public static final int END = 1;
  public static final int INTERPOLATED = 2;
  private static final int INTERPOLATOR_REFERENCE_ID = -2;
  public static final int LINEAR = 3;
  public static final int OVERSHOOT = 5;
  private static final int SPLINE_STRING = -1;
  public static final int START = 0;
  public HashMap<Integer, HashMap<String, KeyPosition>> keyPositions = new HashMap();
  private int mAutoTransition = 0;
  public TypedBundle mBundle = new TypedBundle();
  private int mDefaultInterpolator = 0;
  private String mDefaultInterpolatorString = null;
  private int mDuration = 400;
  private Easing mEasing = null;
  private float mStagger = 0.0F;
  private HashMap<String, WidgetState> state = new HashMap();
  
  public static Interpolator getInterpolator(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 6: 
      return new z3(4);
    case 5: 
      return new z3(5);
    case 4: 
      return new z3(6);
    case 3: 
      return new z3(3);
    case 2: 
      return new z3(2);
    case 1: 
      return new z3(1);
    case 0: 
      return new z3(0);
    }
    return new s4(paramString, 0);
  }
  
  private WidgetState getWidgetState(String paramString)
  {
    return (WidgetState)state.get(paramString);
  }
  
  private WidgetState getWidgetState(String paramString, ConstraintWidget paramConstraintWidget, int paramInt)
  {
    WidgetState localWidgetState1 = (WidgetState)state.get(paramString);
    WidgetState localWidgetState2 = localWidgetState1;
    if (localWidgetState1 == null)
    {
      localWidgetState1 = new WidgetState();
      mBundle.applyDelta(motionControl);
      state.put(paramString, localWidgetState1);
      localWidgetState2 = localWidgetState1;
      if (paramConstraintWidget != null)
      {
        localWidgetState1.update(paramConstraintWidget, paramInt);
        localWidgetState2 = localWidgetState1;
      }
    }
    return localWidgetState2;
  }
  
  public void addCustomColor(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    getWidgetState(paramString1, null, paramInt1).getFrame(paramInt1).addCustomColor(paramString2, paramInt2);
  }
  
  public void addCustomFloat(int paramInt, String paramString1, String paramString2, float paramFloat)
  {
    getWidgetState(paramString1, null, paramInt).getFrame(paramInt).addCustomFloat(paramString2, paramFloat);
  }
  
  public void addKeyAttribute(String paramString, TypedBundle paramTypedBundle)
  {
    getWidgetState(paramString, null, 0).setKeyAttribute(paramTypedBundle);
  }
  
  public void addKeyCycle(String paramString, TypedBundle paramTypedBundle)
  {
    getWidgetState(paramString, null, 0).setKeyCycle(paramTypedBundle);
  }
  
  public void addKeyPosition(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    Object localObject = new TypedBundle();
    ((TypedBundle)localObject).add(510, 2);
    ((TypedBundle)localObject).add(100, paramInt1);
    ((TypedBundle)localObject).add(506, paramFloat1);
    ((TypedBundle)localObject).add(507, paramFloat2);
    getWidgetState(paramString, null, 0).setKeyPosition((TypedBundle)localObject);
    KeyPosition localKeyPosition = new KeyPosition(paramString, paramInt1, paramInt2, paramFloat1, paramFloat2);
    HashMap localHashMap = (HashMap)keyPositions.get(Integer.valueOf(paramInt1));
    localObject = localHashMap;
    if (localHashMap == null)
    {
      localObject = new HashMap();
      keyPositions.put(Integer.valueOf(paramInt1), localObject);
    }
    ((HashMap)localObject).put(paramString, localKeyPosition);
  }
  
  public void addKeyPosition(String paramString, TypedBundle paramTypedBundle)
  {
    getWidgetState(paramString, null, 0).setKeyPosition(paramTypedBundle);
  }
  
  public void clear()
  {
    state.clear();
  }
  
  public boolean contains(String paramString)
  {
    return state.containsKey(paramString);
  }
  
  public void fillKeyPositions(WidgetFrame paramWidgetFrame, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    int i = 0;
    int k;
    for (int j = 0; i <= 100; j = k)
    {
      Object localObject = (HashMap)keyPositions.get(Integer.valueOf(i));
      k = j;
      if (localObject != null)
      {
        localObject = (KeyPosition)((HashMap)localObject).get(widget.stringId);
        k = j;
        if (localObject != null)
        {
          paramArrayOfFloat1[j] = x;
          paramArrayOfFloat2[j] = y;
          paramArrayOfFloat3[j] = frame;
          k = j + 1;
        }
      }
      i++;
    }
  }
  
  public KeyPosition findNextPosition(String paramString, int paramInt)
  {
    while (paramInt <= 100)
    {
      Object localObject = (HashMap)keyPositions.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        localObject = (KeyPosition)((HashMap)localObject).get(paramString);
        if (localObject != null) {
          return (KeyPosition)localObject;
        }
      }
      paramInt++;
    }
    return null;
  }
  
  public KeyPosition findPreviousPosition(String paramString, int paramInt)
  {
    while (paramInt >= 0)
    {
      Object localObject = (HashMap)keyPositions.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        localObject = (KeyPosition)((HashMap)localObject).get(paramString);
        if (localObject != null) {
          return (KeyPosition)localObject;
        }
      }
      paramInt--;
    }
    return null;
  }
  
  public int getAutoTransition()
  {
    return mAutoTransition;
  }
  
  public WidgetFrame getEnd(ConstraintWidget paramConstraintWidget)
  {
    return getWidgetStatestringId, null, 1).end;
  }
  
  public WidgetFrame getEnd(String paramString)
  {
    paramString = (WidgetState)state.get(paramString);
    if (paramString == null) {
      return null;
    }
    return end;
  }
  
  public int getId(String paramString)
  {
    return 0;
  }
  
  public WidgetFrame getInterpolated(ConstraintWidget paramConstraintWidget)
  {
    return getWidgetStatestringId, null, 2).interpolated;
  }
  
  public WidgetFrame getInterpolated(String paramString)
  {
    paramString = (WidgetState)state.get(paramString);
    if (paramString == null) {
      return null;
    }
    return interpolated;
  }
  
  public Interpolator getInterpolator()
  {
    return getInterpolator(mDefaultInterpolator, mDefaultInterpolatorString);
  }
  
  public int getKeyFrames(String paramString, float[] paramArrayOfFloat, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return state.get(paramString)).motionControl.buildKeyFrames(paramArrayOfFloat, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public Motion getMotion(String paramString)
  {
    return getWidgetState0motionControl;
  }
  
  public int getNumberKeyPositions(WidgetFrame paramWidgetFrame)
  {
    int i = 0;
    int k;
    for (int j = 0; i <= 100; j = k)
    {
      HashMap localHashMap = (HashMap)keyPositions.get(Integer.valueOf(i));
      k = j;
      if (localHashMap != null)
      {
        k = j;
        if ((KeyPosition)localHashMap.get(widget.stringId) != null) {
          k = j + 1;
        }
      }
      i++;
    }
    return j;
  }
  
  public float[] getPath(String paramString)
  {
    paramString = (WidgetState)state.get(paramString);
    float[] arrayOfFloat = new float[124];
    motionControl.buildPath(arrayOfFloat, 62);
    return arrayOfFloat;
  }
  
  public WidgetFrame getStart(ConstraintWidget paramConstraintWidget)
  {
    return getWidgetStatestringId, null, 0).start;
  }
  
  public WidgetFrame getStart(String paramString)
  {
    paramString = (WidgetState)state.get(paramString);
    if (paramString == null) {
      return null;
    }
    return start;
  }
  
  public boolean hasPositionKeyframes()
  {
    boolean bool;
    if (keyPositions.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void interpolate(int paramInt1, int paramInt2, float paramFloat)
  {
    Object localObject = mEasing;
    float f = paramFloat;
    if (localObject != null) {
      f = (float)((Easing)localObject).get(paramFloat);
    }
    Iterator localIterator = state.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      ((WidgetState)state.get(localObject)).interpolate(paramInt1, paramInt2, f, this);
    }
  }
  
  public boolean isEmpty()
  {
    return state.isEmpty();
  }
  
  public void setTransitionProperties(TypedBundle paramTypedBundle)
  {
    paramTypedBundle.applyDelta(mBundle);
    paramTypedBundle.applyDelta(this);
  }
  
  public boolean setValue(int paramInt, float paramFloat)
  {
    if (paramInt == 706) {
      mStagger = paramFloat;
    }
    return false;
  }
  
  public boolean setValue(int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean setValue(int paramInt, String paramString)
  {
    if (paramInt == 705)
    {
      mDefaultInterpolatorString = paramString;
      mEasing = Easing.getInterpolator(paramString);
    }
    return false;
  }
  
  public boolean setValue(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public void updateFrom(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt)
  {
    ArrayList localArrayList = paramConstraintWidgetContainer.getChildren();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
    {
      paramConstraintWidgetContainer = (ConstraintWidget)localArrayList.get(j);
      getWidgetState(stringId, null, paramInt).update(paramConstraintWidgetContainer, paramInt);
    }
  }
  
  public static class KeyPosition
  {
    public int frame;
    public String target;
    public int type;
    public float x;
    public float y;
    
    public KeyPosition(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
    {
      target = paramString;
      frame = paramInt1;
      type = paramInt2;
      x = paramFloat1;
      y = paramFloat2;
    }
  }
  
  public static class WidgetState
  {
    public WidgetFrame end = new WidgetFrame();
    public WidgetFrame interpolated = new WidgetFrame();
    public Motion motionControl;
    public MotionWidget motionWidgetEnd = new MotionWidget(end);
    public MotionWidget motionWidgetInterpolated = new MotionWidget(interpolated);
    public MotionWidget motionWidgetStart = new MotionWidget(start);
    public KeyCache myKeyCache = new KeyCache();
    public int myParentHeight = -1;
    public int myParentWidth = -1;
    public WidgetFrame start = new WidgetFrame();
    
    public WidgetState()
    {
      Motion localMotion = new Motion(motionWidgetStart);
      motionControl = localMotion;
      localMotion.setStart(motionWidgetStart);
      motionControl.setEnd(motionWidgetEnd);
    }
    
    public WidgetFrame getFrame(int paramInt)
    {
      if (paramInt == 0) {
        return start;
      }
      if (paramInt == 1) {
        return end;
      }
      return interpolated;
    }
    
    public void interpolate(int paramInt1, int paramInt2, float paramFloat, Transition paramTransition)
    {
      myParentHeight = paramInt2;
      myParentWidth = paramInt1;
      motionControl.setup(paramInt1, paramInt2, 1.0F, System.nanoTime());
      WidgetFrame.interpolate(paramInt1, paramInt2, interpolated, start, end, paramTransition, paramFloat);
      interpolated.interpolatedPos = paramFloat;
      motionControl.interpolate(motionWidgetInterpolated, paramFloat, System.nanoTime(), myKeyCache);
    }
    
    public void setKeyAttribute(TypedBundle paramTypedBundle)
    {
      MotionKeyAttributes localMotionKeyAttributes = new MotionKeyAttributes();
      paramTypedBundle.applyDelta(localMotionKeyAttributes);
      motionControl.addKey(localMotionKeyAttributes);
    }
    
    public void setKeyCycle(TypedBundle paramTypedBundle)
    {
      MotionKeyCycle localMotionKeyCycle = new MotionKeyCycle();
      paramTypedBundle.applyDelta(localMotionKeyCycle);
      motionControl.addKey(localMotionKeyCycle);
    }
    
    public void setKeyPosition(TypedBundle paramTypedBundle)
    {
      MotionKeyPosition localMotionKeyPosition = new MotionKeyPosition();
      paramTypedBundle.applyDelta(localMotionKeyPosition);
      motionControl.addKey(localMotionKeyPosition);
    }
    
    public void update(ConstraintWidget paramConstraintWidget, int paramInt)
    {
      if (paramInt == 0)
      {
        start.update(paramConstraintWidget);
        motionControl.setStart(motionWidgetStart);
      }
      else if (paramInt == 1)
      {
        end.update(paramConstraintWidget);
        motionControl.setEnd(motionWidgetEnd);
      }
      myParentWidth = -1;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.Transition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */