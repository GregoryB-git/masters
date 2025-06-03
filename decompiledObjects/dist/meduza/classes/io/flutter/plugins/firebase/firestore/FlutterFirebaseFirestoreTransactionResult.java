package io.flutter.plugins.firebase.firestore;

public class FlutterFirebaseFirestoreTransactionResult
{
  public final Exception exception;
  
  private FlutterFirebaseFirestoreTransactionResult()
  {
    exception = null;
  }
  
  private FlutterFirebaseFirestoreTransactionResult(Exception paramException)
  {
    exception = paramException;
  }
  
  public static FlutterFirebaseFirestoreTransactionResult complete()
  {
    return new FlutterFirebaseFirestoreTransactionResult();
  }
  
  public static FlutterFirebaseFirestoreTransactionResult failed(Exception paramException)
  {
    return new FlutterFirebaseFirestoreTransactionResult(paramException);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreTransactionResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */