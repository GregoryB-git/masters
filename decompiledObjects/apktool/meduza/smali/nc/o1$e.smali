.class public final Lnc/o1$e;
.super Lnc/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
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

    iput-object p1, p0, Lnc/o1$e;->f:Lnc/o1;

    invoke-direct {p0}, Lnc/n1;-><init>()V

    iput-object p2, p0, Lnc/o1$e;->e:Luc/f;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lnc/o1$e;->l(Ljava/lang/Throwable;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lnc/o1$e;->e:Luc/f;

    iget-object v0, p0, Lnc/o1$e;->f:Lnc/o1;

    sget-object v1, Lrb/h;->a:Lrb/h;

    invoke-interface {p1, v0, v1}, Luc/f;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
