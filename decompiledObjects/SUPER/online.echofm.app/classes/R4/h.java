package R4;

import android.util.Log;
import c2.c;
import c2.f;
import j4.a;
import kotlin.jvm.internal.Intrinsics;

public final class h
  implements i
{
  public static final a b = new a(null);
  public final r4.b a;
  
  public h(r4.b paramb)
  {
    a = paramb;
  }
  
  public void a(q paramq)
  {
    Intrinsics.checkNotNullParameter(paramq, "sessionEvent");
    ((c2.g)a.get()).a("FIREBASE_APPQUALITY_SESSION", q.class, c2.b.b("json"), new g(this)).b(c.d(paramq));
  }
  
  public final byte[] c(q paramq)
  {
    paramq = r.a.b().a(paramq);
    Intrinsics.checkNotNullExpressionValue(paramq, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Session Event: ");
    localStringBuilder.append(paramq);
    Log.d("EventGDTLogger", localStringBuilder.toString());
    paramq = paramq.getBytes(kotlin.text.b.b);
    Intrinsics.checkNotNullExpressionValue(paramq, "this as java.lang.String).getBytes(charset)");
    return paramq;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     R4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */