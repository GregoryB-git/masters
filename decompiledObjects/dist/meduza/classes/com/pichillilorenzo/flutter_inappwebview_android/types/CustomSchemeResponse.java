package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Arrays;
import java.util.Map;

public class CustomSchemeResponse
{
  private String contentEncoding;
  private String contentType;
  private byte[] data;
  
  public CustomSchemeResponse(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    data = paramArrayOfByte;
    contentType = paramString1;
    contentEncoding = paramString2;
  }
  
  public static CustomSchemeResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new CustomSchemeResponse((byte[])paramMap.get("data"), (String)paramMap.get("contentType"), (String)paramMap.get("contentEncoding"));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (CustomSchemeResponse)paramObject;
      if (!Arrays.equals(data, data)) {
        return false;
      }
      if (!contentType.equals(contentType)) {
        return false;
      }
      return contentEncoding.equals(contentEncoding);
    }
    return false;
  }
  
  public String getContentEncoding()
  {
    return contentEncoding;
  }
  
  public String getContentType()
  {
    return contentType;
  }
  
  public byte[] getData()
  {
    return data;
  }
  
  public int hashCode()
  {
    int i = Arrays.hashCode(data);
    i = j.e(contentType, i * 31, 31);
    return contentEncoding.hashCode() + i;
  }
  
  public void setContentEncoding(String paramString)
  {
    contentEncoding = paramString;
  }
  
  public void setContentType(String paramString)
  {
    contentType = paramString;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    data = paramArrayOfByte;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("CustomSchemeResponse{data=");
    localStringBuilder.append(Arrays.toString(data));
    localStringBuilder.append(", contentType='");
    j.s(localStringBuilder, contentType, '\'', ", contentEncoding='");
    localStringBuilder.append(contentEncoding);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */