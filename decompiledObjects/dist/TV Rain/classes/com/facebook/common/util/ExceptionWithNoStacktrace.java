package com.facebook.common.util;

public class ExceptionWithNoStacktrace
  extends Exception
{
  public ExceptionWithNoStacktrace(String paramString)
  {
    super(paramString);
  }
  
  public Throwable fillInStackTrace()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.util.ExceptionWithNoStacktrace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */