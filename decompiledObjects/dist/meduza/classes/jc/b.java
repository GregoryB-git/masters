package jc;

import java.util.List;
import java.util.Map;

public abstract interface b<R>
  extends a
{
  public abstract R call(Object... paramVarArgs);
  
  public abstract R callBy(Map<Object, ? extends Object> paramMap);
  
  public abstract String getName();
  
  public abstract List<Object> getParameters();
  
  public abstract i getReturnType();
  
  public abstract List<Object> getTypeParameters();
  
  public abstract j getVisibility();
  
  public abstract boolean isAbstract();
  
  public abstract boolean isFinal();
  
  public abstract boolean isOpen();
  
  public abstract boolean isSuspend();
}

/* Location:
 * Qualified Name:     jc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */