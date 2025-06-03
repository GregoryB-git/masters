package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import z2;

public class Utils
{
  public static DebugHandle ourHandle;
  
  private static int clamp(int paramInt)
  {
    paramInt = (paramInt & paramInt >> 31) - 255;
    return (paramInt & paramInt >> 31) + 255;
  }
  
  public static void log(String paramString)
  {
    Object localObject1 = new Throwable().getStackTrace()[1];
    Object localObject2 = ((StackTraceElement)localObject1).getMethodName();
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append((String)localObject2);
    ((StringBuilder)localObject3).append("                  ");
    localObject3 = ((StringBuilder)localObject3).toString().substring(0, 17);
    localObject2 = "    ".substring(Integer.toString(((StackTraceElement)localObject1).getLineNumber()).length());
    StringBuilder localStringBuilder = z2.t(".(");
    localStringBuilder.append(((StackTraceElement)localObject1).getFileName());
    localStringBuilder.append(":");
    localStringBuilder.append(((StackTraceElement)localObject1).getLineNumber());
    localStringBuilder.append(")");
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append((String)localObject3);
    localObject1 = localStringBuilder.toString();
    localObject3 = System.out;
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" ");
    ((StringBuilder)localObject2).append(paramString);
    ((PrintStream)localObject3).println(((StringBuilder)localObject2).toString());
    localObject2 = ourHandle;
    if (localObject2 != null)
    {
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append((String)localObject1);
      ((StringBuilder)localObject3).append(" ");
      ((StringBuilder)localObject3).append(paramString);
      ((DebugHandle)localObject2).message(((StringBuilder)localObject3).toString());
    }
  }
  
  public static void log(String paramString1, String paramString2)
  {
    PrintStream localPrintStream = System.out;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" : ");
    localStringBuilder.append(paramString2);
    localPrintStream.println(localStringBuilder.toString());
  }
  
  public static void logStack(String paramString, int paramInt)
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
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(str);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str);
      localPrintStream.println(localStringBuilder.toString());
    }
  }
  
  public static void loge(String paramString1, String paramString2)
  {
    PrintStream localPrintStream = System.err;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" : ");
    localStringBuilder.append(paramString2);
    localPrintStream.println(localStringBuilder.toString());
  }
  
  public static int rgbaTocColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = clamp((int)(paramFloat1 * 255.0F));
    int j = clamp((int)(paramFloat2 * 255.0F));
    int k = clamp((int)(paramFloat3 * 255.0F));
    return i << 16 | clamp((int)(paramFloat4 * 255.0F)) << 24 | j << 8 | k;
  }
  
  public static void setDebugHandle(DebugHandle paramDebugHandle)
  {
    ourHandle = paramDebugHandle;
  }
  
  public static void socketSend(String paramString)
  {
    try
    {
      Object localObject = new java/net/Socket;
      ((Socket)localObject).<init>("127.0.0.1", 5327);
      localObject = ((Socket)localObject).getOutputStream();
      ((OutputStream)localObject).write(paramString.getBytes());
      ((OutputStream)localObject).close();
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public int getInterpolatedColor(float[] paramArrayOfFloat)
  {
    int i = clamp((int)((float)Math.pow(paramArrayOfFloat[0], 0.45454545454545453D) * 255.0F));
    int j = clamp((int)((float)Math.pow(paramArrayOfFloat[1], 0.45454545454545453D) * 255.0F));
    int k = clamp((int)((float)Math.pow(paramArrayOfFloat[2], 0.45454545454545453D) * 255.0F));
    return clamp((int)(paramArrayOfFloat[3] * 255.0F)) << 24 | i << 16 | j << 8 | k;
  }
  
  public static abstract interface DebugHandle
  {
    public abstract void message(String paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */