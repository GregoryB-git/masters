package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.util.HashMap;
import java.util.Map;

public class SslErrorExt
  extends SslError
{
  private SslErrorExt(int paramInt, SslCertificate paramSslCertificate, String paramString)
  {
    super(paramInt, paramSslCertificate, paramString);
  }
  
  public static Map<String, Object> toMap(SslError paramSslError)
  {
    Integer localInteger = null;
    if (paramSslError == null) {
      return null;
    }
    int i = paramSslError.getPrimaryError();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                paramSslError = null;
              } else {
                paramSslError = "A generic error occurred";
              }
            }
            else {
              paramSslError = "The date of the certificate is invalid";
            }
          }
          else {
            paramSslError = "The certificate authority is not trusted";
          }
        }
        else {
          paramSslError = "Hostname mismatch";
        }
      }
      else {
        paramSslError = "The certificate has expired";
      }
    }
    else {
      paramSslError = "The certificate is not yet valid";
    }
    HashMap localHashMap = new HashMap();
    if (i >= 0) {
      localInteger = Integer.valueOf(i);
    }
    localHashMap.put("code", localInteger);
    localHashMap.put("message", paramSslError);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.SslErrorExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */