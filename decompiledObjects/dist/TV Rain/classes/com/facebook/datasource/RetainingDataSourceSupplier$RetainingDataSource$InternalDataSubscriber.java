package com.facebook.datasource;

class RetainingDataSourceSupplier$RetainingDataSource$InternalDataSubscriber
  implements DataSubscriber<T>
{
  private RetainingDataSourceSupplier$RetainingDataSource$InternalDataSubscriber(RetainingDataSourceSupplier.RetainingDataSource paramRetainingDataSource) {}
  
  public void onCancellation(DataSource<T> paramDataSource) {}
  
  public void onFailure(DataSource<T> paramDataSource)
  {
    RetainingDataSourceSupplier.RetainingDataSource.access$300(this$0, paramDataSource);
  }
  
  public void onNewResult(DataSource<T> paramDataSource)
  {
    if (paramDataSource.hasResult()) {
      RetainingDataSourceSupplier.RetainingDataSource.access$200(this$0, paramDataSource);
    } else if (paramDataSource.isFinished()) {
      RetainingDataSourceSupplier.RetainingDataSource.access$300(this$0, paramDataSource);
    }
  }
  
  public void onProgressUpdate(DataSource<T> paramDataSource)
  {
    RetainingDataSourceSupplier.RetainingDataSource.access$400(this$0, paramDataSource);
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.RetainingDataSourceSupplier.RetainingDataSource.InternalDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */