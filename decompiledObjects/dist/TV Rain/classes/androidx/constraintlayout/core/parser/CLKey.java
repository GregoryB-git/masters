package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import z2;

public class CLKey
  extends CLContainer
{
  private static ArrayList<String> sections;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    sections = localArrayList;
    localArrayList.add("ConstraintSets");
    sections.add("Variables");
    sections.add("Generate");
    sections.add("Transitions");
    sections.add("KeyFrames");
    sections.add("KeyAttributes");
    sections.add("KeyPositions");
    sections.add("KeyCycles");
  }
  
  public CLKey(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement allocate(String paramString, CLElement paramCLElement)
  {
    CLKey localCLKey = new CLKey(paramString.toCharArray());
    localCLKey.setStart(0L);
    localCLKey.setEnd(paramString.length() - 1);
    localCLKey.set(paramCLElement);
    return localCLKey;
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLKey(paramArrayOfChar);
  }
  
  public String getName()
  {
    return content();
  }
  
  public CLElement getValue()
  {
    if (mElements.size() > 0) {
      return (CLElement)mElements.get(0);
    }
    return null;
  }
  
  public void set(CLElement paramCLElement)
  {
    if (mElements.size() > 0) {
      mElements.set(0, paramCLElement);
    } else {
      mElements.add(paramCLElement);
    }
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(getDebugName());
    addIndent(localStringBuilder, paramInt1);
    String str = content();
    if (mElements.size() > 0)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(": ");
      if (sections.contains(str)) {
        paramInt2 = 3;
      }
      if (paramInt2 > 0)
      {
        localStringBuilder.append(((CLElement)mElements.get(0)).toFormattedJSON(paramInt1, paramInt2 - 1));
      }
      else
      {
        str = ((CLElement)mElements.get(0)).toJSON();
        if (str.length() + paramInt1 < CLElement.MAX_LINE) {
          localStringBuilder.append(str);
        } else {
          localStringBuilder.append(((CLElement)mElements.get(0)).toFormattedJSON(paramInt1, paramInt2 - 1));
        }
      }
      return localStringBuilder.toString();
    }
    return z2.o(str, ": <> ");
  }
  
  public String toJSON()
  {
    if (mElements.size() > 0)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(getDebugName());
      localStringBuilder.append(content());
      localStringBuilder.append(": ");
      localStringBuilder.append(((CLElement)mElements.get(0)).toJSON());
      return localStringBuilder.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getDebugName());
    localStringBuilder.append(content());
    localStringBuilder.append(": <> ");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */