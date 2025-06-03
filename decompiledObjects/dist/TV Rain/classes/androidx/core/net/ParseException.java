package androidx.core.net;

import androidx.annotation.NonNull;

public class ParseException
  extends RuntimeException
{
  @NonNull
  public final String response;
  
  public ParseException(@NonNull String paramString)
  {
    super(paramString);
    response = paramString;
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.ParseException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */