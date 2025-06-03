package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

public class CLObject
  extends CLContainer
  implements Iterable<CLKey>
{
  public CLObject(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLObject allocate(char[] paramArrayOfChar)
  {
    return new CLObject(paramArrayOfChar);
  }
  
  public Iterator iterator()
  {
    return new CLObjectIterator(this);
  }
  
  public String toFormattedJSON()
  {
    return toFormattedJSON(0, 0);
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder(getDebugName());
    localStringBuilder.append("{\n");
    Iterator localIterator = mElements.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      CLElement localCLElement = (CLElement)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(",\n");
      } else {
        i = 0;
      }
      localStringBuilder.append(localCLElement.toFormattedJSON(CLElement.BASE_INDENT + paramInt1, paramInt2 - 1));
    }
    localStringBuilder.append("\n");
    addIndent(localStringBuilder, paramInt1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public String toJSON()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(getDebugName());
    ((StringBuilder)localObject).append("{ ");
    StringBuilder localStringBuilder = new StringBuilder(((StringBuilder)localObject).toString());
    Iterator localIterator = mElements.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      localObject = (CLElement)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      } else {
        i = 0;
      }
      localStringBuilder.append(((CLElement)localObject).toJSON());
    }
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public class CLObjectIterator
    implements Iterator
  {
    public int index = 0;
    public CLObject myObject;
    
    public CLObjectIterator(CLObject paramCLObject)
    {
      myObject = paramCLObject;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (index < myObject.size()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Object next()
    {
      CLKey localCLKey = (CLKey)myObject.mElements.get(index);
      index += 1;
      return localCLKey;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */