package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

public class Registry
{
  private static final Registry sRegistry = new Registry();
  private HashMap<String, RegistryCallback> mCallbacks = new HashMap();
  
  public static Registry getInstance()
  {
    return sRegistry;
  }
  
  public String currentContent(String paramString)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      return paramString.currentMotionScene();
    }
    return null;
  }
  
  public String currentLayoutInformation(String paramString)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      return paramString.currentLayoutInformation();
    }
    return null;
  }
  
  public long getLastModified(String paramString)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      return paramString.getLastModified();
    }
    return Long.MAX_VALUE;
  }
  
  public Set<String> getLayoutList()
  {
    return mCallbacks.keySet();
  }
  
  public void register(String paramString, RegistryCallback paramRegistryCallback)
  {
    mCallbacks.put(paramString, paramRegistryCallback);
  }
  
  public void setDrawDebug(String paramString, int paramInt)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      paramString.setDrawDebug(paramInt);
    }
  }
  
  public void setLayoutInformationMode(String paramString, int paramInt)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      paramString.setLayoutInformationMode(paramInt);
    }
  }
  
  public void unregister(String paramString, RegistryCallback paramRegistryCallback)
  {
    mCallbacks.remove(paramString);
  }
  
  public void updateContent(String paramString1, String paramString2)
  {
    paramString1 = (RegistryCallback)mCallbacks.get(paramString1);
    if (paramString1 != null) {
      paramString1.onNewMotionScene(paramString2);
    }
  }
  
  public void updateDimensions(String paramString, int paramInt1, int paramInt2)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      paramString.onDimensions(paramInt1, paramInt2);
    }
  }
  
  public void updateProgress(String paramString, float paramFloat)
  {
    paramString = (RegistryCallback)mCallbacks.get(paramString);
    if (paramString != null) {
      paramString.onProgress(paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.Registry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */