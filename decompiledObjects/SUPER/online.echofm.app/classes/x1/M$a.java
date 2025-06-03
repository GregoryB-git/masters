package x1;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class M$a
{
  public final String a(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
  }
  
  public final Date b(Bundle paramBundle, String paramString)
  {
    Object localObject = null;
    if (paramBundle == null) {
      return null;
    }
    long l = paramBundle.getLong(paramString, Long.MIN_VALUE);
    if (l == Long.MIN_VALUE) {
      paramBundle = (Bundle)localObject;
    } else {
      paramBundle = new Date(l);
    }
    return paramBundle;
  }
  
  public final Date c(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    return b(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
  }
  
  public final Date d(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    return b(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
  }
  
  public final h e(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
      paramBundle = (h)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
    } else if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
      paramBundle = h.q;
    } else {
      paramBundle = h.t;
    }
    return paramBundle;
  }
  
  public final String f(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
  }
  
  public final boolean g(Bundle paramBundle)
  {
    boolean bool1 = false;
    if (paramBundle == null) {
      return false;
    }
    String str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
    boolean bool2 = bool1;
    if (str != null) {
      if (str.length() == 0)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = bool1;
        if (paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     x1.M.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */