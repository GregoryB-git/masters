package Q5;

import A5.a;
import A5.a.b;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class j
  implements a, i.a
{
  public Context a;
  
  public String a()
  {
    return m();
  }
  
  public String b()
  {
    return a.getCacheDir().getPath();
  }
  
  public String c()
  {
    return i();
  }
  
  public List d()
  {
    return j();
  }
  
  public String e()
  {
    return h();
  }
  
  public List f(i.b paramb)
  {
    return k(paramb);
  }
  
  public String g()
  {
    return l();
  }
  
  public final String h()
  {
    return T5.c.d(a);
  }
  
  public final String i()
  {
    return T5.c.c(a);
  }
  
  public final List j()
  {
    ArrayList localArrayList = new ArrayList();
    for (File localFile : a.getExternalCacheDirs()) {
      if (localFile != null) {
        localArrayList.add(localFile.getAbsolutePath());
      }
    }
    return localArrayList;
  }
  
  public final List k(i.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    for (paramb : a.getExternalFilesDirs(n(paramb))) {
      if (paramb != null) {
        localArrayList.add(paramb.getAbsolutePath());
      }
    }
    return localArrayList;
  }
  
  public final String l()
  {
    File localFile = a.getExternalFilesDir(null);
    if (localFile == null) {
      return null;
    }
    return localFile.getAbsolutePath();
  }
  
  public final String m()
  {
    return a.getCacheDir().getPath();
  }
  
  public final String n(i.b paramb)
  {
    switch (a.a[paramb.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unrecognized directory: ");
      localStringBuilder.append(paramb);
      throw new RuntimeException(localStringBuilder.toString());
    case 11: 
      return "documents";
    case 10: 
      return "dcim";
    case 9: 
      return "downloads";
    case 8: 
      return "movies";
    case 7: 
      return "pictures";
    case 6: 
      return "notifications";
    case 5: 
      return "alarms";
    case 4: 
      return "ringtones";
    case 3: 
      return "podcasts";
    case 2: 
      return "music";
    }
    return null;
  }
  
  public final void o(E5.c paramc, Context paramContext)
  {
    try
    {
      h.i(paramc, this);
    }
    catch (Exception paramc)
    {
      Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", paramc);
    }
    a = paramContext;
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    o(paramb.b(), paramb.a());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    h.i(paramb.b(), null);
  }
}

/* Location:
 * Qualified Name:     Q5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */