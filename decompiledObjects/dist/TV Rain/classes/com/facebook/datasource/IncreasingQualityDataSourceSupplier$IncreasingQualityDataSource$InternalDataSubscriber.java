package com.facebook.datasource;

class IncreasingQualityDataSourceSupplier$IncreasingQualityDataSource$InternalDataSubscriber
  implements DataSubscriber<T>
{
  private int mIndex;
  
  public IncreasingQualityDataSourceSupplier$IncreasingQualityDataSource$InternalDataSubscriber(IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource paramIncreasingQualityDataSource, int paramInt)
  {
    mIndex = paramInt;
  }
  
  public void onCancellation(DataSource<T> paramDataSource) {}
  
  public void onFailure(DataSource<T> paramDataSource)
  {
    IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$200(this$1, mIndex, paramDataSource);
  }
  
  public void onNewResult(DataSource<T> paramDataSource)
  {
    if (paramDataSource.hasResult()) {
      IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$100(this$1, mIndex, paramDataSource);
    } else if (paramDataSource.isFinished()) {
      IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.access$200(this$1, mIndex, paramDataSource);
    }
  }
  
  public void onProgressUpdate(DataSource<T> paramDataSource)
  {
    if (mIndex == 0) {
      this$1.setProgress(paramDataSource.getProgress());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.IncreasingQualityDataSourceSupplier.IncreasingQualityDataSource.InternalDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */