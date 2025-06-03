package com.facebook.appevents;

public enum PerformanceGuardian$UseCase
{
  static
  {
    UseCase localUseCase1 = new UseCase("CODELESS", 0);
    CODELESS = localUseCase1;
    UseCase localUseCase2 = new UseCase("SUGGESTED_EVENT", 1);
    SUGGESTED_EVENT = localUseCase2;
    $VALUES = new UseCase[] { localUseCase1, localUseCase2 };
  }
  
  private PerformanceGuardian$UseCase() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.PerformanceGuardian.UseCase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */