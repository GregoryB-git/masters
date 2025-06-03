.class public final Lnc/o1$d;
.super Lnc/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final e:Luc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luc/f<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic f:Lnc/o1;


# direct methods
.method public constructor <init>(Lnc/o1;Luc/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luc/f<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lnc/o1$d;->f:Lnc/o1;

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p2, p0, Lnc/o1$d;->e:Luc/f;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/o1$d;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lnc/o1$d;->f:Lnc/o1;

    invoke-virtual {p1}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lnc/u;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lp2/m0;->f0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lnc/o1$d;->e:Luc/f;

    iget-object v1, p0, Lnc/o1$d;->f:Lnc/o1;

    invoke-interface {v0, v1, p1}, Luc/f;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
