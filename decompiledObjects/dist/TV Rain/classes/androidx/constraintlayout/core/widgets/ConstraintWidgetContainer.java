package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidgetContainer
  extends WidgetContainer
{
  private static final boolean DEBUG = false;
  public static final boolean DEBUG_GRAPH = false;
  private static final boolean DEBUG_LAYOUT = false;
  private static final int MAX_ITERATIONS = 8;
  public static int myCounter;
  private WeakReference<ConstraintAnchor> horizontalWrapMax = null;
  private WeakReference<ConstraintAnchor> horizontalWrapMin = null;
  public BasicMeasure mBasicMeasureSolver = new BasicMeasure(this);
  public int mDebugSolverPassCount = 0;
  public DependencyGraph mDependencyGraph = new DependencyGraph(this);
  public boolean mGroupsWrapOptimized = false;
  private boolean mHeightMeasuredTooSmall = false;
  public ChainHead[] mHorizontalChainsArray = new ChainHead[4];
  public int mHorizontalChainsSize = 0;
  public boolean mHorizontalWrapOptimized = false;
  private boolean mIsRtl = false;
  public BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
  public BasicMeasure.Measurer mMeasurer = null;
  public Metrics mMetrics;
  private int mOptimizationLevel = 257;
  public int mPaddingBottom;
  public int mPaddingLeft;
  public int mPaddingRight;
  public int mPaddingTop;
  public boolean mSkipSolver = false;
  public LinearSystem mSystem = new LinearSystem();
  public ChainHead[] mVerticalChainsArray = new ChainHead[4];
  public int mVerticalChainsSize = 0;
  public boolean mVerticalWrapOptimized = false;
  private boolean mWidthMeasuredTooSmall = false;
  public int mWrapFixedHeight = 0;
  public int mWrapFixedWidth = 0;
  private int pass;
  private WeakReference<ConstraintAnchor> verticalWrapMax = null;
  private WeakReference<ConstraintAnchor> verticalWrapMin = null;
  public HashSet<ConstraintWidget> widgetsToAdd = new HashSet();
  
  public ConstraintWidgetContainer() {}
  
  public ConstraintWidgetContainer(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public ConstraintWidgetContainer(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public ConstraintWidgetContainer(String paramString, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    setDebugName(paramString);
  }
  
  private void addHorizontalChain(ConstraintWidget paramConstraintWidget)
  {
    int i = mHorizontalChainsSize;
    ChainHead[] arrayOfChainHead = mHorizontalChainsArray;
    if (i + 1 >= arrayOfChainHead.length) {
      mHorizontalChainsArray = ((ChainHead[])Arrays.copyOf(arrayOfChainHead, arrayOfChainHead.length * 2));
    }
    mHorizontalChainsArray[mHorizontalChainsSize] = new ChainHead(paramConstraintWidget, 0, isRtl());
    mHorizontalChainsSize += 1;
  }
  
  private void addMaxWrap(ConstraintAnchor paramConstraintAnchor, SolverVariable paramSolverVariable)
  {
    paramConstraintAnchor = mSystem.createObjectVariable(paramConstraintAnchor);
    mSystem.addGreaterThan(paramSolverVariable, paramConstraintAnchor, 0, 5);
  }
  
  private void addMinWrap(ConstraintAnchor paramConstraintAnchor, SolverVariable paramSolverVariable)
  {
    paramConstraintAnchor = mSystem.createObjectVariable(paramConstraintAnchor);
    mSystem.addGreaterThan(paramConstraintAnchor, paramSolverVariable, 0, 5);
  }
  
  private void addVerticalChain(ConstraintWidget paramConstraintWidget)
  {
    int i = mVerticalChainsSize;
    ChainHead[] arrayOfChainHead = mVerticalChainsArray;
    if (i + 1 >= arrayOfChainHead.length) {
      mVerticalChainsArray = ((ChainHead[])Arrays.copyOf(arrayOfChainHead, arrayOfChainHead.length * 2));
    }
    mVerticalChainsArray[mVerticalChainsSize] = new ChainHead(paramConstraintWidget, 1, isRtl());
    mVerticalChainsSize += 1;
  }
  
  public static boolean measure(int paramInt1, ConstraintWidget paramConstraintWidget, BasicMeasure.Measurer paramMeasurer, BasicMeasure.Measure paramMeasure, int paramInt2)
  {
    if (paramMeasurer == null) {
      return false;
    }
    if ((paramConstraintWidget.getVisibility() != 8) && (!(paramConstraintWidget instanceof Guideline)) && (!(paramConstraintWidget instanceof Barrier)))
    {
      horizontalBehavior = paramConstraintWidget.getHorizontalDimensionBehaviour();
      verticalBehavior = paramConstraintWidget.getVerticalDimensionBehaviour();
      horizontalDimension = paramConstraintWidget.getWidth();
      verticalDimension = paramConstraintWidget.getHeight();
      measuredNeedsSolverPass = false;
      measureStrategy = paramInt2;
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = horizontalBehavior;
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
      if (localDimensionBehaviour1 == localDimensionBehaviour2) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (verticalBehavior == localDimensionBehaviour2) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      int i;
      if ((paramInt1 != 0) && (mDimensionRatio > 0.0F)) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if ((paramInt2 != 0) && (mDimensionRatio > 0.0F)) {
        j = 1;
      } else {
        j = 0;
      }
      int k = paramInt1;
      if (paramInt1 != 0)
      {
        k = paramInt1;
        if (paramConstraintWidget.hasDanglingDimension(0))
        {
          k = paramInt1;
          if (mMatchConstraintDefaultWidth == 0)
          {
            k = paramInt1;
            if (i == 0)
            {
              horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
              if ((paramInt2 != 0) && (mMatchConstraintDefaultHeight == 0)) {
                horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
              }
              k = 0;
            }
          }
        }
      }
      paramInt1 = paramInt2;
      if (paramInt2 != 0)
      {
        paramInt1 = paramInt2;
        if (paramConstraintWidget.hasDanglingDimension(1))
        {
          paramInt1 = paramInt2;
          if (mMatchConstraintDefaultHeight == 0)
          {
            paramInt1 = paramInt2;
            if (j == 0)
            {
              verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
              if ((k != 0) && (mMatchConstraintDefaultWidth == 0)) {
                verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
              }
              paramInt1 = 0;
            }
          }
        }
      }
      if (paramConstraintWidget.isResolvedHorizontally())
      {
        horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        k = 0;
      }
      if (paramConstraintWidget.isResolvedVertically())
      {
        verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        paramInt1 = 0;
      }
      if (i != 0) {
        if (mResolvedMatchConstraintDefault[0] == 4)
        {
          horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        else if (paramInt1 == 0)
        {
          localDimensionBehaviour1 = verticalBehavior;
          localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
          if (localDimensionBehaviour1 == localDimensionBehaviour2)
          {
            paramInt1 = verticalDimension;
          }
          else
          {
            horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            paramMeasurer.measure(paramConstraintWidget, paramMeasure);
            paramInt1 = measuredHeight;
          }
          horizontalBehavior = localDimensionBehaviour2;
          horizontalDimension = ((int)(paramConstraintWidget.getDimensionRatio() * paramInt1));
        }
      }
      if (j != 0) {
        if (mResolvedMatchConstraintDefault[1] == 4)
        {
          verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        else if (k == 0)
        {
          localDimensionBehaviour1 = horizontalBehavior;
          localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
          if (localDimensionBehaviour1 == localDimensionBehaviour2)
          {
            paramInt1 = horizontalDimension;
          }
          else
          {
            verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            paramMeasurer.measure(paramConstraintWidget, paramMeasure);
            paramInt1 = measuredWidth;
          }
          verticalBehavior = localDimensionBehaviour2;
          if (paramConstraintWidget.getDimensionRatioSide() == -1) {
            verticalDimension = ((int)(paramInt1 / paramConstraintWidget.getDimensionRatio()));
          } else {
            verticalDimension = ((int)(paramConstraintWidget.getDimensionRatio() * paramInt1));
          }
        }
      }
      paramMeasurer.measure(paramConstraintWidget, paramMeasure);
      paramConstraintWidget.setWidth(measuredWidth);
      paramConstraintWidget.setHeight(measuredHeight);
      paramConstraintWidget.setHasBaseline(measuredHasBaseline);
      paramConstraintWidget.setBaselineDistance(measuredBaseline);
      measureStrategy = BasicMeasure.Measure.SELF_DIMENSIONS;
      return measuredNeedsSolverPass;
    }
    measuredWidth = 0;
    measuredHeight = 0;
    return false;
  }
  
  private void resetChains()
  {
    mHorizontalChainsSize = 0;
    mVerticalChainsSize = 0;
  }
  
  public void addChain(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    if (paramInt == 0) {
      addHorizontalChain(paramConstraintWidget);
    } else if (paramInt == 1) {
      addVerticalChain(paramConstraintWidget);
    }
  }
  
  public boolean addChildrenToSolver(LinearSystem paramLinearSystem)
  {
    boolean bool = optimizeFor(64);
    addToSolver(paramLinearSystem, bool);
    int i = mChildren.size();
    int j = 0;
    int k = j;
    Object localObject1;
    while (j < i)
    {
      localObject1 = (ConstraintWidget)mChildren.get(j);
      ((ConstraintWidget)localObject1).setInBarrier(0, false);
      ((ConstraintWidget)localObject1).setInBarrier(1, false);
      if ((localObject1 instanceof Barrier)) {
        k = 1;
      }
      j++;
    }
    if (k != 0) {
      for (j = 0; j < i; j++)
      {
        localObject1 = (ConstraintWidget)mChildren.get(j);
        if ((localObject1 instanceof Barrier)) {
          ((Barrier)localObject1).markWidgets();
        }
      }
    }
    widgetsToAdd.clear();
    for (j = 0; j < i; j++)
    {
      localObject1 = (ConstraintWidget)mChildren.get(j);
      if (((ConstraintWidget)localObject1).addFirst()) {
        if ((localObject1 instanceof VirtualLayout)) {
          widgetsToAdd.add(localObject1);
        } else {
          ((ConstraintWidget)localObject1).addToSolver(paramLinearSystem, bool);
        }
      }
    }
    Object localObject2;
    while (widgetsToAdd.size() > 0)
    {
      j = widgetsToAdd.size();
      localObject1 = widgetsToAdd.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (VirtualLayout)((Iterator)localObject1).next();
        if (((VirtualLayout)localObject2).contains(widgetsToAdd))
        {
          ((ConstraintWidget)localObject2).addToSolver(paramLinearSystem, bool);
          widgetsToAdd.remove(localObject2);
        }
      }
      if (j == widgetsToAdd.size())
      {
        localObject1 = widgetsToAdd.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((ConstraintWidget)((Iterator)localObject1).next()).addToSolver(paramLinearSystem, bool);
        }
        widgetsToAdd.clear();
      }
    }
    if (LinearSystem.USE_DEPENDENCY_ORDERING)
    {
      localObject1 = new HashSet();
      for (j = 0; j < i; j++)
      {
        localObject2 = (ConstraintWidget)mChildren.get(j);
        if (!((ConstraintWidget)localObject2).addFirst()) {
          ((HashSet)localObject1).add(localObject2);
        }
      }
      if (getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
        j = 0;
      } else {
        j = 1;
      }
      addChildrenToSolverByDependency(this, paramLinearSystem, (HashSet)localObject1, j, false);
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
        Optimizer.checkMatchParent(this, paramLinearSystem, (ConstraintWidget)localObject2);
        ((ConstraintWidget)localObject2).addToSolver(paramLinearSystem, bool);
      }
    }
    for (j = 0; j < i; j++)
    {
      localObject1 = (ConstraintWidget)mChildren.get(j);
      if ((localObject1 instanceof ConstraintWidgetContainer))
      {
        Object localObject3 = mListDimensionBehaviors;
        localObject2 = localObject3[0];
        localObject3 = localObject3[1];
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (localObject2 == localDimensionBehaviour) {
          ((ConstraintWidget)localObject1).setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        }
        if (localObject3 == localDimensionBehaviour) {
          ((ConstraintWidget)localObject1).setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        }
        ((ConstraintWidget)localObject1).addToSolver(paramLinearSystem, bool);
        if (localObject2 == localDimensionBehaviour) {
          ((ConstraintWidget)localObject1).setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject2);
        }
        if (localObject3 == localDimensionBehaviour) {
          ((ConstraintWidget)localObject1).setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject3);
        }
      }
      else
      {
        Optimizer.checkMatchParent(this, paramLinearSystem, (ConstraintWidget)localObject1);
        if (!((ConstraintWidget)localObject1).addFirst()) {
          ((ConstraintWidget)localObject1).addToSolver(paramLinearSystem, bool);
        }
      }
    }
    if (mHorizontalChainsSize > 0) {
      Chain.applyChainConstraints(this, paramLinearSystem, null, 0);
    }
    if (mVerticalChainsSize > 0) {
      Chain.applyChainConstraints(this, paramLinearSystem, null, 1);
    }
    return true;
  }
  
  public void addHorizontalWrapMaxVariable(ConstraintAnchor paramConstraintAnchor)
  {
    WeakReference localWeakReference = horizontalWrapMax;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramConstraintAnchor.getFinalValue() > ((ConstraintAnchor)horizontalWrapMax.get()).getFinalValue())) {
      horizontalWrapMax = new WeakReference(paramConstraintAnchor);
    }
  }
  
  public void addHorizontalWrapMinVariable(ConstraintAnchor paramConstraintAnchor)
  {
    WeakReference localWeakReference = horizontalWrapMin;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramConstraintAnchor.getFinalValue() > ((ConstraintAnchor)horizontalWrapMin.get()).getFinalValue())) {
      horizontalWrapMin = new WeakReference(paramConstraintAnchor);
    }
  }
  
  public void addVerticalWrapMaxVariable(ConstraintAnchor paramConstraintAnchor)
  {
    WeakReference localWeakReference = verticalWrapMax;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramConstraintAnchor.getFinalValue() > ((ConstraintAnchor)verticalWrapMax.get()).getFinalValue())) {
      verticalWrapMax = new WeakReference(paramConstraintAnchor);
    }
  }
  
  public void addVerticalWrapMinVariable(ConstraintAnchor paramConstraintAnchor)
  {
    WeakReference localWeakReference = verticalWrapMin;
    if ((localWeakReference == null) || (localWeakReference.get() == null) || (paramConstraintAnchor.getFinalValue() > ((ConstraintAnchor)verticalWrapMin.get()).getFinalValue())) {
      verticalWrapMin = new WeakReference(paramConstraintAnchor);
    }
  }
  
  public void defineTerminalWidgets()
  {
    mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
  }
  
  public boolean directMeasure(boolean paramBoolean)
  {
    return mDependencyGraph.directMeasure(paramBoolean);
  }
  
  public boolean directMeasureSetup(boolean paramBoolean)
  {
    return mDependencyGraph.directMeasureSetup(paramBoolean);
  }
  
  public boolean directMeasureWithOrientation(boolean paramBoolean, int paramInt)
  {
    return mDependencyGraph.directMeasureWithOrientation(paramBoolean, paramInt);
  }
  
  public void fillMetrics(Metrics paramMetrics)
  {
    mMetrics = paramMetrics;
    mSystem.fillMetrics(paramMetrics);
  }
  
  public ArrayList<Guideline> getHorizontalGuidelines()
  {
    ArrayList localArrayList = new ArrayList();
    int i = mChildren.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (ConstraintWidget)mChildren.get(j);
      if ((localObject instanceof Guideline))
      {
        localObject = (Guideline)localObject;
        if (((Guideline)localObject).getOrientation() == 0) {
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  public BasicMeasure.Measurer getMeasurer()
  {
    return mMeasurer;
  }
  
  public int getOptimizationLevel()
  {
    return mOptimizationLevel;
  }
  
  public void getSceneString(StringBuilder paramStringBuilder)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(stringId);
    ((StringBuilder)localObject).append(":{\n");
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("  actualWidth:");
    ((StringBuilder)localObject).append(mWidth);
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    paramStringBuilder.append("\n");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("  actualHeight:");
    ((StringBuilder)localObject).append(mHeight);
    paramStringBuilder.append(((StringBuilder)localObject).toString());
    paramStringBuilder.append("\n");
    localObject = getChildren().iterator();
    while (((Iterator)localObject).hasNext())
    {
      ((ConstraintWidget)((Iterator)localObject).next()).getSceneString(paramStringBuilder);
      paramStringBuilder.append(",\n");
    }
    paramStringBuilder.append("}");
  }
  
  public LinearSystem getSystem()
  {
    return mSystem;
  }
  
  public String getType()
  {
    return "ConstraintLayout";
  }
  
  public ArrayList<Guideline> getVerticalGuidelines()
  {
    ArrayList localArrayList = new ArrayList();
    int i = mChildren.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (ConstraintWidget)mChildren.get(j);
      if ((localObject instanceof Guideline))
      {
        localObject = (Guideline)localObject;
        if (((Guideline)localObject).getOrientation() == 1) {
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  public boolean handlesInternalConstraints()
  {
    return false;
  }
  
  public void invalidateGraph()
  {
    mDependencyGraph.invalidateGraph();
  }
  
  public void invalidateMeasures()
  {
    mDependencyGraph.invalidateMeasures();
  }
  
  public boolean isHeightMeasuredTooSmall()
  {
    return mHeightMeasuredTooSmall;
  }
  
  public boolean isRtl()
  {
    return mIsRtl;
  }
  
  public boolean isWidthMeasuredTooSmall()
  {
    return mWidthMeasuredTooSmall;
  }
  
  public void layout()
  {
    mX = 0;
    mY = 0;
    mWidthMeasuredTooSmall = false;
    mHeightMeasuredTooSmall = false;
    int i = mChildren.size();
    int j = Math.max(0, getWidth());
    int k = Math.max(0, getHeight());
    Object localObject1 = mListDimensionBehaviors;
    Object localObject2 = localObject1[1];
    localObject1 = localObject1[0];
    Object localObject3 = mMetrics;
    if (localObject3 != null) {
      layouts += 1L;
    }
    if ((pass == 0) && (Optimizer.enabled(mOptimizationLevel, 1)))
    {
      Direct.solvingPass(this, getMeasurer());
      for (m = 0; m < i; m++)
      {
        localObject3 = (ConstraintWidget)mChildren.get(m);
        if ((((ConstraintWidget)localObject3).isMeasureRequested()) && (!(localObject3 instanceof Guideline)) && (!(localObject3 instanceof Barrier)) && (!(localObject3 instanceof VirtualLayout)) && (!((ConstraintWidget)localObject3).isInVirtualLayout()))
        {
          localObject4 = ((ConstraintWidget)localObject3).getDimensionBehaviour(0);
          localObject5 = ((ConstraintWidget)localObject3).getDimensionBehaviour(1);
          ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
          if ((localObject4 == localDimensionBehaviour) && (mMatchConstraintDefaultWidth != 1) && (localObject5 == localDimensionBehaviour) && (mMatchConstraintDefaultHeight != 1)) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            localObject4 = new BasicMeasure.Measure();
            measure(0, (ConstraintWidget)localObject3, mMeasurer, (BasicMeasure.Measure)localObject4, BasicMeasure.Measure.SELF_DIMENSIONS);
          }
        }
      }
    }
    if (i > 2)
    {
      localObject3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      if (((localObject1 == localObject3) || (localObject2 == localObject3)) && (Optimizer.enabled(mOptimizationLevel, 1024)) && (Grouping.simpleSolvingPass(this, getMeasurer())))
      {
        m = j;
        if (localObject1 == localObject3) {
          if ((j < getWidth()) && (j > 0))
          {
            setWidth(j);
            mWidthMeasuredTooSmall = true;
            m = j;
          }
          else
          {
            m = getWidth();
          }
        }
        j = k;
        if (localObject2 == localObject3) {
          if ((k < getHeight()) && (k > 0))
          {
            setHeight(k);
            mHeightMeasuredTooSmall = true;
            j = k;
          }
          else
          {
            j = getHeight();
          }
        }
        bool1 = true;
        break label421;
      }
    }
    int m = j;
    boolean bool1 = false;
    j = k;
    label421:
    if ((!optimizeFor(64)) && (!optimizeFor(128))) {
      k = 0;
    } else {
      k = 1;
    }
    localObject3 = mSystem;
    graphOptimizer = false;
    newgraphOptimizer = false;
    if ((mOptimizationLevel != 0) && (k != 0)) {
      newgraphOptimizer = true;
    }
    localObject3 = mChildren;
    Object localObject5 = getHorizontalDimensionBehaviour();
    Object localObject4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    if ((localObject5 != localObject4) && (getVerticalDimensionBehaviour() != localObject4)) {
      k = 0;
    } else {
      k = 1;
    }
    resetChains();
    for (int n = 0; n < i; n++)
    {
      localObject4 = (ConstraintWidget)mChildren.get(n);
      if ((localObject4 instanceof WidgetContainer)) {
        ((WidgetContainer)localObject4).layout();
      }
    }
    boolean bool2 = optimizeFor(64);
    n = 0;
    boolean bool3 = true;
    while (bool3)
    {
      int i1 = n + 1;
      boolean bool4 = bool3;
      try
      {
        mSystem.reset();
        bool4 = bool3;
        resetChains();
        bool4 = bool3;
        createObjectVariables(mSystem);
        for (n = 0; n < i; n++)
        {
          bool4 = bool3;
          ((ConstraintWidget)mChildren.get(n)).createObjectVariables(mSystem);
        }
        bool4 = bool3;
        bool3 = addChildrenToSolver(mSystem);
        bool4 = bool3;
        localObject4 = verticalWrapMin;
        if (localObject4 != null)
        {
          bool4 = bool3;
          if (((Reference)localObject4).get() != null)
          {
            bool4 = bool3;
            addMinWrap((ConstraintAnchor)verticalWrapMin.get(), mSystem.createObjectVariable(mTop));
            bool4 = bool3;
            verticalWrapMin = null;
          }
        }
        bool4 = bool3;
        localObject4 = verticalWrapMax;
        if (localObject4 != null)
        {
          bool4 = bool3;
          if (((Reference)localObject4).get() != null)
          {
            bool4 = bool3;
            addMaxWrap((ConstraintAnchor)verticalWrapMax.get(), mSystem.createObjectVariable(mBottom));
            bool4 = bool3;
            verticalWrapMax = null;
          }
        }
        bool4 = bool3;
        localObject4 = horizontalWrapMin;
        if (localObject4 != null)
        {
          bool4 = bool3;
          if (((Reference)localObject4).get() != null)
          {
            bool4 = bool3;
            addMinWrap((ConstraintAnchor)horizontalWrapMin.get(), mSystem.createObjectVariable(mLeft));
            bool4 = bool3;
            horizontalWrapMin = null;
          }
        }
        bool4 = bool3;
        localObject4 = horizontalWrapMax;
        if (localObject4 != null)
        {
          bool4 = bool3;
          if (((Reference)localObject4).get() != null)
          {
            bool4 = bool3;
            addMaxWrap((ConstraintAnchor)horizontalWrapMax.get(), mSystem.createObjectVariable(mRight));
            bool4 = bool3;
            horizontalWrapMax = null;
          }
        }
        bool4 = bool3;
        if (bool3)
        {
          bool4 = bool3;
          mSystem.minimize();
          bool4 = bool3;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        localObject5 = System.out;
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("EXCEPTION : ");
        ((StringBuilder)localObject4).append(localException);
        ((PrintStream)localObject5).println(((StringBuilder)localObject4).toString());
      }
      if (bool4)
      {
        bool4 = updateChildrenFromSolver(mSystem, Optimizer.flags);
      }
      else
      {
        updateFromSolver(mSystem, bool2);
        for (n = 0; n < i; n++) {
          ((ConstraintWidget)mChildren.get(n)).updateFromSolver(mSystem, bool2);
        }
        bool4 = false;
      }
      boolean bool5;
      if ((k != 0) && (i1 < 8) && (Optimizer.flags[2] != 0))
      {
        int i2 = 0;
        n = 0;
        int i3 = 0;
        while (i2 < i)
        {
          localObject4 = (ConstraintWidget)mChildren.get(i2);
          int i4 = mX;
          i3 = Math.max(i3, ((ConstraintWidget)localObject4).getWidth() + i4);
          i4 = mY;
          n = Math.max(n, ((ConstraintWidget)localObject4).getHeight() + i4);
          i2++;
        }
        i2 = Math.max(mMinWidth, i3);
        n = Math.max(mMinHeight, n);
        localObject4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        bool5 = bool1;
        bool3 = bool4;
        if (localObject1 == localObject4)
        {
          bool5 = bool1;
          bool3 = bool4;
          if (getWidth() < i2)
          {
            setWidth(i2);
            mListDimensionBehaviors[0] = localObject4;
            bool5 = true;
            bool3 = true;
          }
        }
        bool1 = bool5;
        bool4 = bool3;
        if (localObject2 == localObject4)
        {
          bool1 = bool5;
          bool4 = bool3;
          if (getHeight() < n)
          {
            setHeight(n);
            mListDimensionBehaviors[1] = localObject4;
            bool1 = true;
            bool4 = true;
          }
        }
      }
      n = Math.max(mMinWidth, getWidth());
      if (n > getWidth())
      {
        setWidth(n);
        mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
        bool1 = true;
        bool4 = true;
      }
      n = Math.max(mMinHeight, getHeight());
      if (n > getHeight())
      {
        setHeight(n);
        mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
        bool1 = true;
        bool4 = bool1;
      }
      boolean bool6 = bool1;
      bool3 = bool4;
      if (!bool1)
      {
        localObject4 = mListDimensionBehaviors[0];
        localObject5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean bool7 = bool1;
        bool5 = bool4;
        if (localObject4 == localObject5)
        {
          bool7 = bool1;
          bool5 = bool4;
          if (m > 0)
          {
            bool7 = bool1;
            bool5 = bool4;
            if (getWidth() > m)
            {
              mWidthMeasuredTooSmall = true;
              mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
              setWidth(m);
              bool7 = true;
              bool5 = bool7;
            }
          }
        }
        bool6 = bool7;
        bool3 = bool5;
        if (mListDimensionBehaviors[1] == localObject5)
        {
          bool6 = bool7;
          bool3 = bool5;
          if (j > 0)
          {
            bool6 = bool7;
            bool3 = bool5;
            if (getHeight() > j)
            {
              mHeightMeasuredTooSmall = true;
              mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
              setHeight(j);
              bool4 = true;
              bool1 = true;
              break label1593;
            }
          }
        }
      }
      bool1 = bool6;
      bool4 = bool3;
      label1593:
      if (i1 > 8) {
        bool3 = false;
      } else {
        bool3 = bool4;
      }
      n = i1;
    }
    mChildren = ((ArrayList)localObject3);
    if (bool1)
    {
      localObject3 = mListDimensionBehaviors;
      localObject3[0] = localObject1;
      localObject3[1] = localObject2;
    }
    resetSolverVariables(mSystem.getCache());
  }
  
  public long measure(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    mPaddingLeft = paramInt8;
    mPaddingTop = paramInt9;
    return mBasicMeasureSolver.solverMeasure(this, paramInt1, paramInt8, paramInt9, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public boolean optimizeFor(int paramInt)
  {
    boolean bool;
    if ((mOptimizationLevel & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reset()
  {
    mSystem.reset();
    mPaddingLeft = 0;
    mPaddingRight = 0;
    mPaddingTop = 0;
    mPaddingBottom = 0;
    mSkipSolver = false;
    super.reset();
  }
  
  public void setMeasurer(BasicMeasure.Measurer paramMeasurer)
  {
    mMeasurer = paramMeasurer;
    mDependencyGraph.setMeasurer(paramMeasurer);
  }
  
  public void setOptimizationLevel(int paramInt)
  {
    mOptimizationLevel = paramInt;
    LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mPaddingLeft = paramInt1;
    mPaddingTop = paramInt2;
    mPaddingRight = paramInt3;
    mPaddingBottom = paramInt4;
  }
  
  public void setPass(int paramInt)
  {
    pass = paramInt;
  }
  
  public void setRtl(boolean paramBoolean)
  {
    mIsRtl = paramBoolean;
  }
  
  public boolean updateChildrenFromSolver(LinearSystem paramLinearSystem, boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    paramArrayOfBoolean[2] = false;
    boolean bool1 = optimizeFor(64);
    updateFromSolver(paramLinearSystem, bool1);
    int j = mChildren.size();
    boolean bool2 = false;
    while (i < j)
    {
      paramArrayOfBoolean = (ConstraintWidget)mChildren.get(i);
      paramArrayOfBoolean.updateFromSolver(paramLinearSystem, bool1);
      if (paramArrayOfBoolean.hasDimensionOverride()) {
        bool2 = true;
      }
      i++;
    }
    return bool2;
  }
  
  public void updateFromRuns(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.updateFromRuns(paramBoolean1, paramBoolean2);
    int i = mChildren.size();
    for (int j = 0; j < i; j++) {
      ((ConstraintWidget)mChildren.get(j)).updateFromRuns(paramBoolean1, paramBoolean2);
    }
  }
  
  public void updateHierarchy()
  {
    mBasicMeasureSolver.updateHierarchy(this);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */