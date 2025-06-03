package O1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import y1.F;

public final class b
  extends BroadcastReceiver
{
  public static final a b = new a(null);
  public static b c;
  public static final String d = "com.parse.bolts.measurement_event";
  public final Context a;
  
  public b(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    Intrinsics.checkNotNullExpressionValue(paramContext, "context.applicationContext");
    a = paramContext;
  }
  
  public final void d()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Z.a locala = Z.a.b(a);
      Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
      locala.e(this);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public final void e()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Z.a locala = Z.a.b(a);
      Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      localIntentFilter.<init>(d);
      locala.c(this, localIntentFilter);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public final void finalize()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      d();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      F localF = new y1/F;
      localF.<init>(paramContext);
      Iterator localIterator = null;
      if (paramIntent == null) {
        paramContext = null;
      } else {
        paramContext = paramIntent.getStringExtra("event_name");
      }
      String str = Intrinsics.i("bf_", paramContext);
      if (paramIntent == null) {
        paramContext = null;
      } else {
        paramContext = paramIntent.getBundleExtra("event_args");
      }
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramContext == null) {
        paramIntent = localIterator;
      } else {
        paramIntent = paramContext.keySet();
      }
      if (paramIntent != null)
      {
        localIterator = paramIntent.iterator();
        while (localIterator.hasNext())
        {
          paramIntent = (String)localIterator.next();
          Intrinsics.checkNotNullExpressionValue(paramIntent, "key");
          Object localObject1 = new kotlin/text/Regex;
          ((Regex)localObject1).<init>("[^0-9a-zA-Z _-]");
          localObject1 = ((Regex)localObject1).replace(paramIntent, "-");
          Object localObject2 = new kotlin/text/Regex;
          ((Regex)localObject2).<init>("^[ -]*");
          localObject2 = ((Regex)localObject2).replace((CharSequence)localObject1, "");
          localObject1 = new kotlin/text/Regex;
          ((Regex)localObject1).<init>("[ -]*$");
          localBundle.putString(((Regex)localObject1).replace((CharSequence)localObject2, ""), (String)paramContext.get(paramIntent));
        }
      }
      label219:
      return;
    }
    finally
    {
      break label219;
      localF.d(str, localBundle);
      return;
      T1.a.b(paramContext, this);
    }
  }
  
  public static final class a
  {
    public final b a(Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      if (b.a() != null) {
        return b.a();
      }
      paramContext = new b(paramContext, null);
      b.b(paramContext);
      b.c(paramContext);
      return b.a();
    }
  }
}

/* Location:
 * Qualified Name:     O1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */