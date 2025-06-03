package io.flutter.plugins.firebase.firestore;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidFirebaseFirestore
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static final class AggregateQuery
  {
    private String field;
    private GeneratedAndroidFirebaseFirestore.AggregateType type;
    
    public static AggregateQuery fromList(ArrayList<Object> paramArrayList)
    {
      AggregateQuery localAggregateQuery = new AggregateQuery();
      Object localObject = paramArrayList.get(0);
      localAggregateQuery.setType(GeneratedAndroidFirebaseFirestore.AggregateType.values()[((Integer)localObject).intValue()]);
      localAggregateQuery.setField((String)paramArrayList.get(1));
      return localAggregateQuery;
    }
    
    public String getField()
    {
      return field;
    }
    
    public GeneratedAndroidFirebaseFirestore.AggregateType getType()
    {
      return type;
    }
    
    public void setField(String paramString)
    {
      field = paramString;
    }
    
    public void setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
    {
      if (paramAggregateType != null)
      {
        type = paramAggregateType;
        return;
      }
      throw new IllegalStateException("Nonnull field \"type\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      Object localObject = type;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Integer.valueOf(index);
      }
      localArrayList.add(localObject);
      localArrayList.add(field);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String field;
      private GeneratedAndroidFirebaseFirestore.AggregateType type;
      
      public GeneratedAndroidFirebaseFirestore.AggregateQuery build()
      {
        GeneratedAndroidFirebaseFirestore.AggregateQuery localAggregateQuery = new GeneratedAndroidFirebaseFirestore.AggregateQuery();
        localAggregateQuery.setType(type);
        localAggregateQuery.setField(field);
        return localAggregateQuery;
      }
      
      public Builder setField(String paramString)
      {
        field = paramString;
        return this;
      }
      
      public Builder setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
      {
        type = paramAggregateType;
        return this;
      }
    }
  }
  
  public static final class AggregateQueryResponse
  {
    private String field;
    private GeneratedAndroidFirebaseFirestore.AggregateType type;
    private Double value;
    
    public static AggregateQueryResponse fromList(ArrayList<Object> paramArrayList)
    {
      AggregateQueryResponse localAggregateQueryResponse = new AggregateQueryResponse();
      Object localObject = paramArrayList.get(0);
      localAggregateQueryResponse.setType(GeneratedAndroidFirebaseFirestore.AggregateType.values()[((Integer)localObject).intValue()]);
      localAggregateQueryResponse.setField((String)paramArrayList.get(1));
      localAggregateQueryResponse.setValue((Double)paramArrayList.get(2));
      return localAggregateQueryResponse;
    }
    
    public String getField()
    {
      return field;
    }
    
    public GeneratedAndroidFirebaseFirestore.AggregateType getType()
    {
      return type;
    }
    
    public Double getValue()
    {
      return value;
    }
    
    public void setField(String paramString)
    {
      field = paramString;
    }
    
    public void setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
    {
      if (paramAggregateType != null)
      {
        type = paramAggregateType;
        return;
      }
      throw new IllegalStateException("Nonnull field \"type\" is null.");
    }
    
    public void setValue(Double paramDouble)
    {
      value = paramDouble;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      Object localObject = type;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = Integer.valueOf(index);
      }
      localArrayList.add(localObject);
      localArrayList.add(field);
      localArrayList.add(value);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String field;
      private GeneratedAndroidFirebaseFirestore.AggregateType type;
      private Double value;
      
      public GeneratedAndroidFirebaseFirestore.AggregateQueryResponse build()
      {
        GeneratedAndroidFirebaseFirestore.AggregateQueryResponse localAggregateQueryResponse = new GeneratedAndroidFirebaseFirestore.AggregateQueryResponse();
        localAggregateQueryResponse.setType(type);
        localAggregateQueryResponse.setField(field);
        localAggregateQueryResponse.setValue(value);
        return localAggregateQueryResponse;
      }
      
      public Builder setField(String paramString)
      {
        field = paramString;
        return this;
      }
      
      public Builder setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
      {
        type = paramAggregateType;
        return this;
      }
      
      public Builder setValue(Double paramDouble)
      {
        value = paramDouble;
        return this;
      }
    }
  }
  
  public static enum AggregateSource
  {
    public final int index;
    
    private AggregateSource(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static enum AggregateType
  {
    public final int index;
    
    static
    {
      AVERAGE = new AggregateType("AVERAGE", 2, 2);
    }
    
    private AggregateType(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static enum DocumentChangeType
  {
    public final int index;
    
    private DocumentChangeType(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static final class DocumentReferenceRequest
  {
    private Map<Object, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
    private String path;
    private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
    private GeneratedAndroidFirebaseFirestore.Source source;
    
    public static DocumentReferenceRequest fromList(ArrayList<Object> paramArrayList)
    {
      DocumentReferenceRequest localDocumentReferenceRequest = new DocumentReferenceRequest();
      localDocumentReferenceRequest.setPath((String)paramArrayList.get(0));
      localDocumentReferenceRequest.setData((Map)paramArrayList.get(1));
      Object localObject1 = paramArrayList.get(2);
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.fromList((ArrayList)localObject1);
      }
      localDocumentReferenceRequest.setOption((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1);
      localObject1 = paramArrayList.get(3);
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = GeneratedAndroidFirebaseFirestore.Source.values()[((Integer)localObject1).intValue()];
      }
      localDocumentReferenceRequest.setSource((GeneratedAndroidFirebaseFirestore.Source)localObject1);
      paramArrayList = paramArrayList.get(4);
      if (paramArrayList == null) {
        paramArrayList = (ArrayList<Object>)localObject2;
      } else {
        paramArrayList = GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.values()[((Integer)paramArrayList).intValue()];
      }
      localDocumentReferenceRequest.setServerTimestampBehavior(paramArrayList);
      return localDocumentReferenceRequest;
    }
    
    public Map<Object, Object> getData()
    {
      return data;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonDocumentOption getOption()
    {
      return option;
    }
    
    public String getPath()
    {
      return path;
    }
    
    public GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior getServerTimestampBehavior()
    {
      return serverTimestampBehavior;
    }
    
    public GeneratedAndroidFirebaseFirestore.Source getSource()
    {
      return source;
    }
    
    public void setData(Map<Object, Object> paramMap)
    {
      data = paramMap;
    }
    
    public void setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
    {
      option = paramPigeonDocumentOption;
    }
    
    public void setPath(String paramString)
    {
      if (paramString != null)
      {
        path = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"path\" is null.");
    }
    
    public void setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
    {
      serverTimestampBehavior = paramServerTimestampBehavior;
    }
    
    public void setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
    {
      source = paramSource;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(path);
      localArrayList.add(data);
      Object localObject1 = option;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1).toList();
      }
      localArrayList.add(localObject1);
      localObject1 = source;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      localObject1 = serverTimestampBehavior;
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Map<Object, Object> data;
      private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
      private String path;
      private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
      private GeneratedAndroidFirebaseFirestore.Source source;
      
      public GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest build()
      {
        GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest localDocumentReferenceRequest = new GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest();
        localDocumentReferenceRequest.setPath(path);
        localDocumentReferenceRequest.setData(data);
        localDocumentReferenceRequest.setOption(option);
        localDocumentReferenceRequest.setSource(source);
        localDocumentReferenceRequest.setServerTimestampBehavior(serverTimestampBehavior);
        return localDocumentReferenceRequest;
      }
      
      public Builder setData(Map<Object, Object> paramMap)
      {
        data = paramMap;
        return this;
      }
      
      public Builder setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
      {
        option = paramPigeonDocumentOption;
        return this;
      }
      
      public Builder setPath(String paramString)
      {
        path = paramString;
        return this;
      }
      
      public Builder setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
      {
        serverTimestampBehavior = paramServerTimestampBehavior;
        return this;
      }
      
      public Builder setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
      {
        source = paramSource;
        return this;
      }
    }
  }
  
  public static abstract interface FirebaseFirestoreHostApi
  {
    public abstract void aggregateQuery(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.AggregateSource paramAggregateSource, List<GeneratedAndroidFirebaseFirestore.AggregateQuery> paramList, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.Result<List<GeneratedAndroidFirebaseFirestore.AggregateQueryResponse>> paramResult);
    
    public abstract void clearPersistence(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void disableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void documentReferenceDelete(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void documentReferenceGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramResult);
    
    public abstract void documentReferenceSet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void documentReferenceSnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.ListenSource paramListenSource, GeneratedAndroidFirebaseFirestore.Result<String> paramResult);
    
    public abstract void documentReferenceUpdate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void enableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void loadBundle(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, byte[] paramArrayOfByte, GeneratedAndroidFirebaseFirestore.Result<String> paramResult);
    
    public abstract void namedQueryGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> paramResult);
    
    public abstract void persistenceCacheIndexManagerRequest(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest paramPersistenceCacheIndexManagerRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void queryGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> paramResult);
    
    public abstract void querySnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, Boolean paramBoolean1, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, Boolean paramBoolean2, GeneratedAndroidFirebaseFirestore.ListenSource paramListenSource, GeneratedAndroidFirebaseFirestore.Result<String> paramResult);
    
    public abstract void setIndexConfiguration(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void setLoggingEnabled(Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void snapshotsInSyncSetup(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<String> paramResult);
    
    public abstract void terminate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void transactionCreate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, Long paramLong1, Long paramLong2, GeneratedAndroidFirebaseFirestore.Result<String> paramResult);
    
    public abstract void transactionGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramResult);
    
    public abstract void transactionStoreResult(String paramString, GeneratedAndroidFirebaseFirestore.PigeonTransactionResult paramPigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void waitForPendingWrites(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
    
    public abstract void writeBatchCommit(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult);
  }
  
  public static class FirebaseFirestoreHostApiCodec
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
  
  public static final class FirestorePigeonFirebaseApp
  {
    private String appName;
    private String databaseURL;
    private GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings settings;
    
    public static FirestorePigeonFirebaseApp fromList(ArrayList<Object> paramArrayList)
    {
      FirestorePigeonFirebaseApp localFirestorePigeonFirebaseApp = new FirestorePigeonFirebaseApp();
      localFirestorePigeonFirebaseApp.setAppName((String)paramArrayList.get(0));
      Object localObject = paramArrayList.get(1);
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings.fromList((ArrayList)localObject);
      }
      localFirestorePigeonFirebaseApp.setSettings((GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings)localObject);
      localFirestorePigeonFirebaseApp.setDatabaseURL((String)paramArrayList.get(2));
      return localFirestorePigeonFirebaseApp;
    }
    
    public String getAppName()
    {
      return appName;
    }
    
    public String getDatabaseURL()
    {
      return databaseURL;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings getSettings()
    {
      return settings;
    }
    
    public void setAppName(String paramString)
    {
      if (paramString != null)
      {
        appName = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"appName\" is null.");
    }
    
    public void setDatabaseURL(String paramString)
    {
      if (paramString != null)
      {
        databaseURL = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
    }
    
    public void setSettings(GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings paramPigeonFirebaseSettings)
    {
      if (paramPigeonFirebaseSettings != null)
      {
        settings = paramPigeonFirebaseSettings;
        return;
      }
      throw new IllegalStateException("Nonnull field \"settings\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(appName);
      Object localObject = settings;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings)localObject).toList();
      }
      localArrayList.add(localObject);
      localArrayList.add(databaseURL);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String appName;
      private String databaseURL;
      private GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings settings;
      
      public GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp build()
      {
        GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp localFirestorePigeonFirebaseApp = new GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp();
        localFirestorePigeonFirebaseApp.setAppName(appName);
        localFirestorePigeonFirebaseApp.setSettings(settings);
        localFirestorePigeonFirebaseApp.setDatabaseURL(databaseURL);
        return localFirestorePigeonFirebaseApp;
      }
      
      public Builder setAppName(String paramString)
      {
        appName = paramString;
        return this;
      }
      
      public Builder setDatabaseURL(String paramString)
      {
        databaseURL = paramString;
        return this;
      }
      
      public Builder setSettings(GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings paramPigeonFirebaseSettings)
      {
        settings = paramPigeonFirebaseSettings;
        return this;
      }
    }
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static enum ListenSource
  {
    public final int index;
    
    static
    {
      CACHE = new ListenSource("CACHE", 1, 1);
    }
    
    private ListenSource(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static enum PersistenceCacheIndexManagerRequest
  {
    public final int index;
    
    static
    {
      DISABLE_INDEX_AUTO_CREATION = new PersistenceCacheIndexManagerRequest("DISABLE_INDEX_AUTO_CREATION", 1, 1);
      DELETE_ALL_INDEXES = new PersistenceCacheIndexManagerRequest("DELETE_ALL_INDEXES", 2, 2);
    }
    
    private PersistenceCacheIndexManagerRequest(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static final class PigeonDocumentChange
  {
    private GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot document;
    private Long newIndex;
    private Long oldIndex;
    private GeneratedAndroidFirebaseFirestore.DocumentChangeType type;
    
    public static PigeonDocumentChange fromList(ArrayList<Object> paramArrayList)
    {
      PigeonDocumentChange localPigeonDocumentChange = new PigeonDocumentChange();
      Object localObject1 = paramArrayList.get(0);
      localPigeonDocumentChange.setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType.values()[((Integer)localObject1).intValue()]);
      localObject1 = paramArrayList.get(1);
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.fromList((ArrayList)localObject1);
      }
      localPigeonDocumentChange.setDocument((GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot)localObject1);
      localObject1 = paramArrayList.get(2);
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonDocumentChange.setOldIndex((Long)localObject1);
      paramArrayList = paramArrayList.get(3);
      if (paramArrayList == null)
      {
        paramArrayList = (ArrayList<Object>)localObject2;
      }
      else
      {
        if ((paramArrayList instanceof Integer)) {
          l = ((Integer)paramArrayList).intValue();
        } else {
          l = ((Long)paramArrayList).longValue();
        }
        paramArrayList = Long.valueOf(l);
      }
      localPigeonDocumentChange.setNewIndex(paramArrayList);
      return localPigeonDocumentChange;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot getDocument()
    {
      return document;
    }
    
    public Long getNewIndex()
    {
      return newIndex;
    }
    
    public Long getOldIndex()
    {
      return oldIndex;
    }
    
    public GeneratedAndroidFirebaseFirestore.DocumentChangeType getType()
    {
      return type;
    }
    
    public void setDocument(GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot paramPigeonDocumentSnapshot)
    {
      if (paramPigeonDocumentSnapshot != null)
      {
        document = paramPigeonDocumentSnapshot;
        return;
      }
      throw new IllegalStateException("Nonnull field \"document\" is null.");
    }
    
    public void setNewIndex(Long paramLong)
    {
      if (paramLong != null)
      {
        newIndex = paramLong;
        return;
      }
      throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
    }
    
    public void setOldIndex(Long paramLong)
    {
      if (paramLong != null)
      {
        oldIndex = paramLong;
        return;
      }
      throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
    }
    
    public void setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType paramDocumentChangeType)
    {
      if (paramDocumentChangeType != null)
      {
        type = paramDocumentChangeType;
        return;
      }
      throw new IllegalStateException("Nonnull field \"type\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(4);
      Object localObject1 = type;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      localObject1 = document;
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot)localObject1).toList();
      }
      localArrayList.add(localObject1);
      localArrayList.add(oldIndex);
      localArrayList.add(newIndex);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot document;
      private Long newIndex;
      private Long oldIndex;
      private GeneratedAndroidFirebaseFirestore.DocumentChangeType type;
      
      public GeneratedAndroidFirebaseFirestore.PigeonDocumentChange build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonDocumentChange localPigeonDocumentChange = new GeneratedAndroidFirebaseFirestore.PigeonDocumentChange();
        localPigeonDocumentChange.setType(type);
        localPigeonDocumentChange.setDocument(document);
        localPigeonDocumentChange.setOldIndex(oldIndex);
        localPigeonDocumentChange.setNewIndex(newIndex);
        return localPigeonDocumentChange;
      }
      
      public Builder setDocument(GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot paramPigeonDocumentSnapshot)
      {
        document = paramPigeonDocumentSnapshot;
        return this;
      }
      
      public Builder setNewIndex(Long paramLong)
      {
        newIndex = paramLong;
        return this;
      }
      
      public Builder setOldIndex(Long paramLong)
      {
        oldIndex = paramLong;
        return this;
      }
      
      public Builder setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType paramDocumentChangeType)
      {
        type = paramDocumentChangeType;
        return this;
      }
    }
  }
  
  public static final class PigeonDocumentOption
  {
    private Boolean merge;
    private List<List<String>> mergeFields;
    
    public static PigeonDocumentOption fromList(ArrayList<Object> paramArrayList)
    {
      PigeonDocumentOption localPigeonDocumentOption = new PigeonDocumentOption();
      localPigeonDocumentOption.setMerge((Boolean)paramArrayList.get(0));
      localPigeonDocumentOption.setMergeFields((List)paramArrayList.get(1));
      return localPigeonDocumentOption;
    }
    
    public Boolean getMerge()
    {
      return merge;
    }
    
    public List<List<String>> getMergeFields()
    {
      return mergeFields;
    }
    
    public void setMerge(Boolean paramBoolean)
    {
      merge = paramBoolean;
    }
    
    public void setMergeFields(List<List<String>> paramList)
    {
      mergeFields = paramList;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(merge);
      localArrayList.add(mergeFields);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Boolean merge;
      private List<List<String>> mergeFields;
      
      public GeneratedAndroidFirebaseFirestore.PigeonDocumentOption build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonDocumentOption localPigeonDocumentOption = new GeneratedAndroidFirebaseFirestore.PigeonDocumentOption();
        localPigeonDocumentOption.setMerge(merge);
        localPigeonDocumentOption.setMergeFields(mergeFields);
        return localPigeonDocumentOption;
      }
      
      public Builder setMerge(Boolean paramBoolean)
      {
        merge = paramBoolean;
        return this;
      }
      
      public Builder setMergeFields(List<List<String>> paramList)
      {
        mergeFields = paramList;
        return this;
      }
    }
  }
  
  public static final class PigeonDocumentSnapshot
  {
    private Map<String, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
    private String path;
    
    public static PigeonDocumentSnapshot fromList(ArrayList<Object> paramArrayList)
    {
      PigeonDocumentSnapshot localPigeonDocumentSnapshot = new PigeonDocumentSnapshot();
      localPigeonDocumentSnapshot.setPath((String)paramArrayList.get(0));
      localPigeonDocumentSnapshot.setData((Map)paramArrayList.get(1));
      paramArrayList = paramArrayList.get(2);
      if (paramArrayList == null) {
        paramArrayList = null;
      } else {
        paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.fromList((ArrayList)paramArrayList);
      }
      localPigeonDocumentSnapshot.setMetadata(paramArrayList);
      return localPigeonDocumentSnapshot;
    }
    
    public Map<String, Object> getData()
    {
      return data;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata getMetadata()
    {
      return metadata;
    }
    
    public String getPath()
    {
      return path;
    }
    
    public void setData(Map<String, Object> paramMap)
    {
      data = paramMap;
    }
    
    public void setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
    {
      if (paramPigeonSnapshotMetadata != null)
      {
        metadata = paramPigeonSnapshotMetadata;
        return;
      }
      throw new IllegalStateException("Nonnull field \"metadata\" is null.");
    }
    
    public void setPath(String paramString)
    {
      if (paramString != null)
      {
        path = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"path\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(path);
      localArrayList.add(data);
      Object localObject = metadata;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata)localObject).toList();
      }
      localArrayList.add(localObject);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Map<String, Object> data;
      private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
      private String path;
      
      public GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot localPigeonDocumentSnapshot = new GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot();
        localPigeonDocumentSnapshot.setPath(path);
        localPigeonDocumentSnapshot.setData(data);
        localPigeonDocumentSnapshot.setMetadata(metadata);
        return localPigeonDocumentSnapshot;
      }
      
      public Builder setData(Map<String, Object> paramMap)
      {
        data = paramMap;
        return this;
      }
      
      public Builder setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
      {
        metadata = paramPigeonSnapshotMetadata;
        return this;
      }
      
      public Builder setPath(String paramString)
      {
        path = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonFirebaseSettings
  {
    private Long cacheSizeBytes;
    private String host;
    private Boolean ignoreUndefinedProperties;
    private Boolean persistenceEnabled;
    private Boolean sslEnabled;
    
    public static PigeonFirebaseSettings fromList(ArrayList<Object> paramArrayList)
    {
      PigeonFirebaseSettings localPigeonFirebaseSettings = new PigeonFirebaseSettings();
      localPigeonFirebaseSettings.setPersistenceEnabled((Boolean)paramArrayList.get(0));
      localPigeonFirebaseSettings.setHost((String)paramArrayList.get(1));
      localPigeonFirebaseSettings.setSslEnabled((Boolean)paramArrayList.get(2));
      Object localObject = paramArrayList.get(3);
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        long l;
        if ((localObject instanceof Integer)) {
          l = ((Integer)localObject).intValue();
        } else {
          l = ((Long)localObject).longValue();
        }
        localObject = Long.valueOf(l);
      }
      localPigeonFirebaseSettings.setCacheSizeBytes((Long)localObject);
      localPigeonFirebaseSettings.setIgnoreUndefinedProperties((Boolean)paramArrayList.get(4));
      return localPigeonFirebaseSettings;
    }
    
    public Long getCacheSizeBytes()
    {
      return cacheSizeBytes;
    }
    
    public String getHost()
    {
      return host;
    }
    
    public Boolean getIgnoreUndefinedProperties()
    {
      return ignoreUndefinedProperties;
    }
    
    public Boolean getPersistenceEnabled()
    {
      return persistenceEnabled;
    }
    
    public Boolean getSslEnabled()
    {
      return sslEnabled;
    }
    
    public void setCacheSizeBytes(Long paramLong)
    {
      cacheSizeBytes = paramLong;
    }
    
    public void setHost(String paramString)
    {
      host = paramString;
    }
    
    public void setIgnoreUndefinedProperties(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        ignoreUndefinedProperties = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
    }
    
    public void setPersistenceEnabled(Boolean paramBoolean)
    {
      persistenceEnabled = paramBoolean;
    }
    
    public void setSslEnabled(Boolean paramBoolean)
    {
      sslEnabled = paramBoolean;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(5);
      localArrayList.add(persistenceEnabled);
      localArrayList.add(host);
      localArrayList.add(sslEnabled);
      localArrayList.add(cacheSizeBytes);
      localArrayList.add(ignoreUndefinedProperties);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Long cacheSizeBytes;
      private String host;
      private Boolean ignoreUndefinedProperties;
      private Boolean persistenceEnabled;
      private Boolean sslEnabled;
      
      public GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings localPigeonFirebaseSettings = new GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings();
        localPigeonFirebaseSettings.setPersistenceEnabled(persistenceEnabled);
        localPigeonFirebaseSettings.setHost(host);
        localPigeonFirebaseSettings.setSslEnabled(sslEnabled);
        localPigeonFirebaseSettings.setCacheSizeBytes(cacheSizeBytes);
        localPigeonFirebaseSettings.setIgnoreUndefinedProperties(ignoreUndefinedProperties);
        return localPigeonFirebaseSettings;
      }
      
      public Builder setCacheSizeBytes(Long paramLong)
      {
        cacheSizeBytes = paramLong;
        return this;
      }
      
      public Builder setHost(String paramString)
      {
        host = paramString;
        return this;
      }
      
      public Builder setIgnoreUndefinedProperties(Boolean paramBoolean)
      {
        ignoreUndefinedProperties = paramBoolean;
        return this;
      }
      
      public Builder setPersistenceEnabled(Boolean paramBoolean)
      {
        persistenceEnabled = paramBoolean;
        return this;
      }
      
      public Builder setSslEnabled(Boolean paramBoolean)
      {
        sslEnabled = paramBoolean;
        return this;
      }
    }
  }
  
  public static final class PigeonGetOptions
  {
    private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
    private GeneratedAndroidFirebaseFirestore.Source source;
    
    public static PigeonGetOptions fromList(ArrayList<Object> paramArrayList)
    {
      PigeonGetOptions localPigeonGetOptions = new PigeonGetOptions();
      Object localObject = paramArrayList.get(0);
      localPigeonGetOptions.setSource(GeneratedAndroidFirebaseFirestore.Source.values()[((Integer)localObject).intValue()]);
      paramArrayList = paramArrayList.get(1);
      localPigeonGetOptions.setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.values()[((Integer)paramArrayList).intValue()]);
      return localPigeonGetOptions;
    }
    
    public GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior getServerTimestampBehavior()
    {
      return serverTimestampBehavior;
    }
    
    public GeneratedAndroidFirebaseFirestore.Source getSource()
    {
      return source;
    }
    
    public void setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
    {
      if (paramServerTimestampBehavior != null)
      {
        serverTimestampBehavior = paramServerTimestampBehavior;
        return;
      }
      throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
    }
    
    public void setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
    {
      if (paramSource != null)
      {
        source = paramSource;
        return;
      }
      throw new IllegalStateException("Nonnull field \"source\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      Object localObject1 = source;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      localObject1 = serverTimestampBehavior;
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
      private GeneratedAndroidFirebaseFirestore.Source source;
      
      public GeneratedAndroidFirebaseFirestore.PigeonGetOptions build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonGetOptions localPigeonGetOptions = new GeneratedAndroidFirebaseFirestore.PigeonGetOptions();
        localPigeonGetOptions.setSource(source);
        localPigeonGetOptions.setServerTimestampBehavior(serverTimestampBehavior);
        return localPigeonGetOptions;
      }
      
      public Builder setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
      {
        serverTimestampBehavior = paramServerTimestampBehavior;
        return this;
      }
      
      public Builder setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
      {
        source = paramSource;
        return this;
      }
    }
  }
  
  public static final class PigeonQueryParameters
  {
    private List<Object> endAt;
    private List<Object> endBefore;
    private Map<String, Object> filters;
    private Long limit;
    private Long limitToLast;
    private List<List<Object>> orderBy;
    private List<Object> startAfter;
    private List<Object> startAt;
    private List<List<Object>> where;
    
    public static PigeonQueryParameters fromList(ArrayList<Object> paramArrayList)
    {
      PigeonQueryParameters localPigeonQueryParameters = new PigeonQueryParameters();
      localPigeonQueryParameters.setWhere((List)paramArrayList.get(0));
      localPigeonQueryParameters.setOrderBy((List)paramArrayList.get(1));
      Object localObject1 = paramArrayList.get(2);
      Object localObject2 = null;
      long l;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonQueryParameters.setLimit((Long)localObject1);
      localObject1 = paramArrayList.get(3);
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        if ((localObject1 instanceof Integer)) {
          l = ((Integer)localObject1).intValue();
        } else {
          l = ((Long)localObject1).longValue();
        }
        localObject1 = Long.valueOf(l);
      }
      localPigeonQueryParameters.setLimitToLast((Long)localObject1);
      localPigeonQueryParameters.setStartAt((List)paramArrayList.get(4));
      localPigeonQueryParameters.setStartAfter((List)paramArrayList.get(5));
      localPigeonQueryParameters.setEndAt((List)paramArrayList.get(6));
      localPigeonQueryParameters.setEndBefore((List)paramArrayList.get(7));
      localPigeonQueryParameters.setFilters((Map)paramArrayList.get(8));
      return localPigeonQueryParameters;
    }
    
    public List<Object> getEndAt()
    {
      return endAt;
    }
    
    public List<Object> getEndBefore()
    {
      return endBefore;
    }
    
    public Map<String, Object> getFilters()
    {
      return filters;
    }
    
    public Long getLimit()
    {
      return limit;
    }
    
    public Long getLimitToLast()
    {
      return limitToLast;
    }
    
    public List<List<Object>> getOrderBy()
    {
      return orderBy;
    }
    
    public List<Object> getStartAfter()
    {
      return startAfter;
    }
    
    public List<Object> getStartAt()
    {
      return startAt;
    }
    
    public List<List<Object>> getWhere()
    {
      return where;
    }
    
    public void setEndAt(List<Object> paramList)
    {
      endAt = paramList;
    }
    
    public void setEndBefore(List<Object> paramList)
    {
      endBefore = paramList;
    }
    
    public void setFilters(Map<String, Object> paramMap)
    {
      filters = paramMap;
    }
    
    public void setLimit(Long paramLong)
    {
      limit = paramLong;
    }
    
    public void setLimitToLast(Long paramLong)
    {
      limitToLast = paramLong;
    }
    
    public void setOrderBy(List<List<Object>> paramList)
    {
      orderBy = paramList;
    }
    
    public void setStartAfter(List<Object> paramList)
    {
      startAfter = paramList;
    }
    
    public void setStartAt(List<Object> paramList)
    {
      startAt = paramList;
    }
    
    public void setWhere(List<List<Object>> paramList)
    {
      where = paramList;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(9);
      localArrayList.add(where);
      localArrayList.add(orderBy);
      localArrayList.add(limit);
      localArrayList.add(limitToLast);
      localArrayList.add(startAt);
      localArrayList.add(startAfter);
      localArrayList.add(endAt);
      localArrayList.add(endBefore);
      localArrayList.add(filters);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private List<Object> endAt;
      private List<Object> endBefore;
      private Map<String, Object> filters;
      private Long limit;
      private Long limitToLast;
      private List<List<Object>> orderBy;
      private List<Object> startAfter;
      private List<Object> startAt;
      private List<List<Object>> where;
      
      public GeneratedAndroidFirebaseFirestore.PigeonQueryParameters build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonQueryParameters localPigeonQueryParameters = new GeneratedAndroidFirebaseFirestore.PigeonQueryParameters();
        localPigeonQueryParameters.setWhere(where);
        localPigeonQueryParameters.setOrderBy(orderBy);
        localPigeonQueryParameters.setLimit(limit);
        localPigeonQueryParameters.setLimitToLast(limitToLast);
        localPigeonQueryParameters.setStartAt(startAt);
        localPigeonQueryParameters.setStartAfter(startAfter);
        localPigeonQueryParameters.setEndAt(endAt);
        localPigeonQueryParameters.setEndBefore(endBefore);
        localPigeonQueryParameters.setFilters(filters);
        return localPigeonQueryParameters;
      }
      
      public Builder setEndAt(List<Object> paramList)
      {
        endAt = paramList;
        return this;
      }
      
      public Builder setEndBefore(List<Object> paramList)
      {
        endBefore = paramList;
        return this;
      }
      
      public Builder setFilters(Map<String, Object> paramMap)
      {
        filters = paramMap;
        return this;
      }
      
      public Builder setLimit(Long paramLong)
      {
        limit = paramLong;
        return this;
      }
      
      public Builder setLimitToLast(Long paramLong)
      {
        limitToLast = paramLong;
        return this;
      }
      
      public Builder setOrderBy(List<List<Object>> paramList)
      {
        orderBy = paramList;
        return this;
      }
      
      public Builder setStartAfter(List<Object> paramList)
      {
        startAfter = paramList;
        return this;
      }
      
      public Builder setStartAt(List<Object> paramList)
      {
        startAt = paramList;
        return this;
      }
      
      public Builder setWhere(List<List<Object>> paramList)
      {
        where = paramList;
        return this;
      }
    }
  }
  
  public static final class PigeonQuerySnapshot
  {
    private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> documentChanges;
    private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> documents;
    private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
    
    public static PigeonQuerySnapshot fromList(ArrayList<Object> paramArrayList)
    {
      PigeonQuerySnapshot localPigeonQuerySnapshot = new PigeonQuerySnapshot();
      localPigeonQuerySnapshot.setDocuments((List)paramArrayList.get(0));
      localPigeonQuerySnapshot.setDocumentChanges((List)paramArrayList.get(1));
      paramArrayList = paramArrayList.get(2);
      if (paramArrayList == null) {
        paramArrayList = null;
      } else {
        paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.fromList((ArrayList)paramArrayList);
      }
      localPigeonQuerySnapshot.setMetadata(paramArrayList);
      return localPigeonQuerySnapshot;
    }
    
    public List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> getDocumentChanges()
    {
      return documentChanges;
    }
    
    public List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> getDocuments()
    {
      return documents;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata getMetadata()
    {
      return metadata;
    }
    
    public void setDocumentChanges(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> paramList)
    {
      if (paramList != null)
      {
        documentChanges = paramList;
        return;
      }
      throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
    }
    
    public void setDocuments(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramList)
    {
      if (paramList != null)
      {
        documents = paramList;
        return;
      }
      throw new IllegalStateException("Nonnull field \"documents\" is null.");
    }
    
    public void setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
    {
      if (paramPigeonSnapshotMetadata != null)
      {
        metadata = paramPigeonSnapshotMetadata;
        return;
      }
      throw new IllegalStateException("Nonnull field \"metadata\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(documents);
      localArrayList.add(documentChanges);
      Object localObject = metadata;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata)localObject).toList();
      }
      localArrayList.add(localObject);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> documentChanges;
      private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> documents;
      private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
      
      public GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot localPigeonQuerySnapshot = new GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot();
        localPigeonQuerySnapshot.setDocuments(documents);
        localPigeonQuerySnapshot.setDocumentChanges(documentChanges);
        localPigeonQuerySnapshot.setMetadata(metadata);
        return localPigeonQuerySnapshot;
      }
      
      public Builder setDocumentChanges(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> paramList)
      {
        documentChanges = paramList;
        return this;
      }
      
      public Builder setDocuments(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramList)
      {
        documents = paramList;
        return this;
      }
      
      public Builder setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
      {
        metadata = paramPigeonSnapshotMetadata;
        return this;
      }
    }
  }
  
  public static final class PigeonSnapshotMetadata
  {
    private Boolean hasPendingWrites;
    private Boolean isFromCache;
    
    public static PigeonSnapshotMetadata fromList(ArrayList<Object> paramArrayList)
    {
      PigeonSnapshotMetadata localPigeonSnapshotMetadata = new PigeonSnapshotMetadata();
      localPigeonSnapshotMetadata.setHasPendingWrites((Boolean)paramArrayList.get(0));
      localPigeonSnapshotMetadata.setIsFromCache((Boolean)paramArrayList.get(1));
      return localPigeonSnapshotMetadata;
    }
    
    public Boolean getHasPendingWrites()
    {
      return hasPendingWrites;
    }
    
    public Boolean getIsFromCache()
    {
      return isFromCache;
    }
    
    public void setHasPendingWrites(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        hasPendingWrites = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
    }
    
    public void setIsFromCache(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        isFromCache = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(2);
      localArrayList.add(hasPendingWrites);
      localArrayList.add(isFromCache);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Boolean hasPendingWrites;
      private Boolean isFromCache;
      
      public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata localPigeonSnapshotMetadata = new GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata();
        localPigeonSnapshotMetadata.setHasPendingWrites(hasPendingWrites);
        localPigeonSnapshotMetadata.setIsFromCache(isFromCache);
        return localPigeonSnapshotMetadata;
      }
      
      public Builder setHasPendingWrites(Boolean paramBoolean)
      {
        hasPendingWrites = paramBoolean;
        return this;
      }
      
      public Builder setIsFromCache(Boolean paramBoolean)
      {
        isFromCache = paramBoolean;
        return this;
      }
    }
  }
  
  public static final class PigeonTransactionCommand
  {
    private Map<String, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
    private String path;
    private GeneratedAndroidFirebaseFirestore.PigeonTransactionType type;
    
    public static PigeonTransactionCommand fromList(ArrayList<Object> paramArrayList)
    {
      PigeonTransactionCommand localPigeonTransactionCommand = new PigeonTransactionCommand();
      Object localObject = paramArrayList.get(0);
      localPigeonTransactionCommand.setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType.values()[((Integer)localObject).intValue()]);
      localPigeonTransactionCommand.setPath((String)paramArrayList.get(1));
      localPigeonTransactionCommand.setData((Map)paramArrayList.get(2));
      paramArrayList = paramArrayList.get(3);
      if (paramArrayList == null) {
        paramArrayList = null;
      } else {
        paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.fromList((ArrayList)paramArrayList);
      }
      localPigeonTransactionCommand.setOption(paramArrayList);
      return localPigeonTransactionCommand;
    }
    
    public Map<String, Object> getData()
    {
      return data;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonDocumentOption getOption()
    {
      return option;
    }
    
    public String getPath()
    {
      return path;
    }
    
    public GeneratedAndroidFirebaseFirestore.PigeonTransactionType getType()
    {
      return type;
    }
    
    public void setData(Map<String, Object> paramMap)
    {
      data = paramMap;
    }
    
    public void setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
    {
      option = paramPigeonDocumentOption;
    }
    
    public void setPath(String paramString)
    {
      if (paramString != null)
      {
        path = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"path\" is null.");
    }
    
    public void setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType paramPigeonTransactionType)
    {
      if (paramPigeonTransactionType != null)
      {
        type = paramPigeonTransactionType;
        return;
      }
      throw new IllegalStateException("Nonnull field \"type\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(4);
      Object localObject1 = type;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = Integer.valueOf(index);
      }
      localArrayList.add(localObject1);
      localArrayList.add(path);
      localArrayList.add(data);
      localObject1 = option;
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1).toList();
      }
      localArrayList.add(localObject1);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Map<String, Object> data;
      private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
      private String path;
      private GeneratedAndroidFirebaseFirestore.PigeonTransactionType type;
      
      public GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand build()
      {
        GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand localPigeonTransactionCommand = new GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand();
        localPigeonTransactionCommand.setType(type);
        localPigeonTransactionCommand.setPath(path);
        localPigeonTransactionCommand.setData(data);
        localPigeonTransactionCommand.setOption(option);
        return localPigeonTransactionCommand;
      }
      
      public Builder setData(Map<String, Object> paramMap)
      {
        data = paramMap;
        return this;
      }
      
      public Builder setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
      {
        option = paramPigeonDocumentOption;
        return this;
      }
      
      public Builder setPath(String paramString)
      {
        path = paramString;
        return this;
      }
      
      public Builder setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType paramPigeonTransactionType)
      {
        type = paramPigeonTransactionType;
        return this;
      }
    }
  }
  
  public static enum PigeonTransactionResult
  {
    public final int index;
    
    static
    {
      FAILURE = new PigeonTransactionResult("FAILURE", 1, 1);
    }
    
    private PigeonTransactionResult(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static enum PigeonTransactionType
  {
    public final int index;
    
    static
    {
      SET = new PigeonTransactionType("SET", 2, 2);
      DELETE_TYPE = new PigeonTransactionType("DELETE_TYPE", 3, 3);
    }
    
    private PigeonTransactionType(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static abstract interface Result<T>
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success(T paramT);
  }
  
  public static enum ServerTimestampBehavior
  {
    public final int index;
    
    static
    {
      ESTIMATE = new ServerTimestampBehavior("ESTIMATE", 1, 1);
      PREVIOUS = new ServerTimestampBehavior("PREVIOUS", 2, 2);
    }
    
    private ServerTimestampBehavior(int paramInt)
    {
      index = paramInt;
    }
  }
  
  public static enum Source
  {
    public final int index;
    
    static
    {
      SERVER = new Source("SERVER", 1, 1);
      CACHE = new Source("CACHE", 2, 2);
    }
    
    private Source(int paramInt)
    {
      index = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */