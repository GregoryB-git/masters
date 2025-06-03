.class public final Lnc/x1;
.super Lnc/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnc/n1;"
    }
.end annotation


# instance fields
.field public final e:Lnc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/l<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/o1$a;)V
    .locals 0

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p1, p0, Lnc/x1;->e:Lnc/l;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/x1;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lnc/n1;->m()Lnc/o1;

    move-result-object p1

    invoke-virtual {p1}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lnc/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnc/x1;->e:Lnc/l;

    check-cast p1, Lnc/u;

    iget-object p1, p1, Lnc/u;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnc/x1;->e:Lnc/l;

    invoke-static {p1}, Lp2/m0;->f0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
