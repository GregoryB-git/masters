package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import z2;

public abstract class Transition
  implements Cloneable
{
  public static final boolean DBG = false;
  private static final int[] DEFAULT_MATCH_ORDER = { 2, 1, 3, 4 };
  private static final String LOG_TAG = "Transition";
  private static final int MATCH_FIRST = 1;
  public static final int MATCH_ID = 3;
  private static final String MATCH_ID_STR = "id";
  public static final int MATCH_INSTANCE = 1;
  private static final String MATCH_INSTANCE_STR = "instance";
  public static final int MATCH_ITEM_ID = 4;
  private static final String MATCH_ITEM_ID_STR = "itemId";
  private static final int MATCH_LAST = 4;
  public static final int MATCH_NAME = 2;
  private static final String MATCH_NAME_STR = "name";
  private static final PathMotion STRAIGHT_PATH_MOTION = new PathMotion()
  {
    public Path getPath(float paramAnonymousFloat1, float paramAnonymousFloat2, float paramAnonymousFloat3, float paramAnonymousFloat4)
    {
      Path localPath = new Path();
      localPath.moveTo(paramAnonymousFloat1, paramAnonymousFloat2);
      localPath.lineTo(paramAnonymousFloat3, paramAnonymousFloat4);
      return localPath;
    }
  };
  private static ThreadLocal<ArrayMap<Animator, AnimationInfo>> sRunningAnimators = new ThreadLocal();
  private ArrayList<Animator> mAnimators = new ArrayList();
  public boolean mCanRemoveViews = false;
  public ArrayList<Animator> mCurrentAnimators = new ArrayList();
  public long mDuration = -1L;
  private TransitionValuesMaps mEndValues = new TransitionValuesMaps();
  private ArrayList<TransitionValues> mEndValuesList;
  private boolean mEnded = false;
  private EpicenterCallback mEpicenterCallback;
  private TimeInterpolator mInterpolator = null;
  private ArrayList<TransitionListener> mListeners = null;
  private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
  private String mName = getClass().getName();
  private ArrayMap<String, String> mNameOverrides;
  private int mNumInstances = 0;
  public TransitionSet mParent = null;
  private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;
  private boolean mPaused = false;
  public TransitionPropagation mPropagation;
  private ViewGroup mSceneRoot = null;
  private long mStartDelay = -1L;
  private TransitionValuesMaps mStartValues = new TransitionValuesMaps();
  private ArrayList<TransitionValues> mStartValuesList;
  private ArrayList<View> mTargetChildExcludes = null;
  private ArrayList<View> mTargetExcludes = null;
  private ArrayList<Integer> mTargetIdChildExcludes = null;
  private ArrayList<Integer> mTargetIdExcludes = null;
  public ArrayList<Integer> mTargetIds = new ArrayList();
  private ArrayList<String> mTargetNameExcludes = null;
  private ArrayList<String> mTargetNames = null;
  private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
  private ArrayList<Class<?>> mTargetTypeExcludes = null;
  private ArrayList<Class<?>> mTargetTypes = null;
  public ArrayList<View> mTargets = new ArrayList();
  
  public Transition() {}
  
  @SuppressLint({"RestrictedApi"})
  public Transition(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.TRANSITION);
    paramAttributeSet = (XmlResourceParser)paramAttributeSet;
    long l = TypedArrayUtils.getNamedInt(localTypedArray, paramAttributeSet, "duration", 1, -1);
    if (l >= 0L) {
      setDuration(l);
    }
    l = TypedArrayUtils.getNamedInt(localTypedArray, paramAttributeSet, "startDelay", 2, -1);
    if (l > 0L) {
      setStartDelay(l);
    }
    int i = TypedArrayUtils.getNamedResourceId(localTypedArray, paramAttributeSet, "interpolator", 0, 0);
    if (i > 0) {
      setInterpolator(AnimationUtils.loadInterpolator(paramContext, i));
    }
    paramContext = TypedArrayUtils.getNamedString(localTypedArray, paramAttributeSet, "matchOrder", 3);
    if (paramContext != null) {
      setMatchOrder(parseMatchOrder(paramContext));
    }
    localTypedArray.recycle();
  }
  
  private void addUnmatched(ArrayMap<View, TransitionValues> paramArrayMap1, ArrayMap<View, TransitionValues> paramArrayMap2)
  {
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= paramArrayMap1.size()) {
        break;
      }
      TransitionValues localTransitionValues = (TransitionValues)paramArrayMap1.valueAt(j);
      if (isValidTarget(view))
      {
        mStartValuesList.add(localTransitionValues);
        mEndValuesList.add(null);
      }
    }
    while (k < paramArrayMap2.size())
    {
      paramArrayMap1 = (TransitionValues)paramArrayMap2.valueAt(k);
      if (isValidTarget(view))
      {
        mEndValuesList.add(paramArrayMap1);
        mStartValuesList.add(null);
      }
      k++;
    }
  }
  
  private static void addViewValues(TransitionValuesMaps paramTransitionValuesMaps, View paramView, TransitionValues paramTransitionValues)
  {
    mViewValues.put(paramView, paramTransitionValues);
    int i = paramView.getId();
    if (i >= 0) {
      if (mIdValues.indexOfKey(i) >= 0) {
        mIdValues.put(i, null);
      } else {
        mIdValues.put(i, paramView);
      }
    }
    paramTransitionValues = ViewCompat.getTransitionName(paramView);
    if (paramTransitionValues != null) {
      if (mNameValues.containsKey(paramTransitionValues)) {
        mNameValues.put(paramTransitionValues, null);
      } else {
        mNameValues.put(paramTransitionValues, paramView);
      }
    }
    if ((paramView.getParent() instanceof ListView))
    {
      paramTransitionValues = (ListView)paramView.getParent();
      if (paramTransitionValues.getAdapter().hasStableIds())
      {
        long l = paramTransitionValues.getItemIdAtPosition(paramTransitionValues.getPositionForView(paramView));
        if (mItemIdValues.indexOfKey(l) >= 0)
        {
          paramView = (View)mItemIdValues.get(l);
          if (paramView != null)
          {
            ViewCompat.setHasTransientState(paramView, false);
            mItemIdValues.put(l, null);
          }
        }
        else
        {
          ViewCompat.setHasTransientState(paramView, true);
          mItemIdValues.put(l, paramView);
        }
      }
    }
  }
  
  private static boolean alreadyContains(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt[paramInt];
    for (int j = 0; j < paramInt; j++) {
      if (paramArrayOfInt[j] == i) {
        return true;
      }
    }
    return false;
  }
  
  private void captureHierarchy(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return;
    }
    int i = paramView.getId();
    Object localObject = mTargetIdExcludes;
    if ((localObject != null) && (((ArrayList)localObject).contains(Integer.valueOf(i)))) {
      return;
    }
    localObject = mTargetExcludes;
    if ((localObject != null) && (((ArrayList)localObject).contains(paramView))) {
      return;
    }
    localObject = mTargetTypeExcludes;
    int j = 0;
    int m;
    if (localObject != null)
    {
      int k = ((ArrayList)localObject).size();
      for (m = 0; m < k; m++) {
        if (((Class)mTargetTypeExcludes.get(m)).isInstance(paramView)) {
          return;
        }
      }
    }
    if ((paramView.getParent() instanceof ViewGroup))
    {
      localObject = new TransitionValues(paramView);
      if (paramBoolean) {
        captureStartValues((TransitionValues)localObject);
      } else {
        captureEndValues((TransitionValues)localObject);
      }
      mTargetedTransitions.add(this);
      capturePropagationValues((TransitionValues)localObject);
      if (paramBoolean) {
        addViewValues(mStartValues, paramView, (TransitionValues)localObject);
      } else {
        addViewValues(mEndValues, paramView, (TransitionValues)localObject);
      }
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = mTargetIdChildExcludes;
      if ((localObject != null) && (((ArrayList)localObject).contains(Integer.valueOf(i)))) {
        return;
      }
      localObject = mTargetChildExcludes;
      if ((localObject != null) && (((ArrayList)localObject).contains(paramView))) {
        return;
      }
      localObject = mTargetTypeChildExcludes;
      if (localObject != null)
      {
        i = ((ArrayList)localObject).size();
        for (m = 0; m < i; m++) {
          if (((Class)mTargetTypeChildExcludes.get(m)).isInstance(paramView)) {
            return;
          }
        }
      }
      paramView = (ViewGroup)paramView;
      for (m = j; m < paramView.getChildCount(); m++) {
        captureHierarchy(paramView.getChildAt(m), paramBoolean);
      }
    }
  }
  
  private ArrayList<Integer> excludeId(ArrayList<Integer> paramArrayList, int paramInt, boolean paramBoolean)
  {
    Object localObject = paramArrayList;
    if (paramInt > 0) {
      if (paramBoolean) {
        localObject = ArrayListManager.add(paramArrayList, Integer.valueOf(paramInt));
      } else {
        localObject = ArrayListManager.remove(paramArrayList, Integer.valueOf(paramInt));
      }
    }
    return (ArrayList<Integer>)localObject;
  }
  
  private static <T> ArrayList<T> excludeObject(ArrayList<T> paramArrayList, T paramT, boolean paramBoolean)
  {
    Object localObject = paramArrayList;
    if (paramT != null) {
      if (paramBoolean) {
        localObject = ArrayListManager.add(paramArrayList, paramT);
      } else {
        localObject = ArrayListManager.remove(paramArrayList, paramT);
      }
    }
    return (ArrayList<T>)localObject;
  }
  
  private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> paramArrayList, Class<?> paramClass, boolean paramBoolean)
  {
    Object localObject = paramArrayList;
    if (paramClass != null) {
      if (paramBoolean) {
        localObject = ArrayListManager.add(paramArrayList, paramClass);
      } else {
        localObject = ArrayListManager.remove(paramArrayList, paramClass);
      }
    }
    return (ArrayList<Class<?>>)localObject;
  }
  
  private ArrayList<View> excludeView(ArrayList<View> paramArrayList, View paramView, boolean paramBoolean)
  {
    Object localObject = paramArrayList;
    if (paramView != null) {
      if (paramBoolean) {
        localObject = ArrayListManager.add(paramArrayList, paramView);
      } else {
        localObject = ArrayListManager.remove(paramArrayList, paramView);
      }
    }
    return (ArrayList<View>)localObject;
  }
  
  private static ArrayMap<Animator, AnimationInfo> getRunningAnimators()
  {
    ArrayMap localArrayMap1 = (ArrayMap)sRunningAnimators.get();
    ArrayMap localArrayMap2 = localArrayMap1;
    if (localArrayMap1 == null)
    {
      localArrayMap2 = new ArrayMap();
      sRunningAnimators.set(localArrayMap2);
    }
    return localArrayMap2;
  }
  
  private static boolean isValidMatch(int paramInt)
  {
    boolean bool = true;
    if ((paramInt < 1) || (paramInt > 4)) {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isValueChanged(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2, String paramString)
  {
    paramTransitionValues1 = values.get(paramString);
    paramTransitionValues2 = values.get(paramString);
    boolean bool1 = true;
    boolean bool2;
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null))
    {
      bool2 = false;
    }
    else
    {
      bool2 = bool1;
      if (paramTransitionValues1 != null) {
        if (paramTransitionValues2 == null) {
          bool2 = bool1;
        } else {
          bool2 = true ^ paramTransitionValues1.equals(paramTransitionValues2);
        }
      }
    }
    return bool2;
  }
  
  private void matchIds(ArrayMap<View, TransitionValues> paramArrayMap1, ArrayMap<View, TransitionValues> paramArrayMap2, SparseArray<View> paramSparseArray1, SparseArray<View> paramSparseArray2)
  {
    int i = paramSparseArray1.size();
    for (int j = 0; j < i; j++)
    {
      View localView1 = (View)paramSparseArray1.valueAt(j);
      if ((localView1 != null) && (isValidTarget(localView1)))
      {
        View localView2 = (View)paramSparseArray2.get(paramSparseArray1.keyAt(j));
        if ((localView2 != null) && (isValidTarget(localView2)))
        {
          TransitionValues localTransitionValues1 = (TransitionValues)paramArrayMap1.get(localView1);
          TransitionValues localTransitionValues2 = (TransitionValues)paramArrayMap2.get(localView2);
          if ((localTransitionValues1 != null) && (localTransitionValues2 != null))
          {
            mStartValuesList.add(localTransitionValues1);
            mEndValuesList.add(localTransitionValues2);
            paramArrayMap1.remove(localView1);
            paramArrayMap2.remove(localView2);
          }
        }
      }
    }
  }
  
  private void matchInstances(ArrayMap<View, TransitionValues> paramArrayMap1, ArrayMap<View, TransitionValues> paramArrayMap2)
  {
    for (int i = paramArrayMap1.size() - 1; i >= 0; i--)
    {
      Object localObject = (View)paramArrayMap1.keyAt(i);
      if ((localObject != null) && (isValidTarget((View)localObject)))
      {
        localObject = (TransitionValues)paramArrayMap2.remove(localObject);
        if ((localObject != null) && (isValidTarget(view)))
        {
          TransitionValues localTransitionValues = (TransitionValues)paramArrayMap1.removeAt(i);
          mStartValuesList.add(localTransitionValues);
          mEndValuesList.add(localObject);
        }
      }
    }
  }
  
  private void matchItemIds(ArrayMap<View, TransitionValues> paramArrayMap1, ArrayMap<View, TransitionValues> paramArrayMap2, LongSparseArray<View> paramLongSparseArray1, LongSparseArray<View> paramLongSparseArray2)
  {
    int i = paramLongSparseArray1.size();
    for (int j = 0; j < i; j++)
    {
      View localView1 = (View)paramLongSparseArray1.valueAt(j);
      if ((localView1 != null) && (isValidTarget(localView1)))
      {
        View localView2 = (View)paramLongSparseArray2.get(paramLongSparseArray1.keyAt(j));
        if ((localView2 != null) && (isValidTarget(localView2)))
        {
          TransitionValues localTransitionValues1 = (TransitionValues)paramArrayMap1.get(localView1);
          TransitionValues localTransitionValues2 = (TransitionValues)paramArrayMap2.get(localView2);
          if ((localTransitionValues1 != null) && (localTransitionValues2 != null))
          {
            mStartValuesList.add(localTransitionValues1);
            mEndValuesList.add(localTransitionValues2);
            paramArrayMap1.remove(localView1);
            paramArrayMap2.remove(localView2);
          }
        }
      }
    }
  }
  
  private void matchNames(ArrayMap<View, TransitionValues> paramArrayMap1, ArrayMap<View, TransitionValues> paramArrayMap2, ArrayMap<String, View> paramArrayMap3, ArrayMap<String, View> paramArrayMap4)
  {
    int i = paramArrayMap3.size();
    for (int j = 0; j < i; j++)
    {
      View localView1 = (View)paramArrayMap3.valueAt(j);
      if ((localView1 != null) && (isValidTarget(localView1)))
      {
        View localView2 = (View)paramArrayMap4.get(paramArrayMap3.keyAt(j));
        if ((localView2 != null) && (isValidTarget(localView2)))
        {
          TransitionValues localTransitionValues1 = (TransitionValues)paramArrayMap1.get(localView1);
          TransitionValues localTransitionValues2 = (TransitionValues)paramArrayMap2.get(localView2);
          if ((localTransitionValues1 != null) && (localTransitionValues2 != null))
          {
            mStartValuesList.add(localTransitionValues1);
            mEndValuesList.add(localTransitionValues2);
            paramArrayMap1.remove(localView1);
            paramArrayMap2.remove(localView2);
          }
        }
      }
    }
  }
  
  private void matchStartAndEnd(TransitionValuesMaps paramTransitionValuesMaps1, TransitionValuesMaps paramTransitionValuesMaps2)
  {
    ArrayMap localArrayMap1 = new ArrayMap(mViewValues);
    ArrayMap localArrayMap2 = new ArrayMap(mViewValues);
    for (int i = 0;; i++)
    {
      int[] arrayOfInt = mMatchOrder;
      if (i >= arrayOfInt.length) {
        break;
      }
      int j = arrayOfInt[i];
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j == 4) {
              matchItemIds(localArrayMap1, localArrayMap2, mItemIdValues, mItemIdValues);
            }
          }
          else {
            matchIds(localArrayMap1, localArrayMap2, mIdValues, mIdValues);
          }
        }
        else {
          matchNames(localArrayMap1, localArrayMap2, mNameValues, mNameValues);
        }
      }
      else {
        matchInstances(localArrayMap1, localArrayMap2);
      }
    }
    addUnmatched(localArrayMap1, localArrayMap2);
  }
  
  private static int[] parseMatchOrder(String paramString)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    paramString = new int[localStringTokenizer.countTokens()];
    int i = 0;
    while (localStringTokenizer.hasMoreTokens())
    {
      Object localObject = localStringTokenizer.nextToken().trim();
      if ("id".equalsIgnoreCase((String)localObject))
      {
        paramString[i] = 3;
      }
      else if ("instance".equalsIgnoreCase((String)localObject))
      {
        paramString[i] = 1;
      }
      else if ("name".equalsIgnoreCase((String)localObject))
      {
        paramString[i] = 2;
      }
      else if ("itemId".equalsIgnoreCase((String)localObject))
      {
        paramString[i] = 4;
      }
      else
      {
        if (!((String)localObject).isEmpty()) {
          break label133;
        }
        localObject = new int[paramString.length - 1];
        System.arraycopy(paramString, 0, localObject, 0, i);
        i--;
        paramString = (String)localObject;
      }
      i++;
      continue;
      label133:
      throw new InflateException(z2.p("Unknown match type in matchOrder: '", (String)localObject, "'"));
    }
    return paramString;
  }
  
  private void runAnimator(Animator paramAnimator, final ArrayMap<Animator, AnimationInfo> paramArrayMap)
  {
    if (paramAnimator != null)
    {
      paramAnimator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramArrayMap.remove(paramAnonymousAnimator);
          mCurrentAnimators.remove(paramAnonymousAnimator);
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          mCurrentAnimators.add(paramAnonymousAnimator);
        }
      });
      animate(paramAnimator);
    }
  }
  
  @NonNull
  public Transition addListener(@NonNull TransitionListener paramTransitionListener)
  {
    if (mListeners == null) {
      mListeners = new ArrayList();
    }
    mListeners.add(paramTransitionListener);
    return this;
  }
  
  @NonNull
  public Transition addTarget(@IdRes int paramInt)
  {
    if (paramInt != 0) {
      mTargetIds.add(Integer.valueOf(paramInt));
    }
    return this;
  }
  
  @NonNull
  public Transition addTarget(@NonNull View paramView)
  {
    mTargets.add(paramView);
    return this;
  }
  
  @NonNull
  public Transition addTarget(@NonNull Class<?> paramClass)
  {
    if (mTargetTypes == null) {
      mTargetTypes = new ArrayList();
    }
    mTargetTypes.add(paramClass);
    return this;
  }
  
  @NonNull
  public Transition addTarget(@NonNull String paramString)
  {
    if (mTargetNames == null) {
      mTargetNames = new ArrayList();
    }
    mTargetNames.add(paramString);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void animate(Animator paramAnimator)
  {
    if (paramAnimator == null)
    {
      end();
    }
    else
    {
      if (getDuration() >= 0L) {
        paramAnimator.setDuration(getDuration());
      }
      if (getStartDelay() >= 0L)
      {
        long l = getStartDelay();
        paramAnimator.setStartDelay(paramAnimator.getStartDelay() + l);
      }
      if (getInterpolator() != null) {
        paramAnimator.setInterpolator(getInterpolator());
      }
      paramAnimator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          end();
          paramAnonymousAnimator.removeListener(this);
        }
      });
      paramAnimator.start();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void cancel()
  {
    for (int i = mCurrentAnimators.size() - 1; i >= 0; i--) {
      ((Animator)mCurrentAnimators.get(i)).cancel();
    }
    ArrayList localArrayList = mListeners;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      localArrayList = (ArrayList)mListeners.clone();
      int j = localArrayList.size();
      for (i = 0; i < j; i++) {
        ((TransitionListener)localArrayList.get(i)).onTransitionCancel(this);
      }
    }
  }
  
  public abstract void captureEndValues(@NonNull TransitionValues paramTransitionValues);
  
  public void capturePropagationValues(TransitionValues paramTransitionValues)
  {
    if ((mPropagation != null) && (!values.isEmpty()))
    {
      String[] arrayOfString = mPropagation.getPropagationProperties();
      if (arrayOfString == null) {
        return;
      }
      int i = 0;
      for (int j = 0; j < arrayOfString.length; j++) {
        if (!values.containsKey(arrayOfString[j]))
        {
          j = i;
          break label75;
        }
      }
      j = 1;
      label75:
      if (j == 0) {
        mPropagation.captureValues(paramTransitionValues);
      }
    }
  }
  
  public abstract void captureStartValues(@NonNull TransitionValues paramTransitionValues);
  
  public void captureValues(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    clearValues(paramBoolean);
    int i = mTargetIds.size();
    int j = 0;
    Object localObject1;
    if ((i > 0) || (mTargets.size() > 0))
    {
      localObject1 = mTargetNames;
      if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
      {
        localObject1 = mTargetTypes;
        if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty())) {
          break label80;
        }
      }
    }
    captureHierarchy(paramViewGroup, paramBoolean);
    break label302;
    label80:
    Object localObject2;
    for (i = 0; i < mTargetIds.size(); i++)
    {
      localObject2 = paramViewGroup.findViewById(((Integer)mTargetIds.get(i)).intValue());
      if (localObject2 != null)
      {
        localObject1 = new TransitionValues((View)localObject2);
        if (paramBoolean) {
          captureStartValues((TransitionValues)localObject1);
        } else {
          captureEndValues((TransitionValues)localObject1);
        }
        mTargetedTransitions.add(this);
        capturePropagationValues((TransitionValues)localObject1);
        if (paramBoolean) {
          addViewValues(mStartValues, (View)localObject2, (TransitionValues)localObject1);
        } else {
          addViewValues(mEndValues, (View)localObject2, (TransitionValues)localObject1);
        }
      }
    }
    for (i = 0; i < mTargets.size(); i++)
    {
      paramViewGroup = (View)mTargets.get(i);
      localObject1 = new TransitionValues(paramViewGroup);
      if (paramBoolean) {
        captureStartValues((TransitionValues)localObject1);
      } else {
        captureEndValues((TransitionValues)localObject1);
      }
      mTargetedTransitions.add(this);
      capturePropagationValues((TransitionValues)localObject1);
      if (paramBoolean) {
        addViewValues(mStartValues, paramViewGroup, (TransitionValues)localObject1);
      } else {
        addViewValues(mEndValues, paramViewGroup, (TransitionValues)localObject1);
      }
    }
    label302:
    if (!paramBoolean)
    {
      paramViewGroup = mNameOverrides;
      if (paramViewGroup != null)
      {
        int k = paramViewGroup.size();
        paramViewGroup = new ArrayList(k);
        int m;
        for (i = 0;; i++)
        {
          m = j;
          if (i >= k) {
            break;
          }
          localObject1 = (String)mNameOverrides.keyAt(i);
          paramViewGroup.add(mStartValues.mNameValues.remove(localObject1));
        }
        while (m < k)
        {
          localObject1 = (View)paramViewGroup.get(m);
          if (localObject1 != null)
          {
            localObject2 = (String)mNameOverrides.valueAt(m);
            mStartValues.mNameValues.put(localObject2, localObject1);
          }
          m++;
        }
      }
    }
  }
  
  public void clearValues(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      mStartValues.mViewValues.clear();
      mStartValues.mIdValues.clear();
      mStartValues.mItemIdValues.clear();
    }
    else
    {
      mEndValues.mViewValues.clear();
      mEndValues.mIdValues.clear();
      mEndValues.mItemIdValues.clear();
    }
  }
  
  public Transition clone()
  {
    try
    {
      Transition localTransition = (Transition)super.clone();
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      mAnimators = ((ArrayList)localObject);
      localObject = new androidx/transition/TransitionValuesMaps;
      ((TransitionValuesMaps)localObject).<init>();
      mStartValues = ((TransitionValuesMaps)localObject);
      localObject = new androidx/transition/TransitionValuesMaps;
      ((TransitionValuesMaps)localObject).<init>();
      mEndValues = ((TransitionValuesMaps)localObject);
      mStartValuesList = null;
      mEndValuesList = null;
      return localTransition;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  @Nullable
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, @Nullable TransitionValues paramTransitionValues1, @Nullable TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void createAnimators(ViewGroup paramViewGroup, TransitionValuesMaps paramTransitionValuesMaps1, TransitionValuesMaps paramTransitionValuesMaps2, ArrayList<TransitionValues> paramArrayList1, ArrayList<TransitionValues> paramArrayList2)
  {
    ArrayMap localArrayMap = getRunningAnimators();
    SparseIntArray localSparseIntArray = new SparseIntArray();
    int i = paramArrayList1.size();
    long l1 = Long.MAX_VALUE;
    int j = 0;
    long l2;
    while (j < i)
    {
      Object localObject1 = (TransitionValues)paramArrayList1.get(j);
      paramTransitionValuesMaps1 = (TransitionValues)paramArrayList2.get(j);
      Object localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!mTargetedTransitions.contains(this)) {
          localObject2 = null;
        }
      }
      TransitionValuesMaps localTransitionValuesMaps = paramTransitionValuesMaps1;
      if (paramTransitionValuesMaps1 != null)
      {
        localTransitionValuesMaps = paramTransitionValuesMaps1;
        if (!mTargetedTransitions.contains(this)) {
          localTransitionValuesMaps = null;
        }
      }
      if ((localObject2 == null) && (localTransitionValuesMaps == null)) {}
      int k;
      do
      {
        do
        {
          l2 = l1;
          break;
          if ((localObject2 != null) && (localTransitionValuesMaps != null) && (!isTransitionRequired((TransitionValues)localObject2, localTransitionValuesMaps))) {
            k = 0;
          } else {
            k = 1;
          }
        } while (k == 0);
        paramTransitionValuesMaps1 = createAnimator(paramViewGroup, (TransitionValues)localObject2, localTransitionValuesMaps);
      } while (paramTransitionValuesMaps1 == null);
      Object localObject3;
      Object localObject4;
      if (localTransitionValuesMaps != null)
      {
        localObject3 = view;
        localObject1 = getTransitionProperties();
        if ((localObject1 != null) && (localObject1.length > 0))
        {
          localObject4 = new TransitionValues((View)localObject3);
          TransitionValues localTransitionValues = (TransitionValues)mViewValues.get(localObject3);
          if (localTransitionValues != null) {
            for (k = 0; k < localObject1.length; k++)
            {
              Map localMap = values;
              Object localObject5 = localObject1[k];
              localMap.put(localObject5, values.get(localObject5));
            }
          }
          int m = localArrayMap.size();
          for (k = 0; k < m; k++)
          {
            localObject1 = (AnimationInfo)localArrayMap.get((Animator)localArrayMap.keyAt(k));
            if ((mValues != null) && (mView == localObject3) && (mName.equals(getName())) && (mValues.equals(localObject4)))
            {
              paramTransitionValuesMaps1 = null;
              localObject1 = localObject4;
              break label400;
            }
          }
          localObject1 = localObject4;
        }
        else
        {
          localObject1 = null;
        }
        label400:
        localObject4 = localObject1;
        localObject1 = localObject3;
      }
      else
      {
        localObject1 = view;
        localObject4 = null;
      }
      l2 = l1;
      if (paramTransitionValuesMaps1 != null)
      {
        localObject3 = mPropagation;
        l2 = l1;
        if (localObject3 != null)
        {
          l2 = ((TransitionPropagation)localObject3).getStartDelay(paramViewGroup, this, (TransitionValues)localObject2, localTransitionValuesMaps);
          localSparseIntArray.put(mAnimators.size(), (int)l2);
          l2 = Math.min(l2, l1);
        }
        localArrayMap.put(paramTransitionValuesMaps1, new AnimationInfo((View)localObject1, getName(), this, ViewUtils.getWindowId(paramViewGroup), (TransitionValues)localObject4));
        mAnimators.add(paramTransitionValuesMaps1);
      }
      j++;
      l1 = l2;
    }
    if (localSparseIntArray.size() != 0) {
      for (i = 0; i < localSparseIntArray.size(); i++)
      {
        j = localSparseIntArray.keyAt(i);
        paramViewGroup = (Animator)mAnimators.get(j);
        l2 = localSparseIntArray.valueAt(i);
        paramViewGroup.setStartDelay(paramViewGroup.getStartDelay() + (l2 - l1));
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void end()
  {
    int i = mNumInstances - 1;
    mNumInstances = i;
    if (i == 0)
    {
      Object localObject = mListeners;
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = (ArrayList)mListeners.clone();
        int j = ((ArrayList)localObject).size();
        for (i = 0; i < j; i++) {
          ((TransitionListener)((ArrayList)localObject).get(i)).onTransitionEnd(this);
        }
      }
      for (i = 0; i < mStartValues.mItemIdValues.size(); i++)
      {
        localObject = (View)mStartValues.mItemIdValues.valueAt(i);
        if (localObject != null) {
          ViewCompat.setHasTransientState((View)localObject, false);
        }
      }
      for (i = 0; i < mEndValues.mItemIdValues.size(); i++)
      {
        localObject = (View)mEndValues.mItemIdValues.valueAt(i);
        if (localObject != null) {
          ViewCompat.setHasTransientState((View)localObject, false);
        }
      }
      mEnded = true;
    }
  }
  
  @NonNull
  public Transition excludeChildren(@IdRes int paramInt, boolean paramBoolean)
  {
    mTargetIdChildExcludes = excludeId(mTargetIdChildExcludes, paramInt, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeChildren(@NonNull View paramView, boolean paramBoolean)
  {
    mTargetChildExcludes = excludeView(mTargetChildExcludes, paramView, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeChildren(@NonNull Class<?> paramClass, boolean paramBoolean)
  {
    mTargetTypeChildExcludes = excludeType(mTargetTypeChildExcludes, paramClass, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeTarget(@IdRes int paramInt, boolean paramBoolean)
  {
    mTargetIdExcludes = excludeId(mTargetIdExcludes, paramInt, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull View paramView, boolean paramBoolean)
  {
    mTargetExcludes = excludeView(mTargetExcludes, paramView, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull Class<?> paramClass, boolean paramBoolean)
  {
    mTargetTypeExcludes = excludeType(mTargetTypeExcludes, paramClass, paramBoolean);
    return this;
  }
  
  @NonNull
  public Transition excludeTarget(@NonNull String paramString, boolean paramBoolean)
  {
    mTargetNameExcludes = excludeObject(mTargetNameExcludes, paramString, paramBoolean);
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void forceToEnd(ViewGroup paramViewGroup)
  {
    Object localObject = getRunningAnimators();
    int i = ((SimpleArrayMap)localObject).size();
    if ((paramViewGroup != null) && (i != 0))
    {
      paramViewGroup = ViewUtils.getWindowId(paramViewGroup);
      ArrayMap localArrayMap = new ArrayMap((SimpleArrayMap)localObject);
      ((SimpleArrayMap)localObject).clear();
      i--;
      while (i >= 0)
      {
        localObject = (AnimationInfo)localArrayMap.valueAt(i);
        if ((mView != null) && (paramViewGroup != null) && (paramViewGroup.equals(mWindowId))) {
          ((Animator)localArrayMap.keyAt(i)).end();
        }
        i--;
      }
    }
  }
  
  public long getDuration()
  {
    return mDuration;
  }
  
  @Nullable
  public Rect getEpicenter()
  {
    EpicenterCallback localEpicenterCallback = mEpicenterCallback;
    if (localEpicenterCallback == null) {
      return null;
    }
    return localEpicenterCallback.onGetEpicenter(this);
  }
  
  @Nullable
  public EpicenterCallback getEpicenterCallback()
  {
    return mEpicenterCallback;
  }
  
  @Nullable
  public TimeInterpolator getInterpolator()
  {
    return mInterpolator;
  }
  
  public TransitionValues getMatchedTransitionValues(View paramView, boolean paramBoolean)
  {
    Object localObject1 = mParent;
    if (localObject1 != null) {
      return ((Transition)localObject1).getMatchedTransitionValues(paramView, paramBoolean);
    }
    if (paramBoolean) {
      localObject1 = mStartValuesList;
    } else {
      localObject1 = mEndValuesList;
    }
    Object localObject2 = null;
    if (localObject1 == null) {
      return null;
    }
    int i = ((ArrayList)localObject1).size();
    int j = -1;
    int m;
    for (int k = 0;; k++)
    {
      m = j;
      if (k >= i) {
        break;
      }
      TransitionValues localTransitionValues = (TransitionValues)((ArrayList)localObject1).get(k);
      if (localTransitionValues == null) {
        return null;
      }
      if (view == paramView)
      {
        m = k;
        break;
      }
    }
    paramView = (View)localObject2;
    if (m >= 0)
    {
      if (paramBoolean) {
        paramView = mEndValuesList;
      } else {
        paramView = mStartValuesList;
      }
      paramView = (TransitionValues)paramView.get(m);
    }
    return paramView;
  }
  
  @NonNull
  public String getName()
  {
    return mName;
  }
  
  @NonNull
  public PathMotion getPathMotion()
  {
    return mPathMotion;
  }
  
  @Nullable
  public TransitionPropagation getPropagation()
  {
    return mPropagation;
  }
  
  public long getStartDelay()
  {
    return mStartDelay;
  }
  
  @NonNull
  public List<Integer> getTargetIds()
  {
    return mTargetIds;
  }
  
  @Nullable
  public List<String> getTargetNames()
  {
    return mTargetNames;
  }
  
  @Nullable
  public List<Class<?>> getTargetTypes()
  {
    return mTargetTypes;
  }
  
  @NonNull
  public List<View> getTargets()
  {
    return mTargets;
  }
  
  @Nullable
  public String[] getTransitionProperties()
  {
    return null;
  }
  
  @Nullable
  public TransitionValues getTransitionValues(@NonNull View paramView, boolean paramBoolean)
  {
    Object localObject = mParent;
    if (localObject != null) {
      return ((Transition)localObject).getTransitionValues(paramView, paramBoolean);
    }
    if (paramBoolean) {
      localObject = mStartValues;
    } else {
      localObject = mEndValues;
    }
    return (TransitionValues)mViewValues.get(paramView);
  }
  
  public boolean isTransitionRequired(@Nullable TransitionValues paramTransitionValues1, @Nullable TransitionValues paramTransitionValues2)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramTransitionValues1 != null)
    {
      bool2 = bool1;
      if (paramTransitionValues2 != null)
      {
        Object localObject = getTransitionProperties();
        if (localObject != null)
        {
          int i = localObject.length;
          for (int j = 0;; j++)
          {
            bool2 = bool1;
            if (j >= i) {
              break label117;
            }
            if (isValueChanged(paramTransitionValues1, paramTransitionValues2, localObject[j])) {
              break;
            }
          }
        }
        localObject = values.keySet().iterator();
        do
        {
          bool2 = bool1;
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
        } while (!isValueChanged(paramTransitionValues1, paramTransitionValues2, (String)((Iterator)localObject).next()));
        bool2 = true;
      }
    }
    label117:
    return bool2;
  }
  
  public boolean isValidTarget(View paramView)
  {
    int i = paramView.getId();
    ArrayList localArrayList = mTargetIdExcludes;
    if ((localArrayList != null) && (localArrayList.contains(Integer.valueOf(i)))) {
      return false;
    }
    localArrayList = mTargetExcludes;
    if ((localArrayList != null) && (localArrayList.contains(paramView))) {
      return false;
    }
    localArrayList = mTargetTypeExcludes;
    int k;
    if (localArrayList != null)
    {
      int j = localArrayList.size();
      for (k = 0; k < j; k++) {
        if (((Class)mTargetTypeExcludes.get(k)).isInstance(paramView)) {
          return false;
        }
      }
    }
    if ((mTargetNameExcludes != null) && (ViewCompat.getTransitionName(paramView) != null) && (mTargetNameExcludes.contains(ViewCompat.getTransitionName(paramView)))) {
      return false;
    }
    if ((mTargetIds.size() == 0) && (mTargets.size() == 0))
    {
      localArrayList = mTargetTypes;
      if ((localArrayList == null) || (localArrayList.isEmpty()))
      {
        localArrayList = mTargetNames;
        if ((localArrayList == null) || (localArrayList.isEmpty())) {
          return true;
        }
      }
    }
    if ((!mTargetIds.contains(Integer.valueOf(i))) && (!mTargets.contains(paramView)))
    {
      localArrayList = mTargetNames;
      if ((localArrayList != null) && (localArrayList.contains(ViewCompat.getTransitionName(paramView)))) {
        return true;
      }
      if (mTargetTypes != null) {
        for (k = 0; k < mTargetTypes.size(); k++) {
          if (((Class)mTargetTypes.get(k)).isInstance(paramView)) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void pause(View paramView)
  {
    if (!mEnded)
    {
      ArrayMap localArrayMap = getRunningAnimators();
      int i = localArrayMap.size();
      WindowIdImpl localWindowIdImpl = ViewUtils.getWindowId(paramView);
      i--;
      while (i >= 0)
      {
        paramView = (AnimationInfo)localArrayMap.valueAt(i);
        if ((mView != null) && (localWindowIdImpl.equals(mWindowId))) {
          AnimatorUtils.pause((Animator)localArrayMap.keyAt(i));
        }
        i--;
      }
      paramView = mListeners;
      if ((paramView != null) && (paramView.size() > 0))
      {
        paramView = (ArrayList)mListeners.clone();
        int j = paramView.size();
        for (i = 0; i < j; i++) {
          ((TransitionListener)paramView.get(i)).onTransitionPause(this);
        }
      }
      mPaused = true;
    }
  }
  
  public void playTransition(ViewGroup paramViewGroup)
  {
    mStartValuesList = new ArrayList();
    mEndValuesList = new ArrayList();
    matchStartAndEnd(mStartValues, mEndValues);
    ArrayMap localArrayMap = getRunningAnimators();
    int i = localArrayMap.size();
    WindowIdImpl localWindowIdImpl = ViewUtils.getWindowId(paramViewGroup);
    i--;
    while (i >= 0)
    {
      Animator localAnimator = (Animator)localArrayMap.keyAt(i);
      if (localAnimator != null)
      {
        AnimationInfo localAnimationInfo = (AnimationInfo)localArrayMap.get(localAnimator);
        if ((localAnimationInfo != null) && (mView != null) && (localWindowIdImpl.equals(mWindowId)))
        {
          TransitionValues localTransitionValues1 = mValues;
          View localView = mView;
          TransitionValues localTransitionValues2 = getTransitionValues(localView, true);
          TransitionValues localTransitionValues3 = getMatchedTransitionValues(localView, true);
          TransitionValues localTransitionValues4 = localTransitionValues3;
          if (localTransitionValues2 == null)
          {
            localTransitionValues4 = localTransitionValues3;
            if (localTransitionValues3 == null) {
              localTransitionValues4 = (TransitionValues)mEndValues.mViewValues.get(localView);
            }
          }
          int j;
          if (((localTransitionValues2 != null) || (localTransitionValues4 != null)) && (mTransition.isTransitionRequired(localTransitionValues1, localTransitionValues4))) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0) {
            if ((!localAnimator.isRunning()) && (!localAnimator.isStarted())) {
              localArrayMap.remove(localAnimator);
            } else {
              localAnimator.cancel();
            }
          }
        }
      }
      i--;
    }
    createAnimators(paramViewGroup, mStartValues, mEndValues, mStartValuesList, mEndValuesList);
    runAnimators();
  }
  
  @NonNull
  public Transition removeListener(@NonNull TransitionListener paramTransitionListener)
  {
    ArrayList localArrayList = mListeners;
    if (localArrayList == null) {
      return this;
    }
    localArrayList.remove(paramTransitionListener);
    if (mListeners.size() == 0) {
      mListeners = null;
    }
    return this;
  }
  
  @NonNull
  public Transition removeTarget(@IdRes int paramInt)
  {
    if (paramInt != 0) {
      mTargetIds.remove(Integer.valueOf(paramInt));
    }
    return this;
  }
  
  @NonNull
  public Transition removeTarget(@NonNull View paramView)
  {
    mTargets.remove(paramView);
    return this;
  }
  
  @NonNull
  public Transition removeTarget(@NonNull Class<?> paramClass)
  {
    ArrayList localArrayList = mTargetTypes;
    if (localArrayList != null) {
      localArrayList.remove(paramClass);
    }
    return this;
  }
  
  @NonNull
  public Transition removeTarget(@NonNull String paramString)
  {
    ArrayList localArrayList = mTargetNames;
    if (localArrayList != null) {
      localArrayList.remove(paramString);
    }
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void resume(View paramView)
  {
    if (mPaused)
    {
      if (!mEnded)
      {
        ArrayMap localArrayMap = getRunningAnimators();
        int i = localArrayMap.size();
        WindowIdImpl localWindowIdImpl = ViewUtils.getWindowId(paramView);
        i--;
        while (i >= 0)
        {
          paramView = (AnimationInfo)localArrayMap.valueAt(i);
          if ((mView != null) && (localWindowIdImpl.equals(mWindowId))) {
            AnimatorUtils.resume((Animator)localArrayMap.keyAt(i));
          }
          i--;
        }
        paramView = mListeners;
        if ((paramView != null) && (paramView.size() > 0))
        {
          paramView = (ArrayList)mListeners.clone();
          int j = paramView.size();
          for (i = 0; i < j; i++) {
            ((TransitionListener)paramView.get(i)).onTransitionResume(this);
          }
        }
      }
      mPaused = false;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void runAnimators()
  {
    start();
    ArrayMap localArrayMap = getRunningAnimators();
    Iterator localIterator = mAnimators.iterator();
    while (localIterator.hasNext())
    {
      Animator localAnimator = (Animator)localIterator.next();
      if (localArrayMap.containsKey(localAnimator))
      {
        start();
        runAnimator(localAnimator, localArrayMap);
      }
    }
    mAnimators.clear();
    end();
  }
  
  public void setCanRemoveViews(boolean paramBoolean)
  {
    mCanRemoveViews = paramBoolean;
  }
  
  @NonNull
  public Transition setDuration(long paramLong)
  {
    mDuration = paramLong;
    return this;
  }
  
  public void setEpicenterCallback(@Nullable EpicenterCallback paramEpicenterCallback)
  {
    mEpicenterCallback = paramEpicenterCallback;
  }
  
  @NonNull
  public Transition setInterpolator(@Nullable TimeInterpolator paramTimeInterpolator)
  {
    mInterpolator = paramTimeInterpolator;
    return this;
  }
  
  public void setMatchOrder(int... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length != 0))
    {
      int i = 0;
      while (i < paramVarArgs.length) {
        if (isValidMatch(paramVarArgs[i]))
        {
          if (!alreadyContains(paramVarArgs, i)) {
            i++;
          } else {
            throw new IllegalArgumentException("matches contains a duplicate value");
          }
        }
        else {
          throw new IllegalArgumentException("matches contains invalid value");
        }
      }
      mMatchOrder = ((int[])paramVarArgs.clone());
    }
    else
    {
      mMatchOrder = DEFAULT_MATCH_ORDER;
    }
  }
  
  public void setPathMotion(@Nullable PathMotion paramPathMotion)
  {
    if (paramPathMotion == null) {
      mPathMotion = STRAIGHT_PATH_MOTION;
    } else {
      mPathMotion = paramPathMotion;
    }
  }
  
  public void setPropagation(@Nullable TransitionPropagation paramTransitionPropagation)
  {
    mPropagation = paramTransitionPropagation;
  }
  
  public Transition setSceneRoot(ViewGroup paramViewGroup)
  {
    mSceneRoot = paramViewGroup;
    return this;
  }
  
  @NonNull
  public Transition setStartDelay(long paramLong)
  {
    mStartDelay = paramLong;
    return this;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void start()
  {
    if (mNumInstances == 0)
    {
      ArrayList localArrayList = mListeners;
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        localArrayList = (ArrayList)mListeners.clone();
        int i = localArrayList.size();
        for (int j = 0; j < i; j++) {
          ((TransitionListener)localArrayList.get(j)).onTransitionStart(this);
        }
      }
      mEnded = false;
    }
    mNumInstances += 1;
  }
  
  public String toString()
  {
    return toString("");
  }
  
  public String toString(String paramString)
  {
    paramString = z2.t(paramString);
    paramString.append(getClass().getSimpleName());
    paramString.append("@");
    paramString.append(Integer.toHexString(hashCode()));
    paramString.append(": ");
    String str = paramString.toString();
    paramString = str;
    if (mDuration != -1L) {
      paramString = z2.r(z2.u(str, "dur("), mDuration, ") ");
    }
    str = paramString;
    if (mStartDelay != -1L) {
      str = z2.r(z2.u(paramString, "dly("), mStartDelay, ") ");
    }
    paramString = str;
    if (mInterpolator != null)
    {
      paramString = z2.u(str, "interp(");
      paramString.append(mInterpolator);
      paramString.append(") ");
      paramString = paramString.toString();
    }
    if (mTargetIds.size() <= 0)
    {
      str = paramString;
      if (mTargets.size() <= 0) {}
    }
    else
    {
      str = z2.o(paramString, "tgts(");
      int i = mTargetIds.size();
      int j = 0;
      paramString = str;
      if (i > 0) {
        for (i = 0;; i++)
        {
          paramString = str;
          if (i >= mTargetIds.size()) {
            break;
          }
          paramString = str;
          if (i > 0) {
            paramString = z2.o(str, ", ");
          }
          paramString = z2.t(paramString);
          paramString.append(mTargetIds.get(i));
          str = paramString.toString();
        }
      }
      str = paramString;
      if (mTargets.size() > 0) {
        for (i = j;; i++)
        {
          str = paramString;
          if (i >= mTargets.size()) {
            break;
          }
          str = paramString;
          if (i > 0) {
            str = z2.o(paramString, ", ");
          }
          paramString = z2.t(str);
          paramString.append(mTargets.get(i));
          paramString = paramString.toString();
        }
      }
      str = z2.o(str, ")");
    }
    return str;
  }
  
  public static class AnimationInfo
  {
    public String mName;
    public Transition mTransition;
    public TransitionValues mValues;
    public View mView;
    public WindowIdImpl mWindowId;
    
    public AnimationInfo(View paramView, String paramString, Transition paramTransition, WindowIdImpl paramWindowIdImpl, TransitionValues paramTransitionValues)
    {
      mView = paramView;
      mName = paramString;
      mValues = paramTransitionValues;
      mWindowId = paramWindowIdImpl;
      mTransition = paramTransition;
    }
  }
  
  public static class ArrayListManager
  {
    public static <T> ArrayList<T> add(ArrayList<T> paramArrayList, T paramT)
    {
      Object localObject = paramArrayList;
      if (paramArrayList == null) {
        localObject = new ArrayList();
      }
      if (!((ArrayList)localObject).contains(paramT)) {
        ((ArrayList)localObject).add(paramT);
      }
      return (ArrayList<T>)localObject;
    }
    
    public static <T> ArrayList<T> remove(ArrayList<T> paramArrayList, T paramT)
    {
      ArrayList<T> localArrayList = paramArrayList;
      if (paramArrayList != null)
      {
        paramArrayList.remove(paramT);
        localArrayList = paramArrayList;
        if (paramArrayList.isEmpty()) {
          localArrayList = null;
        }
      }
      return localArrayList;
    }
  }
  
  public static abstract class EpicenterCallback
  {
    public abstract Rect onGetEpicenter(@NonNull Transition paramTransition);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface MatchOrder {}
  
  public static abstract interface TransitionListener
  {
    public abstract void onTransitionCancel(@NonNull Transition paramTransition);
    
    public abstract void onTransitionEnd(@NonNull Transition paramTransition);
    
    public abstract void onTransitionPause(@NonNull Transition paramTransition);
    
    public abstract void onTransitionResume(@NonNull Transition paramTransition);
    
    public abstract void onTransitionStart(@NonNull Transition paramTransition);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Transition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */