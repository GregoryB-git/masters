package w;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public abstract class j
{
  public static final Object a = new Object();
  public static final Object b = new Object();
  
  public static Bundle a(h.a parama)
  {
    Bundle localBundle = new Bundle();
    Object localObject = parama.d();
    int i;
    if (localObject != null) {
      i = ((IconCompat)localObject).g();
    } else {
      i = 0;
    }
    localBundle.putInt("icon", i);
    localBundle.putCharSequence("title", parama.h());
    localBundle.putParcelable("actionIntent", parama.a());
    if (parama.c() != null) {
      localObject = new Bundle(parama.c());
    } else {
      localObject = new Bundle();
    }
    ((BaseBundle)localObject).putBoolean("android.support.allowGeneratedReplies", parama.b());
    localBundle.putBundle("extras", (Bundle)localObject);
    localBundle.putParcelableArray("remoteInputs", c(parama.e()));
    localBundle.putBoolean("showsUserInterface", parama.g());
    localBundle.putInt("semanticAction", parama.f());
    return localBundle;
  }
  
  public static Bundle b(l paraml)
  {
    new Bundle();
    throw null;
  }
  
  public static Bundle[] c(l[] paramArrayOfl)
  {
    if (paramArrayOfl == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfl.length];
    for (int i = 0; i < paramArrayOfl.length; i++)
    {
      l locall = paramArrayOfl[i];
      arrayOfBundle[i] = b(null);
    }
    return arrayOfBundle;
  }
}

/* Location:
 * Qualified Name:     w.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */