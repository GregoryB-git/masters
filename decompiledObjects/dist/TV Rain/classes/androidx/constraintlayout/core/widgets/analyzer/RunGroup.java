package androidx.constraintlayout.core.widgets.analyzer;

import a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class RunGroup
{
  public static final int BASELINE = 2;
  public static final int END = 1;
  public static final int START = 0;
  public static int index;
  public int direction;
  public boolean dual = false;
  public WidgetRun firstRun = null;
  public int groupIndex;
  public WidgetRun lastRun = null;
  public int position = 0;
  public ArrayList<WidgetRun> runs = new ArrayList();
  
  public RunGroup(WidgetRun paramWidgetRun, int paramInt)
  {
    int i = index;
    groupIndex = i;
    index = i + 1;
    firstRun = paramWidgetRun;
    lastRun = paramWidgetRun;
    direction = paramInt;
  }
  
  private boolean defineTerminalWidget(WidgetRun paramWidgetRun, int paramInt)
  {
    if (widget.isTerminalWidget[paramInt] == 0) {
      return false;
    }
    Iterator localIterator = start.dependencies.iterator();
    Object localObject1;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (Dependency)localIterator.next();
      if ((localObject1 instanceof DependencyNode))
      {
        localObject1 = (DependencyNode)localObject1;
        localObject2 = run;
        if ((localObject2 != paramWidgetRun) && (localObject1 == start))
        {
          if ((paramWidgetRun instanceof ChainRun))
          {
            localObject2 = widgets.iterator();
            while (((Iterator)localObject2).hasNext()) {
              defineTerminalWidget((WidgetRun)((Iterator)localObject2).next(), paramInt);
            }
          }
          if (!(paramWidgetRun instanceof HelperReferences)) {
            widget.isTerminalWidget[paramInt] = false;
          }
          defineTerminalWidget(run, paramInt);
        }
      }
    }
    localIterator = end.dependencies.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (Dependency)localIterator.next();
      if ((localObject1 instanceof DependencyNode))
      {
        localObject1 = (DependencyNode)localObject1;
        localObject2 = run;
        if ((localObject2 != paramWidgetRun) && (localObject1 == start))
        {
          if ((paramWidgetRun instanceof ChainRun))
          {
            localObject2 = widgets.iterator();
            while (((Iterator)localObject2).hasNext()) {
              defineTerminalWidget((WidgetRun)((Iterator)localObject2).next(), paramInt);
            }
          }
          if (!(paramWidgetRun instanceof HelperReferences)) {
            widget.isTerminalWidget[paramInt] = false;
          }
          defineTerminalWidget(run, paramInt);
        }
      }
    }
    return false;
  }
  
  private long traverseEnd(DependencyNode paramDependencyNode, long paramLong)
  {
    WidgetRun localWidgetRun = run;
    if ((localWidgetRun instanceof HelperReferences)) {
      return paramLong;
    }
    int i = dependencies.size();
    int j = 0;
    for (long l1 = paramLong; j < i; l1 = l2)
    {
      Object localObject = (Dependency)dependencies.get(j);
      l2 = l1;
      if ((localObject instanceof DependencyNode))
      {
        localObject = (DependencyNode)localObject;
        if (run == localWidgetRun) {
          l2 = l1;
        } else {
          l2 = Math.min(l1, traverseEnd((DependencyNode)localObject, margin + paramLong));
        }
      }
      j++;
    }
    long l2 = l1;
    if (paramDependencyNode == end)
    {
      l2 = localWidgetRun.getWrapDimension();
      paramDependencyNode = start;
      paramLong -= l2;
      l2 = Math.min(Math.min(l1, traverseEnd(paramDependencyNode, paramLong)), paramLong - start.margin);
    }
    return l2;
  }
  
  private long traverseStart(DependencyNode paramDependencyNode, long paramLong)
  {
    WidgetRun localWidgetRun = run;
    if ((localWidgetRun instanceof HelperReferences)) {
      return paramLong;
    }
    int i = dependencies.size();
    int j = 0;
    for (long l1 = paramLong; j < i; l1 = l2)
    {
      Object localObject = (Dependency)dependencies.get(j);
      l2 = l1;
      if ((localObject instanceof DependencyNode))
      {
        localObject = (DependencyNode)localObject;
        if (run == localWidgetRun) {
          l2 = l1;
        } else {
          l2 = Math.max(l1, traverseStart((DependencyNode)localObject, margin + paramLong));
        }
      }
      j++;
    }
    long l2 = l1;
    if (paramDependencyNode == start)
    {
      l2 = localWidgetRun.getWrapDimension();
      paramDependencyNode = end;
      paramLong += l2;
      l2 = Math.max(Math.max(l1, traverseStart(paramDependencyNode, paramLong)), paramLong - end.margin);
    }
    return l2;
  }
  
  public void add(WidgetRun paramWidgetRun)
  {
    runs.add(paramWidgetRun);
    lastRun = paramWidgetRun;
  }
  
  public long computeWrapSize(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt)
  {
    WidgetRun localWidgetRun = firstRun;
    boolean bool1 = localWidgetRun instanceof ChainRun;
    long l1 = 0L;
    if (bool1)
    {
      if (orientation != paramInt) {
        return 0L;
      }
    }
    else if (paramInt == 0)
    {
      if (!(localWidgetRun instanceof HorizontalWidgetRun)) {
        return 0L;
      }
    }
    else if (!(localWidgetRun instanceof VerticalWidgetRun)) {
      return 0L;
    }
    if (paramInt == 0) {
      localObject = horizontalRun;
    } else {
      localObject = verticalRun;
    }
    Object localObject = start;
    if (paramInt == 0) {
      paramConstraintWidgetContainer = horizontalRun;
    } else {
      paramConstraintWidgetContainer = verticalRun;
    }
    paramConstraintWidgetContainer = end;
    boolean bool2 = start.targets.contains(localObject);
    bool1 = firstRun.end.targets.contains(paramConstraintWidgetContainer);
    long l2 = firstRun.getWrapDimension();
    long l3;
    long l5;
    if ((bool2) && (bool1))
    {
      l3 = traverseStart(firstRun.start, 0L);
      long l4 = traverseEnd(firstRun.end, 0L);
      l5 = l3 - l2;
      paramConstraintWidgetContainer = firstRun;
      int i = end.margin;
      l3 = l5;
      if (l5 >= -i) {
        l3 = l5 + i;
      }
      l5 = -l4;
      i = start.margin;
      l4 = l5 - l2 - i;
      l5 = l4;
      if (l4 >= i) {
        l5 = l4 - i;
      }
      float f1 = widget.getBiasPercent(paramInt);
      if (f1 > 0.0F)
      {
        f2 = (float)l5 / f1;
        l1 = ((float)l3 / (1.0F - f1) + f2);
      }
      float f2 = (float)l1;
      l5 = (f2 * f1 + 0.5F);
      l3 = a.a(1.0F, f1, f2, 0.5F);
      paramConstraintWidgetContainer = firstRun;
      l3 = start.margin + (l5 + l2 + l3) - end.margin;
    }
    else if (bool2)
    {
      paramConstraintWidgetContainer = firstRun.start;
      l3 = Math.max(traverseStart(paramConstraintWidgetContainer, margin), firstRun.start.margin + l2);
    }
    else if (bool1)
    {
      paramConstraintWidgetContainer = firstRun.end;
      l3 = traverseEnd(paramConstraintWidgetContainer, margin);
      l5 = -firstRun.end.margin;
      l3 = Math.max(-l3, l5 + l2);
    }
    else
    {
      paramConstraintWidgetContainer = firstRun;
      l3 = start.margin;
      l3 = paramConstraintWidgetContainer.getWrapDimension() + l3 - firstRun.end.margin;
    }
    return l3;
  }
  
  public void defineTerminalWidgets(boolean paramBoolean1, boolean paramBoolean2)
  {
    WidgetRun localWidgetRun;
    if (paramBoolean1)
    {
      localWidgetRun = firstRun;
      if ((localWidgetRun instanceof HorizontalWidgetRun)) {
        defineTerminalWidget(localWidgetRun, 0);
      }
    }
    if (paramBoolean2)
    {
      localWidgetRun = firstRun;
      if ((localWidgetRun instanceof VerticalWidgetRun)) {
        defineTerminalWidget(localWidgetRun, 1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.RunGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */