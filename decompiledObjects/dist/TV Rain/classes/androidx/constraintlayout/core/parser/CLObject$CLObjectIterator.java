package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

class CLObject$CLObjectIterator
  implements Iterator
{
  public int index = 0;
  public CLObject myObject;
  
  public CLObject$CLObjectIterator(CLObject paramCLObject1, CLObject paramCLObject2)
  {
    myObject = paramCLObject2;
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

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLObject.CLObjectIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */