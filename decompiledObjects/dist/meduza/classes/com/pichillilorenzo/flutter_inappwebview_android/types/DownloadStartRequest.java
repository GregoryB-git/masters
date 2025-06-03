package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.HashMap;
import java.util.Map;

public class DownloadStartRequest
{
  private String contentDisposition;
  private long contentLength;
  private String mimeType;
  private String suggestedFilename;
  private String textEncodingName;
  private String url;
  private String userAgent;
  
  public DownloadStartRequest(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, String paramString5, String paramString6)
  {
    url = paramString1;
    userAgent = paramString2;
    contentDisposition = paramString3;
    mimeType = paramString4;
    contentLength = paramLong;
    suggestedFilename = paramString5;
    textEncodingName = paramString6;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (DownloadStartRequest)paramObject;
      if (contentLength != contentLength) {
        return false;
      }
      if (!url.equals(url)) {
        return false;
      }
      if (!userAgent.equals(userAgent)) {
        return false;
      }
      if (!contentDisposition.equals(contentDisposition)) {
        return false;
      }
      if (!mimeType.equals(mimeType)) {
        return false;
      }
      String str = suggestedFilename;
      if (str != null ? !str.equals(suggestedFilename) : suggestedFilename != null) {
        return false;
      }
      str = textEncodingName;
      paramObject = textEncodingName;
      if (str != null) {
        bool = str.equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getContentDisposition()
  {
    return contentDisposition;
  }
  
  public long getContentLength()
  {
    return contentLength;
  }
  
  public String getMimeType()
  {
    return mimeType;
  }
  
  public String getSuggestedFilename()
  {
    return suggestedFilename;
  }
  
  public String getTextEncodingName()
  {
    return textEncodingName;
  }
  
  public String getUrl()
  {
    return url;
  }
  
  public String getUserAgent()
  {
    return userAgent;
  }
  
  public int hashCode()
  {
    int i = url.hashCode();
    i = j.e(userAgent, i * 31, 31);
    i = j.e(contentDisposition, i, 31);
    int j = j.e(mimeType, i, 31);
    long l = contentLength;
    int k = (int)(l ^ l >>> 32);
    String str = suggestedFilename;
    int m = 0;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    str = textEncodingName;
    if (str != null) {
      m = str.hashCode();
    }
    return ((j + k) * 31 + i) * 31 + m;
  }
  
  public void setContentDisposition(String paramString)
  {
    contentDisposition = paramString;
  }
  
  public void setContentLength(long paramLong)
  {
    contentLength = paramLong;
  }
  
  public void setMimeType(String paramString)
  {
    mimeType = paramString;
  }
  
  public void setSuggestedFilename(String paramString)
  {
    suggestedFilename = paramString;
  }
  
  public void setTextEncodingName(String paramString)
  {
    textEncodingName = paramString;
  }
  
  public void setUrl(String paramString)
  {
    url = paramString;
  }
  
  public void setUserAgent(String paramString)
  {
    userAgent = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", url);
    localHashMap.put("userAgent", userAgent);
    localHashMap.put("contentDisposition", contentDisposition);
    localHashMap.put("mimeType", mimeType);
    localHashMap.put("contentLength", Long.valueOf(contentLength));
    localHashMap.put("suggestedFilename", suggestedFilename);
    localHashMap.put("textEncodingName", textEncodingName);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("DownloadStartRequest{url='");
    j.s(localStringBuilder, url, '\'', ", userAgent='");
    j.s(localStringBuilder, userAgent, '\'', ", contentDisposition='");
    j.s(localStringBuilder, contentDisposition, '\'', ", mimeType='");
    j.s(localStringBuilder, mimeType, '\'', ", contentLength=");
    localStringBuilder.append(contentLength);
    localStringBuilder.append(", suggestedFilename='");
    j.s(localStringBuilder, suggestedFilename, '\'', ", textEncodingName='");
    localStringBuilder.append(textEncodingName);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */