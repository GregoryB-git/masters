.class public final Lp6/G0;
.super Lp6/w0;
.source "SourceFile"


# instance fields
.field public final s:Lp6/m;


# direct methods
.method public constructor <init>(Lp6/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/G0;->s:Lp6/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp6/G0;->v(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp6/w0;->w()Lp6/x0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lp6/x0;->b0()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, Lp6/z;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lp6/G0;->s:Lp6/m;

    .line 14
    .line 15
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 16
    .line 17
    check-cast p1, Lp6/z;

    .line 18
    .line 19
    iget-object p1, p1, Lp6/z;->a:Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-static {p1}, LV5/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-static {p1}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0, p1}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v0, p0, Lp6/G0;->s:Lp6/m;

    .line 34
    .line 35
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 36
    .line 37
    invoke-static {p1}, Lp6/y0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    return-void
.end method
