package io.flutter.embedding.engine.deferredcomponents;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;

class PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener
  implements SplitInstallStateUpdatedListener
{
  private PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener(PlayStoreDeferredComponentManager paramPlayStoreDeferredComponentManager) {}
  
  public void onStateUpdate(SplitInstallSessionState paramSplitInstallSessionState)
  {
    int i = paramSplitInstallSessionState.sessionId();
    if (PlayStoreDeferredComponentManager.access$000(this$0).get(i) != null)
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
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install canceling.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "canceling";
        break;
      case 8: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "requiresUserConfirmation";
        break;
      case 7: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install canceled.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        if (PlayStoreDeferredComponentManager.access$300(this$0) != null) {
          PlayStoreDeferredComponentManager.access$300(this$0).completeInstallError((String)PlayStoreDeferredComponentManager.access$000(this$0).get(i), "Android Deferred Component installation canceled.");
        }
        PlayStoreDeferredComponentManager.access$000(this$0).delete(i);
        PlayStoreDeferredComponentManager.access$100(this$0).delete(i);
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "cancelled";
        break;
      case 6: 
        Log.e("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install failed with: %s", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i), Integer.valueOf(paramSplitInstallSessionState.errorCode()) }));
        FlutterJNI localFlutterJNI = PlayStoreDeferredComponentManager.access$200(this$0);
        int j = PlayStoreDeferredComponentManager.access$100(this$0).get(i);
        localObject = f.l("Module install failed with ");
        ((StringBuilder)localObject).append(paramSplitInstallSessionState.errorCode());
        localFlutterJNI.deferredComponentInstallFailure(j, ((StringBuilder)localObject).toString(), true);
        if (PlayStoreDeferredComponentManager.access$300(this$0) != null) {
          PlayStoreDeferredComponentManager.access$300(this$0).completeInstallError((String)PlayStoreDeferredComponentManager.access$000(this$0).get(i), "Android Deferred Component failed to install.");
        }
        PlayStoreDeferredComponentManager.access$000(this$0).delete(i);
        PlayStoreDeferredComponentManager.access$100(this$0).delete(i);
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "failed";
        break;
      case 5: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install successfully.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        paramSplitInstallSessionState = this$0;
        paramSplitInstallSessionState.loadAssets(PlayStoreDeferredComponentManager.access$100(paramSplitInstallSessionState).get(i), (String)PlayStoreDeferredComponentManager.access$000(this$0).get(i));
        if (PlayStoreDeferredComponentManager.access$100(this$0).get(i) > 0)
        {
          paramSplitInstallSessionState = this$0;
          paramSplitInstallSessionState.loadDartLibrary(PlayStoreDeferredComponentManager.access$100(paramSplitInstallSessionState).get(i), (String)PlayStoreDeferredComponentManager.access$000(this$0).get(i));
        }
        if (PlayStoreDeferredComponentManager.access$300(this$0) != null) {
          PlayStoreDeferredComponentManager.access$300(this$0).completeInstallSuccess((String)PlayStoreDeferredComponentManager.access$000(this$0).get(i));
        }
        PlayStoreDeferredComponentManager.access$000(this$0).delete(i);
        PlayStoreDeferredComponentManager.access$100(this$0).delete(i);
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "installed";
        break;
      case 4: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) installing.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "installing";
        break;
      case 3: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) downloaded.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "downloaded";
        break;
      case 2: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) downloading.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "downloading";
        break;
      case 1: 
        Log.d("PlayStoreDeferredComponentManager", String.format("Module \"%s\" (sessionId %d) install pending.", new Object[] { PlayStoreDeferredComponentManager.access$000(this$0).get(i), Integer.valueOf(i) }));
        localObject = PlayStoreDeferredComponentManager.access$400(this$0);
        paramSplitInstallSessionState = "pending";
      }
      ((SparseArray)localObject).put(i, paramSplitInstallSessionState);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager.FeatureInstallStateUpdatedListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */