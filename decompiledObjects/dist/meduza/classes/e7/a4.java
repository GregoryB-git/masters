package e7;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.Set;

public final class a4
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      w6 localw6 = b.A;
      a.zzl().l();
      if (localw6.b())
      {
        Object localObject;
        if (localw6.c())
        {
          a.j().G.b(null);
          localObject = new Bundle();
          ((BaseBundle)localObject).putString("source", "(not set)");
          ((BaseBundle)localObject).putString("medium", "(not set)");
          ((BaseBundle)localObject).putString("_cis", "intent");
          ((BaseBundle)localObject).putLong("_cc", 1L);
          a.k().Q("auto", "_cmpx", (Bundle)localObject);
        }
        else
        {
          localObject = a.j().G.a();
          if (TextUtils.isEmpty((CharSequence)localObject))
          {
            a.zzj().p.b("Cache still valid but referrer not found");
          }
          else
          {
            long l = a.j().H.a() / 3600000L;
            Uri localUri = Uri.parse((String)localObject);
            Bundle localBundle = new Bundle();
            Pair localPair = new Pair(localUri.getPath(), localBundle);
            localObject = localUri.getQueryParameterNames().iterator();
            while (((Iterator)localObject).hasNext())
            {
              String str = (String)((Iterator)localObject).next();
              localBundle.putString(str, localUri.getQueryParameter(str));
            }
            ((Bundle)second).putLong("_cc", (l - 1L) * 3600000L);
            localObject = first;
            if (localObject == null) {
              localObject = "app";
            } else {
              localObject = (String)localObject;
            }
            a.k().Q((String)localObject, "_cmp", (Bundle)second);
          }
          a.j().G.b(null);
        }
        a.j().H.b(0L);
      }
      return;
    }
    b.L();
  }
}

/* Location:
 * Qualified Name:     e7.a4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */