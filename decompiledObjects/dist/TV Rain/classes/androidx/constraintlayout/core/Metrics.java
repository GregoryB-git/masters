package androidx.constraintlayout.core;

import java.util.ArrayList;
import z2;

public class Metrics
{
  public long additionalMeasures;
  public long barrierConnectionResolved;
  public long bfs;
  public long centerConnectionResolved;
  public long chainConnectionResolved;
  public long constraints;
  public long determineGroups;
  public long errors;
  public long extravariables;
  public long fullySolved;
  public long graphOptimizer;
  public long graphSolved;
  public long grouping;
  public long infeasibleDetermineGroups;
  public long iterations;
  public long lastTableSize;
  public long layouts;
  public long linearSolved;
  public long matchConnectionResolved;
  public long maxRows;
  public long maxTableSize;
  public long maxVariables;
  public long measuredMatchWidgets;
  public long measuredWidgets;
  public long measures;
  public long measuresLayoutDuration;
  public long measuresWidgetsDuration;
  public long measuresWrap;
  public long measuresWrapInfeasible;
  public long minimize;
  public long minimizeGoal;
  public long nonresolvedWidgets;
  public long oldresolvedWidgets;
  public long optimize;
  public long pivots;
  public ArrayList<String> problematicLayouts = new ArrayList();
  public long resolutions;
  public long resolvedWidgets;
  public long simpleconstraints;
  public long slackvariables;
  public long tableSizeIncrease;
  public long variables;
  public long widgets;
  
  public void reset()
  {
    measures = 0L;
    widgets = 0L;
    additionalMeasures = 0L;
    resolutions = 0L;
    tableSizeIncrease = 0L;
    maxTableSize = 0L;
    lastTableSize = 0L;
    maxVariables = 0L;
    maxRows = 0L;
    minimize = 0L;
    minimizeGoal = 0L;
    constraints = 0L;
    simpleconstraints = 0L;
    optimize = 0L;
    iterations = 0L;
    pivots = 0L;
    bfs = 0L;
    variables = 0L;
    errors = 0L;
    slackvariables = 0L;
    extravariables = 0L;
    fullySolved = 0L;
    graphOptimizer = 0L;
    graphSolved = 0L;
    resolvedWidgets = 0L;
    oldresolvedWidgets = 0L;
    nonresolvedWidgets = 0L;
    centerConnectionResolved = 0L;
    matchConnectionResolved = 0L;
    chainConnectionResolved = 0L;
    barrierConnectionResolved = 0L;
    problematicLayouts.clear();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("\n*** Metrics ***\nmeasures: ");
    localStringBuilder.append(measures);
    localStringBuilder.append("\nmeasuresWrap: ");
    localStringBuilder.append(measuresWrap);
    localStringBuilder.append("\nmeasuresWrapInfeasible: ");
    localStringBuilder.append(measuresWrapInfeasible);
    localStringBuilder.append("\ndetermineGroups: ");
    localStringBuilder.append(determineGroups);
    localStringBuilder.append("\ninfeasibleDetermineGroups: ");
    localStringBuilder.append(infeasibleDetermineGroups);
    localStringBuilder.append("\ngraphOptimizer: ");
    localStringBuilder.append(graphOptimizer);
    localStringBuilder.append("\nwidgets: ");
    localStringBuilder.append(widgets);
    localStringBuilder.append("\ngraphSolved: ");
    localStringBuilder.append(graphSolved);
    localStringBuilder.append("\nlinearSolved: ");
    return z2.r(localStringBuilder, linearSolved, "\n");
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.Metrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */