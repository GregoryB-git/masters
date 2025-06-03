package e6;

import g6.l;
import g6.p;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class e$b$c
  extends e.a
{
  public boolean b;
  public File[] c;
  public int d;
  
  public e$b$c(e.b paramb, File paramFile)
  {
    super(paramFile);
  }
  
  public File b()
  {
    if (!b)
    {
      localObject = e.c(e.r);
      if ((localObject != null) && (!((Boolean)((l)localObject).invoke(a())).booleanValue())) {
        return null;
      }
      b = true;
      return a();
    }
    Object localObject = c;
    if (localObject != null)
    {
      i = d;
      Intrinsics.b(localObject);
      if (i >= localObject.length)
      {
        localObject = e.e(e.r);
        if (localObject != null) {
          ((l)localObject).invoke(a());
        }
        return null;
      }
    }
    if (c == null)
    {
      localObject = a().listFiles();
      c = ((File[])localObject);
      if (localObject == null)
      {
        localObject = e.d(e.r);
        if (localObject != null) {
          ((p)localObject).invoke(a(), new a(a(), null, "Cannot list files in a directory", 2, null));
        }
      }
      localObject = c;
      if (localObject != null)
      {
        Intrinsics.b(localObject);
        if (localObject.length != 0) {}
      }
      else
      {
        localObject = e.e(e.r);
        if (localObject != null) {
          ((l)localObject).invoke(a());
        }
        return null;
      }
    }
    localObject = c;
    Intrinsics.b(localObject);
    int i = d;
    d = (i + 1);
    return localObject[i];
  }
}

/* Location:
 * Qualified Name:     e6.e.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */