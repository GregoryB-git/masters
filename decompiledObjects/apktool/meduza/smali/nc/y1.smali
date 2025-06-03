.class public final Lnc/y1;
.super Lnc/n1;
.source "SourceFile"


# instance fields
.field public final e:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/l;)V
    .locals 0

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p1, p0, Lnc/y1;->e:Lub/e;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/y1;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lnc/y1;->e:Lub/e;

    sget-object v0, Lrb/h;->a:Lrb/h;

    invoke-interface {p1, v0}, Lub/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
