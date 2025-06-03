package p1;

import ec.i;

public final class e$a
{
  public static String a(String paramString1, String paramString2)
  {
    i.e(paramString1, "tableName");
    i.e(paramString2, "triggerType");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("`room_table_modification_trigger_");
    localStringBuilder.append(paramString1);
    localStringBuilder.append('_');
    localStringBuilder.append(paramString2);
    localStringBuilder.append('`');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p1.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */