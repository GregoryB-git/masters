package pa;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;

public final class g$a
{
  public final Context a;
  public final BinaryMessenger b;
  public final g.c c;
  public final g.b d;
  public final TextureRegistry e;
  public final MethodChannel f;
  
  public g$a(Context paramContext, BinaryMessenger paramBinaryMessenger, g.d paramd, g.e parame, TextureRegistry paramTextureRegistry)
  {
    a = paramContext;
    b = paramBinaryMessenger;
    c = paramd;
    d = parame;
    e = paramTextureRegistry;
    f = new MethodChannel(paramBinaryMessenger, "better_player_channel");
  }
}

/* Location:
 * Qualified Name:     pa.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */