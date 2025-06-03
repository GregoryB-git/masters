package v5;

import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j
{
  public Set a;
  
  public j(List paramList)
  {
    a = new HashSet(paramList);
  }
  
  public static j a(Intent paramIntent)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramIntent.getBooleanExtra("trace-startup", false)) {
      localArrayList.add("--trace-startup");
    }
    if (paramIntent.getBooleanExtra("start-paused", false)) {
      localArrayList.add("--start-paused");
    }
    int i = paramIntent.getIntExtra("vm-service-port", 0);
    if (i > 0) {}
    for (StringBuilder localStringBuilder = new StringBuilder();; localStringBuilder = new StringBuilder())
    {
      localStringBuilder.append("--vm-service-port=");
      localStringBuilder.append(Integer.toString(i));
      localArrayList.add(localStringBuilder.toString());
      break;
      i = paramIntent.getIntExtra("observatory-port", 0);
      if (i <= 0) {
        break;
      }
    }
    if (paramIntent.getBooleanExtra("disable-service-auth-codes", false)) {
      localArrayList.add("--disable-service-auth-codes");
    }
    if (paramIntent.getBooleanExtra("endless-trace-buffer", false)) {
      localArrayList.add("--endless-trace-buffer");
    }
    if (paramIntent.getBooleanExtra("use-test-fonts", false)) {
      localArrayList.add("--use-test-fonts");
    }
    if (paramIntent.getBooleanExtra("enable-dart-profiling", false)) {
      localArrayList.add("--enable-dart-profiling");
    }
    if (paramIntent.getBooleanExtra("enable-software-rendering", false)) {
      localArrayList.add("--enable-software-rendering");
    }
    if (paramIntent.getBooleanExtra("skia-deterministic-rendering", false)) {
      localArrayList.add("--skia-deterministic-rendering");
    }
    if (paramIntent.getBooleanExtra("trace-skia", false)) {
      localArrayList.add("--trace-skia");
    }
    String str = paramIntent.getStringExtra("trace-skia-allowlist");
    if (str != null)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("--trace-skia-allowlist=");
      localStringBuilder.append(str);
      localArrayList.add(localStringBuilder.toString());
    }
    if (paramIntent.getBooleanExtra("trace-systrace", false)) {
      localArrayList.add("--trace-systrace");
    }
    if (paramIntent.hasExtra("trace-to-file"))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("--trace-to-file=");
      localStringBuilder.append(paramIntent.getStringExtra("trace-to-file"));
      localArrayList.add(localStringBuilder.toString());
    }
    if (paramIntent.getBooleanExtra("enable-impeller", false)) {
      localArrayList.add("--enable-impeller");
    }
    if (paramIntent.getBooleanExtra("enable-vulkan-validation", false)) {
      localArrayList.add("--enable-vulkan-validation");
    }
    if (paramIntent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
      localArrayList.add("--dump-skp-on-shader-compilation");
    }
    if (paramIntent.getBooleanExtra("cache-sksl", false)) {
      localArrayList.add("--cache-sksl");
    }
    if (paramIntent.getBooleanExtra("purge-persistent-cache", false)) {
      localArrayList.add("--purge-persistent-cache");
    }
    if (paramIntent.getBooleanExtra("verbose-logging", false)) {
      localArrayList.add("--verbose-logging");
    }
    i = paramIntent.getIntExtra("msaa-samples", 0);
    if (i > 1)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("--msaa-samples=");
      localStringBuilder.append(Integer.toString(i));
      localArrayList.add(localStringBuilder.toString());
    }
    if (paramIntent.hasExtra("dart-flags"))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("--dart-flags=");
      localStringBuilder.append(paramIntent.getStringExtra("dart-flags"));
      localArrayList.add(localStringBuilder.toString());
    }
    return new j(localArrayList);
  }
  
  public String[] b()
  {
    String[] arrayOfString = new String[a.size()];
    return (String[])a.toArray(arrayOfString);
  }
}

/* Location:
 * Qualified Name:     v5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */