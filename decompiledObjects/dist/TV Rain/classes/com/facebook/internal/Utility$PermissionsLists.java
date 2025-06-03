package com.facebook.internal;

import java.util.List;

public class Utility$PermissionsLists
{
  public List<String> declinedPermissions;
  public List<String> expiredPermissions;
  public List<String> grantedPermissions;
  
  public Utility$PermissionsLists(List<String> paramList1, List<String> paramList2, List<String> paramList3)
  {
    grantedPermissions = paramList1;
    declinedPermissions = paramList2;
    expiredPermissions = paramList3;
  }
  
  public List<String> getDeclinedPermissions()
  {
    return declinedPermissions;
  }
  
  public List<String> getExpiredPermissions()
  {
    return expiredPermissions;
  }
  
  public List<String> getGrantedPermissions()
  {
    return grantedPermissions;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.Utility.PermissionsLists
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */