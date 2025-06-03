.class public abstract Lgb/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Leb/p;


# direct methods
.method public constructor <init>(Leb/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/z;->a:Leb/p;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final run()V
    .locals 3

    iget-object v0, p0, Lgb/z;->a:Leb/p;

    invoke-virtual {v0}, Leb/p;->a()Leb/p;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lgb/z;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lgb/z;->a:Leb/p;

    invoke-virtual {v1, v0}, Leb/p;->c(Leb/p;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lgb/z;->a:Leb/p;

    invoke-virtual {v2, v0}, Leb/p;->c(Leb/p;)V

    throw v1
.end method
