package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z2;

public class State
{
  public static final int CONSTRAINT_RATIO = 2;
  public static final int CONSTRAINT_SPREAD = 0;
  public static final int CONSTRAINT_WRAP = 1;
  public static final Integer PARENT = Integer.valueOf(0);
  public static final int UNKNOWN = -1;
  public HashMap<Object, HelperReference> mHelperReferences = new HashMap();
  public final ConstraintReference mParent;
  public HashMap<Object, Reference> mReferences = new HashMap();
  public HashMap<String, ArrayList<String>> mTags = new HashMap();
  private int numHelpers;
  
  public State()
  {
    ConstraintReference localConstraintReference = new ConstraintReference(this);
    mParent = localConstraintReference;
    numHelpers = 0;
    mReferences.put(PARENT, localConstraintReference);
  }
  
  private String createHelperKey()
  {
    StringBuilder localStringBuilder = z2.t("__HELPER_KEY_");
    int i = numHelpers;
    numHelpers = (i + 1);
    return z2.q(localStringBuilder, i, "__");
  }
  
  public void apply(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    paramConstraintWidgetContainer.removeAllChildren();
    mParent.getWidth().apply(this, paramConstraintWidgetContainer, 0);
    mParent.getHeight().apply(this, paramConstraintWidgetContainer, 1);
    Object localObject1 = mHelperReferences.keySet().iterator();
    Object localObject2;
    Object localObject3;
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      localObject3 = ((HelperReference)mHelperReferences.get(localObject2)).getHelperWidget();
      if (localObject3 != null)
      {
        localObject4 = (Reference)mReferences.get(localObject2);
        localObject5 = localObject4;
        if (localObject4 == null) {
          localObject5 = constraints(localObject2);
        }
        ((Reference)localObject5).setConstraintWidget((ConstraintWidget)localObject3);
      }
    }
    localObject1 = mReferences.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      localObject5 = (Reference)mReferences.get(localObject2);
      if ((localObject5 != mParent) && ((((Reference)localObject5).getFacade() instanceof HelperReference)))
      {
        localObject3 = ((HelperReference)((Reference)localObject5).getFacade()).getHelperWidget();
        if (localObject3 != null)
        {
          localObject4 = (Reference)mReferences.get(localObject2);
          localObject5 = localObject4;
          if (localObject4 == null) {
            localObject5 = constraints(localObject2);
          }
          ((Reference)localObject5).setConstraintWidget((ConstraintWidget)localObject3);
        }
      }
    }
    Object localObject5 = mReferences.keySet().iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject4 = ((Iterator)localObject5).next();
      localObject4 = (Reference)mReferences.get(localObject4);
      if (localObject4 != mParent)
      {
        localObject1 = ((Reference)localObject4).getConstraintWidget();
        ((ConstraintWidget)localObject1).setDebugName(((Reference)localObject4).getKey().toString());
        ((ConstraintWidget)localObject1).setParent(null);
        if ((((Reference)localObject4).getFacade() instanceof GuidelineReference)) {
          ((Reference)localObject4).apply();
        }
        paramConstraintWidgetContainer.add((ConstraintWidget)localObject1);
      }
      else
      {
        ((Reference)localObject4).setConstraintWidget(paramConstraintWidgetContainer);
      }
    }
    paramConstraintWidgetContainer = mHelperReferences.keySet().iterator();
    while (paramConstraintWidgetContainer.hasNext())
    {
      localObject5 = paramConstraintWidgetContainer.next();
      localObject5 = (HelperReference)mHelperReferences.get(localObject5);
      if (((HelperReference)localObject5).getHelperWidget() != null)
      {
        localObject4 = mReferences.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject1 = ((Iterator)localObject4).next();
          localObject1 = (Reference)mReferences.get(localObject1);
          ((HelperReference)localObject5).getHelperWidget().add(((Reference)localObject1).getConstraintWidget());
        }
        ((HelperReference)localObject5).apply();
      }
      else
      {
        ((HelperReference)localObject5).apply();
      }
    }
    paramConstraintWidgetContainer = mReferences.keySet().iterator();
    while (paramConstraintWidgetContainer.hasNext())
    {
      localObject5 = paramConstraintWidgetContainer.next();
      localObject5 = (Reference)mReferences.get(localObject5);
      if ((localObject5 != mParent) && ((((Reference)localObject5).getFacade() instanceof HelperReference)))
      {
        localObject1 = (HelperReference)((Reference)localObject5).getFacade();
        localObject4 = ((HelperReference)localObject1).getHelperWidget();
        if (localObject4 != null)
        {
          localObject1 = mReferences.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject3 = ((Iterator)localObject1).next();
            localObject2 = (Reference)mReferences.get(localObject3);
            if (localObject2 != null)
            {
              ((HelperWidget)localObject4).add(((Reference)localObject2).getConstraintWidget());
            }
            else if ((localObject3 instanceof Reference))
            {
              ((HelperWidget)localObject4).add(((Reference)localObject3).getConstraintWidget());
            }
            else
            {
              PrintStream localPrintStream = System.out;
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("couldn't find reference for ");
              ((StringBuilder)localObject2).append(localObject3);
              localPrintStream.println(((StringBuilder)localObject2).toString());
            }
          }
          ((Reference)localObject5).apply();
        }
      }
    }
    paramConstraintWidgetContainer = mReferences.keySet().iterator();
    while (paramConstraintWidgetContainer.hasNext())
    {
      localObject5 = paramConstraintWidgetContainer.next();
      localObject4 = (Reference)mReferences.get(localObject5);
      ((Reference)localObject4).apply();
      localObject4 = ((Reference)localObject4).getConstraintWidget();
      if ((localObject4 != null) && (localObject5 != null)) {
        stringId = localObject5.toString();
      }
    }
  }
  
  public BarrierReference barrier(Object paramObject, Direction paramDirection)
  {
    paramObject = constraints(paramObject);
    if ((((ConstraintReference)paramObject).getFacade() == null) || (!(((ConstraintReference)paramObject).getFacade() instanceof BarrierReference)))
    {
      BarrierReference localBarrierReference = new BarrierReference(this);
      localBarrierReference.setBarrierDirection(paramDirection);
      ((ConstraintReference)paramObject).setFacade(localBarrierReference);
    }
    return (BarrierReference)((ConstraintReference)paramObject).getFacade();
  }
  
  public AlignHorizontallyReference centerHorizontally(Object... paramVarArgs)
  {
    AlignHorizontallyReference localAlignHorizontallyReference = (AlignHorizontallyReference)helper(null, Helper.ALIGN_HORIZONTALLY);
    localAlignHorizontallyReference.add(paramVarArgs);
    return localAlignHorizontallyReference;
  }
  
  public AlignVerticallyReference centerVertically(Object... paramVarArgs)
  {
    AlignVerticallyReference localAlignVerticallyReference = (AlignVerticallyReference)helper(null, Helper.ALIGN_VERTICALLY);
    localAlignVerticallyReference.add(paramVarArgs);
    return localAlignVerticallyReference;
  }
  
  public ConstraintReference constraints(Object paramObject)
  {
    Reference localReference = (Reference)mReferences.get(paramObject);
    Object localObject = localReference;
    if (localReference == null)
    {
      localObject = createConstraintReference(paramObject);
      mReferences.put(paramObject, localObject);
      ((Reference)localObject).setKey(paramObject);
    }
    if ((localObject instanceof ConstraintReference)) {
      return (ConstraintReference)localObject;
    }
    return null;
  }
  
  public int convertDimension(Object paramObject)
  {
    if ((paramObject instanceof Float)) {
      return ((Float)paramObject).intValue();
    }
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).intValue();
    }
    return 0;
  }
  
  public ConstraintReference createConstraintReference(Object paramObject)
  {
    return new ConstraintReference(this);
  }
  
  public void directMapping()
  {
    Iterator localIterator = mReferences.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      ConstraintReference localConstraintReference = constraints(localObject);
      if ((localConstraintReference instanceof ConstraintReference)) {
        localConstraintReference.setView(localObject);
      }
    }
  }
  
  public ArrayList<String> getIdsForTag(String paramString)
  {
    if (mTags.containsKey(paramString)) {
      return (ArrayList)mTags.get(paramString);
    }
    return null;
  }
  
  public GuidelineReference guideline(Object paramObject, int paramInt)
  {
    ConstraintReference localConstraintReference = constraints(paramObject);
    if ((localConstraintReference.getFacade() == null) || (!(localConstraintReference.getFacade() instanceof GuidelineReference)))
    {
      GuidelineReference localGuidelineReference = new GuidelineReference(this);
      localGuidelineReference.setOrientation(paramInt);
      localGuidelineReference.setKey(paramObject);
      localConstraintReference.setFacade(localGuidelineReference);
    }
    return (GuidelineReference)localConstraintReference.getFacade();
  }
  
  public State height(Dimension paramDimension)
  {
    return setHeight(paramDimension);
  }
  
  public HelperReference helper(Object paramObject, Helper paramHelper)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = createHelperKey();
    }
    HelperReference localHelperReference = (HelperReference)mHelperReferences.get(localObject);
    paramObject = localHelperReference;
    if (localHelperReference == null)
    {
      int i = 1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper[paramHelper.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                paramObject = new HelperReference(this, paramHelper);
              } else {
                paramObject = new BarrierReference(this);
              }
            }
            else {
              paramObject = new AlignVerticallyReference(this);
            }
          }
          else {
            paramObject = new AlignHorizontallyReference(this);
          }
        }
        else {
          paramObject = new VerticalChainReference(this);
        }
      }
      else {
        paramObject = new HorizontalChainReference(this);
      }
      ((ConstraintReference)paramObject).setKey(localObject);
      mHelperReferences.put(localObject, paramObject);
    }
    return (HelperReference)paramObject;
  }
  
  public HorizontalChainReference horizontalChain()
  {
    return (HorizontalChainReference)helper(null, Helper.HORIZONTAL_CHAIN);
  }
  
  public HorizontalChainReference horizontalChain(Object... paramVarArgs)
  {
    HorizontalChainReference localHorizontalChainReference = (HorizontalChainReference)helper(null, Helper.HORIZONTAL_CHAIN);
    localHorizontalChainReference.add(paramVarArgs);
    return localHorizontalChainReference;
  }
  
  public GuidelineReference horizontalGuideline(Object paramObject)
  {
    return guideline(paramObject, 0);
  }
  
  public void map(Object paramObject1, Object paramObject2)
  {
    paramObject1 = constraints(paramObject1);
    if ((paramObject1 instanceof ConstraintReference)) {
      ((ConstraintReference)paramObject1).setView(paramObject2);
    }
  }
  
  public Reference reference(Object paramObject)
  {
    return (Reference)mReferences.get(paramObject);
  }
  
  public void reset()
  {
    mHelperReferences.clear();
    mTags.clear();
  }
  
  public boolean sameFixedHeight(int paramInt)
  {
    return mParent.getHeight().equalsFixedValue(paramInt);
  }
  
  public boolean sameFixedWidth(int paramInt)
  {
    return mParent.getWidth().equalsFixedValue(paramInt);
  }
  
  public State setHeight(Dimension paramDimension)
  {
    mParent.setHeight(paramDimension);
    return this;
  }
  
  public void setTag(String paramString1, String paramString2)
  {
    Object localObject = constraints(paramString1);
    if ((localObject instanceof ConstraintReference))
    {
      ((ConstraintReference)localObject).setTag(paramString2);
      if (!mTags.containsKey(paramString2))
      {
        localObject = new ArrayList();
        mTags.put(paramString2, localObject);
        paramString2 = (String)localObject;
      }
      else
      {
        paramString2 = (ArrayList)mTags.get(paramString2);
      }
      paramString2.add(paramString1);
    }
  }
  
  public State setWidth(Dimension paramDimension)
  {
    mParent.setWidth(paramDimension);
    return this;
  }
  
  public VerticalChainReference verticalChain()
  {
    return (VerticalChainReference)helper(null, Helper.VERTICAL_CHAIN);
  }
  
  public VerticalChainReference verticalChain(Object... paramVarArgs)
  {
    VerticalChainReference localVerticalChainReference = (VerticalChainReference)helper(null, Helper.VERTICAL_CHAIN);
    localVerticalChainReference.add(paramVarArgs);
    return localVerticalChainReference;
  }
  
  public GuidelineReference verticalGuideline(Object paramObject)
  {
    return guideline(paramObject, 1);
  }
  
  public State width(Dimension paramDimension)
  {
    return setWidth(paramDimension);
  }
  
  public static enum Chain
  {
    static
    {
      Chain localChain1 = new Chain("SPREAD", 0);
      SPREAD = localChain1;
      Chain localChain2 = new Chain("SPREAD_INSIDE", 1);
      SPREAD_INSIDE = localChain2;
      Chain localChain3 = new Chain("PACKED", 2);
      PACKED = localChain3;
      $VALUES = new Chain[] { localChain1, localChain2, localChain3 };
    }
    
    private Chain() {}
  }
  
  public static enum Constraint
  {
    static
    {
      Constraint localConstraint1 = new Constraint("LEFT_TO_LEFT", 0);
      LEFT_TO_LEFT = localConstraint1;
      Constraint localConstraint2 = new Constraint("LEFT_TO_RIGHT", 1);
      LEFT_TO_RIGHT = localConstraint2;
      Constraint localConstraint3 = new Constraint("RIGHT_TO_LEFT", 2);
      RIGHT_TO_LEFT = localConstraint3;
      Constraint localConstraint4 = new Constraint("RIGHT_TO_RIGHT", 3);
      RIGHT_TO_RIGHT = localConstraint4;
      Constraint localConstraint5 = new Constraint("START_TO_START", 4);
      START_TO_START = localConstraint5;
      Constraint localConstraint6 = new Constraint("START_TO_END", 5);
      START_TO_END = localConstraint6;
      Constraint localConstraint7 = new Constraint("END_TO_START", 6);
      END_TO_START = localConstraint7;
      Constraint localConstraint8 = new Constraint("END_TO_END", 7);
      END_TO_END = localConstraint8;
      Constraint localConstraint9 = new Constraint("TOP_TO_TOP", 8);
      TOP_TO_TOP = localConstraint9;
      Constraint localConstraint10 = new Constraint("TOP_TO_BOTTOM", 9);
      TOP_TO_BOTTOM = localConstraint10;
      Constraint localConstraint11 = new Constraint("BOTTOM_TO_TOP", 10);
      BOTTOM_TO_TOP = localConstraint11;
      Constraint localConstraint12 = new Constraint("BOTTOM_TO_BOTTOM", 11);
      BOTTOM_TO_BOTTOM = localConstraint12;
      Constraint localConstraint13 = new Constraint("BASELINE_TO_BASELINE", 12);
      BASELINE_TO_BASELINE = localConstraint13;
      Constraint localConstraint14 = new Constraint("BASELINE_TO_TOP", 13);
      BASELINE_TO_TOP = localConstraint14;
      Constraint localConstraint15 = new Constraint("BASELINE_TO_BOTTOM", 14);
      BASELINE_TO_BOTTOM = localConstraint15;
      Constraint localConstraint16 = new Constraint("CENTER_HORIZONTALLY", 15);
      CENTER_HORIZONTALLY = localConstraint16;
      Constraint localConstraint17 = new Constraint("CENTER_VERTICALLY", 16);
      CENTER_VERTICALLY = localConstraint17;
      Constraint localConstraint18 = new Constraint("CIRCULAR_CONSTRAINT", 17);
      CIRCULAR_CONSTRAINT = localConstraint18;
      $VALUES = new Constraint[] { localConstraint1, localConstraint2, localConstraint3, localConstraint4, localConstraint5, localConstraint6, localConstraint7, localConstraint8, localConstraint9, localConstraint10, localConstraint11, localConstraint12, localConstraint13, localConstraint14, localConstraint15, localConstraint16, localConstraint17, localConstraint18 };
    }
    
    private Constraint() {}
  }
  
  public static enum Direction
  {
    static
    {
      Direction localDirection1 = new Direction("LEFT", 0);
      LEFT = localDirection1;
      Direction localDirection2 = new Direction("RIGHT", 1);
      RIGHT = localDirection2;
      Direction localDirection3 = new Direction("START", 2);
      START = localDirection3;
      Direction localDirection4 = new Direction("END", 3);
      END = localDirection4;
      Direction localDirection5 = new Direction("TOP", 4);
      TOP = localDirection5;
      Direction localDirection6 = new Direction("BOTTOM", 5);
      BOTTOM = localDirection6;
      $VALUES = new Direction[] { localDirection1, localDirection2, localDirection3, localDirection4, localDirection5, localDirection6 };
    }
    
    private Direction() {}
  }
  
  public static enum Helper
  {
    static
    {
      Helper localHelper1 = new Helper("HORIZONTAL_CHAIN", 0);
      HORIZONTAL_CHAIN = localHelper1;
      Helper localHelper2 = new Helper("VERTICAL_CHAIN", 1);
      VERTICAL_CHAIN = localHelper2;
      Helper localHelper3 = new Helper("ALIGN_HORIZONTALLY", 2);
      ALIGN_HORIZONTALLY = localHelper3;
      Helper localHelper4 = new Helper("ALIGN_VERTICALLY", 3);
      ALIGN_VERTICALLY = localHelper4;
      Helper localHelper5 = new Helper("BARRIER", 4);
      BARRIER = localHelper5;
      Helper localHelper6 = new Helper("LAYER", 5);
      LAYER = localHelper6;
      Helper localHelper7 = new Helper("FLOW", 6);
      FLOW = localHelper7;
      $VALUES = new Helper[] { localHelper1, localHelper2, localHelper3, localHelper4, localHelper5, localHelper6, localHelper7 };
    }
    
    private Helper() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */