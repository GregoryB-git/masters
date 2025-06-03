.class public LQ3/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ3/n;->e(Ljava/lang/Object;Ld4/n;LQ3/e$e;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ld4/n;

.field public final synthetic p:LY3/g;

.field public final synthetic q:LQ3/n;


# direct methods
.method public constructor <init>(LQ3/n;Ld4/n;LY3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/n$a;->q:LQ3/n;

    .line 2
    .line 3
    iput-object p2, p0, LQ3/n$a;->o:Ld4/n;

    .line 4
    .line 5
    iput-object p3, p0, LQ3/n$a;->p:LY3/g;

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
    iget-object v0, p0, LQ3/n$a;->q:LQ3/n;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/n;->b(LQ3/n;)LV3/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LQ3/n$a;->q:LQ3/n;

    .line 8
    .line 9
    invoke-static {v1}, LQ3/n;->a(LQ3/n;)LV3/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LQ3/n$a;->o:Ld4/n;

    .line 14
    .line 15
    iget-object v3, p0, LQ3/n$a;->p:LY3/g;

    .line 16
    .line 17
    invoke-virtual {v3}, LY3/g;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LQ3/e$e;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, LV3/m;->U(LV3/k;Ld4/n;LQ3/e$e;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
