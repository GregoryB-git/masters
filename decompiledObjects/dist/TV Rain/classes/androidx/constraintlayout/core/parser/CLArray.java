package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

public class CLArray
  extends CLContainer
{
  public CLArray(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLArray(paramArrayOfChar);
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = toJSON();
    if ((paramInt2 <= 0) && (((String)localObject).length() + paramInt1 < CLElement.MAX_LINE))
    {
      localStringBuilder.append((String)localObject);
    }
    else
    {
      localStringBuilder.append("[\n");
      localObject = mElements.iterator();
      int i = 1;
      while (((Iterator)localObject).hasNext())
      {
        CLElement localCLElement = (CLElement)((Iterator)localObject).next();
        if (i == 0) {
          localStringBuilder.append(",\n");
        } else {
          i = 0;
        }
        addIndent(localStringBuilder, CLElement.BASE_INDENT + paramInt1);
        localStringBuilder.append(localCLElement.toFormattedJSON(CLElement.BASE_INDENT + paramInt1, paramInt2 - 1));
      }
      localStringBuilder.append("\n");
      addIndent(localStringBuilder, paramInt1);
      localStringBuilder.append("]");
    }
    return localStringBuilder.toString();
  }
  
  public String toJSON()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(getDebugName());
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = new StringBuilder(localStringBuilder1.toString());
    int i = 1;
    for (int j = 0; j < mElements.size(); j++)
    {
      if (i == 0) {
        localStringBuilder2.append(", ");
      } else {
        i = 0;
      }
      localStringBuilder2.append(((CLElement)mElements.get(j)).toJSON());
    }
    localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(localStringBuilder2);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */