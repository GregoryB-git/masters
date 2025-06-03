package kb;

import f;
import ib.d;
import ib.d.a;
import java.util.ArrayList;
import java.util.Locale;

public final class b
{
  public final a a;
  public final d b;
  
  public b(a parama)
  {
    a = a;
    parama = b;
    parama.getClass();
    b = new d(parama);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Request{url=");
    localStringBuilder.append(a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public a a;
    public d.a b = new d.a();
    
    public final void a(String paramString1, String paramString2)
    {
      d.a locala = b;
      locala.getClass();
      if (!paramString1.isEmpty())
      {
        int i = paramString1.length();
        int j = 0;
        int k = 0;
        int m;
        while (k < i)
        {
          m = paramString1.charAt(k);
          if ((m > 31) && (m < 127)) {
            k++;
          } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), paramString1 }));
          }
        }
        if (paramString2 != null)
        {
          m = paramString2.length();
          for (i = 0;; i++)
          {
            k = j;
            if (i >= m) {
              break label196;
            }
            k = paramString2.charAt(i);
            if ((k <= 31) || (k >= 127)) {
              break;
            }
          }
          throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), paramString2 }));
          label196:
          while (k < a.size())
          {
            i = k;
            if (paramString1.equalsIgnoreCase((String)a.get(k)))
            {
              a.remove(k);
              a.remove(k);
              i = k - 2;
            }
            k = i + 2;
          }
          a.add(paramString1);
          a.add(paramString2.trim());
          return;
        }
        throw new IllegalArgumentException("value == null");
      }
      throw new IllegalArgumentException("name is empty");
    }
  }
}

/* Location:
 * Qualified Name:     kb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */