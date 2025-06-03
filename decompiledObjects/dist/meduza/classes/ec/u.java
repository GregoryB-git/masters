package ec;

public final class u
{
  public static String a(f paramf)
  {
    String str = paramf.getClass().getGenericInterfaces()[0].toString();
    paramf = str;
    if (str.startsWith("kotlin.jvm.functions.")) {
      paramf = str.substring(21);
    }
    return paramf;
  }
}

/* Location:
 * Qualified Name:     ec.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */