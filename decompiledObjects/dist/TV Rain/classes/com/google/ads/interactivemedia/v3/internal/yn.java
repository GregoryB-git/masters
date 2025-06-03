package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class yn<T>
{
  public final T fromJson(Reader paramReader)
    throws IOException
  {
    return (T)read(new ada(paramReader));
  }
  
  public final T fromJson(String paramString)
    throws IOException
  {
    return (T)fromJson(new StringReader(paramString));
  }
  
  public final T fromJsonTree(yd paramyd)
  {
    try
    {
      aan localaan = new com/google/ads/interactivemedia/v3/internal/aan;
      localaan.<init>(paramyd);
      paramyd = read(localaan);
      return paramyd;
    }
    catch (IOException paramyd)
    {
      throw new yg(paramyd);
    }
  }
  
  public final yn<T> nullSafe()
  {
    return new yq(this);
  }
  
  public abstract T read(ada paramada)
    throws IOException;
  
  public final String toJson(T paramT)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      toJson(localStringWriter, paramT);
      return localStringWriter.toString();
    }
    catch (IOException paramT)
    {
      throw new AssertionError(paramT);
    }
  }
  
  public final void toJson(Writer paramWriter, T paramT)
    throws IOException
  {
    write(new adb(paramWriter), paramT);
  }
  
  public final yd toJsonTree(T paramT)
  {
    try
    {
      aap localaap = new com/google/ads/interactivemedia/v3/internal/aap;
      localaap.<init>();
      write(localaap, paramT);
      paramT = localaap.a();
      return paramT;
    }
    catch (IOException paramT)
    {
      throw new yg(paramT);
    }
  }
  
  public abstract void write(adb paramadb, T paramT)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */