.class public final Lm6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lm6/k;

.field public static final c:Lm6/l;


# instance fields
.field public a:Lm6/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Lm6/l;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lm6/l;-><init>(IZZII)V

    sput-object v6, Lm6/k;->c:Lm6/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lm6/k;
    .locals 2

    const-class v0, Lm6/k;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm6/k;->b:Lm6/k;

    if-nez v1, :cond_0

    new-instance v1, Lm6/k;

    invoke-direct {v1}, Lm6/k;-><init>()V

    sput-object v1, Lm6/k;->b:Lm6/k;

    :cond_0
    sget-object v1, Lm6/k;->b:Lm6/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
