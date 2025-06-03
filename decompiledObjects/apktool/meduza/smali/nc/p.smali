.class public final Lnc/p;
.super Lnc/l1;
.source "SourceFile"

# interfaces
.implements Lnc/o;


# instance fields
.field public final e:Lnc/q;


# direct methods
.method public constructor <init>(Lnc/q;)V
    .locals 0

    invoke-direct {p0}, Lnc/l1;-><init>()V

    iput-object p1, p0, Lnc/p;->e:Lnc/q;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lnc/n1;->m()Lnc/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnc/o1;->v(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final getParent()Lnc/j1;
    .locals 1

    invoke-virtual {p0}, Lnc/n1;->m()Lnc/o1;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/p;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lnc/p;->e:Lnc/q;

    invoke-virtual {p0}, Lnc/n1;->m()Lnc/o1;

    move-result-object v0

    invoke-interface {p1, v0}, Lnc/q;->g(Lnc/o1;)V

    return-void
.end method
