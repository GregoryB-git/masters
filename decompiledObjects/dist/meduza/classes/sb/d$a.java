package sb;

import f;

public final class d$a
{
  public static void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramInt3))
    {
      if (paramInt1 <= paramInt2) {
        return;
      }
      throw new IllegalArgumentException(f.i("fromIndex: ", paramInt1, " > toIndex: ", paramInt2));
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(paramInt3);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     sb.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */