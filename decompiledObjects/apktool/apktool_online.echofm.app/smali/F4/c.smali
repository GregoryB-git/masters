.class public LF4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LF4/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized c()LF4/c;
    .locals 2

    .line 1
    const-class v0, LF4/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LF4/c;->a:LF4/c;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LF4/c;

    .line 9
    .line 10
    invoke-direct {v1}, LF4/c;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LF4/c;->a:LF4/c;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, LF4/c;->a:LF4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    monitor-exit v0

    .line 23
    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "FirebasePerformance"

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "FirebasePerformance"

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "FirebasePerformance"

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "FirebasePerformance"

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    return-void
.end method
