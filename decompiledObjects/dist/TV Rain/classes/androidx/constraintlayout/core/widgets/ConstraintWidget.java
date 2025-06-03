package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import z2;

public class ConstraintWidget
{
  public static final int ANCHOR_BASELINE = 4;
  public static final int ANCHOR_BOTTOM = 3;
  public static final int ANCHOR_LEFT = 0;
  public static final int ANCHOR_RIGHT = 1;
  public static final int ANCHOR_TOP = 2;
  private static final boolean AUTOTAG_CENTER = false;
  public static final int BOTH = 2;
  public static final int CHAIN_PACKED = 2;
  public static final int CHAIN_SPREAD = 0;
  public static final int CHAIN_SPREAD_INSIDE = 1;
  public static float DEFAULT_BIAS = 0.5F;
  public static final int DIMENSION_HORIZONTAL = 0;
  public static final int DIMENSION_VERTICAL = 1;
  public static final int DIRECT = 2;
  public static final int GONE = 8;
  public static final int HORIZONTAL = 0;
  public static final int INVISIBLE = 4;
  public static final int MATCH_CONSTRAINT_PERCENT = 2;
  public static final int MATCH_CONSTRAINT_RATIO = 3;
  public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
  public static final int MATCH_CONSTRAINT_SPREAD = 0;
  public static final int MATCH_CONSTRAINT_WRAP = 1;
  public static final int SOLVER = 1;
  public static final int UNKNOWN = -1;
  private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
  public static final int VERTICAL = 1;
  public static final int VISIBLE = 0;
  private static final int WRAP = -2;
  public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
  public static final int WRAP_BEHAVIOR_INCLUDED = 0;
  public static final int WRAP_BEHAVIOR_SKIPPED = 3;
  public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
  private boolean OPTIMIZE_WRAP = false;
  private boolean OPTIMIZE_WRAP_ON_RESOLVED = true;
  public WidgetFrame frame = new WidgetFrame(this);
  private boolean hasBaseline = false;
  public ChainRun horizontalChainRun;
  public int horizontalGroup;
  public HorizontalWidgetRun horizontalRun = null;
  private boolean horizontalSolvingPass = false;
  private boolean inPlaceholder;
  public boolean[] isTerminalWidget = { 1, 1 };
  public ArrayList<ConstraintAnchor> mAnchors;
  private boolean mAnimated;
  public ConstraintAnchor mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
  public int mBaselineDistance;
  public ConstraintAnchor mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
  public boolean mBottomHasCentered;
  public ConstraintAnchor mCenter;
  public ConstraintAnchor mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
  public ConstraintAnchor mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
  private float mCircleConstraintAngle = 0.0F;
  private Object mCompanionWidget;
  private int mContainerItemSkip;
  private String mDebugName;
  public float mDimensionRatio;
  public int mDimensionRatioSide;
  public int mDistToBottom;
  public int mDistToLeft;
  public int mDistToRight;
  public int mDistToTop;
  public boolean mGroupsToSolver;
  public int mHeight;
  private int mHeightOverride = -1;
  public float mHorizontalBiasPercent;
  public boolean mHorizontalChainFixedPosition;
  public int mHorizontalChainStyle;
  public ConstraintWidget mHorizontalNextWidget;
  public int mHorizontalResolution = -1;
  public boolean mHorizontalWrapVisited;
  private boolean mInVirtualLayout = false;
  public boolean mIsHeightWrapContent;
  private boolean[] mIsInBarrier;
  public boolean mIsWidthWrapContent;
  private int mLastHorizontalMeasureSpec = 0;
  private int mLastVerticalMeasureSpec = 0;
  public ConstraintAnchor mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
  public boolean mLeftHasCentered;
  public ConstraintAnchor[] mListAnchors;
  public DimensionBehaviour[] mListDimensionBehaviors;
  public ConstraintWidget[] mListNextMatchConstraintsWidget;
  public int mMatchConstraintDefaultHeight = 0;
  public int mMatchConstraintDefaultWidth = 0;
  public int mMatchConstraintMaxHeight = 0;
  public int mMatchConstraintMaxWidth = 0;
  public int mMatchConstraintMinHeight = 0;
  public int mMatchConstraintMinWidth = 0;
  public float mMatchConstraintPercentHeight = 1.0F;
  public float mMatchConstraintPercentWidth = 1.0F;
  private int[] mMaxDimension = { Integer.MAX_VALUE, Integer.MAX_VALUE };
  private boolean mMeasureRequested = true;
  public int mMinHeight;
  public int mMinWidth;
  public ConstraintWidget[] mNextChainWidget;
  public int mOffsetX;
  public int mOffsetY;
  public ConstraintWidget mParent;
  public int mRelX;
  public int mRelY;
  public float mResolvedDimensionRatio = 1.0F;
  public int mResolvedDimensionRatioSide = -1;
  public boolean mResolvedHasRatio = false;
  public int[] mResolvedMatchConstraintDefault = new int[2];
  public ConstraintAnchor mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
  public boolean mRightHasCentered;
  public ConstraintAnchor mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
  public boolean mTopHasCentered;
  private String mType;
  public float mVerticalBiasPercent;
  public boolean mVerticalChainFixedPosition;
  public int mVerticalChainStyle;
  public ConstraintWidget mVerticalNextWidget;
  public int mVerticalResolution = -1;
  public boolean mVerticalWrapVisited;
  private int mVisibility;
  public float[] mWeight;
  public int mWidth;
  private int mWidthOverride = -1;
  private int mWrapBehaviorInParent = 0;
  public int mX;
  public int mY;
  public boolean measured = false;
  private boolean resolvedHorizontal = false;
  private boolean resolvedVertical = false;
  public WidgetRun[] run = new WidgetRun[2];
  public String stringId;
  public ChainRun verticalChainRun;
  public int verticalGroup;
  public VerticalWidgetRun verticalRun = null;
  private boolean verticalSolvingPass = false;
  
  public ConstraintWidget()
  {
    Object localObject = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
    mCenter = ((ConstraintAnchor)localObject);
    mListAnchors = new ConstraintAnchor[] { mLeft, mRight, mTop, mBottom, mBaseline, localObject };
    mAnchors = new ArrayList();
    mIsInBarrier = new boolean[2];
    localObject = DimensionBehaviour.FIXED;
    mListDimensionBehaviors = new DimensionBehaviour[] { localObject, localObject };
    mParent = null;
    mWidth = 0;
    mHeight = 0;
    mDimensionRatio = 0.0F;
    mDimensionRatioSide = -1;
    mX = 0;
    mY = 0;
    mRelX = 0;
    mRelY = 0;
    mOffsetX = 0;
    mOffsetY = 0;
    mBaselineDistance = 0;
    float f = DEFAULT_BIAS;
    mHorizontalBiasPercent = f;
    mVerticalBiasPercent = f;
    mContainerItemSkip = 0;
    mVisibility = 0;
    mAnimated = false;
    mDebugName = null;
    mType = null;
    mGroupsToSolver = false;
    mHorizontalChainStyle = 0;
    mVerticalChainStyle = 0;
    mWeight = new float[] { -1.0F, -1.0F };
    mListNextMatchConstraintsWidget = new ConstraintWidget[] { null, null };
    mNextChainWidget = new ConstraintWidget[] { null, null };
    mHorizontalNextWidget = null;
    mVerticalNextWidget = null;
    horizontalGroup = -1;
    verticalGroup = -1;
    addAnchors();
  }
  
  public ConstraintWidget(int paramInt1, int paramInt2)
  {
    this(0, 0, paramInt1, paramInt2);
  }
  
  public ConstraintWidget(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
    mCenter = ((ConstraintAnchor)localObject);
    mListAnchors = new ConstraintAnchor[] { mLeft, mRight, mTop, mBottom, mBaseline, localObject };
    mAnchors = new ArrayList();
    mIsInBarrier = new boolean[2];
    localObject = DimensionBehaviour.FIXED;
    mListDimensionBehaviors = new DimensionBehaviour[] { localObject, localObject };
    mParent = null;
    mDimensionRatio = 0.0F;
    mDimensionRatioSide = -1;
    mRelX = 0;
    mRelY = 0;
    mOffsetX = 0;
    mOffsetY = 0;
    mBaselineDistance = 0;
    float f = DEFAULT_BIAS;
    mHorizontalBiasPercent = f;
    mVerticalBiasPercent = f;
    mContainerItemSkip = 0;
    mVisibility = 0;
    mAnimated = false;
    mDebugName = null;
    mType = null;
    mGroupsToSolver = false;
    mHorizontalChainStyle = 0;
    mVerticalChainStyle = 0;
    mWeight = new float[] { -1.0F, -1.0F };
    mListNextMatchConstraintsWidget = new ConstraintWidget[] { null, null };
    mNextChainWidget = new ConstraintWidget[] { null, null };
    mHorizontalNextWidget = null;
    mVerticalNextWidget = null;
    horizontalGroup = -1;
    verticalGroup = -1;
    mX = paramInt1;
    mY = paramInt2;
    mWidth = paramInt3;
    mHeight = paramInt4;
    addAnchors();
  }
  
  public ConstraintWidget(String paramString)
  {
    Object localObject = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
    mCenter = ((ConstraintAnchor)localObject);
    mListAnchors = new ConstraintAnchor[] { mLeft, mRight, mTop, mBottom, mBaseline, localObject };
    mAnchors = new ArrayList();
    mIsInBarrier = new boolean[2];
    localObject = DimensionBehaviour.FIXED;
    mListDimensionBehaviors = new DimensionBehaviour[] { localObject, localObject };
    mParent = null;
    mWidth = 0;
    mHeight = 0;
    mDimensionRatio = 0.0F;
    mDimensionRatioSide = -1;
    mX = 0;
    mY = 0;
    mRelX = 0;
    mRelY = 0;
    mOffsetX = 0;
    mOffsetY = 0;
    mBaselineDistance = 0;
    float f = DEFAULT_BIAS;
    mHorizontalBiasPercent = f;
    mVerticalBiasPercent = f;
    mContainerItemSkip = 0;
    mVisibility = 0;
    mAnimated = false;
    mDebugName = null;
    mType = null;
    mGroupsToSolver = false;
    mHorizontalChainStyle = 0;
    mVerticalChainStyle = 0;
    mWeight = new float[] { -1.0F, -1.0F };
    mListNextMatchConstraintsWidget = new ConstraintWidget[] { null, null };
    mNextChainWidget = new ConstraintWidget[] { null, null };
    mHorizontalNextWidget = null;
    mVerticalNextWidget = null;
    horizontalGroup = -1;
    verticalGroup = -1;
    addAnchors();
    setDebugName(paramString);
  }
  
  public ConstraintWidget(String paramString, int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2);
    setDebugName(paramString);
  }
  
  public ConstraintWidget(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramInt1, paramInt2, paramInt3, paramInt4);
    setDebugName(paramString);
  }
  
  private void addAnchors()
  {
    mAnchors.add(mLeft);
    mAnchors.add(mTop);
    mAnchors.add(mRight);
    mAnchors.add(mBottom);
    mAnchors.add(mCenterX);
    mAnchors.add(mCenterY);
    mAnchors.add(mCenter);
    mAnchors.add(mBaseline);
  }
  
  private void applyConstraints(LinearSystem paramLinearSystem, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, DimensionBehaviour paramDimensionBehaviour, boolean paramBoolean5, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean11)
  {
    SolverVariable localSolverVariable1 = paramLinearSystem.createObjectVariable(paramConstraintAnchor1);
    Object localObject1 = paramLinearSystem.createObjectVariable(paramConstraintAnchor2);
    SolverVariable localSolverVariable2 = paramLinearSystem.createObjectVariable(paramConstraintAnchor1.getTarget());
    Object localObject2 = paramLinearSystem.createObjectVariable(paramConstraintAnchor2.getTarget());
    if (LinearSystem.getMetrics() != null)
    {
      localObject3 = LinearSystem.getMetrics();
      nonresolvedWidgets += 1L;
    }
    int i = paramConstraintAnchor1.isConnected();
    boolean bool1 = paramConstraintAnchor2.isConnected();
    boolean bool2 = mCenter.isConnected();
    if (bool1) {
      j = i + 1;
    } else {
      j = i;
    }
    int k = j;
    if (bool2) {
      k = j + 1;
    }
    if (paramBoolean6) {
      paramInt5 = 3;
    }
    int j = 1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[paramDimensionBehaviour.ordinal()];
    if ((j == 1) || (j == 2) || (j == 3) || (j != 4)) {}
    while (paramInt5 == 4)
    {
      j = 0;
      break;
    }
    j = 1;
    int m = paramInt5;
    paramInt5 = mWidthOverride;
    if ((paramInt5 != -1) && (paramBoolean1))
    {
      mWidthOverride = -1;
      j = 0;
    }
    else
    {
      paramInt5 = paramInt2;
    }
    int n = mHeightOverride;
    int i1 = paramInt5;
    paramInt2 = j;
    if (n != -1)
    {
      i1 = paramInt5;
      paramInt2 = j;
      if (!paramBoolean1)
      {
        mHeightOverride = -1;
        i1 = n;
        paramInt2 = 0;
      }
    }
    paramInt5 = i1;
    if (mVisibility == 8)
    {
      paramInt5 = 0;
      paramInt2 = 0;
    }
    if (paramBoolean11) {
      if ((i == 0) && (!bool1) && (!bool2)) {
        paramLinearSystem.addEquality(localSolverVariable1, paramInt1);
      } else if ((i != 0) && (!bool1)) {
        paramLinearSystem.addEquality(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), 8);
      }
    }
    Object localObject4;
    if (paramInt2 == 0)
    {
      if (paramBoolean5)
      {
        paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, 0, 3);
        if (paramInt3 > 0) {
          paramLinearSystem.addGreaterThan((SolverVariable)localObject1, localSolverVariable1, paramInt3, 8);
        }
        if (paramInt4 < Integer.MAX_VALUE) {
          paramLinearSystem.addLowerThan((SolverVariable)localObject1, localSolverVariable1, paramInt4, 8);
        }
      }
      else
      {
        paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, paramInt5, 8);
      }
      paramInt4 = paramInt2;
      paramInt2 = paramInt7;
      paramInt7 = paramInt8;
    }
    else if ((k != 2) && (!paramBoolean6) && ((m == 1) || (m == 0)))
    {
      paramInt2 = Math.max(paramInt7, paramInt5);
      paramInt1 = paramInt2;
      if (paramInt8 > 0) {
        paramInt1 = Math.min(paramInt8, paramInt2);
      }
      paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, paramInt1, 8);
      paramInt4 = 0;
      paramInt2 = paramInt7;
      paramInt7 = paramInt8;
    }
    else
    {
      if (paramInt7 == -2) {
        paramInt1 = paramInt5;
      } else {
        paramInt1 = paramInt7;
      }
      if (paramInt8 == -2) {
        paramInt7 = paramInt5;
      } else {
        paramInt7 = paramInt8;
      }
      paramInt8 = paramInt5;
      if (paramInt5 > 0)
      {
        paramInt8 = paramInt5;
        if (m != 1) {
          paramInt8 = 0;
        }
      }
      paramInt4 = paramInt8;
      if (paramInt1 > 0)
      {
        paramLinearSystem.addGreaterThan((SolverVariable)localObject1, localSolverVariable1, paramInt1, 8);
        paramInt4 = Math.max(paramInt8, paramInt1);
      }
      if (paramInt7 > 0)
      {
        if ((paramBoolean2) && (m == 1)) {
          paramInt5 = 0;
        } else {
          paramInt5 = 1;
        }
        if (paramInt5 != 0) {
          paramLinearSystem.addLowerThan((SolverVariable)localObject1, localSolverVariable1, paramInt7, 8);
        }
        paramInt4 = Math.min(paramInt4, paramInt7);
      }
      if (m == 1)
      {
        if (paramBoolean2)
        {
          paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, paramInt4, 8);
        }
        else if (paramBoolean8)
        {
          paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, paramInt4, 5);
          paramLinearSystem.addLowerThan((SolverVariable)localObject1, localSolverVariable1, paramInt4, 8);
        }
        else
        {
          paramLinearSystem.addEquality((SolverVariable)localObject1, localSolverVariable1, paramInt4, 5);
          paramLinearSystem.addLowerThan((SolverVariable)localObject1, localSolverVariable1, paramInt4, 8);
        }
        paramInt4 = paramInt2;
        paramInt2 = paramInt1;
      }
      else if (m == 2)
      {
        paramDimensionBehaviour = paramConstraintAnchor1.getType();
        localObject3 = ConstraintAnchor.Type.TOP;
        if ((paramDimensionBehaviour != localObject3) && (paramConstraintAnchor1.getType() != ConstraintAnchor.Type.BOTTOM))
        {
          localObject3 = paramLinearSystem.createObjectVariable(mParent.getAnchor(ConstraintAnchor.Type.LEFT));
          paramDimensionBehaviour = paramLinearSystem.createObjectVariable(mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
        }
        else
        {
          localObject3 = paramLinearSystem.createObjectVariable(mParent.getAnchor((ConstraintAnchor.Type)localObject3));
          paramDimensionBehaviour = paramLinearSystem.createObjectVariable(mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
        }
        localObject4 = paramLinearSystem.createRow();
        paramLinearSystem.addConstraint(((ArrayRow)localObject4).createRowDimensionRatio((SolverVariable)localObject1, localSolverVariable1, paramDimensionBehaviour, (SolverVariable)localObject3, paramFloat2));
        if (paramBoolean2) {
          paramInt2 = 0;
        }
        paramInt4 = paramInt2;
        paramInt2 = paramInt1;
      }
      else
      {
        paramBoolean4 = true;
        paramInt4 = paramInt2;
        paramInt2 = paramInt1;
      }
    }
    paramDimensionBehaviour = (DimensionBehaviour)localObject1;
    Object localObject3 = localObject2;
    if ((paramBoolean11) && (!paramBoolean8))
    {
      if ((i != 0) || (bool1) || (bool2))
      {
        if ((i != 0) && (!bool1))
        {
          paramSolverVariable1 = mTarget.mOwner;
          if ((paramBoolean2) && ((paramSolverVariable1 instanceof Barrier))) {
            paramInt1 = 8;
          } else {
            paramInt1 = 5;
          }
          paramSolverVariable1 = paramDimensionBehaviour;
          break label2291;
        }
        if ((i == 0) && (bool1))
        {
          paramLinearSystem.addEquality(paramDimensionBehaviour, (SolverVariable)localObject3, -paramConstraintAnchor2.getMargin(), 8);
          if (paramBoolean2)
          {
            if ((OPTIMIZE_WRAP) && (isFinalValue))
            {
              localObject2 = mParent;
              if (localObject2 != null)
              {
                paramSolverVariable1 = (ConstraintWidgetContainer)localObject2;
                if (paramBoolean1)
                {
                  paramSolverVariable1.addHorizontalWrapMinVariable(paramConstraintAnchor1);
                  break label2284;
                }
                paramSolverVariable1.addVerticalWrapMinVariable(paramConstraintAnchor1);
                break label2284;
              }
            }
            paramLinearSystem.addGreaterThan(localSolverVariable1, paramSolverVariable1, 0, 5);
          }
        }
        else if ((i != 0) && (bool1))
        {
          localObject4 = mTarget.mOwner;
          localObject1 = mTarget.mOwner;
          localObject2 = getParent();
          if (paramInt4 != 0)
          {
            if (m == 0)
            {
              if ((paramInt7 == 0) && (paramInt2 == 0))
              {
                if ((isFinalValue) && (isFinalValue))
                {
                  paramLinearSystem.addEquality(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), 8);
                  paramLinearSystem.addEquality(paramDimensionBehaviour, (SolverVariable)localObject3, -paramConstraintAnchor2.getMargin(), 8);
                  return;
                }
                paramInt5 = 0;
                paramInt7 = paramInt5;
                paramInt1 = 8;
                paramInt8 = 8;
                paramInt6 = 1;
              }
              else
              {
                paramInt6 = 0;
                paramInt1 = 5;
                paramInt8 = 5;
                paramInt5 = 1;
                paramInt7 = 1;
              }
              if ((!(localObject4 instanceof Barrier)) && (!(localObject1 instanceof Barrier)))
              {
                k = paramInt6;
                paramInt6 = paramInt8;
                paramInt8 = k;
                k = paramInt5;
                paramInt5 = paramInt6;
                paramInt6 = 6;
                break label1678;
              }
              j = 6;
              paramInt8 = paramInt6;
              k = paramInt5;
              paramInt5 = 4;
              paramInt6 = j;
              break label1678;
            }
            if (m == 2) {
              if ((!(localObject4 instanceof Barrier)) && (!(localObject1 instanceof Barrier)))
              {
                paramInt1 = 5;
                paramInt5 = 5;
                break label1665;
              }
            }
          }
          for (;;)
          {
            break label1659;
            if (m == 1)
            {
              paramInt1 = 8;
              break label1662;
            }
            if (m == 3)
            {
              if (mResolvedDimensionRatioSide == -1)
              {
                if (paramBoolean9)
                {
                  if (paramBoolean2) {
                    paramInt1 = 5;
                  } else {
                    paramInt1 = 4;
                  }
                }
                else {
                  paramInt1 = 8;
                }
                paramInt7 = 8;
                paramInt6 = paramInt1;
                label1389:
                paramInt5 = 5;
                paramInt1 = paramInt7;
              }
              for (;;)
              {
                k = 1;
                paramInt7 = 1;
                paramInt8 = 1;
                break label1678;
                if (paramBoolean6)
                {
                  if ((paramInt6 != 2) && (paramInt6 != 1)) {
                    paramInt1 = 0;
                  } else {
                    paramInt1 = 1;
                  }
                  if (paramInt1 == 0)
                  {
                    paramInt1 = 8;
                    paramInt5 = 5;
                  }
                  else
                  {
                    paramInt1 = 5;
                    paramInt5 = 4;
                  }
                  k = 1;
                  paramInt7 = 1;
                  paramInt8 = 1;
                  break;
                }
                if (paramInt7 > 0)
                {
                  paramInt6 = 6;
                  paramInt7 = 5;
                  break label1389;
                }
                if ((paramInt7 == 0) && (paramInt2 == 0))
                {
                  if (!paramBoolean9)
                  {
                    paramInt6 = 6;
                    paramInt1 = 5;
                    paramInt5 = 8;
                    continue;
                  }
                  if ((localObject4 != localObject2) && (localObject1 != localObject2)) {
                    paramInt1 = 4;
                  } else {
                    paramInt1 = 5;
                  }
                }
                else
                {
                  paramInt1 = 5;
                }
                paramInt6 = 6;
                paramInt5 = 4;
              }
            }
            paramInt1 = 5;
            paramInt5 = 4;
            k = 0;
            paramInt7 = 0;
            break label1671;
            if ((isFinalValue) && (isFinalValue))
            {
              paramLinearSystem.addCentering(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), paramFloat1, (SolverVariable)localObject3, paramDimensionBehaviour, paramConstraintAnchor2.getMargin(), 8);
              if ((paramBoolean2) && (paramBoolean4))
              {
                if (mTarget != null) {
                  paramInt1 = paramConstraintAnchor2.getMargin();
                } else {
                  paramInt1 = 0;
                }
                if (localObject3 != paramSolverVariable2) {
                  paramLinearSystem.addGreaterThan(paramSolverVariable2, paramDimensionBehaviour, paramInt1, 5);
                }
              }
              return;
            }
          }
          label1659:
          paramInt1 = 5;
          label1662:
          paramInt5 = 4;
          label1665:
          k = 1;
          paramInt7 = 1;
          label1671:
          paramInt6 = 6;
          paramInt8 = 0;
          label1678:
          if ((paramInt7 != 0) && (localSolverVariable2 == localObject3) && (localObject4 != localObject2))
          {
            paramInt7 = 0;
            j = 0;
          }
          else
          {
            j = 1;
          }
          if (k != 0)
          {
            if ((paramInt4 == 0) && (!paramBoolean7) && (!paramBoolean9) && (localSolverVariable2 == paramSolverVariable1) && (localObject3 == paramSolverVariable2))
            {
              paramBoolean2 = false;
              paramInt6 = 8;
              k = 8;
              paramInt1 = 0;
            }
            else
            {
              k = j;
              j = paramInt1;
              paramInt1 = k;
              k = paramInt6;
              paramInt6 = j;
            }
            paramLinearSystem.addCentering(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), paramFloat1, (SolverVariable)localObject3, paramDimensionBehaviour, paramConstraintAnchor2.getMargin(), k);
            j = paramInt1;
            paramInt1 = paramInt6;
          }
          if ((mVisibility == 8) && (!paramConstraintAnchor2.hasDependents())) {
            return;
          }
          if (paramInt7 != 0)
          {
            paramInt6 = paramInt1;
            if (paramBoolean2)
            {
              paramInt6 = paramInt1;
              if (localSolverVariable2 != localObject3)
              {
                paramInt6 = paramInt1;
                if (paramInt4 == 0) {
                  if (!(localObject4 instanceof Barrier))
                  {
                    paramInt6 = paramInt1;
                    if (!(localObject1 instanceof Barrier)) {}
                  }
                  else
                  {
                    paramInt6 = 6;
                  }
                }
              }
            }
            paramLinearSystem.addGreaterThan(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), paramInt6);
            paramLinearSystem.addLowerThan(paramDimensionBehaviour, (SolverVariable)localObject3, -paramConstraintAnchor2.getMargin(), paramInt6);
          }
          else
          {
            paramInt6 = paramInt1;
          }
          if ((paramBoolean2) && (paramBoolean10) && (!(localObject4 instanceof Barrier)) && (!(localObject1 instanceof Barrier)) && (localObject1 != localObject2))
          {
            paramInt6 = 6;
            paramInt1 = paramInt6;
            j = 1;
          }
          else
          {
            paramInt1 = paramInt5;
          }
          if (j != 0)
          {
            paramInt5 = paramInt1;
            if (paramInt8 != 0) {
              if (paramBoolean9)
              {
                paramInt5 = paramInt1;
                if (!paramBoolean3) {}
              }
              else
              {
                if ((localObject4 != localObject2) && (localObject1 != localObject2)) {
                  paramInt5 = paramInt1;
                } else {
                  paramInt5 = 6;
                }
                if (((localObject4 instanceof Guideline)) || ((localObject1 instanceof Guideline))) {
                  paramInt5 = 5;
                }
                if (((localObject4 instanceof Barrier)) || ((localObject1 instanceof Barrier))) {
                  paramInt5 = 5;
                }
                if (paramBoolean9) {
                  paramInt5 = 5;
                }
                paramInt5 = Math.max(paramInt5, paramInt1);
              }
            }
            paramInt1 = paramInt5;
            if (paramBoolean2)
            {
              paramInt1 = Math.min(paramInt6, paramInt5);
              if ((paramBoolean6) && (!paramBoolean9) && ((localObject4 == localObject2) || (localObject1 == localObject2))) {
                paramInt1 = 4;
              }
            }
            paramLinearSystem.addEquality(localSolverVariable1, localSolverVariable2, paramConstraintAnchor1.getMargin(), paramInt1);
            paramLinearSystem.addEquality(paramDimensionBehaviour, (SolverVariable)localObject3, -paramConstraintAnchor2.getMargin(), paramInt1);
          }
          if (paramBoolean2)
          {
            if (paramSolverVariable1 == localSolverVariable2) {
              paramInt1 = paramConstraintAnchor1.getMargin();
            } else {
              paramInt1 = 0;
            }
            if (localSolverVariable2 != paramSolverVariable1) {
              paramLinearSystem.addGreaterThan(localSolverVariable1, paramSolverVariable1, paramInt1, 5);
            }
          }
          if ((paramBoolean2) && (paramInt4 != 0) && (paramInt3 == 0) && (paramInt2 == 0))
          {
            if ((paramInt4 != 0) && (m == 3))
            {
              paramLinearSystem.addGreaterThan(paramDimensionBehaviour, localSolverVariable1, 0, 8);
              paramSolverVariable1 = paramDimensionBehaviour;
              break label2288;
            }
            paramLinearSystem.addGreaterThan(paramDimensionBehaviour, localSolverVariable1, 0, 5);
            paramSolverVariable1 = paramDimensionBehaviour;
            break label2288;
          }
          paramSolverVariable1 = paramDimensionBehaviour;
          break label2288;
        }
      }
      label2284:
      paramSolverVariable1 = paramDimensionBehaviour;
      label2288:
      paramInt1 = 5;
      label2291:
      if ((paramBoolean2) && (paramBoolean4))
      {
        if (mTarget != null) {
          paramInt2 = paramConstraintAnchor2.getMargin();
        } else {
          paramInt2 = 0;
        }
        if (localObject3 != paramSolverVariable2)
        {
          if ((OPTIMIZE_WRAP) && (isFinalValue))
          {
            paramDimensionBehaviour = mParent;
            if (paramDimensionBehaviour != null)
            {
              paramLinearSystem = (ConstraintWidgetContainer)paramDimensionBehaviour;
              if (paramBoolean1) {
                paramLinearSystem.addHorizontalWrapMaxVariable(paramConstraintAnchor2);
              } else {
                paramLinearSystem.addVerticalWrapMaxVariable(paramConstraintAnchor2);
              }
              return;
            }
          }
          paramLinearSystem.addGreaterThan(paramSolverVariable2, paramSolverVariable1, paramInt2, paramInt1);
        }
      }
      return;
    }
    if ((k < 2) && (paramBoolean2) && (paramBoolean4))
    {
      paramLinearSystem.addGreaterThan(localSolverVariable1, paramSolverVariable1, 0, 8);
      if ((!paramBoolean1) && (mBaseline.mTarget != null)) {
        paramInt1 = 0;
      } else {
        paramInt1 = 1;
      }
      if (!paramBoolean1)
      {
        paramSolverVariable1 = mBaseline.mTarget;
        if (paramSolverVariable1 != null)
        {
          paramSolverVariable1 = mOwner;
          if (mDimensionRatio != 0.0F)
          {
            paramSolverVariable1 = mListDimensionBehaviors;
            paramConstraintAnchor2 = paramSolverVariable1[0];
            paramConstraintAnchor1 = DimensionBehaviour.MATCH_CONSTRAINT;
            if ((paramConstraintAnchor2 == paramConstraintAnchor1) && (paramSolverVariable1[1] == paramConstraintAnchor1))
            {
              paramInt1 = 1;
              break label2526;
            }
          }
          paramInt1 = 0;
        }
      }
      label2526:
      if (paramInt1 != 0) {
        paramLinearSystem.addGreaterThan(paramSolverVariable2, paramDimensionBehaviour, 0, 8);
      }
    }
  }
  
  private void getSceneString(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2)
  {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    serializeAttribute(paramStringBuilder, "      size", paramInt1, 0);
    serializeAttribute(paramStringBuilder, "      min", paramInt2, 0);
    serializeAttribute(paramStringBuilder, "      max", paramInt3, Integer.MAX_VALUE);
    serializeAttribute(paramStringBuilder, "      matchMin", paramInt5, 0);
    serializeAttribute(paramStringBuilder, "      matchDef", paramInt6, 0);
    serializeAttribute(paramStringBuilder, "      matchPercent", paramFloat1, 1.0F);
    paramStringBuilder.append("    },\n");
  }
  
  private void getSceneString(StringBuilder paramStringBuilder, String paramString, ConstraintAnchor paramConstraintAnchor)
  {
    if (mTarget == null) {
      return;
    }
    paramStringBuilder.append("    ");
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramStringBuilder.append(mTarget);
    paramStringBuilder.append("'");
    if ((mGoneMargin != Integer.MIN_VALUE) || (mMargin != 0))
    {
      paramStringBuilder.append(",");
      paramStringBuilder.append(mMargin);
      if (mGoneMargin != Integer.MIN_VALUE)
      {
        paramStringBuilder.append(",");
        paramStringBuilder.append(mGoneMargin);
        paramStringBuilder.append(",");
      }
    }
    paramStringBuilder.append(" ] ,\n");
  }
  
  private boolean isChainHead(int paramInt)
  {
    paramInt *= 2;
    Object localObject1 = mListAnchors;
    Object localObject2 = localObject1[paramInt];
    ConstraintAnchor localConstraintAnchor = mTarget;
    boolean bool = true;
    if ((localConstraintAnchor != null) && (mTarget != localObject2))
    {
      localConstraintAnchor = localObject1[(paramInt + 1)];
      localObject1 = mTarget;
      if ((localObject1 != null) && (mTarget == localConstraintAnchor)) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  private void serializeAnchor(StringBuilder paramStringBuilder, String paramString, ConstraintAnchor paramConstraintAnchor)
  {
    if (mTarget == null) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramStringBuilder.append(mTarget);
    paramStringBuilder.append("',");
    paramStringBuilder.append(mMargin);
    paramStringBuilder.append(",");
    paramStringBuilder.append(mGoneMargin);
    paramStringBuilder.append(",");
    paramStringBuilder.append(" ] ,\n");
  }
  
  private void serializeAttribute(StringBuilder paramStringBuilder, String paramString, float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 == paramFloat2) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramFloat1);
    paramStringBuilder.append(",\n");
  }
  
  private void serializeAttribute(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramInt1);
    paramStringBuilder.append(",\n");
  }
  
  private void serializeCircle(StringBuilder paramStringBuilder, ConstraintAnchor paramConstraintAnchor, float paramFloat)
  {
    if (mTarget == null) {
      return;
    }
    paramStringBuilder.append("circle : [ '");
    paramStringBuilder.append(mTarget);
    paramStringBuilder.append("',");
    paramStringBuilder.append(mMargin);
    paramStringBuilder.append(",");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",");
    paramStringBuilder.append(" ] ,\n");
  }
  
  private void serializeDimensionRatio(StringBuilder paramStringBuilder, String paramString, float paramFloat, int paramInt)
  {
    if (paramFloat == 0.0F) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  [");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",");
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append("");
    paramStringBuilder.append("],\n");
  }
  
  private void serializeSize(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2)
  {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    serializeAttribute(paramStringBuilder, "size", paramInt1, Integer.MIN_VALUE);
    serializeAttribute(paramStringBuilder, "min", paramInt2, 0);
    serializeAttribute(paramStringBuilder, "max", paramInt3, Integer.MAX_VALUE);
    serializeAttribute(paramStringBuilder, "matchMin", paramInt5, 0);
    serializeAttribute(paramStringBuilder, "matchDef", paramInt6, 0);
    serializeAttribute(paramStringBuilder, "matchPercent", paramInt6, 1);
    paramStringBuilder.append("},\n");
  }
  
  public void addChildrenToSolverByDependency(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, HashSet<ConstraintWidget> paramHashSet, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!paramHashSet.contains(this)) {
        return;
      }
      Optimizer.checkMatchParent(paramConstraintWidgetContainer, paramLinearSystem, this);
      paramHashSet.remove(this);
      addToSolver(paramLinearSystem, paramConstraintWidgetContainer.optimizeFor(64));
    }
    Object localObject;
    if (paramInt == 0)
    {
      localObject = mLeft.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nextmOwner.addChildrenToSolverByDependency(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, true);
        }
      }
      localObject = mRight.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nextmOwner.addChildrenToSolverByDependency(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, true);
        }
      }
    }
    else
    {
      localObject = mTop.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nextmOwner.addChildrenToSolverByDependency(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, true);
        }
      }
      localObject = mBottom.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nextmOwner.addChildrenToSolverByDependency(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, true);
        }
      }
      localObject = mBaseline.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          nextmOwner.addChildrenToSolverByDependency(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, true);
        }
      }
    }
  }
  
  public boolean addFirst()
  {
    boolean bool;
    if ((!(this instanceof VirtualLayout)) && (!(this instanceof Guideline))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void addToSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    SolverVariable localSolverVariable = paramLinearSystem.createObjectVariable(mLeft);
    Object localObject1 = paramLinearSystem.createObjectVariable(mRight);
    Object localObject2 = paramLinearSystem.createObjectVariable(mTop);
    Object localObject3 = paramLinearSystem.createObjectVariable(mBottom);
    Object localObject4 = paramLinearSystem.createObjectVariable(mBaseline);
    Object localObject5 = mParent;
    if (localObject5 != null)
    {
      if ((localObject5 != null) && (mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      if ((localObject5 != null) && (mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      i = mWrapBehaviorInParent;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            bool3 = bool2;
            bool2 = bool1;
            bool1 = bool3;
            break label184;
          }
        }
        else
        {
          bool1 = bool2;
          bool2 = false;
          break label184;
        }
      }
      else
      {
        bool3 = false;
        bool2 = bool1;
        bool1 = bool3;
        break label184;
      }
    }
    boolean bool2 = false;
    boolean bool1 = bool2;
    label184:
    if ((mVisibility == 8) && (!mAnimated) && (!hasDependencies()))
    {
      localObject5 = mIsInBarrier;
      if ((localObject5[0] == 0) && (localObject5[1] == 0)) {
        return;
      }
    }
    boolean bool3 = resolvedHorizontal;
    if ((bool3) || (resolvedVertical))
    {
      if (bool3)
      {
        paramLinearSystem.addEquality(localSolverVariable, mX);
        paramLinearSystem.addEquality((SolverVariable)localObject1, mX + mWidth);
        if (bool2)
        {
          localObject5 = mParent;
          if (localObject5 != null) {
            if (OPTIMIZE_WRAP_ON_RESOLVED)
            {
              localObject5 = (ConstraintWidgetContainer)localObject5;
              ((ConstraintWidgetContainer)localObject5).addHorizontalWrapMinVariable(mLeft);
              ((ConstraintWidgetContainer)localObject5).addHorizontalWrapMaxVariable(mRight);
            }
            else
            {
              paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mRight), (SolverVariable)localObject1, 0, 5);
            }
          }
        }
      }
      if (resolvedVertical)
      {
        paramLinearSystem.addEquality((SolverVariable)localObject2, mY);
        paramLinearSystem.addEquality((SolverVariable)localObject3, mY + mHeight);
        if (mBaseline.hasDependents()) {
          paramLinearSystem.addEquality((SolverVariable)localObject4, mY + mBaselineDistance);
        }
        if (bool1)
        {
          localObject5 = mParent;
          if (localObject5 != null) {
            if (OPTIMIZE_WRAP_ON_RESOLVED)
            {
              localObject5 = (ConstraintWidgetContainer)localObject5;
              ((ConstraintWidgetContainer)localObject5).addVerticalWrapMinVariable(mTop);
              ((ConstraintWidgetContainer)localObject5).addVerticalWrapMaxVariable(mBottom);
            }
            else
            {
              paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mBottom), (SolverVariable)localObject3, 0, 5);
            }
          }
        }
      }
      if ((resolvedHorizontal) && (resolvedVertical))
      {
        resolvedHorizontal = false;
        resolvedVertical = false;
        return;
      }
    }
    Object localObject6 = LinearSystem.sMetrics;
    if (localObject6 != null) {
      widgets += 1L;
    }
    if (paramBoolean)
    {
      localObject7 = horizontalRun;
      if (localObject7 != null)
      {
        localObject8 = verticalRun;
        if (localObject8 != null)
        {
          localObject5 = start;
          if ((resolved) && (end.resolved) && (start.resolved) && (end.resolved))
          {
            if (localObject6 != null) {
              graphSolved += 1L;
            }
            paramLinearSystem.addEquality(localSolverVariable, value);
            paramLinearSystem.addEquality((SolverVariable)localObject1, horizontalRun.end.value);
            paramLinearSystem.addEquality((SolverVariable)localObject2, verticalRun.start.value);
            paramLinearSystem.addEquality((SolverVariable)localObject3, verticalRun.end.value);
            paramLinearSystem.addEquality((SolverVariable)localObject4, verticalRun.baseline.value);
            if (mParent != null)
            {
              if ((bool2) && (isTerminalWidget[0] != 0) && (!isInHorizontalChain())) {
                paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mParent.mRight), (SolverVariable)localObject1, 0, 8);
              }
              if ((bool1) && (isTerminalWidget[1] != 0) && (!isInVerticalChain())) {
                paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mParent.mBottom), (SolverVariable)localObject3, 0, 8);
              }
            }
            resolvedHorizontal = false;
            resolvedVertical = false;
            return;
          }
        }
      }
    }
    if (localObject6 != null) {
      linearSolved += 1L;
    }
    boolean bool4;
    if (mParent != null)
    {
      if (isChainHead(0))
      {
        ((ConstraintWidgetContainer)mParent).addChain(this, 0);
        bool3 = true;
      }
      else
      {
        bool3 = isInHorizontalChain();
      }
      if (isChainHead(1))
      {
        ((ConstraintWidgetContainer)mParent).addChain(this, 1);
        bool4 = true;
      }
      else
      {
        bool4 = isInVerticalChain();
      }
      if ((!bool3) && (bool2) && (mVisibility != 8) && (mLeft.mTarget == null) && (mRight.mTarget == null)) {
        paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mParent.mRight), (SolverVariable)localObject1, 0, 1);
      }
      if ((!bool4) && (bool1) && (mVisibility != 8) && (mTop.mTarget == null) && (mBottom.mTarget == null) && (mBaseline == null)) {
        paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mParent.mBottom), (SolverVariable)localObject3, 0, 1);
      }
    }
    else
    {
      bool4 = false;
      bool3 = bool4;
    }
    int j = mWidth;
    int i = mMinWidth;
    if (j >= i) {
      i = j;
    }
    int k = mHeight;
    int m = mMinHeight;
    if (k >= m) {
      m = k;
    }
    localObject6 = mListDimensionBehaviors;
    localObject5 = localObject6[0];
    DimensionBehaviour localDimensionBehaviour = DimensionBehaviour.MATCH_CONSTRAINT;
    if (localObject5 != localDimensionBehaviour) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    localObject6 = localObject6[1];
    if (localObject6 != localDimensionBehaviour) {
      bool6 = true;
    } else {
      bool6 = false;
    }
    int n = mDimensionRatioSide;
    mResolvedDimensionRatioSide = n;
    float f = mDimensionRatio;
    mResolvedDimensionRatio = f;
    int i1 = mMatchConstraintDefaultWidth;
    int i2 = mMatchConstraintDefaultHeight;
    int i3;
    if ((f > 0.0F) && (mVisibility != 8))
    {
      i3 = i1;
      if (localObject5 == localDimensionBehaviour)
      {
        i3 = i1;
        if (i1 == 0) {
          i3 = 3;
        }
      }
      i1 = i2;
      if (localObject6 == localDimensionBehaviour)
      {
        i1 = i2;
        if (i2 == 0) {
          i1 = 3;
        }
      }
      if ((localObject5 == localDimensionBehaviour) && (localObject6 == localDimensionBehaviour) && (i3 == 3) && (i1 == 3))
      {
        setupDimensionRatio(bool2, bool1, bool5, bool6);
      }
      else if ((localObject5 == localDimensionBehaviour) && (i3 == 3))
      {
        mResolvedDimensionRatioSide = 0;
        i = (int)(f * k);
        if (localObject6 != localDimensionBehaviour)
        {
          i3 = i1;
          i1 = 4;
          break label1383;
        }
      }
      else if ((localObject6 == localDimensionBehaviour) && (i1 == 3))
      {
        mResolvedDimensionRatioSide = 1;
        if (n == -1) {
          mResolvedDimensionRatio = (1.0F / f);
        }
        m = (int)(mResolvedDimensionRatio * j);
        i2 = i3;
        if (localObject5 != localDimensionBehaviour)
        {
          i3 = 4;
          i1 = i2;
          break label1383;
        }
      }
      i2 = i3;
      i3 = i1;
      bool5 = true;
      i1 = i2;
      break label1386;
    }
    else
    {
      i3 = i2;
    }
    label1383:
    boolean bool5 = false;
    label1386:
    localObject5 = mResolvedMatchConstraintDefault;
    localObject5[0] = i1;
    localObject5[1] = i3;
    mResolvedHasRatio = bool5;
    if (bool5)
    {
      i2 = mResolvedDimensionRatioSide;
      if ((i2 == 0) || (i2 == -1))
      {
        bool7 = true;
        break label1441;
      }
    }
    boolean bool7 = false;
    label1441:
    if (bool5)
    {
      i2 = mResolvedDimensionRatioSide;
      if ((i2 == 1) || (i2 == -1))
      {
        bool6 = true;
        break label1473;
      }
    }
    boolean bool6 = false;
    label1473:
    localObject5 = mListDimensionBehaviors[0];
    Object localObject9 = DimensionBehaviour.WRAP_CONTENT;
    if ((localObject5 == localObject9) && ((this instanceof ConstraintWidgetContainer))) {
      bool8 = true;
    } else {
      bool8 = false;
    }
    if (bool8) {
      i = 0;
    }
    boolean bool9 = mCenter.isConnected() ^ true;
    localObject5 = mIsInBarrier;
    int i4 = localObject5[0];
    int i5 = localObject5[1];
    Object localObject10;
    if ((mHorizontalResolution != 2) && (!resolvedHorizontal))
    {
      if (paramBoolean)
      {
        localObject6 = horizontalRun;
        if (localObject6 != null)
        {
          localObject5 = start;
          if ((resolved) && (end.resolved))
          {
            if (paramBoolean)
            {
              paramLinearSystem.addEquality(localSolverVariable, value);
              paramLinearSystem.addEquality((SolverVariable)localObject1, horizontalRun.end.value);
              if ((mParent != null) && (bool2) && (isTerminalWidget[0] != 0) && (!isInHorizontalChain())) {
                paramLinearSystem.addGreaterThan(paramLinearSystem.createObjectVariable(mParent.mRight), (SolverVariable)localObject1, 0, 8);
              }
              break label1889;
            }
            break label1889;
          }
        }
      }
      localObject5 = mParent;
      if (localObject5 != null) {
        localObject5 = paramLinearSystem.createObjectVariable(mRight);
      } else {
        localObject5 = null;
      }
      localObject6 = mParent;
      if (localObject6 != null) {
        localObject6 = paramLinearSystem.createObjectVariable(mLeft);
      } else {
        localObject6 = null;
      }
      int i6 = isTerminalWidget[0];
      localObject8 = mListDimensionBehaviors;
      localObject7 = localObject8[0];
      localObject10 = mLeft;
      ConstraintAnchor localConstraintAnchor = mRight;
      i2 = mX;
      j = mMinWidth;
      k = mMaxDimension[0];
      f = mHorizontalBiasPercent;
      boolean bool10;
      if (localObject8[1] == localDimensionBehaviour) {
        bool10 = true;
      } else {
        bool10 = false;
      }
      applyConstraints(paramLinearSystem, true, bool2, bool1, i6, (SolverVariable)localObject6, (SolverVariable)localObject5, (DimensionBehaviour)localObject7, bool8, (ConstraintAnchor)localObject10, localConstraintAnchor, i2, i, j, k, f, bool7, bool10, bool3, bool4, i4, i1, i3, mMatchConstraintMinWidth, mMatchConstraintMaxWidth, mMatchConstraintPercentWidth, bool9);
    }
    label1889:
    localObject6 = localObject2;
    localObject5 = localObject3;
    boolean bool8 = bool1;
    localObject3 = localObject1;
    if (paramBoolean)
    {
      localObject1 = this;
      localObject8 = verticalRun;
      if (localObject8 != null)
      {
        localObject2 = start;
        if ((resolved) && (end.resolved))
        {
          i = value;
          localObject2 = paramLinearSystem;
          ((LinearSystem)localObject2).addEquality((SolverVariable)localObject6, i);
          i = verticalRun.end.value;
          localObject8 = localObject5;
          ((LinearSystem)localObject2).addEquality((SolverVariable)localObject8, i);
          ((LinearSystem)localObject2).addEquality((SolverVariable)localObject4, verticalRun.baseline.value);
          localObject7 = mParent;
          if ((localObject7 != null) && (!bool4) && (bool8)) {
            if (isTerminalWidget[1] != 0) {
              ((LinearSystem)localObject2).addGreaterThan(((LinearSystem)localObject2).createObjectVariable(mBottom), (SolverVariable)localObject8, 0, 8);
            } else {}
          }
          i = 0;
          break label2083;
        }
      }
    }
    i = 1;
    label2083:
    localObject2 = this;
    Object localObject8 = paramLinearSystem;
    Object localObject7 = localObject4;
    if (mVerticalResolution == 2) {
      i = 0;
    }
    if ((i != 0) && (!resolvedVertical))
    {
      if ((mListDimensionBehaviors[1] == localObject9) && ((localObject2 instanceof ConstraintWidgetContainer))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      if (paramBoolean) {
        m = 0;
      }
      localObject4 = mParent;
      if (localObject4 != null) {
        localObject4 = ((LinearSystem)localObject8).createObjectVariable(mBottom);
      } else {
        localObject4 = null;
      }
      localObject1 = mParent;
      if (localObject1 != null) {
        localObject1 = ((LinearSystem)localObject8).createObjectVariable(mTop);
      } else {
        localObject1 = null;
      }
      if ((mBaselineDistance > 0) || (mVisibility == 8))
      {
        localObject9 = mBaseline;
        if (mTarget != null)
        {
          ((LinearSystem)localObject8).addEquality((SolverVariable)localObject7, (SolverVariable)localObject6, getBaselineDistance(), 8);
          ((LinearSystem)localObject8).addEquality((SolverVariable)localObject7, ((LinearSystem)localObject8).createObjectVariable(mBaseline.mTarget), mBaseline.getMargin(), 8);
          if (bool8) {
            ((LinearSystem)localObject8).addGreaterThan((SolverVariable)localObject4, ((LinearSystem)localObject8).createObjectVariable(mBottom), 0, 5);
          }
          bool1 = false;
          break label2375;
        }
        if (mVisibility == 8) {
          ((LinearSystem)localObject8).addEquality((SolverVariable)localObject7, (SolverVariable)localObject6, ((ConstraintAnchor)localObject9).getMargin(), 8);
        } else {
          ((LinearSystem)localObject8).addEquality((SolverVariable)localObject7, (SolverVariable)localObject6, getBaselineDistance(), 8);
        }
      }
      bool1 = bool9;
      label2375:
      int i7 = isTerminalWidget[1];
      localObject10 = mListDimensionBehaviors;
      localObject9 = localObject10[1];
      localObject8 = mTop;
      localObject7 = mBottom;
      j = mY;
      i2 = mMinHeight;
      i = mMaxDimension[1];
      f = mVerticalBiasPercent;
      if (localObject10[0] == localDimensionBehaviour) {
        bool7 = true;
      } else {
        bool7 = false;
      }
      applyConstraints(paramLinearSystem, false, bool8, bool2, i7, (SolverVariable)localObject1, (SolverVariable)localObject4, (DimensionBehaviour)localObject9, paramBoolean, (ConstraintAnchor)localObject8, (ConstraintAnchor)localObject7, j, m, i2, i, f, bool6, bool7, bool4, bool3, i5, i3, i1, mMatchConstraintMinHeight, mMatchConstraintMaxHeight, mMatchConstraintPercentHeight, bool1);
    }
    if (bool5)
    {
      localObject4 = this;
      if (mResolvedDimensionRatioSide == 1) {
        paramLinearSystem.addRatio((SolverVariable)localObject5, (SolverVariable)localObject6, (SolverVariable)localObject3, localSolverVariable, mResolvedDimensionRatio, 8);
      } else {
        paramLinearSystem.addRatio((SolverVariable)localObject3, localSolverVariable, (SolverVariable)localObject5, (SolverVariable)localObject6, mResolvedDimensionRatio, 8);
      }
    }
    localObject5 = this;
    if (mCenter.isConnected()) {
      paramLinearSystem.addCenterPoint((ConstraintWidget)localObject5, mCenter.getTarget().getOwner(), (float)Math.toRadians(mCircleConstraintAngle + 90.0F), mCenter.getMargin());
    }
    resolvedHorizontal = false;
    resolvedVertical = false;
  }
  
  public boolean allowedInBarrier()
  {
    boolean bool;
    if (mVisibility != 8) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void connect(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2)
  {
    connect(paramType1, paramConstraintWidget, paramType2, 0);
  }
  
  public void connect(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt)
  {
    ConstraintAnchor.Type localType1 = ConstraintAnchor.Type.CENTER;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramType1 == localType1)
    {
      if (paramType2 == localType1)
      {
        paramType2 = ConstraintAnchor.Type.LEFT;
        ConstraintAnchor localConstraintAnchor = getAnchor(paramType2);
        ConstraintAnchor.Type localType2 = ConstraintAnchor.Type.RIGHT;
        paramType1 = getAnchor(localType2);
        localObject1 = ConstraintAnchor.Type.TOP;
        localObject2 = getAnchor((ConstraintAnchor.Type)localObject1);
        ConstraintAnchor.Type localType3 = ConstraintAnchor.Type.BOTTOM;
        localObject3 = getAnchor(localType3);
        int i = 1;
        if (((localConstraintAnchor != null) && (localConstraintAnchor.isConnected())) || ((paramType1 != null) && (paramType1.isConnected())))
        {
          paramInt = 0;
        }
        else
        {
          connect(paramType2, paramConstraintWidget, paramType2, 0);
          connect(localType2, paramConstraintWidget, localType2, 0);
          paramInt = 1;
        }
        if (((localObject2 != null) && (((ConstraintAnchor)localObject2).isConnected())) || ((localObject3 != null) && (((ConstraintAnchor)localObject3).isConnected())))
        {
          i = 0;
        }
        else
        {
          connect((ConstraintAnchor.Type)localObject1, paramConstraintWidget, (ConstraintAnchor.Type)localObject1, 0);
          connect(localType3, paramConstraintWidget, localType3, 0);
        }
        if ((paramInt != 0) && (i != 0))
        {
          getAnchor(localType1).connect(paramConstraintWidget.getAnchor(localType1), 0);
        }
        else if (paramInt != 0)
        {
          paramType1 = ConstraintAnchor.Type.CENTER_X;
          getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        }
        else if (i != 0)
        {
          paramType1 = ConstraintAnchor.Type.CENTER_Y;
          getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        }
      }
      else
      {
        paramType1 = ConstraintAnchor.Type.LEFT;
        if ((paramType2 != paramType1) && (paramType2 != ConstraintAnchor.Type.RIGHT))
        {
          paramType1 = ConstraintAnchor.Type.TOP;
          if ((paramType2 == paramType1) || (paramType2 == ConstraintAnchor.Type.BOTTOM))
          {
            connect(paramType1, paramConstraintWidget, paramType2, 0);
            connect(ConstraintAnchor.Type.BOTTOM, paramConstraintWidget, paramType2, 0);
            getAnchor(localType1).connect(paramConstraintWidget.getAnchor(paramType2), 0);
          }
        }
        else
        {
          connect(paramType1, paramConstraintWidget, paramType2, 0);
          connect(ConstraintAnchor.Type.RIGHT, paramConstraintWidget, paramType2, 0);
          getAnchor(localType1).connect(paramConstraintWidget.getAnchor(paramType2), 0);
        }
      }
    }
    else
    {
      localObject2 = ConstraintAnchor.Type.CENTER_X;
      if (paramType1 == localObject2)
      {
        localObject1 = ConstraintAnchor.Type.LEFT;
        if ((paramType2 == localObject1) || (paramType2 == ConstraintAnchor.Type.RIGHT))
        {
          paramType1 = getAnchor((ConstraintAnchor.Type)localObject1);
          paramConstraintWidget = paramConstraintWidget.getAnchor(paramType2);
          paramType2 = getAnchor(ConstraintAnchor.Type.RIGHT);
          paramType1.connect(paramConstraintWidget, 0);
          paramType2.connect(paramConstraintWidget, 0);
          getAnchor((ConstraintAnchor.Type)localObject2).connect(paramConstraintWidget, 0);
          return;
        }
      }
      localObject3 = ConstraintAnchor.Type.CENTER_Y;
      if (paramType1 == localObject3)
      {
        localObject1 = ConstraintAnchor.Type.TOP;
        if ((paramType2 == localObject1) || (paramType2 == ConstraintAnchor.Type.BOTTOM))
        {
          paramType1 = paramConstraintWidget.getAnchor(paramType2);
          getAnchor((ConstraintAnchor.Type)localObject1).connect(paramType1, 0);
          getAnchor(ConstraintAnchor.Type.BOTTOM).connect(paramType1, 0);
          getAnchor((ConstraintAnchor.Type)localObject3).connect(paramType1, 0);
          return;
        }
      }
      if ((paramType1 == localObject2) && (paramType2 == localObject2))
      {
        paramType1 = ConstraintAnchor.Type.LEFT;
        getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        paramType1 = ConstraintAnchor.Type.RIGHT;
        getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        getAnchor((ConstraintAnchor.Type)localObject2).connect(paramConstraintWidget.getAnchor(paramType2), 0);
      }
      else if ((paramType1 == localObject3) && (paramType2 == localObject3))
      {
        paramType1 = ConstraintAnchor.Type.TOP;
        getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        paramType1 = ConstraintAnchor.Type.BOTTOM;
        getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType1), 0);
        getAnchor((ConstraintAnchor.Type)localObject3).connect(paramConstraintWidget.getAnchor(paramType2), 0);
      }
      else
      {
        localObject1 = getAnchor(paramType1);
        paramConstraintWidget = paramConstraintWidget.getAnchor(paramType2);
        if (((ConstraintAnchor)localObject1).isValidConnection(paramConstraintWidget))
        {
          paramType2 = ConstraintAnchor.Type.BASELINE;
          if (paramType1 == paramType2)
          {
            paramType2 = getAnchor(ConstraintAnchor.Type.TOP);
            paramType1 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            if (paramType2 != null) {
              paramType2.reset();
            }
            if (paramType1 != null) {
              paramType1.reset();
            }
          }
          else if ((paramType1 != ConstraintAnchor.Type.TOP) && (paramType1 != ConstraintAnchor.Type.BOTTOM))
          {
            if ((paramType1 == ConstraintAnchor.Type.LEFT) || (paramType1 == ConstraintAnchor.Type.RIGHT))
            {
              paramType2 = getAnchor(localType1);
              if (paramType2.getTarget() != paramConstraintWidget) {
                paramType2.reset();
              }
              paramType1 = getAnchor(paramType1).getOpposite();
              paramType2 = getAnchor((ConstraintAnchor.Type)localObject2);
              if (paramType2.isConnected())
              {
                paramType1.reset();
                paramType2.reset();
              }
            }
          }
          else
          {
            paramType2 = getAnchor(paramType2);
            if (paramType2 != null) {
              paramType2.reset();
            }
            paramType2 = getAnchor(localType1);
            if (paramType2.getTarget() != paramConstraintWidget) {
              paramType2.reset();
            }
            paramType1 = getAnchor(paramType1).getOpposite();
            paramType2 = getAnchor((ConstraintAnchor.Type)localObject3);
            if (paramType2.isConnected())
            {
              paramType1.reset();
              paramType2.reset();
            }
          }
          ((ConstraintAnchor)localObject1).connect(paramConstraintWidget, paramInt);
        }
      }
    }
  }
  
  public void connect(ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt)
  {
    if (paramConstraintAnchor1.getOwner() == this) {
      connect(paramConstraintAnchor1.getType(), paramConstraintAnchor2.getOwner(), paramConstraintAnchor2.getType(), paramInt);
    }
  }
  
  public void connectCircularConstraint(ConstraintWidget paramConstraintWidget, float paramFloat, int paramInt)
  {
    ConstraintAnchor.Type localType = ConstraintAnchor.Type.CENTER;
    immediateConnect(localType, paramConstraintWidget, localType, paramInt, 0);
    mCircleConstraintAngle = paramFloat;
  }
  
  public void copy(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap)
  {
    mHorizontalResolution = mHorizontalResolution;
    mVerticalResolution = mVerticalResolution;
    mMatchConstraintDefaultWidth = mMatchConstraintDefaultWidth;
    mMatchConstraintDefaultHeight = mMatchConstraintDefaultHeight;
    Object localObject1 = mResolvedMatchConstraintDefault;
    int[] arrayOfInt = mResolvedMatchConstraintDefault;
    localObject1[0] = arrayOfInt[0];
    localObject1[1] = arrayOfInt[1];
    mMatchConstraintMinWidth = mMatchConstraintMinWidth;
    mMatchConstraintMaxWidth = mMatchConstraintMaxWidth;
    mMatchConstraintMinHeight = mMatchConstraintMinHeight;
    mMatchConstraintMaxHeight = mMatchConstraintMaxHeight;
    mMatchConstraintPercentHeight = mMatchConstraintPercentHeight;
    mIsWidthWrapContent = mIsWidthWrapContent;
    mIsHeightWrapContent = mIsHeightWrapContent;
    mResolvedDimensionRatioSide = mResolvedDimensionRatioSide;
    mResolvedDimensionRatio = mResolvedDimensionRatio;
    localObject1 = mMaxDimension;
    mMaxDimension = Arrays.copyOf((int[])localObject1, localObject1.length);
    mCircleConstraintAngle = mCircleConstraintAngle;
    hasBaseline = hasBaseline;
    inPlaceholder = inPlaceholder;
    mLeft.reset();
    mTop.reset();
    mRight.reset();
    mBottom.reset();
    mBaseline.reset();
    mCenterX.reset();
    mCenterY.reset();
    mCenter.reset();
    mListDimensionBehaviors = ((DimensionBehaviour[])Arrays.copyOf(mListDimensionBehaviors, 2));
    localObject1 = mParent;
    arrayOfInt = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = (ConstraintWidget)paramHashMap.get(mParent);
    }
    mParent = ((ConstraintWidget)localObject1);
    mWidth = mWidth;
    mHeight = mHeight;
    mDimensionRatio = mDimensionRatio;
    mDimensionRatioSide = mDimensionRatioSide;
    mX = mX;
    mY = mY;
    mRelX = mRelX;
    mRelY = mRelY;
    mOffsetX = mOffsetX;
    mOffsetY = mOffsetY;
    mBaselineDistance = mBaselineDistance;
    mMinWidth = mMinWidth;
    mMinHeight = mMinHeight;
    mHorizontalBiasPercent = mHorizontalBiasPercent;
    mVerticalBiasPercent = mVerticalBiasPercent;
    mCompanionWidget = mCompanionWidget;
    mContainerItemSkip = mContainerItemSkip;
    mVisibility = mVisibility;
    mAnimated = mAnimated;
    mDebugName = mDebugName;
    mType = mType;
    mDistToTop = mDistToTop;
    mDistToLeft = mDistToLeft;
    mDistToRight = mDistToRight;
    mDistToBottom = mDistToBottom;
    mLeftHasCentered = mLeftHasCentered;
    mRightHasCentered = mRightHasCentered;
    mTopHasCentered = mTopHasCentered;
    mBottomHasCentered = mBottomHasCentered;
    mHorizontalWrapVisited = mHorizontalWrapVisited;
    mVerticalWrapVisited = mVerticalWrapVisited;
    mHorizontalChainStyle = mHorizontalChainStyle;
    mVerticalChainStyle = mVerticalChainStyle;
    mHorizontalChainFixedPosition = mHorizontalChainFixedPosition;
    mVerticalChainFixedPosition = mVerticalChainFixedPosition;
    Object localObject2 = mWeight;
    localObject1 = mWeight;
    localObject2[0] = localObject1[0];
    localObject2[1] = localObject1[1];
    localObject2 = mListNextMatchConstraintsWidget;
    localObject1 = mListNextMatchConstraintsWidget;
    localObject2[0] = localObject1[0];
    localObject2[1] = localObject1[1];
    localObject1 = mNextChainWidget;
    localObject2 = mNextChainWidget;
    localObject1[0] = localObject2[0];
    localObject1[1] = localObject2[1];
    localObject1 = mHorizontalNextWidget;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = (ConstraintWidget)paramHashMap.get(localObject1);
    }
    mHorizontalNextWidget = ((ConstraintWidget)localObject1);
    paramConstraintWidget = mVerticalNextWidget;
    if (paramConstraintWidget == null) {
      paramConstraintWidget = arrayOfInt;
    } else {
      paramConstraintWidget = (ConstraintWidget)paramHashMap.get(paramConstraintWidget);
    }
    mVerticalNextWidget = paramConstraintWidget;
  }
  
  public void createObjectVariables(LinearSystem paramLinearSystem)
  {
    paramLinearSystem.createObjectVariable(mLeft);
    paramLinearSystem.createObjectVariable(mTop);
    paramLinearSystem.createObjectVariable(mRight);
    paramLinearSystem.createObjectVariable(mBottom);
    if (mBaselineDistance > 0) {
      paramLinearSystem.createObjectVariable(mBaseline);
    }
  }
  
  public void ensureMeasureRequested()
  {
    mMeasureRequested = true;
  }
  
  public void ensureWidgetRuns()
  {
    if (horizontalRun == null) {
      horizontalRun = new HorizontalWidgetRun(this);
    }
    if (verticalRun == null) {
      verticalRun = new VerticalWidgetRun(this);
    }
  }
  
  public ConstraintAnchor getAnchor(ConstraintAnchor.Type paramType)
  {
    switch (1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[paramType.ordinal()])
    {
    default: 
      throw new AssertionError(paramType.name());
    case 9: 
      return null;
    case 8: 
      return mCenterY;
    case 7: 
      return mCenterX;
    case 6: 
      return mCenter;
    case 5: 
      return mBaseline;
    case 4: 
      return mBottom;
    case 3: 
      return mRight;
    case 2: 
      return mTop;
    }
    return mLeft;
  }
  
  public ArrayList<ConstraintAnchor> getAnchors()
  {
    return mAnchors;
  }
  
  public int getBaselineDistance()
  {
    return mBaselineDistance;
  }
  
  public float getBiasPercent(int paramInt)
  {
    if (paramInt == 0) {
      return mHorizontalBiasPercent;
    }
    if (paramInt == 1) {
      return mVerticalBiasPercent;
    }
    return -1.0F;
  }
  
  public int getBottom()
  {
    return getY() + mHeight;
  }
  
  public Object getCompanionWidget()
  {
    return mCompanionWidget;
  }
  
  public int getContainerItemSkip()
  {
    return mContainerItemSkip;
  }
  
  public String getDebugName()
  {
    return mDebugName;
  }
  
  public DimensionBehaviour getDimensionBehaviour(int paramInt)
  {
    if (paramInt == 0) {
      return getHorizontalDimensionBehaviour();
    }
    if (paramInt == 1) {
      return getVerticalDimensionBehaviour();
    }
    return null;
  }
  
  public float getDimensionRatio()
  {
    return mDimensionRatio;
  }
  
  public int getDimensionRatioSide()
  {
    return mDimensionRatioSide;
  }
  
  public boolean getHasBaseline()
  {
    return hasBaseline;
  }
  
  public int getHeight()
  {
    if (mVisibility == 8) {
      return 0;
    }
    return mHeight;
  }
  
  public float getHorizontalBiasPercent()
  {
    return mHorizontalBiasPercent;
  }
  
  public ConstraintWidget getHorizontalChainControlWidget()
  {
    boolean bool = isInHorizontalChain();
    Object localObject1 = null;
    if (bool)
    {
      localObject1 = this;
      Object localObject2 = null;
      while ((localObject2 == null) && (localObject1 != null))
      {
        Object localObject3 = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.LEFT);
        if (localObject3 == null) {
          localObject3 = null;
        } else {
          localObject3 = ((ConstraintAnchor)localObject3).getTarget();
        }
        if (localObject3 == null) {
          localObject3 = null;
        } else {
          localObject3 = ((ConstraintAnchor)localObject3).getOwner();
        }
        if (localObject3 == getParent()) {
          return localObject1;
        }
        ConstraintAnchor localConstraintAnchor;
        if (localObject3 == null) {
          localConstraintAnchor = null;
        } else {
          localConstraintAnchor = ((ConstraintWidget)localObject3).getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
        }
        if ((localConstraintAnchor != null) && (localConstraintAnchor.getOwner() != localObject1)) {
          localObject2 = localObject1;
        } else {
          localObject1 = localObject3;
        }
      }
      localObject1 = localObject2;
    }
    return (ConstraintWidget)localObject1;
  }
  
  public int getHorizontalChainStyle()
  {
    return mHorizontalChainStyle;
  }
  
  public DimensionBehaviour getHorizontalDimensionBehaviour()
  {
    return mListDimensionBehaviors[0];
  }
  
  public int getHorizontalMargin()
  {
    ConstraintAnchor localConstraintAnchor = mLeft;
    int i = 0;
    if (localConstraintAnchor != null) {
      i = 0 + mMargin;
    }
    localConstraintAnchor = mRight;
    int j = i;
    if (localConstraintAnchor != null) {
      j = i + mMargin;
    }
    return j;
  }
  
  public int getLastHorizontalMeasureSpec()
  {
    return mLastHorizontalMeasureSpec;
  }
  
  public int getLastVerticalMeasureSpec()
  {
    return mLastVerticalMeasureSpec;
  }
  
  public int getLeft()
  {
    return getX();
  }
  
  public int getLength(int paramInt)
  {
    if (paramInt == 0) {
      return getWidth();
    }
    if (paramInt == 1) {
      return getHeight();
    }
    return 0;
  }
  
  public int getMaxHeight()
  {
    return mMaxDimension[1];
  }
  
  public int getMaxWidth()
  {
    return mMaxDimension[0];
  }
  
  public int getMinHeight()
  {
    return mMinHeight;
  }
  
  public int getMinWidth()
  {
    return mMinWidth;
  }
  
  public ConstraintWidget getNextChainMember(int paramInt)
  {
    ConstraintAnchor localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2;
    if (paramInt == 0)
    {
      localConstraintAnchor1 = mRight;
      localConstraintAnchor2 = mTarget;
      if ((localConstraintAnchor2 != null) && (mTarget == localConstraintAnchor1)) {
        return mOwner;
      }
    }
    else if (paramInt == 1)
    {
      localConstraintAnchor1 = mBottom;
      localConstraintAnchor2 = mTarget;
      if ((localConstraintAnchor2 != null) && (mTarget == localConstraintAnchor1)) {
        return mOwner;
      }
    }
    return null;
  }
  
  public int getOptimizerWrapHeight()
  {
    int i = mHeight;
    int j = i;
    if (mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT)
    {
      if (mMatchConstraintDefaultHeight == 1)
      {
        i = Math.max(mMatchConstraintMinHeight, i);
      }
      else
      {
        i = mMatchConstraintMinHeight;
        if (i > 0) {
          mHeight = i;
        } else {
          i = 0;
        }
      }
      int k = mMatchConstraintMaxHeight;
      j = i;
      if (k > 0)
      {
        j = i;
        if (k < i) {
          j = k;
        }
      }
    }
    return j;
  }
  
  public int getOptimizerWrapWidth()
  {
    int i = mWidth;
    int j = i;
    if (mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
    {
      if (mMatchConstraintDefaultWidth == 1)
      {
        i = Math.max(mMatchConstraintMinWidth, i);
      }
      else
      {
        i = mMatchConstraintMinWidth;
        if (i > 0) {
          mWidth = i;
        } else {
          i = 0;
        }
      }
      int k = mMatchConstraintMaxWidth;
      j = i;
      if (k > 0)
      {
        j = i;
        if (k < i) {
          j = k;
        }
      }
    }
    return j;
  }
  
  public ConstraintWidget getParent()
  {
    return mParent;
  }
  
  public ConstraintWidget getPreviousChainMember(int paramInt)
  {
    ConstraintAnchor localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2;
    if (paramInt == 0)
    {
      localConstraintAnchor1 = mLeft;
      localConstraintAnchor2 = mTarget;
      if ((localConstraintAnchor2 != null) && (mTarget == localConstraintAnchor1)) {
        return mOwner;
      }
    }
    else if (paramInt == 1)
    {
      localConstraintAnchor2 = mTop;
      localConstraintAnchor1 = mTarget;
      if ((localConstraintAnchor1 != null) && (mTarget == localConstraintAnchor2)) {
        return mOwner;
      }
    }
    return null;
  }
  
  public int getRelativePositioning(int paramInt)
  {
    if (paramInt == 0) {
      return mRelX;
    }
    if (paramInt == 1) {
      return mRelY;
    }
    return 0;
  }
  
  public int getRight()
  {
    return getX() + mWidth;
  }
  
  public int getRootX()
  {
    return mX + mOffsetX;
  }
  
  public int getRootY()
  {
    return mY + mOffsetY;
  }
  
  public WidgetRun getRun(int paramInt)
  {
    if (paramInt == 0) {
      return horizontalRun;
    }
    if (paramInt == 1) {
      return verticalRun;
    }
    return null;
  }
  
  public void getSceneString(StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = z2.t("  ");
    localStringBuilder.append(stringId);
    localStringBuilder.append(":{\n");
    paramStringBuilder.append(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualWidth:");
    localStringBuilder.append(mWidth);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualHeight:");
    localStringBuilder.append(mHeight);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualLeft:");
    localStringBuilder.append(mX);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("    actualTop:");
    localStringBuilder.append(mY);
    paramStringBuilder.append(localStringBuilder.toString());
    paramStringBuilder.append("\n");
    getSceneString(paramStringBuilder, "left", mLeft);
    getSceneString(paramStringBuilder, "top", mTop);
    getSceneString(paramStringBuilder, "right", mRight);
    getSceneString(paramStringBuilder, "bottom", mBottom);
    getSceneString(paramStringBuilder, "baseline", mBaseline);
    getSceneString(paramStringBuilder, "centerX", mCenterX);
    getSceneString(paramStringBuilder, "centerY", mCenterY);
    getSceneString(paramStringBuilder, "    width", mWidth, mMinWidth, mMaxDimension[0], mWidthOverride, mMatchConstraintMinWidth, mMatchConstraintDefaultWidth, mMatchConstraintPercentWidth, mWeight[0]);
    getSceneString(paramStringBuilder, "    height", mHeight, mMinHeight, mMaxDimension[1], mHeightOverride, mMatchConstraintMinHeight, mMatchConstraintDefaultHeight, mMatchConstraintPercentHeight, mWeight[1]);
    serializeDimensionRatio(paramStringBuilder, "    dimensionRatio", mDimensionRatio, mDimensionRatioSide);
    serializeAttribute(paramStringBuilder, "    horizontalBias", mHorizontalBiasPercent, DEFAULT_BIAS);
    serializeAttribute(paramStringBuilder, "    verticalBias", mVerticalBiasPercent, DEFAULT_BIAS);
    serializeAttribute(paramStringBuilder, "    horizontalChainStyle", mHorizontalChainStyle, 0);
    serializeAttribute(paramStringBuilder, "    verticalChainStyle", mVerticalChainStyle, 0);
    paramStringBuilder.append("  }");
  }
  
  public int getTop()
  {
    return getY();
  }
  
  public String getType()
  {
    return mType;
  }
  
  public float getVerticalBiasPercent()
  {
    return mVerticalBiasPercent;
  }
  
  public ConstraintWidget getVerticalChainControlWidget()
  {
    boolean bool = isInVerticalChain();
    Object localObject1 = null;
    if (bool)
    {
      localObject1 = this;
      Object localObject2 = null;
      while ((localObject2 == null) && (localObject1 != null))
      {
        Object localObject3 = ((ConstraintWidget)localObject1).getAnchor(ConstraintAnchor.Type.TOP);
        if (localObject3 == null) {
          localObject3 = null;
        } else {
          localObject3 = ((ConstraintAnchor)localObject3).getTarget();
        }
        if (localObject3 == null) {
          localObject3 = null;
        } else {
          localObject3 = ((ConstraintAnchor)localObject3).getOwner();
        }
        if (localObject3 == getParent()) {
          return localObject1;
        }
        ConstraintAnchor localConstraintAnchor;
        if (localObject3 == null) {
          localConstraintAnchor = null;
        } else {
          localConstraintAnchor = ((ConstraintWidget)localObject3).getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
        }
        if ((localConstraintAnchor != null) && (localConstraintAnchor.getOwner() != localObject1)) {
          localObject2 = localObject1;
        } else {
          localObject1 = localObject3;
        }
      }
      localObject1 = localObject2;
    }
    return (ConstraintWidget)localObject1;
  }
  
  public int getVerticalChainStyle()
  {
    return mVerticalChainStyle;
  }
  
  public DimensionBehaviour getVerticalDimensionBehaviour()
  {
    return mListDimensionBehaviors[1];
  }
  
  public int getVerticalMargin()
  {
    ConstraintAnchor localConstraintAnchor = mLeft;
    int i = 0;
    if (localConstraintAnchor != null) {
      i = 0 + mTop.mMargin;
    }
    int j = i;
    if (mRight != null) {
      j = i + mBottom.mMargin;
    }
    return j;
  }
  
  public int getVisibility()
  {
    return mVisibility;
  }
  
  public int getWidth()
  {
    if (mVisibility == 8) {
      return 0;
    }
    return mWidth;
  }
  
  public int getWrapBehaviorInParent()
  {
    return mWrapBehaviorInParent;
  }
  
  public int getX()
  {
    ConstraintWidget localConstraintWidget = mParent;
    if ((localConstraintWidget != null) && ((localConstraintWidget instanceof ConstraintWidgetContainer))) {
      return mPaddingLeft + mX;
    }
    return mX;
  }
  
  public int getY()
  {
    ConstraintWidget localConstraintWidget = mParent;
    if ((localConstraintWidget != null) && ((localConstraintWidget instanceof ConstraintWidgetContainer))) {
      return mPaddingTop + mY;
    }
    return mY;
  }
  
  public boolean hasBaseline()
  {
    return hasBaseline;
  }
  
  public boolean hasDanglingDimension(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i;
    if (paramInt == 0)
    {
      if (mLeft.mTarget != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (mRight.mTarget != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (paramInt + i >= 2) {
        bool2 = false;
      }
      return bool2;
    }
    if (mTop.mTarget != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (mBottom.mTarget != null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (mBaseline.mTarget != null) {
      j = 1;
    } else {
      j = 0;
    }
    if (paramInt + i + j < 2) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean hasDependencies()
  {
    int i = mAnchors.size();
    for (int j = 0; j < i; j++) {
      if (((ConstraintAnchor)mAnchors.get(j)).hasDependents()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasDimensionOverride()
  {
    boolean bool;
    if ((mWidthOverride == -1) && (mHeightOverride == -1)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasResolvedTargets(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    ConstraintAnchor localConstraintAnchor;
    int i;
    int j;
    if (paramInt1 == 0)
    {
      localConstraintAnchor = mLeft.mTarget;
      if ((localConstraintAnchor != null) && (localConstraintAnchor.hasFinalValue()))
      {
        localConstraintAnchor = mRight.mTarget;
        if ((localConstraintAnchor != null) && (localConstraintAnchor.hasFinalValue()))
        {
          i = mRight.mTarget.getFinalValue();
          paramInt1 = mRight.getMargin();
          j = mLeft.mTarget.getFinalValue();
          if (i - paramInt1 - (mLeft.getMargin() + j) < paramInt2) {
            bool2 = false;
          }
          return bool2;
        }
      }
    }
    else
    {
      localConstraintAnchor = mTop.mTarget;
      if ((localConstraintAnchor != null) && (localConstraintAnchor.hasFinalValue()))
      {
        localConstraintAnchor = mBottom.mTarget;
        if ((localConstraintAnchor != null) && (localConstraintAnchor.hasFinalValue()))
        {
          paramInt1 = mBottom.mTarget.getFinalValue();
          i = mBottom.getMargin();
          j = mTop.mTarget.getFinalValue();
          if (paramInt1 - i - (mTop.getMargin() + j) >= paramInt2) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          return bool2;
        }
      }
    }
    return false;
  }
  
  public void immediateConnect(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt1, int paramInt2)
  {
    getAnchor(paramType1).connect(paramConstraintWidget.getAnchor(paramType2), paramInt1, paramInt2, true);
  }
  
  public boolean isAnimated()
  {
    return mAnimated;
  }
  
  public boolean isHeightWrapContent()
  {
    return mIsHeightWrapContent;
  }
  
  public boolean isHorizontalSolvingPassDone()
  {
    return horizontalSolvingPass;
  }
  
  public boolean isInBarrier(int paramInt)
  {
    return mIsInBarrier[paramInt];
  }
  
  public boolean isInHorizontalChain()
  {
    ConstraintAnchor localConstraintAnchor1 = mLeft;
    ConstraintAnchor localConstraintAnchor2 = mTarget;
    if ((localConstraintAnchor2 == null) || (mTarget != localConstraintAnchor1))
    {
      localConstraintAnchor1 = mRight;
      localConstraintAnchor2 = mTarget;
    }
    return (localConstraintAnchor2 != null) && (mTarget == localConstraintAnchor1);
  }
  
  public boolean isInPlaceholder()
  {
    return inPlaceholder;
  }
  
  public boolean isInVerticalChain()
  {
    ConstraintAnchor localConstraintAnchor1 = mTop;
    ConstraintAnchor localConstraintAnchor2 = mTarget;
    if ((localConstraintAnchor2 == null) || (mTarget != localConstraintAnchor1))
    {
      localConstraintAnchor2 = mBottom;
      localConstraintAnchor1 = mTarget;
    }
    return (localConstraintAnchor1 != null) && (mTarget == localConstraintAnchor2);
  }
  
  public boolean isInVirtualLayout()
  {
    return mInVirtualLayout;
  }
  
  public boolean isMeasureRequested()
  {
    boolean bool;
    if ((mMeasureRequested) && (mVisibility != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isResolvedHorizontally()
  {
    boolean bool;
    if ((!resolvedHorizontal) && ((!mLeft.hasFinalValue()) || (!mRight.hasFinalValue()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isResolvedVertically()
  {
    boolean bool;
    if ((!resolvedVertical) && ((!mTop.hasFinalValue()) || (!mBottom.hasFinalValue()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isRoot()
  {
    boolean bool;
    if (mParent == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSpreadHeight()
  {
    int i = mMatchConstraintDefaultHeight;
    boolean bool = true;
    if ((i != 0) || (mDimensionRatio != 0.0F) || (mMatchConstraintMinHeight != 0) || (mMatchConstraintMaxHeight != 0) || (mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT)) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSpreadWidth()
  {
    int i = mMatchConstraintDefaultWidth;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i == 0)
    {
      bool2 = bool1;
      if (mDimensionRatio == 0.0F)
      {
        bool2 = bool1;
        if (mMatchConstraintMinWidth == 0)
        {
          bool2 = bool1;
          if (mMatchConstraintMaxWidth == 0)
          {
            bool2 = bool1;
            if (mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public boolean isVerticalSolvingPassDone()
  {
    return verticalSolvingPass;
  }
  
  public boolean isWidthWrapContent()
  {
    return mIsWidthWrapContent;
  }
  
  public void markHorizontalSolvingPassDone()
  {
    horizontalSolvingPass = true;
  }
  
  public void markVerticalSolvingPassDone()
  {
    verticalSolvingPass = true;
  }
  
  public boolean oppositeDimensionDependsOn(int paramInt)
  {
    boolean bool = true;
    int i;
    if (paramInt == 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1 = mListDimensionBehaviors;
    Object localObject2 = localObject1[paramInt];
    Object localObject3 = localObject1[i];
    localObject1 = DimensionBehaviour.MATCH_CONSTRAINT;
    if ((localObject2 != localObject1) || (localObject3 != localObject1)) {
      bool = false;
    }
    return bool;
  }
  
  public boolean oppositeDimensionsTied()
  {
    DimensionBehaviour[] arrayOfDimensionBehaviour = mListDimensionBehaviors;
    boolean bool1 = false;
    DimensionBehaviour localDimensionBehaviour1 = arrayOfDimensionBehaviour[0];
    DimensionBehaviour localDimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
    boolean bool2 = bool1;
    if (localDimensionBehaviour1 == localDimensionBehaviour2)
    {
      bool2 = bool1;
      if (arrayOfDimensionBehaviour[1] == localDimensionBehaviour2) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void reset()
  {
    mLeft.reset();
    mTop.reset();
    mRight.reset();
    mBottom.reset();
    mBaseline.reset();
    mCenterX.reset();
    mCenterY.reset();
    mCenter.reset();
    mParent = null;
    mCircleConstraintAngle = 0.0F;
    mWidth = 0;
    mHeight = 0;
    mDimensionRatio = 0.0F;
    mDimensionRatioSide = -1;
    mX = 0;
    mY = 0;
    mOffsetX = 0;
    mOffsetY = 0;
    mBaselineDistance = 0;
    mMinWidth = 0;
    mMinHeight = 0;
    float f = DEFAULT_BIAS;
    mHorizontalBiasPercent = f;
    mVerticalBiasPercent = f;
    DimensionBehaviour[] arrayOfDimensionBehaviour = mListDimensionBehaviors;
    Object localObject = DimensionBehaviour.FIXED;
    arrayOfDimensionBehaviour[0] = localObject;
    arrayOfDimensionBehaviour[1] = localObject;
    mCompanionWidget = null;
    mContainerItemSkip = 0;
    mVisibility = 0;
    mType = null;
    mHorizontalWrapVisited = false;
    mVerticalWrapVisited = false;
    mHorizontalChainStyle = 0;
    mVerticalChainStyle = 0;
    mHorizontalChainFixedPosition = false;
    mVerticalChainFixedPosition = false;
    localObject = mWeight;
    localObject[0] = -1.0F;
    localObject[1] = -1.0F;
    mHorizontalResolution = -1;
    mVerticalResolution = -1;
    localObject = mMaxDimension;
    localObject[0] = Integer.MAX_VALUE;
    localObject[1] = Integer.MAX_VALUE;
    mMatchConstraintDefaultWidth = 0;
    mMatchConstraintDefaultHeight = 0;
    mMatchConstraintPercentWidth = 1.0F;
    mMatchConstraintPercentHeight = 1.0F;
    mMatchConstraintMaxWidth = Integer.MAX_VALUE;
    mMatchConstraintMaxHeight = Integer.MAX_VALUE;
    mMatchConstraintMinWidth = 0;
    mMatchConstraintMinHeight = 0;
    mResolvedHasRatio = false;
    mResolvedDimensionRatioSide = -1;
    mResolvedDimensionRatio = 1.0F;
    mGroupsToSolver = false;
    localObject = isTerminalWidget;
    localObject[0] = 1;
    localObject[1] = 1;
    mInVirtualLayout = false;
    localObject = mIsInBarrier;
    localObject[0] = 0;
    localObject[1] = 0;
    mMeasureRequested = true;
    localObject = mResolvedMatchConstraintDefault;
    localObject[0] = 0;
    localObject[1] = 0;
    mWidthOverride = -1;
    mHeightOverride = -1;
  }
  
  public void resetAllConstraints()
  {
    resetAnchors();
    setVerticalBiasPercent(DEFAULT_BIAS);
    setHorizontalBiasPercent(DEFAULT_BIAS);
  }
  
  public void resetAnchor(ConstraintAnchor paramConstraintAnchor)
  {
    if ((getParent() != null) && ((getParent() instanceof ConstraintWidgetContainer)) && (((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())) {
      return;
    }
    ConstraintAnchor localConstraintAnchor1 = getAnchor(ConstraintAnchor.Type.LEFT);
    ConstraintAnchor localConstraintAnchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
    ConstraintAnchor localConstraintAnchor3 = getAnchor(ConstraintAnchor.Type.TOP);
    ConstraintAnchor localConstraintAnchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
    ConstraintAnchor localConstraintAnchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
    ConstraintAnchor localConstraintAnchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
    ConstraintAnchor localConstraintAnchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
    if (paramConstraintAnchor == localConstraintAnchor5)
    {
      if ((localConstraintAnchor1.isConnected()) && (localConstraintAnchor2.isConnected()) && (localConstraintAnchor1.getTarget() == localConstraintAnchor2.getTarget()))
      {
        localConstraintAnchor1.reset();
        localConstraintAnchor2.reset();
      }
      if ((localConstraintAnchor3.isConnected()) && (localConstraintAnchor4.isConnected()) && (localConstraintAnchor3.getTarget() == localConstraintAnchor4.getTarget()))
      {
        localConstraintAnchor3.reset();
        localConstraintAnchor4.reset();
      }
      mHorizontalBiasPercent = 0.5F;
      mVerticalBiasPercent = 0.5F;
    }
    else if (paramConstraintAnchor == localConstraintAnchor6)
    {
      if ((localConstraintAnchor1.isConnected()) && (localConstraintAnchor2.isConnected()) && (localConstraintAnchor1.getTarget().getOwner() == localConstraintAnchor2.getTarget().getOwner()))
      {
        localConstraintAnchor1.reset();
        localConstraintAnchor2.reset();
      }
      mHorizontalBiasPercent = 0.5F;
    }
    else if (paramConstraintAnchor == localConstraintAnchor7)
    {
      if ((localConstraintAnchor3.isConnected()) && (localConstraintAnchor4.isConnected()) && (localConstraintAnchor3.getTarget().getOwner() == localConstraintAnchor4.getTarget().getOwner()))
      {
        localConstraintAnchor3.reset();
        localConstraintAnchor4.reset();
      }
      mVerticalBiasPercent = 0.5F;
    }
    else if ((paramConstraintAnchor != localConstraintAnchor1) && (paramConstraintAnchor != localConstraintAnchor2))
    {
      if (((paramConstraintAnchor == localConstraintAnchor3) || (paramConstraintAnchor == localConstraintAnchor4)) && (localConstraintAnchor3.isConnected()) && (localConstraintAnchor3.getTarget() == localConstraintAnchor4.getTarget())) {
        localConstraintAnchor5.reset();
      }
    }
    else if ((localConstraintAnchor1.isConnected()) && (localConstraintAnchor1.getTarget() == localConstraintAnchor2.getTarget()))
    {
      localConstraintAnchor5.reset();
    }
    paramConstraintAnchor.reset();
  }
  
  public void resetAnchors()
  {
    ConstraintWidget localConstraintWidget = getParent();
    if ((localConstraintWidget != null) && ((localConstraintWidget instanceof ConstraintWidgetContainer)) && (((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())) {
      return;
    }
    int i = 0;
    int j = mAnchors.size();
    while (i < j)
    {
      ((ConstraintAnchor)mAnchors.get(i)).reset();
      i++;
    }
  }
  
  public void resetFinalResolution()
  {
    int i = 0;
    resolvedHorizontal = false;
    resolvedVertical = false;
    horizontalSolvingPass = false;
    verticalSolvingPass = false;
    int j = mAnchors.size();
    while (i < j)
    {
      ((ConstraintAnchor)mAnchors.get(i)).resetFinalResolution();
      i++;
    }
  }
  
  public void resetSolverVariables(Cache paramCache)
  {
    mLeft.resetSolverVariable(paramCache);
    mTop.resetSolverVariable(paramCache);
    mRight.resetSolverVariable(paramCache);
    mBottom.resetSolverVariable(paramCache);
    mBaseline.resetSolverVariable(paramCache);
    mCenter.resetSolverVariable(paramCache);
    mCenterX.resetSolverVariable(paramCache);
    mCenterY.resetSolverVariable(paramCache);
  }
  
  public void resetSolvingPassFlag()
  {
    horizontalSolvingPass = false;
    verticalSolvingPass = false;
  }
  
  public StringBuilder serialize(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("{\n");
    serializeAnchor(paramStringBuilder, "left", mLeft);
    serializeAnchor(paramStringBuilder, "top", mTop);
    serializeAnchor(paramStringBuilder, "right", mRight);
    serializeAnchor(paramStringBuilder, "bottom", mBottom);
    serializeAnchor(paramStringBuilder, "baseline", mBaseline);
    serializeAnchor(paramStringBuilder, "centerX", mCenterX);
    serializeAnchor(paramStringBuilder, "centerY", mCenterY);
    serializeCircle(paramStringBuilder, mCenter, mCircleConstraintAngle);
    serializeSize(paramStringBuilder, "width", mWidth, mMinWidth, mMaxDimension[0], mWidthOverride, mMatchConstraintMinWidth, mMatchConstraintDefaultWidth, mMatchConstraintPercentWidth, mWeight[0]);
    serializeSize(paramStringBuilder, "height", mHeight, mMinHeight, mMaxDimension[1], mHeightOverride, mMatchConstraintMinHeight, mMatchConstraintDefaultHeight, mMatchConstraintPercentHeight, mWeight[1]);
    serializeDimensionRatio(paramStringBuilder, "dimensionRatio", mDimensionRatio, mDimensionRatioSide);
    serializeAttribute(paramStringBuilder, "horizontalBias", mHorizontalBiasPercent, DEFAULT_BIAS);
    serializeAttribute(paramStringBuilder, "verticalBias", mVerticalBiasPercent, DEFAULT_BIAS);
    paramStringBuilder.append("}\n");
    return paramStringBuilder;
  }
  
  public void setAnimated(boolean paramBoolean)
  {
    mAnimated = paramBoolean;
  }
  
  public void setBaselineDistance(int paramInt)
  {
    mBaselineDistance = paramInt;
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    hasBaseline = bool;
  }
  
  public void setCompanionWidget(Object paramObject)
  {
    mCompanionWidget = paramObject;
  }
  
  public void setContainerItemSkip(int paramInt)
  {
    if (paramInt >= 0) {
      mContainerItemSkip = paramInt;
    } else {
      mContainerItemSkip = 0;
    }
  }
  
  public void setDebugName(String paramString)
  {
    mDebugName = paramString;
  }
  
  public void setDebugSolverName(LinearSystem paramLinearSystem, String paramString)
  {
    mDebugName = paramString;
    SolverVariable localSolverVariable = paramLinearSystem.createObjectVariable(mLeft);
    Object localObject1 = paramLinearSystem.createObjectVariable(mTop);
    Object localObject2 = paramLinearSystem.createObjectVariable(mRight);
    Object localObject3 = paramLinearSystem.createObjectVariable(mBottom);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(".left");
    localSolverVariable.setName(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(".top");
    ((SolverVariable)localObject1).setName(localStringBuilder.toString());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(".right");
    ((SolverVariable)localObject2).setName(((StringBuilder)localObject1).toString());
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(paramString);
    ((StringBuilder)localObject2).append(".bottom");
    ((SolverVariable)localObject3).setName(((StringBuilder)localObject2).toString());
    paramLinearSystem = paramLinearSystem.createObjectVariable(mBaseline);
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append(paramString);
    ((StringBuilder)localObject3).append(".baseline");
    paramLinearSystem.setName(((StringBuilder)localObject3).toString());
  }
  
  public void setDimension(int paramInt1, int paramInt2)
  {
    mWidth = paramInt1;
    int i = mMinWidth;
    if (paramInt1 < i) {
      mWidth = i;
    }
    mHeight = paramInt2;
    paramInt1 = mMinHeight;
    if (paramInt2 < paramInt1) {
      mHeight = paramInt1;
    }
  }
  
  public void setDimensionRatio(float paramFloat, int paramInt)
  {
    mDimensionRatio = paramFloat;
    mDimensionRatioSide = paramInt;
  }
  
  public void setDimensionRatio(String paramString)
  {
    int n;
    int i1;
    String str;
    if ((paramString != null) && (paramString.length() != 0))
    {
      int i = -1;
      int j = paramString.length();
      int k = paramString.indexOf(',');
      int m = 0;
      n = i;
      i1 = m;
      if (k > 0)
      {
        n = i;
        i1 = m;
        if (k < j - 1)
        {
          str = paramString.substring(0, k);
          if (str.equalsIgnoreCase("W"))
          {
            n = 0;
          }
          else
          {
            n = i;
            if (str.equalsIgnoreCase("H")) {
              n = 1;
            }
          }
          i1 = k + 1;
        }
      }
      i = paramString.indexOf(':');
      if ((i >= 0) && (i < j - 1))
      {
        str = paramString.substring(i1, i);
        paramString = paramString.substring(i + 1);
        if ((str.length() <= 0) || (paramString.length() <= 0)) {
          break label240;
        }
      }
    }
    try
    {
      float f1 = Float.parseFloat(str);
      f2 = Float.parseFloat(paramString);
      if ((f1 <= 0.0F) || (f2 <= 0.0F)) {
        break label240;
      }
      if (n == 1) {
        f2 = Math.abs(f2 / f1);
      } else {
        f2 = Math.abs(f1 / f2);
      }
    }
    catch (NumberFormatException paramString)
    {
      float f2;
      for (;;) {}
    }
    paramString = paramString.substring(i1);
    if (paramString.length() > 0) {
      f2 = Float.parseFloat(paramString);
    } else {
      label240:
      f2 = 0.0F;
    }
    if (f2 > 0.0F)
    {
      mDimensionRatio = f2;
      mDimensionRatioSide = n;
    }
    return;
    mDimensionRatio = 0.0F;
  }
  
  public void setFinalBaseline(int paramInt)
  {
    if (!hasBaseline) {
      return;
    }
    int i = paramInt - mBaselineDistance;
    int j = mHeight;
    mY = i;
    mTop.setFinalValue(i);
    mBottom.setFinalValue(j + i);
    mBaseline.setFinalValue(paramInt);
    resolvedVertical = true;
  }
  
  public void setFinalFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    setBaselineDistance(paramInt5);
    if (paramInt6 == 0)
    {
      resolvedHorizontal = true;
      resolvedVertical = false;
    }
    else if (paramInt6 == 1)
    {
      resolvedHorizontal = false;
      resolvedVertical = true;
    }
    else if (paramInt6 == 2)
    {
      resolvedHorizontal = true;
      resolvedVertical = true;
    }
    else
    {
      resolvedHorizontal = false;
      resolvedVertical = false;
    }
  }
  
  public void setFinalHorizontal(int paramInt1, int paramInt2)
  {
    if (resolvedHorizontal) {
      return;
    }
    mLeft.setFinalValue(paramInt1);
    mRight.setFinalValue(paramInt2);
    mX = paramInt1;
    mWidth = (paramInt2 - paramInt1);
    resolvedHorizontal = true;
  }
  
  public void setFinalLeft(int paramInt)
  {
    mLeft.setFinalValue(paramInt);
    mX = paramInt;
  }
  
  public void setFinalTop(int paramInt)
  {
    mTop.setFinalValue(paramInt);
    mY = paramInt;
  }
  
  public void setFinalVertical(int paramInt1, int paramInt2)
  {
    if (resolvedVertical) {
      return;
    }
    mTop.setFinalValue(paramInt1);
    mBottom.setFinalValue(paramInt2);
    mY = paramInt1;
    mHeight = (paramInt2 - paramInt1);
    if (hasBaseline) {
      mBaseline.setFinalValue(paramInt1 + mBaselineDistance);
    }
    resolvedVertical = true;
  }
  
  public void setFrame(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 == 0) {
      setHorizontalDimension(paramInt1, paramInt2);
    } else if (paramInt3 == 1) {
      setVerticalDimension(paramInt1, paramInt2);
    }
  }
  
  public void setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2;
    mX = paramInt1;
    mY = paramInt2;
    if (mVisibility == 8)
    {
      mWidth = 0;
      mHeight = 0;
      return;
    }
    DimensionBehaviour[] arrayOfDimensionBehaviour = mListDimensionBehaviors;
    DimensionBehaviour localDimensionBehaviour1 = arrayOfDimensionBehaviour[0];
    DimensionBehaviour localDimensionBehaviour2 = DimensionBehaviour.FIXED;
    paramInt1 = i;
    if (localDimensionBehaviour1 == localDimensionBehaviour2)
    {
      paramInt2 = mWidth;
      paramInt1 = i;
      if (i < paramInt2) {
        paramInt1 = paramInt2;
      }
    }
    paramInt2 = paramInt3;
    if (arrayOfDimensionBehaviour[1] == localDimensionBehaviour2)
    {
      paramInt4 = mHeight;
      paramInt2 = paramInt3;
      if (paramInt3 < paramInt4) {
        paramInt2 = paramInt4;
      }
    }
    mWidth = paramInt1;
    mHeight = paramInt2;
    paramInt3 = mMinHeight;
    if (paramInt2 < paramInt3) {
      mHeight = paramInt3;
    }
    paramInt3 = mMinWidth;
    if (paramInt1 < paramInt3) {
      mWidth = paramInt3;
    }
    paramInt3 = mMatchConstraintMaxWidth;
    if ((paramInt3 > 0) && (localDimensionBehaviour1 == DimensionBehaviour.MATCH_CONSTRAINT)) {
      mWidth = Math.min(mWidth, paramInt3);
    }
    paramInt3 = mMatchConstraintMaxHeight;
    if ((paramInt3 > 0) && (mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT)) {
      mHeight = Math.min(mHeight, paramInt3);
    }
    paramInt3 = mWidth;
    if (paramInt1 != paramInt3) {
      mWidthOverride = paramInt3;
    }
    paramInt1 = mHeight;
    if (paramInt2 != paramInt1) {
      mHeightOverride = paramInt1;
    }
  }
  
  public void setGoneMargin(ConstraintAnchor.Type paramType, int paramInt)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[paramType.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5) {
              mBaseline.mGoneMargin = paramInt;
            }
          }
          else {
            mBottom.mGoneMargin = paramInt;
          }
        }
        else {
          mRight.mGoneMargin = paramInt;
        }
      }
      else {
        mTop.mGoneMargin = paramInt;
      }
    }
    else {
      mLeft.mGoneMargin = paramInt;
    }
  }
  
  public void setHasBaseline(boolean paramBoolean)
  {
    hasBaseline = paramBoolean;
  }
  
  public void setHeight(int paramInt)
  {
    mHeight = paramInt;
    int i = mMinHeight;
    if (paramInt < i) {
      mHeight = i;
    }
  }
  
  public void setHeightWrapContent(boolean paramBoolean)
  {
    mIsHeightWrapContent = paramBoolean;
  }
  
  public void setHorizontalBiasPercent(float paramFloat)
  {
    mHorizontalBiasPercent = paramFloat;
  }
  
  public void setHorizontalChainStyle(int paramInt)
  {
    mHorizontalChainStyle = paramInt;
  }
  
  public void setHorizontalDimension(int paramInt1, int paramInt2)
  {
    mX = paramInt1;
    paramInt2 -= paramInt1;
    mWidth = paramInt2;
    paramInt1 = mMinWidth;
    if (paramInt2 < paramInt1) {
      mWidth = paramInt1;
    }
  }
  
  public void setHorizontalDimensionBehaviour(DimensionBehaviour paramDimensionBehaviour)
  {
    mListDimensionBehaviors[0] = paramDimensionBehaviour;
  }
  
  public void setHorizontalMatchStyle(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    mMatchConstraintDefaultWidth = paramInt1;
    mMatchConstraintMinWidth = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE) {
      paramInt2 = 0;
    }
    mMatchConstraintMaxWidth = paramInt2;
    mMatchConstraintPercentWidth = paramFloat;
    if ((paramFloat > 0.0F) && (paramFloat < 1.0F) && (paramInt1 == 0)) {
      mMatchConstraintDefaultWidth = 2;
    }
  }
  
  public void setHorizontalWeight(float paramFloat)
  {
    mWeight[0] = paramFloat;
  }
  
  public void setInBarrier(int paramInt, boolean paramBoolean)
  {
    mIsInBarrier[paramInt] = paramBoolean;
  }
  
  public void setInPlaceholder(boolean paramBoolean)
  {
    inPlaceholder = paramBoolean;
  }
  
  public void setInVirtualLayout(boolean paramBoolean)
  {
    mInVirtualLayout = paramBoolean;
  }
  
  public void setLastMeasureSpec(int paramInt1, int paramInt2)
  {
    mLastHorizontalMeasureSpec = paramInt1;
    mLastVerticalMeasureSpec = paramInt2;
    setMeasureRequested(false);
  }
  
  public void setLength(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      setWidth(paramInt1);
    } else if (paramInt2 == 1) {
      setHeight(paramInt1);
    }
  }
  
  public void setMaxHeight(int paramInt)
  {
    mMaxDimension[1] = paramInt;
  }
  
  public void setMaxWidth(int paramInt)
  {
    mMaxDimension[0] = paramInt;
  }
  
  public void setMeasureRequested(boolean paramBoolean)
  {
    mMeasureRequested = paramBoolean;
  }
  
  public void setMinHeight(int paramInt)
  {
    if (paramInt < 0) {
      mMinHeight = 0;
    } else {
      mMinHeight = paramInt;
    }
  }
  
  public void setMinWidth(int paramInt)
  {
    if (paramInt < 0) {
      mMinWidth = 0;
    } else {
      mMinWidth = paramInt;
    }
  }
  
  public void setOffset(int paramInt1, int paramInt2)
  {
    mOffsetX = paramInt1;
    mOffsetY = paramInt2;
  }
  
  public void setOrigin(int paramInt1, int paramInt2)
  {
    mX = paramInt1;
    mY = paramInt2;
  }
  
  public void setParent(ConstraintWidget paramConstraintWidget)
  {
    mParent = paramConstraintWidget;
  }
  
  public void setRelativePositioning(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      mRelX = paramInt1;
    } else if (paramInt2 == 1) {
      mRelY = paramInt1;
    }
  }
  
  public void setType(String paramString)
  {
    mType = paramString;
  }
  
  public void setVerticalBiasPercent(float paramFloat)
  {
    mVerticalBiasPercent = paramFloat;
  }
  
  public void setVerticalChainStyle(int paramInt)
  {
    mVerticalChainStyle = paramInt;
  }
  
  public void setVerticalDimension(int paramInt1, int paramInt2)
  {
    mY = paramInt1;
    paramInt2 -= paramInt1;
    mHeight = paramInt2;
    paramInt1 = mMinHeight;
    if (paramInt2 < paramInt1) {
      mHeight = paramInt1;
    }
  }
  
  public void setVerticalDimensionBehaviour(DimensionBehaviour paramDimensionBehaviour)
  {
    mListDimensionBehaviors[1] = paramDimensionBehaviour;
  }
  
  public void setVerticalMatchStyle(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    mMatchConstraintDefaultHeight = paramInt1;
    mMatchConstraintMinHeight = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE) {
      paramInt2 = 0;
    }
    mMatchConstraintMaxHeight = paramInt2;
    mMatchConstraintPercentHeight = paramFloat;
    if ((paramFloat > 0.0F) && (paramFloat < 1.0F) && (paramInt1 == 0)) {
      mMatchConstraintDefaultHeight = 2;
    }
  }
  
  public void setVerticalWeight(float paramFloat)
  {
    mWeight[1] = paramFloat;
  }
  
  public void setVisibility(int paramInt)
  {
    mVisibility = paramInt;
  }
  
  public void setWidth(int paramInt)
  {
    mWidth = paramInt;
    int i = mMinWidth;
    if (paramInt < i) {
      mWidth = i;
    }
  }
  
  public void setWidthWrapContent(boolean paramBoolean)
  {
    mIsWidthWrapContent = paramBoolean;
  }
  
  public void setWrapBehaviorInParent(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 3)) {
      mWrapBehaviorInParent = paramInt;
    }
  }
  
  public void setX(int paramInt)
  {
    mX = paramInt;
  }
  
  public void setY(int paramInt)
  {
    mY = paramInt;
  }
  
  public void setupDimensionRatio(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if (mResolvedDimensionRatioSide == -1) {
      if ((paramBoolean3) && (!paramBoolean4))
      {
        mResolvedDimensionRatioSide = 0;
      }
      else if ((!paramBoolean3) && (paramBoolean4))
      {
        mResolvedDimensionRatioSide = 1;
        if (mDimensionRatioSide == -1) {
          mResolvedDimensionRatio = (1.0F / mResolvedDimensionRatio);
        }
      }
    }
    if ((mResolvedDimensionRatioSide == 0) && ((!mTop.isConnected()) || (!mBottom.isConnected()))) {
      mResolvedDimensionRatioSide = 1;
    } else if ((mResolvedDimensionRatioSide == 1) && ((!mLeft.isConnected()) || (!mRight.isConnected()))) {
      mResolvedDimensionRatioSide = 0;
    }
    if ((mResolvedDimensionRatioSide == -1) && ((!mTop.isConnected()) || (!mBottom.isConnected()) || (!mLeft.isConnected()) || (!mRight.isConnected()))) {
      if ((mTop.isConnected()) && (mBottom.isConnected()))
      {
        mResolvedDimensionRatioSide = 0;
      }
      else if ((mLeft.isConnected()) && (mRight.isConnected()))
      {
        mResolvedDimensionRatio = (1.0F / mResolvedDimensionRatio);
        mResolvedDimensionRatioSide = 1;
      }
    }
    if (mResolvedDimensionRatioSide == -1)
    {
      int i = mMatchConstraintMinWidth;
      if ((i > 0) && (mMatchConstraintMinHeight == 0))
      {
        mResolvedDimensionRatioSide = 0;
      }
      else if ((i == 0) && (mMatchConstraintMinHeight > 0))
      {
        mResolvedDimensionRatio = (1.0F / mResolvedDimensionRatio);
        mResolvedDimensionRatioSide = 1;
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = mType;
    String str = "";
    if (localObject != null) {
      localObject = z2.s(z2.t("type: "), mType, " ");
    } else {
      localObject = "";
    }
    localStringBuilder.append((String)localObject);
    localObject = str;
    if (mDebugName != null) {
      localObject = z2.s(z2.t("id: "), mDebugName, " ");
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("(");
    localStringBuilder.append(mX);
    localStringBuilder.append(", ");
    localStringBuilder.append(mY);
    localStringBuilder.append(") - (");
    localStringBuilder.append(mWidth);
    localStringBuilder.append(" x ");
    return z2.q(localStringBuilder, mHeight, ")");
  }
  
  public void updateFromRuns(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = paramBoolean1 & horizontalRun.isResolved();
    boolean bool2 = paramBoolean2 & verticalRun.isResolved();
    HorizontalWidgetRun localHorizontalWidgetRun = horizontalRun;
    int i = start.value;
    VerticalWidgetRun localVerticalWidgetRun = verticalRun;
    int j = start.value;
    int k = end.value;
    int m = end.value;
    int n;
    if ((k - i >= 0) && (m - j >= 0) && (i != Integer.MIN_VALUE) && (i != Integer.MAX_VALUE) && (j != Integer.MIN_VALUE) && (j != Integer.MAX_VALUE) && (k != Integer.MIN_VALUE) && (k != Integer.MAX_VALUE) && (m != Integer.MIN_VALUE))
    {
      n = m;
      if (m != Integer.MAX_VALUE) {}
    }
    else
    {
      k = 0;
      i = k;
      n = i;
      j = n;
    }
    k -= i;
    n -= j;
    if (bool1) {
      mX = i;
    }
    if (bool2) {
      mY = j;
    }
    if (mVisibility == 8)
    {
      mWidth = 0;
      mHeight = 0;
      return;
    }
    if (bool1)
    {
      i = k;
      if (mListDimensionBehaviors[0] == DimensionBehaviour.FIXED)
      {
        j = mWidth;
        i = k;
        if (k < j) {
          i = j;
        }
      }
      mWidth = i;
      j = mMinWidth;
      if (i < j) {
        mWidth = j;
      }
    }
    if (bool2)
    {
      i = n;
      if (mListDimensionBehaviors[1] == DimensionBehaviour.FIXED)
      {
        j = mHeight;
        i = n;
        if (n < j) {
          i = j;
        }
      }
      mHeight = i;
      n = mMinHeight;
      if (i < n) {
        mHeight = n;
      }
    }
  }
  
  public void updateFromSolver(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    int i = paramLinearSystem.getObjectVariableValue(mLeft);
    int j = paramLinearSystem.getObjectVariableValue(mTop);
    int k = paramLinearSystem.getObjectVariableValue(mRight);
    int m = paramLinearSystem.getObjectVariableValue(mBottom);
    int n = i;
    int i1 = k;
    Object localObject;
    if (paramBoolean)
    {
      localObject = horizontalRun;
      n = i;
      i1 = k;
      if (localObject != null)
      {
        paramLinearSystem = start;
        n = i;
        i1 = k;
        if (resolved)
        {
          localObject = end;
          n = i;
          i1 = k;
          if (resolved)
          {
            n = value;
            i1 = value;
          }
        }
      }
    }
    k = j;
    i = m;
    if (paramBoolean)
    {
      localObject = verticalRun;
      k = j;
      i = m;
      if (localObject != null)
      {
        paramLinearSystem = start;
        k = j;
        i = m;
        if (resolved)
        {
          localObject = end;
          k = j;
          i = m;
          if (resolved)
          {
            k = value;
            i = value;
          }
        }
      }
    }
    if ((i1 - n >= 0) && (i - k >= 0) && (n != Integer.MIN_VALUE) && (n != Integer.MAX_VALUE) && (k != Integer.MIN_VALUE) && (k != Integer.MAX_VALUE) && (i1 != Integer.MIN_VALUE) && (i1 != Integer.MAX_VALUE) && (i != Integer.MIN_VALUE))
    {
      m = n;
      j = k;
      k = i1;
      n = i;
      if (i != Integer.MAX_VALUE) {}
    }
    else
    {
      n = 0;
      i1 = n;
      i = i1;
      k = i;
      j = i;
      m = i1;
    }
    setFrame(m, j, k, n);
  }
  
  public static enum DimensionBehaviour
  {
    static
    {
      DimensionBehaviour localDimensionBehaviour1 = new DimensionBehaviour("FIXED", 0);
      FIXED = localDimensionBehaviour1;
      DimensionBehaviour localDimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
      WRAP_CONTENT = localDimensionBehaviour2;
      DimensionBehaviour localDimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
      MATCH_CONSTRAINT = localDimensionBehaviour3;
      DimensionBehaviour localDimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
      MATCH_PARENT = localDimensionBehaviour4;
      $VALUES = new DimensionBehaviour[] { localDimensionBehaviour1, localDimensionBehaviour2, localDimensionBehaviour3, localDimensionBehaviour4 };
    }
    
    private DimensionBehaviour() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.ConstraintWidget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */