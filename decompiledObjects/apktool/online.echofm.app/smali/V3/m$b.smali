.class public LV3/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->U(LV3/k;Ld4/n;LQ3/e$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:Ld4/n;

.field public final synthetic c:LQ3/e$e;

.field public final synthetic d:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LV3/k;Ld4/n;LQ3/e$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$b;->d:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$b;->a:LV3/k;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$b;->b:Ld4/n;

    .line 6
    .line 7
    iput-object p4, p0, LV3/m$b;->c:LQ3/e$e;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, LV3/m;->y(Ljava/lang/String;Ljava/lang/String;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LV3/m$b;->d:LV3/m;

    .line 6
    .line 7
    const-string v0, "onDisconnect().setValue"

    .line 8
    .line 9
    iget-object v1, p0, LV3/m$b;->a:LV3/k;

    .line 10
    .line 11
    invoke-static {p2, v0, v1, p1}, LV3/m;->z(LV3/m;Ljava/lang/String;LV3/k;LQ3/c;)V

    .line 12
    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, LV3/m$b;->d:LV3/m;

    .line 17
    .line 18
    invoke-static {p2}, LV3/m;->k(LV3/m;)LV3/u;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object v0, p0, LV3/m$b;->a:LV3/k;

    .line 23
    .line 24
    iget-object v1, p0, LV3/m$b;->b:Ld4/n;

    .line 25
    .line 26
    invoke-virtual {p2, v0, v1}, LV3/u;->d(LV3/k;Ld4/n;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p2, p0, LV3/m$b;->d:LV3/m;

    .line 30
    .line 31
    iget-object v0, p0, LV3/m$b;->c:LQ3/e$e;

    .line 32
    .line 33
    iget-object v1, p0, LV3/m$b;->a:LV3/k;

    .line 34
    .line 35
    invoke-virtual {p2, v0, p1, v1}, LV3/m;->G(LQ3/e$e;LQ3/c;LV3/k;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
