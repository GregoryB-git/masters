package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PathProviderPlugin
  implements FlutterPlugin, Messages.PathProviderApi
{
  public static final String TAG = "PathProviderPlugin";
  private Context context;
  
  private String getApplicationSupportDirectory()
  {
    return PathUtils.getFilesDir(context);
  }
  
  private String getPathProviderApplicationDocumentsDirectory()
  {
    return PathUtils.getDataDirectory(context);
  }
  
  private List<String> getPathProviderExternalCacheDirectories()
  {
    ArrayList localArrayList = new ArrayList();
    for (File localFile : context.getExternalCacheDirs()) {
      if (localFile != null) {
        localArrayList.add(localFile.getAbsolutePath());
      }
    }
    return localArrayList;
  }
  
  private List<String> getPathProviderExternalStorageDirectories(Messages.StorageDirectory paramStorageDirectory)
  {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject : context.getExternalFilesDirs(getStorageDirectoryString(paramStorageDirectory))) {
      if (localObject != null) {
        localArrayList.add(((File)localObject).getAbsolutePath());
      }
    }
    return localArrayList;
  }
  
  private String getPathProviderStorageDirectory()
  {
    File localFile = context.getExternalFilesDir(null);
    if (localFile == null) {
      return null;
    }
    return localFile.getAbsolutePath();
  }
  
  private String getPathProviderTemporaryDirectory()
  {
    return context.getCacheDir().getPath();
  }
  
  private String getStorageDirectoryString(Messages.StorageDirectory paramStorageDirectory)
  {
    switch (1.$SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[paramStorageDirectory.ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unrecognized directory: ");
      localStringBuilder.append(paramStorageDirectory);
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
  
  private void setup(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    try
    {
      d.i(paramBinaryMessenger, this);
    }
    catch (Exception paramBinaryMessenger)
    {
      Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", paramBinaryMessenger);
    }
    context = paramContext;
  }
  
  public String getApplicationCachePath()
  {
    return context.getCacheDir().getPath();
  }
  
  public String getApplicationDocumentsPath()
  {
    return getPathProviderApplicationDocumentsDirectory();
  }
  
  public String getApplicationSupportPath()
  {
    return getApplicationSupportDirectory();
  }
  
  public List<String> getExternalCachePaths()
  {
    return getPathProviderExternalCacheDirectories();
  }
  
  public String getExternalStoragePath()
  {
    return getPathProviderStorageDirectory();
  }
  
  public List<String> getExternalStoragePaths(Messages.StorageDirectory paramStorageDirectory)
  {
    return getPathProviderExternalStorageDirectories(paramStorageDirectory);
  }
  
  public String getTemporaryPath()
  {
    return getPathProviderTemporaryDirectory();
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    setup(paramFlutterPluginBinding.getBinaryMessenger(), paramFlutterPluginBinding.getApplicationContext());
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    d.i(paramFlutterPluginBinding.getBinaryMessenger(), null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.pathprovider.PathProviderPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */