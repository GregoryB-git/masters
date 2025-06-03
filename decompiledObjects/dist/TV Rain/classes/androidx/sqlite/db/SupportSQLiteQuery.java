package androidx.sqlite.db;

public abstract interface SupportSQLiteQuery
{
  public abstract void bindTo(SupportSQLiteProgram paramSupportSQLiteProgram);
  
  public abstract int getArgCount();
  
  public abstract String getSql();
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteQuery
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */