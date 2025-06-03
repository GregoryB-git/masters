package androidx.sqlite.db;

public abstract interface SupportSQLiteStatement
  extends SupportSQLiteProgram
{
  public abstract void execute();
  
  public abstract long executeInsert();
  
  public abstract int executeUpdateDelete();
  
  public abstract long simpleQueryForLong();
  
  public abstract String simpleQueryForString();
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteStatement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */