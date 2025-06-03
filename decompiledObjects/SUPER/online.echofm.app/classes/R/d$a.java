package R;

import P.a;
import androidx.datastore.preferences.protobuf.z;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

public final class d$a
{
  public final f a(InputStream paramInputStream)
  {
    Intrinsics.checkNotNullParameter(paramInputStream, "input");
    try
    {
      paramInputStream = f.O(paramInputStream);
      Intrinsics.checkNotNullExpressionValue(paramInputStream, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
      return paramInputStream;
    }
    catch (z paramInputStream)
    {
      throw new a("Unable to parse preferences proto.", paramInputStream);
    }
  }
}

/* Location:
 * Qualified Name:     R.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */