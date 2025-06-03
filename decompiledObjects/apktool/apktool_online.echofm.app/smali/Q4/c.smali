.class public final synthetic LQ4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LQ4/e;

.field public final synthetic p:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method public synthetic constructor <init>(LQ4/e;Lcom/google/firebase/remoteconfig/internal/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/c;->o:LQ4/e;

    .line 5
    .line 6
    iput-object p2, p0, LQ4/c;->p:Lcom/google/firebase/remoteconfig/internal/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LQ4/c;->o:LQ4/e;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/c;->p:Lcom/google/firebase/remoteconfig/internal/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LQ4/e;->b(LQ4/e;Lcom/google/firebase/remoteconfig/internal/b;)Ljava/lang/Void;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
