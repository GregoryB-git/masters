package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public abstract class a
  implements O
{
  protected int memoizedHashCode = 0;
  
  public abstract int e(e0 parame0);
  
  public byte[] f()
  {
    try
    {
      byte[] arrayOfByte = new byte[a()];
      k localk = k.U(arrayOfByte);
      g(localk);
      localk.c();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(h("byte array"), localIOException);
    }
  }
  
  public final String h(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Serializing ");
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append(" to a ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" threw an IOException (should never happen).");
    return localStringBuilder.toString();
  }
  
  public j0 i()
  {
    return new j0(this);
  }
  
  public h j()
  {
    try
    {
      Object localObject = h.T(a());
      g(((h.h)localObject).b());
      localObject = ((h.h)localObject).a();
      return (h)localObject;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(h("ByteString"), localIOException);
    }
  }
  
  public static abstract class a
    implements O.a
  {
    public static j0 l(O paramO)
    {
      return new j0(paramO);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */