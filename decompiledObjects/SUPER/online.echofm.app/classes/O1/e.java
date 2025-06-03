package O1;

import T1.a;
import Y1.d;
import Y1.d.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q.c;
import q.c.b;
import x1.B;

public class e
{
  public static final a b = new a(null);
  public Uri a;
  
  public e(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    w[] arrayOfw = w.values();
    paramBundle = new ArrayList(arrayOfw.length);
    int i = arrayOfw.length;
    for (int j = 0; j < i; j++) {
      paramBundle.add(arrayOfw[j].e());
    }
    if (paramBundle.contains(paramString))
    {
      paramBundle = P.a;
      paramString = P.g(H.g(), Intrinsics.i("/dialog/", paramString), localBundle);
    }
    else
    {
      paramString = b.a(paramString, localBundle);
    }
    a = paramString;
  }
  
  public final boolean a(Activity paramActivity, String paramString)
  {
    if (a.d(this)) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      d.a.a();
      Object localObject = new q/c$b;
      ((c.b)localObject).<init>(null);
      localObject = ((c.b)localObject).a();
      a.setPackage(paramString);
      return false;
    }
    finally
    {
      try
      {
        ((c)localObject).a(paramActivity, a);
        return true;
      }
      catch (ActivityNotFoundException paramActivity)
      {
        return false;
      }
      paramActivity = finally;
      a.b(paramActivity, this);
    }
  }
  
  public final void b(Uri paramUri)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramUri, "<set-?>");
      a = paramUri;
      return;
    }
    finally
    {
      a.b(paramUri, this);
    }
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     O1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */