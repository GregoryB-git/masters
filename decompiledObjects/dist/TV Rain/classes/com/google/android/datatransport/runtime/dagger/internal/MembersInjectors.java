package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.MembersInjector;

public final class MembersInjectors
{
  public static <T> MembersInjector<T> noOp()
  {
    return NoOpMembersInjector.INSTANCE;
  }
  
  public static enum NoOpMembersInjector
    implements MembersInjector<Object>
  {
    static
    {
      NoOpMembersInjector localNoOpMembersInjector = new NoOpMembersInjector("INSTANCE", 0);
      INSTANCE = localNoOpMembersInjector;
      $VALUES = new NoOpMembersInjector[] { localNoOpMembersInjector };
    }
    
    private NoOpMembersInjector() {}
    
    public void injectMembers(Object paramObject)
    {
      Preconditions.checkNotNull(paramObject, "Cannot inject members into a null reference");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.MembersInjectors
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */