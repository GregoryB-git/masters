package O1;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class x
  extends e
{
  public static final a c = new a(null);
  
  public x(String paramString, Bundle paramBundle)
  {
    super(paramString, paramBundle);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    b(c.a(paramString, localBundle));
  }
  
  public static final class a
  {
    public final Uri a(String paramString, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramString, "action");
      if (Intrinsics.a(paramString, "oauth"))
      {
        paramString = P.a;
        paramString = P.g(H.k(), "oauth/authorize", paramBundle);
      }
      else
      {
        Object localObject = P.a;
        localObject = H.k();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(B.w());
        localStringBuilder.append("/dialog/");
        localStringBuilder.append(paramString);
        paramString = P.g((String)localObject, localStringBuilder.toString(), paramBundle);
      }
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     O1.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */