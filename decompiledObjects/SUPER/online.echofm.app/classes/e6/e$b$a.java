package e6;

import g6.l;
import g6.p;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class e$b$a
  extends e.a
{
  public boolean b;
  public File[] c;
  public int d;
  public boolean e;
  
  public e$b$a(e.b paramb, File paramFile)
  {
    super(paramFile);
  }
  
  public File b()
  {
    if ((!e) && (c == null))
    {
      localObject = e.c(f.r);
      if ((localObject != null) && (!((Boolean)((l)localObject).invoke(a())).booleanValue())) {
        return null;
      }
      localObject = a().listFiles();
      c = ((File[])localObject);
      if (localObject == null)
      {
        localObject = e.d(f.r);
        if (localObject != null) {
          ((p)localObject).invoke(a(), new a(a(), null, "Cannot list files in a directory", 2, null));
        }
        e = true;
      }
    }
    Object localObject = c;
    if (localObject != null)
    {
      int i = d;
      Intrinsics.b(localObject);
      if (i < localObject.length)
      {
        localObject = c;
        Intrinsics.b(localObject);
        i = d;
        d = (i + 1);
        return localObject[i];
      }
    }
    if (!b)
    {
      b = true;
      return a();
    }
    localObject = e.e(f.r);
    if (localObject != null) {
      ((l)localObject).invoke(a());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     e6.e.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */