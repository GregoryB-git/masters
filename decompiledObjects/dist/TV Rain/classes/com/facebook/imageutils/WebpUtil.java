package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

public class WebpUtil
{
  private static final String VP8L_HEADER = "VP8L";
  private static final String VP8X_HEADER = "VP8X";
  private static final String VP8_HEADER = "VP8 ";
  
  private static boolean compare(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != paramString.length()) {
      return false;
    }
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      if (paramString.charAt(i) != paramArrayOfByte[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static int get2BytesAsInt(InputStream paramInputStream)
    throws IOException
  {
    int i = (byte)paramInputStream.read();
    return (byte)paramInputStream.read() << 8 & 0xFF00 | i & 0xFF;
  }
  
  private static byte getByte(InputStream paramInputStream)
    throws IOException
  {
    return (byte)(paramInputStream.read() & 0xFF);
  }
  
  private static String getHeader(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      localStringBuilder.append((char)paramArrayOfByte[i]);
    }
    return localStringBuilder.toString();
  }
  
  private static int getInt(InputStream paramInputStream)
    throws IOException
  {
    int i = (byte)paramInputStream.read();
    int j = (byte)paramInputStream.read();
    int k = (byte)paramInputStream.read();
    return (byte)paramInputStream.read() << 24 & 0xFF000000 | k << 16 & 0xFF0000 | j << 8 & 0xFF00 | i & 0xFF;
  }
  
  private static short getShort(InputStream paramInputStream)
    throws IOException
  {
    return (short)(paramInputStream.read() & 0xFF);
  }
  
  /* Error */
  @javax.annotation.Nullable
  public static Pair<Integer, Integer> getSize(InputStream paramInputStream)
  {
    // Byte code:
    //   0: iconst_4
    //   1: newarray <illegal type>
    //   3: astore_1
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 68	java/io/InputStream:read	([B)I
    //   9: pop
    //   10: aload_1
    //   11: ldc 70
    //   13: invokestatic 72	com/facebook/imageutils/WebpUtil:compare	([BLjava/lang/String;)Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifne +17 -> 35
    //   21: aload_0
    //   22: invokevirtual 75	java/io/InputStream:close	()V
    //   25: goto +8 -> 33
    //   28: astore_0
    //   29: aload_0
    //   30: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: invokestatic 82	com/facebook/imageutils/WebpUtil:getInt	(Ljava/io/InputStream;)I
    //   39: pop
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 68	java/io/InputStream:read	([B)I
    //   45: pop
    //   46: aload_1
    //   47: ldc 84
    //   49: invokestatic 72	com/facebook/imageutils/WebpUtil:compare	([BLjava/lang/String;)Z
    //   52: istore_2
    //   53: iload_2
    //   54: ifne +17 -> 71
    //   57: aload_0
    //   58: invokevirtual 75	java/io/InputStream:close	()V
    //   61: goto +8 -> 69
    //   64: astore_0
    //   65: aload_0
    //   66: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   69: aconst_null
    //   70: areturn
    //   71: aload_0
    //   72: aload_1
    //   73: invokevirtual 68	java/io/InputStream:read	([B)I
    //   76: pop
    //   77: aload_1
    //   78: invokestatic 86	com/facebook/imageutils/WebpUtil:getHeader	([B)Ljava/lang/String;
    //   81: astore_1
    //   82: ldc 14
    //   84: aload_1
    //   85: invokevirtual 90	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   88: ifeq +22 -> 110
    //   91: aload_0
    //   92: invokestatic 93	com/facebook/imageutils/WebpUtil:getVP8Dimension	(Ljava/io/InputStream;)Landroid/util/Pair;
    //   95: astore_1
    //   96: aload_0
    //   97: invokevirtual 75	java/io/InputStream:close	()V
    //   100: goto +8 -> 108
    //   103: astore_0
    //   104: aload_0
    //   105: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   108: aload_1
    //   109: areturn
    //   110: ldc 8
    //   112: aload_1
    //   113: invokevirtual 90	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   116: ifeq +22 -> 138
    //   119: aload_0
    //   120: invokestatic 96	com/facebook/imageutils/WebpUtil:getVP8LDimension	(Ljava/io/InputStream;)Landroid/util/Pair;
    //   123: astore_1
    //   124: aload_0
    //   125: invokevirtual 75	java/io/InputStream:close	()V
    //   128: goto +8 -> 136
    //   131: astore_0
    //   132: aload_0
    //   133: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   136: aload_1
    //   137: areturn
    //   138: ldc 11
    //   140: aload_1
    //   141: invokevirtual 90	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifeq +22 -> 166
    //   147: aload_0
    //   148: invokestatic 99	com/facebook/imageutils/WebpUtil:getVP8XDimension	(Ljava/io/InputStream;)Landroid/util/Pair;
    //   151: astore_1
    //   152: aload_0
    //   153: invokevirtual 75	java/io/InputStream:close	()V
    //   156: goto +8 -> 164
    //   159: astore_0
    //   160: aload_0
    //   161: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   164: aload_1
    //   165: areturn
    //   166: aload_0
    //   167: invokevirtual 75	java/io/InputStream:close	()V
    //   170: goto +28 -> 198
    //   173: astore_1
    //   174: goto +26 -> 200
    //   177: astore_1
    //   178: aload_1
    //   179: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   182: aload_0
    //   183: ifnull +15 -> 198
    //   186: aload_0
    //   187: invokevirtual 75	java/io/InputStream:close	()V
    //   190: goto +8 -> 198
    //   193: astore_0
    //   194: aload_0
    //   195: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   198: aconst_null
    //   199: areturn
    //   200: aload_0
    //   201: ifnull +15 -> 216
    //   204: aload_0
    //   205: invokevirtual 75	java/io/InputStream:close	()V
    //   208: goto +8 -> 216
    //   211: astore_0
    //   212: aload_0
    //   213: invokevirtual 80	java/lang/Throwable:printStackTrace	()V
    //   216: aload_1
    //   217: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	paramInputStream	InputStream
    //   3	162	1	localObject1	Object
    //   173	1	1	localObject2	Object
    //   177	40	1	localIOException	IOException
    //   16	38	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   21	25	28	java/io/IOException
    //   57	61	64	java/io/IOException
    //   96	100	103	java/io/IOException
    //   124	128	131	java/io/IOException
    //   152	156	159	java/io/IOException
    //   4	17	173	finally
    //   35	53	173	finally
    //   71	96	173	finally
    //   110	124	173	finally
    //   138	152	173	finally
    //   178	182	173	finally
    //   4	17	177	java/io/IOException
    //   35	53	177	java/io/IOException
    //   71	96	177	java/io/IOException
    //   110	124	177	java/io/IOException
    //   138	152	177	java/io/IOException
    //   166	170	193	java/io/IOException
    //   186	190	193	java/io/IOException
    //   204	208	211	java/io/IOException
  }
  
  private static Pair<Integer, Integer> getVP8Dimension(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream.skip(7L);
    int i = getShort(paramInputStream);
    int j = getShort(paramInputStream);
    int k = getShort(paramInputStream);
    if ((i == 157) && (j == 1) && (k == 42)) {
      return new Pair(Integer.valueOf(get2BytesAsInt(paramInputStream)), Integer.valueOf(get2BytesAsInt(paramInputStream)));
    }
    return null;
  }
  
  private static Pair<Integer, Integer> getVP8LDimension(InputStream paramInputStream)
    throws IOException
  {
    getInt(paramInputStream);
    if (getByte(paramInputStream) != 47) {
      return null;
    }
    int i = (byte)paramInputStream.read();
    int j = (byte)paramInputStream.read() & 0xFF;
    int k = (byte)paramInputStream.read();
    return new Pair(Integer.valueOf((i & 0xFF | (j & 0x3F) << 8) + 1), Integer.valueOf((((byte)paramInputStream.read() & 0xFF & 0xF) << 10 | (k & 0xFF) << 2 | (j & 0xC0) >> 6) + 1));
  }
  
  private static Pair<Integer, Integer> getVP8XDimension(InputStream paramInputStream)
    throws IOException
  {
    paramInputStream.skip(8L);
    return new Pair(Integer.valueOf(read3Bytes(paramInputStream) + 1), Integer.valueOf(read3Bytes(paramInputStream) + 1));
  }
  
  private static boolean isBitOne(byte paramByte, int paramInt)
  {
    boolean bool = true;
    if ((paramByte >> paramInt % 8 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  private static int read3Bytes(InputStream paramInputStream)
    throws IOException
  {
    int i = getByte(paramInputStream);
    int j = getByte(paramInputStream);
    return getByte(paramInputStream) << 16 & 0xFF0000 | j << 8 & 0xFF00 | i & 0xFF;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageutils.WebpUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */