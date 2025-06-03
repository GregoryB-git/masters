import b.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;

public abstract interface h
{
  public static final h.a g = h.a.a;
  
  public abstract void a(b paramb);
  
  public abstract a isEnabled();
  
  public static final class a
  {
    public static final rb.g b = z.n(new c());
    
    public static void a(a parama, BinaryMessenger paramBinaryMessenger, h paramh)
    {
      parama.getClass();
      parama = "";
      int i;
      if ("".length() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        parama = g.d(".", "");
      }
      Object localObject = g.d("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", parama);
      rb.g localg = b;
      localObject = new BasicMessageChannel(paramBinaryMessenger, (String)localObject, (MessageCodec)localg.getValue());
      if (paramh != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new d(paramh, 0));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      parama = new BasicMessageChannel(paramBinaryMessenger, g.d("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", parama), (MessageCodec)localg.getValue());
      if (paramh != null) {
        parama.setMessageHandler(new e(paramh, 0));
      } else {
        parama.setMessageHandler(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */