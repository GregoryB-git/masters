.class public final Lnc/i1;
.super Lnc/n1;
.source "SourceFile"


# instance fields
.field public final e:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldc/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p1, p0, Lnc/i1;->e:Ldc/l;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/i1;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lnc/i1;->e:Ldc/l;

    invoke-interface {v0, p1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
