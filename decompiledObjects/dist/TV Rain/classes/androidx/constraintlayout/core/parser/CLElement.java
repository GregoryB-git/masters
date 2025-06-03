package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import z2;

public class CLElement
{
  public static int BASE_INDENT = 2;
  public static int MAX_LINE = 80;
  public long end = Long.MAX_VALUE;
  private int line;
  public CLContainer mContainer;
  private final char[] mContent;
  public long start = -1L;
  
  public CLElement(char[] paramArrayOfChar)
  {
    mContent = paramArrayOfChar;
  }
  
  public void addIndent(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append(' ');
    }
  }
  
  public String content()
  {
    String str = new String(mContent);
    long l1 = end;
    if (l1 != Long.MAX_VALUE)
    {
      long l2 = start;
      if (l1 >= l2) {
        return str.substring((int)l2, (int)l1 + 1);
      }
    }
    l1 = start;
    return str.substring((int)l1, (int)l1 + 1);
  }
  
  public CLElement getContainer()
  {
    return mContainer;
  }
  
  public String getDebugName()
  {
    if (CLParser.DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getStrClass());
      localStringBuilder.append(" -> ");
      return localStringBuilder.toString();
    }
    return "";
  }
  
  public long getEnd()
  {
    return end;
  }
  
  public float getFloat()
  {
    if ((this instanceof CLNumber)) {
      return ((CLNumber)this).getFloat();
    }
    return NaN.0F;
  }
  
  public int getInt()
  {
    if ((this instanceof CLNumber)) {
      return ((CLNumber)this).getInt();
    }
    return 0;
  }
  
  public int getLine()
  {
    return line;
  }
  
  public long getStart()
  {
    return start;
  }
  
  public String getStrClass()
  {
    String str = getClass().toString();
    return str.substring(str.lastIndexOf('.') + 1);
  }
  
  public boolean isDone()
  {
    boolean bool;
    if (end != Long.MAX_VALUE) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStarted()
  {
    boolean bool;
    if (start > -1L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean notStarted()
  {
    boolean bool;
    if (start == -1L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setContainer(CLContainer paramCLContainer)
  {
    mContainer = paramCLContainer;
  }
  
  public void setEnd(long paramLong)
  {
    if (end != Long.MAX_VALUE) {
      return;
    }
    end = paramLong;
    if (CLParser.DEBUG)
    {
      localObject = System.out;
      StringBuilder localStringBuilder = z2.t("closing ");
      localStringBuilder.append(hashCode());
      localStringBuilder.append(" -> ");
      localStringBuilder.append(this);
      ((PrintStream)localObject).println(localStringBuilder.toString());
    }
    Object localObject = mContainer;
    if (localObject != null) {
      ((CLContainer)localObject).add(this);
    }
  }
  
  public void setLine(int paramInt)
  {
    line = paramInt;
  }
  
  public void setStart(long paramLong)
  {
    start = paramLong;
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    return "";
  }
  
  public String toJSON()
  {
    return "";
  }
  
  public String toString()
  {
    long l1 = start;
    long l2 = end;
    if ((l1 <= l2) && (l2 != Long.MAX_VALUE))
    {
      String str = new String(mContent).substring((int)start, (int)end + 1);
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(getStrClass());
      localStringBuilder.append(" (");
      localStringBuilder.append(start);
      localStringBuilder.append(" : ");
      localStringBuilder.append(end);
      localStringBuilder.append(") <<");
      localStringBuilder.append(str);
      localStringBuilder.append(">>");
      return localStringBuilder.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass());
    localStringBuilder.append(" (INVALID, ");
    localStringBuilder.append(start);
    localStringBuilder.append("-");
    return z2.r(localStringBuilder, end, ")");
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLElement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */