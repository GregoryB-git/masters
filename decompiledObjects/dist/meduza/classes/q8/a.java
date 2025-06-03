package q8;

import w3.v;

public final class a
{
  public static final n8.a b = new n8.a();
  public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
  public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
  public static final v e = new v(18);
  public final c a;
  
  public a(c paramc)
  {
    a = paramc;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    int i = paramString1.length() - paramString2.length();
    if ((i >= 0) && (i <= 1))
    {
      i = paramString1.length();
      StringBuilder localStringBuilder = new StringBuilder(paramString2.length() + i);
      for (i = 0; i < paramString1.length(); i++)
      {
        localStringBuilder.append(paramString1.charAt(i));
        if (paramString2.length() > i) {
          localStringBuilder.append(paramString2.charAt(i));
        }
      }
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("Invalid input received");
  }
}

/* Location:
 * Qualified Name:     q8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */