package e4;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
  public static b a(byte paramByte)
  {
    if (paramByte == 2) {
      return new a();
    }
    return new c();
  }
  
  public static class a
    implements a.b
  {
    public List a = new ArrayList();
    public int b = 0;
    
    public boolean a(byte[] paramArrayOfByte)
    {
      a.add(paramArrayOfByte);
      b += paramArrayOfByte.length;
      return true;
    }
    
    public g b()
    {
      byte[] arrayOfByte1 = new byte[b];
      int i = 0;
      int j = i;
      while (i < a.size())
      {
        byte[] arrayOfByte2 = (byte[])a.get(i);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, arrayOfByte2.length);
        j += arrayOfByte2.length;
        i++;
      }
      return new g(arrayOfByte1);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a(byte[] paramArrayOfByte);
    
    public abstract g b();
  }
  
  public static class c
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
}

/* Location:
 * Qualified Name:     e4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */