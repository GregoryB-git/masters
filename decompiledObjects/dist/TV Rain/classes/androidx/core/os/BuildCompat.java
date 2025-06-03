package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.util.Locale;

public class BuildCompat
{
  @Deprecated
  @ChecksSdkIntAtLeast(api=24)
  public static boolean isAtLeastN()
  {
    return true;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=25)
  public static boolean isAtLeastNMR1()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 25) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=26)
  public static boolean isAtLeastO()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 26) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=27)
  public static boolean isAtLeastOMR1()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=28)
  public static boolean isAtLeastP()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public static boolean isAtLeastPreReleaseCodename(@NonNull String paramString1, @NonNull String paramString2)
  {
    boolean bool1 = "REL".equals(paramString2);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    Locale localLocale = Locale.ROOT;
    if (paramString2.toUpperCase(localLocale).compareTo(paramString1.toUpperCase(localLocale)) >= 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=29)
  public static boolean isAtLeastQ()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 29) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=30)
  public static boolean isAtLeastR()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 30) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @SuppressLint({"RestrictedApi"})
  @ChecksSdkIntAtLeast(api=31, codename="S")
  public static boolean isAtLeastS()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i < 31) && ((i < 30) || (!isAtLeastPreReleaseCodename("S", Build.VERSION.CODENAME)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Deprecated
  @ChecksSdkIntAtLeast(api=32, codename="Sv2")
  @PrereleaseSdkCheck
  public static boolean isAtLeastSv2()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i < 32) && ((i < 31) || (!isAtLeastPreReleaseCodename("Sv2", Build.VERSION.CODENAME)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @ChecksSdkIntAtLeast(api=33, codename="Tiramisu")
  @PrereleaseSdkCheck
  public static boolean isAtLeastT()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i < 33) && ((i < 32) || (!isAtLeastPreReleaseCodename("Tiramisu", Build.VERSION.CODENAME)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @ChecksSdkIntAtLeast(codename="UpsideDownCake")
  @PrereleaseSdkCheck
  public static boolean isAtLeastU()
  {
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 33) && (isAtLeastPreReleaseCodename("UpsideDownCake", Build.VERSION.CODENAME))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresOptIn
  public static @interface PrereleaseSdkCheck {}
}

/* Location:
 * Qualified Name:     androidx.core.os.BuildCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */