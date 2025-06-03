package g3;

public final class g
  implements d
{
  public final String a(String paramString)
  {
    if ((paramString.startsWith("lib")) && (paramString.endsWith(".so"))) {
      return paramString;
    }
    return System.mapLibraryName(paramString);
  }
}

/* Location:
 * Qualified Name:     g3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */