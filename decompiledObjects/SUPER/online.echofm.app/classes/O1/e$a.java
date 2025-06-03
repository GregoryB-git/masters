package O1;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class e$a
{
  public Uri a(String paramString, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramString, "action");
    Object localObject = P.a;
    localObject = H.b();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(B.w());
    localStringBuilder.append("/dialog/");
    localStringBuilder.append(paramString);
    return P.g((String)localObject, localStringBuilder.toString(), paramBundle);
  }
}

/* Location:
 * Qualified Name:     O1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */