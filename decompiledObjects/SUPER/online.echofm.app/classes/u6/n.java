package u6;

public abstract class n
{
  public static final void a(int paramInt)
  {
    if (paramInt >= 1) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Expected positive parallelism level, but got ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString().toString());
  }
}

/* Location:
 * Qualified Name:     u6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */