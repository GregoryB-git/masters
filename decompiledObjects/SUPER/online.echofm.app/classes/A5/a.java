package A5;

import E5.c;
import android.content.Context;
import io.flutter.embedding.engine.b;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;

public abstract interface a
{
  public abstract void onAttachedToEngine(b paramb);
  
  public abstract void onDetachedFromEngine(b paramb);
  
  public static abstract interface a {}
  
  public static class b
  {
    public final Context a;
    public final io.flutter.embedding.engine.a b;
    public final c c;
    public final TextureRegistry d;
    public final l e;
    public final a.a f;
    public final b g;
    
    public b(Context paramContext, io.flutter.embedding.engine.a parama, c paramc, TextureRegistry paramTextureRegistry, l paraml, a.a parama1, b paramb)
    {
      a = paramContext;
      b = parama;
      c = paramc;
      d = paramTextureRegistry;
      e = paraml;
      f = parama1;
      g = paramb;
    }
    
    public Context a()
    {
      return a;
    }
    
    public c b()
    {
      return c;
    }
    
    public io.flutter.embedding.engine.a c()
    {
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     A5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */