package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z2;

class ConstraintSet$WriteJsonEngine
{
  private static final String SPACE = "       ";
  public final String BASELINE = "'baseline'";
  public final String BOTTOM = "'bottom'";
  public final String END = "'end'";
  public final String LEFT = "'left'";
  public final String RIGHT = "'right'";
  public final String START = "'start'";
  public final String TOP = "'top'";
  public Context context;
  public int flags;
  public HashMap<Integer, String> idMap = new HashMap();
  public ConstraintLayout layout;
  public int unknownCount = 0;
  public Writer writer;
  
  public ConstraintSet$WriteJsonEngine(ConstraintSet paramConstraintSet, Writer paramWriter, ConstraintLayout paramConstraintLayout, int paramInt)
    throws IOException
  {
    writer = paramWriter;
    layout = paramConstraintLayout;
    context = paramConstraintLayout.getContext();
    flags = paramInt;
  }
  
  private void writeDimension(String paramString, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, boolean paramBoolean)
    throws IOException
  {
    Object localObject1;
    Object localObject2;
    if (paramInt1 == 0)
    {
      if ((paramInt4 == -1) && (paramInt3 == -1))
      {
        if (paramInt2 != 1)
        {
          if (paramInt2 == 2)
          {
            localObject1 = writer;
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("       ");
            ((StringBuilder)localObject2).append(paramString);
            ((StringBuilder)localObject2).append(": '");
            ((StringBuilder)localObject2).append(paramFloat);
            ((StringBuilder)localObject2).append("%',\n");
            ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          localObject1 = writer;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("       ");
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append(": '???????????',\n");
          ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
        }
      }
      else if (paramInt2 != 0)
      {
        if (paramInt2 != 1)
        {
          if (paramInt2 == 2)
          {
            localObject1 = writer;
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("       ");
            ((StringBuilder)localObject2).append(paramString);
            ((StringBuilder)localObject2).append(": {'");
            ((StringBuilder)localObject2).append(paramFloat);
            ((StringBuilder)localObject2).append("'% ,");
            ((StringBuilder)localObject2).append(paramInt3);
            ((StringBuilder)localObject2).append(", ");
            ((StringBuilder)localObject2).append(paramInt4);
            ((StringBuilder)localObject2).append("}\n");
            ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          localObject1 = writer;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("       ");
          ((StringBuilder)localObject2).append(paramString);
          ((StringBuilder)localObject2).append(": {'wrap' ,");
          ((StringBuilder)localObject2).append(paramInt3);
          ((StringBuilder)localObject2).append(", ");
          ((StringBuilder)localObject2).append(paramInt4);
          ((StringBuilder)localObject2).append("}\n");
          ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
        }
      }
      else
      {
        localObject2 = writer;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("       ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(": {'spread' ,");
        ((StringBuilder)localObject1).append(paramInt3);
        ((StringBuilder)localObject1).append(", ");
        ((StringBuilder)localObject1).append(paramInt4);
        ((StringBuilder)localObject1).append("}\n");
        ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
      }
    }
    else if (paramInt1 == -2)
    {
      localObject1 = writer;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("       ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(": 'wrap'\n");
      ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
    }
    else if (paramInt1 == -1)
    {
      localObject2 = writer;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("       ");
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(": 'parent'\n");
      ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
    }
    else
    {
      localObject2 = writer;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("       ");
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(": ");
      ((StringBuilder)localObject1).append(paramInt1);
      ((StringBuilder)localObject1).append(",\n");
      ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
    }
  }
  
  private void writeGuideline(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
  
  public String getName(int paramInt)
  {
    if (idMap.containsKey(Integer.valueOf(paramInt))) {
      return z2.s(z2.t("'"), (String)idMap.get(Integer.valueOf(paramInt)), "'");
    }
    if (paramInt == 0) {
      return "'parent'";
    }
    String str = lookup(paramInt);
    idMap.put(Integer.valueOf(paramInt), str);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("'");
    localStringBuilder.append(str);
    localStringBuilder.append("'");
    return localStringBuilder.toString();
  }
  
  public String lookup(int paramInt)
  {
    if (paramInt != -1) {}
    try
    {
      return context.getResources().getResourceEntryName(paramInt);
    }
    catch (Exception localException)
    {
      Object localObject;
      StringBuilder localStringBuilder = z2.t("unknown");
      paramInt = unknownCount + 1;
      unknownCount = paramInt;
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("unknown");
    paramInt = unknownCount + 1;
    unknownCount = paramInt;
    ((StringBuilder)localObject).append(paramInt);
    localObject = ((StringBuilder)localObject).toString();
    return (String)localObject;
  }
  
  public void writeCircle(int paramInt1, float paramFloat, int paramInt2)
    throws IOException
  {
    if (paramInt1 == -1) {
      return;
    }
    writer.write("       circle");
    writer.write(":[");
    writer.write(getName(paramInt1));
    Writer localWriter = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(", ");
    localStringBuilder.append(paramFloat);
    localWriter.write(localStringBuilder.toString());
    localWriter = writer;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt2);
    localStringBuilder.append("]");
    localWriter.write(localStringBuilder.toString());
  }
  
  public void writeConstraint(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
    throws IOException
  {
    if (paramInt1 == -1) {
      return;
    }
    Writer localWriter = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("       ");
    localStringBuilder.append(paramString1);
    localWriter.write(localStringBuilder.toString());
    writer.write(":[");
    writer.write(getName(paramInt1));
    writer.write(" , ");
    writer.write(paramString2);
    if (paramInt2 != 0)
    {
      paramString2 = writer;
      paramString1 = new StringBuilder();
      paramString1.append(" , ");
      paramString1.append(paramInt2);
      paramString2.write(paramString1.toString());
    }
    writer.write("],\n");
  }
  
  public void writeLayout()
    throws IOException
  {
    writer.write("\n'ConstraintSet':{\n");
    Iterator localIterator = ConstraintSet.access$1300(this$0).keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Integer)localIterator.next();
      Object localObject2 = (ConstraintSet.Constraint)ConstraintSet.access$1300(this$0).get(localObject1);
      String str = getName(((Integer)localObject1).intValue());
      localObject1 = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append(":{\n");
      ((Writer)localObject1).write(localStringBuilder.toString());
      localObject2 = layout;
      writeDimension("height", mHeight, heightDefault, heightPercent, heightMin, heightMax, constrainedHeight);
      writeDimension("width", mWidth, widthDefault, widthPercent, widthMin, widthMax, constrainedWidth);
      writeConstraint("'left'", leftToLeft, "'left'", leftMargin, goneLeftMargin);
      writeConstraint("'left'", leftToRight, "'right'", leftMargin, goneLeftMargin);
      writeConstraint("'right'", rightToLeft, "'left'", rightMargin, goneRightMargin);
      writeConstraint("'right'", rightToRight, "'right'", rightMargin, goneRightMargin);
      writeConstraint("'baseline'", baselineToBaseline, "'baseline'", -1, goneBaselineMargin);
      writeConstraint("'baseline'", baselineToTop, "'top'", -1, goneBaselineMargin);
      writeConstraint("'baseline'", baselineToBottom, "'bottom'", -1, goneBaselineMargin);
      writeConstraint("'top'", topToBottom, "'bottom'", topMargin, goneTopMargin);
      writeConstraint("'top'", topToTop, "'top'", topMargin, goneTopMargin);
      writeConstraint("'bottom'", bottomToBottom, "'bottom'", bottomMargin, goneBottomMargin);
      writeConstraint("'bottom'", bottomToTop, "'top'", bottomMargin, goneBottomMargin);
      writeConstraint("'start'", startToStart, "'start'", startMargin, goneStartMargin);
      writeConstraint("'start'", startToEnd, "'end'", startMargin, goneStartMargin);
      writeConstraint("'end'", endToStart, "'start'", endMargin, goneEndMargin);
      writeConstraint("'end'", endToEnd, "'end'", endMargin, goneEndMargin);
      writeVariable("'horizontalBias'", horizontalBias, 0.5F);
      writeVariable("'verticalBias'", verticalBias, 0.5F);
      writeCircle(circleConstraint, circleAngle, circleRadius);
      writeGuideline(orientation, guideBegin, guideEnd, guidePercent);
      writeVariable("'dimensionRatio'", dimensionRatio);
      writeVariable("'barrierMargin'", mBarrierMargin);
      writeVariable("'type'", mHelperType);
      writeVariable("'ReferenceId'", mReferenceIdString);
      writeVariable("'mBarrierAllowsGoneWidgets'", mBarrierAllowsGoneWidgets, true);
      writeVariable("'WrapBehavior'", mWrapBehavior);
      writeVariable("'verticalWeight'", verticalWeight);
      writeVariable("'horizontalWeight'", horizontalWeight);
      writeVariable("'horizontalChainStyle'", horizontalChainStyle);
      writeVariable("'verticalChainStyle'", verticalChainStyle);
      writeVariable("'barrierDirection'", mBarrierDirection);
      localObject2 = mReferenceIds;
      if (localObject2 != null) {
        writeVariable("'ReferenceIds'", (int[])localObject2);
      }
      writer.write("}\n");
    }
    writer.write("}\n");
  }
  
  public void writeVariable(String paramString, float paramFloat)
    throws IOException
  {
    if (paramFloat == -1.0F) {
      return;
    }
    Writer localWriter = writer;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("       ");
    ((StringBuilder)localObject).append(paramString);
    localWriter.write(((StringBuilder)localObject).toString());
    localObject = writer;
    paramString = new StringBuilder();
    paramString.append(": ");
    paramString.append(paramFloat);
    ((Writer)localObject).write(paramString.toString());
    writer.write(",\n");
  }
  
  public void writeVariable(String paramString, float paramFloat1, float paramFloat2)
    throws IOException
  {
    if (paramFloat1 == paramFloat2) {
      return;
    }
    Writer localWriter = writer;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("       ");
    ((StringBuilder)localObject).append(paramString);
    localWriter.write(((StringBuilder)localObject).toString());
    localObject = writer;
    paramString = new StringBuilder();
    paramString.append(": ");
    paramString.append(paramFloat1);
    ((Writer)localObject).write(paramString.toString());
    writer.write(",\n");
  }
  
  public void writeVariable(String paramString, int paramInt)
    throws IOException
  {
    if ((paramInt != 0) && (paramInt != -1))
    {
      Writer localWriter = writer;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("       ");
      ((StringBuilder)localObject).append(paramString);
      localWriter.write(((StringBuilder)localObject).toString());
      writer.write(":");
      localObject = writer;
      paramString = new StringBuilder();
      paramString.append(", ");
      paramString.append(paramInt);
      ((Writer)localObject).write(paramString.toString());
      writer.write("\n");
    }
  }
  
  public void writeVariable(String paramString1, String paramString2)
    throws IOException
  {
    if (paramString2 == null) {
      return;
    }
    Object localObject = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("       ");
    localStringBuilder.append(paramString1);
    ((Writer)localObject).write(localStringBuilder.toString());
    writer.write(":");
    paramString1 = writer;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramString2);
    paramString1.write(((StringBuilder)localObject).toString());
    writer.write("\n");
  }
  
  public void writeVariable(String paramString, boolean paramBoolean)
    throws IOException
  {
    if (!paramBoolean) {
      return;
    }
    Object localObject = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("       ");
    localStringBuilder.append(paramString);
    ((Writer)localObject).write(localStringBuilder.toString());
    paramString = writer;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(": ");
    ((StringBuilder)localObject).append(paramBoolean);
    paramString.write(((StringBuilder)localObject).toString());
    writer.write(",\n");
  }
  
  public void writeVariable(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    if (paramBoolean1 == paramBoolean2) {
      return;
    }
    Writer localWriter = writer;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("       ");
    ((StringBuilder)localObject).append(paramString);
    localWriter.write(((StringBuilder)localObject).toString());
    localObject = writer;
    paramString = new StringBuilder();
    paramString.append(": ");
    paramString.append(paramBoolean1);
    ((Writer)localObject).write(paramString.toString());
    writer.write(",\n");
  }
  
  public void writeVariable(String paramString, int[] paramArrayOfInt)
    throws IOException
  {
    if (paramArrayOfInt == null) {
      return;
    }
    Object localObject1 = writer;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("       ");
    ((StringBuilder)localObject2).append(paramString);
    ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
    writer.write(": ");
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      localObject2 = writer;
      localObject1 = new StringBuilder();
      if (i == 0) {
        paramString = "[";
      } else {
        paramString = ", ";
      }
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(getName(paramArrayOfInt[i]));
      ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
    }
    writer.write("],\n");
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.WriteJsonEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */