package s0;

import g;
import java.io.IOException;

public final class j$c
  extends IOException
{
  public j$c(IndexOutOfBoundsException paramIndexOutOfBoundsException)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramIndexOutOfBoundsException);
  }
  
  public j$c(String paramString, IndexOutOfBoundsException paramIndexOutOfBoundsException)
  {
    super(g.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", paramString), paramIndexOutOfBoundsException);
  }
}

/* Location:
 * Qualified Name:     s0.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */