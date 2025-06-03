package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.MembersInjector;

 enum MembersInjectors$NoOpMembersInjector
  implements MembersInjector<Object>
{
  static
  {
    NoOpMembersInjector localNoOpMembersInjector = new NoOpMembersInjector("INSTANCE", 0);
    INSTANCE = localNoOpMembersInjector;
    $VALUES = new NoOpMembersInjector[] { localNoOpMembersInjector };
  }
  
  private MembersInjectors$NoOpMembersInjector() {}
  
  public void injectMembers(Object paramObject)
  {
    Preconditions.checkNotNull(paramObject, "Cannot inject members into a null reference");
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.MembersInjectors.NoOpMembersInjector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */