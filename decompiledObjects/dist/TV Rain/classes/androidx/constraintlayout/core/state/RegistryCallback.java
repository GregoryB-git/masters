package androidx.constraintlayout.core.state;

public abstract interface RegistryCallback
{
  public abstract String currentLayoutInformation();
  
  public abstract String currentMotionScene();
  
  public abstract long getLastModified();
  
  public abstract void onDimensions(int paramInt1, int paramInt2);
  
  public abstract void onNewMotionScene(String paramString);
  
  public abstract void onProgress(float paramFloat);
  
  public abstract void setDrawDebug(int paramInt);
  
  public abstract void setLayoutInformationMode(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.state.RegistryCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */