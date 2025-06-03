.class public final synthetic LM5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LM5/e;

.field public final synthetic p:Ls3/e;

.field public final synthetic q:LV2/k;


# direct methods
.method public synthetic constructor <init>(LM5/e;Ls3/e;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM5/b;->o:LM5/e;

    .line 5
    .line 6
    iput-object p2, p0, LM5/b;->p:Ls3/e;

    .line 7
    .line 8
    iput-object p3, p0, LM5/b;->q:LV2/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LM5/b;->o:LM5/e;

    .line 2
    .line 3
    iget-object v1, p0, LM5/b;->p:Ls3/e;

    .line 4
    .line 5
    iget-object v2, p0, LM5/b;->q:LV2/k;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LM5/e;->d(LM5/e;Ls3/e;LV2/k;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
