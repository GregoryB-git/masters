package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

public class DependencyNode
  implements Dependency
{
  public boolean delegateToWidgetRun = false;
  public List<Dependency> dependencies = new ArrayList();
  public int margin;
  public DimensionDependency marginDependency = null;
  public int marginFactor = 1;
  public boolean readyToSolve = false;
  public boolean resolved = false;
  public WidgetRun run;
  public List<DependencyNode> targets = new ArrayList();
  public Type type = Type.UNKNOWN;
  public Dependency updateDelegate = null;
  public int value;
  
  public DependencyNode(WidgetRun paramWidgetRun)
  {
    run = paramWidgetRun;
  }
  
  public void addDependency(Dependency paramDependency)
  {
    dependencies.add(paramDependency);
    if (resolved) {
      paramDependency.update(paramDependency);
    }
  }
  
  public void clear()
  {
    targets.clear();
    dependencies.clear();
    resolved = false;
    value = 0;
    readyToSolve = false;
    delegateToWidgetRun = false;
  }
  
  public String name()
  {
    String str = run.widget.getDebugName();
    Object localObject = type;
    if ((localObject != Type.LEFT) && (localObject != Type.RIGHT)) {
      localObject = z2.o(str, "_VERTICAL");
    } else {
      localObject = z2.o(str, "_HORIZONTAL");
    }
    localObject = z2.u((String)localObject, ":");
    ((StringBuilder)localObject).append(type.name());
    return ((StringBuilder)localObject).toString();
  }
  
  public void resolve(int paramInt)
  {
    if (resolved) {
      return;
    }
    resolved = true;
    value = paramInt;
    Iterator localIterator = dependencies.iterator();
    while (localIterator.hasNext())
    {
      Dependency localDependency = (Dependency)localIterator.next();
      localDependency.update(localDependency);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(run.widget.getDebugName());
    localStringBuilder.append(":");
    localStringBuilder.append(type);
    localStringBuilder.append("(");
    Object localObject;
    if (resolved) {
      localObject = Integer.valueOf(value);
    } else {
      localObject = "unresolved";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(") <t=");
    localStringBuilder.append(targets.size());
    localStringBuilder.append(":d=");
    localStringBuilder.append(dependencies.size());
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
  
  public void update(Dependency paramDependency)
  {
    paramDependency = targets.iterator();
    while (paramDependency.hasNext()) {
      if (!nextresolved) {
        return;
      }
    }
    readyToSolve = true;
    paramDependency = updateDelegate;
    if (paramDependency != null) {
      paramDependency.update(this);
    }
    if (delegateToWidgetRun)
    {
      run.update(this);
      return;
    }
    paramDependency = null;
    int i = 0;
    Iterator localIterator = targets.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (DependencyNode)localIterator.next();
      if (!(localObject instanceof DimensionDependency))
      {
        i++;
        paramDependency = (Dependency)localObject;
      }
    }
    if ((paramDependency != null) && (i == 1) && (resolved))
    {
      localObject = marginDependency;
      if (localObject != null) {
        if (resolved) {
          margin = (marginFactor * value);
        } else {
          return;
        }
      }
      resolve(value + margin);
    }
    paramDependency = updateDelegate;
    if (paramDependency != null) {
      paramDependency.update(this);
    }
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("UNKNOWN", 0);
      UNKNOWN = localType1;
      Type localType2 = new Type("HORIZONTAL_DIMENSION", 1);
      HORIZONTAL_DIMENSION = localType2;
      Type localType3 = new Type("VERTICAL_DIMENSION", 2);
      VERTICAL_DIMENSION = localType3;
      Type localType4 = new Type("LEFT", 3);
      LEFT = localType4;
      Type localType5 = new Type("RIGHT", 4);
      RIGHT = localType5;
      Type localType6 = new Type("TOP", 5);
      TOP = localType6;
      Type localType7 = new Type("BOTTOM", 6);
      BOTTOM = localType7;
      Type localType8 = new Type("BASELINE", 7);
      BASELINE = localType8;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4, localType5, localType6, localType7, localType8 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.DependencyNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */