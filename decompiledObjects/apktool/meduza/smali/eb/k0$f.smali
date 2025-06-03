.class public final Leb/k0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final e:Leb/k0$f;


# instance fields
.field public final a:Leb/k0$i;

.field public final b:Leb/h$a;

.field public final c:Leb/e1;

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Leb/k0$f;

    sget-object v1, Leb/e1;->e:Leb/e1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, v2, v1, v3}, Leb/k0$f;-><init>(Leb/k0$i;Lnb/i$g$a;Leb/e1;Z)V

    sput-object v0, Leb/k0$f;->e:Leb/k0$f;

    return-void
.end method

.method public constructor <init>(Leb/k0$i;Lnb/i$g$a;Leb/e1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/k0$f;->a:Leb/k0$i;

    iput-object p2, p0, Leb/k0$f;->b:Leb/h$a;

    const-string p1, "status"

    invoke-static {p3, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Leb/k0$f;->c:Leb/e1;

    iput-boolean p4, p0, Leb/k0$f;->d:Z

    return-void
.end method

.method public static a(Leb/e1;)Leb/k0$f;
    .locals 3

    invoke-virtual {p0}, Leb/e1;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error status shouldn\'t be OK"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    new-instance v0, Leb/k0$f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, p0, v2}, Leb/k0$f;-><init>(Leb/k0$i;Lnb/i$g$a;Leb/e1;Z)V

    return-object v0
.end method

.method public static b(Leb/k0$i;Lnb/i$g$a;)Leb/k0$f;
    .locals 3

    new-instance v0, Leb/k0$f;

    const-string v1, "subchannel"

    invoke-static {p0, v1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Leb/e1;->e:Leb/e1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Leb/k0$f;-><init>(Leb/k0$i;Lnb/i$g$a;Leb/e1;Z)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Leb/k0$f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Leb/k0$f;

    iget-object v0, p0, Leb/k0$f;->a:Leb/k0$i;

    iget-object v2, p1, Leb/k0$f;->a:Leb/k0$i;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Leb/k0$f;->c:Leb/e1;

    iget-object v2, p1, Leb/k0$f;->c:Leb/e1;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Leb/k0$f;->b:Leb/h$a;

    iget-object v2, p1, Leb/k0$f;->b:Leb/h$a;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Leb/k0$f;->d:Z

    iget-boolean p1, p1, Leb/k0$f;->d:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Leb/k0$f;->a:Leb/k0$i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/k0$f;->c:Leb/e1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/k0$f;->b:Leb/h$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-boolean v1, p0, Leb/k0$f;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Leb/k0$f;->a:Leb/k0$i;

    const-string v2, "subchannel"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Leb/k0$f;->b:Leb/h$a;

    const-string v2, "streamTracerFactory"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Leb/k0$f;->c:Leb/e1;

    const-string v2, "status"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Leb/k0$f;->d:Z

    const-string v2, "drop"

    invoke-virtual {v0, v2, v1}, Ln7/g$a;->c(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
