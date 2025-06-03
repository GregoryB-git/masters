package a0;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;

@Deprecated
public final class n
{
  static
  {
    if (Build.VERSION.SDK_INT < 29) {
      try
      {
        Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Class localClass1 = Long.TYPE;
        Trace.class.getMethod("isTagEnabled", new Class[] { localClass1 });
        Class localClass2 = Integer.TYPE;
        Trace.class.getMethod("asyncTraceBegin", new Class[] { localClass1, String.class, localClass2 });
        Trace.class.getMethod("asyncTraceEnd", new Class[] { localClass1, String.class, localClass2 });
        Trace.class.getMethod("traceCounter", new Class[] { localClass1, String.class, localClass2 });
      }
      catch (Exception localException)
      {
        Log.i("TraceCompat", "Unable to initialize via reflection.", localException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     a0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */