.class public final Lcom/appsflyer/internal/AFb1fSDK;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static AFInAppEventParameterName:J = 0x0L

.field private static AFInAppEventType:I = 0x0

.field private static AFLogger:[C = null

.field private static afDebugLog:I = 0x0

.field private static afErrorLog:I = 0x0

.field private static afErrorLogForExcManagerOnly:I = 0x1

.field private static afInfoLog:Z

.field private static afRDLog:Z

.field private static valueOf:C


# instance fields
.field private final AFKeystoreWrapper:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final values:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/appsflyer/internal/AFb1fSDK;->valueOf()V

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    const-string v1, ""

    const/16 v2, 0x30

    invoke-static {v1, v2, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    invoke-static {v1, v2, v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    invoke-static {v0, v0}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    invoke-static {v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    invoke-static {v0, v0}, Landroid/view/KeyEvent;->getDeadChar(II)I

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    invoke-static {v1, v0}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    sget v0, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v0, v0, 0x63

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    iput-object p2, p0, Lcom/appsflyer/internal/AFb1fSDK;->values:Landroid/content/Context;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private AFInAppEventType()Ljava/lang/String;
    .locals 15
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const-string v0, ""

    sget v1, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v1, v1, 0x2f

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    const/16 v1, 0x30

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v7, "\ud753\u9f0b\u5c56\uafe3"

    const-string v8, "\u516b\u9b35\u1cd1\u89a8\u3456\u6297\uf965\u101c\ud5ed\ua3ad\uc8a0\u56e1"

    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v9

    const-string v10, "\u0000\u0000\u0000\u0000"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v11

    rsub-int/lit8 v11, v11, -0x1

    int-to-char v11, v11

    new-array v13, v3, [Ljava/lang/Object;

    move-object v12, v13

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v7, v13, v4

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v8, "\u118e\u4421\ue09a\ud54a"

    const-string v9, "\uff1b\u323d\u3390\u5618\u3c8d"

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v10

    const v11, -0x65bbdeef

    sub-int v10, v11, v10

    const-string v11, "\u0000\u0000\u0000\u0000"

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v12

    add-int/lit16 v12, v12, 0x4ae0

    int-to-char v12, v12

    new-array v14, v3, [Ljava/lang/Object;

    move-object v13, v14

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v8, v14, v4

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_0

    const-string v7, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081"

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v8

    shr-int/lit8 v8, v8, 0x16

    rsub-int/lit8 v8, v8, 0x7f

    new-array v9, v3, [Ljava/lang/Object;

    invoke-static {v2, v2, v7, v8, v9}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v7, v9, v4

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :catch_0
    move-exception v5

    goto :goto_3

    :cond_0
    :goto_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    aput-object v5, v6, v4

    aput-object v7, v6, v3

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x2

    aput-object v5, v6, v7

    invoke-static {v6}, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    const/4 v7, 0x4

    if-le v6, v7, :cond_1

    invoke-virtual {v5, v7, v6}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v6, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v6, v6, 0x15

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    goto :goto_2

    :cond_1
    :goto_1
    if-ge v6, v7, :cond_2

    add-int/lit8 v6, v6, 0x1

    const/16 v8, 0x31

    :try_start_1
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    :goto_2
    const-string v6, "\u008a\u0089\u0088"

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v7

    shr-int/lit8 v7, v7, 0x8

    add-int/lit8 v7, v7, 0x7f

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v2, v2, v6, v7, v8}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v6, v8, v4

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_3
    invoke-static {v0}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v8

    invoke-static {v4}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x14

    shr-int/lit8 v6, v6, 0x6

    add-int/lit16 v6, v6, 0x6cf7

    int-to-char v10, v6

    new-array v12, v3, [Ljava/lang/Object;

    const-string v6, "\u54e5\u040a\uf7a0\ud56c"

    const-string v7, "\ua419\u2eb8\ub678\ua252\u8642\u468d\u5495\u1169\u5b7d\u2ec0\uf654\uc7e3\ud7cf\ub2a6\ua774\u7460\u022b\u4158\u116b\u1eb5\u4c77\ud0b7\u8234\u128e\ue91e\u2a92\u7168\uf905\u1d06\ub405\u13ca\ue797\u53e4\u5783\ub079\u85d8\ub167\uc490\u87c9\u4e56"

    const-string v9, "\u0000\u0000\u0000\u0000"

    move-object v11, v12

    invoke-static/range {v6 .. v11}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v6, v12, v4

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x7f

    new-array v8, v3, [Ljava/lang/Object;

    const-string v9, "\u008f\u009b\u0091\u009a\u008c\u0093\u0099\u0089\u0098\u0097\u0089\u008f\u0096\u0093\u008c\u0095\u008f\u0094\u0089\u0088\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a"

    invoke-static {v2, v2, v9, v7, v8}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v7, v8, v4

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    invoke-static {v0, v1, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    add-int/lit16 v0, v0, 0x80

    new-array v1, v3, [Ljava/lang/Object;

    const-string v3, "\u009c\u009c\u009c\u009c\u008a\u0089\u0088"

    invoke-static {v2, v2, v3, v0, v1}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v0, v1, v4

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V
    .locals 8

    .line 2
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    :cond_0
    check-cast p3, [C

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    :cond_1
    check-cast p1, [C

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_2
    check-cast p0, [C

    sget-object v0, Lcom/appsflyer/internal/AFg1vSDK;->valueOf:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [C

    invoke-virtual {p3}, [C->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [C

    const/4 v1, 0x0

    aget-char v2, p0, v1

    xor-int/2addr p4, v2

    int-to-char p4, p4

    aput-char p4, p0, v1

    const/4 p4, 0x2

    aget-char v2, p3, p4

    int-to-char p2, p2

    add-int/2addr v2, p2

    int-to-char p2, v2

    aput-char p2, p3, p4

    array-length p2, p1

    new-array p4, p2, [C

    sput v1, Lcom/appsflyer/internal/AFg1vSDK;->values:I

    :goto_0
    sget v2, Lcom/appsflyer/internal/AFg1vSDK;->values:I

    if-ge v2, p2, :cond_3

    add-int/lit8 v3, v2, 0x2

    rem-int/lit8 v3, v3, 0x4

    add-int/lit8 v4, v2, 0x3

    rem-int/lit8 v4, v4, 0x4

    rem-int/lit8 v2, v2, 0x4

    aget-char v2, p0, v2

    mul-int/lit16 v2, v2, 0x7fce

    aget-char v3, p3, v3

    add-int/2addr v2, v3

    const v5, 0xffff

    rem-int/2addr v2, v5

    int-to-char v2, v2

    sput-char v2, Lcom/appsflyer/internal/AFg1vSDK;->AFInAppEventParameterName:C

    aget-char v6, p0, v4

    mul-int/lit16 v6, v6, 0x7fce

    add-int/2addr v6, v3

    div-int/2addr v6, v5

    int-to-char v3, v6

    aput-char v3, p3, v4

    aput-char v2, p0, v4

    sget v3, Lcom/appsflyer/internal/AFg1vSDK;->values:I

    aget-char v4, p1, v3

    xor-int/2addr v2, v4

    int-to-long v4, v2

    sget-wide v6, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventParameterName:J

    xor-long/2addr v4, v6

    sget v2, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType:I

    int-to-long v6, v2

    xor-long/2addr v4, v6

    sget-char v2, Lcom/appsflyer/internal/AFb1fSDK;->valueOf:C

    int-to-long v6, v2

    xor-long/2addr v4, v6

    long-to-int v2, v4

    int-to-char v2, v2

    aput-char v2, p4, v3

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/appsflyer/internal/AFg1vSDK;->values:I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p4}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aput-object p0, p5, v1

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private AFKeystoreWrapper()Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v6, -0x1

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    :try_start_0
    iget-object v0, v1, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v11, "\ud753\u9f0b\u5c56\uafe3"

    const-string v12, "\u516b\u9b35\u1cd1\u89a8\u3456\u6297\uf965\u101c\ud5ed\ua3ad\uc8a0\u56e1"

    invoke-static {v10, v10, v10}, Landroid/graphics/Color;->rgb(III)I

    move-result v13

    const/high16 v14, 0x1000000

    add-int/2addr v13, v14

    const-string v14, "\u0000\u0000\u0000\u0000"

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v15

    shr-int/2addr v15, v7

    int-to-char v15, v15

    new-array v4, v9, [Ljava/lang/Object;

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v4, v4, v10

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v11, "\u0bae\u35eb\u2e8e\u7e3b"

    const-string v12, "\u0667\ude21\u9b89\ud33d\u363a\u22e2\ucbfd\u1e19\u5053\u7b15\u1f09\u0d5e\u7029\u76d3\u74ba"

    invoke-static {v10, v10}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v5

    const v13, -0x71ca14f5

    add-int/2addr v13, v5

    const-string v14, "\u0000\u0000\u0000\u0000"

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    cmpl-float v5, v5, v3

    add-int/lit16 v5, v5, 0x3b2e

    int-to-char v15, v5

    new-array v5, v9, [Ljava/lang/Object;

    move-object/from16 v16, v5

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v5, v5, v10

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u00a0\u009e\u00a0\u009f\u009e\u009d"

    invoke-static {v2, v10}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v11

    add-int/lit8 v11, v11, 0x7f

    new-array v12, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v5, v11, v12}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v5, v12, v10

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    const-string v11, "\u00a2\u009e\u0098\u0092\u00a1"

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v12

    shr-int/lit8 v12, v12, 0x8

    add-int/lit8 v12, v12, 0x7f

    new-array v13, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v11, v12, v13}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v11, v13, v10

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1nSDK;->AFInAppEventType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v3, v0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    invoke-static {v10, v10}, Landroid/view/View;->resolveSize(II)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x7f

    new-array v5, v9, [Ljava/lang/Object;

    const-string v11, "\u0089\u00a4\u008d\u008b\u00a5\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a\u008f\u0089\u00a4\u008d\u008b\u00a3\u00a0\u00a3\u0093\u0089\u0090"

    invoke-static {v8, v8, v11, v4, v5}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v4, v5, v10

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v5

    rsub-int/lit8 v13, v5, -0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v5

    cmpl-float v3, v5, v3

    add-int/lit16 v3, v3, 0x4740

    int-to-char v15, v3

    new-array v3, v9, [Ljava/lang/Object;

    const-string v11, "\ue1cc\ude77\u4157\ue847"

    const-string v12, "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950"

    const-string v14, "\u0000\u0000\u0000\u0000"

    move-object/from16 v16, v3

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v3, v3, v10

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v13

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v5

    add-int/lit16 v5, v5, 0xef6

    int-to-char v15, v5

    new-array v3, v9, [Ljava/lang/Object;

    const-string v11, "\u9d51\ufdad\uf69c\u140e"

    const-string v12, "\u7f39\uf0fc\u167d\uf174\uda3b\u2c53\u8e97\uab5c\u3ba5\u1796\u3153\ufa48\ue2d5\u3597\uff63\uf546\ude81\u7b57"

    const-string v14, "\u0000\u0000\u0000\u0000"

    move-object/from16 v16, v3

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v3, v3, v10

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :goto_1
    :try_start_1
    iget-object v0, v1, Lcom/appsflyer/internal/AFb1fSDK;->values:Landroid/content/Context;

    new-instance v4, Landroid/content/IntentFilter;

    const-string v11, "\ua1fb\u05d9\ua489\u5107"

    const-string v12, "\u8b58\u0ad0\u8c66\u1ce3\u3432\ufb03\uce8a\uea42\u31ed\u7b47\u7565\u630f\ud7f9\ua503\u3084\u36cb\uf3f0\uaa91\ufc4a\u2b53\u6802\u0944\ubc1d\u14d5\u980f\ua86f\ub8cd\ub94d\ub309\ud8a1\u4cdf\ue429\ub405\ud834\u8ba3\u86e3\ue6e0"

    invoke-static {v10}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x14

    shr-int/lit8 v5, v5, 0x6

    const v13, -0x76fa265f

    add-int/2addr v13, v5

    const-string v14, "\u0000\u0000\u0000\u0000"

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v5, v15, v17

    rsub-int/lit8 v5, v5, 0x1

    int-to-char v15, v5

    new-array v5, v9, [Ljava/lang/Object;

    move-object/from16 v16, v5

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v5, v5, v10

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v4, -0xa8c

    if-eqz v0, :cond_1

    sget v5, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v5, v5, 0x4f

    rem-int/lit16 v11, v5, 0x80

    sput v11, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    rem-int/lit8 v5, v5, 0x2

    const-string v11, "\u0089\u0092\u00a4\u0093\u008b\u0092\u0089\u0099\u00a6\u0089\u0093"

    if-nez v5, :cond_0

    :try_start_2
    invoke-static {v10, v9, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    const/16 v5, 0x6e

    div-int/2addr v5, v4

    new-array v4, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v11, v5, v4}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v4, v4, v10

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x28bb

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    :goto_2
    move v4, v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_7

    :cond_0
    invoke-static {v10, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    add-int/lit8 v5, v5, 0x7f

    new-array v12, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v11, v5, v12}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v5, v12, v10

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    goto :goto_2

    :cond_1
    :goto_3
    iget-object v0, v1, Lcom/appsflyer/internal/AFb1fSDK;->values:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v5, "\u009d\u00a7\u0097"

    invoke-static {v2, v10}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v11

    add-int/lit8 v11, v11, 0x7f

    new-array v12, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v5, v11, v12}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v5, v12, v10

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v9

    goto :goto_4

    :cond_2
    move v0, v10

    :goto_4
    iget-object v5, v1, Lcom/appsflyer/internal/AFb1fSDK;->values:Landroid/content/Context;

    const-string v11, "\u0092\u009a\u00a8\u0091\u0089\u00a8"

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v12

    shr-int/2addr v12, v7

    rsub-int/lit8 v12, v12, 0x7f

    new-array v13, v9, [Ljava/lang/Object;

    invoke-static {v8, v8, v11, v12, v13}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v11, v13, v10

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/hardware/SensorManager;

    invoke-virtual {v5, v6}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "\u5e95\uc2d4\ua952\ue399"

    const-string v20, "\uc23f"

    const/16 v12, 0x30

    invoke-static {v2, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v13

    const v14, 0x52c2d45f

    add-int v21, v13, v14

    const-string v22, "\u0000\u0000\u0000\u0000"

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v13

    shr-int/2addr v13, v7

    const v14, 0x99a9

    add-int/2addr v13, v14

    int-to-char v13, v13

    new-array v14, v9, [Ljava/lang/Object;

    move/from16 v23, v13

    move-object/from16 v24, v14

    invoke-static/range {v19 .. v24}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v13, v14, v10

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v19, "\ua816\ud564\ucc7b\u5306"

    const-string v20, "\ubcd2\u6a49"

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v4, v13, v15

    rsub-int/lit8 v21, v4, 0x1

    const-string v22, "\u0000\u0000\u0000\u0000"

    invoke-static {v10, v10}, Landroid/view/View;->resolveSize(II)I

    move-result v4

    add-int/lit16 v4, v4, 0x6cc

    int-to-char v4, v4

    new-array v13, v9, [Ljava/lang/Object;

    move/from16 v23, v4

    move-object/from16 v24, v13

    invoke-static/range {v19 .. v24}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v4, v13, v10

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v19, "\uf003\u86a8\u6293\uce43"

    const-string v20, "\u5cfe\ud153"

    invoke-static {v2, v12, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v0

    rsub-int/lit8 v21, v0, -0x1

    const-string v22, "\u0000\u0000\u0000\u0000"

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v0, v12, v14

    rsub-int v0, v0, 0x4363

    int-to-char v0, v0

    new-array v2, v9, [Ljava/lang/Object;

    move/from16 v23, v0

    move-object/from16 v24, v2

    invoke-static/range {v19 .. v24}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v0, v2, v10

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v19, "\u5b03\uae0c\uc6c7\u44a8"

    const-string v20, "\ud15c\uf6e1"

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v4

    const-wide/16 v12, -0x1

    cmp-long v0, v4, v12

    add-int/lit8 v21, v0, -0x1

    const-string v22, "\u0000\u0000\u0000\u0000"

    invoke-static {v10, v10}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v0

    const v2, 0xa8c6

    add-int/2addr v0, v2

    int-to-char v0, v0

    new-array v2, v9, [Ljava/lang/Object;

    move/from16 v23, v0

    move-object/from16 v24, v2

    invoke-static/range {v19 .. v24}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v0, v2, v10

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v1, Lcom/appsflyer/internal/AFb1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->valueOf(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1fSDK$AFa1ySDK;->AFInAppEventParameterName([B)[B

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    array-length v5, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move v11, v10

    :goto_5
    if-ge v11, v5, :cond_5

    sget v12, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v12, v12, 0x41

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    :try_start_3
    aget-byte v12, v0, v11

    invoke-static {v12}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-ne v13, v9, :cond_4

    sget v13, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    add-int/lit8 v13, v13, 0x23

    rem-int/lit16 v14, v13, 0x80

    sput v14, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    rem-int/lit8 v13, v13, 0x2

    const-string v14, "0"

    if-eqz v13, :cond_3

    :try_start_4
    invoke-virtual {v14, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/4 v13, 0x6

    :try_start_5
    div-int/2addr v13, v10
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v2, v0

    throw v2

    :cond_3
    :try_start_6
    invoke-virtual {v14, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_4
    :goto_6
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_8

    :goto_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/2addr v2, v7

    rsub-int/lit8 v2, v2, 0x7f

    new-array v4, v9, [Ljava/lang/Object;

    const-string v5, "\u0092\u009a\u0092\u0092\u0089\u008f\u0089\u00a4\u008d\u008b\u00a3\u00a0\u00a3\u0093\u0089\u0090"

    invoke-static {v8, v8, v5, v2, v4}, Lcom/appsflyer/internal/AFb1fSDK;->values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v2, v4, v10

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/appsflyer/AFLogger;->afErrorLogForExcManagerOnly(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v13

    invoke-static {v10, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    rsub-int v4, v4, 0x4741

    int-to-char v15, v4

    new-array v4, v9, [Ljava/lang/Object;

    const-string v11, "\ue1cc\ude77\u4157\ue847"

    const-string v12, "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950"

    const-string v14, "\u0000\u0000\u0000\u0000"

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v4, v4, v10

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afRDLog(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    add-int/lit8 v13, v2, -0x1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v2

    shr-int/2addr v2, v7

    const v3, 0xee03

    add-int/2addr v2, v3

    int-to-char v15, v2

    new-array v2, v9, [Ljava/lang/Object;

    const-string v11, "\u7fdf\u1385\u03a0\u71ee"

    const-string v12, "\u47fc\u7ed7\u1953\u9351\u9ad8\u8f15\uf839\u5022\u6b2c\u171b\ue47e\u8563\ueccb\u585f\u8f03\uf4be"

    const-string v14, "\u0000\u0000\u0000\u0000"

    move-object/from16 v16, v2

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;C[Ljava/lang/Object;)V

    aget-object v2, v2, v10

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_8
    return-object v0
.end method

.method private static varargs AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 9
    .param p0    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    sget v3, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v3, v3, 0x5d

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x22

    goto :goto_0

    :cond_0
    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v1

    :goto_1
    if-ge v4, v0, :cond_5

    const/4 v5, 0x0

    move v6, v1

    :goto_2
    if-ge v6, v3, :cond_4

    sget v7, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLog:I

    add-int/lit8 v7, v7, 0x73

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/appsflyer/internal/AFb1fSDK;->afErrorLogForExcManagerOnly:I

    rem-int/lit8 v7, v7, 0x2

    if-nez v7, :cond_2

    aget-object v7, p0, v6

    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2e

    div-int/2addr v8, v1

    if-nez v5, :cond_3

    goto :goto_3

    :cond_2
    aget-object v7, p0, v6

    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    xor-int/2addr v7, v5

    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-object v2
.end method

.method public static valueOf()V
    .locals 2

    const/4 v0, 0x0

    sput v0, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventType:I

    const v0, 0x8c43

    sput-char v0, Lcom/appsflyer/internal/AFb1fSDK;->valueOf:C

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/appsflyer/internal/AFb1fSDK;->AFInAppEventParameterName:J

    const/4 v0, 0x1

    sput-boolean v0, Lcom/appsflyer/internal/AFb1fSDK;->afRDLog:Z

    const/16 v1, 0x28

    new-array v1, v1, [C

    fill-array-data v1, :array_0

    sput-object v1, Lcom/appsflyer/internal/AFb1fSDK;->AFLogger:[C

    sput-boolean v0, Lcom/appsflyer/internal/AFb1fSDK;->afInfoLog:Z

    const/16 v0, 0x61

    sput v0, Lcom/appsflyer/internal/AFb1fSDK;->afDebugLog:I

    return-void

    nop

    :array_0
    .array-data 2
        0xafs
        0xb0s
        0xc0s
        0xa3s
        0xb3s
        0xa2s
        0xa5s
        0xccs
        0xc6s
        0xc7s
        0xc2s
        0xcas
        0xcds
        0xc5s
        0x81s
        0xc8s
        0xcfs
        0xd3s
        0xd5s
        0xdas
        0xd8s
        0xc9s
        0xd9s
        0xc4s
        0xd1s
        0xd0s
        0x9bs
        0x9as
        0x97s
        0x8fs
        0x92s
        0x93s
        0x8es
        0x8bs
        0xb7s
        0xd6s
        0xd7s
        0xces
        0x99s
        0xd4s
    .end array-data
.end method

.method private static values([ILjava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 6

    if-eqz p2, :cond_0

    const-string v0, "ISO-8859-1"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    :cond_0
    check-cast p2, [B

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    :cond_1
    check-cast p1, [C

    sget-object v0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/appsflyer/internal/AFb1fSDK;->AFLogger:[C

    sget v2, Lcom/appsflyer/internal/AFb1fSDK;->afDebugLog:I

    sget-boolean v3, Lcom/appsflyer/internal/AFb1fSDK;->afInfoLog:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    array-length p0, p2

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p0, p0, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_0
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p1, v3, :cond_2

    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget-byte v3, p2, v3

    add-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p1

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    aput-object p1, p4, v4

    return-void

    :cond_3
    :try_start_1
    sget-boolean p2, Lcom/appsflyer/internal/AFb1fSDK;->afRDLog:Z

    if-eqz p2, :cond_5

    array-length p0, p1

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p0, p0, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_1
    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p2, v3, :cond_4

    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget-char v3, p1, v3

    sub-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p0, p2

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    aput-object p1, p4, v4

    return-void

    :cond_5
    :try_start_2
    array-length p1, p0

    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    new-array p1, p1, [C

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    :goto_2
    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    if-ge p2, v3, :cond_6

    sget p2, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sget v3, Lcom/appsflyer/internal/AFg1tSDK;->values:I

    add-int/lit8 v3, v3, -0x1

    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    sub-int/2addr v3, v5

    aget v3, p0, v3

    sub-int/2addr v3, p3

    aget-char v3, v1, v3

    sub-int/2addr v3, v2

    int-to-char v3, v3

    aput-char v3, p1, p2

    add-int/lit8 v5, v5, 0x1

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->valueOf:I

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    aput-object p0, p4, v4

    return-void

    :goto_3
    monitor-exit v0

    throw p0
.end method
