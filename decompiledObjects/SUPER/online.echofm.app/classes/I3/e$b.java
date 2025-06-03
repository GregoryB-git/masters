package I3;

public class e$b
{
  public static final b c = new b(0, 0);
  public final int a;
  public final int b;
  
  public e$b(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("[position = ");
    localStringBuilder.append(a);
    localStringBuilder.append(", length = ");
    localStringBuilder.append(b);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     I3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */