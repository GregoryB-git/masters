package com.appsflyer.internal;

import java.lang.reflect.Method;

public class AFb1oSDK
{
  public static byte[] AppsFlyerLib;
  public static byte[] onPause;
  public static final byte[] setAndroidIdData;
  private static int setCustomerUserId = 1;
  public static int setDebugLog;
  private static Object setImeiData;
  private static Object setOaidData;
  public static final int setPhoneNumber = 0;
  public static int updateServerUninstallToken;
  private static int waitForCustomerUserId;
  
  private static String $$c(short paramShort1, int paramInt, short paramShort2)
  {
    short s1 = waitForCustomerUserId;
    int i = (((s1 | 0x13) << 1) - (s1 ^ 0x13)) % 128;
    setCustomerUserId = i;
    paramShort1 = -paramShort1;
    s1 = ((paramShort1 | 0x24) << 1) - (paramShort1 ^ 0x24);
    paramShort1 = -paramInt;
    paramInt = (paramShort1 ^ 0x77) + ((paramShort1 & 0x77) << 1);
    paramShort1 = paramShort2 + 4;
    byte[] arrayOfByte = setAndroidIdData;
    Object localObject = new byte[s1];
    paramShort2 = -1;
    short s2 = s1 - 1;
    s1 = paramShort2;
    short s3 = paramShort1;
    if (arrayOfByte == null)
    {
      paramInt = i + 107;
      waitForCustomerUserId = paramInt % 128;
      if (paramInt % 2 != 0) {
        throw new ArithmeticException("divide by zero");
      }
      s3 = paramShort1;
      s1 = s2;
      paramInt = paramShort2;
      paramShort2 = s3;
    }
    for (;;)
    {
      paramShort1 = ((s1 | 0x7D) << 1) - (s1 ^ 0x7D);
      s1 = ((paramShort1 | 0xFFFFFF84) << 1) - (paramShort1 ^ 0xFFFFFF84);
      localObject[s1] = ((byte)(byte)paramInt);
      if (s1 == s2)
      {
        localObject = new String((byte[])localObject, 0);
        paramShort1 = setCustomerUserId;
        paramShort1 = (paramShort1 & 0x15) + (paramShort1 | 0x15);
        waitForCustomerUserId = paramShort1 % 128;
        if (paramShort1 % 2 != 0) {
          throw new ArithmeticException("divide by zero");
        }
        return (String)localObject;
      }
      paramShort1 = (s3 ^ 0xFFFFFFC8) + ((s3 & 0xFFFFFFC8) << 1);
      paramShort2 = (paramShort1 ^ 0x39) + ((paramShort1 & 0x39) << 1);
      s3 = arrayOfByte[paramShort2];
      paramShort1 = paramInt;
      paramInt = s1;
      s1 = s3;
      s1 = -s1;
      waitForCustomerUserId = (setCustomerUserId + 99) % 128;
      paramShort1 += s1;
      s1 = paramInt;
      paramInt = paramShort1;
      s3 = paramShort2;
    }
  }
  
  public static int AFKeystoreWrapper(int paramInt)
  {
    int i = waitForCustomerUserId;
    i = (((i | 0x19) << 1) - (i ^ 0x19)) % 128;
    setCustomerUserId = i;
    Object localObject1 = setImeiData;
    waitForCustomerUserId = (i + 117) % 128;
    try
    {
      byte[] arrayOfByte = setAndroidIdData;
      paramInt = ((Integer)Class.forName($$c((byte)arrayOfByte[71], (byte)arrayOfByte[15], (short)'ʉ'), true, (ClassLoader)setOaidData).getMethod($$c((byte)arrayOfByte['ɠ'], (byte)arrayOfByte[40], (short)'̜'), new Class[] { Integer.TYPE }).invoke(localObject1, new Object[] { Integer.valueOf(paramInt) })).intValue();
      i = waitForCustomerUserId + 75;
      setCustomerUserId = i % 128;
      if (i % 2 != 0) {
        return paramInt;
      }
      throw null;
    }
    finally
    {
      localObject1 = ((Throwable)localObject2).getCause();
      if (localObject1 != null) {
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public static int AFKeystoreWrapper(Object paramObject)
  {
    int i = setCustomerUserId;
    i = ((i ^ 0x2B) + ((i & 0x2B) << 1)) % 128;
    waitForCustomerUserId = i;
    Object localObject1 = setImeiData;
    setCustomerUserId = (i + 109) % 128;
    try
    {
      byte[] arrayOfByte = setAndroidIdData;
      i = ((Integer)Class.forName($$c((byte)arrayOfByte[71], (byte)arrayOfByte[15], (short)'ʉ'), true, (ClassLoader)setOaidData).getMethod($$c((byte)arrayOfByte[15], (byte)arrayOfByte[111], (short)'Ő'), new Class[] { Object.class }).invoke(localObject1, new Object[] { paramObject })).intValue();
      int j = waitForCustomerUserId;
      j = (j & 0x4B) + (j | 0x4B);
      setCustomerUserId = j % 128;
      if (j % 2 != 0) {
        return i;
      }
      throw null;
    }
    finally
    {
      paramObject = ((Throwable)localObject2).getCause();
      if (paramObject != null) {
        throw ((Throwable)paramObject);
      }
    }
  }
  
  public static void init$0()
  {
    int i = waitForCustomerUserId + 19;
    setCustomerUserId = i % 128;
    byte[] arrayOfByte;
    if (i % 2 == 0)
    {
      arrayOfByte = new byte['ϰ'];
      System.arraycopy("_­Ìô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=Ë7\të\0253ÅúAìÍ\017\000\001ó\r\001\033Ûþû\001!ß\002\r\004ô\të\0253Â\013ó\0079ÛÚ\006ÿ\017øî\003\000\r÷ú3Ñ\000\004\003\006\002í\013ú\001\të\0253À\005úAìÉ\005\017#Í\017\000\001óó\nò\003\006\0056¿üEìÍ\fý\b@Î\021óÿ\nú\001\të\0253ÅúAìÉ\005\017$Ï\000\021è0Ûþû\001!ß\002\r\004ô\003õö\rþ=»ú\006ÿ\017ø?åÛ!èøþýù5ßí5×\013î\000'Ý\016ýÿó\r\004ý\036Ñ\t\000ó\002ñ.Ýý\007ò/Û÷\002ñ0ß\004ý!Û\007ï\005\tõ\017\002ñ1âþû\003!Û÷\r\004ýô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=îûä1Â\034\017ù'­\003õö\rþ=»ú\006ÿ\017ø?êßí2Ýý\007ô\013ÿ\006ü\002þû\003\003õö\rþ=»ú\006ÿ\017ø?ìáî\016!ßí5×\013î\000'Ý\016ýÿó\002ñ1Ô\013ÿ\"âþû\003!Û÷ûýÛ-Ñ\000+Ï\021÷ú Û\t\013ú\013\013\025ù\027øºÿOº\005õ\000\n\001þøøS´\007ÿòK\025ú\026ø\025ü\024ø\025ø\030øûýÛ-Ñ\000+Ï\021÷ú$ïï\021ô\bñ\017ó$íô\b\të\0253Â\013ó\0079ë×\013î\000'Ý\016ýÿóó\nò\003\006\0056Íñ\000BíÑ\000)Ûý\r\001õù\002ñ/Í\004\017ó\004\rõ\031ß\005ý\021ú\002!Û÷\r\002ï\005ýù\të\0253ÅúAêãí\023\030Ûþû\001!ß\002\r\004ôý\016ý ßíó\nò\003\006\0056¸\r\004îIãæì4Ï\021÷ú\të\0253ÅúAìÉ\005\017$Ï\000\021è*Ú\001\004û\001!ß\002\r\004ôó\nò\003\006\0056¿üEé×ø\r÷\003\001\001\b÷úô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=îûä1Á\035\017ù'\000\b\002ù\002ñ1×\013î\000'Ý\016ýÿóË\003í\0232Ë\003í\0232ÿù\007ñ\017\002ñ.\002\017ùì\026ûúô\002?Íñ\000ý\rúó\024óDÅûú\017ó\004\rõ>íûä1Á\035\017ù'\000\rí\013ó\021\031ã\007ð\021ïù)ïí\f#Ù\007ø\b÷ú\001÷ýü\016Ìô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=Ì6\të\0253ÅúAº\007ý\fû÷\002ñ$Þ\003ÿ\013óþû\002ñ3ßï\004\003÷\001\017\025ïí\fó\nò\003\006\0056Íñ\000BíÞï\013ó\rõû%ìö\r\004ý\025õ÷\020\026é\të\0253ÅúAèÝý\007\026Ú\001\004û\001!ß\002\r\004ô\002ó\027å\tõ\017\të\0253ÅúAåú\nÍ\025þõü\013ú\001\017í\f\034ãöÿ\002ñ+Û\005õ\013\bõ+Ñ\000\004\003\006\002í\013ú\001\të\0253ÅúAèÝý\007\025ý\023øî\003\000\r÷ú ëü\b\030äý\000\003ö\të\0253ÅúAèÝý\007!ßò\020ñ\tùü\005ý\005-É\005\017$Ï\000\021èý\016ý!×\013î\000ô\002?Íñ\000ý\rúó\024ó\005\021ñ\rí\013ó\021\031ã\007ð\021ïù5Û÷\r\002ï\005ý\t\004ò\të\0253ÅúAåÛþû\001!ß\002\r\004ô".getBytes("ISO-8859-1"), 0, arrayOfByte, 0, 1008);
      setAndroidIdData = arrayOfByte;
    }
    for (i = 105;; i = 104)
    {
      setPhoneNumber = i;
      break;
      arrayOfByte = new byte['ϰ'];
      System.arraycopy("_­Ìô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=Ë7\të\0253ÅúAìÍ\017\000\001ó\r\001\033Ûþû\001!ß\002\r\004ô\të\0253Â\013ó\0079ÛÚ\006ÿ\017øî\003\000\r÷ú3Ñ\000\004\003\006\002í\013ú\001\të\0253À\005úAìÉ\005\017#Í\017\000\001óó\nò\003\006\0056¿üEìÍ\fý\b@Î\021óÿ\nú\001\të\0253ÅúAìÉ\005\017$Ï\000\021è0Ûþû\001!ß\002\r\004ô\003õö\rþ=»ú\006ÿ\017ø?åÛ!èøþýù5ßí5×\013î\000'Ý\016ýÿó\r\004ý\036Ñ\t\000ó\002ñ.Ýý\007ò/Û÷\002ñ0ß\004ý!Û\007ï\005\tõ\017\002ñ1âþû\003!Û÷\r\004ýô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=îûä1Â\034\017ù'­\003õö\rþ=»ú\006ÿ\017ø?êßí2Ýý\007ô\013ÿ\006ü\002þû\003\003õö\rþ=»ú\006ÿ\017ø?ìáî\016!ßí5×\013î\000'Ý\016ýÿó\002ñ1Ô\013ÿ\"âþû\003!Û÷ûýÛ-Ñ\000+Ï\021÷ú Û\t\013ú\013\013\025ù\027øºÿOº\005õ\000\n\001þøøS´\007ÿòK\025ú\026ø\025ü\024ø\025ø\030øûýÛ-Ñ\000+Ï\021÷ú$ïï\021ô\bñ\017ó$íô\b\të\0253Â\013ó\0079ë×\013î\000'Ý\016ýÿóó\nò\003\006\0056Íñ\000BíÑ\000)Ûý\r\001õù\002ñ/Í\004\017ó\004\rõ\031ß\005ý\021ú\002!Û÷\r\002ï\005ýù\të\0253ÅúAêãí\023\030Ûþû\001!ß\002\r\004ôý\016ý ßíó\nò\003\006\0056¸\r\004îIãæì4Ï\021÷ú\të\0253ÅúAìÉ\005\017$Ï\000\021è*Ú\001\004û\001!ß\002\r\004ôó\nò\003\006\0056¿üEé×ø\r÷\003\001\001\b÷úô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=îûä1Á\035\017ù'\000\b\002ù\002ñ1×\013î\000'Ý\016ýÿóË\003í\0232Ë\003í\0232ÿù\007ñ\017\002ñ.\002\017ùì\026ûúô\002?Íñ\000ý\rúó\024óDÅûú\017ó\004\rõ>íûä1Á\035\017ù'\000\rí\013ó\021\031ã\007ð\021ïù)ïí\f#Ù\007ø\b÷ú\001÷ýü\016Ìô\002>Îñ\000ý\rúó\024óCÆûú\017ó\004\rõ=Ì6\të\0253ÅúAº\007ý\fû÷\002ñ$Þ\003ÿ\013óþû\002ñ3ßï\004\003÷\001\017\025ïí\fó\nò\003\006\0056Íñ\000BíÞï\013ó\rõû%ìö\r\004ý\025õ÷\020\026é\të\0253ÅúAèÝý\007\026Ú\001\004û\001!ß\002\r\004ô\002ó\027å\tõ\017\të\0253ÅúAåú\nÍ\025þõü\013ú\001\017í\f\034ãöÿ\002ñ+Û\005õ\013\bõ+Ñ\000\004\003\006\002í\013ú\001\të\0253ÅúAèÝý\007\025ý\023øî\003\000\r÷ú ëü\b\030äý\000\003ö\të\0253ÅúAèÝý\007!ßò\020ñ\tùü\005ý\005-É\005\017$Ï\000\021èý\016ý!×\013î\000ô\002?Íñ\000ý\rúó\024ó\005\021ñ\rí\013ó\021\031ã\007ð\021ïù5Û÷\r\002ï\005ý\t\004ò\të\0253ÅúAåÛþû\001!ß\002\r\004ô".getBytes("ISO-8859-1"), 0, arrayOfByte, 0, 1008);
      setAndroidIdData = arrayOfByte;
    }
  }
  
  public static Object values(int paramInt1, int paramInt2, char paramChar)
  {
    int i = setCustomerUserId;
    Object localObject1 = setImeiData;
    i = (((i | 0x59) << 1) - (i ^ 0x59)) % 128;
    waitForCustomerUserId = i;
    setCustomerUserId = ((i ^ 0x1F) + ((i & 0x1F) << 1)) % 128;
    try
    {
      Object localObject2 = setAndroidIdData;
      Object localObject3 = Class.forName($$c((byte)localObject2[71], (byte)localObject2[15], (short)'ʉ'), true, (ClassLoader)setOaidData);
      String str = $$c((byte)localObject2[60], (byte)localObject2[111], (short)'Ƅ');
      localObject2 = Integer.TYPE;
      localObject3 = ((Class)localObject3).getMethod(str, new Class[] { localObject2, localObject2, Character.TYPE }).invoke(localObject1, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Character.valueOf(paramChar) });
      paramInt1 = setCustomerUserId;
      waitForCustomerUserId = (((paramInt1 | 0x69) << 1) - (paramInt1 ^ 0x69)) % 128;
      return localObject3;
    }
    finally
    {
      localObject1 = ((Throwable)localObject4).getCause();
      if (localObject1 != null) {
        throw ((Throwable)localObject1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1oSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */