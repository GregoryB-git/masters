package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import z2;

public class ConstraintProperties
{
  public static final int BASELINE = 5;
  public static final int BOTTOM = 4;
  public static final int END = 7;
  public static final int LEFT = 1;
  public static final int MATCH_CONSTRAINT = 0;
  public static final int MATCH_CONSTRAINT_SPREAD = 0;
  public static final int MATCH_CONSTRAINT_WRAP = 1;
  public static final int PARENT_ID = 0;
  public static final int RIGHT = 2;
  public static final int START = 6;
  public static final int TOP = 3;
  public static final int UNSET = -1;
  public static final int WRAP_CONTENT = -2;
  public ConstraintLayout.LayoutParams mParams;
  public View mView;
  
  public ConstraintProperties(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams instanceof ConstraintLayout.LayoutParams))
    {
      mParams = ((ConstraintLayout.LayoutParams)localLayoutParams);
      mView = paramView;
      return;
    }
    throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
  }
  
  private String sideToString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "undefined";
    case 7: 
      return "end";
    case 6: 
      return "start";
    case 5: 
      return "baseline";
    case 4: 
      return "bottom";
    case 3: 
      return "top";
    case 2: 
      return "right";
    }
    return "left";
  }
  
  public ConstraintProperties addToHorizontalChain(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 == 0) {
      i = 1;
    } else {
      i = 2;
    }
    connect(1, paramInt1, i, 0);
    if (paramInt2 == 0) {
      i = 2;
    } else {
      i = 1;
    }
    connect(2, paramInt2, i, 0);
    if (paramInt1 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt1)).connect(2, mView.getId(), 1, 0);
    }
    if (paramInt2 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt2)).connect(1, mView.getId(), 2, 0);
    }
    return this;
  }
  
  public ConstraintProperties addToHorizontalChainRTL(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 == 0) {
      i = 6;
    } else {
      i = 7;
    }
    connect(6, paramInt1, i, 0);
    if (paramInt2 == 0) {
      i = 7;
    } else {
      i = 6;
    }
    connect(7, paramInt2, i, 0);
    if (paramInt1 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt1)).connect(7, mView.getId(), 6, 0);
    }
    if (paramInt2 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt2)).connect(6, mView.getId(), 7, 0);
    }
    return this;
  }
  
  public ConstraintProperties addToVerticalChain(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 == 0) {
      i = 3;
    } else {
      i = 4;
    }
    connect(3, paramInt1, i, 0);
    if (paramInt2 == 0) {
      i = 4;
    } else {
      i = 3;
    }
    connect(4, paramInt2, i, 0);
    if (paramInt1 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt1)).connect(4, mView.getId(), 3, 0);
    }
    if (paramInt2 != 0) {
      new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(paramInt2)).connect(3, mView.getId(), 4, 0);
    }
    return this;
  }
  
  public ConstraintProperties alpha(float paramFloat)
  {
    mView.setAlpha(paramFloat);
    return this;
  }
  
  public void apply() {}
  
  public ConstraintProperties center(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat)
  {
    if (paramInt3 >= 0)
    {
      if (paramInt6 >= 0)
      {
        if ((paramFloat > 0.0F) && (paramFloat <= 1.0F))
        {
          if ((paramInt2 != 1) && (paramInt2 != 2))
          {
            if ((paramInt2 != 6) && (paramInt2 != 7))
            {
              connect(3, paramInt1, paramInt2, paramInt3);
              connect(4, paramInt4, paramInt5, paramInt6);
              mParams.verticalBias = paramFloat;
            }
            else
            {
              connect(6, paramInt1, paramInt2, paramInt3);
              connect(7, paramInt4, paramInt5, paramInt6);
              mParams.horizontalBias = paramFloat;
            }
          }
          else
          {
            connect(1, paramInt1, paramInt2, paramInt3);
            connect(2, paramInt4, paramInt5, paramInt6);
            mParams.horizontalBias = paramFloat;
          }
          return this;
        }
        throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
      }
      throw new IllegalArgumentException("margin must be > 0");
    }
    throw new IllegalArgumentException("margin must be > 0");
  }
  
  public ConstraintProperties centerHorizontally(int paramInt)
  {
    if (paramInt == 0) {
      center(0, 1, 0, 0, 2, 0, 0.5F);
    } else {
      center(paramInt, 2, 0, paramInt, 1, 0, 0.5F);
    }
    return this;
  }
  
  public ConstraintProperties centerHorizontally(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat)
  {
    connect(1, paramInt1, paramInt2, paramInt3);
    connect(2, paramInt4, paramInt5, paramInt6);
    mParams.horizontalBias = paramFloat;
    return this;
  }
  
  public ConstraintProperties centerHorizontallyRtl(int paramInt)
  {
    if (paramInt == 0) {
      center(0, 6, 0, 0, 7, 0, 0.5F);
    } else {
      center(paramInt, 7, 0, paramInt, 6, 0, 0.5F);
    }
    return this;
  }
  
  public ConstraintProperties centerHorizontallyRtl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat)
  {
    connect(6, paramInt1, paramInt2, paramInt3);
    connect(7, paramInt4, paramInt5, paramInt6);
    mParams.horizontalBias = paramFloat;
    return this;
  }
  
  public ConstraintProperties centerVertically(int paramInt)
  {
    if (paramInt == 0) {
      center(0, 3, 0, 0, 4, 0, 0.5F);
    } else {
      center(paramInt, 4, 0, paramInt, 3, 0, 0.5F);
    }
    return this;
  }
  
  public ConstraintProperties centerVertically(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat)
  {
    connect(3, paramInt1, paramInt2, paramInt3);
    connect(4, paramInt4, paramInt5, paramInt6);
    mParams.verticalBias = paramFloat;
    return this;
  }
  
  public ConstraintProperties connect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(sideToString(paramInt1));
      ((StringBuilder)localObject).append(" to ");
      throw new IllegalArgumentException(z2.s((StringBuilder)localObject, sideToString(paramInt3), " unknown"));
    case 7: 
      if (paramInt3 == 7)
      {
        localObject = mParams;
        endToEnd = paramInt2;
        endToStart = -1;
      }
      else
      {
        if (paramInt3 != 6) {
          break label155;
        }
        localObject = mParams;
        endToStart = paramInt2;
        endToEnd = -1;
      }
      mParams.setMarginEnd(paramInt4);
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 6: 
      if (paramInt3 == 6)
      {
        localObject = mParams;
        startToStart = paramInt2;
        startToEnd = -1;
      }
      else
      {
        if (paramInt3 != 7) {
          break label241;
        }
        localObject = mParams;
        startToEnd = paramInt2;
        startToStart = -1;
      }
      mParams.setMarginStart(paramInt4);
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 5: 
      if (paramInt3 == 5)
      {
        localObject = mParams;
        baselineToBaseline = paramInt2;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      if (paramInt3 == 3)
      {
        localObject = mParams;
        baselineToTop = paramInt2;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      else
      {
        if (paramInt3 != 4) {
          break label402;
        }
        localObject = mParams;
        baselineToBottom = paramInt2;
        bottomToBottom = -1;
        bottomToTop = -1;
        topToTop = -1;
        topToBottom = -1;
      }
      mParams.baselineMargin = paramInt4;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 4: 
      if (paramInt3 == 4)
      {
        localObject = mParams;
        bottomToBottom = paramInt2;
        bottomToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        if (paramInt3 != 3) {
          break label522;
        }
        localObject = mParams;
        bottomToTop = paramInt2;
        bottomToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      mParams.bottomMargin = paramInt4;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 3: 
      if (paramInt3 == 3)
      {
        localObject = mParams;
        topToTop = paramInt2;
        topToBottom = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      else
      {
        if (paramInt3 != 4) {
          break label642;
        }
        localObject = mParams;
        topToBottom = paramInt2;
        topToTop = -1;
        baselineToBaseline = -1;
        baselineToTop = -1;
        baselineToBottom = -1;
      }
      mParams.topMargin = paramInt4;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 2: 
      if (paramInt3 == 1)
      {
        localObject = mParams;
        rightToLeft = paramInt2;
        rightToRight = -1;
      }
      else
      {
        if (paramInt3 != 2) {
          break label726;
        }
        localObject = mParams;
        rightToRight = paramInt2;
        rightToLeft = -1;
      }
      mParams.rightMargin = paramInt4;
      break;
      throw new IllegalArgumentException(z2.s(z2.t("right to "), sideToString(paramInt3), " undefined"));
    case 1: 
      label155:
      label241:
      label402:
      label522:
      label642:
      label726:
      if (paramInt3 == 1)
      {
        localObject = mParams;
        leftToLeft = paramInt2;
        leftToRight = -1;
      }
      else
      {
        if (paramInt3 != 2) {
          break label809;
        }
        localObject = mParams;
        leftToRight = paramInt2;
        leftToLeft = -1;
      }
      mParams.leftMargin = paramInt4;
    }
    return this;
    label809:
    throw new IllegalArgumentException(z2.s(z2.t("Left to "), sideToString(paramInt3), " undefined"));
  }
  
  public ConstraintProperties constrainDefaultHeight(int paramInt)
  {
    mParams.matchConstraintDefaultHeight = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainDefaultWidth(int paramInt)
  {
    mParams.matchConstraintDefaultWidth = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainHeight(int paramInt)
  {
    mParams.height = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainMaxHeight(int paramInt)
  {
    mParams.matchConstraintMaxHeight = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainMaxWidth(int paramInt)
  {
    mParams.matchConstraintMaxWidth = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainMinHeight(int paramInt)
  {
    mParams.matchConstraintMinHeight = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainMinWidth(int paramInt)
  {
    mParams.matchConstraintMinWidth = paramInt;
    return this;
  }
  
  public ConstraintProperties constrainWidth(int paramInt)
  {
    mParams.width = paramInt;
    return this;
  }
  
  public ConstraintProperties dimensionRatio(String paramString)
  {
    mParams.dimensionRatio = paramString;
    return this;
  }
  
  public ConstraintProperties elevation(float paramFloat)
  {
    mView.setElevation(paramFloat);
    return this;
  }
  
  public ConstraintProperties goneMargin(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("unknown constraint");
    case 7: 
      mParams.goneEndMargin = paramInt2;
      break;
    case 6: 
      mParams.goneStartMargin = paramInt2;
      break;
    case 5: 
      throw new IllegalArgumentException("baseline does not support margins");
    case 4: 
      mParams.goneBottomMargin = paramInt2;
      break;
    case 3: 
      mParams.goneTopMargin = paramInt2;
      break;
    case 2: 
      mParams.goneRightMargin = paramInt2;
      break;
    case 1: 
      mParams.goneLeftMargin = paramInt2;
    }
    return this;
  }
  
  public ConstraintProperties horizontalBias(float paramFloat)
  {
    mParams.horizontalBias = paramFloat;
    return this;
  }
  
  public ConstraintProperties horizontalChainStyle(int paramInt)
  {
    mParams.horizontalChainStyle = paramInt;
    return this;
  }
  
  public ConstraintProperties horizontalWeight(float paramFloat)
  {
    mParams.horizontalWeight = paramFloat;
    return this;
  }
  
  public ConstraintProperties margin(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("unknown constraint");
    case 7: 
      mParams.setMarginEnd(paramInt2);
      break;
    case 6: 
      mParams.setMarginStart(paramInt2);
      break;
    case 5: 
      throw new IllegalArgumentException("baseline does not support margins");
    case 4: 
      mParams.bottomMargin = paramInt2;
      break;
    case 3: 
      mParams.topMargin = paramInt2;
      break;
    case 2: 
      mParams.rightMargin = paramInt2;
      break;
    case 1: 
      mParams.leftMargin = paramInt2;
    }
    return this;
  }
  
  public ConstraintProperties removeConstraints(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams;
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("unknown constraint");
    case 7: 
      localLayoutParams = mParams;
      endToStart = -1;
      endToEnd = -1;
      localLayoutParams.setMarginEnd(-1);
      mParams.goneEndMargin = Integer.MIN_VALUE;
      break;
    case 6: 
      localLayoutParams = mParams;
      startToEnd = -1;
      startToStart = -1;
      localLayoutParams.setMarginStart(-1);
      mParams.goneStartMargin = Integer.MIN_VALUE;
      break;
    case 5: 
      mParams.baselineToBaseline = -1;
      break;
    case 4: 
      localLayoutParams = mParams;
      bottomToTop = -1;
      bottomToBottom = -1;
      bottomMargin = -1;
      goneBottomMargin = Integer.MIN_VALUE;
      break;
    case 3: 
      localLayoutParams = mParams;
      topToBottom = -1;
      topToTop = -1;
      topMargin = -1;
      goneTopMargin = Integer.MIN_VALUE;
      break;
    case 2: 
      localLayoutParams = mParams;
      rightToRight = -1;
      rightToLeft = -1;
      rightMargin = -1;
      goneRightMargin = Integer.MIN_VALUE;
      break;
    case 1: 
      localLayoutParams = mParams;
      leftToRight = -1;
      leftToLeft = -1;
      leftMargin = -1;
      goneLeftMargin = Integer.MIN_VALUE;
    }
    return this;
  }
  
  public ConstraintProperties removeFromHorizontalChain()
  {
    Object localObject1 = mParams;
    int i = leftToRight;
    int j = rightToLeft;
    ConstraintProperties localConstraintProperties;
    Object localObject2;
    if ((i == -1) && (j == -1))
    {
      int k = startToEnd;
      j = endToStart;
      if ((k != -1) || (j != -1))
      {
        localConstraintProperties = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(k));
        localObject2 = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(j));
        localObject1 = mParams;
        if ((k != -1) && (j != -1))
        {
          localConstraintProperties.connect(7, j, 6, 0);
          ((ConstraintProperties)localObject2).connect(6, i, 7, 0);
        }
        else if ((i != -1) || (j != -1))
        {
          i = rightToRight;
          if (i != -1)
          {
            localConstraintProperties.connect(7, i, 7, 0);
          }
          else
          {
            i = leftToLeft;
            if (i != -1) {
              ((ConstraintProperties)localObject2).connect(6, i, 6, 0);
            }
          }
        }
      }
      removeConstraints(6);
      removeConstraints(7);
    }
    else
    {
      localConstraintProperties = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(i));
      localObject1 = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(j));
      localObject2 = mParams;
      if ((i != -1) && (j != -1))
      {
        localConstraintProperties.connect(2, j, 1, 0);
        ((ConstraintProperties)localObject1).connect(1, i, 2, 0);
      }
      else if ((i != -1) || (j != -1))
      {
        i = rightToRight;
        if (i != -1)
        {
          localConstraintProperties.connect(2, i, 2, 0);
        }
        else
        {
          i = leftToLeft;
          if (i != -1) {
            ((ConstraintProperties)localObject1).connect(1, i, 1, 0);
          }
        }
      }
      removeConstraints(1);
      removeConstraints(2);
    }
    return this;
  }
  
  public ConstraintProperties removeFromVerticalChain()
  {
    ConstraintLayout.LayoutParams localLayoutParams = mParams;
    int i = topToBottom;
    int j = bottomToTop;
    if ((i != -1) || (j != -1))
    {
      ConstraintProperties localConstraintProperties1 = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(i));
      ConstraintProperties localConstraintProperties2 = new ConstraintProperties(((ViewGroup)mView.getParent()).findViewById(j));
      localLayoutParams = mParams;
      if ((i != -1) && (j != -1))
      {
        localConstraintProperties1.connect(4, j, 3, 0);
        localConstraintProperties2.connect(3, i, 4, 0);
      }
      else if ((i != -1) || (j != -1))
      {
        i = bottomToBottom;
        if (i != -1)
        {
          localConstraintProperties1.connect(4, i, 4, 0);
        }
        else
        {
          i = topToTop;
          if (i != -1) {
            localConstraintProperties2.connect(3, i, 3, 0);
          }
        }
      }
    }
    removeConstraints(3);
    removeConstraints(4);
    return this;
  }
  
  public ConstraintProperties rotation(float paramFloat)
  {
    mView.setRotation(paramFloat);
    return this;
  }
  
  public ConstraintProperties rotationX(float paramFloat)
  {
    mView.setRotationX(paramFloat);
    return this;
  }
  
  public ConstraintProperties rotationY(float paramFloat)
  {
    mView.setRotationY(paramFloat);
    return this;
  }
  
  public ConstraintProperties scaleX(float paramFloat)
  {
    mView.setScaleY(paramFloat);
    return this;
  }
  
  public ConstraintProperties scaleY(float paramFloat)
  {
    return this;
  }
  
  public ConstraintProperties transformPivot(float paramFloat1, float paramFloat2)
  {
    mView.setPivotX(paramFloat1);
    mView.setPivotY(paramFloat2);
    return this;
  }
  
  public ConstraintProperties transformPivotX(float paramFloat)
  {
    mView.setPivotX(paramFloat);
    return this;
  }
  
  public ConstraintProperties transformPivotY(float paramFloat)
  {
    mView.setPivotY(paramFloat);
    return this;
  }
  
  public ConstraintProperties translation(float paramFloat1, float paramFloat2)
  {
    mView.setTranslationX(paramFloat1);
    mView.setTranslationY(paramFloat2);
    return this;
  }
  
  public ConstraintProperties translationX(float paramFloat)
  {
    mView.setTranslationX(paramFloat);
    return this;
  }
  
  public ConstraintProperties translationY(float paramFloat)
  {
    mView.setTranslationY(paramFloat);
    return this;
  }
  
  public ConstraintProperties translationZ(float paramFloat)
  {
    mView.setTranslationZ(paramFloat);
    return this;
  }
  
  public ConstraintProperties verticalBias(float paramFloat)
  {
    mParams.verticalBias = paramFloat;
    return this;
  }
  
  public ConstraintProperties verticalChainStyle(int paramInt)
  {
    mParams.verticalChainStyle = paramInt;
    return this;
  }
  
  public ConstraintProperties verticalWeight(float paramFloat)
  {
    mParams.verticalWeight = paramFloat;
    return this;
  }
  
  public ConstraintProperties visibility(int paramInt)
  {
    mView.setVisibility(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */