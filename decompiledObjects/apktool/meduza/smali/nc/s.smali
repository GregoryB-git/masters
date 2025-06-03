.class public final Lnc/s;
.super Lnc/o1;
.source "SourceFile"

# interfaces
.implements Lnc/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/o1;",
        "Lnc/r<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lnc/j1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnc/o1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lnc/o1;->J(Lnc/j1;)V

    return-void
.end method


# virtual methods
.method public final await(Lub/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lnc/o1;->q(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvb/a;->a:Lvb/a;

    return-object p1
.end method

.method public final getCompleted()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lnc/o1;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getOnAwait()Luc/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Luc/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Luc/d;

    sget-object v1, Lnc/p1;->a:Lnc/p1;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"

    invoke-static {v1, v2}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lec/v;->a(ILjava/lang/Object;)V

    sget-object v3, Lnc/q1;->a:Lnc/q1;

    const-string v4, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'param\')] kotlin.Any?, @[ParameterName(name = \'clauseResult\')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"

    invoke-static {v3, v4}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lec/v;->a(ILjava/lang/Object;)V

    invoke-direct {v0, p0, v1, v3}, Luc/d;-><init>(Lnc/r;Ldc/q;Ldc/q;)V

    return-object v0
.end method

.method public final h0(Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    new-instance v0, Lnc/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lnc/u;-><init>(Ljava/lang/Throwable;Z)V

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lnc/o1;->F()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1, v0}, Lnc/o1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v2, Lp2/m0;->t:Ld2/h0;

    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object v2, Lp2/m0;->u:Ld2/h0;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne p1, v2, :cond_2

    .line 24
    .line 25
    :goto_0
    move v1, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    sget-object v2, Lp2/m0;->v:Ld2/h0;

    .line 28
    .line 29
    if-eq p1, v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    return v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final i0(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnc/o1;->X(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp2/m0;->t:Ld2/h0;

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object v1, Lp2/m0;->u:Ld2/h0;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_2
    sget-object v1, Lp2/m0;->v:Ld2/h0;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :goto_1
    return p1
.end method
