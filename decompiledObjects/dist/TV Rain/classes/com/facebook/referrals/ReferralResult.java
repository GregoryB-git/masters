package com.facebook.referrals;

import java.util.Collections;
import java.util.List;

public class ReferralResult
{
  private final List<String> referralCodes;
  
  public ReferralResult(List<String> paramList)
  {
    referralCodes = paramList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ReferralResult)paramObject;
      return referralCodes.equals(referralCodes);
    }
    return false;
  }
  
  public List<String> getReferralCodes()
  {
    return Collections.unmodifiableList(referralCodes);
  }
  
  public int hashCode()
  {
    return referralCodes.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */