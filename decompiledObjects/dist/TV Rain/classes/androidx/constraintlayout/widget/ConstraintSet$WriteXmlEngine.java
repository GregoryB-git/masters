package androidx.constraintlayout.widget;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import z2;

class ConstraintSet$WriteXmlEngine
{
  private static final String SPACE = "\n       ";
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
  
  public ConstraintSet$WriteXmlEngine(ConstraintSet paramConstraintSet, Writer paramWriter, ConstraintLayout paramConstraintLayout, int paramInt)
    throws IOException
  {
    writer = paramWriter;
    layout = paramConstraintLayout;
    context = paramConstraintLayout.getContext();
    flags = paramInt;
  }
  
  private void writeBaseDimension(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt1 != paramInt2)
    {
      Object localObject1;
      Object localObject2;
      if (paramInt1 == -2)
      {
        localObject1 = writer;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("\n       ");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("=\"wrap_content\"");
        ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
      }
      else if (paramInt1 == -1)
      {
        localObject2 = writer;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("\n       ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append("=\"match_parent\"");
        ((Writer)localObject2).write(((StringBuilder)localObject1).toString());
      }
      else
      {
        localObject1 = writer;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("\n       ");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("=\"");
        ((StringBuilder)localObject2).append(paramInt1);
        ((StringBuilder)localObject2).append("dp\"");
        ((Writer)localObject1).write(((StringBuilder)localObject2).toString());
      }
    }
  }
  
  private void writeBoolen(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    if (paramBoolean1 != paramBoolean2)
    {
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localStringBuilder.append("=\"");
      localStringBuilder.append(paramBoolean1);
      localStringBuilder.append("dp\"");
      localWriter.write(localStringBuilder.toString());
    }
  }
  
  private void writeDimension(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt1 != paramInt2)
    {
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localStringBuilder.append("=\"");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append("dp\"");
      localWriter.write(localStringBuilder.toString());
    }
  }
  
  private void writeEnum(String paramString, int paramInt1, String[] paramArrayOfString, int paramInt2)
    throws IOException
  {
    if (paramInt1 != paramInt2)
    {
      Writer localWriter = writer;
      paramString = a.s("\n       ", paramString, "=\"");
      paramString.append(paramArrayOfString[paramInt1]);
      paramString.append("\"");
      localWriter.write(paramString.toString());
    }
  }
  
  public String getName(int paramInt)
  {
    if (idMap.containsKey(Integer.valueOf(paramInt))) {
      return z2.s(z2.t("@+id/"), (String)idMap.get(Integer.valueOf(paramInt)), "");
    }
    if (paramInt == 0) {
      return "parent";
    }
    String str = lookup(paramInt);
    idMap.put(Integer.valueOf(paramInt), str);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("@+id/");
    localStringBuilder.append(str);
    localStringBuilder.append("");
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
    writer.write("circle");
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
    localStringBuilder.append("\n       ");
    localStringBuilder.append(paramString1);
    localWriter.write(localStringBuilder.toString());
    writer.write(":[");
    writer.write(getName(paramInt1));
    writer.write(" , ");
    writer.write(paramString2);
    if (paramInt2 != 0)
    {
      paramString1 = writer;
      paramString2 = new StringBuilder();
      paramString2.append(" , ");
      paramString2.append(paramInt2);
      paramString1.write(paramString2.toString());
    }
    writer.write("],\n");
  }
  
  public void writeLayout()
    throws IOException
  {
    writer.write("\n<ConstraintSet>\n");
    Iterator localIterator = ConstraintSet.access$1300(this$0).keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Integer)localIterator.next();
      Object localObject2 = (ConstraintSet.Constraint)ConstraintSet.access$1300(this$0).get(localObject1);
      String str = getName(((Integer)localObject1).intValue());
      writer.write("  <Constraint");
      localObject1 = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       android:id=\"");
      localStringBuilder.append(str);
      localStringBuilder.append("\"");
      ((Writer)localObject1).write(localStringBuilder.toString());
      localObject2 = layout;
      writeBaseDimension("android:layout_width", mWidth, -5);
      writeBaseDimension("android:layout_height", mHeight, -5);
      writeVariable("app:layout_constraintGuide_begin", guideBegin, -1.0F);
      writeVariable("app:layout_constraintGuide_end", guideEnd, -1.0F);
      writeVariable("app:layout_constraintGuide_percent", guidePercent, -1.0F);
      writeVariable("app:layout_constraintHorizontal_bias", horizontalBias, 0.5F);
      writeVariable("app:layout_constraintVertical_bias", verticalBias, 0.5F);
      writeVariable("app:layout_constraintDimensionRatio", dimensionRatio, null);
      writeXmlConstraint("app:layout_constraintCircle", circleConstraint);
      writeVariable("app:layout_constraintCircleRadius", circleRadius, 0.0F);
      writeVariable("app:layout_constraintCircleAngle", circleAngle, 0.0F);
      writeVariable("android:orientation", orientation, -1.0F);
      writeVariable("app:layout_constraintVertical_weight", verticalWeight, -1.0F);
      writeVariable("app:layout_constraintHorizontal_weight", horizontalWeight, -1.0F);
      writeVariable("app:layout_constraintHorizontal_chainStyle", horizontalChainStyle, 0.0F);
      writeVariable("app:layout_constraintVertical_chainStyle", verticalChainStyle, 0.0F);
      writeVariable("app:barrierDirection", mBarrierDirection, -1.0F);
      writeVariable("app:barrierMargin", mBarrierMargin, 0.0F);
      writeDimension("app:layout_marginLeft", leftMargin, 0);
      writeDimension("app:layout_goneMarginLeft", goneLeftMargin, Integer.MIN_VALUE);
      writeDimension("app:layout_marginRight", rightMargin, 0);
      writeDimension("app:layout_goneMarginRight", goneRightMargin, Integer.MIN_VALUE);
      writeDimension("app:layout_marginStart", startMargin, 0);
      writeDimension("app:layout_goneMarginStart", goneStartMargin, Integer.MIN_VALUE);
      writeDimension("app:layout_marginEnd", endMargin, 0);
      writeDimension("app:layout_goneMarginEnd", goneEndMargin, Integer.MIN_VALUE);
      writeDimension("app:layout_marginTop", topMargin, 0);
      writeDimension("app:layout_goneMarginTop", goneTopMargin, Integer.MIN_VALUE);
      writeDimension("app:layout_marginBottom", bottomMargin, 0);
      writeDimension("app:layout_goneMarginBottom", goneBottomMargin, Integer.MIN_VALUE);
      writeDimension("app:goneBaselineMargin", goneBaselineMargin, Integer.MIN_VALUE);
      writeDimension("app:baselineMargin", baselineMargin, 0);
      writeBoolen("app:layout_constrainedWidth", constrainedWidth, false);
      writeBoolen("app:layout_constrainedHeight", constrainedHeight, false);
      writeBoolen("app:barrierAllowsGoneWidgets", mBarrierAllowsGoneWidgets, true);
      writeVariable("app:layout_wrapBehaviorInParent", mWrapBehavior, 0.0F);
      writeXmlConstraint("app:baselineToBaseline", baselineToBaseline);
      writeXmlConstraint("app:baselineToBottom", baselineToBottom);
      writeXmlConstraint("app:baselineToTop", baselineToTop);
      writeXmlConstraint("app:layout_constraintBottom_toBottomOf", bottomToBottom);
      writeXmlConstraint("app:layout_constraintBottom_toTopOf", bottomToTop);
      writeXmlConstraint("app:layout_constraintEnd_toEndOf", endToEnd);
      writeXmlConstraint("app:layout_constraintEnd_toStartOf", endToStart);
      writeXmlConstraint("app:layout_constraintLeft_toLeftOf", leftToLeft);
      writeXmlConstraint("app:layout_constraintLeft_toRightOf", leftToRight);
      writeXmlConstraint("app:layout_constraintRight_toLeftOf", rightToLeft);
      writeXmlConstraint("app:layout_constraintRight_toRightOf", rightToRight);
      writeXmlConstraint("app:layout_constraintStart_toEndOf", startToEnd);
      writeXmlConstraint("app:layout_constraintStart_toStartOf", startToStart);
      writeXmlConstraint("app:layout_constraintTop_toBottomOf", topToBottom);
      writeXmlConstraint("app:layout_constraintTop_toTopOf", topToTop);
      localObject1 = new String[3];
      localObject1[0] = "spread";
      localObject1[1] = "wrap";
      localObject1[2] = "percent";
      writeEnum("app:layout_constraintHeight_default", heightDefault, (String[])localObject1, 0);
      writeVariable("app:layout_constraintHeight_percent", heightPercent, 1.0F);
      writeDimension("app:layout_constraintHeight_min", heightMin, 0);
      writeDimension("app:layout_constraintHeight_max", heightMax, 0);
      writeBoolen("android:layout_constrainedHeight", constrainedHeight, false);
      writeEnum("app:layout_constraintWidth_default", widthDefault, (String[])localObject1, 0);
      writeVariable("app:layout_constraintWidth_percent", widthPercent, 1.0F);
      writeDimension("app:layout_constraintWidth_min", widthMin, 0);
      writeDimension("app:layout_constraintWidth_max", widthMax, 0);
      writeBoolen("android:layout_constrainedWidth", constrainedWidth, false);
      writeVariable("app:layout_constraintVertical_weight", verticalWeight, -1.0F);
      writeVariable("app:layout_constraintHorizontal_weight", horizontalWeight, -1.0F);
      writeVariable("app:layout_constraintHorizontal_chainStyle", horizontalChainStyle);
      writeVariable("app:layout_constraintVertical_chainStyle", verticalChainStyle);
      writeEnum("app:barrierDirection", mBarrierDirection, new String[] { "left", "right", "top", "bottom", "start", "end" }, -1);
      writeVariable("app:layout_constraintTag", mConstraintTag, null);
      localObject2 = mReferenceIds;
      if (localObject2 != null) {
        writeVariable("'ReferenceIds'", (int[])localObject2);
      }
      writer.write(" />\n");
    }
    writer.write("</ConstraintSet>\n");
  }
  
  public void writeVariable(String paramString, float paramFloat1, float paramFloat2)
    throws IOException
  {
    if (paramFloat1 == paramFloat2) {
      return;
    }
    Writer localWriter = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n       ");
    localStringBuilder.append(paramString);
    localWriter.write(localStringBuilder.toString());
    paramString = writer;
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("=\"");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append("\"");
    paramString.write(localStringBuilder.toString());
  }
  
  public void writeVariable(String paramString, int paramInt)
    throws IOException
  {
    if ((paramInt != 0) && (paramInt != -1))
    {
      Writer localWriter = writer;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n       ");
      localStringBuilder.append(paramString);
      localStringBuilder.append("=\"");
      localStringBuilder.append(paramInt);
      localStringBuilder.append("\"\n");
      localWriter.write(localStringBuilder.toString());
    }
  }
  
  public void writeVariable(String paramString1, String paramString2)
    throws IOException
  {
    if (paramString2 == null) {
      return;
    }
    writer.write(paramString1);
    writer.write(":");
    paramString1 = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(", ");
    localStringBuilder.append(paramString2);
    paramString1.write(localStringBuilder.toString());
    writer.write("\n");
  }
  
  public void writeVariable(String paramString1, String paramString2, String paramString3)
    throws IOException
  {
    if ((paramString2 != null) && (!paramString2.equals(paramString3)))
    {
      Writer localWriter = writer;
      paramString3 = new StringBuilder();
      paramString3.append("\n       ");
      paramString3.append(paramString1);
      localWriter.write(paramString3.toString());
      paramString1 = writer;
      paramString3 = new StringBuilder();
      paramString3.append("=\"");
      paramString3.append(paramString2);
      paramString3.append("\"");
      paramString1.write(paramString3.toString());
    }
  }
  
  public void writeVariable(String paramString, int[] paramArrayOfInt)
    throws IOException
  {
    if (paramArrayOfInt == null) {
      return;
    }
    Writer localWriter = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n       ");
    localStringBuilder.append(paramString);
    localWriter.write(localStringBuilder.toString());
    writer.write(":");
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      localWriter = writer;
      localStringBuilder = new StringBuilder();
      if (i == 0) {
        paramString = "[";
      } else {
        paramString = ", ";
      }
      localStringBuilder.append(paramString);
      localStringBuilder.append(getName(paramArrayOfInt[i]));
      localWriter.write(localStringBuilder.toString());
    }
    writer.write("],\n");
  }
  
  public void writeXmlConstraint(String paramString, int paramInt)
    throws IOException
  {
    if (paramInt == -1) {
      return;
    }
    Writer localWriter = writer;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n       ");
    localStringBuilder.append(paramString);
    localWriter.write(localStringBuilder.toString());
    paramString = writer;
    localStringBuilder = z2.t("=\"");
    localStringBuilder.append(getName(paramInt));
    localStringBuilder.append("\"");
    paramString.write(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.WriteXmlEngine
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */