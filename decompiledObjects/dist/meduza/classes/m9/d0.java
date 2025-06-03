package m9;

import f;
import j9.q;
import java.util.Map;
import java.util.Set;

public final class d0
{
  public final Object a;
  public final Object b;
  public final Object c;
  public final Object d;
  public final Object e;
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RemoteEvent{snapshotVersion=");
    localStringBuilder.append((q)a);
    localStringBuilder.append(", targetChanges=");
    localStringBuilder.append((Map)b);
    localStringBuilder.append(", targetMismatches=");
    localStringBuilder.append((Map)c);
    localStringBuilder.append(", documentUpdates=");
    localStringBuilder.append((Map)d);
    localStringBuilder.append(", resolvedLimboDocuments=");
    localStringBuilder.append((Set)e);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m9.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */