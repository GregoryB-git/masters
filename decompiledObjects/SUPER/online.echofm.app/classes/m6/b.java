package m6;

import java.util.List;
import java.util.Map;

public abstract interface b
  extends a
{
  public abstract Object call(Object... paramVarArgs);
  
  public abstract Object callBy(Map paramMap);
  
  public abstract List getParameters();
  
  public abstract i getReturnType();
  
  public abstract List getTypeParameters();
  
  public abstract j getVisibility();
  
  public abstract boolean isAbstract();
  
  public abstract boolean isFinal();
  
  public abstract boolean isOpen();
}

/* Location:
 * Qualified Name:     m6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */