package v8;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.internal.b;
import com.google.firebase.dynamiclinks.internal.b.c;
import u7.f;
import u7.j;

@Deprecated
public final class a
{
  public final b a;
  public final Bundle b;
  public final Bundle c;
  
  public a(b paramb)
  {
    a = paramb;
    Bundle localBundle = new Bundle();
    b = localBundle;
    paramb = c;
    paramb.a();
    localBundle.putString("apiKey", c.a);
    paramb = new Bundle();
    c = paramb;
    localBundle.putBundle("parameters", paramb);
  }
  
  @Deprecated
  public final Task<d> a(int paramInt)
  {
    if (b.getString("apiKey") != null)
    {
      b.putInt("suffix", paramInt);
      b localb = a;
      Bundle localBundle = b;
      localb.getClass();
      b.d(localBundle);
      return a.doWrite(new b.c(localBundle));
    }
    throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
  }
}

/* Location:
 * Qualified Name:     v8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */