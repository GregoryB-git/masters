package s2;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
  extends Thread
{
  public b(a parama, Map paramMap) {}
  
  public final void run()
  {
    Map localMap = o;
    Uri.Builder localBuilder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBuilder.appendQueryParameter(str, (String)localMap.get(str));
    }
    d.a(localBuilder.build().toString());
  }
}

/* Location:
 * Qualified Name:     s2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */