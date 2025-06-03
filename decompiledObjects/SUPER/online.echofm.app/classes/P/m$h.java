package P;

import g6.a;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class m$h
  extends l
  implements a
{
  public m$h(m paramm)
  {
    super(0);
  }
  
  public final File a()
  {
    File localFile = (File)m.h(o).invoke();
    Object localObject2 = localFile.getAbsolutePath();
    Object localObject3 = m.k;
    Object localObject4 = ((m.a)localObject3).b();
    String str;
    label124:
    try
    {
      if ((((m.a)localObject3).a().contains(localObject2) ^ true))
      {
        localObject3 = ((m.a)localObject3).a();
        Intrinsics.checkNotNullExpressionValue(localObject2, "it");
        ((Set)localObject3).add(localObject2);
        return localFile;
      }
    }
    finally
    {
      break label124;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("There are multiple DataStores active for the same file: ");
      ((StringBuilder)localObject2).append(localObject1);
      ((StringBuilder)localObject2).append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
      str = ((StringBuilder)localObject2).toString();
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(str.toString());
      throw ((Throwable)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     P.m.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */