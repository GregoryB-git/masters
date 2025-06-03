package o4;

import v3.i0;

public final class m$b
  extends Exception
{
  public final String a;
  public final boolean b;
  public final l c;
  public final String d;
  
  public m$b(int paramInt, i0 parami0, p.b paramb, boolean paramBoolean)
  {
    this((String)localObject, paramb, str, paramBoolean, null, parami0.toString());
  }
  
  public m$b(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, l paraml, String paramString3)
  {
    super(paramString1, paramThrowable);
    a = paramString2;
    b = paramBoolean;
    c = paraml;
    d = paramString3;
  }
}

/* Location:
 * Qualified Name:     o4.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */