.class public final LC1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC1/e;

.field public static final b:Ljava/lang/String;

.field public static c:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC1/e;

    .line 2
    .line 3
    invoke-direct {v0}, LC1/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC1/e;->a:LC1/e;

    .line 7
    .line 8
    const-class v0, LC1/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LC1/e;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 3

    .line 1
    const-string v0, "CaptureViewHierarchy"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "UnityFacebookSDKPlugin"

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, LC1/e;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "UnityFacebookSDKPlugin"

    .line 2
    .line 3
    const-string v1, "OnReceiveMapping"

    .line 4
    .line 5
    invoke-static {v0, v1, p0}, LC1/e;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    const-class v4, Ljava/lang/String;

    .line 6
    .line 7
    :try_start_0
    sget-object v5, LC1/e;->c:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v5, :cond_0

    .line 10
    .line 11
    sget-object v5, LC1/e;->a:LC1/e;

    .line 12
    .line 13
    invoke-virtual {v5}, LC1/e;->b()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    sput-object v5, LC1/e;->c:Ljava/lang/Class;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    sget-object v5, LC1/e;->c:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const-string v7, "unityPlayer"

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    :try_start_1
    const-string v8, "UnitySendMessage"

    .line 30
    .line 31
    new-array v9, v3, [Ljava/lang/Class;

    .line 32
    .line 33
    aput-object v4, v9, v2

    .line 34
    .line 35
    aput-object v4, v9, v1

    .line 36
    .line 37
    aput-object v4, v9, v0

    .line 38
    .line 39
    invoke-virtual {v5, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    sget-object v5, LC1/e;->c:Ljava/lang/Class;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    new-array v3, v3, [Ljava/lang/Object;

    .line 48
    .line 49
    aput-object p0, v3, v2

    .line 50
    .line 51
    aput-object p1, v3, v1

    .line 52
    .line 53
    aput-object p2, v3, v0

    .line 54
    .line 55
    invoke-virtual {v4, v5, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v6

    .line 63
    :cond_2
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    :goto_1
    sget-object p1, LC1/e;->b:Ljava/lang/String;

    .line 68
    .line 69
    const-string p2, "Failed to send message to Unity"

    .line 70
    .line 71
    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :goto_2
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Class;
    .locals 2

    .line 1
    const-string v0, "com.unity3d.player.UnityPlayer"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "forName(UNITY_PLAYER_CLASS)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
