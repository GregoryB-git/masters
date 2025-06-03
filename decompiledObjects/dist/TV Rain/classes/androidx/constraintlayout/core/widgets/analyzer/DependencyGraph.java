package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

public class DependencyGraph
{
  private static final boolean USE_GROUPS = true;
  private ConstraintWidgetContainer container;
  private ConstraintWidgetContainer mContainer;
  public ArrayList<RunGroup> mGroups = new ArrayList();
  private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
  private BasicMeasure.Measurer mMeasurer = null;
  private boolean mNeedBuildGraph = true;
  private boolean mNeedRedoMeasures = true;
  private ArrayList<WidgetRun> mRuns = new ArrayList();
  private ArrayList<RunGroup> runGroups = new ArrayList();
  
  public DependencyGraph(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    container = paramConstraintWidgetContainer;
    mContainer = paramConstraintWidgetContainer;
  }
  
  private void applyGroup(DependencyNode paramDependencyNode1, int paramInt1, int paramInt2, DependencyNode paramDependencyNode2, ArrayList<RunGroup> paramArrayList, RunGroup paramRunGroup)
  {
    WidgetRun localWidgetRun = run;
    if (runGroup == null)
    {
      paramDependencyNode1 = container;
      if ((localWidgetRun != horizontalRun) && (localWidgetRun != verticalRun))
      {
        paramDependencyNode1 = paramRunGroup;
        if (paramRunGroup == null)
        {
          paramDependencyNode1 = new RunGroup(localWidgetRun, paramInt2);
          paramArrayList.add(paramDependencyNode1);
        }
        runGroup = paramDependencyNode1;
        paramDependencyNode1.add(localWidgetRun);
        paramRunGroup = start.dependencies.iterator();
        while (paramRunGroup.hasNext())
        {
          localObject = (Dependency)paramRunGroup.next();
          if ((localObject instanceof DependencyNode)) {
            applyGroup((DependencyNode)localObject, paramInt1, 0, paramDependencyNode2, paramArrayList, paramDependencyNode1);
          }
        }
        paramRunGroup = end.dependencies.iterator();
        while (paramRunGroup.hasNext())
        {
          localObject = (Dependency)paramRunGroup.next();
          if ((localObject instanceof DependencyNode)) {
            applyGroup((DependencyNode)localObject, paramInt1, 1, paramDependencyNode2, paramArrayList, paramDependencyNode1);
          }
        }
        if ((paramInt1 == 1) && ((localWidgetRun instanceof VerticalWidgetRun)))
        {
          localObject = baseline.dependencies.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramRunGroup = (Dependency)((Iterator)localObject).next();
            if ((paramRunGroup instanceof DependencyNode)) {
              applyGroup((DependencyNode)paramRunGroup, paramInt1, 2, paramDependencyNode2, paramArrayList, paramDependencyNode1);
            }
          }
        }
        paramRunGroup = start.targets.iterator();
        while (paramRunGroup.hasNext())
        {
          localObject = (DependencyNode)paramRunGroup.next();
          if (localObject == paramDependencyNode2) {
            dual = true;
          }
          applyGroup((DependencyNode)localObject, paramInt1, 0, paramDependencyNode2, paramArrayList, paramDependencyNode1);
        }
        Object localObject = end.targets.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramRunGroup = (DependencyNode)((Iterator)localObject).next();
          if (paramRunGroup == paramDependencyNode2) {
            dual = true;
          }
          applyGroup(paramRunGroup, paramInt1, 1, paramDependencyNode2, paramArrayList, paramDependencyNode1);
        }
        if ((paramInt1 == 1) && ((localWidgetRun instanceof VerticalWidgetRun)))
        {
          paramRunGroup = baseline.targets.iterator();
          while (paramRunGroup.hasNext()) {
            applyGroup((DependencyNode)paramRunGroup.next(), paramInt1, 2, paramDependencyNode2, paramArrayList, paramDependencyNode1);
          }
        }
      }
    }
  }
  
  private boolean basicMeasureWidgets(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    Iterator localIterator = mChildren.iterator();
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      Object localObject1 = mListDimensionBehaviors;
      Object localObject2 = localObject1[0];
      Object localObject3 = localObject1[1];
      if (localConstraintWidget.getVisibility() == 8)
      {
        measured = true;
      }
      else
      {
        if ((mMatchConstraintPercentWidth < 1.0F) && (localObject2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)) {
          mMatchConstraintDefaultWidth = 2;
        }
        if ((mMatchConstraintPercentHeight < 1.0F) && (localObject3 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)) {
          mMatchConstraintDefaultHeight = 2;
        }
        if (localConstraintWidget.getDimensionRatio() > 0.0F)
        {
          localObject1 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
          if ((localObject2 == localObject1) && ((localObject3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (localObject3 == ConstraintWidget.DimensionBehaviour.FIXED)))
          {
            mMatchConstraintDefaultWidth = 3;
          }
          else if ((localObject3 == localObject1) && ((localObject2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (localObject2 == ConstraintWidget.DimensionBehaviour.FIXED)))
          {
            mMatchConstraintDefaultHeight = 3;
          }
          else if ((localObject2 == localObject1) && (localObject3 == localObject1))
          {
            if (mMatchConstraintDefaultWidth == 0) {
              mMatchConstraintDefaultWidth = 3;
            }
            if (mMatchConstraintDefaultHeight == 0) {
              mMatchConstraintDefaultHeight = 3;
            }
          }
        }
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        localObject1 = localObject2;
        if (localObject2 == localDimensionBehaviour1)
        {
          localObject1 = localObject2;
          if (mMatchConstraintDefaultWidth == 1) {
            if (mLeft.mTarget != null)
            {
              localObject1 = localObject2;
              if (mRight.mTarget != null) {}
            }
            else
            {
              localObject1 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
          }
        }
        localObject2 = localObject3;
        if (localObject3 == localDimensionBehaviour1)
        {
          localObject2 = localObject3;
          if (mMatchConstraintDefaultHeight == 1) {
            if (mTop.mTarget != null)
            {
              localObject2 = localObject3;
              if (mBottom.mTarget != null) {}
            }
            else
            {
              localObject2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            }
          }
        }
        localObject3 = horizontalRun;
        dimensionBehavior = ((ConstraintWidget.DimensionBehaviour)localObject1);
        int i = mMatchConstraintDefaultWidth;
        matchConstraintsType = i;
        localObject3 = verticalRun;
        dimensionBehavior = ((ConstraintWidget.DimensionBehaviour)localObject2);
        int j = mMatchConstraintDefaultHeight;
        matchConstraintsType = j;
        localObject3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        if (((localObject1 != localObject3) && (localObject1 != ConstraintWidget.DimensionBehaviour.FIXED) && (localObject1 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || ((localObject2 != localObject3) && (localObject2 != ConstraintWidget.DimensionBehaviour.FIXED) && (localObject2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)))
        {
          ConstraintWidget.DimensionBehaviour localDimensionBehaviour2;
          Object localObject4;
          if (localObject1 == localDimensionBehaviour1)
          {
            localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if ((localObject2 == localDimensionBehaviour2) || (localObject2 == ConstraintWidget.DimensionBehaviour.FIXED))
            {
              if (i == 3)
              {
                if (localObject2 == localDimensionBehaviour2) {
                  measure(localConstraintWidget, localDimensionBehaviour2, 0, localDimensionBehaviour2, 0);
                }
                i = localConstraintWidget.getHeight();
                j = (int)(i * mDimensionRatio + 0.5F);
                localObject2 = ConstraintWidget.DimensionBehaviour.FIXED;
                measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject2, j, (ConstraintWidget.DimensionBehaviour)localObject2, i);
                horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                measured = true;
                continue;
              }
              if (i == 1)
              {
                measure(localConstraintWidget, localDimensionBehaviour2, 0, (ConstraintWidget.DimensionBehaviour)localObject2, 0);
                horizontalRun.dimension.wrapValue = localConstraintWidget.getWidth();
                continue;
              }
              if (i == 2)
              {
                localDimensionBehaviour2 = mListDimensionBehaviors[0];
                localObject4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if ((localDimensionBehaviour2 == localObject4) || (localDimensionBehaviour2 == localObject3))
                {
                  measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject4, (int)(mMatchConstraintPercentWidth * paramConstraintWidgetContainer.getWidth() + 0.5F), (ConstraintWidget.DimensionBehaviour)localObject2, localConstraintWidget.getHeight());
                  horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                  verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                  measured = true;
                }
              }
              else
              {
                localObject4 = mListAnchors;
                if ((0mTarget == null) || (1mTarget == null))
                {
                  measure(localConstraintWidget, localDimensionBehaviour2, 0, (ConstraintWidget.DimensionBehaviour)localObject2, 0);
                  horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                  verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                  measured = true;
                  continue;
                }
              }
            }
          }
          float f1;
          float f2;
          if (localObject2 == localDimensionBehaviour1)
          {
            localObject4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if ((localObject1 == localObject4) || (localObject1 == ConstraintWidget.DimensionBehaviour.FIXED))
            {
              if (j == 3)
              {
                if (localObject1 == localObject4) {
                  measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject4, 0, (ConstraintWidget.DimensionBehaviour)localObject4, 0);
                }
                j = localConstraintWidget.getWidth();
                f1 = mDimensionRatio;
                f2 = f1;
                if (localConstraintWidget.getDimensionRatioSide() == -1) {
                  f2 = 1.0F / f1;
                }
                i = (int)(j * f2 + 0.5F);
                localObject2 = ConstraintWidget.DimensionBehaviour.FIXED;
                measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject2, j, (ConstraintWidget.DimensionBehaviour)localObject2, i);
                horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                measured = true;
                continue;
              }
              if (j == 1)
              {
                measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject1, 0, (ConstraintWidget.DimensionBehaviour)localObject4, 0);
                verticalRun.dimension.wrapValue = localConstraintWidget.getHeight();
                continue;
              }
              if (j == 2)
              {
                localObject4 = mListDimensionBehaviors[1];
                localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                if ((localObject4 == localDimensionBehaviour2) || (localObject4 == localObject3))
                {
                  f2 = mMatchConstraintPercentHeight;
                  measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject1, localConstraintWidget.getWidth(), localDimensionBehaviour2, (int)(f2 * paramConstraintWidgetContainer.getHeight() + 0.5F));
                  horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                  verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                  measured = true;
                }
              }
              else
              {
                localObject3 = mListAnchors;
                if ((2mTarget == null) || (3mTarget == null))
                {
                  measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject4, 0, (ConstraintWidget.DimensionBehaviour)localObject2, 0);
                  horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                  verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                  measured = true;
                  continue;
                }
              }
            }
          }
          if ((localObject1 == localDimensionBehaviour1) && (localObject2 == localDimensionBehaviour1)) {
            if ((i != 1) && (j != 1))
            {
              if ((j == 2) && (i == 2))
              {
                localObject1 = mListDimensionBehaviors;
                localObject3 = localObject1[0];
                localObject2 = ConstraintWidget.DimensionBehaviour.FIXED;
                if ((localObject3 == localObject2) && (localObject1[1] == localObject2))
                {
                  f1 = mMatchConstraintPercentWidth;
                  f2 = mMatchConstraintPercentHeight;
                  measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject2, (int)(f1 * paramConstraintWidgetContainer.getWidth() + 0.5F), (ConstraintWidget.DimensionBehaviour)localObject2, (int)(f2 * paramConstraintWidgetContainer.getHeight() + 0.5F));
                  horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
                  verticalRun.dimension.resolve(localConstraintWidget.getHeight());
                  measured = true;
                }
              }
            }
            else
            {
              localObject2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
              measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject2, 0, (ConstraintWidget.DimensionBehaviour)localObject2, 0);
              horizontalRun.dimension.wrapValue = localConstraintWidget.getWidth();
              verticalRun.dimension.wrapValue = localConstraintWidget.getHeight();
            }
          }
        }
        else
        {
          i = localConstraintWidget.getWidth();
          int k;
          if (localObject1 == localObject3)
          {
            i = paramConstraintWidgetContainer.getWidth();
            j = mLeft.mMargin;
            k = mRight.mMargin;
            localObject1 = ConstraintWidget.DimensionBehaviour.FIXED;
            i = i - j - k;
          }
          j = localConstraintWidget.getHeight();
          if (localObject2 == localObject3)
          {
            k = paramConstraintWidgetContainer.getHeight();
            j = mTop.mMargin;
            int m = mBottom.mMargin;
            localObject2 = ConstraintWidget.DimensionBehaviour.FIXED;
            j = k - j - m;
          }
          measure(localConstraintWidget, (ConstraintWidget.DimensionBehaviour)localObject1, i, (ConstraintWidget.DimensionBehaviour)localObject2, j);
          horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
          verticalRun.dimension.resolve(localConstraintWidget.getHeight());
          measured = true;
        }
      }
    }
    return false;
  }
  
  private int computeWrap(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt)
  {
    int i = mGroups.size();
    long l = 0L;
    for (int j = 0; j < i; j++) {
      l = Math.max(l, ((RunGroup)mGroups.get(j)).computeWrapSize(paramConstraintWidgetContainer, paramInt));
    }
    return (int)l;
  }
  
  private void displayGraph()
  {
    Object localObject1 = mRuns.iterator();
    for (Object localObject2 = "digraph {\n"; ((Iterator)localObject1).hasNext(); localObject2 = generateDisplayGraph((WidgetRun)((Iterator)localObject1).next(), (String)localObject2)) {}
    String str = z2.o((String)localObject2, "\n}\n");
    localObject2 = System.out;
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("content:<<\n");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append("\n>>");
    ((PrintStream)localObject2).println(((StringBuilder)localObject1).toString());
  }
  
  private void findGroup(WidgetRun paramWidgetRun, int paramInt, ArrayList<RunGroup> paramArrayList)
  {
    Object localObject1 = start.dependencies.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Dependency)((Iterator)localObject1).next();
      if ((localObject2 instanceof DependencyNode)) {
        applyGroup((DependencyNode)localObject2, paramInt, 0, end, paramArrayList, null);
      } else if ((localObject2 instanceof WidgetRun)) {
        applyGroup(start, paramInt, 0, end, paramArrayList, null);
      }
    }
    Object localObject2 = end.dependencies.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Dependency)((Iterator)localObject2).next();
      if ((localObject1 instanceof DependencyNode)) {
        applyGroup((DependencyNode)localObject1, paramInt, 1, start, paramArrayList, null);
      } else if ((localObject1 instanceof WidgetRun)) {
        applyGroup(end, paramInt, 1, start, paramArrayList, null);
      }
    }
    if (paramInt == 1)
    {
      localObject2 = baseline.dependencies.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramWidgetRun = (Dependency)((Iterator)localObject2).next();
        if ((paramWidgetRun instanceof DependencyNode)) {
          applyGroup((DependencyNode)paramWidgetRun, paramInt, 2, null, paramArrayList, null);
        }
      }
    }
  }
  
  private String generateChainDisplayGraph(ChainRun paramChainRun, String paramString)
  {
    int i = orientation;
    StringBuilder localStringBuilder = new StringBuilder("subgraph ");
    localStringBuilder.append("cluster_");
    localStringBuilder.append(widget.getDebugName());
    if (i == 0) {
      localStringBuilder.append("_h");
    } else {
      localStringBuilder.append("_v");
    }
    localStringBuilder.append(" {\n");
    Object localObject = widgets.iterator();
    WidgetRun localWidgetRun;
    for (paramChainRun = ""; ((Iterator)localObject).hasNext(); paramChainRun = generateDisplayGraph(localWidgetRun, paramChainRun))
    {
      localWidgetRun = (WidgetRun)((Iterator)localObject).next();
      localStringBuilder.append(widget.getDebugName());
      if (i == 0) {
        localStringBuilder.append("_HORIZONTAL");
      } else {
        localStringBuilder.append("_VERTICAL");
      }
      localStringBuilder.append(";\n");
    }
    localStringBuilder.append("}\n");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append(paramChainRun);
    ((StringBuilder)localObject).append(localStringBuilder);
    return ((StringBuilder)localObject).toString();
  }
  
  private String generateDisplayGraph(WidgetRun paramWidgetRun, String paramString)
  {
    DependencyNode localDependencyNode1 = start;
    DependencyNode localDependencyNode2 = end;
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if ((!(paramWidgetRun instanceof HelperReferences)) && (dependencies.isEmpty()) && ((dependencies.isEmpty() & targets.isEmpty())) && (targets.isEmpty())) {
      return paramString;
    }
    localStringBuilder.append(nodeDefinition(paramWidgetRun));
    boolean bool1 = isCenteredConnection(localDependencyNode1, localDependencyNode2);
    Object localObject = generateDisplayNode(localDependencyNode2, bool1, generateDisplayNode(localDependencyNode1, bool1, paramString));
    boolean bool2 = paramWidgetRun instanceof VerticalWidgetRun;
    paramString = (String)localObject;
    if (bool2) {
      paramString = generateDisplayNode(baseline, bool1, (String)localObject);
    }
    if (!(paramWidgetRun instanceof HorizontalWidgetRun))
    {
      bool1 = paramWidgetRun instanceof ChainRun;
      if ((!bool1) || (orientation != 0))
      {
        if ((!bool2) && ((!bool1) || (orientation != 1))) {
          break label707;
        }
        localObject = widget.getVerticalDimensionBehaviour();
        if ((localObject != ConstraintWidget.DimensionBehaviour.FIXED) && (localObject != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
        {
          if ((localObject != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (widget.getDimensionRatio() <= 0.0F)) {
            break label707;
          }
          localStringBuilder.append("\n");
          localStringBuilder.append(widget.getDebugName());
          localStringBuilder.append("_VERTICAL -> ");
          localStringBuilder.append(widget.getDebugName());
          localStringBuilder.append("_HORIZONTAL;\n");
          break label707;
        }
        if ((!targets.isEmpty()) && (targets.isEmpty()))
        {
          localStringBuilder.append("\n");
          localStringBuilder.append(localDependencyNode2.name());
          localStringBuilder.append(" -> ");
          localStringBuilder.append(localDependencyNode1.name());
          localStringBuilder.append("\n");
          break label707;
        }
        if ((!targets.isEmpty()) || (targets.isEmpty())) {
          break label707;
        }
        localStringBuilder.append("\n");
        localStringBuilder.append(localDependencyNode1.name());
        localStringBuilder.append(" -> ");
        localStringBuilder.append(localDependencyNode2.name());
        localStringBuilder.append("\n");
        break label707;
      }
    }
    localObject = widget.getHorizontalDimensionBehaviour();
    if ((localObject != ConstraintWidget.DimensionBehaviour.FIXED) && (localObject != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
    {
      if ((localObject == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (widget.getDimensionRatio() > 0.0F))
      {
        localStringBuilder.append("\n");
        localStringBuilder.append(widget.getDebugName());
        localStringBuilder.append("_HORIZONTAL -> ");
        localStringBuilder.append(widget.getDebugName());
        localStringBuilder.append("_VERTICAL;\n");
      }
    }
    else if ((!targets.isEmpty()) && (targets.isEmpty()))
    {
      localStringBuilder.append("\n");
      localStringBuilder.append(localDependencyNode2.name());
      localStringBuilder.append(" -> ");
      localStringBuilder.append(localDependencyNode1.name());
      localStringBuilder.append("\n");
    }
    else if ((targets.isEmpty()) && (!targets.isEmpty()))
    {
      localStringBuilder.append("\n");
      localStringBuilder.append(localDependencyNode1.name());
      localStringBuilder.append(" -> ");
      localStringBuilder.append(localDependencyNode2.name());
      localStringBuilder.append("\n");
    }
    label707:
    if ((paramWidgetRun instanceof ChainRun)) {
      return generateChainDisplayGraph((ChainRun)paramWidgetRun, paramString);
    }
    return localStringBuilder.toString();
  }
  
  private String generateDisplayNode(DependencyNode paramDependencyNode, boolean paramBoolean, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    Iterator localIterator = targets.iterator();
    while (localIterator.hasNext())
    {
      paramString = (DependencyNode)localIterator.next();
      Object localObject = z2.t("\n");
      ((StringBuilder)localObject).append(paramDependencyNode.name());
      localObject = z2.u(((StringBuilder)localObject).toString(), " -> ");
      ((StringBuilder)localObject).append(paramString.name());
      localObject = ((StringBuilder)localObject).toString();
      if ((margin <= 0) && (!paramBoolean))
      {
        paramString = (String)localObject;
        if (!(run instanceof HelperReferences)) {}
      }
      else
      {
        localObject = z2.o((String)localObject, "[");
        paramString = (String)localObject;
        if (margin > 0)
        {
          localObject = z2.q(z2.u((String)localObject, "label=\""), margin, "\"");
          paramString = (String)localObject;
          if (paramBoolean) {
            paramString = z2.o((String)localObject, ",");
          }
        }
        localObject = paramString;
        if (paramBoolean) {
          localObject = z2.o(paramString, " style=dashed ");
        }
        paramString = (String)localObject;
        if ((run instanceof HelperReferences)) {
          paramString = z2.o((String)localObject, " style=bold,color=gray ");
        }
        paramString = z2.o(paramString, "]");
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("\n");
      localStringBuilder.append(((StringBuilder)localObject).toString());
    }
    return localStringBuilder.toString();
  }
  
  private boolean isCenteredConnection(DependencyNode paramDependencyNode1, DependencyNode paramDependencyNode2)
  {
    Iterator localIterator = targets.iterator();
    boolean bool1 = false;
    int i = 0;
    while (localIterator.hasNext()) {
      if ((DependencyNode)localIterator.next() != paramDependencyNode2) {
        i++;
      }
    }
    paramDependencyNode2 = targets.iterator();
    int j = 0;
    while (paramDependencyNode2.hasNext()) {
      if ((DependencyNode)paramDependencyNode2.next() != paramDependencyNode1) {
        j++;
      }
    }
    boolean bool2 = bool1;
    if (i > 0)
    {
      bool2 = bool1;
      if (j > 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private void measure(ConstraintWidget paramConstraintWidget, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, int paramInt1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, int paramInt2)
  {
    BasicMeasure.Measure localMeasure = mMeasure;
    horizontalBehavior = paramDimensionBehaviour1;
    verticalBehavior = paramDimensionBehaviour2;
    horizontalDimension = paramInt1;
    verticalDimension = paramInt2;
    mMeasurer.measure(paramConstraintWidget, localMeasure);
    paramConstraintWidget.setWidth(mMeasure.measuredWidth);
    paramConstraintWidget.setHeight(mMeasure.measuredHeight);
    paramConstraintWidget.setHasBaseline(mMeasure.measuredHasBaseline);
    paramConstraintWidget.setBaselineDistance(mMeasure.measuredBaseline);
  }
  
  private String nodeDefinition(WidgetRun paramWidgetRun)
  {
    boolean bool1 = paramWidgetRun instanceof VerticalWidgetRun;
    String str = widget.getDebugName();
    StringBuilder localStringBuilder = new StringBuilder(str);
    Object localObject = widget;
    if (!bool1) {
      localObject = ((ConstraintWidget)localObject).getHorizontalDimensionBehaviour();
    } else {
      localObject = ((ConstraintWidget)localObject).getVerticalDimensionBehaviour();
    }
    RunGroup localRunGroup = runGroup;
    if (!bool1) {
      localStringBuilder.append("_HORIZONTAL");
    } else {
      localStringBuilder.append("_VERTICAL");
    }
    localStringBuilder.append(" [shape=none, label=<");
    localStringBuilder.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
    localStringBuilder.append("  <TR>");
    if (!bool1)
    {
      localStringBuilder.append("    <TD ");
      if (start.resolved) {
        localStringBuilder.append(" BGCOLOR=\"green\"");
      }
      localStringBuilder.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
    }
    else
    {
      localStringBuilder.append("    <TD ");
      if (start.resolved) {
        localStringBuilder.append(" BGCOLOR=\"green\"");
      }
      localStringBuilder.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
    }
    localStringBuilder.append("    <TD BORDER=\"1\" ");
    boolean bool2 = dimension.resolved;
    if ((bool2) && (!widget.measured)) {
      localStringBuilder.append(" BGCOLOR=\"green\" ");
    } else if (bool2) {
      localStringBuilder.append(" BGCOLOR=\"lightgray\" ");
    } else if (widget.measured) {
      localStringBuilder.append(" BGCOLOR=\"yellow\" ");
    }
    if (localObject == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
      localStringBuilder.append("style=\"dashed\"");
    }
    localStringBuilder.append(">");
    localStringBuilder.append(str);
    if (localRunGroup != null)
    {
      localStringBuilder.append(" [");
      localStringBuilder.append(groupIndex + 1);
      localStringBuilder.append("/");
      localStringBuilder.append(RunGroup.index);
      localStringBuilder.append("]");
    }
    localStringBuilder.append(" </TD>");
    if (!bool1)
    {
      localStringBuilder.append("    <TD ");
      if (end.resolved) {
        localStringBuilder.append(" BGCOLOR=\"green\"");
      }
      localStringBuilder.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
    }
    else
    {
      localStringBuilder.append("    <TD ");
      if (baseline.resolved) {
        localStringBuilder.append(" BGCOLOR=\"green\"");
      }
      localStringBuilder.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
      localStringBuilder.append("    <TD ");
      if (end.resolved) {
        localStringBuilder.append(" BGCOLOR=\"green\"");
      }
      localStringBuilder.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
    }
    return z2.s(localStringBuilder, "  </TR></TABLE>", ">];\n");
  }
  
  public void buildGraph()
  {
    buildGraph(mRuns);
    mGroups.clear();
    RunGroup.index = 0;
    findGroup(container.horizontalRun, 0, mGroups);
    findGroup(container.verticalRun, 1, mGroups);
    mNeedBuildGraph = false;
  }
  
  public void buildGraph(ArrayList<WidgetRun> paramArrayList)
  {
    paramArrayList.clear();
    mContainer.horizontalRun.clear();
    mContainer.verticalRun.clear();
    paramArrayList.add(mContainer.horizontalRun);
    paramArrayList.add(mContainer.verticalRun);
    Iterator localIterator = mContainer.mChildren.iterator();
    Object localObject1 = null;
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      if ((localConstraintWidget instanceof Guideline))
      {
        paramArrayList.add(new GuidelineReference(localConstraintWidget));
      }
      else
      {
        Object localObject2;
        if (localConstraintWidget.isInHorizontalChain())
        {
          if (horizontalChainRun == null) {
            horizontalChainRun = new ChainRun(localConstraintWidget, 0);
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new HashSet();
          }
          ((HashSet)localObject2).add(horizontalChainRun);
          localObject1 = localObject2;
        }
        else
        {
          paramArrayList.add(horizontalRun);
        }
        if (localConstraintWidget.isInVerticalChain())
        {
          if (verticalChainRun == null) {
            verticalChainRun = new ChainRun(localConstraintWidget, 1);
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new HashSet();
          }
          ((HashSet)localObject2).add(verticalChainRun);
        }
        else
        {
          paramArrayList.add(verticalRun);
          localObject2 = localObject1;
        }
        localObject1 = localObject2;
        if ((localConstraintWidget instanceof HelperWidget))
        {
          paramArrayList.add(new HelperReferences(localConstraintWidget));
          localObject1 = localObject2;
        }
      }
    }
    if (localObject1 != null) {
      paramArrayList.addAll((Collection)localObject1);
    }
    localObject1 = paramArrayList.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((WidgetRun)((Iterator)localObject1).next()).clear();
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localObject1 = (WidgetRun)paramArrayList.next();
      if (widget != mContainer) {
        ((WidgetRun)localObject1).apply();
      }
    }
  }
  
  public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2)
  {
    if (mNeedBuildGraph)
    {
      buildGraph();
      Object localObject1 = container.mChildren.iterator();
      int i = 0;
      Object localObject2;
      Object localObject3;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
        localObject3 = isTerminalWidget;
        localObject3[0] = 1;
        localObject3[1] = 1;
        if ((localObject2 instanceof Barrier)) {
          i = 1;
        }
      }
      if (i == 0)
      {
        localObject2 = mGroups.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (RunGroup)((Iterator)localObject2).next();
          localObject3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
          boolean bool1;
          if (paramDimensionBehaviour1 == localObject3) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          boolean bool2;
          if (paramDimensionBehaviour2 == localObject3) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          ((RunGroup)localObject1).defineTerminalWidgets(bool1, bool2);
        }
      }
    }
  }
  
  public boolean directMeasure(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = paramBoolean & true;
    if ((mNeedBuildGraph) || (mNeedRedoMeasures))
    {
      localObject1 = container.mChildren.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
        ((ConstraintWidget)localObject2).ensureWidgetRuns();
        measured = false;
        horizontalRun.reset();
        verticalRun.reset();
      }
      container.ensureWidgetRuns();
      localObject1 = container;
      measured = false;
      horizontalRun.reset();
      container.verticalRun.reset();
      mNeedRedoMeasures = false;
    }
    if (basicMeasureWidgets(mContainer)) {
      return false;
    }
    container.setX(0);
    container.setY(0);
    Object localObject2 = container.getDimensionBehaviour(0);
    Object localObject1 = container.getDimensionBehaviour(1);
    if (mNeedBuildGraph) {
      buildGraph();
    }
    int i = container.getX();
    int j = container.getY();
    container.horizontalRun.start.resolve(i);
    container.verticalRun.start.resolve(j);
    measureWidgets();
    Object localObject3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
    boolean bool3;
    if ((localObject2 == localObject3) || (localObject1 == localObject3))
    {
      bool3 = bool2;
      if (bool2)
      {
        localObject3 = mRuns.iterator();
        do
        {
          bool3 = bool2;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
        } while (((WidgetRun)((Iterator)localObject3).next()).supportsWrapComputation());
        bool3 = false;
      }
      if ((bool3) && (localObject2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
      {
        container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        localObject3 = container;
        ((ConstraintWidget)localObject3).setWidth(computeWrap((ConstraintWidgetContainer)localObject3, 0));
        localObject3 = container;
        horizontalRun.dimension.resolve(((ConstraintWidget)localObject3).getWidth());
      }
      if ((bool3) && (localObject1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
      {
        container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
        localObject3 = container;
        ((ConstraintWidget)localObject3).setHeight(computeWrap((ConstraintWidgetContainer)localObject3, 1));
        localObject3 = container;
        verticalRun.dimension.resolve(((ConstraintWidget)localObject3).getHeight());
      }
    }
    Object localObject4 = container;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = mListDimensionBehaviors[0];
    localObject3 = ConstraintWidget.DimensionBehaviour.FIXED;
    int k;
    if ((localDimensionBehaviour != localObject3) && (localDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
    {
      bool3 = false;
    }
    else
    {
      k = ((ConstraintWidget)localObject4).getWidth() + i;
      container.horizontalRun.end.resolve(k);
      container.horizontalRun.dimension.resolve(k - i);
      measureWidgets();
      localObject4 = container;
      localDimensionBehaviour = mListDimensionBehaviors[1];
      if ((localDimensionBehaviour == localObject3) || (localDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
      {
        k = ((ConstraintWidget)localObject4).getHeight() + j;
        container.verticalRun.end.resolve(k);
        container.verticalRun.dimension.resolve(k - j);
      }
      measureWidgets();
      k = 1;
    }
    localObject3 = mRuns.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (WidgetRun)((Iterator)localObject3).next();
      if ((widget != container) || (resolved)) {
        ((WidgetRun)localObject4).applyToWidget();
      }
    }
    localObject4 = mRuns.iterator();
    do
    {
      paramBoolean = bool1;
      if (!((Iterator)localObject4).hasNext()) {
        break;
      }
      localObject3 = (WidgetRun)((Iterator)localObject4).next();
    } while ((k == 0) && (widget == container));
    if (!start.resolved) {}
    for (;;)
    {
      paramBoolean = false;
      break label785;
      if ((end.resolved) || ((localObject3 instanceof GuidelineReference))) {
        if ((dimension.resolved) || ((localObject3 instanceof ChainRun)) || ((localObject3 instanceof GuidelineReference))) {
          break;
        }
      }
    }
    label785:
    container.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject2);
    container.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
    return paramBoolean;
  }
  
  public boolean directMeasureSetup(boolean paramBoolean)
  {
    if (mNeedBuildGraph)
    {
      Object localObject1 = container.mChildren.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ConstraintWidget localConstraintWidget = (ConstraintWidget)((Iterator)localObject1).next();
        localConstraintWidget.ensureWidgetRuns();
        measured = false;
        Object localObject2 = horizontalRun;
        dimension.resolved = false;
        resolved = false;
        ((HorizontalWidgetRun)localObject2).reset();
        localObject2 = verticalRun;
        dimension.resolved = false;
        resolved = false;
        ((VerticalWidgetRun)localObject2).reset();
      }
      container.ensureWidgetRuns();
      localObject1 = container;
      measured = false;
      localObject1 = horizontalRun;
      dimension.resolved = false;
      resolved = false;
      ((HorizontalWidgetRun)localObject1).reset();
      localObject1 = container.verticalRun;
      dimension.resolved = false;
      resolved = false;
      ((VerticalWidgetRun)localObject1).reset();
      buildGraph();
    }
    if (basicMeasureWidgets(mContainer)) {
      return false;
    }
    container.setX(0);
    container.setY(0);
    container.horizontalRun.start.resolve(0);
    container.verticalRun.start.resolve(0);
    return true;
  }
  
  public boolean directMeasureWithOrientation(boolean paramBoolean, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = paramBoolean & true;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = container.getDimensionBehaviour(0);
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = container.getDimensionBehaviour(1);
    int i = container.getX();
    int j = container.getY();
    Object localObject2;
    if (bool2)
    {
      localObject1 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
      if ((localDimensionBehaviour1 == localObject1) || (localDimensionBehaviour2 == localObject1))
      {
        localObject2 = mRuns.iterator();
        do
        {
          bool3 = bool2;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localObject1 = (WidgetRun)((Iterator)localObject2).next();
        } while ((orientation != paramInt) || (((WidgetRun)localObject1).supportsWrapComputation()));
        boolean bool3 = false;
        if (paramInt == 0)
        {
          if ((bool3) && (localDimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
          {
            container.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            localObject1 = container;
            ((ConstraintWidget)localObject1).setWidth(computeWrap((ConstraintWidgetContainer)localObject1, 0));
            localObject1 = container;
            horizontalRun.dimension.resolve(((ConstraintWidget)localObject1).getWidth());
          }
        }
        else if ((bool3) && (localDimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT))
        {
          container.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
          localObject1 = container;
          ((ConstraintWidget)localObject1).setHeight(computeWrap((ConstraintWidgetContainer)localObject1, 1));
          localObject1 = container;
          verticalRun.dimension.resolve(((ConstraintWidget)localObject1).getHeight());
        }
      }
    }
    if (paramInt == 0)
    {
      localObject1 = container;
      localObject2 = mListDimensionBehaviors[0];
      if ((localObject2 == ConstraintWidget.DimensionBehaviour.FIXED) || (localObject2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT))
      {
        k = ((ConstraintWidget)localObject1).getWidth() + i;
        container.horizontalRun.end.resolve(k);
        container.horizontalRun.dimension.resolve(k - i);
        break label421;
      }
    }
    else
    {
      localObject1 = container;
      localObject2 = mListDimensionBehaviors[1];
      if ((localObject2 == ConstraintWidget.DimensionBehaviour.FIXED) || (localObject2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
        break label378;
      }
    }
    int k = 0;
    break label424;
    label378:
    k = ((ConstraintWidget)localObject1).getHeight() + j;
    container.verticalRun.end.resolve(k);
    container.verticalRun.dimension.resolve(k - j);
    label421:
    k = 1;
    label424:
    measureWidgets();
    Object localObject1 = mRuns.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (WidgetRun)((Iterator)localObject1).next();
      if ((orientation == paramInt) && ((widget != container) || (resolved))) {
        ((WidgetRun)localObject2).applyToWidget();
      }
    }
    localObject1 = mRuns.iterator();
    do
    {
      paramBoolean = bool1;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject2 = (WidgetRun)((Iterator)localObject1).next();
    } while ((orientation != paramInt) || ((k == 0) && (widget == container)));
    if (!start.resolved) {}
    for (;;)
    {
      paramBoolean = false;
      break label619;
      if (end.resolved) {
        if (((localObject2 instanceof ChainRun)) || (dimension.resolved)) {
          break;
        }
      }
    }
    label619:
    container.setHorizontalDimensionBehaviour(localDimensionBehaviour1);
    container.setVerticalDimensionBehaviour(localDimensionBehaviour2);
    return paramBoolean;
  }
  
  public void invalidateGraph()
  {
    mNeedBuildGraph = true;
  }
  
  public void invalidateMeasures()
  {
    mNeedRedoMeasures = true;
  }
  
  public void measureWidgets()
  {
    Iterator localIterator = container.mChildren.iterator();
    while (localIterator.hasNext())
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      if (!measured)
      {
        Object localObject1 = mListDimensionBehaviors;
        int i = 0;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = localObject1[0];
        Object localObject2 = localObject1[1];
        int j = mMatchConstraintDefaultWidth;
        int k = mMatchConstraintDefaultHeight;
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if ((localDimensionBehaviour1 != localDimensionBehaviour2) && ((localDimensionBehaviour1 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || (j != 1))) {
          j = 0;
        } else {
          j = 1;
        }
        int m;
        if (localObject2 != localDimensionBehaviour2)
        {
          m = i;
          if (localObject2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
          {
            m = i;
            if (k != 1) {}
          }
        }
        else
        {
          m = 1;
        }
        DimensionDependency localDimensionDependency = horizontalRun.dimension;
        boolean bool1 = resolved;
        localObject1 = verticalRun.dimension;
        boolean bool2 = resolved;
        if ((bool1) && (bool2))
        {
          localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.FIXED;
          measure(localConstraintWidget, localDimensionBehaviour1, value, localDimensionBehaviour1, value);
          measured = true;
        }
        else if ((bool1) && (m != 0))
        {
          measure(localConstraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, value, localDimensionBehaviour2, value);
          if (localObject2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
          {
            verticalRun.dimension.wrapValue = localConstraintWidget.getHeight();
          }
          else
          {
            verticalRun.dimension.resolve(localConstraintWidget.getHeight());
            measured = true;
          }
        }
        else if ((bool2) && (j != 0))
        {
          measure(localConstraintWidget, localDimensionBehaviour2, value, ConstraintWidget.DimensionBehaviour.FIXED, value);
          if (localDimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
          {
            horizontalRun.dimension.wrapValue = localConstraintWidget.getWidth();
          }
          else
          {
            horizontalRun.dimension.resolve(localConstraintWidget.getWidth());
            measured = true;
          }
        }
        if (measured)
        {
          localObject1 = verticalRun.baselineDimension;
          if (localObject1 != null) {
            ((DimensionDependency)localObject1).resolve(localConstraintWidget.getBaselineDistance());
          }
        }
      }
    }
  }
  
  public void setMeasurer(BasicMeasure.Measurer paramMeasurer)
  {
    mMeasurer = paramMeasurer;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DependencyGraph
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */