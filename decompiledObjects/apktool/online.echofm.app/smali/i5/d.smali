.class public final synthetic Li5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Li5/e$a;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li5/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li5/d;->o:Li5/e$a;

    .line 5
    .line 6
    iput-object p2, p0, Li5/d;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Li5/d;->q:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Li5/d;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Li5/d;->o:Li5/e$a;

    .line 2
    .line 3
    iget-object v1, p0, Li5/d;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Li5/d;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Li5/d;->r:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Li5/e$a;->e(Li5/e$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
