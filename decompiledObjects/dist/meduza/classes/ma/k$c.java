package ma;

import g;
import java.io.IOException;

public final class k$c
  extends IOException
{
  public k$c(IndexOutOfBoundsException paramIndexOutOfBoundsException)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramIndexOutOfBoundsException);
  }
  
  public k$c(String paramString, IndexOutOfBoundsException paramIndexOutOfBoundsException)
  {
    super(g.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", paramString), paramIndexOutOfBoundsException);
  }
}

/* Location:
 * Qualified Name:     ma.k.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */