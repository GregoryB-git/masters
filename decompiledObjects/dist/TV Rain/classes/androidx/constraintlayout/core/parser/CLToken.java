package androidx.constraintlayout.core.parser;

import z2;

public class CLToken
  extends CLElement
{
  public int index = 0;
  public char[] tokenFalse = "false".toCharArray();
  public char[] tokenNull = "null".toCharArray();
  public char[] tokenTrue = "true".toCharArray();
  public Type type = Type.UNKNOWN;
  
  public CLToken(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLToken(paramArrayOfChar);
  }
  
  public boolean getBoolean()
    throws CLParsingException
  {
    Object localObject = type;
    if (localObject == Type.TRUE) {
      return true;
    }
    if (localObject == Type.FALSE) {
      return false;
    }
    localObject = z2.t("this token is not a boolean: <");
    ((StringBuilder)localObject).append(content());
    ((StringBuilder)localObject).append(">");
    throw new CLParsingException(((StringBuilder)localObject).toString(), this);
  }
  
  public Type getType()
  {
    return type;
  }
  
  public boolean isNull()
    throws CLParsingException
  {
    if (type == Type.NULL) {
      return true;
    }
    StringBuilder localStringBuilder = z2.t("this token is not a null: <");
    localStringBuilder.append(content());
    localStringBuilder.append(">");
    throw new CLParsingException(localStringBuilder.toString(), this);
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    addIndent(localStringBuilder, paramInt1);
    localStringBuilder.append(content());
    return localStringBuilder.toString();
  }
  
  public String toJSON()
  {
    if (CLParser.DEBUG)
    {
      StringBuilder localStringBuilder = z2.t("<");
      localStringBuilder.append(content());
      localStringBuilder.append(">");
      return localStringBuilder.toString();
    }
    return content();
  }
  
  public boolean validate(char paramChar, long paramLong)
  {
    int i = 1.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[type.ordinal()];
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    char[] arrayOfChar;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            bool1 = bool3;
          }
          else
          {
            arrayOfChar = tokenTrue;
            i = index;
            if (arrayOfChar[i] == paramChar) {
              type = Type.TRUE;
            }
            for (;;)
            {
              bool1 = true;
              break;
              if (tokenFalse[i] == paramChar)
              {
                type = Type.FALSE;
              }
              else
              {
                bool1 = bool3;
                if (tokenNull[i] != paramChar) {
                  break;
                }
                type = Type.NULL;
              }
            }
          }
        }
        else
        {
          arrayOfChar = tokenNull;
          i = index;
          if (arrayOfChar[i] == paramChar) {
            bool4 = true;
          }
          bool1 = bool4;
          if (bool4)
          {
            bool1 = bool4;
            if (i + 1 == arrayOfChar.length)
            {
              setEnd(paramLong);
              bool1 = bool4;
            }
          }
        }
      }
      else
      {
        arrayOfChar = tokenFalse;
        i = index;
        bool4 = bool1;
        if (arrayOfChar[i] == paramChar) {
          bool4 = true;
        }
        bool1 = bool4;
        if (bool4)
        {
          bool1 = bool4;
          if (i + 1 == arrayOfChar.length)
          {
            setEnd(paramLong);
            bool1 = bool4;
          }
        }
      }
    }
    else
    {
      arrayOfChar = tokenTrue;
      i = index;
      bool4 = bool2;
      if (arrayOfChar[i] == paramChar) {
        bool4 = true;
      }
      bool1 = bool4;
      if (bool4)
      {
        bool1 = bool4;
        if (i + 1 == arrayOfChar.length)
        {
          setEnd(paramLong);
          bool1 = bool4;
        }
      }
    }
    index += 1;
    return bool1;
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("UNKNOWN", 0);
      UNKNOWN = localType1;
      Type localType2 = new Type("TRUE", 1);
      TRUE = localType2;
      Type localType3 = new Type("FALSE", 2);
      FALSE = localType3;
      Type localType4 = new Type("NULL", 3);
      NULL = localType4;
      $VALUES = new Type[] { localType1, localType2, localType3, localType4 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */