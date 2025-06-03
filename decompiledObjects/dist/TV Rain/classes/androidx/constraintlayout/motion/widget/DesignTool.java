package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import java.io.PrintStream;
import java.util.HashMap;

public class DesignTool
  implements ProxyInterface
{
  private static final boolean DEBUG = false;
  private static final String TAG = "DesignTool";
  public static final HashMap<Pair<Integer, Integer>, String> allAttributes;
  public static final HashMap<String, String> allMargins;
  private String mLastEndState = null;
  private int mLastEndStateId = -1;
  private String mLastStartState = null;
  private int mLastStartStateId = -1;
  private final MotionLayout mMotionLayout;
  private MotionScene mSceneCache;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    allAttributes = localHashMap1;
    HashMap localHashMap2 = new HashMap();
    allMargins = localHashMap2;
    Integer localInteger1 = Integer.valueOf(4);
    localHashMap1.put(Pair.create(localInteger1, localInteger1), "layout_constraintBottom_toBottomOf");
    Integer localInteger2 = Integer.valueOf(3);
    localHashMap1.put(Pair.create(localInteger1, localInteger2), "layout_constraintBottom_toTopOf");
    localHashMap1.put(Pair.create(localInteger2, localInteger1), "layout_constraintTop_toBottomOf");
    localHashMap1.put(Pair.create(localInteger2, localInteger2), "layout_constraintTop_toTopOf");
    localInteger2 = Integer.valueOf(6);
    localHashMap1.put(Pair.create(localInteger2, localInteger2), "layout_constraintStart_toStartOf");
    localInteger1 = Integer.valueOf(7);
    localHashMap1.put(Pair.create(localInteger2, localInteger1), "layout_constraintStart_toEndOf");
    localHashMap1.put(Pair.create(localInteger1, localInteger2), "layout_constraintEnd_toStartOf");
    localHashMap1.put(Pair.create(localInteger1, localInteger1), "layout_constraintEnd_toEndOf");
    localInteger2 = Integer.valueOf(1);
    localHashMap1.put(Pair.create(localInteger2, localInteger2), "layout_constraintLeft_toLeftOf");
    localInteger1 = Integer.valueOf(2);
    localHashMap1.put(Pair.create(localInteger2, localInteger1), "layout_constraintLeft_toRightOf");
    localHashMap1.put(Pair.create(localInteger1, localInteger1), "layout_constraintRight_toRightOf");
    localHashMap1.put(Pair.create(localInteger1, localInteger2), "layout_constraintRight_toLeftOf");
    localInteger2 = Integer.valueOf(5);
    localHashMap1.put(Pair.create(localInteger2, localInteger2), "layout_constraintBaseline_toBaselineOf");
    localHashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
    localHashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
    localHashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
    localHashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
    localHashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
    localHashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
    localHashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
    localHashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
    localHashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
    localHashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
    localHashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
    localHashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
  }
  
  public DesignTool(MotionLayout paramMotionLayout)
  {
    mMotionLayout = paramMotionLayout;
  }
  
  private static void Connect(int paramInt1, ConstraintSet paramConstraintSet, View paramView, HashMap<String, String> paramHashMap, int paramInt2, int paramInt3)
  {
    String str1 = (String)allAttributes.get(Pair.create(Integer.valueOf(paramInt2), Integer.valueOf(paramInt3)));
    String str2 = (String)paramHashMap.get(str1);
    if (str2 != null)
    {
      int i = 0;
      str1 = (String)allMargins.get(str1);
      if (str1 != null) {
        i = GetPxFromDp(paramInt1, (String)paramHashMap.get(str1));
      }
      paramInt1 = Integer.parseInt(str2);
      paramConstraintSet.connect(paramView.getId(), paramInt2, paramInt1, paramInt3, i);
    }
  }
  
  private static int GetPxFromDp(int paramInt, String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    int i = paramString.indexOf('d');
    if (i == -1) {
      return 0;
    }
    return (int)(Integer.valueOf(paramString.substring(0, i)).intValue() * paramInt / 160.0F);
  }
  
  private static void SetAbsolutePositions(int paramInt, ConstraintSet paramConstraintSet, View paramView, HashMap<String, String> paramHashMap)
  {
    String str = (String)paramHashMap.get("layout_editor_absoluteX");
    if (str != null) {
      paramConstraintSet.setEditorAbsoluteX(paramView.getId(), GetPxFromDp(paramInt, str));
    }
    paramHashMap = (String)paramHashMap.get("layout_editor_absoluteY");
    if (paramHashMap != null) {
      paramConstraintSet.setEditorAbsoluteY(paramView.getId(), GetPxFromDp(paramInt, paramHashMap));
    }
  }
  
  private static void SetBias(ConstraintSet paramConstraintSet, View paramView, HashMap<String, String> paramHashMap, int paramInt)
  {
    String str;
    if (paramInt == 1) {
      str = "layout_constraintVertical_bias";
    } else {
      str = "layout_constraintHorizontal_bias";
    }
    paramHashMap = (String)paramHashMap.get(str);
    if (paramHashMap != null) {
      if (paramInt == 0) {
        paramConstraintSet.setHorizontalBias(paramView.getId(), Float.parseFloat(paramHashMap));
      } else if (paramInt == 1) {
        paramConstraintSet.setVerticalBias(paramView.getId(), Float.parseFloat(paramHashMap));
      }
    }
  }
  
  private static void SetDimensions(int paramInt1, ConstraintSet paramConstraintSet, View paramView, HashMap<String, String> paramHashMap, int paramInt2)
  {
    String str;
    if (paramInt2 == 1) {
      str = "layout_height";
    } else {
      str = "layout_width";
    }
    paramHashMap = (String)paramHashMap.get(str);
    if (paramHashMap != null)
    {
      int i = -2;
      if (!paramHashMap.equalsIgnoreCase("wrap_content")) {
        i = GetPxFromDp(paramInt1, paramHashMap);
      }
      if (paramInt2 == 0) {
        paramConstraintSet.constrainWidth(paramView.getId(), i);
      } else {
        paramConstraintSet.constrainHeight(paramView.getId(), i);
      }
    }
  }
  
  public int designAccess(int paramInt1, String paramString, Object paramObject, float[] paramArrayOfFloat1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3)
  {
    paramArrayOfFloat1 = (View)paramObject;
    if (paramInt1 != 0)
    {
      paramObject = mMotionLayout;
      if (mScene == null) {
        return -1;
      }
      if (paramArrayOfFloat1 != null)
      {
        paramArrayOfFloat1 = (MotionController)mFrameArrayList.get(paramArrayOfFloat1);
        paramObject = paramArrayOfFloat1;
        if (paramArrayOfFloat1 != null) {}
      }
      else
      {
        return -1;
      }
    }
    else
    {
      paramObject = null;
    }
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3) {
            return -1;
          }
          paramInt1 = mMotionLayout.mScene.getDuration() / 16;
          return ((MotionController)paramObject).getAttributeValues(paramString, paramArrayOfFloat2, paramInt3);
        }
        paramInt1 = mMotionLayout.mScene.getDuration() / 16;
        ((MotionController)paramObject).buildKeyFrames(paramArrayOfFloat2, null);
        return paramInt1;
      }
      paramInt1 = mMotionLayout.mScene.getDuration() / 16;
      ((MotionController)paramObject).buildPath(paramArrayOfFloat2, paramInt1);
      return paramInt1;
    }
    return 1;
  }
  
  public void disableAutoTransition(boolean paramBoolean)
  {
    mMotionLayout.disableAutoTransition(paramBoolean);
  }
  
  public void dumpConstraintSet(String paramString)
  {
    Object localObject = mMotionLayout;
    if (mScene == null) {
      mScene = mSceneCache;
    }
    int i = ((MotionLayout)localObject).lookUpConstraintId(paramString);
    localObject = System.out;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" dumping  ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    ((PrintStream)localObject).println(localStringBuilder.toString());
    try
    {
      mMotionLayout.mScene.getConstraintSet(i).dump(mMotionLayout.mScene, new int[0]);
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public int getAnimationKeyFrames(Object paramObject, float[] paramArrayOfFloat)
  {
    MotionScene localMotionScene = mMotionLayout.mScene;
    if (localMotionScene == null) {
      return -1;
    }
    int i = localMotionScene.getDuration() / 16;
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get(paramObject);
    if (paramObject == null) {
      return 0;
    }
    ((MotionController)paramObject).buildKeyFrames(paramArrayOfFloat, null);
    return i;
  }
  
  public int getAnimationPath(Object paramObject, float[] paramArrayOfFloat, int paramInt)
  {
    MotionLayout localMotionLayout = mMotionLayout;
    if (mScene == null) {
      return -1;
    }
    paramObject = (MotionController)mFrameArrayList.get(paramObject);
    if (paramObject == null) {
      return 0;
    }
    ((MotionController)paramObject).buildPath(paramArrayOfFloat, paramInt);
    return paramInt;
  }
  
  public void getAnimationRectangles(Object paramObject, float[] paramArrayOfFloat)
  {
    MotionScene localMotionScene = mMotionLayout.mScene;
    if (localMotionScene == null) {
      return;
    }
    int i = localMotionScene.getDuration() / 16;
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get(paramObject);
    if (paramObject == null) {
      return;
    }
    ((MotionController)paramObject).buildRectangles(paramArrayOfFloat, i);
  }
  
  public String getEndState()
  {
    int i = mMotionLayout.getEndState();
    if (mLastEndStateId == i) {
      return mLastEndState;
    }
    String str = mMotionLayout.getConstraintSetNames(i);
    if (str != null)
    {
      mLastEndState = str;
      mLastEndStateId = i;
    }
    return str;
  }
  
  public int getKeyFrameInfo(Object paramObject, int paramInt, int[] paramArrayOfInt)
  {
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get((View)paramObject);
    if (paramObject == null) {
      return 0;
    }
    return ((MotionController)paramObject).getKeyFrameInfo(paramInt, paramArrayOfInt);
  }
  
  public float getKeyFramePosition(Object paramObject, int paramInt, float paramFloat1, float paramFloat2)
  {
    if (!(paramObject instanceof View)) {
      return 0.0F;
    }
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get((View)paramObject);
    if (paramObject == null) {
      return 0.0F;
    }
    return ((MotionController)paramObject).getKeyFrameParameter(paramInt, paramFloat1, paramFloat2);
  }
  
  public int getKeyFramePositions(Object paramObject, int[] paramArrayOfInt, float[] paramArrayOfFloat)
  {
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get((View)paramObject);
    if (paramObject == null) {
      return 0;
    }
    return ((MotionController)paramObject).getKeyFramePositions(paramArrayOfInt, paramArrayOfFloat);
  }
  
  public Object getKeyframe(int paramInt1, int paramInt2, int paramInt3)
  {
    MotionLayout localMotionLayout = mMotionLayout;
    MotionScene localMotionScene = mScene;
    if (localMotionScene == null) {
      return null;
    }
    return localMotionScene.getKeyFrame(localMotionLayout.getContext(), paramInt1, paramInt2, paramInt3);
  }
  
  public Object getKeyframe(Object paramObject, int paramInt1, int paramInt2)
  {
    if (mMotionLayout.mScene == null) {
      return null;
    }
    int i = ((View)paramObject).getId();
    paramObject = mMotionLayout;
    return mScene.getKeyFrame(((View)paramObject).getContext(), paramInt1, i, paramInt2);
  }
  
  public Object getKeyframeAtLocation(Object paramObject, float paramFloat1, float paramFloat2)
  {
    Object localObject = (View)paramObject;
    paramObject = mMotionLayout;
    if (mScene == null) {
      return Integer.valueOf(-1);
    }
    if (localObject != null)
    {
      paramObject = (MotionController)mFrameArrayList.get(localObject);
      if (paramObject == null) {
        return null;
      }
      localObject = (ViewGroup)((View)localObject).getParent();
      return ((MotionController)paramObject).getPositionKeyframe(((View)localObject).getWidth(), ((View)localObject).getHeight(), paramFloat1, paramFloat2);
    }
    return null;
  }
  
  public Boolean getPositionKeyframe(Object paramObject1, Object paramObject2, float paramFloat1, float paramFloat2, String[] paramArrayOfString, float[] paramArrayOfFloat)
  {
    if ((paramObject1 instanceof KeyPositionBase))
    {
      paramObject1 = (KeyPositionBase)paramObject1;
      HashMap localHashMap = mMotionLayout.mFrameArrayList;
      paramObject2 = (View)paramObject2;
      ((MotionController)localHashMap.get(paramObject2)).positionKeyframe((View)paramObject2, (KeyPositionBase)paramObject1, paramFloat1, paramFloat2, paramArrayOfString, paramArrayOfFloat);
      mMotionLayout.rebuildScene();
      mMotionLayout.mInTransition = true;
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
  
  public float getProgress()
  {
    return mMotionLayout.getProgress();
  }
  
  public String getStartState()
  {
    int i = mMotionLayout.getStartState();
    if (mLastStartStateId == i) {
      return mLastStartState;
    }
    String str = mMotionLayout.getConstraintSetNames(i);
    if (str != null)
    {
      mLastStartState = str;
      mLastStartStateId = i;
    }
    return mMotionLayout.getConstraintSetNames(i);
  }
  
  public String getState()
  {
    if ((mLastStartState != null) && (mLastEndState != null))
    {
      float f = getProgress();
      if (f <= 0.01F) {
        return mLastStartState;
      }
      if (f >= 0.99F) {
        return mLastEndState;
      }
    }
    return mLastStartState;
  }
  
  public long getTransitionTimeMs()
  {
    return mMotionLayout.getTransitionTimeMs();
  }
  
  public boolean isInTransition()
  {
    boolean bool;
    if ((mLastStartState != null) && (mLastEndState != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setAttributes(int paramInt, String paramString, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (View)paramObject1;
    paramObject2 = (HashMap)paramObject2;
    int i = mMotionLayout.lookUpConstraintId(paramString);
    paramString = mMotionLayout.mScene.getConstraintSet(i);
    if (paramString == null) {
      return;
    }
    paramString.clear(((View)paramObject1).getId());
    SetDimensions(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 0);
    SetDimensions(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 1);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 6, 6);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 6, 7);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 7, 7);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 7, 6);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 1, 1);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 1, 2);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 2, 2);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 2, 1);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 3, 3);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 3, 4);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 4, 3);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 4, 4);
    Connect(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2, 5, 5);
    SetBias(paramString, (View)paramObject1, (HashMap)paramObject2, 0);
    SetBias(paramString, (View)paramObject1, (HashMap)paramObject2, 1);
    SetAbsolutePositions(paramInt, paramString, (View)paramObject1, (HashMap)paramObject2);
    mMotionLayout.updateState(i, paramString);
    mMotionLayout.requestLayout();
  }
  
  public void setKeyFrame(Object paramObject1, int paramInt, String paramString, Object paramObject2)
  {
    MotionScene localMotionScene = mMotionLayout.mScene;
    if (localMotionScene != null)
    {
      localMotionScene.setKeyframe((View)paramObject1, paramInt, paramString, paramObject2);
      paramObject1 = mMotionLayout;
      mTransitionGoalPosition = (paramInt / 100.0F);
      mTransitionLastPosition = 0.0F;
      ((MotionLayout)paramObject1).rebuildScene();
      mMotionLayout.evaluate(true);
    }
  }
  
  public boolean setKeyFramePosition(Object paramObject, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    if (!(paramObject instanceof View)) {
      return false;
    }
    Object localObject1 = mMotionLayout;
    if (mScene != null)
    {
      localObject1 = (MotionController)mFrameArrayList.get(paramObject);
      Object localObject2 = mMotionLayout;
      paramInt1 = (int)(mTransitionPosition * 100.0F);
      if (localObject1 != null)
      {
        localObject2 = mScene;
        paramObject = (View)paramObject;
        if (((MotionScene)localObject2).hasKeyFramePosition((View)paramObject, paramInt1))
        {
          float f = ((MotionController)localObject1).getKeyFrameParameter(2, paramFloat1, paramFloat2);
          paramFloat1 = ((MotionController)localObject1).getKeyFrameParameter(5, paramFloat1, paramFloat2);
          mMotionLayout.mScene.setKeyframe((View)paramObject, paramInt1, "motion:percentX", Float.valueOf(f));
          mMotionLayout.mScene.setKeyframe((View)paramObject, paramInt1, "motion:percentY", Float.valueOf(paramFloat1));
          mMotionLayout.rebuildScene();
          mMotionLayout.evaluate(true);
          mMotionLayout.invalidate();
          return true;
        }
      }
    }
    return false;
  }
  
  public void setKeyframe(Object paramObject1, String paramString, Object paramObject2)
  {
    if ((paramObject1 instanceof Key))
    {
      ((Key)paramObject1).setValue(paramString, paramObject2);
      mMotionLayout.rebuildScene();
      mMotionLayout.mInTransition = true;
    }
  }
  
  public void setState(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "motion_base";
    }
    if (mLastStartState == str) {
      return;
    }
    mLastStartState = str;
    mLastEndState = null;
    paramString = mMotionLayout;
    if (mScene == null) {
      mScene = mSceneCache;
    }
    int i = paramString.lookUpConstraintId(str);
    mLastStartStateId = i;
    if (i != 0) {
      if (i == mMotionLayout.getStartState())
      {
        mMotionLayout.setProgress(0.0F);
      }
      else if (i == mMotionLayout.getEndState())
      {
        mMotionLayout.setProgress(1.0F);
      }
      else
      {
        mMotionLayout.transitionToState(i);
        mMotionLayout.setProgress(1.0F);
      }
    }
    mMotionLayout.requestLayout();
  }
  
  public void setToolPosition(float paramFloat)
  {
    MotionLayout localMotionLayout = mMotionLayout;
    if (mScene == null) {
      mScene = mSceneCache;
    }
    localMotionLayout.setProgress(paramFloat);
    mMotionLayout.evaluate(true);
    mMotionLayout.requestLayout();
    mMotionLayout.invalidate();
  }
  
  public void setTransition(String paramString1, String paramString2)
  {
    MotionLayout localMotionLayout = mMotionLayout;
    if (mScene == null) {
      mScene = mSceneCache;
    }
    int i = localMotionLayout.lookUpConstraintId(paramString1);
    int j = mMotionLayout.lookUpConstraintId(paramString2);
    mMotionLayout.setTransition(i, j);
    mLastStartStateId = i;
    mLastEndStateId = j;
    mLastStartState = paramString1;
    mLastEndState = paramString2;
  }
  
  public void setViewDebug(Object paramObject, int paramInt)
  {
    if (!(paramObject instanceof View)) {
      return;
    }
    paramObject = (MotionController)mMotionLayout.mFrameArrayList.get(paramObject);
    if (paramObject != null)
    {
      ((MotionController)paramObject).setDrawPath(paramInt);
      mMotionLayout.invalidate();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.DesignTool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */