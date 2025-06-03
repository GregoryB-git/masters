package X1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

public final class a
{
  public static final a a = new a();
  
  public static final String a(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "ctx");
    try
    {
      paramContext = getPackageManagergetPackageInfogetPackageName64signatures;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
      Intrinsics.checkNotNullExpressionValue(paramContext, "signatures");
      int i = paramContext.length;
      int j = 0;
      while (j < i)
      {
        Object localObject = paramContext[j];
        j++;
        localMessageDigest.update(((Signature)localObject).toByteArray());
        localStringBuilder.append(Base64.encodeToString(localMessageDigest.digest(), 0));
        localStringBuilder.append(":");
      }
      if (localStringBuilder.length() > 0) {
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      }
      paramContext = localStringBuilder.toString();
      Intrinsics.checkNotNullExpressionValue(paramContext, "sb.toString()");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException|NoSuchAlgorithmException paramContext) {}
    return "";
  }
}

/* Location:
 * Qualified Name:     X1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */