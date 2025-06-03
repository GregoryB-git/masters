.class public LQ3/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/e;->f0(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ld4/n;

.field public final synthetic p:LY3/g;

.field public final synthetic q:LQ3/e;


# direct methods
.method public constructor <init>(LQ3/e;Ld4/n;LY3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/e$a;->q:LQ3/e;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/e$a;->o:Ld4/n;

    .line 4
    .line 5
    iput-object p3, p0, LQ3/e$a;->p:LY3/g;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ3/e$a;->q:LQ3/e;

    .line 2
    .line 3
    iget-object v1, v0, LQ3/p;->a:LV3/m;

    .line 4
    .line 5
    invoke-virtual {v0}, LQ3/p;->s()LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, LQ3/e$a;->o:Ld4/n;

    .line 10
    .line 11
    iget-object v3, p0, LQ3/e$a;->p:LY3/g;

    .line 12
    .line 13
    invoke-virtual {v3}, LY3/g;->b()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LQ3/e$e;

    .line 18
    .line 19
    invoke-virtual {v1, v0, v2, v3}, LV3/m;->m0(LV3/k;Ld4/n;LQ3/e$e;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
