package io.flutter.plugins.urllauncher;

import java.util.ArrayList;

public final class Messages$BrowserOptions
{
  private Boolean showTitle;
  
  public static BrowserOptions fromList(ArrayList<Object> paramArrayList)
  {
    BrowserOptions localBrowserOptions = new BrowserOptions();
    localBrowserOptions.setShowTitle((Boolean)paramArrayList.get(0));
    return localBrowserOptions;
  }
  
  public Boolean getShowTitle()
  {
    return showTitle;
  }
  
  public void setShowTitle(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      showTitle = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(showTitle);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Boolean showTitle;
    
    public Messages.BrowserOptions build()
    {
      Messages.BrowserOptions localBrowserOptions = new Messages.BrowserOptions();
      localBrowserOptions.setShowTitle(showTitle);
      return localBrowserOptions;
    }
    
    public Builder setShowTitle(Boolean paramBoolean)
    {
      showTitle = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages.BrowserOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */