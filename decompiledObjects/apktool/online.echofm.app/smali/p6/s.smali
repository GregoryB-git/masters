.class public final Lp6/s;
.super Lp6/s0;
.source "SourceFile"

# interfaces
.implements Lp6/r;


# instance fields
.field public final s:Lp6/t;


# direct methods
.method public constructor <init>(Lp6/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/s;->s:Lp6/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp6/w0;->w()Lp6/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lp6/x0;->O(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getParent()Lp6/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp6/w0;->w()Lp6/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp6/s;->v(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lp6/s;->s:Lp6/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp6/w0;->w()Lp6/x0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Lp6/t;->t(Lp6/F0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
