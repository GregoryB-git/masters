package androidx.appcompat.app;

class AppCompatDelegateImpl$2
  implements Runnable
{
  public AppCompatDelegateImpl$2(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void run()
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = this$0;
    if ((mInvalidatePanelMenuFeatures & 0x1) != 0) {
      localAppCompatDelegateImpl.doInvalidatePanelMenu(0);
    }
    localAppCompatDelegateImpl = this$0;
    if ((mInvalidatePanelMenuFeatures & 0x1000) != 0) {
      localAppCompatDelegateImpl.doInvalidatePanelMenu(108);
    }
    localAppCompatDelegateImpl = this$0;
    mInvalidatePanelMenuPosted = false;
    mInvalidatePanelMenuFeatures = 0;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */