.class public final LD4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD4/a$b;
    }
.end annotation


# instance fields
.field public a:LU5/a;

.field public b:LU5/a;

.field public c:LU5/a;

.field public d:LU5/a;

.field public e:LU5/a;

.field public f:LU5/a;

.field public g:LU5/a;

.field public h:LU5/a;


# direct methods
.method public constructor <init>(LE4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, LD4/a;->c(LE4/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LE4/a;LD4/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LD4/a;-><init>(LE4/a;)V

    return-void
.end method

.method public static b()LD4/a$b;
    .locals 2

    .line 1
    new-instance v0, LD4/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LD4/a$b;-><init>(LD4/a$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public a()LA4/e;
    .locals 1

    .line 1
    iget-object v0, p0, LD4/a;->h:LU5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA4/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(LE4/a;)V
    .locals 8

    .line 1
    invoke-static {p1}, LE4/c;->a(LE4/a;)LE4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LD4/a;->a:LU5/a;

    .line 6
    .line 7
    invoke-static {p1}, LE4/e;->a(LE4/a;)LE4/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LD4/a;->b:LU5/a;

    .line 12
    .line 13
    invoke-static {p1}, LE4/d;->a(LE4/a;)LE4/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LD4/a;->c:LU5/a;

    .line 18
    .line 19
    invoke-static {p1}, LE4/h;->a(LE4/a;)LE4/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, LD4/a;->d:LU5/a;

    .line 24
    .line 25
    invoke-static {p1}, LE4/f;->a(LE4/a;)LE4/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, LD4/a;->e:LU5/a;

    .line 30
    .line 31
    invoke-static {p1}, LE4/b;->a(LE4/a;)LE4/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, LD4/a;->f:LU5/a;

    .line 36
    .line 37
    invoke-static {p1}, LE4/g;->a(LE4/a;)LE4/g;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iput-object v7, p0, LD4/a;->g:LU5/a;

    .line 42
    .line 43
    iget-object v1, p0, LD4/a;->a:LU5/a;

    .line 44
    .line 45
    iget-object v2, p0, LD4/a;->b:LU5/a;

    .line 46
    .line 47
    iget-object v3, p0, LD4/a;->c:LU5/a;

    .line 48
    .line 49
    iget-object v4, p0, LD4/a;->d:LU5/a;

    .line 50
    .line 51
    iget-object v5, p0, LD4/a;->e:LU5/a;

    .line 52
    .line 53
    iget-object v6, p0, LD4/a;->f:LU5/a;

    .line 54
    .line 55
    invoke-static/range {v1 .. v7}, LA4/g;->a(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)LA4/g;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lq5/a;->a(LU5/a;)LU5/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LD4/a;->h:LU5/a;

    .line 64
    .line 65
    return-void
.end method
