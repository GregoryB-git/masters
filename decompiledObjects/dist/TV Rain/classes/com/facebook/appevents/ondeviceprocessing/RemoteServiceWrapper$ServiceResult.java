package com.facebook.appevents.ondeviceprocessing;

 enum RemoteServiceWrapper$ServiceResult
{
  static
  {
    ServiceResult localServiceResult1 = new ServiceResult("OPERATION_SUCCESS", 0);
    OPERATION_SUCCESS = localServiceResult1;
    ServiceResult localServiceResult2 = new ServiceResult("SERVICE_NOT_AVAILABLE", 1);
    SERVICE_NOT_AVAILABLE = localServiceResult2;
    ServiceResult localServiceResult3 = new ServiceResult("SERVICE_ERROR", 2);
    SERVICE_ERROR = localServiceResult3;
    $VALUES = new ServiceResult[] { localServiceResult1, localServiceResult2, localServiceResult3 };
  }
  
  private RemoteServiceWrapper$ServiceResult() {}
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */