package io.flutter.plugins.firebase.firestore;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

class GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApiCodec
  extends FlutterFirebaseFirestoreMessageCodec
{
  public static final FirebaseFirestoreHostApiCodec INSTANCE = new FirebaseFirestoreHostApiCodec();
  
  public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
  {
    switch (paramByte)
    {
    default: 
      return super.readValueOfType(paramByte, paramByteBuffer);
    case -116: 
      return GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand.fromList((ArrayList)readValue(paramByteBuffer));
    case -117: 
      return GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.fromList((ArrayList)readValue(paramByteBuffer));
    case -118: 
      return GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.fromList((ArrayList)readValue(paramByteBuffer));
    case -119: 
      return GeneratedAndroidFirebaseFirestore.PigeonQueryParameters.fromList((ArrayList)readValue(paramByteBuffer));
    case -120: 
      return GeneratedAndroidFirebaseFirestore.PigeonGetOptions.fromList((ArrayList)readValue(paramByteBuffer));
    case -121: 
      return GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings.fromList((ArrayList)readValue(paramByteBuffer));
    case -122: 
      return GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.fromList((ArrayList)readValue(paramByteBuffer));
    case -123: 
      return GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.fromList((ArrayList)readValue(paramByteBuffer));
    case -124: 
      return GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.fromList((ArrayList)readValue(paramByteBuffer));
    case -125: 
      return GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp.fromList((ArrayList)readValue(paramByteBuffer));
    case -126: 
      return GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest.fromList((ArrayList)readValue(paramByteBuffer));
    case -127: 
      return GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.fromList((ArrayList)readValue(paramByteBuffer));
    }
    return GeneratedAndroidFirebaseFirestore.AggregateQuery.fromList((ArrayList)readValue(paramByteBuffer));
  }
  
  public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
  {
    if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.AggregateQuery))
    {
      paramByteArrayOutputStream.write(128);
      paramObject = ((GeneratedAndroidFirebaseFirestore.AggregateQuery)paramObject).toList();
    }
    for (;;)
    {
      writeValue(paramByteArrayOutputStream, paramObject);
      break label343;
      if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.AggregateQueryResponse))
      {
        paramByteArrayOutputStream.write(129);
        paramObject = ((GeneratedAndroidFirebaseFirestore.AggregateQueryResponse)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest))
      {
        paramByteArrayOutputStream.write(130);
        paramObject = ((GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp))
      {
        paramByteArrayOutputStream.write(131);
        paramObject = ((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonDocumentChange))
      {
        paramByteArrayOutputStream.write(132);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentChange)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonDocumentOption))
      {
        paramByteArrayOutputStream.write(133);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot))
      {
        paramByteArrayOutputStream.write(134);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings))
      {
        paramByteArrayOutputStream.write(135);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonGetOptions))
      {
        paramByteArrayOutputStream.write(136);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonGetOptions)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonQueryParameters))
      {
        paramByteArrayOutputStream.write(137);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonQueryParameters)paramObject).toList();
      }
      else if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot))
      {
        paramByteArrayOutputStream.write(138);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot)paramObject).toList();
      }
      else
      {
        if (!(paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata)) {
          break;
        }
        paramByteArrayOutputStream.write(139);
        paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata)paramObject).toList();
      }
    }
    if ((paramObject instanceof GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand))
    {
      paramByteArrayOutputStream.write(140);
      paramObject = ((GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)paramObject).toList();
    }
    try
    {
      writeValue(paramByteArrayOutputStream, paramObject);
      break label343;
      super.writeValue(paramByteArrayOutputStream, paramObject);
      label343:
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApiCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */