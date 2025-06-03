package j7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import k7.d;
import k7.n;
import k7.o;

public final class h
{
  public static final d c = new d("ReviewService");
  public n a;
  public final String b;
  
  public h(Context paramContext)
  {
    b = paramContext.getPackageName();
    Object localObject1 = o.a;
    int i = 1;
    int m;
    try
    {
      boolean bool = getPackageManagergetApplicationInfo"com.android.vending"0enabled;
      if (!bool) {
        o.a.b("Play Store package is disabled.", new Object[0]);
      } else {
        try
        {
          Object localObject3 = getPackageManagergetPackageInfo"com.android.vending"64signatures;
          if (localObject3 != null)
          {
            int j = localObject3.length;
            if (j != 0)
            {
              Object localObject4 = new ArrayList();
              for (int k = 0; k < j; k++)
              {
                byte[] arrayOfByte = localObject3[k].toByteArray();
                try
                {
                  localObject1 = MessageDigest.getInstance("SHA-256");
                  ((MessageDigest)localObject1).update(arrayOfByte);
                  localObject1 = Base64.encodeToString(((MessageDigest)localObject1).digest(), 11);
                }
                catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
                {
                  localObject2 = "";
                }
                ((ArrayList)localObject4).add(localObject2);
                m = i;
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(localObject2)) {
                  break label346;
                }
                if ((Build.TAGS.contains("dev-keys")) || (Build.TAGS.contains("test-keys")))
                {
                  m = i;
                  if ("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(localObject2)) {
                    break label346;
                  }
                }
              }
              Object localObject2 = o.a;
              localObject3 = new StringBuilder();
              localObject4 = ((ArrayList)localObject4).iterator();
              if (((Iterator)localObject4).hasNext()) {
                for (;;)
                {
                  ((StringBuilder)localObject3).append((CharSequence)((Iterator)localObject4).next());
                  if (!((Iterator)localObject4).hasNext()) {
                    break;
                  }
                  ((StringBuilder)localObject3).append(", ");
                }
              }
              ((d)localObject2).b(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", new Object[] { ((StringBuilder)localObject3).toString() }), new Object[0]);
              break label343;
            }
          }
          o.a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException1)
        {
          o.a.b("Play Store package is not found.", new Object[0]);
        }
      }
      m = 0;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      o.a.b("Play Store package is not found.", new Object[0]);
    }
    label343:
    label346:
    if (m != 0)
    {
      Intent localIntent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending");
      a = new n(paramContext, c, localIntent);
    }
  }
}

/* Location:
 * Qualified Name:     j7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */