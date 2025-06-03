.class public Lcom/google/protobuf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Z = true

.field public static volatile c:Lcom/google/protobuf/k;

.field public static final d:Lcom/google/protobuf/k;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/protobuf/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/protobuf/k;-><init>(Z)V

    sput-object v0, Lcom/google/protobuf/k;->d:Lcom/google/protobuf/k;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/k;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/protobuf/k;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/k;->c:Lcom/google/protobuf/k;

    if-nez v0, :cond_2

    const-class v1, Lcom/google/protobuf/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/protobuf/k;->c:Lcom/google/protobuf/k;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/google/protobuf/k;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/j;->a()Lcom/google/protobuf/k;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/protobuf/k;->d:Lcom/google/protobuf/k;

    :goto_0
    sput-object v0, Lcom/google/protobuf/k;->c:Lcom/google/protobuf/k;

    :cond_1
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_2
    return-object v0
.end method
