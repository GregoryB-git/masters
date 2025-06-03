package s1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;

public abstract class c$a$a
{
  public static c a(c.a parama)
  {
    Object localObject = c;
    if ((localObject == null) && (b == null)) {
      throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
    }
    if (localObject == c.b.o)
    {
      localObject = new KeyGenParameterSpec.Builder(a, 3).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).setKeySize(256);
      if (d)
      {
        ((KeyGenParameterSpec.Builder)localObject).setUserAuthenticationRequired(true);
        if (Build.VERSION.SDK_INT >= 30) {
          b.a((KeyGenParameterSpec.Builder)localObject, e, 3);
        } else {
          ((KeyGenParameterSpec.Builder)localObject).setUserAuthenticationValidityDurationSeconds(e);
        }
      }
      if ((Build.VERSION.SDK_INT >= 28) && (f) && (g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"))) {
        a.a((KeyGenParameterSpec.Builder)localObject);
      }
      b = ((KeyGenParameterSpec.Builder)localObject).build();
    }
    localObject = b;
    if (localObject != null) {
      return new c(e.c((KeyGenParameterSpec)localObject), b);
    }
    throw new NullPointerException("KeyGenParameterSpec was null after build() check");
  }
  
  public static String b(KeyGenParameterSpec paramKeyGenParameterSpec)
  {
    return paramKeyGenParameterSpec.getKeystoreAlias();
  }
  
  public static abstract class a
  {
    public static void a(KeyGenParameterSpec.Builder paramBuilder)
    {
      b.a(paramBuilder, true);
    }
  }
  
  public static abstract class b
  {
    public static void a(KeyGenParameterSpec.Builder paramBuilder, int paramInt1, int paramInt2)
    {
      d.a(paramBuilder, paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     s1.c.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */