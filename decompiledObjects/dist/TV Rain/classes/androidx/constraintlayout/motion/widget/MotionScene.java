package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

public class MotionScene
{
  public static final int ANTICIPATE = 6;
  public static final int BOUNCE = 4;
  private static final String CONSTRAINTSET_TAG = "ConstraintSet";
  private static final boolean DEBUG = false;
  public static final int EASE_IN = 1;
  public static final int EASE_IN_OUT = 0;
  public static final int EASE_OUT = 2;
  private static final String INCLUDE_TAG = "include";
  private static final String INCLUDE_TAG_UC = "Include";
  private static final int INTERPOLATOR_REFERENCE_ID = -2;
  private static final String KEYFRAMESET_TAG = "KeyFrameSet";
  public static final int LAYOUT_CALL_MEASURE = 2;
  public static final int LAYOUT_HONOR_REQUEST = 1;
  public static final int LAYOUT_IGNORE_REQUEST = 0;
  public static final int LINEAR = 3;
  private static final int MIN_DURATION = 8;
  private static final String MOTIONSCENE_TAG = "MotionScene";
  private static final String ONCLICK_TAG = "OnClick";
  private static final String ONSWIPE_TAG = "OnSwipe";
  public static final int OVERSHOOT = 5;
  private static final int SPLINE_STRING = -1;
  private static final String STATESET_TAG = "StateSet";
  private static final String TAG = "MotionScene";
  public static final int TRANSITION_BACKWARD = 0;
  public static final int TRANSITION_FORWARD = 1;
  private static final String TRANSITION_TAG = "Transition";
  public static final int UNSET = -1;
  private static final String VIEW_TRANSITION = "ViewTransition";
  private boolean DEBUG_DESKTOP = false;
  private ArrayList<Transition> mAbstractTransitionList = new ArrayList();
  private HashMap<String, Integer> mConstraintSetIdMap = new HashMap();
  private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray();
  public Transition mCurrentTransition = null;
  private int mDefaultDuration = 400;
  private Transition mDefaultTransition = null;
  private SparseIntArray mDeriveMap = new SparseIntArray();
  private boolean mDisableAutoTransition = false;
  private boolean mIgnoreTouch = false;
  private MotionEvent mLastTouchDown;
  public float mLastTouchX;
  public float mLastTouchY;
  private int mLayoutDuringTransition = 0;
  private final MotionLayout mMotionLayout;
  private boolean mMotionOutsideRegion = false;
  private boolean mRtl;
  public StateSet mStateSet = null;
  private ArrayList<Transition> mTransitionList = new ArrayList();
  private MotionLayout.MotionTracker mVelocityTracker;
  public final ViewTransitionController mViewTransitionController;
  
  public MotionScene(Context paramContext, MotionLayout paramMotionLayout, int paramInt)
  {
    mMotionLayout = paramMotionLayout;
    mViewTransitionController = new ViewTransitionController(paramMotionLayout);
    load(paramContext, paramInt);
    paramContext = mConstraintSetMap;
    paramInt = R.id.motion_base;
    paramContext.put(paramInt, new ConstraintSet());
    mConstraintSetIdMap.put("motion_base", Integer.valueOf(paramInt));
  }
  
  public MotionScene(MotionLayout paramMotionLayout)
  {
    mMotionLayout = paramMotionLayout;
    mViewTransitionController = new ViewTransitionController(paramMotionLayout);
  }
  
  private int getId(Context paramContext, String paramString)
  {
    int j;
    if (paramString.contains("/"))
    {
      Object localObject = paramString.substring(paramString.indexOf('/') + 1);
      i = paramContext.getResources().getIdentifier((String)localObject, "id", paramContext.getPackageName());
      j = i;
      if (DEBUG_DESKTOP)
      {
        localObject = System.out;
        paramContext = new StringBuilder();
        paramContext.append("id getMap res = ");
        paramContext.append(i);
        ((PrintStream)localObject).println(paramContext.toString());
        j = i;
      }
    }
    else
    {
      j = -1;
    }
    int i = j;
    if (j == -1) {
      if (paramString.length() > 1)
      {
        i = Integer.parseInt(paramString.substring(1));
      }
      else
      {
        Log.e("MotionScene", "error in parsing id");
        i = j;
      }
    }
    return i;
  }
  
  private int getIndex(Transition paramTransition)
  {
    int i = Transition.access$300(paramTransition);
    if (i != -1)
    {
      for (int j = 0; j < mTransitionList.size(); j++) {
        if (Transition.access$300((Transition)mTransitionList.get(j)) == i) {
          return j;
        }
      }
      return -1;
    }
    throw new IllegalArgumentException("The transition must have an id");
  }
  
  public static String getLine(Context paramContext, int paramInt, XmlPullParser paramXmlPullParser)
  {
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(Debug.getName(paramContext, paramInt));
    localStringBuilder.append(".xml:");
    localStringBuilder.append(paramXmlPullParser.getLineNumber());
    localStringBuilder.append(") \"");
    localStringBuilder.append(paramXmlPullParser.getName());
    localStringBuilder.append("\"");
    return localStringBuilder.toString();
  }
  
  private int getRealID(int paramInt)
  {
    StateSet localStateSet = mStateSet;
    if (localStateSet != null)
    {
      int i = localStateSet.stateGetConstraintID(paramInt, -1, -1);
      if (i != -1) {
        return i;
      }
    }
    return paramInt;
  }
  
  private boolean hasCycleDependency(int paramInt)
  {
    int i = mDeriveMap.get(paramInt);
    for (int j = mDeriveMap.size(); i > 0; j--)
    {
      if (i == paramInt) {
        return true;
      }
      if (j < 0) {
        return true;
      }
      i = mDeriveMap.get(i);
    }
    return false;
  }
  
  private boolean isProcessingTouch()
  {
    boolean bool;
    if (mVelocityTracker != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void load(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    Object localObject1 = null;
    try
    {
      int i = localXmlResourceParser.getEventType();
      for (;;)
      {
        int j = 1;
        if (i == 1) {
          break;
        }
        Object localObject2;
        if (i != 0)
        {
          if (i != 2)
          {
            localObject2 = localObject1;
          }
          else
          {
            localObject2 = localXmlResourceParser.getName();
            Object localObject3;
            if (DEBUG_DESKTOP)
            {
              PrintStream localPrintStream = System.out;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("parsing = ");
              ((StringBuilder)localObject3).append((String)localObject2);
              localPrintStream.println(((StringBuilder)localObject3).toString());
            }
            i = ((String)localObject2).hashCode();
            switch (i)
            {
            default: 
              break;
            case 1942574248: 
              if (((String)localObject2).equals("include")) {
                i = 6;
              }
              break;
            case 1382829617: 
              if (((String)localObject2).equals("StateSet")) {
                i = 4;
              }
              break;
            case 793277014: 
              if (((String)localObject2).equals("MotionScene")) {
                i = 0;
              }
              break;
            case 327855227: 
              if (((String)localObject2).equals("OnSwipe")) {
                i = 2;
              }
              break;
            case 312750793: 
              if (((String)localObject2).equals("OnClick")) {
                i = 3;
              }
              break;
            case 269306229: 
              if (((String)localObject2).equals("Transition")) {
                i = j;
              }
              break;
            case 61998586: 
              if (((String)localObject2).equals("ViewTransition")) {
                i = 9;
              }
              break;
            case -687739768: 
              if (((String)localObject2).equals("Include")) {
                i = 7;
              }
              break;
            case -1239391468: 
              if (((String)localObject2).equals("KeyFrameSet")) {
                i = 8;
              }
              break;
            case -1349929691: 
              if (((String)localObject2).equals("ConstraintSet")) {
                i = 5;
              }
              break;
            }
            i = -1;
            switch (i)
            {
            default: 
              localObject2 = localObject1;
              break;
            case 9: 
              localObject2 = new androidx/constraintlayout/motion/widget/ViewTransition;
              ((ViewTransition)localObject2).<init>(paramContext, localXmlResourceParser);
              mViewTransitionController.add((ViewTransition)localObject2);
              localObject2 = localObject1;
              break;
            case 8: 
              localObject3 = new androidx/constraintlayout/motion/widget/KeyFrames;
              ((KeyFrames)localObject3).<init>(paramContext, localXmlResourceParser);
              localObject2 = localObject1;
              if (localObject1 == null) {
                break;
              }
              Transition.access$1400((Transition)localObject1).add(localObject3);
              localObject2 = localObject1;
              break;
            case 6: 
            case 7: 
              parseInclude(paramContext, localXmlResourceParser);
              localObject2 = localObject1;
              break;
            case 5: 
              parseConstraintSet(paramContext, localXmlResourceParser);
              localObject2 = localObject1;
              break;
            case 4: 
              localObject2 = new androidx/constraintlayout/widget/StateSet;
              ((StateSet)localObject2).<init>(paramContext, localXmlResourceParser);
              mStateSet = ((StateSet)localObject2);
              localObject2 = localObject1;
              break;
            case 3: 
              localObject2 = localObject1;
              if (localObject1 == null) {
                break;
              }
              ((Transition)localObject1).addOnClick(paramContext, localXmlResourceParser);
              localObject2 = localObject1;
              break;
            case 2: 
              if (localObject1 == null)
              {
                localObject3 = paramContext.getResources().getResourceEntryName(paramInt);
                i = localXmlResourceParser.getLineNumber();
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append(" OnSwipe (");
                ((StringBuilder)localObject2).append((String)localObject3);
                ((StringBuilder)localObject2).append(".xml:");
                ((StringBuilder)localObject2).append(i);
                ((StringBuilder)localObject2).append(")");
                Log.v("MotionScene", ((StringBuilder)localObject2).toString());
              }
              localObject2 = localObject1;
              if (localObject1 == null) {
                break;
              }
              localObject2 = new androidx/constraintlayout/motion/widget/TouchResponse;
              ((TouchResponse)localObject2).<init>(paramContext, mMotionLayout, localXmlResourceParser);
              Transition.access$202((Transition)localObject1, (TouchResponse)localObject2);
              localObject2 = localObject1;
              break;
            case 1: 
              localObject1 = mTransitionList;
              localObject2 = new androidx/constraintlayout/motion/widget/MotionScene$Transition;
              ((Transition)localObject2).<init>(this, paramContext, localXmlResourceParser);
              ((ArrayList)localObject1).add(localObject2);
              if ((mCurrentTransition == null) && (!Transition.access$1300((Transition)localObject2)))
              {
                mCurrentTransition = ((Transition)localObject2);
                if (Transition.access$200((Transition)localObject2) != null) {
                  Transition.access$200(mCurrentTransition).setRTL(mRtl);
                }
              }
              if (Transition.access$1300((Transition)localObject2))
              {
                if (Transition.access$000((Transition)localObject2) == -1) {
                  mDefaultTransition = ((Transition)localObject2);
                } else {
                  mAbstractTransitionList.add(localObject2);
                }
                mTransitionList.remove(localObject2);
              }
              break;
            case 0: 
              parseMotionSceneTags(paramContext, localXmlResourceParser);
              localObject2 = localObject1;
              break;
            }
          }
        }
        else
        {
          localXmlResourceParser.getName();
          localObject2 = localObject1;
        }
        i = localXmlResourceParser.next();
        localObject1 = localObject2;
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private int parseConstraintSet(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ConstraintSet localConstraintSet = new ConstraintSet();
    localConstraintSet.setForceId(false);
    int i = paramXmlPullParser.getAttributeCount();
    int j = 0;
    int k = -1;
    int m = k;
    while (j < i)
    {
      String str1 = paramXmlPullParser.getAttributeName(j);
      String str2 = paramXmlPullParser.getAttributeValue(j);
      if (DEBUG_DESKTOP)
      {
        PrintStream localPrintStream = System.out;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("id string = ");
        localStringBuilder.append(str2);
        localPrintStream.println(localStringBuilder.toString());
      }
      str1.getClass();
      switch (str1.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            n = -1;
            break;
          } while (!str1.equals("id"));
          n = 2;
          break;
        } while (!str1.equals("constraintRotate"));
        n = 1;
        break;
      } while (!str1.equals("deriveConstraintsFrom"));
      int n = 0;
      switch (n)
      {
      default: 
        break;
      case 2: 
        k = getId(paramContext, str2);
        mConstraintSetIdMap.put(stripID(str2), Integer.valueOf(k));
        mIdString = Debug.getName(paramContext, k);
        break;
      case 1: 
        try
        {
          mRotate = Integer.parseInt(str2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          str2.getClass();
          switch (str2.hashCode())
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
                    n = -1;
                    break;
                  } while (!str2.equals("x_right"));
                  n = 4;
                  break;
                } while (!str2.equals("right"));
                n = 3;
                break;
              } while (!str2.equals("none"));
              n = 2;
              break;
            } while (!str2.equals("left"));
            n = 1;
            break;
          } while (!str2.equals("x_left"));
          n = 0;
          switch (n)
          {
          }
        }
        mRotate = 3;
        break;
        mRotate = 1;
        break;
        mRotate = 0;
        break;
        mRotate = 2;
        break;
        mRotate = 4;
        break;
      case 0: 
        m = getId(paramContext, str2);
      }
      j++;
    }
    if (k != -1)
    {
      if (mMotionLayout.mDebugPath != 0) {
        localConstraintSet.setValidateOnParse(true);
      }
      localConstraintSet.load(paramContext, paramXmlPullParser);
      if (m != -1) {
        mDeriveMap.put(k, m);
      }
      mConstraintSetMap.put(k, localConstraintSet);
    }
    return k;
  }
  
  private int parseInclude(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    try
    {
      for (paramInt = localXmlResourceParser.getEventType(); paramInt != 1; paramInt = localXmlResourceParser.next())
      {
        String str = localXmlResourceParser.getName();
        if ((2 == paramInt) && ("ConstraintSet".equals(str))) {
          return parseConstraintSet(paramContext, localXmlResourceParser);
        }
      }
      return -1;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void parseInclude(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.include);
    int i = paramXmlPullParser.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramXmlPullParser.getIndex(j);
      if (k == R.styleable.include_constraintSet) {
        parseInclude(paramContext, paramXmlPullParser.getResourceId(k, -1));
      }
    }
    paramXmlPullParser.recycle();
  }
  
  private void parseMotionSceneTags(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramContext = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.MotionScene);
    int i = paramContext.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramContext.getIndex(j);
      if (k == R.styleable.MotionScene_defaultDuration)
      {
        k = paramContext.getInt(k, mDefaultDuration);
        mDefaultDuration = k;
        if (k < 8) {
          mDefaultDuration = 8;
        }
      }
      else if (k == R.styleable.MotionScene_layoutDuringTransition)
      {
        mLayoutDuringTransition = paramContext.getInteger(k, 0);
      }
    }
    paramContext.recycle();
  }
  
  private void readConstraintChain(int paramInt, MotionLayout paramMotionLayout)
  {
    ConstraintSet localConstraintSet = (ConstraintSet)mConstraintSetMap.get(paramInt);
    derivedState = mIdString;
    paramInt = mDeriveMap.get(paramInt);
    if (paramInt > 0)
    {
      readConstraintChain(paramInt, paramMotionLayout);
      paramMotionLayout = (ConstraintSet)mConstraintSetMap.get(paramInt);
      if (paramMotionLayout == null)
      {
        paramMotionLayout = z2.t("ERROR! invalid deriveConstraintsFrom: @id/");
        paramMotionLayout.append(Debug.getName(mMotionLayout.getContext(), paramInt));
        Log.e("MotionScene", paramMotionLayout.toString());
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(derivedState);
      localStringBuilder.append("/");
      localStringBuilder.append(derivedState);
      derivedState = localStringBuilder.toString();
      localConstraintSet.readFallback(paramMotionLayout);
    }
    else
    {
      derivedState = z2.s(new StringBuilder(), derivedState, "  layout");
      localConstraintSet.readFallback(paramMotionLayout);
    }
    localConstraintSet.applyDeltaFrom(localConstraintSet);
  }
  
  public static String stripID(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    int i = paramString.indexOf('/');
    if (i < 0) {
      return paramString;
    }
    return paramString.substring(i + 1);
  }
  
  public void addOnClickListeners(MotionLayout paramMotionLayout, int paramInt)
  {
    Object localObject1 = mTransitionList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Transition)((Iterator)localObject1).next();
      if (Transition.access$400((Transition)localObject2).size() > 0)
      {
        localObject2 = Transition.access$400((Transition)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((MotionScene.Transition.TransitionOnClick)((Iterator)localObject2).next()).removeOnClickListeners(paramMotionLayout);
        }
      }
    }
    localObject1 = mAbstractTransitionList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Transition)((Iterator)localObject1).next();
      if (Transition.access$400((Transition)localObject2).size() > 0)
      {
        localObject2 = Transition.access$400((Transition)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((MotionScene.Transition.TransitionOnClick)((Iterator)localObject2).next()).removeOnClickListeners(paramMotionLayout);
        }
      }
    }
    Object localObject2 = mTransitionList.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Transition)((Iterator)localObject2).next();
      if (Transition.access$400((Transition)localObject1).size() > 0)
      {
        localObject3 = Transition.access$400((Transition)localObject1).iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((MotionScene.Transition.TransitionOnClick)((Iterator)localObject3).next()).addOnClickListeners(paramMotionLayout, paramInt, (Transition)localObject1);
        }
      }
    }
    localObject2 = mAbstractTransitionList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Transition)((Iterator)localObject2).next();
      if (Transition.access$400((Transition)localObject3).size() > 0)
      {
        localObject1 = Transition.access$400((Transition)localObject3).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((MotionScene.Transition.TransitionOnClick)((Iterator)localObject1).next()).addOnClickListeners(paramMotionLayout, paramInt, (Transition)localObject3);
        }
      }
    }
  }
  
  public void addTransition(Transition paramTransition)
  {
    int i = getIndex(paramTransition);
    if (i == -1) {
      mTransitionList.add(paramTransition);
    } else {
      mTransitionList.set(i, paramTransition);
    }
  }
  
  public boolean applyViewTransition(int paramInt, MotionController paramMotionController)
  {
    return mViewTransitionController.applyViewTransition(paramInt, paramMotionController);
  }
  
  public boolean autoTransition(MotionLayout paramMotionLayout, int paramInt)
  {
    if (isProcessingTouch()) {
      return false;
    }
    if (mDisableAutoTransition) {
      return false;
    }
    Object localObject = mTransitionList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      Transition localTransition1 = (Transition)((Iterator)localObject).next();
      if (Transition.access$600(localTransition1) != 0)
      {
        Transition localTransition2 = mCurrentTransition;
        if ((localTransition2 != localTransition1) || (!localTransition2.isTransitionFlag(2)))
        {
          if ((paramInt == Transition.access$100(localTransition1)) && ((Transition.access$600(localTransition1) == 4) || (Transition.access$600(localTransition1) == 2)))
          {
            localObject = MotionLayout.TransitionState.FINISHED;
            paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
            paramMotionLayout.setTransition(localTransition1);
            if (Transition.access$600(localTransition1) == 4)
            {
              paramMotionLayout.transitionToEnd();
              paramMotionLayout.setState(MotionLayout.TransitionState.SETUP);
              paramMotionLayout.setState(MotionLayout.TransitionState.MOVING);
            }
            else
            {
              paramMotionLayout.setProgress(1.0F);
              paramMotionLayout.evaluate(true);
              paramMotionLayout.setState(MotionLayout.TransitionState.SETUP);
              paramMotionLayout.setState(MotionLayout.TransitionState.MOVING);
              paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
              paramMotionLayout.onNewStateAttachHandlers();
            }
            return true;
          }
          if ((paramInt == Transition.access$000(localTransition1)) && ((Transition.access$600(localTransition1) == 3) || (Transition.access$600(localTransition1) == 1)))
          {
            localObject = MotionLayout.TransitionState.FINISHED;
            paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
            paramMotionLayout.setTransition(localTransition1);
            if (Transition.access$600(localTransition1) == 3)
            {
              paramMotionLayout.transitionToStart();
              paramMotionLayout.setState(MotionLayout.TransitionState.SETUP);
              paramMotionLayout.setState(MotionLayout.TransitionState.MOVING);
            }
            else
            {
              paramMotionLayout.setProgress(0.0F);
              paramMotionLayout.evaluate(true);
              paramMotionLayout.setState(MotionLayout.TransitionState.SETUP);
              paramMotionLayout.setState(MotionLayout.TransitionState.MOVING);
              paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
              paramMotionLayout.onNewStateAttachHandlers();
            }
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public Transition bestTransitionFor(int paramInt, float paramFloat1, float paramFloat2, MotionEvent paramMotionEvent)
  {
    if (paramInt != -1)
    {
      Object localObject1 = getTransitionsWithState(paramInt);
      float f1 = 0.0F;
      Object localObject2 = null;
      RectF localRectF1 = new RectF();
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (Transition)localIterator.next();
        if ((!Transition.access$500((Transition)localObject1)) && (Transition.access$200((Transition)localObject1) != null))
        {
          Transition.access$200((Transition)localObject1).setRTL(mRtl);
          RectF localRectF2 = Transition.access$200((Transition)localObject1).getTouchRegion(mMotionLayout, localRectF1);
          if ((localRectF2 == null) || (paramMotionEvent == null) || (localRectF2.contains(paramMotionEvent.getX(), paramMotionEvent.getY())))
          {
            localRectF2 = Transition.access$200((Transition)localObject1).getLimitBoundsTo(mMotionLayout, localRectF1);
            if ((localRectF2 == null) || (paramMotionEvent == null) || (localRectF2.contains(paramMotionEvent.getX(), paramMotionEvent.getY())))
            {
              float f2 = Transition.access$200((Transition)localObject1).dot(paramFloat1, paramFloat2);
              float f3 = f2;
              if (access$200mIsRotateMode)
              {
                f3 = f2;
                if (paramMotionEvent != null)
                {
                  f3 = paramMotionEvent.getX() - access$200mRotateCenterX;
                  f2 = paramMotionEvent.getY() - access$200mRotateCenterY;
                  f3 = (float)(Math.atan2(paramFloat2 + f2, paramFloat1 + f3) - Math.atan2(f3, f2)) * 10.0F;
                }
              }
              if (Transition.access$000((Transition)localObject1) == paramInt) {
                f2 = -1.0F;
              } else {
                f2 = 1.1F;
              }
              f3 *= f2;
              if (f3 > f1)
              {
                localObject2 = localObject1;
                f1 = f3;
              }
            }
          }
        }
      }
      return (Transition)localObject2;
    }
    return mCurrentTransition;
  }
  
  public void disableAutoTransition(boolean paramBoolean)
  {
    mDisableAutoTransition = paramBoolean;
  }
  
  public void enableViewTransition(int paramInt, boolean paramBoolean)
  {
    mViewTransitionController.enableViewTransition(paramInt, paramBoolean);
  }
  
  public int gatPathMotionArc()
  {
    Transition localTransition = mCurrentTransition;
    int i;
    if (localTransition != null) {
      i = Transition.access$1900(localTransition);
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getAutoCompleteMode()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getAutoCompleteMode();
    }
    return 0;
  }
  
  public ConstraintSet getConstraintSet(int paramInt)
  {
    return getConstraintSet(paramInt, -1, -1);
  }
  
  public ConstraintSet getConstraintSet(int paramInt1, int paramInt2, int paramInt3)
  {
    if (DEBUG_DESKTOP)
    {
      Object localObject1 = System.out;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("id ");
      ((StringBuilder)localObject2).append(paramInt1);
      ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
      localObject2 = System.out;
      localObject1 = z2.t("size ");
      ((StringBuilder)localObject1).append(mConstraintSetMap.size());
      ((PrintStream)localObject2).println(((StringBuilder)localObject1).toString());
    }
    Object localObject2 = mStateSet;
    int i = paramInt1;
    if (localObject2 != null)
    {
      paramInt2 = ((StateSet)localObject2).stateGetConstraintID(paramInt1, paramInt2, paramInt3);
      i = paramInt1;
      if (paramInt2 != -1) {
        i = paramInt2;
      }
    }
    if (mConstraintSetMap.get(i) == null)
    {
      localObject2 = z2.t("Warning could not find ConstraintSet id/");
      ((StringBuilder)localObject2).append(Debug.getName(mMotionLayout.getContext(), i));
      ((StringBuilder)localObject2).append(" In MotionScene");
      Log.e("MotionScene", ((StringBuilder)localObject2).toString());
      localObject2 = mConstraintSetMap;
      return (ConstraintSet)((SparseArray)localObject2).get(((SparseArray)localObject2).keyAt(0));
    }
    return (ConstraintSet)mConstraintSetMap.get(i);
  }
  
  public ConstraintSet getConstraintSet(Context paramContext, String paramString)
  {
    Object localObject1;
    Object localObject2;
    if (DEBUG_DESKTOP)
    {
      localObject1 = System.out;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("id ");
      ((StringBuilder)localObject2).append(paramString);
      ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
      localObject2 = System.out;
      localObject1 = z2.t("size ");
      ((StringBuilder)localObject1).append(mConstraintSetMap.size());
      ((PrintStream)localObject2).println(((StringBuilder)localObject1).toString());
    }
    for (int i = 0; i < mConstraintSetMap.size(); i++)
    {
      int j = mConstraintSetMap.keyAt(i);
      localObject2 = paramContext.getResources().getResourceName(j);
      if (DEBUG_DESKTOP)
      {
        PrintStream localPrintStream = System.out;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Id for <");
        ((StringBuilder)localObject1).append(i);
        ((StringBuilder)localObject1).append("> is <");
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append("> looking for <");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(">");
        localPrintStream.println(((StringBuilder)localObject1).toString());
      }
      if (paramString.equals(localObject2)) {
        return (ConstraintSet)mConstraintSetMap.get(j);
      }
    }
    return null;
  }
  
  public int[] getConstraintSetIds()
  {
    int i = mConstraintSetMap.size();
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = mConstraintSetMap.keyAt(j);
    }
    return arrayOfInt;
  }
  
  public ArrayList<Transition> getDefinedTransitions()
  {
    return mTransitionList;
  }
  
  public int getDuration()
  {
    Transition localTransition = mCurrentTransition;
    if (localTransition != null) {
      return Transition.access$1800(localTransition);
    }
    return mDefaultDuration;
  }
  
  public int getEndId()
  {
    Transition localTransition = mCurrentTransition;
    if (localTransition == null) {
      return -1;
    }
    return Transition.access$000(localTransition);
  }
  
  public Interpolator getInterpolator()
  {
    int i = Transition.access$1500(mCurrentTransition);
    if (i != -2)
    {
      if (i != -1)
      {
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 4)
              {
                if (i != 5)
                {
                  if (i != 6) {
                    return null;
                  }
                  return new AnticipateInterpolator();
                }
                return new OvershootInterpolator();
              }
              return new BounceInterpolator();
            }
            return new DecelerateInterpolator();
          }
          return new AccelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
      }
      new Interpolator()
      {
        public float getInterpolation(float paramAnonymousFloat)
        {
          return (float)val$easing.get(paramAnonymousFloat);
        }
      };
    }
    return AnimationUtils.loadInterpolator(mMotionLayout.getContext(), Transition.access$1700(mCurrentTransition));
  }
  
  public Key getKeyFrame(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    paramContext = mCurrentTransition;
    if (paramContext == null) {
      return null;
    }
    Iterator localIterator1 = Transition.access$1400(paramContext).iterator();
    label20:
    if (localIterator1.hasNext())
    {
      paramContext = (KeyFrames)localIterator1.next();
      Iterator localIterator2 = paramContext.getKeys().iterator();
      Object localObject;
      label97:
      do
      {
        break label97;
        if (!localIterator2.hasNext()) {
          break label20;
        }
        localObject = (Integer)localIterator2.next();
        if (paramInt2 != ((Integer)localObject).intValue()) {
          break;
        }
        Iterator localIterator3 = paramContext.getKeyFramesForView(((Integer)localObject).intValue()).iterator();
        if (!localIterator3.hasNext()) {
          break;
        }
        localObject = (Key)localIterator3.next();
      } while ((mFramePosition != paramInt3) || (mType != paramInt1));
      return (Key)localObject;
    }
    return null;
  }
  
  public void getKeyFrames(MotionController paramMotionController)
  {
    Object localObject = mCurrentTransition;
    if (localObject == null)
    {
      localObject = mDefaultTransition;
      if (localObject != null)
      {
        localObject = Transition.access$1400((Transition)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((KeyFrames)((Iterator)localObject).next()).addFrames(paramMotionController);
        }
      }
      return;
    }
    localObject = Transition.access$1400((Transition)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((KeyFrames)((Iterator)localObject).next()).addFrames(paramMotionController);
    }
  }
  
  public float getMaxAcceleration()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getMaxAcceleration();
    }
    return 0.0F;
  }
  
  public float getMaxVelocity()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getMaxVelocity();
    }
    return 0.0F;
  }
  
  public boolean getMoveWhenScrollAtTop()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getMoveWhenScrollAtTop();
    }
    return false;
  }
  
  public float getPathPercent(View paramView, int paramInt)
  {
    return 0.0F;
  }
  
  public float getProgressDirection(float paramFloat1, float paramFloat2)
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getProgressDirection(paramFloat1, paramFloat2);
    }
    return 0.0F;
  }
  
  public int getSpringBoundary()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getSpringBoundary();
    }
    return 0;
  }
  
  public float getSpringDamping()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getSpringDamping();
    }
    return 0.0F;
  }
  
  public float getSpringMass()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getSpringMass();
    }
    return 0.0F;
  }
  
  public float getSpringStiffiness()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getSpringStiffness();
    }
    return 0.0F;
  }
  
  public float getSpringStopThreshold()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      return Transition.access$200(mCurrentTransition).getSpringStopThreshold();
    }
    return 0.0F;
  }
  
  public float getStaggered()
  {
    Transition localTransition = mCurrentTransition;
    if (localTransition != null) {
      return Transition.access$2000(localTransition);
    }
    return 0.0F;
  }
  
  public int getStartId()
  {
    Transition localTransition = mCurrentTransition;
    if (localTransition == null) {
      return -1;
    }
    return Transition.access$100(localTransition);
  }
  
  public Transition getTransitionById(int paramInt)
  {
    Iterator localIterator = mTransitionList.iterator();
    while (localIterator.hasNext())
    {
      Transition localTransition = (Transition)localIterator.next();
      if (Transition.access$300(localTransition) == paramInt) {
        return localTransition;
      }
    }
    return null;
  }
  
  public int getTransitionDirection(int paramInt)
  {
    Iterator localIterator = mTransitionList.iterator();
    while (localIterator.hasNext()) {
      if (Transition.access$100((Transition)localIterator.next()) == paramInt) {
        return 0;
      }
    }
    return 1;
  }
  
  public List<Transition> getTransitionsWithState(int paramInt)
  {
    paramInt = getRealID(paramInt);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mTransitionList.iterator();
    while (localIterator.hasNext())
    {
      Transition localTransition = (Transition)localIterator.next();
      if ((Transition.access$100(localTransition) == paramInt) || (Transition.access$000(localTransition) == paramInt)) {
        localArrayList.add(localTransition);
      }
    }
    return localArrayList;
  }
  
  public boolean hasKeyFramePosition(View paramView, int paramInt)
  {
    Object localObject = mCurrentTransition;
    if (localObject == null) {
      return false;
    }
    Iterator localIterator;
    do
    {
      localObject = Transition.access$1400((Transition)localObject).iterator();
      while (!localIterator.hasNext())
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localIterator = ((KeyFrames)((Iterator)localObject).next()).getKeyFramesForView(paramView.getId()).iterator();
      }
    } while (nextmFramePosition != paramInt);
    return true;
    return false;
  }
  
  public boolean isViewTransitionEnabled(int paramInt)
  {
    return mViewTransitionController.isViewTransitionEnabled(paramInt);
  }
  
  public int lookUpConstraintId(String paramString)
  {
    paramString = (Integer)mConstraintSetIdMap.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.intValue();
  }
  
  public String lookUpConstraintName(int paramInt)
  {
    Iterator localIterator = mConstraintSetIdMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Integer localInteger = (Integer)localEntry.getValue();
      if ((localInteger != null) && (localInteger.intValue() == paramInt)) {
        return (String)localEntry.getKey();
      }
    }
    return null;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void processScrollMove(float paramFloat1, float paramFloat2)
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      Transition.access$200(mCurrentTransition).scrollMove(paramFloat1, paramFloat2);
    }
  }
  
  public void processScrollUp(float paramFloat1, float paramFloat2)
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      Transition.access$200(mCurrentTransition).scrollUp(paramFloat1, paramFloat2);
    }
  }
  
  public void processTouchEvent(MotionEvent paramMotionEvent, int paramInt, MotionLayout paramMotionLayout)
  {
    Object localObject1 = new RectF();
    if (mVelocityTracker == null) {
      mVelocityTracker = mMotionLayout.obtainVelocityTracker();
    }
    mVelocityTracker.addMovement(paramMotionEvent);
    if (paramInt != -1)
    {
      int i = paramMotionEvent.getAction();
      boolean bool1 = false;
      if (i != 0)
      {
        if ((i == 2) && (!mIgnoreTouch))
        {
          float f1 = paramMotionEvent.getRawY() - mLastTouchY;
          float f2 = paramMotionEvent.getRawX() - mLastTouchX;
          if ((f2 != 0.0D) || (f1 != 0.0D))
          {
            localObject2 = mLastTouchDown;
            if (localObject2 != null) {}
          }
          else
          {
            return;
          }
          Object localObject2 = bestTransitionFor(paramInt, f2, f1, (MotionEvent)localObject2);
          if (localObject2 != null)
          {
            paramMotionLayout.setTransition((Transition)localObject2);
            localObject1 = Transition.access$200(mCurrentTransition).getTouchRegion(mMotionLayout, (RectF)localObject1);
            boolean bool2 = bool1;
            if (localObject1 != null)
            {
              bool2 = bool1;
              if (!((RectF)localObject1).contains(mLastTouchDown.getX(), mLastTouchDown.getY())) {
                bool2 = true;
              }
            }
            mMotionOutsideRegion = bool2;
            Transition.access$200(mCurrentTransition).setUpTouchEvent(mLastTouchX, mLastTouchY);
          }
        }
      }
      else
      {
        mLastTouchX = paramMotionEvent.getRawX();
        mLastTouchY = paramMotionEvent.getRawY();
        mLastTouchDown = paramMotionEvent;
        mIgnoreTouch = false;
        if (Transition.access$200(mCurrentTransition) != null)
        {
          paramMotionEvent = Transition.access$200(mCurrentTransition).getLimitBoundsTo(mMotionLayout, (RectF)localObject1);
          if ((paramMotionEvent != null) && (!paramMotionEvent.contains(mLastTouchDown.getX(), mLastTouchDown.getY())))
          {
            mLastTouchDown = null;
            mIgnoreTouch = true;
            return;
          }
          paramMotionEvent = Transition.access$200(mCurrentTransition).getTouchRegion(mMotionLayout, (RectF)localObject1);
          if ((paramMotionEvent != null) && (!paramMotionEvent.contains(mLastTouchDown.getX(), mLastTouchDown.getY()))) {
            mMotionOutsideRegion = true;
          } else {
            mMotionOutsideRegion = false;
          }
          Transition.access$200(mCurrentTransition).setDown(mLastTouchX, mLastTouchY);
        }
        return;
      }
    }
    if (mIgnoreTouch) {
      return;
    }
    localObject1 = mCurrentTransition;
    if ((localObject1 != null) && (Transition.access$200((Transition)localObject1) != null) && (!mMotionOutsideRegion)) {
      Transition.access$200(mCurrentTransition).processTouchEvent(paramMotionEvent, mVelocityTracker, paramInt, this);
    }
    mLastTouchX = paramMotionEvent.getRawX();
    mLastTouchY = paramMotionEvent.getRawY();
    if (paramMotionEvent.getAction() == 1)
    {
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null)
      {
        paramMotionEvent.recycle();
        mVelocityTracker = null;
        paramInt = mCurrentState;
        if (paramInt != -1) {
          autoTransition(paramMotionLayout, paramInt);
        }
      }
    }
  }
  
  public void readFallback(MotionLayout paramMotionLayout)
  {
    for (int i = 0; i < mConstraintSetMap.size(); i++)
    {
      int j = mConstraintSetMap.keyAt(i);
      if (hasCycleDependency(j))
      {
        Log.e("MotionScene", "Cannot be derived from yourself");
        return;
      }
      readConstraintChain(j, paramMotionLayout);
    }
  }
  
  public void removeTransition(Transition paramTransition)
  {
    int i = getIndex(paramTransition);
    if (i != -1) {
      mTransitionList.remove(i);
    }
  }
  
  public void setConstraintSet(int paramInt, ConstraintSet paramConstraintSet)
  {
    mConstraintSetMap.put(paramInt, paramConstraintSet);
  }
  
  public void setDuration(int paramInt)
  {
    Transition localTransition = mCurrentTransition;
    if (localTransition != null) {
      localTransition.setDuration(paramInt);
    } else {
      mDefaultDuration = paramInt;
    }
  }
  
  public void setKeyframe(View paramView, int paramInt, String paramString, Object paramObject)
  {
    Object localObject = mCurrentTransition;
    if (localObject == null) {
      return;
    }
    Iterator localIterator = Transition.access$1400((Transition)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = ((KeyFrames)localIterator.next()).getKeyFramesForView(paramView.getId()).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (nextmFramePosition == paramInt)
        {
          if (paramObject != null) {
            ((Float)paramObject).floatValue();
          }
          paramString.equalsIgnoreCase("app:PerpendicularPath_percent");
        }
      }
    }
  }
  
  public void setRtl(boolean paramBoolean)
  {
    mRtl = paramBoolean;
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      Transition.access$200(mCurrentTransition).setRTL(mRtl);
    }
  }
  
  public void setTransition(int paramInt1, int paramInt2)
  {
    Object localObject = mStateSet;
    int k;
    if (localObject != null)
    {
      i = ((StateSet)localObject).stateGetConstraintID(paramInt1, -1, -1);
      if (i == -1) {
        i = paramInt1;
      }
      j = mStateSet.stateGetConstraintID(paramInt2, -1, -1);
      k = i;
      if (j != -1) {
        break label65;
      }
    }
    else
    {
      k = paramInt1;
    }
    int j = paramInt2;
    int i = k;
    label65:
    localObject = mCurrentTransition;
    if ((localObject != null) && (Transition.access$000((Transition)localObject) == paramInt2) && (Transition.access$100(mCurrentTransition) == paramInt1)) {
      return;
    }
    localObject = mTransitionList.iterator();
    Transition localTransition;
    while (((Iterator)localObject).hasNext())
    {
      localTransition = (Transition)((Iterator)localObject).next();
      if (((Transition.access$000(localTransition) == j) && (Transition.access$100(localTransition) == i)) || ((Transition.access$000(localTransition) == paramInt2) && (Transition.access$100(localTransition) == paramInt1)))
      {
        mCurrentTransition = localTransition;
        if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
          Transition.access$200(mCurrentTransition).setRTL(mRtl);
        }
        return;
      }
    }
    localObject = mDefaultTransition;
    Iterator localIterator = mAbstractTransitionList.iterator();
    while (localIterator.hasNext())
    {
      localTransition = (Transition)localIterator.next();
      if (Transition.access$000(localTransition) == paramInt2) {
        localObject = localTransition;
      }
    }
    localObject = new Transition(this, (Transition)localObject);
    Transition.access$102((Transition)localObject, i);
    Transition.access$002((Transition)localObject, j);
    if (i != -1) {
      mTransitionList.add(localObject);
    }
    mCurrentTransition = ((Transition)localObject);
  }
  
  public void setTransition(Transition paramTransition)
  {
    mCurrentTransition = paramTransition;
    if ((paramTransition != null) && (Transition.access$200(paramTransition) != null)) {
      Transition.access$200(mCurrentTransition).setRTL(mRtl);
    }
  }
  
  public void setupTouch()
  {
    Transition localTransition = mCurrentTransition;
    if ((localTransition != null) && (Transition.access$200(localTransition) != null)) {
      Transition.access$200(mCurrentTransition).setupTouch();
    }
  }
  
  public boolean supportTouch()
  {
    Object localObject = mTransitionList.iterator();
    boolean bool2;
    do
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      bool2 = true;
      if (!bool1) {
        break;
      }
    } while (Transition.access$200((Transition)((Iterator)localObject).next()) == null);
    return true;
    localObject = mCurrentTransition;
    if ((localObject == null) || (Transition.access$200((Transition)localObject) == null)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean validateLayout(MotionLayout paramMotionLayout)
  {
    boolean bool;
    if ((paramMotionLayout == mMotionLayout) && (mScene == this)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void viewTransition(int paramInt, View... paramVarArgs)
  {
    mViewTransitionController.viewTransition(paramInt, paramVarArgs);
  }
  
  public static class Transition
  {
    public static final int AUTO_ANIMATE_TO_END = 4;
    public static final int AUTO_ANIMATE_TO_START = 3;
    public static final int AUTO_JUMP_TO_END = 2;
    public static final int AUTO_JUMP_TO_START = 1;
    public static final int AUTO_NONE = 0;
    public static final int INTERPOLATE_ANTICIPATE = 6;
    public static final int INTERPOLATE_BOUNCE = 4;
    public static final int INTERPOLATE_EASE_IN = 1;
    public static final int INTERPOLATE_EASE_IN_OUT = 0;
    public static final int INTERPOLATE_EASE_OUT = 2;
    public static final int INTERPOLATE_LINEAR = 3;
    public static final int INTERPOLATE_OVERSHOOT = 5;
    public static final int INTERPOLATE_REFERENCE_ID = -2;
    public static final int INTERPOLATE_SPLINE_STRING = -1;
    public static final int TRANSITION_FLAG_FIRST_DRAW = 1;
    public static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
    public static final int TRANSITION_FLAG_INTRA_AUTO = 2;
    private int mAutoTransition = 0;
    private int mConstraintSetEnd = -1;
    private int mConstraintSetStart = -1;
    private int mDefaultInterpolator = 0;
    private int mDefaultInterpolatorID = -1;
    private String mDefaultInterpolatorString = null;
    private boolean mDisable = false;
    private int mDuration = 400;
    private int mId = -1;
    private boolean mIsAbstract = false;
    private ArrayList<KeyFrames> mKeyFramesList = new ArrayList();
    private int mLayoutDuringTransition = 0;
    private final MotionScene mMotionScene;
    private ArrayList<TransitionOnClick> mOnClicks = new ArrayList();
    private int mPathMotionArc = -1;
    private float mStagger = 0.0F;
    private TouchResponse mTouchResponse = null;
    private int mTransitionFlags = 0;
    
    public Transition(int paramInt1, MotionScene paramMotionScene, int paramInt2, int paramInt3)
    {
      mId = paramInt1;
      mMotionScene = paramMotionScene;
      mConstraintSetStart = paramInt2;
      mConstraintSetEnd = paramInt3;
      mDuration = MotionScene.access$900(paramMotionScene);
      mLayoutDuringTransition = MotionScene.access$1000(paramMotionScene);
    }
    
    public Transition(MotionScene paramMotionScene, Context paramContext, XmlPullParser paramXmlPullParser)
    {
      mDuration = MotionScene.access$900(paramMotionScene);
      mLayoutDuringTransition = MotionScene.access$1000(paramMotionScene);
      mMotionScene = paramMotionScene;
      fillFromAttributeList(paramMotionScene, paramContext, Xml.asAttributeSet(paramXmlPullParser));
    }
    
    public Transition(MotionScene paramMotionScene, Transition paramTransition)
    {
      mMotionScene = paramMotionScene;
      mDuration = MotionScene.access$900(paramMotionScene);
      if (paramTransition != null)
      {
        mPathMotionArc = mPathMotionArc;
        mDefaultInterpolator = mDefaultInterpolator;
        mDefaultInterpolatorString = mDefaultInterpolatorString;
        mDefaultInterpolatorID = mDefaultInterpolatorID;
        mDuration = mDuration;
        mKeyFramesList = mKeyFramesList;
        mStagger = mStagger;
        mLayoutDuringTransition = mLayoutDuringTransition;
      }
    }
    
    private void fill(MotionScene paramMotionScene, Context paramContext, TypedArray paramTypedArray)
    {
      int i = paramTypedArray.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramTypedArray.getIndex(j);
        Object localObject;
        if (k == R.styleable.Transition_constraintSetEnd)
        {
          mConstraintSetEnd = paramTypedArray.getResourceId(k, -1);
          localObject = paramContext.getResources().getResourceTypeName(mConstraintSetEnd);
          if ("layout".equals(localObject))
          {
            localObject = new ConstraintSet();
            ((ConstraintSet)localObject).load(paramContext, mConstraintSetEnd);
            MotionScene.access$1100(paramMotionScene).append(mConstraintSetEnd, localObject);
          }
          else if ("xml".equals(localObject))
          {
            mConstraintSetEnd = MotionScene.access$1200(paramMotionScene, paramContext, mConstraintSetEnd);
          }
        }
        else if (k == R.styleable.Transition_constraintSetStart)
        {
          mConstraintSetStart = paramTypedArray.getResourceId(k, mConstraintSetStart);
          localObject = paramContext.getResources().getResourceTypeName(mConstraintSetStart);
          if ("layout".equals(localObject))
          {
            localObject = new ConstraintSet();
            ((ConstraintSet)localObject).load(paramContext, mConstraintSetStart);
            MotionScene.access$1100(paramMotionScene).append(mConstraintSetStart, localObject);
          }
          else if ("xml".equals(localObject))
          {
            mConstraintSetStart = MotionScene.access$1200(paramMotionScene, paramContext, mConstraintSetStart);
          }
        }
        else if (k == R.styleable.Transition_motionInterpolator)
        {
          int m = peekValuetype;
          if (m == 1)
          {
            k = paramTypedArray.getResourceId(k, -1);
            mDefaultInterpolatorID = k;
            if (k != -1) {
              mDefaultInterpolator = -2;
            }
          }
          else if (m == 3)
          {
            localObject = paramTypedArray.getString(k);
            mDefaultInterpolatorString = ((String)localObject);
            if (localObject != null) {
              if (((String)localObject).indexOf("/") > 0)
              {
                mDefaultInterpolatorID = paramTypedArray.getResourceId(k, -1);
                mDefaultInterpolator = -2;
              }
              else
              {
                mDefaultInterpolator = -1;
              }
            }
          }
          else
          {
            mDefaultInterpolator = paramTypedArray.getInteger(k, mDefaultInterpolator);
          }
        }
        else if (k == R.styleable.Transition_duration)
        {
          k = paramTypedArray.getInt(k, mDuration);
          mDuration = k;
          if (k < 8) {
            mDuration = 8;
          }
        }
        else if (k == R.styleable.Transition_staggered)
        {
          mStagger = paramTypedArray.getFloat(k, mStagger);
        }
        else if (k == R.styleable.Transition_autoTransition)
        {
          mAutoTransition = paramTypedArray.getInteger(k, mAutoTransition);
        }
        else if (k == R.styleable.Transition_android_id)
        {
          mId = paramTypedArray.getResourceId(k, mId);
        }
        else if (k == R.styleable.Transition_transitionDisable)
        {
          mDisable = paramTypedArray.getBoolean(k, mDisable);
        }
        else if (k == R.styleable.Transition_pathMotionArc)
        {
          mPathMotionArc = paramTypedArray.getInteger(k, -1);
        }
        else if (k == R.styleable.Transition_layoutDuringTransition)
        {
          mLayoutDuringTransition = paramTypedArray.getInteger(k, 0);
        }
        else if (k == R.styleable.Transition_transitionFlags)
        {
          mTransitionFlags = paramTypedArray.getInteger(k, 0);
        }
      }
      if (mConstraintSetStart == -1) {
        mIsAbstract = true;
      }
    }
    
    private void fillFromAttributeList(MotionScene paramMotionScene, Context paramContext, AttributeSet paramAttributeSet)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Transition);
      fill(paramMotionScene, paramContext, paramAttributeSet);
      paramAttributeSet.recycle();
    }
    
    public void addKeyFrame(KeyFrames paramKeyFrames)
    {
      mKeyFramesList.add(paramKeyFrames);
    }
    
    public void addOnClick(int paramInt1, int paramInt2)
    {
      Object localObject = mOnClicks.iterator();
      while (((Iterator)localObject).hasNext())
      {
        TransitionOnClick localTransitionOnClick = (TransitionOnClick)((Iterator)localObject).next();
        if (mTargetId == paramInt1)
        {
          mMode = paramInt2;
          return;
        }
      }
      localObject = new TransitionOnClick(this, paramInt1, paramInt2);
      mOnClicks.add(localObject);
    }
    
    public void addOnClick(Context paramContext, XmlPullParser paramXmlPullParser)
    {
      mOnClicks.add(new TransitionOnClick(paramContext, this, paramXmlPullParser));
    }
    
    public String debugString(Context paramContext)
    {
      Object localObject;
      if (mConstraintSetStart == -1) {
        localObject = "null";
      } else {
        localObject = paramContext.getResources().getResourceEntryName(mConstraintSetStart);
      }
      if (mConstraintSetEnd == -1)
      {
        paramContext = z2.o((String)localObject, " -> null");
      }
      else
      {
        localObject = z2.u((String)localObject, " -> ");
        ((StringBuilder)localObject).append(paramContext.getResources().getResourceEntryName(mConstraintSetEnd));
        paramContext = ((StringBuilder)localObject).toString();
      }
      return paramContext;
    }
    
    public int getAutoTransition()
    {
      return mAutoTransition;
    }
    
    public int getDuration()
    {
      return mDuration;
    }
    
    public int getEndConstraintSetId()
    {
      return mConstraintSetEnd;
    }
    
    public int getId()
    {
      return mId;
    }
    
    public List<KeyFrames> getKeyFrameList()
    {
      return mKeyFramesList;
    }
    
    public int getLayoutDuringTransition()
    {
      return mLayoutDuringTransition;
    }
    
    public List<TransitionOnClick> getOnClickList()
    {
      return mOnClicks;
    }
    
    public int getPathMotionArc()
    {
      return mPathMotionArc;
    }
    
    public float getStagger()
    {
      return mStagger;
    }
    
    public int getStartConstraintSetId()
    {
      return mConstraintSetStart;
    }
    
    public TouchResponse getTouchResponse()
    {
      return mTouchResponse;
    }
    
    public boolean isEnabled()
    {
      return mDisable ^ true;
    }
    
    public boolean isTransitionFlag(int paramInt)
    {
      boolean bool;
      if ((paramInt & mTransitionFlags) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void removeOnClick(int paramInt)
    {
      Iterator localIterator = mOnClicks.iterator();
      while (localIterator.hasNext())
      {
        localTransitionOnClick = (TransitionOnClick)localIterator.next();
        if (mTargetId == paramInt) {
          break label40;
        }
      }
      TransitionOnClick localTransitionOnClick = null;
      label40:
      if (localTransitionOnClick != null) {
        mOnClicks.remove(localTransitionOnClick);
      }
    }
    
    public void setAutoTransition(int paramInt)
    {
      mAutoTransition = paramInt;
    }
    
    public void setDuration(int paramInt)
    {
      mDuration = Math.max(paramInt, 8);
    }
    
    public void setEnable(boolean paramBoolean)
    {
      setEnabled(paramBoolean);
    }
    
    public void setEnabled(boolean paramBoolean)
    {
      mDisable = (paramBoolean ^ true);
    }
    
    public void setInterpolatorInfo(int paramInt1, String paramString, int paramInt2)
    {
      mDefaultInterpolator = paramInt1;
      mDefaultInterpolatorString = paramString;
      mDefaultInterpolatorID = paramInt2;
    }
    
    public void setLayoutDuringTransition(int paramInt)
    {
      mLayoutDuringTransition = paramInt;
    }
    
    public void setOnSwipe(OnSwipe paramOnSwipe)
    {
      if (paramOnSwipe == null) {
        paramOnSwipe = null;
      } else {
        paramOnSwipe = new TouchResponse(MotionScene.access$700(mMotionScene), paramOnSwipe);
      }
      mTouchResponse = paramOnSwipe;
    }
    
    public void setOnTouchUp(int paramInt)
    {
      TouchResponse localTouchResponse = getTouchResponse();
      if (localTouchResponse != null) {
        localTouchResponse.setTouchUpMode(paramInt);
      }
    }
    
    public void setPathMotionArc(int paramInt)
    {
      mPathMotionArc = paramInt;
    }
    
    public void setStagger(float paramFloat)
    {
      mStagger = paramFloat;
    }
    
    public void setTransitionFlag(int paramInt)
    {
      mTransitionFlags = paramInt;
    }
    
    public static class TransitionOnClick
      implements View.OnClickListener
    {
      public static final int ANIM_TOGGLE = 17;
      public static final int ANIM_TO_END = 1;
      public static final int ANIM_TO_START = 16;
      public static final int JUMP_TO_END = 256;
      public static final int JUMP_TO_START = 4096;
      public int mMode;
      public int mTargetId;
      private final MotionScene.Transition mTransition;
      
      public TransitionOnClick(Context paramContext, MotionScene.Transition paramTransition, XmlPullParser paramXmlPullParser)
      {
        mTargetId = -1;
        mMode = 17;
        mTransition = paramTransition;
        paramContext = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.OnClick);
        int i = paramContext.getIndexCount();
        for (int j = 0; j < i; j++)
        {
          int k = paramContext.getIndex(j);
          if (k == R.styleable.OnClick_targetId) {
            mTargetId = paramContext.getResourceId(k, mTargetId);
          } else if (k == R.styleable.OnClick_clickAction) {
            mMode = paramContext.getInt(k, mMode);
          }
        }
        paramContext.recycle();
      }
      
      public TransitionOnClick(MotionScene.Transition paramTransition, int paramInt1, int paramInt2)
      {
        mTransition = paramTransition;
        mTargetId = paramInt1;
        mMode = paramInt2;
      }
      
      public void addOnClickListeners(MotionLayout paramMotionLayout, int paramInt, MotionScene.Transition paramTransition)
      {
        int i = mTargetId;
        if (i != -1) {
          paramMotionLayout = paramMotionLayout.findViewById(i);
        }
        if (paramMotionLayout == null)
        {
          paramMotionLayout = z2.t("OnClick could not find id ");
          paramMotionLayout.append(mTargetId);
          Log.e("MotionScene", paramMotionLayout.toString());
          return;
        }
        int j = MotionScene.Transition.access$100(paramTransition);
        int k = MotionScene.Transition.access$000(paramTransition);
        if (j == -1)
        {
          paramMotionLayout.setOnClickListener(this);
          return;
        }
        int m = mMode;
        int n = 0;
        if (((m & 0x1) != 0) && (paramInt == j)) {
          i = 1;
        } else {
          i = 0;
        }
        int i1;
        if (((m & 0x100) != 0) && (paramInt == j)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (((m & 0x1) != 0) && (paramInt == j)) {
          j = 1;
        } else {
          j = 0;
        }
        int i2;
        if (((m & 0x10) != 0) && (paramInt == k)) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        int i3 = n;
        if ((m & 0x1000) != 0)
        {
          i3 = n;
          if (paramInt == k) {
            i3 = 1;
          }
        }
        if ((j | i | i1 | i2 | i3) != 0) {
          paramMotionLayout.setOnClickListener(this);
        }
      }
      
      public boolean isTransitionViable(MotionScene.Transition paramTransition, MotionLayout paramMotionLayout)
      {
        MotionScene.Transition localTransition = mTransition;
        boolean bool1 = true;
        boolean bool2 = true;
        if (localTransition == paramTransition) {
          return true;
        }
        int i = MotionScene.Transition.access$000(localTransition);
        int j = MotionScene.Transition.access$100(mTransition);
        if (j == -1)
        {
          if (mCurrentState == i) {
            bool2 = false;
          }
          return bool2;
        }
        int k = mCurrentState;
        bool2 = bool1;
        if (k != j) {
          if (k == i) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
        return bool2;
      }
      
      public void onClick(View paramView)
      {
        paramView = MotionScene.access$700(MotionScene.Transition.access$800(mTransition));
        if (!paramView.isInteractionEnabled()) {
          return;
        }
        MotionScene.Transition localTransition1;
        if (MotionScene.Transition.access$100(mTransition) == -1)
        {
          i = paramView.getCurrentState();
          if (i == -1)
          {
            paramView.transitionToState(MotionScene.Transition.access$000(mTransition));
            return;
          }
          localTransition1 = new MotionScene.Transition(MotionScene.Transition.access$800(mTransition), mTransition);
          MotionScene.Transition.access$102(localTransition1, i);
          MotionScene.Transition.access$002(localTransition1, MotionScene.Transition.access$000(mTransition));
          paramView.setTransition(localTransition1);
          paramView.transitionToEnd();
          return;
        }
        MotionScene.Transition localTransition2 = access$800mTransition).mCurrentTransition;
        int i = mMode;
        int j = 0;
        int k;
        if (((i & 0x1) == 0) && ((i & 0x100) == 0)) {
          k = 0;
        } else {
          k = 1;
        }
        if (((i & 0x10) == 0) && ((i & 0x1000) == 0)) {
          i = 0;
        } else {
          i = 1;
        }
        int m;
        if ((k != 0) && (i != 0)) {
          m = 1;
        } else {
          m = 0;
        }
        int n = i;
        if (m != 0)
        {
          MotionScene.Transition localTransition3 = access$800mTransition).mCurrentTransition;
          localTransition1 = mTransition;
          if (localTransition3 != localTransition1) {
            paramView.setTransition(localTransition1);
          }
          n = i;
          m = j;
          if (paramView.getCurrentState() != paramView.getEndState()) {
            if (paramView.getProgress() > 0.5F)
            {
              n = i;
              m = j;
            }
            else
            {
              n = 0;
            }
          }
        }
        else
        {
          m = k;
        }
        if (isTransitionViable(localTransition2, paramView)) {
          if ((m != 0) && ((mMode & 0x1) != 0))
          {
            paramView.setTransition(mTransition);
            paramView.transitionToEnd();
          }
          else if ((n != 0) && ((mMode & 0x10) != 0))
          {
            paramView.setTransition(mTransition);
            paramView.transitionToStart();
          }
          else if ((m != 0) && ((mMode & 0x100) != 0))
          {
            paramView.setTransition(mTransition);
            paramView.setProgress(1.0F);
          }
          else if ((n != 0) && ((mMode & 0x1000) != 0))
          {
            paramView.setTransition(mTransition);
            paramView.setProgress(0.0F);
          }
        }
      }
      
      public void removeOnClickListeners(MotionLayout paramMotionLayout)
      {
        int i = mTargetId;
        if (i == -1) {
          return;
        }
        paramMotionLayout = paramMotionLayout.findViewById(i);
        if (paramMotionLayout == null)
        {
          paramMotionLayout = z2.t(" (*)  could not find id ");
          paramMotionLayout.append(mTargetId);
          Log.e("MotionScene", paramMotionLayout.toString());
          return;
        }
        paramMotionLayout.setOnClickListener(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */