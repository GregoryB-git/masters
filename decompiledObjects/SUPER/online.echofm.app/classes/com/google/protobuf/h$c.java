package com.google.protobuf;

import java.io.IOException;

public class h$c
  extends IOException
{
  private static final long serialVersionUID = -6947486886997889499L;
  
  public h$c(String paramString, Throwable paramThrowable)
  {
    super(localStringBuilder.toString(), paramThrowable);
  }
  
  public h$c(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */