package eb;

import f;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x6.b;

public final class u
{
  public static final a.b<String> d = new a.b("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
  public final List<SocketAddress> a;
  public final a b;
  public final int c;
  
  public u(SocketAddress paramSocketAddress)
  {
    this(Collections.singletonList(paramSocketAddress), locala);
  }
  
  public u(List<SocketAddress> paramList, a parama)
  {
    b.s("addrs is empty", paramList.isEmpty() ^ true);
    paramList = Collections.unmodifiableList(new ArrayList(paramList));
    a = paramList;
    b.y(parama, "attrs");
    b = parama;
    c = paramList.hashCode();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof u)) {
      return false;
    }
    paramObject = (u)paramObject;
    if (a.size() != a.size()) {
      return false;
    }
    for (int i = 0; i < a.size(); i++) {
      if (!((SocketAddress)a.get(i)).equals(a.get(i))) {
        return false;
      }
    }
    return b.equals(b);
  }
  
  public final int hashCode()
  {
    return c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[");
    localStringBuilder.append(a);
    localStringBuilder.append("/");
    localStringBuilder.append(b);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     eb.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */