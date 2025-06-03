package androidx.window.core;

import g6.a;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata
final class Version$bigInteger$2
  extends l
  implements a
{
  public Version$bigInteger$2(Version paramVersion)
  {
    super(0);
  }
  
  public final BigInteger invoke()
  {
    return BigInteger.valueOf(this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this$0.getPatch()));
  }
}

/* Location:
 * Qualified Name:     androidx.window.core.Version.bigInteger.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */