package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public class j0
  extends RuntimeException
{
  private static final long serialVersionUID = -7466929953374883507L;
  public final List o = null;
  
  public j0(O paramO)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public A a()
  {
    return new A(getMessage());
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */