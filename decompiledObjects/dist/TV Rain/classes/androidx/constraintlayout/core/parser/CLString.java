package androidx.constraintlayout.core.parser;

import z2;

public class CLString
  extends CLElement
{
  public CLString(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLString(paramArrayOfChar);
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    addIndent(localStringBuilder, paramInt1);
    localStringBuilder.append("'");
    localStringBuilder.append(content());
    localStringBuilder.append("'");
    return localStringBuilder.toString();
  }
  
  public String toJSON()
  {
    StringBuilder localStringBuilder = z2.t("'");
    localStringBuilder.append(content());
    localStringBuilder.append("'");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLString
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */