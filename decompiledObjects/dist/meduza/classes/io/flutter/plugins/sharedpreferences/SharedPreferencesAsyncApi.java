package io.flutter.plugins.sharedpreferences;

import b.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.BinaryMessenger.TaskQueue;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.Map;

public abstract interface SharedPreferencesAsyncApi
{
  public static final Companion Companion = Companion.$$INSTANCE;
  
  public abstract void clear(List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract Map<String, Object> getAll(List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract Boolean getBool(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract Double getDouble(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract Long getInt(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract List<String> getKeys(List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract String getString(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract List<String> getStringList(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract void setBool(String paramString, boolean paramBoolean, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract void setDouble(String paramString, double paramDouble, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract void setInt(String paramString, long paramLong, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract void setString(String paramString1, String paramString2, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public abstract void setStringList(String paramString, List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions);
  
  public static final class Companion
  {
    private static final rb.c<SharedPreferencesAsyncApiCodec> codec$delegate = z.n(new bb.c(1));
    
    private static final SharedPreferencesAsyncApiCodec codec_delegate$lambda$0()
    {
      return SharedPreferencesAsyncApiCodec.INSTANCE;
    }
    
    /* Error */
    private static final void setUp$lambda$11$lambda$10(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore 4
      //   45: aload 4
      //   47: ldc 120
      //   49: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   52: aload 4
      //   54: checkcast 110	java/util/List
      //   57: astore 4
      //   59: aload_3
      //   60: iconst_2
      //   61: invokeinterface 114 2 0
      //   66: astore_3
      //   67: aload_3
      //   68: ldc 122
      //   70: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   73: aload_3
      //   74: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   77: astore_3
      //   78: aload_0
      //   79: aload_1
      //   80: aload 4
      //   82: aload_3
      //   83: invokeinterface 128 4 0
      //   88: aconst_null
      //   89: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   92: astore_0
      //   93: goto +9 -> 102
      //   96: astore_0
      //   97: aload_0
      //   98: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   101: astore_0
      //   102: aload_2
      //   103: aload_0
      //   104: invokeinterface 144 2 0
      //   109: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	110	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	110	1	paramObject	Object
      //   0	110	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	67	3	localObject1	Object
      //   43	38	4	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   78	93	96	finally
    }
    
    /* Error */
    private static final void setUp$lambda$13$lambda$12(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore_3
      //   44: aload_3
      //   45: ldc 122
      //   47: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   50: aload_3
      //   51: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   54: astore_3
      //   55: aload_0
      //   56: aload_1
      //   57: aload_3
      //   58: invokeinterface 148 3 0
      //   63: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   66: astore_0
      //   67: goto +9 -> 76
      //   70: astore_0
      //   71: aload_0
      //   72: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   75: astore_0
      //   76: aload_2
      //   77: aload_0
      //   78: invokeinterface 144 2 0
      //   83: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	84	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	84	1	paramObject	Object
      //   0	84	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	42	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   55	67	70	finally
    }
    
    /* Error */
    private static final void setUp$lambda$15$lambda$14(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore_3
      //   44: aload_3
      //   45: ldc 122
      //   47: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   50: aload_3
      //   51: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   54: astore_3
      //   55: aload_0
      //   56: aload_1
      //   57: aload_3
      //   58: invokeinterface 152 3 0
      //   63: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   66: astore_0
      //   67: goto +9 -> 76
      //   70: astore_0
      //   71: aload_0
      //   72: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   75: astore_0
      //   76: aload_2
      //   77: aload_0
      //   78: invokeinterface 144 2 0
      //   83: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	84	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	84	1	paramObject	Object
      //   0	84	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	42	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   55	67	70	finally
    }
    
    /* Error */
    private static final void setUp$lambda$17$lambda$16(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore_3
      //   44: aload_3
      //   45: ldc 122
      //   47: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   50: aload_3
      //   51: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   54: astore_3
      //   55: aload_0
      //   56: aload_1
      //   57: aload_3
      //   58: invokeinterface 156 3 0
      //   63: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   66: astore_0
      //   67: goto +9 -> 76
      //   70: astore_0
      //   71: aload_0
      //   72: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   75: astore_0
      //   76: aload_2
      //   77: aload_0
      //   78: invokeinterface 144 2 0
      //   83: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	84	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	84	1	paramObject	Object
      //   0	84	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	42	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   55	67	70	finally
    }
    
    /* Error */
    private static final void setUp$lambda$19$lambda$18(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore_3
      //   44: aload_3
      //   45: ldc 122
      //   47: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   50: aload_3
      //   51: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   54: astore_3
      //   55: aload_0
      //   56: aload_1
      //   57: aload_3
      //   58: invokeinterface 160 3 0
      //   63: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   66: astore_0
      //   67: goto +9 -> 76
      //   70: astore_0
      //   71: aload_0
      //   72: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   75: astore_0
      //   76: aload_2
      //   77: aload_0
      //   78: invokeinterface 144 2 0
      //   83: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	84	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	84	1	paramObject	Object
      //   0	84	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	42	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   55	67	70	finally
    }
    
    /* Error */
    private static final void setUp$lambda$2$lambda$1(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore 4
      //   45: aload 4
      //   47: ldc -94
      //   49: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   52: aload 4
      //   54: checkcast 164	java/lang/Boolean
      //   57: invokevirtual 168	java/lang/Boolean:booleanValue	()Z
      //   60: istore 5
      //   62: aload_3
      //   63: iconst_2
      //   64: invokeinterface 114 2 0
      //   69: astore_3
      //   70: aload_3
      //   71: ldc 122
      //   73: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   76: aload_3
      //   77: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   80: astore_3
      //   81: aload_0
      //   82: aload_1
      //   83: iload 5
      //   85: aload_3
      //   86: invokeinterface 172 4 0
      //   91: aconst_null
      //   92: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   95: astore_0
      //   96: goto +9 -> 105
      //   99: astore_0
      //   100: aload_0
      //   101: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   104: astore_0
      //   105: aload_2
      //   106: aload_0
      //   107: invokeinterface 144 2 0
      //   112: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	113	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	113	1	paramObject	Object
      //   0	113	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	70	3	localObject1	Object
      //   43	10	4	localObject2	Object
      //   60	24	5	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   81	96	99	finally
    }
    
    /* Error */
    private static final void setUp$lambda$21$lambda$20(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore_3
      //   44: aload_3
      //   45: ldc 122
      //   47: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   50: aload_3
      //   51: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   54: astore_3
      //   55: aload_0
      //   56: aload_1
      //   57: aload_3
      //   58: invokeinterface 176 3 0
      //   63: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   66: astore_0
      //   67: goto +9 -> 76
      //   70: astore_0
      //   71: aload_0
      //   72: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   75: astore_0
      //   76: aload_2
      //   77: aload_0
      //   78: invokeinterface 144 2 0
      //   83: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	84	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	84	1	paramObject	Object
      //   0	84	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	42	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   55	67	70	finally
    }
    
    /* Error */
    private static final void setUp$lambda$23$lambda$22(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: checkcast 110	java/util/List
      //   27: astore_1
      //   28: aload_3
      //   29: iconst_1
      //   30: invokeinterface 114 2 0
      //   35: astore_3
      //   36: aload_3
      //   37: ldc 122
      //   39: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   42: aload_3
      //   43: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   46: astore_3
      //   47: aload_0
      //   48: aload_1
      //   49: aload_3
      //   50: invokeinterface 180 3 0
      //   55: aconst_null
      //   56: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   59: astore_0
      //   60: goto +9 -> 69
      //   63: astore_0
      //   64: aload_0
      //   65: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   68: astore_0
      //   69: aload_2
      //   70: aload_0
      //   71: invokeinterface 144 2 0
      //   76: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	77	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	77	1	paramObject	Object
      //   0	77	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	34	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   47	60	63	finally
    }
    
    /* Error */
    private static final void setUp$lambda$25$lambda$24(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: checkcast 110	java/util/List
      //   27: astore_1
      //   28: aload_3
      //   29: iconst_1
      //   30: invokeinterface 114 2 0
      //   35: astore_3
      //   36: aload_3
      //   37: ldc 122
      //   39: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   42: aload_3
      //   43: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   46: astore_3
      //   47: aload_0
      //   48: aload_1
      //   49: aload_3
      //   50: invokeinterface 184 3 0
      //   55: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   58: astore_0
      //   59: goto +9 -> 68
      //   62: astore_0
      //   63: aload_0
      //   64: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   67: astore_0
      //   68: aload_2
      //   69: aload_0
      //   70: invokeinterface 144 2 0
      //   75: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	76	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	76	1	paramObject	Object
      //   0	76	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	34	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   47	59	62	finally
    }
    
    /* Error */
    private static final void setUp$lambda$27$lambda$26(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: checkcast 110	java/util/List
      //   27: astore_1
      //   28: aload_3
      //   29: iconst_1
      //   30: invokeinterface 114 2 0
      //   35: astore_3
      //   36: aload_3
      //   37: ldc 122
      //   39: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   42: aload_3
      //   43: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   46: astore_3
      //   47: aload_0
      //   48: aload_1
      //   49: aload_3
      //   50: invokeinterface 188 3 0
      //   55: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   58: astore_0
      //   59: goto +9 -> 68
      //   62: astore_0
      //   63: aload_0
      //   64: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   67: astore_0
      //   68: aload_2
      //   69: aload_0
      //   70: invokeinterface 144 2 0
      //   75: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	76	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	76	1	paramObject	Object
      //   0	76	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	34	3	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   47	59	62	finally
    }
    
    /* Error */
    private static final void setUp$lambda$4$lambda$3(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore 4
      //   45: aload 4
      //   47: ldc 116
      //   49: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   52: aload 4
      //   54: checkcast 118	java/lang/String
      //   57: astore 4
      //   59: aload_3
      //   60: iconst_2
      //   61: invokeinterface 114 2 0
      //   66: astore_3
      //   67: aload_3
      //   68: ldc 122
      //   70: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   73: aload_3
      //   74: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   77: astore_3
      //   78: aload_0
      //   79: aload_1
      //   80: aload 4
      //   82: aload_3
      //   83: invokeinterface 192 4 0
      //   88: aconst_null
      //   89: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   92: astore_0
      //   93: goto +9 -> 102
      //   96: astore_0
      //   97: aload_0
      //   98: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   101: astore_0
      //   102: aload_2
      //   103: aload_0
      //   104: invokeinterface 144 2 0
      //   109: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	110	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	110	1	paramObject	Object
      //   0	110	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	67	3	localObject1	Object
      //   43	38	4	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   78	93	96	finally
    }
    
    /* Error */
    private static final void setUp$lambda$7$lambda$6(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore 4
      //   45: aload 4
      //   47: instanceof 194
      //   50: ifeq +17 -> 67
      //   53: aload 4
      //   55: checkcast 196	java/lang/Number
      //   58: invokevirtual 200	java/lang/Number:intValue	()I
      //   61: i2l
      //   62: lstore 5
      //   64: goto +20 -> 84
      //   67: aload 4
      //   69: ldc -54
      //   71: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   74: aload 4
      //   76: checkcast 204	java/lang/Long
      //   79: invokevirtual 208	java/lang/Long:longValue	()J
      //   82: lstore 5
      //   84: aload_3
      //   85: iconst_2
      //   86: invokeinterface 114 2 0
      //   91: astore_3
      //   92: aload_3
      //   93: ldc 122
      //   95: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   98: aload_3
      //   99: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   102: astore_3
      //   103: aload_0
      //   104: aload_1
      //   105: lload 5
      //   107: aload_3
      //   108: invokeinterface 212 5 0
      //   113: aconst_null
      //   114: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   117: astore_0
      //   118: goto +9 -> 127
      //   121: astore_0
      //   122: aload_0
      //   123: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   126: astore_0
      //   127: aload_2
      //   128: aload_0
      //   129: invokeinterface 144 2 0
      //   134: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	135	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	135	1	paramObject	Object
      //   0	135	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	92	3	localObject1	Object
      //   43	32	4	localObject2	Object
      //   62	44	5	l	long
      // Exception table:
      //   from	to	target	type
      //   103	118	121	finally
    }
    
    /* Error */
    private static final void setUp$lambda$9$lambda$8(SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi, Object paramObject, io.flutter.plugin.common.BasicMessageChannel.Reply paramReply)
    {
      // Byte code:
      //   0: aload_2
      //   1: ldc 99
      //   3: invokestatic 104	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_1
      //   7: ldc 106
      //   9: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   12: aload_1
      //   13: checkcast 110	java/util/List
      //   16: astore_3
      //   17: aload_3
      //   18: iconst_0
      //   19: invokeinterface 114 2 0
      //   24: astore_1
      //   25: aload_1
      //   26: ldc 116
      //   28: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   31: aload_1
      //   32: checkcast 118	java/lang/String
      //   35: astore_1
      //   36: aload_3
      //   37: iconst_1
      //   38: invokeinterface 114 2 0
      //   43: astore 4
      //   45: aload 4
      //   47: ldc -42
      //   49: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   52: aload 4
      //   54: checkcast 216	java/lang/Double
      //   57: invokevirtual 220	java/lang/Double:doubleValue	()D
      //   60: dstore 5
      //   62: aload_3
      //   63: iconst_2
      //   64: invokeinterface 114 2 0
      //   69: astore_3
      //   70: aload_3
      //   71: ldc 122
      //   73: invokestatic 108	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
      //   76: aload_3
      //   77: checkcast 124	io/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions
      //   80: astore_3
      //   81: aload_0
      //   82: aload_1
      //   83: dload 5
      //   85: aload_3
      //   86: invokeinterface 224 5 0
      //   91: aconst_null
      //   92: invokestatic 133	va/a:f	(Ljava/lang/Object;)Ljava/util/List;
      //   95: astore_0
      //   96: goto +9 -> 105
      //   99: astore_0
      //   100: aload_0
      //   101: invokestatic 139	io/flutter/plugins/sharedpreferences/MessagesAsync_gKt:access$wrapError	(Ljava/lang/Throwable;)Ljava/util/List;
      //   104: astore_0
      //   105: aload_2
      //   106: aload_0
      //   107: invokeinterface 144 2 0
      //   112: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	113	0	paramSharedPreferencesAsyncApi	SharedPreferencesAsyncApi
      //   0	113	1	paramObject	Object
      //   0	113	2	paramReply	io.flutter.plugin.common.BasicMessageChannel.Reply
      //   16	70	3	localObject1	Object
      //   43	10	4	localObject2	Object
      //   60	24	5	d	double
      // Exception table:
      //   from	to	target	type
      //   81	96	99	finally
    }
    
    public final MessageCodec<Object> getCodec()
    {
      return (MessageCodec)codec$delegate.getValue();
    }
    
    public final void setUp(BinaryMessenger paramBinaryMessenger, SharedPreferencesAsyncApi paramSharedPreferencesAsyncApi)
    {
      ec.i.e(paramBinaryMessenger, "binaryMessenger");
      Object localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new f(paramSharedPreferencesAsyncApi, 0));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new f(paramSharedPreferencesAsyncApi, 1));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new g(paramSharedPreferencesAsyncApi, 1));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new h(paramSharedPreferencesAsyncApi, 1));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new i(paramSharedPreferencesAsyncApi, 1));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", getCodec());
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new f(paramSharedPreferencesAsyncApi, 2));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", getCodec());
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new g(paramSharedPreferencesAsyncApi, 2));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", getCodec());
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new h(paramSharedPreferencesAsyncApi, 2));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", getCodec());
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new i(paramSharedPreferencesAsyncApi, 2));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", getCodec());
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new f(paramSharedPreferencesAsyncApi, 3));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new g(paramSharedPreferencesAsyncApi, 0));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      localObject = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        ((BasicMessageChannel)localObject).setMessageHandler(new h(paramSharedPreferencesAsyncApi, 0));
      } else {
        ((BasicMessageChannel)localObject).setMessageHandler(null);
      }
      localObject = paramBinaryMessenger.makeBackgroundTaskQueue();
      paramBinaryMessenger = new BasicMessageChannel(paramBinaryMessenger, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", getCodec(), (BinaryMessenger.TaskQueue)localObject);
      if (paramSharedPreferencesAsyncApi != null) {
        paramBinaryMessenger.setMessageHandler(new i(paramSharedPreferencesAsyncApi, 0));
      } else {
        paramBinaryMessenger.setMessageHandler(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */