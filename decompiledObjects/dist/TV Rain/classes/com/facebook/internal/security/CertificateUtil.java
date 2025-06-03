package com.facebook.internal.security;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CertificateUtil
{
  private static final String DELIMITER = ":";
  
  public static String getCertificateHash(Context paramContext)
  {
    try
    {
      Signature[] arrayOfSignature = getPackageManagergetPackageInfogetPackageName64signatures;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramContext = MessageDigest.getInstance("SHA1");
      int i = arrayOfSignature.length;
      for (int j = 0; j < i; j++)
      {
        paramContext.update(arrayOfSignature[j].toByteArray());
        localStringBuilder.append(Base64.encodeToString(paramContext.digest(), 0));
        localStringBuilder.append(":");
      }
      if (localStringBuilder.length() > 0) {
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      }
      paramContext = localStringBuilder.toString();
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException|NoSuchAlgorithmException paramContext) {}
    return "";
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.security.CertificateUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */