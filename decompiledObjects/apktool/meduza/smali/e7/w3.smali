.class public final Le7/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic a:Le7/k3;


# direct methods
.method public constructor <init>(Le7/k3;)V
    .locals 0

    iput-object p1, p0, Le7/w3;->a:Le7/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Le7/w3;->a:Le7/k3;

    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    return-void
.end method
