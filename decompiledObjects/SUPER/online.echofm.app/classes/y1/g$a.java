package y1;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

public final class g$a
  extends ObjectInputStream
{
  public static final a o = new a(null);
  
  public g$a(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public ObjectStreamClass readClassDescriptor()
  {
    ObjectStreamClass localObjectStreamClass = super.readClassDescriptor();
    if (Intrinsics.a(localObjectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {}
    for (Object localObject = a.b.class;; localObject = e.b.class)
    {
      localObject = ObjectStreamClass.lookup((Class)localObject);
      break;
      localObject = localObjectStreamClass;
      if (!Intrinsics.a(localObjectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
        break;
      }
    }
    Intrinsics.checkNotNullExpressionValue(localObject, "resultClassDescriptor");
    return (ObjectStreamClass)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     y1.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */