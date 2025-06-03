package eb;

import f;
import g;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.d;
import p2.m0;
import x6.b;

public abstract class s0$d<T>
{
  public static final BitSet d;
  public final String a;
  public final byte[] b;
  public final Object c;
  
  static
  {
    BitSet localBitSet = new BitSet(127);
    localBitSet.set(45);
    localBitSet.set(95);
    localBitSet.set(46);
    for (int i = 48; i <= 57; i = (char)(i + 1)) {
      localBitSet.set(i);
    }
    for (i = 97; i <= 122; i = (char)(i + 1)) {
      localBitSet.set(i);
    }
    d = localBitSet;
  }
  
  public s0$d(String paramString, boolean paramBoolean, Object paramObject)
  {
    paramString = paramString.toLowerCase(Locale.ROOT);
    b.y(paramString, "name");
    b.s("token must have at least 1 tchar", paramString.isEmpty() ^ true);
    if (paramString.equals("connection")) {
      s0.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
    }
    int i = 0;
    while (i < paramString.length())
    {
      char c1 = paramString.charAt(i);
      if (((paramBoolean) && (c1 == ':') && (i == 0)) || (d.get(c1))) {
        i++;
      } else {
        throw new IllegalArgumentException(m0.X("Invalid character '%s' in key name '%s'", new Object[] { Character.valueOf(c1), paramString }));
      }
    }
    a = paramString;
    b = paramString.getBytes(d.a);
    c = paramObject;
  }
  
  public abstract T a(byte[] paramArrayOfByte);
  
  public abstract byte[] b(Serializable paramSerializable);
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return g.f(f.l("Key{name='"), a, "'}");
  }
}

/* Location:
 * Qualified Name:     eb.s0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */