.class public final Lm7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/k;


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field public volatile a:Lm7/k;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm7/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm7/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lm7/h;->c:Ljava/lang/Object;

    iput-object v0, p0, Lm7/h;->b:Ljava/lang/Object;

    iput-object p1, p0, Lm7/h;->a:Lm7/k;

    return-void
.end method

.method public static b(Lm7/i;)Lm7/k;
    .locals 1

    instance-of v0, p0, Lm7/h;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lm7/h;

    invoke-direct {v0, p0}, Lm7/h;-><init>(Lm7/i;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lm7/h;->b:Ljava/lang/Object;

    sget-object v1, Lm7/h;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm7/h;->b:Ljava/lang/Object;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lm7/h;->a:Lm7/k;

    invoke-interface {v0}, Lm7/k;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lm7/h;->b:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scoped provider was invoked recursively returning different results: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " & "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". This is likely due to a circular dependency."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iput-object v0, p0, Lm7/h;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lm7/h;->a:Lm7/k;

    :cond_2
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :goto_1
    return-object v0
.end method
