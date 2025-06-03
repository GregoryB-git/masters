.class public LL5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/d$d;


# instance fields
.field public final a:LQ3/p;

.field public final b:LL5/z;

.field public c:LQ3/s;

.field public d:LQ3/a;


# direct methods
.method public constructor <init>(LQ3/p;LL5/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL5/b;->a:LQ3/p;

    .line 5
    .line 6
    iput-object p2, p0, LL5/b;->b:LL5/z;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p1, p0, LL5/b;->b:LL5/z;

    .line 2
    .line 3
    invoke-interface {p1}, LL5/z;->run()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LL5/b;->c:LQ3/s;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LL5/b;->a:LQ3/p;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, LQ3/p;->D(LQ3/s;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LL5/b;->c:LQ3/s;

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, LL5/b;->d:LQ3/a;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, LL5/b;->a:LQ3/p;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, LQ3/p;->C(LQ3/a;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LL5/b;->d:LQ3/a;

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Object;LE5/d$b;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "eventType"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "value"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance p1, LL5/E;

    .line 23
    .line 24
    invoke-direct {p1, p2}, LL5/E;-><init>(LE5/d$b;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LL5/b;->c:LQ3/s;

    .line 28
    .line 29
    iget-object p2, p0, LL5/b;->a:LQ3/p;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, LQ3/p;->c(LQ3/s;)LQ3/s;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, LL5/a;

    .line 36
    .line 37
    invoke-direct {v0, p2, p1}, LL5/a;-><init>(LE5/d$b;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LL5/b;->d:LQ3/a;

    .line 41
    .line 42
    iget-object p1, p0, LL5/b;->a:LQ3/p;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, LQ3/p;->a(LQ3/a;)LQ3/a;

    .line 45
    .line 46
    .line 47
    :goto_0
    return-void
.end method
