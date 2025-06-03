.class public final Lnc/y0$a;
.super Lnc/y0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final c:Lnc/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/k<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:Lnc/y0;


# direct methods
.method public constructor <init>(Lnc/y0;JLnc/l;)V
    .locals 0

    iput-object p1, p0, Lnc/y0$a;->d:Lnc/y0;

    invoke-direct {p0, p2, p3}, Lnc/y0$c;-><init>(J)V

    iput-object p4, p0, Lnc/y0$a;->c:Lnc/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnc/y0$a;->c:Lnc/k;

    iget-object v1, p0, Lnc/y0$a;->d:Lnc/y0;

    sget-object v2, Lrb/h;->a:Lrb/h;

    invoke-interface {v0, v1, v2}, Lnc/k;->h(Lnc/a0;Lrb/h;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lnc/y0$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnc/y0$a;->c:Lnc/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
