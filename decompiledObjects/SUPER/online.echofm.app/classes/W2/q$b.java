package W2;

public abstract class q$b
  extends b
{
  public final CharSequence q;
  public final d r;
  public final boolean s;
  public int t = 0;
  public int u;
  
  public q$b(q paramq, CharSequence paramCharSequence)
  {
    r = q.a(paramq);
    s = q.b(paramq);
    u = q.c(paramq);
    q = paramCharSequence;
  }
  
  public String f()
  {
    int i;
    int m;
    do
    {
      i = t;
      for (;;)
      {
        j = t;
        if (j == -1) {
          break label271;
        }
        j = h(j);
        if (j == -1)
        {
          j = q.length();
          t = -1;
        }
        else
        {
          t = g(j);
        }
        int k = t;
        m = i;
        if (k != i) {
          break;
        }
        j = k + 1;
        t = j;
        if (j > q.length()) {
          t = -1;
        }
      }
      for (;;)
      {
        i = j;
        if (m >= j) {
          break;
        }
        i = j;
        if (!r.e(q.charAt(m))) {
          break;
        }
        m++;
      }
      while ((i > m) && (r.e(q.charAt(i - 1)))) {
        i--;
      }
    } while ((s) && (m == i));
    int j = u;
    if (j == 1)
    {
      j = q.length();
      t = -1;
      for (;;)
      {
        i = j;
        if (j <= m) {
          break;
        }
        i = j;
        if (!r.e(q.charAt(j - 1))) {
          break;
        }
        j--;
      }
    }
    u = (j - 1);
    return q.subSequence(m, i).toString();
    label271:
    return (String)d();
  }
  
  public abstract int g(int paramInt);
  
  public abstract int h(int paramInt);
}

/* Location:
 * Qualified Name:     W2.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */