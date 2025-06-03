package e2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

public abstract class n
{
  public static n a(long paramLong)
  {
    return new h(paramLong);
  }
  
  public static n b(Reader paramReader)
  {
    paramReader = new JsonReader(paramReader);
    Object localObject2;
    try
    {
      paramReader.beginObject();
      if (paramReader.hasNext()) {
        if (paramReader.nextName().equals("nextRequestWaitMillis")) {
          if (paramReader.peek() == JsonToken.STRING)
          {
            n localn = a(Long.parseLong(paramReader.nextString()));
            paramReader.close();
            return localn;
          }
        }
      }
    }
    finally
    {
      for (;;)
      {
        break;
        localObject2 = a(paramReader.nextLong());
        paramReader.close();
        return (n)localObject2;
        paramReader.skipValue();
        continue;
        localObject2 = new java/io/IOException;
        ((IOException)localObject2).<init>("Response is missing nextRequestWaitMillis field.");
        throw ((Throwable)localObject2);
      }
      paramReader.close();
    }
  }
  
  public abstract long c();
}

/* Location:
 * Qualified Name:     e2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */