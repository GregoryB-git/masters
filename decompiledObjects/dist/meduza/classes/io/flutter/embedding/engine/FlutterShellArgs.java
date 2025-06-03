package io.flutter.embedding.engine;

import android.content.Intent;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlutterShellArgs
{
  public static final String ARG_CACHE_SKSL = "--cache-sksl";
  public static final String ARG_DART_FLAGS = "--dart-flags";
  public static final String ARG_DISABLE_IMPELLER = "--enable-impeller=false";
  public static final String ARG_DISABLE_SERVICE_AUTH_CODES = "--disable-service-auth-codes";
  public static final String ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "--dump-skp-on-shader-compilation";
  public static final String ARG_ENABLE_DART_PROFILING = "--enable-dart-profiling";
  public static final String ARG_ENABLE_IMPELLER = "--enable-impeller=true";
  public static final String ARG_ENABLE_SOFTWARE_RENDERING = "--enable-software-rendering";
  public static final String ARG_ENABLE_VULKAN_VALIDATION = "--enable-vulkan-validation";
  public static final String ARG_ENDLESS_TRACE_BUFFER = "--endless-trace-buffer";
  public static final String ARG_KEY_CACHE_SKSL = "cache-sksl";
  public static final String ARG_KEY_DART_FLAGS = "dart-flags";
  public static final String ARG_KEY_DISABLE_SERVICE_AUTH_CODES = "disable-service-auth-codes";
  public static final String ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "dump-skp-on-shader-compilation";
  public static final String ARG_KEY_ENABLE_DART_PROFILING = "enable-dart-profiling";
  public static final String ARG_KEY_ENABLE_SOFTWARE_RENDERING = "enable-software-rendering";
  public static final String ARG_KEY_ENABLE_VULKAN_VALIDATION = "enable-vulkan-validation";
  public static final String ARG_KEY_ENDLESS_TRACE_BUFFER = "endless-trace-buffer";
  public static final String ARG_KEY_OBSERVATORY_PORT = "observatory-port";
  public static final String ARG_KEY_PURGE_PERSISTENT_CACHE = "purge-persistent-cache";
  public static final String ARG_KEY_SKIA_DETERMINISTIC_RENDERING = "skia-deterministic-rendering";
  public static final String ARG_KEY_START_PAUSED = "start-paused";
  public static final String ARG_KEY_TOGGLE_IMPELLER = "enable-impeller";
  public static final String ARG_KEY_TRACE_SKIA = "trace-skia";
  public static final String ARG_KEY_TRACE_SKIA_ALLOWLIST = "trace-skia-allowlist";
  public static final String ARG_KEY_TRACE_STARTUP = "trace-startup";
  public static final String ARG_KEY_TRACE_SYSTRACE = "trace-systrace";
  public static final String ARG_KEY_TRACE_TO_FILE = "trace-to-file";
  public static final String ARG_KEY_USE_TEST_FONTS = "use-test-fonts";
  public static final String ARG_KEY_VERBOSE_LOGGING = "verbose-logging";
  public static final String ARG_KEY_VM_SERVICE_PORT = "vm-service-port";
  public static final String ARG_PURGE_PERSISTENT_CACHE = "--purge-persistent-cache";
  public static final String ARG_SKIA_DETERMINISTIC_RENDERING = "--skia-deterministic-rendering";
  public static final String ARG_START_PAUSED = "--start-paused";
  public static final String ARG_TRACE_SKIA = "--trace-skia";
  public static final String ARG_TRACE_SKIA_ALLOWLIST = "--trace-skia-allowlist=";
  public static final String ARG_TRACE_STARTUP = "--trace-startup";
  public static final String ARG_TRACE_SYSTRACE = "--trace-systrace";
  public static final String ARG_TRACE_TO_FILE = "--trace-to-file";
  public static final String ARG_USE_TEST_FONTS = "--use-test-fonts";
  public static final String ARG_VERBOSE_LOGGING = "--verbose-logging";
  public static final String ARG_VM_SERVICE_PORT = "--vm-service-port=";
  private Set<String> args;
  
  public FlutterShellArgs(List<String> paramList)
  {
    args = new HashSet(paramList);
  }
  
  public FlutterShellArgs(Set<String> paramSet)
  {
    args = new HashSet(paramSet);
  }
  
  public FlutterShellArgs(String[] paramArrayOfString)
  {
    args = new HashSet(Arrays.asList(paramArrayOfString));
  }
  
  public static FlutterShellArgs fromIntent(Intent paramIntent)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramIntent.getBooleanExtra("trace-startup", false)) {
      localArrayList.add("--trace-startup");
    }
    if (paramIntent.getBooleanExtra("start-paused", false)) {
      localArrayList.add("--start-paused");
    }
    int i = paramIntent.getIntExtra("vm-service-port", 0);
    if (i > 0)
    {
      localObject = new StringBuilder();
    }
    else
    {
      i = paramIntent.getIntExtra("observatory-port", 0);
      if (i <= 0) {
        break label110;
      }
      localObject = new StringBuilder();
    }
    ((StringBuilder)localObject).append("--vm-service-port=");
    ((StringBuilder)localObject).append(Integer.toString(i));
    localArrayList.add(((StringBuilder)localObject).toString());
    label110:
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
    Object localObject = paramIntent.getStringExtra("trace-skia-allowlist");
    if (localObject != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("--trace-skia-allowlist=");
      localStringBuilder.append((String)localObject);
      localArrayList.add(localStringBuilder.toString());
    }
    if (paramIntent.getBooleanExtra("trace-systrace", false)) {
      localArrayList.add("--trace-systrace");
    }
    if (paramIntent.hasExtra("trace-to-file"))
    {
      localObject = f.l("--trace-to-file=");
      ((StringBuilder)localObject).append(paramIntent.getStringExtra("trace-to-file"));
      localArrayList.add(((StringBuilder)localObject).toString());
    }
    if (paramIntent.hasExtra("enable-impeller"))
    {
      if (paramIntent.getBooleanExtra("enable-impeller", false)) {
        localObject = "--enable-impeller=true";
      } else {
        localObject = "--enable-impeller=false";
      }
      localArrayList.add(localObject);
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
    if (paramIntent.hasExtra("dart-flags"))
    {
      localObject = f.l("--dart-flags=");
      ((StringBuilder)localObject).append(paramIntent.getStringExtra("dart-flags"));
      localArrayList.add(((StringBuilder)localObject).toString());
    }
    return new FlutterShellArgs(localArrayList);
  }
  
  public void add(String paramString)
  {
    args.add(paramString);
  }
  
  public void remove(String paramString)
  {
    args.remove(paramString);
  }
  
  public String[] toArray()
  {
    String[] arrayOfString = new String[args.size()];
    return (String[])args.toArray(arrayOfString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterShellArgs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */