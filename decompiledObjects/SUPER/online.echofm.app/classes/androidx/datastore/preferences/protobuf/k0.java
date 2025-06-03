package androidx.datastore.preferences.protobuf;

import java.util.List;

public class k0
  extends RuntimeException
{
  private static final long serialVersionUID = -7466929953374883507L;
  public final List o = null;
  
  public k0(O paramO)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public z a()
  {
    return new z(getMessage());
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */