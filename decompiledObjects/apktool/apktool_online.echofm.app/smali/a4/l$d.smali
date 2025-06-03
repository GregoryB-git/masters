.class public La4/l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:LV3/G;

.field public final b:La4/k;

.field public final c:Ld4/n;


# direct methods
.method public constructor <init>(LV3/G;La4/k;Ld4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La4/l$d;->a:LV3/G;

    .line 5
    .line 6
    iput-object p2, p0, La4/l$d;->b:La4/k;

    .line 7
    .line 8
    iput-object p3, p0, La4/l$d;->c:Ld4/n;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ld4/h;Ld4/m;Z)Ld4/m;
    .locals 2

    .line 1
    iget-object v0, p0, La4/l$d;->c:Ld4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, La4/l$d;->b:La4/k;

    .line 7
    .line 8
    invoke-virtual {v0}, La4/k;->b()Ld4/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    iget-object v1, p0, La4/l$d;->a:LV3/G;

    .line 13
    .line 14
    invoke-virtual {v1, v0, p2, p3, p1}, LV3/G;->g(Ld4/n;Ld4/m;ZLd4/h;)Ld4/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public b(Ld4/b;)Ld4/n;
    .locals 4

    .line 1
    iget-object v0, p0, La4/l$d;->b:La4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, La4/k;->c()La4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, La4/a;->c(Ld4/b;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La4/a;->b()Ld4/n;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p1}, Ld4/n;->v(Ld4/b;)Ld4/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v0, p0, La4/l$d;->c:Ld4/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, La4/a;

    .line 27
    .line 28
    invoke-static {}, Ld4/j;->j()Ld4/j;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Ld4/i;->f(Ld4/n;Ld4/h;)Ld4/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v2, 0x1

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-direct {v1, v0, v2, v3}, La4/a;-><init>(Ld4/i;ZZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, p0, La4/l$d;->b:La4/k;

    .line 43
    .line 44
    invoke-virtual {v0}, La4/k;->d()La4/a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :goto_0
    iget-object v0, p0, La4/l$d;->a:LV3/G;

    .line 49
    .line 50
    invoke-virtual {v0, p1, v1}, LV3/G;->a(Ld4/b;La4/a;)Ld4/n;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method
