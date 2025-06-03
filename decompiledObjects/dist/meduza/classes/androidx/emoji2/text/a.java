package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p2.m0;

public final class a
{
  public static g a(Context paramContext)
  {
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 28) {
      localObject1 = new c();
    } else {
      localObject1 = new b();
    }
    Object localObject2 = paramContext.getPackageManager();
    m0.p(localObject2, "Package manager required to locate emoji font provider");
    Object localObject3 = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
    int i = 0;
    Object localObject4 = ((PackageManager)localObject2).queryIntentContentProviders((Intent)localObject3, 0).iterator();
    Object localObject5;
    int j;
    do
    {
      boolean bool = ((Iterator)localObject4).hasNext();
      localObject5 = null;
      if (!bool) {
        break;
      }
      localObject3 = nextproviderInfo;
      j = 1;
      if (localObject3 != null)
      {
        ApplicationInfo localApplicationInfo = applicationInfo;
        if ((localApplicationInfo != null) && ((flags & 0x1) == 1)) {}
      }
      else
      {
        j = 0;
      }
    } while (j == 0);
    break label140;
    localObject3 = null;
    label140:
    if (localObject3 != null) {
      try
      {
        localObject4 = authority;
        localObject3 = packageName;
        localObject2 = ((a)localObject1).a((PackageManager)localObject2, (String)localObject3);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        int k = localObject2.length;
        for (j = i; j < k; j++) {
          ((ArrayList)localObject1).add(localObject2[j].toByteArray());
        }
        localObject1 = new b0.g((String)localObject4, (String)localObject3, "emojicompat-emoji-font", Collections.singletonList(localObject1));
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.wtf("emoji2.text.DefaultEmojiConfig", localNameNotFoundException);
      }
    }
    b0.g localg = null;
    if (localg == null) {
      paramContext = (Context)localObject5;
    } else {
      paramContext = new g(paramContext, localg);
    }
    return paramContext;
  }
  
  public static class a
  {
    public Signature[] a(PackageManager paramPackageManager, String paramString)
    {
      return getPackageInfo64signatures;
    }
  }
  
  public static class b
    extends a.a
  {}
  
  public static final class c
    extends a.b
  {
    public final Signature[] a(PackageManager paramPackageManager, String paramString)
    {
      return getPackageInfo64signatures;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */