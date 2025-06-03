.class public final synthetic LQ4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LE2/d;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lcom/google/firebase/remoteconfig/internal/b;


# direct methods
.method public synthetic constructor <init>(LE2/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ4/k;->o:LE2/d;

    .line 5
    .line 6
    iput-object p2, p0, LQ4/k;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LQ4/k;->q:Lcom/google/firebase/remoteconfig/internal/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LQ4/k;->o:LE2/d;

    .line 2
    .line 3
    iget-object v1, p0, LQ4/k;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LQ4/k;->q:Lcom/google/firebase/remoteconfig/internal/b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LQ4/l;->a(LE2/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
