package C5;

import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.Method;
import t5.b;

public abstract class a
{
  public static void a(io.flutter.embedding.engine.a parama)
  {
    try
    {
      GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[] { io.flutter.embedding.engine.a.class }).invoke(null, new Object[] { parama });
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Tried to automatically register plugins with FlutterEngine (");
      localStringBuilder.append(parama);
      localStringBuilder.append(") but could not find or invoke the GeneratedPluginRegistrant.");
      b.b("GeneratedPluginsRegister", localStringBuilder.toString());
      b.c("GeneratedPluginsRegister", "Received exception while registering", localException);
    }
  }
}

/* Location:
 * Qualified Name:     C5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */