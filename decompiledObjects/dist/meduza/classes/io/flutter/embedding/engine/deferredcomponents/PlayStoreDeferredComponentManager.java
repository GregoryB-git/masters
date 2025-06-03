package io.flutter.embedding.engine.deferredcomponents;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallRequest.Builder;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.tasks.Task;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PlayStoreDeferredComponentManager
  implements DeferredComponentManager
{
  public static final String MAPPING_KEY;
  private static final String TAG = "PlayStoreDeferredComponentManager";
  private DeferredComponentChannel channel;
  private Context context;
  private FlutterApplicationInfo flutterApplicationInfo;
  private FlutterJNI flutterJNI;
  private FeatureInstallStateUpdatedListener listener;
  public SparseArray<String> loadingUnitIdToComponentNames;
  public SparseArray<String> loadingUnitIdToSharedLibraryNames;
  private Map<String, Integer> nameToSessionId;
  private SparseIntArray sessionIdToLoadingUnitId;
  private SparseArray<String> sessionIdToName;
  private SparseArray<String> sessionIdToState;
  private SplitInstallManager splitInstallManager;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(DeferredComponentManager.class.getName());
    localStringBuilder.append(".loadingUnitMapping");
    MAPPING_KEY = localStringBuilder.toString();
  }
  
  public PlayStoreDeferredComponentManager(Context paramContext, FlutterJNI paramFlutterJNI)
  {
    context = paramContext;
    flutterJNI = paramFlutterJNI;
    flutterApplicationInfo = ApplicationInfoLoader.load(paramContext);
    splitInstallManager = SplitInstallManagerFactory.create(paramContext);
    paramContext = new FeatureInstallStateUpdatedListener(null);
    listener = paramContext;
    splitInstallManager.registerListener(paramContext);
    sessionIdToName = new SparseArray();
    sessionIdToLoadingUnitId = new SparseIntArray();
    sessionIdToState = new SparseArray();
    nameToSessionId = new HashMap();
    loadingUnitIdToComponentNames = new SparseArray();
    loadingUnitIdToSharedLibraryNames = new SparseArray();
    initLoadingUnitMappingToComponentNames();
  }
  
  private ApplicationInfo getApplicationInfo()
  {
    try
    {
      ApplicationInfo localApplicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
      return localApplicationInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException(localNameNotFoundException);
    }
  }
  
  private void initLoadingUnitMappingToComponentNames()
  {
    Object localObject1 = getApplicationInfo();
    if (localObject1 != null)
    {
      Object localObject2 = metaData;
      if (localObject2 != null)
      {
        localObject1 = MAPPING_KEY;
        localObject2 = ((BaseBundle)localObject2).getString((String)localObject1, null);
        if (localObject2 == null)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("No loading unit to dynamic feature module name found. Ensure '");
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append("' is defined in the base module's AndroidManifest.");
          Log.e("PlayStoreDeferredComponentManager", ((StringBuilder)localObject2).toString());
          return;
        }
        if (((String)localObject2).equals("")) {
          return;
        }
        localObject1 = ((String)localObject2).split(",");
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
        {
          localObject2 = localObject1[j].split(":", -1);
          int k = Integer.parseInt(localObject2[0]);
          loadingUnitIdToComponentNames.put(k, localObject2[1]);
          if (localObject2.length > 2) {
            loadingUnitIdToSharedLibraryNames.put(k, localObject2[2]);
          }
        }
      }
    }
  }
  
  private boolean verifyJNI()
  {
    if (flutterJNI == null)
    {
      Log.e("PlayStoreDeferredComponentManager", "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
      return false;
    }
    return true;
  }
  
  public void destroy()
  {
    splitInstallManager.unregisterListener(listener);
    channel = null;
    flutterJNI = null;
  }
  
  public String getDeferredComponentInstallState(int paramInt, String paramString)
  {
    if (paramString == null) {
      paramString = (String)loadingUnitIdToComponentNames.get(paramInt);
    }
    String str = "unknown";
    if (paramString == null)
    {
      Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
      return "unknown";
    }
    if (!nameToSessionId.containsKey(paramString))
    {
      if (splitInstallManager.getInstalledModules().contains(paramString)) {
        str = "installedPendingLoad";
      }
      return str;
    }
    paramInt = ((Integer)nameToSessionId.get(paramString)).intValue();
    return (String)sessionIdToState.get(paramInt);
  }
  
  public void installDeferredComponent(int paramInt, String paramString)
  {
    if (paramString == null) {
      paramString = (String)loadingUnitIdToComponentNames.get(paramInt);
    }
    if (paramString == null)
    {
      Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
      return;
    }
    if ((paramString.equals("")) && (paramInt > 0))
    {
      loadDartLibrary(paramInt, paramString);
      return;
    }
    paramString = SplitInstallRequest.newBuilder().addModule(paramString).build();
    splitInstallManager.startInstall(paramString).addOnSuccessListener(new a()).addOnFailureListener(new b());
  }
  
  public void loadAssets(int paramInt, String paramString)
  {
    if (!verifyJNI()) {
      return;
    }
    try
    {
      paramString = context;
      paramString = paramString.createPackageContext(paramString.getPackageName(), 0);
      context = paramString;
      paramString = paramString.getAssets();
      flutterJNI.updateJavaAssetManager(paramString, flutterApplicationInfo.flutterAssetsDir);
      return;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public void loadDartLibrary(int paramInt, String paramString)
  {
    if (!verifyJNI()) {
      return;
    }
    if (paramInt < 0) {
      return;
    }
    Object localObject1 = (String)loadingUnitIdToSharedLibraryNames.get(paramInt);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(flutterApplicationInfo.aotSharedLibraryName);
      ((StringBuilder)localObject2).append("-");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append(".part.so");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    String str1 = android.os.Build.SUPPORTED_ABIS[0];
    String str2 = str1.replace("-", "_");
    Object localObject3 = new ArrayList();
    localObject1 = new ArrayList();
    Object localObject4 = new LinkedList();
    ((LinkedList)localObject4).add(context.getFilesDir());
    Object localObject5 = context.getApplicationInfo().splitSourceDirs;
    int i = localObject5.length;
    for (int j = 0; j < i; j++) {
      ((LinkedList)localObject4).add(new File(localObject5[j]));
    }
    while (!((Collection)localObject4).isEmpty())
    {
      File localFile = (File)((LinkedList)localObject4).remove();
      if ((localFile != null) && (localFile.isDirectory()) && (localFile.listFiles() != null))
      {
        localObject5 = localFile.listFiles();
        i = localObject5.length;
        for (j = 0; j < i; j++) {
          ((LinkedList)localObject4).add(localObject5[j]);
        }
      }
      else
      {
        localObject5 = localFile.getName();
        if ((((String)localObject5).endsWith(".apk")) && ((((String)localObject5).startsWith(paramString)) || (((String)localObject5).startsWith("split_config"))) && (((String)localObject5).contains(str2))) {
          ((ArrayList)localObject3).add(localFile.getAbsolutePath());
        } else if (((String)localObject5).equals(localObject2)) {
          ((ArrayList)localObject1).add(localFile.getAbsolutePath());
        }
      }
    }
    paramString = new ArrayList();
    paramString.add(localObject2);
    localObject4 = ((ArrayList)localObject3).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      str2 = (String)((Iterator)localObject4).next();
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append(str2);
      ((StringBuilder)localObject3).append("!lib/");
      ((StringBuilder)localObject3).append(str1);
      ((StringBuilder)localObject3).append("/");
      ((StringBuilder)localObject3).append((String)localObject2);
      paramString.add(((StringBuilder)localObject3).toString());
    }
    localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext()) {
      paramString.add((String)((Iterator)localObject2).next());
    }
    flutterJNI.loadDartDeferredLibrary(paramInt, (String[])paramString.toArray(new String[paramString.size()]));
  }
  
  public void setDeferredComponentChannel(DeferredComponentChannel paramDeferredComponentChannel)
  {
    channel = paramDeferredComponentChannel;
  }
  
  public void setJNI(FlutterJNI paramFlutterJNI)
  {
    flutterJNI = paramFlutterJNI;
  }
  
  public boolean uninstallDeferredComponent(int paramInt, String paramString)
  {
    if (paramString == null) {
      paramString = (String)loadingUnitIdToComponentNames.get(paramInt);
    }
    if (paramString == null)
    {
      Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    splitInstallManager.deferredUninstall(localArrayList);
    if (nameToSessionId.get(paramString) != null) {
      sessionIdToState.delete(((Integer)nameToSessionId.get(paramString)).intValue());
    }
    return true;
  }
  
  public class FeatureInstallStateUpdatedListener
    implements SplitInstallStateUpdatedListener
  {
    private FeatureInstallStateUpdatedListener() {}
    
    public void onStateUpdate(SplitInstallSessionState paramSplitInstallSessionState)
    {
      int i = paramSplitInstallSessionState.sessionId();
      if (PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i) != null)
      {
        Object localObject;
        switch (paramSplitInstallSessionState.status())
        {
        default: 
          localObject = f.l("Unknown status: ");
          ((StringBuilder)localObject).append(paramSplitInstallSessionState.status());
          Log.d("PlayStoreDeferredComponentManager", ((StringBuilder)localObject).toString());
          break;
        case 9: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install canceling.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "canceling";
          break;
        case 8: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "requiresUserConfirmation";
          break;
        case 7: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install canceled.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          if (PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this) != null) {
            PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this).completeInstallError((String)PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), "Android Deferred Component installation canceled.");
          }
          PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).delete(i);
          PlayStoreDeferredComponentManager.access$100(PlayStoreDeferredComponentManager.this).delete(i);
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "cancelled";
          break;
        case 6: 
          Log.e("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install failed with: %s", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i), Integer.valueOf(paramSplitInstallSessionState.errorCode()) }));
          FlutterJNI localFlutterJNI = PlayStoreDeferredComponentManager.access$200(PlayStoreDeferredComponentManager.this);
          int j = PlayStoreDeferredComponentManager.access$100(PlayStoreDeferredComponentManager.this).get(i);
          localObject = f.l("Module install failed with ");
          ((StringBuilder)localObject).append(paramSplitInstallSessionState.errorCode());
          localFlutterJNI.deferredComponentInstallFailure(j, ((StringBuilder)localObject).toString(), true);
          if (PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this) != null) {
            PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this).completeInstallError((String)PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), "Android Deferred Component failed to install.");
          }
          PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).delete(i);
          PlayStoreDeferredComponentManager.access$100(PlayStoreDeferredComponentManager.this).delete(i);
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "failed";
          break;
        case 5: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install successfully.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          paramSplitInstallSessionState = PlayStoreDeferredComponentManager.this;
          paramSplitInstallSessionState.loadAssets(PlayStoreDeferredComponentManager.access$100(paramSplitInstallSessionState).get(i), (String)PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i));
          if (PlayStoreDeferredComponentManager.access$100(PlayStoreDeferredComponentManager.this).get(i) > 0)
          {
            paramSplitInstallSessionState = PlayStoreDeferredComponentManager.this;
            paramSplitInstallSessionState.loadDartLibrary(PlayStoreDeferredComponentManager.access$100(paramSplitInstallSessionState).get(i), (String)PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i));
          }
          if (PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this) != null) {
            PlayStoreDeferredComponentManager.access$300(PlayStoreDeferredComponentManager.this).completeInstallSuccess((String)PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i));
          }
          PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).delete(i);
          PlayStoreDeferredComponentManager.access$100(PlayStoreDeferredComponentManager.this).delete(i);
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "installed";
          break;
        case 4: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) installing.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "installing";
          break;
        case 3: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) downloaded.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "downloaded";
          break;
        case 2: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) downloading.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "downloading";
          break;
        case 1: 
          Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install pending.", new Object[] { PlayStoreDeferredComponentManager.access$000(PlayStoreDeferredComponentManager.this).get(i), Integer.valueOf(i) }));
          localObject = PlayStoreDeferredComponentManager.access$400(PlayStoreDeferredComponentManager.this);
          paramSplitInstallSessionState = "pending";
        }
        ((SparseArray)localObject).put(i, paramSplitInstallSessionState);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */