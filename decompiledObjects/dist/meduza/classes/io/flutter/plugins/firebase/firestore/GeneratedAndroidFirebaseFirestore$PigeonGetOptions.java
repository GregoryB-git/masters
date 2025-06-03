package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$PigeonGetOptions
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonGetOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */