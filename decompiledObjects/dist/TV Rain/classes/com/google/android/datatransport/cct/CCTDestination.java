package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CCTDestination
  implements EncodedDestination
{
  private static final String DEFAULT_API_KEY;
  public static final String DEFAULT_END_POINT;
  public static final String DESTINATION_NAME = "cct";
  private static final String EXTRAS_DELIMITER = "\\";
  private static final String EXTRAS_VERSION_MARKER = "1$";
  public static final CCTDestination INSTANCE;
  public static final String LEGACY_END_POINT;
  public static final CCTDestination LEGACY_INSTANCE;
  private static final Set<Encoding> SUPPORTED_ENCODINGS;
  @Nullable
  private final String apiKey;
  @NonNull
  private final String endPoint;
  
  static
  {
    String str1 = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    DEFAULT_END_POINT = str1;
    String str2 = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    LEGACY_END_POINT = str2;
    String str3 = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    DEFAULT_API_KEY = str3;
    SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[] { Encoding.of("proto"), Encoding.of("json") })));
    INSTANCE = new CCTDestination(str1, null);
    LEGACY_INSTANCE = new CCTDestination(str2, str3);
  }
  
  public CCTDestination(@NonNull String paramString1, @Nullable String paramString2)
  {
    endPoint = paramString1;
    apiKey = paramString2;
  }
  
  @NonNull
  public static String decodeExtras(@NonNull byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, Charset.forName("UTF-8"));
  }
  
  @NonNull
  public static byte[] encodeString(@NonNull String paramString)
  {
    return paramString.getBytes(Charset.forName("UTF-8"));
  }
  
  @NonNull
  public static CCTDestination fromByteArray(@NonNull byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new String(paramArrayOfByte, Charset.forName("UTF-8"));
    if (paramArrayOfByte.startsWith("1$"))
    {
      paramArrayOfByte = paramArrayOfByte.substring(2).split(Pattern.quote("\\"), 2);
      if (paramArrayOfByte.length == 2)
      {
        byte b1 = paramArrayOfByte[0];
        if (!b1.isEmpty())
        {
          byte b2 = paramArrayOfByte[1];
          paramArrayOfByte = b2;
          if (b2.isEmpty()) {
            paramArrayOfByte = null;
          }
          return new CCTDestination(b1, paramArrayOfByte);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
      }
      throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
    }
    throw new IllegalArgumentException("Version marker missing from extras");
  }
  
  @Nullable
  public byte[] asByteArray()
  {
    String str1 = apiKey;
    if ((str1 == null) && (endPoint == null)) {
      return null;
    }
    String str2 = endPoint;
    String str3 = str1;
    if (str1 == null) {
      str3 = "";
    }
    return String.format("%s%s%s%s", new Object[] { "1$", str2, "\\", str3 }).getBytes(Charset.forName("UTF-8"));
  }
  
  @Nullable
  public String getAPIKey()
  {
    return apiKey;
  }
  
  @NonNull
  public String getEndPoint()
  {
    return endPoint;
  }
  
  @Nullable
  public byte[] getExtras()
  {
    return asByteArray();
  }
  
  @NonNull
  public String getName()
  {
    return "cct";
  }
  
  public Set<Encoding> getSupportedEncodings()
  {
    return SUPPORTED_ENCODINGS;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.CCTDestination
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */