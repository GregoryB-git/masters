.class public final Lp6/q;
.super Lp6/s0;
.source "SourceFile"


# instance fields
.field public final s:Lp6/m;


# direct methods
.method public constructor <init>(Lp6/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/q;->s:Lp6/m;

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
    invoke-virtual {p0, p1}, Lp6/q;->v(Ljava/lang/Throwable;)V

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
    iget-object p1, p0, Lp6/q;->s:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp6/w0;->w()Lp6/x0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lp6/m;->u(Lp6/q0;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Lp6/m;->H(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
