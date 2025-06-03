package t4;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;
import n7.d;

public final class a
  extends e9.a
{
  public static final Pattern d = Pattern.compile("(.+?)='(.*?)';", 32);
  public final CharsetDecoder b = d.c.newDecoder();
  public final CharsetDecoder c = d.b.newDecoder();
  
  /* Error */
  public final p4.a i(p4.d paramd, java.nio.ByteBuffer paramByteBuffer)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield 38	t4/a:b	Ljava/nio/charset/CharsetDecoder;
    //   6: aload_2
    //   7: invokevirtual 52	java/nio/charset/CharsetDecoder:decode	(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    //   10: invokevirtual 58	java/nio/CharBuffer:toString	()Ljava/lang/String;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 38	t4/a:b	Ljava/nio/charset/CharsetDecoder;
    //   18: astore 4
    //   20: goto +73 -> 93
    //   23: astore_1
    //   24: aload_0
    //   25: getfield 38	t4/a:b	Ljava/nio/charset/CharsetDecoder;
    //   28: invokevirtual 61	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   31: pop
    //   32: aload_2
    //   33: invokevirtual 67	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   36: pop
    //   37: aload_1
    //   38: athrow
    //   39: astore_1
    //   40: aload_0
    //   41: getfield 38	t4/a:b	Ljava/nio/charset/CharsetDecoder;
    //   44: invokevirtual 61	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   47: pop
    //   48: aload_2
    //   49: invokevirtual 67	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   52: pop
    //   53: aload_0
    //   54: getfield 42	t4/a:c	Ljava/nio/charset/CharsetDecoder;
    //   57: aload_2
    //   58: invokevirtual 52	java/nio/charset/CharsetDecoder:decode	(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    //   61: invokevirtual 58	java/nio/CharBuffer:toString	()Ljava/lang/String;
    //   64: astore_1
    //   65: goto +22 -> 87
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 42	t4/a:c	Ljava/nio/charset/CharsetDecoder;
    //   73: invokevirtual 61	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   76: pop
    //   77: aload_2
    //   78: invokevirtual 67	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   81: pop
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_0
    //   88: getfield 42	t4/a:c	Ljava/nio/charset/CharsetDecoder;
    //   91: astore 4
    //   93: aload 4
    //   95: invokevirtual 61	java/nio/charset/CharsetDecoder:reset	()Ljava/nio/charset/CharsetDecoder;
    //   98: pop
    //   99: aload_2
    //   100: invokevirtual 67	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   103: pop
    //   104: aload_2
    //   105: invokevirtual 73	java/nio/Buffer:limit	()I
    //   108: newarray <illegal type>
    //   110: astore 5
    //   112: aload_2
    //   113: aload 5
    //   115: invokevirtual 77	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   118: pop
    //   119: aload_1
    //   120: ifnonnull +29 -> 149
    //   123: new 79	p4/a
    //   126: dup
    //   127: iconst_1
    //   128: anewarray 81	p4/a$b
    //   131: dup
    //   132: iconst_0
    //   133: new 83	t4/c
    //   136: dup
    //   137: aload 5
    //   139: aconst_null
    //   140: aconst_null
    //   141: invokespecial 86	t4/c:<init>	([BLjava/lang/String;Ljava/lang/String;)V
    //   144: aastore
    //   145: invokespecial 89	p4/a:<init>	([Lp4/a$b;)V
    //   148: areturn
    //   149: getstatic 21	t4/a:d	Ljava/util/regex/Pattern;
    //   152: aload_1
    //   153: invokevirtual 93	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   156: astore 6
    //   158: aconst_null
    //   159: astore_2
    //   160: iconst_0
    //   161: istore 7
    //   163: aload_3
    //   164: astore_1
    //   165: aload 6
    //   167: iload 7
    //   169: invokevirtual 99	java/util/regex/Matcher:find	(I)Z
    //   172: ifeq +102 -> 274
    //   175: aload 6
    //   177: iconst_1
    //   178: invokevirtual 103	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   181: astore 8
    //   183: aload 6
    //   185: iconst_2
    //   186: invokevirtual 103	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   189: astore_3
    //   190: aload_2
    //   191: astore 4
    //   193: aload_1
    //   194: astore 9
    //   196: aload 8
    //   198: ifnull +60 -> 258
    //   201: aload 8
    //   203: invokestatic 109	x6/b:x0	(Ljava/lang/String;)Ljava/lang/String;
    //   206: astore 4
    //   208: aload 4
    //   210: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
    //   213: pop
    //   214: aload 4
    //   216: ldc 117
    //   218: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   221: ifne +31 -> 252
    //   224: aload 4
    //   226: ldc 125
    //   228: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   231: ifne +12 -> 243
    //   234: aload_2
    //   235: astore 4
    //   237: aload_1
    //   238: astore 9
    //   240: goto +18 -> 258
    //   243: aload_2
    //   244: astore 4
    //   246: aload_3
    //   247: astore 9
    //   249: goto +9 -> 258
    //   252: aload_3
    //   253: astore 4
    //   255: aload_1
    //   256: astore 9
    //   258: aload 6
    //   260: invokevirtual 128	java/util/regex/Matcher:end	()I
    //   263: istore 7
    //   265: aload 4
    //   267: astore_2
    //   268: aload 9
    //   270: astore_1
    //   271: goto -106 -> 165
    //   274: new 79	p4/a
    //   277: dup
    //   278: iconst_1
    //   279: anewarray 81	p4/a$b
    //   282: dup
    //   283: iconst_0
    //   284: new 83	t4/c
    //   287: dup
    //   288: aload 5
    //   290: aload_1
    //   291: aload_2
    //   292: invokespecial 86	t4/c:<init>	([BLjava/lang/String;Ljava/lang/String;)V
    //   295: aastore
    //   296: invokespecial 89	p4/a:<init>	([Lp4/a$b;)V
    //   299: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	this	a
    //   0	300	1	paramd	p4.d
    //   0	300	2	paramByteBuffer	java.nio.ByteBuffer
    //   1	252	3	str1	String
    //   18	248	4	localObject1	Object
    //   110	179	5	arrayOfByte	byte[]
    //   156	103	6	localMatcher	java.util.regex.Matcher
    //   161	103	7	i	int
    //   181	21	8	str2	String
    //   194	75	9	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	23	finally
    //   2	14	39	java/nio/charset/CharacterCodingException
    //   53	65	68	finally
    //   53	65	84	java/nio/charset/CharacterCodingException
  }
}

/* Location:
 * Qualified Name:     t4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */