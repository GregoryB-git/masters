.class public final LC4/n;
.super LC4/v;
.source "SourceFile"


# static fields
.field public static a:LC4/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LC4/v;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static declared-synchronized f()LC4/n;
    .locals 2

    .line 1
    const-class v0, LC4/n;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LC4/n;->a:LC4/n;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LC4/n;

    .line 9
    .line 10
    invoke-direct {v1}, LC4/n;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LC4/n;->a:LC4/n;

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
    sget-object v1, LC4/n;->a:LC4/n;
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
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs"

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "sessions_cpu_capture_frequency_fg_ms"

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fpr_session_gauge_cpu_capture_frequency_fg_ms"

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/Long;
    .locals 2

    .line 1
    const-wide/16 v0, 0x64

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 4

    .line 1
    invoke-virtual {p0}, LC4/n;->d()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/16 v2, 0x3

    .line 10
    .line 11
    mul-long/2addr v0, v2

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
