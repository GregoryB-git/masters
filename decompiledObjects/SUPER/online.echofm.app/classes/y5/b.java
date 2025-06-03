package y5;

public final class b
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final boolean g;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "libapp.so";
    }
    a = str;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "vm_snapshot_data";
    }
    b = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null) {
      paramString1 = "isolate_snapshot_data";
    }
    c = paramString1;
    paramString1 = paramString4;
    if (paramString4 == null) {
      paramString1 = "flutter_assets";
    }
    d = paramString1;
    f = paramString6;
    paramString1 = paramString5;
    if (paramString5 == null) {
      paramString1 = "";
    }
    e = paramString1;
    g = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     y5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */