package androidx.constraintlayout.motion.widget;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import z2;

@SuppressLint({"LogConditional"})
public class Debug
{
  public static void dumpLayoutParams(ViewGroup.LayoutParams paramLayoutParams, String paramString)
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = z2.t(".(");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getFileName());
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getLineNumber());
    ((StringBuilder)localObject2).append(") ");
    ((StringBuilder)localObject2).append(paramString);
    ((StringBuilder)localObject2).append("  ");
    paramString = ((StringBuilder)localObject2).toString();
    localObject1 = System.out;
    localObject2 = a.s(" >>>>>>>>>>>>>>>>>>. dump ", paramString, "  ");
    ((StringBuilder)localObject2).append(paramLayoutParams.getClass().getName());
    ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
    localObject2 = paramLayoutParams.getClass().getFields();
    int i = 0;
    while (i < localObject2.length)
    {
      String str = localObject2[i];
      try
      {
        localObject1 = str.get(paramLayoutParams);
        str = str.getName();
        if ((str.contains("To")) && (!localObject1.toString().equals("-1")))
        {
          PrintStream localPrintStream = System.out;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(paramString);
          localStringBuilder.append("       ");
          localStringBuilder.append(str);
          localStringBuilder.append(" ");
          localStringBuilder.append(localObject1);
          localPrintStream.println(localStringBuilder.toString());
        }
        i++;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
    paramLayoutParams = System.out;
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" <<<<<<<<<<<<<<<<< dump ");
    ((StringBuilder)localObject2).append(paramString);
    paramLayoutParams.println(((StringBuilder)localObject2).toString());
  }
  
  public static void dumpLayoutParams(ViewGroup paramViewGroup, String paramString)
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = z2.t(".(");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getFileName());
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getLineNumber());
    ((StringBuilder)localObject2).append(") ");
    ((StringBuilder)localObject2).append(paramString);
    ((StringBuilder)localObject2).append("  ");
    localObject2 = ((StringBuilder)localObject2).toString();
    int i = paramViewGroup.getChildCount();
    Object localObject3 = System.out;
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(" children ");
    ((StringBuilder)localObject1).append(i);
    ((PrintStream)localObject3).println(((StringBuilder)localObject1).toString());
    for (int j = 0; j < i; j++)
    {
      paramString = paramViewGroup.getChildAt(j);
      localObject1 = System.out;
      localObject3 = z2.u((String)localObject2, "     ");
      ((StringBuilder)localObject3).append(getName(paramString));
      ((PrintStream)localObject1).println(((StringBuilder)localObject3).toString());
      paramString = paramString.getLayoutParams();
      localObject1 = paramString.getClass().getFields();
      int k = 0;
      while (k < localObject1.length)
      {
        localObject3 = localObject1[k];
        try
        {
          Object localObject4 = ((Field)localObject3).get(paramString);
          if ((((Field)localObject3).getName().contains("To")) && (!localObject4.toString().equals("-1")))
          {
            PrintStream localPrintStream = System.out;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append("       ");
            localStringBuilder.append(((Field)localObject3).getName());
            localStringBuilder.append(" ");
            localStringBuilder.append(localObject4);
            localPrintStream.println(localStringBuilder.toString());
          }
          k++;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public static void dumpPoc(Object paramObject)
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = z2.t(".(");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getFileName());
    ((StringBuilder)localObject2).append(":");
    ((StringBuilder)localObject2).append(((StackTraceElement)localObject1).getLineNumber());
    ((StringBuilder)localObject2).append(")");
    localObject2 = ((StringBuilder)localObject2).toString();
    localObject1 = paramObject.getClass();
    Object localObject3 = System.out;
    Object localObject4 = z2.u((String)localObject2, "------------- ");
    ((StringBuilder)localObject4).append(((Class)localObject1).getName());
    ((StringBuilder)localObject4).append(" --------------------");
    ((PrintStream)localObject3).println(((StringBuilder)localObject4).toString());
    localObject3 = ((Class)localObject1).getFields();
    int i = 0;
    while (i < localObject3.length)
    {
      Object localObject5 = localObject3[i];
      try
      {
        localObject4 = ((Field)localObject5).get(paramObject);
        if ((((Field)localObject5).getName().startsWith("layout_constraint")) && ((!(localObject4 instanceof Integer)) || (!localObject4.toString().equals("-1"))) && ((!(localObject4 instanceof Integer)) || (!localObject4.toString().equals("0"))) && ((!(localObject4 instanceof Float)) || (!localObject4.toString().equals("1.0"))) && ((!(localObject4 instanceof Float)) || (!localObject4.toString().equals("0.5"))))
        {
          PrintStream localPrintStream = System.out;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append("    ");
          localStringBuilder.append(((Field)localObject5).getName());
          localStringBuilder.append(" ");
          localStringBuilder.append(localObject4);
          localPrintStream.println(localStringBuilder.toString());
        }
        i++;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
    paramObject = System.out;
    localObject2 = z2.u((String)localObject2, "------------- ");
    ((StringBuilder)localObject2).append(((Class)localObject1).getSimpleName());
    ((StringBuilder)localObject2).append(" --------------------");
    ((PrintStream)paramObject).println(((StringBuilder)localObject2).toString());
  }
  
  public static String getActionType(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    paramMotionEvent = MotionEvent.class.getFields();
    for (int j = 0; j < paramMotionEvent.length; j++)
    {
      String str = paramMotionEvent[j];
      try
      {
        if ((Modifier.isStatic(str.getModifiers())) && (str.getType().equals(Integer.TYPE)) && (str.getInt(null) == i))
        {
          str = str.getName();
          return str;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;) {}
      }
    }
    return "---";
  }
  
  public static String getCallFrom(int paramInt)
  {
    StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[(paramInt + 2)];
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(localStackTraceElement.getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(localStackTraceElement.getLineNumber());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static String getLoc()
  {
    StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[1];
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(localStackTraceElement.getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(localStackTraceElement.getLineNumber());
    localStringBuilder.append(") ");
    localStringBuilder.append(localStackTraceElement.getMethodName());
    localStringBuilder.append("()");
    return localStringBuilder.toString();
  }
  
  public static String getLocation()
  {
    StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[1];
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(localStackTraceElement.getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(localStackTraceElement.getLineNumber());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static String getLocation2()
  {
    StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[2];
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(localStackTraceElement.getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(localStackTraceElement.getLineNumber());
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static String getName(Context paramContext, int paramInt)
  {
    if (paramInt != -1) {}
    try
    {
      return paramContext.getResources().getResourceEntryName(paramInt);
    }
    catch (Exception paramContext) {}
    return "UNKNOWN";
    return a.f("?", paramInt);
  }
  
  public static String getName(Context paramContext, int[] paramArrayOfInt)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramArrayOfInt.length);
      ((StringBuilder)localObject1).append("[");
      localObject1 = ((StringBuilder)localObject1).toString();
      Object localObject2;
      for (int i = 0; i < paramArrayOfInt.length; i++)
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append((String)localObject1);
        if (i == 0) {
          localObject1 = "";
        } else {
          localObject1 = " ";
        }
        ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = ((StringBuilder)localObject3).toString();
        try
        {
          localObject1 = paramContext.getResources().getResourceEntryName(paramArrayOfInt[i]);
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("? ");
          ((StringBuilder)localObject2).append(paramArrayOfInt[i]);
          ((StringBuilder)localObject2).append(" ");
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append((String)localObject3);
        localStringBuilder.append((String)localObject2);
        localObject2 = localStringBuilder.toString();
      }
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append((String)localObject2);
      paramContext.append("]");
      paramContext = paramContext.toString();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.v("DEBUG", paramContext.toString());
    }
    return "UNKNOWN";
  }
  
  public static String getName(View paramView)
  {
    try
    {
      paramView = paramView.getContext().getResources().getResourceEntryName(paramView.getId());
      return paramView;
    }
    catch (Exception paramView) {}
    return "UNKNOWN";
  }
  
  public static String getState(MotionLayout paramMotionLayout, int paramInt)
  {
    return getState(paramMotionLayout, paramInt, -1);
  }
  
  public static String getState(MotionLayout paramMotionLayout, int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return "UNDEFINED";
    }
    String str = paramMotionLayout.getContext().getResources().getResourceEntryName(paramInt1);
    Object localObject = str;
    if (paramInt2 != -1)
    {
      paramMotionLayout = str;
      if (str.length() > paramInt2) {
        paramMotionLayout = str.replaceAll("([^_])[aeiou]+", "$1");
      }
      localObject = paramMotionLayout;
      if (paramMotionLayout.length() > paramInt2)
      {
        paramInt1 = paramMotionLayout.replaceAll("[^_]", "").length();
        localObject = paramMotionLayout;
        if (paramInt1 > 0)
        {
          paramInt1 = (paramMotionLayout.length() - paramInt2) / paramInt1;
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(CharBuffer.allocate(paramInt1).toString().replace('\000', '.'));
          ((StringBuilder)localObject).append("_");
          localObject = paramMotionLayout.replaceAll(((StringBuilder)localObject).toString(), "_");
        }
      }
    }
    return (String)localObject;
  }
  
  public static void logStack(String paramString1, String paramString2, int paramInt)
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = 1;
    i = Math.min(paramInt, i - 1);
    String str = " ";
    for (paramInt = j; paramInt <= i; paramInt++)
    {
      Object localObject = arrayOfStackTraceElement[paramInt];
      localObject = z2.t(".(");
      ((StringBuilder)localObject).append(arrayOfStackTraceElement[paramInt].getFileName());
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(arrayOfStackTraceElement[paramInt].getLineNumber());
      ((StringBuilder)localObject).append(") ");
      ((StringBuilder)localObject).append(arrayOfStackTraceElement[paramInt].getMethodName());
      localObject = ((StringBuilder)localObject).toString();
      str = z2.o(str, " ");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString2);
      localStringBuilder.append(str);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str);
      Log.v(paramString1, localStringBuilder.toString());
    }
  }
  
  public static void printStack(String paramString, int paramInt)
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = 1;
    i = Math.min(paramInt, i - 1);
    String str = " ";
    for (paramInt = j; paramInt <= i; paramInt++)
    {
      Object localObject = arrayOfStackTraceElement[paramInt];
      localObject = z2.t(".(");
      ((StringBuilder)localObject).append(arrayOfStackTraceElement[paramInt].getFileName());
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(arrayOfStackTraceElement[paramInt].getLineNumber());
      ((StringBuilder)localObject).append(") ");
      localObject = ((StringBuilder)localObject).toString();
      str = z2.o(str, " ");
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(str);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str);
      localPrintStream.println(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.Debug
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */