package r0;

import dc.a;
import ec.i;
import ec.j;
import java.io.File;
import lc.k;
import q0.b;

public final class c
  extends j
  implements a<File>
{
  public c(b paramb)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    File localFile = (File)a.invoke();
    i.e(localFile, "<this>");
    Object localObject = localFile.getName();
    i.d(localObject, "getName(...)");
    if (i.a(k.A0((String)localObject, ""), "preferences_pb")) {
      return localFile;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("File extension for file: ");
    ((StringBuilder)localObject).append(localFile);
    ((StringBuilder)localObject).append(" does not match required extension for Preferences file: ");
    ((StringBuilder)localObject).append("preferences_pb");
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
}

/* Location:
 * Qualified Name:     r0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */