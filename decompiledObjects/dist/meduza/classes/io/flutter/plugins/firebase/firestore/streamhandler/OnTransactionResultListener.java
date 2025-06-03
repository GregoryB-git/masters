package io.flutter.plugins.firebase.firestore.streamhandler;

import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionResult;
import java.util.List;

public abstract interface OnTransactionResultListener
{
  public abstract void receiveTransactionResponse(GeneratedAndroidFirebaseFirestore.PigeonTransactionResult paramPigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.OnTransactionResultListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */