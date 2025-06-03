package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import java.util.ArrayList;
import z2;

public class CLParser
{
  public static boolean DEBUG = false;
  private boolean hasComment = false;
  private int lineNumber;
  private String mContent;
  
  public CLParser(String paramString)
  {
    mContent = paramString;
  }
  
  private CLElement createElement(CLElement paramCLElement, int paramInt, TYPE paramTYPE, boolean paramBoolean, char[] paramArrayOfChar)
  {
    if (DEBUG)
    {
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CREATE ");
      localStringBuilder.append(paramTYPE);
      localStringBuilder.append(" at ");
      localStringBuilder.append(paramArrayOfChar[paramInt]);
      localPrintStream.println(localStringBuilder.toString());
    }
    switch (1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[paramTYPE.ordinal()])
    {
    default: 
      paramTYPE = null;
      break;
    case 6: 
      paramTYPE = CLToken.allocate(paramArrayOfChar);
      break;
    case 5: 
      paramTYPE = CLKey.allocate(paramArrayOfChar);
      break;
    case 4: 
      paramTYPE = CLNumber.allocate(paramArrayOfChar);
      break;
    case 3: 
      paramTYPE = CLString.allocate(paramArrayOfChar);
      break;
    case 2: 
      paramTYPE = CLArray.allocate(paramArrayOfChar);
      break;
    case 1: 
      paramTYPE = CLObject.allocate(paramArrayOfChar);
    }
    paramInt++;
    if (paramTYPE == null) {
      return null;
    }
    paramTYPE.setLine(lineNumber);
    if (paramBoolean) {
      paramTYPE.setStart(paramInt);
    }
    if ((paramCLElement instanceof CLContainer)) {
      paramTYPE.setContainer((CLContainer)paramCLElement);
    }
    return paramTYPE;
  }
  
  private CLElement getNextJsonElement(int paramInt, char paramChar, CLElement paramCLElement, char[] paramArrayOfChar)
    throws CLParsingException
  {
    CLElement localCLElement = paramCLElement;
    if (paramChar != '\t')
    {
      localCLElement = paramCLElement;
      if (paramChar != '\n')
      {
        localCLElement = paramCLElement;
        if (paramChar != '\r')
        {
          localCLElement = paramCLElement;
          if (paramChar != ' ')
          {
            if ((paramChar != '"') && (paramChar != '\'')) {
              if (paramChar != '[') {
                if (paramChar != ']') {
                  if (paramChar != '{')
                  {
                    if (paramChar == '}') {
                      break label346;
                    }
                    localCLElement = paramCLElement;
                  }
                }
              }
            }
            switch (paramChar)
            {
            default: 
              if (((paramCLElement instanceof CLContainer)) && (!(paramCLElement instanceof CLObject)))
              {
                localCLElement = createElement(paramCLElement, paramInt, TYPE.TOKEN, true, paramArrayOfChar);
                paramCLElement = (CLToken)localCLElement;
                if (!paramCLElement.validate(paramChar, paramInt))
                {
                  paramArrayOfChar = new StringBuilder();
                  paramArrayOfChar.append("incorrect token <");
                  paramArrayOfChar.append(paramChar);
                  paramArrayOfChar.append("> at line ");
                  paramArrayOfChar.append(lineNumber);
                  throw new CLParsingException(paramArrayOfChar.toString(), paramCLElement);
                }
              }
              else
              {
                localCLElement = createElement(paramCLElement, paramInt, TYPE.KEY, true, paramArrayOfChar);
              }
              break;
            case '/': 
              paramInt++;
              localCLElement = paramCLElement;
              if (paramInt < paramArrayOfChar.length)
              {
                localCLElement = paramCLElement;
                if (paramArrayOfChar[paramInt] == '/')
                {
                  hasComment = true;
                  localCLElement = paramCLElement;
                }
              }
              break;
            case '+': 
            case '-': 
            case '.': 
            case '0': 
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': 
              localCLElement = createElement(paramCLElement, paramInt, TYPE.NUMBER, true, paramArrayOfChar);
              break;
              localCLElement = createElement(paramCLElement, paramInt, TYPE.OBJECT, true, paramArrayOfChar);
              break;
              label346:
              paramCLElement.setEnd(paramInt - 1);
              localCLElement = paramCLElement.getContainer();
              localCLElement.setEnd(paramInt);
              break;
              localCLElement = createElement(paramCLElement, paramInt, TYPE.ARRAY, true, paramArrayOfChar);
              break;
              if ((paramCLElement instanceof CLObject)) {
                localCLElement = createElement(paramCLElement, paramInt, TYPE.KEY, true, paramArrayOfChar);
              } else {
                localCLElement = createElement(paramCLElement, paramInt, TYPE.STRING, true, paramArrayOfChar);
              }
              break;
            }
          }
        }
      }
    }
    return localCLElement;
  }
  
  public static CLObject parse(String paramString)
    throws CLParsingException
  {
    return new CLParser(paramString).parse();
  }
  
  public CLObject parse()
    throws CLParsingException
  {
    char[] arrayOfChar = mContent.toCharArray();
    int i = arrayOfChar.length;
    lineNumber = 1;
    char c1;
    for (int j = 0; j < i; j++)
    {
      c1 = arrayOfChar[j];
      if (c1 == '{') {
        break label63;
      }
      if (c1 == '\n') {
        lineNumber += 1;
      }
    }
    j = -1;
    label63:
    if (j != -1)
    {
      CLObject localCLObject = CLObject.allocate(arrayOfChar);
      localCLObject.setLine(lineNumber);
      localCLObject.setStart(j);
      j++;
      Object localObject2;
      for (Object localObject1 = localCLObject;; localObject1 = localObject2)
      {
        localObject2 = localObject1;
        if (j >= i) {
          break;
        }
        char c2 = arrayOfChar[j];
        if (c2 == '\n') {
          lineNumber += 1;
        }
        if (hasComment)
        {
          localObject2 = localObject1;
          if (c2 == '\n') {
            hasComment = false;
          }
        }
        else
        {
          if (localObject1 == null)
          {
            localObject2 = localObject1;
            break;
          }
          if (((CLElement)localObject1).isDone()) {
            localObject1 = getNextJsonElement(j, c2, (CLElement)localObject1, arrayOfChar);
          }
          Object localObject3;
          for (;;)
          {
            localObject3 = localObject1;
            break;
            if ((localObject1 instanceof CLObject))
            {
              if (c2 == '}')
              {
                ((CLElement)localObject1).setEnd(j - 1);
                localObject3 = localObject1;
                break;
              }
              localObject1 = getNextJsonElement(j, c2, (CLElement)localObject1, arrayOfChar);
            }
            else if ((localObject1 instanceof CLArray))
            {
              if (c2 == ']')
              {
                ((CLElement)localObject1).setEnd(j - 1);
                localObject3 = localObject1;
                break;
              }
              localObject1 = getNextJsonElement(j, c2, (CLElement)localObject1, arrayOfChar);
            }
            else
            {
              boolean bool = localObject1 instanceof CLString;
              if (bool)
              {
                l = start;
                localObject3 = localObject1;
                if (arrayOfChar[((int)l)] != c2) {
                  break;
                }
                ((CLElement)localObject1).setStart(l + 1L);
                ((CLElement)localObject1).setEnd(j - 1);
                localObject3 = localObject1;
                break;
              }
              if ((localObject1 instanceof CLToken))
              {
                localObject2 = (CLToken)localObject1;
                if (!((CLToken)localObject2).validate(c2, j))
                {
                  localObject1 = z2.t("parsing incorrect token ");
                  ((StringBuilder)localObject1).append(((CLElement)localObject2).content());
                  ((StringBuilder)localObject1).append(" at line ");
                  ((StringBuilder)localObject1).append(lineNumber);
                  throw new CLParsingException(((StringBuilder)localObject1).toString(), (CLElement)localObject2);
                }
              }
              if (((localObject1 instanceof CLKey)) || (bool))
              {
                l = start;
                c1 = arrayOfChar[((int)l)];
                if (((c1 == '\'') || (c1 == '"')) && (c1 == c2))
                {
                  ((CLElement)localObject1).setStart(l + 1L);
                  ((CLElement)localObject1).setEnd(j - 1);
                }
              }
              localObject3 = localObject1;
              if (((CLElement)localObject1).isDone()) {
                break;
              }
              if ((c2 != '}') && (c2 != ']') && (c2 != ',') && (c2 != ' ') && (c2 != '\t') && (c2 != '\r') && (c2 != '\n'))
              {
                localObject3 = localObject1;
                if (c2 != ':') {
                  break;
                }
              }
              long l = j - 1;
              ((CLElement)localObject1).setEnd(l);
              if (c2 != '}')
              {
                localObject3 = localObject1;
                if (c2 != ']') {
                  break;
                }
              }
              localObject2 = ((CLElement)localObject1).getContainer();
              ((CLElement)localObject2).setEnd(l);
              localObject1 = localObject2;
              if ((localObject2 instanceof CLKey))
              {
                localObject1 = ((CLElement)localObject2).getContainer();
                ((CLElement)localObject1).setEnd(l);
              }
            }
          }
          localObject2 = localObject3;
          if (((CLElement)localObject3).isDone()) {
            if ((localObject3 instanceof CLKey))
            {
              localObject2 = localObject3;
              if (mElements.size() <= 0) {}
            }
            else
            {
              localObject2 = ((CLElement)localObject3).getContainer();
            }
          }
        }
        j++;
      }
      while ((localObject2 != null) && (!((CLElement)localObject2).isDone()))
      {
        if ((localObject2 instanceof CLString)) {
          ((CLElement)localObject2).setStart((int)start + 1);
        }
        ((CLElement)localObject2).setEnd(i - 1);
        localObject2 = ((CLElement)localObject2).getContainer();
      }
      if (DEBUG)
      {
        localObject1 = System.out;
        localObject2 = z2.t("Root: ");
        ((StringBuilder)localObject2).append(localCLObject.toJSON());
        ((PrintStream)localObject1).println(((StringBuilder)localObject2).toString());
      }
      return localCLObject;
    }
    throw new CLParsingException("invalid json content", null);
  }
  
  public static enum TYPE
  {
    static
    {
      TYPE localTYPE1 = new TYPE("UNKNOWN", 0);
      UNKNOWN = localTYPE1;
      TYPE localTYPE2 = new TYPE("OBJECT", 1);
      OBJECT = localTYPE2;
      TYPE localTYPE3 = new TYPE("ARRAY", 2);
      ARRAY = localTYPE3;
      TYPE localTYPE4 = new TYPE("NUMBER", 3);
      NUMBER = localTYPE4;
      TYPE localTYPE5 = new TYPE("STRING", 4);
      STRING = localTYPE5;
      TYPE localTYPE6 = new TYPE("KEY", 5);
      KEY = localTYPE6;
      TYPE localTYPE7 = new TYPE("TOKEN", 6);
      TOKEN = localTYPE7;
      $VALUES = new TYPE[] { localTYPE1, localTYPE2, localTYPE3, localTYPE4, localTYPE5, localTYPE6, localTYPE7 };
    }
    
    private TYPE() {}
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */