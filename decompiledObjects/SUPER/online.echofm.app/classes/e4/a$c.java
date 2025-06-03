package e4;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class a$c
  implements a.b
{
  public static ThreadLocal c = new a();
  public static ThreadLocal d = new b();
  public StringBuilder a = new StringBuilder();
  public ByteBuffer b;
  
  public boolean a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = c(paramArrayOfByte);
    if (paramArrayOfByte != null)
    {
      a.append(paramArrayOfByte);
      return true;
    }
    return false;
  }
  
  public g b()
  {
    if (b != null) {
      return null;
    }
    return new g(a.toString());
  }
  
  public final String c(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
      paramArrayOfByte = ((CharsetDecoder)c.get()).decode(paramArrayOfByte).toString();
      return paramArrayOfByte;
    }
    catch (CharacterCodingException paramArrayOfByte) {}
    return null;
  }
  
  public class a
    extends ThreadLocal
  {
    public CharsetDecoder a()
    {
      CharsetDecoder localCharsetDecoder = Charset.forName("UTF8").newDecoder();
      CodingErrorAction localCodingErrorAction = CodingErrorAction.REPORT;
      localCharsetDecoder.onMalformedInput(localCodingErrorAction);
      localCharsetDecoder.onUnmappableCharacter(localCodingErrorAction);
      return localCharsetDecoder;
    }
  }
  
  public class b
    extends ThreadLocal
  {
    public CharsetEncoder a()
    {
      CharsetEncoder localCharsetEncoder = Charset.forName("UTF8").newEncoder();
      CodingErrorAction localCodingErrorAction = CodingErrorAction.REPORT;
      localCharsetEncoder.onMalformedInput(localCodingErrorAction);
      localCharsetEncoder.onUnmappableCharacter(localCodingErrorAction);
      return localCharsetEncoder;
    }
  }
}

/* Location:
 * Qualified Name:     e4.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */