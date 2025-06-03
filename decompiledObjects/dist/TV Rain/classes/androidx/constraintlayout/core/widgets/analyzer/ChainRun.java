package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

public class ChainRun
  extends WidgetRun
{
  private int chainStyle;
  public ArrayList<WidgetRun> widgets = new ArrayList();
  
  public ChainRun(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    super(paramConstraintWidget);
    orientation = paramInt;
    build();
  }
  
  private void build()
  {
    Object localObject1 = widget;
    ConstraintWidget localConstraintWidget;
    for (Object localObject2 = ((ConstraintWidget)localObject1).getPreviousChainMember(orientation); localObject2 != null; localObject2 = localConstraintWidget)
    {
      localConstraintWidget = ((ConstraintWidget)localObject2).getPreviousChainMember(orientation);
      localObject1 = localObject2;
    }
    widget = ((ConstraintWidget)localObject1);
    widgets.add(((ConstraintWidget)localObject1).getRun(orientation));
    for (localObject2 = ((ConstraintWidget)localObject1).getNextChainMember(orientation); localObject2 != null; localObject2 = ((ConstraintWidget)localObject2).getNextChainMember(orientation)) {
      widgets.add(((ConstraintWidget)localObject2).getRun(orientation));
    }
    localObject2 = widgets.iterator();
    int i;
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (WidgetRun)((Iterator)localObject2).next();
      i = orientation;
      if (i == 0) {
        widget.horizontalChainRun = this;
      } else if (i == 1) {
        widget.verticalChainRun = this;
      }
    }
    if ((orientation == 0) && (((ConstraintWidgetContainer)widget.getParent()).isRtl())) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (widgets.size() > 1))
    {
      localObject2 = widgets;
      widget = getsize1widget;
    }
    if (orientation == 0) {
      i = widget.getHorizontalChainStyle();
    } else {
      i = widget.getVerticalChainStyle();
    }
    chainStyle = i;
  }
  
  private ConstraintWidget getFirstVisibleWidget()
  {
    for (int i = 0; i < widgets.size(); i++)
    {
      WidgetRun localWidgetRun = (WidgetRun)widgets.get(i);
      if (widget.getVisibility() != 8) {
        return widget;
      }
    }
    return null;
  }
  
  private ConstraintWidget getLastVisibleWidget()
  {
    for (int i = widgets.size() - 1; i >= 0; i--)
    {
      WidgetRun localWidgetRun = (WidgetRun)widgets.get(i);
      if (widget.getVisibility() != 8) {
        return widget;
      }
    }
    return null;
  }
  
  public void apply()
  {
    Object localObject1 = widgets.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((WidgetRun)((Iterator)localObject1).next()).apply();
    }
    int i = widgets.size();
    if (i < 1) {
      return;
    }
    Object localObject2 = widgets.get(0)).widget;
    localObject1 = widgets.get(i - 1)).widget;
    DependencyNode localDependencyNode;
    if (orientation == 0)
    {
      localObject2 = mLeft;
      localObject1 = mRight;
      localDependencyNode = getTarget((ConstraintAnchor)localObject2, 0);
      i = ((ConstraintAnchor)localObject2).getMargin();
      localObject2 = getFirstVisibleWidget();
      if (localObject2 != null) {
        i = mLeft.getMargin();
      }
      if (localDependencyNode != null) {
        addTarget(start, localDependencyNode, i);
      }
      localObject2 = getTarget((ConstraintAnchor)localObject1, 0);
      i = ((ConstraintAnchor)localObject1).getMargin();
      localObject1 = getLastVisibleWidget();
      if (localObject1 != null) {
        i = mRight.getMargin();
      }
      if (localObject2 != null) {
        addTarget(end, (DependencyNode)localObject2, -i);
      }
    }
    else
    {
      localObject2 = mTop;
      localObject1 = mBottom;
      localDependencyNode = getTarget((ConstraintAnchor)localObject2, 1);
      i = ((ConstraintAnchor)localObject2).getMargin();
      localObject2 = getFirstVisibleWidget();
      if (localObject2 != null) {
        i = mTop.getMargin();
      }
      if (localDependencyNode != null) {
        addTarget(start, localDependencyNode, i);
      }
      localObject2 = getTarget((ConstraintAnchor)localObject1, 1);
      i = ((ConstraintAnchor)localObject1).getMargin();
      localObject1 = getLastVisibleWidget();
      if (localObject1 != null) {
        i = mBottom.getMargin();
      }
      if (localObject2 != null) {
        addTarget(end, (DependencyNode)localObject2, -i);
      }
    }
    start.updateDelegate = this;
    end.updateDelegate = this;
  }
  
  public void applyToWidget()
  {
    for (int i = 0; i < widgets.size(); i++) {
      ((WidgetRun)widgets.get(i)).applyToWidget();
    }
  }
  
  public void clear()
  {
    runGroup = null;
    Iterator localIterator = widgets.iterator();
    while (localIterator.hasNext()) {
      ((WidgetRun)localIterator.next()).clear();
    }
  }
  
  public long getWrapDimension()
  {
    int i = widgets.size();
    long l1 = 0L;
    for (int j = 0; j < i; j++)
    {
      WidgetRun localWidgetRun = (WidgetRun)widgets.get(j);
      long l2 = start.margin;
      long l3 = localWidgetRun.getWrapDimension();
      l1 = end.margin + (l3 + (l1 + l2));
    }
    return l1;
  }
  
  public void reset()
  {
    start.resolved = false;
    end.resolved = false;
  }
  
  public boolean supportsWrapComputation()
  {
    int i = widgets.size();
    for (int j = 0; j < i; j++) {
      if (!((WidgetRun)widgets.get(j)).supportsWrapComputation()) {
        return false;
      }
    }
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ChainRun ");
    if (orientation == 0) {
      localObject = "horizontal : ";
    } else {
      localObject = "vertical : ";
    }
    localStringBuilder.append((String)localObject);
    Object localObject = widgets.iterator();
    while (((Iterator)localObject).hasNext())
    {
      WidgetRun localWidgetRun = (WidgetRun)((Iterator)localObject).next();
      localStringBuilder.append("<");
      localStringBuilder.append(localWidgetRun);
      localStringBuilder.append("> ");
    }
    return localStringBuilder.toString();
  }
  
  public void update(Dependency paramDependency)
  {
    if ((start.resolved) && (end.resolved))
    {
      paramDependency = widget.getParent();
      boolean bool;
      if ((paramDependency instanceof ConstraintWidgetContainer)) {
        bool = ((ConstraintWidgetContainer)paramDependency).isRtl();
      } else {
        bool = false;
      }
      int i = end.value - start.value;
      int j = widgets.size();
      for (int k = 0;; k++)
      {
        m = -1;
        if (k >= j) {
          break;
        }
        n = k;
        if (widgets.get(k)).widget.getVisibility() != 8) {
          break label125;
        }
      }
      int n = -1;
      label125:
      int i1 = j - 1;
      for (k = i1;; k--)
      {
        i2 = m;
        if (k < 0) {
          break label177;
        }
        if (widgets.get(k)).widget.getVisibility() != 8) {
          break;
        }
      }
      int i2 = k;
      label177:
      int i3 = 0;
      int i4;
      Object localObject;
      int i6;
      int i7;
      label417:
      label425:
      float f3;
      while (i3 < 2)
      {
        i4 = 0;
        i5 = 0;
        k = 0;
        m = 0;
        f1 = 0.0F;
        while (i4 < j)
        {
          localObject = (WidgetRun)widgets.get(i4);
          if (widget.getVisibility() == 8)
          {
            i6 = k;
          }
          else
          {
            i7 = m + 1;
            m = i5;
            if (i4 > 0)
            {
              m = i5;
              if (i4 >= n) {
                m = i5 + start.margin;
              }
            }
            paramDependency = dimension;
            i8 = value;
            if (dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
              i5 = 1;
            } else {
              i5 = 0;
            }
            if (i5 != 0)
            {
              i6 = orientation;
              if ((i6 == 0) && (!widget.horizontalRun.dimension.resolved)) {
                return;
              }
              if ((i6 == 1) && (!widget.verticalRun.dimension.resolved)) {
                return;
              }
            }
            else
            {
              if ((matchConstraintsType == 1) && (i3 == 0))
              {
                i5 = wrapValue;
                k++;
              }
              else
              {
                if (!resolved) {
                  break label417;
                }
                i5 = i8;
              }
              i6 = 1;
              break label425;
            }
            i6 = i5;
            i5 = i8;
            if (i6 == 0)
            {
              i5 = k + 1;
              float f2 = widget.mWeight[orientation];
              i8 = m;
              k = i5;
              f3 = f1;
              if (f2 >= 0.0F)
              {
                f3 = f1 + f2;
                i8 = m;
                k = i5;
              }
            }
            else
            {
              i8 = m + i5;
              f3 = f1;
            }
            i5 = i8;
            i6 = k;
            m = i7;
            f1 = f3;
            if (i4 < i1)
            {
              i5 = i8;
              i6 = k;
              m = i7;
              f1 = f3;
              if (i4 < i2)
              {
                i5 = i8 + -end.margin;
                f1 = f3;
                m = i7;
                i6 = k;
              }
            }
          }
          i4++;
          k = i6;
        }
        if ((i5 >= i) && (k != 0))
        {
          i3++;
        }
        else
        {
          i8 = m;
          m = k;
          break label624;
        }
      }
      int i8 = 0;
      int i5 = 0;
      int m = 0;
      float f1 = 0.0F;
      label624:
      i3 = start.value;
      if (bool) {
        i3 = end.value;
      }
      k = i3;
      if (i5 > i) {
        if (bool) {
          k = i3 + (int)((i5 - i) / 2.0F + 0.5F);
        } else {
          k = i3 - (int)((i5 - i) / 2.0F + 0.5F);
        }
      }
      if (m > 0)
      {
        f3 = i - i5;
        i6 = (int)(f3 / m + 0.5F);
        int i9 = 0;
        i4 = 0;
        i3 = i5;
        i5 = i4;
        i4 = k;
        while (i9 < j)
        {
          paramDependency = (WidgetRun)widgets.get(i9);
          if ((widget.getVisibility() != 8) && (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT))
          {
            localObject = dimension;
            if (!resolved)
            {
              if (f1 > 0.0F) {
                k = (int)(widget.mWeight[orientation] * f3 / f1 + 0.5F);
              } else {
                k = i6;
              }
              ConstraintWidget localConstraintWidget;
              if (orientation == 0)
              {
                localConstraintWidget = widget;
                i10 = mMatchConstraintMaxWidth;
                i7 = mMatchConstraintMinWidth;
              }
              else
              {
                localConstraintWidget = widget;
                i10 = mMatchConstraintMaxHeight;
                i7 = mMatchConstraintMinHeight;
              }
              if (matchConstraintsType == 1) {
                i11 = Math.min(k, wrapValue);
              } else {
                i11 = k;
              }
              int i11 = Math.max(i7, i11);
              i7 = i11;
              if (i10 > 0) {
                i7 = Math.min(i10, i11);
              }
              i11 = k;
              int i10 = i5;
              if (i7 != k)
              {
                i10 = i5 + 1;
                i11 = i7;
              }
              dimension.resolve(i11);
              i5 = i10;
            }
          }
          i9++;
        }
        if (i5 > 0)
        {
          i6 = m - i5;
          m = 0;
          k = 0;
          while (m < j)
          {
            paramDependency = (WidgetRun)widgets.get(m);
            if (widget.getVisibility() != 8)
            {
              i3 = k;
              if (m > 0)
              {
                i3 = k;
                if (m >= n) {
                  i3 = k + start.margin;
                }
              }
              i3 += dimension.value;
              k = i3;
              if (m < i1)
              {
                k = i3;
                if (m < i2) {
                  k = i3 + -end.margin;
                }
              }
            }
            m++;
          }
          m = i6;
        }
        else
        {
          k = i3;
        }
        if ((chainStyle == 2) && (i5 == 0))
        {
          chainStyle = 0;
          i5 = k;
          i3 = m;
          k = i4;
        }
        else
        {
          i5 = k;
          i3 = m;
          k = i4;
        }
      }
      else
      {
        i3 = m;
      }
      if (i5 > i) {
        chainStyle = 2;
      }
      if ((i8 > 0) && (i3 == 0) && (n == i2)) {
        chainStyle = 2;
      }
      m = chainStyle;
      if (m == 1)
      {
        if (i8 > 1) {
          m = (i - i5) / (i8 - 1);
        } else if (i8 == 1) {
          m = (i - i5) / 2;
        } else {
          m = 0;
        }
        i8 = m;
        if (i3 > 0) {
          i8 = 0;
        }
        m = 0;
        for (i5 = k; m < j; i5 = k)
        {
          if (bool) {
            k = j - (m + 1);
          } else {
            k = m;
          }
          localObject = (WidgetRun)widgets.get(k);
          if (widget.getVisibility() == 8)
          {
            start.resolve(i5);
            end.resolve(i5);
            k = i5;
          }
          else
          {
            k = i5;
            if (m > 0) {
              if (bool) {
                k = i5 - i8;
              } else {
                k = i5 + i8;
              }
            }
            i5 = k;
            if (m > 0)
            {
              i5 = k;
              if (m >= n) {
                if (bool) {
                  i5 = k - start.margin;
                } else {
                  i5 = k + start.margin;
                }
              }
            }
            if (bool) {
              end.resolve(i5);
            } else {
              start.resolve(i5);
            }
            paramDependency = dimension;
            i3 = value;
            k = i3;
            if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
            {
              k = i3;
              if (matchConstraintsType == 1) {
                k = wrapValue;
              }
            }
            if (bool) {
              i5 -= k;
            } else {
              i5 += k;
            }
            if (bool) {
              start.resolve(i5);
            } else {
              end.resolve(i5);
            }
            resolved = true;
            k = i5;
            if (m < i1)
            {
              k = i5;
              if (m < i2) {
                if (bool) {
                  k = i5 - -end.margin;
                } else {
                  k = i5 + -end.margin;
                }
              }
            }
          }
          m++;
        }
      }
      if (m == 0)
      {
        i8 = (i - i5) / (i8 + 1);
        if (i3 > 0) {
          i8 = 0;
        }
        for (m = 0; m < j; m++)
        {
          if (bool) {
            i5 = j - (m + 1);
          } else {
            i5 = m;
          }
          paramDependency = (WidgetRun)widgets.get(i5);
          if (widget.getVisibility() == 8)
          {
            start.resolve(k);
            end.resolve(k);
          }
          else
          {
            if (bool) {
              i5 = k - i8;
            } else {
              i5 = k + i8;
            }
            k = i5;
            if (m > 0)
            {
              k = i5;
              if (m >= n) {
                if (bool) {
                  k = i5 - start.margin;
                } else {
                  k = i5 + start.margin;
                }
              }
            }
            if (bool) {
              end.resolve(k);
            } else {
              start.resolve(k);
            }
            localObject = dimension;
            i3 = value;
            i5 = i3;
            if (dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
            {
              i5 = i3;
              if (matchConstraintsType == 1) {
                i5 = Math.min(i3, wrapValue);
              }
            }
            if (bool) {
              i5 = k - i5;
            } else {
              i5 = k + i5;
            }
            if (bool) {
              start.resolve(i5);
            } else {
              end.resolve(i5);
            }
            k = i5;
            if (m < i1)
            {
              k = i5;
              if (m < i2) {
                if (bool) {
                  k = i5 - -end.margin;
                } else {
                  k = i5 + -end.margin;
                }
              }
            }
          }
        }
      }
      if (m == 2)
      {
        if (orientation == 0) {
          f1 = widget.getHorizontalBiasPercent();
        } else {
          f1 = widget.getVerticalBiasPercent();
        }
        f3 = f1;
        if (bool) {
          f3 = 1.0F - f1;
        }
        m = (int)((i - i5) * f3 + 0.5F);
        if ((m < 0) || (i3 > 0)) {
          m = 0;
        }
        if (bool) {
          k -= m;
        } else {
          k += m;
        }
        for (m = 0; m < j; m++)
        {
          if (bool) {
            i5 = j - (m + 1);
          } else {
            i5 = m;
          }
          localObject = (WidgetRun)widgets.get(i5);
          if (widget.getVisibility() == 8)
          {
            start.resolve(k);
            end.resolve(k);
          }
          else
          {
            i5 = k;
            if (m > 0)
            {
              i5 = k;
              if (m >= n) {
                if (bool) {
                  i5 = k - start.margin;
                } else {
                  i5 = k + start.margin;
                }
              }
            }
            if (bool) {
              end.resolve(i5);
            } else {
              start.resolve(i5);
            }
            paramDependency = dimension;
            k = value;
            if ((dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (matchConstraintsType == 1)) {
              k = wrapValue;
            }
            if (bool) {
              i5 -= k;
            } else {
              i5 += k;
            }
            if (bool) {
              start.resolve(i5);
            } else {
              end.resolve(i5);
            }
            k = i5;
            if (m < i1)
            {
              k = i5;
              if (m < i2) {
                if (bool) {
                  k = i5 - -end.margin;
                } else {
                  k = i5 + -end.margin;
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.ChainRun
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */