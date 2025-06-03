package u1;

import android.database.sqlite.SQLiteDatabase;
import ec.i;

public final class d$b$b
{
  public static c a(d.a parama, SQLiteDatabase paramSQLiteDatabase)
  {
    i.e(parama, "refHolder");
    i.e(paramSQLiteDatabase, "sqLiteDatabase");
    c localc1 = a;
    c localc2;
    if (localc1 != null)
    {
      localc2 = localc1;
      if (i.a(a, paramSQLiteDatabase)) {}
    }
    else
    {
      localc2 = new c(paramSQLiteDatabase);
      a = localc2;
    }
    return localc2;
  }
}

/* Location:
 * Qualified Name:     u1.d.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */