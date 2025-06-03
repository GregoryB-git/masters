package androidx.constraintlayout.core.parser;

import a;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import z2;

public class CLContainer
  extends CLElement
{
  public ArrayList<CLElement> mElements = new ArrayList();
  
  public CLContainer(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLContainer(paramArrayOfChar);
  }
  
  public void add(CLElement paramCLElement)
  {
    mElements.add(paramCLElement);
    if (CLParser.DEBUG)
    {
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("added element ");
      localStringBuilder.append(paramCLElement);
      localStringBuilder.append(" to ");
      localStringBuilder.append(this);
      localPrintStream.println(localStringBuilder.toString());
    }
  }
  
  public CLElement get(int paramInt)
    throws CLParsingException
  {
    if ((paramInt >= 0) && (paramInt < mElements.size())) {
      return (CLElement)mElements.get(paramInt);
    }
    throw new CLParsingException(a.f("no element at index ", paramInt), this);
  }
  
  public CLElement get(String paramString)
    throws CLParsingException
  {
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLKey localCLKey = (CLKey)localIterator.next();
      if (localCLKey.content().equals(paramString)) {
        return localCLKey.getValue();
      }
    }
    throw new CLParsingException(z2.p("no element for key <", paramString, ">"), this);
  }
  
  public CLArray getArray(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if ((localCLElement instanceof CLArray)) {
      return (CLArray)localCLElement;
    }
    throw new CLParsingException(a.f("no array at index ", paramInt), this);
  }
  
  public CLArray getArray(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if ((localCLElement instanceof CLArray)) {
      return (CLArray)localCLElement;
    }
    paramString = a.s("no array found for key <", paramString, ">, found [");
    paramString.append(localCLElement.getStrClass());
    paramString.append("] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public CLArray getArrayOrNull(String paramString)
  {
    paramString = getOrNull(paramString);
    if ((paramString instanceof CLArray)) {
      return (CLArray)paramString;
    }
    return null;
  }
  
  public boolean getBoolean(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if ((localCLElement instanceof CLToken)) {
      return ((CLToken)localCLElement).getBoolean();
    }
    throw new CLParsingException(a.f("no boolean at index ", paramInt), this);
  }
  
  public boolean getBoolean(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if ((localCLElement instanceof CLToken)) {
      return ((CLToken)localCLElement).getBoolean();
    }
    paramString = a.s("no boolean found for key <", paramString, ">, found [");
    paramString.append(localCLElement.getStrClass());
    paramString.append("] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public float getFloat(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if (localCLElement != null) {
      return localCLElement.getFloat();
    }
    throw new CLParsingException(a.f("no float at index ", paramInt), this);
  }
  
  public float getFloat(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if (localCLElement != null) {
      return localCLElement.getFloat();
    }
    paramString = a.s("no float found for key <", paramString, ">, found [");
    paramString.append(localCLElement.getStrClass());
    paramString.append("] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public float getFloatOrNaN(String paramString)
  {
    paramString = getOrNull(paramString);
    if ((paramString instanceof CLNumber)) {
      return paramString.getFloat();
    }
    return NaN.0F;
  }
  
  public int getInt(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if (localCLElement != null) {
      return localCLElement.getInt();
    }
    throw new CLParsingException(a.f("no int at index ", paramInt), this);
  }
  
  public int getInt(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if (localCLElement != null) {
      return localCLElement.getInt();
    }
    paramString = a.s("no int found for key <", paramString, ">, found [");
    paramString.append(localCLElement.getStrClass());
    paramString.append("] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public CLObject getObject(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if ((localCLElement instanceof CLObject)) {
      return (CLObject)localCLElement;
    }
    throw new CLParsingException(a.f("no object at index ", paramInt), this);
  }
  
  public CLObject getObject(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if ((localCLElement instanceof CLObject)) {
      return (CLObject)localCLElement;
    }
    paramString = a.s("no object found for key <", paramString, ">, found [");
    paramString.append(localCLElement.getStrClass());
    paramString.append("] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public CLObject getObjectOrNull(String paramString)
  {
    paramString = getOrNull(paramString);
    if ((paramString instanceof CLObject)) {
      return (CLObject)paramString;
    }
    return null;
  }
  
  public CLElement getOrNull(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mElements.size())) {
      return (CLElement)mElements.get(paramInt);
    }
    return null;
  }
  
  public CLElement getOrNull(String paramString)
  {
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLKey localCLKey = (CLKey)localIterator.next();
      if (localCLKey.content().equals(paramString)) {
        return localCLKey.getValue();
      }
    }
    return null;
  }
  
  public String getString(int paramInt)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramInt);
    if ((localCLElement instanceof CLString)) {
      return localCLElement.content();
    }
    throw new CLParsingException(a.f("no string at index ", paramInt), this);
  }
  
  public String getString(String paramString)
    throws CLParsingException
  {
    CLElement localCLElement = get(paramString);
    if ((localCLElement instanceof CLString)) {
      return localCLElement.content();
    }
    String str = null;
    if (localCLElement != null) {
      str = localCLElement.getStrClass();
    }
    paramString = a.t("no string found for key <", paramString, ">, found [", str, "] : ");
    paramString.append(localCLElement);
    throw new CLParsingException(paramString.toString(), this);
  }
  
  public String getStringOrNull(int paramInt)
  {
    CLElement localCLElement = getOrNull(paramInt);
    if ((localCLElement instanceof CLString)) {
      return localCLElement.content();
    }
    return null;
  }
  
  public String getStringOrNull(String paramString)
  {
    paramString = getOrNull(paramString);
    if ((paramString instanceof CLString)) {
      return paramString.content();
    }
    return null;
  }
  
  public boolean has(String paramString)
  {
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLElement localCLElement = (CLElement)localIterator.next();
      if (((localCLElement instanceof CLKey)) && (((CLKey)localCLElement).content().equals(paramString))) {
        return true;
      }
    }
    return false;
  }
  
  public ArrayList<String> names()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLElement localCLElement = (CLElement)localIterator.next();
      if ((localCLElement instanceof CLKey)) {
        localArrayList.add(((CLKey)localCLElement).content());
      }
    }
    return localArrayList;
  }
  
  public void put(String paramString, CLElement paramCLElement)
  {
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLKey localCLKey = (CLKey)localIterator.next();
      if (localCLKey.content().equals(paramString))
      {
        localCLKey.set(paramCLElement);
        return;
      }
    }
    paramString = (CLKey)CLKey.allocate(paramString, paramCLElement);
    mElements.add(paramString);
  }
  
  public void putNumber(String paramString, float paramFloat)
  {
    put(paramString, new CLNumber(paramFloat));
  }
  
  public void remove(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mElements.iterator();
    while (localIterator.hasNext())
    {
      CLElement localCLElement = (CLElement)localIterator.next();
      if (((CLKey)localCLElement).content().equals(paramString)) {
        localArrayList.add(localCLElement);
      }
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramString = (CLElement)localIterator.next();
      mElements.remove(paramString);
    }
  }
  
  public int size()
  {
    return mElements.size();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = mElements.iterator();
    while (((Iterator)localObject).hasNext())
    {
      CLElement localCLElement = (CLElement)((Iterator)localObject).next();
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append("; ");
      }
      localStringBuilder.append(localCLElement);
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(super.toString());
    ((StringBuilder)localObject).append(" = <");
    ((StringBuilder)localObject).append(localStringBuilder);
    ((StringBuilder)localObject).append(" >");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */