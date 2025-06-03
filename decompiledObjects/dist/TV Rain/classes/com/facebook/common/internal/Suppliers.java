package com.facebook.common.internal;

public class Suppliers
{
  public static final Supplier<Boolean> BOOLEAN_FALSE = new Supplier()
  {
    public Boolean get()
    {
      return Boolean.FALSE;
    }
  };
  public static final Supplier<Boolean> BOOLEAN_TRUE = new Supplier()
  {
    public Boolean get()
    {
      return Boolean.TRUE;
    }
  };
  
  public static <T> Supplier<T> of(T paramT)
  {
    new Supplier()
    {
      public T get()
      {
        return (T)val$instance;
      }
    };
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Suppliers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */