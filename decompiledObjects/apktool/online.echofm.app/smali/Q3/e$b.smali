.class public LQ3/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/e;->c0(Ld4/n;LQ3/e$e;)LV2/j;
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
    iput-object p1, p0, LQ3/e$b;->q:LQ3/e;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/e$b;->o:Ld4/n;

    .line 4
    .line 5
    iput-object p3, p0, LQ3/e$b;->p:LY3/g;

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
    iget-object v0, p0, LQ3/e$b;->q:LQ3/e;

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
    invoke-static {}, Ld4/b;->o()Ld4/b;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, LQ3/e$b;->o:Ld4/n;

    .line 18
    .line 19
    iget-object v3, p0, LQ3/e$b;->p:LY3/g;

    .line 20
    .line 21
    invoke-virtual {v3}, LY3/g;->b()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, LQ3/e$e;

    .line 26
    .line 27
    invoke-virtual {v1, v0, v2, v3}, LV3/m;->m0(LV3/k;Ld4/n;LQ3/e$e;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
