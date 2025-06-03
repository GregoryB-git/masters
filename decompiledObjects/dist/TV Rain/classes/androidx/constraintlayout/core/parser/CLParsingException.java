package androidx.constraintlayout.core.parser;

import z2;

public class CLParsingException
  extends Exception
{
  private final String mElementClass;
  private final int mLineNumber;
  private final String mReason;
  
  public CLParsingException(String paramString, CLElement paramCLElement)
  {
    mReason = paramString;
    if (paramCLElement != null)
    {
      mElementClass = paramCLElement.getStrClass();
      mLineNumber = paramCLElement.getLine();
    }
    else
    {
      mElementClass = "unknown";
      mLineNumber = 0;
    }
  }
  
  public String reason()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mReason);
    localStringBuilder.append(" (");
    localStringBuilder.append(mElementClass);
    localStringBuilder.append(" at line ");
    return z2.q(localStringBuilder, mLineNumber, ")");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("CLParsingException (");
    localStringBuilder.append(hashCode());
    localStringBuilder.append(") : ");
    localStringBuilder.append(reason());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLParsingException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */