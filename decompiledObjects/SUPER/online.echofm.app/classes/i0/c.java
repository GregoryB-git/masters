package i0;

public abstract class c
{
  /* Error */
  public static android.graphics.Bitmap a(byte[] paramArrayOfByte, int paramInt, android.graphics.BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: iload_1
    //   3: aload_2
    //   4: invokestatic 12	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull +86 -> 95
    //   12: new 14	java/io/ByteArrayInputStream
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 18	java/io/ByteArrayInputStream:<init>	([B)V
    //   20: astore_0
    //   21: new 20	T/a
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 23	T/a:<init>	(Ljava/io/InputStream;)V
    //   29: astore_3
    //   30: aload_0
    //   31: invokevirtual 29	java/io/InputStream:close	()V
    //   34: aload_3
    //   35: invokevirtual 33	T/a:l	()I
    //   38: istore_1
    //   39: aload_2
    //   40: astore_0
    //   41: iload_1
    //   42: ifeq +35 -> 77
    //   45: new 35	android/graphics/Matrix
    //   48: dup
    //   49: invokespecial 37	android/graphics/Matrix:<init>	()V
    //   52: astore_0
    //   53: aload_0
    //   54: iload_1
    //   55: i2f
    //   56: invokevirtual 41	android/graphics/Matrix:postRotate	(F)Z
    //   59: pop
    //   60: aload_2
    //   61: iconst_0
    //   62: iconst_0
    //   63: aload_2
    //   64: invokevirtual 46	android/graphics/Bitmap:getWidth	()I
    //   67: aload_2
    //   68: invokevirtual 49	android/graphics/Bitmap:getHeight	()I
    //   71: aload_0
    //   72: iconst_0
    //   73: invokestatic 53	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   76: astore_0
    //   77: aload_0
    //   78: areturn
    //   79: astore_2
    //   80: aload_0
    //   81: invokevirtual 29	java/io/InputStream:close	()V
    //   84: goto +9 -> 93
    //   87: astore_0
    //   88: aload_2
    //   89: aload_0
    //   90: invokevirtual 59	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   93: aload_2
    //   94: athrow
    //   95: ldc 61
    //   97: new 63	java/lang/IllegalStateException
    //   100: dup
    //   101: invokespecial 64	java/lang/IllegalStateException:<init>	()V
    //   104: invokestatic 69	d0/A:a	(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramArrayOfByte	byte[]
    //   0	108	1	paramInt	int
    //   0	108	2	paramOptions	android.graphics.BitmapFactory.Options
    //   29	6	3	locala	T.a
    // Exception table:
    //   from	to	target	type
    //   21	30	79	finally
    //   80	84	87	finally
  }
}

/* Location:
 * Qualified Name:     i0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */