package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.FirebaseFirestore;

public class FlutterFirebaseFirestoreExtension
{
  private final String databaseURL;
  private final FirebaseFirestore instance;
  
  public FlutterFirebaseFirestoreExtension(FirebaseFirestore paramFirebaseFirestore, String paramString)
  {
    instance = paramFirebaseFirestore;
    databaseURL = paramString;
  }
  
  public String getDatabaseURL()
  {
    return databaseURL;
  }
  
  public FirebaseFirestore getInstance()
  {
    return instance;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreExtension
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */