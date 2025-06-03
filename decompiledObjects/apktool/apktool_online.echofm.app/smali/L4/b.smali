.class public final LL4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LF4/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lr4/b;

.field public c:Lc2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LL4/b;->d:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Lr4/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LL4/b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p1, p0, LL4/b;->b:Lr4/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .line 1
    iget-object v0, p0, LL4/b;->c:Lc2/f;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LL4/b;->b:Lr4/b;

    .line 6
    .line 7
    invoke-interface {v0}, Lr4/b;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lc2/g;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LL4/b;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "proto"

    .line 18
    .line 19
    invoke-static {v2}, Lc2/b;->b(Ljava/lang/String;)Lc2/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, LL4/a;

    .line 24
    .line 25
    invoke-direct {v3}, LL4/a;-><init>()V

    .line 26
    .line 27
    .line 28
    const-class v4, LN4/i;

    .line 29
    .line 30
    invoke-interface {v0, v1, v4, v2, v3}, Lc2/g;->a(Ljava/lang/String;Ljava/lang/Class;Lc2/b;Lc2/e;)Lc2/f;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LL4/b;->c:Lc2/f;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v0, LL4/b;->d:LF4/a;

    .line 38
    .line 39
    const-string v1, "Flg TransportFactory is not available at the moment"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, LF4/a;->j(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, LL4/b;->c:Lc2/f;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_1
    return v0
.end method

.method public b(LN4/i;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LL4/b;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, LL4/b;->d:LF4/a;

    .line 8
    .line 9
    const-string v0, "Unable to dispatch event because Flg Transport is not available"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LF4/a;->j(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LL4/b;->c:Lc2/f;

    .line 16
    .line 17
    invoke-static {p1}, Lc2/c;->d(Ljava/lang/Object;)Lc2/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {v0, p1}, Lc2/f;->b(Lc2/c;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
