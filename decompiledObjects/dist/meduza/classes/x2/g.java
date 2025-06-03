package x2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import b.z;
import p1.j;
import p1.l;

public final class g
  implements e
{
  public final j a;
  public final f b;
  
  public g(WorkDatabase paramWorkDatabase)
  {
    a = paramWorkDatabase;
    b = new f(paramWorkDatabase);
  }
  
  public final Long a(String paramString)
  {
    l locall = l.C(1, "SELECT long_value FROM Preference where `key`=?");
    locall.n(1, paramString);
    a.b();
    paramString = a;
    Object localObject = null;
    Cursor localCursor = z.o(paramString, locall, false);
    paramString = (String)localObject;
    try
    {
      if (localCursor.moveToFirst()) {
        if (localCursor.isNull(0)) {
          paramString = (String)localObject;
        } else {
          paramString = Long.valueOf(localCursor.getLong(0));
        }
      }
      return paramString;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final void b(d paramd)
  {
    a.b();
    a.c();
    try
    {
      b.f(paramd);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
}

/* Location:
 * Qualified Name:     x2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */