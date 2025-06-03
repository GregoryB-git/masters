package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z2;

class ActivityChooserModel
  extends DataSetObservable
{
  public static final String ATTRIBUTE_ACTIVITY = "activity";
  public static final String ATTRIBUTE_TIME = "time";
  public static final String ATTRIBUTE_WEIGHT = "weight";
  public static final boolean DEBUG = false;
  private static final int DEFAULT_ACTIVITY_INFLATION = 5;
  private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0F;
  public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
  public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
  private static final String HISTORY_FILE_EXTENSION = ".xml";
  private static final int INVALID_INDEX = -1;
  public static final String LOG_TAG = "ActivityChooserModel";
  public static final String TAG_HISTORICAL_RECORD = "historical-record";
  public static final String TAG_HISTORICAL_RECORDS = "historical-records";
  private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
  private static final Object sRegistryLock = new Object();
  private final List<ActivityResolveInfo> mActivities = new ArrayList();
  private OnChooseActivityListener mActivityChoserModelPolicy;
  private ActivitySorter mActivitySorter = new DefaultSorter();
  public boolean mCanReadHistoricalData = true;
  public final Context mContext;
  private final List<HistoricalRecord> mHistoricalRecords = new ArrayList();
  private boolean mHistoricalRecordsChanged = true;
  public final String mHistoryFileName;
  private int mHistoryMaxSize = 50;
  private final Object mInstanceLock = new Object();
  private Intent mIntent;
  private boolean mReadShareHistoryCalled = false;
  private boolean mReloadActivities = false;
  
  private ActivityChooserModel(Context paramContext, String paramString)
  {
    mContext = paramContext.getApplicationContext();
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.endsWith(".xml"))) {
      mHistoryFileName = z2.o(paramString, ".xml");
    } else {
      mHistoryFileName = paramString;
    }
  }
  
  private boolean addHistoricalRecord(HistoricalRecord paramHistoricalRecord)
  {
    boolean bool = mHistoricalRecords.add(paramHistoricalRecord);
    if (bool)
    {
      mHistoricalRecordsChanged = true;
      pruneExcessiveHistoricalRecordsIfNeeded();
      persistHistoricalDataIfNeeded();
      sortActivitiesIfNeeded();
      notifyChanged();
    }
    return bool;
  }
  
  private void ensureConsistentState()
  {
    boolean bool1 = loadActivitiesIfNeeded();
    boolean bool2 = readHistoricalDataIfNeeded();
    pruneExcessiveHistoricalRecordsIfNeeded();
    if ((bool1 | bool2))
    {
      sortActivitiesIfNeeded();
      notifyChanged();
    }
  }
  
  public static ActivityChooserModel get(Context paramContext, String paramString)
  {
    synchronized (sRegistryLock)
    {
      Map localMap = sDataModelRegistry;
      ActivityChooserModel localActivityChooserModel1 = (ActivityChooserModel)localMap.get(paramString);
      ActivityChooserModel localActivityChooserModel2 = localActivityChooserModel1;
      if (localActivityChooserModel1 == null)
      {
        localActivityChooserModel2 = new androidx/appcompat/widget/ActivityChooserModel;
        localActivityChooserModel2.<init>(paramContext, paramString);
        localMap.put(paramString, localActivityChooserModel2);
      }
      return localActivityChooserModel2;
    }
  }
  
  private boolean loadActivitiesIfNeeded()
  {
    boolean bool = mReloadActivities;
    int i = 0;
    if ((bool) && (mIntent != null))
    {
      mReloadActivities = false;
      mActivities.clear();
      List localList = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
      int j = localList.size();
      while (i < j)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i);
        mActivities.add(new ActivityResolveInfo(localResolveInfo));
        i++;
      }
      return true;
    }
    return false;
  }
  
  private void persistHistoricalDataIfNeeded()
  {
    if (mReadShareHistoryCalled)
    {
      if (!mHistoricalRecordsChanged) {
        return;
      }
      mHistoricalRecordsChanged = false;
      if (!TextUtils.isEmpty(mHistoryFileName)) {
        new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] { new ArrayList(mHistoricalRecords), mHistoryFileName });
      }
      return;
    }
    throw new IllegalStateException("No preceding call to #readHistoricalData");
  }
  
  private void pruneExcessiveHistoricalRecordsIfNeeded()
  {
    int i = mHistoricalRecords.size() - mHistoryMaxSize;
    if (i <= 0) {
      return;
    }
    mHistoricalRecordsChanged = true;
    for (int j = 0; j < i; j++) {
      HistoricalRecord localHistoricalRecord = (HistoricalRecord)mHistoricalRecords.remove(0);
    }
  }
  
  private boolean readHistoricalDataIfNeeded()
  {
    if ((mCanReadHistoricalData) && (mHistoricalRecordsChanged) && (!TextUtils.isEmpty(mHistoryFileName)))
    {
      mCanReadHistoricalData = false;
      mReadShareHistoryCalled = true;
      readHistoricalDataImpl();
      return true;
    }
    return false;
  }
  
  /* Error */
  private void readHistoricalDataImpl()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 137	androidx/appcompat/widget/ActivityChooserModel:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 157	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   8: invokevirtual 264	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_1
    //   12: invokestatic 270	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: ldc_w 272
    //   21: invokeinterface 278 3 0
    //   26: iconst_0
    //   27: istore_3
    //   28: iload_3
    //   29: iconst_1
    //   30: if_icmpeq +18 -> 48
    //   33: iload_3
    //   34: iconst_2
    //   35: if_icmpeq +13 -> 48
    //   38: aload_2
    //   39: invokeinterface 281 1 0
    //   44: istore_3
    //   45: goto -17 -> 28
    //   48: ldc 61
    //   50: aload_2
    //   51: invokeinterface 285 1 0
    //   56: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +150 -> 209
    //   62: aload_0
    //   63: getfield 116	androidx/appcompat/widget/ActivityChooserModel:mHistoricalRecords	Ljava/util/List;
    //   66: astore 4
    //   68: aload 4
    //   70: invokeinterface 203 1 0
    //   75: aload_2
    //   76: invokeinterface 281 1 0
    //   81: istore_3
    //   82: iload_3
    //   83: iconst_1
    //   84: if_icmpne +14 -> 98
    //   87: aload_1
    //   88: ifnull +254 -> 342
    //   91: aload_1
    //   92: invokevirtual 293	java/io/FileInputStream:close	()V
    //   95: goto +247 -> 342
    //   98: iload_3
    //   99: iconst_3
    //   100: if_icmpeq -25 -> 75
    //   103: iload_3
    //   104: iconst_4
    //   105: if_icmpne +6 -> 111
    //   108: goto -33 -> 75
    //   111: ldc 58
    //   113: aload_2
    //   114: invokeinterface 285 1 0
    //   119: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   122: ifeq +71 -> 193
    //   125: aload_2
    //   126: aconst_null
    //   127: ldc 29
    //   129: invokeinterface 296 3 0
    //   134: astore 5
    //   136: aload_2
    //   137: aconst_null
    //   138: ldc 32
    //   140: invokeinterface 296 3 0
    //   145: invokestatic 302	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   148: lstore 6
    //   150: aload_2
    //   151: aconst_null
    //   152: ldc 35
    //   154: invokeinterface 296 3 0
    //   159: invokestatic 308	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   162: fstore 8
    //   164: new 18	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord
    //   167: astore 9
    //   169: aload 9
    //   171: aload 5
    //   173: lload 6
    //   175: fload 8
    //   177: invokespecial 311	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   180: aload 4
    //   182: aload 9
    //   184: invokeinterface 165 2 0
    //   189: pop
    //   190: goto -115 -> 75
    //   193: new 258	org/xmlpull/v1/XmlPullParserException
    //   196: astore 9
    //   198: aload 9
    //   200: ldc_w 313
    //   203: invokespecial 314	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   206: aload 9
    //   208: athrow
    //   209: new 258	org/xmlpull/v1/XmlPullParserException
    //   212: astore 9
    //   214: aload 9
    //   216: ldc_w 316
    //   219: invokespecial 314	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   222: aload 9
    //   224: athrow
    //   225: astore 9
    //   227: goto +116 -> 343
    //   230: astore 4
    //   232: getstatic 92	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   235: astore 5
    //   237: new 318	java/lang/StringBuilder
    //   240: astore 9
    //   242: aload 9
    //   244: invokespecial 319	java/lang/StringBuilder:<init>	()V
    //   247: aload 9
    //   249: ldc_w 321
    //   252: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload 9
    //   258: aload_0
    //   259: getfield 157	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   262: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload 5
    //   268: aload 9
    //   270: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: aload 4
    //   275: invokestatic 334	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   278: pop
    //   279: aload_1
    //   280: ifnull +62 -> 342
    //   283: goto -192 -> 91
    //   286: astore 5
    //   288: getstatic 92	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
    //   291: astore 9
    //   293: new 318	java/lang/StringBuilder
    //   296: astore 4
    //   298: aload 4
    //   300: invokespecial 319	java/lang/StringBuilder:<init>	()V
    //   303: aload 4
    //   305: ldc_w 321
    //   308: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload 4
    //   314: aload_0
    //   315: getfield 157	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
    //   318: invokevirtual 325	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload 9
    //   324: aload 4
    //   326: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: aload 5
    //   331: invokestatic 334	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   334: pop
    //   335: aload_1
    //   336: ifnull +6 -> 342
    //   339: goto -248 -> 91
    //   342: return
    //   343: aload_1
    //   344: ifnull +7 -> 351
    //   347: aload_1
    //   348: invokevirtual 293	java/io/FileInputStream:close	()V
    //   351: aload 9
    //   353: athrow
    //   354: astore_1
    //   355: return
    //   356: astore_1
    //   357: goto -15 -> 342
    //   360: astore_1
    //   361: goto -10 -> 351
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	this	ActivityChooserModel
    //   11	337	1	localFileInputStream	java.io.FileInputStream
    //   354	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   356	1	1	localIOException1	java.io.IOException
    //   360	1	1	localIOException2	java.io.IOException
    //   15	136	2	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   27	79	3	i	int
    //   66	115	4	localList	List
    //   230	44	4	localIOException3	java.io.IOException
    //   296	29	4	localStringBuilder	StringBuilder
    //   134	133	5	str	String
    //   286	44	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   148	26	6	l	long
    //   162	14	8	f	float
    //   167	56	9	localObject1	Object
    //   225	1	9	localObject2	Object
    //   240	112	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   12	26	225	finally
    //   38	45	225	finally
    //   48	75	225	finally
    //   75	82	225	finally
    //   111	190	225	finally
    //   193	209	225	finally
    //   209	225	225	finally
    //   232	279	225	finally
    //   288	335	225	finally
    //   12	26	230	java/io/IOException
    //   38	45	230	java/io/IOException
    //   48	75	230	java/io/IOException
    //   75	82	230	java/io/IOException
    //   111	190	230	java/io/IOException
    //   193	209	230	java/io/IOException
    //   209	225	230	java/io/IOException
    //   12	26	286	org/xmlpull/v1/XmlPullParserException
    //   38	45	286	org/xmlpull/v1/XmlPullParserException
    //   48	75	286	org/xmlpull/v1/XmlPullParserException
    //   75	82	286	org/xmlpull/v1/XmlPullParserException
    //   111	190	286	org/xmlpull/v1/XmlPullParserException
    //   193	209	286	org/xmlpull/v1/XmlPullParserException
    //   209	225	286	org/xmlpull/v1/XmlPullParserException
    //   0	12	354	java/io/FileNotFoundException
    //   91	95	356	java/io/IOException
    //   347	351	360	java/io/IOException
  }
  
  private boolean sortActivitiesIfNeeded()
  {
    if ((mActivitySorter != null) && (mIntent != null) && (!mActivities.isEmpty()) && (!mHistoricalRecords.isEmpty()))
    {
      mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
      return true;
    }
    return false;
  }
  
  public Intent chooseActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      if (mIntent == null) {
        return null;
      }
      ensureConsistentState();
      Object localObject2 = (ActivityResolveInfo)mActivities.get(paramInt);
      ComponentName localComponentName = new android/content/ComponentName;
      localObject2 = resolveInfo.activityInfo;
      localComponentName.<init>(packageName, name);
      localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>(mIntent);
      ((Intent)localObject2).setComponent(localComponentName);
      if (mActivityChoserModelPolicy != null)
      {
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>((Intent)localObject2);
        if (mActivityChoserModelPolicy.onChooseActivity(this, (Intent)localObject4)) {
          return null;
        }
      }
      Object localObject4 = new androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord;
      ((HistoricalRecord)localObject4).<init>(localComponentName, System.currentTimeMillis(), 1.0F);
      addHistoricalRecord((HistoricalRecord)localObject4);
      return (Intent)localObject2;
    }
  }
  
  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      ResolveInfo localResolveInfo = mActivities.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }
  
  public int getActivityCount()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      int i = mActivities.size();
      return i;
    }
  }
  
  public int getActivityIndex(ResolveInfo paramResolveInfo)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      List localList = mActivities;
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        if (getresolveInfo == paramResolveInfo) {
          return j;
        }
      }
      return -1;
    }
  }
  
  public ResolveInfo getDefaultActivity()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      if (!mActivities.isEmpty())
      {
        ResolveInfo localResolveInfo = mActivities.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  public int getHistoryMaxSize()
  {
    synchronized (mInstanceLock)
    {
      int i = mHistoryMaxSize;
      return i;
    }
  }
  
  public int getHistorySize()
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      int i = mHistoricalRecords.size();
      return i;
    }
  }
  
  public Intent getIntent()
  {
    synchronized (mInstanceLock)
    {
      Intent localIntent = mIntent;
      return localIntent;
    }
  }
  
  public void setActivitySorter(ActivitySorter paramActivitySorter)
  {
    synchronized (mInstanceLock)
    {
      if (mActivitySorter == paramActivitySorter) {
        return;
      }
      mActivitySorter = paramActivitySorter;
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setDefaultActivity(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      ensureConsistentState();
      Object localObject2 = (ActivityResolveInfo)mActivities.get(paramInt);
      Object localObject3 = (ActivityResolveInfo)mActivities.get(0);
      float f;
      if (localObject3 != null) {
        f = weight - weight + 5.0F;
      } else {
        f = 1.0F;
      }
      localObject3 = new android/content/ComponentName;
      localObject2 = resolveInfo.activityInfo;
      ((ComponentName)localObject3).<init>(packageName, name);
      localObject2 = new androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord;
      ((HistoricalRecord)localObject2).<init>((ComponentName)localObject3, System.currentTimeMillis(), f);
      addHistoricalRecord((HistoricalRecord)localObject2);
      return;
    }
  }
  
  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (mInstanceLock)
    {
      if (mHistoryMaxSize == paramInt) {
        return;
      }
      mHistoryMaxSize = paramInt;
      pruneExcessiveHistoricalRecordsIfNeeded();
      if (sortActivitiesIfNeeded()) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    synchronized (mInstanceLock)
    {
      if (mIntent == paramIntent) {
        return;
      }
      mIntent = paramIntent;
      mReloadActivities = true;
      ensureConsistentState();
      return;
    }
  }
  
  public void setOnChooseActivityListener(OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (mInstanceLock)
    {
      mActivityChoserModelPolicy = paramOnChooseActivityListener;
      return;
    }
  }
  
  public static abstract interface ActivityChooserModelClient
  {
    public abstract void setActivityChooserModel(ActivityChooserModel paramActivityChooserModel);
  }
  
  public static final class ActivityResolveInfo
    implements Comparable<ActivityResolveInfo>
  {
    public final ResolveInfo resolveInfo;
    public float weight;
    
    public ActivityResolveInfo(ResolveInfo paramResolveInfo)
    {
      resolveInfo = paramResolveInfo;
    }
    
    public int compareTo(ActivityResolveInfo paramActivityResolveInfo)
    {
      return Float.floatToIntBits(weight) - Float.floatToIntBits(weight);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject == null) {
        return false;
      }
      if (ActivityResolveInfo.class != paramObject.getClass()) {
        return false;
      }
      paramObject = (ActivityResolveInfo)paramObject;
      return Float.floatToIntBits(weight) == Float.floatToIntBits(weight);
    }
    
    public int hashCode()
    {
      return Float.floatToIntBits(weight) + 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.u("[", "resolveInfo:");
      localStringBuilder.append(resolveInfo.toString());
      localStringBuilder.append("; weight:");
      localStringBuilder.append(new BigDecimal(weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface ActivitySorter
  {
    public abstract void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1);
  }
  
  public static final class DefaultSorter
    implements ActivityChooserModel.ActivitySorter
  {
    private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
    private final Map<ComponentName, ActivityChooserModel.ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();
    
    public void sort(Intent paramIntent, List<ActivityChooserModel.ActivityResolveInfo> paramList, List<ActivityChooserModel.HistoricalRecord> paramList1)
    {
      paramIntent = mPackageNameToActivityMap;
      paramIntent.clear();
      int i = paramList.size();
      Object localObject1;
      Object localObject2;
      for (int j = 0; j < i; j++)
      {
        localObject1 = (ActivityChooserModel.ActivityResolveInfo)paramList.get(j);
        weight = 0.0F;
        localObject2 = resolveInfo.activityInfo;
        paramIntent.put(new ComponentName(packageName, name), localObject1);
      }
      j = paramList1.size() - 1;
      float f2;
      for (float f1 = 1.0F; j >= 0; f1 = f2)
      {
        localObject1 = (ActivityChooserModel.HistoricalRecord)paramList1.get(j);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)paramIntent.get(activity);
        f2 = f1;
        if (localObject2 != null)
        {
          f2 = weight;
          weight = (weight * f1 + f2);
          f2 = f1 * 0.95F;
        }
        j--;
      }
      Collections.sort(paramList);
    }
  }
  
  public static final class HistoricalRecord
  {
    public final ComponentName activity;
    public final long time;
    public final float weight;
    
    public HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
    {
      activity = paramComponentName;
      time = paramLong;
      weight = paramFloat;
    }
    
    public HistoricalRecord(String paramString, long paramLong, float paramFloat)
    {
      this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject == null) {
        return false;
      }
      if (HistoricalRecord.class != paramObject.getClass()) {
        return false;
      }
      paramObject = (HistoricalRecord)paramObject;
      ComponentName localComponentName = activity;
      if (localComponentName == null)
      {
        if (activity != null) {
          return false;
        }
      }
      else if (!localComponentName.equals(activity)) {
        return false;
      }
      if (time != time) {
        return false;
      }
      return Float.floatToIntBits(weight) == Float.floatToIntBits(weight);
    }
    
    public int hashCode()
    {
      ComponentName localComponentName = activity;
      int i;
      if (localComponentName == null) {
        i = 0;
      } else {
        i = localComponentName.hashCode();
      }
      long l = time;
      int j = (int)(l ^ l >>> 32);
      return Float.floatToIntBits(weight) + ((i + 31) * 31 + j) * 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.u("[", "; activity:");
      localStringBuilder.append(activity);
      localStringBuilder.append("; time:");
      localStringBuilder.append(time);
      localStringBuilder.append("; weight:");
      localStringBuilder.append(new BigDecimal(weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface OnChooseActivityListener
  {
    public abstract boolean onChooseActivity(ActivityChooserModel paramActivityChooserModel, Intent paramIntent);
  }
  
  public final class PersistHistoryAsyncTask
    extends AsyncTask<Object, Void, Void>
  {
    public PersistHistoryAsyncTask() {}
    
    /* Error */
    public Void doInBackground(Object... paramVarArgs)
    {
      // Byte code:
      //   0: aload_1
      //   1: iconst_0
      //   2: aaload
      //   3: checkcast 33	java/util/List
      //   6: astore_2
      //   7: aload_1
      //   8: iconst_1
      //   9: aaload
      //   10: checkcast 35	java/lang/String
      //   13: astore_3
      //   14: aload_0
      //   15: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   18: getfield 39	androidx/appcompat/widget/ActivityChooserModel:mContext	Landroid/content/Context;
      //   21: aload_3
      //   22: iconst_0
      //   23: invokevirtual 45	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
      //   26: astore_1
      //   27: invokestatic 51	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
      //   30: astore 4
      //   32: aload 4
      //   34: aload_1
      //   35: aconst_null
      //   36: invokeinterface 57 3 0
      //   41: aload 4
      //   43: ldc 59
      //   45: getstatic 65	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
      //   48: invokeinterface 69 3 0
      //   53: aload 4
      //   55: aconst_null
      //   56: ldc 71
      //   58: invokeinterface 75 3 0
      //   63: pop
      //   64: aload_2
      //   65: invokeinterface 79 1 0
      //   70: istore 5
      //   72: iconst_0
      //   73: istore 6
      //   75: iload 6
      //   77: iload 5
      //   79: if_icmpge +96 -> 175
      //   82: aload_2
      //   83: iconst_0
      //   84: invokeinterface 83 2 0
      //   89: checkcast 85	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord
      //   92: astore_3
      //   93: aload 4
      //   95: aconst_null
      //   96: ldc 87
      //   98: invokeinterface 75 3 0
      //   103: pop
      //   104: aload 4
      //   106: aconst_null
      //   107: ldc 89
      //   109: aload_3
      //   110: getfield 92	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:activity	Landroid/content/ComponentName;
      //   113: invokevirtual 98	android/content/ComponentName:flattenToString	()Ljava/lang/String;
      //   116: invokeinterface 102 4 0
      //   121: pop
      //   122: aload 4
      //   124: aconst_null
      //   125: ldc 104
      //   127: aload_3
      //   128: getfield 107	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:time	J
      //   131: invokestatic 111	java/lang/String:valueOf	(J)Ljava/lang/String;
      //   134: invokeinterface 102 4 0
      //   139: pop
      //   140: aload 4
      //   142: aconst_null
      //   143: ldc 113
      //   145: aload_3
      //   146: getfield 116	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:weight	F
      //   149: invokestatic 119	java/lang/String:valueOf	(F)Ljava/lang/String;
      //   152: invokeinterface 102 4 0
      //   157: pop
      //   158: aload 4
      //   160: aconst_null
      //   161: ldc 87
      //   163: invokeinterface 122 3 0
      //   168: pop
      //   169: iinc 6 1
      //   172: goto -97 -> 75
      //   175: aload 4
      //   177: aconst_null
      //   178: ldc 71
      //   180: invokeinterface 122 3 0
      //   185: pop
      //   186: aload 4
      //   188: invokeinterface 125 1 0
      //   193: aload_0
      //   194: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   197: iconst_1
      //   198: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   201: aload_1
      //   202: ifnull +194 -> 396
      //   205: aload_1
      //   206: invokevirtual 134	java/io/FileOutputStream:close	()V
      //   209: goto +187 -> 396
      //   212: astore_3
      //   213: goto +185 -> 398
      //   216: astore 4
      //   218: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   221: astore_3
      //   222: new 140	java/lang/StringBuilder
      //   225: astore_2
      //   226: aload_2
      //   227: invokespecial 141	java/lang/StringBuilder:<init>	()V
      //   230: aload_2
      //   231: ldc -113
      //   233: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   236: pop
      //   237: aload_2
      //   238: aload_0
      //   239: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   242: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   245: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   248: pop
      //   249: aload_3
      //   250: aload_2
      //   251: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   254: aload 4
      //   256: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   259: pop
      //   260: aload_0
      //   261: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   264: iconst_1
      //   265: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   268: aload_1
      //   269: ifnull +127 -> 396
      //   272: goto -67 -> 205
      //   275: astore_3
      //   276: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   279: astore_2
      //   280: new 140	java/lang/StringBuilder
      //   283: astore 4
      //   285: aload 4
      //   287: invokespecial 141	java/lang/StringBuilder:<init>	()V
      //   290: aload 4
      //   292: ldc -113
      //   294: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   297: pop
      //   298: aload 4
      //   300: aload_0
      //   301: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   304: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   307: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   310: pop
      //   311: aload_2
      //   312: aload 4
      //   314: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   317: aload_3
      //   318: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   321: pop
      //   322: aload_0
      //   323: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   326: iconst_1
      //   327: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   330: aload_1
      //   331: ifnull +65 -> 396
      //   334: goto -129 -> 205
      //   337: astore_2
      //   338: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   341: astore 4
      //   343: new 140	java/lang/StringBuilder
      //   346: astore_3
      //   347: aload_3
      //   348: invokespecial 141	java/lang/StringBuilder:<init>	()V
      //   351: aload_3
      //   352: ldc -113
      //   354: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   357: pop
      //   358: aload_3
      //   359: aload_0
      //   360: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   363: getfield 150	androidx/appcompat/widget/ActivityChooserModel:mHistoryFileName	Ljava/lang/String;
      //   366: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   369: pop
      //   370: aload 4
      //   372: aload_3
      //   373: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   376: aload_2
      //   377: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   380: pop
      //   381: aload_0
      //   382: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   385: iconst_1
      //   386: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   389: aload_1
      //   390: ifnull +6 -> 396
      //   393: goto -188 -> 205
      //   396: aconst_null
      //   397: areturn
      //   398: aload_0
      //   399: getfield 14	androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask:this$0	Landroidx/appcompat/widget/ActivityChooserModel;
      //   402: iconst_1
      //   403: putfield 129	androidx/appcompat/widget/ActivityChooserModel:mCanReadHistoricalData	Z
      //   406: aload_1
      //   407: ifnull +7 -> 414
      //   410: aload_1
      //   411: invokevirtual 134	java/io/FileOutputStream:close	()V
      //   414: aload_3
      //   415: athrow
      //   416: astore_1
      //   417: getstatic 138	androidx/appcompat/widget/ActivityChooserModel:LOG_TAG	Ljava/lang/String;
      //   420: astore_2
      //   421: new 140	java/lang/StringBuilder
      //   424: dup
      //   425: invokespecial 141	java/lang/StringBuilder:<init>	()V
      //   428: astore 4
      //   430: aload 4
      //   432: ldc -113
      //   434: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   437: pop
      //   438: aload 4
      //   440: aload_3
      //   441: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   444: pop
      //   445: aload_2
      //   446: aload 4
      //   448: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   451: aload_1
      //   452: invokestatic 159	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   455: pop
      //   456: aconst_null
      //   457: areturn
      //   458: astore_1
      //   459: goto -63 -> 396
      //   462: astore_1
      //   463: goto -49 -> 414
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	466	0	this	PersistHistoryAsyncTask
      //   0	466	1	paramVarArgs	Object[]
      //   6	306	2	localObject1	Object
      //   337	40	2	localIllegalArgumentException	IllegalArgumentException
      //   420	26	2	str1	String
      //   13	133	3	localObject2	Object
      //   212	1	3	localObject3	Object
      //   221	29	3	str2	String
      //   275	43	3	localIllegalStateException	IllegalStateException
      //   346	95	3	localStringBuilder	StringBuilder
      //   30	157	4	localXmlSerializer	org.xmlpull.v1.XmlSerializer
      //   216	39	4	localIOException	java.io.IOException
      //   283	164	4	localObject4	Object
      //   70	10	5	i	int
      //   73	97	6	j	int
      // Exception table:
      //   from	to	target	type
      //   32	72	212	finally
      //   82	169	212	finally
      //   175	193	212	finally
      //   218	260	212	finally
      //   276	322	212	finally
      //   338	381	212	finally
      //   32	72	216	java/io/IOException
      //   82	169	216	java/io/IOException
      //   175	193	216	java/io/IOException
      //   32	72	275	java/lang/IllegalStateException
      //   82	169	275	java/lang/IllegalStateException
      //   175	193	275	java/lang/IllegalStateException
      //   32	72	337	java/lang/IllegalArgumentException
      //   82	169	337	java/lang/IllegalArgumentException
      //   175	193	337	java/lang/IllegalArgumentException
      //   14	27	416	java/io/FileNotFoundException
      //   205	209	458	java/io/IOException
      //   410	414	462	java/io/IOException
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */