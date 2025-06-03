package bolts;

public enum AppLinkNavigation$NavigationResult
{
  private String code;
  private boolean succeeded;
  
  static
  {
    NavigationResult localNavigationResult1 = new NavigationResult("FAILED", 0, "failed", false);
    FAILED = localNavigationResult1;
    NavigationResult localNavigationResult2 = new NavigationResult("WEB", 1, "web", true);
    WEB = localNavigationResult2;
    NavigationResult localNavigationResult3 = new NavigationResult("APP", 2, "app", true);
    APP = localNavigationResult3;
    $VALUES = new NavigationResult[] { localNavigationResult1, localNavigationResult2, localNavigationResult3 };
  }
  
  private AppLinkNavigation$NavigationResult(String paramString, boolean paramBoolean)
  {
    code = paramString;
    succeeded = paramBoolean;
  }
  
  public String getCode()
  {
    return code;
  }
  
  public boolean isSucceeded()
  {
    return succeeded;
  }
}

/* Location:
 * Qualified Name:     bolts.AppLinkNavigation.NavigationResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */