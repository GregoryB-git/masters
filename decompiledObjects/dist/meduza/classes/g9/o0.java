package g9;

import e7.p3;
import f;
import g;
import j9.e;
import j9.l;
import java.util.Set;
import x6.b;

public final class o0
{
  public final p3 a;
  public final l b;
  public final boolean c;
  
  public o0(p3 paramp3, l paraml, boolean paramBoolean)
  {
    a = paramp3;
    b = paraml;
    c = paramBoolean;
  }
  
  public final void a(l paraml)
  {
    ((Set)a.c).add(paraml);
  }
  
  public final o0 b(l paraml)
  {
    Object localObject = b;
    if (localObject == null) {
      paraml = null;
    } else {
      paraml = (l)((e)localObject).f(paraml);
    }
    localObject = a;
    int i = 0;
    localObject = new o0((p3)localObject, paraml, false);
    if (paraml != null) {
      while (i < b.q())
      {
        ((o0)localObject).e(b.n(i));
        i++;
      }
    }
    return (o0)localObject;
  }
  
  public final IllegalArgumentException c(String paramString)
  {
    Object localObject = b;
    if ((localObject != null) && (!((e)localObject).o()))
    {
      localObject = f.l(" (found in field ");
      ((StringBuilder)localObject).append(b.h());
      ((StringBuilder)localObject).append(")");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    return new IllegalArgumentException(g.e("Invalid data. ", paramString, (String)localObject));
  }
  
  public final boolean d()
  {
    int i = ((p0)a.b).ordinal();
    if ((i != 0) && (i != 1) && (i != 2))
    {
      if ((i != 3) && (i != 4))
      {
        b.T("Unexpected case for UserDataSource: %s", new Object[] { ((p0)a.b).name() });
        throw null;
      }
      return false;
    }
    return true;
  }
  
  public final void e(String paramString)
  {
    if (!paramString.isEmpty())
    {
      if ((d()) && (paramString.startsWith("__")) && (paramString.endsWith("__"))) {
        throw c("Document fields cannot begin and end with \"__\"");
      }
      return;
    }
    throw c("Document fields must not be empty");
  }
}

/* Location:
 * Qualified Name:     g9.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */