package androidx.core.content.pm;

import a3;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z2;

public final class PackageInfoCompat
{
  private static boolean byteArrayContains(@NonNull byte[][] paramArrayOfByte, @NonNull byte[] paramArrayOfByte1)
  {
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++) {
      if (Arrays.equals(paramArrayOfByte1, paramArrayOfByte[j])) {
        return true;
      }
    }
    return false;
  }
  
  private static byte[] computeSHA256Digest(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = MessageDigest.getInstance("SHA256").digest(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new RuntimeException("Device doesn't support SHA256 cert checking", paramArrayOfByte);
    }
  }
  
  public static long getLongVersionCode(@NonNull PackageInfo paramPackageInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getLongVersionCode(paramPackageInfo);
    }
    return versionCode;
  }
  
  @NonNull
  public static List<Signature> getSignatures(@NonNull PackageManager paramPackageManager, @NonNull String paramString)
    throws PackageManager.NameNotFoundException
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramPackageManager = getPackageInfo134217728signingInfo;
      if (Api28Impl.hasMultipleSigners(paramPackageManager)) {
        paramPackageManager = Api28Impl.getApkContentsSigners(paramPackageManager);
      } else {
        paramPackageManager = Api28Impl.getSigningCertificateHistory(paramPackageManager);
      }
    }
    else
    {
      paramPackageManager = getPackageInfo64signatures;
    }
    if (paramPackageManager == null) {
      return Collections.emptyList();
    }
    return Arrays.asList(paramPackageManager);
  }
  
  public static boolean hasSignatures(@NonNull PackageManager paramPackageManager, @NonNull String paramString, @NonNull @Size(min=1L) Map<byte[], Integer> paramMap, boolean paramBoolean)
    throws PackageManager.NameNotFoundException
  {
    if (paramMap.isEmpty()) {
      return false;
    }
    Object localObject1 = paramMap.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    int i;
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (byte[])((Iterator)localObject2).next();
      if (localObject3 != null)
      {
        localObject3 = (Integer)paramMap.get(localObject3);
        if (localObject3 != null)
        {
          i = ((Integer)localObject3).intValue();
          if ((i != 0) && (i != 1))
          {
            paramPackageManager = new StringBuilder();
            paramPackageManager.append("Unsupported certificate type ");
            paramPackageManager.append(localObject3);
            paramPackageManager.append(" when verifying ");
            paramPackageManager.append(paramString);
            throw new IllegalArgumentException(paramPackageManager.toString());
          }
        }
        else
        {
          throw new IllegalArgumentException(z2.o("Type must be specified for cert when verifying ", paramString));
        }
      }
      else
      {
        throw new IllegalArgumentException(z2.o("Cert byte array cannot be null when verifying ", paramString));
      }
    }
    localObject2 = getSignatures(paramPackageManager, paramString);
    if ((!paramBoolean) && (Build.VERSION.SDK_INT >= 28))
    {
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (byte[])((Iterator)localObject1).next();
        if (!Api28Impl.hasSigningCertificate(paramPackageManager, paramString, (byte[])localObject2, ((Integer)paramMap.get(localObject2)).intValue())) {
          return false;
        }
      }
      return true;
    }
    if ((((List)localObject2).size() != 0) && (paramMap.size() <= ((List)localObject2).size()) && ((!paramBoolean) || (paramMap.size() == ((List)localObject2).size())))
    {
      paramBoolean = paramMap.containsValue(Integer.valueOf(1));
      paramPackageManager = null;
      if (paramBoolean)
      {
        paramString = new byte[((List)localObject2).size()][];
        for (i = 0;; i++)
        {
          paramPackageManager = paramString;
          if (i >= ((List)localObject2).size()) {
            break;
          }
          paramString[i] = computeSHA256Digest(((Signature)((List)localObject2).get(i)).toByteArray());
        }
      }
      paramString = ((Set)localObject1).iterator();
      if (paramString.hasNext())
      {
        localObject1 = (byte[])paramString.next();
        paramString = (Integer)paramMap.get(localObject1);
        i = paramString.intValue();
        if (i != 0)
        {
          if (i == 1)
          {
            if (!byteArrayContains(paramPackageManager, (byte[])localObject1)) {
              return false;
            }
          }
          else
          {
            paramPackageManager = new StringBuilder();
            paramPackageManager.append("Unsupported certificate type ");
            paramPackageManager.append(paramString);
            throw new IllegalArgumentException(paramPackageManager.toString());
          }
        }
        else if (!((List)localObject2).contains(new Signature((byte[])localObject1))) {
          return false;
        }
        return true;
      }
    }
    return false;
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    @Nullable
    public static Signature[] getApkContentsSigners(@NonNull SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.getApkContentsSigners();
    }
    
    @DoNotInline
    public static long getLongVersionCode(PackageInfo paramPackageInfo)
    {
      return a3.e(paramPackageInfo);
    }
    
    @DoNotInline
    @Nullable
    public static Signature[] getSigningCertificateHistory(@NonNull SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.getSigningCertificateHistory();
    }
    
    @DoNotInline
    public static boolean hasMultipleSigners(@NonNull SigningInfo paramSigningInfo)
    {
      return paramSigningInfo.hasMultipleSigners();
    }
    
    @DoNotInline
    public static boolean hasSigningCertificate(@NonNull PackageManager paramPackageManager, @NonNull String paramString, @NonNull byte[] paramArrayOfByte, int paramInt)
    {
      return a3.A(paramPackageManager, paramString, paramArrayOfByte, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.PackageInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */