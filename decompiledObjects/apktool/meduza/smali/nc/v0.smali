.class public final Lnc/v0;
.super Lnc/n1;
.source "SourceFile"


# instance fields
.field public final e:Lnc/t0;


# direct methods
.method public constructor <init>(Lnc/t0;)V
    .locals 0

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p1, p0, Lnc/v0;->e:Lnc/t0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/v0;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lnc/v0;->e:Lnc/t0;

    invoke-interface {p1}, Lnc/t0;->dispose()V

    return-void
.end method
