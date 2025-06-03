package l6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import x0.i;

public final class j1
  extends i
  implements g
{
  public static final WeakHashMap b = new WeakHashMap();
  public final i1 a = new i1();
  
  public final f a(Class paramClass, String paramString)
  {
    return (f)paramClass.cast(a.a.get(paramString));
  }
  
  public final Activity b()
  {
    return getActivity();
  }
  
  public final void c(String paramString, f paramf)
  {
    a.a(paramString, paramf);
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = a.a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = a.a.values().iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a.b(paramBundle);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    a.c();
  }
  
  public final void onResume()
  {
    super.onResume();
    a.d();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    a.e(paramBundle);
  }
  
  public final void onStart()
  {
    super.onStart();
    a.f();
  }
  
  public final void onStop()
  {
    super.onStop();
    a.g();
  }
}

/* Location:
 * Qualified Name:     l6.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */