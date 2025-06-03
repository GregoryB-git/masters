package com.appsflyer.internal;

import java.lang.reflect.Method;

public class AFa1vSDK
{
  public static int AppsFlyer2dXConversionCallback = 0;
  public static byte[] getLevel;
  private static Object init;
  public static byte[] onAppOpenAttributionNative;
  private static int onAttributionFailureNative = 1;
  public static final byte[] onConversionDataSuccess;
  private static int onDeepLinkingNative;
  public static int onInstallConversionDataLoadedNative;
  private static Object onInstallConversionFailureNative;
  public static final int onResponseErrorNative = 0;
  
  private static String $$c(byte paramByte, int paramInt, short paramShort)
  {
    int i = onAttributionFailureNative;
    onDeepLinkingNative = (((i | 0x7D) << 1) - (i ^ 0x7D)) % 128;
    paramInt = -paramInt;
    byte b = (paramInt ^ 0x77) + ((paramInt & 0x77) << 1);
    paramByte = 36 - paramByte;
    paramInt = paramShort + 28;
    paramShort = (paramInt & 0xFFFFFFE8) + (paramInt | 0xFFFFFFE8);
    byte[] arrayOfByte = onConversionDataSuccess;
    Object localObject = new byte[paramByte];
    short s = -2 - paramByte;
    int j = -1;
    paramByte = b;
    paramInt = paramShort;
    if (arrayOfByte == null)
    {
      onDeepLinkingNative = ((i & 0x7D) + (i | 0x7D)) % 128;
      paramByte = -1;
      j = s;
      paramInt = paramShort;
    }
    for (;;)
    {
      paramShort = ((j | 0xFFFFFFBD) << 1) - (j ^ 0xFFFFFFBD) + 68;
      localObject[paramShort] = ((byte)(byte)paramByte);
      if (paramShort == s)
      {
        localObject = new String((byte[])localObject, 0);
        paramByte = onAttributionFailureNative;
        onDeepLinkingNative = (((paramByte | 0x67) << 1) - (paramByte ^ 0x67)) % 128;
        return (String)localObject;
      }
      b = arrayOfByte[paramInt];
      onDeepLinkingNative = (onAttributionFailureNative + 125) % 128;
      j = paramByte;
      paramByte = paramShort;
      paramShort = (j & b) + (j | b) - 3;
      paramInt++;
      b = onDeepLinkingNative;
      onAttributionFailureNative = (((b | 0xF) << 1) - (b ^ 0xF)) % 128;
      j = paramByte;
      paramByte = paramShort;
    }
  }
  
  static
  {
    throw new RuntimeException("d2j fail translate: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.genRegGraph(UnSSATransformer.java:344)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:276)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:166)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:442)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:40)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:132)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:575)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:434)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:450)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:175)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:275)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:112)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:290)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:33)\n");
  }
  
  public static Object AFInAppEventParameterName(char paramChar, int paramInt1, int paramInt2)
  {
    int i = onDeepLinkingNative;
    i = ((i | 0x75) << 1) - (i ^ 0x75);
    int j = i % 128;
    onAttributionFailureNative = j;
    if (i % 2 != 0)
    {
      Object localObject1 = onInstallConversionFailureNative;
      onDeepLinkingNative = ((j ^ 0x3D) + ((j & 0x3D) << 1)) % 128;
      try
      {
        Object localObject3 = onConversionDataSuccess;
        byte b = (byte)localObject3[14];
        i = (byte)localObject3['Ǆ'];
        localObject4 = Class.forName($$c(b, i, (short)(i ^ 0x343 | i & 0x343)), true, (ClassLoader)init);
        String str = $$c((byte)localObject3['Ǆ'], (byte)localObject3[12], (short)'ō');
        localObject3 = Character.TYPE;
        Class localClass = Integer.TYPE;
        localObject4 = ((Class)localObject4).getMethod(str, new Class[] { localObject3, localClass, localClass }).invoke(localObject1, new Object[] { Character.valueOf(paramChar), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        return localObject4;
      }
      finally
      {
        Object localObject4 = ((Throwable)localObject2).getCause();
        if (localObject4 != null) {
          throw ((Throwable)localObject4);
        }
      }
    }
    throw null;
  }
  
  public static int AFInAppEventType(Object paramObject)
  {
    int i = (onDeepLinkingNative + 91) % 128;
    onAttributionFailureNative = i;
    Object localObject1 = onInstallConversionFailureNative;
    onDeepLinkingNative = ((i ^ 0x21) + ((i & 0x21) << 1)) % 128;
    onDeepLinkingNative = (i + 83) % 128;
    try
    {
      localObject2 = onConversionDataSuccess;
      byte b = (byte)localObject2[14];
      i = (byte)localObject2['Ǆ'];
      Class localClass = Class.forName($$c(b, i, (short)(i ^ 0x343 | i & 0x343)), true, (ClassLoader)init);
      b = (byte)-localObject2['Ŝ'];
      i = (byte)localObject2[26];
      int j = ((Integer)localClass.getMethod($$c(b, i, (short)(i ^ 0x2E6 | i & 0x2E6)), new Class[] { Object.class }).invoke(localObject1, new Object[] { paramObject })).intValue();
      i = onDeepLinkingNative + 115;
      onAttributionFailureNative = i % 128;
      if (i % 2 != 0) {
        return j;
      }
      throw null;
    }
    finally
    {
      Object localObject2 = ((Throwable)paramObject).getCause();
      if (localObject2 != null) {
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public static void init$0()
  {
    int i = onAttributionFailureNative;
    i = (i ^ 0x43) + ((i & 0x43) << 1);
    onDeepLinkingNative = i % 128;
    byte[] arrayOfByte;
    if (i % 2 != 0)
    {
      arrayOfByte = new byte['Ϻ'];
      System.arraycopy("_Ôáú\030îÐ>\tÂ\0276ô\003\002\020ö\002è(\005\b\002â$\001öÿ\017\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ\025\b\036ÓHàô\nÜMú\030îÐAø\020üÊ()ý\004ô\013\025\000\003ö\f\tÐ2\003ÿ\000ý\001\026ø\t\002\020ù\021\000ýþÍD\007¾%%\000÷\005\021\003ú\030îÐCþ\tÂ\027:þôà6ô\003\002\020\nø\022\006õ\002ñ\026ÿ\016\013ø\007û\020ù\021\000ýþÍD\007¾\0276÷\006ûÃ5ò\020\004ù\t\002ú\030îÐ>\tÂ\027:þôß4\003ò\033Ó(\005\b\002â$\001öÿ\017\000\016\rö\005ÆH\tý\004ô\013Ä\036(â\033\013\005\006\nÎ$\026Î,ø\025\003Ü&õ\006\004\020öÿ\006å2ú\003\020\001\022Õ&\006ü\021Ô(\fþú\016ô\001\022Ò!\005\b\000â(\föÿ\006\000\016\rö\005ÆH\tý\004ô\013Ä\031$\026Ñ&\006ü\017ø\004ý\007\001\005\b\000\000\016\rö\005ÆH\tý\004ô\013Ä\027\"\025õâ$\026Î,ø\025\003Ü&õ\006\004\020\001\022Ò/ø\004á!\005\b\000â(\f\b\006(Ö2\003Ø4ò\f\tã(úø\tøøî\nì\013I\004´Iþ\016\003ù\002\005\013\013°Oü\004\021¸î\tí\013î\007ï\013î\013ë\013ú\030îÐAø\020üÊ\030,ø\025\003Ü&õ\006\004\020\020ù\021\000ýþÍ6\022\003Á\0262\003Ú(\006ö\002\016\n\001\022Ô6ÿô\020ÿö\016ê$þ\006ò\t\001â(\fö\001\024þ\006\n7\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ6Îú\030îÐ>\tÂ\031 \026ðë(\005\b\002â$\001öÿ\017\006õ\006ã$\026ú\030îÐ>\tÂ\027:þôß4\003ò\033Ù)\002ÿ\b\002â$\001öÿ\017\020ù\021\000ýþÍD\007¾\032,\013ö\f\000\002\002û\f\t\020ù\021\000ýþÍD\007¾()ý\004ô\013Ù,\006÷\013û\001\n\001\022Ò,ø\025\003Ü&õ\006\004\0208\000\026ðÑ8\000\026ðÑ\004\nü\022ô\001\022Õ\001ô\n\027í\b\t\001\022Ö%þå,\006ß\026\017ûö\026ø\020òê ü\023ò\024\nÚ\024\026÷à*ü\013û\f\t\002\f\006\007õ7\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ5Ïú\030îÐ>\tÂIü\006÷\b\f\001\022ß%\000\004ø\020\005\b\001\022Ð$\024ÿ\000\f\002ôî\024\026÷\020ù\021\000ýþÍ6\022\003Á\026%\024ø\020ö\016\bÞ\027\röÿ\006î\016\fóí\032ú\030îÐ>\tÂ\033&\006üí)\002ÿ\b\002â$\001öÿ\017\001\020ì\036ú\016ôú\030îÐ>\tÂ\036\tù6î\005\016\007ø\t\002ô\026÷ç \r\004\001\022Ø(þ\016øû\016Ø2\003ÿ\000ý\001\026ø\t\002ú\030îÐ>\tÂ\033&\006üî\006ð\013\025\000\003ö\f\tã\030\007ûë\037\006\003\000\r\017\001Ä6\022\003\006ö\t\020ï\020¿>\b\tô\020ÿö\016Å\026\b\036ÓKÝô\nÜ\003ú\030îÐ>\tÂ\033&\006üâ$\021ó\022ú\n\007þ\006þÖ:þôß4\003ò\033\006õ\006â,ø\025\003\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ\025\b\036ÓKÝô\nÜ\003\017\001Ä6\022\003\006ö\t\020ï\020þò\022ö\026ø\020òê ü\023ò\024\nÎ(\fö\001\024þ\006úÿ\021ú\030îÐ>\tÂ\036(\005\b\002â$\001öÿ\017".getBytes("ISO-8859-1"), 0, arrayOfByte, 0, 1018);
      onConversionDataSuccess = arrayOfByte;
    }
    for (i = 11898;; i = 187)
    {
      onResponseErrorNative = i;
      break;
      arrayOfByte = new byte['Ϻ'];
      System.arraycopy("_Ôáú\030îÐ>\tÂ\0276ô\003\002\020ö\002è(\005\b\002â$\001öÿ\017\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ\025\b\036ÓHàô\nÜMú\030îÐAø\020üÊ()ý\004ô\013\025\000\003ö\f\tÐ2\003ÿ\000ý\001\026ø\t\002\020ù\021\000ýþÍD\007¾%%\000÷\005\021\003ú\030îÐCþ\tÂ\027:þôà6ô\003\002\020\nø\022\006õ\002ñ\026ÿ\016\013ø\007û\020ù\021\000ýþÍD\007¾\0276÷\006ûÃ5ò\020\004ù\t\002ú\030îÐ>\tÂ\027:þôß4\003ò\033Ó(\005\b\002â$\001öÿ\017\000\016\rö\005ÆH\tý\004ô\013Ä\036(â\033\013\005\006\nÎ$\026Î,ø\025\003Ü&õ\006\004\020öÿ\006å2ú\003\020\001\022Õ&\006ü\021Ô(\fþú\016ô\001\022Ò!\005\b\000â(\föÿ\006\000\016\rö\005ÆH\tý\004ô\013Ä\031$\026Ñ&\006ü\017ø\004ý\007\001\005\b\000\000\016\rö\005ÆH\tý\004ô\013Ä\027\"\025õâ$\026Î,ø\025\003Ü&õ\006\004\020\001\022Ò/ø\004á!\005\b\000â(\f\b\006(Ö2\003Ø4ò\f\tã(úø\tøøî\nì\013I\004´Iþ\016\003ù\002\005\013\013°Oü\004\021¸î\tí\013î\007ï\013î\013ë\013ú\030îÐAø\020üÊ\030,ø\025\003Ü&õ\006\004\020\020ù\021\000ýþÍ6\022\003Á\0262\003Ú(\006ö\002\016\n\001\022Ô6ÿô\020ÿö\016ê$þ\006ò\t\001â(\fö\001\024þ\006\n7\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ6Îú\030îÐ>\tÂ\031 \026ðë(\005\b\002â$\001öÿ\017\006õ\006ã$\026ú\030îÐ>\tÂ\027:þôß4\003ò\033Ù)\002ÿ\b\002â$\001öÿ\017\020ù\021\000ýþÍD\007¾\032,\013ö\f\000\002\002û\f\t\020ù\021\000ýþÍD\007¾()ý\004ô\013Ù,\006÷\013û\001\n\001\022Ò,ø\025\003Ü&õ\006\004\0208\000\026ðÑ8\000\026ðÑ\004\nü\022ô\001\022Õ\001ô\n\027í\b\t\001\022Ö%þå,\006ß\026\017ûö\026ø\020òê ü\023ò\024\nÚ\024\026÷à*ü\013û\f\t\002\f\006\007õ7\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ5Ïú\030îÐ>\tÂIü\006÷\b\f\001\022ß%\000\004ø\020\005\b\001\022Ð$\024ÿ\000\f\002ôî\024\026÷\020ù\021\000ýþÍ6\022\003Á\026%\024ø\020ö\016\bÞ\027\röÿ\006î\016\fóí\032ú\030îÐ>\tÂ\033&\006üí)\002ÿ\b\002â$\001öÿ\017\001\020ì\036ú\016ôú\030îÐ>\tÂ\036\tù6î\005\016\007ø\t\002ô\026÷ç \r\004\001\022Ø(þ\016øû\016Ø2\003ÿ\000ý\001\026ø\t\002ú\030îÐ>\tÂ\033&\006üî\006ð\013\025\000\003ö\f\tã\030\007ûë\037\006\003\000\r\017\001Ä6\022\003\006ö\t\020ï\020¿>\b\tô\020ÿö\016Å\026\b\036ÓKÝô\nÜ\003ú\030îÐ>\tÂ\033&\006üâ$\021ó\022ú\n\007þ\006þÖ:þôß4\003ò\033\006õ\006â,ø\025\003\017\001Å5\022\003\006ö\t\020ï\020À=\b\tô\020ÿö\016Æ\025\b\036ÓKÝô\nÜ\003\017\001Ä6\022\003\006ö\t\020ï\020þò\022ö\026ø\020òê ü\023ò\024\nÎ(\fö\001\024þ\006úÿ\021ú\030îÐ>\tÂ\036(\005\b\002â$\001öÿ\017".getBytes("ISO-8859-1"), 0, arrayOfByte, 0, 1018);
      onConversionDataSuccess = arrayOfByte;
    }
  }
  
  public static int valueOf(int paramInt)
  {
    int i = onDeepLinkingNative + 91;
    int j = i % 128;
    onAttributionFailureNative = j;
    if (i % 2 == 0)
    {
      localObject1 = onInstallConversionFailureNative;
      throw new ArithmeticException("divide by zero");
    }
    Object localObject1 = onInstallConversionFailureNative;
    onDeepLinkingNative = ((j ^ 0x75) + ((j & 0x75) << 1)) % 128;
    try
    {
      localObject3 = onConversionDataSuccess;
      byte b = (byte)localObject3[14];
      j = (byte)localObject3['Ǆ'];
      paramInt = ((Integer)Class.forName($$c(b, j, (short)(j ^ 0x343 | j & 0x343)), true, (ClassLoader)init).getMethod($$c((byte)localObject3['Ǆ'], (byte)localObject3[12], (short)'ō'), new Class[] { Integer.TYPE }).invoke(localObject1, new Object[] { Integer.valueOf(paramInt) })).intValue();
      j = onAttributionFailureNative;
      j = (j ^ 0xF) + ((j & 0xF) << 1);
      onDeepLinkingNative = j % 128;
      if (j % 2 == 0) {
        return paramInt;
      }
      throw null;
    }
    finally
    {
      Object localObject3 = ((Throwable)localObject2).getCause();
      if (localObject3 != null) {
        throw ((Throwable)localObject3);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1vSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */