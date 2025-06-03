package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

@Keep
public class FirebaseCrashlyticsTestCrash
  extends RuntimeException
{
  public FirebaseCrashlyticsTestCrash()
  {
    super("This is a test crash caused by calling .crash() in Dart.");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */