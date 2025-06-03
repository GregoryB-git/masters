package g8;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import m8.g0;

public final class b
  implements a
{
  public static final a c = new a();
  public final t9.a<a> a;
  public final AtomicReference<a> b = new AtomicReference(null);
  
  public b(t9.a<a> parama)
  {
    a = parama;
    parama.a(new io.flutter.plugins.firebase.auth.g(this, 13));
  }
  
  public final d a(String paramString)
  {
    a locala = (a)b.get();
    if (locala == null) {
      paramString = c;
    } else {
      paramString = locala.a(paramString);
    }
    return paramString;
  }
  
  public final boolean b()
  {
    a locala = (a)b.get();
    boolean bool;
    if ((locala != null) && (locala.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void c(String paramString1, String paramString2, long paramLong, g0 paramg0)
  {
    String str = g.d("Deferring native open session: ", paramString1);
    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
      Log.v("FirebaseCrashlytics", str, null);
    }
    a.a(new e8.b(paramString1, paramString2, paramLong, paramg0));
  }
  
  public final boolean d(String paramString)
  {
    a locala = (a)b.get();
    boolean bool;
    if ((locala != null) && (locala.d(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a
    implements d
  {}
}

/* Location:
 * Qualified Name:     g8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */