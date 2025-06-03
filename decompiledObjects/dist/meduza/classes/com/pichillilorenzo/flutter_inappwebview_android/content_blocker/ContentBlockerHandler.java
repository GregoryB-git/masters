package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ContentBlockerHandler
{
  public static final String LOG_TAG = "ContentBlockerHandler";
  public List<ContentBlocker> ruleList;
  
  public ContentBlockerHandler()
  {
    ruleList = new ArrayList();
  }
  
  public ContentBlockerHandler(List<ContentBlocker> paramList)
  {
    new ArrayList();
    ruleList = paramList;
  }
  
  public WebResourceResponse checkUrl(InAppWebView paramInAppWebView, WebResourceRequestExt paramWebResourceRequestExt)
  {
    return checkUrl(paramInAppWebView, paramWebResourceRequestExt, getResourceTypeFromUrl(paramWebResourceRequestExt));
  }
  
  /* Error */
  public WebResourceResponse checkUrl(final InAppWebView paramInAppWebView, WebResourceRequestExt paramWebResourceRequestExt, ContentBlockerTriggerResourceType paramContentBlockerTriggerResourceType)
  {
    // Byte code:
    //   0: ldc 45
    //   2: astore 4
    //   4: aload_1
    //   5: getfield 51	com/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView:customSettings	Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;
    //   8: getfield 56	com/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings:contentBlockers	Ljava/util/List;
    //   11: astore 5
    //   13: aconst_null
    //   14: astore 6
    //   16: aload 5
    //   18: ifnonnull +5 -> 23
    //   21: aconst_null
    //   22: areturn
    //   23: aload_2
    //   24: invokevirtual 62	com/pichillilorenzo/flutter_inappwebview_android/types/WebResourceRequestExt:getUrl	()Ljava/lang/String;
    //   27: astore 7
    //   29: new 64	java/net/URI
    //   32: astore 5
    //   34: aload 5
    //   36: aload 7
    //   38: invokespecial 67	java/net/URI:<init>	(Ljava/lang/String;)V
    //   41: goto +75 -> 116
    //   44: astore 5
    //   46: aload 7
    //   48: ldc 69
    //   50: invokevirtual 75	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   53: iconst_0
    //   54: aaload
    //   55: astore 5
    //   57: new 77	java/net/URL
    //   60: dup
    //   61: aload 7
    //   63: aload 5
    //   65: ldc 79
    //   67: invokevirtual 83	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   70: invokespecial 84	java/net/URL:<init>	(Ljava/lang/String;)V
    //   73: astore 8
    //   75: new 64	java/net/URI
    //   78: dup
    //   79: aload 5
    //   81: aload 8
    //   83: invokevirtual 87	java/net/URL:getUserInfo	()Ljava/lang/String;
    //   86: aload 8
    //   88: invokevirtual 90	java/net/URL:getHost	()Ljava/lang/String;
    //   91: aload 8
    //   93: invokevirtual 94	java/net/URL:getPort	()I
    //   96: aload 8
    //   98: invokevirtual 97	java/net/URL:getPath	()Ljava/lang/String;
    //   101: aload 8
    //   103: invokevirtual 100	java/net/URL:getQuery	()Ljava/lang/String;
    //   106: aload 8
    //   108: invokevirtual 103	java/net/URL:getRef	()Ljava/lang/String;
    //   111: invokespecial 106	java/net/URI:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   114: astore 5
    //   116: aload 5
    //   118: invokevirtual 107	java/net/URI:getHost	()Ljava/lang/String;
    //   121: astore 9
    //   123: aload 5
    //   125: invokevirtual 108	java/net/URI:getPort	()I
    //   128: istore 10
    //   130: aload 5
    //   132: invokevirtual 111	java/net/URI:getScheme	()Ljava/lang/String;
    //   135: astore 11
    //   137: new 113	java/util/concurrent/CopyOnWriteArrayList
    //   140: dup
    //   141: aload_0
    //   142: getfield 26	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler:ruleList	Ljava/util/List;
    //   145: invokespecial 116	java/util/concurrent/CopyOnWriteArrayList:<init>	(Ljava/util/Collection;)V
    //   148: invokevirtual 120	java/util/concurrent/CopyOnWriteArrayList:iterator	()Ljava/util/Iterator;
    //   151: astore 8
    //   153: aload 4
    //   155: astore 5
    //   157: aload 8
    //   159: invokeinterface 126 1 0
    //   164: ifeq +1307 -> 1471
    //   167: aload 8
    //   169: invokeinterface 130 1 0
    //   174: checkcast 132	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlocker
    //   177: astore 4
    //   179: aload 4
    //   181: invokevirtual 136	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlocker:getTrigger	()Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger;
    //   184: astore 12
    //   186: aload 12
    //   188: invokevirtual 142	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getResourceType	()Ljava/util/List;
    //   191: astore 13
    //   193: aload 13
    //   195: getstatic 148	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType:IMAGE	Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType;
    //   198: invokeinterface 154 2 0
    //   203: ifeq +30 -> 233
    //   206: getstatic 157	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType:SVG_DOCUMENT	Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType;
    //   209: astore 14
    //   211: aload 13
    //   213: aload 14
    //   215: invokeinterface 154 2 0
    //   220: ifne +13 -> 233
    //   223: aload 13
    //   225: aload 14
    //   227: invokeinterface 160 2 0
    //   232: pop
    //   233: aload 4
    //   235: invokevirtual 164	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlocker:getAction	()Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerAction;
    //   238: astore 4
    //   240: aload 12
    //   242: invokevirtual 168	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUrlFilterPatternCompiled	()Ljava/util/regex/Pattern;
    //   245: aload 7
    //   247: invokevirtual 174	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   250: invokevirtual 179	java/util/regex/Matcher:matches	()Z
    //   253: ifeq +1215 -> 1468
    //   256: aload 13
    //   258: invokeinterface 182 1 0
    //   263: ifne +17 -> 280
    //   266: aload 13
    //   268: aload_3
    //   269: invokeinterface 154 2 0
    //   274: ifne +6 -> 280
    //   277: aload 6
    //   279: areturn
    //   280: aload 12
    //   282: invokevirtual 185	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getIfDomain	()Ljava/util/List;
    //   285: invokeinterface 182 1 0
    //   290: ifne +93 -> 383
    //   293: aload 12
    //   295: invokevirtual 185	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getIfDomain	()Ljava/util/List;
    //   298: invokeinterface 186 1 0
    //   303: astore 13
    //   305: aload 13
    //   307: invokeinterface 126 1 0
    //   312: ifeq +61 -> 373
    //   315: aload 13
    //   317: invokeinterface 130 1 0
    //   322: checkcast 71	java/lang/String
    //   325: astore 6
    //   327: aload 6
    //   329: ldc -68
    //   331: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   334: ifeq +20 -> 354
    //   337: aload 9
    //   339: aload 6
    //   341: ldc -68
    //   343: ldc -62
    //   345: invokevirtual 83	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   348: invokevirtual 197	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   351: ifne +13 -> 364
    //   354: aload 6
    //   356: aload 9
    //   358: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   361: ifeq +9 -> 370
    //   364: iconst_1
    //   365: istore 15
    //   367: goto +9 -> 376
    //   370: goto -65 -> 305
    //   373: iconst_0
    //   374: istore 15
    //   376: iload 15
    //   378: ifne +5 -> 383
    //   381: aconst_null
    //   382: areturn
    //   383: aload 12
    //   385: invokevirtual 203	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUnlessDomain	()Ljava/util/List;
    //   388: invokeinterface 182 1 0
    //   393: ifne +76 -> 469
    //   396: aload 12
    //   398: invokevirtual 203	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUnlessDomain	()Ljava/util/List;
    //   401: invokeinterface 186 1 0
    //   406: astore 6
    //   408: aload 6
    //   410: invokeinterface 126 1 0
    //   415: ifeq +54 -> 469
    //   418: aload 6
    //   420: invokeinterface 130 1 0
    //   425: checkcast 71	java/lang/String
    //   428: astore 13
    //   430: aload 13
    //   432: ldc -68
    //   434: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   437: ifeq +20 -> 457
    //   440: aload 9
    //   442: aload 13
    //   444: ldc -68
    //   446: ldc -62
    //   448: invokevirtual 83	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   451: invokevirtual 197	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   454: ifne +13 -> 467
    //   457: aload 13
    //   459: aload 9
    //   461: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   464: ifeq -56 -> 408
    //   467: aconst_null
    //   468: areturn
    //   469: iconst_1
    //   470: anewarray 71	java/lang/String
    //   473: astore 6
    //   475: aload 12
    //   477: invokevirtual 206	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getLoadType	()Ljava/util/List;
    //   480: invokeinterface 182 1 0
    //   485: ifeq +29 -> 514
    //   488: aload 12
    //   490: invokevirtual 209	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getIfTopUrl	()Ljava/util/List;
    //   493: invokeinterface 182 1 0
    //   498: ifeq +16 -> 514
    //   501: aload 12
    //   503: invokevirtual 212	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUnlessTopUrl	()Ljava/util/List;
    //   506: invokeinterface 182 1 0
    //   511: ifne +46 -> 557
    //   514: new 214	java/util/concurrent/CountDownLatch
    //   517: dup
    //   518: iconst_1
    //   519: invokespecial 217	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   522: astore 13
    //   524: new 219	android/os/Handler
    //   527: dup
    //   528: aload_1
    //   529: invokevirtual 223	com/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView:getWebViewLooper	()Landroid/os/Looper;
    //   532: invokespecial 226	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   535: new 6	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler$1
    //   538: dup
    //   539: aload_0
    //   540: aload 6
    //   542: aload_1
    //   543: aload 13
    //   545: invokespecial 229	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler$1:<init>	(Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler;[Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;Ljava/util/concurrent/CountDownLatch;)V
    //   548: invokevirtual 233	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   551: pop
    //   552: aload 13
    //   554: invokevirtual 236	java/util/concurrent/CountDownLatch:await	()V
    //   557: aload 6
    //   559: iconst_0
    //   560: aaload
    //   561: ifnull +274 -> 835
    //   564: aload 12
    //   566: invokevirtual 206	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getLoadType	()Ljava/util/List;
    //   569: invokeinterface 182 1 0
    //   574: ifne +125 -> 699
    //   577: new 64	java/net/URI
    //   580: dup
    //   581: aload 6
    //   583: iconst_0
    //   584: aaload
    //   585: invokespecial 67	java/net/URI:<init>	(Ljava/lang/String;)V
    //   588: astore 14
    //   590: aload 14
    //   592: invokevirtual 107	java/net/URI:getHost	()Ljava/lang/String;
    //   595: astore 13
    //   597: aload 14
    //   599: invokevirtual 108	java/net/URI:getPort	()I
    //   602: istore 15
    //   604: aload 14
    //   606: invokevirtual 111	java/net/URI:getScheme	()Ljava/lang/String;
    //   609: astore 14
    //   611: aload 12
    //   613: invokevirtual 206	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getLoadType	()Ljava/util/List;
    //   616: ldc -18
    //   618: invokeinterface 154 2 0
    //   623: ifeq +41 -> 664
    //   626: aload 13
    //   628: ifnull +36 -> 664
    //   631: aload 14
    //   633: aload 11
    //   635: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   638: ifeq +23 -> 661
    //   641: aload 13
    //   643: aload 9
    //   645: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   648: ifeq +13 -> 661
    //   651: iload 15
    //   653: iload 10
    //   655: if_icmpne +6 -> 661
    //   658: goto +6 -> 664
    //   661: goto +36 -> 697
    //   664: aload 12
    //   666: invokevirtual 206	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getLoadType	()Ljava/util/List;
    //   669: ldc -16
    //   671: invokeinterface 154 2 0
    //   676: ifeq +23 -> 699
    //   679: aload 13
    //   681: ifnull +18 -> 699
    //   684: aload 13
    //   686: aload 9
    //   688: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   691: ifeq +8 -> 699
    //   694: goto -33 -> 661
    //   697: aconst_null
    //   698: areturn
    //   699: aload 12
    //   701: invokevirtual 209	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getIfTopUrl	()Ljava/util/List;
    //   704: invokeinterface 182 1 0
    //   709: ifne +65 -> 774
    //   712: aload 12
    //   714: invokevirtual 209	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getIfTopUrl	()Ljava/util/List;
    //   717: invokeinterface 186 1 0
    //   722: astore 14
    //   724: aload 14
    //   726: invokeinterface 126 1 0
    //   731: ifeq +33 -> 764
    //   734: aload 14
    //   736: invokeinterface 130 1 0
    //   741: checkcast 71	java/lang/String
    //   744: astore 13
    //   746: aload 6
    //   748: iconst_0
    //   749: aaload
    //   750: aload 13
    //   752: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   755: ifeq -31 -> 724
    //   758: iconst_1
    //   759: istore 15
    //   761: goto +6 -> 767
    //   764: iconst_0
    //   765: istore 15
    //   767: iload 15
    //   769: ifne +5 -> 774
    //   772: aconst_null
    //   773: areturn
    //   774: aload 12
    //   776: invokevirtual 212	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUnlessTopUrl	()Ljava/util/List;
    //   779: invokeinterface 182 1 0
    //   784: ifne +51 -> 835
    //   787: aload 12
    //   789: invokevirtual 212	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTrigger:getUnlessTopUrl	()Ljava/util/List;
    //   792: invokeinterface 186 1 0
    //   797: astore 12
    //   799: aload 12
    //   801: invokeinterface 126 1 0
    //   806: ifeq +29 -> 835
    //   809: aload 12
    //   811: invokeinterface 130 1 0
    //   816: checkcast 71	java/lang/String
    //   819: astore 13
    //   821: aload 6
    //   823: iconst_0
    //   824: aaload
    //   825: aload 13
    //   827: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   830: ifeq -31 -> 799
    //   833: aconst_null
    //   834: areturn
    //   835: getstatic 244	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler$3:$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType	[I
    //   838: aload 4
    //   840: invokevirtual 250	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerAction:getType	()Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerActionType;
    //   843: invokevirtual 255	java/lang/Enum:ordinal	()I
    //   846: iaload
    //   847: istore 15
    //   849: iload 15
    //   851: iconst_1
    //   852: if_icmpeq +603 -> 1455
    //   855: iload 15
    //   857: iconst_2
    //   858: if_icmpeq +499 -> 1357
    //   861: iload 15
    //   863: iconst_3
    //   864: if_icmpeq +9 -> 873
    //   867: aconst_null
    //   868: astore 6
    //   870: goto +598 -> 1468
    //   873: aload 11
    //   875: ldc_w 257
    //   878: invokevirtual 200	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   881: ifeq -14 -> 867
    //   884: iload 10
    //   886: iconst_m1
    //   887: if_icmpeq +10 -> 897
    //   890: iload 10
    //   892: bipush 80
    //   894: if_icmpne -27 -> 867
    //   897: aload 7
    //   899: ldc_w 259
    //   902: ldc_w 261
    //   905: invokevirtual 83	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   908: aload_2
    //   909: invokevirtual 264	com/pichillilorenzo/flutter_inappwebview_android/types/WebResourceRequestExt:getMethod	()Ljava/lang/String;
    //   912: aload_2
    //   913: invokevirtual 268	com/pichillilorenzo/flutter_inappwebview_android/types/WebResourceRequestExt:getHeaders	()Ljava/util/Map;
    //   916: invokestatic 274	com/pichillilorenzo/flutter_inappwebview_android/Util:makeHttpRequest	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    //   919: astore 16
    //   921: aload 16
    //   923: ifnull -56 -> 867
    //   926: aload 5
    //   928: astore 4
    //   930: aload 16
    //   932: invokevirtual 280	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   935: invokestatic 284	com/pichillilorenzo/flutter_inappwebview_android/Util:readAllBytes	(Ljava/io/InputStream;)[B
    //   938: astore 6
    //   940: aload 6
    //   942: ifnonnull +10 -> 952
    //   945: aload 16
    //   947: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   950: aconst_null
    //   951: areturn
    //   952: aload 5
    //   954: astore 4
    //   956: new 291	java/io/ByteArrayInputStream
    //   959: astore 17
    //   961: aload 5
    //   963: astore 4
    //   965: aload 17
    //   967: aload 6
    //   969: invokespecial 294	java/io/ByteArrayInputStream:<init>	([B)V
    //   972: aload 5
    //   974: astore 4
    //   976: aload 16
    //   978: invokevirtual 297	java/net/URLConnection:getContentEncoding	()Ljava/lang/String;
    //   981: astore 13
    //   983: aload 5
    //   985: astore 4
    //   987: aload 16
    //   989: invokevirtual 300	java/net/URLConnection:getContentType	()Ljava/lang/String;
    //   992: astore 6
    //   994: aload 6
    //   996: ifnonnull +15 -> 1011
    //   999: ldc_w 302
    //   1002: astore 12
    //   1004: aload 13
    //   1006: astore 6
    //   1008: goto +106 -> 1114
    //   1011: aload 5
    //   1013: astore 4
    //   1015: aload 6
    //   1017: ldc_w 304
    //   1020: invokevirtual 75	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1023: astore 18
    //   1025: aload 5
    //   1027: astore 4
    //   1029: aload 18
    //   1031: iconst_0
    //   1032: aaload
    //   1033: invokevirtual 307	java/lang/String:trim	()Ljava/lang/String;
    //   1036: astore 14
    //   1038: aload 13
    //   1040: astore 6
    //   1042: aload 14
    //   1044: astore 12
    //   1046: aload 13
    //   1048: ifnonnull +66 -> 1114
    //   1051: aload 5
    //   1053: astore 4
    //   1055: aload 18
    //   1057: arraylength
    //   1058: iconst_1
    //   1059: if_icmple +46 -> 1105
    //   1062: aload 5
    //   1064: astore 4
    //   1066: aload 18
    //   1068: iconst_1
    //   1069: aaload
    //   1070: aload 5
    //   1072: invokevirtual 310	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1075: ifeq +30 -> 1105
    //   1078: aload 5
    //   1080: astore 4
    //   1082: aload 18
    //   1084: iconst_1
    //   1085: aaload
    //   1086: aload 5
    //   1088: ldc -62
    //   1090: invokevirtual 83	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1093: invokevirtual 307	java/lang/String:trim	()Ljava/lang/String;
    //   1096: astore 6
    //   1098: aload 14
    //   1100: astore 12
    //   1102: goto +12 -> 1114
    //   1105: ldc_w 312
    //   1108: astore 6
    //   1110: aload 14
    //   1112: astore 12
    //   1114: aload 5
    //   1116: astore 4
    //   1118: aload 16
    //   1120: invokevirtual 315	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   1123: astore 14
    //   1125: aload 14
    //   1127: ifnull +159 -> 1286
    //   1130: aload 5
    //   1132: astore 4
    //   1134: new 317	java/util/HashMap
    //   1137: astore 13
    //   1139: aload 5
    //   1141: astore 4
    //   1143: aload 13
    //   1145: invokespecial 318	java/util/HashMap:<init>	()V
    //   1148: aload 5
    //   1150: astore 4
    //   1152: aload 16
    //   1154: invokevirtual 321	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   1157: invokeinterface 327 1 0
    //   1162: invokeinterface 330 1 0
    //   1167: astore 18
    //   1169: aload 5
    //   1171: astore 4
    //   1173: aload 18
    //   1175: invokeinterface 126 1 0
    //   1180: ifeq +74 -> 1254
    //   1183: aload 5
    //   1185: astore 4
    //   1187: aload 18
    //   1189: invokeinterface 130 1 0
    //   1194: checkcast 332	java/util/Map$Entry
    //   1197: astore 19
    //   1199: aload 5
    //   1201: astore 4
    //   1203: aload 19
    //   1205: invokeinterface 335 1 0
    //   1210: checkcast 71	java/lang/String
    //   1213: astore 20
    //   1215: aload 5
    //   1217: astore 4
    //   1219: aload 4
    //   1221: astore 5
    //   1223: aload 13
    //   1225: aload 20
    //   1227: ldc_w 337
    //   1230: aload 19
    //   1232: invokeinterface 340 1 0
    //   1237: checkcast 342	java/lang/Iterable
    //   1240: invokestatic 348	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   1243: invokevirtual 352	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1246: pop
    //   1247: aload 4
    //   1249: astore 5
    //   1251: goto -82 -> 1169
    //   1254: new 354	android/webkit/WebResourceResponse
    //   1257: dup
    //   1258: aload 12
    //   1260: aload 6
    //   1262: aload 16
    //   1264: invokevirtual 357	java/net/HttpURLConnection:getResponseCode	()I
    //   1267: aload 14
    //   1269: aload 13
    //   1271: aload 17
    //   1273: invokespecial 360	android/webkit/WebResourceResponse:<init>	(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V
    //   1276: astore 6
    //   1278: aload 16
    //   1280: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   1283: aload 6
    //   1285: areturn
    //   1286: new 354	android/webkit/WebResourceResponse
    //   1289: dup
    //   1290: aload 12
    //   1292: aload 6
    //   1294: aload 17
    //   1296: invokespecial 363	android/webkit/WebResourceResponse:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   1299: astore 6
    //   1301: aload 16
    //   1303: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   1306: aload 6
    //   1308: areturn
    //   1309: astore 6
    //   1311: goto +13 -> 1324
    //   1314: astore_1
    //   1315: goto +35 -> 1350
    //   1318: astore 6
    //   1320: aload 4
    //   1322: astore 5
    //   1324: aload 6
    //   1326: instanceof 365
    //   1329: ifne +13 -> 1342
    //   1332: ldc 14
    //   1334: ldc -62
    //   1336: aload 6
    //   1338: invokestatic 371	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1341: pop
    //   1342: aload 16
    //   1344: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   1347: goto -480 -> 867
    //   1350: aload 16
    //   1352: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   1355: aload_1
    //   1356: athrow
    //   1357: aload 4
    //   1359: invokevirtual 374	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerAction:getSelector	()Ljava/lang/String;
    //   1362: astore 6
    //   1364: new 376	java/lang/StringBuilder
    //   1367: dup
    //   1368: invokespecial 377	java/lang/StringBuilder:<init>	()V
    //   1371: astore 4
    //   1373: aload 4
    //   1375: ldc_w 379
    //   1378: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1381: pop
    //   1382: aload 4
    //   1384: aload 6
    //   1386: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1389: pop
    //   1390: aload 4
    //   1392: ldc_w 385
    //   1395: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1398: pop
    //   1399: aload 4
    //   1401: aload 6
    //   1403: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1406: pop
    //   1407: aload 4
    //   1409: ldc_w 387
    //   1412: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1415: pop
    //   1416: aload 4
    //   1418: invokevirtual 390	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1421: astore 6
    //   1423: new 219	android/os/Handler
    //   1426: dup
    //   1427: aload_1
    //   1428: invokevirtual 223	com/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView:getWebViewLooper	()Landroid/os/Looper;
    //   1431: invokespecial 226	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   1434: new 8	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler$2
    //   1437: dup
    //   1438: aload_0
    //   1439: aload_1
    //   1440: aload 6
    //   1442: invokespecial 393	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler$2:<init>	(Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler;Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;Ljava/lang/String;)V
    //   1445: ldc2_w 394
    //   1448: invokevirtual 399	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   1451: pop
    //   1452: goto -585 -> 867
    //   1455: new 354	android/webkit/WebResourceResponse
    //   1458: dup
    //   1459: ldc -62
    //   1461: ldc -62
    //   1463: aconst_null
    //   1464: invokespecial 363	android/webkit/WebResourceResponse:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   1467: areturn
    //   1468: goto -1311 -> 157
    //   1471: aload 6
    //   1473: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1474	0	this	ContentBlockerHandler
    //   0	1474	1	paramInAppWebView	InAppWebView
    //   0	1474	2	paramWebResourceRequestExt	WebResourceRequestExt
    //   0	1474	3	paramContentBlockerTriggerResourceType	ContentBlockerTriggerResourceType
    //   2	1415	4	localObject1	Object
    //   11	24	5	localObject2	Object
    //   44	1	5	localURISyntaxException	java.net.URISyntaxException
    //   55	1268	5	localObject3	Object
    //   14	1293	6	localObject4	Object
    //   1309	1	6	localException1	Exception
    //   1318	19	6	localException2	Exception
    //   1362	110	6	str1	String
    //   27	871	7	str2	String
    //   73	95	8	localObject5	Object
    //   121	566	9	str3	String
    //   128	767	10	i	int
    //   135	739	11	str4	String
    //   184	1107	12	localObject6	Object
    //   191	1079	13	localObject7	Object
    //   209	1059	14	localObject8	Object
    //   365	500	15	j	int
    //   919	432	16	localHttpURLConnection	java.net.HttpURLConnection
    //   959	336	17	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   1023	165	18	localObject9	Object
    //   1197	34	19	localEntry	java.util.Map.Entry
    //   1213	13	20	str5	String
    // Exception table:
    //   from	to	target	type
    //   29	41	44	java/net/URISyntaxException
    //   1223	1247	1309	java/lang/Exception
    //   1254	1278	1309	java/lang/Exception
    //   1286	1301	1309	java/lang/Exception
    //   930	940	1314	finally
    //   956	961	1314	finally
    //   965	972	1314	finally
    //   976	983	1314	finally
    //   987	994	1314	finally
    //   1015	1025	1314	finally
    //   1029	1038	1314	finally
    //   1055	1062	1314	finally
    //   1066	1078	1314	finally
    //   1082	1098	1314	finally
    //   1118	1125	1314	finally
    //   1134	1139	1314	finally
    //   1143	1148	1314	finally
    //   1152	1169	1314	finally
    //   1173	1183	1314	finally
    //   1187	1199	1314	finally
    //   1203	1215	1314	finally
    //   1223	1247	1314	finally
    //   1254	1278	1314	finally
    //   1286	1301	1314	finally
    //   1324	1342	1314	finally
    //   930	940	1318	java/lang/Exception
    //   956	961	1318	java/lang/Exception
    //   965	972	1318	java/lang/Exception
    //   976	983	1318	java/lang/Exception
    //   987	994	1318	java/lang/Exception
    //   1015	1025	1318	java/lang/Exception
    //   1029	1038	1318	java/lang/Exception
    //   1055	1062	1318	java/lang/Exception
    //   1066	1078	1318	java/lang/Exception
    //   1082	1098	1318	java/lang/Exception
    //   1118	1125	1318	java/lang/Exception
    //   1134	1139	1318	java/lang/Exception
    //   1143	1148	1318	java/lang/Exception
    //   1152	1169	1318	java/lang/Exception
    //   1173	1183	1318	java/lang/Exception
    //   1187	1199	1318	java/lang/Exception
    //   1203	1215	1318	java/lang/Exception
  }
  
  public WebResourceResponse checkUrl(InAppWebView paramInAppWebView, WebResourceRequestExt paramWebResourceRequestExt, String paramString)
  {
    return checkUrl(paramInAppWebView, paramWebResourceRequestExt, getResourceTypeFromContentType(paramString));
  }
  
  public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String paramString)
  {
    ContentBlockerTriggerResourceType localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
    if (paramString.equals("text/css")) {
      localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.STYLE_SHEET;
    } else if (paramString.equals("image/svg+xml")) {
      localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
    } else if (paramString.startsWith("image/")) {
      localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.IMAGE;
    } else if (paramString.startsWith("font/")) {
      localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.FONT;
    } else if ((!paramString.startsWith("audio/")) && (!paramString.startsWith("video/")) && (!paramString.equals("application/ogg")))
    {
      if (paramString.endsWith("javascript")) {
        localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.SCRIPT;
      } else if (paramString.startsWith("text/")) {
        localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.DOCUMENT;
      }
    }
    else {
      localContentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.MEDIA;
    }
    return localContentBlockerTriggerResourceType;
  }
  
  /* Error */
  public ContentBlockerTriggerResourceType getResourceTypeFromUrl(WebResourceRequestExt paramWebResourceRequestExt)
  {
    // Byte code:
    //   0: getstatic 407	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType:RAW	Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual 62	com/pichillilorenzo/flutter_inappwebview_android/types/WebResourceRequestExt:getUrl	()Ljava/lang/String;
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w 259
    //   13: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   16: ifne +16 -> 32
    //   19: aload_2
    //   20: astore 4
    //   22: aload_3
    //   23: ldc_w 261
    //   26: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   29: ifeq +88 -> 117
    //   32: aload_3
    //   33: ldc_w 442
    //   36: aload_1
    //   37: invokevirtual 268	com/pichillilorenzo/flutter_inappwebview_android/types/WebResourceRequestExt:getHeaders	()Ljava/util/Map;
    //   40: invokestatic 274	com/pichillilorenzo/flutter_inappwebview_android/Util:makeHttpRequest	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;
    //   43: astore_3
    //   44: aload_2
    //   45: astore 4
    //   47: aload_3
    //   48: ifnull +69 -> 117
    //   51: aload_3
    //   52: invokevirtual 300	java/net/URLConnection:getContentType	()Ljava/lang/String;
    //   55: astore 4
    //   57: aload_2
    //   58: astore_1
    //   59: aload 4
    //   61: ifnull +21 -> 82
    //   64: aload_0
    //   65: aload 4
    //   67: ldc_w 304
    //   70: invokevirtual 75	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   73: iconst_0
    //   74: aaload
    //   75: invokevirtual 307	java/lang/String:trim	()Ljava/lang/String;
    //   78: invokevirtual 404	com/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerHandler:getResourceTypeFromContentType	(Ljava/lang/String;)Lcom/pichillilorenzo/flutter_inappwebview_android/content_blocker/ContentBlockerTriggerResourceType;
    //   81: astore_1
    //   82: aload_3
    //   83: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   86: aload_1
    //   87: astore 4
    //   89: goto +28 -> 117
    //   92: astore_1
    //   93: goto +18 -> 111
    //   96: astore_1
    //   97: ldc 14
    //   99: ldc -62
    //   101: aload_1
    //   102: invokestatic 371	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   105: pop
    //   106: aload_2
    //   107: astore_1
    //   108: goto -26 -> 82
    //   111: aload_3
    //   112: invokevirtual 289	java/net/HttpURLConnection:disconnect	()V
    //   115: aload_1
    //   116: athrow
    //   117: aload 4
    //   119: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	ContentBlockerHandler
    //   0	120	1	paramWebResourceRequestExt	WebResourceRequestExt
    //   3	104	2	localContentBlockerTriggerResourceType	ContentBlockerTriggerResourceType
    //   8	104	3	localObject1	Object
    //   20	98	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   51	57	92	finally
    //   64	82	92	finally
    //   97	106	92	finally
    //   51	57	96	java/lang/Exception
    //   64	82	96	java/lang/Exception
  }
  
  public List<ContentBlocker> getRuleList()
  {
    return ruleList;
  }
  
  public void setRuleList(List<ContentBlocker> paramList)
  {
    ruleList = paramList;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */