package com.pichillilorenzo.flutter_inappwebview_android.types;

import aa.v;
import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import android.os.Build.VERSION;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SslCertificateExt
  extends SslCertificate
{
  private SslCertificateExt(X509Certificate paramX509Certificate)
  {
    super(paramX509Certificate);
  }
  
  public static Map<String, Object> toMap(SslCertificate paramSslCertificate)
  {
    Object localObject1 = null;
    if (paramSslCertificate == null) {
      return null;
    }
    Object localObject2 = paramSslCertificate.getIssuedBy();
    HashMap localHashMap1;
    if (localObject2 != null)
    {
      localHashMap1 = new HashMap();
      localHashMap1.put("CName", ((SslCertificate.DName)localObject2).getCName());
      localHashMap1.put("DName", ((SslCertificate.DName)localObject2).getDName());
      localHashMap1.put("OName", ((SslCertificate.DName)localObject2).getOName());
      localHashMap1.put("UName", ((SslCertificate.DName)localObject2).getUName());
    }
    else
    {
      localHashMap1 = null;
    }
    localObject2 = paramSslCertificate.getIssuedTo();
    HashMap localHashMap2;
    if (localObject2 != null)
    {
      localHashMap2 = new HashMap();
      localHashMap2.put("CName", ((SslCertificate.DName)localObject2).getCName());
      localHashMap2.put("DName", ((SslCertificate.DName)localObject2).getDName());
      localHashMap2.put("OName", ((SslCertificate.DName)localObject2).getOName());
      localHashMap2.put("UName", ((SslCertificate.DName)localObject2).getUName());
    }
    else
    {
      localHashMap2 = null;
    }
    if (Build.VERSION.SDK_INT >= 29) {}
    try
    {
      X509Certificate localX509Certificate = v.i(paramSslCertificate);
      localObject2 = localObject1;
      if (localX509Certificate == null) {
        break label194;
      }
      localObject2 = localX509Certificate.getEncoded();
    }
    catch (CertificateEncodingException localCertificateEncodingException)
    {
      localCertificateEncodingException.printStackTrace();
      localObject3 = localObject1;
    }
    localObject2 = Util.getX509CertFromSslCertHack(paramSslCertificate).getEncoded();
    Object localObject3;
    label194:
    long l1 = paramSslCertificate.getValidNotAfterDate().getTime();
    long l2 = paramSslCertificate.getValidNotBeforeDate().getTime();
    paramSslCertificate = new HashMap();
    paramSslCertificate.put("issuedBy", localHashMap1);
    paramSslCertificate.put("issuedTo", localHashMap2);
    paramSslCertificate.put("validNotAfterDate", Long.valueOf(l1));
    paramSslCertificate.put("validNotBeforeDate", Long.valueOf(l2));
    paramSslCertificate.put("x509Certificate", localObject3);
    return paramSslCertificate;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */