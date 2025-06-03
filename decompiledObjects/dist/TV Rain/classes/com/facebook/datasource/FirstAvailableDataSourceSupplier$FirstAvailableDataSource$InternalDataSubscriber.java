package com.facebook.datasource;

class FirstAvailableDataSourceSupplier$FirstAvailableDataSource$InternalDataSubscriber
  implements DataSubscriber<T>
{
  private FirstAvailableDataSourceSupplier$FirstAvailableDataSource$InternalDataSubscriber(FirstAvailableDataSourceSupplier.FirstAvailableDataSource paramFirstAvailableDataSource) {}
  
  public void onCancellation(DataSource<T> paramDataSource) {}
  
  public void onFailure(DataSource<T> paramDataSource)
  {
    FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$200(this$1, paramDataSource);
  }
  
  public void onNewResult(DataSource<T> paramDataSource)
  {
    if (paramDataSource.hasResult()) {
      FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$300(this$1, paramDataSource);
    } else if (paramDataSource.isFinished()) {
      FirstAvailableDataSourceSupplier.FirstAvailableDataSource.access$200(this$1, paramDataSource);
    }
  }
  
  public void onProgressUpdate(DataSource<T> paramDataSource)
  {
    float f = this$1.getProgress();
    this$1.setProgress(Math.max(f, paramDataSource.getProgress()));
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.FirstAvailableDataSourceSupplier.FirstAvailableDataSource.InternalDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */