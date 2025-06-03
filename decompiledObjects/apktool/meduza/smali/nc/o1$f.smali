.class public final Lnc/o1$f;
.super Lsc/j$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/o1;->o(Ljava/lang/Object;Lnc/t1;Lnc/n1;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lnc/o1;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsc/j;Lnc/o1;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lnc/o1$f;->d:Lnc/o1;

    iput-object p3, p0, Lnc/o1$f;->e:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lsc/j$a;-><init>(Lsc/j;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ld2/h0;
    .locals 1

    check-cast p1, Lsc/j;

    iget-object p1, p0, Lnc/o1$f;->d:Lnc/o1;

    invoke-virtual {p1}, Lnc/o1;->F()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lnc/o1$f;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object p1, Lp2/m0;->D:Ld2/h0;

    :goto_1
    return-object p1
.end method
