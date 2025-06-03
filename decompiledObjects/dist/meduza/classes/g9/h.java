package g9;

import g;

public final class h
{
  public final j9.f a;
  public final String b;
  public final String c;
  public final boolean d;
  
  public h(j9.f paramf, String paramString1, String paramString2, boolean paramBoolean)
  {
    a = paramf;
    b = paramString1;
    c = paramString2;
    d = paramBoolean;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DatabaseInfo(databaseId:");
    localStringBuilder.append(a);
    localStringBuilder.append(" host:");
    return g.f(localStringBuilder, c, ")");
  }
}

/* Location:
 * Qualified Name:     g9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */