package S0;

import O0.b;
import W2.e;
import d0.x;
import d0.x.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends O0.c
{
  public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
  public final CharsetDecoder a = e.c.newDecoder();
  public final CharsetDecoder b = e.b.newDecoder();
  
  public x b(b paramb, ByteBuffer paramByteBuffer)
  {
    Object localObject1 = c(paramByteBuffer);
    byte[] arrayOfByte = new byte[paramByteBuffer.limit()];
    paramByteBuffer.get(arrayOfByte);
    paramb = null;
    if (localObject1 == null) {
      return new x(new x.b[] { new c(arrayOfByte, null, null) });
    }
    Matcher localMatcher = c.matcher((CharSequence)localObject1);
    int i = 0;
    paramByteBuffer = null;
    while (localMatcher.find(i))
    {
      String str1 = localMatcher.group(1);
      String str2 = localMatcher.group(2);
      localObject1 = paramByteBuffer;
      Object localObject2 = paramb;
      if (str1 != null)
      {
        localObject1 = W2.c.e(str1);
        ((String)localObject1).hashCode();
        if (!((String)localObject1).equals("streamurl"))
        {
          if (!((String)localObject1).equals("streamtitle"))
          {
            localObject1 = paramByteBuffer;
            localObject2 = paramb;
          }
          else
          {
            localObject1 = paramByteBuffer;
            localObject2 = str2;
          }
        }
        else
        {
          localObject1 = str2;
          localObject2 = paramb;
        }
      }
      i = localMatcher.end();
      paramByteBuffer = (ByteBuffer)localObject1;
      paramb = (b)localObject2;
    }
    return new x(new x.b[] { new c(arrayOfByte, paramb, paramByteBuffer) });
  }
  
  /* Error */
  public final String c(ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	S0/a:a	Ljava/nio/charset/CharsetDecoder;
    //   4: aload_1
    //   5: invokevirtual 114	java/nio/charset/CharsetDecoder:decode	(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    //   8: invokevirtual 120	java/nio/CharBuffer:toString	()Ljava/lang/String;
    //   11: astore_2
    //   12: aload_0
    //   13: getfield 38	S0/a:a	Ljava/nio/charset/CharsetDecoder;
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 123	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   21: pop
    //   22: aload_1
    //   23: invokevirtual 127	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   26: pop
    //   27: aload_2
    //   28: areturn
    //   29: astore_2
    //   30: aload_0
    //   31: getfield 38	S0/a:a	Ljava/nio/charset/CharsetDecoder;
    //   34: invokevirtual 123	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   37: pop
    //   38: aload_1
    //   39: invokevirtual 127	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   42: pop
    //   43: aload_2
    //   44: athrow
    //   45: astore_2
    //   46: aload_0
    //   47: getfield 38	S0/a:a	Ljava/nio/charset/CharsetDecoder;
    //   50: invokevirtual 123	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   53: pop
    //   54: aload_1
    //   55: invokevirtual 127	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   58: pop
    //   59: aload_0
    //   60: getfield 42	S0/a:b	Ljava/nio/charset/CharsetDecoder;
    //   63: aload_1
    //   64: invokevirtual 114	java/nio/charset/CharsetDecoder:decode	(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    //   67: invokevirtual 120	java/nio/CharBuffer:toString	()Ljava/lang/String;
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 42	S0/a:b	Ljava/nio/charset/CharsetDecoder;
    //   75: astore_3
    //   76: goto -59 -> 17
    //   79: astore_2
    //   80: aload_0
    //   81: getfield 42	S0/a:b	Ljava/nio/charset/CharsetDecoder;
    //   84: invokevirtual 123	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   87: pop
    //   88: aload_1
    //   89: invokevirtual 127	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   92: pop
    //   93: aload_2
    //   94: athrow
    //   95: astore_2
    //   96: aload_0
    //   97: getfield 42	S0/a:b	Ljava/nio/charset/CharsetDecoder;
    //   100: invokevirtual 123	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   103: pop
    //   104: aload_1
    //   105: invokevirtual 127	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   108: pop
    //   109: aconst_null
    //   110: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	a
    //   0	111	1	paramByteBuffer	ByteBuffer
    //   11	17	2	str1	String
    //   29	15	2	localObject1	Object
    //   45	1	2	localCharacterCodingException1	java.nio.charset.CharacterCodingException
    //   70	1	2	str2	String
    //   79	15	2	localObject2	Object
    //   95	1	2	localCharacterCodingException2	java.nio.charset.CharacterCodingException
    //   16	60	3	localCharsetDecoder	CharsetDecoder
    // Exception table:
    //   from	to	target	type
    //   0	12	29	finally
    //   0	12	45	java/nio/charset/CharacterCodingException
    //   59	71	79	finally
    //   59	71	95	java/nio/charset/CharacterCodingException
  }
}

/* Location:
 * Qualified Name:     S0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */